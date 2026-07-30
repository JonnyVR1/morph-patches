package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p149l.j6f;
import p149l.opf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.l */
/* JADX INFO: loaded from: classes.dex */
public class C0340l {

    /* JADX INFO: renamed from: b */
    public static boolean f1711b = true;

    /* JADX INFO: renamed from: d */
    public static volatile C0340l f1713d;

    /* JADX INFO: renamed from: a */
    public final Map<a, GeneratedMessageLite.C0296e<?, ?>> f1715a;

    /* JADX INFO: renamed from: c */
    public static final Class<?> f1712c = m2227c();

    /* JADX INFO: renamed from: e */
    public static final C0340l f1714e = new C0340l(true);

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
            return (System.identityHashCode(this.f1716a) * j6f.COLOR_SPACE_UNCALIBRATED) + this.f1717b;
        }
    }

    public C0340l() {
        this.f1715a = new HashMap();
    }

    /* JADX INFO: renamed from: b */
    public static C0340l m2226b() {
        C0340l c0340lM165357a;
        C0340l c0340l = f1713d;
        if (c0340l != null) {
            return c0340l;
        }
        synchronized (C0340l.class) {
            try {
                c0340lM165357a = f1713d;
                if (c0340lM165357a == null) {
                    c0340lM165357a = f1711b ? opf.m165357a() : f1714e;
                    f1713d = c0340lM165357a;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0340lM165357a;
    }

    /* JADX INFO: renamed from: c */
    public static Class<?> m2227c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public <ContainingType extends InterfaceC0321b0> GeneratedMessageLite.C0296e<ContainingType, ?> m2228a(ContainingType containingtype, int i) {
        return (GeneratedMessageLite.C0296e) this.f1715a.get(new a(containingtype, i));
    }

    public C0340l(boolean z) {
        this.f1715a = Collections.EMPTY_MAP;
    }
}
