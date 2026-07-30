package p003l;

import java.util.List;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class eex {
    /* JADX INFO: renamed from: a */
    public static String m3824a(List<String> list) {
        return vwb.J(list) ? "" : list.get(0);
    }

    /* JADX INFO: renamed from: b */
    public static List<String> m3825b(List<String> list, String str) {
        if (list == null) {
            return vwb.f0(new String[]{str});
        }
        if (list.isEmpty()) {
            list.add(str);
            return list;
        }
        list.set(0, str);
        return list;
    }
}
