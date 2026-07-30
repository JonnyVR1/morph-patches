package org.slf4j.helpers;

import com.clevertap.android.sdk.Constants;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class MessageFormatter {
    static final char DELIM_START = '{';
    static final char DELIM_STOP = '}';
    static final String DELIM_STR = "{}";
    private static final char ESCAPE_CHAR = '\\';

    public static final FormattingTuple arrayFormat(String str, Object[] objArr) {
        int i;
        Throwable throwableCandidate = getThrowableCandidate(objArr);
        if (str == null) {
            return new FormattingTuple(null, objArr, throwableCandidate);
        }
        if (objArr == null) {
            return new FormattingTuple(str);
        }
        StringBuffer stringBuffer = new StringBuffer(str.length() + 50);
        int i2 = 0;
        int i3 = 0;
        while (i2 < objArr.length) {
            int iIndexOf = str.indexOf("{}", i3);
            if (iIndexOf == -1) {
                if (i3 == 0) {
                    return new FormattingTuple(str, objArr, throwableCandidate);
                }
                stringBuffer.append(str.substring(i3, str.length()));
                return new FormattingTuple(stringBuffer.toString(), objArr, throwableCandidate);
            }
            if (isEscapedDelimeter(str, iIndexOf)) {
                if (isDoubleEscaped(str, iIndexOf)) {
                    stringBuffer.append(str.substring(i3, iIndexOf - 1));
                    deeplyAppendParameter(stringBuffer, objArr[i2], new HashMap());
                } else {
                    i2--;
                    stringBuffer.append(str.substring(i3, iIndexOf - 1));
                    stringBuffer.append(DELIM_START);
                    i = iIndexOf + 1;
                }
                i3 = i;
                i2++;
            } else {
                stringBuffer.append(str.substring(i3, iIndexOf));
                deeplyAppendParameter(stringBuffer, objArr[i2], new HashMap());
            }
            i = iIndexOf + 2;
            i3 = i;
            i2++;
        }
        stringBuffer.append(str.substring(i3, str.length()));
        return i2 < objArr.length + (-1) ? new FormattingTuple(stringBuffer.toString(), objArr, throwableCandidate) : new FormattingTuple(stringBuffer.toString(), objArr, null);
    }

    private static void booleanArrayAppend(StringBuffer stringBuffer, boolean[] zArr) {
        stringBuffer.append('[');
        int length = zArr.length;
        for (int i = 0; i < length; i++) {
            stringBuffer.append(zArr[i]);
            if (i != length - 1) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append(']');
    }

    private static void byteArrayAppend(StringBuffer stringBuffer, byte[] bArr) {
        stringBuffer.append('[');
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            stringBuffer.append((int) bArr[i]);
            if (i != length - 1) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append(']');
    }

    private static void charArrayAppend(StringBuffer stringBuffer, char[] cArr) {
        stringBuffer.append('[');
        int length = cArr.length;
        for (int i = 0; i < length; i++) {
            stringBuffer.append(cArr[i]);
            if (i != length - 1) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append(']');
    }

    private static void deeplyAppendParameter(StringBuffer stringBuffer, Object obj, Map map) {
        if (obj == null) {
            stringBuffer.append("null");
            return;
        }
        if (!obj.getClass().isArray()) {
            safeObjectAppend(stringBuffer, obj);
            return;
        }
        if (obj instanceof boolean[]) {
            booleanArrayAppend(stringBuffer, (boolean[]) obj);
            return;
        }
        if (obj instanceof byte[]) {
            byteArrayAppend(stringBuffer, (byte[]) obj);
            return;
        }
        if (obj instanceof char[]) {
            charArrayAppend(stringBuffer, (char[]) obj);
            return;
        }
        if (obj instanceof short[]) {
            shortArrayAppend(stringBuffer, (short[]) obj);
            return;
        }
        if (obj instanceof int[]) {
            intArrayAppend(stringBuffer, (int[]) obj);
            return;
        }
        if (obj instanceof long[]) {
            longArrayAppend(stringBuffer, (long[]) obj);
            return;
        }
        if (obj instanceof float[]) {
            floatArrayAppend(stringBuffer, (float[]) obj);
        } else if (obj instanceof double[]) {
            doubleArrayAppend(stringBuffer, (double[]) obj);
        } else {
            objectArrayAppend(stringBuffer, (Object[]) obj, map);
        }
    }

    private static void doubleArrayAppend(StringBuffer stringBuffer, double[] dArr) {
        stringBuffer.append('[');
        int length = dArr.length;
        for (int i = 0; i < length; i++) {
            stringBuffer.append(dArr[i]);
            if (i != length - 1) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append(']');
    }

    private static void floatArrayAppend(StringBuffer stringBuffer, float[] fArr) {
        stringBuffer.append('[');
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            stringBuffer.append(fArr[i]);
            if (i != length - 1) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append(']');
    }

    public static final FormattingTuple format(String str, Object obj) {
        return arrayFormat(str, new Object[]{obj});
    }

    public static final Throwable getThrowableCandidate(Object[] objArr) {
        if (objArr != null && objArr.length != 0) {
            Object obj = objArr[objArr.length - 1];
            if (obj instanceof Throwable) {
                return (Throwable) obj;
            }
        }
        return null;
    }

    private static void intArrayAppend(StringBuffer stringBuffer, int[] iArr) {
        stringBuffer.append('[');
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            stringBuffer.append(iArr[i]);
            if (i != length - 1) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append(']');
    }

    public static final boolean isDoubleEscaped(String str, int i) {
        return i >= 2 && str.charAt(i - 2) == '\\';
    }

    public static final boolean isEscapedDelimeter(String str, int i) {
        return i != 0 && str.charAt(i - 1) == '\\';
    }

    private static void longArrayAppend(StringBuffer stringBuffer, long[] jArr) {
        stringBuffer.append('[');
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            stringBuffer.append(jArr[i]);
            if (i != length - 1) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append(']');
    }

    private static void objectArrayAppend(StringBuffer stringBuffer, Object[] objArr, Map map) {
        stringBuffer.append('[');
        if (map.containsKey(objArr)) {
            stringBuffer.append("...");
        } else {
            map.put(objArr, null);
            int length = objArr.length;
            for (int i = 0; i < length; i++) {
                deeplyAppendParameter(stringBuffer, objArr[i], map);
                if (i != length - 1) {
                    stringBuffer.append(", ");
                }
            }
            map.remove(objArr);
        }
        stringBuffer.append(']');
    }

    private static void safeObjectAppend(StringBuffer stringBuffer, Object obj) {
        try {
            stringBuffer.append(obj.toString());
        } catch (Throwable th) {
            PrintStream printStream = System.err;
            StringBuffer stringBuffer2 = new StringBuffer("SLF4J: Failed toString() invocation on an object of type [");
            stringBuffer2.append(obj.getClass().getName());
            stringBuffer2.append(Constants.AES_SUFFIX);
            printStream.println(stringBuffer2.toString());
            th.printStackTrace();
            stringBuffer.append("[FAILED toString()]");
        }
    }

    private static void shortArrayAppend(StringBuffer stringBuffer, short[] sArr) {
        stringBuffer.append('[');
        int length = sArr.length;
        for (int i = 0; i < length; i++) {
            stringBuffer.append((int) sArr[i]);
            if (i != length - 1) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append(']');
    }

    public static final FormattingTuple format(String str, Object obj, Object obj2) {
        return arrayFormat(str, new Object[]{obj, obj2});
    }
}
