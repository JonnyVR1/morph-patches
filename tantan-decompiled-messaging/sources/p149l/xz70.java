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
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.PkView;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.bean.PkData;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes5.dex */
public class xz70 extends pat<pn40> {

    /* JADX INFO: renamed from: i */
    public PkView f195169i;

    /* JADX INFO: renamed from: j */
    public my70 f195170j;

    /* JADX INFO: renamed from: k */
    public PkData f195171k;

    /* JADX INFO: renamed from: l */
    public c4g0 f195172l;

    /* JADX INFO: renamed from: m */
    public String f195173m;

    public xz70(bsm bsmVar, my70 my70Var, PkView pkView) {
        super(bsmVar);
        this.f195169i = pkView;
        this.f195170j = my70Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B4 */
    private void m211899B4() {
        mkd0.m154992z(this.f195172l);
        this.f195172l = m129299H3(((pn40) m206027E2()).m132139i2(TimeUnit.SECONDS)).subscribe(ffw.m121193d(new e30() { // from class: l.mz70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f136352a.m211900C4((Long) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C4 */
    public void m211900C4(Long l2) {
        PkData pkData = this.f195171k;
        if (pkData == null) {
            return;
        }
        BLivePkCurrentStageInfo bLivePkCurrentStageInfo = pkData.f51567pk.situation.currentStageInfo;
        long jM155944o = (long) (mqi0.m155944o() - (Double.valueOf(bLivePkCurrentStageInfo.startTs).doubleValue() / 1000000.0d));
        BLivePkStage bLivePkStage = bLivePkCurrentStageInfo.stage;
        int i = (int) (((long) bLivePkCurrentStageInfo.duration) - (jM155944o / 1000));
        if (i % 15 == 0) {
            ht70.m132853j("process module remainTime = " + i);
        }
        if (i < 0) {
            mkd0.m154992z(this.f195172l);
            this.f195170j.mo127905V3(PkAction.ACTION_TIME_OUT.setExtra(bLivePkStage.toString()));
            this.f195169i.m76038o0(0);
        } else {
            this.f195169i.m76038o0(i);
        }
        if (this.f195171k.isPlaying() && i <= 10) {
            this.f195169i.m76034l0(i);
        }
        if (this.f195171k.isPunishing() && i <= 20) {
            this.f195169i.m76032j0(false);
        }
        if (ypv.m215672k().m195752V4() && this.f195171k.isPlaying() && i <= ypv.m215672k().m195744U4()) {
            hfw.m130790a("LivePkConstant", "winTimesTag on:" + ypv.m215672k().m195752V4() + ",showTagBeforeEnd:" + ypv.m215672k().m195744U4());
            this.f195170j.m156983d4();
        }
    }

    /* JADX INFO: renamed from: L3 */
    public static /* synthetic */ void m211903L3(Throwable th) {
        if ((th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).isFollowForbidden()) {
            lsi0.m151593w(R$string.f47157c);
        } else {
            lsi0.m151593w(R$string.f46715H4);
        }
    }

    /* JADX INFO: renamed from: O3 */
    public static /* synthetic */ void m211906O3(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c4 */
    public void m211919c4(String str) {
        ht70.m132853j("addPkMotion path=" + str);
        this.f195173m = str;
        pph0 pph0VarM175842b = qph0.m175841a().m175842b(act(), str);
        if (pph0VarM175842b != null) {
            ((bxl) m129297F3(new bu00(600))).mo71853B(1001, pph0VarM175842b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i4 */
    public void m211920i4() {
        PkData pkData = this.f195171k;
        if (pkData == null) {
            return;
        }
        BLivePkOwner bLivePkOwner = (BLivePkOwner) vwb.m200346r(pkData.f51567pk.players, new w9j() { // from class: l.nz70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f141193a.m211932l4((BLivePkOwner) obj);
            }
        });
        zcu.m218093h(h7d0.m129655x().m129668g(bLivePkOwner.userId).m129679r(bLivePkOwner.liveId).m129682u("onlive").m129684w("e_pk_gotoliveroom_button").m129662a(), this.f195170j.mo77274R2());
        m206028F2().JumpRoomEvent.jumpRoom().mo172463j(new JumpRoomData.C12761a().m73031t(((pn40) m206027E2()).mo132155o0()).m73029r(((pn40) m206027E2()).m149814k()).m73030s(((pn40) m206027E2()).mo149813j().room.f44419id).m73028q(((pn40) m206027E2()).m132146l0().name).m73033v(bLivePkOwner.liveId).m73034w(bLivePkOwner.roomId).m73032u(((pn40) m206027E2()).mo132155o0()).m73025n(JumpRoomType.CHANGE_SOURCE_WITH_BACK).m73024m());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o4 */
    public /* synthetic */ Boolean m211921o4(User user) {
        PkData pkData = this.f195171k;
        return Boolean.valueOf(pkData != null && TextUtils.equals(user.f56011id, pkData.otherUserId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p4 */
    public /* synthetic */ void m211922p4(User user) {
        User userM135637i = ((idv) ypv.m215673l(fld0.f98147b)).m135637i(this.f195171k.otherUserId());
        if (userM135637i != null) {
            this.f195169i.m76041s(m211929h4(userM135637i), userM135637i, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q4 */
    public /* synthetic */ void m211923q4(C4319c c4319c) {
        if (m206032L2() && c4319c == C4319c.f15548i && !TextUtils.isEmpty(this.f195173m)) {
            m211919c4(this.f195173m);
        }
    }

    /* JADX INFO: renamed from: A4 */
    public void m211924A4(boolean z) {
        xdl0.m208344M(this.f195169i, z);
    }

    /* JADX INFO: renamed from: d4 */
    public void m211925d4(long j) {
        BLiveConfig bLiveConfig;
        BLiveSettings bLiveSettingsM195583A3 = ypv.m215672k().m195583A3();
        if (bLiveSettingsM195583A3 == null || (bLiveConfig = bLiveSettingsM195583A3.liveConfig) == null || bLiveConfig.f44352pk == null) {
            return;
        }
        a180.m94514n().m94520k(bLiveSettingsM195583A3.liveConfig.f44352pk.victoryMotionId, j, new lz70(this));
    }

    /* JADX INFO: renamed from: e4 */
    public void m211926e4() {
        mkd0.m154992z(this.f195172l);
        this.f195171k = null;
        this.f195173m = null;
        this.f195169i.m76043v();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [l.ho2] */
    /* JADX INFO: renamed from: f4 */
    public void m211927f4(boolean z) {
        if (this.f195171k == null) {
            return;
        }
        if (z) {
            zcu.m218088c(this.f195170j.mo77274R2(), sds.m183540k().m183543b(m206027E2(), false).m183549h(this.f195171k.otherUserId()).m183546e("live_pk_main").m183542a());
        }
        vpv vpvVar = ypv.f199493a;
        duringCreated(vpvVar.m199340d(vpvVar.m199309D0(), this.f195171k.otherUser(), true, "liveRoom", null, ((pn40) m206027E2()).m149818o(), mo77274R2(), "live_pk_main")).observeOn(jo0.m142408a()).subscribe(ffw.m121194e(new e30() { // from class: l.fz70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f99938a.m211930j4((Followship) obj);
            }
        }, new e30() { // from class: l.oz70
            @Override // p149l.e30
            public final void call(Object obj) {
                xz70.m211903L3((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g4 */
    public void m211928g4(final PkData pkData) {
        duringCreated((C22306c) ((pn40) m206027E2()).m132151m2().onErrorReturn(new w9j() { // from class: l.hz70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        }).flatMap(new w9j() { // from class: l.iz70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m71574s7(pkData.otherUserId(), "");
            }
        })).subscribe(ffw.m121194e(new e30() { // from class: l.jz70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f120357a.m211931k4((User) obj);
            }
        }, new e30() { // from class: l.kz70
            @Override // p149l.e30
            public final void call(Object obj) {
                xz70.m211906O3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h4 */
    public boolean m211929h4(User user) {
        return user.matchedOrFollowed();
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m211930j4(Followship followship) {
        PkData pkData = this.f195171k;
        if (pkData == null) {
            return;
        }
        pkData.otherUser().localFollowship = followship;
        if (Followship.isFollowed(followship)) {
            lsi0.m151593w(R$string.f46803L4);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m211931k4(User user) {
        this.f195169i.m76041s(m211929h4(user), user, false);
        ((idv) ypv.m215673l(fld0.f98147b)).m135629a(user);
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ Boolean m211932l4(BLivePkOwner bLivePkOwner) {
        return Boolean.valueOf(t0g0.m186871l(bLivePkOwner.userId, this.f195171k.otherUserId()));
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ void m211933m4(ArrayList arrayList, ArrayList arrayList2, List list, List list2, LongLinkLiveMessage.PkUserPoints pkUserPoints) {
        arrayList.add(pkUserPoints.getUserId());
        arrayList2.add(String.valueOf(pkUserPoints.getPoints()));
        boolean zEquals = TextUtils.equals(pkUserPoints.getUserId(), this.f195171k.getAnchorId());
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

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        this.f195171k = null;
        mkd0.m154992z(this.f195172l);
        this.f195169i.m76043v();
    }

    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ Boolean m211934n4(BLivePkOwner bLivePkOwner) {
        return Boolean.valueOf(t0g0.m186871l(bLivePkOwner.userId, this.f195171k.otherUserId()));
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ Boolean m211935r4(LivePkMessage livePkMessage) {
        return Boolean.valueOf(this.f195170j.f136259i.m99908S3());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(((idv) ypv.m215673l(fld0.f98147b)).m135635g()).filter(new w9j() { // from class: l.sz70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f167022a.m211921o4((User) obj);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.tz70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f172688a.m211922p4((User) obj);
            }
        }));
        lifecycle().subscribe(ffw.m121193d(new e30() { // from class: l.uz70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f178963a.m211923q4((C4319c) obj);
            }
        }));
        duringCreated(((pn40) m206027E2()).m132160q1().m189074U()).filter(new w9j() { // from class: l.vz70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((LivePkMessage) obj).type, "pk_punish_motion"));
            }
        }).filter(new w9j() { // from class: l.wz70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f188710a.m211935r4((LivePkMessage) obj);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.gz70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f105110a.m211936s4((LivePkMessage) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public boolean m211937t4() {
        PkData pkData = this.f195171k;
        return (pkData == null || pkData.f51567pk.situation.isTied) ? false : true;
    }

    /* JADX INFO: renamed from: u4, reason: merged with bridge method [inline-methods] */
    public void m211936s4(LivePkMessage livePkMessage) {
        if (this.f195171k == null || !TextUtils.equals(livePkMessage.pkPunishMotion.getPkId(), this.f195171k.f51567pk.f44421id)) {
            return;
        }
        a180.m94514n().m94520k(livePkMessage.pkPunishMotion.getMotionId(), livePkMessage.getPkMvpGrade(), new lz70(this));
    }

    /* JADX INFO: renamed from: v4 */
    public void m211939v4() {
        this.f195170j.m156982c4();
        this.f195169i.m76014Q();
        mkd0.m154992z(this.f195172l);
        this.f195173m = null;
    }

    /* JADX INFO: renamed from: w4 */
    public void m211940w4(LivePkMessage livePkMessage) {
        if (this.f195171k == null) {
            return;
        }
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList();
        final ArrayList arrayList4 = new ArrayList();
        vwb.m200354z(livePkMessage.userPoints, new e30() { // from class: l.pz70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f151920a.m211933m4(arrayList, arrayList2, arrayList3, arrayList4, (LongLinkLiveMessage.PkUserPoints) obj);
            }
        });
        if (this.f195171k.isPlaying()) {
            BLivePkPointList bLivePkPointList = this.f195171k.f51567pk.situation.points;
            bLivePkPointList.userId = arrayList;
            bLivePkPointList.point = arrayList2;
        }
        this.f195169i.m76022Y(this.f195171k.otherUserId(), arrayList, arrayList2);
        this.f195169i.m76020W(arrayList3, arrayList4, false, false, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x4 */
    public void m211941x4(boolean z, PkData pkData, boolean z2) {
        if (((pn40) m206027E2()).mo149813j() == null || TextUtils.isEmpty(((pn40) m206027E2()).m149814k()) || pkData.isSameStatus(this.f195171k) || pkData.isUnknown()) {
            return;
        }
        if (this.f195171k == null) {
            m211928g4(pkData);
        }
        this.f195171k = pkData;
        if (pkData.isPreparing()) {
            return;
        }
        this.f195169i.m76015R(this.f195171k, z2, z);
        m211900C4(0L);
        m211899B4();
        ht70.m132859p(pkData, this.f195169i, z2);
    }

    /* JADX INFO: renamed from: y4 */
    public void m211942y4(d30 d30Var) {
        Dialog.C4309e c4309eM20503E0 = act().dialog().m20503E0(R$string.f47563ua);
        int i = R$string.f47423o2;
        Objects.requireNonNull(d30Var);
        Dialog.C4309e c4309eM20541k0 = c4309eM20503E0.m20556t0(i, new bii0(d30Var)).m20541k0(R$string.f47662z);
        if (m211937t4()) {
            c4309eM20541k0.m20504F(ypv.m215672k().m195840g5(this.f195170j.mo127904U3(), this.f195171k.isPlaying()));
        }
        c4309eM20541k0.m20568z0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z4 */
    public void m211943z4() {
        PkData pkData = this.f195171k;
        if (pkData == null) {
            return;
        }
        BLivePkOwner bLivePkOwner = (BLivePkOwner) vwb.m200346r(pkData.f51567pk.players, new w9j() { // from class: l.qz70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f157005a.m211934n4((BLivePkOwner) obj);
            }
        });
        m206028F2().OpenUserCardDialogEvent.show().mo172463j(new UserCardData.Builder(600).userId(this.f195171k.otherUserId()).setSource("live").setFromIdentity(bqq.m103386a(this, ((pn40) m206027E2()).m132146l0().f56011id, this.f195171k.otherUserId(), 600)).setTo("pkAnchor").setScene("pk").jumpToOtherRoom(bLivePkOwner.liveId, bLivePkOwner.roomId, new d30() { // from class: l.rz70
            @Override // p149l.d30
            public final void call() {
                this.f161612a.m211920i4();
            }
        }).build());
    }
}
