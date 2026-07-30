package p149l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ChatInviteToVerifyConfig;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.newui.messages.util.ConversationCounterTypeSp;
import com.p046p1.mobile.putong.core.p053ui.messages.manager.insert.InsertLocalMsgTriggerType;
import com.p046p1.mobile.putong.core.p053ui.messages.manager.insert.LocalMsgInsertType;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.data.orm.Filter;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes3.dex */
public class cuv implements hul {
    @Override // p149l.hul
    /* JADX INFO: renamed from: a */
    public LocalMsgInsertType mo103994a() {
        return LocalMsgInsertType.INVITATION_FOR_AUTHENTICATION;
    }

    @Override // p149l.hul
    /* JADX INFO: renamed from: b */
    public void mo103995b(Conversation conversation, @Nullable Message message, @Nullable User user, User user2, InsertLocalMsgTriggerType insertLocalMsgTriggerType, List<LocalMsgInsertType> list, C22392a<Boolean> c22392a) {
        if (CoreModule.f17553k.f91940c.count(Filter.AND(Message.CID.mo60175EQ(conversation.f56011id), Message.MESSAGETYPE.m60176EQ(MessageType.local_invitation_for_authentication)), 1) > 0) {
            c22392a.m132487l(Boolean.FALSE);
            return;
        }
        CoreModule.f17545c.f19642f0.m32930dh(conversation.f56011id, MessageType.get(MessageType.local_invitation_for_authentication));
        ConversationCounterTypeSp.IsInsertInviationForAuthentication.setLong(String.valueOf(conversation._id), mqi0.m155944o());
        c22392a.m132487l(Boolean.TRUE);
    }

    @Override // p149l.hul
    /* JADX INFO: renamed from: c */
    public boolean mo103996c(InsertLocalMsgTriggerType insertLocalMsgTriggerType, Conversation conversation, @Nullable Message message, User user) {
        if (user.isPicVerificationVerified()) {
            User userM169524oa = CoreModule.f17545c.f19639e0.m169524oa(conversation.f56011id);
            if (!NullChecker.m81303a(userM169524oa) || userM169524oa.isPicVerificationVerified() || TextUtils.equals(conversation.convType, "group") || conversation._id <= 0 || TextUtils.equals(conversation.convType, "quickchat") || ConversationCounterTypeSp.IsInsertInviationForAuthentication.getLong(String.valueOf(conversation._id)) > 0) {
                return false;
            }
            ChatInviteToVerifyConfig chatInviteToVerifyConfigM212173h = y19.m212173h();
            if (NullChecker.m81303a(chatInviteToVerifyConfigM212173h) && chatInviteToVerifyConfigM212173h.enable) {
                double d = Double.parseDouble(chatInviteToVerifyConfigM212173h.functionStartTime);
                if (conversation.f20374mm >= chatInviteToVerifyConfigM212173h.insertMessageLiming && conversation.latestTime > d) {
                    return true;
                }
            }
        }
        return false;
    }
}
