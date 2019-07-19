public class Main {
    
    /**
     * Berechnung des Zinseszins
     */
    public static void main(String[] args){
        double zins = -0.0037;
        double kapital = 100000.00;
        int zeitraumInJahr = 5;
        for(int i=1;i<=zeitraumInJahr;i++)
            {
                double print = (kapital*zins);
                kapital = (kapital+(kapital*zins));
                System.out.println("Zinsertrag: " + print);
                System.out.println("Kapitalbetrag: " + kapital);
                System.out.println("Zinsjahr: " + i);
            }        
        // Berechnen Sie den Zinseszins für einen festgelegten 
        // Zinssatz, Ausgangswert und Zeitraum. 
        // Geben Sie die Zwischenwerte für jedes Jahr auf der Konsole aus.
                
    }
}
