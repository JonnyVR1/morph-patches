package p153l;

import java.math.BigDecimal;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes8.dex */
public class cjm {

    /* JADX INFO: renamed from: a */
    public static final C22507a<C16288a> f82197a = C22507a.m222758b();

    /* JADX INFO: renamed from: l.cjm$a */
    public static class C16288a {

        /* JADX INFO: renamed from: a */
        public BigDecimal f82198a;

        /* JADX INFO: renamed from: b */
        public BigDecimal f82199b;

        /* JADX INFO: renamed from: c */
        public String f82200c;

        /* JADX INFO: renamed from: d */
        public long f82201d;

        /* JADX INFO: renamed from: e */
        public long f82202e;
    }

    /* JADX INFO: renamed from: a */
    public static C22507a<C16288a> m110270a() {
        return f82197a;
    }

    /* JADX INFO: renamed from: b */
    public static C16288a m110271b(BigDecimal bigDecimal, BigDecimal bigDecimal2, long j) {
        C16288a c16288a = new C16288a();
        c16288a.f82198a = bigDecimal;
        c16288a.f82202e = j;
        c16288a.f82201d = System.currentTimeMillis();
        c16288a.f82199b = bigDecimal2;
        if (bigDecimal.longValue() < 1024) {
            c16288a.f82200c = bigDecimal.longValue() + "kb/s";
            return c16288a;
        }
        c16288a.f82200c = bigDecimal.divide(new BigDecimal(1024)).longValue() + "Mb/s";
        return c16288a;
    }

    /* JADX INFO: renamed from: c */
    public static C22421c<C16288a> m110272c() {
        return f82197a.asObservable();
    }
}
