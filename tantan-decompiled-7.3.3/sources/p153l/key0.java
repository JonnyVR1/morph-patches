package p153l;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class key0 implements Iterator {

    /* JADX INFO: renamed from: a */
    public int f126219a;

    /* JADX INFO: renamed from: b */
    public boolean f126220b;

    /* JADX INFO: renamed from: c */
    public Iterator f126221c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ scy0 f126222d;

    public key0(scy0 scy0Var) {
        this.f126222d = scy0Var;
        this.f126219a = -1;
    }

    /* JADX INFO: renamed from: a */
    public final Iterator m149344a() {
        if (this.f126221c == null) {
            this.f126221c = this.f126222d.f167359c.entrySet().iterator();
        }
        return this.f126221c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f126219a + 1 < this.f126222d.f167358b || (!this.f126222d.f167359c.isEmpty() && m149344a().hasNext());
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        this.f126220b = true;
        int i = this.f126219a + 1;
        this.f126219a = i;
        return i < this.f126222d.f167358b ? (fdy0) this.f126222d.f167357a[this.f126219a] : (Map.Entry) m149344a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f126220b) {
            wtq0.m207906a("remove() was called before next()");
            return;
        }
        this.f126220b = false;
        this.f126222d.m185410q();
        if (this.f126219a >= this.f126222d.f167358b) {
            m149344a().remove();
            return;
        }
        scy0 scy0Var = this.f126222d;
        int i = this.f126219a;
        this.f126219a = i - 1;
        scy0Var.m185406h(i);
    }
}
