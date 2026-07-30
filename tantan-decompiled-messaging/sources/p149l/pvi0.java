package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage;

/* JADX INFO: loaded from: classes4.dex */
public class pvi0 extends bk2<LongLinkSocketMessage.TopEffect, LongLinkSocketMessage.TopEffect> {
    public pvi0(p3g0<LongLinkSocketMessage.TopEffect, LongLinkSocketMessage.TopEffect> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkSocketMessage.TopEffect topEffect, String str) {
        if (TextUtils.isEmpty(topEffect.getAvatarUrl()) || TextUtils.isEmpty(topEffect.getContent()) || TextUtils.isEmpty(topEffect.getUserName()) || TextUtils.isEmpty(topEffect.getStartBackendColor()) || TextUtils.isEmpty(topEffect.getEndBackendColor())) {
            return false;
        }
        return TextUtils.isEmpty(topEffect.getRoomId()) || m199212r(topEffect.getRoomId(), "no_care", "no_care");
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkSocketMessage.TopEffect> mo94398b() {
        return LongLinkSocketMessage.TopEffect.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.notice.topEffect";
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkSocketMessage.TopEffect mo94461z(String str, LongLinkSocketMessage.TopEffect topEffect) {
        return topEffect;
    }
}
