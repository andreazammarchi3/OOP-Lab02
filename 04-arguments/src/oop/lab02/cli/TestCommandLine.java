package oop.lab02.cli;

public class TestCommandLine {

    public static void main(final String[] args) {
        
        // For each argument passed, prints it and its length
        for(int i = 0; i < args.length; i++) {
            System.out.println("Element n." + i + ": " + args[i]
            + " [" + args[i].length() + "]");
        }
    }

}
