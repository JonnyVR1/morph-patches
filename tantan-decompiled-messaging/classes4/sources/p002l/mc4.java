package p002l;

import android.text.TextUtils;
import com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class mc4 extends bk2<LongLinkSocketMessage.PopUp, LongLinkSocketMessage.PopUp> {
    public mc4(p3g0<LongLinkSocketMessage.PopUp, LongLinkSocketMessage.PopUp> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkSocketMessage.PopUp popUp, String str) {
        if (TextUtils.isEmpty(popUp.getCampaignId())) {
            return false;
        }
        return TextUtils.isEmpty(popUp.getRoomId()) || m24095r(popUp.getRoomId(), "no_care", "no_care");
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkSocketMessage.PopUp> mo9244b() {
        return LongLinkSocketMessage.PopUp.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.campaign.popUp";
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkSocketMessage.PopUp mo9251z(String str, LongLinkSocketMessage.PopUp popUp) {
        return popUp;
    }
}
