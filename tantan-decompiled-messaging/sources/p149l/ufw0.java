package p149l;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class ufw0 implements Iterable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CharSequence f176335a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ xfw0 f176336b;

    public ufw0(xfw0 xfw0Var, CharSequence charSequence) {
        this.f176335a = charSequence;
        this.f176336b = xfw0Var;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f176336b.m208620g(this.f176335a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        zew0.m218428b(sb, this, ", ");
        sb.append(']');
        return sb.toString();
    }
}
