package p153l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.ConversationType;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.p058ui.messages.manager.insert.InsertLocalMsgTriggerType;
import com.p051p1.mobile.putong.core.p058ui.messages.manager.insert.LocalMsgInsertType;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.orm.Filter;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes3.dex */
public class cwv implements vwl {
    @Override // p153l.vwl
    /* JADX INFO: renamed from: a */
    public LocalMsgInsertType mo112939a() {
        return LocalMsgInsertType.INTL_READ_RECEIPTS_GUIDE;
    }

    @Override // p153l.vwl
    /* JADX INFO: renamed from: b */
    public void mo112940b(final Conversation conversation, @Nullable Message message, @Nullable User user, User user2, InsertLocalMsgTriggerType insertLocalMsgTriggerType, List<LocalMsgInsertType> list, C22507a<Boolean> c22507a) {
        if (CoreModule.f18264c.f20297C0.m146414K3() || CoreModule.f18272k.f115535c.m189456R(conversation.f56859id, conversation.clearedTime, true).m208669e() > 0) {
            if (m112942f(conversation) > 0) {
                CoreModule.f18264c.f20351U.m128074a(new x20() { // from class: l.awv
                    @Override // p153l.x20
                    public final void call() {
                        CoreModule.f18272k.f115535c.delete(Filter.AND(Message.CID.mo61359EQ(conversation.f56859id), Message.MESSAGETYPE.m61360EQ(MessageType.local_intl_read_receipts_guide)));
                    }
                });
            }
        } else if (m112942f(conversation) <= 0) {
            CoreModule.f18264c.f20351U.m128074a(new x20() { // from class: l.bwv
                @Override // p153l.x20
                public final void call() {
                    this.f78792a.m112943g(conversation);
                }
            });
            c22507a.m137019l(Boolean.TRUE);
            return;
        }
        c22507a.m137019l(Boolean.FALSE);
    }

    @Override // p153l.vwl
    /* JADX INFO: renamed from: c */
    public boolean mo112941c(InsertLocalMsgTriggerType insertLocalMsgTriggerType, Conversation conversation, @Nullable Message message, User user) {
        if ((insertLocalMsgTriggerType == InsertLocalMsgTriggerType.PAGE_INIT || insertLocalMsgTriggerType == InsertLocalMsgTriggerType.CONV_MSG_CHANGE) && conversation != null && !conversation.f56859id.startsWith(User.ID_TEAM_ACCOUNT) && TEnum.equals(conversation.status, "default")) {
            return (TextUtils.equals(conversation.convType, "default") || TextUtils.equals(conversation.convType, "heartbeatMatch") || TextUtils.equals(conversation.convType, "compliment") || TextUtils.equals(conversation.convType, ConversationType.swiper)) && !m112944h(user, conversation);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final int m112942f(Conversation conversation) {
        return CoreModule.f18272k.f115535c.m189480p0(conversation.f56859id, conversation.clearedTime, MessageType.local_intl_read_receipts_guide).m208669e();
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m112943g(Conversation conversation) {
        if (m112942f(conversation) <= 0) {
            CoreModule.f18264c.f20384f0.m33801Sg(conversation.f56859id, conversation.clearedTime);
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m112944h(User user, Conversation conversation) {
        return NullChecker.m82486a(conversation) && o3z.m165898g().m165904i(CoreModule.f18264c.f20381e0.m116597oa(conversation.otherUser), user) && TEnum.equals(conversation.property.chatInterrupt.stage, "locked");
    }
}
