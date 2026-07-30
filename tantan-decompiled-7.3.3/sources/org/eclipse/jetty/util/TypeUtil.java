package org.eclipse.jetty.util;

import com.meituan.robust.Constants;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;
import p153l.iig0;
import p153l.wg3;
import p153l.yg3;

/* JADX INFO: loaded from: classes2.dex */
public class TypeUtil {
    private static final HashMap<Class<?>, String> class2Name;
    private static final HashMap<Class<?>, Method> class2Value;
    private static final HashMap<String, Class<?>> name2Class;
    private static final Logger LOG = Log.getLogger((Class<?>) TypeUtil.class);

    /* JADX INFO: renamed from: CR */
    public static int f206823CR = 13;

    /* JADX INFO: renamed from: LF */
    public static int f206824LF = 10;

    static {
        HashMap<String, Class<?>> map = new HashMap<>();
        name2Class = map;
        Class<?> cls = Boolean.TYPE;
        map.put(Constants.BOOLEAN, cls);
        Class<?> cls2 = Byte.TYPE;
        map.put(Constants.BYTE, cls2);
        Class<?> cls3 = Character.TYPE;
        map.put(Constants.CHAR, cls3);
        Class<?> cls4 = Double.TYPE;
        map.put(Constants.DOUBLE, cls4);
        Class<?> cls5 = Float.TYPE;
        map.put(Constants.FLOAT, cls5);
        Class<?> cls6 = Integer.TYPE;
        map.put(Constants.INT, cls6);
        Class<?> cls7 = Long.TYPE;
        map.put(Constants.LONG, cls7);
        Class<?> cls8 = Short.TYPE;
        map.put(Constants.SHORT, cls8);
        Class<?> cls9 = Void.TYPE;
        map.put(Constants.VOID, cls9);
        map.put("java.lang.Boolean.TYPE", cls);
        map.put("java.lang.Byte.TYPE", cls2);
        map.put("java.lang.Character.TYPE", cls3);
        map.put("java.lang.Double.TYPE", cls4);
        map.put("java.lang.Float.TYPE", cls5);
        map.put("java.lang.Integer.TYPE", cls6);
        map.put("java.lang.Long.TYPE", cls7);
        map.put("java.lang.Short.TYPE", cls8);
        map.put("java.lang.Void.TYPE", cls9);
        map.put(Constants.LANG_BOOLEAN, Boolean.class);
        map.put(Constants.LANG_BYTE, Byte.class);
        map.put("java.lang.Character", Character.class);
        map.put(Constants.LANG_DOUBLE, Double.class);
        map.put(Constants.LANG_FLOAT, Float.class);
        map.put(Constants.LANG_INT, Integer.class);
        map.put(Constants.LANG_LONG, Long.class);
        map.put(Constants.LANG_SHORT, Short.class);
        map.put("Boolean", Boolean.class);
        map.put("Byte", Byte.class);
        map.put(Constants.LANG_CHARACTER, Character.class);
        map.put("Double", Double.class);
        map.put("Float", Float.class);
        map.put("Integer", Integer.class);
        map.put("Long", Long.class);
        map.put("Short", Short.class);
        map.put(null, cls9);
        map.put("string", String.class);
        map.put("String", String.class);
        map.put("java.lang.String", String.class);
        HashMap<Class<?>, String> map2 = new HashMap<>();
        class2Name = map2;
        map2.put(cls, Constants.BOOLEAN);
        map2.put(cls2, Constants.BYTE);
        map2.put(cls3, Constants.CHAR);
        map2.put(cls4, Constants.DOUBLE);
        map2.put(cls5, Constants.FLOAT);
        map2.put(cls6, Constants.INT);
        map2.put(cls7, Constants.LONG);
        map2.put(cls8, Constants.SHORT);
        map2.put(cls9, Constants.VOID);
        map2.put(Boolean.class, Constants.LANG_BOOLEAN);
        map2.put(Byte.class, Constants.LANG_BYTE);
        map2.put(Character.class, "java.lang.Character");
        map2.put(Double.class, Constants.LANG_DOUBLE);
        map2.put(Float.class, Constants.LANG_FLOAT);
        map2.put(Integer.class, Constants.LANG_INT);
        map2.put(Long.class, Constants.LANG_LONG);
        map2.put(Short.class, Constants.LANG_SHORT);
        map2.put(null, Constants.VOID);
        map2.put(String.class, "java.lang.String");
        HashMap<Class<?>, Method> map3 = new HashMap<>();
        class2Value = map3;
        try {
            Class[] clsArr = {String.class};
            map3.put(cls, Boolean.class.getMethod("valueOf", clsArr));
            map3.put(cls2, Byte.class.getMethod("valueOf", clsArr));
            map3.put(cls4, Double.class.getMethod("valueOf", clsArr));
            map3.put(cls5, Float.class.getMethod("valueOf", clsArr));
            map3.put(cls6, Integer.class.getMethod("valueOf", clsArr));
            map3.put(cls7, Long.class.getMethod("valueOf", clsArr));
            map3.put(cls8, Short.class.getMethod("valueOf", clsArr));
            map3.put(Boolean.class, Boolean.class.getMethod("valueOf", clsArr));
            map3.put(Byte.class, Byte.class.getMethod("valueOf", clsArr));
            map3.put(Double.class, Double.class.getMethod("valueOf", clsArr));
            map3.put(Float.class, Float.class.getMethod("valueOf", clsArr));
            map3.put(Integer.class, Integer.class.getMethod("valueOf", clsArr));
            map3.put(Long.class, Long.class.getMethod("valueOf", clsArr));
            map3.put(Short.class, Short.class.getMethod("valueOf", clsArr));
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    public static <T> List<T> asList(T[] tArr) {
        return tArr == null ? Collections.EMPTY_LIST : Arrays.asList(tArr);
    }

    public static Object call(Class<?> cls, String str, Object obj, Object[] objArr) throws NoSuchMethodException, InvocationTargetException {
        Method[] methods = cls.getMethods();
        for (int i = 0; methods != null && i < methods.length; i++) {
            if (methods[i].getName().equals(str) && methods[i].getParameterTypes().length == objArr.length) {
                if (Modifier.isStatic(methods[i].getModifiers()) == (obj == null) && (obj != null || methods[i].getDeclaringClass() == cls)) {
                    try {
                        return methods[i].invoke(obj, objArr);
                    } catch (IllegalAccessException e) {
                        LOG.ignore(e);
                    } catch (IllegalArgumentException e2) {
                        LOG.ignore(e2);
                    }
                }
            }
        }
        throw new NoSuchMethodException(str);
    }

    public static byte convertHexDigit(byte b) {
        if (b >= 48 && b <= 57) {
            return (byte) (b - 48);
        }
        if (b >= 97 && b <= 102) {
            return (byte) (b - 87);
        }
        if (b >= 65 && b <= 70) {
            return (byte) (b - 55);
        }
        yg3.m215829a("!hex:", Integer.toHexString(b & 255));
        return (byte) 0;
    }

    public static void dump(ClassLoader classLoader) {
        System.err.println("Dump Loaders:");
        while (classLoader != null) {
            System.err.println("  loader " + classLoader);
            classLoader = classLoader.getParent();
        }
    }

    public static byte[] fromHexString(String str) {
        if (str.length() % 2 != 0) {
            wg3.m206174a(str);
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (Integer.parseInt(str.substring(i2, i2 + 2), 16) & 255);
        }
        return bArr;
    }

    public static Class<?> fromName(String str) {
        return name2Class.get(str);
    }

    public static URL jarFor(String str) {
        try {
            String string = Loader.getResource(null, str.replace('.', '/') + ".class", false).toString();
            if (string.startsWith("jar:file:")) {
                return new URL(string.substring(4, string.indexOf("!/")));
            }
        } catch (Exception e) {
            LOG.ignore(e);
        }
        return null;
    }

    public static byte[] parseBytes(String str, int i) {
        byte[] bArr = new byte[str.length() / 2];
        for (int i2 = 0; i2 < str.length(); i2 += 2) {
            bArr[i2 / 2] = (byte) parseInt(str, i2, 2, i);
        }
        return bArr;
    }

    public static int parseInt(String str, int i, int i2, int i3) throws NumberFormatException {
        if (i2 < 0) {
            i2 = str.length() - i;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            char cCharAt = str.charAt(i + i5);
            int i6 = cCharAt - '0';
            if ((i6 < 0 || i6 >= i3 || i6 >= 10) && ((i6 = cCharAt - '7') < 10 || i6 >= i3)) {
                i6 = cCharAt - 'W';
            }
            if (i6 < 0 || i6 >= i3) {
                throw new NumberFormatException(str.substring(i, i2 + i));
            }
            i4 = (i4 * i3) + i6;
        }
        return i4;
    }

    public static byte[] readLine(InputStream inputStream) throws IOException {
        int i;
        byte[] bArr = new byte[256];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = inputStream.read();
            if (i < 0) {
                break;
            }
            i2++;
            if (i2 != 1 || i != f206824LF) {
                if (i == f206823CR || i == f206824LF) {
                    break;
                }
                if (i3 >= bArr.length) {
                    byte[] bArr2 = new byte[bArr.length + 256];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    bArr = bArr2;
                }
                bArr[i3] = (byte) i;
                i3++;
            }
        }
        if (i == -1 && i3 == 0) {
            return null;
        }
        if (i == f206823CR && inputStream.available() >= 1 && inputStream.markSupported()) {
            inputStream.mark(1);
            if (inputStream.read() != f206824LF) {
                inputStream.reset();
            }
        }
        byte[] bArr3 = new byte[i3];
        System.arraycopy(bArr, 0, bArr3, 0, i3);
        return bArr3;
    }

    public static void toHex(byte b, Appendable appendable) {
        int i = b & 255;
        try {
            int i2 = (i / 16) % 16;
            int i3 = i2 + 48;
            if (i3 > 57) {
                i3 = i2 + 55;
            }
            appendable.append((char) i3);
            int i4 = i % 16;
            int i5 = i4 + 48;
            if (i5 > 57) {
                i5 = i4 + 55;
            }
            appendable.append((char) i5);
        } catch (IOException e) {
            iig0.m140070a(e);
        }
    }

    public static String toHexString(byte[] bArr, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        for (int i3 = i; i3 < i + i2; i3++) {
            int i4 = bArr[i3] & 255;
            int i5 = (i4 / 16) % 16;
            int i6 = i5 + 48;
            if (i6 > 57) {
                i6 = i5 + 55;
            }
            sb.append((char) i6);
            int i7 = i4 % 16;
            int i8 = i7 + 48;
            if (i8 > 57) {
                i8 = i7 + 87;
            }
            sb.append((char) i8);
        }
        return sb.toString();
    }

    public static String toName(Class<?> cls) {
        return class2Name.get(cls);
    }

    public static String toString(byte[] bArr, int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 : bArr) {
            int i3 = i2 & 255;
            int i4 = (i3 / i) % i;
            int i5 = i4 + 48;
            if (i5 > 57) {
                i5 = i4 + 87;
            }
            sb.append((char) i5);
            int i6 = i3 % i;
            int i7 = i6 + 48;
            if (i7 > 57) {
                i7 = i6 + 87;
            }
            sb.append((char) i7);
        }
        return sb.toString();
    }

