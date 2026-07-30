package p153l;

import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.clevertap.android.sdk.Constants;
import com.google.protobuf.nano.MessageNano;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class o100 {
    /* JADX INFO: renamed from: a */
    public static void m165569a(byte[] bArr, StringBuffer stringBuffer) {
        if (bArr == null) {
            stringBuffer.append("\"\"");
            return;
        }
        stringBuffer.append('\"');
        for (byte b : bArr) {
            int i = b & 255;
            if (i == 92 || i == 34) {
                stringBuffer.append('\\');
                stringBuffer.append((char) i);
            } else if (i < 32 || i >= 127) {
                stringBuffer.append(String.format("\\%03o", Integer.valueOf(i)));
            } else {
                stringBuffer.append((char) i);
            }
        }
        stringBuffer.append('\"');
    }

    /* JADX INFO: renamed from: b */
    public static String m165570b(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (i == 0) {
                stringBuffer.append(Character.toLowerCase(cCharAt));
            } else if (Character.isUpperCase(cCharAt)) {
                stringBuffer.append('_');
                stringBuffer.append(Character.toLowerCase(cCharAt));
            } else {
                stringBuffer.append(cCharAt);
            }
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: c */
    public static String m165571c(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt < ' ' || cCharAt > '~' || cCharAt == '\"' || cCharAt == '\'') {
                sb.append(String.format("\\u%04x", Integer.valueOf(cCharAt)));
            } else {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: d */
    public static <T extends MessageNano> String m165572d(T t) {
        if (t == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            m165573e(null, t, new StringBuffer(), stringBuffer);
            return stringBuffer.toString();
        } catch (IllegalAccessException e) {
            return "Error printing proto: " + e.getMessage();
        } catch (InvocationTargetException e2) {
            return "Error printing proto: " + e2.getMessage();
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m165573e(String str, Object obj, StringBuffer stringBuffer, StringBuffer stringBuffer2) throws IllegalAccessException, InvocationTargetException {
        if (obj == null) {
            return;
        }
        if (!(obj instanceof MessageNano)) {
            if (!(obj instanceof Map)) {
                String strM165570b = m165570b(str);
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(strM165570b);
                stringBuffer2.append(": ");
                if (obj instanceof String) {
                    String strM165574f = m165574f((String) obj);
                    stringBuffer2.append("\"");
                    stringBuffer2.append(strM165574f);
                    stringBuffer2.append("\"");
                } else if (obj instanceof byte[]) {
                    m165569a((byte[]) obj, stringBuffer2);
                } else {
                    stringBuffer2.append(obj);
                }
                stringBuffer2.append(SignParameters.NEW_LINE);
                return;
            }
            String strM165570b2 = m165570b(str);
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(strM165570b2);
                stringBuffer2.append(" <\n");
                int length = stringBuffer.length();
                stringBuffer.append("  ");
                m165573e(Constants.KEY_KEY, entry.getKey(), stringBuffer, stringBuffer2);
                m165573e("value", entry.getValue(), stringBuffer, stringBuffer2);
                stringBuffer.setLength(length);
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(">\n");
            }
            return;
        }
        int length2 = stringBuffer.length();
        if (str != null) {
            stringBuffer2.append(stringBuffer);
            stringBuffer2.append(m165570b(str));
            stringBuffer2.append(" <\n");
            stringBuffer.append("  ");
        }
        Class<?> cls = obj.getClass();
        for (Field field : cls.getFields()) {
            int modifiers = field.getModifiers();
            String name = field.getName();
            if (!"cachedSize".equals(name) && (modifiers & 1) == 1 && (modifiers & 8) != 8 && !name.startsWith("_") && !name.endsWith("_")) {
                Class<?> type = field.getType();
                Object obj2 = field.get(obj);
                if (!type.isArray()) {
                    m165573e(name, obj2, stringBuffer, stringBuffer2);
                } else if (type.getComponentType() == Byte.TYPE) {
                    m165573e(name, obj2, stringBuffer, stringBuffer2);
                } else {
                    int length3 = obj2 == null ? 0 : Array.getLength(obj2);
                    for (int i = 0; i < length3; i++) {
                        m165573e(name, Array.get(obj2, i), stringBuffer, stringBuffer2);
                    }
                }
            }
        }
        for (Method method : cls.getMethods()) {
            String name2 = method.getName();
            if (name2.startsWith("set")) {
                String strSubstring = name2.substring(3);
                try {
                    if (((Boolean) cls.getMethod("has" + strSubstring, null).invoke(obj, null)).booleanValue()) {
                        m165573e(strSubstring, cls.getMethod("get" + strSubstring, null).invoke(obj, null), stringBuffer, stringBuffer2);
                    }
                } catch (NoSuchMethodException unused) {
                }
            }
        }
        if (str != null) {
            stringBuffer.setLength(length2);
            stringBuffer2.append(stringBuffer);
            stringBuffer2.append(">\n");
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m165574f(String str) {
        if (!str.startsWith("http") && str.length() > 200) {
            str = str.substring(0, 200).concat("[...]");
        }
        return m165571c(str);
    }
}
