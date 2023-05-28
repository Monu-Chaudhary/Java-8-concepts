package org.example.equalsHashCode;

// default implementation
class Money {
    public String currency;
    public int value;

    Money (String currency, int value) {
        this.currency = currency;
        this.value = value;
    }
}

// override
class Money2 {
    public String currency;
    public int value;

    Money2 (String currency, int value) {
        this.currency = currency;
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
//        if (obj == null) return false;
        if (this == obj) return true;
        if (!(obj instanceof Money2)) return false;
        Money2 o = (Money2) obj;
        boolean curEquals = (o.currency == null && this.currency == null) ||
                (o.currency != null && this.currency.equals(o.currency));
        return (curEquals && this.value == o.value);
    }
}

public class equals {
    public static void main(String args[]) {
        Money income = new Money("USD", 100);
        Money expense = new Money("USD", 100);
        System.out.println(income.equals(expense)); // False - compares object identity when using default implementation

        Money2 income2 = new Money2("EURO", 100);
        Money2 expense2 = new Money2("EURO", 100);
        System.out.println(income2.equals(expense2));   // True - compares the value of the two objects
    }
}
