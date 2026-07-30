package p153l;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class apw0 implements Iterable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CharSequence f72762a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ dpw0 f72763b;

    public apw0(dpw0 dpw0Var, CharSequence charSequence) {
        this.f72762a = charSequence;
        this.f72763b = dpw0Var;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f72763b.m117431g(this.f72762a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        fow0.m126499b(sb, this, ", ");
        sb.append(']');
        return sb.toString();
    }
}
