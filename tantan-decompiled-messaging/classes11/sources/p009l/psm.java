package p009l;

import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.api.CoreInnerPush;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.rza;
import l.su4;
import l.sw6;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class psm {
    /* JADX INFO: renamed from: a */
    public static CoreInnerPush.a m20627a(User user, Message message) {
        CoreInnerPush.a aVar = new CoreInnerPush.a(((DbObject) user).id);
        aVar.a = user.name;
        String str = message.cid;
        aVar.f = str;
        Conversation conversationZp = CoreModule.c.f0.zp(str);
        aVar.c = sw6.a(user).profileSmall().formatted();
        if ((NullChecker.a(conversationZp) && conversationZp.isAnonymous()) || (NullChecker.a(message) && TEnum.equals(message.channel, "anonymous"))) {
            aVar.c = user.getAnonymousUrl();
        }
        aVar.e = false;
        if (NullChecker.a(conversationZp) && conversationZp.isFakeOneSideConv() && conversationZp.mm <= 0 && !CoreModule.c.e0.na().isSVIP()) {
            aVar.b = "收到一条消息";
            aVar.e = true;
        } else if (TEnum.equals(message.messageType(), "picture")) {
            aVar.b = CoreModule.b.getResources().getString(R.string.Bj, "");
        } else if (TEnum.equals(message.messageType(), "audio")) {
            aVar.b = CoreModule.b.getResources().getString(R.string.Aj, "");
        } else {
            User userP9 = CoreModule.c.e0.p9();
            aVar.b = (NullChecker.a(userP9.settings) && userP9.settings.previewPushMessage().booleanValue()) ? rza.H0(message) : CoreModule.b.getResources().getString(R.string.Cj, "");
        }
        su4.i(((DbObject) user).id);
        return aVar;
    }

    /* JADX INFO: renamed from: b */
    public static CoreInnerPush.a m20628b(User user, Message message) {
        CoreInnerPush.a aVar = new CoreInnerPush.a();
        aVar.e = false;
        aVar.a = "消息发送失败";
        aVar.c = user.fp().profileSmall().formatted();
        Conversation conversationZp = CoreModule.c.f0.zp(message.cid);
        aVar.c = sw6.a(user).profileSmall().formatted();
        if ((NullChecker.a(conversationZp) && conversationZp.isAnonymous()) || (NullChecker.a(message) && TEnum.equals(message.channel, "anonymous"))) {
            aVar.c = user.getAnonymousUrl();
        }
        return aVar;
    }

    /* JADX INFO: renamed from: c */
    public static CoreInnerPush.a m20629c(User user, Message message) {
        CoreInnerPush.a aVar = new CoreInnerPush.a();
        aVar.e = false;
        aVar.a = CoreModule.b.getResources().getString(R.string.Fh);
        aVar.c = user.fp().profileSmall().formatted();
        Conversation conversationZp = CoreModule.c.f0.zp(message.cid);
        aVar.c = sw6.a(user).profileSmall().formatted();
        if ((NullChecker.a(conversationZp) && conversationZp.isAnonymous()) || (NullChecker.a(message) && TEnum.equals(message.channel, "anonymous"))) {
            aVar.c = user.getAnonymousUrl();
        }
        return aVar;
    }
}
