package p007l;

import java.math.BigDecimal;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class zgm {

    /* JADX INFO: renamed from: a */
    public static final a<C0806a> f5507a = a.b();

    /* JADX INFO: renamed from: l.zgm$a */
    public static class C0806a {

        /* JADX INFO: renamed from: a */
        public BigDecimal f5508a;

        /* JADX INFO: renamed from: b */
        public BigDecimal f5509b;

        /* JADX INFO: renamed from: c */
        public String f5510c;

        /* JADX INFO: renamed from: d */
        public long f5511d;

        /* JADX INFO: renamed from: e */
        public long f5512e;
    }

    /* JADX INFO: renamed from: a */
    public static a<C0806a> m12006a() {
        return f5507a;
    }

    /* JADX INFO: renamed from: b */
    public static C0806a m12007b(BigDecimal bigDecimal, BigDecimal bigDecimal2, long j) {
        C0806a c0806a = new C0806a();
        c0806a.f5508a = bigDecimal;
        c0806a.f5512e = j;
        c0806a.f5511d = System.currentTimeMillis();
        c0806a.f5509b = bigDecimal2;
        if (bigDecimal.longValue() < 1024) {
            c0806a.f5510c = bigDecimal.longValue() + "kb/s";
            return c0806a;
        }
        c0806a.f5510c = bigDecimal.divide(new BigDecimal(1024)).longValue() + "Mb/s";
        return c0806a;
    }

    /* JADX INFO: renamed from: c */
    public static c<C0806a> m12008c() {
        return f5507a.asObservable();
    }
}
