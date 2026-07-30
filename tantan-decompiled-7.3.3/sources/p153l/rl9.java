package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.ConversationType;
import com.p051p1.mobile.putong.data.VirtualVoiceGroupConversationCell;
import com.p051p1.mobile.putong.data.VirtualVoiceGroupConversationItemInfo;
import com.tantanapp.common.data.orm.Filter;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public class rl9 extends dy6 {
    public rl9(C4883c c4883c) {
        super(c4883c);
    }

    /* JADX INFO: renamed from: c3 */
    public static /* synthetic */ void m181931c3(VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell) {
        Conversation conversationQuery = CoreModule.f18272k.f115545m.query("conversation_virtual_voice" + virtualVoiceGroupConversationCell.roomInfo.roomId);
        if (conversationQuery != null) {
            conversationQuery.level = conversationQuery.level == 100 ? 0 : 100;
            conversationQuery.localExtraInfo = virtualVoiceGroupConversationCell.roomInfo.title;
            CoreModule.f18264c.f20384f0.m34053mq(conversationQuery);
        }
    }

    /* JADX INFO: renamed from: e3 */
    public final void m181933e3() {
        int i = 0;
        Iterator<Conversation> it = CoreModule.f18272k.f115545m.query(Filter.AND(Conversation.CONVTYPE.mo61359EQ(ConversationType.virtualvoice)), Conversation.UPDATEDTIME.DESC, 0).iterator();
        while (it.hasNext()) {
            VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell = it.next().additional.liveVirtualVoice;
            if (virtualVoiceGroupConversationCell != null) {
                VirtualVoiceGroupConversationItemInfo virtualVoiceGroupConversationItemInfo = virtualVoiceGroupConversationCell.cellInfo;
                if (virtualVoiceGroupConversationItemInfo.isRemind && !virtualVoiceGroupConversationItemInfo.isRemoved && !virtualVoiceGroupConversationItemInfo.isDissolved) {
                    i += virtualVoiceGroupConversationCell.chatInfo.unreadedCount;
                }
            }
        }
        CoreModule.m30934Q().mo68463r9().mo108370d().m137019l(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: f3 */
    public final /* synthetic */ void m181934f3(VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell) {
        tu2.m192703a("DbCheck", "delete voice step transaction remove");
        String str = "conversation_virtual_voice" + virtualVoiceGroupConversationCell.roomInfo.roomId;
        if (CoreModule.f18272k.f115545m.query(str) != null) {
            CoreModule.f18264c.f20384f0.m33631Ef(str);
        }
        m181933e3();
    }

    /* JADX INFO: renamed from: g3 */
    public final /* synthetic */ void m181935g3(final VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell) {
        tu2.m192703a("DbCheck", "delete voice step io remove");
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.ql9
            @Override // p153l.x20
            public final void call() {
                this.f158213a.m181934f3(virtualVoiceGroupConversationCell);
            }
        });
    }

    /* JADX INFO: renamed from: h3 */
    public final /* synthetic */ void m181936h3(final VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell) {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.pl9
            @Override // p153l.x20
            public final void call() {
                rl9.m181931c3(virtualVoiceGroupConversationCell);
            }
        });
    }

    /* JADX INFO: renamed from: i3 */
    public void m181937i3(final VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell) {
        tu2.m192703a("DbCheck", "delete voice step remove");
        l51.m152919y(new Runnable() { // from class: l.ol9
            @Override // java.lang.Runnable
            public final void run() {
                this.f147815a.m181935g3(virtualVoiceGroupConversationCell);
            }
        });
    }

    /* JADX INFO: renamed from: j3 */
    public void m181938j3(final VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell) {
        l51.m152919y(new Runnable() { // from class: l.nl9
            @Override // java.lang.Runnable
            public final void run() {
                this.f142517a.m181936h3(virtualVoiceGroupConversationCell);
            }
        });
    }
}
