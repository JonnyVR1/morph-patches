package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveSchemePopupMessage;
import java.util.HashSet;

/* JADX INFO: loaded from: classes4.dex */
public class rae0 extends jk2<LongLinkLiveMessage.SchemePopup, LiveSchemePopupMessage> {

    /* JADX INFO: renamed from: h */
    public HashSet<String> f161924h;

    public rae0(wbg0<LiveSchemePopupMessage, LiveSchemePopupMessage> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
        this.f161924h = new HashSet<>();
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkLiveMessage.SchemePopup schemePopup, String str) {
        if (this.f161924h.size() >= 500) {
            this.f161924h.clear();
        }
        if (this.f161924h.contains(schemePopup.getUniqueId())) {
            return false;
        }
        this.f161924h.add(schemePopup.getUniqueId());
        return true;
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LiveSchemePopupMessage mo95993z(String str, LongLinkLiveMessage.SchemePopup schemePopup) {
        return new LiveSchemePopupMessage(schemePopup.getScheme(), schemePopup.getDelay(), schemePopup.getUniqueId()).setResultMessage(schemePopup);
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.SchemePopup> mo95510b() {
        return LongLinkLiveMessage.SchemePopup.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.common.schemePopup";
    }
}
