package io.agora.base.internal;

import java.io.UnsupportedEncodingException;
import java.util.Map;
import p153l.azk0;

/* JADX INFO: loaded from: classes2.dex */
class JniHelper {
    @CalledByNative
    public static Object getKey(Map.Entry entry) {
        return entry.getKey();
    }

    @CalledByNative
    public static byte[] getStringBytes(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            azk0.m101074a("UTF-8 is unsupported");
            return null;
        }
    }

    @CalledByNative
    public static Object getStringClass() {
        return String.class;
    }

    @CalledByNative
    public static Object getValue(Map.Entry entry) {
        return entry.getValue();
    }
}
