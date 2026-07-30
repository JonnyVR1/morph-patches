package p006l;

import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.data.VirtualVoiceGroupConversationCell;
import com.p1.mobile.putong.data.VirtualVoiceGroupConversationItemInfo;
import com.tantanapp.common.data.orm.Filter;
import com.tantanapp.common.data.orm.OrderedColumn;
import java.util.Iterator;
import l.d30;
import l.du2;
import l.e51;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ik9 extends ax6 {
    public ik9(C0158c c0158c) {
        super(c0158c);
    }

    /* JADX INFO: renamed from: c3 */
    public static /* synthetic */ void m16721c3(VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell) {
        Conversation conversationQuery = CoreModule.f1542k.f11205m.query("conversation_virtual_voice" + virtualVoiceGroupConversationCell.roomInfo.roomId);
        if (conversationQuery != null) {
            conversationQuery.level = conversationQuery.level == 100 ? 0 : 100;
            conversationQuery.localExtraInfo = virtualVoiceGroupConversationCell.roomInfo.title;
            CoreModule.f1534c.f3631f0.m4980mq(conversationQuery);
        }
    }

    /* JADX INFO: renamed from: e3 */
    public final void m16723e3() {
        int i = 0;
        Iterator it = CoreModule.f1542k.f11205m.query(Filter.AND(new Filter[]{Conversation.CONVTYPE.EQ("virtualvoice")}), ((OrderedColumn) Conversation.UPDATEDTIME).DESC, 0).iterator();
        while (it.hasNext()) {
            VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell = ((Conversation) it.next()).additional.liveVirtualVoice;
            if (virtualVoiceGroupConversationCell != null) {
                VirtualVoiceGroupConversationItemInfo virtualVoiceGroupConversationItemInfo = virtualVoiceGroupConversationCell.cellInfo;
                if (virtualVoiceGroupConversationItemInfo.isRemind && !virtualVoiceGroupConversationItemInfo.isRemoved && !virtualVoiceGroupConversationItemInfo.isDissolved) {
                    i += virtualVoiceGroupConversationCell.chatInfo.unreadedCount;
                }
            }
        }
        CoreModule.m1855Q().r9().d().onNext(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: f3 */
    public final /* synthetic */ void m16724f3(VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell) {
        du2.a("DbCheck", "delete voice step transaction remove");
        String str = "conversation_virtual_voice" + virtualVoiceGroupConversationCell.roomInfo.roomId;
        if (CoreModule.f1542k.f11205m.query(str) != null) {
            CoreModule.f1534c.f3631f0.m4558Ef(str);
        }
        m16723e3();
    }

    /* JADX INFO: renamed from: g3 */
    public final /* synthetic */ void m16725g3(final VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell) {
        du2.a("DbCheck", "delete voice step io remove");
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.hk9
            public final void call() {
                this.f13921a.m16724f3(virtualVoiceGroupConversationCell);
            }
        });
    }

    /* JADX INFO: renamed from: h3 */
    public final /* synthetic */ void m16726h3(final VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell) {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.gk9
            public final void call() {
                ik9.m16721c3(virtualVoiceGroupConversationCell);
            }
        });
    }

    /* JADX INFO: renamed from: i3 */
    public void m16727i3(final VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell) {
        du2.a("DbCheck", "delete voice step remove");
        e51.y(new Runnable() { // from class: l.fk9
            @Override // java.lang.Runnable
            public final void run() {
                this.f12744a.m16725g3(virtualVoiceGroupConversationCell);
            }
        });
    }

    /* JADX INFO: renamed from: j3 */
    public void m16728j3(final VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell) {
        e51.y(new Runnable() { // from class: l.ek9
            @Override // java.lang.Runnable
            public final void run() {
                this.f11212a.m16726h3(virtualVoiceGroupConversationCell);
            }
        });
    }
}
