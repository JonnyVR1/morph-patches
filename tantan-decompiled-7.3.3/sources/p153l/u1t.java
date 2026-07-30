package p153l;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.UserLiveLabel;

/* JADX INFO: loaded from: classes11.dex */
public class u1t {
    /* JADX INFO: renamed from: a */
    public static void m194113a(Activity activity, UserLiveLabel userLiveLabel) {
        if (!TextUtils.isEmpty(userLiveLabel.schema)) {
            nae0.m162083m(activity, Uri.parse(userLiveLabel.schema));
        } else if ("onVoice".equals(userLiveLabel.liveState)) {
            CoreModule.m30934Q().mo68412M6().mo127345p(activity, userLiveLabel.liveId, "chat", userLiveLabel.userId, null);
        } else {
            CoreModule.m30934Q().startAudienceLive(activity, userLiveLabel.liveId, "chat", null);
        }
    }
}
