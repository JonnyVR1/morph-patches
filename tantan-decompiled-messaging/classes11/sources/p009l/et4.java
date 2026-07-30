package p009l;

import java.util.Iterator;
import l.jfd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public final /* synthetic */ class et4 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m14104a(CharSequence charSequence, Iterable iterable) {
        if (charSequence == null) {
            jfd0.a("delimiter");
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append(charSequence);
            }
        }
        return sb.toString();
    }
}
