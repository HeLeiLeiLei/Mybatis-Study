package com.hl.util;

import org.junit.Test;

import java.util.UUID;

public class IdUtils {
    public static String getId(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }
}
