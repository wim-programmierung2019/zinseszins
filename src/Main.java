public class Main {
    
    /**
     * Berechnung des Zinseszins
     */
    public static void main(String[] args){
        // Berechnen Sie den Zinseszins für einen festgelegten
        // Zinssatz, Ausgangswert und Zeitraum. 
        // Geben Sie die Zwischenwerte für jedes Jahr auf der Konsole aus.
        
        double Zinssatz = 1.1;
        double Ausgangswert = 1000;
        int Zeitraum = 10;
                
        for(int i=1; i<Zeitraum; i++){
            Ausgangswert = Ausgangswert*Zinssatz;
            System.out.println("Jahr" + i + "Der Ausgangswert ist: " + Ausgangswert);
        }
    }
}
