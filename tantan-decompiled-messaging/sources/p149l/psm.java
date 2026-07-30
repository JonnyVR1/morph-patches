package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.CoreInnerPush;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class psm {
    /* JADX INFO: renamed from: a */
    public static CoreInnerPush.C4716a m171181a(User user, Message message) {
        CoreInnerPush.C4716a c4716a = new CoreInnerPush.C4716a(user.f56011id);
        c4716a.f19175a = user.name;
        String str = message.cid;
        c4716a.f19180f = str;
        Conversation conversationM33216zp = CoreModule.f17545c.f19642f0.m33216zp(str);
        c4716a.f19177c = sw6.m186126a(user).profileSmall().formatted();
        if ((NullChecker.m81303a(conversationM33216zp) && conversationM33216zp.isAnonymous()) || (NullChecker.m81303a(message) && TEnum.equals(message.channel, "anonymous"))) {
            c4716a.f19177c = user.getAnonymousUrl();
        }
        c4716a.f19179e = false;
        if (NullChecker.m81303a(conversationM33216zp) && conversationM33216zp.isFakeOneSideConv() && conversationM33216zp.f20374mm <= 0 && !CoreModule.f17545c.f19639e0.m169520na().isSVIP()) {
            c4716a.f19176b = "收到一条消息";
            c4716a.f19179e = true;
        } else if (TEnum.equals(message.messageType(), "picture")) {
            c4716a.f19176b = CoreModule.f17544b.getResources().getString(R$string.f17616Bj, "");
        } else if (TEnum.equals(message.messageType(), "audio")) {
            c4716a.f19176b = CoreModule.f17544b.getResources().getString(R$string.f17586Aj, "");
        } else {
            User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
            c4716a.f19176b = (NullChecker.m81303a(userM169527p9.settings) && userM169527p9.settings.previewPushMessage().booleanValue()) ? rza.m181728H0(message) : CoreModule.f17544b.getResources().getString(R$string.f17646Cj, "");
        }
        su4.m185999i(user.f56011id);
        return c4716a;
    }

    /* JADX INFO: renamed from: b */
    public static CoreInnerPush.C4716a m171182b(User user, Message message) {
        CoreInnerPush.C4716a c4716a = new CoreInnerPush.C4716a();
        c4716a.f19179e = false;
        c4716a.f19175a = "消息发送失败";
        c4716a.f19177c = user.m60124fp().profileSmall().formatted();
        Conversation conversationM33216zp = CoreModule.f17545c.f19642f0.m33216zp(message.cid);
        c4716a.f19177c = sw6.m186126a(user).profileSmall().formatted();
        if ((NullChecker.m81303a(conversationM33216zp) && conversationM33216zp.isAnonymous()) || (NullChecker.m81303a(message) && TEnum.equals(message.channel, "anonymous"))) {
            c4716a.f19177c = user.getAnonymousUrl();
        }
        return c4716a;
    }

    /* JADX INFO: renamed from: c */
    public static CoreInnerPush.C4716a m171183c(User user, Message message) {
        CoreInnerPush.C4716a c4716a = new CoreInnerPush.C4716a();
        c4716a.f19179e = false;
        c4716a.f19175a = CoreModule.f17544b.getResources().getString(R$string.f17734Fh);
        c4716a.f19177c = user.m60124fp().profileSmall().formatted();
        Conversation conversationM33216zp = CoreModule.f17545c.f19642f0.m33216zp(message.cid);
        c4716a.f19177c = sw6.m186126a(user).profileSmall().formatted();
        if ((NullChecker.m81303a(conversationM33216zp) && conversationM33216zp.isAnonymous()) || (NullChecker.m81303a(message) && TEnum.equals(message.channel, "anonymous"))) {
            c4716a.f19177c = user.getAnonymousUrl();
        }
        return c4716a;
    }
}
