package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p153l.p7f;
import p153l.vqf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.l */
/* JADX INFO: loaded from: classes.dex */
public class C0341l {

    /* JADX INFO: renamed from: b */
    public static boolean f1711b = true;

    /* JADX INFO: renamed from: d */
    public static volatile C0341l f1713d;

    /* JADX INFO: renamed from: a */
    public final Map<a, GeneratedMessageLite.C0297e<?, ?>> f1715a;

    /* JADX INFO: renamed from: c */
    public static final Class<?> f1712c = m2228c();

    /* JADX INFO: renamed from: e */
    public static final C0341l f1714e = new C0341l(true);

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.l$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final Object f1716a;

        /* JADX INFO: renamed from: b */
        public final int f1717b;

        public a(Object obj, int i) {
            this.f1716a = obj;
            this.f1717b = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f1716a == aVar.f1716a && this.f1717b == aVar.f1717b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f1716a) * p7f.COLOR_SPACE_UNCALIBRATED) + this.f1717b;
        }
    }

    public C0341l() {
        this.f1715a = new HashMap();
    }

    /* JADX INFO: renamed from: b */
    public static C0341l m2227b() {
        C0341l c0341lM202378a;
        C0341l c0341l = f1713d;
        if (c0341l != null) {
            return c0341l;
        }
        synchronized (C0341l.class) {
            try {
                c0341lM202378a = f1713d;
                if (c0341lM202378a == null) {
                    c0341lM202378a = f1711b ? vqf.m202378a() : f1714e;
                    f1713d = c0341lM202378a;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0341lM202378a;
    }

    /* JADX INFO: renamed from: c */
    public static Class<?> m2228c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public <ContainingType extends InterfaceC0322b0> GeneratedMessageLite.C0297e<ContainingType, ?> m2229a(ContainingType containingtype, int i) {
        return (GeneratedMessageLite.C0297e) this.f1715a.get(new a(containingtype, i));
    }

    public C0341l(boolean z) {
        this.f1715a = Collections.EMPTY_MAP;
    }
}
