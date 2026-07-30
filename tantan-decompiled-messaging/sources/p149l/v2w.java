package p149l;

import androidx.annotation.NonNull;
import com.p046p1.mobile.longlink.msg.connector.LongLinkChatTypingMessage;
import com.p046p1.mobile.longlink.msg.connector.LongLinkMessage;
import com.p046p1.mobile.putong.data.PushMessage;
import com.p046p1.mobile.putong.data.PushMessageIntent;

/* JADX INFO: loaded from: classes9.dex */
public class v2w extends s2w<LongLinkChatTypingMessage.ChatTyping> {
    @Override // p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkChatTypingMessage.ChatTyping> mo94398b() {
        return LongLinkChatTypingMessage.ChatTyping.class;
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
        return LongLinkMessage.MsgTypeEnum.MSG_TYPE_CHAT_TYPING;
    }

    @Override // p149l.s2w
    public void populatePushMessage(PushMessage pushMessage, ki60 ki60Var, LongLinkChatTypingMessage.ChatTyping chatTyping) {
    }

    @Override // p149l.s2w
    /* JADX INFO: renamed from: e */
    public void mo94755e(PushMessage pushMessage) {
    }
}
