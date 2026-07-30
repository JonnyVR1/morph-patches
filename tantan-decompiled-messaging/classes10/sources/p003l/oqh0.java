package p003l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import l.c4g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class oqh0 {

    /* JADX INFO: renamed from: a */
    public static HashMap<String, c4g0> f6734a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    public static HashMap<String, c4g0> f6735b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    public static HashMap<String, ArrayList<Integer>> f6736c = new HashMap<>();

    /* JADX INFO: renamed from: a */
    public static void m8580a() {
        for (Map.Entry<String, c4g0> entry : f6735b.entrySet()) {
            if (entry.getValue() != null && !entry.getValue().isUnsubscribed()) {
                entry.getValue().unsubscribe();
            }
        }
        for (Map.Entry<String, c4g0> entry2 : f6734a.entrySet()) {
            if (entry2.getValue() != null && !entry2.getValue().isUnsubscribed()) {
                entry2.getValue().unsubscribe();
            }
        }
        f6735b.clear();
        f6734a.clear();
    }
}
