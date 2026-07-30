package p006l;

import androidx.annotation.Nullable;
import com.p1.mobile.longlink.msg.connector.LongLinkChatServiceMessage;
import com.p1.mobile.putong.data.PushMessage;
import com.p1.mobile.putong.data.PushMessageContent;
import l.ki60;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class g0w extends i0w<LongLinkChatServiceMessage.OtherUserReadSocketMessage> {
    @Override // p006l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkChatServiceMessage.OtherUserReadSocketMessage> mo11743b() {
        return LongLinkChatServiceMessage.OtherUserReadSocketMessage.class;
    }

    @Override // p006l.o2w, p006l.n2w, p006l.sul
    @Nullable
    /* JADX INFO: renamed from: c */
    public String mo11744c() {
        return "chat.conversation.other_read";
    }

    @Override // p006l.rul
    /* JADX INFO: renamed from: e */
    public String mo11805e() {
        return "chat.conversation.other_read";
    }

    @Override // p006l.i0w
    public void populatePushMessage(PushMessage pushMessage, ki60 ki60Var, LongLinkChatServiceMessage.OtherUserReadSocketMessage otherUserReadSocketMessage) {
        pushMessage.content = new PushMessageContent();
        pushMessage.messageCustom.otherUserID = otherUserReadSocketMessage.getOtherUserId();
        pushMessage.messageCustom.readUntilId = otherUserReadSocketMessage.getReadUntilId();
        pushMessage.silent = true;
    }
}
