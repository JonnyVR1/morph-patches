package p007l;

import android.text.TextUtils;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class beh {
    /* JADX INFO: renamed from: a */
    public static int m8810a() {
        int i = 0;
        try {
            String strF = RemoteConfig.x().F("moment_boost_config");
            if (!TextUtils.isEmpty(strF)) {
                i = Integer.parseInt(new JSONObject(strF).optString("svipPrivilege"));
            }
        } catch (Exception unused) {
        }
        if (i <= 0) {
            return 3;
        }
        return i;
    }
}
