package p007l;

import android.os.SystemClock;
import android.text.TextUtils;
import com.p000p1.mobile.putong.data.Counter;
import com.p000p1.mobile.putong.data.Envelope;
import com.p000p1.mobile.putong.data.Links;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.FeedData;
import com.p000p1.mobile.putong.feed.data.FeedSeeMoreFollowingMomentInfo;
import com.p000p1.mobile.putong.feed.data.Group;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.RawFeed;
import com.p000p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedFrag;
import com.p1.mobile.android.app.App;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.util.TrackMediaUploadUtil;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import l.e30;
import l.j760;
import l.jo0;
import l.mkd0;
import l.roj0;
import l.vwb;
import l.w9j;
import l.xaj0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class o8j extends hx60 {

    /* JADX INFO: renamed from: d */
    public an00 f11383d;

    /* JADX INFO: renamed from: e */
    public an00 f11384e;

    /* JADX INFO: renamed from: f */
    public List<RawFeed> f11385f;

    /* JADX INFO: renamed from: g */
    public PhotoAlbumFeedFrag f11386g;

    /* JADX INFO: renamed from: l.o8j$a */
    public class C2446a extends an00 {
        public C2446a() {
        }

        @Override // p007l.an00
        /* JADX INFO: renamed from: a */
        public void mo6842a(Envelope envelope) {
            if (NullChecker.a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                o8j.this.f8835b.m10607h(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
            }
        }

        @Override // p007l.an00
        /* JADX INFO: renamed from: b */
        public void mo8581b(String str, Envelope envelope) {
            o8j.this.f8835b.m10605f(str, envelope);
        }

        @Override // p007l.an00
        /* JADX INFO: renamed from: c */
        public void mo6843c(Envelope envelope) {
            if (NullChecker.a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                o8j.this.f8835b.m10608i(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
            }
            if (vwb.J(o8j.this.f11385f) || nkg.m12265t()) {
                return;
            }
            o8j o8jVar = o8j.this;
            o8jVar.f8835b.m10607h(o8jVar.f11385f);
            o8j.this.f11385f = null;
        }

        @Override // p007l.an00
        /* JADX INFO: renamed from: d */
        public void mo8582d(String str, Envelope envelope) {
            o8j.this.f8835b.m10606g(str, envelope);
        }
    }

    public o8j(PhotoAlbumFeedFrag photoAlbumFeedFrag) {
        super(photoAlbumFeedFrag.m5443R4());
        this.f11386g = photoAlbumFeedFrag;
        this.f8835b = new hf00(10);
        this.f11383d = new C2446a();
        this.f11384e = new C2447b();
        if (nkg.m12212J()) {
            new s8j(photoAlbumFeedFrag).m14112d();
        }
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m12468H(Throwable th) {
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m12475O(Throwable th) {
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m12478R(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m12483k0(List list) {
        this.f11386g.m5462k5("p_discover_dating");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m12484q0(xaj0 xaj0Var) {
        this.f8836c.m5067e5(xaj0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ void m12485r0(Throwable th) {
        this.f8836c.m5062Z4();
    }

    @Override // p007l.hx60
    /* JADX INFO: renamed from: A */
    public void mo5597A() {
        this.f8834a = System.currentTimeMillis();
        m12505s0();
        this.f8836c.duringCreated(FeedModule.f316d.m16688mc("dating")).subscribe(mkd0.H(new e30() { // from class: l.u7j
            public final void call(Object obj) {
                this.f13581a.m12484q0((xaj0) obj);
            }
        }, new e30() { // from class: l.f8j
            public final void call(Object obj) {
                this.f8029a.m12485r0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W */
    public void m12486W() {
        this.f8836c.duringCreated(FeedModule.f316d.f14992n0).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.k8j
            public final void call(Object obj) {
                this.f9635a.m12493d0((Moment) obj);
            }
        }));
        this.f8836c.duringCreated(FeedModule.f316d.f14994o0).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.l8j
            public final void call(Object obj) {
                this.f9944a.m12494e0((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X */
    public void m12487X() {
        this.f8836c.duringCreated(FeedModule.f316d.f14996p0).subscribe(mkd0.G(new e30() { // from class: l.n8j
            public final void call(Object obj) {
                this.f10708a.m12495f0((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y */
    public final void m12488Y(int i, List<Moment> list, j760<Links, List<Moment>> j760Var) {
        if (i <= 0 || vwb.J(list)) {
            return;
        }
        int iMin = Math.min(i, list.size());
        HashSet hashSet = new HashSet();
        int iMin2 = Math.min(iMin, 3);
        for (int i2 = 0; i2 < iMin2; i2++) {
            hashSet.add(((DbObject) list.get(i2)).id);
        }
        Iterator it = ((List) j760Var.b).iterator();
        while (it.hasNext()) {
            if (hashSet.contains(((DbObject) ((Moment) it.next())).id)) {
                it.remove();
            }
        }
        ((List) j760Var.b).add(0, list.get(0));
        if (iMin > 1) {
            Moment moment = new Moment();
            moment.nullCheck();
            ((DbObject) moment).id = DbObject.GENERATE_UNIQUE_FAKE_ID(((Integer) App.i.get()).intValue());
            FeedSeeMoreFollowingMomentInfo feedSeeMoreFollowingMomentInfo = new FeedSeeMoreFollowingMomentInfo();
            feedSeeMoreFollowingMomentInfo.action = 1;
            feedSeeMoreFollowingMomentInfo.followingMoments = list;
            feedSeeMoreFollowingMomentInfo.unReadfollowingFeeds = iMin;
            moment.mFeedSeeMoreFollowingMomentInfo = feedSeeMoreFollowingMomentInfo;
            ((List) j760Var.b).add(1, moment);
            return;
        }
        Moment moment2 = new Moment();
        moment2.nullCheck();
        ((DbObject) moment2).id = DbObject.GENERATE_UNIQUE_FAKE_ID(((Integer) App.i.get()).intValue());
        FeedSeeMoreFollowingMomentInfo feedSeeMoreFollowingMomentInfo2 = new FeedSeeMoreFollowingMomentInfo();
        feedSeeMoreFollowingMomentInfo2.action = 3;
        feedSeeMoreFollowingMomentInfo2.followingMoments = list;
        feedSeeMoreFollowingMomentInfo2.unReadfollowingFeeds = iMin;
        moment2.mFeedSeeMoreFollowingMomentInfo = feedSeeMoreFollowingMomentInfo2;
        ((List) j760Var.b).add(1, moment2);
    }

    /* JADX INFO: renamed from: Z */
    public void m12489Z() {
        this.f8836c.duringCreated(FeedModule.f316d.f14947Q0).subscribe(mkd0.G(new e30() { // from class: l.w7j
            public final void call(Object obj) {
                this.f14440a.m12496g0((j760) obj);
            }
        }));
        this.f8836c.duringCreated(FeedModule.f316d.f14951S0).subscribe(mkd0.G(new e30() { // from class: l.x7j
            public final void call(Object obj) {
                this.f14792a.m12497h0((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a0 */
    public final void m12490a0(final int i, final List<Moment> list) {
        if (!je80.m11129b().f9326b.mo8474f()) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f8836c.duringCreated(FeedModule.f316d.m16704p7(this.f11383d)).subscribe(mkd0.H(new e30() { // from class: l.b8j
                public final void call(Object obj) {
                    this.f6176a.m12498i0(jElapsedRealtime, i, list, (j760) obj);
                }
            }, new e30() { // from class: l.c8j
                public final void call(Object obj) {
                    this.f6566a.m12499j0((Throwable) obj);
                }
            }));
            return;
        }
        if (NullChecker.a(je80.m11129b().f9326b.m12448l())) {
            this.f8835b.m10608i(je80.m11129b().f9326b.m12448l());
        }
        m12488Y(i, list, je80.m11129b().f9326b.m14778e());
        m12508v0(je80.m11129b().f9326b.m14778e());
        je80.m11129b().f9326b.m14777d();
    }

    /* JADX INFO: renamed from: b0 */
    public final int m12491b0(List<Moment> list) {
        int i = 0;
        if (vwb.J(list)) {
            return 0;
        }
        double dDoubleValue = ((Double) FeedModule.f316d.f14967a1.get()).doubleValue();
        Iterator<Moment> it = list.iterator();
        while (it.hasNext() && (it.next().createdTime <= dDoubleValue || (i = i + 1) < 4)) {
        }
        return i;
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m12492c0(xaj0 xaj0Var) {
        if (vwb.J((Collection) xaj0Var.a)) {
            return;
        }
        PhotoAlbumFeedFrag photoAlbumFeedFrag = this.f11386g;
        if (photoAlbumFeedFrag.f3090C || photoAlbumFeedFrag.lifecycle_() != c.i) {
            return;
        }
        PhotoAlbumFeedFrag photoAlbumFeedFrag2 = this.f11386g;
        if (photoAlbumFeedFrag2.f3091D) {
            photoAlbumFeedFrag2.f3092z.m8704U0((Group) ((List) xaj0Var.a).get(0), (List) xaj0Var.b);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m12493d0(Moment moment) {
        this.f8836c.m5049M4(moment);
        if (TextUtils.isEmpty(moment.group.f684id) || moment.group.lastJoined || !nkg.m12216N() || ((DbObject) moment).id.startsWith("fake_id_")) {
            return;
        }
        FeedModule.f316d.m16439D7(moment.group.f684id, 6, null).subscribe(mkd0.H(new e30() { // from class: l.d8j
            public final void call(Object obj) {
                this.f6867a.m12492c0((xaj0) obj);
            }
        }, new e30() { // from class: l.e8j
            public final void call(Object obj) {
                o8j.m12475O((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m12494e0(Moment moment) {
        this.f8836c.m5049M4(moment);
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m12495f0(Moment moment) {
        this.f8836c.m5052P4(moment);
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m12496g0(j760 j760Var) {
        this.f8836c.m5048B3(j760Var, true);
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m12497h0(j760 j760Var) {
        this.f8836c.m5048B3(j760Var, false);
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m12498i0(long j, int i, List list, j760 j760Var) {
        TrackMediaUploadUtil.b0("p_discover_dating", SystemClock.elapsedRealtime() - j);
        m12488Y(i, list, j760Var);
        m12508v0(j760Var);
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m12499j0(Throwable th) {
        this.f8836c.m5062Z4();
    }

    @Override // p007l.hx60
    /* JADX INFO: renamed from: k */
    public rx.c<roj0> mo10739k(Moment moment) {
        if (TEnum.equals(moment.status(), "failed") && ((DbObject) moment).id.startsWith("fake_id_")) {
            FeedModule.f315c.m1654h3(((DbObject) moment)._id);
        }
        return super.mo10739k(moment);
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m12500l0(long j, j760 j760Var) {
        TrackMediaUploadUtil.b0("follow", SystemClock.elapsedRealtime() - j);
        ArrayList arrayListN = vwb.n((Collection) j760Var.b, new w9j() { // from class: l.a8j
            public final Object call(Object obj) {
                return Boolean.valueOf(!TextUtils.equals(((Moment) obj).owner, FeedModule.m1139F().userId()));
            }
        });
        m12490a0(m12491b0(arrayListN), arrayListN);
        if (vwb.J((Collection) j760Var.b)) {
            return;
        }
        FeedModule.f316d.m16626dd(((Moment) ((List) j760Var.b).get(0)).createdTime);
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m12501m0(Throwable th) {
        m12490a0(0, null);
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m12502n0(j760 j760Var) {
        if (((Boolean) j760Var.b).booleanValue()) {
            this.f8836c.m5061Y4((String) j760Var.a, true);
        }
    }

    @Override // p007l.hx60
    /* JADX INFO: renamed from: o */
    public void mo5610o() {
        super.mo5610o();
        m12486W();
        m12487X();
        m12506t0();
        m12489Z();
        if (nkg.m12250l0()) {
            m12507u0();
        }
        this.f8836c.duringCreated(FeedModule.f316d.m16620d7("p_discover_dating", "")).subscribe(mkd0.H(new e30() { // from class: l.i8j
            public final void call(Object obj) {
                this.f8961a.m12483k0((List) obj);
            }
        }, new e30() { // from class: l.j8j
            public final void call(Object obj) {
                o8j.m12478R((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m12503o0(String str) {
        this.f11386g.f3092z.m8706V0(str);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m12504p0(j760 j760Var) {
        this.f8836c.m5065c5(j760Var);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m12505s0() {
        Counter counterM10924k = ijb0.m10924k();
        if (!NullChecker.a(counterM10924k) || counterM10924k.moments.unreadFeeds <= 0 || nkg.m12265t()) {
            m12490a0(0, null);
        } else {
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            FeedModule.f316d.m16669k7(this.f11384e).subscribe(mkd0.H(new e30() { // from class: l.y7j
                public final void call(Object obj) {
                    this.f15289a.m12500l0(jElapsedRealtime, (j760) obj);
                }
            }, new e30() { // from class: l.z7j
                public final void call(Object obj) {
                    this.f15641a.m12501m0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: t0 */
    public void m12506t0() {
        this.f8836c.duringCreated(FeedModule.f316d.f14945P0).subscribe(mkd0.G(new e30() { // from class: l.v7j
            public final void call(Object obj) {
                this.f14087a.m12502n0((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u0 */
    public void m12507u0() {
        this.f8836c.duringCreated(FeedModule.f316d.f14913B1).subscribe(mkd0.G(new e30() { // from class: l.m8j
            public final void call(Object obj) {
                this.f10271a.m12503o0((String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v0 */
    public final void m12508v0(j760<Links, List<Moment>> j760Var) {
        this.f8836c.m5066d5(j760Var);
    }

    @Override // p007l.hx60
    /* JADX INFO: renamed from: z */
    public void mo5611z() {
        this.f8834a = System.currentTimeMillis();
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f8836c;
        photoAlbumBaseFrag.duringCreated(FeedModule.f316d.m16697o7(photoAlbumBaseFrag.m5053Q4(), this.f11383d)).subscribe(mkd0.H(new e30() { // from class: l.g8j
            public final void call(Object obj) {
                this.f8390a.m12504p0((j760) obj);
            }
        }, new e30() { // from class: l.h8j
            public final void call(Object obj) {
                o8j.m12468H((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l.o8j$b */
    public class C2447b extends an00 {
        public C2447b() {
        }

        @Override // p007l.an00
        /* JADX INFO: renamed from: c */
        public void mo6843c(Envelope envelope) {
            if (NullChecker.a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                o8j.this.f11385f = ((FeedData) envelope.getModuleData(FeedData.class)).feeds;
            }
        }

        @Override // p007l.an00
        /* JADX INFO: renamed from: a */
        public void mo6842a(Envelope envelope) {
        }
    }
}
