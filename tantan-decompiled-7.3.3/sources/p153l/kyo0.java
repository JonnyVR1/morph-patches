package p153l;

import android.text.TextUtils;
import android.util.Pair;
import com.p051p1.mobile.longlink.msg.liveroom.VoiceSweet;
import com.p051p1.mobile.putong.data.Meta;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveData;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerLocation;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCpHouseInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCpHouseRankAwardInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCpHouseTaskInfos;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceSweetCpRecommendUser;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceSweetCpTask;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceSweetLimitHouse;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.sweet.view.VoiceSweetCpView;
import java.util.ArrayList;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes10.dex */
public class kyo0 extends y8s<rwn0, VoiceSweetCpView> {

    /* JADX INFO: renamed from: j */
    public dum f129332j;

    /* JADX INFO: renamed from: k */
    public lwo0 f129333k;

    /* JADX INFO: renamed from: l */
    public t2p0 f129334l;

    /* JADX INFO: renamed from: m */
    public uyo0 f129335m;

    /* JADX INFO: renamed from: n */
    public u0p0 f129336n;

    /* JADX INFO: renamed from: o */
    public k1p0 f129337o;

    /* JADX INFO: renamed from: l.kyo0$a */
    public class C18306a implements aiv.C15716a.a {
        public C18306a() {
        }

        @Override // p153l.aiv.C15716a.a
        /* JADX INFO: renamed from: c */
        public void mo68351c() {
            kyo0.this.m152098I4();
        }
    }

