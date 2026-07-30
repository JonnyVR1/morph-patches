package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage;

/* JADX INFO: loaded from: classes4.dex */
public class bd4 extends bk2<LongLinkSocketMessage.PopUpContentUpdateNotice, LongLinkSocketMessage.PopUpContentUpdateNotice> {
    public bd4(p3g0<LongLinkSocketMessage.PopUpContentUpdateNotice, LongLinkSocketMessage.PopUpContentUpdateNotice> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkSocketMessage.PopUpContentUpdateNotice popUpContentUpdateNotice, String str) {
        if (TextUtils.isEmpty(popUpContentUpdateNotice.getUrl()) || TextUtils.isEmpty(popUpContentUpdateNotice.getData())) {
            return false;
        }
        return TextUtils.isEmpty(popUpContentUpdateNotice.getRoomId()) || m199212r(popUpContentUpdateNotice.getRoomId(), "no_care", "no_care");
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkSocketMessage.PopUpContentUpdateNotice> mo94398b() {
        return LongLinkSocketMessage.PopUpContentUpdateNotice.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.notice.popUpContentUpdate";
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkSocketMessage.PopUpContentUpdateNotice mo94461z(String str, LongLinkSocketMessage.PopUpContentUpdateNotice popUpContentUpdateNotice) {
        return popUpContentUpdateNotice;
    }
}
