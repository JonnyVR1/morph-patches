package p149l;

import androidx.annotation.Nullable;
import com.p046p1.mobile.longlink.msg.connector.LongLinkPushContentMessage;
import com.p046p1.mobile.putong.data.PushMessage;
import com.p046p1.mobile.putong.data.PushMessageIntent;

/* JADX INFO: loaded from: classes9.dex */
public class c3w extends i0w<LongLinkPushContentMessage.PushMessage> {
    @Override // p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkPushContentMessage.PushMessage> mo94398b() {
        return LongLinkPushContentMessage.PushMessage.class;
    }

    @Override // p149l.o2w, p149l.n2w, p149l.sul
    @Nullable
    /* JADX INFO: renamed from: c */
    public String mo94754c() {
        return PushMessageIntent.promotion_platform_reload;
    }

    @Override // p149l.rul
    /* JADX INFO: renamed from: e */
    public String mo95580e() {
        return PushMessageIntent.promotion_platform_reload;
    }

    @Override // p149l.i0w
    public void populatePushMessage(PushMessage pushMessage, ki60 ki60Var, LongLinkPushContentMessage.PushMessage pushMessage2) {
    }
}
