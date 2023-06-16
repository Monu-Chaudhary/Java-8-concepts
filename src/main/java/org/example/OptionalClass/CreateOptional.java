package org.example.OptionalClass;

import java.util.Optional;

public class CreateOptional {
    public static void main(String[] args) {
        // empty optional
        Optional<String> emptyOptional = Optional.empty();
        System.out.println(emptyOptional.isPresent());

        // using of() - argument passed cannot be null
        Optional<String> nonNullOptional = Optional.of("name");
        System.out.println(nonNullOptional.get());

        // using ofNullable()
        Optional<String> nullableOptional = Optional.ofNullable(null);
        System.out.println(nullableOptional.isPresent() ? nullableOptional.get() : "null value");

        nullableOptional = Optional.ofNullable("value");
        System.out.println(nullableOptional.get());

    }
}
