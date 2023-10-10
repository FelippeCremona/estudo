import java.io.File;

public class Teste {

  public static void main(String[] args) {
    File file = new File("teste.txt");
    System.out.println("Hello World!");
    file.delete();
  }
  
}
