public class Complex {
    private float real;
    private float imaginary;

    //allows other progams to access the seperate parts
    public float getRe(){
        return real;
    }

    public float getIm(){
        return imaginary;
    }

    public void setRe(float real){
        this.real = real;
    }

    public void setIm(float imaginary){
        this.imaginary = imaginary;
    }

    //The constructor, from 2 floats a complex number is created
    public Complex(float x, float y){
        real = x;
        imaginary = y;
    }

    //The add function takes to complex numbers (x + iy) and (a + ib) and returns (x + a + i(y + b))
    public Complex add(Complex othercomp){
        float newReal, newIm;
        newReal = this.getRe()+othercomp.getRe();
        newIm = this.getIm()+othercomp.getIm();
        return new Complex(newReal,newIm);
    }

    //The multiply method takes 2 complex numbers (x + iy) and (a + ib) and returns (ax - yb + i(ay + bx))
    public Complex multiply(Complex othercomp){
        float newReal, newIm;
        newReal = (this.getRe()*othercomp.getRe()) - (this.getIm()*othercomp.getIm());
        newIm = (this.getRe()*othercomp.getIm()) + (this.getIm()*othercomp.getRe());
        return new Complex(newReal,newIm);
    }

    public Complex divide(Complex othercomp){
        
    }

    //To string returns a string
    public String toString(){
        return String.format("%f", real,  "+ %fi", imaginary);
    }

}
