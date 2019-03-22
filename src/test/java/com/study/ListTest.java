package com.study;

//import com.google.common.base.Joiner;
//import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author vn0ow6b
 * @Title: ListTest
 * @Description: TODO
 * @date 2019/1/9 16:52
 */
public class ListTest {

    @Test
    public void test() {
        List<Integer> linkItems = new ArrayList<>();
        linkItems.add(1);
        linkItems.add(2);
        linkItems.add(3);
//        if (linkItems != null) {
//            System.out.println(linkItems);
//            System.out.println(StringUtils.strip(linkItems.toString()));;
//            System.out.println(Joiner.on(",").join(linkItems));
//            //copy properties to result list
//            Joiner.on(",").join(linkItems);
////                row.setLinkItem(Joiner.on(",").join(linkItems));
//         linkItems.stream();
 //       }
    }

    @Test
    public void l() {
       Date date = new Date();
        System.out.println(date);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(date));
        List<String> recordIds = new ArrayList<>();

        recordIds.add("etlSyncClub:4808:fullSync:L5CG8300P63:1553111472019");
        recordIds.add("etlSyncClub:6217:fullSync:L5CG8300P63:1553111472019");
        System.out.println(recordIds.stream().collect(Collectors.joining("','")));
    }
}