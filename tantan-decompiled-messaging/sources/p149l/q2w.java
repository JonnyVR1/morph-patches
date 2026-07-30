package p149l;

import com.p046p1.mobile.longlink.msg.connector.LongLinkChatServiceMessage;
import com.p046p1.mobile.longlink.msg.connector.LongLinkMessage;
import com.p046p1.mobile.putong.data.PushMessage;

/* JADX INFO: loaded from: classes9.dex */
public class q2w extends i0w<LongLinkChatServiceMessage.OtherUserReadSocketMessage> {
    @Override // p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkChatServiceMessage.OtherUserReadSocketMessage> mo94398b() {
        return LongLinkChatServiceMessage.OtherUserReadSocketMessage.class;
    }

    @Override // p149l.rul
    /* JADX INFO: renamed from: e */
    public String mo95580e() {
        return "conversation.group.message.audiotext";
    }

    @Override // p149l.o2w, p149l.sul
    /* JADX INFO: renamed from: f */
    public LongLinkMessage.MsgTypeEnum mo94756f() {
        return LongLinkMessage.MsgTypeEnum.MSG_TYPE_COMMON;
    }

    @Override // p149l.i0w
    public void populatePushMessage(PushMessage pushMessage, ki60 ki60Var, LongLinkChatServiceMessage.OtherUserReadSocketMessage otherUserReadSocketMessage) {
    }
}
