package p153l;

import android.net.Uri;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class lxg0 {

    /* JADX INFO: renamed from: a */
    public final Uri f133955a;

    /* JADX INFO: renamed from: b */
    public final List f133956b = null;

    /* JADX INFO: renamed from: c */
    public final int f133957c;

    public lxg0(Uri uri, int i) {
        this.f133955a = uri;
        this.f133957c = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{");
        sb.append(this.f133955a);
        List list = this.f133956b;
        if (list != null && !list.isEmpty()) {
            Iterator it = this.f133956b.iterator();
            if (it.hasNext()) {
                if (it.next() != null) {
                    throw new ClassCastException();
                }
                sb.append(' ');
                throw null;
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
