package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage;

/* JADX INFO: loaded from: classes4.dex */
public class mc4 extends bk2<LongLinkSocketMessage.PopUp, LongLinkSocketMessage.PopUp> {
    public mc4(p3g0<LongLinkSocketMessage.PopUp, LongLinkSocketMessage.PopUp> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkSocketMessage.PopUp popUp, String str) {
        if (TextUtils.isEmpty(popUp.getCampaignId())) {
            return false;
        }
        return TextUtils.isEmpty(popUp.getRoomId()) || m199212r(popUp.getRoomId(), "no_care", "no_care");
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkSocketMessage.PopUp> mo94398b() {
        return LongLinkSocketMessage.PopUp.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.campaign.popUp";
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkSocketMessage.PopUp mo94461z(String str, LongLinkSocketMessage.PopUp popUp) {
        return popUp;
    }
}
