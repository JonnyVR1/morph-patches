package p149l;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class eex {
    /* JADX INFO: renamed from: a */
    public static String m116013a(List<String> list) {
        return vwb.m200296J(list) ? "" : list.get(0);
    }

    /* JADX INFO: renamed from: b */
    public static List<String> m116014b(List<String> list, String str) {
        if (list == null) {
            return vwb.m200324f0(str);
        }
        if (list.isEmpty()) {
            list.add(str);
            return list;
        }
        list.set(0, str);
        return list;
    }
}
