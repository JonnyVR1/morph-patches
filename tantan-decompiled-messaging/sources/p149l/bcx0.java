package p149l;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class bcx0 implements Iterator {

    /* JADX INFO: renamed from: a */
    public int f74977a = -1;

    /* JADX INFO: renamed from: b */
    public boolean f74978b;

    /* JADX INFO: renamed from: c */
    public Iterator f74979c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ fcx0 f74980d;

    /* JADX INFO: renamed from: a */
    public final Iterator m101139a() {
        if (this.f74979c == null) {
            this.f74979c = this.f74980d.f96874c.entrySet().iterator();
        }
        return this.f74979c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f74977a + 1 >= this.f74980d.f96873b.size()) {
            return !this.f74980d.f96874c.isEmpty() && m101139a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.f74978b = true;
        int i = this.f74977a + 1;
        this.f74977a = i;
        return i < this.f74980d.f96873b.size() ? (Map.Entry) this.f74980d.f96873b.get(this.f74977a) : (Map.Entry) m101139a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f74978b) {
            qkq0.m175383a("remove() was called before next()");
            return;
        }
        this.f74978b = false;
        this.f74980d.m120502n();
        if (this.f74977a >= this.f74980d.f96873b.size()) {
            m101139a().remove();
            return;
        }
        fcx0 fcx0Var = this.f74980d;
        int i = this.f74977a;
        this.f74977a = i - 1;
        fcx0Var.m120500l(i);
    }
}
