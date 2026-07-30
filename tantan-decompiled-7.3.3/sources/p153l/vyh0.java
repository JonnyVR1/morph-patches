package p153l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class vyh0 {

    /* JADX INFO: renamed from: a */
    public static HashMap<String, kcg0> f186377a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    public static HashMap<String, kcg0> f186378b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    public static HashMap<String, ArrayList<Integer>> f186379c = new HashMap<>();

    /* JADX INFO: renamed from: a */
    public static void m203996a() {
        for (Map.Entry<String, kcg0> entry : f186378b.entrySet()) {
            if (entry.getValue() != null && !entry.getValue().isUnsubscribed()) {
                entry.getValue().unsubscribe();
            }
        }
        for (Map.Entry<String, kcg0> entry2 : f186377a.entrySet()) {
            if (entry2.getValue() != null && !entry2.getValue().isUnsubscribed()) {
                entry2.getValue().unsubscribe();
            }
        }
        f186378b.clear();
        f186377a.clear();
    }
}
