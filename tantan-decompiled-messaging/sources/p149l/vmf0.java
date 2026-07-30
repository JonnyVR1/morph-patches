package p149l;

import com.p046p1.mobile.putong.core.data.ChatMM;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes10.dex */
public class vmf0 {
    /* JADX INFO: renamed from: a */
    public static boolean m198948a(Conversation conversation) {
        if (!ura.m195053e().m195057d().mo33773W8() || !NullChecker.m81303a(conversation) || !NullChecker.m81303a(conversation.additional) || !NullChecker.m81303a(conversation.additional.chatMM)) {
            return false;
        }
        ChatMM chatMM = conversation.additional.chatMM;
        return chatMM.pinChatSuggested && chatMM.expireTime > ((double) mqi0.m155944o());
    }
}
