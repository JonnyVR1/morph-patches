package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.data.Followship;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveConfig;
import com.p046p1.mobile.putong.live.base.data.BLivePkContributor;
import com.p046p1.mobile.putong.live.base.data.BLivePkCurrentStageInfo;
import com.p046p1.mobile.putong.live.base.data.BLivePkOwner;
import com.p046p1.mobile.putong.live.base.data.BLivePkPointList;
import com.p046p1.mobile.putong.live.base.data.BLivePkStage;
import com.p046p1.mobile.putong.live.base.data.BLiveSettings;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LivePkMessage;
import com.p046p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p046p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomType;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.PkAction;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.bean.PkData;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.internal.PkViewInternal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes5.dex */
public class ez70 extends pat<pn40> {

    /* JADX INFO: renamed from: i */
    public PkViewInternal f93874i;

    /* JADX INFO: renamed from: j */
    public mp70 f93875j;

    /* JADX INFO: renamed from: k */
    public PkData f93876k;

    /* JADX INFO: renamed from: l */
    public c4g0 f93877l;

    /* JADX INFO: renamed from: m */
    public String f93878m;

    public ez70(bsm bsmVar, mp70 mp70Var, PkViewInternal pkViewInternal) {
        super(bsmVar);
        this.f93874i = pkViewInternal;
        this.f93875j = mp70Var;
    }

    /* JADX INFO: renamed from: V3 */
    public static /* synthetic */ void m118862V3(Throwable th) {
    }

