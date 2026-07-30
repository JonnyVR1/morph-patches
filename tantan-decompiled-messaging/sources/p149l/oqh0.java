package p149l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class oqh0 {

    /* JADX INFO: renamed from: a */
    public static HashMap<String, c4g0> f145156a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    public static HashMap<String, c4g0> f145157b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    public static HashMap<String, ArrayList<Integer>> f145158c = new HashMap<>();

    /* JADX INFO: renamed from: a */
    public static void m165458a() {
        for (Map.Entry<String, c4g0> entry : f145157b.entrySet()) {
            if (entry.getValue() != null && !entry.getValue().isUnsubscribed()) {
                entry.getValue().unsubscribe();
            }
        }
        for (Map.Entry<String, c4g0> entry2 : f145156a.entrySet()) {
            if (entry2.getValue() != null && !entry2.getValue().isUnsubscribed()) {
                entry2.getValue().unsubscribe();
            }
        }
        f145157b.clear();
        f145156a.clear();
    }
}
