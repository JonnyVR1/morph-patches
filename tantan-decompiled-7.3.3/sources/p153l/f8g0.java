package p153l;

import java.util.Collection;

/* JADX INFO: loaded from: classes7.dex */
public class f8g0 {
    /* JADX INFO: renamed from: a */
    public static boolean m124534a(String str) {
        return str == null || "".equals(str.trim());
    }

    /* JADX INFO: renamed from: b */
    public static <T> String m124535b(Collection<T> collection, String str) {
        if (collection == null || collection.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (T t : collection) {
            if (t != null) {
                sb.append(t.toString());
                sb.append(str);
            }
        }
        int iLastIndexOf = sb.lastIndexOf(str);
        if (-1 != iLastIndexOf) {
            sb.delete(iLastIndexOf, sb.length());
        }
        return sb.toString();
    }
}
