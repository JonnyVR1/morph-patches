package p153l;

import androidx.annotation.NonNull;
import com.p051p1.mobile.longlink.msg.connector.LongLinkChatTypingMessage;
import com.p051p1.mobile.longlink.msg.connector.LongLinkMessage;
import com.p051p1.mobile.putong.data.PushMessage;
import com.p051p1.mobile.putong.data.PushMessageIntent;

/* JADX INFO: loaded from: classes9.dex */
public class t4w extends q4w<LongLinkChatTypingMessage.ChatTyping> {
    @Override // p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkChatTypingMessage.ChatTyping> mo95510b() {
        return LongLinkChatTypingMessage.ChatTyping.class;
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
        return LongLinkMessage.MsgTypeEnum.MSG_TYPE_CHAT_TYPING;
    }

    @Override // p153l.q4w
    public void populatePushMessage(PushMessage pushMessage, pq60 pq60Var, LongLinkChatTypingMessage.ChatTyping chatTyping) {
    }

    @Override // p153l.q4w
    /* JADX INFO: renamed from: e */
    public void mo175263e(PushMessage pushMessage) {
    }
}
