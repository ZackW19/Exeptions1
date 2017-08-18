//wyjątki

public class Main {
    //Kod naszego klienta
    public static void main(String[] args) {
        Main main = new Main();

        try {
            main.prepareDivide();
        }catch (IllegalArgumentException e){   //zamiast e może być np ex, lub inne znaki
            System.out.println("Witaj w mojej aplikacji opartej o API");
            System.out.println("nie możesz tutaj dzielić przez 0!!!");
        }
    }

    //API

    public int prepareDivide(){
        return divide(5, 0);
    }

    private int divide(int a, int b) throws IllegalArgumentException{
        if (b==0){
            throw new IllegalArgumentException("Do not divide by 0"); //throw łapie wyjątek - w tym wypadku dzielenie przez 0
        }                                                                // dzieki temu mozemy personalizowac wyjatek np, jakims komunikatem

        return a / b;
    }
}
