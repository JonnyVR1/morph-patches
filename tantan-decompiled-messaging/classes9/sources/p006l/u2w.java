package p006l;

import androidx.annotation.NonNull;
import com.p1.mobile.longlink.msg.connector.LongLinkCoreChatMessage;
import com.p1.mobile.longlink.msg.connector.LongLinkMessage;
import com.p1.mobile.putong.data.PushMessage;
import com.p1.mobile.putong.data.PushMessageContent;
import l.ki60;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class u2w extends s2w<LongLinkCoreChatMessage.ChatMsg> {
    @Override // p006l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkCoreChatMessage.ChatMsg> mo11743b() {
        return LongLinkCoreChatMessage.ChatMsg.class;
    }

    @Override // p006l.sul
    @NonNull
    /* JADX INFO: renamed from: c */
    public String mo11744c() {
        return "conversation.single";
    }

    @Override // p006l.sul
    /* JADX INFO: renamed from: f */
    public LongLinkMessage.MsgTypeEnum mo11746f() {
        return LongLinkMessage.MsgTypeEnum.MSG_TYPE_CHAT_MSG;
    }

    @Override // p006l.s2w
    public void populatePushMessage(PushMessage pushMessage, ki60 ki60Var, LongLinkCoreChatMessage.ChatMsg chatMsg) {
        pushMessage.intent = "conversation.single";
        pushMessage.title = chatMsg.getTitle();
        pushMessage.ticker = chatMsg.getTicker();
        pushMessage.gid = ki60Var.a.getMsgId();
        pushMessage.createdTime = chatMsg.getTs();
        PushMessageContent pushMessageContent = new PushMessageContent();
        pushMessage.content = pushMessageContent;
        pushMessageContent.type = "conversation";
        pushMessageContent.id = ki60Var.a.getMsgId();
    }
}
