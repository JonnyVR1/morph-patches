package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.longlink.msg.mln.OfficialShowMessage;
import com.p051p1.mobile.putong.live.base.bean.AnchorStartData;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveOfficialShowCurrentAnchorInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveState;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.archi.act.LiveAct;
import com.p051p1.mobile.putong.live.livingroom.officialshow.switchanchor.OfficialShowSwitchView;
import com.tantanapp.common.utils.ConnectivityReceiver;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
public class eat extends i6t<mc50, OfficialShowSwitchView> {

    /* JADX INFO: renamed from: l.eat$a */
    public static /* synthetic */ class C16745a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f92807a;

        static {
            int[] iArr = new int[OfficialShowMessage.OfficialShowUpdateStatus.ActionType.values().length];
            f92807a = iArr;
            try {
                iArr[OfficialShowMessage.OfficialShowUpdateStatus.ActionType.updateAnchor.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f92807a[OfficialShowMessage.OfficialShowUpdateStatus.ActionType.updateShowList.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public eat(dum dumVar, OfficialShowSwitchView officialShowSwitchView) {
        super(dumVar);
        mo52715C(officialShowSwitchView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W3 */
    public /* synthetic */ void m120125W3(vxj0 vxj0Var) {
        m120137f4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(((mc50) m213810E2()).m168545q1().m98254T()).subscribe(dhw.m115825d(new y20() { // from class: l.w9t
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f188062a.m120134c4((OfficialShowMessage.OfficialShowUpdateStatus) obj);
            }
        }));
        duringCreated(m213811F2().OfficialShowEvent.switchOffAnchor().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.x9t
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f192960a.m120125W3((vxj0) obj);
            }
        }));
        duringCreated(C22421c.merge(ConnectivityReceiver.m82473m().skip(1).filter(new qcj() { // from class: l.y9t
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m82467g());
            }
        }), lifecycle().filter(new qcj() { // from class: l.z9t
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
            }
        }))).filter(new qcj() { // from class: l.aat
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f69171a.m120129X3(obj);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.bat
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f75732a.m120130Y3(obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    /* JADX INFO: renamed from: T3 */
    public final void m120126T3(zc50 zc50Var, boolean z) {
        if (!u9t.m195114c(m213810E2())) {
            BLiveOfficialShowCurrentAnchorInfo bLiveOfficialShowCurrentAnchorInfoM157913S2 = ((mc50) m213810E2()).m157913S2();
            m120138g4(zc50Var, z);
            m120127U3(bLiveOfficialShowCurrentAnchorInfoM157913S2, ((mc50) m213810E2()).m157913S2());
        } else {
            if (TextUtils.equals(zc50Var.m219233a() != null ? zc50Var.m219233a().anchorId : "", zrv.f205799a.m207631D0())) {
                m120138g4(zc50Var, z);
            } else {
                m120137f4();
            }
        }
    }

    /* JADX INFO: renamed from: U3 */
    public final void m120127U3(BLiveOfficialShowCurrentAnchorInfo bLiveOfficialShowCurrentAnchorInfo, BLiveOfficialShowCurrentAnchorInfo bLiveOfficialShowCurrentAnchorInfo2) {
        if (bLiveOfficialShowCurrentAnchorInfo2 == null) {
            return;
        }
        if (bLiveOfficialShowCurrentAnchorInfo == null) {
            m213811F2().PlayerEvent.refreshPlayAddress().m199277p();
            ((OfficialShowSwitchView) this.viewModel).m76615q(bLiveOfficialShowCurrentAnchorInfo2);
        } else {
            if (TextUtils.equals(bLiveOfficialShowCurrentAnchorInfo.anchorId, bLiveOfficialShowCurrentAnchorInfo2.anchorId)) {
                return;
            }
            m213811F2().PlayerEvent.pausePlay().m199277p();
            m213811F2().PlayerEvent.switchMute().mo199273j(Boolean.TRUE);
            ((OfficialShowSwitchView) this.viewModel).m76614p(bLiveOfficialShowCurrentAnchorInfo, bLiveOfficialShowCurrentAnchorInfo2, new x20() { // from class: l.cat
                @Override // p153l.x20
                public final void call() {
                    this.f80617a.m120131Z3();
                }
            }, new x20() { // from class: l.dat
                @Override // p153l.x20
                public final void call() {
                    this.f85924a.m120132a4();
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V3 */
    public final void m120128V3(OfficialShowMessage.OfficialShowUpdateStatus officialShowUpdateStatus) {
        BLiveAbsData bLiveAbsDataMo183435j = ((mc50) m213810E2()).mo183435j();
        if (officialShowUpdateStatus.getAction() == OfficialShowMessage.OfficialShowUpdateStatus.ActionType.liveRecover) {
            bLiveAbsDataMo183435j.state = BLiveState.get("onlive");
        } else if (officialShowUpdateStatus.getAction() == OfficialShowMessage.OfficialShowUpdateStatus.ActionType.livePause) {
            bLiveAbsDataMo183435j.state = BLiveState.get("suspended");
        }
        ((mc50) m213810E2()).mo183431g(bLiveAbsDataMo183435j);
        ((mc50) m213810E2()).m168485V(bLiveAbsDataMo183435j);
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ Boolean m120129X3(Object obj) {
        return Boolean.valueOf(lifecycle_() == C4470c.f16267i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m120130Y3(Object obj) {
        m120135d4(((mc50) m213810E2()).m202191k(), true, true);
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m120131Z3() {
        m213811F2().PlayerEvent.refreshPlayAddress().m199277p();
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ void m120132a4() {
        m213811F2().PlayerEvent.switchMute().mo199273j(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m120133b4(boolean z, boolean z2, zc50 zc50Var) {
        if (z) {
            m120126T3(zc50Var, z2);
        } else {
            m120138g4(zc50Var, z2);
        }
        if (zc50Var == null || zc50Var.m219233a() == null || TextUtils.isEmpty(zc50Var.m219233a().anchorId)) {
            m213811F2().PlayerEvent.pausePlay().m199277p();
            m120136e4();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [l.oo2] */
    /* JADX INFO: renamed from: c4 */
    public final void m120134c4(OfficialShowMessage.OfficialShowUpdateStatus officialShowUpdateStatus) {
        int i = C16745a.f92807a[officialShowUpdateStatus.getAction().ordinal()];
        if (i == 1) {
            m120135d4(((mc50) m213810E2()).m202191k(), true, true);
        } else if (i == 2) {
            m120135d4(((mc50) m213810E2()).m202191k(), false, false);
        }
        if (u9t.m195114c(m213810E2())) {
            return;
        }
        m120128V3(officialShowUpdateStatus);
    }

    /* JADX INFO: renamed from: d4 */
    public void m120135d4(String str, final boolean z, final boolean z2) {
        duringCreated(LivingNormalApiProvider.m72739q7(str)).subscribe(dhw.m115825d(new y20() { // from class: l.v9t
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f183039a.m120133b4(z, z2, (zc50) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: e4 */
    public final void m120136e4() {
        m213811F2().PlayerEvent.pausePlay().m199277p();
        m213811F2().PlayerEvent.showSuspendText().mo199273j("主播正在赶来路上");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f4 */
    public final void m120137f4() {
        if (act() instanceof LiveAct) {
            AnchorStartData.OfficialShowSwitchRoomData officialShowSwitchRoomData = new AnchorStartData.OfficialShowSwitchRoomData();
            officialShowSwitchRoomData.liveId = ((mc50) m213810E2()).m202191k();
            officialShowSwitchRoomData.avatarUrl = ((mc50) m213810E2()).m168532l0().m61308fp().url;
            officialShowSwitchRoomData.name = ((mc50) m213810E2()).m168532l0().name;
            ((LiveAct) act()).m72846s2(AnchorStartData.getBuilder().m68745m(false).m68744l(true).m68749q(officialShowSwitchRoomData).m68743k());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g4 */
    public final void m120138g4(zc50 zc50Var, boolean z) {
        if (z) {
            ((mc50) m213810E2()).m157914T2(zc50Var.m219233a());
            m213811F2().BottomEvent.callBottomButtonApiDiffRefresh().m199277p();
            m213811F2().OfficialShowEvent.updateCurrentAnchor().m199277p();
        }
        m213811F2().OfficialShowEvent.updateList().mo199273j(zc50Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        m120135d4(((mc50) m213810E2()).m202191k(), false, true);
    }
}
