package io.muehlbachler.bswe;

import org.springframework.stereotype.Service;

/**
 * A Spring Service that provides various methods for String manipulation.
 */
@Service
public class StringService {

    /**
     * Takes a given input String and makes all letters upper case. Numbers and special characters will remain the same.
     * If the input is null, the output will be null as well.
     *
     * @param string the input String.
     * @return a String that contains only upper case letters or null.
     */
    public String toUpperCase(final String string) {
        // FIXME: implement
        return string;
    }
}
