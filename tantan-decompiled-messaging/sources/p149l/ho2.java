package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.longlink.msg.live.leaderboard.LongLinkLeaderboard;
import com.p046p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage;
import com.p046p1.mobile.longlink.msg.livedistribution.LongLinkReportMsg;
import com.p046p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.data.Followship;
import com.p046p1.mobile.putong.data.FollowshipStatus;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p046p1.mobile.putong.live.base.bean.LivingUsers;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsRoom;
import com.p046p1.mobile.putong.live.base.data.BLiveAddStickerResult;
import com.p046p1.mobile.putong.live.base.data.BLiveAtUserInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveChatMessage;
import com.p046p1.mobile.putong.live.base.data.BLiveChatTip;
import com.p046p1.mobile.putong.live.base.data.BLiveCoin;
import com.p046p1.mobile.putong.live.base.data.BLiveData;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftBubbleConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p046p1.mobile.putong.live.base.data.BLiveHourLeaderBoard;
import com.p046p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import com.p046p1.mobile.putong.live.base.data.BLiveMember;
import com.p046p1.mobile.putong.live.base.data.BLiveOperation;
import com.p046p1.mobile.putong.live.base.data.BLivePacketSystemCommentStatus;
import com.p046p1.mobile.putong.live.base.data.BLiveRoomTabGifts;
import com.p046p1.mobile.putong.live.base.data.BLiveSendMessageData;
import com.p046p1.mobile.putong.live.base.data.BLiveSendMessageExtra;
import com.p046p1.mobile.putong.live.base.data.BLiveType;
import com.p046p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p046p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p046p1.mobile.putong.live.livingroom.util.pref.LiveWatchCounter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;
import p133rx.schedulers.Schedulers;
import p133rx.subjects.C22392a;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ho2 extends lh20 {

    /* JADX INFO: renamed from: A */
    public far f108740A;

    /* JADX INFO: renamed from: B */
    public j6g f108741B;

    /* JADX INFO: renamed from: C */
    public final n0w f108742C;

    /* JADX INFO: renamed from: D */
    public final boolean f108743D;

    /* JADX INFO: renamed from: E */
    public jxl f108744E;

    /* JADX INFO: renamed from: F */
    public boolean f108745F;

    /* JADX INFO: renamed from: G */
    public BLiveUserMask f108746G;

    /* JADX INFO: renamed from: d */
    public final zgt f108747d;

    /* JADX INFO: renamed from: e */
    public final C22392a<hvj> f108748e;

    /* JADX INFO: renamed from: f */
    public final C22392a<hvj> f108749f;

    /* JADX INFO: renamed from: g */
    public final C22392a<Long> f108750g;

    /* JADX INFO: renamed from: h */
    public C22392a<LivingUsers<BLiveMember>> f108751h;

    /* JADX INFO: renamed from: i */
    public C22392a<far> f108752i;

    /* JADX INFO: renamed from: j */
    public C22392a<List<BLiveChatTip>> f108753j;

    /* JADX INFO: renamed from: k */
    public final C22392a<BLiveAddStickerResult> f108754k;

    /* JADX INFO: renamed from: l */
    public final C22393b<BLiveHourLeaderBoardItem> f108755l;

    /* JADX INFO: renamed from: m */
    public final C22393b<BLiveHourLeaderBoard> f108756m;

    /* JADX INFO: renamed from: n */
    public final C22392a<BLiveData> f108757n;

    /* JADX INFO: renamed from: o */
    public final C22392a<h4g> f108758o;

    /* JADX INFO: renamed from: p */
    public ic2<LiveControlMessage, String> f108759p;

    /* JADX INFO: renamed from: q */
    public C22392a<njn0> f108760q;

    /* JADX INFO: renamed from: r */
    public C22393b<BLivePacketSystemCommentStatus> f108761r;

    /* JADX INFO: renamed from: s */
    public final Map<String, Long> f108762s;

    /* JADX INFO: renamed from: t */
    public BLiveOperation f108763t;

    /* JADX INFO: renamed from: u */
    public int f108764u;

    /* JADX INFO: renamed from: v */
    public BLiveAbsData f108765v;

    /* JADX INFO: renamed from: w */
    public boolean f108766w;

    /* JADX INFO: renamed from: x */
    public final tbu f108767x;

    /* JADX INFO: renamed from: y */
    public r8d0 f108768y;

    /* JADX INFO: renamed from: z */
    public rzv f108769z;

    public ho2(xml<? extends BLiveAbsData, ? extends BLiveAbsRoom> xmlVar, zgt zgtVar) {
        super(xmlVar);
        this.f108748e = C22392a.m221512b();
        this.f108749f = C22392a.m221512b();
        this.f108750g = C22392a.m221512b();
        this.f108751h = C22392a.m221512b();
        this.f108752i = C22392a.m221512b();
        this.f108753j = C22392a.m221512b();
        this.f108754k = C22392a.m221512b();
        this.f108755l = C22393b.m221521b();
        this.f108756m = C22393b.m221521b();
        this.f108757n = C22392a.m221512b();
        this.f108758o = C22392a.m221512b();
        this.f108760q = C22392a.m221512b();
        this.f108761r = C22393b.m221521b();
        this.f108762s = new HashMap();
        this.f108766w = true;
        this.f108741B = new j6g(this);
        this.f108742C = new n0w(this);
        this.f108746G = null;
        this.f108767x = new tbu(this);
        m132117b0();
        this.f108743D = ypv.m215672k().m195706P6();
        this.f108747d = zgtVar;
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m132037B(Throwable th) {
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m132038C(Throwable th) {
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ hvj m132042G(hvj hvjVar) {
        ((ggv) ypv.m215673l(fld0.f98148c)).m126012F(hvjVar);
        return hvjVar;
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m132048M(e30 e30Var, List list) {
        if (e30Var != null) {
            e30Var.call(list);
        }
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m132051P(Throwable th) {
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m132052Q(d30 d30Var, boolean z, Throwable th) {
        if (d30Var != null) {
            d30Var.call();
        }
        if (!z && (th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).isFollowForbidden()) {
            lsi0.m151593w(R$string.f46600C);
        }
    }

    /* JADX INFO: renamed from: A0 */
    public abstract String mo132054A0();

    /* JADX INFO: renamed from: A1 */
    public void m132055A1(final evj evjVar, @Nullable final e30<List<rwj>> e30Var) {
        zfv.m218562f1(evjVar, mo149813j()).map(new w9j() { // from class: l.ao2
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f70783a.m132123d1(evjVar, (BLiveRoomTabGifts) obj);
            }
        }).observeOn(Schedulers.m221493io()).map(new w9j() { // from class: l.bo2
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ho2.m132042G((hvj) obj);
            }
        }).observeOn(jo0.m142408a()).map(new w9j() { // from class: l.co2
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f81730a.m132126e1(evjVar, (hvj) obj);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.do2
            @Override // p149l.e30
            public final void call(Object obj) {
                ho2.m132048M(e30Var, (List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: B0 */
    public C22306c<Boolean> m132056B0() {
        return this.f108769z.m181785k();
    }

    /* JADX INFO: renamed from: B1 */
    public final void m132057B1(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        this.f108769z.m181789r().m189090b0(bLiveHourLeaderBoardItem);
    }

    /* JADX INFO: renamed from: C0 */
    public abstract String mo132058C0();

    /* JADX INFO: renamed from: C1 */
    public void m132059C1(Long l2) {
        ((ggv) ypv.m215673l(fld0.f98148c)).m126009C(l2);
    }

    /* JADX INFO: renamed from: D0 */
    public String m132060D0() {
        return m132069I0().m218717d();
    }

    /* JADX INFO: renamed from: D1 */
    public final void m132061D1(List<BLiveHourLeaderBoardItem> list) {
        this.f108769z.m181789r().m189099e0(list);
    }

    /* JADX INFO: renamed from: E0 */
    public C22306c<BLivePacketSystemCommentStatus> m132062E0() {
        return this.f108761r.asObservable();
    }

    /* JADX INFO: renamed from: E1 */
    public void m132063E1(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        this.f108769z.m181789r().m189102f0(bLiveGivenGiftBrief);
    }

    /* JADX INFO: renamed from: F0 */
    public int mo120451F0() {
        return this.f108769z.m181788n().m221515e().contains(ypv.f199493a.m199309D0()) ? 2 : 100;
    }

    /* JADX INFO: renamed from: F1 */
    public void m132064F1(BLiveOperation bLiveOperation) {
        this.f108763t = bLiveOperation;
        m132066G1(bLiveOperation);
    }

    /* JADX INFO: renamed from: G0 */
    public ArrayList<String> m132065G0() {
        return this.f108769z.m181788n().m221515e();
    }

    /* JADX INFO: renamed from: G1 */
    public void m132066G1(BLiveOperation bLiveOperation) {
        m132160q1().m189105g0(st50.m185867C(bLiveOperation, this.f108769z.f161694c));
    }

    /* JADX INFO: renamed from: H0 */
    public jxl m132067H0() {
        return this.f108744E;
    }

    /* JADX INFO: renamed from: H1 */
    public void m132068H1(LongLinkSocketMessage.OperationUpdateNotice operationUpdateNotice) {
        this.f108769z.m181789r().f170377K.onNext(operationUpdateNotice);
    }

    /* JADX INFO: renamed from: I0 */
    public zgt.C21695a m132069I0() {
        return this.f108747d.m218697h();
    }

    /* JADX INFO: renamed from: I1 */
    public void m132070I1(LongLinkMedalMessage.TurboCardReceiveEvent turboCardReceiveEvent) {
        this.f108769z.m181789r().m189108h0(turboCardReceiveEvent);
    }

    /* JADX INFO: renamed from: J0 */
    public BLiveAddStickerResult m132071J0() {
        return this.f108754k.m221515e();
    }

    /* JADX INFO: renamed from: J1 */
    public C22306c<BLiveCoin> m132072J1() {
        return zfv.m218577k1();
    }

    /* JADX INFO: renamed from: K0 */
    public C22306c<BLiveAddStickerResult> m132073K0() {
        return this.f108754k.asObservable();
    }

    /* JADX INFO: renamed from: K1 */
    public abstract void mo132074K1(String str);

    /* JADX INFO: renamed from: L0 */
    public C22306c<LongLinkLiveMessage.LiveStickerChangeMsg> m132075L0() {
        return this.f108769z.m181789r().f170347A.asObservable().filter(new w9j() { // from class: l.zn2
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f203932a.m132118b1((LongLinkLiveMessage.LiveStickerChangeMsg) obj);
            }
        }).onBackpressureLatest().observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: L1 */
    public void m132076L1() {
        cll.C16188a c16188aM107536c = cll.m107499l(ytr.m216073b("/chat-tips")).m107524p().m107536c("anchorId", mo149813j().anchor.f44419id);
        if (!LiveWatchCounter.m76330h().m76338m()) {
            c16188aM107536c.m107536c("source", "firstEntry");
        }
        upv.m194935w(c16188aM107536c.m107537d(), "chatTip").subscribe(ffw.m121194e(new e30() { // from class: l.wn2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f187244a.m132128f1((BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.xn2
            @Override // p149l.e30
            public final void call(Object obj) {
                ho2.m132051P((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: M0 */
    public String m132077M0() {
        return this.f108747d.m218700k();
    }

    /* JADX INFO: renamed from: M1 */
    public void m132078M1(String str, String str2) {
        LivingNormalApiProvider.m71475h7(str, str2).subscribe(ffw.m121194e(new e30() { // from class: l.pn2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f150321a.m132131g1((BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.yn2
            @Override // p149l.e30
            public final void call(Object obj) {
                ho2.m132037B((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N0 */
    public C22306c<njn0> m132079N0() {
        return this.f108760q;
    }

    /* JADX INFO: renamed from: N1 */
    public abstract void mo132080N1(String str);

    /* JADX INFO: renamed from: O0 */
    public String mo132081O0() {
        return "";
    }

    /* JADX INFO: renamed from: O1 */
    public abstract void mo132082O1(boolean z, String str, String str2);

    /* JADX INFO: renamed from: P0 */
    public C22306c<hvj> m132083P0() {
        return this.f108748e;
    }

    /* JADX INFO: renamed from: P1 */
    public void m132084P1() {
        upv.m194935w(BLiveAbsData.VOICE_LIVE.equals(mo132054A0()) ? LiveApiBuilder.m67315u(ytr.m216073b("/live_revenue_campaign"), mt0.m156174a("liveType", BLiveType.voiceLive)) : cll.m107499l(ytr.m216073b("/live_revenue_campaign")), "getFirstRechargeData").subscribe(ffw.m121194e(new e30() { // from class: l.qn2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f155375a.m132134h1((BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.rn2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f160234a.m132138i1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Q0 */
    public C22306c<Long> m132085Q0() {
        return this.f108750g;
    }

    /* JADX INFO: renamed from: Q1 */
    public void m132086Q1(String str, String str2) {
        q9o.m173659j(str, str2).subscribe(ffw.m121194e(new e30() { // from class: l.sn2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f165406a.m132141j1((BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.tn2
            @Override // p149l.e30
            public final void call(Object obj) {
                ho2.m132038C((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: R */
    public void m132087R(User user) {
        if (user == null) {
            return;
        }
        this.f108769z.m181783i().onNext(user);
        ((idv) ypv.m215673l(fld0.f98147b)).m135629a(user);
    }

    /* JADX INFO: renamed from: R0 */
    public boolean m132088R0() {
        if (User.isMatched(this.f108769z.m181783i().m221515e())) {
            return true;
        }
        if (this.f108769z.m181786l().m221515e() != null) {
            return TEnum.equals(this.f108769z.m181786l().m221515e().state, FollowshipStatus.following) || TEnum.equals(this.f108769z.m181786l().m221515e().state, "matched");
        }
        return false;
    }

    /* JADX INFO: renamed from: R1 */
    public void m132089R1() {
        this.f108752i.onNext(new far());
        this.f108740A = null;
    }

    /* JADX INFO: renamed from: S */
    public void mo132090S(r8d0 r8d0Var) {
        this.f108768y = r8d0Var;
        m132087R(r8d0Var.f187608a);
        m132096U(r8d0Var.f187611d);
        mo149811g(r8d0Var.f187610c);
        mo132136i(r8d0Var.f187609b);
        m132105X(r8d0Var.f158205e);
        m132093T(r8d0Var.m178243a());
    }

    /* JADX INFO: renamed from: S0 */
    public boolean m132091S0(String str) {
        if (str.equals(m132146l0().f56011id)) {
            return false;
        }
        return mo120451F0() == 1 || (mo120451F0() == 2 && !m132065G0().contains(str));
    }

    /* JADX INFO: renamed from: S1 */
    public void m132092S1() {
        this.f108760q.onNext(new njn0());
    }

    /* JADX INFO: renamed from: T */
    public final void m132093T(h4g h4gVar) {
        this.f108758o.onNext(h4gVar);
    }

    /* JADX INFO: renamed from: T0 */
    public void m132094T0() {
        this.f108742C.m157297j(false);
    }

    /* JADX INFO: renamed from: T1 */
    public C22306c<ArrayList<String>> m132095T1() {
        return this.f108769z.m181788n();
    }

    /* JADX INFO: renamed from: U */
    public void m132096U(Followship followship) {
        if (followship == null) {
            return;
        }
        this.f108769z.m181786l().onNext(followship);
    }

    /* JADX INFO: renamed from: U0 */
    public void m132097U0() {
        this.f108742C.m157297j(true);
    }

    /* JADX INFO: renamed from: U1 */
    public C22306c<roj0> m132098U1(String str, int i, String str2, String str3, @Nullable sy4.C20071a c20071a) {
        BLiveSendMessageData bLiveSendMessageData = new BLiveSendMessageData();
        bLiveSendMessageData.type = i;
        if (i == 0) {
            str3 = m149818o();
        }
        bLiveSendMessageData.roomId = str3;
        bLiveSendMessageData.anchorId = m132146l0() == null ? "" : m132146l0().f56011id;
        bLiveSendMessageData.userId = ypv.f199493a.m199309D0();
        bLiveSendMessageData.value = str;
        bLiveSendMessageData.roomType = str2;
        bLiveSendMessageData.liveId = m149814k();
        bLiveSendMessageData.liveMode = mo149813j().liveMode;
        bLiveSendMessageData.templateType = mo149813j().isVoiceLive() ? "profit" : "";
        if (c20071a != null) {
            BLiveSendMessageExtra bLiveSendMessageExtraNew_ = BLiveSendMessageExtra.new_();
            if (!TextUtils.isEmpty(c20071a.m186609b())) {
                bLiveSendMessageExtraNew_.groupType = c20071a.m186609b();
            }
            if (!TextUtils.isEmpty(c20071a.f166890b) && !TextUtils.isEmpty(c20071a.f166891c)) {
                BLiveAtUserInfo bLiveAtUserInfoNew_ = BLiveAtUserInfo.new_();
                bLiveAtUserInfoNew_.userId = c20071a.f166890b;
                bLiveAtUserInfoNew_.userName = c20071a.f166891c;
                bLiveSendMessageExtraNew_.atUserInfos = vwb.m200324f0(bLiveAtUserInfoNew_);
            }
            bLiveSendMessageData.extInfo = bLiveSendMessageExtraNew_;
        }
        return LivingNormalApiProvider.m71223F7(bLiveSendMessageData).map(new w9j() { // from class: l.go2
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f103647a.m132147l1((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: V */
    public void m132099V(BLiveAbsData bLiveAbsData) {
        m132102W(bLiveAbsData, 0);
    }

    /* JADX INFO: renamed from: V0 */
    public boolean mo132100V0() {
        User userM132146l0 = m132146l0();
        h4g h4gVarM132161r0 = m132161r0();
        return (userM132146l0 == null || h4gVarM132161r0 == null || h4gVarM132161r0.m129237b() == null || !this.f108743D) ? false : true;
    }

    /* JADX INFO: renamed from: V1 */
    public C22306c<roj0> m132101V1(String str, @Nullable sy4.C20071a c20071a) {
        return m132098U1(str, 0, "voiceRoom".equals(mo132058C0()) ? "voice" : "video", "", c20071a);
    }

    /* JADX INFO: renamed from: W */
    public void m132102W(BLiveAbsData bLiveAbsData, int i) {
        if (bLiveAbsData == null) {
            return;
        }
        if (TEnum.equals(bLiveAbsData.state, "onlive")) {
            mo149812h(new i0t(i));
        } else if (TEnum.equals(bLiveAbsData.state, "stopped")) {
            mo149812h(u7s.f175055e);
        } else if (TEnum.equals(bLiveAbsData.state, "suspended")) {
            mo149812h(pau.f148011b);
        }
    }

    /* JADX INFO: renamed from: W0 */
    public boolean mo132103W0() {
        return false;
    }

    /* JADX INFO: renamed from: W1 */
    public void m132104W1(if2 if2Var) {
        this.f108769z.m181789r().m189093c0(if2Var);
    }

    /* JADX INFO: renamed from: X */
    public void m132105X(BLiveAddStickerResult bLiveAddStickerResult) {
        if (bLiveAddStickerResult == null) {
            return;
        }
        this.f108754k.onNext(bLiveAddStickerResult);
    }

    /* JADX INFO: renamed from: X0 */
    public boolean m132106X0() {
        return m149816m().m137798e();
    }

    /* JADX INFO: renamed from: X1 */
    public void m132107X1(BLiveUserMask bLiveUserMask) {
        this.f108746G = bLiveUserMask;
    }

    /* JADX INFO: renamed from: Y */
    public pul<LiveMessage> m132108Y() {
        return this.f108769z.f161700i;
    }

    /* JADX INFO: renamed from: Y0 */
    public boolean m132109Y0() {
        return this.f108745F;
    }

    /* JADX INFO: renamed from: Y1 */
    public void m132110Y1(BLiveAbsData bLiveAbsData) {
        rzv rzvVar = this.f108769z;
        if (rzvVar != null) {
            rzvVar.m181797z(bLiveAbsData);
        }
    }

    /* JADX INFO: renamed from: Z */
    public C22306c<List<BLiveChatTip>> m132111Z() {
        return this.f108753j.asObservable();
    }

    /* JADX INFO: renamed from: Z0 */
    public boolean m132112Z0() {
        return this instanceof nnn0;
    }

    /* JADX INFO: renamed from: Z1 */
    public void m132113Z1(jxl jxlVar) {
        this.f108744E = jxlVar;
    }

    /* JADX INFO: renamed from: a0 */
    public void m132114a0(BLiveAbsData bLiveAbsData) {
        if (mo149813j() == null || bLiveAbsData == null || !TextUtils.equals(m149814k(), bLiveAbsData.f44323id)) {
            this.f108766w = true;
        }
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m132115a1(d30 d30Var, Followship followship) {
        m132096U(followship);
        if (ypv.f199493a.m199315H()) {
            sgj.m184091d();
        }
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: a2 */
    public void m132116a2(String str) {
        this.f108747d.m218712w(str);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m132117b0() {
        this.f108769z = new rzv(this.f108742C);
    }

    /* JADX INFO: renamed from: b1 */
    public final /* synthetic */ Boolean m132118b1(LongLinkLiveMessage.LiveStickerChangeMsg liveStickerChangeMsg) {
        Long l2 = this.f108762s.get(liveStickerChangeMsg.getRoomId());
        if (l2 != null && liveStickerChangeMsg.getTimestamp() <= l2.longValue()) {
            return Boolean.FALSE;
        }
        this.f108762s.put(liveStickerChangeMsg.getRoomId(), Long.valueOf(liveStickerChangeMsg.getTimestamp()));
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: b2 */
    public void m132119b2(boolean z) {
        this.f108745F = z;
    }

    /* JADX INFO: renamed from: c0 */
    public void mo97488c0(boolean z) {
        this.f108753j.onNext(null);
        this.f108766w = !z;
        this.f108767x.m187913j();
        m132089R1();
        m132092S1();
        this.f108769z.f161700i.m171443e();
        this.f108759p = null;
        if (z) {
            return;
        }
        this.f108769z.m181796y(C22392a.m221512b());
        this.f128032a.mo165464a();
        this.f108768y = null;
        if (ypv.m215674m()) {
            ((idv) ypv.m215673l(fld0.f98147b)).m135630b();
        }
    }

    /* JADX INFO: renamed from: c1 */
    public final /* synthetic */ void m132120c1(BLiveEnvelope bLiveEnvelope) {
        BLiveHourLeaderBoard bLiveHourLeaderBoard = bLiveEnvelope.data.hourLeaderboard;
        if (bLiveHourLeaderBoard == null) {
            return;
        }
        this.f108756m.onNext(bLiveHourLeaderBoard);
        m132061D1(bLiveHourLeaderBoard.allLeaderboards);
        List<BLiveHourLeaderBoardItem> list = bLiveHourLeaderBoard.currentRoomLeaderboards;
        if ((!vwb.m200296J(list)) && (list.size() > 0)) {
            BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem = list.get(0);
            bLiveHourLeaderBoardItem.isOpen = bLiveHourLeaderBoard.isOpen;
            bLiveHourLeaderBoardItem.currentHourSuggestConfig = bLiveHourLeaderBoard.currentHourSuggestConfig;
            m132057B1(bLiveHourLeaderBoardItem);
            this.f108755l.onNext(bLiveHourLeaderBoardItem);
        }
    }

    /* JADX INFO: renamed from: c2 */
    public void mo132121c2() {
        this.f108767x.m187919p();
        this.f108745F = false;
    }

    /* JADX INFO: renamed from: d0 */
    public void m132122d0(boolean z, String str, String str2) {
        m132125e0(z, str, str2, null);
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ hvj m132123d1(evj evjVar, BLiveRoomTabGifts bLiveRoomTabGifts) {
        this.f108750g.onNext(Long.valueOf(bLiveRoomTabGifts.latestBagGiftUpdateTime));
        this.f108761r.onNext(bLiveRoomTabGifts.bagSystemCommentStatus);
        return mmj.m155428o(bLiveRoomTabGifts, evjVar);
    }

    /* JADX INFO: renamed from: d2 */
    public far m132124d2() {
        return this.f108740A;
    }

    /* JADX INFO: renamed from: e0 */
    public void m132125e0(boolean z, String str, String str2, d30 d30Var) {
        m132127f0(z, str, str2, d30Var, null);
    }

    /* JADX INFO: renamed from: e1 */
    public final /* synthetic */ List m132126e1(evj evjVar, hvj hvjVar) {
        this.f108748e.onNext(hvjVar);
        if (evjVar.m118271f()) {
            this.f108749f.onNext(hvjVar);
        }
        if (evjVar.m118270e() != null) {
            evjVar.m118270e().call();
        }
        return hvjVar.m133172e().m143509f();
    }

    /* JADX INFO: renamed from: e2 */
    public void mo97489e2(boolean z, BLiveAbsData bLiveAbsData) {
        ho2 ho2Var;
        boolean z2;
        BLiveAbsData bLiveAbsData2 = this.f108765v;
        if (bLiveAbsData2 == null || !TextUtils.equals(bLiveAbsData.f44323id, bLiveAbsData2.f44323id)) {
            BLiveAbsData bLiveAbsData3 = this.f108765v;
            boolean z3 = bLiveAbsData3 != null && TextUtils.equals(bLiveAbsData.room.f44419id, bLiveAbsData3.room.f44419id);
            this.f108765v = bLiveAbsData;
            if (bLiveAbsData == null || !x4s.m207012b(bLiveAbsData.liveMode)) {
                ho2Var = this;
                z2 = z;
                ho2Var.m132129f2(z2, bLiveAbsData.room.f44419id, z3, ho2Var.m149826x(), bLiveAbsData.f44323id, ho2Var.mo132155o0());
            } else if (this.f108769z.f161692a) {
                ho2Var = this;
                z2 = z;
            } else {
                ho2Var = this;
                z2 = z;
                ho2Var.m132129f2(z2, bLiveAbsData.room.f44419id, z3, m149826x(), bLiveAbsData.f44323id, mo132155o0());
            }
            if (z3) {
                return;
            }
            ho2Var.mo132082O1(z2, bLiveAbsData.f44323id, bLiveAbsData.room.f44419id);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public void m132127f0(final boolean z, String str, String str2, final d30 d30Var, final d30 d30Var2) {
        if (m132146l0() == null) {
            return;
        }
        vpv vpvVar = ypv.f199493a;
        vpvVar.m199340d(vpvVar.m199309D0(), m132146l0(), true, mo132163s0(), m149814k(), m149818o(), str, str2).subscribe(ffw.m121194e(new e30() { // from class: l.eo2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f92416a.m132115a1(d30Var, (Followship) obj);
            }
        }, new e30() { // from class: l.fo2
            @Override // p149l.e30
            public final void call(Object obj) {
                ho2.m132052Q(d30Var2, z, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f1 */
    public final /* synthetic */ void m132128f1(BLiveEnvelope bLiveEnvelope) {
        this.f108753j.onNext(bLiveEnvelope.data.chatTips);
    }

    /* JADX INFO: renamed from: f2 */
    public void m132129f2(boolean z, String str, boolean z2, String str2, String str3, String str4) {
        this.f108769z.m181781A(z, str, z2, str2, str3, str4);
    }

    /* JADX INFO: renamed from: g0 */
    public C22306c<BLiveHourLeaderBoard> m132130g0() {
        return this.f108756m.onBackpressureLatest().observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: g1 */
    public final /* synthetic */ void m132131g1(BLiveEnvelope bLiveEnvelope) {
        far farVar = new far(bLiveEnvelope, false);
        this.f108752i.onNext(farVar);
        if (this.f108740A == null) {
            this.f108740A = farVar;
        }
    }

    /* JADX INFO: renamed from: g2 */
    public void m132132g2(BLiveAbsData bLiveAbsData) {
        this.f108765v = null;
        rzv rzvVar = this.f108769z;
        if (rzvVar.f161692a) {
            rzvVar.m181782C();
        }
    }

    /* JADX INFO: renamed from: h0 */
    public C22306c<User> m132133h0() {
        return this.f108769z.m181783i().asObservable();
    }

    /* JADX INFO: renamed from: h1 */
    public final /* synthetic */ void m132134h1(BLiveEnvelope bLiveEnvelope) {
        this.f108757n.onNext(bLiveEnvelope.data);
    }

    /* JADX INFO: renamed from: h2 */
    public C22306c<Long> m132135h2(int i, TimeUnit timeUnit) {
        return this.f108767x.m187920q(i, timeUnit);
    }

    @Override // p149l.lh20
    /* JADX INFO: renamed from: i */
    public void mo132136i(BLiveAbsRoom bLiveAbsRoom) {
        super.mo132136i(bLiveAbsRoom);
        mo132074K1(bLiveAbsRoom.f44324id);
    }

    /* JADX INFO: renamed from: i0 */
    public C22306c<BLiveHourLeaderBoardItem> m132137i0() {
        return this.f108755l.onBackpressureLatest().observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: i1 */
    public final /* synthetic */ void m132138i1(Throwable th) {
        this.f108757n.onNext(null);
    }

    /* JADX INFO: renamed from: i2 */
    public C22306c<Long> m132139i2(TimeUnit timeUnit) {
        return this.f108767x.m187920q(1, timeUnit);
    }

    /* JADX INFO: renamed from: j0 */
    public String m132140j0() {
        User userM221515e = this.f108769z.m181783i().m221515e();
        return userM221515e != null ? userM221515e.f56011id : "";
    }

    /* JADX INFO: renamed from: j1 */
    public final /* synthetic */ void m132141j1(BLiveEnvelope bLiveEnvelope) {
        this.f108760q.onNext(new njn0(bLiveEnvelope));
    }

    /* JADX INFO: renamed from: j2 */
    public C22306c<Long> m132142j2(int i, TimeUnit timeUnit) {
        return this.f108767x.m187921r(i, timeUnit);
    }

    /* JADX INFO: renamed from: k0 */
    public BLiveUserMask m132143k0() {
        return this.f108746G;
    }

    /* JADX INFO: renamed from: k1 */
    public final /* synthetic */ void m132144k1(BLiveChatMessage bLiveChatMessage) {
        lz00.m152304d().m152306c("msg_from_request", "live.chat.msg", e5t.m114921y(bLiveChatMessage, mo132103W0()), rzv.f161691j);
    }

    /* JADX INFO: renamed from: k2 */
    public C22306c<Long> m132145k2(TimeUnit timeUnit) {
        return this.f108767x.m187921r(1, timeUnit);
    }

    /* JADX INFO: renamed from: l0 */
    public User m132146l0() {
        return this.f108769z.m181783i().m221515e();
    }

    /* JADX INFO: renamed from: l1 */
    public final /* synthetic */ roj0 m132147l1(BLiveEnvelope bLiveEnvelope) {
        List<BLiveChatMessage> list = bLiveEnvelope.data.liveChatMessages;
        if (list != null) {
            vwb.m200354z(list, new e30() { // from class: l.vn2
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f182202a.m132144k1((BLiveChatMessage) obj);
                }
            });
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: l2 */
    public void m132148l2(BLiveEnvelope bLiveEnvelope) {
        h4g h4gVarM221515e = this.f108758o.m221515e();
        if (h4gVarM221515e != null) {
            h4gVarM221515e.m129239d(bLiveEnvelope.data.fanbaseRelations);
            this.f108758o.onNext(h4gVarM221515e);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public rzv.C19818a m132149m0() {
        return this.f108769z.m181784j();
    }

    /* JADX INFO: renamed from: m1 */
    public C22306c<far> m132150m1() {
        return this.f108752i;
    }

    /* JADX INFO: renamed from: m2 */
    public C22306c<roj0> m132151m2() {
        return zfv.m218553c1();
    }

    /* JADX INFO: renamed from: n0 */
    public BLiveAbsData m132152n0() {
        return this.f108765v;
    }

    /* JADX INFO: renamed from: n1 */
    public C22306c<LiveControlMessage> m132153n1() {
        return this.f108769z.m181789r().m189156y();
    }

    /* JADX INFO: renamed from: n2 */
    public void m132154n2() {
        zfv.m218556d1();
    }

    /* JADX INFO: renamed from: o0 */
    public String mo132155o0() {
        return m132069I0().m218714a() == null ? "" : m132069I0().m218714a();
    }

    /* JADX INFO: renamed from: o1 */
    public C22306c<LiveControlMessage> m132156o1(Act act) {
        if (this.f108759p == null) {
            this.f108759p = new ic2<>(this.f108769z.m181789r().f170425a);
        }
        return this.f108759p.m135326l(act).onBackpressureBuffer(20000L).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: p0 */
    public int m132157p0() {
        return this.f108767x.m187915l();
    }

    /* JADX INFO: renamed from: p1 */
    public C22306c<hvj> m132158p1() {
        return this.f108749f;
    }

    /* JADX INFO: renamed from: q0 */
    public C22306c<h4g> m132159q0() {
        return this.f108758o.onBackpressureBuffer(20000L).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: q1 */
    public ti1 m132160q1() {
        return this.f108769z.m181789r();
    }

    /* JADX INFO: renamed from: r0 */
    public h4g m132161r0() {
        return this.f108758o.m221515e();
    }

    /* JADX INFO: renamed from: r1 */
    public abstract void mo132162r1(String str, String str2, boolean z);

    /* JADX INFO: renamed from: s0 */
    public String mo132163s0() {
        return "liveRoom";
    }

    /* JADX INFO: renamed from: s1 */
    public C22306c<LivingUsers<BLiveMember>> m132164s1() {
        return this.f108751h;
    }

    /* JADX INFO: renamed from: t0 */
    public C22306c<Followship> m132165t0() {
        return this.f108769z.m181786l().asObservable();
    }

    /* JADX INFO: renamed from: t1 */
    public C22306c<Long> m132166t1() {
        return ((ggv) ypv.m215673l(fld0.f98148c)).m126022h();
    }

    /* JADX INFO: renamed from: u0 */
    public Followship m132167u0() {
        return this.f108769z.m181787m();
    }

    /* JADX INFO: renamed from: u1 */
    public boolean m132168u1() {
        return this.f108766w;
    }

    /* JADX INFO: renamed from: v0 */
    public C22306c<BLiveGiftBubbleConfig> m132169v0(String str) {
        return zfv.m218609v0(str, m132146l0().f56011id, m149814k(), m149818o());
    }

    /* JADX INFO: renamed from: v1 */
    public long m132170v1() {
        return this.f108767x.m187918o().longValue();
    }

    /* JADX INFO: renamed from: w0 */
    public BLiveGiftItem m132171w0(int i) {
        return ((ggv) ypv.m215673l(fld0.f98148c)).m126026l(i);
    }

    /* JADX INFO: renamed from: w1 */
    public C22306c<Long> m132172w1(int i, TimeUnit timeUnit) {
        return this.f108767x.m187920q(i, timeUnit).take(1);
    }

    /* JADX INFO: renamed from: x0 */
    public C22306c<LongLinkLeaderboard.GiftStarLeaderboardChangeMessage> m132173x0() {
        return this.f108769z.m181789r().m189116k();
    }

    /* JADX INFO: renamed from: x1 */
    public BLiveOperation m132174x1() {
        return this.f108763t;
    }

    /* JADX INFO: renamed from: y0 */
    public JumpRoomData mo97491y0() {
        return null;
    }

    /* JADX INFO: renamed from: y1 */
    public void m132175y1(String str) {
        LivingNormalApiProvider.m71213E6(str, mo149813j().liveMode).subscribe(ffw.m121197h(new e30() { // from class: l.un2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f177330a.m132120c1((BLiveEnvelope) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z0 */
    public C22306c<LongLinkReportMsg.LiveReportMsg> m132176z0() {
        return m132160q1().m189080X();
    }

    /* JADX INFO: renamed from: z1 */
    public C22306c<BLiveData> m132177z1() {
        return this.f108757n.asObservable();
    }
}
