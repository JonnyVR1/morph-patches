package p002l;

import android.text.TextUtils;
import com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class pvi0 extends bk2<LongLinkSocketMessage.TopEffect, LongLinkSocketMessage.TopEffect> {
    public pvi0(p3g0<LongLinkSocketMessage.TopEffect, LongLinkSocketMessage.TopEffect> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkSocketMessage.TopEffect topEffect, String str) {
        if (TextUtils.isEmpty(topEffect.getAvatarUrl()) || TextUtils.isEmpty(topEffect.getContent()) || TextUtils.isEmpty(topEffect.getUserName()) || TextUtils.isEmpty(topEffect.getStartBackendColor()) || TextUtils.isEmpty(topEffect.getEndBackendColor())) {
            return false;
        }
        return TextUtils.isEmpty(topEffect.getRoomId()) || m24095r(topEffect.getRoomId(), "no_care", "no_care");
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkSocketMessage.TopEffect> mo9244b() {
        return LongLinkSocketMessage.TopEffect.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.notice.topEffect";
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkSocketMessage.TopEffect mo9251z(String str, LongLinkSocketMessage.TopEffect topEffect) {
        return topEffect;
    }
}
