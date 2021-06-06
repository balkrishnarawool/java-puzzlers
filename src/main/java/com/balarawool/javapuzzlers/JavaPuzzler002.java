package com.balarawool.javapuzzlers;

public class JavaPuzzler002 {

    public static void main(String[] args) {
        System.out.println(Long.valueOf(100) == Long.valueOf(100));
        System.out.println(Long.valueOf(200) == Long.valueOf(200));
    }
}
// Integer class maintains integer-cache for -128 to 127 by default.
// You can change max value (127) by using JVM argument: -XX:AutoBoxCacheMax=<size> (Java 1.6).
// You can't change min value (-128).

// Short, Byte, Character and Long classes maintain similar caches (-128 to 127).
// You can't change min value (-128) or max value (127).

// Why have cache?
// Autoboxing: int => Integer and long => Long, short => Short, byte => Byte
// Same primitive value should give same boxed-object reference.
// Java Language Specifications mandate that for a certain range this is followed: -128 to 127