public class PinGeneration {
    static void pin(int curr, int target,String str){
        if(str.length()==target){
            System.out.println(str);
            return;
        }
        for(int gen=0;gen<=9;gen++){
            pin(curr+gen, target, str+gen);
        }
    }
    public static void main(String[] args) {
        int target=2;
        pin(0, target, "");
        
    }
    
}
