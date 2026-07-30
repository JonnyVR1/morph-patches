package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveOfficialShowCurrentAnchorInfo;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p046p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomType;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class f450 extends x6s<x350, a450> {
    public f450(bsm<? extends x350> bsmVar) {
        super(bsmVar);
        mo51532C(new a450(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X3 */
    public void m119274X3(iqv iqvVar) {
        if (iqvVar.m137794a() == 4) {
            m119276c4();
            m119277d4();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b4 */
    public /* synthetic */ void m119275b4(Long l2) {
        if (l2.longValue() == 5 && ((a450) this.viewModel).isShowing()) {
            m119280Z3();
            ((a450) this.viewModel).mo71838p();
        }
        ((a450) this.viewModel).m94807L(5 - l2.intValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c4 */
    private void m119276c4() {
        ((a450) this.viewModel).m94808M(((x350) m206027E2()).m132146l0(), ((x350) m206027E2()).m132167u0(), ((x350) m206027E2()).m206897S2());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d4 */
    private void m119277d4() {
        m129299H3(((x350) m206027E2()).m132139i2(TimeUnit.SECONDS)).filter(new w9j() { // from class: l.c450
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((Long) obj).longValue() <= 5);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.d450
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f84281a.m119275b4((Long) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(((x350) m206027E2()).m149815l()).subscribe(ffw.m121193d(new e30() { // from class: l.b450
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f73316a.m119274X3((iqv) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [l.ho2] */
    /* JADX INFO: renamed from: W3 */
    public void m119278W3() {
        ((x350) m206027E2()).m132125e0(false, mo77274R2(), "OfficialShowCardDialog", new d30() { // from class: l.e450
            @Override // p149l.d30
            public final void call() {
                this.f89250a.m119281a4();
            }
        });
        zcu.m218088c("p_user_live_end", sds.m183540k().m183543b(m206027E2(), true).m183546e("LiveEnd").m183542a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y3 */
    public void m119279Y3(BLiveOfficialShowCurrentAnchorInfo bLiveOfficialShowCurrentAnchorInfo) {
        m206028F2().JumpRoomEvent.jumpRoom().mo172463j(new JumpRoomData.C12761a().m73031t(((x350) m206027E2()).mo132155o0()).m73029r(((x350) m206027E2()).m149814k()).m73030s(((x350) m206027E2()).mo149813j().room.f44419id).m73028q(((x350) m206027E2()).m132146l0().name).m73033v(bLiveOfficialShowCurrentAnchorInfo.anchorLiveId).m73034w(bLiveOfficialShowCurrentAnchorInfo.anchorRoomId).m73025n(JumpRoomType.CHANGE_SOURCE_NO_BACK).m73024m());
    }

    /* JADX INFO: renamed from: Z3 */
    public void m119280Z3() {
        if (((Boolean) m129297F3(new t25(3400))).booleanValue()) {
            m206028F2().FragProxyEvent.switchNextLive().m172467p();
        } else {
            lsi0.m151593w(R$string.f47168ca);
        }
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ void m119281a4() {
        ((a450) this.viewModel).m94806K();
        lsi0.m151595y("订阅成功");
    }
}
