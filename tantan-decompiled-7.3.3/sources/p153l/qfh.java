package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class qfh {
    /* JADX INFO: renamed from: a */
    public static int m176369a() {
        int i = 0;
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("moment_boost_config");
            if (!TextUtils.isEmpty(strM80485F)) {
                i = Integer.parseInt(new JSONObject(strM80485F).optString("svipPrivilege"));
            }
        } catch (Exception unused) {
        }
        if (i <= 0) {
            return 3;
        }
        return i;
    }
}
