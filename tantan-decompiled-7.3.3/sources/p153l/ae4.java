package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage;

/* JADX INFO: loaded from: classes4.dex */
public class ae4 extends jk2<LongLinkSocketMessage.PopUpContentUpdateNotice, LongLinkSocketMessage.PopUpContentUpdateNotice> {
    public ae4(wbg0<LongLinkSocketMessage.PopUpContentUpdateNotice, LongLinkSocketMessage.PopUpContentUpdateNotice> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkSocketMessage.PopUpContentUpdateNotice popUpContentUpdateNotice, String str) {
        if (TextUtils.isEmpty(popUpContentUpdateNotice.getUrl()) || TextUtils.isEmpty(popUpContentUpdateNotice.getData())) {
            return false;
        }
        return TextUtils.isEmpty(popUpContentUpdateNotice.getRoomId()) || m159460r(popUpContentUpdateNotice.getRoomId(), "no_care", "no_care");
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkSocketMessage.PopUpContentUpdateNotice> mo95510b() {
        return LongLinkSocketMessage.PopUpContentUpdateNotice.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.notice.popUpContentUpdate";
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkSocketMessage.PopUpContentUpdateNotice mo95993z(String str, LongLinkSocketMessage.PopUpContentUpdateNotice popUpContentUpdateNotice) {
        return popUpContentUpdateNotice;
    }
}
