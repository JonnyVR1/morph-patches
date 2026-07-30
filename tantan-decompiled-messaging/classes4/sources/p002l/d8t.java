package p002l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p000p1.mobile.putong.live.livingroom.archi.act.LiveAct;
import com.p000p1.mobile.putong.live.livingroom.officialshow.switchanchor.OfficialShowSwitchView;
import com.p1.mobile.longlink.msg.mln.OfficialShowMessage;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.live.base.bean.AnchorStartData;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.base.data.BLiveOfficialShowCurrentAnchorInfo;
import com.p1.mobile.putong.live.base.data.BLiveState;
import com.tantanapp.common.utils.ConnectivityReceiver;
import l.bwr;
import l.d30;
import l.e30;
import l.ffw;
import l.soj0;
import l.w9j;
import l.ypv;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class d8t extends h4t<x350, OfficialShowSwitchView> {

    /* JADX INFO: renamed from: l.d8t$a */
    public static /* synthetic */ class C0523a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f9116a;

        static {
            int[] iArr = new int[OfficialShowMessage.OfficialShowUpdateStatus.ActionType.values().length];
            f9116a = iArr;
            try {
                iArr[OfficialShowMessage.OfficialShowUpdateStatus.ActionType.updateAnchor.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9116a[OfficialShowMessage.OfficialShowUpdateStatus.ActionType.updateShowList.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public d8t(bsm bsmVar, OfficialShowSwitchView officialShowSwitchView) {
        super(bsmVar);
        C(officialShowSwitchView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W3 */
    public /* synthetic */ void m11634W3(soj0 soj0Var) {
        m11647f4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T */
    public void m11635T() {
        super.T();
        duringCreated(((x350) m25547E2()).m14596q1().T()).subscribe(ffw.d(new e30() { // from class: l.v7t
            public final void call(Object obj) {
                this.f21028a.m11644c4((OfficialShowMessage.OfficialShowUpdateStatus) obj);
            }
        }));
        duringCreated((c) m25548F2().OfficialShowEvent.switchOffAnchor().g()).subscribe(ffw.d(new e30() { // from class: l.w7t
            public final void call(Object obj) {
                this.f21550a.m11634W3((soj0) obj);
            }
        }));
        duringCreated(c.merge(ConnectivityReceiver.m().skip(1).filter(new w9j() { // from class: l.x7t
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.g());
            }
        }), lifecycle().filter(new w9j() { // from class: l.y7t
            public final Object call(Object obj) {
                return Boolean.valueOf(((com.p1.mobile.android.app.c) obj) == com.p1.mobile.android.app.c.i);
            }
        }))).filter(new w9j() { // from class: l.z7t
            public final Object call(Object obj) {
                return this.f23300a.m11639X3(obj);
            }
        }).subscribe(ffw.d(new e30() { // from class: l.a8t
            public final void call(Object obj) {
                this.f7449a.m11640Y3(obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX INFO: renamed from: T3 */
    public final void m11636T3(k450 k450Var, boolean z) {
        if (!t7t.m22811c(m25547E2())) {
            BLiveOfficialShowCurrentAnchorInfo bLiveOfficialShowCurrentAnchorInfoM25674S2 = ((x350) m25547E2()).m25674S2();
            m11648g4(k450Var, z);
            m11637U3(bLiveOfficialShowCurrentAnchorInfoM25674S2, ((x350) m25547E2()).m25674S2());
        } else {
            if (TextUtils.equals(k450Var.m16495a() != null ? k450Var.m16495a().anchorId : "", ypv.a.D0())) {
                m11648g4(k450Var, z);
            } else {
                m11647f4();
            }
        }
    }

    /* JADX INFO: renamed from: U3 */
    public final void m11637U3(BLiveOfficialShowCurrentAnchorInfo bLiveOfficialShowCurrentAnchorInfo, BLiveOfficialShowCurrentAnchorInfo bLiveOfficialShowCurrentAnchorInfo2) {
        if (bLiveOfficialShowCurrentAnchorInfo2 == null) {
            return;
        }
        if (bLiveOfficialShowCurrentAnchorInfo == null) {
            m25548F2().PlayerEvent.refreshPlayAddress().p();
            ((OfficialShowSwitchView) ((bwr) this).viewModel).m9065q(bLiveOfficialShowCurrentAnchorInfo2);
        } else {
            if (TextUtils.equals(bLiveOfficialShowCurrentAnchorInfo.anchorId, bLiveOfficialShowCurrentAnchorInfo2.anchorId)) {
                return;
            }
            m25548F2().PlayerEvent.pausePlay().p();
            m25548F2().PlayerEvent.switchMute().j(Boolean.TRUE);
            ((OfficialShowSwitchView) ((bwr) this).viewModel).m9064p(bLiveOfficialShowCurrentAnchorInfo, bLiveOfficialShowCurrentAnchorInfo2, new d30() { // from class: l.b8t
                public final void call() {
                    this.f8036a.m11641Z3();
                }
            }, new d30() { // from class: l.c8t
                public final void call() {
                    this.f8561a.m11642a4();
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V3 */
    public final void m11638V3(OfficialShowMessage.OfficialShowUpdateStatus officialShowUpdateStatus) {
        BLiveAbsData bLiveAbsDataM17234j = ((x350) m25547E2()).m17234j();
        if (officialShowUpdateStatus.getAction() == OfficialShowMessage.OfficialShowUpdateStatus.ActionType.liveRecover) {
            bLiveAbsDataM17234j.state = BLiveState.get("onlive");
        } else if (officialShowUpdateStatus.getAction() == OfficialShowMessage.OfficialShowUpdateStatus.ActionType.livePause) {
            bLiveAbsDataM17234j.state = BLiveState.get("suspended");
        }
        ((x350) m25547E2()).m17232g(bLiveAbsDataM17234j);
        ((x350) m25547E2()).m14535V(bLiveAbsDataM17234j);
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ Boolean m11639X3(Object obj) {
        return Boolean.valueOf(lifecycle_() == com.p1.mobile.android.app.c.i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m11640Y3(Object obj) {
        m11645d4(((x350) m25547E2()).m17235k(), true, true);
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m11641Z3() {
        m25548F2().PlayerEvent.refreshPlayAddress().p();
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ void m11642a4() {
        m25548F2().PlayerEvent.switchMute().j(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m11643b4(boolean z, boolean z2, k450 k450Var) {
        if (z) {
            m11636T3(k450Var, z2);
        } else {
            m11648g4(k450Var, z2);
        }
        if (k450Var == null || k450Var.m16495a() == null || TextUtils.isEmpty(k450Var.m16495a().anchorId)) {
            m25548F2().PlayerEvent.pausePlay().p();
            m11646e4();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [l.ho2] */
    /* JADX INFO: renamed from: c4 */
    public final void m11644c4(OfficialShowMessage.OfficialShowUpdateStatus officialShowUpdateStatus) {
        int i = C0523a.f9116a[officialShowUpdateStatus.getAction().ordinal()];
        if (i == 1) {
            m11645d4(((x350) m25547E2()).m17235k(), true, true);
        } else if (i == 2) {
            m11645d4(((x350) m25547E2()).m17235k(), false, false);
        }
        if (t7t.m22811c(m25547E2())) {
            return;
        }
        m11638V3(officialShowUpdateStatus);
    }

    /* JADX INFO: renamed from: d4 */
    public void m11645d4(String str, final boolean z, final boolean z2) {
        duringCreated(LivingNormalApiProvider.m4922q7(str)).subscribe(ffw.d(new e30() { // from class: l.u7t
            public final void call(Object obj) {
                this.f20532a.m11643b4(z, z2, (k450) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: e4 */
    public final void m11646e4() {
        m25548F2().PlayerEvent.pausePlay().p();
        m25548F2().PlayerEvent.showSuspendText().j("主播正在赶来路上");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f4 */
    public final void m11647f4() {
        if (act() instanceof LiveAct) {
            AnchorStartData.OfficialShowSwitchRoomData officialShowSwitchRoomData = new AnchorStartData.OfficialShowSwitchRoomData();
            officialShowSwitchRoomData.liveId = ((x350) m25547E2()).m17235k();
            officialShowSwitchRoomData.avatarUrl = ((Media) ((x350) m25547E2()).m14582l0().fp()).url;
            officialShowSwitchRoomData.name = ((x350) m25547E2()).m14582l0().name;
            act().m5029r2(AnchorStartData.getBuilder().m(false).l(true).q(officialShowSwitchRoomData).k());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g4 */
    public final void m11648g4(k450 k450Var, boolean z) {
        if (z) {
            ((x350) m25547E2()).m25675T2(k450Var.m16495a());
            m25548F2().BottomEvent.callBottomButtonApiDiffRefresh().p();
            m25548F2().OfficialShowEvent.updateCurrentAnchor().p();
        }
        m25548F2().OfficialShowEvent.updateList().j(k450Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t */
    public void m11649t() {
        super.t();
        m11645d4(((x350) m25547E2()).m17235k(), false, true);
    }
}
