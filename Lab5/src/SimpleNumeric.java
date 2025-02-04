public class SimpleNumeric {
    public double getMin(double[] num){
        double min = num[0];
        for (int i = 0 ; i < num.length ; i++) {
            if (num[i]<min)
                min = num[i];
        }
        return min;
    }

    public double getMax(double[] num){
        double max = num[0] ;
        for (int i = 0 ; i < num.length ; i++) {
            if (num[i]>max)
                    max = num[i];

        }
        return max;
    }

    public double getAverage(double[] num){
        return getSummary(num) / num.length;
    }

    public double getSummary(double[] num){
        double sum = 0;
        for (double v : num){
            sum += v;
        }
        return sum;
    }


}
