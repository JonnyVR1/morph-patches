package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p149l.g0y0;
import p149l.j6f;
import p149l.msx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.s0 */
/* JADX INFO: loaded from: classes6.dex */
public class C2345s0 {

    /* JADX INFO: renamed from: b */
    public static volatile C2345s0 f10256b;

    /* JADX INFO: renamed from: c */
    public static final C2345s0 f10257c = new C2345s0(true);

    /* JADX INFO: renamed from: a */
    public final Map<a, AbstractC2349u0.f<?, ?>> f10258a;

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.s0$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final Object f10259a;

        /* JADX INFO: renamed from: b */
        public final int f10260b;

        public a(Object obj, int i) {
            this.f10259a = obj;
            this.f10260b = i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f10259a == aVar.f10259a && this.f10260b == aVar.f10260b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f10259a) * j6f.COLOR_SPACE_UNCALIBRATED) + this.f10260b;
        }
    }

    public C2345s0() {
        this.f10258a = new HashMap();
    }

    /* JADX INFO: renamed from: a */
    public static C2345s0 m14280a() {
        C2345s0 c2345s0 = f10256b;
        if (c2345s0 != null) {
            return c2345s0;
        }
        synchronized (C2345s0.class) {
            try {
                C2345s0 c2345s1 = f10256b;
                if (c2345s1 != null) {
                    return c2345s1;
                }
                C2345s0 c2345s0M156172b = msx0.m156172b(C2345s0.class);
                f10256b = c2345s0M156172b;
                return c2345s0M156172b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final <ContainingType extends g0y0> AbstractC2349u0.f<ContainingType, ?> m14281b(ContainingType containingtype, int i) {
        return (AbstractC2349u0.f) this.f10258a.get(new a(containingtype, i));
    }

    public C2345s0(boolean z) {
        this.f10258a = Collections.EMPTY_MAP;
    }
}
