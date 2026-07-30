package p153l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes6.dex */
public final class ekr0 implements Iterator<ewr0> {

    /* JADX INFO: renamed from: a */
    public int f94424a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ bir0 f94425b;

    public ekr0(bir0 bir0Var) {
        this.f94425b = bir0Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f94424a < this.f94425b.m104501j();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ ewr0 next() {
        if (this.f94424a < this.f94425b.m104501j()) {
            bir0 bir0Var = this.f94425b;
            int i = this.f94424a;
            this.f94424a = i + 1;
            return bir0Var.m104498g(i);
        }
        throw new NoSuchElementException("Out of bounds index: " + this.f94424a);
    }
}
