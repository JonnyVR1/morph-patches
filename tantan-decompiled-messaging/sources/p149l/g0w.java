package p149l;

import androidx.annotation.Nullable;
import com.p046p1.mobile.longlink.msg.connector.LongLinkChatServiceMessage;
import com.p046p1.mobile.putong.data.PushMessage;
import com.p046p1.mobile.putong.data.PushMessageContent;
import com.p046p1.mobile.putong.data.PushMessageIntent;

/* JADX INFO: loaded from: classes9.dex */
public class g0w extends i0w<LongLinkChatServiceMessage.OtherUserReadSocketMessage> {
    @Override // p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkChatServiceMessage.OtherUserReadSocketMessage> mo94398b() {
        return LongLinkChatServiceMessage.OtherUserReadSocketMessage.class;
    }

    @Override // p149l.o2w, p149l.n2w, p149l.sul
    @Nullable
    /* JADX INFO: renamed from: c */
    public String mo94754c() {
        return PushMessageIntent.chat_conversation_other_read;
    }

    @Override // p149l.rul
    /* JADX INFO: renamed from: e */
    public String mo95580e() {
        return PushMessageIntent.chat_conversation_other_read;
    }

    @Override // p149l.i0w
    public void populatePushMessage(PushMessage pushMessage, ki60 ki60Var, LongLinkChatServiceMessage.OtherUserReadSocketMessage otherUserReadSocketMessage) {
        pushMessage.content = new PushMessageContent();
        pushMessage.messageCustom.otherUserID = otherUserReadSocketMessage.getOtherUserId();
        pushMessage.messageCustom.readUntilId = otherUserReadSocketMessage.getReadUntilId();
        pushMessage.silent = true;
    }
}
