package p149l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.ConversationType;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.p053ui.messages.manager.insert.InsertLocalMsgTriggerType;
import com.p046p1.mobile.putong.core.p053ui.messages.manager.insert.LocalMsgInsertType;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.orm.Filter;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes3.dex */
public class buv implements hul {
    @Override // p149l.hul
    /* JADX INFO: renamed from: a */
    public LocalMsgInsertType mo103994a() {
        return LocalMsgInsertType.INTL_READ_RECEIPTS_GUIDE;
    }

    @Override // p149l.hul
    /* JADX INFO: renamed from: b */
    public void mo103995b(final Conversation conversation, @Nullable Message message, @Nullable User user, User user2, InsertLocalMsgTriggerType insertLocalMsgTriggerType, List<LocalMsgInsertType> list, C22392a<Boolean> c22392a) {
        if (CoreModule.f17545c.f19555C0.m210101J3() || CoreModule.f17553k.f91940c.m206060R(conversation.f56011id, conversation.clearedTime, true).m165612e() > 0) {
            if (m103997f(conversation) > 0) {
                CoreModule.f17545c.f19609U.m109085a(new d30() { // from class: l.ztv
                    @Override // p149l.d30
                    public final void call() {
                        CoreModule.f17553k.f91940c.delete(Filter.AND(Message.CID.mo60175EQ(conversation.f56011id), Message.MESSAGETYPE.m60176EQ(MessageType.local_intl_read_receipts_guide)));
                    }
                });
            }
        } else if (m103997f(conversation) <= 0) {
            CoreModule.f17545c.f19609U.m109085a(new d30() { // from class: l.auv
                @Override // p149l.d30
                public final void call() {
                    this.f71864a.m103998g(conversation);
                }
            });
            c22392a.m132487l(Boolean.TRUE);
            return;
        }
        c22392a.m132487l(Boolean.FALSE);
    }

    @Override // p149l.hul
    /* JADX INFO: renamed from: c */
    public boolean mo103996c(InsertLocalMsgTriggerType insertLocalMsgTriggerType, Conversation conversation, @Nullable Message message, User user) {
        if ((insertLocalMsgTriggerType == InsertLocalMsgTriggerType.PAGE_INIT || insertLocalMsgTriggerType == InsertLocalMsgTriggerType.CONV_MSG_CHANGE) && conversation != null && !conversation.f56011id.startsWith(User.ID_TEAM_ACCOUNT) && TEnum.equals(conversation.status, "default")) {
            return (TextUtils.equals(conversation.convType, "default") || TextUtils.equals(conversation.convType, "heartbeatMatch") || TextUtils.equals(conversation.convType, "compliment") || TextUtils.equals(conversation.convType, ConversationType.swiper)) && !m103999h(user, conversation);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final int m103997f(Conversation conversation) {
        return CoreModule.f17553k.f91940c.m206084p0(conversation.f56011id, conversation.clearedTime, MessageType.local_intl_read_receipts_guide).m165612e();
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m103998g(Conversation conversation) {
        if (m103997f(conversation) <= 0) {
            CoreModule.f17545c.f19642f0.m32798Sg(conversation.f56011id, conversation.clearedTime);
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m103999h(User user, Conversation conversation) {
        return NullChecker.m81303a(conversation) && ruy.m181215g().m181221i(CoreModule.f17545c.f19639e0.m169524oa(conversation.otherUser), user) && TEnum.equals(conversation.property.chatInterrupt.stage, "locked");
    }
}
