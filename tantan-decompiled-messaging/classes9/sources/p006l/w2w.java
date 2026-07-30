package p006l;

import androidx.annotation.NonNull;
import com.p1.mobile.longlink.msg.connector.LongLinkConversationMessage;
import com.p1.mobile.longlink.msg.connector.LongLinkMessage;
import com.p1.mobile.putong.data.PushMessage;
import com.p1.mobile.putong.data.PushMessageContent;
import l.ki60;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class w2w extends s2w<LongLinkConversationMessage.CreateConversation> {
    @Override // p006l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkConversationMessage.CreateConversation> mo11743b() {
        return LongLinkConversationMessage.CreateConversation.class;
    }

    @Override // p006l.sul
    @NonNull
    /* JADX INFO: renamed from: c */
    public String mo11744c() {
        return "conversation.list";
    }

    @Override // p006l.sul
    /* JADX INFO: renamed from: f */
    public LongLinkMessage.MsgTypeEnum mo11746f() {
        return LongLinkMessage.MsgTypeEnum.MSG_TYPE_NEW_CONVERSATION;
    }

    @Override // p006l.s2w
    public void populatePushMessage(PushMessage pushMessage, ki60 ki60Var, LongLinkConversationMessage.CreateConversation createConversation) {
        PushMessageContent pushMessageContent = new PushMessageContent();
        pushMessage.content = pushMessageContent;
        pushMessageContent.type = "conversation";
        pushMessageContent.id = createConversation.getOtherUserId();
    }
}
