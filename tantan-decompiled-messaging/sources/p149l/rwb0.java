package p149l;

import androidx.annotation.Nullable;
import com.p046p1.mobile.longlink.msg.connector.LongLinkConversationMessage;
import com.p046p1.mobile.putong.data.PushMessage;
import com.p046p1.mobile.putong.data.PushMessageContent;
import com.p046p1.mobile.putong.data.PushMessageIntent;

/* JADX INFO: loaded from: classes9.dex */
public class rwb0 extends i0w<LongLinkConversationMessage.CreateConversation> {
    @Override // p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkConversationMessage.CreateConversation> mo94398b() {
        return LongLinkConversationMessage.CreateConversation.class;
    }

    @Override // p149l.o2w, p149l.n2w, p149l.sul
    @Nullable
    /* JADX INFO: renamed from: c */
    public String mo94754c() {
        return PushMessageIntent.quickchat_match;
    }

    @Override // p149l.rul
    /* JADX INFO: renamed from: e */
    public String mo95580e() {
        return "chat.conversation.createquickchat";
    }

    @Override // p149l.i0w
    public void populatePushMessage(PushMessage pushMessage, ki60 ki60Var, LongLinkConversationMessage.CreateConversation createConversation) {
        String str = pushMessage.content.f38804id;
        PushMessageContent pushMessageContent = new PushMessageContent();
        pushMessage.content = pushMessageContent;
        pushMessageContent.f38804id = str;
        pushMessage.silent = true;
    }
}
