package p003l;

import android.text.TextUtils;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class gz00 {
    /* JADX INFO: renamed from: a */
    public static String m4902a(Message message) {
        if (!NullChecker.a(message) || !NullChecker.a(message.additionalData) || !NullChecker.a(message.additionalData.woodenFishHint) || TextUtils.isEmpty(message.additionalData.woodenFishHint.userId)) {
            return "";
        }
        if (TextUtils.equals(message.additionalData.woodenFishHint.userId, CoreModule.H().userId())) {
            return "我" + message.additionalData.woodenFishHint.text;
        }
        User userPa = CoreModule.c.e0.Pa(message.additionalData.woodenFishHint.userId);
        if (!NullChecker.a(userPa)) {
            return message.additionalData.woodenFishHint.text;
        }
        return "\"" + userPa.name + "\"" + message.additionalData.woodenFishHint.text;
    }
}
