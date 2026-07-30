package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.data.VoiceCallStatus;
import com.p051p1.mobile.putong.live.base.data.BLiveJsRoomInfo;
import com.tencent.youtu.sdkkitframework.common.WeJson;

/* JADX INFO: loaded from: classes9.dex */
public class gou extends xgu<gou> implements twl {

    /* JADX INFO: renamed from: f */
    public final String f105388f;

    /* JADX INFO: renamed from: g */
    public String f105389g;

    public gou(knu knuVar) {
        super(knuVar);
        this.f105388f = "LivingJsBridgePlug:";
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        m153103z2(new alu(m97930M2()));
        hashCode();
        m97926H2().getClass();
        iiv.m140146c(this);
        m113231o2(m97926H2().m212355z(), false).distinctUntilChanged().subscribe(dhw.m115829h(new y20() { // from class: l.fou
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f100093a.m131187U2((String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T2 */
    public final void m131186T2(y20<String> y20Var) {
        if (m97926H2() == null || m97926H2().m212308A() == null) {
            cxk.m113042a("data() || data().getLive() == null.");
        } else {
            cxk.m113042a("isAnchor() is " + m97931N2() + ", and live id is " + m97926H2().m212349s());
        }
        if (!TextUtils.isEmpty(this.f105389g)) {
            y20Var.call(this.f105389g);
            return;
        }
        if (m97926H2() == null || m97926H2().m212308A() == null) {
            y20Var.call(WeJson.EMPTY_MAP);
            return;
        }
        BLiveJsRoomInfo bLiveJsRoomInfoNew_ = BLiveJsRoomInfo.new_();
        bLiveJsRoomInfoNew_.roomId = m97926H2().m212308A().roomId;
        bLiveJsRoomInfoNew_.liveId = m97926H2().m212308A().liveId;
        bLiveJsRoomInfoNew_.anchorId = m97926H2().m212308A().anchorId;
        bLiveJsRoomInfoNew_.roomType = "videoChat";
        bLiveJsRoomInfoNew_.fakeId = eb20.m120148a();
        bLiveJsRoomInfoNew_.liveMode = "normal";
        String strSerialize = BLiveJsRoomInfo.JSON_ADAPTER.serialize(bLiveJsRoomInfoNew_);
        this.f105389g = strSerialize;
        y20Var.call(strSerialize);
    }

    /* JADX INFO: renamed from: U2 */
    public final void m131187U2(String str) {
        if (VoiceCallStatus.calling.equals(str)) {
            this.f105389g = null;
        }
    }

    @Override // p153l.twl
    /* JADX INFO: renamed from: f0 */
    public void mo131188f0(bcg0 bcg0Var) {
        m97928K2().LiveVChatBridgeImplEvent.m70371c().mo199273j(bcg0Var);
    }

    @Override // p153l.twl
    /* JADX INFO: renamed from: j1 */
    public void mo131189j1(boolean z, y20<String> y20Var) {
        m131186T2(y20Var);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        hashCode();
        m97926H2().getClass();
        iiv.m140144a(this);
        this.f105389g = null;
    }
}
