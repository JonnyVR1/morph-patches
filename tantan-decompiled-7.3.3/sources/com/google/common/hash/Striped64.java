package com.google.common.hash;

import com.p051p1.mobile.putong.core.data.VoiceCallStatus;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Random;
import p153l.vtq0;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes7.dex */
abstract class Striped64 extends Number {
    private static final Unsafe UNSAFE;
    private static final long baseOffset;
    private static final long busyOffset;
    volatile transient long base;
    volatile transient int busy;
    volatile transient C3026b[] cells;
    static final ThreadLocal<int[]> threadHashCode = new ThreadLocal<>();
    static final Random rng = new Random();
    static final int NCPU = Runtime.getRuntime().availableProcessors();

    /* JADX INFO: renamed from: com.google.common.hash.Striped64$a */
    public class C3025a implements PrivilegedExceptionAction<Unsafe> {
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
    public static final class C3026b {

        /* JADX INFO: renamed from: b */
        public static final Unsafe f11289b;

        /* JADX INFO: renamed from: c */
        public static final long f11290c;

        /* JADX INFO: renamed from: a */
        public volatile long f11291a;

        static {
            try {
                Unsafe unsafe = Striped64.getUnsafe();
                f11289b = unsafe;
                f11290c = unsafe.objectFieldOffset(C3026b.class.getDeclaredField("a"));
            } catch (Exception e) {
                throw new Error(e);
            }
        }

        public C3026b(long j) {
            this.f11291a = j;
        }

        /* JADX INFO: renamed from: a */
        public final boolean m16414a(long j, long j2) {
            return f11289b.compareAndSwapLong(this, f11290c, j, j2);
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
                vtq0.m202761a("Could not initialize intrinsics", e.getCause());
                return null;
            }
        } catch (SecurityException unused) {
            return (Unsafe) AccessController.doPrivileged(new C3025a());
        }
    }

    public final boolean casBase(long j, long j2) {
        return UNSAFE.compareAndSwapLong(this, baseOffset, j, j2);
    }

    public final boolean casBusy() {
        return UNSAFE.compareAndSwapInt(this, busyOffset, 0, 1);
    }

    /* JADX INFO: renamed from: fn */
    public abstract long mo16393fn(long j, long j2);

    public final void internalReset(long j) {
        C3026b[] c3026bArr = this.cells;
        this.base = j;
        if (c3026bArr != null) {
            for (C3026b c3026b : c3026bArr) {
                if (c3026b != null) {
                    c3026b.f11291a = j;
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
            C3026b[] c3026bArr = this.cells;
            if (c3026bArr != null && (length = c3026bArr.length) > 0) {
                C3026b c3026b = c3026bArr[(length - 1) & i];
                if (c3026b == null) {
                    if (this.busy == 0) {
                        C3026b c3026b2 = new C3026b(j);
                        if (this.busy == 0 && casBusy()) {
                            try {
                                C3026b[] c3026bArr2 = this.cells;
                                if (c3026bArr2 == null || (length2 = c3026bArr2.length) <= 0) {
                                    z3 = false;
                                } else {
                                    int i2 = (length2 - 1) & i;
                                    if (c3026bArr2[i2] == null) {
                                        c3026bArr2[i2] = c3026b2;
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
                        long j2 = c3026b.f11291a;
                        if (c3026b.m16414a(j2, mo16393fn(j2, j))) {
                            return;
                        }
                        if (length >= NCPU || this.cells != c3026bArr) {
                            z4 = false;
                        } else if (!z4) {
                            z4 = true;
                        } else if (this.busy == 0 && casBusy()) {
                            try {
                                if (this.cells == c3026bArr) {
                                    C3026b[] c3026bArr3 = new C3026b[length << 1];
                                    for (int i5 = 0; i5 < length; i5++) {
                                        c3026bArr3[i5] = c3026bArr[i5];
                                    }
                                    this.cells = c3026bArr3;
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
            } else if (this.busy == 0 && this.cells == c3026bArr && casBusy()) {
                try {
                    if (this.cells == c3026bArr) {
                        C3026b[] c3026bArr4 = new C3026b[2];
                        c3026bArr4[i & 1] = new C3026b(j);
                        this.cells = c3026bArr4;
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
                if (casBase(j3, mo16393fn(j3, j))) {
                    return;
                }
            }
        }
    }
}
