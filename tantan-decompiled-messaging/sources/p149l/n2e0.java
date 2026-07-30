package p149l;

import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveSchemePopupMessage;
import java.util.HashSet;

/* JADX INFO: loaded from: classes4.dex */
public class n2e0 extends bk2<LongLinkLiveMessage.SchemePopup, LiveSchemePopupMessage> {

    /* JADX INFO: renamed from: h */
    public HashSet<String> f136814h;

    public n2e0(p3g0<LiveSchemePopupMessage, LiveSchemePopupMessage> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
        this.f136814h = new HashSet<>();
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkLiveMessage.SchemePopup schemePopup, String str) {
        if (this.f136814h.size() >= 500) {
            this.f136814h.clear();
        }
        if (this.f136814h.contains(schemePopup.getUniqueId())) {
            return false;
        }
        this.f136814h.add(schemePopup.getUniqueId());
        return true;
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LiveSchemePopupMessage mo94461z(String str, LongLinkLiveMessage.SchemePopup schemePopup) {
        return new LiveSchemePopupMessage(schemePopup.getScheme(), schemePopup.getDelay(), schemePopup.getUniqueId()).setResultMessage(schemePopup);
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.SchemePopup> mo94398b() {
        return LongLinkLiveMessage.SchemePopup.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.common.schemePopup";
    }
}
