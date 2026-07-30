package p149l;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class e5y0 implements Iterator {

    /* JADX INFO: renamed from: a */
    public int f89477a;

    /* JADX INFO: renamed from: b */
    public boolean f89478b;

    /* JADX INFO: renamed from: c */
    public Iterator f89479c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ m3y0 f89480d;

    public e5y0(m3y0 m3y0Var) {
        this.f89480d = m3y0Var;
        this.f89477a = -1;
    }

    /* JADX INFO: renamed from: a */
    public final Iterator m114923a() {
        if (this.f89479c == null) {
            this.f89479c = this.f89480d.f131207c.entrySet().iterator();
        }
        return this.f89479c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f89477a + 1 < this.f89480d.f131206b || (!this.f89480d.f131207c.isEmpty() && m114923a().hasNext());
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        this.f89478b = true;
        int i = this.f89477a + 1;
        this.f89477a = i;
        return i < this.f89480d.f131206b ? (z3y0) this.f89480d.f131205a[this.f89477a] : (Map.Entry) m114923a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f89478b) {
            qkq0.m175383a("remove() was called before next()");
            return;
        }
        this.f89478b = false;
        this.f89480d.m152979q();
        if (this.f89477a >= this.f89480d.f131206b) {
            m114923a().remove();
            return;
        }
        m3y0 m3y0Var = this.f89480d;
        int i = this.f89477a;
        this.f89477a = i - 1;
        m3y0Var.m152974h(i);
    }
}
