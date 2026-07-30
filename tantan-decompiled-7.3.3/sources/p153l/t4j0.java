package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage;

/* JADX INFO: loaded from: classes4.dex */
public class t4j0 extends jk2<LongLinkSocketMessage.TopEffect, LongLinkSocketMessage.TopEffect> {
    public t4j0(wbg0<LongLinkSocketMessage.TopEffect, LongLinkSocketMessage.TopEffect> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkSocketMessage.TopEffect topEffect, String str) {
        if (TextUtils.isEmpty(topEffect.getAvatarUrl()) || TextUtils.isEmpty(topEffect.getContent()) || TextUtils.isEmpty(topEffect.getUserName()) || TextUtils.isEmpty(topEffect.getStartBackendColor()) || TextUtils.isEmpty(topEffect.getEndBackendColor())) {
            return false;
        }
        return TextUtils.isEmpty(topEffect.getRoomId()) || m159460r(topEffect.getRoomId(), "no_care", "no_care");
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkSocketMessage.TopEffect> mo95510b() {
        return LongLinkSocketMessage.TopEffect.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.notice.topEffect";
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkSocketMessage.TopEffect mo95993z(String str, LongLinkSocketMessage.TopEffect topEffect) {
        return topEffect;
    }
}
