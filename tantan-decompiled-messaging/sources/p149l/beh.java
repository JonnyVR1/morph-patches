package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class beh {
    /* JADX INFO: renamed from: a */
    public static int m101354a() {
        int i = 0;
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("moment_boost_config");
            if (!TextUtils.isEmpty(strM79302F)) {
                i = Integer.parseInt(new JSONObject(strM79302F).optString("svipPrivilege"));
            }
        } catch (Exception unused) {
        }
        if (i <= 0) {
            return 3;
        }
        return i;
    }
}
