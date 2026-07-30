package p149l;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class t3y0 implements Iterator {

    /* JADX INFO: renamed from: a */
    public int f167674a;

    /* JADX INFO: renamed from: b */
    public Iterator f167675b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ m3y0 f167676c;

    public t3y0(m3y0 m3y0Var) {
        this.f167676c = m3y0Var;
        this.f167674a = m3y0Var.f131206b;
    }

    /* JADX INFO: renamed from: a */
    public final Iterator m187131a() {
        if (this.f167675b == null) {
            this.f167675b = this.f167676c.f131210f.entrySet().iterator();
        }
        return this.f167675b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f167674a;
        return (i > 0 && i <= this.f167676c.f131206b) || m187131a().hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        if (m187131a().hasNext()) {
            return (Map.Entry) m187131a().next();
        }
        Object[] objArr = this.f167676c.f131205a;
        int i = this.f167674a - 1;
        this.f167674a = i;
        return (z3y0) objArr[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
