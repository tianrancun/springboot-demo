package com.study;

import org.junit.Test;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * @author vn0ow6b
 * @Title: NumberFormat
 * @Description: TODO
 * @date 2019/1/7 12:01
 */
public class NumberFormat {

    @Test
    public void name() {

        double a = 300.1;
        DecimalFormat format  = new DecimalFormat("##.00");//new DecimalFormat("##.00").format()
        System.out.println(format.format(a));

        System.out.println(String.format("%.2f", a));
        BigDecimal bg = new BigDecimal("300").setScale(2);
        System.out.println(new BigDecimal("300").setScale(2).floatValue());
        System.out.println(bg +"---");
    }

    @Test
    public void namae() {


        double v = 300;
        String result= String.format("%.2f", v);
        System.out.println(result);
        Double dvalue = Double.parseDouble(result);
        double dvalue1 = Double.valueOf(result);
        System.out.println(dvalue);
        System.out.println(dvalue1);

        DecimalFormat format  = new DecimalFormat("##.00");
        System.out.println(format.format(v));
        System.out.println(Double.valueOf(format.format(v)));

        DecimalFormat df = new DecimalFormat("0.00");

    }


}
