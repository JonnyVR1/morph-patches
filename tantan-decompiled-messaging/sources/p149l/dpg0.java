package p149l;

import android.net.Uri;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class dpg0 {

    /* JADX INFO: renamed from: a */
    public final Uri f87271a;

    /* JADX INFO: renamed from: b */
    public final List f87272b = null;

    /* JADX INFO: renamed from: c */
    public final int f87273c;

    public dpg0(Uri uri, int i) {
        this.f87271a = uri;
        this.f87273c = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{");
        sb.append(this.f87271a);
        List list = this.f87272b;
        if (list != null && !list.isEmpty()) {
            Iterator it = this.f87272b.iterator();
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
