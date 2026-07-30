package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.CoreInnerPush;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class rum {
    /* JADX INFO: renamed from: a */
    public static CoreInnerPush.C4867a m183203a(User user, Message message) {
        CoreInnerPush.C4867a c4867a = new CoreInnerPush.C4867a(user.f56859id);
        c4867a.f19916a = user.name;
        String str = message.cid;
        c4867a.f19921f = str;
        Conversation conversationM34219zp = CoreModule.f18264c.f20384f0.m34219zp(str);
        c4867a.f19918c = vx6.m203837a(user).profileSmall().formatted();
        if ((NullChecker.m82486a(conversationM34219zp) && conversationM34219zp.isAnonymous()) || (NullChecker.m82486a(message) && TEnum.equals(message.channel, "anonymous"))) {
            c4867a.f19918c = user.getAnonymousUrl();
        }
        c4867a.f19920e = false;
        if (NullChecker.m82486a(conversationM34219zp) && conversationM34219zp.isFakeOneSideConv() && conversationM34219zp.f21116mm <= 0 && !CoreModule.f18264c.f20381e0.m116593na().isSVIP()) {
            c4867a.f19917b = "收到一条消息";
            c4867a.f19920e = true;
        } else if (TEnum.equals(message.messageType(), "picture")) {
            c4867a.f19917b = CoreModule.f18263b.getResources().getString(R$string.f19006Xj, "");
        } else if (TEnum.equals(message.messageType(), "audio")) {
            c4867a.f19917b = CoreModule.f18263b.getResources().getString(R$string.f18976Wj, "");
        } else {
            User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
            c4867a.f19917b = (NullChecker.m82486a(userM116600p9.settings) && userM116600p9.settings.previewPushMessage().booleanValue()) ? e1b.m118950H0(message) : CoreModule.f18263b.getResources().getString(R$string.f19036Yj, "");
        }
        rv4.m183259i(user.f56859id);
        return c4867a;
    }

    /* JADX INFO: renamed from: b */
    public static CoreInnerPush.C4867a m183204b(User user, Message message) {
        CoreInnerPush.C4867a c4867a = new CoreInnerPush.C4867a();
        c4867a.f19920e = false;
        c4867a.f19916a = "消息发送失败";
        c4867a.f19918c = user.m61308fp().profileSmall().formatted();
        Conversation conversationM34219zp = CoreModule.f18264c.f20384f0.m34219zp(message.cid);
        c4867a.f19918c = vx6.m203837a(user).profileSmall().formatted();
        if ((NullChecker.m82486a(conversationM34219zp) && conversationM34219zp.isAnonymous()) || (NullChecker.m82486a(message) && TEnum.equals(message.channel, "anonymous"))) {
            c4867a.f19918c = user.getAnonymousUrl();
        }
        return c4867a;
    }

    /* JADX INFO: renamed from: c */
    public static CoreInnerPush.C4867a m183205c(User user, Message message) {
        CoreInnerPush.C4867a c4867a = new CoreInnerPush.C4867a();
        c4867a.f19920e = false;
        c4867a.f19916a = CoreModule.f18263b.getResources().getString(R$string.f19095ai);
        c4867a.f19918c = user.m61308fp().profileSmall().formatted();
        Conversation conversationM34219zp = CoreModule.f18264c.f20384f0.m34219zp(message.cid);
        c4867a.f19918c = vx6.m203837a(user).profileSmall().formatted();
        if ((NullChecker.m82486a(conversationM34219zp) && conversationM34219zp.isAnonymous()) || (NullChecker.m82486a(message) && TEnum.equals(message.channel, "anonymous"))) {
            c4867a.f19918c = user.getAnonymousUrl();
        }
        return c4867a;
    }
}
