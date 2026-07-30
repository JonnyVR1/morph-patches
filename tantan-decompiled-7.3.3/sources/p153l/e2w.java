package p153l;

import androidx.annotation.Nullable;
import com.p051p1.mobile.longlink.msg.connector.LongLinkChatServiceMessage;
import com.p051p1.mobile.putong.data.PushMessage;
import com.p051p1.mobile.putong.data.PushMessageContent;
import com.p051p1.mobile.putong.data.PushMessageIntent;

/* JADX INFO: loaded from: classes9.dex */
public class e2w extends g2w<LongLinkChatServiceMessage.OtherUserReadSocketMessage> {
    @Override // p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkChatServiceMessage.OtherUserReadSocketMessage> mo95510b() {
        return LongLinkChatServiceMessage.OtherUserReadSocketMessage.class;
    }

    @Override // p153l.m4w, p153l.l4w, p153l.fxl
    @Nullable
    /* JADX INFO: renamed from: c */
    public String mo96253c() {
        return PushMessageIntent.chat_conversation_other_read;
    }

    @Override // p153l.exl
    /* JADX INFO: renamed from: e */
    public String mo96254e() {
        return PushMessageIntent.chat_conversation_other_read;
    }

    @Override // p153l.g2w
    public void populatePushMessage(PushMessage pushMessage, pq60 pq60Var, LongLinkChatServiceMessage.OtherUserReadSocketMessage otherUserReadSocketMessage) {
        pushMessage.content = new PushMessageContent();
        pushMessage.messageCustom.otherUserID = otherUserReadSocketMessage.getOtherUserId();
        pushMessage.messageCustom.readUntilId = otherUserReadSocketMessage.getReadUntilId();
        pushMessage.silent = true;
    }
}
