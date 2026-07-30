package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.data.Followship;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveConfig;
import com.p051p1.mobile.putong.live.base.data.BLivePkContributor;
import com.p051p1.mobile.putong.live.base.data.BLivePkCurrentStageInfo;
import com.p051p1.mobile.putong.live.base.data.BLivePkOwner;
import com.p051p1.mobile.putong.live.base.data.BLivePkPointList;
import com.p051p1.mobile.putong.live.base.data.BLivePkStage;
import com.p051p1.mobile.putong.live.base.data.BLiveSettings;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LivePkMessage;
import com.p051p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p051p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomType;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.PkAction;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.PkView;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.bean.PkData;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
public class d880 extends qct<dw40> {

    /* JADX INFO: renamed from: i */
    public PkView f85585i;

    /* JADX INFO: renamed from: j */
    public s680 f85586j;

    /* JADX INFO: renamed from: k */
    public PkData f85587k;

    /* JADX INFO: renamed from: l */
    public kcg0 f85588l;

    /* JADX INFO: renamed from: m */
    public String f85589m;

    public d880(dum dumVar, s680 s680Var, PkView pkView) {
        super(dumVar);
        this.f85585i = pkView;
        this.f85586j = s680Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B4 */
    private void m114786B4() {
        psd0.m173633z(this.f85588l);
        this.f85588l = m138858H3(((dw40) m213810E2()).m168525i2(TimeUnit.SECONDS)).subscribe(dhw.m115825d(new y20() { // from class: l.s780
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f166650a.m114787C4((Long) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C4 */
    public void m114787C4(Long l2) {
        PkData pkData = this.f85587k;
        if (pkData == null) {
            return;
        }
        BLivePkCurrentStageInfo bLivePkCurrentStageInfo = pkData.f52415pk.situation.currentStageInfo;
        long jM174454o = (long) (pzi0.m174454o() - (Double.valueOf(bLivePkCurrentStageInfo.startTs).doubleValue() / 1000000.0d));
        BLivePkStage bLivePkStage = bLivePkCurrentStageInfo.stage;
        int i = (int) (((long) bLivePkCurrentStageInfo.duration) - (jM174454o / 1000));
        if (i % 15 == 0) {
            n180.m161093j("process module remainTime = " + i);
        }
        if (i < 0) {
            psd0.m173633z(this.f85588l);
            this.f85586j.mo156628V3(PkAction.ACTION_TIME_OUT.setExtra(bLivePkStage.toString()));
            this.f85585i.m77221o0(0);
        } else {
            this.f85585i.m77221o0(i);
        }
        if (this.f85587k.isPlaying() && i <= 10) {
            this.f85585i.m77217l0(i);
        }
        if (this.f85587k.isPunishing() && i <= 20) {
            this.f85585i.m77215j0(false);
        }
        if (zrv.m221193k().m203539V4() && this.f85587k.isPlaying() && i <= zrv.m221193k().m203531U4()) {
            fhw.m125605a("LivePkConstant", "winTimesTag on:" + zrv.m221193k().m203539V4() + ",showTagBeforeEnd:" + zrv.m221193k().m203531U4());
            this.f85586j.m184867d4();
        }
    }

    /* JADX INFO: renamed from: L3 */
    public static /* synthetic */ void m114790L3(Throwable th) {
        if ((th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).isFollowForbidden()) {
            o1j0.m165649w(R$string.f48005c);
        } else {
            o1j0.m165649w(R$string.f47563H4);
        }
    }

    /* JADX INFO: renamed from: O3 */
    public static /* synthetic */ void m114793O3(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c4 */
    public void m114806c4(String str) {
        n180.m161093j("addPkMotion path=" + str);
        this.f85589m = str;
        wxh0 wxh0VarM213525b = xxh0.m213524a().m213525b(act(), str);
        if (wxh0VarM213525b != null) {
            ((uzl) m138856F3(new k210(600))).mo73036B(1001, wxh0VarM213525b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i4 */
    public void m114807i4() {
        PkData pkData = this.f85587k;
        if (pkData == null) {
            return;
        }
        BLivePkOwner bLivePkOwner = (BLivePkOwner) jyb.m147529r(pkData.f52415pk.players, new qcj() { // from class: l.t780
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f172407a.m114819l4((BLivePkOwner) obj);
            }
        });
        afu.m97559h(kfd0.m149385x().m149398g(bLivePkOwner.userId).m149409r(bLivePkOwner.liveId).m149412u("onlive").m149414w("e_pk_gotoliveroom_button").m149392a(), this.f85586j.mo78457R2());
        m213811F2().JumpRoomEvent.jumpRoom().mo199273j(new JumpRoomData.C12924a().m74214t(((dw40) m213810E2()).mo160117o0()).m74212r(((dw40) m213810E2()).m202191k()).m74213s(((dw40) m213810E2()).mo183435j().room.f45267id).m74211q(((dw40) m213810E2()).m168532l0().name).m74216v(bLivePkOwner.liveId).m74217w(bLivePkOwner.roomId).m74215u(((dw40) m213810E2()).mo160117o0()).m74208n(JumpRoomType.CHANGE_SOURCE_WITH_BACK).m74207m());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o4 */
    public /* synthetic */ Boolean m114808o4(User user) {
        PkData pkData = this.f85587k;
        return Boolean.valueOf(pkData != null && TextUtils.equals(user.f56859id, pkData.otherUserId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p4 */
    public /* synthetic */ void m114809p4(User user) {
        User userM144722i = ((jfv) zrv.m221194l(htd0.f111520b)).m144722i(this.f85587k.otherUserId());
        if (userM144722i != null) {
            this.f85585i.m77224s(m114816h4(userM144722i), userM144722i, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q4 */
    public /* synthetic */ void m114810q4(C4470c c4470c) {
        if (m213815L2() && c4470c == C4470c.f16267i && !TextUtils.isEmpty(this.f85589m)) {
            m114806c4(this.f85589m);
        }
    }

    /* JADX INFO: renamed from: A4 */
    public void m114811A4(boolean z) {
        bnl0.m105524M(this.f85585i, z);
    }

    /* JADX INFO: renamed from: d4 */
    public void m114812d4(long j) {
        BLiveConfig bLiveConfig;
        BLiveSettings bLiveSettingsM203370A3 = zrv.m221193k().m203370A3();
        if (bLiveSettingsM203370A3 == null || (bLiveConfig = bLiveSettingsM203370A3.liveConfig) == null || bLiveConfig.f45200pk == null) {
            return;
        }
        g980.m129522n().m129528k(bLiveSettingsM203370A3.liveConfig.f45200pk.victoryMotionId, j, new r780(this));
    }

    /* JADX INFO: renamed from: e4 */
    public void m114813e4() {
        psd0.m173633z(this.f85588l);
        this.f85587k = null;
        this.f85589m = null;
        this.f85585i.m77226v();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [l.oo2] */
    /* JADX INFO: renamed from: f4 */
    public void m114814f4(boolean z) {
        if (this.f85587k == null) {
            return;
        }
        if (z) {
            afu.m97554c(this.f85586j.mo78457R2(), tfs.m190969k().m190972b(m213810E2(), false).m190978h(this.f85587k.otherUserId()).m190975e("live_pk_main").m190971a());
        }
        wrv wrvVar = zrv.f205799a;
        duringCreated(wrvVar.m207662d(wrvVar.m207631D0(), this.f85587k.otherUser(), true, "liveRoom", null, ((dw40) m213810E2()).m202194o(), mo78457R2(), "live_pk_main")).observeOn(fo0.m126432a()).subscribe(dhw.m115826e(new y20() { // from class: l.l780
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f130329a.m114817j4((Followship) obj);
            }
        }, new y20() { // from class: l.u780
            @Override // p153l.y20
            public final void call(Object obj) {
                d880.m114790L3((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g4 */
    public void m114815g4(final PkData pkData) {
        duringCreated((C22421c) ((dw40) m213810E2()).m168537m2().onErrorReturn(new qcj() { // from class: l.n780
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        }).flatMap(new qcj() { // from class: l.o780
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m72757s7(pkData.otherUserId(), "");
            }
        })).subscribe(dhw.m115826e(new y20() { // from class: l.p780
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f150905a.m114818k4((User) obj);
            }
        }, new y20() { // from class: l.q780
            @Override // p153l.y20
            public final void call(Object obj) {
                d880.m114793O3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h4 */
    public boolean m114816h4(User user) {
        return user.matchedOrFollowed();
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m114817j4(Followship followship) {
        PkData pkData = this.f85587k;
        if (pkData == null) {
            return;
        }
        pkData.otherUser().localFollowship = followship;
        if (Followship.isFollowed(followship)) {
            o1j0.m165649w(R$string.f47651L4);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m114818k4(User user) {
        this.f85585i.m77224s(m114816h4(user), user, false);
        ((jfv) zrv.m221194l(htd0.f111520b)).m144714a(user);
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ Boolean m114819l4(BLivePkOwner bLivePkOwner) {
        return Boolean.valueOf(a9g0.m96577l(bLivePkOwner.userId, this.f85587k.otherUserId()));
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ void m114820m4(ArrayList arrayList, ArrayList arrayList2, List list, List list2, LongLinkLiveMessage.PkUserPoints pkUserPoints) {
        arrayList.add(pkUserPoints.getUserId());
        arrayList2.add(String.valueOf(pkUserPoints.getPoints()));
        boolean zEquals = TextUtils.equals(pkUserPoints.getUserId(), this.f85587k.getAnchorId());
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

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        this.f85587k = null;
        psd0.m173633z(this.f85588l);
        this.f85585i.m77226v();
    }

    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ Boolean m114821n4(BLivePkOwner bLivePkOwner) {
        return Boolean.valueOf(a9g0.m96577l(bLivePkOwner.userId, this.f85587k.otherUserId()));
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ Boolean m114822r4(LivePkMessage livePkMessage) {
        return Boolean.valueOf(this.f85586j.f166543i.m134139S3());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(((jfv) zrv.m221194l(htd0.f111520b)).m144720g()).filter(new qcj() { // from class: l.y780
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f197751a.m114808o4((User) obj);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.z780
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f203225a.m114809p4((User) obj);
            }
        }));
        lifecycle().subscribe(dhw.m115825d(new y20() { // from class: l.a880
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f68890a.m114810q4((C4470c) obj);
            }
        }));
        duringCreated(((dw40) m213810E2()).m168545q1().m98256U()).filter(new qcj() { // from class: l.b880
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((LivePkMessage) obj).type, "pk_punish_motion"));
            }
        }).filter(new qcj() { // from class: l.c880
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f80186a.m114822r4((LivePkMessage) obj);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.m780
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f135062a.m114823s4((LivePkMessage) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public boolean m114824t4() {
        PkData pkData = this.f85587k;
        return (pkData == null || pkData.f52415pk.situation.isTied) ? false : true;
    }

    /* JADX INFO: renamed from: u4, reason: merged with bridge method [inline-methods] */
    public void m114823s4(LivePkMessage livePkMessage) {
        if (this.f85587k == null || !TextUtils.equals(livePkMessage.pkPunishMotion.getPkId(), this.f85587k.f52415pk.f45269id)) {
            return;
        }
        g980.m129522n().m129528k(livePkMessage.pkPunishMotion.getMotionId(), livePkMessage.getPkMvpGrade(), new r780(this));
    }

    /* JADX INFO: renamed from: v4 */
    public void m114826v4() {
        this.f85586j.m184866c4();
        this.f85585i.m77197Q();
        psd0.m173633z(this.f85588l);
        this.f85589m = null;
    }

    /* JADX INFO: renamed from: w4 */
    public void m114827w4(LivePkMessage livePkMessage) {
        if (this.f85587k == null) {
            return;
        }
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList();
        final ArrayList arrayList4 = new ArrayList();
        jyb.m147537z(livePkMessage.userPoints, new y20() { // from class: l.v780
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f182734a.m114820m4(arrayList, arrayList2, arrayList3, arrayList4, (LongLinkLiveMessage.PkUserPoints) obj);
            }
        });
        if (this.f85587k.isPlaying()) {
            BLivePkPointList bLivePkPointList = this.f85587k.f52415pk.situation.points;
            bLivePkPointList.userId = arrayList;
            bLivePkPointList.point = arrayList2;
        }
        this.f85585i.m77205Y(this.f85587k.otherUserId(), arrayList, arrayList2);
        this.f85585i.m77203W(arrayList3, arrayList4, false, false, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x4 */
    public void m114828x4(boolean z, PkData pkData, boolean z2) {
        if (((dw40) m213810E2()).mo183435j() == null || TextUtils.isEmpty(((dw40) m213810E2()).m202191k()) || pkData.isSameStatus(this.f85587k) || pkData.isUnknown()) {
            return;
        }
        if (this.f85587k == null) {
            m114815g4(pkData);
        }
        this.f85587k = pkData;
        if (pkData.isPreparing()) {
            return;
        }
        this.f85585i.m77198R(this.f85587k, z2, z);
        m114787C4(0L);
        m114786B4();
        n180.m161099p(pkData, this.f85585i, z2);
    }

    /* JADX INFO: renamed from: y4 */
    public void m114829y4(x20 x20Var) {
        Dialog.C4460e c4460eM21502E0 = act().dialog().m21502E0(R$string.f48411ua);
        int i = R$string.f48271o2;
        Objects.requireNonNull(x20Var);
        Dialog.C4460e c4460eM21540k0 = c4460eM21502E0.m21555t0(i, new bri0(x20Var)).m21540k0(R$string.f48510z);
        if (m114824t4()) {
            c4460eM21540k0.m21503F(zrv.m221193k().m203627g5(this.f85586j.mo156627U3(), this.f85587k.isPlaying()));
        }
        c4460eM21540k0.m21567z0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z4 */
    public void m114830z4() {
        PkData pkData = this.f85587k;
        if (pkData == null) {
            return;
        }
        BLivePkOwner bLivePkOwner = (BLivePkOwner) jyb.m147529r(pkData.f52415pk.players, new qcj() { // from class: l.w780
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f187722a.m114821n4((BLivePkOwner) obj);
            }
        });
        m213811F2().OpenUserCardDialogEvent.show().mo199273j(new UserCardData.Builder(600).userId(this.f85587k.otherUserId()).setSource("live").setFromIdentity(csq.m112227a(this, ((dw40) m213810E2()).m168532l0().f56859id, this.f85587k.otherUserId(), 600)).setTo("pkAnchor").setScene("pk").jumpToOtherRoom(bLivePkOwner.liveId, bLivePkOwner.roomId, new x20() { // from class: l.x780
            @Override // p153l.x20
            public final void call() {
                this.f192679a.m114807i4();
            }
        }).build());
    }
}
