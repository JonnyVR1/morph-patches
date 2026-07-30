package p153l;

import androidx.annotation.NonNull;
import com.p051p1.mobile.longlink.msg.connector.LongLinkCoreChatMessage;
import com.p051p1.mobile.longlink.msg.connector.LongLinkMessage;
import com.p051p1.mobile.putong.data.PushMessage;
import com.p051p1.mobile.putong.data.PushMessageContent;
import com.p051p1.mobile.putong.data.PushMessageIntent;

/* JADX INFO: loaded from: classes9.dex */
public class s4w extends q4w<LongLinkCoreChatMessage.ChatMsg> {
    @Override // p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkCoreChatMessage.ChatMsg> mo95510b() {
        return LongLinkCoreChatMessage.ChatMsg.class;
    }

    @Override // p153l.fxl
    @NonNull
    /* JADX INFO: renamed from: c */
    public String mo96253c() {
        return PushMessageIntent.conversation_single;
    }

    @Override // p153l.fxl
    /* JADX INFO: renamed from: f */
    public LongLinkMessage.MsgTypeEnum mo102648f() {
        return LongLinkMessage.MsgTypeEnum.MSG_TYPE_CHAT_MSG;
    }

    @Override // p153l.q4w
    public void populatePushMessage(PushMessage pushMessage, pq60 pq60Var, LongLinkCoreChatMessage.ChatMsg chatMsg) {
        pushMessage.intent = PushMessageIntent.conversation_single;
        pushMessage.title = chatMsg.getTitle();
        pushMessage.ticker = chatMsg.getTicker();
        pushMessage.gid = pq60Var.f153643a.getMsgId();
        pushMessage.createdTime = chatMsg.getTs();
        PushMessageContent pushMessageContent = new PushMessageContent();
        pushMessage.content = pushMessageContent;
        pushMessageContent.type = "conversation";
        pushMessageContent.f39652id = pq60Var.f153643a.getMsgId();
    }
}
