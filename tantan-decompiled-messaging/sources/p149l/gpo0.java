package p149l;

import android.text.TextUtils;
import android.util.Pair;
import com.p046p1.mobile.longlink.msg.liveroom.VoiceSweet;
import com.p046p1.mobile.putong.data.Meta;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveData;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerLocation;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCpHouseInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCpHouseRankAwardInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCpHouseTaskInfos;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceSweetCpRecommendUser;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceSweetCpTask;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceSweetLimitHouse;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.sweet.view.VoiceSweetCpView;
import java.util.ArrayList;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
public class gpo0 extends x6s<nnn0, VoiceSweetCpView> {

    /* JADX INFO: renamed from: j */
    public bsm f103825j;

    /* JADX INFO: renamed from: k */
    public hno0 f103826k;

    /* JADX INFO: renamed from: l */
    public pto0 f103827l;

    /* JADX INFO: renamed from: m */
    public qpo0 f103828m;

    /* JADX INFO: renamed from: n */
    public qro0 f103829n;

    /* JADX INFO: renamed from: o */
    public gso0 f103830o;

    /* JADX INFO: renamed from: l.gpo0$a */
    public class C17136a implements zfv.C21687a.a {
        public C17136a() {
        }

        @Override // p149l.zfv.C21687a.a
        /* JADX INFO: renamed from: c */
        public void mo67168c() {
            gpo0.this.m127451I4();
        }
    }

