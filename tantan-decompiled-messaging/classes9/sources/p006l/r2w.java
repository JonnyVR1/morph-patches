package p006l;

import androidx.annotation.Nullable;
import com.p1.mobile.longlink.msg.connector.LongLinkPushContentMessage;
import com.p1.mobile.putong.data.PushMessage;
import l.ki60;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class r2w extends i0w<LongLinkPushContentMessage.PushMessage> {
    @Override // p006l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkPushContentMessage.PushMessage> mo11743b() {
        return LongLinkPushContentMessage.PushMessage.class;
    }

    @Override // p006l.o2w, p006l.n2w, p006l.sul
    @Nullable
    /* JADX INFO: renamed from: c */
    public String mo11744c() {
        return "suggested.list";
    }

    @Override // p006l.rul
    /* JADX INFO: renamed from: e */
    public String mo11805e() {
        return "push.common";
    }

    @Override // p006l.i0w
    public void populatePushMessage(PushMessage pushMessage, ki60 ki60Var, LongLinkPushContentMessage.PushMessage pushMessage2) {
        pushMessage.reqId = pushMessage2.getReqId();
    }
}
