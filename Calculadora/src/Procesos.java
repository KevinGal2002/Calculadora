import javax.swing.*;

public class Procesos {

    public class Metodos {
        public static int opcion(){
            int op;
            do {
                op= Integer.parseInt(JOptionPane.showInputDialog(null,
                        "    >> Bienvenido << "+
                                "\n1.-Short a Byte" +
                                "\n2.-Long a Int" +
                                "\n3.-Double a Float" +
                                "\n4.-Float a Int " +
                                "\n0.-Salir"+
                                "\nSeleccione: "),1);
            }while (op<0 || op >4);
            return op;
        }
        public void proceso(){
            int op=opcion();
            do {
                switch (op){
                    case 1:
                    {
                        short shortt=Short.parseShort(JOptionPane.showInputDialog(null," Ingresa un numero de tipo Short: "));
                        Short_Byte short_byte = new Short_Byte(shortt);
                        JOptionPane.showMessageDialog(null,short_byte.toString());
                        break;
                    }
                    case 2:
                    {
                        long shortt=Integer.parseInt(JOptionPane.showInputDialog(null," Ingresa un numero de tipo Long: "));
                        Long_Int short_byte = new Long_Int(shortt);
                        JOptionPane.showMessageDialog(null,short_byte.toString());
                        break;
                    }
                    case 3:
                    {
                        double shortt=Double.parseDouble(JOptionPane.showInputDialog(null," Ingresa un numero de tipo Double: "));
                        Double_Float short_byte = new Double_Float(shortt);
                        JOptionPane.showMessageDialog(null,short_byte.toString());
                        break;
                    }
                    case 4:
                    {
                        float shortt=Float.parseFloat(JOptionPane.showInputDialog(null," Ingresa un numero de tipo Double: "));
                        float_int short_byte = new float_int(shortt);
                        JOptionPane.showMessageDialog(null,short_byte.toString());
                        break;
                    }
                }
            }while(op!=0);
        }
    }

}
