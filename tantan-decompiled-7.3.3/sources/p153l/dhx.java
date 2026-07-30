package p153l;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class dhx {
    /* JADX INFO: renamed from: a */
    public static String m115830a(List<String> list) {
        return jyb.m147479J(list) ? "" : list.get(0);
    }

    /* JADX INFO: renamed from: b */
    public static List<String> m115831b(List<String> list, String str) {
        if (list == null) {
            return jyb.m147507f0(str);
        }
        if (list.isEmpty()) {
            list.add(str);
            return list;
        }
        list.set(0, str);
        return list;
    }
}
