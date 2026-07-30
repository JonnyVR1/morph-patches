package p149l;

import android.os.SystemClock;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.FeedData;
import com.p046p1.mobile.putong.feed.data.FeedSeeMoreFollowingMomentInfo;
import com.p046p1.mobile.putong.feed.data.Group;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.RawFeed;
import com.p046p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedFrag;
import com.p046p1.mobile.putong.util.TrackMediaUploadUtil;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes12.dex */
public class o8j extends hx60 {

    /* JADX INFO: renamed from: d */
    public an00 f142636d;

    /* JADX INFO: renamed from: e */
    public an00 f142637e;

    /* JADX INFO: renamed from: f */
    public List<RawFeed> f142638f;

    /* JADX INFO: renamed from: g */
    public PhotoAlbumFeedFrag f142639g;

    /* JADX INFO: renamed from: l.o8j$a */
    public class C18875a extends an00 {
        public C18875a() {
        }

        @Override // p149l.an00
        /* JADX INFO: renamed from: a */
        public void mo65703a(Envelope envelope) {
            if (NullChecker.m81303a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                o8j.this.f109833b.m130726h(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
            }
        }

        @Override // p149l.an00
        /* JADX INFO: renamed from: b */
        public void mo97701b(String str, Envelope envelope) {
            o8j.this.f109833b.m130724f(str, envelope);
        }

        @Override // p149l.an00
        /* JADX INFO: renamed from: c */
        public void mo65704c(Envelope envelope) {
            if (NullChecker.m81303a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                o8j.this.f109833b.m130727i(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
            }
            if (vwb.m200296J(o8j.this.f142638f) || nkg.m159906t()) {
                return;
            }
            o8j o8jVar = o8j.this;
            o8jVar.f109833b.m130726h(o8jVar.f142638f);
            o8j.this.f142638f = null;
        }

        @Override // p149l.an00
        /* JADX INFO: renamed from: d */
        public void mo97702d(String str, Envelope envelope) {
            o8j.this.f109833b.m130725g(str, envelope);
        }
    }

    public o8j(PhotoAlbumFeedFrag photoAlbumFeedFrag) {
        super(photoAlbumFeedFrag.m64369R4());
        this.f142639g = photoAlbumFeedFrag;
        this.f109833b = new hf00(10);
        this.f142636d = new C18875a();
        this.f142637e = new C18876b();
        if (nkg.m159853J()) {
            new s8j(photoAlbumFeedFrag).m182652d();
        }
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m163142H(Throwable th) {
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m163149O(Throwable th) {
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m163152R(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m163157k0(List list) {
        this.f142639g.m64386k5("p_discover_dating");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m163158q0(xaj0 xaj0Var) {
        this.f109834c.m64024e5(xaj0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ void m163159r0(Throwable th) {
        this.f109834c.m64019Z4();
    }

    @Override // p149l.hx60
    /* JADX INFO: renamed from: A */
    public void mo64506A() {
        this.f109832a = System.currentTimeMillis();
        m163179s0();
        this.f109834c.duringCreated(FeedModule.f38855d.m209507mc("dating")).subscribe(mkd0.m154956H(new e30() { // from class: l.u7j
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f175012a.m163158q0((xaj0) obj);
            }
        }, new e30() { // from class: l.f8j
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f96381a.m163159r0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W */
    public void m163160W() {
        this.f109834c.duringCreated(FeedModule.f38855d.f193057n0).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.k8j
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f121834a.m163167d0((Moment) obj);
            }
        }));
        this.f109834c.duringCreated(FeedModule.f38855d.f193059o0).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.l8j
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f126831a.m163168e0((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X */
    public void m163161X() {
        this.f109834c.duringCreated(FeedModule.f38855d.f193061p0).subscribe(mkd0.m154955G(new e30() { // from class: l.n8j
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f137654a.m163169f0((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y */
    public final void m163162Y(int i, List<Moment> list, j760<Links, List<Moment>> j760Var) {
        if (i <= 0 || vwb.m200296J(list)) {
            return;
        }
        int iMin = Math.min(i, list.size());
        HashSet hashSet = new HashSet();
        int iMin2 = Math.min(iMin, 3);
        for (int i2 = 0; i2 < iMin2; i2++) {
            hashSet.add(list.get(i2).f56011id);
        }
        Iterator<Moment> it = j760Var.f116565b.iterator();
        while (it.hasNext()) {
            if (hashSet.contains(it.next().f56011id)) {
                it.remove();
            }
        }
        j760Var.f116565b.add(0, list.get(0));
        if (iMin > 1) {
            Moment moment = new Moment();
            moment.nullCheck();
            moment.f56011id = DbObject.GENERATE_UNIQUE_FAKE_ID(App.f15373i.get().intValue());
            FeedSeeMoreFollowingMomentInfo feedSeeMoreFollowingMomentInfo = new FeedSeeMoreFollowingMomentInfo();
            feedSeeMoreFollowingMomentInfo.action = 1;
            feedSeeMoreFollowingMomentInfo.followingMoments = list;
            feedSeeMoreFollowingMomentInfo.unReadfollowingFeeds = iMin;
            moment.mFeedSeeMoreFollowingMomentInfo = feedSeeMoreFollowingMomentInfo;
            j760Var.f116565b.add(1, moment);
            return;
        }
        Moment moment2 = new Moment();
        moment2.nullCheck();
        moment2.f56011id = DbObject.GENERATE_UNIQUE_FAKE_ID(App.f15373i.get().intValue());
        FeedSeeMoreFollowingMomentInfo feedSeeMoreFollowingMomentInfo2 = new FeedSeeMoreFollowingMomentInfo();
        feedSeeMoreFollowingMomentInfo2.action = 3;
        feedSeeMoreFollowingMomentInfo2.followingMoments = list;
        feedSeeMoreFollowingMomentInfo2.unReadfollowingFeeds = iMin;
        moment2.mFeedSeeMoreFollowingMomentInfo = feedSeeMoreFollowingMomentInfo2;
        j760Var.f116565b.add(1, moment2);
    }

    /* JADX INFO: renamed from: Z */
    public void m163163Z() {
        this.f109834c.duringCreated(FeedModule.f38855d.f193012Q0).subscribe(mkd0.m154955G(new e30() { // from class: l.w7j
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f185058a.m163170g0((j760) obj);
            }
        }));
        this.f109834c.duringCreated(FeedModule.f38855d.f193016S0).subscribe(mkd0.m154955G(new e30() { // from class: l.x7j
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f191366a.m163171h0((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a0 */
    public final void m163164a0(final int i, final List<Moment> list) {
        if (!je80.m141102b().f117483b.mo95545f()) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f109834c.duringCreated(FeedModule.f38855d.m209523p7(this.f142636d)).subscribe(mkd0.m154956H(new e30() { // from class: l.b8j
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f74130a.m163172i0(jElapsedRealtime, i, list, (j760) obj);
                }
            }, new e30() { // from class: l.c8j
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f79770a.m163173j0((Throwable) obj);
                }
            }));
            return;
        }
        if (NullChecker.m81303a(je80.m141102b().f117483b.m162975l())) {
            this.f109833b.m130727i(je80.m141102b().f117483b.m162975l());
        }
        m163162Y(i, list, je80.m141102b().f117483b.m192034e());
        m163182v0(je80.m141102b().f117483b.m192034e());
        je80.m141102b().f117483b.m192033d();
    }

    /* JADX INFO: renamed from: b0 */
    public final int m163165b0(List<Moment> list) {
        int i = 0;
        if (vwb.m200296J(list)) {
            return 0;
        }
        double dDoubleValue = FeedModule.f38855d.f193032a1.get().doubleValue();
        Iterator<Moment> it = list.iterator();
        while (it.hasNext() && (it.next().createdTime <= dDoubleValue || (i = i + 1) < 4)) {
        }
        return i;
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m163166c0(xaj0 xaj0Var) {
        if (vwb.m200296J((Collection) xaj0Var.f191751a)) {
            return;
        }
        PhotoAlbumFeedFrag photoAlbumFeedFrag = this.f142639g;
        if (photoAlbumFeedFrag.f41629C || photoAlbumFeedFrag.lifecycle_() != C4319c.f15548i) {
            return;
        }
        PhotoAlbumFeedFrag photoAlbumFeedFrag2 = this.f142639g;
        if (photoAlbumFeedFrag2.f41630D) {
            photoAlbumFeedFrag2.f41631z.m100585U0((Group) ((List) xaj0Var.f191751a).get(0), (List) xaj0Var.f191752b);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m163167d0(Moment moment) {
        this.f109834c.m64006M4(moment);
        if (TextUtils.isEmpty(moment.group.f39223id) || moment.group.lastJoined || !nkg.m159857N() || moment.f56011id.startsWith("fake_id_")) {
            return;
        }
        FeedModule.f38855d.m209258D7(moment.group.f39223id, 6, null).subscribe(mkd0.m154956H(new e30() { // from class: l.d8j
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f84873a.m163166c0((xaj0) obj);
            }
        }, new e30() { // from class: l.e8j
            @Override // p149l.e30
            public final void call(Object obj) {
                o8j.m163149O((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m163168e0(Moment moment) {
        this.f109834c.m64006M4(moment);
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m163169f0(Moment moment) {
        this.f109834c.m64009P4(moment);
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m163170g0(j760 j760Var) {
        this.f109834c.m64005B3(j760Var, true);
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m163171h0(j760 j760Var) {
        this.f109834c.m64005B3(j760Var, false);
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m163172i0(long j, int i, List list, j760 j760Var) {
        TrackMediaUploadUtil.m80298b0("p_discover_dating", SystemClock.elapsedRealtime() - j);
        m163162Y(i, list, j760Var);
        m163182v0(j760Var);
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m163173j0(Throwable th) {
        this.f109834c.m64019Z4();
    }

    @Override // p149l.hx60
    /* JADX INFO: renamed from: k */
    public C22306c<roj0> mo133304k(Moment moment) {
        if (TEnum.equals(moment.status(), "failed") && moment.f56011id.startsWith("fake_id_")) {
            FeedModule.f38854c.m60728h3(moment._id);
        }
        return super.mo133304k(moment);
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m163174l0(long j, j760 j760Var) {
        TrackMediaUploadUtil.m80298b0("follow", SystemClock.elapsedRealtime() - j);
        ArrayList arrayListM200339n = vwb.m200339n((Collection) j760Var.f116565b, new w9j() { // from class: l.a8j
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!TextUtils.equals(((Moment) obj).owner, FeedModule.m60221F().userId()));
            }
        });
        m163164a0(m163165b0(arrayListM200339n), arrayListM200339n);
        if (vwb.m200296J((Collection) j760Var.f116565b)) {
            return;
        }
        FeedModule.f38855d.m209445dd(((Moment) ((List) j760Var.f116565b).get(0)).createdTime);
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m163175m0(Throwable th) {
        m163164a0(0, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m163176n0(j760 j760Var) {
        if (((Boolean) j760Var.f116565b).booleanValue()) {
            this.f109834c.m64018Y4((String) j760Var.f116564a, true);
        }
    }

    @Override // p149l.hx60
    /* JADX INFO: renamed from: o */
    public void mo64519o() {
        super.mo64519o();
        m163160W();
        m163161X();
        m163180t0();
        m163163Z();
        if (nkg.m159891l0()) {
            m163181u0();
        }
        this.f109834c.duringCreated(FeedModule.f38855d.m209439d7("p_discover_dating", "")).subscribe(mkd0.m154956H(new e30() { // from class: l.i8j
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f112047a.m163157k0((List) obj);
            }
        }, new e30() { // from class: l.j8j
            @Override // p149l.e30
            public final void call(Object obj) {
                o8j.m163152R((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m163177o0(String str) {
        this.f142639g.f41631z.m100587V0(str);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m163178p0(j760 j760Var) {
        this.f109834c.m64022c5(j760Var);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m163179s0() {
        Counter counterM136571k = ijb0.m136571k();
        if (!NullChecker.m81303a(counterM136571k) || counterM136571k.moments.unreadFeeds <= 0 || nkg.m159906t()) {
            m163164a0(0, null);
        } else {
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            FeedModule.f38855d.m209488k7(this.f142637e).subscribe(mkd0.m154956H(new e30() { // from class: l.y7j
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f196710a.m163174l0(jElapsedRealtime, (j760) obj);
                }
            }, new e30() { // from class: l.z7j
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f202037a.m163175m0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: t0 */
    public void m163180t0() {
        this.f109834c.duringCreated(FeedModule.f38855d.f193010P0).subscribe(mkd0.m154955G(new e30() { // from class: l.v7j
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f180393a.m163176n0((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u0 */
    public void m163181u0() {
        this.f109834c.duringCreated(FeedModule.f38855d.f192978B1).subscribe(mkd0.m154955G(new e30() { // from class: l.m8j
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f132580a.m163177o0((String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v0 */
    public final void m163182v0(j760<Links, List<Moment>> j760Var) {
        this.f109834c.m64023d5(j760Var);
    }

    @Override // p149l.hx60
    /* JADX INFO: renamed from: z */
    public void mo64520z() {
        this.f109832a = System.currentTimeMillis();
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f109834c;
        photoAlbumBaseFrag.duringCreated(FeedModule.f38855d.m209516o7(photoAlbumBaseFrag.m64010Q4(), this.f142636d)).subscribe(mkd0.m154956H(new e30() { // from class: l.g8j
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f101503a.m163178p0((j760) obj);
            }
        }, new e30() { // from class: l.h8j
            @Override // p149l.e30
            public final void call(Object obj) {
                o8j.m163142H((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l.o8j$b */
    public class C18876b extends an00 {
        public C18876b() {
        }

        @Override // p149l.an00
        /* JADX INFO: renamed from: c */
        public void mo65704c(Envelope envelope) {
            if (NullChecker.m81303a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                o8j.this.f142638f = ((FeedData) envelope.getModuleData(FeedData.class)).feeds;
            }
        }

        @Override // p149l.an00
        /* JADX INFO: renamed from: a */
        public void mo65703a(Envelope envelope) {
        }
    }
}
