package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes3.dex */
public class gz00 {
    /* JADX INFO: renamed from: a */
    public static String m128789a(Message message) {
        if (!NullChecker.m81303a(message) || !NullChecker.m81303a(message.additionalData) || !NullChecker.m81303a(message.additionalData.woodenFishHint) || TextUtils.isEmpty(message.additionalData.woodenFishHint.userId)) {
            return "";
        }
        if (TextUtils.equals(message.additionalData.woodenFishHint.userId, CoreModule.m29931H().userId())) {
            return "我" + message.additionalData.woodenFishHint.text;
        }
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(message.additionalData.woodenFishHint.userId);
        if (!NullChecker.m81303a(userM169430Pa)) {
            return message.additionalData.woodenFishHint.text;
        }
        return "\"" + userM169430Pa.name + "\"" + message.additionalData.woodenFishHint.text;
    }
}
