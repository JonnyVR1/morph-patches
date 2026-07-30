package p153l;

import android.os.SystemClock;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.FeedData;
import com.p051p1.mobile.putong.feed.data.FeedSeeMoreFollowingMomentInfo;
import com.p051p1.mobile.putong.feed.data.Group;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.RawFeed;
import com.p051p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedFrag;
import com.p051p1.mobile.putong.util.TrackMediaUploadUtil;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes13.dex */
public class ibj extends n570 {

    /* JADX INFO: renamed from: d */
    public jv00 f114221d;

    /* JADX INFO: renamed from: e */
    public jv00 f114222e;

    /* JADX INFO: renamed from: f */
    public List<RawFeed> f114223f;

    /* JADX INFO: renamed from: g */
    public PhotoAlbumFeedFrag f114224g;

    /* JADX INFO: renamed from: l.ibj$a */
    public class C17693a extends jv00 {
        public C17693a() {
        }

        @Override // p153l.jv00
        /* JADX INFO: renamed from: a */
        public void mo66886a(Envelope envelope) {
            if (NullChecker.m82486a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                ibj.this.f140315b.m177165h(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
            }
        }

        @Override // p153l.jv00
        /* JADX INFO: renamed from: b */
        public void mo104110b(String str, Envelope envelope) {
            ibj.this.f140315b.m177163f(str, envelope);
        }

        @Override // p153l.jv00
        /* JADX INFO: renamed from: c */
        public void mo66887c(Envelope envelope) {
            if (NullChecker.m82486a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                ibj.this.f140315b.m177166i(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
            }
            if (jyb.m147479J(ibj.this.f114223f) || cmg.m111235t()) {
                return;
            }
            ibj ibjVar = ibj.this;
            ibjVar.f140315b.m177165h(ibjVar.f114223f);
            ibj.this.f114223f = null;
        }

        @Override // p153l.jv00
        /* JADX INFO: renamed from: d */
        public void mo104111d(String str, Envelope envelope) {
            ibj.this.f140315b.m177164g(str, envelope);
        }
    }

    public ibj(PhotoAlbumFeedFrag photoAlbumFeedFrag) {
        super(photoAlbumFeedFrag.m65552R4());
        this.f114224g = photoAlbumFeedFrag;
        this.f140315b = new qn00(10);
        this.f114221d = new C17693a();
        this.f114222e = new C17694b();
        if (cmg.m111182J()) {
            new mbj(photoAlbumFeedFrag).m157788d();
        }
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m139343H(Throwable th) {
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m139350O(Throwable th) {
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m139353R(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m139358k0(List list) {
        this.f114224g.m65569k5("p_discover_dating");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m139359q0(bkj0 bkj0Var) {
        this.f140316c.m65207e5(bkj0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ void m139360r0(Throwable th) {
        this.f140316c.m65202Z4();
    }

    @Override // p153l.n570
    /* JADX INFO: renamed from: A */
    public void mo65689A() {
        this.f140314a = System.currentTimeMillis();
        m139380s0();
        this.f140316c.duringCreated(FeedModule.f39703d.m145748mc("dating")).subscribe(psd0.m173597H(new y20() { // from class: l.oaj
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f145742a.m139359q0((bkj0) obj);
            }
        }, new y20() { // from class: l.zaj
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f203574a.m139360r0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W */
    public void m139361W() {
        this.f140316c.duringCreated(FeedModule.f39703d.f121367n0).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.ebj
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f92928a.m139368d0((Moment) obj);
            }
        }));
        this.f140316c.duringCreated(FeedModule.f39703d.f121369o0).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.fbj
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f98115a.m139369e0((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X */
    public void m139362X() {
        this.f140316c.duringCreated(FeedModule.f39703d.f121371p0).subscribe(psd0.m173596G(new y20() { // from class: l.hbj
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f108593a.m139370f0((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y */
    public final void m139363Y(int i, List<Moment> list, pf60<Links, List<Moment>> pf60Var) {
        if (i <= 0 || jyb.m147479J(list)) {
            return;
        }
        int iMin = Math.min(i, list.size());
        HashSet hashSet = new HashSet();
        int iMin2 = Math.min(iMin, 3);
        for (int i2 = 0; i2 < iMin2; i2++) {
            hashSet.add(list.get(i2).f56859id);
        }
        Iterator<Moment> it = pf60Var.f152157b.iterator();
        while (it.hasNext()) {
            if (hashSet.contains(it.next().f56859id)) {
                it.remove();
            }
        }
        pf60Var.f152157b.add(0, list.get(0));
        if (iMin > 1) {
            Moment moment = new Moment();
            moment.nullCheck();
            moment.f56859id = DbObject.GENERATE_UNIQUE_FAKE_ID(App.f16092i.get().intValue());
            FeedSeeMoreFollowingMomentInfo feedSeeMoreFollowingMomentInfo = new FeedSeeMoreFollowingMomentInfo();
            feedSeeMoreFollowingMomentInfo.action = 1;
            feedSeeMoreFollowingMomentInfo.followingMoments = list;
            feedSeeMoreFollowingMomentInfo.unReadfollowingFeeds = iMin;
            moment.mFeedSeeMoreFollowingMomentInfo = feedSeeMoreFollowingMomentInfo;
            pf60Var.f152157b.add(1, moment);
            return;
        }
        Moment moment2 = new Moment();
        moment2.nullCheck();
        moment2.f56859id = DbObject.GENERATE_UNIQUE_FAKE_ID(App.f16092i.get().intValue());
        FeedSeeMoreFollowingMomentInfo feedSeeMoreFollowingMomentInfo2 = new FeedSeeMoreFollowingMomentInfo();
        feedSeeMoreFollowingMomentInfo2.action = 3;
        feedSeeMoreFollowingMomentInfo2.followingMoments = list;
        feedSeeMoreFollowingMomentInfo2.unReadfollowingFeeds = iMin;
        moment2.mFeedSeeMoreFollowingMomentInfo = feedSeeMoreFollowingMomentInfo2;
        pf60Var.f152157b.add(1, moment2);
    }

    /* JADX INFO: renamed from: Z */
    public void m139364Z() {
        this.f140316c.duringCreated(FeedModule.f39703d.f121322Q0).subscribe(psd0.m173596G(new y20() { // from class: l.qaj
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f156391a.m139371g0((pf60) obj);
            }
        }));
        this.f140316c.duringCreated(FeedModule.f39703d.f121326S0).subscribe(psd0.m173596G(new y20() { // from class: l.raj
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f161935a.m139372h0((pf60) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a0 */
    public final void m139365a0(final int i, final List<Moment> list) {
        if (!pm80.m172919b().f153126b.mo167403f()) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f140316c.duringCreated(FeedModule.f39703d.m145764p7(this.f114221d)).subscribe(psd0.m173597H(new y20() { // from class: l.vaj
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f183100a.m139373i0(jElapsedRealtime, i, list, (pf60) obj);
                }
            }, new y20() { // from class: l.waj
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f188137a.m139374j0((Throwable) obj);
                }
            }));
            return;
        }
        if (NullChecker.m82486a(pm80.m172919b().f153126b.m195014l())) {
            this.f140315b.m177166i(pm80.m172919b().f153126b.m195014l());
        }
        m139363Y(i, list, pm80.m172919b().f153126b.m171089e());
        m139383v0(pm80.m172919b().f153126b.m171089e());
        pm80.m172919b().f153126b.m171088d();
    }

    /* JADX INFO: renamed from: b0 */
    public final int m139366b0(List<Moment> list) {
        int i = 0;
        if (jyb.m147479J(list)) {
            return 0;
        }
        double dDoubleValue = FeedModule.f39703d.f121342a1.get().doubleValue();
        Iterator<Moment> it = list.iterator();
        while (it.hasNext() && (it.next().createdTime <= dDoubleValue || (i = i + 1) < 4)) {
        }
        return i;
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m139367c0(bkj0 bkj0Var) {
        if (jyb.m147479J((Collection) bkj0Var.f77081a)) {
            return;
        }
        PhotoAlbumFeedFrag photoAlbumFeedFrag = this.f114224g;
        if (photoAlbumFeedFrag.f42477C || photoAlbumFeedFrag.lifecycle_() != C4470c.f16267i) {
            return;
        }
        PhotoAlbumFeedFrag photoAlbumFeedFrag2 = this.f114224g;
        if (photoAlbumFeedFrag2.f42478D) {
            photoAlbumFeedFrag2.f42479z.m134748U0((Group) ((List) bkj0Var.f77081a).get(0), (List) bkj0Var.f77082b);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m139368d0(Moment moment) {
        this.f140316c.m65189M4(moment);
        if (TextUtils.isEmpty(moment.group.f40071id) || moment.group.lastJoined || !cmg.m111186N() || moment.f56859id.startsWith("fake_id_")) {
            return;
        }
        FeedModule.f39703d.m145499D7(moment.group.f40071id, 6, null).subscribe(psd0.m173597H(new y20() { // from class: l.xaj
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f193043a.m139367c0((bkj0) obj);
            }
        }, new y20() { // from class: l.yaj
            @Override // p153l.y20
            public final void call(Object obj) {
                ibj.m139350O((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m139369e0(Moment moment) {
        this.f140316c.m65189M4(moment);
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m139370f0(Moment moment) {
        this.f140316c.m65192P4(moment);
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m139371g0(pf60 pf60Var) {
        this.f140316c.m65188B3(pf60Var, true);
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m139372h0(pf60 pf60Var) {
        this.f140316c.m65188B3(pf60Var, false);
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m139373i0(long j, int i, List list, pf60 pf60Var) {
        TrackMediaUploadUtil.m81481b0("p_discover_dating", SystemClock.elapsedRealtime() - j);
        m139363Y(i, list, pf60Var);
        m139383v0(pf60Var);
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m139374j0(Throwable th) {
        this.f140316c.m65202Z4();
    }

    @Override // p153l.n570
    /* JADX INFO: renamed from: k */
    public C22421c<uxj0> mo137269k(Moment moment) {
        if (TEnum.equals(moment.status(), "failed") && moment.f56859id.startsWith("fake_id_")) {
            FeedModule.f39702c.m61912h3(moment._id);
        }
        return super.mo137269k(moment);
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m139375l0(long j, pf60 pf60Var) {
        TrackMediaUploadUtil.m81481b0("follow", SystemClock.elapsedRealtime() - j);
        ArrayList arrayListM147522n = jyb.m147522n((Collection) pf60Var.f152157b, new qcj() { // from class: l.uaj
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!TextUtils.equals(((Moment) obj).owner, FeedModule.m61405F().userId()));
            }
        });
        m139365a0(m139366b0(arrayListM147522n), arrayListM147522n);
        if (jyb.m147479J((Collection) pf60Var.f152157b)) {
            return;
        }
        FeedModule.f39703d.m145686dd(((Moment) ((List) pf60Var.f152157b).get(0)).createdTime);
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m139376m0(Throwable th) {
        m139365a0(0, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m139377n0(pf60 pf60Var) {
        if (((Boolean) pf60Var.f152157b).booleanValue()) {
            this.f140316c.m65201Y4((String) pf60Var.f152156a, true);
        }
    }

    @Override // p153l.n570
    /* JADX INFO: renamed from: o */
    public void mo65702o() {
        super.mo65702o();
        m139361W();
        m139362X();
        m139381t0();
        m139364Z();
        if (cmg.m111220l0()) {
            m139382u0();
        }
        this.f140316c.duringCreated(FeedModule.f39703d.m145680d7("p_discover_dating", "")).subscribe(psd0.m173597H(new y20() { // from class: l.cbj
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f80826a.m139358k0((List) obj);
            }
        }, new y20() { // from class: l.dbj
            @Override // p153l.y20
            public final void call(Object obj) {
                ibj.m139353R((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m139378o0(String str) {
        this.f114224g.f42479z.m134750V0(str);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m139379p0(pf60 pf60Var) {
        this.f140316c.m65205c5(pf60Var);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m139380s0() {
        Counter counterM159657k = mrb0.m159657k();
        if (!NullChecker.m82486a(counterM159657k) || counterM159657k.moments.unreadFeeds <= 0 || cmg.m111235t()) {
            m139365a0(0, null);
        } else {
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            FeedModule.f39703d.m145729k7(this.f114222e).subscribe(psd0.m173597H(new y20() { // from class: l.saj
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f167050a.m139375l0(jElapsedRealtime, (pf60) obj);
                }
            }, new y20() { // from class: l.taj
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f172736a.m139376m0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: t0 */
    public void m139381t0() {
        this.f140316c.duringCreated(FeedModule.f39703d.f121320P0).subscribe(psd0.m173596G(new y20() { // from class: l.paj
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f151287a.m139377n0((pf60) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u0 */
    public void m139382u0() {
        this.f140316c.duringCreated(FeedModule.f39703d.f121288B1).subscribe(psd0.m173596G(new y20() { // from class: l.gbj
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f103473a.m139378o0((String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v0 */
    public final void m139383v0(pf60<Links, List<Moment>> pf60Var) {
        this.f140316c.m65206d5(pf60Var);
    }

    @Override // p153l.n570
    /* JADX INFO: renamed from: z */
    public void mo65703z() {
        this.f140314a = System.currentTimeMillis();
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f140316c;
        photoAlbumBaseFrag.duringCreated(FeedModule.f39703d.m145757o7(photoAlbumBaseFrag.m65193Q4(), this.f114221d)).subscribe(psd0.m173597H(new y20() { // from class: l.abj
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f69629a.m139379p0((pf60) obj);
            }
        }, new y20() { // from class: l.bbj
            @Override // p153l.y20
            public final void call(Object obj) {
                ibj.m139343H((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l.ibj$b */
    public class C17694b extends jv00 {
        public C17694b() {
        }

        @Override // p153l.jv00
        /* JADX INFO: renamed from: c */
        public void mo66887c(Envelope envelope) {
            if (NullChecker.m82486a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                ibj.this.f114223f = ((FeedData) envelope.getModuleData(FeedData.class)).feeds;
            }
        }

        @Override // p153l.jv00
        /* JADX INFO: renamed from: a */
        public void mo66886a(Envelope envelope) {
        }
    }
}
