package p149l;

import android.util.Pair;
import android.util.Size;
import android.view.View;
import com.google.android.exoplayer2.PlaybackException;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveActivity;
import com.p046p1.mobile.putong.live.base.data.BLiveCallVolume;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12714b;
import com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;
import com.p046p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p046p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomType;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.C12836e;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.view.MultiCallCellTopView;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.view.MultiCallTopView;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p149l.ho2;

/* JADX INFO: loaded from: classes5.dex */
public class qi10<D extends ho2> extends h4t<ho2, MultiCallTopView> {

    /* JADX INFO: renamed from: i */
    public C22392a<Boolean> f154637i;

    /* JADX INFO: renamed from: j */
    public final j510<D> f154638j;

    /* JADX INFO: renamed from: k */
    public final HashMap<String, User> f154639k;

    /* JADX INFO: renamed from: l */
    public c4g0 f154640l;

    /* JADX INFO: renamed from: m */
    public List<BLiveMultiCall> f154641m;

    public qi10(bsm<D> bsmVar, MultiCallTopView multiCallTopView, j510<D> j510Var) {
        super(bsmVar);
        this.f154637i = C22392a.m221512b();
        this.f154639k = new HashMap<>();
        mo51532C(multiCallTopView);
        this.f154638j = j510Var;
    }

    /* JADX INFO: renamed from: K3 */
    public static /* synthetic */ void m174712K3(Boolean bool) {
    }

    /* JADX INFO: renamed from: N3 */
    public static /* synthetic */ void m174715N3(b610 b610Var) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w4 */
    public /* synthetic */ void m174729w4(soj0 soj0Var) {
        ((MultiCallTopView) this.viewModel).m75849v();
    }

    /* JADX INFO: renamed from: A4 */
    public void m174730A4(LongLinkLiveMultiPk.MultiPk multiPk) {
        if (vwb.m200296J(multiPk.getPlayersList())) {
            return;
        }
        ((MultiCallTopView) this.viewModel).m75851x(multiPk);
    }

    /* JADX INFO: renamed from: B4 */
    public void mo174731B4(Pair<b610, Boolean> pair) {
        Object obj;
        Objects.toString(pair.second);
        if (!((Boolean) pair.second).booleanValue() || (obj = pair.first) == null) {
            yi10.m214879a("renderCallView stream is false or manager is null");
            ((MultiCallTopView) this.viewModel).setViewVisible(false);
            return;
        }
        int i = ((b610) obj).f73730d;
        int size = ((b610) obj).m100376v().size();
        yi10.m214879a("renderCallView stream: operation:" + r610.m178018y(i) + ", size:" + size);
        m174760y4((b610) pair.first);
        if (i == 1) {
            vwb.m200354z(((b610) pair.first).m100376v(), new e30() { // from class: l.bi10
                @Override // p149l.e30
                public final void call(Object obj2) {
                    this.f75689a.m174734E4((BLiveMultiCall) obj2);
                }
            });
        } else if (i == 3) {
            this.f154639k.remove(((b610) pair.first).f73729c.userId);
        } else {
            if (i != 4) {
                return;
            }
            m174734E4(((b610) pair.first).f73729c);
        }
    }

    /* JADX INFO: renamed from: C4 */
    public final void m174732C4(User user, int i) {
        BLiveMultiCall bLiveMultiCallM100372r = this.f154638j.m139800b4().m100372r(i);
        int iM100374t = this.f154638j.m139800b4().m100374t();
        if (NullChecker.m81303a(bLiveMultiCallM100372r)) {
            ((MultiCallTopView) this.viewModel).m75848u(user, i, iM100374t);
        }
    }

    /* JADX INFO: renamed from: D4 */
    public final void m174733D4(boolean z) {
        m206028F2().StickerEvent.changeVisible().mo172464m(Boolean.valueOf(!z));
    }

