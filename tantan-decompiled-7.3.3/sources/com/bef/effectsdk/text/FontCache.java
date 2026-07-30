package com.bef.effectsdk.text;

import android.graphics.Typeface;
import java.io.File;
import java.util.Hashtable;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
public class FontCache {
    private static final int MAX_CACHE_SIZE = 32;
    private static Hashtable<String, Typeface> fontCache = new Hashtable<>();
    private static LinkedList<String> lruQueue = new LinkedList<>();

    public static synchronized Typeface getFromFile(String str, String str2) {
        Typeface typefaceCreateFromFile;
        try {
            String str3 = "FILE_" + str + "_" + str2;
            typefaceCreateFromFile = fontCache.get(str3);
            if (typefaceCreateFromFile == null) {
                try {
                    typefaceCreateFromFile = Typeface.createFromFile(new File(str, str2));
                    if (lruQueue.size() >= 32) {
                        fontCache.remove(lruQueue.removeLast());
                        System.gc();
                    }
                    fontCache.put(str3, typefaceCreateFromFile);
                    lruQueue.addFirst(str3);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                lruQueue.remove(str3);
                lruQueue.addFirst(str3);
            }
        } catch (Throwable th) {
            throw th;
        }
        return typefaceCreateFromFile;
    }

    public static synchronized Typeface getFromSystem(String str, int i) {
        Typeface typefaceCreate;
        try {
            String str2 = "SYSTEM_" + str + "_" + i;
            typefaceCreate = fontCache.get(str2);
            if (typefaceCreate == null) {
                try {
                    typefaceCreate = Typeface.create(str, i);
                    if (lruQueue.size() >= 32) {
                        fontCache.remove(lruQueue.removeLast());
                        System.gc();
                    }
                    fontCache.put(str2, typefaceCreate);
                    lruQueue.addFirst(str2);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                lruQueue.remove(str2);
                lruQueue.addFirst(str2);
            }
        } catch (Throwable th) {
            throw th;
        }
        return typefaceCreate;
    }
}
