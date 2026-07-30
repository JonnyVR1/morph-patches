package p003l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.messages.manager.insert.InsertLocalMsgTriggerType;
import com.p000p1.mobile.putong.core.p001ui.messages.manager.insert.LocalMsgInsertType;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ChatInviteToVerifyConfig;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageType;
import com.p1.mobile.putong.core.newui.messages.util.ConversationCounterTypeSp;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.data.orm.Filter;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.mqi0;
import l.y19;
import p014rx.subjects.C1185a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class cuv implements hul {
    @Override // p003l.hul
    /* JADX INFO: renamed from: a */
    public LocalMsgInsertType mo3175a() {
        return LocalMsgInsertType.INVITATION_FOR_AUTHENTICATION;
    }

    @Override // p003l.hul
    /* JADX INFO: renamed from: b */
    public void mo3176b(Conversation conversation, @Nullable Message message, @Nullable User user, User user2, InsertLocalMsgTriggerType insertLocalMsgTriggerType, List<LocalMsgInsertType> list, C1185a<Boolean> c1185a) {
        if (CoreModule.k.c.count(Filter.AND(new Filter[]{Message.CID.EQ(((DbObject) conversation).id), Message.MESSAGETYPE.EQ("local_invitation_for_authentication")}), 1) > 0) {
            c1185a.onNext(Boolean.FALSE);
            return;
        }
        CoreModule.c.f0.dh(((DbObject) conversation).id, MessageType.get("local_invitation_for_authentication"));
        ConversationCounterTypeSp.IsInsertInviationForAuthentication.setLong(String.valueOf(((DbObject) conversation)._id), mqi0.o());
        c1185a.onNext(Boolean.TRUE);
    }

    @Override // p003l.hul
    /* JADX INFO: renamed from: c */
    public boolean mo3177c(InsertLocalMsgTriggerType insertLocalMsgTriggerType, Conversation conversation, @Nullable Message message, User user) {
        if (user.isPicVerificationVerified()) {
            User userOa = CoreModule.c.e0.oa(((DbObject) conversation).id);
            if (!NullChecker.a(userOa) || userOa.isPicVerificationVerified() || TextUtils.equals(conversation.convType, "group") || ((DbObject) conversation)._id <= 0 || TextUtils.equals(conversation.convType, "quickchat") || ConversationCounterTypeSp.IsInsertInviationForAuthentication.getLong(String.valueOf(((DbObject) conversation)._id)) > 0) {
                return false;
            }
            ChatInviteToVerifyConfig chatInviteToVerifyConfigH = y19.h();
            if (NullChecker.a(chatInviteToVerifyConfigH) && chatInviteToVerifyConfigH.enable) {
                double d = Double.parseDouble(chatInviteToVerifyConfigH.functionStartTime);
                if (conversation.mm >= chatInviteToVerifyConfigH.insertMessageLiming && conversation.latestTime > d) {
                    return true;
                }
            }
        }
        return false;
    }
}