    /* JADX INFO: renamed from: E4 */
    public final void m174734E4(final BLiveMultiCall bLiveMultiCall) {
        if (this.f154639k.get(bLiveMultiCall.userId) != null) {
            m174732C4(this.f154639k.get(bLiveMultiCall.userId), bLiveMultiCall.position);
        } else {
            duringCreated(LivingNormalApiProvider.m71574s7(bLiveMultiCall.userId, "")).doOnNext(new e30() { // from class: l.ei10
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f91535a.m174750n4((User) obj);
                }
            }).subscribe(ffw.m121197h(new e30() { // from class: l.gi10
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f102829a.m174751o4(bLiveMultiCall, (User) obj);
                }
            }));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F4 */
    public final void m174735F4(boolean z) {
        m206028F2().ChatEvent.changeInputSize().mo172463j(new Size(0, k25.m144266g(z, (View) this.viewModel, (View) ((MultiCallTopView) this.viewModel).getParent(), Boolean.valueOf(m206027E2().mo97490p()))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G4 */
    public final void m174736G4(boolean z) {
        m206028F2().TraysViewEvent.changeBottomSpace().mo172463j(new C12836e.a(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED).m74292a(k25.m144265f(z, (View) this.viewModel, (View) ((MultiCallTopView) this.viewModel).getParent(), Boolean.valueOf(m206027E2().mo97490p()))).m74293b());
    }

    /* JADX INFO: renamed from: H4 */
    public void m174737H4(final MultiCallCellTopView multiCallCellTopView) {
        if (this.f154640l == null) {
            this.f154640l = m129299H3(m206027E2().m132135h2(5, TimeUnit.SECONDS).first()).subscribe(ffw.m121197h(new e30() { // from class: l.hi10
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f107866a.m174752p4(multiCallCellTopView, (Long) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: I4 */
    public final void m174738I4(final BLiveCallVolume bLiveCallVolume) {
        if (bLiveCallVolume == null) {
            return;
        }
        vwb.m200354z(this.f154638j.m139800b4().m100376v(), new e30() { // from class: l.ci10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f81027a.m174753q4(bLiveCallVolume, (BLiveMultiCall) obj);
            }
        });
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
    }

    /* JADX INFO: renamed from: c4 */
    public final void m174739c4(boolean z) {
        m174733D4(z);
        r610.m178003i(act(), !z);
    }

    /* JADX INFO: renamed from: d4 */
    public final void m174740d4(boolean z, int i) {
        m174735F4(z);
        m174736G4(z);
        m206028F2().MultiCallEvent.topViewVisible().mo172464m(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: e4 */
    public void m174741e4(int i) {
        String strM177968C = r610.m177968C(this.f154638j.m139803e4(), r610.m177978M(this));
        zi10.m218898k(this.f154638j.m139800b4().f73728b, m206027E2().mo97490p());
        if (ve10.m198141o(strM177968C)) {
            if (IntlCountryCodeController.m28123s()) {
                lsi0.m151593w(R$string.f46828M8);
                return;
            } else {
                m206028F2().MultiCallEvent.openApplyDlg().mo172463j(Integer.valueOf(i));
                return;
            }
        }
        if (ve10.m198137k(strM177968C)) {
            m206028F2().MultiCallEvent.openManageDialog().mo172463j(-1);
            return;
        }
        if (ve10.m198142p(strM177968C)) {
            lsi0.m151595y(w8u.m202217t(R$string.f47037W7));
        } else if (ve10.m198133g(strM177968C)) {
            lsi0.m151595y(w8u.m202217t(R$string.f47539t8));
        } else if (ve10.m198129c(strM177968C)) {
            lsi0.m151595y(w8u.m202217t(R$string.f47517s8));
        }
    }

    /* JADX INFO: renamed from: f4 */
    public void m174742f4(int i) {
        BLiveMultiCall bLiveMultiCallM100372r = this.f154638j.m139800b4().m100372r(i);
        if (bLiveMultiCallM100372r == null) {
            m174741e4(i);
            return;
        }
        if (m174743g4(bLiveMultiCallM100372r, r610.m177968C(this.f154638j.m139803e4(), r610.m177978M(this)))) {
            m206028F2().MultiCallEvent.openCallingOperateDialog().mo172463j(bLiveMultiCallM100372r);
        } else {
            m174759x4(bLiveMultiCallM100372r);
        }
    }

    /* JADX INFO: renamed from: g4 */
    public final boolean m174743g4(BLiveMultiCall bLiveMultiCall, String str) {
        if (r610.m177988W(bLiveMultiCall.userId) || r610.m177971F(bLiveMultiCall, str) != null) {
            return true;
        }
        return ve10.m198129c(str) && ve10.m198132f(bLiveMultiCall);
    }

    /* JADX INFO: renamed from: h4 */
    public boolean m174744h4() {
        j510<D> j510Var = this.f154638j;
        return (j510Var instanceof ze10) && ((ze10) j510Var).f202764n && w220.m201016c() && ve10.m198141o(r610.m177969D(this));
    }

    /* JADX INFO: renamed from: i4 */
    public void m174745i4(User user) {
        vpv vpvVar = ypv.f199493a;
        duringCreated(vpvVar.m199340d(vpvVar.m199309D0(), user, true, "liveRoom", null, "", mo77274R2(), BLiveActivity.TYPE_MULTI_CALL)).subscribe(ffw.m121194e(new e30() { // from class: l.di10
            @Override // p149l.e30
            public final void call(Object obj) {
                lsi0.m151593w(R$string.f46803L4);
            }
        }, new z2k()));
    }

    /* JADX INFO: renamed from: j4 */
    public boolean m174746j4() {
        j510<D> j510Var = this.f154638j;
        return (j510Var instanceof ze10) && ((ze10) j510Var).f202763m;
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m174747k4() {
        return this.f154638j.m139800b4().f73728b;
    }

    /* JADX INFO: renamed from: l4, reason: merged with bridge method [inline-methods] */
    public final void m174749m4(BLiveMultiCall bLiveMultiCall) {
        zcu.m218093h(h7d0.m129655x().m129668g(bLiveMultiCall.userId).m129679r(bLiveMultiCall.liveId).m129682u("onlive").m129681t("video_live").m129684w("e_pk_gotoliveroom_button").m129662a(), mo77274R2());
        m206028F2().JumpRoomEvent.jumpRoom().mo172463j(new JumpRoomData.C12761a().m73031t(m206027E2().mo132155o0()).m73029r(m206027E2().m149814k()).m73030s(m206027E2().mo149813j().room.f44419id).m73028q(m206027E2().m132146l0().name).m73033v(bLiveMultiCall.liveId).m73034w(bLiveMultiCall.roomId).m73032u(m206027E2().mo132155o0()).m73025n(JumpRoomType.CHANGE_SOURCE_WITH_BACK).m73024m());
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        ((MultiCallTopView) this.viewModel).setViewVisible(false);
        this.f154639k.clear();
        if (m206027E2().m132106X0()) {
            l610.m148692i(this, "live");
        }
        m174739c4(false);
        m174740d4(false, 0);
        super.mo69117n();
    }

    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ void m174750n4(User user) {
        this.f154639k.put(user.f56011id, user);
    }

    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ void m174751o4(BLiveMultiCall bLiveMultiCall, User user) {
        m174732C4(user, bLiveMultiCall.position);
    }

    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ void m174752p4(MultiCallCellTopView multiCallCellTopView, Long l2) {
        j510<D> j510Var = this.f154638j;
        if (j510Var instanceof ze10) {
            ((ze10) j510Var).f202764n = false;
        }
        multiCallCellTopView.m75820o0();
        this.f154640l = null;
    }

    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ void m174753q4(BLiveCallVolume bLiveCallVolume, BLiveMultiCall bLiveMultiCall) {
        Float f = bLiveCallVolume.volumes.get(bLiveMultiCall.userId);
        if (f == null || f.floatValue() <= 0.02f || vg10.m198313e(bLiveMultiCall)) {
            ((MultiCallTopView) this.viewModel).m75846q(bLiveMultiCall.position, this.f154638j.m139800b4().m100374t(), false, f);
        } else {
            ((MultiCallTopView) this.viewModel).m75846q(bLiveMultiCall.position, this.f154638j.m139800b4().m100374t(), true, f);
        }
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ Boolean m174754r4(User user) {
        return Boolean.valueOf(this.f154638j.m139800b4().m100373s(user.f56011id) != null);
    }

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ void m174755s4(User user) {
        this.f154639k.put(user.f56011id, user);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(C22306c.combineLatest(this.f154638j.m139801c4().doOnNext(new e30() { // from class: l.uh10
            @Override // p149l.e30
            public final void call(Object obj) {
                qi10.m174715N3((b610) obj);
            }
        }), this.f154637i.asObservable().doOnNext(new e30() { // from class: l.ni10
            @Override // p149l.e30
            public final void call(Object obj) {
                qi10.m174712K3((Boolean) obj);
            }
        }), new x9j() { // from class: l.oi10
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return new Pair((b610) obj, (Boolean) obj2);
            }
        })).subscribe(ffw.m121194e(new e30() { // from class: l.pi10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f149069a.mo174731B4((Pair) obj);
            }
        }, new e30() { // from class: l.vh10
            @Override // p149l.e30
            public final void call(Object obj) {
                ((Throwable) obj).getMessage();
            }
        }));
        duringCreated(((idv) ypv.m215673l(fld0.f98147b)).m135635g()).filter(new C21368yd()).filter(new w9j() { // from class: l.wh10
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f186353a.m174754r4((User) obj);
            }
        }).doOnNext(new e30() { // from class: l.xh10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f192852a.m174755s4((User) obj);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.yh10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f198264a.m174756t4((User) obj);
            }
        }));
        duringCreated(C22306c.merge(m206028F2().PlayerEvent.callVolumeChanged().m172460g(), m206028F2().MultiCallEvent.updateMemberVolume().m172460g())).subscribe(ffw.m121197h(new e30() { // from class: l.zh10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f203122a.m174738I4((BLiveCallVolume) obj);
            }
        }));
        duringCreated((C22306c) m206028F2().MultiCallEvent.refreshCallView().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.fi10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f97605a.m174757u4((Boolean) obj);
            }
        }));
        m174739c4(true);
        xdl0.m208340K((View) this.viewModel).filter(new w9j() { // from class: l.ii10
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((Integer) obj).intValue() > 0);
            }
        }).first().subscribe(ffw.m121197h(new e30() { // from class: l.ji10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f118042a.m174758v4((Integer) obj);
            }
        }));
        duringCreated((C22306c) m206028F2().MultiPkEventGroup.multiPkOnUpdatePoints().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.ki10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f123256a.m174761z4((LongLinkLiveMultiPk.MultiPkPoints) obj);
            }
        }));
        duringCreated((C22306c) m206028F2().MultiPkEventGroup.multiPkOnStart().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.li10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f128155a.m174730A4((LongLinkLiveMultiPk.MultiPk) obj);
            }
        }));
        duringCreated((C22306c) m206028F2().MultiPkEventGroup.multiPkOnPunishing().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.li10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f128155a.m174730A4((LongLinkLiveMultiPk.MultiPk) obj);
            }
        }));
        duringCreated((C22306c) m206028F2().MultiPkEventGroup.multiPkOnEnd().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.mi10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f133929a.m174729w4((soj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ void m174756t4(User user) {
        m174732C4(user, this.f154638j.m139800b4().m100379y(user.f56011id));
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ void m174757u4(Boolean bool) {
        if (!bool.booleanValue()) {
            mkd0.m154992z(this.f154640l);
            this.f154640l = null;
        }
        m174760y4(this.f154638j.m139800b4());
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ void m174758v4(Integer num) {
        m174740d4(true, num.intValue());
    }

    /* JADX INFO: renamed from: x4 */
    public final void m174759x4(final BLiveMultiCall bLiveMultiCall) {
        BLiveMultiCall bLiveMultiCallM177967B = r610.m177967B(this);
        m206028F2().OpenUserCardDialogEvent.show().mo172463j(UserCardData.builder(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED).userId(bLiveMultiCall.userId).setFromIdentity(bqq.m103388c(bLiveMultiCallM177967B)).setTo(bqq.m103388c(bLiveMultiCall)).setScene(BLiveActivity.TYPE_MULTI_CALL).setSource("anchor").setMultiCall(bLiveMultiCallM177967B).jumpToOtherRoom(bLiveMultiCall.userId, bLiveMultiCall.liveId, new d30() { // from class: l.ai10
            @Override // p149l.d30
            public final void call() {
                this.f69948a.m174749m4(bLiveMultiCall);
            }
        }).trackFrom("liveRoom").build());
    }

    /* JADX INFO: renamed from: y4 */
    public void m174760y4(b610 b610Var) {
        List<BLiveMultiCall> listM100376v = b610Var.m100376v();
        this.f154641m = listM100376v;
        ((MultiCallTopView) this.viewModel).setViewVisible(listM100376v.size() > 0);
        b610Var.m100375u();
        ((MultiCallTopView) this.viewModel).m75847s(this.f154641m, b610Var.m100375u());
        C12714b c12714bMo133471a = ((oxl) m129297F3(new rv00(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED))).mo133471a();
        if (c12714bMo133471a != null && c12714bMo133471a.m71900c1(MotionParams.PusherMotionEnum.MOTION_MULTI_CALL_ANCHOR)) {
            ((f110) c12714bMo133471a).m119087I1(b610Var.m100375u());
        } else {
            if (c12714bMo133471a == null || !c12714bMo133471a.m71900c1(MotionParams.PusherMotionEnum.MOTION_MULTI_CALL_AUDIENCE)) {
                return;
            }
            ((q210) c12714bMo133471a).m172430y1(b610Var.m100375u());
        }
    }

    /* JADX INFO: renamed from: z4 */
    public void m174761z4(LongLinkLiveMultiPk.MultiPkPoints multiPkPoints) {
        if (vwb.m200296J(multiPkPoints.getPlayerList())) {
            return;
        }
        ((MultiCallTopView) this.viewModel).m75850w(multiPkPoints.getPlayerList());
    }
}
