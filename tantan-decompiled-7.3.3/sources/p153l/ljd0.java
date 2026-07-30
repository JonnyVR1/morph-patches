package p153l;

import android.text.TextUtils;
import android.util.Log;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.live.LiveDialogAct;
import com.p051p1.mobile.putong.live.base.data.BLive;
import com.p051p1.mobile.putong.live.base.data.BLiveSettings;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.frag.RoomFrag;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p051p1.mobile.putong.live.livingroom.base.room.RoomView;
import com.p051p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p051p1.mobile.putong.live.livingroom.util.pref.LiveWatchCounter;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public class ljd0 extends AbstractC21253x5<ou40, BLive, ow40, RoomView> {

    /* JADX INFO: renamed from: r */
    public static String f132319r = "";

    /* JADX INFO: renamed from: j */
    public ow40 f132320j;

    /* JADX INFO: renamed from: k */
    public final RoomFrag f132321k;

    /* JADX INFO: renamed from: l */
    public final ogd0 f132322l;

    /* JADX INFO: renamed from: m */
    public kcg0 f132323m;

    /* JADX INFO: renamed from: n */
    public kcg0 f132324n;

    /* JADX INFO: renamed from: o */
    public List<String> f132325o;

    /* JADX INFO: renamed from: p */
    public String f132326p;

    /* JADX INFO: renamed from: q */
    public boolean f132327q;

    /* JADX WARN: Multi-variable type inference failed */
    public ljd0(ow40 ow40Var, ogd0 ogd0Var, RoomView roomView) {
        super(ow40Var);
        this.f132320j = ow40Var;
        this.f132321k = (RoomFrag) ow40Var.f90820f;
        this.f132322l = ogd0Var;
        mo52715C(roomView);
        this.f132325o = new ArrayList();
        ow40Var.m118163a(this, (ViewGroup) this.viewModel);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A4 */
    private boolean m154468A4() {
        if (m213810E2() == 0 || ((ou40) m213810E2()).mo183435j() == null || TextUtils.isEmpty(((ou40) m213810E2()).mo183435j().streamUrl.pullFlv)) {
            return false;
        }
        return sjt.m186307a(((ou40) m213810E2()).mo183435j().streamUrl.pullFlv, "rtc");
    }

    /* JADX INFO: renamed from: P4 */
    private void m154469P4(String str, String str2, x20 x20Var) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Dialog.C4460e c4460eM21495B = act().dialog().m21503F(str).m21495B(false);
        Objects.requireNonNull(x20Var);
        c4460eM21495B.m21543n0(str2, new bri0(x20Var)).m21567z0();
    }

    /* JADX INFO: renamed from: j4 */
    public static /* synthetic */ void m154470j4(Throwable th) {
    }

    /* JADX INFO: renamed from: p4 */
    public static /* synthetic */ void m154476p4(y20 y20Var, ugd0 ugd0Var) {
        if (y20Var != null) {
            y20Var.call(ugd0Var);
        }
    }

    /* JADX INFO: renamed from: u4 */
    public static /* synthetic */ void m154481u4() {
    }

    /* JADX INFO: renamed from: w4 */
    private void m154483w4() {
        psd0.m173633z(this.f132324n);
        this.f132324n = duringCreated(((RoomView) this.viewModel).getGiftWidthObs()).onBackpressureLatest().filter(new qcj() { // from class: l.zid0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((Integer) obj).intValue() > 0);
            }
        }).distinctUntilChanged().subscribe(dhw.m115826e(new y20() { // from class: l.ajd0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f71811a.m154485C4((Integer) obj);
            }
        }, new y20() { // from class: l.bjd0
            @Override // p153l.y20
            public final void call(Object obj) {
                ljd0.m154470j4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: B4 */
    public boolean m154484B4() {
        Boolean bool;
        if (!vxr.m203876d().m170977G1() || (bool = zrv.f205799a.m207696u().live.closeSmallWindow) == null || !bool.booleanValue()) {
            return false;
        }
        htd0<ifv> htd0Var = htd0.f111523e;
        if (pzi0.m174454o() - ((ifv) zrv.m221194l(htd0Var)).f114712u.get().longValue() < 1209600000) {
            return false;
        }
        new th0.C20312a(this.f196919f).m191160s("悬浮窗播放,精彩不断").m191151j("开启悬浮窗播放功能，退出直播间还能继续观看精彩直播").m191156o(new View.OnClickListener() { // from class: l.yid0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f200077a.m154486D4(view);
            }
        }).m191143b(true).m191147f("暂不使用").m191159r("立即设置").m191142a().m191141g();
        ((ifv) zrv.m221194l(htd0Var)).f114712u.put(Long.valueOf(pzi0.m174454o()));
        return true;
    }

    /* JADX INFO: renamed from: C4 */
    public final /* synthetic */ void m154485C4(Integer num) {
        m213811F2().ChatEvent.changeInputSize().mo199273j(new Size((bnl0.m105592y0() - num.intValue()) - qa00.f156292E, 0));
    }

    /* JADX INFO: renamed from: D4 */
    public final /* synthetic */ void m154486D4(View view) {
        Act act = this.f196919f;
        act.startActivity(zrv.f205799a.m207688q(act));
    }

    /* JADX INFO: renamed from: E4 */
    public final /* synthetic */ void m154487E4(qwl qwlVar, Boolean bool) {
        if (bool.booleanValue()) {
            return;
        }
        this.f132327q = false;
        qwlVar.mo178522b(true);
    }

    /* JADX INFO: renamed from: F4 */
    public final /* synthetic */ void m154488F4(jsv jsvVar) {
        lej0 lej0Var = lej0.INSTANCE;
        lej0Var.m153910d("live_valid_state_module");
        m163464M3();
        lej0Var.m153907a("live_valid_state_module", "validStateModule");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G4 */
    public final /* synthetic */ void m154489G4(BLiveSettings bLiveSettings) {
        ((ou40) m213810E2()).m168480T0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H4 */
    public final /* synthetic */ void m154490H4(jsv jsvVar) {
        if (jsvVar.m146885k()) {
            ((ou40) m213810E2()).mo146096e2(false, ((ou40) m213810E2()).mo183435j());
            lej0.INSTANCE.m153907a("enter_live_room", "startLive");
        }
        if (!jsvVar.m146877c() || this.f132325o.contains(((ou40) m213810E2()).m202191k())) {
            return;
        }
        this.f132322l.m167575l1();
        this.f132325o.add(((ou40) m213810E2()).m202191k());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.oo2] */
    /* JADX INFO: renamed from: I4 */
    public final /* synthetic */ void m154491I4(LiveControlMessage liveControlMessage) {
        nsh0.m164608j("[live]msg_observer_handler", "room presenter received control message," + liveControlMessage);
        String str = liveControlMessage.type;
        str.getClass();
        switch (str) {
            case "add_manager":
            case "delete_manager":
                ((ou40) m213810E2()).mo118370K1(((ou40) m213810E2()).m202194o());
                break;
            case "live_pull_update_video_quality":
                m213811F2().PlayerEvent.refreshPlayAddress().m199277p();
                break;
            case "system":
                m154469P4(liveControlMessage.content, this.f196919f.getString(R$string.f48494y5), new x20() { // from class: l.kjd0
                    @Override // p153l.x20
                    public final void call() {
                        ljd0.m154481u4();
                    }
                });
                break;
            case "re_request_room_gift_list":
                muj.m160221w(true);
                ((ou40) m213810E2()).m168445A1(new uxj.C20693a(((ou40) m213810E2()).m202194o(), mc50.m157912R2(m213810E2(), ((ou40) m213810E2()).m168532l0().f56859id), "live").m198494f(), null);
                break;
            case "chat_tip_change":
                ((ou40) m213810E2()).m168464L1();
                break;
            case "boot":
                CrashHelper.m82479c(new IllegalStateException("live boot handle with content" + liveControlMessage.content));
                ((ou40) m213810E2()).m168518g2(((ou40) m213810E2()).mo183435j());
                m154501y4();
                act().lambda$debugItems$19();
                if (!liveControlMessage.isFromLiveRoomBlock() || !wft.m206159b(2)) {
                    LiveDialogAct.m68361i2(act(), "", liveControlMessage.content, !wft.m206159b(2));
                    break;
                } else {
                    o1j0.m165651y(liveControlMessage.content);
                    break;
                }
                break;
            case "stop":
            case "force_stop":
                ((ou40) m213810E2()).mo160116h(v9s.f183031e);
                break;
            case "pause":
                ((ou40) m213810E2()).mo160116h(qcu.f156623b);
                break;
            case "start":
                this.f132325o.clear();
                break;
            case "forbidden_multidevice":
                String string = liveControlMessage.isAnchor ? zrv.f205803e.getString(R$string.f47820T5) : zrv.f205803e.getString(R$string.f47778R5);
                ((ou40) m213810E2()).m168518g2(((ou40) m213810E2()).mo183435j());
                m154501y4();
                act().lambda$debugItems$19();
                LiveDialogAct.m68360h2(act(), "", string);
                break;
        }
    }

    @Override // p153l.njt
    /* JADX INFO: renamed from: J3 */
    public void mo120608J3() {
        super.mo120608J3();
        r230.m179475p("context_single_room");
    }

    /* JADX INFO: renamed from: J4 */
    public final /* synthetic */ Integer m154492J4(hmd0 hmd0Var) {
        return Integer.valueOf(((RoomView) this.viewModel).getHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K4 */
    public boolean m154493K4() {
        if ("square-curated".equals(m138866m3())) {
            return false;
        }
        return ((ou40) m213810E2()).m202195r();
    }

    /* JADX INFO: renamed from: L4 */
    public boolean m154494L4(boolean z) {
        if (this.f132327q) {
            return true;
        }
        lwr.m156094b();
        if (m154493K4()) {
            this.f132327q = m154498Q4(this.f132322l.m167540C0(), z);
        }
        return this.f132327q;
    }

    @Override // p153l.AbstractC21253x5
    /* JADX INFO: renamed from: M4, reason: merged with bridge method [inline-methods] */
    public void mo120622b4(boolean z, BLive bLive) {
        if (TextUtils.equals(this.f132326p, bLive.f45171id)) {
            return;
        }
        this.f132326p = bLive.f45171id;
        m213811F2().PreLoadEvent.preLoad().mo199273j(new om80(z, bLive));
    }

    @Override // p153l.AbstractC21253x5
    /* JADX INFO: renamed from: N3 */
    public void mo120609N3() {
        this.f132326p = null;
        m213811F2().PreLoadEvent.cleanPreLoad().m199277p();
    }

    @Override // p153l.AbstractC21253x5
    /* JADX INFO: renamed from: N4, reason: merged with bridge method [inline-methods] */
    public void mo120623c4(BLive bLive) {
        m213811F2().PlayerEvent.quickPlay().mo199273j(bLive);
    }

    /* JADX INFO: renamed from: O4 */
    public final void m154497O4(boolean z) {
        if (m154493K4() ? true ^ z : true) {
            iti.m142051c().m142053b();
        }
    }

    @Override // p153l.AbstractC21253x5
    /* JADX INFO: renamed from: P3 */
    public void mo120611P3() {
        if (lti.m155791f()) {
            m154494L4(true);
            m154497O4(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q4 */
    public boolean m154498Q4(String str, boolean z) {
        fyb fybVar = (fyb) m138856F3(new gyb(2000));
        hti htiVar = new hti((dw40) m213810E2(), m138867n3(), str, NullChecker.m82486a(fybVar) ? fybVar.f101359c : 0.0f);
        final qwl qwlVar = (qwl) m138856F3(new xsi(2000));
        m154500x4(qwlVar);
        htiVar.m137084i(qwlVar);
        duringCreated(htiVar.m137077b().take(1)).subscribe(dhw.m115825d(new y20() { // from class: l.hjd0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f110181a.m154487E4(qwlVar, (Boolean) obj);
            }
        }));
        return vxr.m203876d().m170977G1() ? pzm.m174537c().m174542f(htiVar, true) : lti.m155789d().m155795i(htiVar, this.f196919f, z);
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
        return mo120618X3(i);
    }

    @Override // p153l.AbstractC21253x5
    /* JADX INFO: renamed from: V3 */
    public boolean mo120616V3() {
        return this.f132327q;
    }

    @Override // p153l.AbstractC21253x5
    /* JADX INFO: renamed from: W3 */
    public boolean mo120617W3() {
        return this.f132326p != null;
    }

    @Override // p153l.AbstractC21253x5
    /* JADX INFO: renamed from: X3 */
    public boolean mo120618X3(int i) {
        return ((Boolean) m138856F3(new v24(3400, i))).booleanValue() || ((Boolean) m138856F3(new jc10(3400, i))).booleanValue();
    }

    @Override // p153l.AbstractC21253x5
    /* JADX INFO: renamed from: Y3 */
    public boolean mo120619Y3(boolean z, boolean z2) {
        boolean z3 = z && ((Boolean) m138856F3(new nfd0(3400))).booleanValue();
        if (!z3 && m154484B4()) {
            return true;
        }
        if (!z3 && lti.m155791f()) {
            m154494L4(true);
            m154497O4(false);
        }
        return z3;
    }

    @Override // p153l.AbstractC21253x5
    /* JADX INFO: renamed from: Z3 */
    public void mo120620Z3() {
        this.f132322l.m167571h1();
    }

    @Override // p153l.AbstractC21253x5
    /* JADX INFO: renamed from: a4 */
    public void mo120621a4() {
        if (lti.m155791f()) {
            m154494L4(true);
            m154497O4(false);
        }
    }

    @Override // p153l.AbstractC21253x5
    /* JADX INFO: renamed from: d4 */
    public void mo154499d4(final String str) {
        super.mo154499d4(str);
        fgt.m125530b(this, "audience_stop_live_confirm", new y20() { // from class: l.ijd0
            @Override // p153l.y20
            public final void call(Object obj) {
                ((Map) obj).put("leave_type", str);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.AbstractC21253x5
    /* JADX INFO: renamed from: e4 */
    public void mo120624e4(JumpRoomData jumpRoomData) {
        ((ou40) m213810E2()).m169230O2(jumpRoomData);
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
        ((RoomView) v2).setSwallowAllTouchEvent(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.dum] */
    @Override // p153l.AbstractC21253x5
    /* JADX INFO: renamed from: i4 */
    public void mo120627i4() {
        lwr.m156096d();
        if (!wft.m206159b(2)) {
            pvn.m173968c("live", new pvn.C19456a());
        }
        zrv.m221197r();
        m153103z2(this.f132322l.m167591x0().m158075I2(m163462K3()));
        sid0.m186014a(this, (ow40) m163462K3(), (RoomView) this.viewModel);
        super.mo71381T();
        ((ou40) m213810E2()).m202199w(this.f192449i);
        ((ou40) m213810E2()).mo168507c2();
        ((RoomView) this.viewModel).m73190C(true);
        m154483w4();
        duringCreated(((ou40) m213810E2()).mo183454y()).subscribe(dhw.m115825d(new y20() { // from class: l.cjd0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f82136a.m154488F4((jsv) obj);
            }
        }));
        duringCreated(zrv.m221193k().m159274k()).subscribe(dhw.m115825d(new y20() { // from class: l.djd0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f88830a.m154489G4((BLiveSettings) obj);
            }
        }));
        duringCreated(((ou40) m213810E2()).m202192l()).subscribe(dhw.m115825d(new y20() { // from class: l.ejd0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f94293a.m154490H4((jsv) obj);
            }
        }));
        this.f132323m = ((ou40) m213810E2()).m168541o1(this.f196919f).subscribe(dhw.m115825d(new y20() { // from class: l.fjd0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f99313a.m154491I4((LiveControlMessage) obj);
            }
        }));
        ((ou40) m213810E2()).m168470P1();
        LiveWatchCounter.m77513h().m77515f(1);
        LiveWatchCounter.m77513h().m77516g(1);
        this.f132326p = null;
        m138860d3(hmd0.class, new qcj() { // from class: l.gjd0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f104626a.m154492J4((hmd0) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.AbstractC21253x5
    public void init() {
        m153103z2(new i5j(this.f196918e, this.f132322l));
        sid0.m186015b(this, (ow40) m163462K3(), (RoomView) this.viewModel);
        ((RoomView) this.viewModel).m73193w(this.f132321k.f48586A);
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
        psd0.m173633z(this.f132323m);
        this.f132325o.clear();
        if (mo120616V3()) {
            ((ou40) this.f196918e.f90822h).mo146610c0(true);
            return;
        }
        lwr.m156094b();
        ((ou40) m213810E2()).exit();
        ((ou40) this.f196918e.f90822h).m169223H2();
    }

    @Override // p153l.l6t
    /* JADX INFO: renamed from: s2 */
    public void mo120629s2() {
        super.mo120629s2();
        psd0.m173633z(this.f132324n);
        ((RoomView) this.viewModel).destroy();
    }

    /* JADX INFO: renamed from: x4 */
    public final void m154500x4(qwl qwlVar) {
        if (wft.m206159b(2) || qwlVar == null || qwlVar.isPlaying() || !m154468A4()) {
            return;
        }
        qwlVar.mo178522b(true);
        qwlVar.reset();
    }

    /* JADX INFO: renamed from: y4 */
    public void m154501y4() {
        mo120608J3();
    }

    @Override // p153l.AbstractC21253x5
    /* JADX INFO: renamed from: z4, reason: merged with bridge method [inline-methods] */
    public void mo120613S3(BLive bLive, boolean z, y20<ugd0> y20Var, final y20<ugd0> y20Var2, boolean z2) {
        if (TextUtils.isEmpty(bLive.f45171id)) {
            nsh0.m164608j("[live][trace_problem]", Log.getStackTraceString(new Exception("initRoomInfo live.id is Null")));
        }
        m213811F2().RoomInfoEvent.initRoomInfo().mo199273j(new vgd0(new y20() { // from class: l.jjd0
            @Override // p153l.y20
            public final void call(Object obj) {
                ljd0.m154476p4(y20Var2, (ugd0) obj);
            }
        }, bLive, z, y20Var, z2));
    }
}
