public class Main {
    
    /**
     * Berechnung des Zinseszins
     */
    public static void main(String[] args){
        // Berechnen Sie den Zinseszins für einen festgelegten 
        // Zinssatz, Ausgangswert und Zeitraum. 
        // Geben Sie die Zwischenwerte für jedes Jahr auf der Konsole aus.
        double Zinssatz = 1.02;
        double Ausgangswert= 100;
        double Zeitraum = 5;
        double Zwischenwert;
        
        for(int i=1; i<=Zeitraum; i++){
            Zwischenwert = Ausgangswert * Zinssatz;
            System.out.println("Jahr "+ i + "Zwischenwert " + Zwischenwert);
            Ausgangswert = Zwischenwert;     
            }
          }
    }
