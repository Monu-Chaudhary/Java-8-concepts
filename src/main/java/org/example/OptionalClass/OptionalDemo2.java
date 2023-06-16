package org.example.OptionalClass;

import java.util.Optional;

public class OptionalDemo2 {

    public static String getDefault() {
        System.out.println("Getting default value...");
        return "Default";
    }

    public static void main(String[] args) {
        Optional<String> opt = Optional.of("Monu");

        // ifPresent
//        opt.ifPresent(String::toUpperCase);
        opt.ifPresent(System.out::println);

        //isPresent
        System.out.println(opt.isPresent());    // true

        // get
        System.out.println(opt.get()); // returns a value of non-null optional

        Optional<String> emptyOpt = Optional.empty();
        // isEmpty
        System.out.println(emptyOpt.isEmpty());      // true

        // orElse - returns optional value when present else return the other argument value
        System.out.println(emptyOpt.orElse("Ajit"));
        // orElseGet - similar to oElse
        System.out.println(emptyOpt.orElseGet(() -> "Yogesh"));

        // orElse vs orElseGet - same in case of empty optional
        System.out.println("Empty orElse: "+emptyOpt.orElse(getDefault()));
        System.out.println("Empty orElseGet: "+emptyOpt.orElseGet(OptionalDemo2::getDefault));
        // - orElse creates a default object even when optional value is present increasing cost
        System.out.println("Non-empty orElse: "+opt.orElse(getDefault()));
        System.out.println("Non-empty orElseGet: "+opt.orElseGet(OptionalDemo2::getDefault));

        // throws an exception
        System.out.println(emptyOpt.orElseThrow());
    }

}
