package p149l;

import java.util.HashMap;
import java.util.Map;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes13.dex */
public class s2u {

    /* JADX INFO: renamed from: a */
    public static C22392a<Boolean> f162008a = C22392a.m221513c(Boolean.valueOf(!pgi0.m168730l().m168751x()));

    /* JADX INFO: renamed from: b */
    public static C22392a<Map<String, Boolean>> f162009b = C22392a.m221512b();

    /* JADX INFO: renamed from: c */
    public static C22392a<String> f162010c = C22392a.m221512b();

    /* JADX INFO: renamed from: d */
    public static C22392a<Boolean> f162011d = C22392a.m221512b();

    /* JADX INFO: renamed from: e */
    public static C22393b<Boolean> f162012e = C22393b.m221521b();

    /* JADX INFO: renamed from: f */
    public static C22393b<Integer> f162013f = C22393b.m221521b();

    /* JADX INFO: renamed from: g */
    public static C22392a<Boolean> f162014g = C22392a.m221513c(Boolean.FALSE);

    /* JADX INFO: renamed from: h */
    public static C22392a<C19834a> f162015h = C22392a.m221512b();

    /* JADX INFO: renamed from: l.s2u$a */
    public static class C19834a {

        /* JADX INFO: renamed from: a */
        public final String f162016a;

        /* JADX INFO: renamed from: b */
        public final int f162017b;

        /* JADX INFO: renamed from: c */
        public final long f162018c;

        public C19834a(String str, int i, long j) {
            this.f162016a = str;
            this.f162017b = i;
            this.f162018c = j;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m182070b() {
        f162009b = C22392a.m221512b();
    }

    /* JADX INFO: renamed from: c */
    public static C22392a<Boolean> m182071c() {
        return f162014g;
    }

    /* JADX INFO: renamed from: d */
    public static C22306c<Integer> m182072d() {
        return f162013f.asObservable();
    }

    /* JADX INFO: renamed from: e */
    public static C22306c<Integer> m182073e(final int i) {
        return m182072d().filter(new w9j() { // from class: l.r2u
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((Integer) obj).intValue() == i);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public static C22306c<Map<String, Boolean>> m182074f() {
        return f162009b;
    }

    /* JADX INFO: renamed from: g */
    public static C22306c<String> m182075g() {
        return f162010c;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m182076h() {
        return f162008a.m221515e().booleanValue();
    }

    /* JADX INFO: renamed from: i */
    public static C22306c<Boolean> m182077i() {
        return f162008a;
    }

    /* JADX INFO: renamed from: j */
    public static C22306c<C19834a> m182078j() {
        return f162015h.asObservable();
    }

    /* JADX INFO: renamed from: k */
    public static void m182079k(boolean z) {
        f162014g.onNext(Boolean.valueOf(z));
        if (z) {
            f162012e.onNext(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m182080l(String str, boolean z) {
        Map<String, Boolean> mapM221515e = f162009b.m221515e();
        if (mapM221515e == null) {
            mapM221515e = new HashMap<>();
        }
        mapM221515e.put(str, Boolean.valueOf(z));
        f162009b.onNext(mapM221515e);
    }

    /* JADX INFO: renamed from: m */
    public static void m182081m(boolean z) {
        f162008a.onNext(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: n */
    public static void m182082n(int i) {
        f162013f.onNext(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: o */
    public static void m182083o(C19834a c19834a) {
        f162015h.onNext(c19834a);
    }

    /* JADX INFO: renamed from: p */
    public static void m182084p(String str) {
        f162010c.onNext(str);
    }

    /* JADX INFO: renamed from: q */
    public static void m182085q(String str, boolean z) {
    }
}
