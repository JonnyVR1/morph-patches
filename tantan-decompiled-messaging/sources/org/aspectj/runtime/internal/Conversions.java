package org.aspectj.runtime.internal;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class Conversions {
    private Conversions() {
    }

    public static Object booleanObject(boolean z) {
        return new Boolean(z);
    }

    public static boolean booleanValue(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        throw new ClassCastException(obj.getClass().getName().concat(" can not be converted to boolean"));
    }

    public static Object byteObject(byte b) {
        return new Byte(b);
    }

    public static byte byteValue(Object obj) {
        if (obj == null) {
            return (byte) 0;
        }
        if (obj instanceof Number) {
            return ((Number) obj).byteValue();
        }
        throw new ClassCastException(obj.getClass().getName().concat(" can not be converted to byte"));
    }

    public static Object charObject(char c) {
        return new Character(c);
    }

    public static char charValue(Object obj) {
        if (obj == null) {
            return (char) 0;
        }
        if (obj instanceof Character) {
            return ((Character) obj).charValue();
        }
        throw new ClassCastException(obj.getClass().getName().concat(" can not be converted to char"));
    }

    public static Object doubleObject(double d) {
        return new Double(d);
    }

    public static double doubleValue(Object obj) {
        if (obj == null) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
        if (obj instanceof Number) {
            return ((Number) obj).doubleValue();
        }
        throw new ClassCastException(obj.getClass().getName().concat(" can not be converted to double"));
    }

    public static Object floatObject(float f) {
        return new Float(f);
    }

    public static float floatValue(Object obj) {
        if (obj == null) {
            return 0.0f;
        }
        if (obj instanceof Number) {
            return ((Number) obj).floatValue();
        }
        throw new ClassCastException(obj.getClass().getName().concat(" can not be converted to float"));
    }

    public static Object intObject(int i) {
        return new Integer(i);
    }

    public static int intValue(Object obj) {
        if (obj == null) {
            return 0;
        }
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        throw new ClassCastException(obj.getClass().getName().concat(" can not be converted to int"));
    }

    public static Object longObject(long j) {
        return new Long(j);
    }

    public static long longValue(Object obj) {
        if (obj == null) {
            return 0L;
        }
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        throw new ClassCastException(obj.getClass().getName().concat(" can not be converted to long"));
    }

    public static Object shortObject(short s) {
        return new Short(s);
    }

    public static short shortValue(Object obj) {
        if (obj == null) {
            return (short) 0;
        }
        if (obj instanceof Number) {
            return ((Number) obj).shortValue();
        }
        throw new ClassCastException(obj.getClass().getName().concat(" can not be converted to short"));
    }

    public static Object voidObject() {
        return null;
    }

    public static Object voidValue(Object obj) {
        return obj;
    }
}
