package p153l;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class hlx0 implements Iterator {

    /* JADX INFO: renamed from: a */
    public int f110555a = -1;

    /* JADX INFO: renamed from: b */
    public boolean f110556b;

    /* JADX INFO: renamed from: c */
    public Iterator f110557c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ llx0 f110558d;

    public /* synthetic */ hlx0(llx0 llx0Var, glx0 glx0Var) {
        this.f110558d = llx0Var;
    }

    /* JADX INFO: renamed from: a */
    public final Iterator m135799a() {
        if (this.f110557c == null) {
            this.f110557c = this.f110558d.f132613c.entrySet().iterator();
        }
        return this.f110557c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f110555a + 1 >= this.f110558d.f132612b.size()) {
            return !this.f110558d.f132613c.isEmpty() && m135799a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.f110556b = true;
        int i = this.f110555a + 1;
        this.f110555a = i;
        return i < this.f110558d.f132612b.size() ? (Map.Entry) this.f110558d.f132612b.get(this.f110555a) : (Map.Entry) m135799a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f110556b) {
            wtq0.m207906a("remove() was called before next()");
            return;
        }
        this.f110556b = false;
        this.f110558d.m154812n();
        if (this.f110555a >= this.f110558d.f132612b.size()) {
            m135799a().remove();
            return;
        }
        llx0 llx0Var = this.f110558d;
        int i = this.f110555a;
        this.f110555a = i - 1;
        llx0Var.m154810l(i);
    }
}
