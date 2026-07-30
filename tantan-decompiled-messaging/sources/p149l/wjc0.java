package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.InsertConversationUser;
import com.p046p1.mobile.putong.core.data.InsertConversationsList;
import com.p046p1.mobile.putong.data.ConversationCounter;
import com.p046p1.mobile.putong.data.Counter;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes8.dex */
public class wjc0 {
    /* JADX INFO: renamed from: b */
    public static int m203413b(Counter counter, ConversationCounter conversationCounter, Boolean bool) {
        if (!NullChecker.m81303a(counter) || !NullChecker.m81303a(conversationCounter) || !NullChecker.m81303a(bool)) {
            return 0;
        }
        int iMo33677E7 = ura.m195053e().m195057d().mo33677E7(conversationCounter.conversations) + conversationCounter.messages.unread + (bool.booleanValue() ? 1 : 0);
        if (q5e.m173001a() && CoreModule.f17545c.f19639e0.f149286V0.get().intValue() < 2 && !upa.m194695S2()) {
            iMo33677E7 -= conversationCounter.messages.liunread;
        }
        InsertConversationsList insertConversationsListM221515e = r6n.m178067f().f157954b.m221515e();
        return (NullChecker.m81303a(insertConversationsListM221515e) && NullChecker.m81303a(insertConversationsListM221515e.users)) ? iMo33677E7 + vwb.m200323f(insertConversationsListM221515e.users, new w9j() { // from class: l.vjc0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((InsertConversationUser) obj).clicked.booleanValue());
            }
        }) : iMo33677E7;
    }
}
