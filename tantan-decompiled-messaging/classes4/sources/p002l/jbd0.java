package p002l;

import android.text.TextUtils;
import android.util.Log;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.archi.frag.RoomFrag;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p000p1.mobile.putong.live.livingroom.base.room.RoomView;
import com.p000p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.live.LiveDialogAct;
import com.p1.mobile.putong.live.base.data.BLive;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.base.data.BLiveSettings;
import com.p1.mobile.putong.live.livingroom.util.pref.LiveWatchCounter;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import l.bii0;
import l.bwr;
import l.c4g0;
import l.cul;
import l.d30;
import l.e30;
import l.ffw;
import l.fld0;
import l.gkh0;
import l.h5j0;
import l.hdv;
import l.hu20;
import l.kur;
import l.lsi0;
import l.mkd0;
import l.mqi0;
import l.ptn;
import l.r8d0;
import l.rwb;
import l.s7m;
import l.t100;
import l.uvr;
import l.vdt;
import l.w14;
import l.w9j;
import l.xdl0;
import l.xh0;
import l.ypv;
import l.z310;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class jbd0 extends AbstractC0485a6<am40, BLive, ao40, RoomView> {

    /* JADX INFO: renamed from: r */
    public static String f13666r = "";

    /* JADX INFO: renamed from: j */
    public ao40 f13667j;

    /* JADX INFO: renamed from: k */
    public final RoomFrag f13668k;

    /* JADX INFO: renamed from: l */
    public final l8d0 f13669l;

    /* JADX INFO: renamed from: m */
    public c4g0 f13670m;

    /* JADX INFO: renamed from: n */
    public c4g0 f13671n;

    /* JADX INFO: renamed from: o */
    public List<String> f13672o;

    /* JADX INFO: renamed from: p */
    public String f13673p;

    /* JADX INFO: renamed from: q */
    public boolean f13674q;

    public jbd0(ao40 ao40Var, l8d0 l8d0Var, RoomView roomView) {
        super(ao40Var);
        this.f13667j = ao40Var;
        this.f13668k = (RoomFrag) ao40Var.f8337f;
        this.f13669l = l8d0Var;
        C(roomView);
        this.f13672o = new ArrayList();
        ao40Var.m10575a(this, (ViewGroup) ((bwr) this).viewModel);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A4 */
    private boolean m15790A4() {
        if (m25547E2() == 0 || ((am40) m25547E2()).m17234j() == null || TextUtils.isEmpty(((am40) m25547E2()).m17234j().streamUrl.pullFlv)) {
            return false;
        }
        return rht.m21994a(((am40) m25547E2()).m17234j().streamUrl.pullFlv, "rtc");
    }

    /* JADX INFO: renamed from: P4 */
    private void m15791P4(String str, String str2, d30 d30Var) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Dialog.e eVarB = act().dialog().F(str).B(false);
        Objects.requireNonNull(d30Var);
        eVarB.n0(str2, new bii0(d30Var)).z0();
    }

    /* JADX INFO: renamed from: j4 */
    public static /* synthetic */ void m15792j4(Throwable th) {
    }

    /* JADX INFO: renamed from: p4 */
    public static /* synthetic */ void m15798p4(e30 e30Var, r8d0 r8d0Var) {
        if (e30Var != null) {
            e30Var.call(r8d0Var);
        }
    }

    /* JADX INFO: renamed from: u4 */
    public static /* synthetic */ void m15803u4() {
    }

    /* JADX INFO: renamed from: w4 */
    private void m15805w4() {
        mkd0.z(this.f13671n);
        this.f13671n = duringCreated(((RoomView) ((bwr) this).viewModel).getGiftWidthObs()).onBackpressureLatest().filter(new w9j() { // from class: l.xad0
            public final Object call(Object obj) {
                return Boolean.valueOf(((Integer) obj).intValue() > 0);
            }
        }).distinctUntilChanged().subscribe(ffw.e(new e30() { // from class: l.yad0
            public final void call(Object obj) {
                this.f22776a.m15807C4((Integer) obj);
            }
        }, new e30() { // from class: l.zad0
            public final void call(Object obj) {
                jbd0.m15792j4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: B4 */
    public boolean m15806B4() {
        Boolean bool;
        if (!uvr.d().G1() || (bool = ypv.a.u().live.closeSmallWindow) == null || !bool.booleanValue()) {
            return false;
        }
        fld0 fld0Var = fld0.e;
        if (mqi0.o() - ((Long) ((hdv) ypv.l(fld0Var)).u.get()).longValue() < 1209600000) {
            return false;
        }
        new xh0.a(this.f22037f).s("悬浮窗播放,精彩不断").j("开启悬浮窗播放功能，退出直播间还能继续观看精彩直播").o(new View.OnClickListener() { // from class: l.wad0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21588a.m15808D4(view);
            }
        }).b(true).f("暂不使用").r("立即设置").a().g();
        ((hdv) ypv.l(fld0Var)).u.put(Long.valueOf(mqi0.o()));
        return true;
    }

    /* JADX INFO: renamed from: C4 */
    public final /* synthetic */ void m15807C4(Integer num) {
        m25548F2().ChatEvent.changeInputSize().j(new Size((xdl0.y0() - num.intValue()) - t100.E, 0));
    }

    /* JADX INFO: renamed from: D4 */
    public final /* synthetic */ void m15808D4(View view) {
        Act act = this.f22037f;
        act.startActivity(ypv.a.q(act));
    }

    /* JADX INFO: renamed from: E4 */
    public final /* synthetic */ void m15809E4(cul culVar, Boolean bool) {
        if (bool.booleanValue()) {
            return;
        }
        this.f13674q = false;
        culVar.b(true);
    }

    /* JADX INFO: renamed from: F4 */
    public final /* synthetic */ void m15810F4(iqv iqvVar) {
        h5j0 h5j0Var = h5j0.INSTANCE;
        h5j0Var.d("live_valid_state_module");
        m17949M3();
        h5j0Var.a("live_valid_state_module", "validStateModule");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G4 */
    public final /* synthetic */ void m15811G4(BLiveSettings bLiveSettings) {
        ((am40) m25547E2()).m14530T0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H4 */
    public final /* synthetic */ void m15812H4(iqv iqvVar) {
        if (iqvVar.m15308k()) {
            ((am40) m25547E2()).mo9892e2(false, ((am40) m25547E2()).m17234j());
            h5j0.INSTANCE.a("enter_live_room", "startLive");
        }
        if (!iqvVar.m15300c() || this.f13672o.contains(((am40) m25547E2()).m17235k())) {
            return;
        }
        this.f13669l.m17091l1();
        this.f13672o.add(((am40) m25547E2()).m17235k());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2] */
    /* JADX INFO: renamed from: I4 */
    public final /* synthetic */ void m15813I4(LiveControlMessage liveControlMessage) {
        gkh0.j("[live]msg_observer_handler", "room presenter received control message," + liveControlMessage);
        String str = liveControlMessage.type;
        str.getClass();
        switch (str) {
            case "add_manager":
            case "delete_manager":
                ((am40) m25547E2()).mo14510K1(((am40) m25547E2()).m17239o());
                break;
            case "live_pull_update_video_quality":
                m25548F2().PlayerEvent.refreshPlayAddress().p();
                break;
            case "system":
                m15791P4(liveControlMessage.content, this.f22037f.getString(R$string.f3688y5), new d30() { // from class: l.ibd0
                    public final void call() {
                        jbd0.m15803u4();
                    }
                });
                break;
            case "re_request_room_gift_list":
                wrj.m25429w(true);
                ((am40) m25547E2()).m14490A1(new evj.C0549a(((am40) m25547E2()).m17239o(), x350.m25673R2(m25547E2(), ((DbObject) ((am40) m25547E2()).m14582l0()).id), "live").m12717f(), null);
                break;
            case "chat_tip_change":
                ((am40) m25547E2()).m14512L1();
                break;
            case "boot":
                CrashHelper.c(new IllegalStateException("live boot handle with content" + liveControlMessage.content));
                ((am40) m25547E2()).m14568g2(((am40) m25547E2()).m17234j());
                m15824y4();
                act().finish();
                if (!liveControlMessage.isFromLiveRoomBlock() || !vdt.b(2)) {
                    LiveDialogAct.h2(act(), "", liveControlMessage.content, !vdt.b(2));
                    break;
                } else {
                    lsi0.y(liveControlMessage.content);
                    break;
                }
                break;
            case "stop":
            case "force_stop":
                ((am40) m25547E2()).mo17233h(u7s.f20528e);
                break;
            case "pause":
                ((am40) m25547E2()).mo17233h(pau.f17177b);
                break;
            case "start":
                this.f13672o.clear();
                break;
            case "forbidden_multidevice":
                String string = liveControlMessage.isAnchor ? ypv.e.getString(R$string.f3014T5) : ypv.e.getString(R$string.f2972R5);
                ((am40) m25547E2()).m14568g2(((am40) m25547E2()).m17234j());
                m15824y4();
                act().finish();
                LiveDialogAct.g2(act(), "", string);
                break;
        }
    }

    @Override // p002l.mht
    /* JADX INFO: renamed from: J3 */
    public void mo15814J3() {
        super.mo15814J3();
        hu20.p("context_single_room");
    }

    /* JADX INFO: renamed from: J4 */
    public final /* synthetic */ Integer m15815J4(fed0 fed0Var) {
        return Integer.valueOf(((RoomView) ((bwr) this).viewModel).getHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K4 */
    public boolean m15816K4() {
        if ("square-curated".equals(m14194m3())) {
            return false;
        }
        return ((am40) m25547E2()).m17241r();
    }

    /* JADX INFO: renamed from: L4 */
    public boolean m15817L4(boolean z) {
        if (this.f13674q) {
            return true;
        }
        kur.b();
        if (m15816K4()) {
            this.f13674q = m15821Q4(this.f13669l.m17056C0(), z);
        }
        return this.f13674q;
    }

    @Override // p002l.AbstractC0485a6
    /* JADX INFO: renamed from: M4, reason: merged with bridge method [inline-methods] */
    public void mo9418b4(boolean z, BLive bLive) {
        if (TextUtils.equals(this.f13673p, ((BLiveAbsData) bLive).id)) {
            return;
        }
        this.f13673p = ((BLiveAbsData) bLive).id;
        m25548F2().PreLoadEvent.preLoad().j(new ie80(z, bLive));
    }

    @Override // p002l.AbstractC0485a6
    /* JADX INFO: renamed from: N3 */
    public void mo9405N3() {
        this.f13673p = null;
        m25548F2().PreLoadEvent.cleanPreLoad().p();
    }

    @Override // p002l.AbstractC0485a6
    /* JADX INFO: renamed from: N4, reason: merged with bridge method [inline-methods] */
    public void mo9419c4(BLive bLive) {
        m25548F2().PlayerEvent.quickPlay().j(bLive);
    }

    /* JADX INFO: renamed from: O4 */
    public final void m15820O4(boolean z) {
        if (m15816K4() ? true ^ z : true) {
            mqi.m18135c().m18137b();
        }
    }

    @Override // p002l.AbstractC0485a6
    /* JADX INFO: renamed from: P3 */
    public void mo9407P3() {
        if (pqi.m20636f()) {
            m15817L4(true);
            m15820O4(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q4 */
    public boolean m15821Q4(String str, boolean z) {
        rwb rwbVar = (rwb) m14184F3(new swb(2000));
        lqi lqiVar = new lqi((pn40) m25547E2(), m14195n3(), str, NullChecker.a(rwbVar) ? rwbVar.c : 0.0f);
        final cul culVar = (cul) m14184F3(new bqi(2000));
        m15823x4(culVar);
        lqiVar.m17384i(culVar);
        duringCreated(lqiVar.m17377b().take(1)).subscribe(ffw.d(new e30() { // from class: l.fbd0
            public final void call(Object obj) {
                this.f10221a.m15809E4(culVar, (Boolean) obj);
            }
        }));
        return uvr.d().G1() ? pxm.m20743c().m20748f(lqiVar, true) : pqi.m20634d().m20640i(lqiVar, this.f22037f, z);
    }

    @Override // p002l.AbstractC0485a6
    /* JADX INFO: renamed from: R3 */
    public View mo9408R3() {
        return ((bwr) this).viewModel;
    }

    @Override // p002l.AbstractC0485a6
    /* JADX INFO: renamed from: T3 */
    public void mo9410T3(e30<r8d0> e30Var) {
        m25548F2().RoomInfoEvent.initSmallWindowRoomInfo().j(new s8d0(e30Var, null, false, null, false));
    }

    @Override // p002l.AbstractC0485a6
    /* JADX INFO: renamed from: U3 */
    public boolean mo9411U3(int i) {
        return mo9414X3(i);
    }

    @Override // p002l.AbstractC0485a6
    /* JADX INFO: renamed from: V3 */
    public boolean mo9412V3() {
        return this.f13674q;
    }

    @Override // p002l.AbstractC0485a6
    /* JADX INFO: renamed from: W3 */
    public boolean mo9413W3() {
        return this.f13673p != null;
    }

    @Override // p002l.AbstractC0485a6
    /* JADX INFO: renamed from: X3 */
    public boolean mo9414X3(int i) {
        return ((Boolean) m14184F3(new w14(3400, i))).booleanValue() || ((Boolean) m14184F3(new z310(3400, i))).booleanValue();
    }

    @Override // p002l.AbstractC0485a6
    /* JADX INFO: renamed from: Y3 */
    public boolean mo9415Y3(boolean z, boolean z2) {
        boolean z3 = z && ((Boolean) m14184F3(new k7d0(3400))).booleanValue();
        if (!z3 && m15806B4()) {
            return true;
        }
        if (!z3 && pqi.m20636f()) {
            m15817L4(true);
            m15820O4(false);
        }
        return z3;
    }

    @Override // p002l.AbstractC0485a6
    /* JADX INFO: renamed from: Z3 */
    public void mo9416Z3() {
        this.f13669l.m17087h1();
    }

    @Override // p002l.AbstractC0485a6
    /* JADX INFO: renamed from: a4 */
    public void mo9417a4() {
        if (pqi.m20636f()) {
            m15817L4(true);
            m15820O4(false);
        }
    }

    @Override // p002l.AbstractC0485a6
    /* JADX INFO: renamed from: d4 */
    public void mo9420d4(final String str) {
        super.mo9420d4(str);
        eet.m12448b(this, "audience_stop_live_confirm", new e30() { // from class: l.gbd0
            public final void call(Object obj) {
                ((Map) obj).put("leave_type", str);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p002l.AbstractC0485a6
    /* JADX INFO: renamed from: e4 */
    public void mo9421e4(JumpRoomData jumpRoomData) {
        ((am40) m25547E2()).m9886O2(jumpRoomData);
    }

    @Override // p002l.AbstractC0485a6
    /* JADX INFO: renamed from: f4 */
    public void mo9422f4(cul culVar) {
        m25548F2().PlayerEvent.updatePlayer().j(culVar);
    }

    @Override // p002l.AbstractC0485a6
    /* JADX INFO: renamed from: g4 */
    public void mo9423g4(boolean z) {
        s7m s7mVar = ((bwr) this).viewModel;
        if (s7mVar == null) {
            return;
        }
        ((RoomView) s7mVar).setSwallowAllTouchEvent(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.bsm] */
    @Override // p002l.AbstractC0485a6
    /* JADX INFO: renamed from: i4 */
    public void mo9425i4() {
        kur.d();
        if (!vdt.b(2)) {
            ptn.c("live", new ptn.a());
        }
        ypv.r();
        z2(this.f13669l.m17107x0().m17136I2(m17947K3()));
        pad0.m20167a(this, (ao40) m17947K3(), (RoomView) ((bwr) this).viewModel);
        super.T();
        ((am40) m25547E2()).m17246w(this.f7413i);
        ((am40) m25547E2()).m14557c2();
        ((RoomView) ((bwr) this).viewModel).m5398C(true);
        m15805w4();
        duringCreated(((am40) m25547E2()).m17248y()).subscribe(ffw.d(new e30() { // from class: l.abd0
            public final void call(Object obj) {
                this.f7482a.m15810F4((iqv) obj);
            }
        }));
        duringCreated(ypv.k().k()).subscribe(ffw.d(new e30() { // from class: l.bbd0
            public final void call(Object obj) {
                this.f8056a.m15811G4((BLiveSettings) obj);
            }
        }));
        duringCreated(((am40) m25547E2()).m17236l()).subscribe(ffw.d(new e30() { // from class: l.cbd0
            public final void call(Object obj) {
                this.f8577a.m15812H4((iqv) obj);
            }
        }));
        this.f13670m = ((am40) m25547E2()).m14592o1(this.f22037f).subscribe(ffw.d(new e30() { // from class: l.dbd0
            public final void call(Object obj) {
                this.f9154a.m15813I4((LiveControlMessage) obj);
            }
        }));
        ((am40) m25547E2()).m14520P1();
        LiveWatchCounter.h().f(1);
        LiveWatchCounter.h().g(1);
        this.f13673p = null;
        m14188d3(fed0.class, new w9j() { // from class: l.ebd0
            public final Object call(Object obj) {
                return this.f9658a.m15815J4((fed0) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p002l.AbstractC0485a6
    public void init() {
        z2(new n2j(this.f22036e, this.f13669l));
        pad0.m20168b(this, (ao40) m17947K3(), (RoomView) ((bwr) this).viewModel);
        ((RoomView) ((bwr) this).viewModel).m5403w(this.f13668k.f3780A);
    }

    @Override // p002l.AbstractC0485a6
    /* JADX INFO: renamed from: m */
    public void mo9426m(boolean z) {
        m25548F2().PlayerEvent.showLoading().j(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        super.mo5949n();
        this.f22036e.f8341j.destroy();
        hu20.p("context_single_room");
        mkd0.z(this.f13670m);
        this.f13672o.clear();
        if (mo9412V3()) {
            ((am40) this.f22036e.f8339h).mo9891c0(true);
            return;
        }
        kur.b();
        ((am40) m25547E2()).exit();
        ((am40) this.f22036e.f8339h).m9879H2();
    }

    /* JADX INFO: renamed from: s2 */
    public void m15822s2() {
        super.s2();
        mkd0.z(this.f13671n);
        ((RoomView) ((bwr) this).viewModel).destroy();
    }

    /* JADX INFO: renamed from: x4 */
    public final void m15823x4(cul culVar) {
        if (vdt.b(2) || culVar == null || culVar.isPlaying() || !m15790A4()) {
            return;
        }
        culVar.b(true);
        culVar.reset();
    }

    /* JADX INFO: renamed from: y4 */
    public void m15824y4() {
        mo15814J3();
    }

    @Override // p002l.AbstractC0485a6
    /* JADX INFO: renamed from: z4, reason: merged with bridge method [inline-methods] */
    public void mo9409S3(BLive bLive, boolean z, e30<r8d0> e30Var, final e30<r8d0> e30Var2, boolean z2) {
        if (TextUtils.isEmpty(((BLiveAbsData) bLive).id)) {
            gkh0.j("[live][trace_problem]", Log.getStackTraceString(new Exception("initRoomInfo live.id is Null")));
        }
        m25548F2().RoomInfoEvent.initRoomInfo().j(new s8d0(new e30() { // from class: l.hbd0
            public final void call(Object obj) {
                jbd0.m15798p4(e30Var2, (r8d0) obj);
            }
        }, bLive, z, e30Var, z2));
    }
}
