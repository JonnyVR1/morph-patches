package p149l;

import java.math.BigDecimal;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes8.dex */
public class zgm {

    /* JADX INFO: renamed from: a */
    public static final C22392a<C21693a> f203055a = C22392a.m221512b();

    /* JADX INFO: renamed from: l.zgm$a */
    public static class C21693a {

        /* JADX INFO: renamed from: a */
        public BigDecimal f203056a;

        /* JADX INFO: renamed from: b */
        public BigDecimal f203057b;

        /* JADX INFO: renamed from: c */
        public String f203058c;

        /* JADX INFO: renamed from: d */
        public long f203059d;

        /* JADX INFO: renamed from: e */
        public long f203060e;
    }

    /* JADX INFO: renamed from: a */
    public static C22392a<C21693a> m218658a() {
        return f203055a;
    }

    /* JADX INFO: renamed from: b */
    public static C21693a m218659b(BigDecimal bigDecimal, BigDecimal bigDecimal2, long j) {
        C21693a c21693a = new C21693a();
        c21693a.f203056a = bigDecimal;
        c21693a.f203060e = j;
        c21693a.f203059d = System.currentTimeMillis();
        c21693a.f203057b = bigDecimal2;
        if (bigDecimal.longValue() < 1024) {
            c21693a.f203058c = bigDecimal.longValue() + "kb/s";
            return c21693a;
        }
        c21693a.f203058c = bigDecimal.divide(new BigDecimal(1024)).longValue() + "Mb/s";
        return c21693a;
    }

    /* JADX INFO: renamed from: c */
    public static C22306c<C21693a> m218660c() {
        return f203055a.asObservable();
    }
}