    public kyo0(dum dumVar, VoiceSweetCpView voiceSweetCpView, k1p0 k1p0Var) {
        super(dumVar);
        this.f129332j = dumVar;
        this.f129337o = k1p0Var;
        mo52715C(voiceSweetCpView);
        this.f129333k = new lwo0(dumVar.f90815a, this);
        this.f129334l = new t2p0(dumVar.f90815a, this);
        this.f129335m = new uyo0(this, act());
        u0p0 u0p0Var = new u0p0(dumVar.f90815a, this);
        this.f129336n = u0p0Var;
        u0p0Var.mo22064i1(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G4 */
    public /* synthetic */ void m152067G4(vxj0 vxj0Var) {
        this.f129334l.m188977N(((VoiceSweetCpView) this.viewModel).getSelectCpInfo());
    }

    /* JADX INFO: renamed from: Z3 */
    public static /* synthetic */ void m152075Z3(Throwable th) {
    }

    /* JADX INFO: renamed from: b4 */
    public static /* synthetic */ void m152077b4(Throwable th) {
    }

    /* JADX INFO: renamed from: c4 */
    public static /* synthetic */ void m152078c4(Throwable th) {
    }

    /* JADX INFO: renamed from: f4 */
    public static /* synthetic */ void m152081f4(Throwable th) {
    }

    /* JADX INFO: renamed from: h4 */
    public static /* synthetic */ void m152083h4(Throwable th) {
    }

    /* JADX INFO: renamed from: j4 */
    public static /* synthetic */ void m152085j4(Throwable th) {
    }

    /* JADX INFO: renamed from: k4 */
    public static /* synthetic */ void m152086k4(Throwable th) {
    }

    /* JADX INFO: renamed from: l4 */
    public static /* synthetic */ void m152087l4(Throwable th) {
    }

    /* JADX INFO: renamed from: A4 */
    public final /* synthetic */ void m152091A4(String str, BLiveVoiceCpHouseRankAwardInfo bLiveVoiceCpHouseRankAwardInfo) {
        this.f129335m.m198687t0(bLiveVoiceCpHouseRankAwardInfo, str);
    }

    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ void m152092B4(boolean z, String str, BLiveEnvelope bLiveEnvelope) {
        Meta meta = bLiveEnvelope.meta;
        if (meta.code != 200) {
            if (TextUtils.isEmpty(meta.message)) {
                return;
            }
            r1j0.m179420g(bLiveEnvelope.meta.message);
        } else {
            if (z) {
                r1j0.m179419f(R$string.f47466Ch);
            }
            m152114Y4();
            m152105P4(null, str);
        }
    }

    /* JADX INFO: renamed from: C4 */
    public final /* synthetic */ void m152093C4(String str, int i, List list) {
        this.f129336n.m193869S(list, new ArrayList(), str, i);
    }

    /* JADX INFO: renamed from: D4 */
    public final /* synthetic */ void m152094D4(String str, int i, Pair pair) {
        this.f129336n.m193869S((List) pair.first, (List) pair.second, str, i);
    }

    /* JADX INFO: renamed from: E4 */
    public final /* synthetic */ void m152095E4(vxj0 vxj0Var) {
        m152105P4(null, null);
    }

    /* JADX INFO: renamed from: F4 */
    public final /* synthetic */ void m152096F4(String str, List list) {
        this.f129336n.m193868R(list, str);
    }

    /* JADX INFO: renamed from: H4 */
    public void m152097H4(String str, String str2) {
        duringCreated(fwo0.m127825r(this.f129332j.f90822h.m202191k(), str, str2)).subscribe(dhw.m115826e(new y20() { // from class: l.qxo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f160068a.m152122v4((BLiveVoiceCpHouseTaskInfos) obj);
            }
        }, new y20() { // from class: l.rxo0
            @Override // p153l.y20
            public final void call(Object obj) {
                kyo0.m152086k4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: I4 */
    public void m152098I4() {
        duringCreated(fwo0.m127820m(this.f129332j.f90822h.m202191k())).subscribe(dhw.m115826e(new y20() { // from class: l.xxo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f196671a.m152123w4((BLiveData) obj);
            }
        }, new y20() { // from class: l.zxo0
            @Override // p153l.y20
            public final void call(Object obj) {
                kyo0.m152083h4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: J4 */
    public void m152099J4(BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo) {
        m152109T4((bLiveVoiceCpHouseInfo == null || !bLiveVoiceCpHouseInfo.isUnLock) ? null : bLiveVoiceCpHouseInfo.otherUserId, 0);
    }

    /* JADX INFO: renamed from: K4 */
    public void m152100K4(BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo, String str) {
        if (bLiveVoiceCpHouseInfo == null) {
            return;
        }
        m152106Q4(bLiveVoiceCpHouseInfo.houseId, str);
    }

    /* JADX INFO: renamed from: L4 */
    public void m152101L4(BLiveVoiceSweetLimitHouse bLiveVoiceSweetLimitHouse, String str) {
        if (bLiveVoiceSweetLimitHouse == null) {
            return;
        }
        m152107R4(!bLiveVoiceSweetLimitHouse.wore, str, bLiveVoiceSweetLimitHouse.f45360id);
    }

    /* JADX INFO: renamed from: M4 */
    public void m152102M4(BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo, String str) {
        if (bLiveVoiceCpHouseInfo == null) {
            return;
        }
        if (TextUtils.isEmpty(str) || "0".equals(str)) {
            o1j0.m165649w(R$string.f47940Z);
        } else {
            m152106Q4(str, bLiveVoiceCpHouseInfo.otherUserId);
        }
    }

    /* JADX INFO: renamed from: N4 */
    public void m152103N4(BLiveVoiceSweetCpTask bLiveVoiceSweetCpTask, final BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo) {
        if (bLiveVoiceSweetCpTask == null || bLiveVoiceCpHouseInfo == null) {
            return;
        }
        String str = bLiveVoiceSweetCpTask.taskType;
        str.getClass();
        switch (str) {
            case "signin":
                fwo0.m127818k(this.f129332j.f90822h.m202191k(), bLiveVoiceCpHouseInfo.houseId, bLiveVoiceCpHouseInfo.otherUserId, bLiveVoiceSweetCpTask.taskType).subscribe(dhw.m115826e(new y20() { // from class: l.yxo0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f201999a.m152124x4(bLiveVoiceCpHouseInfo, (vxj0) obj);
                    }
                }, new y20() { // from class: l.cyo0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        kyo0.m152078c4((Throwable) obj);
                    }
                }));
                if (bLiveVoiceSweetCpTask.taskCpStatus == 0) {
                    ryo0.m183636g();
                    break;
                }
                break;
            case "send_gift":
            case "first_send_gift":
                m152108S4(bLiveVoiceCpHouseInfo);
                break;
        }
    }

    /* JADX INFO: renamed from: O4 */
    public void m152104O4(BLiveVoiceSweetCpRecommendUser bLiveVoiceSweetCpRecommendUser, BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo) {
        if (bLiveVoiceSweetCpRecommendUser == null || bLiveVoiceCpHouseInfo == null) {
            return;
        }
        this.f129333k.m156087T(bLiveVoiceSweetCpRecommendUser, bLiveVoiceCpHouseInfo);
        ryo0.m183631b();
    }

    /* JADX INFO: renamed from: P4 */
    public void m152105P4(final VoiceSweet.VoiceCpBindMessage voiceCpBindMessage, final String str) {
        duringCreated(fwo0.m127820m(this.f129332j.f90822h.m202191k())).subscribe(dhw.m115826e(new y20() { // from class: l.ayo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f73996a.m152125y4(voiceCpBindMessage, str, (BLiveData) obj);
            }
        }, new y20() { // from class: l.byo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f79044a.m152126z4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Q4 */
    public final void m152106Q4(String str, final String str2) {
        duringCreated(fwo0.m127821n(str, str2)).subscribe(dhw.m115826e(new y20() { // from class: l.dyo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f91267a.m152091A4(str2, (BLiveVoiceCpHouseRankAwardInfo) obj);
            }
        }, new y20() { // from class: l.eyo0
            @Override // p153l.y20
            public final void call(Object obj) {
                kyo0.m152075Z3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: R4 */
    public final void m152107R4(final boolean z, final String str, int i) {
        duringCreated(fwo0.m127826s(z, str, i)).subscribe(dhw.m115826e(new y20() { // from class: l.uxo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f181487a.m152092B4(z, str, (BLiveEnvelope) obj);
            }
        }, new r5k()));
    }

    /* JADX INFO: renamed from: S4 */
    public final void m152108S4(BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo) {
        m213811F2().VoiceSweetEvent.dismissSweetCpDialog().m199277p();
        m152115Z4(bLiveVoiceCpHouseInfo.otherUserId, bLiveVoiceCpHouseInfo.cpUserAvatar, bLiveVoiceCpHouseInfo.otherUserName);
    }

    /* JADX INFO: renamed from: T4 */
    public void m152109T4(final String str, final int i) {
        if (TextUtils.isEmpty(str)) {
            duringCreated(fwo0.m127822o(str)).subscribe(dhw.m115826e(new y20() { // from class: l.fyo0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f101410a.m152093C4(str, i, (List) obj);
                }
            }, new y20() { // from class: l.gyo0
                @Override // p153l.y20
                public final void call(Object obj) {
                    kyo0.m152077b4((Throwable) obj);
                }
            }));
        } else {
            m152120t4(str, new y20() { // from class: l.hyo0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f112146a.m152094D4(str, i, (Pair) obj);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U4 */
    public void m152110U4(String str) {
        if (TextUtils.isEmpty(str) || "0".equals(str)) {
            return;
        }
        ydn0.m215258k(this, ((rwn0) m213810E2()).m168532l0().f56859id, str);
    }

    /* JADX INFO: renamed from: V4 */
    public void m152111V4() {
        k1p0 k1p0Var = this.f129337o;
        if (k1p0Var != null) {
            k1p0Var.m147921t4();
        }
    }

    /* JADX INFO: renamed from: W4 */
    public void m152112W4() {
        k1p0 k1p0Var = this.f129337o;
        if (k1p0Var != null) {
            k1p0Var.m147922u4();
        }
    }

    /* JADX INFO: renamed from: X4 */
    public void m152113X4(BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo) {
        fwo0.m127828u(this.f129332j.f90822h.m202191k(), bLiveVoiceCpHouseInfo.otherUserId).subscribe(dhw.m115826e(new y20() { // from class: l.sxo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f171153a.m152095E4((vxj0) obj);
            }
        }, new y20() { // from class: l.txo0
            @Override // p153l.y20
            public final void call(Object obj) {
                kyo0.m152087l4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y4 */
    public void m152114Y4() {
        final String str = this.f129336n.f176928r;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        duringCreated(fwo0.m127824q(str)).subscribe(dhw.m115826e(new y20() { // from class: l.vxo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f186287a.m152096F4(str, (List) obj);
            }
        }, new y20() { // from class: l.wxo0
            @Override // p153l.y20
            public final void call(Object obj) {
                kyo0.m152081f4((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z4 */
    public final void m152115Z4(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || "0".equals(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            r1j0.m179419f(R$string.f47418Ad);
            return;
        }
        nsv<h64> nsvVarM136874m = ((rwn0) m213810E2()).m183411P2().m136874m(str);
        User userNew_ = User.new_();
        userNew_.f56859id = str;
        userNew_.pictures = new ArrayList();
        Picture pictureNew_ = Picture.new_();
        pictureNew_.url = str2;
        userNew_.pictures.add(pictureNew_);
        userNew_.name = str3;
        nsv nsvVarM164636f = nsv.m164636f(userNew_);
        BLiveVoiceCall bLiveVoiceCallM136873l = ((rwn0) m213810E2()).m183411P2().m136873l(str);
        if (bLiveVoiceCallM136873l == null) {
            ydn0.m215251d(this, nsvVarM164636f);
        } else if (nsvVarM136874m != null) {
            ydn0.m215255h(this, bLiveVoiceCallM136873l, nsvVarM136874m);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p4 */
    public final void m152116p4(String str, String str2) {
        BLiveVoiceCall bLiveVoiceCallM136873l = ((rwn0) m213810E2()).m183411P2().m136873l(str2);
        m213811F2().SendGiftEventGroup.sendGift().mo199273j(new hne0.C17513a().m136085v(str, new C18306a(), 1, "sendGiftBindCp", "sendGiftBindCp", BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerLocation.get("sweetCp"), ""), str2, "voice_sweet_bind_cp").m136079A(false).m136089z(bLiveVoiceCallM136873l != null ? coj.m111661c(new h64(bLiveVoiceCallM136873l.f45333id, bLiveVoiceCallM136873l.userName, bLiveVoiceCallM136873l.userPicture), p54.m170592b(bLiveVoiceCallM136873l.f45333id, "gift-audience-none-voiceLiveMain", bLiveVoiceCallM136873l.position)) : null).m136083t());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q4 */
    public void m152117q4(BLiveVoiceSweetCpRecommendUser bLiveVoiceSweetCpRecommendUser) {
        if (bLiveVoiceSweetCpRecommendUser == null) {
            return;
        }
        String strM203741tb = zrv.m221193k().m203741tb();
        if (TextUtils.isEmpty(strM203741tb)) {
            return;
        }
        m152116p4(strM203741tb, bLiveVoiceSweetCpRecommendUser.userId);
        ryo0.m183635f(((rwn0) m213810E2()).mo118373p() ? "p_anchor_audio_room" : "p_user_audio_room");
    }

    /* JADX INFO: renamed from: r4 */
    public boolean m152118r4() {
        if (((VoiceSweetCpView) this.viewModel).getSelectCpInfo() == null) {
            return true;
        }
        V v2 = this.viewModel;
        if (((VoiceSweetCpView) v2).f54410s) {
            return true;
        }
        return !((VoiceSweetCpView) v2).getSelectCpInfo().isUnLock;
    }

    /* JADX INFO: renamed from: s4 */
    public void m152119s4() {
        u0p0 u0p0Var = this.f129336n;
        if (u0p0Var != null) {
            u0p0Var.mo73021p();
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().VoiceSweetEvent.showUnbindCpDialog().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.nxo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f144200a.m152067G4((vxj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public final void m152120t4(String str, final y20<Pair<List<BLiveVoiceCpHouseInfo>, List<BLiveVoiceSweetLimitHouse>>> y20Var) {
        duringCreated(C22421c.zip(fwo0.m127822o(str).onErrorResumeNext(new qcj() { // from class: l.iyo0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C22421c.empty();
            }
        }), fwo0.m127824q(str).onErrorResumeNext(new qcj() { // from class: l.jyo0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C22421c.empty();
            }
        }), new gz50())).subscribe(dhw.m115826e(new y20() { // from class: l.oxo0
            @Override // p153l.y20
            public final void call(Object obj) {
                y20Var.call((Pair) obj);
            }
        }, new y20() { // from class: l.pxo0
            @Override // p153l.y20
            public final void call(Object obj) {
                kyo0.m152085j4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u4 */
    public boolean m152121u4() {
        u0p0 u0p0Var = this.f129336n;
        return u0p0Var != null && u0p0Var.isShowing();
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ void m152122v4(BLiveVoiceCpHouseTaskInfos bLiveVoiceCpHouseTaskInfos) {
        ((VoiceSweetCpView) this.viewModel).m79695G(bLiveVoiceCpHouseTaskInfos);
    }

    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ void m152123w4(BLiveData bLiveData) {
        ((VoiceSweetCpView) this.viewModel).m79696H(bLiveData.cpRecommendUserList);
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ void m152124x4(BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo, vxj0 vxj0Var) {
        m152097H4(bLiveVoiceCpHouseInfo.houseId, bLiveVoiceCpHouseInfo.otherUserId);
    }

    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ void m152125y4(VoiceSweet.VoiceCpBindMessage voiceCpBindMessage, String str, BLiveData bLiveData) {
        ((VoiceSweetCpView) this.viewModel).m79706y(bLiveData.voiceCpHouseList);
        if (voiceCpBindMessage == null) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            ((VoiceSweetCpView) this.viewModel).m79707z(str);
        } else if (voiceCpBindMessage.getAction() == VoiceSweet.VoiceCpBindAction.agree) {
            ((VoiceSweetCpView) this.viewModel).m79707z(voiceCpBindMessage.getOtherUserId());
        } else if (voiceCpBindMessage.getAction() == VoiceSweet.VoiceCpBindAction.refuse) {
            ((VoiceSweetCpView) this.viewModel).m79707z(null);
        }
    }

    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ void m152126z4(Throwable th) {
        ((VoiceSweetCpView) this.viewModel).m79706y(null);
        ((VoiceSweetCpView) this.viewModel).m79692C(true, true, R$string.f47612J9);
    }
}
