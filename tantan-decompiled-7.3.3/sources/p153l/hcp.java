package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.ConversationSubChannel;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes12.dex */
public class hcp {
    /* JADX INFO: renamed from: a */
    public static boolean m134488a(Conversation conversation) {
        if (NullChecker.m82486a(conversation) && NullChecker.m82486a(conversation.additional) && NullChecker.m82486a(conversation.additional.oneSide)) {
            return TEnum.equals(conversation.additional.oneSide.subChannel, ConversationSubChannel.intlSvipLetterC);
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m134489b(Conversation conversation) {
        return m134488a(conversation) && TextUtils.equals(conversation.convType, "oneSide");
    }

    /* JADX INFO: renamed from: c */
    public static boolean m134490c(String str) {
        return m134489b(CoreModule.f18264c.f20384f0.m33859Xe(str));
    }
}
