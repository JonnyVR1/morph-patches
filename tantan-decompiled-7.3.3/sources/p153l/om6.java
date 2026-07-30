package p153l;

import com.p051p1.mobile.putong.core.data.ChatMM;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.data.Channel;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class om6 {
    /* JADX INFO: renamed from: a */
    public static String m168195a(Conversation conversation) {
        if (conversation.isHeartbeatConv()) {
            return "heartbeat";
        }
        if (conversation.isQuickChatConv()) {
            return "quickchat";
        }
        if (User.isTeamAccount(conversation.f56859id)) {
            return "official";
        }
        return ue6.m195672o(conversation) ? Channel.fake : "chat";
    }

    /* JADX INFO: renamed from: b */
    public static int m168196b(Conversation conversation) {
        if (!gta.m132210e().m132214d().mo34776W8() || !NullChecker.m82486a(conversation) || !NullChecker.m82486a(conversation.additional) || !NullChecker.m82486a(conversation.additional.chatMM)) {
            return 0;
        }
        ChatMM chatMM = conversation.additional.chatMM;
        return (!chatMM.partnerSwitch || chatMM.level <= 2) ? 0 : 1;
    }

    /* JADX INFO: renamed from: c */
    public static int m168197c(Conversation conversation) {
        return evf0.m122800a(conversation) ? 1 : 0;
    }

    /* JADX INFO: renamed from: d */
    public static int m168198d(Conversation conversation) {
        if (gta.m132210e().m132214d().mo34776W8() && NullChecker.m82486a(conversation) && NullChecker.m82486a(conversation.additional) && NullChecker.m82486a(conversation.additional.chatMM)) {
            return conversation.additional.chatMM.mmCnt;
        }
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public static int m168199e(Conversation conversation) {
        if (gta.m132210e().m132214d().mo34776W8() && NullChecker.m82486a(conversation) && NullChecker.m82486a(conversation.additional) && NullChecker.m82486a(conversation.additional.chatMM)) {
            return conversation.additional.chatMM.level;
        }
        return 0;
    }
}
