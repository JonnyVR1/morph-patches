package p009l;

import android.text.TextUtils;
import android.util.Pair;
import com.p000p1.mobile.putong.live.livingroom.voice.intl.sweet.view.VoiceSweetCpView;
import com.p1.mobile.longlink.msg.liveroom.VoiceSweet;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Meta;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.data.BLiveData;
import com.p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.p1.mobile.putong.live.base.data.BLiveTraceServerLocation;
import com.p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p1.mobile.putong.live.base.data.BLiveVoiceCpHouseInfo;
import com.p1.mobile.putong.live.base.data.BLiveVoiceCpHouseRankAwardInfo;
import com.p1.mobile.putong.live.base.data.BLiveVoiceCpHouseTaskInfos;
import com.p1.mobile.putong.live.base.data.BLiveVoiceSweetCpRecommendUser;
import com.p1.mobile.putong.live.base.data.BLiveVoiceSweetCpTask;
import com.p1.mobile.putong.live.base.data.BLiveVoiceSweetLimitHouse;
import com.p1.mobile.putong.live.livingroom.R;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import java.util.List;
import l.ar50;
import l.bsm;
import l.bwr;
import l.cfe0;
import l.e30;
import l.ffw;
import l.i54;
import l.lsi0;
import l.mlj;
import l.mqv;
import l.nnn0;
import l.osi0;
import l.q44;
import l.s7m;
import l.soj0;
import l.u4n0;
import l.w9j;
import l.x6s;
import l.z2k;
import l.zfv;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class gpo0 extends x6s<nnn0, VoiceSweetCpView> {

    /* JADX INFO: renamed from: j */
    public bsm f13678j;

    /* JADX INFO: renamed from: k */
    public hno0 f13679k;

    /* JADX INFO: renamed from: l */
    public pto0 f13680l;

    /* JADX INFO: renamed from: m */
    public qpo0 f13681m;

    /* JADX INFO: renamed from: n */
    public qro0 f13682n;

    /* JADX INFO: renamed from: o */
    public gso0 f13683o;

    /* JADX INFO: renamed from: l.gpo0$a */
    public class C0923a implements zfv.a.a {
        public C0923a() {
        }

        /* JADX INFO: renamed from: c */
        public void m15222c() {
            gpo0.this.m15192I4();
        }
    }

    public gpo0(bsm bsmVar, VoiceSweetCpView voiceSweetCpView, gso0 gso0Var) {
        super(bsmVar);
        this.f13678j = bsmVar;
        this.f13683o = gso0Var;
        C(voiceSweetCpView);
        this.f13679k = new hno0(bsmVar.a, this);
        this.f13680l = new pto0(bsmVar.a, this);
        this.f13681m = new qpo0(this, act());
        qro0 qro0Var = new qro0(bsmVar.a, this);
        this.f13682n = qro0Var;
        qro0Var.m21212n(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G4 */
    public /* synthetic */ void m15161G4(soj0 soj0Var) {
        this.f13680l.m20715N(((VoiceSweetCpView) ((bwr) this).viewModel).getSelectCpInfo());
    }

    /* JADX INFO: renamed from: Z3 */
    public static /* synthetic */ void m15169Z3(Throwable th) {
    }

    /* JADX INFO: renamed from: b4 */
    public static /* synthetic */ void m15171b4(Throwable th) {
    }

    /* JADX INFO: renamed from: c4 */
    public static /* synthetic */ void m15172c4(Throwable th) {
    }

    /* JADX INFO: renamed from: f4 */
    public static /* synthetic */ void m15175f4(Throwable th) {
    }

    /* JADX INFO: renamed from: h4 */
    public static /* synthetic */ void m15177h4(Throwable th) {
    }

    /* JADX INFO: renamed from: j4 */
    public static /* synthetic */ void m15179j4(Throwable th) {
    }

    /* JADX INFO: renamed from: k4 */
    public static /* synthetic */ void m15180k4(Throwable th) {
    }

    /* JADX INFO: renamed from: l4 */
    public static /* synthetic */ void m15181l4(Throwable th) {
    }

    /* JADX INFO: renamed from: A4 */
    public final /* synthetic */ void m15185A4(String str, BLiveVoiceCpHouseRankAwardInfo bLiveVoiceCpHouseRankAwardInfo) {
        this.f13681m.m21141t0(bLiveVoiceCpHouseRankAwardInfo, str);
    }

    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ void m15186B4(boolean z, String str, BLiveEnvelope bLiveEnvelope) {
        Meta meta = bLiveEnvelope.meta;
        if (meta.code != 200) {
            if (TextUtils.isEmpty(meta.message)) {
                return;
            }
            osi0.g(bLiveEnvelope.meta.message);
        } else {
            if (z) {
                osi0.f(R.string.Ch);
            }
            m15208Y4();
            m15199P4(null, str);
        }
    }

    /* JADX INFO: renamed from: C4 */
    public final /* synthetic */ void m15187C4(String str, int i, List list) {
        this.f13682n.m21209S(list, new ArrayList(), str, i);
    }

    /* JADX INFO: renamed from: D4 */
    public final /* synthetic */ void m15188D4(String str, int i, Pair pair) {
        this.f13682n.m21209S((List) pair.first, (List) pair.second, str, i);
    }

    /* JADX INFO: renamed from: E4 */
    public final /* synthetic */ void m15189E4(soj0 soj0Var) {
        m15199P4(null, null);
    }

    /* JADX INFO: renamed from: F4 */
    public final /* synthetic */ void m15190F4(String str, List list) {
        this.f13682n.m21208R(list, str);
    }

    /* JADX INFO: renamed from: H4 */
    public void m15191H4(String str, String str2) {
        duringCreated(bno0.m12175r(this.f13678j.h.k(), str, str2)).subscribe(ffw.e(new e30() { // from class: l.moo0
            public final void call(Object obj) {
                this.f17007a.m15217v4((BLiveVoiceCpHouseTaskInfos) obj);
            }
        }, new e30() { // from class: l.noo0
            public final void call(Object obj) {
                gpo0.m15180k4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: I4 */
    public void m15192I4() {
        duringCreated(bno0.m12170m(this.f13678j.h.k())).subscribe(ffw.e(new e30() { // from class: l.too0
            public final void call(Object obj) {
                this.f20808a.m15218w4((BLiveData) obj);
            }
        }, new e30() { // from class: l.voo0
            public final void call(Object obj) {
                gpo0.m15177h4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: J4 */
    public void m15193J4(BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo) {
        m15203T4((bLiveVoiceCpHouseInfo == null || !bLiveVoiceCpHouseInfo.isUnLock) ? null : bLiveVoiceCpHouseInfo.otherUserId, 0);
    }

    /* JADX INFO: renamed from: K4 */
    public void m15194K4(BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo, String str) {
        if (bLiveVoiceCpHouseInfo == null) {
            return;
        }
        m15200Q4(bLiveVoiceCpHouseInfo.houseId, str);
    }

    /* JADX INFO: renamed from: L4 */
    public void m15195L4(BLiveVoiceSweetLimitHouse bLiveVoiceSweetLimitHouse, String str) {
        if (bLiveVoiceSweetLimitHouse == null) {
            return;
        }
        m15201R4(!bLiveVoiceSweetLimitHouse.wore, str, bLiveVoiceSweetLimitHouse.id);
    }

    /* JADX INFO: renamed from: M4 */
    public void m15196M4(BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo, String str) {
        if (bLiveVoiceCpHouseInfo == null) {
            return;
        }
        if (TextUtils.isEmpty(str) || "0".equals(str)) {
            lsi0.w(R.string.Z);
        } else {
            m15200Q4(str, bLiveVoiceCpHouseInfo.otherUserId);
        }
    }

    /* JADX INFO: renamed from: N4 */
    public void m15197N4(BLiveVoiceSweetCpTask bLiveVoiceSweetCpTask, final BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo) {
        if (bLiveVoiceSweetCpTask == null || bLiveVoiceCpHouseInfo == null) {
            return;
        }
        String str = bLiveVoiceSweetCpTask.taskType;
        str.getClass();
        switch (str) {
            case "signin":
                bno0.m12168k(this.f13678j.h.k(), bLiveVoiceCpHouseInfo.houseId, bLiveVoiceCpHouseInfo.otherUserId, bLiveVoiceSweetCpTask.taskType).subscribe(ffw.e(new e30() { // from class: l.uoo0
                    public final void call(Object obj) {
                        this.f21282a.m15219x4(bLiveVoiceCpHouseInfo, (soj0) obj);
                    }
                }, new e30() { // from class: l.yoo0
                    public final void call(Object obj) {
                        gpo0.m15172c4((Throwable) obj);
                    }
                }));
                if (bLiveVoiceSweetCpTask.taskCpStatus == 0) {
                    npo0.m19009g();
                    break;
                }
                break;
            case "send_gift":
            case "first_send_gift":
                m15202S4(bLiveVoiceCpHouseInfo);
                break;
        }
    }

    /* JADX INFO: renamed from: O4 */
    public void m15198O4(BLiveVoiceSweetCpRecommendUser bLiveVoiceSweetCpRecommendUser, BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo) {
        if (bLiveVoiceSweetCpRecommendUser == null || bLiveVoiceCpHouseInfo == null) {
            return;
        }
        this.f13679k.m15899T(bLiveVoiceSweetCpRecommendUser, bLiveVoiceCpHouseInfo);
        npo0.m19004b();
    }

    /* JADX INFO: renamed from: P4 */
    public void m15199P4(final VoiceSweet.VoiceCpBindMessage voiceCpBindMessage, final String str) {
        duringCreated(bno0.m12170m(this.f13678j.h.k())).subscribe(ffw.e(new e30() { // from class: l.woo0
            public final void call(Object obj) {
                this.f22253a.m15220y4(voiceCpBindMessage, str, (BLiveData) obj);
            }
        }, new e30() { // from class: l.xoo0
            public final void call(Object obj) {
                this.f22685a.m15221z4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Q4 */
    public final void m15200Q4(String str, final String str2) {
        duringCreated(bno0.m12171n(str, str2)).subscribe(ffw.e(new e30() { // from class: l.zoo0
            public final void call(Object obj) {
                this.f23810a.m15185A4(str2, (BLiveVoiceCpHouseRankAwardInfo) obj);
            }
        }, new e30() { // from class: l.apo0
            public final void call(Object obj) {
                gpo0.m15169Z3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: R4 */
    public final void m15201R4(final boolean z, final String str, int i) {
        duringCreated(bno0.m12176s(z, str, i)).subscribe(ffw.e(new e30() { // from class: l.qoo0
            public final void call(Object obj) {
                this.f19413a.m15186B4(z, str, (BLiveEnvelope) obj);
            }
        }, new z2k()));
    }

    /* JADX INFO: renamed from: S4 */
    public final void m15202S4(BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo) {
        F2().VoiceSweetEvent.dismissSweetCpDialog().p();
        m15209Z4(bLiveVoiceCpHouseInfo.otherUserId, bLiveVoiceCpHouseInfo.cpUserAvatar, bLiveVoiceCpHouseInfo.otherUserName);
    }

    /* JADX INFO: renamed from: T4 */
    public void m15203T4(final String str, final int i) {
        if (TextUtils.isEmpty(str)) {
            duringCreated(bno0.m12172o(str)).subscribe(ffw.e(new e30() { // from class: l.bpo0
                public final void call(Object obj) {
                    this.f10232a.m15187C4(str, i, (List) obj);
                }
            }, new e30() { // from class: l.cpo0
                public final void call(Object obj) {
                    gpo0.m15171b4((Throwable) obj);
                }
            }));
        } else {
            m15215t4(str, new e30() { // from class: l.dpo0
                public final void call(Object obj) {
                    this.f11939a.m15188D4(str, i, (Pair) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: U4 */
    public void m15204U4(String str) {
        if (TextUtils.isEmpty(str) || "0".equals(str)) {
            return;
        }
        u4n0.k(this, ((DbObject) E2().l0()).id, str);
    }

    /* JADX INFO: renamed from: V4 */
    public void m15205V4() {
        gso0 gso0Var = this.f13683o;
        if (gso0Var != null) {
            gso0Var.m15257t4();
        }
    }

    /* JADX INFO: renamed from: W4 */
    public void m15206W4() {
        gso0 gso0Var = this.f13683o;
        if (gso0Var != null) {
            gso0Var.m15258u4();
        }
    }

    /* JADX INFO: renamed from: X4 */
    public void m15207X4(BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo) {
        bno0.m12178u(this.f13678j.h.k(), bLiveVoiceCpHouseInfo.otherUserId).subscribe(ffw.e(new e30() { // from class: l.ooo0
            public final void call(Object obj) {
                this.f18193a.m15189E4((soj0) obj);
            }
        }, new e30() { // from class: l.poo0
            public final void call(Object obj) {
                gpo0.m15181l4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y4 */
    public void m15208Y4() {
        final String str = this.f13682n.f19480r;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        duringCreated(bno0.m12174q(str)).subscribe(ffw.e(new e30() { // from class: l.roo0
            public final void call(Object obj) {
                this.f19936a.m15190F4(str, (List) obj);
            }
        }, new e30() { // from class: l.soo0
            public final void call(Object obj) {
                gpo0.m15175f4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z4 */
    public final void m15209Z4(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || "0".equals(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            osi0.f(R.string.Ad);
            return;
        }
        mqv mqvVarM = E2().P2().m(str);
        User userNew_ = User.new_();
        ((DbObject) userNew_).id = str;
        userNew_.pictures = new ArrayList();
        Picture pictureNew_ = Picture.new_();
        ((Media) pictureNew_).url = str2;
        userNew_.pictures.add(pictureNew_);
        userNew_.name = str3;
        mqv mqvVarF = mqv.f(userNew_);
        BLiveVoiceCall bLiveVoiceCallL = E2().P2().l(str);
        if (bLiveVoiceCallL == null) {
            u4n0.d(this, mqvVarF);
        } else if (mqvVarM != null) {
            u4n0.h(this, bLiveVoiceCallL, mqvVarM);
        }
    }

    /* JADX INFO: renamed from: p4 */
    public final void m15210p4(String str, String str2) {
        BLiveVoiceCall bLiveVoiceCallL = E2().P2().l(str2);
        F2().SendGiftEventGroup.sendGift().j(new cfe0.a().v(str, new C0923a(), 1, "sendGiftBindCp", "sendGiftBindCp", BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerLocation.get("sweetCp"), ""), str2, "voice_sweet_bind_cp").A(false).z(bLiveVoiceCallL != null ? mlj.c(new i54(bLiveVoiceCallL.id, bLiveVoiceCallL.userName, bLiveVoiceCallL.userPicture), q44.b(bLiveVoiceCallL.id, "gift-audience-none-voiceLiveMain", bLiveVoiceCallL.position)) : null).t());
    }

    /* JADX INFO: renamed from: q4 */
    public void m15211q4(BLiveVoiceSweetCpRecommendUser bLiveVoiceSweetCpRecommendUser) {
        if (bLiveVoiceSweetCpRecommendUser == null) {
            return;
        }
        String strTb = ypv.m25490k().tb();
        if (TextUtils.isEmpty(strTb)) {
            return;
        }
        m15210p4(strTb, bLiveVoiceSweetCpRecommendUser.userId);
        npo0.m19008f(E2().p() ? "p_anchor_audio_room" : "p_user_audio_room");
    }

    /* JADX INFO: renamed from: r4 */
    public boolean m15212r4() {
        if (((VoiceSweetCpView) ((bwr) this).viewModel).getSelectCpInfo() == null) {
            return true;
        }
        s7m s7mVar = ((bwr) this).viewModel;
        if (((VoiceSweetCpView) s7mVar).f7168s) {
            return true;
        }
        return !((VoiceSweetCpView) s7mVar).getSelectCpInfo().isUnLock;
    }

    /* JADX INFO: renamed from: s4 */
    public void m15213s4() {
        qro0 qro0Var = this.f13682n;
        if (qro0Var != null) {
            qro0Var.p();
        }
    }

    /* JADX INFO: renamed from: t */
    public void m15214t() {
        super/*l.k4t*/.t();
        duringCreated((c) F2().VoiceSweetEvent.showUnbindCpDialog().g()).subscribe(ffw.d(new e30() { // from class: l.joo0
            public final void call(Object obj) {
                this.f15250a.m15161G4((soj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public final void m15215t4(String str, final e30<Pair<List<BLiveVoiceCpHouseInfo>, List<BLiveVoiceSweetLimitHouse>>> e30Var) {
        duringCreated(c.zip(bno0.m12172o(str).onErrorResumeNext(new w9j() { // from class: l.epo0
            public final Object call(Object obj) {
                return c.empty();
            }
        }), bno0.m12174q(str).onErrorResumeNext(new w9j() { // from class: l.fpo0
            public final Object call(Object obj) {
                return c.empty();
            }
        }), new ar50())).subscribe(ffw.e(new e30() { // from class: l.koo0
            public final void call(Object obj) {
                e30Var.call((Pair) obj);
            }
        }, new e30() { // from class: l.loo0
            public final void call(Object obj) {
                gpo0.m15179j4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u4 */
    public boolean m15216u4() {
        qro0 qro0Var = this.f13682n;
        return qro0Var != null && qro0Var.isShowing();
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ void m15217v4(BLiveVoiceCpHouseTaskInfos bLiveVoiceCpHouseTaskInfos) {
        ((VoiceSweetCpView) ((bwr) this).viewModel).m8722G(bLiveVoiceCpHouseTaskInfos);
    }

    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ void m15218w4(BLiveData bLiveData) {
        ((VoiceSweetCpView) ((bwr) this).viewModel).m8723H(bLiveData.cpRecommendUserList);
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ void m15219x4(BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo, soj0 soj0Var) {
        m15191H4(bLiveVoiceCpHouseInfo.houseId, bLiveVoiceCpHouseInfo.otherUserId);
    }

    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ void m15220y4(VoiceSweet.VoiceCpBindMessage voiceCpBindMessage, String str, BLiveData bLiveData) {
        ((VoiceSweetCpView) ((bwr) this).viewModel).m8734y(bLiveData.voiceCpHouseList);
        if (voiceCpBindMessage == null) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            ((VoiceSweetCpView) ((bwr) this).viewModel).m8735z(str);
        } else if (voiceCpBindMessage.getAction() == VoiceSweet.VoiceCpBindAction.agree) {
            ((VoiceSweetCpView) ((bwr) this).viewModel).m8735z(voiceCpBindMessage.getOtherUserId());
        } else if (voiceCpBindMessage.getAction() == VoiceSweet.VoiceCpBindAction.refuse) {
            ((VoiceSweetCpView) ((bwr) this).viewModel).m8735z(null);
        }
    }

    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ void m15221z4(Throwable th) {
        ((VoiceSweetCpView) ((bwr) this).viewModel).m8734y(null);
        ((VoiceSweetCpView) ((bwr) this).viewModel).m8718C(true, true, R.string.J9);
    }
}
