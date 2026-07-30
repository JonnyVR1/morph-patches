package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.longlink.msg.mln.OfficialShowMessage;
import com.p046p1.mobile.putong.live.base.bean.AnchorStartData;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveOfficialShowCurrentAnchorInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveState;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.archi.act.LiveAct;
import com.p046p1.mobile.putong.live.livingroom.officialshow.switchanchor.OfficialShowSwitchView;
import com.tantanapp.common.utils.ConnectivityReceiver;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
public class d8t extends h4t<x350, OfficialShowSwitchView> {

    /* JADX INFO: renamed from: l.d8t$a */
    public static /* synthetic */ class C16313a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f84894a;

        static {
            int[] iArr = new int[OfficialShowMessage.OfficialShowUpdateStatus.ActionType.values().length];
            f84894a = iArr;
            try {
                iArr[OfficialShowMessage.OfficialShowUpdateStatus.ActionType.updateAnchor.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f84894a[OfficialShowMessage.OfficialShowUpdateStatus.ActionType.updateShowList.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public d8t(bsm bsmVar, OfficialShowSwitchView officialShowSwitchView) {
        super(bsmVar);
        mo51532C(officialShowSwitchView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W3 */
    public /* synthetic */ void m110378W3(soj0 soj0Var) {
        m110390f4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(((x350) m206027E2()).m132160q1().m189072T()).subscribe(ffw.m121193d(new e30() { // from class: l.v7t
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f180416a.m110387c4((OfficialShowMessage.OfficialShowUpdateStatus) obj);
            }
        }));
        duringCreated(m206028F2().OfficialShowEvent.switchOffAnchor().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.w7t
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f185096a.m110378W3((soj0) obj);
            }
        }));
        duringCreated(C22306c.merge(ConnectivityReceiver.m81290m().skip(1).filter(new w9j() { // from class: l.x7t
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m81284g());
            }
        }), lifecycle().filter(new w9j() { // from class: l.y7t
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
            }
        }))).filter(new w9j() { // from class: l.z7t
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f202074a.m110382X3(obj);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.a8t
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f68076a.m110383Y3(obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX INFO: renamed from: T3 */
    public final void m110379T3(k450 k450Var, boolean z) {
        if (!t7t.m187503c(m206027E2())) {
            BLiveOfficialShowCurrentAnchorInfo bLiveOfficialShowCurrentAnchorInfoM206897S2 = ((x350) m206027E2()).m206897S2();
            m110391g4(k450Var, z);
            m110380U3(bLiveOfficialShowCurrentAnchorInfoM206897S2, ((x350) m206027E2()).m206897S2());
        } else {
            if (TextUtils.equals(k450Var.m144476a() != null ? k450Var.m144476a().anchorId : "", ypv.f199493a.m199309D0())) {
                m110391g4(k450Var, z);
            } else {
                m110390f4();
            }
        }
    }

    /* JADX INFO: renamed from: U3 */
    public final void m110380U3(BLiveOfficialShowCurrentAnchorInfo bLiveOfficialShowCurrentAnchorInfo, BLiveOfficialShowCurrentAnchorInfo bLiveOfficialShowCurrentAnchorInfo2) {
        if (bLiveOfficialShowCurrentAnchorInfo2 == null) {
            return;
        }
        if (bLiveOfficialShowCurrentAnchorInfo == null) {
            m206028F2().PlayerEvent.refreshPlayAddress().m172467p();
            ((OfficialShowSwitchView) this.viewModel).m75432q(bLiveOfficialShowCurrentAnchorInfo2);
        } else {
            if (TextUtils.equals(bLiveOfficialShowCurrentAnchorInfo.anchorId, bLiveOfficialShowCurrentAnchorInfo2.anchorId)) {
                return;
            }
            m206028F2().PlayerEvent.pausePlay().m172467p();
            m206028F2().PlayerEvent.switchMute().mo172463j(Boolean.TRUE);
            ((OfficialShowSwitchView) this.viewModel).m75431p(bLiveOfficialShowCurrentAnchorInfo, bLiveOfficialShowCurrentAnchorInfo2, new d30() { // from class: l.b8t
                @Override // p149l.d30
                public final void call() {
                    this.f74162a.m110384Z3();
                }
            }, new d30() { // from class: l.c8t
                @Override // p149l.d30
                public final void call() {
                    this.f79813a.m110385a4();
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V3 */
    public final void m110381V3(OfficialShowMessage.OfficialShowUpdateStatus officialShowUpdateStatus) {
        BLiveAbsData bLiveAbsDataMo149813j = ((x350) m206027E2()).mo149813j();
        if (officialShowUpdateStatus.getAction() == OfficialShowMessage.OfficialShowUpdateStatus.ActionType.liveRecover) {
            bLiveAbsDataMo149813j.state = BLiveState.get("onlive");
        } else if (officialShowUpdateStatus.getAction() == OfficialShowMessage.OfficialShowUpdateStatus.ActionType.livePause) {
            bLiveAbsDataMo149813j.state = BLiveState.get("suspended");
        }
        ((x350) m206027E2()).mo149811g(bLiveAbsDataMo149813j);
        ((x350) m206027E2()).m132099V(bLiveAbsDataMo149813j);
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ Boolean m110382X3(Object obj) {
        return Boolean.valueOf(lifecycle_() == C4319c.f15548i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m110383Y3(Object obj) {
        m110388d4(((x350) m206027E2()).m149814k(), true, true);
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m110384Z3() {
        m206028F2().PlayerEvent.refreshPlayAddress().m172467p();
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ void m110385a4() {
        m206028F2().PlayerEvent.switchMute().mo172463j(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m110386b4(boolean z, boolean z2, k450 k450Var) {
        if (z) {
            m110379T3(k450Var, z2);
        } else {
            m110391g4(k450Var, z2);
        }
        if (k450Var == null || k450Var.m144476a() == null || TextUtils.isEmpty(k450Var.m144476a().anchorId)) {
            m206028F2().PlayerEvent.pausePlay().m172467p();
            m110389e4();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [l.ho2] */
    /* JADX INFO: renamed from: c4 */
    public final void m110387c4(OfficialShowMessage.OfficialShowUpdateStatus officialShowUpdateStatus) {
        int i = C16313a.f84894a[officialShowUpdateStatus.getAction().ordinal()];
        if (i == 1) {
            m110388d4(((x350) m206027E2()).m149814k(), true, true);
        } else if (i == 2) {
            m110388d4(((x350) m206027E2()).m149814k(), false, false);
        }
        if (t7t.m187503c(m206027E2())) {
            return;
        }
        m110381V3(officialShowUpdateStatus);
    }

    /* JADX INFO: renamed from: d4 */
    public void m110388d4(String str, final boolean z, final boolean z2) {
        duringCreated(LivingNormalApiProvider.m71556q7(str)).subscribe(ffw.m121193d(new e30() { // from class: l.u7t
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f175068a.m110386b4(z, z2, (k450) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: e4 */
    public final void m110389e4() {
        m206028F2().PlayerEvent.pausePlay().m172467p();
        m206028F2().PlayerEvent.showSuspendText().mo172463j("主播正在赶来路上");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f4 */
    public final void m110390f4() {
        if (act() instanceof LiveAct) {
            AnchorStartData.OfficialShowSwitchRoomData officialShowSwitchRoomData = new AnchorStartData.OfficialShowSwitchRoomData();
            officialShowSwitchRoomData.liveId = ((x350) m206027E2()).m149814k();
            officialShowSwitchRoomData.avatarUrl = ((x350) m206027E2()).m132146l0().m60124fp().url;
            officialShowSwitchRoomData.name = ((x350) m206027E2()).m132146l0().name;
            ((LiveAct) act()).m71663r2(AnchorStartData.getBuilder().m67562m(false).m67561l(true).m67566q(officialShowSwitchRoomData).m67560k());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g4 */
    public final void m110391g4(k450 k450Var, boolean z) {
        if (z) {
            ((x350) m206027E2()).m206898T2(k450Var.m144476a());
            m206028F2().BottomEvent.callBottomButtonApiDiffRefresh().m172467p();
            m206028F2().OfficialShowEvent.updateCurrentAnchor().m172467p();
        }
        m206028F2().OfficialShowEvent.updateList().mo172463j(k450Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        m110388d4(((x350) m206027E2()).m149814k(), false, true);
    }
}
