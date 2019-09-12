package com.kenny.pt4j;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.validator.routines.DateValidator;

/**
 * Date validation performance
 */
@Slf4j
public class DateValidation {

    public static void main(String[] args) {

        String date = "2019-09-10";
        String dateFormat = "yyyy-MM-dd";
        long s1 = System.nanoTime();
        DateValidator.getInstance().isValid(date, dateFormat);
        long e1 = System.nanoTime();
        log.debug("DateValidator elapse: {}ns", (e1 - s1));
    }
}
