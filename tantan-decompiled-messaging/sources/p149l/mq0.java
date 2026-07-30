package p149l;

import android.net.Uri;
import androidx.annotation.VisibleForTesting;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public class mq0 {

    /* JADX INFO: renamed from: a */
    public final cx3 f135137a;

    /* JADX INFO: renamed from: b */
    public final tqb<cx3, da5> f135138b;

    /* JADX INFO: renamed from: d */
    public final LinkedHashSet<cx3> f135140d = new LinkedHashSet<>();

    /* JADX INFO: renamed from: c */
    public final tqb.InterfaceC20245b<cx3> f135139c = new C18532a();

    /* JADX INFO: renamed from: l.mq0$a */
    public class C18532a implements tqb.InterfaceC20245b<cx3> {
        public C18532a() {
        }

        @Override // p149l.tqb.InterfaceC20245b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo155851a(cx3 cx3Var, boolean z) {
            mq0.this.m155849f(cx3Var, z);
        }
    }

    /* JADX INFO: renamed from: l.mq0$b */
    @VisibleForTesting
    public static class C18533b implements cx3 {

        /* JADX INFO: renamed from: a */
        public final cx3 f135142a;

        /* JADX INFO: renamed from: b */
        public final int f135143b;

        public C18533b(cx3 cx3Var, int i) {
            this.f135142a = cx3Var;
            this.f135143b = i;
        }

        @Override // p149l.cx3
        /* JADX INFO: renamed from: a */
        public String mo103429a() {
            return null;
        }

        @Override // p149l.cx3
        /* JADX INFO: renamed from: b */
        public boolean mo103430b() {
            return false;
        }

        @Override // p149l.cx3
        /* JADX INFO: renamed from: c */
        public boolean mo103431c(Uri uri) {
            return this.f135142a.mo103431c(uri);
        }

        @Override // p149l.cx3
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof C18533b) {
                C18533b c18533b = (C18533b) obj;
                if (this.f135143b == c18533b.f135143b && this.f135142a.equals(c18533b.f135142a)) {
                    return true;
                }
            }
            return false;
        }

        @Override // p149l.cx3
        public int hashCode() {
            return (this.f135142a.hashCode() * 1013) + this.f135143b;
        }

        @Override // p149l.cx3
        public String toString() {
            return t050.m186815b(this).m186817b("imageCacheKey", this.f135142a).m186816a("frameIndex", this.f135143b).toString();
        }
    }

    public mq0(cx3 cx3Var, tqb<cx3, da5> tqbVar) {
        this.f135137a = cx3Var;
        this.f135138b = tqbVar;
    }

    /* JADX INFO: renamed from: a */
    public fa5<da5> m155844a(int i, fa5<da5> fa5Var) {
        return this.f135138b.mo101596f(m155848e(i), fa5Var, this.f135139c);
    }

    /* JADX INFO: renamed from: b */
    public boolean m155845b(int i) {
        return this.f135138b.contains(m155848e(i));
    }

    /* JADX INFO: renamed from: c */
    public fa5<da5> m155846c(int i) {
        return this.f135138b.get(m155848e(i));
    }

    /* JADX INFO: renamed from: d */
    public fa5<da5> m155847d() {
        fa5<da5> fa5VarMo101595e;
        do {
            cx3 cx3VarM155850g = m155850g();
            if (cx3VarM155850g == null) {
                return null;
            }
            fa5VarMo101595e = this.f135138b.mo101595e(cx3VarM155850g);
        } while (fa5VarMo101595e == null);
        return fa5VarMo101595e;
    }

    /* JADX INFO: renamed from: e */
    public final C18533b m155848e(int i) {
        return new C18533b(this.f135137a, i);
    }

    /* JADX INFO: renamed from: f */
    public synchronized void m155849f(cx3 cx3Var, boolean z) {
        LinkedHashSet<cx3> linkedHashSet = this.f135140d;
        try {
            if (z) {
                linkedHashSet.add(cx3Var);
            } else {
                linkedHashSet.remove(cx3Var);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: g */
    public final synchronized cx3 m155850g() {
        cx3 next;
        Iterator<cx3> it = this.f135140d.iterator();
        if (it.hasNext()) {
            next = it.next();
            it.remove();
        } else {
            next = null;
        }
        return next;
    }
}
