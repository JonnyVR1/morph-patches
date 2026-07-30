package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.api.ABManager;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class s300 {
    /* JADX INFO: renamed from: a */
    public static String m182089a(String str) {
        try {
            JSONObject jSONObjectM130634b = hei.INSTANCE.m130634b(zhw.m218869b(str));
            String str2 = "";
            String strM29349i = ABManager.m29349i();
            if (!NullChecker.m81303a(jSONObjectM130634b) || TextUtils.isEmpty(strM29349i)) {
                return str;
            }
            HashMap map = new HashMap();
            o400.INSTANCE.m162510a(jSONObjectM130634b, map, null);
            for (Map.Entry entry : map.entrySet()) {
                if (strM29349i.contains((CharSequence) entry.getKey())) {
                    str2 = (String) entry.getKey();
                    break;
                }
            }
            return hei.INSTANCE.m130635f(str, str2);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return str;
        }
    }
}
