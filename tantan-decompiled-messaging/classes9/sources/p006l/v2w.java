package p006l;

import androidx.annotation.NonNull;
import com.p1.mobile.longlink.msg.connector.LongLinkChatTypingMessage;
import com.p1.mobile.longlink.msg.connector.LongLinkMessage;
import com.p1.mobile.putong.data.PushMessage;
import l.ki60;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class v2w extends s2w<LongLinkChatTypingMessage.ChatTyping> {
    @Override // p006l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkChatTypingMessage.ChatTyping> mo11743b() {
        return LongLinkChatTypingMessage.ChatTyping.class;
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
        return LongLinkMessage.MsgTypeEnum.MSG_TYPE_CHAT_TYPING;
    }

    @Override // p006l.s2w
    public void populatePushMessage(PushMessage pushMessage, ki60 ki60Var, LongLinkChatTypingMessage.ChatTyping chatTyping) {
    }

    @Override // p006l.s2w
    /* JADX INFO: renamed from: e */
    public void mo11745e(PushMessage pushMessage) {
    }
}
