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
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.bean.PkData;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.internal.PkViewInternal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
public class k780 extends qct<dw40> {

    /* JADX INFO: renamed from: i */
    public PkViewInternal f124248i;

    /* JADX INFO: renamed from: j */
    public sx70 f124249j;

    /* JADX INFO: renamed from: k */
    public PkData f124250k;

    /* JADX INFO: renamed from: l */
    public kcg0 f124251l;

    /* JADX INFO: renamed from: m */
    public String f124252m;

    public k780(dum dumVar, sx70 sx70Var, PkViewInternal pkViewInternal) {
        super(dumVar);
        this.f124248i = pkViewInternal;
        this.f124249j = sx70Var;
    }

    /* JADX INFO: renamed from: V3 */
    public static /* synthetic */ void m148604V3(Throwable th) {
    }

    /* JADX INFO: renamed from: a4 */
    public static /* synthetic */ void m148609a4(Throwable th) {
        if ((th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).isFollowForbidden()) {
            o1j0.m165649w(R$string.f48005c);
        } else {
            o1j0.m165649w(R$string.f47563H4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q4 */
    public /* synthetic */ void m148610q4(LivePkMessage livePkMessage) {
        if (this.f124249j.f171085i.m213507S3()) {
            m148628s4(livePkMessage);
        }
    }

    /* JADX INFO: renamed from: A4 */
    public final void m148611A4(Long l2) {
        PkData pkData = this.f124250k;
        if (pkData == null) {
            return;
        }
        long jM174454o = (long) (pzi0.m174454o() - (Double.valueOf(pkData.f52415pk.situation.currentStageInfo.startTs).doubleValue() / 1000000.0d));
        BLivePkCurrentStageInfo bLivePkCurrentStageInfo = this.f124250k.f52415pk.situation.currentStageInfo;
        BLivePkStage bLivePkStage = bLivePkCurrentStageInfo.stage;
        int i = (int) (((long) bLivePkCurrentStageInfo.duration) - (jM174454o / 1000));
        if (i % 15 == 0) {
            n180.m161093j("process module remainTime = " + i);
        }
        if (i < 0) {
            psd0.m173633z(this.f124251l);
            this.f124249j.mo153354V3(PkAction.ACTION_TIME_OUT.setExtra(bLivePkStage.toString()));
            this.f124248i.m77276A0(0);
        } else {
            this.f124248i.m77276A0(i);
        }
        if (this.f124250k.isPlaying()) {
            this.f124249j.f171089m.m144348K3(this.f124250k.f52415pk.pkPlayingBuffInfo);
            this.f124249j.f171090n.m187855R3(this.f124250k.f52415pk.players);
            if (i <= 10) {
                this.f124248i.m77308x0(i);
            }
        }
        if (this.f124250k.isPunishing() && i <= 20) {
            this.f124248i.m77304v0(false);
        }
        if (zrv.m221193k().m203539V4() && this.f124250k.isPlaying() && i <= zrv.m221193k().m203531U4()) {
            fhw.m125605a("LivePkConstant", "winTimesTag on:" + zrv.m221193k().m203539V4() + ",showTagBeforeEnd:" + zrv.m221193k().m203531U4());
            if (this.f124250k.getAnchorWinTimes() >= 2) {
                this.f124249j.f171088l.m100423X3();
            }
            this.f124248i.m77295j0(false, this.f124250k);
        }
    }

    /* JADX INFO: renamed from: b4 */
    public final void m148612b4(String str) {
        n180.m161093j("addPkMotion path=" + str);
        this.f124252m = str;
        wxh0 wxh0VarM213525b = xxh0.m213524a().m213525b(act(), str);
        if (wxh0VarM213525b != null) {
            ((uzl) m138856F3(new k210(600))).mo73036B(1001, wxh0VarM213525b);
        }
    }

    /* JADX INFO: renamed from: c4 */
    public void m148613c4(long j) {
        BLiveConfig bLiveConfig;
        BLiveSettings bLiveSettingsM203370A3 = zrv.m221193k().m203370A3();
        if (bLiveSettingsM203370A3 == null || (bLiveConfig = bLiveSettingsM203370A3.liveConfig) == null || bLiveConfig.f45200pk == null) {
            return;
        }
        g980.m129522n().m129528k(bLiveSettingsM203370A3.liveConfig.f45200pk.victoryMotionId, j, new z680(this));
    }

    /* JADX INFO: renamed from: d4 */
    public void m148614d4() {
        psd0.m173633z(this.f124251l);
        this.f124250k = null;
        this.f124252m = null;
        this.f124248i.m77277B();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [l.oo2] */
    /* JADX INFO: renamed from: e4 */
    public void m148615e4(boolean z) {
        if (this.f124250k == null) {
            return;
        }
        if (z) {
            afu.m97554c(this.f124249j.mo78457R2(), tfs.m190969k().m190972b(m213810E2(), false).m190978h(this.f124250k.otherUserId()).m190975e("live_pk_main").m190971a());
        }
        wrv wrvVar = zrv.f205799a;
        duringCreated(wrvVar.m207662d(wrvVar.m207631D0(), this.f124250k.otherUser(), true, "liveRoom", null, ((dw40) m213810E2()).m202194o(), mo78457R2(), "live_pk_main")).observeOn(fo0.m126432a()).subscribe(dhw.m115826e(new y20() { // from class: l.d780
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f85467a.m148619i4((Followship) obj);
            }
        }, new y20() { // from class: l.e780
            @Override // p153l.y20
            public final void call(Object obj) {
                k780.m148609a4((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f4 */
    public void m148616f4(final PkData pkData) {
        duringCreated((C22421c) ((dw40) m213810E2()).m168537m2().onErrorReturn(new qcj() { // from class: l.u680
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        }).flatMap(new qcj() { // from class: l.v680
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m72757s7(pkData.otherUserId(), "");
            }
        })).subscribe(dhw.m115826e(new y20() { // from class: l.w680
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f187599a.m148620j4((User) obj);
            }
        }, new y20() { // from class: l.x680
            @Override // p153l.y20
            public final void call(Object obj) {
                k780.m148604V3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g4 */
    public boolean m148617g4(User user) {
        return user.matchedOrFollowed();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h4 */
    public final void m148618h4() {
        PkData pkData = this.f124250k;
        if (pkData == null) {
            return;
        }
        BLivePkOwner bLivePkOwner = (BLivePkOwner) jyb.m147529r(pkData.f52415pk.players, new qcj() { // from class: l.y680
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f197655a.m148621k4((BLivePkOwner) obj);
            }
        });
        afu.m97559h(kfd0.m149385x().m149398g(bLivePkOwner.userId).m149409r(bLivePkOwner.liveId).m149412u("onlive").m149414w("e_pk_gotoliveroom_button").m149392a(), this.f124249j.mo78457R2());
        m213811F2().JumpRoomEvent.jumpRoom().mo199273j(new JumpRoomData.C12924a().m74214t(((dw40) m213810E2()).mo160117o0()).m74212r(((dw40) m213810E2()).m202191k()).m74213s(((dw40) m213810E2()).mo183435j().room.f45267id).m74211q(((dw40) m213810E2()).m168532l0().name).m74216v(bLivePkOwner.liveId).m74217w(bLivePkOwner.roomId).m74215u(((dw40) m213810E2()).mo160117o0()).m74208n(JumpRoomType.CHANGE_SOURCE_WITH_BACK).m74207m());
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m148619i4(Followship followship) {
        PkData pkData = this.f124250k;
        if (pkData == null) {
            return;
        }
        pkData.otherUser().localFollowship = followship;
        if (Followship.isFollowed(followship)) {
            o1j0.m165649w(R$string.f47651L4);
        }
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m148620j4(User user) {
        this.f124248i.m77309y(m148617g4(user), user, false);
        ((jfv) zrv.m221194l(htd0.f111520b)).m144714a(user);
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ Boolean m148621k4(BLivePkOwner bLivePkOwner) {
        return Boolean.valueOf(a9g0.m96577l(bLivePkOwner.userId, this.f124250k.otherUserId()));
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m148622l4(ArrayList arrayList, ArrayList arrayList2, List list, List list2, LongLinkLiveMessage.PkUserPoints pkUserPoints) {
        arrayList.add(pkUserPoints.getUserId());
        arrayList2.add(String.valueOf(pkUserPoints.getPoints()));
        boolean zEquals = TextUtils.equals(pkUserPoints.getUserId(), this.f124250k.getAnchorId());
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
    public final /* synthetic */ Boolean m148623m4(BLivePkOwner bLivePkOwner) {
        return Boolean.valueOf(a9g0.m96577l(bLivePkOwner.userId, this.f124250k.otherUserId()));
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        this.f124250k = null;
        psd0.m173633z(this.f124251l);
        this.f124248i.m77277B();
    }

    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ Boolean m148624n4(User user) {
        PkData pkData = this.f124250k;
        return Boolean.valueOf(pkData != null && TextUtils.equals(user.f56859id, pkData.otherUserId()));
    }

    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ void m148625o4(User user) {
        User userM144722i = ((jfv) zrv.m221194l(htd0.f111520b)).m144722i(this.f124250k.otherUserId());
        if (userM144722i != null) {
            this.f124248i.m77309y(m148617g4(userM144722i), userM144722i, true);
        }
    }

    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ void m148626p4(C4470c c4470c) {
        if (m213815L2() && c4470c == C4470c.f16267i && !TextUtils.isEmpty(this.f124252m)) {
            m148612b4(this.f124252m);
        }
    }

    /* JADX INFO: renamed from: r4 */
    public boolean m148627r4() {
        PkData pkData = this.f124250k;
        return (pkData == null || pkData.f52415pk.situation.isTied) ? false : true;
    }

    /* JADX INFO: renamed from: s4 */
    public void m148628s4(LivePkMessage livePkMessage) {
        if (this.f124250k == null || !TextUtils.equals(livePkMessage.pkPunishMotion.getPkId(), this.f124250k.f52415pk.f45269id)) {
            return;
        }
        g980.m129522n().m129528k(livePkMessage.pkPunishMotion.getMotionId(), livePkMessage.getPkMvpGrade(), new z680(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(((jfv) zrv.m221194l(htd0.f111520b)).m144720g()).filter(new qcj() { // from class: l.f780
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f97546a.m148624n4((User) obj);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.g780
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f102519a.m148625o4((User) obj);
            }
        }));
        lifecycle().subscribe(dhw.m115825d(new y20() { // from class: l.h780
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f108100a.m148626p4((C4470c) obj);
            }
        }));
        duringCreated(((dw40) m213810E2()).m168545q1().m98256U()).filter(new qcj() { // from class: l.i780
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((LivePkMessage) obj).type, "pk_punish_motion"));
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.j780
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f118653a.m148610q4((LivePkMessage) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public void m148629t4() {
        this.f124248i.m77287a0();
        psd0.m173633z(this.f124251l);
        this.f124252m = null;
    }

    /* JADX INFO: renamed from: u4 */
    public void m148630u4(LivePkMessage livePkMessage) {
        if (this.f124250k == null) {
            return;
        }
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList();
        final ArrayList arrayList4 = new ArrayList();
        jyb.m147537z(livePkMessage.userPoints, new y20() { // from class: l.t680
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f172314a.m148622l4(arrayList, arrayList2, arrayList3, arrayList4, (LongLinkLiveMessage.PkUserPoints) obj);
            }
        });
        if (this.f124250k.isPlaying()) {
            BLivePkPointList bLivePkPointList = this.f124250k.f52415pk.situation.points;
            bLivePkPointList.userId = arrayList;
            bLivePkPointList.point = arrayList2;
        }
        this.f124248i.m77296k0(this.f124250k.otherUserId(), arrayList, arrayList2);
        this.f124248i.m77294h0(arrayList3, arrayList4, false, false, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v4 */
    public void m148631v4(boolean z, PkData pkData, boolean z2) {
        if (((dw40) m213810E2()).mo183435j() == null || TextUtils.isEmpty(((dw40) m213810E2()).m202191k()) || pkData.isSameStatus(this.f124250k) || pkData.isUnknown()) {
            return;
        }
        if (this.f124250k == null) {
            m148616f4(pkData);
        }
        this.f124250k = pkData;
        if (pkData.isPreparing()) {
            return;
        }
        this.f124248i.m77289c0(this.f124250k, z2, z);
        m148611A4(0L);
        m148635z4();
        n180.m161099p(pkData, this.f124248i, z2);
    }

    /* JADX INFO: renamed from: w4 */
    public void m148632w4(x20 x20Var) {
        Dialog.C4460e c4460eM21502E0 = act().dialog().m21502E0(R$string.f48411ua);
        int i = R$string.f48271o2;
        Objects.requireNonNull(x20Var);
        Dialog.C4460e c4460eM21540k0 = c4460eM21502E0.m21555t0(i, new bri0(x20Var)).m21540k0(R$string.f48510z);
        if (m148627r4()) {
            c4460eM21540k0.m21503F(zrv.m221193k().m203627g5(this.f124249j.mo183719U3(), this.f124250k.isPlaying()));
        }
        c4460eM21540k0.m21567z0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x4 */
    public void m148633x4() {
        PkData pkData = this.f124250k;
        if (pkData == null) {
            return;
        }
        BLivePkOwner bLivePkOwner = (BLivePkOwner) jyb.m147529r(pkData.f52415pk.players, new qcj() { // from class: l.b780
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f75263a.m148623m4((BLivePkOwner) obj);
            }
        });
        m213811F2().OpenUserCardDialogEvent.show().mo199273j(new UserCardData.Builder(600).userId(this.f124250k.otherUserId()).setSource("live").setFromIdentity(csq.m112227a(this, ((dw40) m213810E2()).m168532l0().f56859id, this.f124250k.otherUserId(), 600)).setTo("pkAnchor").setScene("pk").jumpToOtherRoom(bLivePkOwner.liveId, bLivePkOwner.roomId, new x20() { // from class: l.c780
            @Override // p153l.x20
            public final void call() {
                this.f80093a.m148618h4();
            }
        }).build());
    }

    /* JADX INFO: renamed from: y4 */
    public void m148634y4(boolean z) {
        bnl0.m105524M(this.f124248i, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z4 */
    public final void m148635z4() {
        psd0.m173633z(this.f124251l);
        this.f124251l = m138858H3(((dw40) m213810E2()).m168525i2(TimeUnit.SECONDS)).subscribe(dhw.m115825d(new y20() { // from class: l.a780
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f68800a.m148611A4((Long) obj);
            }
        }));
    }
}
