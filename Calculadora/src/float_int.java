public class float_int {
    //Tranformar de float a int
    private float num1;

    public float_int(float num1) {
        this.num1 = num1;
    }
//setters y getters
    public float isNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public int transformar(){
        int num2= (int) this.num1;
        return num2;
    }

    @Override
    public String toString(){
        return "El dato ingresado es >> "+isNum1()+" >> de tipo  float"+"\nSe lo ha transformado a >> "+transformar()+
                ">> de tipo entero." ;
    }
}

