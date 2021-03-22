public class App {
    
    public static void main(String[] args){

        double value = 1000.00;
        int plots = 5;
        double input = 300.00;

        try{

            Financing f = new Financing(value, plots, input);
            System.out.println(f.numberOfPlots());

        } catch(RuntimeException e){

            System.out.println(e.getMessage());
            
        }

        

    }

}
