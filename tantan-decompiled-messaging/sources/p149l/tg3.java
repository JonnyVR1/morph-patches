package p149l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class tg3 {

    /* JADX INFO: renamed from: a */
    private List<C20169a> f170052a;

    /* JADX INFO: renamed from: l.tg3$a */
    public class C20169a {

        /* JADX INFO: renamed from: a */
        byte[] f170053a;

        /* JADX INFO: renamed from: b */
        boolean f170054b = false;

        public C20169a() {
        }
    }

    /* JADX INFO: renamed from: a */
    public byte[] m188801a(int i) {
        byte[] bArr;
        if (this.f170052a == null) {
            this.f170052a = new ArrayList();
        }
        if (this.f170052a.size() != 0) {
            for (C20169a c20169a : this.f170052a) {
                if (!c20169a.f170054b && (bArr = c20169a.f170053a) != null && bArr.length == i) {
                    c20169a.f170054b = true;
                    return bArr;
                }
            }
        }
        C20169a c20169a2 = new C20169a();
        c20169a2.f170053a = new byte[i];
        c20169a2.f170054b = true;
        this.f170052a.add(c20169a2);
        return c20169a2.f170053a;
    }

    /* JADX INFO: renamed from: b */
    public void m188802b() {
        if (this.f170052a.size() != 0) {
            Iterator<C20169a> it = this.f170052a.iterator();
            while (it.hasNext()) {
                it.next().f170054b = false;
            }
        }
    }
}
