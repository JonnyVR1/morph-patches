package com.google.common.cache;

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
    volatile transient C2711b[] cells;
    static final ThreadLocal<int[]> threadHashCode = new ThreadLocal<>();
    static final Random rng = new Random();
    static final int NCPU = Runtime.getRuntime().availableProcessors();

    /* JADX INFO: renamed from: com.google.common.cache.Striped64$a */
    public class C2710a implements PrivilegedExceptionAction<Unsafe> {
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

    /* JADX INFO: renamed from: com.google.common.cache.Striped64$b */
    public static final class C2711b {

        /* JADX INFO: renamed from: b */
        public static final Unsafe f10758b;

        /* JADX INFO: renamed from: c */
        public static final long f10759c;

        /* JADX INFO: renamed from: a */
        public volatile long f10760a;

        static {
            try {
                Unsafe unsafe = Striped64.getUnsafe();
                f10758b = unsafe;
                f10759c = unsafe.objectFieldOffset(C2711b.class.getDeclaredField("a"));
            } catch (Exception e) {
                throw new Error(e);
            }
        }

        public C2711b(long j) {
            this.f10760a = j;
        }

        /* JADX INFO: renamed from: a */
        public final boolean m15562a(long j, long j2) {
            return f10758b.compareAndSwapLong(this, f10759c, j, j2);
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
            return (Unsafe) AccessController.doPrivileged(new C2710a());
        }
    }

    public final boolean casBase(long j, long j2) {
        return UNSAFE.compareAndSwapLong(this, baseOffset, j, j2);
    }

    public final boolean casBusy() {
        return UNSAFE.compareAndSwapInt(this, busyOffset, 0, 1);
    }

    /* JADX INFO: renamed from: fn */
    public abstract long mo15560fn(long j, long j2);

    public final void internalReset(long j) {
        C2711b[] c2711bArr = this.cells;
        this.base = j;
        if (c2711bArr != null) {
            for (C2711b c2711b : c2711bArr) {
                if (c2711b != null) {
                    c2711b.f10760a = j;
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
            C2711b[] c2711bArr = this.cells;
            if (c2711bArr != null && (length = c2711bArr.length) > 0) {
                C2711b c2711b = c2711bArr[(length - 1) & i];
                if (c2711b == null) {
                    if (this.busy == 0) {
                        C2711b c2711b2 = new C2711b(j);
                        if (this.busy == 0 && casBusy()) {
                            try {
                                C2711b[] c2711bArr2 = this.cells;
                                if (c2711bArr2 == null || (length2 = c2711bArr2.length) <= 0) {
                                    z3 = false;
                                } else {
                                    int i2 = (length2 - 1) & i;
                                    if (c2711bArr2[i2] == null) {
                                        c2711bArr2[i2] = c2711b2;
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
                        long j2 = c2711b.f10760a;
                        if (c2711b.m15562a(j2, mo15560fn(j2, j))) {
                            return;
                        }
                        if (length >= NCPU || this.cells != c2711bArr) {
                            z4 = false;
                        } else if (!z4) {
                            z4 = true;
                        } else if (this.busy == 0 && casBusy()) {
                            try {
                                if (this.cells == c2711bArr) {
                                    C2711b[] c2711bArr3 = new C2711b[length << 1];
                                    for (int i5 = 0; i5 < length; i5++) {
                                        c2711bArr3[i5] = c2711bArr[i5];
                                    }
                                    this.cells = c2711bArr3;
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
            } else if (this.busy == 0 && this.cells == c2711bArr && casBusy()) {
                try {
                    if (this.cells == c2711bArr) {
                        C2711b[] c2711bArr4 = new C2711b[2];
                        c2711bArr4[i & 1] = new C2711b(j);
                        this.cells = c2711bArr4;
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
                if (casBase(j3, mo15560fn(j3, j))) {
                    return;
                }
            }
        }
    }
}
