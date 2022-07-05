public class Short_Byte {
    private short num1;

    public Short_Byte(short num1) {
        this.num1 = num1;
    }

    public short getNum1() {
        return num1;
    }

    public void setNum1(short num1) {
        this.num1 = num1;
    }

    public byte transformar(){
        byte num2= (byte) this.num1;
        return num2;
    }

    @Override
    public String toString(){
        return "El dato ingresado es >> "+getNum1()+" >> de tipo  Short"+"\nSe lo ha transformado a >> "+transformar()+
                ">> de tipo Byte." ;
    }
}
