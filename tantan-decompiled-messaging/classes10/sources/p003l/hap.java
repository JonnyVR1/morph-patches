package p003l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.data.Conversation;
import com.p000p1.mobile.putong.core.data.ConversationSubChannel;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class hap {
    /* JADX INFO: renamed from: a */
    public static boolean m6936a(Conversation conversation) {
        if (NullChecker.a(conversation) && NullChecker.a(conversation.additional) && NullChecker.a(conversation.additional.oneSide)) {
            return TEnum.equals(conversation.additional.oneSide.subChannel, ConversationSubChannel.intlSvipLetterC);
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m6937b(Conversation conversation) {
        return m6936a(conversation) && TextUtils.equals(conversation.convType, "oneSide");
    }

    /* JADX INFO: renamed from: c */
    public static boolean m6938c(String str) {
        return m6937b(CoreModule.c.f0.Xe(str));
    }
}
