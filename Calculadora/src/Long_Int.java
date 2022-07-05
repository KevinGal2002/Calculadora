public class Long_Int {
    //variable a usar
    private long numLong;

    //Contructores
    public Long_Int(long numLong) {
        this.numLong = numLong;
    }

    //Setter y Getter

    public long getNumLong() {
        return numLong;
    }

    public void setNumLong(long numLong) {
        this.numLong = numLong;
    }

    //Clase para tranformar el dato Long  Int
    public int tranformarInt(){
        int numInt =  (int) this.numLong;
        return numInt;

    }
    //Cracion de Clase ToString
    @Override
    public String toString() {
        return "Numero en tipo Long -> "+getNumLong()+
                "Numero transformado a Int -> "+tranformarInt();

    }
}
