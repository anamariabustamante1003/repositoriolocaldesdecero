package ejemplo;

public class Main {
  
  public static void main (String[] args){
    System.out.println("Hola mundo");
    int s = suma(20,30);
    System.out.println(s);
    int r = resta(20, 10);
    System.out.println(r);
    int m = multiplicacion(2,3);
    System.out.println(m);
    
    try {
       double d = division(2,0);
    System.out.println(d);
    } catch(Exception e) {
      String mensaje = e.getMessage();
      System.out.println(mensaje);
      //e.printStackTrace(); se puede de las dos formas
    }
    
  }
  
  public static int suma(int n1, int n2){
    return n1 + n2;
  }
  
  public static int resta(int n1, int n2){
    return n1 - n2;
  }
  
  public static int multiplicacion(int n1, int n2){
    return n1 * n2;
  }
  
  public static double division(double n1, int n2) throws Exception {
    if(n2 == 0){
      throw new Exception ("No es posible hacer division por cero");
    }
    return n1 / n2;
  }
}