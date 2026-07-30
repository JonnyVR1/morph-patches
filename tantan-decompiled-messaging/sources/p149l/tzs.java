package p149l;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.UserLiveLabel;

/* JADX INFO: loaded from: classes11.dex */
public class tzs {
    /* JADX INFO: renamed from: a */
    public static void m191214a(Activity activity, UserLiveLabel userLiveLabel) {
        if (!TextUtils.isEmpty(userLiveLabel.schema)) {
            j2e0.m139446m(activity, Uri.parse(userLiveLabel.schema));
        } else if ("onVoice".equals(userLiveLabel.liveState)) {
            CoreModule.m29936Q().mo67229M6().mo102431p(activity, userLiveLabel.liveId, "chat", userLiveLabel.userId, null);
        } else {
            CoreModule.m29936Q().startAudienceLive(activity, userLiveLabel.liveId, "chat", null);
        }
    }
}
