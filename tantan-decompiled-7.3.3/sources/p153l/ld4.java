package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage;

/* JADX INFO: loaded from: classes4.dex */
public class ld4 extends jk2<LongLinkSocketMessage.PopUp, LongLinkSocketMessage.PopUp> {
    public ld4(wbg0<LongLinkSocketMessage.PopUp, LongLinkSocketMessage.PopUp> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkSocketMessage.PopUp popUp, String str) {
        if (TextUtils.isEmpty(popUp.getCampaignId())) {
            return false;
        }
        return TextUtils.isEmpty(popUp.getRoomId()) || m159460r(popUp.getRoomId(), "no_care", "no_care");
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkSocketMessage.PopUp> mo95510b() {
        return LongLinkSocketMessage.PopUp.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.campaign.popUp";
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkSocketMessage.PopUp mo95993z(String str, LongLinkSocketMessage.PopUp popUp) {
        return popUp;
    }
}
