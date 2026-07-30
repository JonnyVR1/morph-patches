package com.momo.xeengine;

import android.util.Log;
import androidx.annotation.Keep;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;

/* JADX INFO: loaded from: classes8.dex */
@Keep
public final class XELogger {
    public static final String ENGINE_TAG = "[XENGINE]";
    private static ErrorPrinter errorPrinter;
    private boolean enable = false;
    private long pointer;

    public interface ErrorPrinter {
        void print(String str, String str2);
    }

    public interface Printer {
        void print(String str);
    }

    public XELogger(long j) {
        this.pointer = j;
    }

    private static String appendStr(Object... objArr) {
        StringBuilder sb = new StringBuilder();
        if (objArr == null) {
            sb.append("null ");
            return sb.toString();
        }
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            sb.append(obj == null ? "null" : obj.toString());
            sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        }
        return sb.toString();
    }

    public static void debug(Object... objArr) {
    }

    /* JADX INFO: renamed from: e */
    public static void m20226e(Object... objArr) {
        Log.e(ENGINE_TAG, appendStr(objArr));
    }

    private long getPointer() {
        return this.pointer;
    }

    private native String nativeGetTag(long j);

    private native void nativeSetLogEnable(long j, boolean z);

    private native void nativeSetPrintErrorFunc(long j, Printer printer);

    private native void nativeSetPrintFunc(long j, Printer printer);

    private native void nativeSetTag(long j, String str);

    public static void printGlobalError(String str, String str2) {
        ErrorPrinter errorPrinter2 = errorPrinter;
        if (errorPrinter2 != null) {
            errorPrinter2.print(str, str2);
        }
    }

    public static void setGlobalErrorPrinter(ErrorPrinter errorPrinter2) {
        errorPrinter = errorPrinter2;
    }

    /* JADX INFO: renamed from: d */
    public void m20227d(Object... objArr) {
        if (this.enable) {
            Log.e(ENGINE_TAG, appendStr(objArr));
        }
    }

    public String getTag() {
        return nativeGetTag(getPointer());
    }

    public void release() {
        this.pointer = 0L;
    }

    public void setErrorPrinter(Printer printer) {
        if (getPointer() == 0) {
            return;
        }
        nativeSetPrintErrorFunc(getPointer(), printer);
    }

    public void setLogEnable(boolean z) {
        if (getPointer() == 0) {
            return;
        }
        this.enable = z;
        nativeSetLogEnable(getPointer(), z);
    }

    public void setPrintPrinter(Printer printer) {
        if (getPointer() == 0) {
            return;
        }
        nativeSetPrintFunc(getPointer(), printer);
    }

    public void setTag(String str) {
        nativeSetTag(getPointer(), str);
    }
}
