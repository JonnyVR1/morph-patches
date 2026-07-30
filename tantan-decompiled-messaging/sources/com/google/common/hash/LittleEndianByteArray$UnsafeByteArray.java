package com.google.common.hash;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import p149l.pkq0;
import p149l.shg0;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes7.dex */
enum LittleEndianByteArray$UnsafeByteArray {
    UNSAFE_LITTLE_ENDIAN { // from class: com.google.common.hash.LittleEndianByteArray$UnsafeByteArray.1
        @Override // com.google.common.hash.LittleEndianByteArray$UnsafeByteArray
        public long getLongLittleEndian(byte[] bArr, int i) {
            return LittleEndianByteArray$UnsafeByteArray.theUnsafe.getLong(bArr, ((long) i) + ((long) LittleEndianByteArray$UnsafeByteArray.BYTE_ARRAY_BASE_OFFSET));
        }

        @Override // com.google.common.hash.LittleEndianByteArray$UnsafeByteArray
        public void putLongLittleEndian(byte[] bArr, int i, long j) {
            LittleEndianByteArray$UnsafeByteArray.theUnsafe.putLong(bArr, ((long) i) + ((long) LittleEndianByteArray$UnsafeByteArray.BYTE_ARRAY_BASE_OFFSET), j);
        }
    },
    UNSAFE_BIG_ENDIAN { // from class: com.google.common.hash.LittleEndianByteArray$UnsafeByteArray.2
        @Override // com.google.common.hash.LittleEndianByteArray$UnsafeByteArray
        public long getLongLittleEndian(byte[] bArr, int i) {
            return Long.reverseBytes(LittleEndianByteArray$UnsafeByteArray.theUnsafe.getLong(bArr, ((long) i) + ((long) LittleEndianByteArray$UnsafeByteArray.BYTE_ARRAY_BASE_OFFSET)));
        }

        @Override // com.google.common.hash.LittleEndianByteArray$UnsafeByteArray
        public void putLongLittleEndian(byte[] bArr, int i, long j) {
            LittleEndianByteArray$UnsafeByteArray.theUnsafe.putLong(bArr, ((long) i) + ((long) LittleEndianByteArray$UnsafeByteArray.BYTE_ARRAY_BASE_OFFSET), Long.reverseBytes(j));
        }
    };

    private static final int BYTE_ARRAY_BASE_OFFSET;
    private static final Unsafe theUnsafe;

    /* JADX INFO: renamed from: com.google.common.hash.LittleEndianByteArray$UnsafeByteArray$a */
    public class C2994a implements PrivilegedExceptionAction<Unsafe> {
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
        BYTE_ARRAY_BASE_OFFSET = unsafe.arrayBaseOffset(byte[].class);
        if (unsafe.arrayIndexScale(byte[].class) == 1) {
            return;
        }
        shg0.m184191a();
    }

    private static Unsafe getUnsafe() {
        try {
            try {
                return Unsafe.getUnsafe();
            } catch (PrivilegedActionException e) {
                pkq0.m170054a("Could not initialize intrinsics", e.getCause());
                return null;
            }
        } catch (SecurityException unused) {
            return (Unsafe) AccessController.doPrivileged(new C2994a());
        }
    }

    public abstract /* synthetic */ long getLongLittleEndian(byte[] bArr, int i);

    public abstract /* synthetic */ void putLongLittleEndian(byte[] bArr, int i, long j);
}
