public class Double_Float {
    private double d1;

    public Double_Float(double d1) {
        this.d1 = d1;
    }

    public double getD1() {
        return d1;
    }

    public void setD1(double d1) {
        this.d1 = d1;
    }

    public float transform(){
            float f2= (float) this.d1;
            return f2;
        }

        @Override
        public String toString(){
            return "El dato ingresado es: "+getD1()+" >> de tipo  double"+"\nSe lo ha transformado a: "+transform()+
                    ">> de tipo float." ;
        }
}
