package com.google.common.primitives;

import java.lang.reflect.Field;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Comparator;
import p153l.myj0;
import p153l.vtq0;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes7.dex */
enum UnsignedBytes$LexicographicalComparatorHolder$UnsafeComparator implements Comparator<byte[]> {
    INSTANCE;

    static final boolean BIG_ENDIAN = ByteOrder.nativeOrder().equals(ByteOrder.BIG_ENDIAN);
    static final int BYTE_ARRAY_BASE_OFFSET;
    static final Unsafe theUnsafe;

    /* JADX INFO: renamed from: com.google.common.primitives.UnsignedBytes$LexicographicalComparatorHolder$UnsafeComparator$a */
    public class C3042a implements PrivilegedExceptionAction<Unsafe> {
        @Override // java.security.PrivilegedExceptionAction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unsafe run() throws Exception {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            throw new NoSuchFieldError("the Unsafe");
        }
    }

    static {
        Unsafe unsafe = getUnsafe();
        theUnsafe = unsafe;
        int iArrayBaseOffset = unsafe.arrayBaseOffset(byte[].class);
        BYTE_ARRAY_BASE_OFFSET = iArrayBaseOffset;
        if (!"64".equals(System.getProperty("sun.arch.data.model")) || iArrayBaseOffset % 8 != 0 || unsafe.arrayIndexScale(byte[].class) != 1) {
            throw new Error();
        }
    }

    private static Unsafe getUnsafe() {
        try {
            try {
                return Unsafe.getUnsafe();
            } catch (PrivilegedActionException e) {
                vtq0.m202761a("Could not initialize intrinsics", e.getCause());
                return null;
            }
        } catch (SecurityException unused) {
            return (Unsafe) AccessController.doPrivileged(new C3042a());
        }
    }

    @Override // java.util.Comparator
    public int compare(byte[] bArr, byte[] bArr2) {
        int iMin = Math.min(bArr.length, bArr2.length);
        int i = iMin & (-8);
        int i2 = 0;
        while (i2 < i) {
            Unsafe unsafe = theUnsafe;
            int i3 = BYTE_ARRAY_BASE_OFFSET;
            long j = i2;
            long j2 = unsafe.getLong(bArr, ((long) i3) + j);
            long j3 = unsafe.getLong(bArr2, ((long) i3) + j);
            if (j2 != j3) {
                if (BIG_ENDIAN) {
                    return UnsignedLongs.m16550a(j2, j3);
                }
                int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j2 ^ j3) & (-8);
                return ((int) ((j2 >>> iNumberOfTrailingZeros) & 255)) - ((int) (255 & (j3 >>> iNumberOfTrailingZeros)));
            }
            i2 += 8;
        }
        while (i2 < iMin) {
            int iM160798b = myj0.m160798b(bArr[i2], bArr2[i2]);
            if (iM160798b != 0) {
                return iM160798b;
            }
            i2++;
        }
        return bArr.length - bArr2.length;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "UnsignedBytes.lexicographicalComparator() (sun.misc.Unsafe version)";
    }
}
