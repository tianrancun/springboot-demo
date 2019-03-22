package com.study.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegexUtil {

    private static final Pattern IOS_PATTERN = Pattern.compile(".*?([P|LT|ST|T])?(\\\\d*)(/)(\\\\d*)(\\\\D*)(\\\\d*).*?");

    public static TireCode praseTireCode(String tireCodeInfo) {
      //  String tireSizeId="215/60R16";// String str  = "265/60.00R18 110V TRHP";
        Matcher matcher;
        String vehicleType;
        String fabric;
        String rimDiameterStr;
        String ratio;
        String tireWidth;
        int loadIndex;
        String speedRating = null;
        String loadRange;

        if((matcher =IOS_PATTERN.matcher(tireCodeInfo)).matches()){
            matcher.group(1);
            RegexUtil.TireCode tireCode ;
        }else {
            System.out.println("not match");
        }
        return null;
    }

    private static class  TireCode {
        /**
         * possibly one of 'P','LT','ST','T'
         * 'P': passenger car
         * 'LT': light trunk
         * 'ST': special trailer
         * 'T': temporary
         */
        String vehicleType;
        /**
         * tire fabric
         * 'R': radial
         * 'B': bias belt
         * 'D' diagonal
         */
        String fabric;
        String rimDiameterStr;
        String ratio;
        String tireWidth;
        int loadIndex;
        String speedRating = null;
        String loadRange;
    }
}