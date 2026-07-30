package net.jpountz.util;

import java.lang.reflect.Field;
import java.nio.ByteOrder;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public enum UnsafeUtils {
    ;

    private static final long BYTE_ARRAY_OFFSET;
    private static final int BYTE_ARRAY_SCALE;
    private static final long INT_ARRAY_OFFSET;
    private static final int INT_ARRAY_SCALE;
    private static final long SHORT_ARRAY_OFFSET;
    private static final int SHORT_ARRAY_SCALE;
    private static final Unsafe UNSAFE;

    static {
        try {
            Field declaredField = Unsafe.class.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            Unsafe unsafe = (Unsafe) declaredField.get(null);
            UNSAFE = unsafe;
            BYTE_ARRAY_OFFSET = unsafe.arrayBaseOffset(byte[].class);
            BYTE_ARRAY_SCALE = unsafe.arrayIndexScale(byte[].class);
            INT_ARRAY_OFFSET = unsafe.arrayBaseOffset(int[].class);
            INT_ARRAY_SCALE = unsafe.arrayIndexScale(int[].class);
            SHORT_ARRAY_OFFSET = unsafe.arrayBaseOffset(short[].class);
            SHORT_ARRAY_SCALE = unsafe.arrayIndexScale(short[].class);
        } catch (IllegalAccessException unused) {
            throw new ExceptionInInitializerError("Cannot access Unsafe");
        } catch (NoSuchFieldException unused2) {
            throw new ExceptionInInitializerError("Cannot access Unsafe");
        } catch (SecurityException unused3) {
            throw new ExceptionInInitializerError("Cannot access Unsafe");
        }
    }

    public static void checkLength(int i) {
        SafeUtils.checkLength(i);
    }

    public static void checkRange(byte[] bArr, int i) {
        SafeUtils.checkRange(bArr, i);
    }

    public static byte readByte(byte[] bArr, int i) {
        return UNSAFE.getByte(bArr, BYTE_ARRAY_OFFSET + ((long) (BYTE_ARRAY_SCALE * i)));
    }

    public static int readInt(int[] iArr, int i) {
        return UNSAFE.getInt(iArr, INT_ARRAY_OFFSET + ((long) (INT_ARRAY_SCALE * i)));
    }

    public static int readIntLE(byte[] bArr, int i) {
        int i2 = readInt(bArr, i);
        return Utils.NATIVE_BYTE_ORDER == ByteOrder.BIG_ENDIAN ? Integer.reverseBytes(i2) : i2;
    }

    public static long readLong(byte[] bArr, int i) {
        return UNSAFE.getLong(bArr, BYTE_ARRAY_OFFSET + ((long) i));
    }

    public static long readLongLE(byte[] bArr, int i) {
        long j = readLong(bArr, i);
        return Utils.NATIVE_BYTE_ORDER == ByteOrder.BIG_ENDIAN ? Long.reverseBytes(j) : j;
    }

    public static int readShort(short[] sArr, int i) {
        return UNSAFE.getShort(sArr, SHORT_ARRAY_OFFSET + ((long) (SHORT_ARRAY_SCALE * i))) & 65535;
    }

    public static int readShortLE(byte[] bArr, int i) {
        short sReverseBytes = readShort(bArr, i);
        if (Utils.NATIVE_BYTE_ORDER == ByteOrder.BIG_ENDIAN) {
            sReverseBytes = Short.reverseBytes(sReverseBytes);
        }
        return sReverseBytes & 65535;
    }

    public static void writeByte(byte[] bArr, int i, byte b) {
        UNSAFE.putByte(bArr, BYTE_ARRAY_OFFSET + ((long) (BYTE_ARRAY_SCALE * i)), b);
    }

    public static void writeInt(int[] iArr, int i, int i2) {
        UNSAFE.putInt(iArr, INT_ARRAY_OFFSET + ((long) (INT_ARRAY_SCALE * i)), i2);
    }

    public static void writeLong(byte[] bArr, int i, long j) {
        UNSAFE.putLong(bArr, BYTE_ARRAY_OFFSET + ((long) i), j);
    }

    public static void writeShort(short[] sArr, int i, int i2) {
        UNSAFE.putShort(sArr, SHORT_ARRAY_OFFSET + ((long) (SHORT_ARRAY_SCALE * i)), (short) i2);
    }

    public static void writeShortLE(byte[] bArr, int i, int i2) {
        writeByte(bArr, i, (byte) i2);
        writeByte(bArr, i + 1, (byte) (i2 >>> 8));
    }

    public static void checkRange(byte[] bArr, int i, int i2) {
        SafeUtils.checkRange(bArr, i, i2);
    }

    public static void writeByte(byte[] bArr, int i, int i2) {
        writeByte(bArr, i, (byte) i2);
    }

    public static void writeInt(byte[] bArr, int i, int i2) {
        UNSAFE.putInt(bArr, BYTE_ARRAY_OFFSET + ((long) i), i2);
    }

    public static int readInt(byte[] bArr, int i) {
        return UNSAFE.getInt(bArr, BYTE_ARRAY_OFFSET + ((long) i));
    }

    public static void writeShort(byte[] bArr, int i, short s) {
        UNSAFE.putShort(bArr, BYTE_ARRAY_OFFSET + ((long) i), s);
    }

    public static short readShort(byte[] bArr, int i) {
        return UNSAFE.getShort(bArr, BYTE_ARRAY_OFFSET + ((long) i));
    }
}
