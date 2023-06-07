import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int pesel;
    Scanner scanner = new Scanner(System.in);
    System.out.println("podaj PESEL");
    pesel = scanner.nextInt();
    //jeśli ostatnia cyfra jest parzysta to kobieta
    // jeśli ostatnia cyfra jest nieparzysta to meżczyzna
    String str = Integer.toString(pesel);
    if(str.length()==10 ){
      if(pesel%2==0){
        System.out.println("Jesteś kobietą");
      }
      else{
        System.out.println("Jesteś mężczyzną");
      }
     
    }
    else if(str.length()!=10 ) {
      System.out.println("nieprawidłowa długość PESEL");
    }
  
  }
}