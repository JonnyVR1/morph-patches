package p153l;

import android.text.TextUtils;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.utils.CrashHelper;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class kc5 {

    /* JADX INFO: renamed from: b */
    public static Map<String, String> f125022b;

    /* JADX INFO: renamed from: c */
    public static String f125023c;

    /* JADX INFO: renamed from: a */
    public static wyd0 f125021a = new wyd0("Video_Compress_Result", "");

    /* JADX INFO: renamed from: d */
    public static jxd0 f125024d = new jxd0("Video_Compress_Use_Codec", Boolean.TRUE);

    static {
        try {
            f125021a.obs().subscribe(new y20() { // from class: l.jc5
                @Override // p153l.y20
                public final void call(Object obj) {
                    kc5.m149096a((String) obj);
                }
            });
            String str = f125021a.get();
            f125023c = str;
            if (TextUtils.isEmpty(str)) {
                f125022b = new HashMap();
            } else {
                f125022b = (Map) JsonAdapter.MAP_ADAPTER(JsonAdapter.STRING_ADAPTER).parse(f125023c);
            }
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            e.getMessage();
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m149096a(String str) {
        f125022b = m149099d(str);
        if (m149097b()) {
            return;
        }
        f125024d.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m149097b() {
        int size = f125022b.size();
        if (size < 6) {
            return true;
        }
        Iterator<String> it = f125022b.keySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            if (!"0".equals(f125022b.get(it.next()))) {
                i++;
            }
        }
        return i <= size / 2;
    }

    /* JADX INFO: renamed from: c */
    public static String m149098c() {
        return JsonAdapter.MAP_ADAPTER(JsonAdapter.STRING_ADAPTER).serialize(f125022b);
    }

    /* JADX INFO: renamed from: d */
    public static Map<String, String> m149099d(String str) {
        HashMap map = new HashMap();
        try {
            try {
                if (!TextUtils.isEmpty(str)) {
                    return (Map) JsonAdapter.MAP_ADAPTER(JsonAdapter.STRING_ADAPTER).parse(str);
                }
            } catch (Exception e) {
                CrashHelper.m82479c(e);
                e.getMessage();
            }
        } catch (Throwable unused) {
        }
        return map;
    }

    /* JADX INFO: renamed from: e */
    public static void m149100e(String str, boolean z) {
        if (!TextUtils.isEmpty(str) && f125024d.get().booleanValue()) {
            if (f125022b == null) {
                f125022b = m149099d(f125023c);
            }
            String str2 = f125022b.get(str);
            int i = TextUtils.isEmpty(str2) ? 0 : Integer.parseInt(str2);
            if (!z) {
                i++;
            }
            f125022b.put(str, String.valueOf(i));
            f125021a.put(m149098c());
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m149101f() {
        return f125024d.get().booleanValue();
    }
}
