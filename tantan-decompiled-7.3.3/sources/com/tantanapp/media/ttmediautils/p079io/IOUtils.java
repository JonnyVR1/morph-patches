package com.tantanapp.media.ttmediautils.p079io;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public class IOUtils {
    public static void closeAllQuietly(Closeable... closeableArr) {
        if (closeableArr != null) {
            for (Closeable closeable : closeableArr) {
                if (closeable != null) {
                    try {
                        closeable.close();
                    } catch (IOException unused) {
                    }
                }
            }
        }
    }

    public static void closeQuietly(Closeable closeable) {
        closeAllQuietly(closeable);
    }
}
