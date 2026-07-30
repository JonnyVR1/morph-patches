package p149l;

import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class n000 {

    /* JADX INFO: renamed from: a */
    public static Map<String, Boolean> f136457a = new HashMap();

    /* JADX INFO: renamed from: b */
    public static Set<String> f136458b = new HashSet();

    /* JADX INFO: renamed from: c */
    public static Set<String> f136459c = new HashSet();

    /* JADX INFO: renamed from: a */
    public static void m157182a(String str) {
        f136459c.add(str);
    }

    /* JADX INFO: renamed from: b */
    public static void m157183b(String str) {
        f136458b.add(str);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m157184c(String str) {
        if (f136457a.containsKey(str)) {
            Boolean bool = f136457a.get(str);
            if (NullChecker.m81303a(bool) && bool.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m157185d(String str) {
        return f136459c.contains(str);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m157186e(String str) {
        return f136458b.contains(str);
    }

    /* JADX INFO: renamed from: f */
    public static void m157187f() {
        f136457a.clear();
    }

    /* JADX INFO: renamed from: g */
    public static void m157188g() {
        f136458b.clear();
    }

    /* JADX INFO: renamed from: h */
    public static String m157189h(Message message, Picture picture) {
        return Media.URL_TO_CACHEKEY(picture.url) + "||" + message.f56011id;
    }

    /* JADX INFO: renamed from: i */
    public static void m157190i(String str) {
        f136457a.put(str, Boolean.TRUE);
    }
}
