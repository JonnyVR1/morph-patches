package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p153l.m9y0;
import p153l.p7f;
import p153l.s1y0;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.s0 */
/* JADX INFO: loaded from: classes6.dex */
public class C2368s0 {

    /* JADX INFO: renamed from: b */
    public static volatile C2368s0 f10293b;

    /* JADX INFO: renamed from: c */
    public static final C2368s0 f10294c = new C2368s0(true);

    /* JADX INFO: renamed from: a */
    public final Map<a, AbstractC2372u0.f<?, ?>> f10295a;

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.s0$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final Object f10296a;

        /* JADX INFO: renamed from: b */
        public final int f10297b;

        public a(Object obj, int i) {
            this.f10296a = obj;
            this.f10297b = i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f10296a == aVar.f10296a && this.f10297b == aVar.f10297b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f10296a) * p7f.COLOR_SPACE_UNCALIBRATED) + this.f10297b;
        }
    }

    public C2368s0() {
        this.f10295a = new HashMap();
    }

    /* JADX INFO: renamed from: a */
    public static C2368s0 m14334a() {
        C2368s0 c2368s0 = f10293b;
        if (c2368s0 != null) {
            return c2368s0;
        }
        synchronized (C2368s0.class) {
            try {
                C2368s0 c2368s1 = f10293b;
                if (c2368s1 != null) {
                    return c2368s1;
                }
                C2368s0 c2368s0M184066b = s1y0.m184066b(C2368s0.class);
                f10293b = c2368s0M184066b;
                return c2368s0M184066b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final <ContainingType extends m9y0> AbstractC2372u0.f<ContainingType, ?> m14335b(ContainingType containingtype, int i) {
        return (AbstractC2372u0.f) this.f10295a.get(new a(containingtype, i));
    }

    public C2368s0(boolean z) {
        this.f10295a = Collections.EMPTY_MAP;
    }
}
