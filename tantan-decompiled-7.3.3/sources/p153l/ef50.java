package p153l;

import android.text.TextUtils;
import android.util.Log;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.live.LiveDialogAct;
import com.p051p1.mobile.putong.live.base.data.BLive;
import com.p051p1.mobile.putong.live.base.data.BLiveOfficialShowCurrentAnchorInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveSettings;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.frag.RoomFrag;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p051p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p051p1.mobile.putong.live.livingroom.officialshow.OfficialShowView;
import com.p051p1.mobile.putong.live.livingroom.other.liveend.LiveEndAct;
import com.p051p1.mobile.putong.live.livingroom.util.pref.LiveWatchCounter;
import com.tantanapp.common.utils.CrashHelper;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public class ef50 extends AbstractC21253x5<mc50, BLive, ad50, OfficialShowView> {

    /* JADX INFO: renamed from: j */
    public final RoomFrag f93703j;

    /* JADX INFO: renamed from: k */
    public final ogd0 f93704k;

    /* JADX INFO: renamed from: l */
    public kcg0 f93705l;

    /* JADX INFO: renamed from: m */
    public kcg0 f93706m;

    /* JADX INFO: renamed from: n */
    public String f93707n;

    /* JADX WARN: Multi-variable type inference failed */
    public ef50(ad50 ad50Var, ogd0 ogd0Var, OfficialShowView officialShowView) {
        super(ad50Var);
        this.f93703j = (RoomFrag) ad50Var.f90820f;
        this.f93704k = ogd0Var;
        mo52715C(officialShowView);
        ad50Var.m118163a(this, (ViewGroup) this.viewModel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A4 */
    public /* synthetic */ Integer m120588A4(hmd0 hmd0Var) {
        return Integer.valueOf(((OfficialShowView) this.viewModel).getHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B4 */
    private void m120589B4(v9s v9sVar) {
        String strM200457l = v9sVar.m200457l();
        m213811F2().ChatEvent.dismissDialog().m199277p();
        BLiveOfficialShowCurrentAnchorInfo bLiveOfficialShowCurrentAnchorInfoM157913S2 = ((mc50) m213810E2()).m157913S2();
        if (bLiveOfficialShowCurrentAnchorInfoM157913S2 == null) {
            act().m68056e2();
            return;
        }
        if (v9sVar.m200459n()) {
            BLive bLiveNew_ = BLive.new_();
            bLiveNew_.f45171id = bLiveOfficialShowCurrentAnchorInfoM157913S2.anchorLiveId;
            act().startActivity(LiveEndAct.m76661X1(act(), bLiveNew_, zrv.f205799a.m207651V(), strM200457l, "", ((mc50) m213810E2()).m202200x()));
        } else {
            LiveDialogAct.m68360h2(act(), "", strM200457l);
        }
        act().m68056e2();
    }

    /* JADX INFO: renamed from: E4 */
    private void m120590E4(String str, String str2, x20 x20Var) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Dialog.C4460e c4460eM21495B = act().dialog().m21503F(str).m21495B(false);
        Objects.requireNonNull(x20Var);
        c4460eM21495B.m21543n0(str2, new bri0(x20Var)).m21567z0();
    }

    /* JADX INFO: renamed from: m4 */
    public static /* synthetic */ void m120594m4() {
    }

    /* JADX INFO: renamed from: q4 */
    public static /* synthetic */ void m120598q4(Throwable th) {
    }

    /* JADX INFO: renamed from: s4 */
    private void m120600s4() {
        psd0.m173633z(this.f93706m);
        this.f93706m = duringCreated(((OfficialShowView) this.viewModel).getGiftWidthObs()).onBackpressureLatest().filter(new qcj() { // from class: l.af50
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((Integer) obj).intValue() > 0);
            }
        }).distinctUntilChanged().subscribe(dhw.m115826e(new y20() { // from class: l.bf50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f76459a.m120601v4((Integer) obj);
            }
        }, new y20() { // from class: l.cf50
            @Override // p153l.y20
            public final void call(Object obj) {
                ef50.m120598q4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v4 */
    public /* synthetic */ void m120601v4(Integer num) {
        m213811F2().ChatEvent.changeInputSize().mo199273j(new Size((bnl0.m105592y0() - num.intValue()) - bnl0.m105587w(56.0f), 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w4 */
    public /* synthetic */ void m120602w4(jsv jsvVar) {
        m163464M3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x4 */
    public /* synthetic */ void m120603x4(BLiveSettings bLiveSettings) {
        ((mc50) m213810E2()).m168480T0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y4 */
    public /* synthetic */ void m120604y4(jsv jsvVar) {
        if (jsvVar.m146885k()) {
            ((mc50) m213810E2()).mo146096e2(false, ((mc50) m213810E2()).mo183435j());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.oo2] */
    /* JADX INFO: renamed from: z4 */
    public /* synthetic */ void m120605z4(LiveControlMessage liveControlMessage) {
        nsh0.m164608j("[live]msg_observer_handler", "room presenter received control message," + liveControlMessage);
        String str = liveControlMessage.type;
        switch (str.hashCode()) {
            case -2140406257:
                if (!str.equals("add_manager")) {
                    return;
                }
                break;
            case -1896170388:
                str.equals("live_pull_update_video_quality");
                return;
            case -887328209:
                if (str.equals("system")) {
                    m120590E4(liveControlMessage.content, this.f196919f.getString(R$string.f48494y5), new x20() { // from class: l.df50
                        @Override // p153l.x20
                        public final void call() {
                            ef50.m120594m4();
                        }
                    });
                    return;
                }
                return;
            case -866625755:
                if (str.equals("re_request_room_gift_list")) {
                    muj.m160221w(true);
                    if (m213810E2() == 0 || ((mc50) m213810E2()).m157913S2() == null) {
                        return;
                    }
                    ((mc50) m213810E2()).m168445A1(new uxj.C20693a(((mc50) m213810E2()).m202194o(), mc50.m157912R2(m213810E2(), ((mc50) m213810E2()).m168526j0()), "live").m198494f(), null);
                    return;
                }
                return;
            case -484821221:
                if (str.equals("chat_tip_change")) {
                    ((mc50) m213810E2()).m168464L1();
                    return;
                }
                return;
            case 3029746:
                if (str.equals("boot")) {
                    CrashHelper.m82479c(new IllegalStateException("live boot handle2 with content" + liveControlMessage.content));
                    ((mc50) m213810E2()).m168518g2(((mc50) m213810E2()).mo183435j());
                    m120630t4();
                    act().m68056e2();
                    if (liveControlMessage.isFromLiveRoomBlock() && wft.m206159b(2)) {
                        o1j0.m165651y(liveControlMessage.content);
                        return;
                    } else {
                        LiveDialogAct.m68360h2(act(), "", liveControlMessage.content);
                        return;
                    }
                }
                return;
            case 3540994:
                if (str.equals("stop")) {
                    ((mc50) m213810E2()).mo160116h(v9s.f183031e);
                    return;
                }
                return;
            case 106440182:
                if (str.equals("pause")) {
                    ((mc50) m213810E2()).mo160116h(qcu.f156623b);
                    return;
                }
                return;
            case 109757538:
                str.equals("start");
                return;
            case 134762710:
                if (str.equals("force_stop")) {
                    ((mc50) m213810E2()).mo160116h(v9s.f183031e);
                    m120589B4(new v9s(liveControlMessage.content, true));
                    return;
                }
                return;
            case 379400585:
                if (str.equals("forbidden_multidevice")) {
                    String string = liveControlMessage.isAnchor ? zrv.f205803e.getString(R$string.f47820T5) : zrv.f205803e.getString(R$string.f47778R5);
                    ((mc50) m213810E2()).m168518g2(((mc50) m213810E2()).mo183435j());
                    m120630t4();
                    act().m68056e2();
                    LiveDialogAct.m68360h2(act(), "", string);
                    return;
                }
                return;
            case 1075863833:
                if (!str.equals("delete_manager")) {
                    return;
                }
                break;
            default:
                return;
        }
        ((mc50) m213810E2()).mo118370K1(((mc50) m213810E2()).m202194o());
    }

    @Override // p153l.AbstractC21253x5
    /* JADX INFO: renamed from: D4, reason: merged with bridge method [inline-methods] */
    public void mo120623c4(BLive bLive) {
        m213811F2().PlayerEvent.quickPlay().mo199273j(bLive);
    }

    @Override // p153l.njt
    /* JADX INFO: renamed from: J3 */
    public void mo120608J3() {
        super.mo120608J3();
        r230.m179475p("context_single_room");
    }

    @Override // p153l.AbstractC21253x5
    /* JADX INFO: renamed from: N3 */
    public void mo120609N3() {
        this.f93707n = null;
        m213811F2().PreLoadEvent.cleanPreLoad().m199277p();
    }

    @Override // p153l.AbstractC21253x5
    /* JADX INFO: renamed from: O3 */
    public boolean mo120610O3() {
        return u9t.m195114c(this.f196918e.f90822h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.AbstractC21253x5
    /* JADX INFO: renamed from: R3 */
    public View mo120612R3() {
        return (View) this.viewModel;
    }

    @Override // p153l.AbstractC21253x5
    /* JADX INFO: renamed from: T3 */
    public void mo120614T3(y20<ugd0> y20Var) {
        m213811F2().RoomInfoEvent.initSmallWindowRoomInfo().mo199273j(new vgd0(y20Var, null, false, null, false));
    }

    @Override // p153l.AbstractC21253x5
    /* JADX INFO: renamed from: U3 */
    public boolean mo120615U3(int i) {
        return false;
    }

    @Override // p153l.AbstractC21253x5
    /* JADX INFO: renamed from: V3 */
    public boolean mo120616V3() {
        return false;
    }

    @Override // p153l.AbstractC21253x5
    /* JADX INFO: renamed from: W3 */
    public boolean mo120617W3() {
        return this.f93707n != null;
    }

    @Override // p153l.AbstractC21253x5
    /* JADX INFO: renamed from: X3 */
    public boolean mo120618X3(int i) {
        if (!u9t.m195114c(this.f196918e.f90822h)) {
            return false;
        }
        m213811F2().LivePusherEvent.closeLive().m199277p();
        return true;
    }

    @Override // p153l.AbstractC21253x5
    /* JADX INFO: renamed from: Y3 */
    public boolean mo120619Y3(boolean z, boolean z2) {
        return false;
    }

    @Override // p153l.AbstractC21253x5
    /* JADX INFO: renamed from: Z3 */
    public void mo120620Z3() {
        this.f93704k.m167571h1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.AbstractC21253x5
    /* JADX INFO: renamed from: e4 */
    public void mo120624e4(JumpRoomData jumpRoomData) {
        ((mc50) m213810E2()).m169230O2(jumpRoomData);
    }

    @Override // p153l.AbstractC21253x5
    /* JADX INFO: renamed from: f4 */
    public void mo120625f4(qwl qwlVar) {
        m213811F2().PlayerEvent.updatePlayer().mo199273j(qwlVar);
    }

    @Override // p153l.AbstractC21253x5
    /* JADX INFO: renamed from: g4 */
    public void mo120626g4(boolean z) {
        V v2 = this.viewModel;
        if (v2 == 0) {
            return;
        }
        ((OfficialShowView) v2).setSwallowAllTouchEvent(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.dum] */
    @Override // p153l.AbstractC21253x5
    /* JADX INFO: renamed from: i4 */
    public void mo120627i4() {
        zrv.m221197r();
        m153103z2(this.f93704k.m167591x0().m158075I2(m163462K3()));
        de50.m115393a(this, (ad50) m163462K3(), (OfficialShowView) this.viewModel);
        super.mo71381T();
        ((mc50) m213810E2()).mo168507c2();
        ((OfficialShowView) this.viewModel).m76559C(true);
        m120600s4();
        duringCreated(((mc50) m213810E2()).mo183454y()).subscribe(dhw.m115825d(new y20() { // from class: l.ve50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f183700a.m120602w4((jsv) obj);
            }
        }));
        duringCreated(zrv.m221193k().m159274k()).subscribe(dhw.m115825d(new y20() { // from class: l.we50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f188667a.m120603x4((BLiveSettings) obj);
            }
        }));
        duringCreated(((mc50) m213810E2()).m202192l()).subscribe(dhw.m115825d(new y20() { // from class: l.xe50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f193737a.m120604y4((jsv) obj);
            }
        }));
        this.f93705l = ((mc50) m213810E2()).m168541o1(this.f196919f).subscribe(dhw.m115825d(new y20() { // from class: l.ye50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f198664a.m120605z4((LiveControlMessage) obj);
            }
        }));
        ((mc50) m213810E2()).m168470P1();
        LiveWatchCounter.m77513h().m77515f(1);
        LiveWatchCounter.m77513h().m77516g(1);
        this.f93707n = null;
        m138860d3(hmd0.class, new qcj() { // from class: l.ze50
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f203981a.m120588A4((hmd0) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.AbstractC21253x5
    public void init() {
        m153103z2(new i5j(this.f196918e, this.f93704k));
        de50.m115394b(this, (ad50) m163462K3(), (OfficialShowView) this.viewModel);
        ((OfficialShowView) this.viewModel).m76562w(this.f93703j.f48586A);
    }

    @Override // p153l.AbstractC21253x5
    /* JADX INFO: renamed from: m */
    public void mo120628m(boolean z) {
        m213811F2().PlayerEvent.showLoading().mo199273j(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        this.f196918e.f90824j.destroy();
        r230.m179475p("context_single_room");
        psd0.m173633z(this.f93705l);
        if (mo120616V3()) {
            ((mc50) this.f196918e.f90822h).mo146610c0(true);
        } else {
            ((mc50) m213810E2()).exit();
            ((mc50) this.f196918e.f90822h).m169223H2();
        }
    }

    @Override // p153l.l6t
    /* JADX INFO: renamed from: s2 */
    public void mo120629s2() {
        super.mo120629s2();
        psd0.m173633z(this.f93706m);
        ((OfficialShowView) this.viewModel).destroy();
    }

    /* JADX INFO: renamed from: t4 */
    public void m120630t4() {
        mo120608J3();
    }

    @Override // p153l.AbstractC21253x5
    /* JADX INFO: renamed from: u4, reason: merged with bridge method [inline-methods] */
    public void mo120613S3(BLive bLive, boolean z, y20<ugd0> y20Var, y20<ugd0> y20Var2, boolean z2) {
        if (TextUtils.isEmpty(bLive.f45171id)) {
            nsh0.m164608j("[live][trace_problem]", Log.getStackTraceString(new Exception("initRoomInfo live.id is Null")));
        }
        m213811F2().RoomInfoEvent.initRoomInfo().mo199273j(new vgd0(y20Var2, bLive, z, y20Var, z2));
    }

    @Override // p153l.AbstractC21253x5
    /* JADX INFO: renamed from: P3 */
    public void mo120611P3() {
    }

    @Override // p153l.AbstractC21253x5
    /* JADX INFO: renamed from: a4 */
    public void mo120621a4() {
    }

    @Override // p153l.AbstractC21253x5
    /* JADX INFO: renamed from: C4, reason: merged with bridge method [inline-methods] */
    public void mo120622b4(boolean z, BLive bLive) {
    }
}
