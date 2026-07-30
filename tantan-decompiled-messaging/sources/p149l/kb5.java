package p149l;

import android.text.TextUtils;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.utils.CrashHelper;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class kb5 {

    /* JADX INFO: renamed from: b */
    public static Map<String, String> f122200b;

    /* JADX INFO: renamed from: c */
    public static String f122201c;

    /* JADX INFO: renamed from: a */
    public static uqd0 f122199a = new uqd0("Video_Compress_Result", "");

    /* JADX INFO: renamed from: d */
    public static hpd0 f122202d = new hpd0("Video_Compress_Use_Codec", Boolean.TRUE);

    static {
        try {
            f122199a.obs().subscribe(new e30() { // from class: l.jb5
                @Override // p149l.e30
                public final void call(Object obj) {
                    kb5.m145205a((String) obj);
                }
            });
            String str = f122199a.get();
            f122201c = str;
            if (TextUtils.isEmpty(str)) {
                f122200b = new HashMap();
            } else {
                f122200b = (Map) JsonAdapter.MAP_ADAPTER(JsonAdapter.STRING_ADAPTER).parse(f122201c);
            }
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            e.getMessage();
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m145205a(String str) {
        f122200b = m145208d(str);
        if (m145206b()) {
            return;
        }
        f122202d.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m145206b() {
        int size = f122200b.size();
        if (size < 6) {
            return true;
        }
        Iterator<String> it = f122200b.keySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            if (!"0".equals(f122200b.get(it.next()))) {
                i++;
            }
        }
        return i <= size / 2;
    }

    /* JADX INFO: renamed from: c */
    public static String m145207c() {
        return JsonAdapter.MAP_ADAPTER(JsonAdapter.STRING_ADAPTER).serialize(f122200b);
    }

    /* JADX INFO: renamed from: d */
    public static Map<String, String> m145208d(String str) {
        HashMap map = new HashMap();
        try {
            try {
                if (!TextUtils.isEmpty(str)) {
                    return (Map) JsonAdapter.MAP_ADAPTER(JsonAdapter.STRING_ADAPTER).parse(str);
                }
            } catch (Exception e) {
                CrashHelper.m81296c(e);
                e.getMessage();
            }
        } catch (Throwable unused) {
        }
        return map;
    }

    /* JADX INFO: renamed from: e */
    public static void m145209e(String str, boolean z) {
        if (!TextUtils.isEmpty(str) && f122202d.get().booleanValue()) {
            if (f122200b == null) {
                f122200b = m145208d(f122201c);
            }
            String str2 = f122200b.get(str);
            int i = TextUtils.isEmpty(str2) ? 0 : Integer.parseInt(str2);
            if (!z) {
                i++;
            }
            f122200b.put(str, String.valueOf(i));
            f122199a.put(m145207c());
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m145210f() {
        return f122202d.get().booleanValue();
    }
}
