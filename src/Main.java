public class Main {
    
    /**
     * Berechnung des Zinseszins
     */
    public static void main(String[] args){
        // Berechnen Sie den Zinseszins für einen festgelegten 
        // Zinssatz, Ausgangswert und Zeitraum. 
        // Geben Sie die Zwischenwerte für jedes Jahr auf der Konsole aus.
        double zinssatz = 0.05;
        int zeitraum = 10;
        double ausgangswert = 1000;
        
        for(int i=1; i<zeitraum; i++){
            System.out.println(ausgangswert=ausgangswert*(1+zinssatz));
        }
                
    }
}
