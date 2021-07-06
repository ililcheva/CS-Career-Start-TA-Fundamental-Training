package com.creditsuisse;

public class PrintShapes {
    public static void main(String[] args) {
        if (args.length > 0){
            int size = Integer.parseInt(args[1]);
            String shape = args[0];
            for(int i = 0; i < size; i++){
                int subsize = 0;
                switch(shape){
                    case "triangle":
                        subsize = i + 1;
                        break;
                    case "square":
                        subsize = size;
                        break;
                    default:
                        subsize = i + 1;
                        break;
                }
                for(int j = 0; j < subsize; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        } else {
            System.out.println("Please provide shape and size as arguments");
        }
    }
}
