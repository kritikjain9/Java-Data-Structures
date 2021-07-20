package fraction_Class;

public class Fraction{
    private int numerator;
    private int denominator;

        public Fraction(int numerator, int denominator) {       //parameterized constructor
        this.numerator = numerator;
        if(denominator == 0){
            //TODO error out 
        }
        this.denominator = denominator;
        simplify();
    }


        private void simplify(){
            
            int tempA = this.numerator;
            int tempB = this.denominator;

            while(tempA % tempB != 0){
                int rem = tempA % tempB;
                tempA = tempB;
                tempB = rem;
            }
            numerator /= tempB;
            denominator /= tempB;
        }

        public int getDenominator(){
            return this.denominator;
        }
    
        public int getNumerator(){
            return this.numerator;
        }
        
        public void setNumerator(int numerator) {
            this.numerator = numerator;
            simplify();
        }

        public void setDenominator(int denominator) {
            if(denominator == 0){
                return;
                //TODO error
            }
            this.denominator = denominator;
            simplify();
        }

        public void print() {
            if(denominator == 1){
                System.out.println(numerator);
            }else{
                System.out.println(numerator + "/" + denominator);
            }
            
        }
         
}




