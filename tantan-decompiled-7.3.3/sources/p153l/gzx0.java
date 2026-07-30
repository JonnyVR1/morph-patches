package p153l;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class gzx0 implements Iterator {

    /* JADX INFO: renamed from: a */
    public int f107247a = -1;

    /* JADX INFO: renamed from: b */
    public boolean f107248b;

    /* JADX INFO: renamed from: c */
    public Iterator f107249c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ uzx0 f107250d;

    public /* synthetic */ gzx0(uzx0 uzx0Var, qzx0 qzx0Var) {
        this.f107250d = uzx0Var;
    }

    /* JADX INFO: renamed from: a */
    public final Iterator m133136a() {
        if (this.f107249c == null) {
            this.f107249c = this.f107250d.f181821c.entrySet().iterator();
        }
        return this.f107249c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f107247a + 1;
        uzx0 uzx0Var = this.f107250d;
        if (i >= uzx0Var.f181820b) {
            return !uzx0Var.f181821c.isEmpty() && m133136a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.f107248b = true;
        int i = this.f107247a + 1;
        this.f107247a = i;
        uzx0 uzx0Var = this.f107250d;
        return i < uzx0Var.f181820b ? (czx0) uzx0Var.f181819a[i] : (Map.Entry) m133136a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f107248b) {
            wtq0.m207906a("remove() was called before next()");
            return;
        }
        this.f107248b = false;
        this.f107250d.m198877o();
        int i = this.f107247a;
        uzx0 uzx0Var = this.f107250d;
        if (i >= uzx0Var.f181820b) {
            m133136a().remove();
        } else {
            this.f107247a = i - 1;
            uzx0Var.m198875m(i);
        }
    }
}
