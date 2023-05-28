package org.example.equalsHashCode;

// inheritence violates the symmetric contract for equals
class UnsymmetricVoucher extends Money2 {

    String store;
    UnsymmetricVoucher(String currency, int value, String store) {
        super(currency, value);
        this.store = store;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof UnsymmetricVoucher)) return false;
        UnsymmetricVoucher o = (UnsymmetricVoucher) obj;
        boolean curEquals = (o.currency == null && this.currency == null) ||
                (o.currency != null && this.currency.equals(o.currency));
        boolean storeEquals = (o.store == null && this.store == null) ||
                (o.store != null && this.store.equals(o.store));
        return (curEquals && storeEquals && this.value == o.value);
    }
}

// composition over inheritence to fix symmetry
class SymmetricVoucher {
    private Money2 money;
    private String store;

    SymmetricVoucher(String currency, int value, String store) {
        this.money = new Money2(currency, value);
        this.store = store;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof SymmetricVoucher)) return false;
        SymmetricVoucher o = (SymmetricVoucher) obj;
        boolean moneyEquals = (o.money == null && this.money == null) ||
                (o.money != null && this.money.equals(o.money));
        boolean storeEquals = (o.store == null && this.store == null) ||
                (o.store != null && this.store.equals(o.store));
        return (moneyEquals && storeEquals);
    }

}

public class EqualsSymmetry {
    public static void main(String[] args) {
        Money2 money = new Money2("USD", 100);

        UnsymmetricVoucher voucher1 = new UnsymmetricVoucher("USD", 100, "Raju Store");
        System.out.println(money.equals(voucher1)); // true
        System.out.println(voucher1.equals(money)); // false    - unsymmetric

        SymmetricVoucher voucher2 = new SymmetricVoucher("USD", 100, "Raju Store");
        System.out.println(money.equals(voucher2)); // false
        System.out.println(voucher2.equals(money)); // false    - symmetric
    }
}
