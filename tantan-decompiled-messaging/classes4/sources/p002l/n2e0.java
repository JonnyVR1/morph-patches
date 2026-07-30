package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveSchemePopupMessage;
import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import java.util.HashSet;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class n2e0 extends bk2<LongLinkLiveMessage.SchemePopup, LiveSchemePopupMessage> {

    /* JADX INFO: renamed from: h */
    public HashSet<String> f15797h;

    public n2e0(p3g0<LiveSchemePopupMessage, LiveSchemePopupMessage> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
        this.f15797h = new HashSet<>();
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkLiveMessage.SchemePopup schemePopup, String str) {
        if (this.f15797h.size() >= 500) {
            this.f15797h.clear();
        }
        if (this.f15797h.contains(schemePopup.getUniqueId())) {
            return false;
        }
        this.f15797h.add(schemePopup.getUniqueId());
        return true;
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LiveSchemePopupMessage mo9251z(String str, LongLinkLiveMessage.SchemePopup schemePopup) {
        return new LiveSchemePopupMessage(schemePopup.getScheme(), schemePopup.getDelay(), schemePopup.getUniqueId()).setResultMessage(schemePopup);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.SchemePopup> mo9244b() {
        return LongLinkLiveMessage.SchemePopup.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.common.schemePopup";
    }
}
