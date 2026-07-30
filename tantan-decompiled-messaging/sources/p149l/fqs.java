package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.data.Link;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.util.HashMap;

/* JADX INFO: loaded from: classes13.dex */
public class fqs {
    /* JADX INFO: renamed from: a */
    public static void m122741a(String str, String str2, String str3, String str4, boolean z, String str5) {
        l3f l3fVar = new l3f();
        l3fVar.f125885d = EventNameEnum.USER_BEHAVIOR_COMPLEMENT;
        l3fVar.f125895n = "p_live_using_push_schema_trace";
        l3fVar.f125900s = "e_live_using_push_schema_trace";
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map.put("intent", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            map.put("schema_path", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            map.put("go_data", str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            map.put("type", str4);
        }
        map.put("is_new_framework", Boolean.valueOf(z));
        if (!TextUtils.isEmpty(str5)) {
            map.put(Link.TYPE, str5);
        }
        zvf0.m220392n(l3fVar, map);
    }

    /* JADX INFO: renamed from: b */
    public static void m122742b(String str, boolean z) {
        m122741a(null, null, str, "goAction", z, null);
    }

    /* JADX INFO: renamed from: c */
    public static void m122743c(String str, boolean z, String str2) {
        m122741a(str, null, null, "push", z, str2);
    }

    /* JADX INFO: renamed from: d */
    public static void m122744d(String str, boolean z) {
        m122741a(null, str, null, "schema", z, null);
    }
}