    /* JADX INFO: renamed from: a4 */
    public static /* synthetic */ void m118867a4(Throwable th) {
        if ((th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).isFollowForbidden()) {
            lsi0.m151593w(R$string.f47157c);
        } else {
            lsi0.m151593w(R$string.f46715H4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q4 */
    public /* synthetic */ void m118868q4(LivePkMessage livePkMessage) {
        if (this.f93875j.f135015i.m180307S3()) {
            m118886s4(livePkMessage);
        }
    }

    /* JADX INFO: renamed from: A4 */
    public final void m118869A4(Long l2) {
        PkData pkData = this.f93876k;
        if (pkData == null) {
            return;
        }
        long jM155944o = (long) (mqi0.m155944o() - (Double.valueOf(pkData.f51567pk.situation.currentStageInfo.startTs).doubleValue() / 1000000.0d));
        BLivePkCurrentStageInfo bLivePkCurrentStageInfo = this.f93876k.f51567pk.situation.currentStageInfo;
        BLivePkStage bLivePkStage = bLivePkCurrentStageInfo.stage;
        int i = (int) (((long) bLivePkCurrentStageInfo.duration) - (jM155944o / 1000));
        if (i % 15 == 0) {
            ht70.m132853j("process module remainTime = " + i);
        }
        if (i < 0) {
            mkd0.m154992z(this.f93877l);
            this.f93875j.mo119102V3(PkAction.ACTION_TIME_OUT.setExtra(bLivePkStage.toString()));
            this.f93874i.m76093A0(0);
        } else {
            this.f93874i.m76093A0(i);
        }
        if (this.f93876k.isPlaying()) {
            this.f93875j.f135019m.m114667K3(this.f93876k.f51567pk.pkPlayingBuffInfo);
            this.f93875j.f135020n.m155131R3(this.f93876k.f51567pk.players);
            if (i <= 10) {
                this.f93874i.m76125x0(i);
            }
        }
        if (this.f93876k.isPunishing() && i <= 20) {
            this.f93874i.m76121v0(false);
        }
        if (ypv.m215672k().m195752V4() && this.f93876k.isPlaying() && i <= ypv.m215672k().m195744U4()) {
            hfw.m130790a("LivePkConstant", "winTimesTag on:" + ypv.m215672k().m195752V4() + ",showTagBeforeEnd:" + ypv.m215672k().m195744U4());
            if (this.f93876k.getAnchorWinTimes() >= 2) {
                this.f93875j.f135018l.m194318X3();
            }
            this.f93874i.m76112j0(false, this.f93876k);
        }
    }

    /* JADX INFO: renamed from: b4 */
    public final void m118870b4(String str) {
        ht70.m132853j("addPkMotion path=" + str);
        this.f93878m = str;
        pph0 pph0VarM175842b = qph0.m175841a().m175842b(act(), str);
        if (pph0VarM175842b != null) {
            ((bxl) m129297F3(new bu00(600))).mo71853B(1001, pph0VarM175842b);
        }
    }

    /* JADX INFO: renamed from: c4 */
    public void m118871c4(long j) {
        BLiveConfig bLiveConfig;
        BLiveSettings bLiveSettingsM195583A3 = ypv.m215672k().m195583A3();
        if (bLiveSettingsM195583A3 == null || (bLiveConfig = bLiveSettingsM195583A3.liveConfig) == null || bLiveConfig.f44352pk == null) {
            return;
        }
        a180.m94514n().m94520k(bLiveSettingsM195583A3.liveConfig.f44352pk.victoryMotionId, j, new ty70(this));
    }

    /* JADX INFO: renamed from: d4 */
    public void m118872d4() {
        mkd0.m154992z(this.f93877l);
        this.f93876k = null;
        this.f93878m = null;
        this.f93874i.m76094B();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [l.ho2] */
    /* JADX INFO: renamed from: e4 */
    public void m118873e4(boolean z) {
        if (this.f93876k == null) {
            return;
        }
        if (z) {
            zcu.m218088c(this.f93875j.mo77274R2(), sds.m183540k().m183543b(m206027E2(), false).m183549h(this.f93876k.otherUserId()).m183546e("live_pk_main").m183542a());
        }
        vpv vpvVar = ypv.f199493a;
        duringCreated(vpvVar.m199340d(vpvVar.m199309D0(), this.f93876k.otherUser(), true, "liveRoom", null, ((pn40) m206027E2()).m149818o(), mo77274R2(), "live_pk_main")).observeOn(jo0.m142408a()).subscribe(ffw.m121194e(new e30() { // from class: l.xy70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f195032a.m118877i4((Followship) obj);
            }
        }, new e30() { // from class: l.yy70
            @Override // p149l.e30
            public final void call(Object obj) {
                ez70.m118867a4((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f4 */
    public void m118874f4(final PkData pkData) {
        duringCreated((C22306c) ((pn40) m206027E2()).m132151m2().onErrorReturn(new w9j() { // from class: l.oy70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        }).flatMap(new w9j() { // from class: l.py70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m71574s7(pkData.otherUserId(), "");
            }
        })).subscribe(ffw.m121194e(new e30() { // from class: l.qy70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f156907a.m118878j4((User) obj);
            }
        }, new e30() { // from class: l.ry70
            @Override // p149l.e30
            public final void call(Object obj) {
                ez70.m118862V3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g4 */
    public boolean m118875g4(User user) {
        return user.matchedOrFollowed();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h4 */
    public final void m118876h4() {
        PkData pkData = this.f93876k;
        if (pkData == null) {
            return;
        }
        BLivePkOwner bLivePkOwner = (BLivePkOwner) vwb.m200346r(pkData.f51567pk.players, new w9j() { // from class: l.sy70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f166917a.m118879k4((BLivePkOwner) obj);
            }
        });
        zcu.m218093h(h7d0.m129655x().m129668g(bLivePkOwner.userId).m129679r(bLivePkOwner.liveId).m129682u("onlive").m129684w("e_pk_gotoliveroom_button").m129662a(), this.f93875j.mo77274R2());
        m206028F2().JumpRoomEvent.jumpRoom().mo172463j(new JumpRoomData.C12761a().m73031t(((pn40) m206027E2()).mo132155o0()).m73029r(((pn40) m206027E2()).m149814k()).m73030s(((pn40) m206027E2()).mo149813j().room.f44419id).m73028q(((pn40) m206027E2()).m132146l0().name).m73033v(bLivePkOwner.liveId).m73034w(bLivePkOwner.roomId).m73032u(((pn40) m206027E2()).mo132155o0()).m73025n(JumpRoomType.CHANGE_SOURCE_WITH_BACK).m73024m());
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m118877i4(Followship followship) {
        PkData pkData = this.f93876k;
        if (pkData == null) {
            return;
        }
        pkData.otherUser().localFollowship = followship;
        if (Followship.isFollowed(followship)) {
            lsi0.m151593w(R$string.f46803L4);
        }
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m118878j4(User user) {
        this.f93874i.m76126y(m118875g4(user), user, false);
        ((idv) ypv.m215673l(fld0.f98147b)).m135629a(user);
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ Boolean m118879k4(BLivePkOwner bLivePkOwner) {
        return Boolean.valueOf(t0g0.m186871l(bLivePkOwner.userId, this.f93876k.otherUserId()));
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m118880l4(ArrayList arrayList, ArrayList arrayList2, List list, List list2, LongLinkLiveMessage.PkUserPoints pkUserPoints) {
        arrayList.add(pkUserPoints.getUserId());
        arrayList2.add(String.valueOf(pkUserPoints.getPoints()));
        boolean zEquals = TextUtils.equals(pkUserPoints.getUserId(), this.f93876k.getAnchorId());
        for (LongLinkLiveMessage.PkContributor pkContributor : pkUserPoints.getContributionsList()) {
            BLivePkContributor bLivePkContributorNew_ = BLivePkContributor.new_();
            bLivePkContributorNew_.userId = pkContributor.getUserId();
            bLivePkContributorNew_.name = pkContributor.getName();
            bLivePkContributorNew_.image = pkContributor.getImage();
            bLivePkContributorNew_.point = pkContributor.getPoint();
            if (zEquals) {
                list.add(bLivePkContributorNew_);
            } else {
                list2.add(bLivePkContributorNew_);
            }
        }
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ Boolean m118881m4(BLivePkOwner bLivePkOwner) {
        return Boolean.valueOf(t0g0.m186871l(bLivePkOwner.userId, this.f93876k.otherUserId()));
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        this.f93876k = null;
        mkd0.m154992z(this.f93877l);
        this.f93874i.m76094B();
    }

    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ Boolean m118882n4(User user) {
        PkData pkData = this.f93876k;
        return Boolean.valueOf(pkData != null && TextUtils.equals(user.f56011id, pkData.otherUserId()));
    }

    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ void m118883o4(User user) {
        User userM135637i = ((idv) ypv.m215673l(fld0.f98147b)).m135637i(this.f93876k.otherUserId());
        if (userM135637i != null) {
            this.f93874i.m76126y(m118875g4(userM135637i), userM135637i, true);
        }
    }

    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ void m118884p4(C4319c c4319c) {
        if (m206032L2() && c4319c == C4319c.f15548i && !TextUtils.isEmpty(this.f93878m)) {
            m118870b4(this.f93878m);
        }
    }

    /* JADX INFO: renamed from: r4 */
    public boolean m118885r4() {
        PkData pkData = this.f93876k;
        return (pkData == null || pkData.f51567pk.situation.isTied) ? false : true;
    }

    /* JADX INFO: renamed from: s4 */
    public void m118886s4(LivePkMessage livePkMessage) {
        if (this.f93876k == null || !TextUtils.equals(livePkMessage.pkPunishMotion.getPkId(), this.f93876k.f51567pk.f44421id)) {
            return;
        }
        a180.m94514n().m94520k(livePkMessage.pkPunishMotion.getMotionId(), livePkMessage.getPkMvpGrade(), new ty70(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(((idv) ypv.m215673l(fld0.f98147b)).m135635g()).filter(new w9j() { // from class: l.zy70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f205667a.m118882n4((User) obj);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.az70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f72339a.m118883o4((User) obj);
            }
        }));
        lifecycle().subscribe(ffw.m121193d(new e30() { // from class: l.bz70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f78007a.m118884p4((C4319c) obj);
            }
        }));
        duringCreated(((pn40) m206027E2()).m132160q1().m189074U()).filter(new w9j() { // from class: l.cz70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((LivePkMessage) obj).type, "pk_punish_motion"));
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.dz70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f88459a.m118868q4((LivePkMessage) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public void m118887t4() {
        this.f93874i.m76104a0();
        mkd0.m154992z(this.f93877l);
        this.f93878m = null;
    }

    /* JADX INFO: renamed from: u4 */
    public void m118888u4(LivePkMessage livePkMessage) {
        if (this.f93876k == null) {
            return;
        }
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList();
        final ArrayList arrayList4 = new ArrayList();
        vwb.m200354z(livePkMessage.userPoints, new e30() { // from class: l.ny70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f141088a.m118880l4(arrayList, arrayList2, arrayList3, arrayList4, (LongLinkLiveMessage.PkUserPoints) obj);
            }
        });
        if (this.f93876k.isPlaying()) {
            BLivePkPointList bLivePkPointList = this.f93876k.f51567pk.situation.points;
            bLivePkPointList.userId = arrayList;
            bLivePkPointList.point = arrayList2;
        }
        this.f93874i.m76113k0(this.f93876k.otherUserId(), arrayList, arrayList2);
        this.f93874i.m76111h0(arrayList3, arrayList4, false, false, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v4 */
    public void m118889v4(boolean z, PkData pkData, boolean z2) {
        if (((pn40) m206027E2()).mo149813j() == null || TextUtils.isEmpty(((pn40) m206027E2()).m149814k()) || pkData.isSameStatus(this.f93876k) || pkData.isUnknown()) {
            return;
        }
        if (this.f93876k == null) {
            m118874f4(pkData);
        }
        this.f93876k = pkData;
        if (pkData.isPreparing()) {
            return;
        }
        this.f93874i.m76106c0(this.f93876k, z2, z);
        m118869A4(0L);
        m118893z4();
        ht70.m132859p(pkData, this.f93874i, z2);
    }

    /* JADX INFO: renamed from: w4 */
    public void m118890w4(d30 d30Var) {
        Dialog.C4309e c4309eM20503E0 = act().dialog().m20503E0(R$string.f47563ua);
        int i = R$string.f47423o2;
        Objects.requireNonNull(d30Var);
        Dialog.C4309e c4309eM20541k0 = c4309eM20503E0.m20556t0(i, new bii0(d30Var)).m20541k0(R$string.f47662z);
        if (m118885r4()) {
            c4309eM20541k0.m20504F(ypv.m215672k().m195840g5(this.f93875j.mo151135U3(), this.f93876k.isPlaying()));
        }
        c4309eM20541k0.m20568z0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x4 */
    public void m118891x4() {
        PkData pkData = this.f93876k;
        if (pkData == null) {
            return;
        }
        BLivePkOwner bLivePkOwner = (BLivePkOwner) vwb.m200346r(pkData.f51567pk.players, new w9j() { // from class: l.vy70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f183503a.m118881m4((BLivePkOwner) obj);
            }
        });
        m206028F2().OpenUserCardDialogEvent.show().mo172463j(new UserCardData.Builder(600).userId(this.f93876k.otherUserId()).setSource("live").setFromIdentity(bqq.m103386a(this, ((pn40) m206027E2()).m132146l0().f56011id, this.f93876k.otherUserId(), 600)).setTo("pkAnchor").setScene("pk").jumpToOtherRoom(bLivePkOwner.liveId, bLivePkOwner.roomId, new d30() { // from class: l.wy70
            @Override // p149l.d30
            public final void call() {
                this.f188549a.m118876h4();
            }
        }).build());
    }

    /* JADX INFO: renamed from: y4 */
    public void m118892y4(boolean z) {
        xdl0.m208344M(this.f93874i, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z4 */
    public final void m118893z4() {
        mkd0.m154992z(this.f93877l);
        this.f93877l = m129299H3(((pn40) m206027E2()).m132139i2(TimeUnit.SECONDS)).subscribe(ffw.m121193d(new e30() { // from class: l.uy70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f178832a.m118869A4((Long) obj);
            }
        }));
    }
}
