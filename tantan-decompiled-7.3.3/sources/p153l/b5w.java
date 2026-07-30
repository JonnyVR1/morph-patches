package p153l;

import com.p051p1.mobile.longlink.msg.connector.LongLinkChatServiceMessage;
import com.p051p1.mobile.longlink.msg.connector.LongLinkMessage;
import com.p051p1.mobile.putong.data.PushMessage;

/* JADX INFO: loaded from: classes9.dex */
public class b5w extends g2w<LongLinkChatServiceMessage.OtherUserReadSocketMessage> {
    @Override // p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkChatServiceMessage.OtherUserReadSocketMessage> mo95510b() {
        return LongLinkChatServiceMessage.OtherUserReadSocketMessage.class;
    }

    @Override // p153l.exl
    /* JADX INFO: renamed from: e */
    public String mo96254e() {
        return "conversation.single.message.audiotext";
    }

    @Override // p153l.m4w, p153l.fxl
    /* JADX INFO: renamed from: f */
    public LongLinkMessage.MsgTypeEnum mo102648f() {
        return LongLinkMessage.MsgTypeEnum.MSG_TYPE_COMMON;
    }

    @Override // p153l.g2w
    public void populatePushMessage(PushMessage pushMessage, pq60 pq60Var, LongLinkChatServiceMessage.OtherUserReadSocketMessage otherUserReadSocketMessage) {
    }
}
