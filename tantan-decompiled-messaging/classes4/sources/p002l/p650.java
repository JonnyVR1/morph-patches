package p002l;

import android.text.TextUtils;
import android.util.Log;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.archi.frag.RoomFrag;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p000p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p000p1.mobile.putong.live.livingroom.officialshow.OfficialShowView;
import com.p000p1.mobile.putong.live.livingroom.other.liveend.LiveEndAct;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.live.LiveDialogAct;
import com.p1.mobile.putong.live.base.data.BLive;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.base.data.BLiveOfficialShowCurrentAnchorInfo;
import com.p1.mobile.putong.live.base.data.BLiveSettings;
import com.p1.mobile.putong.live.livingroom.util.pref.LiveWatchCounter;
import com.tantanapp.common.utils.CrashHelper;
import java.util.Objects;
import l.bii0;
import l.bwr;
import l.c4g0;
import l.cul;
import l.d30;
import l.e30;
import l.ffw;
import l.gkh0;
import l.hu20;
import l.lsi0;
import l.mkd0;
import l.r8d0;
import l.s7m;
import l.vdt;
import l.w9j;
import l.xdl0;
import l.ypv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class p650 extends AbstractC0485a6<x350, BLive, l450, OfficialShowView> {

    /* JADX INFO: renamed from: j */
    public final RoomFrag f17016j;

    /* JADX INFO: renamed from: k */
    public final l8d0 f17017k;

    /* JADX INFO: renamed from: l */
    public c4g0 f17018l;

    /* JADX INFO: renamed from: m */
    public c4g0 f17019m;

    /* JADX INFO: renamed from: n */
    public String f17020n;

    public p650(l450 l450Var, l8d0 l8d0Var, OfficialShowView officialShowView) {
        super(l450Var);
        this.f17016j = (RoomFrag) l450Var.f8337f;
        this.f17017k = l8d0Var;
        C(officialShowView);
        l450Var.m10575a(this, (ViewGroup) ((bwr) this).viewModel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A4 */
    public /* synthetic */ Integer m20049A4(fed0 fed0Var) {
        return Integer.valueOf(((OfficialShowView) ((bwr) this).viewModel).getHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B4 */
    private void m20050B4(u7s u7sVar) {
        String strM23326l = u7sVar.m23326l();
        m25548F2().ChatEvent.dismissDialog().p();
        BLiveOfficialShowCurrentAnchorInfo bLiveOfficialShowCurrentAnchorInfoM25674S2 = ((x350) m25547E2()).m25674S2();
        if (bLiveOfficialShowCurrentAnchorInfoM25674S2 == null) {
            act().finish();
            return;
        }
        if (u7sVar.m23328n()) {
            BLive bLiveNew_ = BLive.new_();
            ((BLiveAbsData) bLiveNew_).id = bLiveOfficialShowCurrentAnchorInfoM25674S2.anchorLiveId;
            act().startActivity(LiveEndAct.m9113V1(act(), bLiveNew_, ypv.a.V(), strM23326l, "", ((x350) m25547E2()).m17247x()));
        } else {
            LiveDialogAct.g2(act(), "", strM23326l);
        }
        act().finish();
    }

    /* JADX INFO: renamed from: E4 */
    private void m20051E4(String str, String str2, d30 d30Var) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Dialog.e eVarB = act().dialog().F(str).B(false);
        Objects.requireNonNull(d30Var);
        eVarB.n0(str2, new bii0(d30Var)).z0();
    }

    /* JADX INFO: renamed from: m4 */
    public static /* synthetic */ void m20055m4() {
    }

    /* JADX INFO: renamed from: q4 */
    public static /* synthetic */ void m20059q4(Throwable th) {
    }

    /* JADX INFO: renamed from: s4 */
    private void m20061s4() {
        mkd0.z(this.f17019m);
        this.f17019m = duringCreated(((OfficialShowView) ((bwr) this).viewModel).getGiftWidthObs()).onBackpressureLatest().filter(new w9j() { // from class: l.l650
            public final Object call(Object obj) {
                return Boolean.valueOf(((Integer) obj).intValue() > 0);
            }
        }).distinctUntilChanged().subscribe(ffw.e(new e30() { // from class: l.m650
            public final void call(Object obj) {
                this.f15249a.m20062v4((Integer) obj);
            }
        }, new e30() { // from class: l.n650
            public final void call(Object obj) {
                p650.m20059q4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v4 */
    public /* synthetic */ void m20062v4(Integer num) {
        m25548F2().ChatEvent.changeInputSize().j(new Size((xdl0.y0() - num.intValue()) - xdl0.w(56.0f), 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w4 */
    public /* synthetic */ void m20063w4(iqv iqvVar) {
        m17949M3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x4 */
    public /* synthetic */ void m20064x4(BLiveSettings bLiveSettings) {
        ((x350) m25547E2()).m14530T0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y4 */
    public /* synthetic */ void m20065y4(iqv iqvVar) {
        if (iqvVar.m15308k()) {
            ((x350) m25547E2()).mo9892e2(false, ((x350) m25547E2()).m17234j());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2] */
    /* JADX INFO: renamed from: z4 */
    public /* synthetic */ void m20066z4(LiveControlMessage liveControlMessage) {
        gkh0.j("[live]msg_observer_handler", "room presenter received control message," + liveControlMessage);
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
                    m20051E4(liveControlMessage.content, this.f22037f.getString(R$string.f3688y5), new d30() { // from class: l.o650
                        public final void call() {
                            p650.m20055m4();
                        }
                    });
                    return;
                }
                return;
            case -866625755:
                if (str.equals("re_request_room_gift_list")) {
                    wrj.m25429w(true);
                    if (m25547E2() == 0 || ((x350) m25547E2()).m25674S2() == null) {
                        return;
                    }
                    ((x350) m25547E2()).m14490A1(new evj.C0549a(((x350) m25547E2()).m17239o(), x350.m25673R2(m25547E2(), ((x350) m25547E2()).m14576j0()), "live").m12717f(), null);
                    return;
                }
                return;
            case -484821221:
                if (str.equals("chat_tip_change")) {
                    ((x350) m25547E2()).m14512L1();
                    return;
                }
                return;
            case 3029746:
                if (str.equals("boot")) {
                    CrashHelper.c(new IllegalStateException("live boot handle2 with content" + liveControlMessage.content));
                    ((x350) m25547E2()).m14568g2(((x350) m25547E2()).m17234j());
                    m20070t4();
                    act().finish();
                    if (liveControlMessage.isFromLiveRoomBlock() && vdt.b(2)) {
                        lsi0.y(liveControlMessage.content);
                        return;
                    } else {
                        LiveDialogAct.g2(act(), "", liveControlMessage.content);
                        return;
                    }
                }
                return;
            case 3540994:
                if (str.equals("stop")) {
                    ((x350) m25547E2()).mo17233h(u7s.f20528e);
                    return;
                }
                return;
            case 106440182:
                if (str.equals("pause")) {
                    ((x350) m25547E2()).mo17233h(pau.f17177b);
                    return;
                }
                return;
            case 109757538:
                str.equals("start");
                return;
            case 134762710:
                if (str.equals("force_stop")) {
                    ((x350) m25547E2()).mo17233h(u7s.f20528e);
                    m20050B4(new u7s(liveControlMessage.content, true));
                    return;
                }
                return;
            case 379400585:
                if (str.equals("forbidden_multidevice")) {
                    String string = liveControlMessage.isAnchor ? ypv.e.getString(R$string.f3014T5) : ypv.e.getString(R$string.f2972R5);
                    ((x350) m25547E2()).m14568g2(((x350) m25547E2()).m17234j());
                    m20070t4();
                    act().finish();
                    LiveDialogAct.g2(act(), "", string);
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
        ((x350) m25547E2()).mo14510K1(((x350) m25547E2()).m17239o());
    }

    @Override // p002l.AbstractC0485a6
    /* JADX INFO: renamed from: D4, reason: merged with bridge method [inline-methods] */
    public void mo9419c4(BLive bLive) {
        m25548F2().PlayerEvent.quickPlay().j(bLive);
    }

    @Override // p002l.mht
    /* JADX INFO: renamed from: J3 */
    public void mo15814J3() {
        super.mo15814J3();
        hu20.p("context_single_room");
    }

    @Override // p002l.AbstractC0485a6
    /* JADX INFO: renamed from: N3 */
    public void mo9405N3() {
        this.f17020n = null;
        m25548F2().PreLoadEvent.cleanPreLoad().p();
    }

    @Override // p002l.AbstractC0485a6
    /* JADX INFO: renamed from: O3 */
    public boolean mo9406O3() {
        return t7t.m22811c(this.f22036e.f8339h);
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
        return false;
    }

    @Override // p002l.AbstractC0485a6
    /* JADX INFO: renamed from: V3 */
    public boolean mo9412V3() {
        return false;
    }

    @Override // p002l.AbstractC0485a6
    /* JADX INFO: renamed from: W3 */
    public boolean mo9413W3() {
        return this.f17020n != null;
    }

    @Override // p002l.AbstractC0485a6
    /* JADX INFO: renamed from: X3 */
    public boolean mo9414X3(int i) {
        if (!t7t.m22811c(this.f22036e.f8339h)) {
            return false;
        }
        m25548F2().LivePusherEvent.closeLive().p();
        return true;
    }

    @Override // p002l.AbstractC0485a6
    /* JADX INFO: renamed from: Y3 */
    public boolean mo9415Y3(boolean z, boolean z2) {
        return false;
    }

    @Override // p002l.AbstractC0485a6
    /* JADX INFO: renamed from: Z3 */
    public void mo9416Z3() {
        this.f17017k.m17087h1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p002l.AbstractC0485a6
    /* JADX INFO: renamed from: e4 */
    public void mo9421e4(JumpRoomData jumpRoomData) {
        ((x350) m25547E2()).m9886O2(jumpRoomData);
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
        ((OfficialShowView) s7mVar).setSwallowAllTouchEvent(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.bsm] */
    @Override // p002l.AbstractC0485a6
    /* JADX INFO: renamed from: i4 */
    public void mo9425i4() {
        ypv.r();
        z2(this.f17017k.m17107x0().m17136I2(m17947K3()));
        o550.m19218a(this, (l450) m17947K3(), (OfficialShowView) ((bwr) this).viewModel);
        super.T();
        ((x350) m25547E2()).m14557c2();
        ((OfficialShowView) ((bwr) this).viewModel).m8999C(true);
        m20061s4();
        duringCreated(((x350) m25547E2()).m17248y()).subscribe(ffw.d(new e30() { // from class: l.g650
            public final void call(Object obj) {
                this.f11280a.m20063w4((iqv) obj);
            }
        }));
        duringCreated(ypv.k().k()).subscribe(ffw.d(new e30() { // from class: l.h650
            public final void call(Object obj) {
                this.f11895a.m20064x4((BLiveSettings) obj);
            }
        }));
        duringCreated(((x350) m25547E2()).m17236l()).subscribe(ffw.d(new e30() { // from class: l.i650
            public final void call(Object obj) {
                this.f13065a.m20065y4((iqv) obj);
            }
        }));
        this.f17018l = ((x350) m25547E2()).m14592o1(this.f22037f).subscribe(ffw.d(new e30() { // from class: l.j650
            public final void call(Object obj) {
                this.f13599a.m20066z4((LiveControlMessage) obj);
            }
        }));
        ((x350) m25547E2()).m14520P1();
        LiveWatchCounter.h().f(1);
        LiveWatchCounter.h().g(1);
        this.f17020n = null;
        m14188d3(fed0.class, new w9j() { // from class: l.k650
            public final Object call(Object obj) {
                return this.f14216a.m20049A4((fed0) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p002l.AbstractC0485a6
    public void init() {
        z2(new n2j(this.f22036e, this.f17017k));
        o550.m19219b(this, (l450) m17947K3(), (OfficialShowView) ((bwr) this).viewModel);
        ((OfficialShowView) ((bwr) this).viewModel).m9004w(this.f17016j.f3780A);
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
        mkd0.z(this.f17018l);
        if (mo9412V3()) {
            ((x350) this.f22036e.f8339h).mo9891c0(true);
        } else {
            ((x350) m25547E2()).exit();
            ((x350) this.f22036e.f8339h).m9879H2();
        }
    }

    /* JADX INFO: renamed from: s2 */
    public void m20069s2() {
        super.s2();
        mkd0.z(this.f17019m);
        ((OfficialShowView) ((bwr) this).viewModel).destroy();
    }

    /* JADX INFO: renamed from: t4 */
    public void m20070t4() {
        mo15814J3();
    }

    @Override // p002l.AbstractC0485a6
    /* JADX INFO: renamed from: u4, reason: merged with bridge method [inline-methods] */
    public void mo9409S3(BLive bLive, boolean z, e30<r8d0> e30Var, e30<r8d0> e30Var2, boolean z2) {
        if (TextUtils.isEmpty(((BLiveAbsData) bLive).id)) {
            gkh0.j("[live][trace_problem]", Log.getStackTraceString(new Exception("initRoomInfo live.id is Null")));
        }
        m25548F2().RoomInfoEvent.initRoomInfo().j(new s8d0(e30Var2, bLive, z, e30Var, z2));
    }

    @Override // p002l.AbstractC0485a6
    /* JADX INFO: renamed from: P3 */
    public void mo9407P3() {
    }

    @Override // p002l.AbstractC0485a6
    /* JADX INFO: renamed from: a4 */
    public void mo9417a4() {
    }

    @Override // p002l.AbstractC0485a6
    /* JADX INFO: renamed from: C4, reason: merged with bridge method [inline-methods] */
    public void mo9418b4(boolean z, BLive bLive) {
    }
}
