package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.InsertConversationUser;
import com.p051p1.mobile.putong.core.data.InsertConversationsList;
import com.p051p1.mobile.putong.data.ConversationCounter;
import com.p051p1.mobile.putong.data.Counter;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes6.dex */
public class dsc0 {
    /* JADX INFO: renamed from: b */
    public static int m117723b(Counter counter, ConversationCounter conversationCounter, Boolean bool) {
        if (!NullChecker.m82486a(counter) || !NullChecker.m82486a(conversationCounter) || !NullChecker.m82486a(bool)) {
            return 0;
        }
        int iMo34680E7 = gta.m132210e().m132214d().mo34680E7(conversationCounter.conversations) + conversationCounter.messages.unread + (bool.booleanValue() ? 1 : 0);
        if (f7e.m124437a() && CoreModule.f18264c.f20381e0.f89143V0.get().intValue() < 2 && !gra.m131626S2()) {
            iMo34680E7 -= conversationCounter.messages.liunread;
        }
        InsertConversationsList insertConversationsListM222761e = r8n.m180219f().f161728b.m222761e();
        return (NullChecker.m82486a(insertConversationsListM222761e) && NullChecker.m82486a(insertConversationsListM222761e.users)) ? iMo34680E7 + jyb.m147506f(insertConversationsListM222761e.users, new qcj() { // from class: l.csc0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((InsertConversationUser) obj).clicked.booleanValue());
            }
        }) : iMo34680E7;
    }
}
