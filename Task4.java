// К калькулятору из предыдущего дз добавить логирование.

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Task4 {
    public static void main(String[] args) throws IOException {
        double a = addNum();
        double b = addNum();
        String symbol = sign();
        calc(a, b, symbol);
    }

    static void calc(double a, double b, String symbol) throws IOException {
        Logger logger = Logger.getLogger(Task4.class.getName());
        FileHandler fh = new FileHandler("src/calc.xml");
        logger.addHandler(fh);
        SimpleFormatter sf = new SimpleFormatter();
        fh.setFormatter(sf);
        if (symbol.equalsIgnoreCase("+")) {
            System.out.println(a + " + " + b + " = " + sum(a, b));
            logger.info(a + " + " + b + " = " + sum(a, b));
        }
        else if (symbol.equalsIgnoreCase("-")) {
            System.out.println(a + " - " + b + " = " + deduct(a, b));
            logger.info(a + " - " + b + " = " + deduct(a, b));
        }
        else if (symbol.equalsIgnoreCase("*")) {
            System.out.println(a + " * " + b + " = " + multiply(a, b));
            logger.info(a + " * " + b + " = " + multiply(a, b));
        }
        else if (symbol.equalsIgnoreCase("/")) {
            System.out.println(a + " / " + b + " = " + div(a, b));
            logger.info(a + " / " + b + " = " + div(a, b));
        }
        else if (symbol.equalsIgnoreCase("V")) {
            System.out.println(b + " V " + a + " = " + root(a, b));
            logger.info(b + " V " + a + " = " + root(a, b));
        }
        else if (symbol.equalsIgnoreCase("^")) {
            System.out.println(a + " ^ " + b + " = " + pow(a, b));
            logger.info(a + " ^ " + b + " = " + pow(a, b));
        }
        else {
            System.out.println("Input incorrect symbol!");
            logger.info("Input incorrect symbol!");
        }
    }

    static String sign() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Input sign('+', '-', '*', '/', '^', 'V'): ");
        String symbol = iScanner.nextLine();
        return symbol;
    }

    static double addNum() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Input num: ");
        double n = Integer.parseInt(iScanner.nextLine());
        //iScanner.close();
        return n;
    }

    static double sum(double a, double b) {
        return a + b;
    }
    static double deduct(double a, double b) {
        return a - b;
    }
    static double multiply(double a, double b) {
        return a * b;
    }
    static double div(double a, double b) {
        return a / b;
    }
    static double root(double a, double b) {
        return Math.pow(a, 1/b);
    }
    static double pow(double a, double b) {
        return Math.pow(a, b);
    }
}
