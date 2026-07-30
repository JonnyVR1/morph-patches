package com.p000p1.mobile.putong.feed.newui.photoalbum.adapter;

import android.R;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;
import androidx.viewpager.widget.ViewPager;
import com.p000p1.mobile.putong.data.Audio;
import com.p000p1.mobile.putong.data.Live;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.OMSDialogPositon;
import com.p000p1.mobile.putong.data.OMSTemplateModeType;
import com.p000p1.mobile.putong.data.Order;
import com.p000p1.mobile.putong.data.Picture;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.LiveExtraInFeed;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.RawFeed;
import com.p000p1.mobile.putong.feed.newui.photoalbum.CommonEmptyView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.DiscoveryPager;
import com.p000p1.mobile.putong.feed.newui.photoalbum.FeedListActivityTextWithLinkItem;
import com.p000p1.mobile.putong.feed.newui.photoalbum.FeedListImageLinkItem;
import com.p000p1.mobile.putong.feed.newui.photoalbum.FeedListTextWithCommentItem;
import com.p000p1.mobile.putong.feed.newui.photoalbum.FeedListTextWithLinkItem;
import com.p000p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumBottomView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumFeedCommentView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.adapter.C2124a;
import com.p000p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.hello.FeedNearbyOnlineView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterForwardVideoView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterLiveVoiceMomentView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterVideoView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterVoteView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feedtop.PhotoAlbumTopView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.guide.FeedMomentViewersOperationGuideView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.live.FeedLiveRecommendView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.poi.view.FeedPoiGuideView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.view.FeedGroupView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.view.FeedPostGuideView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.view.FeedRoamMomentItemView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.view.FeedSeeMoreFollowingMomentView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.view.FeedSingleTopicView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.view.FeedSvipLimitedMomentItemView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.view.FeedTimeViewInList;
import com.p000p1.mobile.putong.feed.newui.photoalbum.view.TopicRecommendTopicView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.view.TopicRecommendUserView;
import com.p000p1.mobile.putong.feed.newui.see.MomentSeeEntryItemView;
import com.p000p1.mobile.putong.feed.newui.status.display.view.FeedStateSquareEntranceView;
import com.p000p1.mobile.putong.feed.newui.topic.qatopic.QATopicAggregationActivity;
import com.p000p1.mobile.putong.feed.newui.topic.qatopic.QATopicPhotoAlbumTopView;
import com.p000p1.mobile.putong.feed.newui.topic.topicaggregation.TopicAggregationAct;
import com.p000p1.mobile.putong.feed.newui.view.TopicRecommendView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import l.ajc0;
import l.d30;
import l.dac0;
import l.e30;
import l.i0g0;
import l.j760;
import l.mkd0;
import l.mqi0;
import l.q860;
import l.qib0;
import l.sm80;
import l.t100;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.zvf0;
import org.json.JSONObject;
import p007l.a7h;
import p007l.b5c0;
import p007l.ei00;
import p007l.f3c0;
import p007l.fm20;
import p007l.hx60;
import p007l.ig00;
import p007l.ijb0;
import p007l.jg00;
import p007l.kg00;
import p007l.l80;
import p007l.nah;
import p007l.nkg;
import p007l.o6c0;
import p007l.osg;
import p007l.p6j0;
import p007l.u2h;
import p007l.vqg;
import p007l.xa70;
import p007l.yah;
import p007l.zi60;
import v.VPager;
import v.VRecyclerView;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.adapter.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class C2124a extends dac0<MomentItem> {

    /* JADX INFO: renamed from: d */
    public final PhotoAlbumBaseFrag f2840d;

    /* JADX INFO: renamed from: e */
    public final Act f2841e;

    /* JADX INFO: renamed from: f */
    public hx60 f2842f;

    /* JADX INFO: renamed from: g */
    public final String f2843g;

    /* JADX INFO: renamed from: h */
    public final String f2844h;

    /* JADX INFO: renamed from: i */
    public boolean f2845i;

    /* JADX INFO: renamed from: j */
    public final int f2846j;

    /* JADX INFO: renamed from: k */
    public boolean f2847k;

    /* JADX INFO: renamed from: r */
    public boolean f2854r;

    /* JADX INFO: renamed from: t */
    public ajc0 f2856t;

    /* JADX INFO: renamed from: u */
    public int f2857u;

    /* JADX INFO: renamed from: v */
    public boolean f2858v;

    /* JADX INFO: renamed from: w */
    public yah f2859w;

    /* JADX INFO: renamed from: x */
    public ei00 f2860x;

    /* JADX INFO: renamed from: y */
    public a7h f2861y;

    /* JADX INFO: renamed from: l */
    public boolean f2848l = false;

    /* JADX INFO: renamed from: m */
    public q860<MomentItem> f2849m = q860.a();

    /* JADX INFO: renamed from: n */
    public HashMap<String, Boolean> f2850n = new HashMap<>();

    /* JADX INFO: renamed from: o */
    public HashMap<String, Boolean> f2851o = new HashMap<>();

    /* JADX INFO: renamed from: p */
    public HashMap<String, Boolean> f2852p = new HashMap<>();

    /* JADX INFO: renamed from: q */
    public HashMap<String, Boolean> f2853q = new HashMap<>();

    /* JADX INFO: renamed from: s */
    public List<String> f2855s = new ArrayList();

    /* JADX INFO: renamed from: z */
    public long f2862z = 0;

    /* JADX INFO: renamed from: A */
    public l80<Moment> f2835A = new a();

    /* JADX INFO: renamed from: B */
    public l80<Moment> f2836B = new b();

    /* JADX INFO: renamed from: C */
    public l80<Moment> f2837C = new c();

    /* JADX INFO: renamed from: D */
    public int f2838D = 0;

    /* JADX INFO: renamed from: c */
    public long f2839c = vqg.m15481I("feedTime");

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.adapter.a$a */
    public class a extends l80<Moment> {

        /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.adapter.a$a$a, reason: collision with other inner class name */
        public class C2560a extends ViewPager.m {
            public C2560a() {
            }

            public void onPageScrollStateChanged(int i) {
                super.onPageScrollStateChanged(i);
                if (i == 0) {
                    a.this.m11597o();
                }
            }
        }

        public a() {
        }

        @Override // p007l.l80
        /* JADX INFO: renamed from: f */
        public void mo2865f(ViewGroup viewGroup, ViewGroup viewGroup2) {
            DiscoveryPager discoveryPager = (DiscoveryPager) C2124a.this.m4942P(DiscoveryPager.class, viewGroup);
            if (discoveryPager == null) {
                return;
            }
            discoveryPager.d(new C2560a());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p007l.l80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo4975k(Moment moment, int i, View view) {
            if (NullChecker.a(view) && (view instanceof PhotoAlbumTopView)) {
                ((PhotoAlbumTopView) view).m5803u();
            } else if (NullChecker.a(view) && (view instanceof QATopicPhotoAlbumTopView)) {
                ((QATopicPhotoAlbumTopView) view).m7170M();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.adapter.a$b */
    public class b extends l80<Moment> {

        /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.adapter.a$b$a */
        public class a extends ViewPager.m {
            public a() {
            }

            public void onPageScrollStateChanged(int i) {
                super.onPageScrollStateChanged(i);
                if (i == 0) {
                    b.this.m11597o();
                }
            }
        }

        public b() {
        }

        @Override // p007l.l80
        /* JADX INFO: renamed from: f */
        public void mo2865f(ViewGroup viewGroup, ViewGroup viewGroup2) {
            DiscoveryPager discoveryPager = (DiscoveryPager) C2124a.this.m4942P(DiscoveryPager.class, viewGroup);
            if (discoveryPager == null) {
                return;
            }
            discoveryPager.d(new a());
        }

        @Override // p007l.l80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo4975k(Moment moment, int i, View view) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.adapter.a$c */
    public class c extends l80<Moment> {

        /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.adapter.a$c$a */
        public class a extends ViewPager.m {
            public a() {
            }

            public void onPageScrollStateChanged(int i) {
                super.onPageScrollStateChanged(i);
                if (i == 0) {
                    c.this.m11597o();
                }
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.adapter.a$c$b */
        public class b extends ViewPager.m {
            public b() {
            }

            public void onPageScrollStateChanged(int i) {
                super.onPageScrollStateChanged(i);
                if (i == 0) {
                    c.this.m11597o();
                }
            }
        }

        public c() {
        }

        @Override // p007l.l80
        /* JADX INFO: renamed from: f */
        public void mo2865f(ViewGroup viewGroup, ViewGroup viewGroup2) {
            View viewFindViewById = C2124a.this.f2841e.findViewById(R.id.content);
            DiscoveryPager discoveryPager = (nkg.m12263s() && C2124a.this.m4949X()) ? (DiscoveryPager) viewFindViewById.findViewById(b5c0.f6048g1) : (DiscoveryPager) C2124a.this.m4942P(DiscoveryPager.class, viewGroup);
            int i = C2124a.this.f2846j;
            VPager vPager = (i == 0 || i == 14 || i == 17 || i == 18) ? (DiscoveryPager) viewFindViewById.findViewById(b5c0.f5995R) : null;
            if (discoveryPager == null) {
                return;
            }
            discoveryPager.d(new a());
            if (vPager == null) {
                return;
            }
            C2124a.this.f2837C.m11598p(vPager);
            vPager.d(new b());
        }

        @Override // p007l.l80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo4975k(Moment moment, int i, View view) {
            if (view instanceof FeedCenterView) {
                C2124a.this.m4972x0(moment);
                if (FeedModule.f316d.f14916D0.contains(((DbObject) moment).id)) {
                    return;
                }
                moment.momentViewTime = mqi0.o();
                if (FeedModule.f316d.f14920F0.contains(((DbObject) moment).id)) {
                    return;
                }
                FeedModule.f316d.f14920F0.add(((DbObject) moment).id);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p007l.l80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo4978m(Moment moment, int i, long j, View view) {
            if ((view instanceof FeedCenterView) && moment.momentViewTime != -1 && mqi0.o() - moment.momentViewTime >= C2124a.this.f2839c * 1000 && !FeedModule.f316d.f14916D0.contains(((DbObject) moment).id)) {
                FeedModule.f316d.m16776z6(((DbObject) moment).id);
            }
            if (NullChecker.a(view) && (view instanceof TopicRecommendView)) {
                ((TopicRecommendView) view).m7613a0();
                return;
            }
            if (NullChecker.a(view) && (view instanceof FeedPostGuideView)) {
                ((FeedPostGuideView) view).m6285L();
                return;
            }
            if (NullChecker.a(view) && (view instanceof FeedSingleTopicView)) {
                return;
            }
            if (NullChecker.a(view) && (view instanceof TopicRecommendTopicView)) {
                ((TopicRecommendTopicView) view).m6368V();
                return;
            }
            if (NullChecker.a(view) && (view instanceof FeedGroupView)) {
                return;
            }
            if (NullChecker.a(view) && (view instanceof FeedMomentViewersOperationGuideView)) {
                return;
            }
            if (NullChecker.a(view) && (view instanceof FeedSeeMoreFollowingMomentView)) {
                return;
            }
            C2124a c2124a = C2124a.this;
            String strM15485K = vqg.m15485K(c2124a.f2844h, c2124a.f2845i);
            if (TextUtils.isEmpty(strM15485K)) {
                return;
            }
            if (NullChecker.a(view) && C2124a.this.m4949X() && nkg.m12276y0()) {
                RecyclerView.p layoutParams = view.getLayoutParams();
                long jO = mqi0.o() - C2124a.this.f2862z;
                if (!layoutParams.f() && jO < 300) {
                    C2124a.this.m4970u0();
                }
            }
            p6j0.m12916f("e_moment_exit", strM15485K, p6j0.C2456a.m12922g("moment_id", ((DbObject) moment).id), p6j0.C2456a.m12922g("owner_id", moment.owner), p6j0.C2456a.m12922g("moment_exit", j + ""), p6j0.C2456a.m12921f(Order.TYPE, i), p6j0.C2456a.m12922g("moment_type", zi60.m17436w().m17467y(moment)));
        }
    }

    public C2124a(PhotoAlbumBaseFrag photoAlbumBaseFrag, VRecyclerView vRecyclerView, String str, String str2, int i, boolean z) {
        this.f2845i = false;
        this.f2840d = photoAlbumBaseFrag;
        this.f2841e = photoAlbumBaseFrag.act();
        this.f2843g = str;
        this.f2844h = str2;
        this.f2845i = z;
        this.f2846j = i;
        this.f2856t = new ajc0(vRecyclerView, new e30() { // from class: l.olg
            public final void call(Object obj) {
                this.f11498a.m4936g0((Integer) obj);
            }
        }, 3);
        if (m4951Z() && NullChecker.a(photoAlbumBaseFrag)) {
            photoAlbumBaseFrag.creates(new e30() { // from class: l.plg
                public final void call(Object obj) {
                    C2124a.m4927H((Bundle) obj);
                }
            }, new d30() { // from class: l.qlg
                public final void call() {
                    this.f12270a.m4937h0();
                }
            });
        }
        if (NullChecker.a(photoAlbumBaseFrag)) {
            c(photoAlbumBaseFrag, photoAlbumBaseFrag.lifecycle()).filter(new w9j() { // from class: l.rlg
                public final Object call(Object obj) {
                    return Boolean.valueOf(((c) obj) == c.j);
                }
            }).subscribe(mkd0.G(new e30() { // from class: l.slg
                public final void call(Object obj) {
                    FeedModule.f316d.m16480J6();
                }
            }));
        }
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m4927H(Bundle bundle) {
    }

    /* JADX INFO: renamed from: R */
    private RawFeed m4934R(Moment moment) {
        if (NullChecker.a(moment) && this.f2842f.m10743p()) {
            return this.f2842f.f8835b.m10602c(((DbObject) moment).id);
        }
        return null;
    }

    /* JADX INFO: renamed from: d0 */
    private boolean m4935d0() {
        return this.f2841e instanceof QATopicAggregationActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public /* synthetic */ void m4936g0(Integer num) {
        MomentItem item = getItem(num.intValue());
        if (NullChecker.a(item) && NullChecker.a(item.f2812d)) {
            m4962m0(item.f2812d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m4937h0() {
        if (NullChecker.a(this.f2860x)) {
            this.f2860x.m9891a();
        }
    }

    /* JADX INFO: renamed from: C */
    public int m4939C() {
        return this.f2849m.a.size() + 1;
    }

    /* JADX INFO: renamed from: D */
    public View m4940D(ViewGroup viewGroup, int i) {
        if (i == 5) {
            return this.f2841e.inflater().inflate(o6c0.f11199e, viewGroup, false);
        }
        if (i == 0) {
            return this.f2841e.inflater().inflate(o6c0.f11346z, viewGroup, false);
        }
        if (i == 1) {
            return this.f2841e.inflater().inflate(o6c0.f11209f2, viewGroup, false);
        }
        if (i == 21) {
            return this.f2841e.inflater().inflate(o6c0.f11226h5, viewGroup, false);
        }
        if (i == 22) {
            return (FeedCenterVideoView) this.f2841e.inflater().inflate(o6c0.f11240j5, viewGroup, false);
        }
        if (i == 23) {
            return this.f2841e.inflater().inflate(o6c0.f11233i5, viewGroup, false);
        }
        if (i == 24) {
            return (FeedCenterVoteView) this.f2841e.inflater().inflate(o6c0.f11173a1, viewGroup, false);
        }
        if (i == 3) {
            return this.f2841e.inflater().inflate(o6c0.f11204e4, viewGroup, false);
        }
        if (i == 4) {
            return this.f2841e.inflater().inflate(o6c0.f11317u5, viewGroup, false);
        }
        if (i == 8) {
            return this.f2841e.inflater().inflate(o6c0.f11169Z3, viewGroup, false);
        }
        if (i == 26) {
            return this.f2841e.inflater().inflate(o6c0.f11187c1, viewGroup, false);
        }
        if (i == 25) {
            return this.f2841e.inflater().inflate(o6c0.f11201e1, viewGroup, false);
        }
        if (i == 53) {
            return this.f2841e.inflater().inflate(o6c0.f11194d1, viewGroup, false);
        }
        if (i == 27) {
            return this.f2841e.inflater().inflate(o6c0.f11083L1, viewGroup, false);
        }
        if (i == 13) {
            return new FeedTimeViewInList(this.f2841e);
        }
        if (i == 29) {
            return this.f2841e.inflater().inflate(o6c0.f11179b0, viewGroup, false);
        }
        if (i == 40) {
            return this.f2841e.inflater().inflate(o6c0.f11165Z, viewGroup, false);
        }
        if (i == 28) {
            return this.f2841e.inflater().inflate(o6c0.f11132T2, viewGroup, false);
        }
        if (i == 32) {
            return FeedModule.m1141M().feedEntry().a(this.f2841e, viewGroup);
        }
        if (i == 33) {
            return FeedModule.m1141M().feedEntry().b(this.f2841e, viewGroup);
        }
        if (i == 39) {
            return this.f2841e.inflater().inflate(o6c0.f11208f1, viewGroup, false);
        }
        if (i == 34) {
            return (TopicRecommendView) this.f2841e.inflater().inflate(o6c0.f11055G3, viewGroup, false);
        }
        if (i == 35) {
            return (FeedPostGuideView) this.f2841e.inflater().inflate(o6c0.f11023B2, viewGroup, false);
        }
        if (i == 36) {
            return (FeedSingleTopicView) this.f2841e.inflater().inflate(o6c0.f11266n3, viewGroup, false);
        }
        if (i == 37) {
            return (TopicRecommendUserView) this.f2841e.inflater().inflate(o6c0.f11168Z2, viewGroup, false);
        }
        if (i == 38) {
            return (TopicRecommendTopicView) this.f2841e.inflater().inflate(o6c0.f11162Y2, viewGroup, false);
        }
        if (i == 41) {
            return (FeedNearbyOnlineView) this.f2841e.inflater().inflate(o6c0.f11021B0, viewGroup, false);
        }
        if (i == 52) {
            return (FeedMomentViewersOperationGuideView) this.f2841e.inflater().inflate(o6c0.f11035D1, viewGroup, false);
        }
        if (i == 43) {
            return (FeedStateSquareEntranceView) this.f2841e.inflater().inflate(o6c0.f11301s3, viewGroup, false);
        }
        if (i == 42) {
            return (FeedGroupView) this.f2841e.inflater().inflate(o6c0.f11082L0, viewGroup, false);
        }
        if (i == 47) {
            return this.f2841e.inflater().inflate(o6c0.f11189c3, viewGroup, false);
        }
        if (i == 46) {
            return (FeedCenterLiveVoiceMomentView) this.f2841e.inflater().inflate(o6c0.f11172a0, viewGroup, false);
        }
        if (i == 49) {
            return (FeedCenterForwardVideoView) this.f2841e.inflater().inflate(o6c0.f11166Z0, viewGroup, false);
        }
        if (i == 48) {
            return this.f2841e.inflater().inflate(o6c0.f11180b1, viewGroup, false);
        }
        if (i == 50) {
            return this.f2841e.inflater().inflate(o6c0.f11350z3, viewGroup, false);
        }
        if (i == 51) {
            return this.f2841e.inflater().inflate(o6c0.f11182b3, viewGroup, false);
        }
        if (i == 55) {
            return this.f2841e.inflater().inflate(o6c0.f11272o2, viewGroup, false);
        }
        return i == 54 ? this.f2841e.inflater().inflate(FeedModule.m1141M().mg().e(), viewGroup, false) : new TextView(this.f2841e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // 
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public void mo4938A(View view, MomentItem momentItem, int i, int i2) {
        int i3;
        boolean z;
        boolean z2;
        String str;
        MomentItem momentItem2;
        C2124a c2124a;
        MomentItem momentItem3;
        int i4;
        MomentItem momentItem4;
        C2124a c2124a2 = this;
        int i5 = i2;
        if (m4969t0(view) && (view.getLayoutParams() instanceof RecyclerView.p)) {
            Moment moment = momentItem.f2812d;
            int iM4944S = c2124a2.m4944S(((DbObject) moment).id);
            if (iM4944S >= 0) {
                c2124a2.f2837C.m11594h(view, moment, iM4944S);
            }
        }
        if (c2124a2.m4959j0(i) || i == 4) {
            MomentItem item = c2124a2.getItem(i5 + 1);
            boolean z3 = (item != null && item.mo4912e() && ((DbObject) momentItem.f2812d).id.equals(((DbObject) item.f2812d).id)) ? false : true;
            if (c2124a2.m4959j0(i)) {
                if (i == 1) {
                    c2124a2.m4958i0(momentItem.f2812d, momentItem.f2809a + 1);
                    ((PhotoAlbumTopView) view).m5799E(xa70.C2532a.m16062a().m16065d(c2124a2.f2841e).m16068g(c2124a2.f2844h).m16067f(c2124a2.m4934R(momentItem.f2812d)).m16075n(i5).m16072k(momentItem.f2812d).m16071j(c2124a2.f2840d.f2912A.f12026q).m16066e(c2124a2.f2842f).m16073l(null).m16063b());
                } else if (i == 28) {
                    c2124a2.m4958i0(momentItem.f2812d, momentItem.f2809a + 1);
                    ((QATopicPhotoAlbumTopView) view).m7185c0(c2124a2.f2842f, momentItem.f2812d, c2124a2.f2844h, c2124a2.f2840d.f2912A.f12026q);
                }
                String strM15485K = vqg.m15485K(c2124a2.f2844h, c2124a2.f2845i);
                if (i == 21 || i == 23 || i == 22 || i == 24 || i == 27 || i == 29 || i == 40 || i == 46 || i == 49) {
                    Moment moment2 = momentItem.f2812d;
                    FeedCenterView feedCenterView = (FeedCenterView) view;
                    feedCenterView.setCurrentFrag(c2124a2.f2840d);
                    hx60 hx60Var = c2124a2.f2842f;
                    int i6 = c2124a2.f2846j;
                    Moment moment3 = momentItem.f2812d;
                    z = true;
                    z2 = false;
                    boolean zM5738T = feedCenterView.m5738T(hx60Var, i6, moment3, c2124a2.f2844h, c2124a2.f2850n, momentItem.f2809a, c2124a2.f2845i, i5, c2124a2.f2851o, NullChecker.a(c2124a2.m4934R(moment3)) && c2124a2.m4934R(momentItem.f2812d).canGreeting, c2124a2.f2840d.f2912A.f12026q, c2124a2.m4934R(momentItem.f2812d), c2124a2.m4956e0(i5, false));
                    i5 = i5;
                    if (zM5738T) {
                        if (u2h.m14719d()) {
                            c2124a2.m4973y0(moment2, momentItem.f2809a + 1);
                        }
                        c2124a2.f2840d.m5073i5(((DbObject) c2124a2.getItem(i5).f2812d).id);
                    }
                    feedCenterView.m5744b0(c2124a2.f2858v);
                } else {
                    z = true;
                    z2 = false;
                }
                if (i == 50) {
                    ((FeedSvipLimitedMomentItemView) view).m6355e(c2124a2.f2841e, c2124a2, momentItem, i5);
                }
                if (i == 51) {
                    ((FeedRoamMomentItemView) view).m6302d(c2124a2.f2841e, c2124a2, momentItem, c2124a2.m4934R(momentItem.f2812d), i5);
                }
                if (i == 25) {
                    ((FeedListTextWithLinkItem) view).m4139j(c2124a2.f2846j, momentItem.f2812d, c2124a2.f2844h, i2, c2124a2.f2850n, strM15485K);
                    str = strM15485K;
                } else {
                    str = strM15485K;
                }
                if (i == 53) {
                    momentItem2 = momentItem;
                    ((FeedListTextWithCommentItem) view).m4128k(momentItem.f2812d, c2124a2.f2844h, i2, c2124a2.f2850n, str);
                } else {
                    momentItem2 = momentItem;
                }
                if (i == 26) {
                    int i7 = r0.f2846j;
                    Moment moment4 = momentItem2.f2812d;
                    String str2 = r0.f2844h;
                    RawFeed rawFeedM4934R = r0.m4934R(moment4);
                    c2124a = c2124a2;
                    momentItem3 = momentItem2;
                    ((FeedListImageLinkItem) view).m4117n(i7, moment4, str2, i2, str, rawFeedM4934R);
                } else {
                    c2124a = r0;
                    momentItem3 = momentItem2;
                }
                if (i == 48) {
                    momentItem4 = momentItem;
                    ((FeedListActivityTextWithLinkItem) view).m4101l(c2124a.f2846j, momentItem3.f2812d, c2124a.f2844h, i2, str);
                    i4 = i2;
                } else {
                    i4 = i2;
                    momentItem4 = momentItem3;
                }
                if (i == 3) {
                    PhotoAlbumBottomView photoAlbumBottomView = (PhotoAlbumBottomView) view;
                    photoAlbumBottomView.setCurrentFrag(c2124a.f2840d);
                    photoAlbumBottomView.setRawFeedsCanGreeting((NullChecker.a(c2124a.m4934R(momentItem4.f2812d)) && c2124a.m4934R(momentItem4.f2812d).canGreeting) ? z : z2);
                    boolean z4 = c2124a.f2840d.f2912A.f12026q;
                    hx60 hx60Var2 = c2124a.f2842f;
                    HashMap<String, Boolean> map = c2124a.f2850n;
                    String str3 = c2124a.f2844h;
                    boolean z5 = c2124a.f2845i;
                    int i8 = c2124a.f2846j;
                    int i9 = momentItem4.f2809a;
                    RawFeed rawFeedM4934R2 = c2124a.m4934R(momentItem4.f2812d);
                    int iM4944S2 = c2124a.m4944S(((DbObject) momentItem4.f2812d).id);
                    boolean zM4954c0 = c2124a.m4954c0(i4);
                    boolean zM4950Y = c2124a.m4950Y(i4);
                    boolean zM4956e0 = c2124a.m4956e0(i4, z);
                    c2124a2 = c2124a;
                    MomentItem momentItem5 = momentItem4;
                    boolean z6 = z2;
                    i3 = i;
                    photoAlbumBottomView.m4420F1(z4, hx60Var2, momentItem5, map, str3, z5, i8, i9, rawFeedM4934R2, iM4944S2, zM4954c0, zM4950Y, zM4956e0);
                    Moment moment5 = momentItem5.f2812d;
                    int iM4944S3 = c2124a2.m4944S(((DbObject) moment5).id);
                    if (iM4944S3 >= 0) {
                        c2124a2.f2836B.m11594h(view, moment5, iM4944S3);
                    }
                    photoAlbumBottomView.m4473l2(z6, c2124a2.f2846j);
                } else {
                    i3 = i;
                    c2124a2 = c2124a;
                }
            } else {
                i3 = i;
                PhotoAlbumFeedCommentView photoAlbumFeedCommentView = (PhotoAlbumFeedCommentView) view;
                photoAlbumFeedCommentView.m4692w(c2124a2.f2840d, momentItem, c2124a2.f2844h);
                photoAlbumFeedCommentView.m4694y(z3);
            }
        } else {
            if (i == 8) {
                ((MomentSeeEntryItemView) view).m6571L(c2124a2.f2840d, c2124a2);
            } else if (i == 13) {
                ((FeedTimeViewInList) view).m6359s(c2124a2.f2844h, momentItem.f2818j, i5, c2124a2.f2843g);
            } else if (i == 32) {
                FeedModule.m1141M().feedEntry().d(view, momentItem.f2812d.voiceLiveApiInfo);
            } else if (i == 33) {
                FeedModule.m1141M().feedEntry().f(view, momentItem.f2812d.feedVoiceUserEntryInfo);
            } else if (i == 34) {
                ((TopicRecommendView) view).m7611Y(momentItem.f2823o, momentItem.f2825q, momentItem.f2824p, c2124a2.f2846j);
            } else if (i == 35) {
                ((FeedPostGuideView) view).m6284I(c2124a2.f2840d, c2124a2.f2846j, momentItem.f2826r);
            } else if (i == 36) {
                FeedSingleTopicView feedSingleTopicView = (FeedSingleTopicView) view;
                feedSingleTopicView.setShowInputMomentMap(c2124a2.f2852p);
                feedSingleTopicView.m6347l(c2124a2.f2844h, c2124a2.f2845i, c2124a2.f2846j, momentItem.f2830v, momentItem.f2831w, momentItem.f2812d);
            } else if (i == 37) {
                ((TopicRecommendUserView) view).m6398R(momentItem.f2832x, momentItem.f2825q, c2124a2.f2844h, c2124a2.f2846j);
            } else if (i == 38) {
                ((TopicRecommendTopicView) view).m6369W(c2124a2, momentItem.f2833y, c2124a2.f2844h);
            } else if (i == 39) {
                ((FeedLiveRecommendView) view).m5893o0(c2124a2.f2840d, momentItem);
            } else if (i == 41) {
                ((FeedNearbyOnlineView) view).m5469B(momentItem.f2827s);
            } else if (i == 43) {
                ((FeedStateSquareEntranceView) view).m6893I(c2124a2.f2840d, momentItem.f2828t, c2124a2.f2844h);
            } else if (i == 52) {
                ((FeedMomentViewersOperationGuideView) view).m5826Q(c2124a2.f2840d, momentItem.f2829u, c2124a2.f2844h);
            } else if (i == 42) {
                ((FeedGroupView) view).m6225L(c2124a2.f2844h, c2124a2.f2845i, momentItem.f2812d, momentItem.f2834z);
            } else if (i == 47) {
                ((FeedSeeMoreFollowingMomentView) view).m6306I(c2124a2.f2840d, momentItem.f2812d.mFeedSeeMoreFollowingMomentInfo);
            } else if (i == 55) {
                ((FeedPoiGuideView) view).m6128l(c2124a2.f2841e, ((ig00) momentItem).f9010A, c2124a2.f2844h, i5);
            } else if (i == 54) {
                FeedModule.m1141M().mg().b(view, momentItem.f2812d.liveCircleBanner.getTripleList(), momentItem.f2809a);
            } else if (i == 0) {
                m4965p0(view);
            }
            i3 = i;
        }
        if (i3 == 5) {
            c2124a2.mo4964o0((CommonEmptyView) view);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P */
    public final <T extends View> T m4942P(Class<T> cls, View view) {
        if (cls.isInstance(view)) {
            return view;
        }
        T t = null;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (cls.isInstance(childAt)) {
                    t = (T) childAt;
                } else if (childAt instanceof ViewGroup) {
                    t = (T) m4942P(cls, childAt);
                }
                if (t != null) {
                    return t;
                }
            }
        }
        return t;
    }

    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public MomentItem getItem(int i) {
        if (i >= this.f2849m.a.size()) {
            return null;
        }
        return (MomentItem) this.f2849m.a.get(i);
    }

    /* JADX INFO: renamed from: S */
    public int m4944S(final String str) {
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f2840d;
        if (photoAlbumBaseFrag == null) {
            return 0;
        }
        return vwb.G(photoAlbumBaseFrag.m5054R4(), new w9j() { // from class: l.tlg
            public final Object call(Object obj) {
                return Boolean.valueOf(((DbObject) ((Moment) obj)).id.equals(str));
            }
        }) + 1;
    }

    /* JADX INFO: renamed from: T */
    public int m4945T(int i) {
        return m4946U(getItem(i));
    }

    /* JADX INFO: renamed from: U */
    public int m4946U(MomentItem momentItem) {
        if (momentItem == null) {
            return 7;
        }
        if (!momentItem.mo4912e()) {
            if (momentItem.m4911d()) {
                return 4;
            }
            if (momentItem.m4918k()) {
                return 8;
            }
            if (momentItem.f2817i) {
                return 13;
            }
            if (momentItem.m4910c()) {
                return 39;
            }
            if (MomentItem.VoiceType.card.equals(momentItem.f2819k)) {
                return 32;
            }
            if (MomentItem.VoiceType.profile.equals(momentItem.f2819k)) {
                return 33;
            }
            if (momentItem.m4919l()) {
                return 47;
            }
            if (momentItem instanceof ig00) {
                return 55;
            }
            return momentItem.m4909b() ? 54 : 7;
        }
        if (momentItem instanceof kg00) {
            return 50;
        }
        if (momentItem instanceof jg00) {
            return 51;
        }
        int i = momentItem.f2810b;
        if (i == 0) {
            return m4935d0() ? 28 : 1;
        }
        if (i != 1) {
            if (momentItem.m4908a()) {
                return 34;
            }
            if (momentItem.m4915h()) {
                return 35;
            }
            if (momentItem.m4922o()) {
                return 36;
            }
            if (momentItem.m4917j()) {
                return 37;
            }
            if (momentItem.m4916i()) {
                return 38;
            }
            if (momentItem.m4914g()) {
                return 41;
            }
            if (momentItem.m4913f()) {
                return 52;
            }
            if (momentItem.m4923p()) {
                return 43;
            }
            return momentItem.m4921n() ? 42 : 3;
        }
        if (m4957f0(momentItem.f2812d)) {
            return 46;
        }
        if (u2h.m14719d()) {
            LiveExtraInFeed fromLive = LiveExtraInFeed.getFromLive(momentItem.f2812d.live);
            Moment moment = momentItem.f2812d;
            if (moment.isLive) {
                Live live = moment.live;
                if ((live.videoCapture instanceof Video) || (live.snapshot instanceof Video)) {
                    return 22;
                }
                if (m4953b0(fromLive)) {
                    return 40;
                }
                if (NullChecker.a(momentItem.f2812d.live.snapshot) || NullChecker.a(momentItem.f2812d.liveRoom)) {
                    return 23;
                }
            } else if (moment.isVoiceLive) {
                return 29;
            }
        }
        if (vqg.m15498V(momentItem.f2812d)) {
            List<Media> list = momentItem.f2812d.media;
            if (!NullChecker.a(list)) {
                if (vqg.m15502Z(momentItem.f2812d)) {
                    return 49;
                }
                return vqg.m15540s0(momentItem.f2812d) ? 53 : 25;
            }
            if (list.size() == 0) {
                if (vqg.m15502Z(momentItem.f2812d)) {
                    return 49;
                }
                return vqg.m15540s0(momentItem.f2812d) ? 53 : 25;
            }
            if (list.size() == 1 && (list.get(0) instanceof Picture) && (!TextUtils.isEmpty(momentItem.f2812d.landingPage) || !TextUtils.isEmpty(momentItem.f2812d.deeplink))) {
                return 26;
            }
        }
        if (NullChecker.a(momentItem.f2812d.simpleActivity) && !TextUtils.isEmpty(fm20.m10222b(momentItem.f2812d.simpleActivity.f696id))) {
            return 48;
        }
        if (NullChecker.a(momentItem.f2812d.hyperlink) && momentItem.f2812d.hyperlink.contains("type=\"img\"")) {
            return 26;
        }
        if (!NullChecker.a(momentItem.f2812d.media) || momentItem.f2812d.media.size() <= 0) {
            return vqg.m15502Z(momentItem.f2812d) ? 49 : 21;
        }
        Media media = momentItem.f2812d.media.get(0);
        if (media instanceof Video) {
            return 22;
        }
        return media instanceof Audio ? 27 : 23;
    }

    /* JADX INFO: renamed from: V */
    public String m4947V(int i) {
        MomentItem item = getItem(i);
        if (NullChecker.a(item) && item.f2810b == 1 && NullChecker.b(item.f2812d) && NullChecker.a(item.f2812d.media) && item.f2812d.media.size() > 0 && NullChecker.b(item.f2812d.media.get(0)) && (item.f2812d.media.get(0) instanceof Video)) {
            return ((Video) item.f2812d.media.get(0)).formatAspectRatio();
        }
        return null;
    }

    /* JADX INFO: renamed from: W */
    public boolean m4948W() {
        return this.f2840d.m5058V4();
    }

    /* JADX INFO: renamed from: X */
    public boolean m4949X() {
        return "from_nearby_focus".equals(this.f2844h) || "from_nearby_falls_feed".equals(this.f2844h) || "from_like".equals(this.f2844h) || "from_discover_dating".equals(this.f2844h) || "from_discover_discussion".equals(this.f2844h) || "from_activity_tab_one".equals(this.f2844h) || "from_activity_tab_two".equals(this.f2844h);
    }

    /* JADX INFO: renamed from: Y */
    public boolean m4950Y(int i) {
        int i2 = i - 1;
        if (i2 < 0 || !nkg.m12235e().enable) {
            return false;
        }
        int itemViewType = getItemViewType(i2);
        return itemViewType == 21 || itemViewType == 23 || itemViewType == 22;
    }

    /* JADX INFO: renamed from: Z */
    public boolean m4951Z() {
        return m4949X() && !"from_nearby_focus".equals(this.f2844h);
    }

    /* JADX INFO: renamed from: a0 */
    public boolean m4952a0(int i) {
        return i >= this.f2849m.a.size();
    }

    /* JADX INFO: renamed from: b0 */
    public final boolean m4953b0(LiveExtraInFeed liveExtraInFeed) {
        return liveExtraInFeed != null && liveExtraInFeed.isMultiCallType() && liveExtraInFeed.multiCallInfo.onGoing;
    }

    /* JADX INFO: renamed from: c0 */
    public final boolean m4954c0(int i) {
        int i2 = i + 1;
        MomentItem momentItem = this.f2849m.a.size() > i2 ? (MomentItem) this.f2849m.a.get(i2) : null;
        return NullChecker.a(momentItem) && momentItem.m4915h();
    }

    /* JADX INFO: renamed from: e */
    public void m4955e(int i) {
        if (this.f2849m.a.size() <= 0 || this.f2849m.a.size() - i >= 3 || !m4948W()) {
            return;
        }
        this.f2842f.mo5611z();
    }

    /* JADX INFO: renamed from: e0 */
    public boolean m4956e0(int i, boolean z) {
        if (!z) {
            int itemViewType = getItemViewType(i);
            return itemViewType == 21 || itemViewType == 23 || itemViewType == 22;
        }
        int i2 = i - 1;
        if (i2 < 0) {
            return false;
        }
        int itemViewType2 = getItemViewType(i2);
        return itemViewType2 == 21 || itemViewType2 == 23 || itemViewType2 == 22;
    }

    /* JADX INFO: renamed from: f0 */
    public final boolean m4957f0(Moment moment) {
        return NullChecker.a(moment.thirdShareSource) && !TextUtils.isEmpty(moment.thirdShareSource.sourceId) && "voiceLive".equals(moment.thirdShareSource.sourceType);
    }

    public long getItemId(int i) {
        return i;
    }

    public int getItemViewType(int i) {
        if (this.f2849m.a.size() == 0) {
            return (this.f2848l || this.f2854r) ? 5 : 7;
        }
        if (m4952a0(i)) {
            return 0;
        }
        return m4945T(i);
    }

    /* JADX INFO: renamed from: i0 */
    public void m4958i0(Moment moment, int i) {
        if (TextUtils.isEmpty(moment.liveState)) {
            return;
        }
        if ("from_nearby_focus".equals(this.f2844h)) {
            m4971v0(moment, i, "follow_photo", "p_follow");
            return;
        }
        if ("from_like".equals(this.f2844h)) {
            m4971v0(moment, i, "like_photo", "p_like");
            return;
        }
        if ("from_nearby_falls_feed".equals(this.f2844h)) {
            m4971v0(moment, i, "nearby_photo", OMSDialogPositon.p_nearby);
            return;
        }
        if ("from_discover_dating".equals(this.f2844h)) {
            m4971v0(moment, i, OMSTemplateModeType.page, "p_discover_dating");
            return;
        }
        if ("from_discover_discussion".equals(this.f2844h)) {
            m4971v0(moment, i, OMSTemplateModeType.page, "p_discover_discussion");
        } else if ("from_activity_tab_one".equals(this.f2844h)) {
            m4971v0(moment, i, OMSTemplateModeType.page, fm20.m10224d("from_activity_tab_one"));
        } else if ("from_activity_tab_two".equals(this.f2844h)) {
            m4971v0(moment, i, OMSTemplateModeType.page, fm20.m10224d("from_activity_tab_two"));
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final boolean m4959j0(int i) {
        return i == 1 || i == 3 || i == 21 || i == 22 || i == 23 || i == 24 || i == 26 || i == 25 || i == 27 || i == 29 || i == 28 || i == 40 || i == 46 || i == 49 || i == 48 || i == 50 || i == 51 || i == 53;
    }

    /* JADX INFO: renamed from: k0 */
    public final void m4960k0(Moment moment, int i, String str) {
        zvf0.A("e_live_audio_room_enter", str, new j760[]{new j760("anchorId", moment.voiceLive.anchor.f264id), new j760("liveId", moment.voiceLive.f711id), new j760("audio_card_type", str.equals(OMSDialogPositon.p_nearby) ? "big_card" : "user_card"), new j760("audio_tab_id", ""), new j760("topic_id", moment.voiceLive.voiceRoomInfo.topics.size() == 0 ? 0 : moment.voiceLive.voiceRoomInfo.topics.get(0).f300id), new j760("index", Integer.valueOf(i)), new j760("audio_room_type", moment.voiceLive.voiceRoomInfo.maskMode ? "mask_audio" : "normal_audio")});
    }

    /* JADX INFO: renamed from: l0 */
    public void mo4961l0() {
    }

    /* JADX INFO: renamed from: m0 */
    public final void m4962m0(Moment moment) {
        if (!NullChecker.b(moment) || vwb.J(moment.media) || this.f2855s.contains(((DbObject) moment).id)) {
            return;
        }
        Media media = moment.media.get(0);
        Picture picture = media instanceof Video ? ((Video) media).cover : null;
        if (media instanceof Picture) {
            picture = (Picture) media;
        }
        if (picture == null) {
            return;
        }
        Picture.ImageUri imageUriCalculatedWidth = picture.calculatedWidth(xdl0.y0());
        this.f2855s.add(((DbObject) moment).id);
        qib0.G.z0(imageUriCalculatedWidth);
    }

    /* JADX INFO: renamed from: n0 */
    public void m4963n0(q860<MomentItem> q860Var, boolean z, String str, User user) {
        this.f2848l = true;
        this.f2847k = z;
        if (!User.ID_TEAM_ACCOUNT.equals(str)) {
            this.f2850n.put(str, Boolean.TRUE);
        }
        if (vwb.J(this.f2849m.a) || q860Var == null || vwb.J(q860Var.a)) {
            this.f2849m = q860Var;
            notifyDataSetChanged();
        } else {
            m4974z0(this.f2849m, q860Var);
        }
        this.f2840d.m5064b5();
    }

    /* JADX INFO: renamed from: o0 */
    public void mo4964o0(CommonEmptyView commonEmptyView) {
        if (!this.f2848l) {
            xdl0.M0(commonEmptyView, false);
            return;
        }
        xdl0.M0(commonEmptyView, true);
        boolean zEquals = FeedModule.m1139F().userId().equals(this.f2843g);
        String string = this.f2841e.getString(R$string.f504d4);
        int i = f3c0.f7826i6;
        int i2 = this.f2846j;
        int i3 = 176;
        if (i2 == 0) {
            int i4 = ijb0.m10892C().profile.followships.counters.followings;
            Act act = this.f2841e;
            string = i4 > 0 ? act.getString(R$string.f525g4) : act.getString(R$string.f518f4);
            xdl0.M(commonEmptyView.f2281a, true);
        } else if (i2 == 1) {
            string = this.f2841e.getString(R$string.f504d4);
            xdl0.M(commonEmptyView.f2281a, true);
        } else if (i2 == 3) {
            i = f3c0.f7818h6;
            string = this.f2841e.getString(R$string.f511e4);
            i3 = 160;
        } else if (i2 == 4) {
            string = this.f2841e.getString(R$string.f450V1);
        } else if (i2 == 6) {
            Act act2 = this.f2841e;
            string = zEquals ? act2.getString(R$string.f610t1) : act2.getString(R$string.f539i4);
            if (!zEquals && this.f2847k) {
                i = f3c0.f7842k6;
                string = this.f2841e.getString(R$string.f546j4);
            }
            if (this.f2846j == 6) {
                i3 = 40;
            }
        } else if (i2 == 11) {
            string = "附近暂无更多在线用户";
        }
        if (this.f2854r) {
            commonEmptyView.f2282b.setText("当前网络不可用");
            commonEmptyView.f2281a.setImageResource(f3c0.f7737X2);
            xdl0.X(commonEmptyView.f2281a, t100.d(i3));
        } else {
            commonEmptyView.f2282b.setText(string);
            commonEmptyView.f2281a.setImageResource(i);
            xdl0.X(commonEmptyView.f2281a, t100.d(i3));
        }
    }

    public void onBindViewHolder(@NonNull RecyclerView.d0 d0Var, int i, @NonNull List<Object> list) {
        if (list.size() == 0 || getItemViewType(i) != 1) {
            onBindViewHolder(d0Var, i);
            return;
        }
        MomentItem item = getItem(i);
        PhotoAlbumTopView photoAlbumTopView = (PhotoAlbumTopView) d0Var.itemView;
        m4958i0(item.f2812d, item.f2809a + 1);
        photoAlbumTopView.m5799E(xa70.C2532a.m16062a().m16065d(this.f2841e).m16068g(this.f2844h).m16067f(m4934R(item.f2812d)).m16075n(i).m16072k(item.f2812d).m16071j(this.f2840d.f2912A.f12026q).m16067f(m4934R(item.f2812d)).m16066e(this.f2842f).m16074m(list).m16073l(null).m16063b());
    }

    public void onViewAttachedToWindow(@NonNull RecyclerView.d0 d0Var) {
        super/*androidx.recyclerview.widget.RecyclerView.Adapter*/.onViewAttachedToWindow(d0Var);
        this.f2837C.m11597o();
        this.f2836B.m11597o();
    }

    public void onViewDetachedFromWindow(@NonNull RecyclerView.d0 d0Var) {
        super/*androidx.recyclerview.widget.RecyclerView.Adapter*/.onViewDetachedFromWindow(d0Var);
        this.f2862z = mqi0.o();
        this.f2837C.m11597o();
        this.f2836B.m11597o();
    }

    /* JADX INFO: renamed from: p0 */
    public void m4965p0(View view) {
        xdl0.U(view.findViewById(b5c0.f6003T1), 0);
        if ("from_activities_moment".equals(this.f2844h) || (nah.m12132b() && "from_like".equals(this.f2844h))) {
            view.setVisibility(4);
            return;
        }
        if (this.f2849m.a.size() > 0 && m4948W()) {
            view.findViewById(b5c0.f6101w1).setVisibility(0);
            view.findViewById(b5c0.f6003T1).setVisibility(8);
            view.findViewById(b5c0.f5957E0).setVisibility(8);
            return;
        }
        view.findViewById(b5c0.f6101w1).setVisibility(8);
        view.findViewById(b5c0.f6003T1).setVisibility(0);
        if (m4935d0() || (this.f2841e instanceof TopicAggregationAct)) {
            xdl0.U(view.findViewById(b5c0.f6003T1), t100.d(70.0f));
        }
        view.findViewById(b5c0.f5957E0).setVisibility(8);
        if (this.f2858v && this.f2849m.a.size() / 2 >= 6) {
            view.findViewById(b5c0.f6003T1).setText(R$string.f582o5);
        } else {
            view.findViewById(b5c0.f6003T1).setText(R$string.f406O);
            mo4961l0();
        }
    }

    /* JADX INFO: renamed from: q0 */
    public void m4966q0(hx60 hx60Var) {
        this.f2842f = hx60Var;
    }

    /* JADX INFO: renamed from: r0 */
    public void m4967r0(boolean z) {
        this.f2854r = z;
    }

    /* JADX INFO: renamed from: s0 */
    public void m4968s0(int i) {
        this.f2857u = i;
    }

    /* JADX INFO: renamed from: t0 */
    public final boolean m4969t0(View view) {
        return (view instanceof FeedCenterView) || (view instanceof FeedListTextWithLinkItem) || (view instanceof FeedListImageLinkItem) || (view instanceof TopicRecommendView) || (view instanceof FeedPostGuideView) || (view instanceof FeedSingleTopicView) || (view instanceof TopicRecommendTopicView) || (view instanceof FeedNearbyOnlineView) || (view instanceof FeedStateSquareEntranceView) || (view instanceof FeedGroupView) || (view instanceof FeedMomentViewersOperationGuideView) || (view instanceof FeedSeeMoreFollowingMomentView) || (view instanceof FeedRoamMomentItemView) || (view instanceof FeedListTextWithCommentItem);
    }

    /* JADX INFO: renamed from: u0 */
    public final boolean m4970u0() {
        vqg.f14268a++;
        if (this.f2846j == 14) {
            this.f2838D++;
        }
        if (this.f2861y == null) {
            this.f2861y = new a7h(this);
        }
        return this.f2861y.m8453c(this.f2844h);
    }

    /* JADX INFO: renamed from: v0 */
    public final void m4971v0(Moment moment, int i, String str, String str2) {
        if (moment.isVoiceLive && moment.momentVoiceLiveInfos == null) {
            m4960k0(moment, i, str2);
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("liveId", moment.live.f228id);
            jSONObject.put("anchorId", moment.live.anchor.f264id);
            jSONObject.put("module", str);
            jSONObject.put("index", i);
            jSONObject.put("live_status", (moment.isLive || !TextUtils.isEmpty(moment.liveState)) ? "on" : "off");
            jSONObject.put("liveRecommendCategory", moment.live.getRecommendCategory());
            jSONObject.put("show_label", "");
            jSONObject.put("right_recommend_type", "");
            jSONObject.put("live_room_live_type", osg.m12847c(moment));
            JSONObject jSONObject2 = new JSONObject();
            if (str.equals("follow_photo") || str.equals("nearby_photo") || str.equals("like_photo")) {
                jSONObject.put("show_label", moment.iconTitle);
            } else {
                if (NullChecker.a(this.f2842f.mo10741m(moment.owner))) {
                    jSONObject2.put("distance", i0g0.p(this.f2842f.mo10741m(moment.owner).location.distance, true));
                }
                jSONObject.put("show_label", jSONObject2);
            }
            zvf0.z("e_live_room_enter", str2, jSONObject);
        } catch (Exception e) {
            CrashHelper.c(e);
            sm80.b(e);
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final void m4972x0(Moment moment) {
        if (moment == null || vwb.J(moment.mediaRepeatIndexList)) {
            return;
        }
        for (int i = 0; i < moment.mediaRepeatIndexList.size(); i++) {
            p6j0.m12915e("e_moment_repeat_reminder", vqg.m15485K(this.f2844h, this.f2845i), vwb.Y("picture_index", Integer.valueOf(moment.mediaRepeatIndexList.get(i).intValue() + 1)), vwb.Y("moment_id", ((DbObject) moment).id), vwb.Y("owner_id", moment.owner));
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final void m4973y0(Moment moment, int i) {
        if (moment.isLive || moment.isVoiceLive) {
            if ("from_nearby_focus".equals(this.f2844h)) {
                m4971v0(moment, i, OMSTemplateModeType.page, "p_follow");
                return;
            }
            if ("from_like".equals(this.f2844h)) {
                m4971v0(moment, i, OMSTemplateModeType.page, "p_like");
                return;
            }
            if ("from_nearby_falls_feed".equals(this.f2844h)) {
                m4971v0(moment, i, OMSTemplateModeType.page, OMSDialogPositon.p_nearby);
                return;
            }
            if (this.f2845i) {
                m4971v0(moment, i, OMSTemplateModeType.page, "p_album");
                return;
            }
            if ("from_discover_dating".equals(this.f2844h)) {
                m4971v0(moment, i, OMSTemplateModeType.page, "p_discover_dating");
                return;
            }
            if ("from_discover_discussion".equals(this.f2844h)) {
                m4971v0(moment, i, OMSTemplateModeType.page, "p_discover_discussion");
            } else if ("from_activity_tab_one".equals(this.f2844h)) {
                m4971v0(moment, i, OMSTemplateModeType.page, fm20.m10224d("from_activity_tab_one"));
            } else if ("from_activity_tab_two".equals(this.f2844h)) {
                m4971v0(moment, i, OMSTemplateModeType.page, fm20.m10224d("from_activity_tab_two"));
            }
        }
    }

    /* JADX INFO: renamed from: z0 */
    public void m4974z0(q860<MomentItem> q860Var, q860<MomentItem> q860Var2) {
        if (this.f2859w == null) {
            this.f2859w = new yah(this, this.f2857u);
        }
        this.f2859w.m17088m(q860Var.a, q860Var2.a);
        g.e eVarC = g.c(this.f2859w, true);
        this.f2849m = q860Var2;
        eVarC.c(this.f2859w.f15374c);
    }
}
