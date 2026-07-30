package p003l;

import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class n000 {

    /* JADX INFO: renamed from: a */
    public static Map<String, Boolean> f5816a = new HashMap();

    /* JADX INFO: renamed from: b */
    public static Set<String> f5817b = new HashSet();

    /* JADX INFO: renamed from: c */
    public static Set<String> f5818c = new HashSet();

    /* JADX INFO: renamed from: a */
    public static void m6516a(String str) {
        f5818c.add(str);
    }

    /* JADX INFO: renamed from: b */
    public static void m6517b(String str) {
        f5817b.add(str);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m6518c(String str) {
        if (f5816a.containsKey(str)) {
            Boolean bool = f5816a.get(str);
            if (NullChecker.a(bool) && bool.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m6519d(String str) {
        return f5818c.contains(str);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m6520e(String str) {
        return f5817b.contains(str);
    }

    /* JADX INFO: renamed from: f */
    public static void m6521f() {
        f5816a.clear();
    }

    /* JADX INFO: renamed from: g */
    public static void m6522g() {
        f5817b.clear();
    }

    /* JADX INFO: renamed from: h */
    public static String m6523h(Message message, Picture picture) {
        return Media.URL_TO_CACHEKEY(((Media) picture).url) + "||" + ((DbObject) message).id;
    }

    /* JADX INFO: renamed from: i */
    public static void m6524i(String str) {
        f5816a.put(str, Boolean.TRUE);
    }
}
