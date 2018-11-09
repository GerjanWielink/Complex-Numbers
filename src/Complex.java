public class Complex {
    private double real;
    private double imaginary;

    //allows other progams to access the separate parts
    public double getRe(){
        return real;
    }

    public double getIm(){
        return imaginary;
    }

    public void setRe(double real){
        this.real = real;
    }

    public void setIm(double imaginary){
        this.imaginary = imaginary;
    }

    //The constructor, from 2 doubles a complex number is created
    public Complex(double x, double y){
        real = x;
        imaginary = y;
    }

    //The add function takes two complex numbers (x + iy) and (a + ib) and returns (x + a + i(y + b))
    public Complex add(Complex othercomp){
        double newReal, newIm;
        newReal = this.getRe()+othercomp.getRe();
        newIm = this.getIm()+othercomp.getIm();
        return new Complex(newReal,newIm);
    }

    //The multiply method takes two complex numbers (x + iy) and (a + ib) and returns (ax - yb + i(ay + bx))
    public Complex multiply(Complex othercomp){
        double newReal, newIm;
        newReal = (this.getRe()*othercomp.getRe()) - (this.getIm()*othercomp.getIm());
        newIm = (this.getRe()*othercomp.getIm()) + (this.getIm()*othercomp.getRe());
        return new Complex(newReal,newIm);
    }

    //the complex method takes two complex numbers (x + iy) and (a + ib) and returns (ax+by + (bx-ay)i)/(x^2 + y^2)
    public Complex divide(Complex othercomp){
        double newReal, newIm;
        newReal = ((this.getRe() * othercomp.getRe()) + (this.getIm() * othercomp.getIm()) ) /( ( this.getRe() * this.getRe()) + (othercomp.getIm() * othercomp.getRe()));
        newIm = ((this.getIm() * othercomp.getRe()) - (this.getRe() * othercomp.getIm())) / ( ( this.getRe() * this.getRe()) + (othercomp.getIm() * othercomp.getRe()) );
        return new Complex(newReal,newIm);
    }


    //To string returns a string
    public String toString(){
        return Double.toString(real)+"+"+Double.toString(imaginary)+"i";
    }
/*
    public static void main(String[] args) {
        Complex een = new Complex(1,2);
        Complex twee = new Complex(5,8);
        Complex drie = new Complex(8,3);

        System.out.println(een.add(twee));
        System.out.println(een.multiply(drie));
        System.out.println(drie.divide(een));
        System.out.println(twee.toString());
        System.out.println(twee.add(twee));
        }
*/
}
