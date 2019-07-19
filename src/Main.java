public class Main {
    
    /**
     * Berechnung des Zinseszins
     */
    public static void main(String[] args){
        // Berechnen Sie den Zinseszins für einen festgelegten 
        // Zinssatz, Ausgangswert und Zeitraum. 
        // Geben Sie die Zwischenwerte für jedes Jahr auf der Konsole aus.

        double zinssatz = 1.02;
        double wert = 100;
        double zeitraum = 5;
        
        for(int i=1; i<= zeitraum; i++){
            wert =  wert * zinssatz;
            System.out.println("Jahr " + i + " Zwischenwert " + wert);
        }
    }
}
