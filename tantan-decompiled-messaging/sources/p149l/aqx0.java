package p149l;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class aqx0 implements Iterator {

    /* JADX INFO: renamed from: a */
    public int f71215a = -1;

    /* JADX INFO: renamed from: b */
    public boolean f71216b;

    /* JADX INFO: renamed from: c */
    public Iterator f71217c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ oqx0 f71218d;

    public /* synthetic */ aqx0(oqx0 oqx0Var, kqx0 kqx0Var) {
        this.f71218d = oqx0Var;
    }

    /* JADX INFO: renamed from: a */
    public final Iterator m98365a() {
        if (this.f71217c == null) {
            this.f71217c = this.f71218d.f145204c.entrySet().iterator();
        }
        return this.f71217c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f71215a + 1;
        oqx0 oqx0Var = this.f71218d;
        if (i >= oqx0Var.f145203b) {
            return !oqx0Var.f145204c.isEmpty() && m98365a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.f71216b = true;
        int i = this.f71215a + 1;
        this.f71215a = i;
        oqx0 oqx0Var = this.f71218d;
        return i < oqx0Var.f145203b ? (wpx0) oqx0Var.f145202a[i] : (Map.Entry) m98365a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f71216b) {
            qkq0.m175383a("remove() was called before next()");
            return;
        }
        this.f71216b = false;
        this.f71218d.m165508o();
        int i = this.f71215a;
        oqx0 oqx0Var = this.f71218d;
        if (i >= oqx0Var.f145203b) {
            m98365a().remove();
        } else {
            this.f71215a = i - 1;
            oqx0Var.m165506m(i);
        }
    }
}
