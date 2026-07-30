package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.ConversationType;
import com.p046p1.mobile.putong.data.VirtualVoiceGroupConversationCell;
import com.p046p1.mobile.putong.data.VirtualVoiceGroupConversationItemInfo;
import com.tantanapp.common.data.orm.Filter;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public class ik9 extends ax6 {
    public ik9(C4732c c4732c) {
        super(c4732c);
    }

    /* JADX INFO: renamed from: c3 */
    public static /* synthetic */ void m136778c3(VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell) {
        Conversation conversationQuery = CoreModule.f17553k.f91950m.query("conversation_virtual_voice" + virtualVoiceGroupConversationCell.roomInfo.roomId);
        if (conversationQuery != null) {
            conversationQuery.level = conversationQuery.level == 100 ? 0 : 100;
            conversationQuery.localExtraInfo = virtualVoiceGroupConversationCell.roomInfo.title;
            CoreModule.f17545c.f19642f0.m33050mq(conversationQuery);
        }
    }

    /* JADX INFO: renamed from: e3 */
    public final void m136780e3() {
        int i = 0;
        Iterator<Conversation> it = CoreModule.f17553k.f91950m.query(Filter.AND(Conversation.CONVTYPE.mo60175EQ(ConversationType.virtualvoice)), Conversation.UPDATEDTIME.DESC, 0).iterator();
        while (it.hasNext()) {
            VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell = it.next().additional.liveVirtualVoice;
            if (virtualVoiceGroupConversationCell != null) {
                VirtualVoiceGroupConversationItemInfo virtualVoiceGroupConversationItemInfo = virtualVoiceGroupConversationCell.cellInfo;
                if (virtualVoiceGroupConversationItemInfo.isRemind && !virtualVoiceGroupConversationItemInfo.isRemoved && !virtualVoiceGroupConversationItemInfo.isDissolved) {
                    i += virtualVoiceGroupConversationCell.chatInfo.unreadedCount;
                }
            }
        }
        CoreModule.m29936Q().mo67280r9().mo123878d().m132487l(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: f3 */
    public final /* synthetic */ void m136781f3(VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell) {
        du2.m113670a("DbCheck", "delete voice step transaction remove");
        String str = "conversation_virtual_voice" + virtualVoiceGroupConversationCell.roomInfo.roomId;
        if (CoreModule.f17553k.f91950m.query(str) != null) {
            CoreModule.f17545c.f19642f0.m32628Ef(str);
        }
        m136780e3();
    }

    /* JADX INFO: renamed from: g3 */
    public final /* synthetic */ void m136782g3(final VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell) {
        du2.m113670a("DbCheck", "delete voice step io remove");
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.hk9
            @Override // p149l.d30
            public final void call() {
                this.f108166a.m136781f3(virtualVoiceGroupConversationCell);
            }
        });
    }

    /* JADX INFO: renamed from: h3 */
    public final /* synthetic */ void m136783h3(final VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell) {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.gk9
            @Override // p149l.d30
            public final void call() {
                ik9.m136778c3(virtualVoiceGroupConversationCell);
            }
        });
    }

    /* JADX INFO: renamed from: i3 */
    public void m136784i3(final VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell) {
        du2.m113670a("DbCheck", "delete voice step remove");
        e51.m114774y(new Runnable() { // from class: l.fk9
            @Override // java.lang.Runnable
            public final void run() {
                this.f98048a.m136782g3(virtualVoiceGroupConversationCell);
            }
        });
    }

    /* JADX INFO: renamed from: j3 */
    public void m136785j3(final VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell) {
        e51.m114774y(new Runnable() { // from class: l.ek9
            @Override // java.lang.Runnable
            public final void run() {
                this.f91958a.m136783h3(virtualVoiceGroupConversationCell);
            }
        });
    }
}
