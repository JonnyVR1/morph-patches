package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveOfficialShowCurrentAnchorInfo;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p051p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomType;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public class uc50 extends y8s<mc50, pc50> {
    public uc50(dum<? extends mc50> dumVar) {
        super(dumVar);
        mo52715C(new pc50(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X3 */
    public void m195370X3(jsv jsvVar) {
        if (jsvVar.m146875a() == 4) {
            m195372c4();
            m195373d4();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b4 */
    public /* synthetic */ void m195371b4(Long l2) {
        if (l2.longValue() == 5 && ((pc50) this.viewModel).isShowing()) {
            m195376Z3();
            ((pc50) this.viewModel).mo73021p();
        }
        ((pc50) this.viewModel).m171637L(5 - l2.intValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c4 */
    private void m195372c4() {
        ((pc50) this.viewModel).m171638M(((mc50) m213810E2()).m168532l0(), ((mc50) m213810E2()).m168551u0(), ((mc50) m213810E2()).m157913S2());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d4 */
    private void m195373d4() {
        m138858H3(((mc50) m213810E2()).m168525i2(TimeUnit.SECONDS)).filter(new qcj() { // from class: l.rc50
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((Long) obj).longValue() <= 5);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.sc50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f167196a.m195371b4((Long) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(((mc50) m213810E2()).m202192l()).subscribe(dhw.m115825d(new y20() { // from class: l.qc50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f156554a.m195370X3((jsv) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [l.oo2] */
    /* JADX INFO: renamed from: W3 */
    public void m195374W3() {
        ((mc50) m213810E2()).m168511e0(false, mo78457R2(), "OfficialShowCardDialog", new x20() { // from class: l.tc50
            @Override // p153l.x20
            public final void call() {
                this.f173208a.m195377a4();
            }
        });
        afu.m97554c("p_user_live_end", tfs.m190969k().m190972b(m213810E2(), true).m190975e("LiveEnd").m190971a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y3 */
    public void m195375Y3(BLiveOfficialShowCurrentAnchorInfo bLiveOfficialShowCurrentAnchorInfo) {
        m213811F2().JumpRoomEvent.jumpRoom().mo199273j(new JumpRoomData.C12924a().m74214t(((mc50) m213810E2()).mo160117o0()).m74212r(((mc50) m213810E2()).m202191k()).m74213s(((mc50) m213810E2()).mo183435j().room.f45267id).m74211q(((mc50) m213810E2()).m168532l0().name).m74216v(bLiveOfficialShowCurrentAnchorInfo.anchorLiveId).m74217w(bLiveOfficialShowCurrentAnchorInfo.anchorRoomId).m74208n(JumpRoomType.CHANGE_SOURCE_NO_BACK).m74207m());
    }

    /* JADX INFO: renamed from: Z3 */
    public void m195376Z3() {
        if (((Boolean) m138856F3(new t35(3400))).booleanValue()) {
            m213811F2().FragProxyEvent.switchNextLive().m199277p();
        } else {
            o1j0.m165649w(R$string.f48016ca);
        }
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ void m195377a4() {
        ((pc50) this.viewModel).m171636K();
        o1j0.m165651y("订阅成功");
    }
}
