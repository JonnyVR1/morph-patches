package p002l;

import android.text.TextUtils;
import com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class bd4 extends bk2<LongLinkSocketMessage.PopUpContentUpdateNotice, LongLinkSocketMessage.PopUpContentUpdateNotice> {
    public bd4(p3g0<LongLinkSocketMessage.PopUpContentUpdateNotice, LongLinkSocketMessage.PopUpContentUpdateNotice> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkSocketMessage.PopUpContentUpdateNotice popUpContentUpdateNotice, String str) {
        if (TextUtils.isEmpty(popUpContentUpdateNotice.getUrl()) || TextUtils.isEmpty(popUpContentUpdateNotice.getData())) {
            return false;
        }
        return TextUtils.isEmpty(popUpContentUpdateNotice.getRoomId()) || m24095r(popUpContentUpdateNotice.getRoomId(), "no_care", "no_care");
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkSocketMessage.PopUpContentUpdateNotice> mo9244b() {
        return LongLinkSocketMessage.PopUpContentUpdateNotice.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.notice.popUpContentUpdate";
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkSocketMessage.PopUpContentUpdateNotice mo9251z(String str, LongLinkSocketMessage.PopUpContentUpdateNotice popUpContentUpdateNotice) {
        return popUpContentUpdateNotice;
    }
}
