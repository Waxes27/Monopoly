import board.Block;
import board.Board;
import board.PropertyTypes;

import java.io.IOException;

public class Monopoly {
    public static void main(String[] args) throws IOException {
        Polymorphism data = new Polymorphism("Naaaaaani!!!!!");

        System.out.println(data.getName());
        data = new Polymorphism(1);

        System.out.println(data.getName());
    }
}
