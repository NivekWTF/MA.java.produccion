
public class App {

    public static void main(String[] args) throws Exception {
        Fraccion fraccion1 = new Fraccion(1, 2);
        Fraccion fraccion2 = new Fraccion(1, 2);

        Fraccion resultado = fraccion1.sumar(fraccion2);

        System.out.println(resultado);

    }


}

