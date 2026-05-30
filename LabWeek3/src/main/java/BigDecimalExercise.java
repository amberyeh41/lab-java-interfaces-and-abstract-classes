
double round(BigDecimal num){
    MathContext m = new MathContext(3);
    BigDecimal rounded = num.round(m);
    return  rounded.doubleValue();
}
double p2(BigDecimal num){
    MathContext m = new MathContext(2);
    BigDecimal rounded = num.round(m);
    rounded = rounded.multiply(new BigDecimal("-1"));
    return  rounded.doubleValue();
}




void main() {
    BigDecimal b1 = new BigDecimal("4.2585");
    double result = round(b1);
    System.out.println("Rounded: " + result);

    result = p2(b1);
    System.out.println("Rounded and flipped: " + result);
}


