package p153l;

import android.net.Uri;
import androidx.annotation.VisibleForTesting;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public class iq0 {

    /* JADX INFO: renamed from: a */
    public final by3 f116317a;

    /* JADX INFO: renamed from: b */
    public final hsb<by3, db5> f116318b;

    /* JADX INFO: renamed from: d */
    public final LinkedHashSet<by3> f116320d = new LinkedHashSet<>();

    /* JADX INFO: renamed from: c */
    public final hsb.InterfaceC17569b<by3> f116319c = new C17770a();

    /* JADX INFO: renamed from: l.iq0$a */
    public class C17770a implements hsb.InterfaceC17569b<by3> {
        public C17770a() {
        }

        @Override // p153l.hsb.InterfaceC17569b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo136967a(by3 by3Var, boolean z) {
            iq0.this.m141551f(by3Var, z);
        }
    }

    /* JADX INFO: renamed from: l.iq0$b */
    @VisibleForTesting
    public static class C17771b implements by3 {

        /* JADX INFO: renamed from: a */
        public final by3 f116322a;

        /* JADX INFO: renamed from: b */
        public final int f116323b;

        public C17771b(by3 by3Var, int i) {
            this.f116322a = by3Var;
            this.f116323b = i;
        }

        @Override // p153l.by3
        /* JADX INFO: renamed from: a */
        public String mo106961a() {
            return null;
        }

        @Override // p153l.by3
        /* JADX INFO: renamed from: b */
        public boolean mo106962b() {
            return false;
        }

        @Override // p153l.by3
        /* JADX INFO: renamed from: c */
        public boolean mo106963c(Uri uri) {
            return this.f116322a.mo106963c(uri);
        }

        @Override // p153l.by3
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof C17771b) {
                C17771b c17771b = (C17771b) obj;
                if (this.f116323b == c17771b.f116323b && this.f116322a.equals(c17771b.f116322a)) {
                    return true;
                }
            }
            return false;
        }

        @Override // p153l.by3
        public int hashCode() {
            return (this.f116322a.hashCode() * 1013) + this.f116323b;
        }

        @Override // p153l.by3
        public String toString() {
            return i950.m139075b(this).m139077b("imageCacheKey", this.f116322a).m139076a("frameIndex", this.f116323b).toString();
        }
    }

    public iq0(by3 by3Var, hsb<by3, db5> hsbVar) {
        this.f116317a = by3Var;
        this.f116318b = hsbVar;
    }

    /* JADX INFO: renamed from: a */
    public fb5<db5> m141546a(int i, fb5<db5> fb5Var) {
        return this.f116318b.mo136964f(m141550e(i), fb5Var, this.f116319c);
    }

    /* JADX INFO: renamed from: b */
    public boolean m141547b(int i) {
        return this.f116318b.contains(m141550e(i));
    }

    /* JADX INFO: renamed from: c */
    public fb5<db5> m141548c(int i) {
        return this.f116318b.get(m141550e(i));
    }

    /* JADX INFO: renamed from: d */
    public fb5<db5> m141549d() {
        fb5<db5> fb5VarMo136963e;
        do {
            by3 by3VarM141552g = m141552g();
            if (by3VarM141552g == null) {
                return null;
            }
            fb5VarMo136963e = this.f116318b.mo136963e(by3VarM141552g);
        } while (fb5VarMo136963e == null);
        return fb5VarMo136963e;
    }

    /* JADX INFO: renamed from: e */
    public final C17771b m141550e(int i) {
        return new C17771b(this.f116317a, i);
    }

    /* JADX INFO: renamed from: f */
    public synchronized void m141551f(by3 by3Var, boolean z) {
        LinkedHashSet<by3> linkedHashSet = this.f116320d;
        try {
            if (z) {
                linkedHashSet.add(by3Var);
            } else {
                linkedHashSet.remove(by3Var);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: g */
    public final synchronized by3 m141552g() {
        by3 next;
        Iterator<by3> it = this.f116320d.iterator();
        if (it.hasNext()) {
            next = it.next();
            it.remove();
        } else {
            next = null;
        }
        return next;
    }
}
