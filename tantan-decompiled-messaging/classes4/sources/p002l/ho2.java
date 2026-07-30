package p002l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p000p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.longlink.msg.live.leaderboard.LongLinkLeaderboard;
import com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage;
import com.p1.mobile.longlink.msg.livedistribution.LongLinkReportMsg;
import com.p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage;
import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.data.Followship;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p1.mobile.putong.live.base.bean.LivingUsers;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.base.data.BLiveAbsRoom;
import com.p1.mobile.putong.live.base.data.BLiveAddStickerResult;
import com.p1.mobile.putong.live.base.data.BLiveAtUserInfo;
import com.p1.mobile.putong.live.base.data.BLiveChatMessage;
import com.p1.mobile.putong.live.base.data.BLiveChatTip;
import com.p1.mobile.putong.live.base.data.BLiveCoin;
import com.p1.mobile.putong.live.base.data.BLiveData;
import com.p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p1.mobile.putong.live.base.data.BLiveGiftBubbleConfig;
import com.p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p1.mobile.putong.live.base.data.BLiveHourLeaderBoard;
import com.p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import com.p1.mobile.putong.live.base.data.BLiveMember;
import com.p1.mobile.putong.live.base.data.BLiveOperation;
import com.p1.mobile.putong.live.base.data.BLivePacketSystemCommentStatus;
import com.p1.mobile.putong.live.base.data.BLiveRoomTabGifts;
import com.p1.mobile.putong.live.base.data.BLiveSendMessageData;
import com.p1.mobile.putong.live.base.data.BLiveSendMessageExtra;
import com.p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p1.mobile.putong.live.livingroom.util.pref.LiveWatchCounter;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import l.cll;
import l.d30;
import l.e30;
import l.ffw;
import l.fld0;
import l.ggv;
import l.h4g;
import l.idv;
import l.jo0;
import l.lsi0;
import l.mt0;
import l.njn0;
import l.nnn0;
import l.r8d0;
import l.roj0;
import l.sgj;
import l.ti1;
import l.upv;
import l.vpv;
import l.vwb;
import l.w9j;
import l.wq2;
import l.x4s;
import l.ypv;
import l.ytr;
import org.jetbrains.annotations.Nullable;
import rx.c;
import rx.schedulers.Schedulers;
import rx.subjects.a;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class ho2 extends lh20 {

    /* JADX INFO: renamed from: A */
    public far f12140A;

    /* JADX INFO: renamed from: B */
    public j6g f12141B;

    /* JADX INFO: renamed from: C */
    public final n0w f12142C;

    /* JADX INFO: renamed from: D */
    public final boolean f12143D;

    /* JADX INFO: renamed from: E */
    public jxl f12144E;

    /* JADX INFO: renamed from: F */
    public boolean f12145F;

    /* JADX INFO: renamed from: G */
    public BLiveUserMask f12146G;

    /* JADX INFO: renamed from: d */
    public final zgt f12147d;

    /* JADX INFO: renamed from: e */
    public final a<hvj> f12148e;

    /* JADX INFO: renamed from: f */
    public final a<hvj> f12149f;

    /* JADX INFO: renamed from: g */
    public final a<Long> f12150g;

    /* JADX INFO: renamed from: h */
    public a<LivingUsers<BLiveMember>> f12151h;

    /* JADX INFO: renamed from: i */
    public a<far> f12152i;

    /* JADX INFO: renamed from: j */
    public a<List<BLiveChatTip>> f12153j;

    /* JADX INFO: renamed from: k */
    public final a<BLiveAddStickerResult> f12154k;

    /* JADX INFO: renamed from: l */
    public final b<BLiveHourLeaderBoardItem> f12155l;

    /* JADX INFO: renamed from: m */
    public final b<BLiveHourLeaderBoard> f12156m;

    /* JADX INFO: renamed from: n */
    public final a<BLiveData> f12157n;

    /* JADX INFO: renamed from: o */
    public final a<h4g> f12158o;

    /* JADX INFO: renamed from: p */
    public ic2<LiveControlMessage, String> f12159p;

    /* JADX INFO: renamed from: q */
    public a<njn0> f12160q;

    /* JADX INFO: renamed from: r */
    public b<BLivePacketSystemCommentStatus> f12161r;

    /* JADX INFO: renamed from: s */
    public final Map<String, Long> f12162s;

    /* JADX INFO: renamed from: t */
    public BLiveOperation f12163t;

    /* JADX INFO: renamed from: u */
    public int f12164u;

    /* JADX INFO: renamed from: v */
    public BLiveAbsData f12165v;

    /* JADX INFO: renamed from: w */
    public boolean f12166w;

    /* JADX INFO: renamed from: x */
    public final tbu f12167x;

    /* JADX INFO: renamed from: y */
    public r8d0 f12168y;

    /* JADX INFO: renamed from: z */
    public rzv f12169z;

    public ho2(xml<? extends BLiveAbsData, ? extends BLiveAbsRoom> xmlVar, zgt zgtVar) {
        super(xmlVar);
        this.f12148e = a.b();
        this.f12149f = a.b();
        this.f12150g = a.b();
        this.f12151h = a.b();
        this.f12152i = a.b();
        this.f12153j = a.b();
        this.f12154k = a.b();
        this.f12155l = b.b();
        this.f12156m = b.b();
        this.f12157n = a.b();
        this.f12158o = a.b();
        this.f12160q = a.b();
        this.f12161r = b.b();
        this.f12162s = new HashMap();
        this.f12166w = true;
        this.f12141B = new j6g(this);
        this.f12142C = new n0w(this);
        this.f12146G = null;
        this.f12167x = new tbu(this);
        m14553b0();
        this.f12143D = ypv.k().P6();
        this.f12147d = zgtVar;
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m14472B(Throwable th) {
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m14473C(Throwable th) {
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ hvj m14477G(hvj hvjVar) {
        ((ggv) ypv.l(fld0.c)).F(hvjVar);
        return hvjVar;
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m14483M(e30 e30Var, List list) {
        if (e30Var != null) {
            e30Var.call(list);
        }
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m14486P(Throwable th) {
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m14487Q(d30 d30Var, boolean z, Throwable th) {
        if (d30Var != null) {
            d30Var.call();
        }
        if (!z && (th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).isFollowForbidden()) {
            lsi0.w(R$string.f2642C);
        }
    }

    /* JADX INFO: renamed from: A0 */
    public abstract String mo14489A0();

    /* JADX INFO: renamed from: A1 */
    public void m14490A1(final evj evjVar, @Nullable final e30<List<rwj>> e30Var) {
        zfv.m27265f1(evjVar, m17234j()).map(new w9j() { // from class: l.ao2
            public final Object call(Object obj) {
                return this.f7771a.m14559d1(evjVar, (BLiveRoomTabGifts) obj);
            }
        }).observeOn(Schedulers.io()).map(new w9j() { // from class: l.bo2
            public final Object call(Object obj) {
                return ho2.m14477G((hvj) obj);
            }
        }).observeOn(jo0.a()).map(new w9j() { // from class: l.co2
            public final Object call(Object obj) {
                return this.f8767a.m14562e1(evjVar, (hvj) obj);
            }
        }).subscribe(ffw.h(new e30() { // from class: l.do2
            public final void call(Object obj) {
                ho2.m14483M(e30Var, (List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: B0 */
    public c<Boolean> m14491B0() {
        return this.f12169z.m22168k();
    }

    /* JADX INFO: renamed from: B1 */
    public final void m14492B1(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        this.f12169z.m22172r().b0(bLiveHourLeaderBoardItem);
    }

    /* JADX INFO: renamed from: C0 */
    public abstract String mo14493C0();

    /* JADX INFO: renamed from: C1 */
    public void m14494C1(Long l2) {
        ((ggv) ypv.l(fld0.c)).C(l2);
    }

    /* JADX INFO: renamed from: D0 */
    public String m14495D0() {
        return m14505I0().m27368d();
    }

    /* JADX INFO: renamed from: D1 */
    public final void m14496D1(List<BLiveHourLeaderBoardItem> list) {
        this.f12169z.m22172r().e0(list);
    }

    /* JADX INFO: renamed from: E0 */
    public c<BLivePacketSystemCommentStatus> m14497E0() {
        return this.f12161r.asObservable();
    }

    /* JADX INFO: renamed from: E1 */
    public void m14498E1(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        this.f12169z.m22172r().f0(bLiveGivenGiftBrief);
    }

    /* JADX INFO: renamed from: F0 */
    public int mo14499F0() {
        return ((ArrayList) this.f12169z.m22171n().e()).contains(ypv.a.D0()) ? 2 : 100;
    }

    /* JADX INFO: renamed from: F1 */
    public void m14500F1(BLiveOperation bLiveOperation) {
        this.f12163t = bLiveOperation;
        m14502G1(bLiveOperation);
    }

    /* JADX INFO: renamed from: G0 */
    public ArrayList<String> m14501G0() {
        return (ArrayList) this.f12169z.m22171n().e();
    }

    /* JADX INFO: renamed from: G1 */
    public void m14502G1(BLiveOperation bLiveOperation) {
        m14596q1().g0(st50.m22677C(bLiveOperation, this.f12169z.f18734c));
    }

    /* JADX INFO: renamed from: H0 */
    public jxl m14503H0() {
        return this.f12144E;
    }

    /* JADX INFO: renamed from: H1 */
    public void m14504H1(LongLinkSocketMessage.OperationUpdateNotice operationUpdateNotice) {
        this.f12169z.m22172r().K.onNext(operationUpdateNotice);
    }

    /* JADX INFO: renamed from: I0 */
    public zgt.C0943a m14505I0() {
        return this.f12147d.m27348h();
    }

    /* JADX INFO: renamed from: I1 */
    public void m14506I1(LongLinkMedalMessage.TurboCardReceiveEvent turboCardReceiveEvent) {
        this.f12169z.m22172r().h0(turboCardReceiveEvent);
    }

    /* JADX INFO: renamed from: J0 */
    public BLiveAddStickerResult m14507J0() {
        return (BLiveAddStickerResult) this.f12154k.e();
    }

    /* JADX INFO: renamed from: J1 */
    public c<BLiveCoin> m14508J1() {
        return zfv.m27280k1();
    }

    /* JADX INFO: renamed from: K0 */
    public c<BLiveAddStickerResult> m14509K0() {
        return this.f12154k.asObservable();
    }

    /* JADX INFO: renamed from: K1 */
    public abstract void mo14510K1(String str);

    /* JADX INFO: renamed from: L0 */
    public c<LongLinkLiveMessage.LiveStickerChangeMsg> m14511L0() {
        return this.f12169z.m22172r().A.asObservable().filter(new w9j() { // from class: l.zn2
            public final Object call(Object obj) {
                return this.f23513a.m14554b1((LongLinkLiveMessage.LiveStickerChangeMsg) obj);
            }
        }).onBackpressureLatest().observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: L1 */
    public void m14512L1() {
        cll.a aVarC = cll.l(ytr.b("/chat-tips")).p().c("anchorId", m17234j().anchor.id);
        if (!LiveWatchCounter.h().m()) {
            aVarC.c("source", "firstEntry");
        }
        upv.w(aVarC.d(), "chatTip").subscribe(ffw.e(new e30() { // from class: l.wn2
            public final void call(Object obj) {
                this.f21875a.m14564f1((BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.xn2
            public final void call(Object obj) {
                ho2.m14486P((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: M0 */
    public String m14513M0() {
        return this.f12147d.m27351k();
    }

    /* JADX INFO: renamed from: M1 */
    public void m14514M1(String str, String str2) {
        LivingNormalApiProvider.m4841h7(str, str2).subscribe(ffw.e(new e30() { // from class: l.pn2
            public final void call(Object obj) {
                this.f17541a.m14567g1((BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.yn2
            public final void call(Object obj) {
                ho2.m14472B((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N0 */
    public c<njn0> m14515N0() {
        return this.f12160q;
    }

    /* JADX INFO: renamed from: N1 */
    public abstract void mo14516N1(String str);

    /* JADX INFO: renamed from: O0 */
    public String m14517O0() {
        return "";
    }

    /* JADX INFO: renamed from: O1 */
    public abstract void mo14518O1(boolean z, String str, String str2);

    /* JADX INFO: renamed from: P0 */
    public c<hvj> m14519P0() {
        return this.f12148e;
    }

    /* JADX INFO: renamed from: P1 */
    public void m14520P1() {
        upv.w("voice-live".equals(mo14489A0()) ? LiveApiBuilder.u(ytr.b("/live_revenue_campaign"), new mt0[]{mt0.a("liveType", "voiceLive")}) : cll.l(ytr.b("/live_revenue_campaign")), "getFirstRechargeData").subscribe(ffw.e(new e30() { // from class: l.qn2
            public final void call(Object obj) {
                this.f18097a.m14570h1((BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.rn2
            public final void call(Object obj) {
                this.f18612a.m14574i1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Q0 */
    public c<Long> m14521Q0() {
        return this.f12150g;
    }

    /* JADX INFO: renamed from: Q1 */
    public void m14522Q1(String str, String str2) {
        q9o.m21144j(str, str2).subscribe(ffw.e(new e30() { // from class: l.sn2
            public final void call(Object obj) {
                this.f19132a.m14577j1((BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.tn2
            public final void call(Object obj) {
                ho2.m14473C((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: R */
    public void m14523R(User user) {
        if (user == null) {
            return;
        }
        this.f12169z.m22166i().onNext(user);
        ((idv) ypv.l(fld0.b)).a(user);
    }

    /* JADX INFO: renamed from: R0 */
    public boolean m14524R0() {
        if (User.isMatched((User) this.f12169z.m22166i().e())) {
            return true;
        }
        if (this.f12169z.m22169l().e() != null) {
            return TEnum.equals(((Followship) this.f12169z.m22169l().e()).state, "following") || TEnum.equals(((Followship) this.f12169z.m22169l().e()).state, "matched");
        }
        return false;
    }

    /* JADX INFO: renamed from: R1 */
    public void m14525R1() {
        this.f12152i.onNext(new far());
        this.f12140A = null;
    }

    /* JADX INFO: renamed from: S */
    public void m14526S(r8d0 r8d0Var) {
        this.f12168y = r8d0Var;
        m14523R(((wq2) r8d0Var).a);
        m14532U(((wq2) r8d0Var).d);
        m17232g(((wq2) r8d0Var).c);
        mo14572i(((wq2) r8d0Var).b);
        m14541X(r8d0Var.e);
        m14529T(r8d0Var.a());
    }

    /* JADX INFO: renamed from: S0 */
    public boolean m14527S0(String str) {
        if (str.equals(((DbObject) m14582l0()).id)) {
            return false;
        }
        return mo14499F0() == 1 || (mo14499F0() == 2 && !m14501G0().contains(str));
    }

    /* JADX INFO: renamed from: S1 */
    public void m14528S1() {
        this.f12160q.onNext(new njn0());
    }

    /* JADX INFO: renamed from: T */
    public final void m14529T(h4g h4gVar) {
        this.f12158o.onNext(h4gVar);
    }

    /* JADX INFO: renamed from: T0 */
    public void m14530T0() {
        this.f12142C.m18359j(false);
    }

    /* JADX INFO: renamed from: T1 */
    public c<ArrayList<String>> m14531T1() {
        return this.f12169z.m22171n();
    }

    /* JADX INFO: renamed from: U */
    public void m14532U(Followship followship) {
        if (followship == null) {
            return;
        }
        this.f12169z.m22169l().onNext(followship);
    }

    /* JADX INFO: renamed from: U0 */
    public void m14533U0() {
        this.f12142C.m18359j(true);
    }

    /* JADX INFO: renamed from: U1 */
    public c<roj0> m14534U1(String str, int i, String str2, String str3, @Nullable sy4.C0832a c0832a) {
        BLiveSendMessageData bLiveSendMessageData = new BLiveSendMessageData();
        bLiveSendMessageData.type = i;
        if (i == 0) {
            str3 = m17239o();
        }
        bLiveSendMessageData.roomId = str3;
        bLiveSendMessageData.anchorId = m14582l0() == null ? "" : ((DbObject) m14582l0()).id;
        bLiveSendMessageData.userId = ypv.a.D0();
        bLiveSendMessageData.value = str;
        bLiveSendMessageData.roomType = str2;
        bLiveSendMessageData.liveId = m17235k();
        bLiveSendMessageData.liveMode = m17234j().liveMode;
        bLiveSendMessageData.templateType = m17234j().isVoiceLive() ? "profit" : "";
        if (c0832a != null) {
            BLiveSendMessageExtra bLiveSendMessageExtraNew_ = BLiveSendMessageExtra.new_();
            if (!TextUtils.isEmpty(c0832a.m22760b())) {
                bLiveSendMessageExtraNew_.groupType = c0832a.m22760b();
            }
            if (!TextUtils.isEmpty(c0832a.f19334b) && !TextUtils.isEmpty(c0832a.f19335c)) {
                BLiveAtUserInfo bLiveAtUserInfoNew_ = BLiveAtUserInfo.new_();
                bLiveAtUserInfoNew_.userId = c0832a.f19334b;
                bLiveAtUserInfoNew_.userName = c0832a.f19335c;
                bLiveSendMessageExtraNew_.atUserInfos = vwb.f0(new BLiveAtUserInfo[]{bLiveAtUserInfoNew_});
            }
            bLiveSendMessageData.extInfo = bLiveSendMessageExtraNew_;
        }
        return LivingNormalApiProvider.m4589F7(bLiveSendMessageData).map(new w9j() { // from class: l.go2
            public final Object call(Object obj) {
                return this.f11558a.m14583l1((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: V */
    public void m14535V(BLiveAbsData bLiveAbsData) {
        m14538W(bLiveAbsData, 0);
    }

    /* JADX INFO: renamed from: V0 */
    public boolean m14536V0() {
        User userM14582l0 = m14582l0();
        h4g h4gVarM14597r0 = m14597r0();
        return (userM14582l0 == null || h4gVarM14597r0 == null || h4gVarM14597r0.b() == null || !this.f12143D) ? false : true;
    }

    /* JADX INFO: renamed from: V1 */
    public c<roj0> m14537V1(String str, @Nullable sy4.C0832a c0832a) {
        return m14534U1(str, 0, "voiceRoom".equals(mo14493C0()) ? "voice" : "video", "", c0832a);
    }

    /* JADX INFO: renamed from: W */
    public void m14538W(BLiveAbsData bLiveAbsData, int i) {
        if (bLiveAbsData == null) {
            return;
        }
        if (TEnum.equals(bLiveAbsData.state, "onlive")) {
            mo17233h(new i0t(i));
        } else if (TEnum.equals(bLiveAbsData.state, "stopped")) {
            mo17233h(u7s.f20528e);
        } else if (TEnum.equals(bLiveAbsData.state, "suspended")) {
            mo17233h(pau.f17177b);
        }
    }

    /* JADX INFO: renamed from: W0 */
    public boolean m14539W0() {
        return false;
    }

    /* JADX INFO: renamed from: W1 */
    public void m14540W1(if2 if2Var) {
        this.f12169z.m22172r().c0(if2Var);
    }

    /* JADX INFO: renamed from: X */
    public void m14541X(BLiveAddStickerResult bLiveAddStickerResult) {
        if (bLiveAddStickerResult == null) {
            return;
        }
        this.f12154k.onNext(bLiveAddStickerResult);
    }

    /* JADX INFO: renamed from: X0 */
    public boolean m14542X0() {
        return m17237m().m15302e();
    }

    /* JADX INFO: renamed from: X1 */
    public void m14543X1(BLiveUserMask bLiveUserMask) {
        this.f12146G = bLiveUserMask;
    }

    /* JADX INFO: renamed from: Y */
    public pul<LiveMessage> m14544Y() {
        return this.f12169z.f18740i;
    }

    /* JADX INFO: renamed from: Y0 */
    public boolean m14545Y0() {
        return this.f12145F;
    }

    /* JADX INFO: renamed from: Y1 */
    public void m14546Y1(BLiveAbsData bLiveAbsData) {
        rzv rzvVar = this.f12169z;
        if (rzvVar != null) {
            rzvVar.m22180z(bLiveAbsData);
        }
    }

    /* JADX INFO: renamed from: Z */
    public c<List<BLiveChatTip>> m14547Z() {
        return this.f12153j.asObservable();
    }

    /* JADX INFO: renamed from: Z0 */
    public boolean m14548Z0() {
        return this instanceof nnn0;
    }

    /* JADX INFO: renamed from: Z1 */
    public void m14549Z1(jxl jxlVar) {
        this.f12144E = jxlVar;
    }

    /* JADX INFO: renamed from: a0 */
    public void m14550a0(BLiveAbsData bLiveAbsData) {
        if (m17234j() == null || bLiveAbsData == null || !TextUtils.equals(m17235k(), bLiveAbsData.id)) {
            this.f12166w = true;
        }
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m14551a1(d30 d30Var, Followship followship) {
        m14532U(followship);
        if (ypv.a.H()) {
            sgj.d();
        }
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: a2 */
    public void m14552a2(String str) {
        this.f12147d.m27363w(str);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m14553b0() {
        this.f12169z = new rzv(this.f12142C);
    }

    /* JADX INFO: renamed from: b1 */
    public final /* synthetic */ Boolean m14554b1(LongLinkLiveMessage.LiveStickerChangeMsg liveStickerChangeMsg) {
        Long l2 = this.f12162s.get(liveStickerChangeMsg.getRoomId());
        if (l2 != null && liveStickerChangeMsg.getTimestamp() <= l2.longValue()) {
            return Boolean.FALSE;
        }
        this.f12162s.put(liveStickerChangeMsg.getRoomId(), Long.valueOf(liveStickerChangeMsg.getTimestamp()));
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: b2 */
    public void m14555b2(boolean z) {
        this.f12145F = z;
    }

    /* JADX INFO: renamed from: c0 */
    public void mo9891c0(boolean z) {
        this.f12153j.onNext((Object) null);
        this.f12166w = !z;
        this.f12167x.m22844j();
        m14525R1();
        m14528S1();
        this.f12169z.f18740i.m20688e();
        this.f12159p = null;
        if (z) {
            return;
        }
        this.f12169z.m22179y(a.b());
        this.f14865a.mo19684a();
        this.f12168y = null;
        if (ypv.m()) {
            ((idv) ypv.l(fld0.b)).b();
        }
    }

    /* JADX INFO: renamed from: c1 */
    public final /* synthetic */ void m14556c1(BLiveEnvelope bLiveEnvelope) {
        BLiveHourLeaderBoard bLiveHourLeaderBoard = bLiveEnvelope.data.hourLeaderboard;
        if (bLiveHourLeaderBoard == null) {
            return;
        }
        this.f12156m.onNext(bLiveHourLeaderBoard);
        m14496D1(bLiveHourLeaderBoard.allLeaderboards);
        List list = bLiveHourLeaderBoard.currentRoomLeaderboards;
        if ((!vwb.J(list)) && (list.size() > 0)) {
            BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem = (BLiveHourLeaderBoardItem) list.get(0);
            bLiveHourLeaderBoardItem.isOpen = bLiveHourLeaderBoard.isOpen;
            bLiveHourLeaderBoardItem.currentHourSuggestConfig = bLiveHourLeaderBoard.currentHourSuggestConfig;
            m14492B1(bLiveHourLeaderBoardItem);
            this.f12155l.onNext(bLiveHourLeaderBoardItem);
        }
    }

    /* JADX INFO: renamed from: c2 */
    public void m14557c2() {
        this.f12167x.m22850p();
        this.f12145F = false;
    }

    /* JADX INFO: renamed from: d0 */
    public void m14558d0(boolean z, String str, String str2) {
        m14561e0(z, str, str2, null);
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ hvj m14559d1(evj evjVar, BLiveRoomTabGifts bLiveRoomTabGifts) {
        this.f12150g.onNext(Long.valueOf(bLiveRoomTabGifts.latestBagGiftUpdateTime));
        this.f12161r.onNext(bLiveRoomTabGifts.bagSystemCommentStatus);
        return mmj.m18070o(bLiveRoomTabGifts, evjVar);
    }

    /* JADX INFO: renamed from: d2 */
    public far m14560d2() {
        return this.f12140A;
    }

    /* JADX INFO: renamed from: e0 */
    public void m14561e0(boolean z, String str, String str2, d30 d30Var) {
        m14563f0(z, str, str2, d30Var, null);
    }

    /* JADX INFO: renamed from: e1 */
    public final /* synthetic */ List m14562e1(evj evjVar, hvj hvjVar) {
        this.f12148e.onNext(hvjVar);
        if (evjVar.m12711f()) {
            this.f12149f.onNext(hvjVar);
        }
        if (evjVar.m12710e() != null) {
            evjVar.m12710e().call();
        }
        return hvjVar.m14840e().m16344f();
    }

    /* JADX INFO: renamed from: e2 */
    public void mo9892e2(boolean z, BLiveAbsData bLiveAbsData) {
        ho2 ho2Var;
        boolean z2;
        BLiveAbsData bLiveAbsData2 = this.f12165v;
        if (bLiveAbsData2 == null || !TextUtils.equals(bLiveAbsData.id, bLiveAbsData2.id)) {
            BLiveAbsData bLiveAbsData3 = this.f12165v;
            boolean z3 = bLiveAbsData3 != null && TextUtils.equals(bLiveAbsData.room.id, bLiveAbsData3.room.id);
            this.f12165v = bLiveAbsData;
            if (bLiveAbsData == null || !x4s.b(bLiveAbsData.liveMode)) {
                ho2Var = this;
                z2 = z;
                ho2Var.m14565f2(z2, bLiveAbsData.room.id, z3, ho2Var.m17247x(), bLiveAbsData.id, ho2Var.mo14591o0());
            } else if (this.f12169z.f18732a) {
                ho2Var = this;
                z2 = z;
            } else {
                ho2Var = this;
                z2 = z;
                ho2Var.m14565f2(z2, bLiveAbsData.room.id, z3, m17247x(), bLiveAbsData.id, mo14591o0());
            }
            if (z3) {
                return;
            }
            ho2Var.mo14518O1(z2, bLiveAbsData.id, bLiveAbsData.room.id);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public void m14563f0(final boolean z, String str, String str2, final d30 d30Var, final d30 d30Var2) {
        if (m14582l0() == null) {
            return;
        }
        vpv vpvVar = ypv.a;
        vpvVar.d(vpvVar.D0(), m14582l0(), true, m14599s0(), m17235k(), m17239o(), str, str2).subscribe(ffw.e(new e30() { // from class: l.eo2
            public final void call(Object obj) {
                this.f9888a.m14551a1(d30Var, (Followship) obj);
            }
        }, new e30() { // from class: l.fo2
            public final void call(Object obj) {
                ho2.m14487Q(d30Var2, z, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f1 */
    public final /* synthetic */ void m14564f1(BLiveEnvelope bLiveEnvelope) {
        this.f12153j.onNext(bLiveEnvelope.data.chatTips);
    }

    /* JADX INFO: renamed from: f2 */
    public void m14565f2(boolean z, String str, boolean z2, String str2, String str3, String str4) {
        this.f12169z.m22164A(z, str, z2, str2, str3, str4);
    }

    /* JADX INFO: renamed from: g0 */
    public c<BLiveHourLeaderBoard> m14566g0() {
        return this.f12156m.onBackpressureLatest().observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: g1 */
    public final /* synthetic */ void m14567g1(BLiveEnvelope bLiveEnvelope) {
        far farVar = new far(bLiveEnvelope, false);
        this.f12152i.onNext(farVar);
        if (this.f12140A == null) {
            this.f12140A = farVar;
        }
    }

    /* JADX INFO: renamed from: g2 */
    public void m14568g2(BLiveAbsData bLiveAbsData) {
        this.f12165v = null;
        rzv rzvVar = this.f12169z;
        if (rzvVar.f18732a) {
            rzvVar.m22165C();
        }
    }

    /* JADX INFO: renamed from: h0 */
    public c<User> m14569h0() {
        return this.f12169z.m22166i().asObservable();
    }

    /* JADX INFO: renamed from: h1 */
    public final /* synthetic */ void m14570h1(BLiveEnvelope bLiveEnvelope) {
        this.f12157n.onNext(bLiveEnvelope.data);
    }

    /* JADX INFO: renamed from: h2 */
    public c<Long> m14571h2(int i, TimeUnit timeUnit) {
        return this.f12167x.m22851q(i, timeUnit);
    }

    @Override // p002l.lh20
    /* JADX INFO: renamed from: i */
    public void mo14572i(BLiveAbsRoom bLiveAbsRoom) {
        super.mo14572i(bLiveAbsRoom);
        mo14510K1(bLiveAbsRoom.id);
    }

    /* JADX INFO: renamed from: i0 */
    public c<BLiveHourLeaderBoardItem> m14573i0() {
        return this.f12155l.onBackpressureLatest().observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: i1 */
    public final /* synthetic */ void m14574i1(Throwable th) {
        this.f12157n.onNext((Object) null);
    }

    /* JADX INFO: renamed from: i2 */
    public c<Long> m14575i2(TimeUnit timeUnit) {
        return this.f12167x.m22851q(1, timeUnit);
    }

    /* JADX INFO: renamed from: j0 */
    public String m14576j0() {
        User user = (User) this.f12169z.m22166i().e();
        return user != null ? ((DbObject) user).id : "";
    }

    /* JADX INFO: renamed from: j1 */
    public final /* synthetic */ void m14577j1(BLiveEnvelope bLiveEnvelope) {
        this.f12160q.onNext(new njn0(bLiveEnvelope));
    }

    /* JADX INFO: renamed from: j2 */
    public c<Long> m14578j2(int i, TimeUnit timeUnit) {
        return this.f12167x.m22852r(i, timeUnit);
    }

    /* JADX INFO: renamed from: k0 */
    public BLiveUserMask m14579k0() {
        return this.f12146G;
    }

    /* JADX INFO: renamed from: k1 */
    public final /* synthetic */ void m14580k1(BLiveChatMessage bLiveChatMessage) {
        lz00.m17628d().m17630c("msg_from_request", "live.chat.msg", e5t.m12220y(bLiveChatMessage, m14539W0()), rzv.f18731j);
    }

    /* JADX INFO: renamed from: k2 */
    public c<Long> m14581k2(TimeUnit timeUnit) {
        return this.f12167x.m22852r(1, timeUnit);
    }

    /* JADX INFO: renamed from: l0 */
    public User m14582l0() {
        return (User) this.f12169z.m22166i().e();
    }

    /* JADX INFO: renamed from: l1 */
    public final /* synthetic */ roj0 m14583l1(BLiveEnvelope bLiveEnvelope) {
        List list = bLiveEnvelope.data.liveChatMessages;
        if (list != null) {
            vwb.z(list, new e30() { // from class: l.vn2
                public final void call(Object obj) {
                    this.f21228a.m14580k1((BLiveChatMessage) obj);
                }
            });
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: l2 */
    public void m14584l2(BLiveEnvelope bLiveEnvelope) {
        h4g h4gVar = (h4g) this.f12158o.e();
        if (h4gVar != null) {
            h4gVar.d(bLiveEnvelope.data.fanbaseRelations);
            this.f12158o.onNext(h4gVar);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public rzv.C0801a m14585m0() {
        return this.f12169z.m22167j();
    }

    /* JADX INFO: renamed from: m1 */
    public c<far> m14586m1() {
        return this.f12152i;
    }

    /* JADX INFO: renamed from: m2 */
    public c<roj0> m14587m2() {
        return zfv.m27256c1();
    }

    /* JADX INFO: renamed from: n0 */
    public BLiveAbsData m14588n0() {
        return this.f12165v;
    }

    /* JADX INFO: renamed from: n1 */
    public c<LiveControlMessage> m14589n1() {
        return this.f12169z.m22172r().y();
    }

    /* JADX INFO: renamed from: n2 */
    public void m14590n2() {
        zfv.m27259d1();
    }

    /* JADX INFO: renamed from: o0 */
    public String mo14591o0() {
        return m14505I0().m27365a() == null ? "" : m14505I0().m27365a();
    }

    /* JADX INFO: renamed from: o1 */
    public c<LiveControlMessage> m14592o1(Act act) {
        if (this.f12159p == null) {
            this.f12159p = new ic2<>(this.f12169z.m22172r().a);
        }
        return this.f12159p.m15087l(act).onBackpressureBuffer(20000L).observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: p0 */
    public int m14593p0() {
        return this.f12167x.m22846l();
    }

    /* JADX INFO: renamed from: p1 */
    public c<hvj> m14594p1() {
        return this.f12149f;
    }

    /* JADX INFO: renamed from: q0 */
    public c<h4g> m14595q0() {
        return this.f12158o.onBackpressureBuffer(20000L).observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: q1 */
    public ti1 m14596q1() {
        return this.f12169z.m22172r();
    }

    /* JADX INFO: renamed from: r0 */
    public h4g m14597r0() {
        return (h4g) this.f12158o.e();
    }

    /* JADX INFO: renamed from: r1 */
    public abstract void mo14598r1(String str, String str2, boolean z);

    /* JADX INFO: renamed from: s0 */
    public String m14599s0() {
        return "liveRoom";
    }

    /* JADX INFO: renamed from: s1 */
    public c<LivingUsers<BLiveMember>> m14600s1() {
        return this.f12151h;
    }

    /* JADX INFO: renamed from: t0 */
    public c<Followship> m14601t0() {
        return this.f12169z.m22169l().asObservable();
    }

    /* JADX INFO: renamed from: t1 */
    public c<Long> m14602t1() {
        return ((ggv) ypv.l(fld0.c)).h();
    }

    /* JADX INFO: renamed from: u0 */
    public Followship m14603u0() {
        return this.f12169z.m22170m();
    }

    /* JADX INFO: renamed from: u1 */
    public boolean m14604u1() {
        return this.f12166w;
    }

    /* JADX INFO: renamed from: v0 */
    public c<BLiveGiftBubbleConfig> m14605v0(String str) {
        return zfv.m27312v0(str, ((DbObject) m14582l0()).id, m17235k(), m17239o());
    }

    /* JADX INFO: renamed from: v1 */
    public long m14606v1() {
        return this.f12167x.m22849o().longValue();
    }

    /* JADX INFO: renamed from: w0 */
    public BLiveGiftItem m14607w0(int i) {
        return ((ggv) ypv.l(fld0.c)).l(i);
    }

    /* JADX INFO: renamed from: w1 */
    public c<Long> m14608w1(int i, TimeUnit timeUnit) {
        return this.f12167x.m22851q(i, timeUnit).take(1);
    }

    /* JADX INFO: renamed from: x0 */
    public c<LongLinkLeaderboard.GiftStarLeaderboardChangeMessage> m14609x0() {
        return this.f12169z.m22172r().k();
    }

    /* JADX INFO: renamed from: x1 */
    public BLiveOperation m14610x1() {
        return this.f12163t;
    }

    /* JADX INFO: renamed from: y0 */
    public JumpRoomData mo9894y0() {
        return null;
    }

    /* JADX INFO: renamed from: y1 */
    public void m14611y1(String str) {
        LivingNormalApiProvider.m4579E6(str, m17234j().liveMode).subscribe(ffw.h(new e30() { // from class: l.un2
            public final void call(Object obj) {
                this.f20723a.m14556c1((BLiveEnvelope) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z0 */
    public c<LongLinkReportMsg.LiveReportMsg> m14612z0() {
        return m14596q1().X();
    }

    /* JADX INFO: renamed from: z1 */
    public c<BLiveData> m14613z1() {
        return this.f12157n.asObservable();
    }
}
