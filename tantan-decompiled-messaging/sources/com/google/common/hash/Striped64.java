package com.google.common.hash;

import com.p046p1.mobile.putong.core.data.VoiceCallStatus;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Random;
import p149l.pkq0;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes7.dex */
abstract class Striped64 extends Number {
    private static final Unsafe UNSAFE;
    private static final long baseOffset;
    private static final long busyOffset;
    volatile transient long base;
    volatile transient int busy;
    volatile transient C3003b[] cells;
    static final ThreadLocal<int[]> threadHashCode = new ThreadLocal<>();
    static final Random rng = new Random();
    static final int NCPU = Runtime.getRuntime().availableProcessors();

    /* JADX INFO: renamed from: com.google.common.hash.Striped64$a */
    public class C3002a implements PrivilegedExceptionAction<Unsafe> {
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

    /* JADX INFO: renamed from: com.google.common.hash.Striped64$b */
    public static final class C3003b {

        /* JADX INFO: renamed from: b */
        public static final Unsafe f11252b;

        /* JADX INFO: renamed from: c */
        public static final long f11253c;

        /* JADX INFO: renamed from: a */
        public volatile long f11254a;

        static {
            try {
                Unsafe unsafe = Striped64.getUnsafe();
                f11252b = unsafe;
                f11253c = unsafe.objectFieldOffset(C3003b.class.getDeclaredField("a"));
            } catch (Exception e) {
                throw new Error(e);
            }
        }

        public C3003b(long j) {
            this.f11254a = j;
        }

        /* JADX INFO: renamed from: a */
        public final boolean m16359a(long j, long j2) {
            return f11252b.compareAndSwapLong(this, f11253c, j, j2);
        }
    }

    static {
        try {
            Unsafe unsafe = getUnsafe();
            UNSAFE = unsafe;
            baseOffset = unsafe.objectFieldOffset(Striped64.class.getDeclaredField("base"));
            busyOffset = unsafe.objectFieldOffset(Striped64.class.getDeclaredField(VoiceCallStatus.busy));
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Unsafe getUnsafe() {
        try {
            try {
                return Unsafe.getUnsafe();
            } catch (PrivilegedActionException e) {
                pkq0.m170054a("Could not initialize intrinsics", e.getCause());
                return null;
            }
        } catch (SecurityException unused) {
            return (Unsafe) AccessController.doPrivileged(new C3002a());
        }
    }

    public final boolean casBase(long j, long j2) {
        return UNSAFE.compareAndSwapLong(this, baseOffset, j, j2);
    }

    public final boolean casBusy() {
        return UNSAFE.compareAndSwapInt(this, busyOffset, 0, 1);
    }

    /* JADX INFO: renamed from: fn */
    public abstract long mo16338fn(long j, long j2);

    public final void internalReset(long j) {
        C3003b[] c3003bArr = this.cells;
        this.base = j;
        if (c3003bArr != null) {
            for (C3003b c3003b : c3003bArr) {
                if (c3003b != null) {
                    c3003b.f11254a = j;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    public final void retryUpdate(long j, int[] iArr, boolean z) {
        int iNextInt;
        int[] iArr2;
        boolean z2;
        int length;
        boolean z3;
        int length2;
        if (iArr == null) {
            iArr2 = new int[1];
            threadHashCode.set(iArr2);
            iNextInt = rng.nextInt();
            if (iNextInt == 0) {
                iNextInt = 1;
            }
            iArr2[0] = iNextInt;
        } else {
            iNextInt = iArr[0];
            iArr2 = iArr;
        }
        boolean z4 = false;
        int i = iNextInt;
        boolean z5 = z;
        while (true) {
            C3003b[] c3003bArr = this.cells;
            if (c3003bArr != null && (length = c3003bArr.length) > 0) {
                C3003b c3003b = c3003bArr[(length - 1) & i];
                if (c3003b == null) {
                    if (this.busy == 0) {
                        C3003b c3003b2 = new C3003b(j);
                        if (this.busy == 0 && casBusy()) {
                            try {
                                C3003b[] c3003bArr2 = this.cells;
                                if (c3003bArr2 == null || (length2 = c3003bArr2.length) <= 0) {
                                    z3 = false;
                                } else {
                                    int i2 = (length2 - 1) & i;
                                    if (c3003bArr2[i2] == null) {
                                        c3003bArr2[i2] = c3003b2;
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                }
                                this.busy = 0;
                                if (z3) {
                                    return;
                                }
                            } catch (Throwable th) {
                                this.busy = 0;
                                throw th;
                            }
                        }
                    }
                    z4 = false;
                    int i3 = i ^ (i << 13);
                    int i4 = i3 ^ (i3 >>> 17);
                    i = i4 ^ (i4 << 5);
                    iArr2[0] = i;
                } else {
                    if (z5) {
                        long j2 = c3003b.f11254a;
                        if (c3003b.m16359a(j2, mo16338fn(j2, j))) {
                            return;
                        }
                        if (length >= NCPU || this.cells != c3003bArr) {
                            z4 = false;
                        } else if (!z4) {
                            z4 = true;
                        } else if (this.busy == 0 && casBusy()) {
                            try {
                                if (this.cells == c3003bArr) {
                                    C3003b[] c3003bArr3 = new C3003b[length << 1];
                                    for (int i5 = 0; i5 < length; i5++) {
                                        c3003bArr3[i5] = c3003bArr[i5];
                                    }
                                    this.cells = c3003bArr3;
                                }
                                this.busy = 0;
                                z4 = false;
                            } catch (Throwable th2) {
                                this.busy = 0;
                                throw th2;
                            }
                        }
                    } else {
                        z5 = true;
                    }
                    int i6 = i ^ (i << 13);
                    int i7 = i6 ^ (i6 >>> 17);
                    i = i7 ^ (i7 << 5);
                    iArr2[0] = i;
                }
            } else if (this.busy == 0 && this.cells == c3003bArr && casBusy()) {
                try {
                    if (this.cells == c3003bArr) {
                        C3003b[] c3003bArr4 = new C3003b[2];
                        c3003bArr4[i & 1] = new C3003b(j);
                        this.cells = c3003bArr4;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.busy = 0;
                    if (z2) {
                        return;
                    }
                } catch (Throwable th3) {
                    this.busy = 0;
                    throw th3;
                }
            } else {
                long j3 = this.base;
                if (casBase(j3, mo16338fn(j3, j))) {
                    return;
                }
            }
        }
    }
}
