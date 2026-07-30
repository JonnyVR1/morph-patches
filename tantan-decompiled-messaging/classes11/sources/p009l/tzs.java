package p009l;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.UserLiveLabel;
import l.j2e0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class tzs {
    /* JADX INFO: renamed from: a */
    public static void m22714a(Activity activity, UserLiveLabel userLiveLabel) {
        if (!TextUtils.isEmpty(userLiveLabel.schema)) {
            j2e0.m(activity, Uri.parse(userLiveLabel.schema));
        } else if ("onVoice".equals(userLiveLabel.liveState)) {
            CoreModule.Q().m9019M6().m12097p(activity, userLiveLabel.liveId, "chat", userLiveLabel.userId, null);
        } else {
            CoreModule.Q().startAudienceLive(activity, userLiveLabel.liveId, "chat", null);
        }
    }
}
