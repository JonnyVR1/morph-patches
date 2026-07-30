package org.slf4j.helpers;

import java.io.PrintStream;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class Util {
    public static final void report(String str) {
        PrintStream printStream = System.err;
        StringBuffer stringBuffer = new StringBuffer("SLF4J: ");
        stringBuffer.append(str);
        printStream.println(stringBuffer.toString());
    }

    public static final void report(String str, Throwable th) {
        System.err.println(str);
        System.err.println("Reported exception:");
        th.printStackTrace();
    }
}
