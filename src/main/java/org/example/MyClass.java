package org.example;

public class MyClass {
    private String myField;

    public MyClass(String myField) {
        this.myField = myField;
    }

    public void printField() {
        System.out.println("My field: " + this.myField);
    }
    public static void main(String[] args) {
        MyClass myObject = new MyClass("EXAMPLE");
        myObject.printField();
    }
}


