package day03_branching_pull_request;

public class TestStocks {
    public static void main(String[] args) {

        Stock googleStock = new Stock("Alphabet Inc Class C","Google",156.06);

        Stock teslaStock = new Stock("Tesla", "Tesla",263.55);
        System.out.println("googleStock = " + googleStock);
        System.out.println("teslaStock = " + teslaStock);


    }
}
