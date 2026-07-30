package p009l;

import com.p1.mobile.putong.core.data.ChatMM;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.ura;
import l.vmf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ll6 {
    /* JADX INFO: renamed from: a */
    public static String m17954a(Conversation conversation) {
        if (conversation.isHeartbeatConv()) {
            return "heartbeat";
        }
        if (conversation.isQuickChatConv()) {
            return "quickchat";
        }
        if (User.isTeamAccount(((DbObject) conversation).id)) {
            return "official";
        }
        return rd6.m21519o(conversation) ? "fake" : "chat";
    }

    /* JADX INFO: renamed from: b */
    public static int m17955b(Conversation conversation) {
        if (!ura.e().d().W8() || !NullChecker.a(conversation) || !NullChecker.a(conversation.additional) || !NullChecker.a(conversation.additional.chatMM)) {
            return 0;
        }
        ChatMM chatMM = conversation.additional.chatMM;
        return (!chatMM.partnerSwitch || chatMM.level <= 2) ? 0 : 1;
    }

    /* JADX INFO: renamed from: c */
    public static int m17956c(Conversation conversation) {
        return vmf0.a(conversation) ? 1 : 0;
    }

    /* JADX INFO: renamed from: d */
    public static int m17957d(Conversation conversation) {
        if (ura.e().d().W8() && NullChecker.a(conversation) && NullChecker.a(conversation.additional) && NullChecker.a(conversation.additional.chatMM)) {
            return conversation.additional.chatMM.mmCnt;
        }
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public static int m17958e(Conversation conversation) {
        if (ura.e().d().W8() && NullChecker.a(conversation) && NullChecker.a(conversation.additional) && NullChecker.a(conversation.additional.chatMM)) {
            return conversation.additional.chatMM.level;
        }
        return 0;
    }
}
