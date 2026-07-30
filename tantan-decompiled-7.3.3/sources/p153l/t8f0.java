package p153l;

import androidx.annotation.Nullable;
import com.p051p1.mobile.longlink.msg.connector.LongLinkConversationMessage;
import com.p051p1.mobile.putong.data.PushMessage;
import com.p051p1.mobile.putong.data.PushMessageContent;
import com.p051p1.mobile.putong.data.PushMessageIntent;

/* JADX INFO: loaded from: classes9.dex */
public class t8f0 extends g2w<LongLinkConversationMessage.CreateConversation> {
    @Override // p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkConversationMessage.CreateConversation> mo95510b() {
        return LongLinkConversationMessage.CreateConversation.class;
    }

    @Override // p153l.m4w, p153l.l4w, p153l.fxl
    @Nullable
    /* JADX INFO: renamed from: c */
    public String mo96253c() {
        return PushMessageIntent.shuoshuo_callback;
    }

    @Override // p153l.exl
    /* JADX INFO: renamed from: e */
    public String mo96254e() {
        return PushMessageIntent.shuoshuo_callback;
    }

    @Override // p153l.g2w
    public void populatePushMessage(PushMessage pushMessage, pq60 pq60Var, LongLinkConversationMessage.CreateConversation createConversation) {
        String str = pushMessage.content.f39652id;
        PushMessageContent pushMessageContent = new PushMessageContent();
        pushMessage.content = pushMessageContent;
        pushMessageContent.f39652id = str;
        pushMessage.silent = false;
    }
}
