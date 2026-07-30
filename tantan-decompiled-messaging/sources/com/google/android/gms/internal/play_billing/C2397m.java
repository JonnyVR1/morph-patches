package com.google.android.gms.internal.play_billing;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import p149l.aag0;
import p149l.gtu0;
import p149l.luu0;
import p149l.pkq0;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C2397m extends AbstractC2381e {

    /* JADX INFO: renamed from: a */
    public static final Unsafe f10353a;

    /* JADX INFO: renamed from: b */
    public static final long f10354b;

    /* JADX INFO: renamed from: c */
    public static final long f10355c;

    /* JADX INFO: renamed from: d */
    public static final long f10356d;

    /* JADX INFO: renamed from: e */
    public static final long f10357e;

    /* JADX INFO: renamed from: f */
    public static final long f10358f;

    /* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.m$a */
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
                f10355c = unsafe.objectFieldOffset(AbstractC2401o.class.getDeclaredField("c"));
                f10354b = unsafe.objectFieldOffset(AbstractC2401o.class.getDeclaredField("b"));
                f10356d = unsafe.objectFieldOffset(AbstractC2401o.class.getDeclaredField("a"));
                f10357e = unsafe.objectFieldOffset(C2399n.class.getDeclaredField("a"));
                f10358f = unsafe.objectFieldOffset(C2399n.class.getDeclaredField("b"));
                f10353a = unsafe;
            } catch (NoSuchFieldException e) {
                aag0.m95543a(e);
            }
        } catch (PrivilegedActionException e2) {
            pkq0.m170054a("Could not initialize intrinsics", e2.getCause());
        }
    }

    public /* synthetic */ C2397m(luu0 luu0Var) {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2381e
    /* JADX INFO: renamed from: a */
    public final C2385g mo14778a(AbstractC2401o abstractC2401o, C2385g c2385g) {
        C2385g c2385g2;
        do {
            c2385g2 = abstractC2401o.f10367b;
            if (c2385g == c2385g2) {
                break;
            }
        } while (!mo14782e(abstractC2401o, c2385g2, c2385g));
        return c2385g2;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2381e
    /* JADX INFO: renamed from: b */
    public final C2399n mo14779b(AbstractC2401o abstractC2401o, C2399n c2399n) {
        C2399n c2399n2;
        do {
            c2399n2 = abstractC2401o.f10368c;
            if (c2399n == c2399n2) {
                break;
            }
        } while (!mo14784g(abstractC2401o, c2399n2, c2399n));
        return c2399n2;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2381e
    /* JADX INFO: renamed from: c */
    public final void mo14780c(C2399n c2399n, C2399n c2399n2) {
        f10353a.putObject(c2399n, f10358f, c2399n2);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2381e
    /* JADX INFO: renamed from: d */
    public final void mo14781d(C2399n c2399n, Thread thread) {
        f10353a.putObject(c2399n, f10357e, thread);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2381e
    /* JADX INFO: renamed from: e */
    public final boolean mo14782e(AbstractC2401o abstractC2401o, C2385g c2385g, C2385g c2385g2) {
        return gtu0.m128004a(f10353a, abstractC2401o, f10354b, c2385g, c2385g2);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2381e
    /* JADX INFO: renamed from: f */
    public final boolean mo14783f(AbstractC2401o abstractC2401o, Object obj, Object obj2) {
        return gtu0.m128004a(f10353a, abstractC2401o, f10356d, obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2381e
    /* JADX INFO: renamed from: g */
    public final boolean mo14784g(AbstractC2401o abstractC2401o, C2399n c2399n, C2399n c2399n2) {
        return gtu0.m128004a(f10353a, abstractC2401o, f10355c, c2399n, c2399n2);
    }
}