    public static Object valueOf(Class<?> cls, String str) {
        try {
            if (cls.equals(String.class)) {
                return str;
            }
            Method method = class2Value.get(cls);
            if (method != null) {
                return method.invoke(null, str);
            }
            if (!cls.equals(Character.TYPE) && !cls.equals(Character.class)) {
                return cls.getConstructor(String.class).newInstance(str);
            }
            return new Character(str.charAt(0));
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e) {
            if (e.getTargetException() instanceof Error) {
                throw ((Error) e.getTargetException());
            }
            return null;
        }
    }

    public static void dump(Class<?> cls) {
        System.err.println("Dump: " + cls);
        dump(cls.getClassLoader());
    }

    public static String toHexString(byte[] bArr) {
        return toHexString(bArr, 0, bArr.length);
    }

    public static String toHexString(byte b) {
        return toHexString(new byte[]{b}, 0, 1);
    }

    public static int parseInt(byte[] bArr, int i, int i2, int i3) throws NumberFormatException {
        if (i2 < 0) {
            i2 = bArr.length - i;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            char c = (char) (bArr[i + i5] & 255);
            int i6 = c - '0';
            if ((i6 < 0 || i6 >= i3 || i6 >= 10) && ((i6 = c - '7') < 10 || i6 >= i3)) {
                i6 = c - 'W';
            }
            if (i6 < 0 || i6 >= i3) {
                throw new NumberFormatException(new String(bArr, i, i2));
            }
            i4 = (i4 * i3) + i6;
        }
        return i4;
    }

    public static Object valueOf(String str, String str2) {
        return valueOf(fromName(str), str2);
    }
}
