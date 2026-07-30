package p153l;

import android.util.Pair;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes10.dex */
public class pwb {

    /* JADX INFO: renamed from: a */
    public static final C22507a<Pair<String, Integer>> f154390a = C22507a.m222758b();

    /* JADX INFO: renamed from: a */
    public static C22421c<Pair<String, Integer>> m174053a() {
        return f154390a.asObservable();
    }

    /* JADX INFO: renamed from: b */
    public static Pair<String, Integer> m174054b() {
        return f154390a.m222761e();
    }

    /* JADX INFO: renamed from: c */
    public static void m174055c(String str, int i) {
        f154390a.onNext(Pair.create(str, Integer.valueOf(i)));
    }
}
