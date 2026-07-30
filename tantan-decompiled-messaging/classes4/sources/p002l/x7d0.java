package p002l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p000p1.mobile.putong.live.livingroom.archi.frag.RoomFrag;
import com.p000p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p000p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomType;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.base.data.BLiveDefaultOpenConditions;
import com.p1.mobile.putong.live.base.data.BLiveEntrance;
import com.p1.mobile.putong.live.base.data.BLiveEntranceDefaultOpen;
import com.p1.mobile.putong.live.base.data.BLiveVoice;
import com.p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import l.e30;
import l.ffw;
import l.i5u;
import l.jo0;
import l.mqi0;
import l.r8d0;
import l.uvr;
import l.vwb;
import l.w9j;
import l.wq2;
import l.ypv;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class x7d0 {

    /* JADX INFO: renamed from: a */
    public x2m f22155a;

    /* JADX INFO: renamed from: b */
    public w2m f22156b;

    /* JADX INFO: renamed from: c */
    public RoomFrag f22157c;

    /* JADX INFO: renamed from: d */
    public e3m f22158d;

    /* JADX INFO: renamed from: e */
    public final a<BLiveAbsData> f22159e = a.b();

    /* JADX INFO: renamed from: f */
    public final zgt f22160f;

    /* JADX INFO: renamed from: g */
    public String f22161g;

    public x7d0(RoomFrag roomFrag, BLiveAbsData bLiveAbsData, zgt zgtVar) {
        this.f22157c = roomFrag;
        this.f22160f = zgtVar;
        String str = zgtVar.f23406b;
        this.f22158d = m25722l(str, bLiveAbsData);
        this.f22155a = m25721k(str, bLiveAbsData);
        this.f22156b = m25720j(str, bLiveAbsData);
        if (bLiveAbsData instanceof BLiveVoice) {
            return;
        }
        m25731u(bLiveAbsData);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ List m25712e(List list) {
        final ArrayList arrayList = new ArrayList();
        vwb.z(list, new e30() { // from class: l.v7d0
            public final void call(Object obj) {
                x7d0.m25715h(arrayList, (i5u) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m25713f(Throwable th) {
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m25715h(List list, i5u i5uVar) {
        if (TEnum.equals(i5uVar.a, "onlive")) {
            return;
        }
        list.add(i5uVar.b);
    }

    /* JADX INFO: renamed from: A */
    public final void m25716A(BLiveAbsData bLiveAbsData) {
        this.f22157c.duringCreated(m25729s(bLiveAbsData, this.f22156b.m24294h())).map(new w9j() { // from class: l.t7d0
            public final Object call(Object obj) {
                return x7d0.m25712e((List) obj);
            }
        }).observeOn(jo0.a()).subscribe(ffw.h(new e30() { // from class: l.u7d0
            public final void call(Object obj) {
                this.f20527a.m25734x((List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: B */
    public int m25717B(final String str) {
        return vwb.G(this.f22156b.m24294h(), new w9j() { // from class: l.w7d0
            public final Object call(Object obj) {
                return Boolean.valueOf(((String) obj).equals(str));
            }
        });
    }

    /* JADX INFO: renamed from: C */
    public void m25718C(String str, BLiveAbsData bLiveAbsData) {
        this.f22156b.mo9803a();
        this.f22158d.mo12166b();
        this.f22158d = m25722l(str, bLiveAbsData);
        this.f22155a = m25721k(str, bLiveAbsData);
        this.f22156b = m25720j(str, bLiveAbsData);
    }

    /* JADX INFO: renamed from: i */
    public final BLiveEntrance m25719i(String str) {
        BLiveEntrance bLiveEntranceNew_ = BLiveEntrance.new_();
        bLiveEntranceNew_.source = str;
        BLiveEntranceDefaultOpen bLiveEntranceDefaultOpen = bLiveEntranceNew_.defaultOpen;
        bLiveEntranceDefaultOpen.on = false;
        BLiveDefaultOpenConditions bLiveDefaultOpenConditions = bLiveEntranceDefaultOpen.conditions;
        bLiveDefaultOpenConditions.continousUnwatchDays = 0;
        bLiveDefaultOpenConditions.onlyOneWatchContinousDays = 0;
        bLiveEntranceNew_.showFollow = true;
        bLiveEntranceNew_.followTitle = ypv.e.getString(R$string.f3091Wj);
        bLiveEntranceNew_.showDefaultTitle = true;
        bLiveEntranceNew_.on = true;
        bLiveEntranceNew_.defaultTitle = ypv.e.getString(R$string.f2978Rb);
        return bLiveEntranceNew_;
    }

    /* JADX INFO: renamed from: j */
    public final w2m m25720j(String str, BLiveAbsData bLiveAbsData) {
        this.f22160f.m27362v(mqi0.o());
        if (bLiveAbsData.isVoiceLive()) {
            return new vio0(this.f22157c, str, bLiveAbsData.subSource);
        }
        this.f22161g = str;
        return new ait(this.f22157c, str, bLiveAbsData.subSource);
    }

    /* JADX INFO: renamed from: k */
    public final x2m m25721k(String str, BLiveAbsData bLiveAbsData) {
        hl5 hl5Var = new hl5(this);
        hl5Var.mo14444f(bLiveAbsData);
        return hl5Var;
    }

    /* JADX INFO: renamed from: l */
    public final z0f0 m25722l(String str, BLiveAbsData bLiveAbsData) {
        BLiveEntrance bLiveEntranceE4 = ypv.k().E4(str);
        if (bLiveEntranceE4 == null) {
            bLiveEntranceE4 = m25719i(str);
        }
        bLiveEntranceE4.source = str;
        z0f0 z0f0Var = new z0f0(this.f22157c, bLiveEntranceE4, bLiveAbsData.subSource);
        this.f22160f.m27361u(mqi0.o());
        return z0f0Var;
    }

    @UiThread
    /* JADX INFO: renamed from: m */
    public void m25723m(r8d0 r8d0Var) {
        BLiveAbsData bLiveAbsData = ((wq2) r8d0Var).c;
        if (bLiveAbsData == null || TextUtils.isEmpty(bLiveAbsData.id)) {
            return;
        }
        BLiveAbsData bLiveAbsDataMo14443e = this.f22155a.mo14443e();
        if (TextUtils.isEmpty(bLiveAbsDataMo14443e.id)) {
            return;
        }
        if (bLiveAbsDataMo14443e.id.equals(((wq2) r8d0Var).c.id) || bLiveAbsDataMo14443e.room.id.equals(((wq2) r8d0Var).b.id) || bLiveAbsDataMo14443e.id.equals("-1")) {
            this.f22155a.mo14444f(((wq2) r8d0Var).c);
            this.f22156b.mo9807e(r8d0Var);
        }
        m25724n();
    }

    /* JADX INFO: renamed from: n */
    public void m25724n() {
        this.f22156b.mo9805c(this.f22155a.mo14442d());
        this.f22158d.mo12165a();
    }

    /* JADX INFO: renamed from: o */
    public c<String> m25725o() {
        return this.f22159e.asObservable().filter(new w9j() { // from class: l.r7d0
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveAbsData) obj).anchor != null);
            }
        }).map(new w9j() { // from class: l.s7d0
            public final Object call(Object obj) {
                return ((BLiveAbsData) obj).anchor.id;
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public w2m m25726p() {
        return this.f22156b;
    }

    /* JADX INFO: renamed from: q */
    public x2m m25727q() {
        return this.f22155a;
    }

    @Nullable
    /* JADX INFO: renamed from: r */
    public BLiveAbsData m25728r() {
        return (BLiveAbsData) this.f22159e.e();
    }

    /* JADX INFO: renamed from: s */
    public final c<List<i5u>> m25729s(BLiveAbsData bLiveAbsData, List<String> list) {
        return bLiveAbsData.isVoiceLive() ? VoiceRoomApiProvider.queryCurrentLivesInfo(list) : LivingNormalApiProvider.m4615I6(list, m25732v());
    }

    /* JADX INFO: renamed from: t */
    public e3m m25730t() {
        return this.f22158d;
    }

    /* JADX INFO: renamed from: u */
    public final void m25731u(final BLiveAbsData bLiveAbsData) {
        this.f22157c.duringCreated(c.interval(30L, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(jo0.a()).subscribe(ffw.e(new e30() { // from class: l.p7d0
            public final void call(Object obj) {
                this.f17034a.m25733w(bLiveAbsData, (Long) obj);
            }
        }, new e30() { // from class: l.q7d0
            public final void call(Object obj) {
                x7d0.m25713f((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v */
    public final boolean m25732v() {
        return uvr.d().G0();
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m25733w(BLiveAbsData bLiveAbsData, Long l2) {
        m25716A(bLiveAbsData);
        if (this.f22157c.f3780A.m19300k().i() && bLiveAbsData.isNormalLive()) {
            this.f22158d.mo12173i();
        }
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m25734x(List list) {
        list.remove(this.f22155a.mo14443e().id);
        if (list.isEmpty()) {
            return;
        }
        this.f22156b.mo9804b(list);
    }

    /* JADX INFO: renamed from: y */
    public void m25735y(r8d0 r8d0Var, boolean z) {
        BLiveAbsData bLiveAbsData = ((wq2) r8d0Var).c;
        if (bLiveAbsData != null) {
            this.f22159e.onNext(bLiveAbsData);
        }
        this.f22156b.mo9810i(r8d0Var, z);
    }

    /* JADX INFO: renamed from: z */
    public void m25736z(JumpRoomData jumpRoomData) {
        this.f22156b.mo9806d(jumpRoomData);
        if (jumpRoomData.getJumpRoomType() == JumpRoomType.USER_SWIPE || jumpRoomData.getJumpRoomType() == JumpRoomType.END_SUGGEST) {
            m25727q().mo14444f(jumpRoomData.getLive());
        }
        if (jumpRoomData.getJumpRoomType() == JumpRoomType.END_SUGGEST) {
            this.f22158d.mo12168d(jumpRoomData.getLiveIdNeedToRemove());
        }
    }
}
