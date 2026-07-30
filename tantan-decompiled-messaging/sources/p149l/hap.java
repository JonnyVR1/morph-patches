package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.ConversationSubChannel;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes10.dex */
public class hap {
    /* JADX INFO: renamed from: a */
    public static boolean m130152a(Conversation conversation) {
        if (NullChecker.m81303a(conversation) && NullChecker.m81303a(conversation.additional) && NullChecker.m81303a(conversation.additional.oneSide)) {
            return TEnum.equals(conversation.additional.oneSide.subChannel, ConversationSubChannel.intlSvipLetterC);
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m130153b(Conversation conversation) {
        return m130152a(conversation) && TextUtils.equals(conversation.convType, "oneSide");
    }

    /* JADX INFO: renamed from: c */
    public static boolean m130154c(String str) {
        return m130153b(CoreModule.f17545c.f19642f0.m32856Xe(str));
    }
}
