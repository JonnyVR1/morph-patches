package p149l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveDefaultOpenConditions;
import com.p046p1.mobile.putong.live.base.data.BLiveEntrance;
import com.p046p1.mobile.putong.live.base.data.BLiveEntranceDefaultOpen;
import com.p046p1.mobile.putong.live.base.data.BLiveVoice;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.archi.frag.RoomFrag;
import com.p046p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p046p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomType;
import com.p046p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes4.dex */
public class x7d0 {

    /* JADX INFO: renamed from: a */
    public x2m f191349a;

    /* JADX INFO: renamed from: b */
    public w2m f191350b;

    /* JADX INFO: renamed from: c */
    public RoomFrag f191351c;

    /* JADX INFO: renamed from: d */
    public e3m f191352d;

    /* JADX INFO: renamed from: e */
    public final C22392a<BLiveAbsData> f191353e = C22392a.m221512b();

    /* JADX INFO: renamed from: f */
    public final zgt f191354f;

    /* JADX INFO: renamed from: g */
    public String f191355g;

    public x7d0(RoomFrag roomFrag, BLiveAbsData bLiveAbsData, zgt zgtVar) {
        this.f191351c = roomFrag;
        this.f191354f = zgtVar;
        String str = zgtVar.f203084b;
        this.f191352d = m207270l(str, bLiveAbsData);
        this.f191349a = m207269k(str, bLiveAbsData);
        this.f191350b = m207268j(str, bLiveAbsData);
        if (bLiveAbsData instanceof BLiveVoice) {
            return;
        }
        m207279u(bLiveAbsData);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ List m207260e(List list) {
        final ArrayList arrayList = new ArrayList();
        vwb.m200354z(list, new e30() { // from class: l.v7d0
            @Override // p149l.e30
            public final void call(Object obj) {
                x7d0.m207263h(arrayList, (i5u) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m207261f(Throwable th) {
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m207263h(List list, i5u i5uVar) {
        if (TEnum.equals(i5uVar.f111640a, "onlive")) {
            return;
        }
        list.add(i5uVar.f111641b);
    }

    /* JADX INFO: renamed from: A */
    public final void m207264A(BLiveAbsData bLiveAbsData) {
        this.f191351c.duringCreated(m207277s(bLiveAbsData, this.f191350b.m201119h())).map(new w9j() { // from class: l.t7d0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return x7d0.m207260e((List) obj);
            }
        }).observeOn(jo0.m142408a()).subscribe(ffw.m121197h(new e30() { // from class: l.u7d0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f174993a.m207282x((List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: B */
    public int m207265B(final String str) {
        return vwb.m200293G(this.f191350b.m201119h(), new w9j() { // from class: l.w7d0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((String) obj).equals(str));
            }
        });
    }

    /* JADX INFO: renamed from: C */
    public void m207266C(String str, BLiveAbsData bLiveAbsData) {
        this.f191350b.mo96928a();
        this.f191352d.mo114608b();
        this.f191352d = m207270l(str, bLiveAbsData);
        this.f191349a = m207269k(str, bLiveAbsData);
        this.f191350b = m207268j(str, bLiveAbsData);
    }

    /* JADX INFO: renamed from: i */
    public final BLiveEntrance m207267i(String str) {
        BLiveEntrance bLiveEntranceNew_ = BLiveEntrance.new_();
        bLiveEntranceNew_.source = str;
        BLiveEntranceDefaultOpen bLiveEntranceDefaultOpen = bLiveEntranceNew_.defaultOpen;
        bLiveEntranceDefaultOpen.f44361on = false;
        BLiveDefaultOpenConditions bLiveDefaultOpenConditions = bLiveEntranceDefaultOpen.conditions;
        bLiveDefaultOpenConditions.continousUnwatchDays = 0;
        bLiveDefaultOpenConditions.onlyOneWatchContinousDays = 0;
        bLiveEntranceNew_.showFollow = true;
        bLiveEntranceNew_.followTitle = ypv.f199497e.getString(R$string.f47049Wj);
        bLiveEntranceNew_.showDefaultTitle = true;
        bLiveEntranceNew_.f44360on = true;
        bLiveEntranceNew_.defaultTitle = ypv.f199497e.getString(R$string.f46936Rb);
        return bLiveEntranceNew_;
    }

    /* JADX INFO: renamed from: j */
    public final w2m m207268j(String str, BLiveAbsData bLiveAbsData) {
        this.f191354f.m218711v(mqi0.m155944o());
        if (bLiveAbsData.isVoiceLive()) {
            return new vio0(this.f191351c, str, bLiveAbsData.subSource);
        }
        this.f191355g = str;
        return new ait(this.f191351c, str, bLiveAbsData.subSource);
    }

    /* JADX INFO: renamed from: k */
    public final x2m m207269k(String str, BLiveAbsData bLiveAbsData) {
        hl5 hl5Var = new hl5(this);
        hl5Var.mo131646f(bLiveAbsData);
        return hl5Var;
    }

    /* JADX INFO: renamed from: l */
    public final z0f0 m207270l(String str, BLiveAbsData bLiveAbsData) {
        BLiveEntrance bLiveEntranceM195616E4 = ypv.m215672k().m195616E4(str);
        if (bLiveEntranceM195616E4 == null) {
            bLiveEntranceM195616E4 = m207267i(str);
        }
        bLiveEntranceM195616E4.source = str;
        z0f0 z0f0Var = new z0f0(this.f191351c, bLiveEntranceM195616E4, bLiveAbsData.subSource);
        this.f191354f.m218710u(mqi0.m155944o());
        return z0f0Var;
    }

    @UiThread
    /* JADX INFO: renamed from: m */
    public void m207271m(r8d0 r8d0Var) {
        BLiveAbsData bLiveAbsData = r8d0Var.f187610c;
        if (bLiveAbsData == null || TextUtils.isEmpty(bLiveAbsData.f44323id)) {
            return;
        }
        BLiveAbsData bLiveAbsDataMo131645e = this.f191349a.mo131645e();
        if (TextUtils.isEmpty(bLiveAbsDataMo131645e.f44323id)) {
            return;
        }
        if (bLiveAbsDataMo131645e.f44323id.equals(r8d0Var.f187610c.f44323id) || bLiveAbsDataMo131645e.room.f44419id.equals(r8d0Var.f187609b.f44324id) || bLiveAbsDataMo131645e.f44323id.equals(User.ID_TEAM_ACCOUNT)) {
            this.f191349a.mo131646f(r8d0Var.f187610c);
            this.f191350b.mo96932e(r8d0Var);
        }
        m207272n();
    }

    /* JADX INFO: renamed from: n */
    public void m207272n() {
        this.f191350b.mo96930c(this.f191349a.mo131644d());
        this.f191352d.mo114607a();
    }

    /* JADX INFO: renamed from: o */
    public C22306c<String> m207273o() {
        return this.f191353e.asObservable().filter(new w9j() { // from class: l.r7d0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveAbsData) obj).anchor != null);
            }
        }).map(new w9j() { // from class: l.s7d0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveAbsData) obj).anchor.f44419id;
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public w2m m207274p() {
        return this.f191350b;
    }

    /* JADX INFO: renamed from: q */
    public x2m m207275q() {
        return this.f191349a;
    }

    @Nullable
    /* JADX INFO: renamed from: r */
    public BLiveAbsData m207276r() {
        return this.f191353e.m221515e();
    }

    /* JADX INFO: renamed from: s */
    public final C22306c<List<i5u>> m207277s(BLiveAbsData bLiveAbsData, List<String> list) {
        return bLiveAbsData.isVoiceLive() ? VoiceRoomApiProvider.queryCurrentLivesInfo(list) : LivingNormalApiProvider.m71249I6(list, m207280v());
    }

    /* JADX INFO: renamed from: t */
    public e3m m207278t() {
        return this.f191352d;
    }

    /* JADX INFO: renamed from: u */
    public final void m207279u(final BLiveAbsData bLiveAbsData) {
        this.f191351c.duringCreated(C22306c.interval(30L, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(ffw.m121194e(new e30() { // from class: l.p7d0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f147493a.m207281w(bLiveAbsData, (Long) obj);
            }
        }, new e30() { // from class: l.q7d0
            @Override // p149l.e30
            public final void call(Object obj) {
                x7d0.m207261f((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v */
    public final boolean m207280v() {
        return uvr.m196087d().m162669G0();
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m207281w(BLiveAbsData bLiveAbsData, Long l2) {
        m207264A(bLiveAbsData);
        if (this.f191351c.f47738A.m163122k().m76639i() && bLiveAbsData.isNormalLive()) {
            this.f191352d.mo114615i();
        }
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m207282x(List list) {
        list.remove(this.f191349a.mo131645e().f44323id);
        if (list.isEmpty()) {
            return;
        }
        this.f191350b.mo96929b(list);
    }

    /* JADX INFO: renamed from: y */
    public void m207283y(r8d0 r8d0Var, boolean z) {
        BLiveAbsData bLiveAbsData = r8d0Var.f187610c;
        if (bLiveAbsData != null) {
            this.f191353e.onNext(bLiveAbsData);
        }
        this.f191350b.mo96935i(r8d0Var, z);
    }

    /* JADX INFO: renamed from: z */
    public void m207284z(JumpRoomData jumpRoomData) {
        this.f191350b.mo96931d(jumpRoomData);
        if (jumpRoomData.getJumpRoomType() == JumpRoomType.USER_SWIPE || jumpRoomData.getJumpRoomType() == JumpRoomType.END_SUGGEST) {
            m207275q().mo131646f(jumpRoomData.getLive());
        }
        if (jumpRoomData.getJumpRoomType() == JumpRoomType.END_SUGGEST) {
            this.f191352d.mo114610d(jumpRoomData.getLiveIdNeedToRemove());
        }
    }
}
