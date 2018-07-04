package base;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class DoubleDital {

    public String dital4(double number){
        return String.format("%.4f", number);
    }
    public String dital4_(double number){
        DecimalFormat decimalFormat = new DecimalFormat("#.0000");
        return decimalFormat.format( number);
    }
    //解析还是一样只会显示一个0
    public double detal4_t(double number){
        DecimalFormat decimalFormat = new DecimalFormat("#.0000");
        return Double.parseDouble(decimalFormat.format( number));
    }
    public double dital4_1(double number){
        BigDecimal bigDecimal = new BigDecimal(number);
        BigDecimal scale = bigDecimal.setScale(4,BigDecimal.ROUND_HALF_UP);
        return scale.doubleValue();
    }
    public static void main(String[] args) {
        DoubleDital dd = new DoubleDital();
        //String dital4 = dd.dital4(4);
        String dital4_ = dd.dital4_(4);
        //double dital4_1 = dd.dital4_1(4);//必须保证后面几位不为0
       // double detal4_t = dd.detal4_t(4);
        System.out.println(dital4_);
    }
}
