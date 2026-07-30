package p153l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveDefaultOpenConditions;
import com.p051p1.mobile.putong.live.base.data.BLiveEntrance;
import com.p051p1.mobile.putong.live.base.data.BLiveEntranceDefaultOpen;
import com.p051p1.mobile.putong.live.base.data.BLiveVoice;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.archi.frag.RoomFrag;
import com.p051p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p051p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomType;
import com.p051p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes4.dex */
public class agd0 {

    /* JADX INFO: renamed from: a */
    public p5m f71142a;

    /* JADX INFO: renamed from: b */
    public o5m f71143b;

    /* JADX INFO: renamed from: c */
    public RoomFrag f71144c;

    /* JADX INFO: renamed from: d */
    public v5m f71145d;

    /* JADX INFO: renamed from: e */
    public final C22507a<BLiveAbsData> f71146e = C22507a.m222758b();

    /* JADX INFO: renamed from: f */
    public final ajt f71147f;

    /* JADX INFO: renamed from: g */
    public String f71148g;

    public agd0(RoomFrag roomFrag, BLiveAbsData bLiveAbsData, ajt ajtVar) {
        this.f71144c = roomFrag;
        this.f71147f = ajtVar;
        String str = ajtVar.f71865b;
        this.f71145d = m97607l(str, bLiveAbsData);
        this.f71142a = m97606k(str, bLiveAbsData);
        this.f71143b = m97605j(str, bLiveAbsData);
        if (bLiveAbsData instanceof BLiveVoice) {
            return;
        }
        m97616u(bLiveAbsData);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ List m97597e(List list) {
        final ArrayList arrayList = new ArrayList();
        jyb.m147537z(list, new y20() { // from class: l.yfd0
            @Override // p153l.y20
            public final void call(Object obj) {
                agd0.m97600h(arrayList, (j7u) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m97598f(Throwable th) {
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m97600h(List list, j7u j7uVar) {
        if (TEnum.equals(j7uVar.f118726a, "onlive")) {
            return;
        }
        list.add(j7uVar.f118727b);
    }

    /* JADX INFO: renamed from: A */
    public final void m97601A(BLiveAbsData bLiveAbsData) {
        this.f71144c.duringCreated(m97614s(bLiveAbsData, this.f71143b.m166162h())).map(new qcj() { // from class: l.wfd0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return agd0.m97597e((List) obj);
            }
        }).observeOn(fo0.m126432a()).subscribe(dhw.m115829h(new y20() { // from class: l.xfd0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f194026a.m97619x((List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: B */
    public int m97602B(final String str) {
        return jyb.m147476G(this.f71143b.m166162h(), new qcj() { // from class: l.zfd0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((String) obj).equals(str));
            }
        });
    }

    /* JADX INFO: renamed from: C */
    public void m97603C(String str, BLiveAbsData bLiveAbsData) {
        this.f71143b.mo104851a();
        this.f71145d.mo129562b();
        this.f71145d = m97607l(str, bLiveAbsData);
        this.f71142a = m97606k(str, bLiveAbsData);
        this.f71143b = m97605j(str, bLiveAbsData);
    }

    /* JADX INFO: renamed from: i */
    public final BLiveEntrance m97604i(String str) {
        BLiveEntrance bLiveEntranceNew_ = BLiveEntrance.new_();
        bLiveEntranceNew_.source = str;
        BLiveEntranceDefaultOpen bLiveEntranceDefaultOpen = bLiveEntranceNew_.defaultOpen;
        bLiveEntranceDefaultOpen.f45209on = false;
        BLiveDefaultOpenConditions bLiveDefaultOpenConditions = bLiveEntranceDefaultOpen.conditions;
        bLiveDefaultOpenConditions.continousUnwatchDays = 0;
        bLiveDefaultOpenConditions.onlyOneWatchContinousDays = 0;
        bLiveEntranceNew_.showFollow = true;
        bLiveEntranceNew_.followTitle = zrv.f205803e.getString(R$string.f47897Wj);
        bLiveEntranceNew_.showDefaultTitle = true;
        bLiveEntranceNew_.f45208on = true;
        bLiveEntranceNew_.defaultTitle = zrv.f205803e.getString(R$string.f47784Rb);
        return bLiveEntranceNew_;
    }

    /* JADX INFO: renamed from: j */
    public final o5m m97605j(String str, BLiveAbsData bLiveAbsData) {
        this.f71147f.m98475v(pzi0.m174454o());
        if (bLiveAbsData.isVoiceLive()) {
            return new zro0(this.f71144c, str, bLiveAbsData.subSource);
        }
        this.f71148g = str;
        return new bkt(this.f71144c, str, bLiveAbsData.subSource);
    }

    /* JADX INFO: renamed from: k */
    public final p5m m97606k(String str, BLiveAbsData bLiveAbsData) {
        km5 km5Var = new km5(this);
        km5Var.mo150412f(bLiveAbsData);
        return km5Var;
    }

    /* JADX INFO: renamed from: l */
    public final g9f0 m97607l(String str, BLiveAbsData bLiveAbsData) {
        BLiveEntrance bLiveEntranceM203403E4 = zrv.m221193k().m203403E4(str);
        if (bLiveEntranceM203403E4 == null) {
            bLiveEntranceM203403E4 = m97604i(str);
        }
        bLiveEntranceM203403E4.source = str;
        g9f0 g9f0Var = new g9f0(this.f71144c, bLiveEntranceM203403E4, bLiveAbsData.subSource);
        this.f71147f.m98474u(pzi0.m174454o());
        return g9f0Var;
    }

    @UiThread
    /* JADX INFO: renamed from: m */
    public void m97608m(ugd0 ugd0Var) {
        BLiveAbsData bLiveAbsData = ugd0Var.f138293c;
        if (bLiveAbsData == null || TextUtils.isEmpty(bLiveAbsData.f45171id)) {
            return;
        }
        BLiveAbsData bLiveAbsDataMo150411e = this.f71142a.mo150411e();
        if (TextUtils.isEmpty(bLiveAbsDataMo150411e.f45171id)) {
            return;
        }
        if (bLiveAbsDataMo150411e.f45171id.equals(ugd0Var.f138293c.f45171id) || bLiveAbsDataMo150411e.room.f45267id.equals(ugd0Var.f138292b.f45172id) || bLiveAbsDataMo150411e.f45171id.equals(User.ID_TEAM_ACCOUNT)) {
            this.f71142a.mo150412f(ugd0Var.f138293c);
            this.f71143b.mo104855e(ugd0Var);
        }
        m97609n();
    }

    /* JADX INFO: renamed from: n */
    public void m97609n() {
        this.f71143b.mo104853c(this.f71142a.mo150410d());
        this.f71145d.mo129561a();
    }

    /* JADX INFO: renamed from: o */
    public C22421c<String> m97610o() {
        return this.f71146e.asObservable().filter(new qcj() { // from class: l.ufd0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveAbsData) obj).anchor != null);
            }
        }).map(new qcj() { // from class: l.vfd0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveAbsData) obj).anchor.f45267id;
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public o5m m97611p() {
        return this.f71143b;
    }

    /* JADX INFO: renamed from: q */
    public p5m m97612q() {
        return this.f71142a;
    }

    @Nullable
    /* JADX INFO: renamed from: r */
    public BLiveAbsData m97613r() {
        return this.f71146e.m222761e();
    }

    /* JADX INFO: renamed from: s */
    public final C22421c<List<j7u>> m97614s(BLiveAbsData bLiveAbsData, List<String> list) {
        return bLiveAbsData.isVoiceLive() ? VoiceRoomApiProvider.queryCurrentLivesInfo(list) : LivingNormalApiProvider.m72432I6(list, m97617v());
    }

    /* JADX INFO: renamed from: t */
    public v5m m97615t() {
        return this.f71145d;
    }

    /* JADX INFO: renamed from: u */
    public final void m97616u(final BLiveAbsData bLiveAbsData) {
        this.f71144c.duringCreated(C22421c.interval(30L, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(dhw.m115826e(new y20() { // from class: l.sfd0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f167689a.m97618w(bLiveAbsData, (Long) obj);
            }
        }, new y20() { // from class: l.tfd0
            @Override // p153l.y20
            public final void call(Object obj) {
                agd0.m97598f((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v */
    public final boolean m97617v() {
        return vxr.m203876d().m170976G0();
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m97618w(BLiveAbsData bLiveAbsData, Long l2) {
        m97601A(bLiveAbsData);
        if (this.f71144c.f48586A.m181414k().m77822i() && bLiveAbsData.isNormalLive()) {
            this.f71145d.mo129568i();
        }
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m97619x(List list) {
        list.remove(this.f71142a.mo150411e().f45171id);
        if (list.isEmpty()) {
            return;
        }
        this.f71143b.mo104852b(list);
    }

    /* JADX INFO: renamed from: y */
    public void m97620y(ugd0 ugd0Var, boolean z) {
        BLiveAbsData bLiveAbsData = ugd0Var.f138293c;
        if (bLiveAbsData != null) {
            this.f71146e.onNext(bLiveAbsData);
        }
        this.f71143b.mo104858i(ugd0Var, z);
    }

    /* JADX INFO: renamed from: z */
    public void m97621z(JumpRoomData jumpRoomData) {
        this.f71143b.mo104854d(jumpRoomData);
        if (jumpRoomData.getJumpRoomType() == JumpRoomType.USER_SWIPE || jumpRoomData.getJumpRoomType() == JumpRoomType.END_SUGGEST) {
            m97612q().mo150412f(jumpRoomData.getLive());
        }
        if (jumpRoomData.getJumpRoomType() == JumpRoomType.END_SUGGEST) {
            this.f71145d.mo129564d(jumpRoomData.getLiveIdNeedToRemove());
        }
    }
}
