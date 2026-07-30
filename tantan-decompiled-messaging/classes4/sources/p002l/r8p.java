package p002l;

import com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class r8p extends bk2<LongLinkIntlLightPushMessage.RefreshVoiceOperationMsg, LongLinkIntlLightPushMessage.RefreshVoiceOperationMsg> {
    public r8p(p3g0<LongLinkIntlLightPushMessage.RefreshVoiceOperationMsg, LongLinkIntlLightPushMessage.RefreshVoiceOperationMsg> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkIntlLightPushMessage.RefreshVoiceOperationMsg refreshVoiceOperationMsg, String str) {
        return true;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkIntlLightPushMessage.RefreshVoiceOperationMsg> mo9244b() {
        return LongLinkIntlLightPushMessage.RefreshVoiceOperationMsg.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "intl.refresh.operations";
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkIntlLightPushMessage.RefreshVoiceOperationMsg mo9251z(String str, LongLinkIntlLightPushMessage.RefreshVoiceOperationMsg refreshVoiceOperationMsg) {
        return refreshVoiceOperationMsg;
    }
}
