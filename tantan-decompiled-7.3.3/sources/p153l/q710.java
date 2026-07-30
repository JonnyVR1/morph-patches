package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes3.dex */
public class q710 {
    /* JADX INFO: renamed from: a */
    public static String m175631a(Message message) {
        if (!NullChecker.m82486a(message) || !NullChecker.m82486a(message.additionalData) || !NullChecker.m82486a(message.additionalData.woodenFishHint) || TextUtils.isEmpty(message.additionalData.woodenFishHint.userId)) {
            return "";
        }
        if (TextUtils.equals(message.additionalData.woodenFishHint.userId, CoreModule.m30929H().userId())) {
            return "我" + message.additionalData.woodenFishHint.text;
        }
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(message.additionalData.woodenFishHint.userId);
        if (!NullChecker.m82486a(userM116503Pa)) {
            return message.additionalData.woodenFishHint.text;
        }
        return "\"" + userM116503Pa.name + "\"" + message.additionalData.woodenFishHint.text;
    }
}
