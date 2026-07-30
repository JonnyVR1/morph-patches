package p007l;

import android.text.TextUtils;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.utils.CrashHelper;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import l.e30;
import l.hpd0;
import l.uqd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class kb5 {

    /* JADX INFO: renamed from: b */
    public static Map<String, String> f3055b;

    /* JADX INFO: renamed from: c */
    public static String f3056c;

    /* JADX INFO: renamed from: a */
    public static uqd0 f3054a = new uqd0("Video_Compress_Result", "");

    /* JADX INFO: renamed from: d */
    public static hpd0 f3057d = new hpd0("Video_Compress_Use_Codec", Boolean.TRUE);

    static {
        try {
            f3054a.obs().subscribe(new e30() { // from class: l.jb5
                public final void call(Object obj) {
                    kb5.m9588a((String) obj);
                }
            });
            String str = (String) f3054a.get();
            f3056c = str;
            if (TextUtils.isEmpty(str)) {
                f3055b = new HashMap();
            } else {
                f3055b = (Map) JsonAdapter.MAP_ADAPTER(JsonAdapter.STRING_ADAPTER).parse(f3056c);
            }
        } catch (Exception e) {
            CrashHelper.c(e);
            e.getMessage();
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m9588a(String str) {
        f3055b = m9591d(str);
        if (m9589b()) {
            return;
        }
        f3057d.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m9589b() {
        int size = f3055b.size();
        if (size < 6) {
            return true;
        }
        Iterator<String> it = f3055b.keySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            if (!"0".equals(f3055b.get(it.next()))) {
                i++;
            }
        }
        return i <= size / 2;
    }

    /* JADX INFO: renamed from: c */
    public static String m9590c() {
        return JsonAdapter.MAP_ADAPTER(JsonAdapter.STRING_ADAPTER).serialize(f3055b);
    }

    /* JADX INFO: renamed from: d */
    public static Map<String, String> m9591d(String str) {
        HashMap map = new HashMap();
        try {
            try {
                if (!TextUtils.isEmpty(str)) {
                    return (Map) JsonAdapter.MAP_ADAPTER(JsonAdapter.STRING_ADAPTER).parse(str);
                }
            } catch (Exception e) {
                CrashHelper.c(e);
                e.getMessage();
            }
        } catch (Throwable unused) {
        }
        return map;
    }

    /* JADX INFO: renamed from: e */
    public static void m9592e(String str, boolean z) {
        if (!TextUtils.isEmpty(str) && ((Boolean) f3057d.get()).booleanValue()) {
            if (f3055b == null) {
                f3055b = m9591d(f3056c);
            }
            String str2 = f3055b.get(str);
            int i = TextUtils.isEmpty(str2) ? 0 : Integer.parseInt(str2);
            if (!z) {
                i++;
            }
            f3055b.put(str, String.valueOf(i));
            f3054a.put(m9590c());
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m9593f() {
        return ((Boolean) f3057d.get()).booleanValue();
    }
}
