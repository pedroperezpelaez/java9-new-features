package com.pedroperez.java9newfeatures.interfaces;

public interface PrivateInterfaceMethods {
    void normalInterfaceMethod();

    default void interfaceMethodWithDefault() {
        init();
    }

    default void anotherDefaultMethod() {
        init();
    }

    // This method is not part of the public API exposed by MyInterface
    private void init() {
        System.out.println("Initializing");
    }
}
