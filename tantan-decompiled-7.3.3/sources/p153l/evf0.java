package p153l;

import com.p051p1.mobile.putong.core.data.ChatMM;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes12.dex */
public class evf0 {
    /* JADX INFO: renamed from: a */
    public static boolean m122800a(Conversation conversation) {
        if (!gta.m132210e().m132214d().mo34776W8() || !NullChecker.m82486a(conversation) || !NullChecker.m82486a(conversation.additional) || !NullChecker.m82486a(conversation.additional.chatMM)) {
            return false;
        }
        ChatMM chatMM = conversation.additional.chatMM;
        return chatMM.pinChatSuggested && chatMM.expireTime > ((double) pzi0.m174454o());
    }
}
