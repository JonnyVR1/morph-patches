package p153l;

import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class k900 {

    /* JADX INFO: renamed from: a */
    public static Map<String, Boolean> f124428a = new HashMap();

    /* JADX INFO: renamed from: b */
    public static Set<String> f124429b = new HashSet();

    /* JADX INFO: renamed from: c */
    public static Set<String> f124430c = new HashSet();

    /* JADX INFO: renamed from: a */
    public static void m148789a(String str) {
        f124430c.add(str);
    }

    /* JADX INFO: renamed from: b */
    public static void m148790b(String str) {
        f124429b.add(str);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m148791c(String str) {
        if (f124428a.containsKey(str)) {
            Boolean bool = f124428a.get(str);
            if (NullChecker.m82486a(bool) && bool.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m148792d(String str) {
        return f124430c.contains(str);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m148793e(String str) {
        return f124429b.contains(str);
    }

    /* JADX INFO: renamed from: f */
    public static void m148794f() {
        f124428a.clear();
    }

    /* JADX INFO: renamed from: g */
    public static void m148795g() {
        f124429b.clear();
    }

    /* JADX INFO: renamed from: h */
    public static String m148796h(Message message, Picture picture) {
        return Media.URL_TO_CACHEKEY(picture.url) + "||" + message.f56859id;
    }

    /* JADX INFO: renamed from: i */
    public static void m148797i(String str) {
        f124428a.put(str, Boolean.TRUE);
    }
}
