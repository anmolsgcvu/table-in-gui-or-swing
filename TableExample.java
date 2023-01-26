import javax.swing.*;
import java.util.Scanner;

public class TableExample {
    JFrame f;

    TableExample() {
        f = new JFrame();
        String data[][] = { { "101", "Amit", "50000" },
                { "102", "Jai", "780000" },
                { "101", "Sachin", "700000" } };
        String column[] = { "ID", "NAME", "SALARY" };
        JTable jt = new JTable(data, column);
        jt.setBounds(30, 40, 200, 300);
        JScrollPane sp = new JScrollPane(jt);
        f.add(sp);
        f.setSize(300, 400);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the HRA");
        int hra = scanner.nextInt();
        System.out.println("Enter the TA");
        int ta = scanner.nextInt();
        System.out.println("Enter the MA ");
        int ma = scanner.nextInt();
        System.out.println("Enter the PF");
        int pf = scanner.nextInt();
        int gshra = (int) (hra * 1.50);
        int gsta = (int) (ta * 1.30);
        int gsma = (int) (ma * 1.250);
        int gspf = (int) (pf * 1.10);
        int gs = gshra + gsta + gsma + gspf;
        int tax = (int) (gs * 0.1);
        int ns = gs - tax - pf;

    }
}