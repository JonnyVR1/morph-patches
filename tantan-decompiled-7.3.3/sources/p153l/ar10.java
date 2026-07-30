package p153l;

import android.util.Pair;
import android.util.Size;
import android.view.View;
import com.google.android.exoplayer2.PlaybackException;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveActivity;
import com.p051p1.mobile.putong.live.base.data.BLiveCallVolume;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12877b;
import com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;
import com.p051p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p051p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomType;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.C12999e;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiCall.view.MultiCallCellTopView;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiCall.view.MultiCallTopView;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p153l.oo2;

/* JADX INFO: loaded from: classes5.dex */
public class ar10<D extends oo2> extends i6t<oo2, MultiCallTopView> {

    /* JADX INFO: renamed from: i */
    public C22507a<Boolean> f72898i;

    /* JADX INFO: renamed from: j */
    public final td10<D> f72899j;

    /* JADX INFO: renamed from: k */
    public final HashMap<String, User> f72900k;

    /* JADX INFO: renamed from: l */
    public kcg0 f72901l;

    /* JADX INFO: renamed from: m */
    public List<BLiveMultiCall> f72902m;

    public ar10(dum<D> dumVar, MultiCallTopView multiCallTopView, td10<D> td10Var) {
        super(dumVar);
        this.f72898i = C22507a.m222758b();
        this.f72900k = new HashMap<>();
        mo52715C(multiCallTopView);
        this.f72899j = td10Var;
    }

    /* JADX INFO: renamed from: K3 */
    public static /* synthetic */ void m99585K3(Boolean bool) {
    }

    /* JADX INFO: renamed from: N3 */
    public static /* synthetic */ void m99588N3(le10 le10Var) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w4 */
    public /* synthetic */ void m99602w4(vxj0 vxj0Var) {
        ((MultiCallTopView) this.viewModel).m77032v();
    }

    /* JADX INFO: renamed from: A4 */
    public void m99603A4(LongLinkLiveMultiPk.MultiPk multiPk) {
        if (jyb.m147479J(multiPk.getPlayersList())) {
            return;
        }
        ((MultiCallTopView) this.viewModel).m77034x(multiPk);
    }

    /* JADX INFO: renamed from: B4 */
    public void mo99604B4(Pair<le10, Boolean> pair) {
        Object obj;
        Objects.toString(pair.second);
        if (!((Boolean) pair.second).booleanValue() || (obj = pair.first) == null) {
            ir10.m141746a("renderCallView stream is false or manager is null");
            ((MultiCallTopView) this.viewModel).setViewVisible(false);
            return;
        }
        int i = ((le10) obj).f131693d;
        int size = ((le10) obj).m153854v().size();
        ir10.m141746a("renderCallView stream: operation:" + bf10.m103847y(i) + ", size:" + size);
        m99633y4((le10) pair.first);
        if (i == 1) {
            jyb.m147537z(((le10) pair.first).m153854v(), new y20() { // from class: l.lq10
                @Override // p153l.y20
                public final void call(Object obj2) {
                    this.f133134a.m99607E4((BLiveMultiCall) obj2);
                }
            });
        } else if (i == 3) {
            this.f72900k.remove(((le10) pair.first).f131692c.userId);
        } else {
            if (i != 4) {
                return;
            }
            m99607E4(((le10) pair.first).f131692c);
        }
    }

    /* JADX INFO: renamed from: C4 */
    public final void m99605C4(User user, int i) {
        BLiveMultiCall bLiveMultiCallM153850r = this.f72899j.m190584b4().m153850r(i);
        int iM153852t = this.f72899j.m190584b4().m153852t();
        if (NullChecker.m82486a(bLiveMultiCallM153850r)) {
            ((MultiCallTopView) this.viewModel).m77031u(user, i, iM153852t);
        }
    }

    /* JADX INFO: renamed from: D4 */
    public final void m99606D4(boolean z) {
        m213811F2().StickerEvent.changeVisible().mo199274m(Boolean.valueOf(!z));
    }

