package p009l;

import android.text.TextUtils;
import com.p1.mobile.putong.api.ABManager;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Map;
import l.hei;
import l.zhw;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class s300 {
    /* JADX INFO: renamed from: a */
    public static String m21983a(String str) {
        try {
            JSONObject jSONObjectB = hei.INSTANCE.b(zhw.b(str));
            String str2 = "";
            String strI = ABManager.i();
            if (!NullChecker.a(jSONObjectB) || TextUtils.isEmpty(strI)) {
                return str;
            }
            HashMap map = new HashMap();
            o400.INSTANCE.m19607a(jSONObjectB, map, null);
            for (Map.Entry entry : map.entrySet()) {
                if (strI.contains((CharSequence) entry.getKey())) {
                    str2 = (String) entry.getKey();
                    break;
                }
            }
            return hei.INSTANCE.f(str, str2);
        } catch (Exception e) {
            CrashHelper.c(e);
            return str;
        }
    }
}
