package com.kenny.pt4j;

import lombok.extern.slf4j.Slf4j;

/**
 * String concat performance
 */
@Slf4j
public class StringConcat {

    public static void main(String[] args) {

        String date = "2019-09-dd";
        final String dateFormat = "yyyy-MM-dd";
        long s1 = System.nanoTime();
        String str1 = "date[" + date + "] is wrong format:" + dateFormat;
        long e1 = System.nanoTime();
        log.warn(str1);
        log.debug("using + elapse: {}ns", (e1 - s1));

        s1 = System.nanoTime();
        String str2 = "date[".concat(date).concat("] is wrong format:").concat(dateFormat);
        e1 = System.nanoTime();
        log.warn(str2);
        log.debug("using concat elapse: {}ns", (e1 - s1));

        s1 = System.nanoTime();
        String str3 = String.format("date[%s] is wrong format:%s", date, dateFormat);
        e1 = System.nanoTime();
        log.warn(str3);
        log.debug("using String.format elapse: {}ns", (e1 - s1));

        s1 = System.nanoTime();
        log.warn("date[{}] is wrong format:{}", "date", "DateFormat.Y_M_D");
        e1 = System.nanoTime();
        log.debug("using logger elapse: {}ns", (e1 - s1));

        s1 = System.nanoTime();
        log.warn("date[" + "date" + "] is wrong format:" + "DateFormat.Y_M_D");
        e1 = System.nanoTime();
        log.debug("using (logger +) elapse: {}ns", (e1 - s1));
    }
}
