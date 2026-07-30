package p149l;

import android.util.Pair;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes11.dex */
public class bvb {

    /* JADX INFO: renamed from: a */
    public static final C22392a<Pair<String, Integer>> f77418a = C22392a.m221512b();

    /* JADX INFO: renamed from: a */
    public static C22306c<Pair<String, Integer>> m104011a() {
        return f77418a.asObservable();
    }

    /* JADX INFO: renamed from: b */
    public static Pair<String, Integer> m104012b() {
        return f77418a.m221515e();
    }

    /* JADX INFO: renamed from: c */
    public static void m104013c(String str, int i) {
        f77418a.onNext(Pair.create(str, Integer.valueOf(i)));
    }
}
