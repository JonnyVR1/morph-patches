package p153l;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class zcy0 implements Iterator {

    /* JADX INFO: renamed from: a */
    public int f203843a;

    /* JADX INFO: renamed from: b */
    public Iterator f203844b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ scy0 f203845c;

    public zcy0(scy0 scy0Var) {
        this.f203845c = scy0Var;
        this.f203843a = scy0Var.f167358b;
    }

    /* JADX INFO: renamed from: a */
    public final Iterator m219270a() {
        if (this.f203844b == null) {
            this.f203844b = this.f203845c.f167362f.entrySet().iterator();
        }
        return this.f203844b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f203843a;
        return (i > 0 && i <= this.f203845c.f167358b) || m219270a().hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        if (m219270a().hasNext()) {
            return (Map.Entry) m219270a().next();
        }
        Object[] objArr = this.f203845c.f167357a;
        int i = this.f203843a - 1;
        this.f203843a = i;
        return (fdy0) objArr[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
