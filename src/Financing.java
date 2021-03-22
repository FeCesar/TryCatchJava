public class Financing{

    // Atributos
    private double value;
    private int plots;
    private double input;

    // Constructor
    public Financing(){}
    public Financing(double value, int plots, double input){

        if(plots < 6){

            throw new RuntimeException("The value of plots has to be greather than six!");

        } else if(input < value * 0.2){
            
            throw new RuntimeException("The value of input has to be grather than twenty percent of value total!");

        } else{

            this.value = value;
            this.plots = plots;
            this.input = input;

        }

    }


    // Metodos
    public int numberOfPlots(){
        int numberOfPlots = (int)(this.value - this.input) / this.plots;
        return numberOfPlots;
    }
    
    // Getters
    public double getValue(){
        return this.value;
    }
    public double getPlots(){
        return this.plots;
    }
    public double getInput(){
        return this.input;
    }

    // Setters
    public void setValue(double value){
        this.value = value;
    }
    public void setPlots(int plots){
        this.plots = plots;
    }
    public void setInput(double input){
        this.input = input;
    }

}