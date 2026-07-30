package p153l;

import androidx.annotation.Nullable;
import com.p051p1.mobile.longlink.msg.connector.LongLinkPushContentMessage;
import com.p051p1.mobile.putong.data.PushMessage;
import com.p051p1.mobile.putong.data.PushMessageIntent;

/* JADX INFO: loaded from: classes9.dex */
public class p4w extends g2w<LongLinkPushContentMessage.PushMessage> {
    @Override // p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkPushContentMessage.PushMessage> mo95510b() {
        return LongLinkPushContentMessage.PushMessage.class;
    }

    @Override // p153l.m4w, p153l.l4w, p153l.fxl
    @Nullable
    /* JADX INFO: renamed from: c */
    public String mo96253c() {
        return PushMessageIntent.suggested_list;
    }

    @Override // p153l.exl
    /* JADX INFO: renamed from: e */
    public String mo96254e() {
        return "push.common";
    }

    @Override // p153l.g2w
    public void populatePushMessage(PushMessage pushMessage, pq60 pq60Var, LongLinkPushContentMessage.PushMessage pushMessage2) {
        pushMessage.reqId = pushMessage2.getReqId();
    }
}
