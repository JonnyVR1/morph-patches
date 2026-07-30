package p149l;

import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class cry0 implements Iterable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CharSequence f82310a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ euy0 f82311b;

    public cry0(euy0 euy0Var, CharSequence charSequence) {
        this.f82311b = euy0Var;
        this.f82310a = charSequence;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f82311b.m118232h(this.f82310a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        Iterator it = iterator();
        try {
            if (it.hasNext()) {
                sb.append(aiy0.m96965a(it.next(), ", "));
                while (it.hasNext()) {
                    sb.append((CharSequence) ", ");
                    sb.append(aiy0.m96965a(it.next(), ", "));
                }
            }
            sb.append(']');
            return sb.toString();
        } catch (IOException e) {
            y9g0.m213537a(e);
            return null;
        }
    }
}
