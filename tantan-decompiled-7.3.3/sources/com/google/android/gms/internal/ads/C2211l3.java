package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import p153l.iig0;
import p153l.juw0;
import p153l.kuw0;
import p153l.vtq0;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.l3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2211l3 extends AbstractC2147d3 {

    /* JADX INFO: renamed from: a */
    public static final Unsafe f10010a;

    /* JADX INFO: renamed from: b */
    public static final long f10011b;

    /* JADX INFO: renamed from: c */
    public static final long f10012c;

    /* JADX INFO: renamed from: d */
    public static final long f10013d;

    /* JADX INFO: renamed from: e */
    public static final long f10014e;

    /* JADX INFO: renamed from: f */
    public static final long f10015f;

    /* JADX INFO: renamed from: com.google.android.gms.internal.ads.l3$a */
    public class a implements PrivilegedExceptionAction<Unsafe> {
        @Override // java.security.PrivilegedExceptionAction
        public final /* bridge */ /* synthetic */ Unsafe run() throws Exception {
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
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new a());
            }
            try {
                f10012c = unsafe.objectFieldOffset(AbstractC2227n3.class.getDeclaredField("c"));
                f10011b = unsafe.objectFieldOffset(AbstractC2227n3.class.getDeclaredField("b"));
                f10013d = unsafe.objectFieldOffset(AbstractC2227n3.class.getDeclaredField("a"));
                f10014e = unsafe.objectFieldOffset(C2219m3.class.getDeclaredField("a"));
                f10015f = unsafe.objectFieldOffset(C2219m3.class.getDeclaredField("b"));
                f10010a = unsafe;
            } catch (NoSuchFieldException e) {
                iig0.m140070a(e);
            }
        } catch (PrivilegedActionException e2) {
            vtq0.m202761a("Could not initialize intrinsics", e2.getCause());
        }
    }

    public /* synthetic */ C2211l3(kuw0 kuw0Var) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2147d3
    /* JADX INFO: renamed from: a */
    public final C2163f3 mo12695a(AbstractC2227n3 abstractC2227n3, C2163f3 c2163f3) {
        C2163f3 c2163f4;
        do {
            c2163f4 = abstractC2227n3.f10040b;
            if (c2163f3 == c2163f4) {
                break;
            }
        } while (!mo12699e(abstractC2227n3, c2163f4, c2163f3));
        return c2163f4;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2147d3
    /* JADX INFO: renamed from: b */
    public final C2219m3 mo12696b(AbstractC2227n3 abstractC2227n3, C2219m3 c2219m3) {
        C2219m3 c2219m4;
        do {
            c2219m4 = abstractC2227n3.f10041c;
            if (c2219m3 == c2219m4) {
                break;
            }
        } while (!mo12701g(abstractC2227n3, c2219m4, c2219m3));
        return c2219m4;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2147d3
    /* JADX INFO: renamed from: c */
    public final void mo12697c(C2219m3 c2219m3, C2219m3 c2219m4) {
        f10010a.putObject(c2219m3, f10015f, c2219m4);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2147d3
    /* JADX INFO: renamed from: d */
    public final void mo12698d(C2219m3 c2219m3, Thread thread) {
        f10010a.putObject(c2219m3, f10014e, thread);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2147d3
    /* JADX INFO: renamed from: e */
    public final boolean mo12699e(AbstractC2227n3 abstractC2227n3, C2163f3 c2163f3, C2163f3 c2163f4) {
        return juw0.m146999a(f10010a, abstractC2227n3, f10011b, c2163f3, c2163f4);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2147d3
    /* JADX INFO: renamed from: f */
    public final boolean mo12700f(AbstractC2227n3 abstractC2227n3, Object obj, Object obj2) {
        return juw0.m146999a(f10010a, abstractC2227n3, f10013d, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2147d3
    /* JADX INFO: renamed from: g */
    public final boolean mo12701g(AbstractC2227n3 abstractC2227n3, C2219m3 c2219m3, C2219m3 c2219m4) {
        return juw0.m146999a(f10010a, abstractC2227n3, f10012c, c2219m3, c2219m4);
    }
}
