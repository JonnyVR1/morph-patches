package p149l;

import androidx.annotation.NonNull;
import com.p046p1.mobile.longlink.msg.connector.LongLinkCoreChatMessage;
import com.p046p1.mobile.longlink.msg.connector.LongLinkMessage;
import com.p046p1.mobile.putong.data.PushMessage;
import com.p046p1.mobile.putong.data.PushMessageContent;
import com.p046p1.mobile.putong.data.PushMessageIntent;

/* JADX INFO: loaded from: classes9.dex */
public class u2w extends s2w<LongLinkCoreChatMessage.ChatMsg> {
    @Override // p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkCoreChatMessage.ChatMsg> mo94398b() {
        return LongLinkCoreChatMessage.ChatMsg.class;
    }

    @Override // p149l.sul
    @NonNull
    /* JADX INFO: renamed from: c */
    public String mo94754c() {
        return PushMessageIntent.conversation_single;
    }

    @Override // p149l.sul
    /* JADX INFO: renamed from: f */
    public LongLinkMessage.MsgTypeEnum mo94756f() {
        return LongLinkMessage.MsgTypeEnum.MSG_TYPE_CHAT_MSG;
    }

    @Override // p149l.s2w
    public void populatePushMessage(PushMessage pushMessage, ki60 ki60Var, LongLinkCoreChatMessage.ChatMsg chatMsg) {
        pushMessage.intent = PushMessageIntent.conversation_single;
        pushMessage.title = chatMsg.getTitle();
        pushMessage.ticker = chatMsg.getTicker();
        pushMessage.gid = ki60Var.f123271a.getMsgId();
        pushMessage.createdTime = chatMsg.getTs();
        PushMessageContent pushMessageContent = new PushMessageContent();
        pushMessage.content = pushMessageContent;
        pushMessageContent.type = "conversation";
        pushMessageContent.f38804id = ki60Var.f123271a.getMsgId();
    }
}
