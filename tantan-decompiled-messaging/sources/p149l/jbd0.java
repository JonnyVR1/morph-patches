package p149l;

import android.text.TextUtils;
import android.util.Log;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.live.LiveDialogAct;
import com.p046p1.mobile.putong.live.base.data.BLive;
import com.p046p1.mobile.putong.live.base.data.BLiveSettings;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.frag.RoomFrag;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p046p1.mobile.putong.live.livingroom.base.room.RoomView;
import com.p046p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p046p1.mobile.putong.live.livingroom.util.pref.LiveWatchCounter;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public class jbd0 extends AbstractC15533a6<am40, BLive, ao40, RoomView> {

    /* JADX INFO: renamed from: r */
    public static String f117177r = "";

    /* JADX INFO: renamed from: j */
    public ao40 f117178j;

    /* JADX INFO: renamed from: k */
    public final RoomFrag f117179k;

    /* JADX INFO: renamed from: l */
    public final l8d0 f117180l;

    /* JADX INFO: renamed from: m */
    public c4g0 f117181m;

    /* JADX INFO: renamed from: n */
    public c4g0 f117182n;

    /* JADX INFO: renamed from: o */
    public List<String> f117183o;

    /* JADX INFO: renamed from: p */
    public String f117184p;

    /* JADX INFO: renamed from: q */
    public boolean f117185q;

    /* JADX WARN: Multi-variable type inference failed */
    public jbd0(ao40 ao40Var, l8d0 l8d0Var, RoomView roomView) {
        super(ao40Var);
        this.f117178j = ao40Var;
        this.f117179k = (RoomFrag) ao40Var.f77100f;
        this.f117180l = l8d0Var;
        mo51532C(roomView);
        this.f117183o = new ArrayList();
        ao40Var.m103722a(this, (ViewGroup) this.viewModel);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A4 */
    private boolean m140745A4() {
        if (m206027E2() == 0 || ((am40) m206027E2()).mo149813j() == null || TextUtils.isEmpty(((am40) m206027E2()).mo149813j().streamUrl.pullFlv)) {
            return false;
        }
        return rht.m179462a(((am40) m206027E2()).mo149813j().streamUrl.pullFlv, "rtc");
    }

    /* JADX INFO: renamed from: P4 */
    private void m140746P4(String str, String str2, d30 d30Var) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Dialog.C4309e c4309eM20496B = act().dialog().m20504F(str).m20496B(false);
        Objects.requireNonNull(d30Var);
        c4309eM20496B.m20544n0(str2, new bii0(d30Var)).m20568z0();
    }

    /* JADX INFO: renamed from: j4 */
    public static /* synthetic */ void m140747j4(Throwable th) {
    }

    /* JADX INFO: renamed from: p4 */
    public static /* synthetic */ void m140753p4(e30 e30Var, r8d0 r8d0Var) {
        if (e30Var != null) {
            e30Var.call(r8d0Var);
        }
    }

    /* JADX INFO: renamed from: u4 */
    public static /* synthetic */ void m140758u4() {
    }

    /* JADX INFO: renamed from: w4 */
    private void m140760w4() {
        mkd0.m154992z(this.f117182n);
        this.f117182n = duringCreated(((RoomView) this.viewModel).getGiftWidthObs()).onBackpressureLatest().filter(new w9j() { // from class: l.xad0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((Integer) obj).intValue() > 0);
            }
        }).distinctUntilChanged().subscribe(ffw.m121194e(new e30() { // from class: l.yad0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f197184a.m140762C4((Integer) obj);
            }
        }, new e30() { // from class: l.zad0
            @Override // p149l.e30
            public final void call(Object obj) {
                jbd0.m140747j4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: B4 */
    public boolean m140761B4() {
        Boolean bool;
        if (!uvr.m196087d().m162670G1() || (bool = ypv.f199493a.m199374u().live.closeSmallWindow) == null || !bool.booleanValue()) {
            return false;
        }
        fld0<hdv> fld0Var = fld0.f98150e;
        if (mqi0.m155944o() - ((hdv) ypv.m215673l(fld0Var)).f107315u.get().longValue() < 1209600000) {
            return false;
        }
        new xh0.C21150a(this.f188513f).m208740s("悬浮窗播放,精彩不断").m208731j("开启悬浮窗播放功能，退出直播间还能继续观看精彩直播").m208736o(new View.OnClickListener() { // from class: l.wad0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f185454a.m140763D4(view);
            }
        }).m208723b(true).m208727f("暂不使用").m208739r("立即设置").m208722a().m208721g();
        ((hdv) ypv.m215673l(fld0Var)).f107315u.put(Long.valueOf(mqi0.m155944o()));
        return true;
    }

    /* JADX INFO: renamed from: C4 */
    public final /* synthetic */ void m140762C4(Integer num) {
        m206028F2().ChatEvent.changeInputSize().mo172463j(new Size((xdl0.m208412y0() - num.intValue()) - t100.f167230E, 0));
    }

    /* JADX INFO: renamed from: D4 */
    public final /* synthetic */ void m140763D4(View view) {
        Act act = this.f188513f;
        act.startActivity(ypv.f199493a.m199366q(act));
    }

    /* JADX INFO: renamed from: E4 */
    public final /* synthetic */ void m140764E4(cul culVar, Boolean bool) {
        if (bool.booleanValue()) {
            return;
        }
        this.f117185q = false;
        culVar.mo108790b(true);
    }

    /* JADX INFO: renamed from: F4 */
    public final /* synthetic */ void m140765F4(iqv iqvVar) {
        h5j0 h5j0Var = h5j0.INSTANCE;
        h5j0Var.m129405d("live_valid_state_module");
        m154640M3();
        h5j0Var.m129402a("live_valid_state_module", "validStateModule");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G4 */
    public final /* synthetic */ void m140766G4(BLiveSettings bLiveSettings) {
        ((am40) m206027E2()).m132094T0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H4 */
    public final /* synthetic */ void m140767H4(iqv iqvVar) {
        if (iqvVar.m137804k()) {
            ((am40) m206027E2()).mo97489e2(false, ((am40) m206027E2()).mo149813j());
            h5j0.INSTANCE.m129402a("enter_live_room", "startLive");
        }
        if (!iqvVar.m137796c() || this.f117183o.contains(((am40) m206027E2()).m149814k())) {
            return;
        }
        this.f117180l.m148900l1();
        this.f117183o.add(((am40) m206027E2()).m149814k());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2] */
    /* JADX INFO: renamed from: I4 */
    public final /* synthetic */ void m140768I4(LiveControlMessage liveControlMessage) {
        gkh0.m126627j("[live]msg_observer_handler", "room presenter received control message," + liveControlMessage);
        String str = liveControlMessage.type;
        str.getClass();
        switch (str) {
            case "add_manager":
            case "delete_manager":
                ((am40) m206027E2()).mo132074K1(((am40) m206027E2()).m149818o());
                break;
            case "live_pull_update_video_quality":
                m206028F2().PlayerEvent.refreshPlayAddress().m172467p();
                break;
            case "system":
                m140746P4(liveControlMessage.content, this.f188513f.getString(R$string.f47646y5), new d30() { // from class: l.ibd0
                    @Override // p149l.d30
                    public final void call() {
                        jbd0.m140758u4();
                    }
                });
                break;
            case "re_request_room_gift_list":
                wrj.m205257w(true);
                ((am40) m206027E2()).m132055A1(new evj.C16689a(((am40) m206027E2()).m149818o(), x350.m206896R2(m206027E2(), ((am40) m206027E2()).m132146l0().f56011id), "live").m118277f(), null);
                break;
            case "chat_tip_change":
                ((am40) m206027E2()).m132076L1();
                break;
            case "boot":
                CrashHelper.m81296c(new IllegalStateException("live boot handle with content" + liveControlMessage.content));
                ((am40) m206027E2()).m132132g2(((am40) m206027E2()).mo149813j());
                m140778y4();
                act().lambda$debugItems$19();
                if (!liveControlMessage.isFromLiveRoomBlock() || !vdt.m198092b(2)) {
                    LiveDialogAct.m67178h2(act(), "", liveControlMessage.content, !vdt.m198092b(2));
                    break;
                } else {
                    lsi0.m151595y(liveControlMessage.content);
                    break;
                }
                break;
            case "stop":
            case "force_stop":
                ((am40) m206027E2()).mo149812h(u7s.f175055e);
                break;
            case "pause":
                ((am40) m206027E2()).mo149812h(pau.f148011b);
                break;
            case "start":
                this.f117183o.clear();
                break;
            case "forbidden_multidevice":
                String string = liveControlMessage.isAnchor ? ypv.f199497e.getString(R$string.f46972T5) : ypv.f199497e.getString(R$string.f46930R5);
                ((am40) m206027E2()).m132132g2(((am40) m206027E2()).mo149813j());
                m140778y4();
                act().lambda$debugItems$19();
                LiveDialogAct.m67177g2(act(), "", string);
                break;
        }
    }

    @Override // p149l.mht
    /* JADX INFO: renamed from: J3 */
    public void mo140769J3() {
        super.mo140769J3();
        hu20.m132970p("context_single_room");
    }

    /* JADX INFO: renamed from: J4 */
    public final /* synthetic */ Integer m140770J4(fed0 fed0Var) {
        return Integer.valueOf(((RoomView) this.viewModel).getHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K4 */
    public boolean m140771K4() {
        if ("square-curated".equals(m129307m3())) {
            return false;
        }
        return ((am40) m206027E2()).m149820r();
    }

    /* JADX INFO: renamed from: L4 */
    public boolean m140772L4(boolean z) {
        if (this.f117185q) {
            return true;
        }
        kur.m147297b();
        if (m140771K4()) {
            this.f117185q = m140776Q4(this.f117180l.m148865C0(), z);
        }
        return this.f117185q;
    }

    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: M4, reason: merged with bridge method [inline-methods] */
    public void mo95097b4(boolean z, BLive bLive) {
        if (TextUtils.equals(this.f117184p, bLive.f44323id)) {
            return;
        }
        this.f117184p = bLive.f44323id;
        m206028F2().PreLoadEvent.preLoad().mo172463j(new ie80(z, bLive));
    }

    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: N3 */
    public void mo95084N3() {
        this.f117184p = null;
        m206028F2().PreLoadEvent.cleanPreLoad().m172467p();
    }

    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: N4, reason: merged with bridge method [inline-methods] */
    public void mo95098c4(BLive bLive) {
        m206028F2().PlayerEvent.quickPlay().mo172463j(bLive);
    }

    /* JADX INFO: renamed from: O4 */
    public final void m140775O4(boolean z) {
        if (m140771K4() ? true ^ z : true) {
            mqi.m155920c().m155922b();
        }
    }

    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: P3 */
    public void mo95086P3() {
        if (pqi.m170914f()) {
            m140772L4(true);
            m140775O4(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q4 */
    public boolean m140776Q4(String str, boolean z) {
        rwb rwbVar = (rwb) m129297F3(new swb(2000));
        lqi lqiVar = new lqi((pn40) m206027E2(), m129308n3(), str, NullChecker.m81303a(rwbVar) ? rwbVar.f161326c : 0.0f);
        final cul culVar = (cul) m129297F3(new bqi(2000));
        m140777x4(culVar);
        lqiVar.m151028i(culVar);
        duringCreated(lqiVar.m151021b().take(1)).subscribe(ffw.m121193d(new e30() { // from class: l.fbd0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f96706a.m140764E4(culVar, (Boolean) obj);
            }
        }));
        return uvr.m196087d().m162670G1() ? pxm.m171910c().m171915f(lqiVar, true) : pqi.m170912d().m170918i(lqiVar, this.f188513f, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: R3 */
    public View mo95087R3() {
        return (View) this.viewModel;
    }

    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: T3 */
    public void mo95089T3(e30<r8d0> e30Var) {
        m206028F2().RoomInfoEvent.initSmallWindowRoomInfo().mo172463j(new s8d0(e30Var, null, false, null, false));
    }

    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: U3 */
    public boolean mo95090U3(int i) {
        return mo95093X3(i);
    }

    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: V3 */
    public boolean mo95091V3() {
        return this.f117185q;
    }

    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: W3 */
    public boolean mo95092W3() {
        return this.f117184p != null;
    }

    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: X3 */
    public boolean mo95093X3(int i) {
        return ((Boolean) m129297F3(new w14(3400, i))).booleanValue() || ((Boolean) m129297F3(new z310(3400, i))).booleanValue();
    }

    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: Y3 */
    public boolean mo95094Y3(boolean z, boolean z2) {
        boolean z3 = z && ((Boolean) m129297F3(new k7d0(3400))).booleanValue();
        if (!z3 && m140761B4()) {
            return true;
        }
        if (!z3 && pqi.m170914f()) {
            m140772L4(true);
            m140775O4(false);
        }
        return z3;
    }

    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: Z3 */
    public void mo95095Z3() {
        this.f117180l.m148896h1();
    }

    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: a4 */
    public void mo95096a4() {
        if (pqi.m170914f()) {
            m140772L4(true);
            m140775O4(false);
        }
    }

    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: d4 */
    public void mo95099d4(final String str) {
        super.mo95099d4(str);
        eet.m116003b(this, "audience_stop_live_confirm", new e30() { // from class: l.gbd0
            @Override // p149l.e30
            public final void call(Object obj) {
                ((Map) obj).put("leave_type", str);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: e4 */
    public void mo95100e4(JumpRoomData jumpRoomData) {
        ((am40) m206027E2()).m97483O2(jumpRoomData);
    }

    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: f4 */
    public void mo95101f4(cul culVar) {
        m206028F2().PlayerEvent.updatePlayer().mo172463j(culVar);
    }

    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: g4 */
    public void mo95102g4(boolean z) {
        V v2 = this.viewModel;
        if (v2 == 0) {
            return;
        }
        ((RoomView) v2).setSwallowAllTouchEvent(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.bsm] */
    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: i4 */
    public void mo95104i4() {
        kur.m147299d();
        if (!vdt.m198092b(2)) {
            ptn.m171363c("live", new ptn.C19336a());
        }
        ypv.m215676r();
        m144512z2(this.f117180l.m148916x0().m149343I2(m154638K3()));
        pad0.m168086a(this, (ao40) m154638K3(), (RoomView) this.viewModel);
        super.mo70198T();
        ((am40) m206027E2()).m149825w(this.f67733i);
        ((am40) m206027E2()).mo132121c2();
        ((RoomView) this.viewModel).m72007C(true);
        m140760w4();
        duringCreated(((am40) m206027E2()).mo149827y()).subscribe(ffw.m121193d(new e30() { // from class: l.abd0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f68643a.m140765F4((iqv) obj);
            }
        }));
        duringCreated(ypv.m215672k().m121230k()).subscribe(ffw.m121193d(new e30() { // from class: l.bbd0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f74797a.m140766G4((BLiveSettings) obj);
            }
        }));
        duringCreated(((am40) m206027E2()).m149815l()).subscribe(ffw.m121193d(new e30() { // from class: l.cbd0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f80132a.m140767H4((iqv) obj);
            }
        }));
        this.f117181m = ((am40) m206027E2()).m132156o1(this.f188513f).subscribe(ffw.m121193d(new e30() { // from class: l.dbd0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f85309a.m140768I4((LiveControlMessage) obj);
            }
        }));
        ((am40) m206027E2()).m132084P1();
        LiveWatchCounter.m76330h().m76332f(1);
        LiveWatchCounter.m76330h().m76333g(1);
        this.f117184p = null;
        m129301d3(fed0.class, new w9j() { // from class: l.ebd0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f90318a.m140770J4((fed0) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.AbstractC15533a6
    public void init() {
        m144512z2(new n2j(this.f188512e, this.f117180l));
        pad0.m168087b(this, (ao40) m154638K3(), (RoomView) this.viewModel);
        ((RoomView) this.viewModel).m72010w(this.f117179k.f47738A);
    }

    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: m */
    public void mo95105m(boolean z) {
        m206028F2().PlayerEvent.showLoading().mo172463j(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        this.f188512e.f77104j.destroy();
        hu20.m132970p("context_single_room");
        mkd0.m154992z(this.f117181m);
        this.f117183o.clear();
        if (mo95091V3()) {
            ((am40) this.f188512e.f77102h).mo97488c0(true);
            return;
        }
        kur.m147297b();
        ((am40) m206027E2()).exit();
        ((am40) this.f188512e.f77102h).m97476H2();
    }

    @Override // p149l.k4t
    /* JADX INFO: renamed from: s2 */
    public void mo111727s2() {
        super.mo111727s2();
        mkd0.m154992z(this.f117182n);
        ((RoomView) this.viewModel).destroy();
    }

    /* JADX INFO: renamed from: x4 */
    public final void m140777x4(cul culVar) {
        if (vdt.m198092b(2) || culVar == null || culVar.isPlaying() || !m140745A4()) {
            return;
        }
        culVar.mo108790b(true);
        culVar.reset();
    }

    /* JADX INFO: renamed from: y4 */
    public void m140778y4() {
        mo140769J3();
    }

    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: z4, reason: merged with bridge method [inline-methods] */
    public void mo95088S3(BLive bLive, boolean z, e30<r8d0> e30Var, final e30<r8d0> e30Var2, boolean z2) {
        if (TextUtils.isEmpty(bLive.f44323id)) {
            gkh0.m126627j("[live][trace_problem]", Log.getStackTraceString(new Exception("initRoomInfo live.id is Null")));
        }
        m206028F2().RoomInfoEvent.initRoomInfo().mo172463j(new s8d0(new e30() { // from class: l.hbd0
            @Override // p149l.e30
            public final void call(Object obj) {
                jbd0.m140753p4(e30Var2, (r8d0) obj);
            }
        }, bLive, z, e30Var, z2));
    }
}
