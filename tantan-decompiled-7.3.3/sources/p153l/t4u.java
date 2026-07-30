package p153l;

import java.util.HashMap;
import java.util.Map;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes9.dex */
public class t4u {

    /* JADX INFO: renamed from: a */
    public static C22507a<Boolean> f172131a = C22507a.m222759c(Boolean.valueOf(!ppi0.m173207l().m173228x()));

    /* JADX INFO: renamed from: b */
    public static C22507a<Map<String, Boolean>> f172132b = C22507a.m222758b();

    /* JADX INFO: renamed from: c */
    public static C22507a<String> f172133c = C22507a.m222758b();

    /* JADX INFO: renamed from: d */
    public static C22507a<Boolean> f172134d = C22507a.m222758b();

    /* JADX INFO: renamed from: e */
    public static C22508b<Boolean> f172135e = C22508b.m222767b();

    /* JADX INFO: renamed from: f */
    public static C22508b<Integer> f172136f = C22508b.m222767b();

    /* JADX INFO: renamed from: g */
    public static C22507a<Boolean> f172137g = C22507a.m222759c(Boolean.FALSE);

    /* JADX INFO: renamed from: h */
    public static C22507a<C20236a> f172138h = C22507a.m222758b();

    /* JADX INFO: renamed from: l.t4u$a */
    public static class C20236a {

        /* JADX INFO: renamed from: a */
        public final String f172139a;

        /* JADX INFO: renamed from: b */
        public final int f172140b;

        /* JADX INFO: renamed from: c */
        public final long f172141c;

        public C20236a(String str, int i, long j) {
            this.f172139a = str;
            this.f172140b = i;
            this.f172141c = j;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m189313b() {
        f172132b = C22507a.m222758b();
    }

    /* JADX INFO: renamed from: c */
    public static C22507a<Boolean> m189314c() {
        return f172137g;
    }

    /* JADX INFO: renamed from: d */
    public static C22421c<Integer> m189315d() {
        return f172136f.asObservable();
    }

    /* JADX INFO: renamed from: e */
    public static C22421c<Integer> m189316e(final int i) {
        return m189315d().filter(new qcj() { // from class: l.s4u
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((Integer) obj).intValue() == i);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public static C22421c<Map<String, Boolean>> m189317f() {
        return f172132b;
    }

    /* JADX INFO: renamed from: g */
    public static C22421c<String> m189318g() {
        return f172133c;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m189319h() {
        return f172131a.m222761e().booleanValue();
    }

    /* JADX INFO: renamed from: i */
    public static C22421c<Boolean> m189320i() {
        return f172131a;
    }

    /* JADX INFO: renamed from: j */
    public static C22421c<C20236a> m189321j() {
        return f172138h.asObservable();
    }

    /* JADX INFO: renamed from: k */
    public static void m189322k(boolean z) {
        f172137g.onNext(Boolean.valueOf(z));
        if (z) {
            f172135e.onNext(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m189323l(String str, boolean z) {
        Map<String, Boolean> mapM222761e = f172132b.m222761e();
        if (mapM222761e == null) {
            mapM222761e = new HashMap<>();
        }
        mapM222761e.put(str, Boolean.valueOf(z));
        f172132b.onNext(mapM222761e);
    }

    /* JADX INFO: renamed from: m */
    public static void m189324m(boolean z) {
        f172131a.onNext(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: n */
    public static void m189325n(int i) {
        f172136f.onNext(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: o */
    public static void m189326o(C20236a c20236a) {
        f172138h.onNext(c20236a);
    }

    /* JADX INFO: renamed from: p */
    public static void m189327p(String str) {
        f172133c.onNext(str);
    }

    /* JADX INFO: renamed from: q */
    public static void m189328q(String str, boolean z) {
    }
}