    /* JADX INFO: renamed from: E4 */
    public final void m99607E4(final BLiveMultiCall bLiveMultiCall) {
        if (this.f72900k.get(bLiveMultiCall.userId) != null) {
            m99605C4(this.f72900k.get(bLiveMultiCall.userId), bLiveMultiCall.position);
        } else {
            duringCreated(LivingNormalApiProvider.m72757s7(bLiveMultiCall.userId, "")).doOnNext(new y20() { // from class: l.oq10
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f148534a.m99623n4((User) obj);
                }
            }).subscribe(dhw.m115829h(new y20() { // from class: l.qq10
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f158938a.m99624o4(bLiveMultiCall, (User) obj);
                }
            }));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F4 */
    public final void m99608F4(boolean z) {
        m213811F2().ChatEvent.changeInputSize().mo199273j(new Size(0, j35.m143322g(z, (View) this.viewModel, (View) ((MultiCallTopView) this.viewModel).getParent(), Boolean.valueOf(m213810E2().mo118373p()))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G4 */
    public final void m99609G4(boolean z) {
        m213811F2().TraysViewEvent.changeBottomSpace().mo199273j(new C12999e.a(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED).m75475a(j35.m143321f(z, (View) this.viewModel, (View) ((MultiCallTopView) this.viewModel).getParent(), Boolean.valueOf(m213810E2().mo118373p()))).m75476b());
    }

    /* JADX INFO: renamed from: H4 */
    public void m99610H4(final MultiCallCellTopView multiCallCellTopView) {
        if (this.f72901l == null) {
            this.f72901l = m138858H3(m213810E2().m168521h2(5, TimeUnit.SECONDS).first()).subscribe(dhw.m115829h(new y20() { // from class: l.rq10
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f164419a.m99625p4(multiCallCellTopView, (Long) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: I4 */
    public final void m99611I4(final BLiveCallVolume bLiveCallVolume) {
        if (bLiveCallVolume == null) {
            return;
        }
        jyb.m147537z(this.f72899j.m190584b4().m153854v(), new y20() { // from class: l.mq10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f137989a.m99626q4(bLiveCallVolume, (BLiveMultiCall) obj);
            }
        });
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
    }

    /* JADX INFO: renamed from: c4 */
    public final void m99612c4(boolean z) {
        m99606D4(z);
        bf10.m103832i(act(), !z);
    }

    /* JADX INFO: renamed from: d4 */
    public final void m99613d4(boolean z, int i) {
        m99608F4(z);
        m99609G4(z);
        m213811F2().MultiCallEvent.topViewVisible().mo199274m(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: e4 */
    public void m99614e4(int i) {
        String strM103797C = bf10.m103797C(this.f72899j.m190587e4(), bf10.m103807M(this));
        jr10.m146662k(this.f72899j.m190584b4().f131691b, m213810E2().mo118373p());
        if (fn10.m126347o(strM103797C)) {
            if (IntlCountryCodeController.m29122s()) {
                o1j0.m165649w(R$string.f47676M8);
                return;
            } else {
                m213811F2().MultiCallEvent.openApplyDlg().mo199273j(Integer.valueOf(i));
                return;
            }
        }
        if (fn10.m126343k(strM103797C)) {
            m213811F2().MultiCallEvent.openManageDialog().mo199273j(-1);
            return;
        }
        if (fn10.m126348p(strM103797C)) {
            o1j0.m165651y(xau.m209910t(R$string.f47885W7));
        } else if (fn10.m126339g(strM103797C)) {
            o1j0.m165651y(xau.m209910t(R$string.f48387t8));
        } else if (fn10.m126335c(strM103797C)) {
            o1j0.m165651y(xau.m209910t(R$string.f48365s8));
        }
    }

    /* JADX INFO: renamed from: f4 */
    public void m99615f4(int i) {
        BLiveMultiCall bLiveMultiCallM153850r = this.f72899j.m190584b4().m153850r(i);
        if (bLiveMultiCallM153850r == null) {
            m99614e4(i);
            return;
        }
        if (m99616g4(bLiveMultiCallM153850r, bf10.m103797C(this.f72899j.m190587e4(), bf10.m103807M(this)))) {
            m213811F2().MultiCallEvent.openCallingOperateDialog().mo199273j(bLiveMultiCallM153850r);
        } else {
            m99632x4(bLiveMultiCallM153850r);
        }
    }

    /* JADX INFO: renamed from: g4 */
    public final boolean m99616g4(BLiveMultiCall bLiveMultiCall, String str) {
        if (bf10.m103817W(bLiveMultiCall.userId) || bf10.m103800F(bLiveMultiCall, str) != null) {
            return true;
        }
        return fn10.m126335c(str) && fn10.m126338f(bLiveMultiCall);
    }

    /* JADX INFO: renamed from: h4 */
    public boolean m99617h4() {
        td10<D> td10Var = this.f72899j;
        return (td10Var instanceof jn10) && ((jn10) td10Var).f121737n && eb20.m120150c() && fn10.m126347o(bf10.m103798D(this));
    }

    /* JADX INFO: renamed from: i4 */
    public void m99618i4(User user) {
        wrv wrvVar = zrv.f205799a;
        duringCreated(wrvVar.m207662d(wrvVar.m207631D0(), user, true, "liveRoom", null, "", mo78457R2(), BLiveActivity.TYPE_MULTI_CALL)).subscribe(dhw.m115826e(new y20() { // from class: l.nq10
            @Override // p153l.y20
            public final void call(Object obj) {
                o1j0.m165649w(R$string.f47651L4);
            }
        }, new r5k()));
    }

    /* JADX INFO: renamed from: j4 */
    public boolean m99619j4() {
        td10<D> td10Var = this.f72899j;
        return (td10Var instanceof jn10) && ((jn10) td10Var).f121736m;
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m99620k4() {
        return this.f72899j.m190584b4().f131691b;
    }

    /* JADX INFO: renamed from: l4, reason: merged with bridge method [inline-methods] */
    public final void m99622m4(BLiveMultiCall bLiveMultiCall) {
        afu.m97559h(kfd0.m149385x().m149398g(bLiveMultiCall.userId).m149409r(bLiveMultiCall.liveId).m149412u("onlive").m149411t("video_live").m149414w("e_pk_gotoliveroom_button").m149392a(), mo78457R2());
        m213811F2().JumpRoomEvent.jumpRoom().mo199273j(new JumpRoomData.C12924a().m74214t(m213810E2().mo160117o0()).m74212r(m213810E2().m202191k()).m74213s(m213810E2().mo183435j().room.f45267id).m74211q(m213810E2().m168532l0().name).m74216v(bLiveMultiCall.liveId).m74217w(bLiveMultiCall.roomId).m74215u(m213810E2().mo160117o0()).m74208n(JumpRoomType.CHANGE_SOURCE_WITH_BACK).m74207m());
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        ((MultiCallTopView) this.viewModel).setViewVisible(false);
        this.f72900k.clear();
        if (m213810E2().m168492X0()) {
            ve10.m201029i(this, "live");
        }
        m99612c4(false);
        m99613d4(false, 0);
        super.mo70300n();
    }

    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ void m99623n4(User user) {
        this.f72900k.put(user.f56859id, user);
    }

    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ void m99624o4(BLiveMultiCall bLiveMultiCall, User user) {
        m99605C4(user, bLiveMultiCall.position);
    }

    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ void m99625p4(MultiCallCellTopView multiCallCellTopView, Long l2) {
        td10<D> td10Var = this.f72899j;
        if (td10Var instanceof jn10) {
            ((jn10) td10Var).f121737n = false;
        }
        multiCallCellTopView.m77003o0();
        this.f72901l = null;
    }

    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ void m99626q4(BLiveCallVolume bLiveCallVolume, BLiveMultiCall bLiveMultiCall) {
        Float f = bLiveCallVolume.volumes.get(bLiveMultiCall.userId);
        if (f == null || f.floatValue() <= 0.02f || fp10.m126518e(bLiveMultiCall)) {
            ((MultiCallTopView) this.viewModel).m77029q(bLiveMultiCall.position, this.f72899j.m190584b4().m153852t(), false, f);
        } else {
            ((MultiCallTopView) this.viewModel).m77029q(bLiveMultiCall.position, this.f72899j.m190584b4().m153852t(), true, f);
        }
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ Boolean m99627r4(User user) {
        return Boolean.valueOf(this.f72899j.m190584b4().m153851s(user.f56859id) != null);
    }

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ void m99628s4(User user) {
        this.f72900k.put(user.f56859id, user);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(C22421c.combineLatest(this.f72899j.m190585c4().doOnNext(new y20() { // from class: l.eq10
            @Override // p153l.y20
            public final void call(Object obj) {
                ar10.m99588N3((le10) obj);
            }
        }), this.f72898i.asObservable().doOnNext(new y20() { // from class: l.xq10
            @Override // p153l.y20
            public final void call(Object obj) {
                ar10.m99585K3((Boolean) obj);
            }
        }), new rcj() { // from class: l.yq10
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return new Pair((le10) obj, (Boolean) obj2);
            }
        })).subscribe(dhw.m115826e(new y20() { // from class: l.zq10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f205559a.mo99604B4((Pair) obj);
            }
        }, new y20() { // from class: l.fq10
            @Override // p153l.y20
            public final void call(Object obj) {
                ((Throwable) obj).getMessage();
            }
        }));
        duringCreated(((jfv) zrv.m221194l(htd0.f111520b)).m144720g()).filter(new C20291td()).filter(new qcj() { // from class: l.gq10
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f105641a.m99627r4((User) obj);
            }
        }).doOnNext(new y20() { // from class: l.hq10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f111066a.m99628s4((User) obj);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.iq10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f116325a.m99629t4((User) obj);
            }
        }));
        duringCreated(C22421c.merge(m213811F2().PlayerEvent.callVolumeChanged().m199270g(), m213811F2().MultiCallEvent.updateMemberVolume().m199270g())).subscribe(dhw.m115829h(new y20() { // from class: l.jq10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f122175a.m99611I4((BLiveCallVolume) obj);
            }
        }));
        duringCreated((C22421c) m213811F2().MultiCallEvent.refreshCallView().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.pq10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f153616a.m99630u4((Boolean) obj);
            }
        }));
        m99612c4(true);
        bnl0.m105520K((View) this.viewModel).filter(new qcj() { // from class: l.sq10
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((Integer) obj).intValue() > 0);
            }
        }).first().subscribe(dhw.m115829h(new y20() { // from class: l.tq10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f175670a.m99631v4((Integer) obj);
            }
        }));
        duringCreated((C22421c) m213811F2().MultiPkEventGroup.multiPkOnUpdatePoints().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.uq10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f180341a.m99634z4((LongLinkLiveMultiPk.MultiPkPoints) obj);
            }
        }));
        duringCreated((C22421c) m213811F2().MultiPkEventGroup.multiPkOnStart().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.vq10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f185317a.m99603A4((LongLinkLiveMultiPk.MultiPk) obj);
            }
        }));
        duringCreated((C22421c) m213811F2().MultiPkEventGroup.multiPkOnPunishing().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.vq10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f185317a.m99603A4((LongLinkLiveMultiPk.MultiPk) obj);
            }
        }));
        duringCreated((C22421c) m213811F2().MultiPkEventGroup.multiPkOnEnd().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.wq10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f190377a.m99602w4((vxj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ void m99629t4(User user) {
        m99605C4(user, this.f72899j.m190584b4().m153857y(user.f56859id));
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ void m99630u4(Boolean bool) {
        if (!bool.booleanValue()) {
            psd0.m173633z(this.f72901l);
            this.f72901l = null;
        }
        m99633y4(this.f72899j.m190584b4());
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ void m99631v4(Integer num) {
        m99613d4(true, num.intValue());
    }

    /* JADX INFO: renamed from: x4 */
    public final void m99632x4(final BLiveMultiCall bLiveMultiCall) {
        BLiveMultiCall bLiveMultiCallM103796B = bf10.m103796B(this);
        m213811F2().OpenUserCardDialogEvent.show().mo199273j(UserCardData.builder(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED).userId(bLiveMultiCall.userId).setFromIdentity(csq.m112229c(bLiveMultiCallM103796B)).setTo(csq.m112229c(bLiveMultiCall)).setScene(BLiveActivity.TYPE_MULTI_CALL).setSource("anchor").setMultiCall(bLiveMultiCallM103796B).jumpToOtherRoom(bLiveMultiCall.userId, bLiveMultiCall.liveId, new x20() { // from class: l.kq10
            @Override // p153l.x20
            public final void call() {
                this.f128149a.m99622m4(bLiveMultiCall);
            }
        }).trackFrom("liveRoom").build());
    }

    /* JADX INFO: renamed from: y4 */
    public void m99633y4(le10 le10Var) {
        List<BLiveMultiCall> listM153854v = le10Var.m153854v();
        this.f72902m = listM153854v;
        ((MultiCallTopView) this.viewModel).setViewVisible(listM153854v.size() > 0);
        le10Var.m153853u();
        ((MultiCallTopView) this.viewModel).m77030s(this.f72902m, le10Var.m153853u());
        C12877b c12877bMo133182a = ((h0m) m138856F3(new z310(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED))).mo133182a();
        if (c12877bMo133182a != null && c12877bMo133182a.m73083c1(MotionParams.PusherMotionEnum.MOTION_MULTI_CALL_ANCHOR)) {
            ((p910) c12877bMo133182a).m171312I1(le10Var.m153853u());
        } else {
            if (c12877bMo133182a == null || !c12877bMo133182a.m73083c1(MotionParams.PusherMotionEnum.MOTION_MULTI_CALL_AUDIENCE)) {
                return;
            }
            ((ab10) c12877bMo133182a).m96693y1(le10Var.m153853u());
        }
    }

    /* JADX INFO: renamed from: z4 */
    public void m99634z4(LongLinkLiveMultiPk.MultiPkPoints multiPkPoints) {
        if (jyb.m147479J(multiPkPoints.getPlayerList())) {
            return;
        }
        ((MultiCallTopView) this.viewModel).m77033w(multiPkPoints.getPlayerList());
    }
}
