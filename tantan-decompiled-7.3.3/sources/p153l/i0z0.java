package p153l;

import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class i0z0 implements Iterable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CharSequence f112466a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ k3z0 f112467b;

    public i0z0(k3z0 k3z0Var, CharSequence charSequence) {
        this.f112467b = k3z0Var;
        this.f112466a = charSequence;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f112467b.m148206h(this.f112466a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        Iterator it = iterator();
        try {
            if (it.hasNext()) {
                sb.append(gry0.m131952a(it.next(), ", "));
                while (it.hasNext()) {
                    sb.append((CharSequence) ", ");
                    sb.append(gry0.m131952a(it.next(), ", "));
                }
            }
            sb.append(']');
            return sb.toString();
        } catch (IOException e) {
            gig0.m130323a(e);
            return null;
        }
    }
}
