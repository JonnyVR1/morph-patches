package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import p149l.aag0;
import p149l.dlw0;
import p149l.elw0;
import p149l.pkq0;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.l3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2188l3 extends AbstractC2124d3 {

    /* JADX INFO: renamed from: a */
    public static final Unsafe f9973a;

    /* JADX INFO: renamed from: b */
    public static final long f9974b;

    /* JADX INFO: renamed from: c */
    public static final long f9975c;

    /* JADX INFO: renamed from: d */
    public static final long f9976d;

    /* JADX INFO: renamed from: e */
    public static final long f9977e;

    /* JADX INFO: renamed from: f */
    public static final long f9978f;

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
                f9975c = unsafe.objectFieldOffset(AbstractC2204n3.class.getDeclaredField("c"));
                f9974b = unsafe.objectFieldOffset(AbstractC2204n3.class.getDeclaredField("b"));
                f9976d = unsafe.objectFieldOffset(AbstractC2204n3.class.getDeclaredField("a"));
                f9977e = unsafe.objectFieldOffset(C2196m3.class.getDeclaredField("a"));
                f9978f = unsafe.objectFieldOffset(C2196m3.class.getDeclaredField("b"));
                f9973a = unsafe;
            } catch (NoSuchFieldException e) {
                aag0.m95543a(e);
            }
        } catch (PrivilegedActionException e2) {
            pkq0.m170054a("Could not initialize intrinsics", e2.getCause());
        }
    }

    public /* synthetic */ C2188l3(elw0 elw0Var) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2124d3
    /* JADX INFO: renamed from: a */
    public final C2140f3 mo12641a(AbstractC2204n3 abstractC2204n3, C2140f3 c2140f3) {
        C2140f3 c2140f4;
        do {
            c2140f4 = abstractC2204n3.f10003b;
            if (c2140f3 == c2140f4) {
                break;
            }
        } while (!mo12645e(abstractC2204n3, c2140f4, c2140f3));
        return c2140f4;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2124d3
    /* JADX INFO: renamed from: b */
    public final C2196m3 mo12642b(AbstractC2204n3 abstractC2204n3, C2196m3 c2196m3) {
        C2196m3 c2196m4;
        do {
            c2196m4 = abstractC2204n3.f10004c;
            if (c2196m3 == c2196m4) {
                break;
            }
        } while (!mo12647g(abstractC2204n3, c2196m4, c2196m3));
        return c2196m4;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2124d3
    /* JADX INFO: renamed from: c */
    public final void mo12643c(C2196m3 c2196m3, C2196m3 c2196m4) {
        f9973a.putObject(c2196m3, f9978f, c2196m4);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2124d3
    /* JADX INFO: renamed from: d */
    public final void mo12644d(C2196m3 c2196m3, Thread thread) {
        f9973a.putObject(c2196m3, f9977e, thread);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2124d3
    /* JADX INFO: renamed from: e */
    public final boolean mo12645e(AbstractC2204n3 abstractC2204n3, C2140f3 c2140f3, C2140f3 c2140f4) {
        return dlw0.m112426a(f9973a, abstractC2204n3, f9974b, c2140f3, c2140f4);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2124d3
    /* JADX INFO: renamed from: f */
    public final boolean mo12646f(AbstractC2204n3 abstractC2204n3, Object obj, Object obj2) {
        return dlw0.m112426a(f9973a, abstractC2204n3, f9976d, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2124d3
    /* JADX INFO: renamed from: g */
    public final boolean mo12647g(AbstractC2204n3 abstractC2204n3, C2196m3 c2196m3, C2196m3 c2196m4) {
        return dlw0.m112426a(f9973a, abstractC2204n3, f9975c, c2196m3, c2196m4);
    }
}
