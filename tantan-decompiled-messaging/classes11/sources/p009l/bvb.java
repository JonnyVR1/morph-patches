package p009l;

import android.util.Pair;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class bvb {

    /* JADX INFO: renamed from: a */
    public static final a<Pair<String, Integer>> f10323a = a.b();

    /* JADX INFO: renamed from: a */
    public static c<Pair<String, Integer>> m12277a() {
        return f10323a.asObservable();
    }

    /* JADX INFO: renamed from: b */
    public static Pair<String, Integer> m12278b() {
        return (Pair) f10323a.e();
    }

    /* JADX INFO: renamed from: c */
    public static void m12279c(String str, int i) {
        f10323a.onNext(Pair.create(str, Integer.valueOf(i)));
    }
}
