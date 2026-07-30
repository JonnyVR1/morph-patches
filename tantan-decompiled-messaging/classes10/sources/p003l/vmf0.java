package p003l;

import com.p000p1.mobile.putong.core.data.ChatMM;
import com.p000p1.mobile.putong.core.data.Conversation;
import com.tantanapp.common.utils.NullChecker;
import l.mqi0;
import l.ura;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class vmf0 {
    /* JADX INFO: renamed from: a */
    public static boolean m10246a(Conversation conversation) {
        if (!ura.e().d().W8() || !NullChecker.a(conversation) || !NullChecker.a(conversation.additional) || !NullChecker.a(conversation.additional.chatMM)) {
            return false;
        }
        ChatMM chatMM = conversation.additional.chatMM;
        return chatMM.pinChatSuggested && chatMM.expireTime > ((double) mqi0.o());
    }
}
