package p149l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes6.dex */
public final class yar0 implements Iterator<ymr0> {

    /* JADX INFO: renamed from: a */
    public int f197235a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ v8r0 f197236b;

    public yar0(v8r0 v8r0Var) {
        this.f197236b = v8r0Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f197235a < this.f197236b.m197497j();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ ymr0 next() {
        if (this.f197235a < this.f197236b.m197497j()) {
            v8r0 v8r0Var = this.f197236b;
            int i = this.f197235a;
            this.f197235a = i + 1;
            return v8r0Var.m197494g(i);
        }
        throw new NoSuchElementException("Out of bounds index: " + this.f197235a);
    }
}
