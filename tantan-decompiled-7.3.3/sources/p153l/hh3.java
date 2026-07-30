package p153l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class hh3 {

    /* JADX INFO: renamed from: a */
    private List<C17458a> f109474a;

    /* JADX INFO: renamed from: l.hh3$a */
    public class C17458a {

        /* JADX INFO: renamed from: a */
        byte[] f109475a;

        /* JADX INFO: renamed from: b */
        boolean f109476b = false;

        public C17458a() {
        }
    }

    /* JADX INFO: renamed from: a */
    public byte[] m135012a(int i) {
        byte[] bArr;
        if (this.f109474a == null) {
            this.f109474a = new ArrayList();
        }
        if (this.f109474a.size() != 0) {
            for (C17458a c17458a : this.f109474a) {
                if (!c17458a.f109476b && (bArr = c17458a.f109475a) != null && bArr.length == i) {
                    c17458a.f109476b = true;
                    return bArr;
                }
            }
        }
        C17458a c17458a2 = new C17458a();
        c17458a2.f109475a = new byte[i];
        c17458a2.f109476b = true;
        this.f109474a.add(c17458a2);
        return c17458a2.f109475a;
    }

    /* JADX INFO: renamed from: b */
    public void m135013b() {
        if (this.f109474a.size() != 0) {
            Iterator<C17458a> it = this.f109474a.iterator();
            while (it.hasNext()) {
                it.next().f109476b = false;
            }
        }
    }
}
