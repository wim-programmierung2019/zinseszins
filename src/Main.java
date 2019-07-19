
public class Main {
    
    /**
     * Berechnung des Zinseszins
     */
    public static void main(String[] args){
        // Berechnen Sie den Zinseszins für einen festgelegten 
        // Zinssatz, Ausgangswert und Zeitraum. 
        // Geben Sie die Zwischenwerte für jedes Jahr auf der Konsole aus.

        double zinssatz;
        double Ausgangswert;
        int Zeitraum;

        Ausgangswert= 1000.00; 
        Zeitraum = 5;
        zinssatz = 0.05;
        
        for (int i= 1; i <= Zeitraum; i++){
            double neuerwert = Ausgangswert * zinssatz;
            //Ausgabe
            System.out.println("Zeitpunkt: " + i);
            System.out.println("Ausgangswert: " + Ausgangswert);
            System.out.println("Zinssatz: " + zinssatz);
            System.out.println("Neuer Wert: " + neuerwert);
            Ausgangswert += neuerwert;
            
        }
    
    }
}
