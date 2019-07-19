public class Main {
    
    /**
     * Berechnung des Zinseszins
     */
    public static void main(String[] args){
        // Berechnen Sie den Zinseszins für einen festgelegten 
        double zinssatz = 1.05;
        double kapital = 1000;
        System.out.println("Zinssatz="+zinssatz+"%");
        System.out.println("Kapital="+kapital+"€");
        double zeitraum=5; 
        double zinsen=kapital*zinssatz; 
        
        for (int i=1; i<=zeitraum;i++)
        {
            kapital=kapital*zinssatz;
            System.out.println("Jahr"+i+": "+kapital);
            
            
            }}}   


