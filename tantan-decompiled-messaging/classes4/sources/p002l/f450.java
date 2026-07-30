package p002l;

import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p000p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomType;
import com.p1.mobile.putong.live.base.data.BLiveOfficialShowCurrentAnchorInfo;
import java.util.concurrent.TimeUnit;
import l.bwr;
import l.d30;
import l.e30;
import l.ffw;
import l.lsi0;
import l.sds;
import l.w9j;
import l.zcu;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class f450 extends x6s<x350, a450> {
    public f450(bsm<? extends x350> bsmVar) {
        super(bsmVar);
        C(new a450(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X3 */
    public void m12936X3(iqv iqvVar) {
        if (iqvVar.m15298a() == 4) {
            m12938c4();
            m12939d4();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b4 */
    public /* synthetic */ void m12937b4(Long l2) {
        if (l2.longValue() == 5 && ((a450) ((bwr) this).viewModel).isShowing()) {
            m12943Z3();
            ((a450) ((bwr) this).viewModel).mo5216p();
        }
        ((a450) ((bwr) this).viewModel).m9315L(5 - l2.intValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c4 */
    private void m12938c4() {
        ((a450) ((bwr) this).viewModel).m9316M(((x350) m25547E2()).m14582l0(), ((x350) m25547E2()).m14603u0(), ((x350) m25547E2()).m25674S2());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d4 */
    private void m12939d4() {
        m14186H3(((x350) m25547E2()).m14575i2(TimeUnit.SECONDS)).filter(new w9j() { // from class: l.c450
            public final Object call(Object obj) {
                return Boolean.valueOf(((Long) obj).longValue() <= 5);
            }
        }).subscribe(ffw.h(new e30() { // from class: l.d450
            public final void call(Object obj) {
                this.f9055a.m12937b4((Long) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T */
    public void m12940T() {
        super.T();
        duringCreated(((x350) m25547E2()).m17236l()).subscribe(ffw.d(new e30() { // from class: l.b450
            public final void call(Object obj) {
                this.f7975a.m12936X3((iqv) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [l.ho2] */
    /* JADX INFO: renamed from: W3 */
    public void m12941W3() {
        ((x350) m25547E2()).m14561e0(false, mo21430R2(), "OfficialShowCardDialog", new d30() { // from class: l.e450
            public final void call() {
                this.f9568a.m12944a4();
            }
        });
        zcu.c("p_user_live_end", sds.k().b((ho2) m25547E2(), true).e("LiveEnd").a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y3 */
    public void m12942Y3(BLiveOfficialShowCurrentAnchorInfo bLiveOfficialShowCurrentAnchorInfo) {
        m25548F2().JumpRoomEvent.jumpRoom().j(new JumpRoomData.C0350a().m6554t(((x350) m25547E2()).mo14591o0()).m6552r(((x350) m25547E2()).m17235k()).m6553s(((x350) m25547E2()).m17234j().room.id).m6551q(((x350) m25547E2()).m14582l0().name).m6556v(bLiveOfficialShowCurrentAnchorInfo.anchorLiveId).m6557w(bLiveOfficialShowCurrentAnchorInfo.anchorRoomId).m6548n(JumpRoomType.CHANGE_SOURCE_NO_BACK).m6547m());
    }

    /* JADX INFO: renamed from: Z3 */
    public void m12943Z3() {
        if (((Boolean) m14184F3(new t25(3400))).booleanValue()) {
            m25548F2().FragProxyEvent.switchNextLive().p();
        } else {
            lsi0.w(R$string.f3210ca);
        }
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ void m12944a4() {
        ((a450) ((bwr) this).viewModel).m9314K();
        lsi0.y("订阅成功");
    }
}