    public gpo0(bsm bsmVar, VoiceSweetCpView voiceSweetCpView, gso0 gso0Var) {
        super(bsmVar);
        this.f103825j = bsmVar;
        this.f103830o = gso0Var;
        mo51532C(voiceSweetCpView);
        this.f103826k = new hno0(bsmVar.f77095a, this);
        this.f103827l = new pto0(bsmVar.f77095a, this);
        this.f103828m = new qpo0(this, act());
        qro0 qro0Var = new qro0(bsmVar.f77095a, this);
        this.f103829n = qro0Var;
        qro0Var.mo21065i1(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G4 */
    public /* synthetic */ void m127420G4(soj0 soj0Var) {
        this.f103827l.m171374N(((VoiceSweetCpView) this.viewModel).getSelectCpInfo());
    }

    /* JADX INFO: renamed from: Z3 */
    public static /* synthetic */ void m127428Z3(Throwable th) {
    }

    /* JADX INFO: renamed from: b4 */
    public static /* synthetic */ void m127430b4(Throwable th) {
    }

    /* JADX INFO: renamed from: c4 */
    public static /* synthetic */ void m127431c4(Throwable th) {
    }

    /* JADX INFO: renamed from: f4 */
    public static /* synthetic */ void m127434f4(Throwable th) {
    }

    /* JADX INFO: renamed from: h4 */
    public static /* synthetic */ void m127436h4(Throwable th) {
    }

    /* JADX INFO: renamed from: j4 */
    public static /* synthetic */ void m127438j4(Throwable th) {
    }

    /* JADX INFO: renamed from: k4 */
    public static /* synthetic */ void m127439k4(Throwable th) {
    }

    /* JADX INFO: renamed from: l4 */
    public static /* synthetic */ void m127440l4(Throwable th) {
    }

    /* JADX INFO: renamed from: A4 */
    public final /* synthetic */ void m127444A4(String str, BLiveVoiceCpHouseRankAwardInfo bLiveVoiceCpHouseRankAwardInfo) {
        this.f103828m.m175861t0(bLiveVoiceCpHouseRankAwardInfo, str);
    }

    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ void m127445B4(boolean z, String str, BLiveEnvelope bLiveEnvelope) {
        Meta meta = bLiveEnvelope.meta;
        if (meta.code != 200) {
            if (TextUtils.isEmpty(meta.message)) {
                return;
            }
            osi0.m165783g(bLiveEnvelope.meta.message);
        } else {
            if (z) {
                osi0.m165782f(R$string.f46618Ch);
            }
            m127467Y4();
            m127458P4(null, str);
        }
    }

    /* JADX INFO: renamed from: C4 */
    public final /* synthetic */ void m127446C4(String str, int i, List list) {
        this.f103829n.m176074S(list, new ArrayList(), str, i);
    }

    /* JADX INFO: renamed from: D4 */
    public final /* synthetic */ void m127447D4(String str, int i, Pair pair) {
        this.f103829n.m176074S((List) pair.first, (List) pair.second, str, i);
    }

    /* JADX INFO: renamed from: E4 */
    public final /* synthetic */ void m127448E4(soj0 soj0Var) {
        m127458P4(null, null);
    }

    /* JADX INFO: renamed from: F4 */
    public final /* synthetic */ void m127449F4(String str, List list) {
        this.f103829n.m176073R(list, str);
    }

    /* JADX INFO: renamed from: H4 */
    public void m127450H4(String str, String str2) {
        duringCreated(bno0.m102815r(this.f103825j.f77102h.m149814k(), str, str2)).subscribe(ffw.m121194e(new e30() { // from class: l.moo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f134929a.m127475v4((BLiveVoiceCpHouseTaskInfos) obj);
            }
        }, new e30() { // from class: l.noo0
            @Override // p149l.e30
            public final void call(Object obj) {
                gpo0.m127439k4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: I4 */
    public void m127451I4() {
        duringCreated(bno0.m102810m(this.f103825j.f77102h.m149814k())).subscribe(ffw.m121194e(new e30() { // from class: l.too0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f171397a.m127476w4((BLiveData) obj);
            }
        }, new e30() { // from class: l.voo0
            @Override // p149l.e30
            public final void call(Object obj) {
                gpo0.m127436h4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: J4 */
    public void m127452J4(BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo) {
        m127462T4((bLiveVoiceCpHouseInfo == null || !bLiveVoiceCpHouseInfo.isUnLock) ? null : bLiveVoiceCpHouseInfo.otherUserId, 0);
    }

    /* JADX INFO: renamed from: K4 */
    public void m127453K4(BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo, String str) {
        if (bLiveVoiceCpHouseInfo == null) {
            return;
        }
        m127459Q4(bLiveVoiceCpHouseInfo.houseId, str);
    }

    /* JADX INFO: renamed from: L4 */
    public void m127454L4(BLiveVoiceSweetLimitHouse bLiveVoiceSweetLimitHouse, String str) {
        if (bLiveVoiceSweetLimitHouse == null) {
            return;
        }
        m127460R4(!bLiveVoiceSweetLimitHouse.wore, str, bLiveVoiceSweetLimitHouse.f44512id);
    }

    /* JADX INFO: renamed from: M4 */
    public void m127455M4(BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo, String str) {
        if (bLiveVoiceCpHouseInfo == null) {
            return;
        }
        if (TextUtils.isEmpty(str) || "0".equals(str)) {
            lsi0.m151593w(R$string.f47092Z);
        } else {
            m127459Q4(str, bLiveVoiceCpHouseInfo.otherUserId);
        }
    }

    /* JADX INFO: renamed from: N4 */
    public void m127456N4(BLiveVoiceSweetCpTask bLiveVoiceSweetCpTask, final BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo) {
        if (bLiveVoiceSweetCpTask == null || bLiveVoiceCpHouseInfo == null) {
            return;
        }
        String str = bLiveVoiceSweetCpTask.taskType;
        str.getClass();
        switch (str) {
            case "signin":
                bno0.m102808k(this.f103825j.f77102h.m149814k(), bLiveVoiceCpHouseInfo.houseId, bLiveVoiceCpHouseInfo.otherUserId, bLiveVoiceSweetCpTask.taskType).subscribe(ffw.m121194e(new e30() { // from class: l.uoo0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f177523a.m127477x4(bLiveVoiceCpHouseInfo, (soj0) obj);
                    }
                }, new e30() { // from class: l.yoo0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        gpo0.m127431c4((Throwable) obj);
                    }
                }));
                if (bLiveVoiceSweetCpTask.taskCpStatus == 0) {
                    npo0.m160535g();
                    break;
                }
                break;
            case "send_gift":
            case "first_send_gift":
                m127461S4(bLiveVoiceCpHouseInfo);
                break;
        }
    }

    /* JADX INFO: renamed from: O4 */
    public void m127457O4(BLiveVoiceSweetCpRecommendUser bLiveVoiceSweetCpRecommendUser, BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo) {
        if (bLiveVoiceSweetCpRecommendUser == null || bLiveVoiceCpHouseInfo == null) {
            return;
        }
        this.f103826k.m131972T(bLiveVoiceSweetCpRecommendUser, bLiveVoiceCpHouseInfo);
        npo0.m160530b();
    }

    /* JADX INFO: renamed from: P4 */
    public void m127458P4(final VoiceSweet.VoiceCpBindMessage voiceCpBindMessage, final String str) {
        duringCreated(bno0.m102810m(this.f103825j.f77102h.m149814k())).subscribe(ffw.m121194e(new e30() { // from class: l.woo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f187453a.m127478y4(voiceCpBindMessage, str, (BLiveData) obj);
            }
        }, new e30() { // from class: l.xoo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f193866a.m127479z4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Q4 */
    public final void m127459Q4(String str, final String str2) {
        duringCreated(bno0.m102811n(str, str2)).subscribe(ffw.m121194e(new e30() { // from class: l.zoo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f204137a.m127444A4(str2, (BLiveVoiceCpHouseRankAwardInfo) obj);
            }
        }, new e30() { // from class: l.apo0
            @Override // p149l.e30
            public final void call(Object obj) {
                gpo0.m127428Z3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: R4 */
    public final void m127460R4(final boolean z, final String str, int i) {
        duringCreated(bno0.m102816s(z, str, i)).subscribe(ffw.m121194e(new e30() { // from class: l.qoo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f155610a.m127445B4(z, str, (BLiveEnvelope) obj);
            }
        }, new z2k()));
    }

    /* JADX INFO: renamed from: S4 */
    public final void m127461S4(BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo) {
        m206028F2().VoiceSweetEvent.dismissSweetCpDialog().m172467p();
        m127468Z4(bLiveVoiceCpHouseInfo.otherUserId, bLiveVoiceCpHouseInfo.cpUserAvatar, bLiveVoiceCpHouseInfo.otherUserName);
    }

    /* JADX INFO: renamed from: T4 */
    public void m127462T4(final String str, final int i) {
        if (TextUtils.isEmpty(str)) {
            duringCreated(bno0.m102812o(str)).subscribe(ffw.m121194e(new e30() { // from class: l.bpo0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f76658a.m127446C4(str, i, (List) obj);
                }
            }, new e30() { // from class: l.cpo0
                @Override // p149l.e30
                public final void call(Object obj) {
                    gpo0.m127430b4((Throwable) obj);
                }
            }));
        } else {
            m127473t4(str, new e30() { // from class: l.dpo0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f87299a.m127447D4(str, i, (Pair) obj);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U4 */
    public void m127463U4(String str) {
        if (TextUtils.isEmpty(str) || "0".equals(str)) {
            return;
        }
        u4n0.m191752k(this, ((nnn0) m206027E2()).m132146l0().f56011id, str);
    }

    /* JADX INFO: renamed from: V4 */
    public void m127464V4() {
        gso0 gso0Var = this.f103830o;
        if (gso0Var != null) {
            gso0Var.m127835t4();
        }
    }

    /* JADX INFO: renamed from: W4 */
    public void m127465W4() {
        gso0 gso0Var = this.f103830o;
        if (gso0Var != null) {
            gso0Var.m127836u4();
        }
    }

    /* JADX INFO: renamed from: X4 */
    public void m127466X4(BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo) {
        bno0.m102818u(this.f103825j.f77102h.m149814k(), bLiveVoiceCpHouseInfo.otherUserId).subscribe(ffw.m121194e(new e30() { // from class: l.ooo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f144898a.m127448E4((soj0) obj);
            }
        }, new e30() { // from class: l.poo0
            @Override // p149l.e30
            public final void call(Object obj) {
                gpo0.m127440l4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y4 */
    public void m127467Y4() {
        final String str = this.f103829n.f156020r;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        duringCreated(bno0.m102814q(str)).subscribe(ffw.m121194e(new e30() { // from class: l.roo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f160404a.m127449F4(str, (List) obj);
            }
        }, new e30() { // from class: l.soo0
            @Override // p149l.e30
            public final void call(Object obj) {
                gpo0.m127434f4((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z4 */
    public final void m127468Z4(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || "0".equals(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            osi0.m165782f(R$string.f46570Ad);
            return;
        }
        mqv<i54> mqvVarM102064m = ((nnn0) m206027E2()).m160249P2().m102064m(str);
        User userNew_ = User.new_();
        userNew_.f56011id = str;
        userNew_.pictures = new ArrayList();
        Picture pictureNew_ = Picture.new_();
        pictureNew_.url = str2;
        userNew_.pictures.add(pictureNew_);
        userNew_.name = str3;
        mqv mqvVarM155998f = mqv.m155998f(userNew_);
        BLiveVoiceCall bLiveVoiceCallM102063l = ((nnn0) m206027E2()).m160249P2().m102063l(str);
        if (bLiveVoiceCallM102063l == null) {
            u4n0.m191745d(this, mqvVarM155998f);
        } else if (mqvVarM102064m != null) {
            u4n0.m191749h(this, bLiveVoiceCallM102063l, mqvVarM102064m);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p4 */
    public final void m127469p4(String str, String str2) {
        BLiveVoiceCall bLiveVoiceCallM102063l = ((nnn0) m206027E2()).m160249P2().m102063l(str2);
        m206028F2().SendGiftEventGroup.sendGift().mo172463j(new cfe0.C16123a().m106531v(str, new C17136a(), 1, "sendGiftBindCp", "sendGiftBindCp", BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerLocation.get("sweetCp"), ""), str2, "voice_sweet_bind_cp").m106525A(false).m106535z(bLiveVoiceCallM102063l != null ? mlj.m155154c(new i54(bLiveVoiceCallM102063l.f44485id, bLiveVoiceCallM102063l.userName, bLiveVoiceCallM102063l.userPicture), q44.m172922b(bLiveVoiceCallM102063l.f44485id, "gift-audience-none-voiceLiveMain", bLiveVoiceCallM102063l.position)) : null).m106529t());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q4 */
    public void m127470q4(BLiveVoiceSweetCpRecommendUser bLiveVoiceSweetCpRecommendUser) {
        if (bLiveVoiceSweetCpRecommendUser == null) {
            return;
        }
        String strM195954tb = ypv.m215672k().m195954tb();
        if (TextUtils.isEmpty(strM195954tb)) {
            return;
        }
        m127469p4(strM195954tb, bLiveVoiceSweetCpRecommendUser.userId);
        npo0.m160534f(((nnn0) m206027E2()).mo97490p() ? "p_anchor_audio_room" : "p_user_audio_room");
    }

    /* JADX INFO: renamed from: r4 */
    public boolean m127471r4() {
        if (((VoiceSweetCpView) this.viewModel).getSelectCpInfo() == null) {
            return true;
        }
        V v2 = this.viewModel;
        if (((VoiceSweetCpView) v2).f53562s) {
            return true;
        }
        return !((VoiceSweetCpView) v2).getSelectCpInfo().isUnLock;
    }

    /* JADX INFO: renamed from: s4 */
    public void m127472s4() {
        qro0 qro0Var = this.f103829n;
        if (qro0Var != null) {
            qro0Var.mo71838p();
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().VoiceSweetEvent.showUnbindCpDialog().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.joo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f119003a.m127420G4((soj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public final void m127473t4(String str, final e30<Pair<List<BLiveVoiceCpHouseInfo>, List<BLiveVoiceSweetLimitHouse>>> e30Var) {
        duringCreated(C22306c.zip(bno0.m102812o(str).onErrorResumeNext(new w9j() { // from class: l.epo0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C22306c.empty();
            }
        }), bno0.m102814q(str).onErrorResumeNext(new w9j() { // from class: l.fpo0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C22306c.empty();
            }
        }), new ar50())).subscribe(ffw.m121194e(new e30() { // from class: l.koo0
            @Override // p149l.e30
            public final void call(Object obj) {
                e30Var.call((Pair) obj);
            }
        }, new e30() { // from class: l.loo0
            @Override // p149l.e30
            public final void call(Object obj) {
                gpo0.m127438j4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u4 */
    public boolean m127474u4() {
        qro0 qro0Var = this.f103829n;
        return qro0Var != null && qro0Var.isShowing();
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ void m127475v4(BLiveVoiceCpHouseTaskInfos bLiveVoiceCpHouseTaskInfos) {
        ((VoiceSweetCpView) this.viewModel).m78512G(bLiveVoiceCpHouseTaskInfos);
    }

    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ void m127476w4(BLiveData bLiveData) {
        ((VoiceSweetCpView) this.viewModel).m78513H(bLiveData.cpRecommendUserList);
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ void m127477x4(BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo, soj0 soj0Var) {
        m127450H4(bLiveVoiceCpHouseInfo.houseId, bLiveVoiceCpHouseInfo.otherUserId);
    }

    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ void m127478y4(VoiceSweet.VoiceCpBindMessage voiceCpBindMessage, String str, BLiveData bLiveData) {
        ((VoiceSweetCpView) this.viewModel).m78523y(bLiveData.voiceCpHouseList);
        if (voiceCpBindMessage == null) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            ((VoiceSweetCpView) this.viewModel).m78524z(str);
        } else if (voiceCpBindMessage.getAction() == VoiceSweet.VoiceCpBindAction.agree) {
            ((VoiceSweetCpView) this.viewModel).m78524z(voiceCpBindMessage.getOtherUserId());
        } else if (voiceCpBindMessage.getAction() == VoiceSweet.VoiceCpBindAction.refuse) {
            ((VoiceSweetCpView) this.viewModel).m78524z(null);
        }
    }

    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ void m127479z4(Throwable th) {
        ((VoiceSweetCpView) this.viewModel).m78523y(null);
        ((VoiceSweetCpView) this.viewModel).m78509C(true, true, R$string.f46764J9);
    }
}
