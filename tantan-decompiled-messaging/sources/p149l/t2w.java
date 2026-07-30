package p149l;

import androidx.annotation.Nullable;
import com.p046p1.mobile.longlink.msg.connector.LongLinkConversationMessage;
import com.p046p1.mobile.longlink.msg.connector.LongLinkMessage;
import com.p046p1.mobile.putong.data.PushMessage;
import com.p046p1.mobile.putong.data.PushMessageContent;
import com.p046p1.mobile.putong.data.PushMessageIntent;

/* JADX INFO: loaded from: classes9.dex */
public class t2w extends s2w<LongLinkConversationMessage.BlockConversation> {
    @Override // p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkConversationMessage.BlockConversation> mo94398b() {
        return LongLinkConversationMessage.BlockConversation.class;
    }

    @Override // p149l.sul
    @Nullable
    /* JADX INFO: renamed from: c */
    public String mo94754c() {
        return PushMessageIntent.conversation_single_blocked;
    }

    @Override // p149l.sul
    /* JADX INFO: renamed from: f */
    public LongLinkMessage.MsgTypeEnum mo94756f() {
        return LongLinkMessage.MsgTypeEnum.MSG_TYPE_CHAT_BLOCK;
    }

    @Override // p149l.s2w
    public void populatePushMessage(PushMessage pushMessage, ki60 ki60Var, LongLinkConversationMessage.BlockConversation blockConversation) {
        PushMessageContent pushMessageContent = new PushMessageContent();
        pushMessage.content = pushMessageContent;
        pushMessageContent.type = "conversation";
        pushMessageContent.f38804id = blockConversation.getOtherUserId();
    }
}
