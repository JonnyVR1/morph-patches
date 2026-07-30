package p153l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ChatInviteToVerifyConfig;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.newui.messages.util.ConversationCounterTypeSp;
import com.p051p1.mobile.putong.core.p058ui.messages.manager.insert.InsertLocalMsgTriggerType;
import com.p051p1.mobile.putong.core.p058ui.messages.manager.insert.LocalMsgInsertType;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.data.orm.Filter;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes3.dex */
public class dwv implements vwl {
    @Override // p153l.vwl
    /* JADX INFO: renamed from: a */
    public LocalMsgInsertType mo112939a() {
        return LocalMsgInsertType.INVITATION_FOR_AUTHENTICATION;
    }

    @Override // p153l.vwl
    /* JADX INFO: renamed from: b */
    public void mo112940b(Conversation conversation, @Nullable Message message, @Nullable User user, User user2, InsertLocalMsgTriggerType insertLocalMsgTriggerType, List<LocalMsgInsertType> list, C22507a<Boolean> c22507a) {
        if (CoreModule.f18272k.f115535c.count(Filter.AND(Message.CID.mo61359EQ(conversation.f56859id), Message.MESSAGETYPE.m61360EQ(MessageType.local_invitation_for_authentication)), 1) > 0) {
            c22507a.m137019l(Boolean.FALSE);
            return;
        }
        CoreModule.f18264c.f20384f0.m33933dh(conversation.f56859id, MessageType.get(MessageType.local_invitation_for_authentication));
        ConversationCounterTypeSp.IsInsertInviationForAuthentication.setLong(String.valueOf(conversation._id), pzi0.m174454o());
        c22507a.m137019l(Boolean.TRUE);
    }

    @Override // p153l.vwl
    /* JADX INFO: renamed from: c */
    public boolean mo112941c(InsertLocalMsgTriggerType insertLocalMsgTriggerType, Conversation conversation, @Nullable Message message, User user) {
        if (user.isPicVerificationVerified()) {
            User userM116597oa = CoreModule.f18264c.f20381e0.m116597oa(conversation.f56859id);
            if (!NullChecker.m82486a(userM116597oa) || userM116597oa.isPicVerificationVerified() || TextUtils.equals(conversation.convType, "group") || conversation._id <= 0 || TextUtils.equals(conversation.convType, "quickchat") || ConversationCounterTypeSp.IsInsertInviationForAuthentication.getLong(String.valueOf(conversation._id)) > 0) {
                return false;
            }
            ChatInviteToVerifyConfig chatInviteToVerifyConfigM133444h = h39.m133444h();
            if (NullChecker.m82486a(chatInviteToVerifyConfigM133444h) && chatInviteToVerifyConfigM133444h.enable) {
                double d = Double.parseDouble(chatInviteToVerifyConfigM133444h.functionStartTime);
                if (conversation.f21116mm >= chatInviteToVerifyConfigM133444h.insertMessageLiming && conversation.latestTime > d) {
                    return true;
                }
            }
        }
        return false;
    }
}
