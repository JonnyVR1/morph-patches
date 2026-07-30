package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.longlink.msg.live.leaderboard.LongLinkLeaderboard;
import com.p051p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage;
import com.p051p1.mobile.longlink.msg.livedistribution.LongLinkReportMsg;
import com.p051p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.data.Followship;
import com.p051p1.mobile.putong.data.FollowshipStatus;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p051p1.mobile.putong.live.base.bean.LivingUsers;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsRoom;
import com.p051p1.mobile.putong.live.base.data.BLiveAddStickerResult;
import com.p051p1.mobile.putong.live.base.data.BLiveAtUserInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveChatMessage;
import com.p051p1.mobile.putong.live.base.data.BLiveChatTip;
import com.p051p1.mobile.putong.live.base.data.BLiveCoin;
import com.p051p1.mobile.putong.live.base.data.BLiveData;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftBubbleConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p051p1.mobile.putong.live.base.data.BLiveHourLeaderBoard;
import com.p051p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import com.p051p1.mobile.putong.live.base.data.BLiveMember;
import com.p051p1.mobile.putong.live.base.data.BLiveOperation;
import com.p051p1.mobile.putong.live.base.data.BLivePacketSystemCommentStatus;
import com.p051p1.mobile.putong.live.base.data.BLiveRoomTabGifts;
import com.p051p1.mobile.putong.live.base.data.BLiveSendMessageData;
import com.p051p1.mobile.putong.live.base.data.BLiveSendMessageExtra;
import com.p051p1.mobile.putong.live.base.data.BLiveType;
import com.p051p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p051p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p051p1.mobile.putong.live.livingroom.util.pref.LiveWatchCounter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p137rx.schedulers.Schedulers;
import p137rx.subjects.C22507a;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class oo2 extends vp20 {

    /* JADX INFO: renamed from: A */
    public hcr f148253A;

    /* JADX INFO: renamed from: B */
    public x7g f148254B;

    /* JADX INFO: renamed from: C */
    public final l2w f148255C;

    /* JADX INFO: renamed from: D */
    public final boolean f148256D;

    /* JADX INFO: renamed from: E */
    public c0m f148257E;

    /* JADX INFO: renamed from: F */
    public boolean f148258F;

    /* JADX INFO: renamed from: G */
    public BLiveUserMask f148259G;

    /* JADX INFO: renamed from: d */
    public final ajt f148260d;

    /* JADX INFO: renamed from: e */
    public final C22507a<xxj> f148261e;

    /* JADX INFO: renamed from: f */
    public final C22507a<xxj> f148262f;

    /* JADX INFO: renamed from: g */
    public final C22507a<Long> f148263g;

    /* JADX INFO: renamed from: h */
    public C22507a<LivingUsers<BLiveMember>> f148264h;

    /* JADX INFO: renamed from: i */
    public C22507a<hcr> f148265i;

    /* JADX INFO: renamed from: j */
    public C22507a<List<BLiveChatTip>> f148266j;

    /* JADX INFO: renamed from: k */
    public final C22507a<BLiveAddStickerResult> f148267k;

    /* JADX INFO: renamed from: l */
    public final C22508b<BLiveHourLeaderBoardItem> f148268l;

    /* JADX INFO: renamed from: m */
    public final C22508b<BLiveHourLeaderBoard> f148269m;

    /* JADX INFO: renamed from: n */
    public final C22507a<BLiveData> f148270n;

    /* JADX INFO: renamed from: o */
    public final C22507a<v5g> f148271o;

    /* JADX INFO: renamed from: p */
    public pc2<LiveControlMessage, String> f148272p;

    /* JADX INFO: renamed from: q */
    public C22507a<rsn0> f148273q;

    /* JADX INFO: renamed from: r */
    public C22508b<BLivePacketSystemCommentStatus> f148274r;

    /* JADX INFO: renamed from: s */
    public final Map<String, Long> f148275s;

    /* JADX INFO: renamed from: t */
    public BLiveOperation f148276t;

    /* JADX INFO: renamed from: u */
    public int f148277u;

    /* JADX INFO: renamed from: v */
    public BLiveAbsData f148278v;

    /* JADX INFO: renamed from: w */
    public boolean f148279w;

    /* JADX INFO: renamed from: x */
    public final udu f148280x;

    /* JADX INFO: renamed from: y */
    public ugd0 f148281y;

    /* JADX INFO: renamed from: z */
    public p1w f148282z;

    public oo2(ipl<? extends BLiveAbsData, ? extends BLiveAbsRoom> iplVar, ajt ajtVar) {
        super(iplVar);
        this.f148261e = C22507a.m222758b();
        this.f148262f = C22507a.m222758b();
        this.f148263g = C22507a.m222758b();
        this.f148264h = C22507a.m222758b();
        this.f148265i = C22507a.m222758b();
        this.f148266j = C22507a.m222758b();
        this.f148267k = C22507a.m222758b();
        this.f148268l = C22508b.m222767b();
        this.f148269m = C22508b.m222767b();
        this.f148270n = C22507a.m222758b();
        this.f148271o = C22507a.m222758b();
        this.f148273q = C22507a.m222758b();
        this.f148274r = C22508b.m222767b();
        this.f148275s = new HashMap();
        this.f148279w = true;
        this.f148254B = new x7g(this);
        this.f148255C = new l2w(this);
        this.f148259G = null;
        this.f148280x = new udu(this);
        m168503b0();
        this.f148256D = zrv.m221193k().m203493P6();
        this.f148260d = ajtVar;
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m168428B(Throwable th) {
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m168429C(Throwable th) {
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ xxj m168433G(xxj xxjVar) {
        ((hiv) zrv.m221194l(htd0.f111521c)).m135146F(xxjVar);
        return xxjVar;
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m168439M(y20 y20Var, List list) {
        if (y20Var != null) {
            y20Var.call(list);
        }
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m168442P(Throwable th) {
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m168443Q(x20 x20Var, boolean z, Throwable th) {
        if (x20Var != null) {
            x20Var.call();
        }
        if (!z && (th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).isFollowForbidden()) {
            o1j0.m165649w(R$string.f47448C);
        }
    }

    /* JADX INFO: renamed from: A0 */
    public abstract String mo118362A0();

    /* JADX INFO: renamed from: A1 */
    public void m168445A1(final uxj uxjVar, @Nullable final y20<List<hzj>> y20Var) {
        aiv.m98096f1(uxjVar, mo183435j()).map(new qcj() { // from class: l.ho2
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f110863a.m168509d1(uxjVar, (BLiveRoomTabGifts) obj);
            }
        }).observeOn(Schedulers.m222739io()).map(new qcj() { // from class: l.io2
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return oo2.m168433G((xxj) obj);
            }
        }).observeOn(fo0.m126432a()).map(new qcj() { // from class: l.jo2
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f121934a.m168512e1(uxjVar, (xxj) obj);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.ko2
            @Override // p153l.y20
            public final void call(Object obj) {
                oo2.m168439M(y20Var, (List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: B0 */
    public C22421c<Boolean> m168446B0() {
        return this.f148282z.m170280k();
    }

    /* JADX INFO: renamed from: B1 */
    public final void m168447B1(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        this.f148282z.m170284r().m98272b0(bLiveHourLeaderBoardItem);
    }

    /* JADX INFO: renamed from: C0 */
    public abstract String mo118365C0();

    /* JADX INFO: renamed from: C1 */
    public void m168448C1(Long l2) {
        ((hiv) zrv.m221194l(htd0.f111521c)).m135143C(l2);
    }

    /* JADX INFO: renamed from: D0 */
    public String m168449D0() {
        return m168458I0().m98481d();
    }

    /* JADX INFO: renamed from: D1 */
    public final void m168450D1(List<BLiveHourLeaderBoardItem> list) {
        this.f148282z.m170284r().m98281e0(list);
    }

    /* JADX INFO: renamed from: E0 */
    public C22421c<BLivePacketSystemCommentStatus> m168451E0() {
        return this.f148274r.asObservable();
    }

    /* JADX INFO: renamed from: E1 */
    public void m168452E1(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        this.f148282z.m170284r().m98284f0(bLiveGivenGiftBrief);
    }

    /* JADX INFO: renamed from: F0 */
    public int mo146094F0() {
        return this.f148282z.m170283n().m222761e().contains(zrv.f205799a.m207631D0()) ? 2 : 100;
    }

    /* JADX INFO: renamed from: F1 */
    public void m168453F1(BLiveOperation bLiveOperation) {
        this.f148276t = bLiveOperation;
        m168455G1(bLiveOperation);
    }

    /* JADX INFO: renamed from: G0 */
    public ArrayList<String> m168454G0() {
        return this.f148282z.m170283n().m222761e();
    }

    /* JADX INFO: renamed from: G1 */
    public void m168455G1(BLiveOperation bLiveOperation) {
        m168545q1().m98287g0(y160.m213934C(bLiveOperation, this.f148282z.f150205c));
    }

    /* JADX INFO: renamed from: H0 */
    public c0m m168456H0() {
        return this.f148257E;
    }

    /* JADX INFO: renamed from: H1 */
    public void m168457H1(LongLinkSocketMessage.OperationUpdateNotice operationUpdateNotice) {
        this.f148282z.m170284r().f71644K.onNext(operationUpdateNotice);
    }

    /* JADX INFO: renamed from: I0 */
    public ajt.C15728a m168458I0() {
        return this.f148260d.m98461h();
    }

    /* JADX INFO: renamed from: I1 */
    public void m168459I1(LongLinkMedalMessage.TurboCardReceiveEvent turboCardReceiveEvent) {
        this.f148282z.m170284r().m98290h0(turboCardReceiveEvent);
    }

    /* JADX INFO: renamed from: J0 */
    public BLiveAddStickerResult m168460J0() {
        return this.f148267k.m222761e();
    }

    /* JADX INFO: renamed from: J1 */
    public C22421c<BLiveCoin> m168461J1() {
        return aiv.m98111k1();
    }

    /* JADX INFO: renamed from: K0 */
    public C22421c<BLiveAddStickerResult> m168462K0() {
        return this.f148267k.asObservable();
    }

    /* JADX INFO: renamed from: K1 */
    public abstract void mo118370K1(String str);

    /* JADX INFO: renamed from: L0 */
    public C22421c<LongLinkLiveMessage.LiveStickerChangeMsg> m168463L0() {
        return this.f148282z.m170284r().f71614A.asObservable().filter(new qcj() { // from class: l.go2
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f105200a.m168504b1((LongLinkLiveMessage.LiveStickerChangeMsg) obj);
            }
        }).onBackpressureLatest().observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: L1 */
    public void m168464L1() {
        rnl.C19886a c19886aM182300c = rnl.m182263l(zvr.m221802b("/chat-tips")).m182288p().m182300c("anchorId", mo183435j().anchor.f45267id);
        if (!LiveWatchCounter.m77513h().m77521m()) {
            c19886aM182300c.m182300c("source", "firstEntry");
        }
        vrv.m202562w(c19886aM182300c.m182301d(), "chatTip").subscribe(dhw.m115826e(new y20() { // from class: l.do2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f89865a.m168514f1((BLiveEnvelope) obj);
            }
        }, new y20() { // from class: l.eo2
            @Override // p153l.y20
            public final void call(Object obj) {
                oo2.m168442P((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: M0 */
    public String m168465M0() {
        return this.f148260d.m98464k();
    }

    /* JADX INFO: renamed from: M1 */
    public void m168466M1(String str, String str2) {
        LivingNormalApiProvider.m72658h7(str, str2).subscribe(dhw.m115826e(new y20() { // from class: l.wn2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f189849a.m168517g1((BLiveEnvelope) obj);
            }
        }, new y20() { // from class: l.fo2
            @Override // p153l.y20
            public final void call(Object obj) {
                oo2.m168428B((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N0 */
    public C22421c<rsn0> m168467N0() {
        return this.f148273q;
    }

    /* JADX INFO: renamed from: N1 */
    public abstract void mo118371N1(String str);

    /* JADX INFO: renamed from: O0 */
    public String mo168468O0() {
        return "";
    }

    /* JADX INFO: renamed from: O1 */
    public abstract void mo118372O1(boolean z, String str, String str2);

    /* JADX INFO: renamed from: P0 */
    public C22421c<xxj> m168469P0() {
        return this.f148261e;
    }

    /* JADX INFO: renamed from: P1 */
    public void m168470P1() {
        vrv.m202562w(BLiveAbsData.VOICE_LIVE.equals(mo118362A0()) ? LiveApiBuilder.m68498u(zvr.m221802b("/live_revenue_campaign"), st0.m187803a("liveType", BLiveType.voiceLive)) : rnl.m182263l(zvr.m221802b("/live_revenue_campaign")), "getFirstRechargeData").subscribe(dhw.m115826e(new y20() { // from class: l.xn2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f195354a.m168520h1((BLiveEnvelope) obj);
            }
        }, new y20() { // from class: l.yn2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f200768a.m168524i1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Q0 */
    public C22421c<Long> m168471Q0() {
        return this.f148263g;
    }

    /* JADX INFO: renamed from: Q1 */
    public void m168472Q1(String str, String str2) {
        qbo.m176066j(str, str2).subscribe(dhw.m115826e(new y20() { // from class: l.zn2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f205171a.m168527j1((BLiveEnvelope) obj);
            }
        }, new y20() { // from class: l.ao2
            @Override // p153l.y20
            public final void call(Object obj) {
                oo2.m168429C((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: R */
    public void m168473R(User user) {
        if (user == null) {
            return;
        }
        this.f148282z.m170278i().onNext(user);
        ((jfv) zrv.m221194l(htd0.f111520b)).m144714a(user);
    }

    /* JADX INFO: renamed from: R0 */
    public boolean m168474R0() {
        if (User.isMatched(this.f148282z.m170278i().m222761e())) {
            return true;
        }
        if (this.f148282z.m170281l().m222761e() != null) {
            return TEnum.equals(this.f148282z.m170281l().m222761e().state, FollowshipStatus.following) || TEnum.equals(this.f148282z.m170281l().m222761e().state, "matched");
        }
        return false;
    }

    /* JADX INFO: renamed from: R1 */
    public void m168475R1() {
        this.f148265i.onNext(new hcr());
        this.f148253A = null;
    }

    /* JADX INFO: renamed from: S */
    public void mo168476S(ugd0 ugd0Var) {
        this.f148281y = ugd0Var;
        m168473R(ugd0Var.f138291a);
        m168482U(ugd0Var.f138294d);
        mo183431g(ugd0Var.f138293c);
        mo168522i(ugd0Var.f138292b);
        m168491X(ugd0Var.f178885e);
        m168479T(ugd0Var.m195898a());
    }

    /* JADX INFO: renamed from: S0 */
    public boolean m168477S0(String str) {
        if (str.equals(m168532l0().f56859id)) {
            return false;
        }
        return mo146094F0() == 1 || (mo146094F0() == 2 && !m168454G0().contains(str));
    }

    /* JADX INFO: renamed from: S1 */
    public void m168478S1() {
        this.f148273q.onNext(new rsn0());
    }

    /* JADX INFO: renamed from: T */
    public final void m168479T(v5g v5gVar) {
        this.f148271o.onNext(v5gVar);
    }

    /* JADX INFO: renamed from: T0 */
    public void m168480T0() {
        this.f148255C.m152646j(false);
    }

    /* JADX INFO: renamed from: T1 */
    public C22421c<ArrayList<String>> m168481T1() {
        return this.f148282z.m170283n();
    }

    /* JADX INFO: renamed from: U */
    public void m168482U(Followship followship) {
        if (followship == null) {
            return;
        }
        this.f148282z.m170281l().onNext(followship);
    }

    /* JADX INFO: renamed from: U0 */
    public void m168483U0() {
        this.f148255C.m152646j(true);
    }

    /* JADX INFO: renamed from: U1 */
    public C22421c<uxj0> m168484U1(String str, int i, String str2, String str3, @Nullable rz4.C19938a c19938a) {
        BLiveSendMessageData bLiveSendMessageData = new BLiveSendMessageData();
        bLiveSendMessageData.type = i;
        if (i == 0) {
            str3 = m202194o();
        }
        bLiveSendMessageData.roomId = str3;
        bLiveSendMessageData.anchorId = m168532l0() == null ? "" : m168532l0().f56859id;
        bLiveSendMessageData.userId = zrv.f205799a.m207631D0();
        bLiveSendMessageData.value = str;
        bLiveSendMessageData.roomType = str2;
        bLiveSendMessageData.liveId = m202191k();
        bLiveSendMessageData.liveMode = mo183435j().liveMode;
        bLiveSendMessageData.templateType = mo183435j().isVoiceLive() ? "profit" : "";
        if (c19938a != null) {
            BLiveSendMessageExtra bLiveSendMessageExtraNew_ = BLiveSendMessageExtra.new_();
            if (!TextUtils.isEmpty(c19938a.m183691b())) {
                bLiveSendMessageExtraNew_.groupType = c19938a.m183691b();
            }
            if (!TextUtils.isEmpty(c19938a.f165486b) && !TextUtils.isEmpty(c19938a.f165487c)) {
                BLiveAtUserInfo bLiveAtUserInfoNew_ = BLiveAtUserInfo.new_();
                bLiveAtUserInfoNew_.userId = c19938a.f165486b;
                bLiveAtUserInfoNew_.userName = c19938a.f165487c;
                bLiveSendMessageExtraNew_.atUserInfos = jyb.m147507f0(bLiveAtUserInfoNew_);
            }
            bLiveSendMessageData.extInfo = bLiveSendMessageExtraNew_;
        }
        return LivingNormalApiProvider.m72406F7(bLiveSendMessageData).map(new qcj() { // from class: l.no2
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f142904a.m168533l1((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: V */
    public void m168485V(BLiveAbsData bLiveAbsData) {
        m168488W(bLiveAbsData, 0);
    }

    /* JADX INFO: renamed from: V0 */
    public boolean mo168486V0() {
        User userM168532l0 = m168532l0();
        v5g v5gVarM168546r0 = m168546r0();
        return (userM168532l0 == null || v5gVarM168546r0 == null || v5gVarM168546r0.m199846b() == null || !this.f148256D) ? false : true;
    }

    /* JADX INFO: renamed from: V1 */
    public C22421c<uxj0> m168487V1(String str, @Nullable rz4.C19938a c19938a) {
        return m168484U1(str, 0, "voiceRoom".equals(mo118365C0()) ? "voice" : "video", "", c19938a);
    }

    /* JADX INFO: renamed from: W */
    public void m168488W(BLiveAbsData bLiveAbsData, int i) {
        if (bLiveAbsData == null) {
            return;
        }
        if (TEnum.equals(bLiveAbsData.state, "onlive")) {
            mo160116h(new j2t(i));
        } else if (TEnum.equals(bLiveAbsData.state, "stopped")) {
            mo160116h(v9s.f183031e);
        } else if (TEnum.equals(bLiveAbsData.state, "suspended")) {
            mo160116h(qcu.f156623b);
        }
    }

    /* JADX INFO: renamed from: W0 */
    public boolean mo168489W0() {
        return false;
    }

    /* JADX INFO: renamed from: W1 */
    public void m168490W1(pf2 pf2Var) {
        this.f148282z.m170284r().m98275c0(pf2Var);
    }

    /* JADX INFO: renamed from: X */
    public void m168491X(BLiveAddStickerResult bLiveAddStickerResult) {
        if (bLiveAddStickerResult == null) {
            return;
        }
        this.f148267k.onNext(bLiveAddStickerResult);
    }

    /* JADX INFO: renamed from: X0 */
    public boolean m168492X0() {
        return m202193m().m146879e();
    }

    /* JADX INFO: renamed from: X1 */
    public void m168493X1(BLiveUserMask bLiveUserMask) {
        this.f148259G = bLiveUserMask;
    }

    /* JADX INFO: renamed from: Y */
    public cxl<LiveMessage> m168494Y() {
        return this.f148282z.f150211i;
    }

    /* JADX INFO: renamed from: Y0 */
    public boolean m168495Y0() {
        return this.f148258F;
    }

    /* JADX INFO: renamed from: Y1 */
    public void m168496Y1(BLiveAbsData bLiveAbsData) {
        p1w p1wVar = this.f148282z;
        if (p1wVar != null) {
            p1wVar.m170292z(bLiveAbsData);
        }
    }

    /* JADX INFO: renamed from: Z */
    public C22421c<List<BLiveChatTip>> m168497Z() {
        return this.f148266j.asObservable();
    }

    /* JADX INFO: renamed from: Z0 */
    public boolean m168498Z0() {
        return this instanceof rwn0;
    }

    /* JADX INFO: renamed from: Z1 */
    public void m168499Z1(c0m c0mVar) {
        this.f148257E = c0mVar;
    }

    /* JADX INFO: renamed from: a0 */
    public void m168500a0(BLiveAbsData bLiveAbsData) {
        if (mo183435j() == null || bLiveAbsData == null || !TextUtils.equals(m202191k(), bLiveAbsData.f45171id)) {
            this.f148279w = true;
        }
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m168501a1(x20 x20Var, Followship followship) {
        m168482U(followship);
        if (zrv.f205799a.m207637H()) {
            mjj.m158575d();
        }
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: a2 */
    public void m168502a2(String str) {
        this.f148260d.m98476w(str);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m168503b0() {
        this.f148282z = new p1w(this.f148255C);
    }

    /* JADX INFO: renamed from: b1 */
    public final /* synthetic */ Boolean m168504b1(LongLinkLiveMessage.LiveStickerChangeMsg liveStickerChangeMsg) {
        Long l2 = this.f148275s.get(liveStickerChangeMsg.getRoomId());
        if (l2 != null && liveStickerChangeMsg.getTimestamp() <= l2.longValue()) {
            return Boolean.FALSE;
        }
        this.f148275s.put(liveStickerChangeMsg.getRoomId(), Long.valueOf(liveStickerChangeMsg.getTimestamp()));
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: b2 */
    public void m168505b2(boolean z) {
        this.f148258F = z;
    }

    /* JADX INFO: renamed from: c0 */
    public void mo146610c0(boolean z) {
        this.f148266j.onNext(null);
        this.f148279w = !z;
        this.f148280x.m195570j();
        m168475R1();
        m168478S1();
        this.f148282z.f150211i.m113048e();
        this.f148272p = null;
        if (z) {
            return;
        }
        this.f148282z.m170291y(C22507a.m222758b());
        this.f185207a.mo122885a();
        this.f148281y = null;
        if (zrv.m221195m()) {
            ((jfv) zrv.m221194l(htd0.f111520b)).m144715b();
        }
    }

    /* JADX INFO: renamed from: c1 */
    public final /* synthetic */ void m168506c1(BLiveEnvelope bLiveEnvelope) {
        BLiveHourLeaderBoard bLiveHourLeaderBoard = bLiveEnvelope.data.hourLeaderboard;
        if (bLiveHourLeaderBoard == null) {
            return;
        }
        this.f148269m.onNext(bLiveHourLeaderBoard);
        m168450D1(bLiveHourLeaderBoard.allLeaderboards);
        List<BLiveHourLeaderBoardItem> list = bLiveHourLeaderBoard.currentRoomLeaderboards;
        if ((!jyb.m147479J(list)) && (list.size() > 0)) {
            BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem = list.get(0);
            bLiveHourLeaderBoardItem.isOpen = bLiveHourLeaderBoard.isOpen;
            bLiveHourLeaderBoardItem.currentHourSuggestConfig = bLiveHourLeaderBoard.currentHourSuggestConfig;
            m168447B1(bLiveHourLeaderBoardItem);
            this.f148268l.onNext(bLiveHourLeaderBoardItem);
        }
    }

    /* JADX INFO: renamed from: c2 */
    public void mo168507c2() {
        this.f148280x.m195576p();
        this.f148258F = false;
    }

    /* JADX INFO: renamed from: d0 */
    public void m168508d0(boolean z, String str, String str2) {
        m168511e0(z, str, str2, null);
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ xxj m168509d1(uxj uxjVar, BLiveRoomTabGifts bLiveRoomTabGifts) {
        this.f148263g.onNext(Long.valueOf(bLiveRoomTabGifts.latestBagGiftUpdateTime));
        this.f148274r.onNext(bLiveRoomTabGifts.bagSystemCommentStatus);
        return cpj.m111795o(bLiveRoomTabGifts, uxjVar);
    }

    /* JADX INFO: renamed from: d2 */
    public hcr m168510d2() {
        return this.f148253A;
    }

    /* JADX INFO: renamed from: e0 */
    public void m168511e0(boolean z, String str, String str2, x20 x20Var) {
        m168513f0(z, str, str2, x20Var, null);
    }

    /* JADX INFO: renamed from: e1 */
    public final /* synthetic */ List m168512e1(uxj uxjVar, xxj xxjVar) {
        this.f148261e.onNext(xxjVar);
        if (uxjVar.m198488f()) {
            this.f148262f.onNext(xxjVar);
        }
        if (uxjVar.m198487e() != null) {
            uxjVar.m198487e().call();
        }
        return xxjVar.m213531e().m221999f();
    }

    /* JADX INFO: renamed from: e2 */
    public void mo146096e2(boolean z, BLiveAbsData bLiveAbsData) {
        oo2 oo2Var;
        boolean z2;
        BLiveAbsData bLiveAbsData2 = this.f148278v;
        if (bLiveAbsData2 == null || !TextUtils.equals(bLiveAbsData.f45171id, bLiveAbsData2.f45171id)) {
            BLiveAbsData bLiveAbsData3 = this.f148278v;
            boolean z3 = bLiveAbsData3 != null && TextUtils.equals(bLiveAbsData.room.f45267id, bLiveAbsData3.room.f45267id);
            this.f148278v = bLiveAbsData;
            if (bLiveAbsData == null || !y6s.m214494b(bLiveAbsData.liveMode)) {
                oo2Var = this;
                z2 = z;
                oo2Var.m168515f2(z2, bLiveAbsData.room.f45267id, z3, oo2Var.m202200x(), bLiveAbsData.f45171id, oo2Var.mo160117o0());
            } else if (this.f148282z.f150203a) {
                oo2Var = this;
                z2 = z;
            } else {
                oo2Var = this;
                z2 = z;
                oo2Var.m168515f2(z2, bLiveAbsData.room.f45267id, z3, m202200x(), bLiveAbsData.f45171id, mo160117o0());
            }
            if (z3) {
                return;
            }
            oo2Var.mo118372O1(z2, bLiveAbsData.f45171id, bLiveAbsData.room.f45267id);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public void m168513f0(final boolean z, String str, String str2, final x20 x20Var, final x20 x20Var2) {
        if (m168532l0() == null) {
            return;
        }
        wrv wrvVar = zrv.f205799a;
        wrvVar.m207662d(wrvVar.m207631D0(), m168532l0(), true, mo168547s0(), m202191k(), m202194o(), str, str2).subscribe(dhw.m115826e(new y20() { // from class: l.lo2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f132870a.m168501a1(x20Var, (Followship) obj);
            }
        }, new y20() { // from class: l.mo2
            @Override // p153l.y20
            public final void call(Object obj) {
                oo2.m168443Q(x20Var2, z, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f1 */
    public final /* synthetic */ void m168514f1(BLiveEnvelope bLiveEnvelope) {
        this.f148266j.onNext(bLiveEnvelope.data.chatTips);
    }

    /* JADX INFO: renamed from: f2 */
    public void m168515f2(boolean z, String str, boolean z2, String str2, String str3, String str4) {
        this.f148282z.m170276A(z, str, z2, str2, str3, str4);
    }

    /* JADX INFO: renamed from: g0 */
    public C22421c<BLiveHourLeaderBoard> m168516g0() {
        return this.f148269m.onBackpressureLatest().observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: g1 */
    public final /* synthetic */ void m168517g1(BLiveEnvelope bLiveEnvelope) {
        hcr hcrVar = new hcr(bLiveEnvelope, false);
        this.f148265i.onNext(hcrVar);
        if (this.f148253A == null) {
            this.f148253A = hcrVar;
        }
    }

    /* JADX INFO: renamed from: g2 */
    public void m168518g2(BLiveAbsData bLiveAbsData) {
        this.f148278v = null;
        p1w p1wVar = this.f148282z;
        if (p1wVar.f150203a) {
            p1wVar.m170277C();
        }
    }

    /* JADX INFO: renamed from: h0 */
    public C22421c<User> m168519h0() {
        return this.f148282z.m170278i().asObservable();
    }

    /* JADX INFO: renamed from: h1 */
    public final /* synthetic */ void m168520h1(BLiveEnvelope bLiveEnvelope) {
        this.f148270n.onNext(bLiveEnvelope.data);
    }

    /* JADX INFO: renamed from: h2 */
    public C22421c<Long> m168521h2(int i, TimeUnit timeUnit) {
        return this.f148280x.m195577q(i, timeUnit);
    }

    @Override // p153l.vp20
    /* JADX INFO: renamed from: i */
    public void mo168522i(BLiveAbsRoom bLiveAbsRoom) {
        super.mo168522i(bLiveAbsRoom);
        mo118370K1(bLiveAbsRoom.f45172id);
    }

    /* JADX INFO: renamed from: i0 */
    public C22421c<BLiveHourLeaderBoardItem> m168523i0() {
        return this.f148268l.onBackpressureLatest().observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: i1 */
    public final /* synthetic */ void m168524i1(Throwable th) {
        this.f148270n.onNext(null);
    }

    /* JADX INFO: renamed from: i2 */
    public C22421c<Long> m168525i2(TimeUnit timeUnit) {
        return this.f148280x.m195577q(1, timeUnit);
    }

    /* JADX INFO: renamed from: j0 */
    public String m168526j0() {
        User userM222761e = this.f148282z.m170278i().m222761e();
        return userM222761e != null ? userM222761e.f56859id : "";
    }

    /* JADX INFO: renamed from: j1 */
    public final /* synthetic */ void m168527j1(BLiveEnvelope bLiveEnvelope) {
        this.f148273q.onNext(new rsn0(bLiveEnvelope));
    }

    /* JADX INFO: renamed from: j2 */
    public C22421c<Long> m168528j2(int i, TimeUnit timeUnit) {
        return this.f148280x.m195578r(i, timeUnit);
    }

    /* JADX INFO: renamed from: k0 */
    public BLiveUserMask m168529k0() {
        return this.f148259G;
    }

    /* JADX INFO: renamed from: k1 */
    public final /* synthetic */ void m168530k1(BLiveChatMessage bLiveChatMessage) {
        v710.m200166d().m200168c("msg_from_request", "live.chat.msg", f7t.m124505y(bLiveChatMessage, mo168489W0()), p1w.f150202j);
    }

    /* JADX INFO: renamed from: k2 */
    public C22421c<Long> m168531k2(TimeUnit timeUnit) {
        return this.f148280x.m195578r(1, timeUnit);
    }

    /* JADX INFO: renamed from: l0 */
    public User m168532l0() {
        return this.f148282z.m170278i().m222761e();
    }

    /* JADX INFO: renamed from: l1 */
    public final /* synthetic */ uxj0 m168533l1(BLiveEnvelope bLiveEnvelope) {
        List<BLiveChatMessage> list = bLiveEnvelope.data.liveChatMessages;
        if (list != null) {
            jyb.m147537z(list, new y20() { // from class: l.co2
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f82802a.m168530k1((BLiveChatMessage) obj);
                }
            });
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: l2 */
    public void m168534l2(BLiveEnvelope bLiveEnvelope) {
        v5g v5gVarM222761e = this.f148271o.m222761e();
        if (v5gVarM222761e != null) {
            v5gVarM222761e.m199848d(bLiveEnvelope.data.fanbaseRelations);
            this.f148271o.onNext(v5gVarM222761e);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public p1w.C19272a m168535m0() {
        return this.f148282z.m170279j();
    }

    /* JADX INFO: renamed from: m1 */
    public C22421c<hcr> m168536m1() {
        return this.f148265i;
    }

    /* JADX INFO: renamed from: m2 */
    public C22421c<uxj0> m168537m2() {
        return aiv.m98087c1();
    }

    /* JADX INFO: renamed from: n0 */
    public BLiveAbsData m168538n0() {
        return this.f148278v;
    }

    /* JADX INFO: renamed from: n1 */
    public C22421c<LiveControlMessage> m168539n1() {
        return this.f148282z.m170284r().m98338y();
    }

    /* JADX INFO: renamed from: n2 */
    public void m168540n2() {
        aiv.m98090d1();
    }

    /* JADX INFO: renamed from: o0 */
    public String mo160117o0() {
        return m168458I0().m98478a() == null ? "" : m168458I0().m98478a();
    }

    /* JADX INFO: renamed from: o1 */
    public C22421c<LiveControlMessage> m168541o1(Act act) {
        if (this.f148272p == null) {
            this.f148272p = new pc2<>(this.f148282z.m170284r().f71692a);
        }
        return this.f148272p.m171630l(act).onBackpressureBuffer(20000L).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: p0 */
    public int m168542p0() {
        return this.f148280x.m195572l();
    }

    /* JADX INFO: renamed from: p1 */
    public C22421c<xxj> m168543p1() {
        return this.f148262f;
    }

    /* JADX INFO: renamed from: q0 */
    public C22421c<v5g> m168544q0() {
        return this.f148271o.onBackpressureBuffer(20000L).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: q1 */
    public aj1 m168545q1() {
        return this.f148282z.m170284r();
    }

    /* JADX INFO: renamed from: r0 */
    public v5g m168546r0() {
        return this.f148271o.m222761e();
    }

    /* JADX INFO: renamed from: r1 */
    public abstract void mo118374r1(String str, String str2, boolean z);

    /* JADX INFO: renamed from: s0 */
    public String mo168547s0() {
        return "liveRoom";
    }

    /* JADX INFO: renamed from: s1 */
    public C22421c<LivingUsers<BLiveMember>> m168548s1() {
        return this.f148264h;
    }

    /* JADX INFO: renamed from: t0 */
    public C22421c<Followship> m168549t0() {
        return this.f148282z.m170281l().asObservable();
    }

    /* JADX INFO: renamed from: t1 */
    public C22421c<Long> m168550t1() {
        return ((hiv) zrv.m221194l(htd0.f111521c)).m135156h();
    }

    /* JADX INFO: renamed from: u0 */
    public Followship m168551u0() {
        return this.f148282z.m170282m();
    }

    /* JADX INFO: renamed from: u1 */
    public boolean m168552u1() {
        return this.f148279w;
    }

    /* JADX INFO: renamed from: v0 */
    public C22421c<BLiveGiftBubbleConfig> m168553v0(String str) {
        return aiv.m98143v0(str, m168532l0().f56859id, m202191k(), m202194o());
    }

    /* JADX INFO: renamed from: v1 */
    public long m168554v1() {
        return this.f148280x.m195575o().longValue();
    }

    /* JADX INFO: renamed from: w0 */
    public BLiveGiftItem m168555w0(int i) {
        return ((hiv) zrv.m221194l(htd0.f111521c)).m135160l(i);
    }

    /* JADX INFO: renamed from: w1 */
    public C22421c<Long> m168556w1(int i, TimeUnit timeUnit) {
        return this.f148280x.m195577q(i, timeUnit).take(1);
    }

    /* JADX INFO: renamed from: x0 */
    public C22421c<LongLinkLeaderboard.GiftStarLeaderboardChangeMessage> m168557x0() {
        return this.f148282z.m170284r().m98298k();
    }

    /* JADX INFO: renamed from: x1 */
    public BLiveOperation m168558x1() {
        return this.f148276t;
    }

    /* JADX INFO: renamed from: y0 */
    public JumpRoomData mo146616y0() {
        return null;
    }

    /* JADX INFO: renamed from: y1 */
    public void m168559y1(String str) {
        LivingNormalApiProvider.m72396E6(str, mo183435j().liveMode).subscribe(dhw.m115829h(new y20() { // from class: l.bo2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f77607a.m168506c1((BLiveEnvelope) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z0 */
    public C22421c<LongLinkReportMsg.LiveReportMsg> m168560z0() {
        return m168545q1().m98262X();
    }

    /* JADX INFO: renamed from: z1 */
    public C22421c<BLiveData> m168561z1() {
        return this.f148270n.asObservable();
    }
}
