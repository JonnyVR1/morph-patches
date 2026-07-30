package p149l;

import com.p046p1.mobile.putong.core.data.ChatMM;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.data.Channel;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class ll6 {
    /* JADX INFO: renamed from: a */
    public static String m150405a(Conversation conversation) {
        if (conversation.isHeartbeatConv()) {
            return "heartbeat";
        }
        if (conversation.isQuickChatConv()) {
            return "quickchat";
        }
        if (User.isTeamAccount(conversation.f56011id)) {
            return "official";
        }
        return rd6.m178878o(conversation) ? Channel.fake : "chat";
    }

    /* JADX INFO: renamed from: b */
    public static int m150406b(Conversation conversation) {
        if (!ura.m195053e().m195057d().mo33773W8() || !NullChecker.m81303a(conversation) || !NullChecker.m81303a(conversation.additional) || !NullChecker.m81303a(conversation.additional.chatMM)) {
            return 0;
        }
        ChatMM chatMM = conversation.additional.chatMM;
        return (!chatMM.partnerSwitch || chatMM.level <= 2) ? 0 : 1;
    }

    /* JADX INFO: renamed from: c */
    public static int m150407c(Conversation conversation) {
        return vmf0.m198948a(conversation) ? 1 : 0;
    }

    /* JADX INFO: renamed from: d */
    public static int m150408d(Conversation conversation) {
        if (ura.m195053e().m195057d().mo33773W8() && NullChecker.m81303a(conversation) && NullChecker.m81303a(conversation.additional) && NullChecker.m81303a(conversation.additional.chatMM)) {
            return conversation.additional.chatMM.mmCnt;
        }
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public static int m150409e(Conversation conversation) {
        if (ura.m195053e().m195057d().mo33773W8() && NullChecker.m81303a(conversation) && NullChecker.m81303a(conversation.additional) && NullChecker.m81303a(conversation.additional.chatMM)) {
            return conversation.additional.chatMM.level;
        }
        return 0;
    }
}
