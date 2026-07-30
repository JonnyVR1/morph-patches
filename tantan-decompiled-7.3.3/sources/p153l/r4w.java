package p153l;

import androidx.annotation.Nullable;
import com.p051p1.mobile.longlink.msg.connector.LongLinkConversationMessage;
import com.p051p1.mobile.longlink.msg.connector.LongLinkMessage;
import com.p051p1.mobile.putong.data.PushMessage;
import com.p051p1.mobile.putong.data.PushMessageContent;
import com.p051p1.mobile.putong.data.PushMessageIntent;

/* JADX INFO: loaded from: classes9.dex */
public class r4w extends q4w<LongLinkConversationMessage.BlockConversation> {
    @Override // p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkConversationMessage.BlockConversation> mo95510b() {
        return LongLinkConversationMessage.BlockConversation.class;
    }

    @Override // p153l.fxl
    @Nullable
    /* JADX INFO: renamed from: c */
    public String mo96253c() {
        return PushMessageIntent.conversation_single_blocked;
    }

    @Override // p153l.fxl
    /* JADX INFO: renamed from: f */
    public LongLinkMessage.MsgTypeEnum mo102648f() {
        return LongLinkMessage.MsgTypeEnum.MSG_TYPE_CHAT_BLOCK;
    }

    @Override // p153l.q4w
    public void populatePushMessage(PushMessage pushMessage, pq60 pq60Var, LongLinkConversationMessage.BlockConversation blockConversation) {
        PushMessageContent pushMessageContent = new PushMessageContent();
        pushMessage.content = pushMessageContent;
        pushMessageContent.type = "conversation";
        pushMessageContent.f39652id = blockConversation.getOtherUserId();
    }
}
