package p007l;

import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.InsertConversationUser;
import com.p1.mobile.putong.core.data.InsertConversationsList;
import com.p1.mobile.putong.data.ConversationCounter;
import com.p1.mobile.putong.data.Counter;
import com.tantanapp.common.utils.NullChecker;
import l.q5e;
import l.r6n;
import l.upa;
import l.ura;
import l.vwb;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class wjc0 {
    /* JADX INFO: renamed from: b */
    public static int m11357b(Counter counter, ConversationCounter conversationCounter, Boolean bool) {
        if (!NullChecker.a(counter) || !NullChecker.a(conversationCounter) || !NullChecker.a(bool)) {
            return 0;
        }
        int iE7 = ura.e().d().E7(conversationCounter.conversations) + conversationCounter.messages.unread + (bool.booleanValue() ? 1 : 0);
        if (q5e.a() && ((Integer) CoreModule.c.e0.V0.get()).intValue() < 2 && !upa.S2()) {
            iE7 -= conversationCounter.messages.liunread;
        }
        InsertConversationsList insertConversationsList = (InsertConversationsList) r6n.f().b.e();
        return (NullChecker.a(insertConversationsList) && NullChecker.a(insertConversationsList.users)) ? iE7 + vwb.f(insertConversationsList.users, new w9j() { // from class: l.vjc0
            public final Object call(Object obj) {
                return Boolean.valueOf(!((InsertConversationUser) obj).clicked.booleanValue());
            }
        }) : iE7;
    }
}
