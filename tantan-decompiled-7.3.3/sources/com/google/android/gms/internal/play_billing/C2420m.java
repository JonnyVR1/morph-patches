package com.google.android.gms.internal.play_billing;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import p153l.iig0;
import p153l.m2v0;
import p153l.r3v0;
import p153l.vtq0;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C2420m extends AbstractC2404e {

    /* JADX INFO: renamed from: a */
    public static final Unsafe f10390a;

    /* JADX INFO: renamed from: b */
    public static final long f10391b;

    /* JADX INFO: renamed from: c */
    public static final long f10392c;

    /* JADX INFO: renamed from: d */
    public static final long f10393d;

    /* JADX INFO: renamed from: e */
    public static final long f10394e;

    /* JADX INFO: renamed from: f */
    public static final long f10395f;

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
                f10392c = unsafe.objectFieldOffset(AbstractC2424o.class.getDeclaredField("c"));
                f10391b = unsafe.objectFieldOffset(AbstractC2424o.class.getDeclaredField("b"));
                f10393d = unsafe.objectFieldOffset(AbstractC2424o.class.getDeclaredField("a"));
                f10394e = unsafe.objectFieldOffset(C2422n.class.getDeclaredField("a"));
                f10395f = unsafe.objectFieldOffset(C2422n.class.getDeclaredField("b"));
                f10390a = unsafe;
            } catch (NoSuchFieldException e) {
                iig0.m140070a(e);
            }
        } catch (PrivilegedActionException e2) {
            vtq0.m202761a("Could not initialize intrinsics", e2.getCause());
        }
    }

    public /* synthetic */ C2420m(r3v0 r3v0Var) {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2404e
    /* JADX INFO: renamed from: a */
    public final C2408g mo14832a(AbstractC2424o abstractC2424o, C2408g c2408g) {
        C2408g c2408g2;
        do {
            c2408g2 = abstractC2424o.f10404b;
            if (c2408g == c2408g2) {
                break;
            }
        } while (!mo14836e(abstractC2424o, c2408g2, c2408g));
        return c2408g2;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2404e
    /* JADX INFO: renamed from: b */
    public final C2422n mo14833b(AbstractC2424o abstractC2424o, C2422n c2422n) {
        C2422n c2422n2;
        do {
            c2422n2 = abstractC2424o.f10405c;
            if (c2422n == c2422n2) {
                break;
            }
        } while (!mo14838g(abstractC2424o, c2422n2, c2422n));
        return c2422n2;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2404e
    /* JADX INFO: renamed from: c */
    public final void mo14834c(C2422n c2422n, C2422n c2422n2) {
        f10390a.putObject(c2422n, f10395f, c2422n2);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2404e
    /* JADX INFO: renamed from: d */
    public final void mo14835d(C2422n c2422n, Thread thread) {
        f10390a.putObject(c2422n, f10394e, thread);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2404e
    /* JADX INFO: renamed from: e */
    public final boolean mo14836e(AbstractC2424o abstractC2424o, C2408g c2408g, C2408g c2408g2) {
        return m2v0.m156908a(f10390a, abstractC2424o, f10391b, c2408g, c2408g2);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2404e
    /* JADX INFO: renamed from: f */
    public final boolean mo14837f(AbstractC2424o abstractC2424o, Object obj, Object obj2) {
        return m2v0.m156908a(f10390a, abstractC2424o, f10393d, obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2404e
    /* JADX INFO: renamed from: g */
    public final boolean mo14838g(AbstractC2424o abstractC2424o, C2422n c2422n, C2422n c2422n2) {
        return m2v0.m156908a(f10390a, abstractC2424o, f10392c, c2422n, c2422n2);
    }
}
