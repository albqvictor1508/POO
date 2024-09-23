import java.util.*;

public class Main {
    public static void main(String[] args) {
        Caixa<Integer> item = new Caixa<>();
        item.setItem(123);
        System.out.println(item.getItem());

        Caixa<String> itemString = new Caixa<>();
        itemString.setItem("alexsa é muito boa pqp mulher boa");
        System.out.println(itemString.getItem());

        Caixa<Double> itemDouble = new Caixa<>();
        itemDouble.setItem(20.0);
        System.out.println(itemDouble.getItem());

        //Caixa -> generic
    }
}