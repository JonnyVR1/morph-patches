package com.p046p1.mobile.putong.feed.newui.photoalbum.adapter;

import android.R;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.C0601g;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.data.Audio;
import com.p046p1.mobile.putong.data.Live;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.LiveExtraInFeed;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.RawFeed;
import com.p046p1.mobile.putong.feed.newui.photoalbum.CommonEmptyView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.DiscoveryPager;
import com.p046p1.mobile.putong.feed.newui.photoalbum.FeedListActivityTextWithLinkItem;
import com.p046p1.mobile.putong.feed.newui.photoalbum.FeedListImageLinkItem;
import com.p046p1.mobile.putong.feed.newui.photoalbum.FeedListTextWithCommentItem;
import com.p046p1.mobile.putong.feed.newui.photoalbum.FeedListTextWithLinkItem;
import com.p046p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumBottomView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumFeedCommentView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.adapter.C11280a;
import com.p046p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.hello.FeedNearbyOnlineView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterForwardVideoView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterLiveVoiceMomentView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterVideoView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterVoteView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feedtop.PhotoAlbumTopView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.guide.FeedMomentViewersOperationGuideView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.live.FeedLiveRecommendView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.poi.view.FeedPoiGuideView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.view.FeedGroupView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.view.FeedPostGuideView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.view.FeedRoamMomentItemView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.view.FeedSeeMoreFollowingMomentView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.view.FeedSingleTopicView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.view.FeedSvipLimitedMomentItemView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.view.FeedTimeViewInList;
import com.p046p1.mobile.putong.feed.newui.photoalbum.view.TopicRecommendTopicView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.view.TopicRecommendUserView;
import com.p046p1.mobile.putong.feed.newui.see.MomentSeeEntryItemView;
import com.p046p1.mobile.putong.feed.newui.status.display.view.FeedStateSquareEntranceView;
import com.p046p1.mobile.putong.feed.newui.topic.qatopic.QATopicAggregationActivity;
import com.p046p1.mobile.putong.feed.newui.topic.qatopic.QATopicPhotoAlbumTopView;
import com.p046p1.mobile.putong.feed.newui.topic.topicaggregation.TopicAggregationAct;
import com.p046p1.mobile.putong.feed.newui.view.TopicRecommendView;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p046p1.mobile.putong.live.base.data.BLiveType;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;
import p147v.VRecyclerView;
import p147v.VText;
import p149l.a7h;
import p149l.ajc0;
import p149l.b5c0;
import p149l.d30;
import p149l.dac0;
import p149l.e30;
import p149l.ei00;
import p149l.f3c0;
import p149l.fm20;
import p149l.hx60;
import p149l.i0g0;
import p149l.ig00;
import p149l.ijb0;
import p149l.j760;
import p149l.jg00;
import p149l.kg00;
import p149l.l80;
import p149l.mkd0;
import p149l.mqi0;
import p149l.nah;
import p149l.nkg;
import p149l.o6c0;
import p149l.osg;
import p149l.p6j0;
import p149l.q860;
import p149l.qib0;
import p149l.sm80;
import p149l.t100;
import p149l.u2h;
import p149l.vqg;
import p149l.vwb;
import p149l.w9j;
import p149l.xa70;
import p149l.xdl0;
import p149l.yah;
import p149l.zi60;
import p149l.zvf0;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.adapter.a */
/* JADX INFO: loaded from: classes12.dex */
public class C11280a extends dac0<MomentItem> {

    /* JADX INFO: renamed from: d */
    public final PhotoAlbumBaseFrag f41379d;

    /* JADX INFO: renamed from: e */
    public final Act f41380e;

    /* JADX INFO: renamed from: f */
    public hx60 f41381f;

    /* JADX INFO: renamed from: g */
    public final String f41382g;

    /* JADX INFO: renamed from: h */
    public final String f41383h;

    /* JADX INFO: renamed from: i */
    public boolean f41384i;

    /* JADX INFO: renamed from: j */
    public final int f41385j;

    /* JADX INFO: renamed from: k */
    public boolean f41386k;

    /* JADX INFO: renamed from: r */
    public boolean f41393r;

    /* JADX INFO: renamed from: t */
    public ajc0 f41395t;

    /* JADX INFO: renamed from: u */
    public int f41396u;

    /* JADX INFO: renamed from: v */
    public boolean f41397v;

    /* JADX INFO: renamed from: w */
    public yah f41398w;

    /* JADX INFO: renamed from: x */
    public ei00 f41399x;

    /* JADX INFO: renamed from: y */
    public a7h f41400y;

    /* JADX INFO: renamed from: l */
    public boolean f41387l = false;

    /* JADX INFO: renamed from: m */
    public q860<MomentItem> f41388m = q860.m173341a();

    /* JADX INFO: renamed from: n */
    public HashMap<String, Boolean> f41389n = new HashMap<>();

    /* JADX INFO: renamed from: o */
    public HashMap<String, Boolean> f41390o = new HashMap<>();

    /* JADX INFO: renamed from: p */
    public HashMap<String, Boolean> f41391p = new HashMap<>();

    /* JADX INFO: renamed from: q */
    public HashMap<String, Boolean> f41392q = new HashMap<>();

    /* JADX INFO: renamed from: s */
    public List<String> f41394s = new ArrayList();

    /* JADX INFO: renamed from: z */
    public long f41401z = 0;

    /* JADX INFO: renamed from: A */
    public l80<Moment> f41374A = new a();

    /* JADX INFO: renamed from: B */
    public l80<Moment> f41375B = new b();

    /* JADX INFO: renamed from: C */
    public l80<Moment> f41376C = new c();

    /* JADX INFO: renamed from: D */
    public int f41377D = 0;

    /* JADX INFO: renamed from: c */
    public long f41378c = vqg.m199511I("feedTime");

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.adapter.a$a */
    public class a extends l80<Moment> {

        /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.adapter.a$a$a, reason: collision with other inner class name */
        public class C22700a extends ViewPager.C0719m {
            public C22700a() {
            }

            @Override // androidx.viewpager.widget.ViewPager.C0719m, androidx.viewpager.widget.ViewPager.InterfaceC0716j
            public void onPageScrollStateChanged(int i) {
                super.onPageScrollStateChanged(i);
                if (i == 0) {
                    a.this.m148842o();
                }
            }
        }

        public a() {
        }

        @Override // p149l.l80
        /* JADX INFO: renamed from: f */
        public void mo55694f(ViewGroup viewGroup, ViewGroup viewGroup2) {
            DiscoveryPager discoveryPager = (DiscoveryPager) C11280a.this.m63905P(DiscoveryPager.class, viewGroup);
            if (discoveryPager == null) {
                return;
            }
            discoveryPager.m4185d(new C22700a());
        }

        @Override // p149l.l80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo63937k(Moment moment, int i, View view) {
            if (NullChecker.m81303a(view) && (view instanceof PhotoAlbumTopView)) {
                ((PhotoAlbumTopView) view).m64709u();
            } else if (NullChecker.m81303a(view) && (view instanceof QATopicPhotoAlbumTopView)) {
                ((QATopicPhotoAlbumTopView) view).m66018M();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.adapter.a$b */
    public class b extends l80<Moment> {

        /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.adapter.a$b$a */
        public class a extends ViewPager.C0719m {
            public a() {
            }

            @Override // androidx.viewpager.widget.ViewPager.C0719m, androidx.viewpager.widget.ViewPager.InterfaceC0716j
            public void onPageScrollStateChanged(int i) {
                super.onPageScrollStateChanged(i);
                if (i == 0) {
                    b.this.m148842o();
                }
            }
        }

        public b() {
        }

        @Override // p149l.l80
        /* JADX INFO: renamed from: f */
        public void mo55694f(ViewGroup viewGroup, ViewGroup viewGroup2) {
            DiscoveryPager discoveryPager = (DiscoveryPager) C11280a.this.m63905P(DiscoveryPager.class, viewGroup);
            if (discoveryPager == null) {
                return;
            }
            discoveryPager.m4185d(new a());
        }

        @Override // p149l.l80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo63937k(Moment moment, int i, View view) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.adapter.a$c */
    public class c extends l80<Moment> {

        /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.adapter.a$c$a */
        public class a extends ViewPager.C0719m {
            public a() {
            }

            @Override // androidx.viewpager.widget.ViewPager.C0719m, androidx.viewpager.widget.ViewPager.InterfaceC0716j
            public void onPageScrollStateChanged(int i) {
                super.onPageScrollStateChanged(i);
                if (i == 0) {
                    c.this.m148842o();
                }
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.adapter.a$c$b */
        public class b extends ViewPager.C0719m {
            public b() {
            }

            @Override // androidx.viewpager.widget.ViewPager.C0719m, androidx.viewpager.widget.ViewPager.InterfaceC0716j
            public void onPageScrollStateChanged(int i) {
                super.onPageScrollStateChanged(i);
                if (i == 0) {
                    c.this.m148842o();
                }
            }
        }

        public c() {
        }

        @Override // p149l.l80
        /* JADX INFO: renamed from: f */
        public void mo55694f(ViewGroup viewGroup, ViewGroup viewGroup2) {
            View viewFindViewById = C11280a.this.f41380e.findViewById(R.id.content);
            DiscoveryPager discoveryPager = (nkg.m159904s() && C11280a.this.m63912X()) ? (DiscoveryPager) viewFindViewById.findViewById(b5c0.f73567g1) : (DiscoveryPager) C11280a.this.m63905P(DiscoveryPager.class, viewGroup);
            int i = C11280a.this.f41385j;
            DiscoveryPager discoveryPager2 = (i == 0 || i == 14 || i == 17 || i == 18) ? (DiscoveryPager) viewFindViewById.findViewById(b5c0.f73514R) : null;
            if (discoveryPager == null) {
                return;
            }
            discoveryPager.m4185d(new a());
            if (discoveryPager2 == null) {
                return;
            }
            C11280a.this.f41376C.m148843p(discoveryPager2);
            discoveryPager2.m4185d(new b());
        }

        @Override // p149l.l80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo63937k(Moment moment, int i, View view) {
            if (view instanceof FeedCenterView) {
                C11280a.this.m63934x0(moment);
                if (FeedModule.f38855d.f192981D0.contains(moment.f56011id)) {
                    return;
                }
                moment.momentViewTime = mqi0.m155944o();
                if (FeedModule.f38855d.f192985F0.contains(moment.f56011id)) {
                    return;
                }
                FeedModule.f38855d.f192985F0.add(moment.f56011id);
            }
        }

        @Override // p149l.l80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo55696m(Moment moment, int i, long j, View view) {
            if ((view instanceof FeedCenterView) && moment.momentViewTime != -1 && mqi0.m155944o() - moment.momentViewTime >= C11280a.this.f41378c * 1000 && !FeedModule.f38855d.f192981D0.contains(moment.f56011id)) {
                FeedModule.f38855d.m209595z6(moment.f56011id);
            }
            if (NullChecker.m81303a(view) && (view instanceof TopicRecommendView)) {
                ((TopicRecommendView) view).m66448a0();
                return;
            }
            if (NullChecker.m81303a(view) && (view instanceof FeedPostGuideView)) {
                ((FeedPostGuideView) view).m65184L();
                return;
            }
            if (NullChecker.m81303a(view) && (view instanceof FeedSingleTopicView)) {
                return;
            }
            if (NullChecker.m81303a(view) && (view instanceof TopicRecommendTopicView)) {
                ((TopicRecommendTopicView) view).m65267V();
                return;
            }
            if (NullChecker.m81303a(view) && (view instanceof FeedGroupView)) {
                return;
            }
            if (NullChecker.m81303a(view) && (view instanceof FeedMomentViewersOperationGuideView)) {
                return;
            }
            if (NullChecker.m81303a(view) && (view instanceof FeedSeeMoreFollowingMomentView)) {
                return;
            }
            C11280a c11280a = C11280a.this;
            String strM199515K = vqg.m199515K(c11280a.f41383h, c11280a.f41384i);
            if (TextUtils.isEmpty(strM199515K)) {
                return;
            }
            if (NullChecker.m81303a(view) && C11280a.this.m63912X() && nkg.m159917y0()) {
                RecyclerView.C0578p c0578p = (RecyclerView.C0578p) view.getLayoutParams();
                long jM155944o = mqi0.m155944o() - C11280a.this.f41401z;
                if (!c0578p.m3412f() && jM155944o < 300) {
                    C11280a.this.m63932u0();
                }
            }
            p6j0.m167672f("e_moment_exit", strM199515K, p6j0.C19147a.m167678g("moment_id", moment.f56011id), p6j0.C19147a.m167678g("owner_id", moment.owner), p6j0.C19147a.m167678g("moment_exit", j + ""), p6j0.C19147a.m167677f("order", i), p6j0.C19147a.m167678g("moment_type", zi60.m218961w().m218992y(moment)));
        }
    }

    public C11280a(PhotoAlbumBaseFrag photoAlbumBaseFrag, VRecyclerView vRecyclerView, String str, String str2, int i, boolean z) {
        this.f41384i = false;
        this.f41379d = photoAlbumBaseFrag;
        this.f41380e = photoAlbumBaseFrag.act();
        this.f41382g = str;
        this.f41383h = str2;
        this.f41384i = z;
        this.f41385j = i;
        this.f41395t = new ajc0(vRecyclerView, new e30() { // from class: l.olg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f144499a.m63902g0((Integer) obj);
            }
        }, 3);
        if (m63914Z() && NullChecker.m81303a(photoAlbumBaseFrag)) {
            photoAlbumBaseFrag.creates(new e30() { // from class: l.plg
                @Override // p149l.e30
                public final void call(Object obj) {
                    C11280a.m63893H((Bundle) obj);
                }
            }, new d30() { // from class: l.qlg
                @Override // p149l.d30
                public final void call() {
                    this.f155227a.m63903h0();
                }
            });
        }
        if (NullChecker.m81303a(photoAlbumBaseFrag)) {
            mo67374c(photoAlbumBaseFrag, photoAlbumBaseFrag.lifecycle()).filter(new w9j() { // from class: l.rlg
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((C4319c) obj) == C4319c.f15549j);
                }
            }).subscribe(mkd0.m154955G(new e30() { // from class: l.slg
                @Override // p149l.e30
                public final void call(Object obj) {
                    FeedModule.f38855d.m209299J6();
                }
            }));
        }
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m63893H(Bundle bundle) {
    }

    /* JADX INFO: renamed from: R */
    private RawFeed m63900R(Moment moment) {
        if (NullChecker.m81303a(moment) && this.f41381f.m133308p()) {
            return this.f41381f.f109833b.m130721c(moment.f56011id);
        }
        return null;
    }

    /* JADX INFO: renamed from: d0 */
    private boolean m63901d0() {
        return this.f41380e instanceof QATopicAggregationActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public /* synthetic */ void m63902g0(Integer num) {
        MomentItem item = getItem(num.intValue());
        if (NullChecker.m81303a(item) && NullChecker.m81303a(item.f41351d)) {
            m63924m0(item.f41351d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m63903h0() {
        if (NullChecker.m81303a(this.f41399x)) {
            this.f41399x.m116617a();
        }
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f41388m.f153135a.size() + 1;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        if (i == 5) {
            return this.f41380e.inflater().inflate(o6c0.f142180e, viewGroup, false);
        }
        if (i == 0) {
            return this.f41380e.inflater().inflate(o6c0.f142327z, viewGroup, false);
        }
        if (i == 1) {
            return this.f41380e.inflater().inflate(o6c0.f142190f2, viewGroup, false);
        }
        if (i == 21) {
            return this.f41380e.inflater().inflate(o6c0.f142207h5, viewGroup, false);
        }
        if (i == 22) {
            return (FeedCenterVideoView) this.f41380e.inflater().inflate(o6c0.f142221j5, viewGroup, false);
        }
        if (i == 23) {
            return this.f41380e.inflater().inflate(o6c0.f142214i5, viewGroup, false);
        }
        if (i == 24) {
            return (FeedCenterVoteView) this.f41380e.inflater().inflate(o6c0.f142154a1, viewGroup, false);
        }
        if (i == 3) {
            return this.f41380e.inflater().inflate(o6c0.f142185e4, viewGroup, false);
        }
        if (i == 4) {
            return this.f41380e.inflater().inflate(o6c0.f142298u5, viewGroup, false);
        }
        if (i == 8) {
            return this.f41380e.inflater().inflate(o6c0.f142150Z3, viewGroup, false);
        }
        if (i == 26) {
            return this.f41380e.inflater().inflate(o6c0.f142168c1, viewGroup, false);
        }
        if (i == 25) {
            return this.f41380e.inflater().inflate(o6c0.f142182e1, viewGroup, false);
        }
        if (i == 53) {
            return this.f41380e.inflater().inflate(o6c0.f142175d1, viewGroup, false);
        }
        if (i == 27) {
            return this.f41380e.inflater().inflate(o6c0.f142064L1, viewGroup, false);
        }
        if (i == 13) {
            return new FeedTimeViewInList(this.f41380e);
        }
        if (i == 29) {
            return this.f41380e.inflater().inflate(o6c0.f142160b0, viewGroup, false);
        }
        if (i == 40) {
            return this.f41380e.inflater().inflate(o6c0.f142146Z, viewGroup, false);
        }
        if (i == 28) {
            return this.f41380e.inflater().inflate(o6c0.f142113T2, viewGroup, false);
        }
        if (i == 32) {
            return FeedModule.m60223M().feedEntry().mo167171a(this.f41380e, viewGroup);
        }
        if (i == 33) {
            return FeedModule.m60223M().feedEntry().mo167172b(this.f41380e, viewGroup);
        }
        if (i == 39) {
            return this.f41380e.inflater().inflate(o6c0.f142189f1, viewGroup, false);
        }
        if (i == 34) {
            return (TopicRecommendView) this.f41380e.inflater().inflate(o6c0.f142036G3, viewGroup, false);
        }
        if (i == 35) {
            return (FeedPostGuideView) this.f41380e.inflater().inflate(o6c0.f142004B2, viewGroup, false);
        }
        if (i == 36) {
            return (FeedSingleTopicView) this.f41380e.inflater().inflate(o6c0.f142247n3, viewGroup, false);
        }
        if (i == 37) {
            return (TopicRecommendUserView) this.f41380e.inflater().inflate(o6c0.f142149Z2, viewGroup, false);
        }
        if (i == 38) {
            return (TopicRecommendTopicView) this.f41380e.inflater().inflate(o6c0.f142143Y2, viewGroup, false);
        }
        if (i == 41) {
            return (FeedNearbyOnlineView) this.f41380e.inflater().inflate(o6c0.f142002B0, viewGroup, false);
        }
        if (i == 52) {
            return (FeedMomentViewersOperationGuideView) this.f41380e.inflater().inflate(o6c0.f142016D1, viewGroup, false);
        }
        if (i == 43) {
            return (FeedStateSquareEntranceView) this.f41380e.inflater().inflate(o6c0.f142282s3, viewGroup, false);
        }
        if (i == 42) {
            return (FeedGroupView) this.f41380e.inflater().inflate(o6c0.f142063L0, viewGroup, false);
        }
        if (i == 47) {
            return this.f41380e.inflater().inflate(o6c0.f142170c3, viewGroup, false);
        }
        if (i == 46) {
            return (FeedCenterLiveVoiceMomentView) this.f41380e.inflater().inflate(o6c0.f142153a0, viewGroup, false);
        }
        if (i == 49) {
            return (FeedCenterForwardVideoView) this.f41380e.inflater().inflate(o6c0.f142147Z0, viewGroup, false);
        }
        if (i == 48) {
            return this.f41380e.inflater().inflate(o6c0.f142161b1, viewGroup, false);
        }
        if (i == 50) {
            return this.f41380e.inflater().inflate(o6c0.f142331z3, viewGroup, false);
        }
        if (i == 51) {
            return this.f41380e.inflater().inflate(o6c0.f142163b3, viewGroup, false);
        }
        if (i == 55) {
            return this.f41380e.inflater().inflate(o6c0.f142253o2, viewGroup, false);
        }
        return i == 54 ? this.f41380e.inflater().inflate(FeedModule.m60223M().mo67273mg().mo181769e(), viewGroup, false) : new TextView(this.f41380e);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, MomentItem momentItem, int i, int i2) {
        int i3;
        boolean z;
        boolean z2;
        String str;
        MomentItem momentItem2;
        C11280a c11280a;
        MomentItem momentItem3;
        int i4;
        MomentItem momentItem4;
        C11280a c11280a2 = this;
        int i5 = i2;
        if (m63931t0(view) && (view.getLayoutParams() instanceof RecyclerView.C0578p)) {
            Moment moment = momentItem.f41351d;
            int iM63907S = c11280a2.m63907S(moment.f56011id);
            if (iM63907S >= 0) {
                c11280a2.f41376C.m148839h(view, moment, iM63907S);
            }
        }
        if (c11280a2.m63921j0(i) || i == 4) {
            MomentItem item = c11280a2.getItem(i5 + 1);
            boolean z3 = (item != null && item.mo63878e() && momentItem.f41351d.f56011id.equals(item.f41351d.f56011id)) ? false : true;
            if (c11280a2.m63921j0(i)) {
                if (i == 1) {
                    c11280a2.m63920i0(momentItem.f41351d, momentItem.f41348a + 1);
                    ((PhotoAlbumTopView) view).m64705E(xa70.C21052a.m207548a().m207551d(c11280a2.f41380e).m207554g(c11280a2.f41383h).m207553f(c11280a2.m63900R(momentItem.f41351d)).m207561n(i5).m207558k(momentItem.f41351d).m207557j(c11280a2.f41379d.f41451A.f151818q).m207552e(c11280a2.f41381f).m207559l(null).m207549b());
                } else if (i == 28) {
                    c11280a2.m63920i0(momentItem.f41351d, momentItem.f41348a + 1);
                    ((QATopicPhotoAlbumTopView) view).m66033c0(c11280a2.f41381f, momentItem.f41351d, c11280a2.f41383h, c11280a2.f41379d.f41451A.f151818q);
                }
                String strM199515K = vqg.m199515K(c11280a2.f41383h, c11280a2.f41384i);
                if (i == 21 || i == 23 || i == 22 || i == 24 || i == 27 || i == 29 || i == 40 || i == 46 || i == 49) {
                    Moment moment2 = momentItem.f41351d;
                    FeedCenterView feedCenterView = (FeedCenterView) view;
                    feedCenterView.setCurrentFrag(c11280a2.f41379d);
                    hx60 hx60Var = c11280a2.f41381f;
                    int i6 = c11280a2.f41385j;
                    Moment moment3 = momentItem.f41351d;
                    z = true;
                    z2 = false;
                    boolean zM64644T = feedCenterView.m64644T(hx60Var, i6, moment3, c11280a2.f41383h, c11280a2.f41389n, momentItem.f41348a, c11280a2.f41384i, i5, c11280a2.f41390o, NullChecker.m81303a(c11280a2.m63900R(moment3)) && c11280a2.m63900R(momentItem.f41351d).canGreeting, c11280a2.f41379d.f41451A.f151818q, c11280a2.m63900R(momentItem.f41351d), c11280a2.m63918e0(i5, false));
                    i5 = i5;
                    if (zM64644T) {
                        if (u2h.m191495d()) {
                            c11280a2.m63935y0(moment2, momentItem.f41348a + 1);
                        }
                        c11280a2.f41379d.m64028i5(c11280a2.getItem(i5).f41351d.f56011id);
                    }
                    feedCenterView.m64650b0(c11280a2.f41397v);
                } else {
                    z = true;
                    z2 = false;
                }
                if (i == 50) {
                    ((FeedSvipLimitedMomentItemView) view).m65254e(c11280a2.f41380e, c11280a2, momentItem, i5);
                }
                if (i == 51) {
                    ((FeedRoamMomentItemView) view).m65201d(c11280a2.f41380e, c11280a2, momentItem, c11280a2.m63900R(momentItem.f41351d), i5);
                }
                if (i == 25) {
                    ((FeedListTextWithLinkItem) view).m63123j(c11280a2.f41385j, momentItem.f41351d, c11280a2.f41383h, i2, c11280a2.f41389n, strM199515K);
                    str = strM199515K;
                } else {
                    str = strM199515K;
                }
                if (i == 53) {
                    momentItem2 = momentItem;
                    ((FeedListTextWithCommentItem) view).m63112k(momentItem.f41351d, c11280a2.f41383h, i2, c11280a2.f41389n, str);
                } else {
                    momentItem2 = momentItem;
                }
                if (i == 26) {
                    int i7 = r0.f41385j;
                    Moment moment4 = momentItem2.f41351d;
                    String str2 = r0.f41383h;
                    RawFeed rawFeedM63900R = r0.m63900R(moment4);
                    c11280a = c11280a2;
                    momentItem3 = momentItem2;
                    ((FeedListImageLinkItem) view).m63101n(i7, moment4, str2, i2, str, rawFeedM63900R);
                } else {
                    c11280a = r0;
                    momentItem3 = momentItem2;
                }
                if (i == 48) {
                    momentItem4 = momentItem;
                    ((FeedListActivityTextWithLinkItem) view).m63085l(c11280a.f41385j, momentItem3.f41351d, c11280a.f41383h, i2, str);
                    i4 = i2;
                } else {
                    i4 = i2;
                    momentItem4 = momentItem3;
                }
                if (i == 3) {
                    PhotoAlbumBottomView photoAlbumBottomView = (PhotoAlbumBottomView) view;
                    photoAlbumBottomView.setCurrentFrag(c11280a.f41379d);
                    photoAlbumBottomView.setRawFeedsCanGreeting((NullChecker.m81303a(c11280a.m63900R(momentItem4.f41351d)) && c11280a.m63900R(momentItem4.f41351d).canGreeting) ? z : z2);
                    boolean z4 = c11280a.f41379d.f41451A.f151818q;
                    hx60 hx60Var2 = c11280a.f41381f;
                    HashMap<String, Boolean> map = c11280a.f41389n;
                    String str3 = c11280a.f41383h;
                    boolean z5 = c11280a.f41384i;
                    int i8 = c11280a.f41385j;
                    int i9 = momentItem4.f41348a;
                    RawFeed rawFeedM63900R2 = c11280a.m63900R(momentItem4.f41351d);
                    int iM63907S2 = c11280a.m63907S(momentItem4.f41351d.f56011id);
                    boolean zM63917c0 = c11280a.m63917c0(i4);
                    boolean zM63913Y = c11280a.m63913Y(i4);
                    boolean zM63918e0 = c11280a.m63918e0(i4, z);
                    c11280a2 = c11280a;
                    MomentItem momentItem5 = momentItem4;
                    boolean z6 = z2;
                    i3 = i;
                    photoAlbumBottomView.m63403F1(z4, hx60Var2, momentItem5, map, str3, z5, i8, i9, rawFeedM63900R2, iM63907S2, zM63917c0, zM63913Y, zM63918e0);
                    Moment moment5 = momentItem5.f41351d;
                    int iM63907S3 = c11280a2.m63907S(moment5.f56011id);
                    if (iM63907S3 >= 0) {
                        c11280a2.f41375B.m148839h(view, moment5, iM63907S3);
                    }
                    photoAlbumBottomView.m63456l2(z6, c11280a2.f41385j);
                } else {
                    i3 = i;
                    c11280a2 = c11280a;
                }
            } else {
                i3 = i;
                PhotoAlbumFeedCommentView photoAlbumFeedCommentView = (PhotoAlbumFeedCommentView) view;
                photoAlbumFeedCommentView.m63670w(c11280a2.f41379d, momentItem, c11280a2.f41383h);
                photoAlbumFeedCommentView.m63672y(z3);
            }
        } else {
            if (i == 8) {
                ((MomentSeeEntryItemView) view).m65445L(c11280a2.f41379d, c11280a2);
            } else if (i == 13) {
                ((FeedTimeViewInList) view).m65258s(c11280a2.f41383h, momentItem.f41357j, i5, c11280a2.f41382g);
            } else if (i == 32) {
                FeedModule.m60223M().feedEntry().mo167174d(view, momentItem.f41351d.voiceLiveApiInfo);
            } else if (i == 33) {
                FeedModule.m60223M().feedEntry().mo167176f(view, momentItem.f41351d.feedVoiceUserEntryInfo);
            } else if (i == 34) {
                ((TopicRecommendView) view).m66446Y(momentItem.f41362o, momentItem.f41364q, momentItem.f41363p, c11280a2.f41385j);
            } else if (i == 35) {
                ((FeedPostGuideView) view).m65183I(c11280a2.f41379d, c11280a2.f41385j, momentItem.f41365r);
            } else if (i == 36) {
                FeedSingleTopicView feedSingleTopicView = (FeedSingleTopicView) view;
                feedSingleTopicView.setShowInputMomentMap(c11280a2.f41391p);
                feedSingleTopicView.m65246l(c11280a2.f41383h, c11280a2.f41384i, c11280a2.f41385j, momentItem.f41369v, momentItem.f41370w, momentItem.f41351d);
            } else if (i == 37) {
                ((TopicRecommendUserView) view).m65297R(momentItem.f41371x, momentItem.f41364q, c11280a2.f41383h, c11280a2.f41385j);
            } else if (i == 38) {
                ((TopicRecommendTopicView) view).m65268W(c11280a2, momentItem.f41372y, c11280a2.f41383h);
            } else if (i == 39) {
                ((FeedLiveRecommendView) view).m64796o0(c11280a2.f41379d, momentItem);
            } else if (i == 41) {
                ((FeedNearbyOnlineView) view).m64391B(momentItem.f41366s);
            } else if (i == 43) {
                ((FeedStateSquareEntranceView) view).m65747I(c11280a2.f41379d, momentItem.f41367t, c11280a2.f41383h);
            } else if (i == 52) {
                ((FeedMomentViewersOperationGuideView) view).m64732Q(c11280a2.f41379d, momentItem.f41368u, c11280a2.f41383h);
            } else if (i == 42) {
                ((FeedGroupView) view).m65124L(c11280a2.f41383h, c11280a2.f41384i, momentItem.f41351d, momentItem.f41373z);
            } else if (i == 47) {
                ((FeedSeeMoreFollowingMomentView) view).m65205I(c11280a2.f41379d, momentItem.f41351d.mFeedSeeMoreFollowingMomentInfo);
            } else if (i == 55) {
                ((FeedPoiGuideView) view).m65027l(c11280a2.f41380e, ((ig00) momentItem).f113063A, c11280a2.f41383h, i5);
            } else if (i == 54) {
                FeedModule.m60223M().mo67273mg().mo181766b(view, momentItem.f41351d.liveCircleBanner.getTripleList(), momentItem.f41348a);
            } else if (i == 0) {
                m63927p0(view);
            }
            i3 = i;
        }
        if (i3 == 5) {
            c11280a2.mo63926o0((CommonEmptyView) view);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P */
    public final <T extends View> T m63905P(Class<T> cls, View view) {
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
                    t = (T) m63905P(cls, childAt);
                }
                if (t != null) {
                    return t;
                }
            }
        }
        return t;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public MomentItem getItem(int i) {
        if (i >= this.f41388m.f153135a.size()) {
            return null;
        }
        return this.f41388m.f153135a.get(i);
    }

    /* JADX INFO: renamed from: S */
    public int m63907S(final String str) {
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f41379d;
        if (photoAlbumBaseFrag == null) {
            return 0;
        }
        return vwb.m200293G(photoAlbumBaseFrag.m64011R4(), new w9j() { // from class: l.tlg
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((Moment) obj).f56011id.equals(str));
            }
        }) + 1;
    }

    /* JADX INFO: renamed from: T */
    public int m63908T(int i) {
        return m63909U(getItem(i));
    }

    /* JADX INFO: renamed from: U */
    public int m63909U(MomentItem momentItem) {
        if (momentItem == null) {
            return 7;
        }
        if (!momentItem.mo63878e()) {
            if (momentItem.m63877d()) {
                return 4;
            }
            if (momentItem.m63884k()) {
                return 8;
            }
            if (momentItem.f41356i) {
                return 13;
            }
            if (momentItem.m63876c()) {
                return 39;
            }
            if (MomentItem.VoiceType.card.equals(momentItem.f41358k)) {
                return 32;
            }
            if (MomentItem.VoiceType.profile.equals(momentItem.f41358k)) {
                return 33;
            }
            if (momentItem.m63885l()) {
                return 47;
            }
            if (momentItem instanceof ig00) {
                return 55;
            }
            return momentItem.m63875b() ? 54 : 7;
        }
        if (momentItem instanceof kg00) {
            return 50;
        }
        if (momentItem instanceof jg00) {
            return 51;
        }
        int i = momentItem.f41349b;
        if (i == 0) {
            return m63901d0() ? 28 : 1;
        }
        if (i != 1) {
            if (momentItem.m63874a()) {
                return 34;
            }
            if (momentItem.m63881h()) {
                return 35;
            }
            if (momentItem.m63888o()) {
                return 36;
            }
            if (momentItem.m63883j()) {
                return 37;
            }
            if (momentItem.m63882i()) {
                return 38;
            }
            if (momentItem.m63880g()) {
                return 41;
            }
            if (momentItem.m63879f()) {
                return 52;
            }
            if (momentItem.m63889p()) {
                return 43;
            }
            return momentItem.m63887n() ? 42 : 3;
        }
        if (m63919f0(momentItem.f41351d)) {
            return 46;
        }
        if (u2h.m191495d()) {
            LiveExtraInFeed fromLive = LiveExtraInFeed.getFromLive(momentItem.f41351d.live);
            Moment moment = momentItem.f41351d;
            if (moment.isLive) {
                Live live = moment.live;
                if ((live.videoCapture instanceof Video) || (live.snapshot instanceof Video)) {
                    return 22;
                }
                if (m63916b0(fromLive)) {
                    return 40;
                }
                if (NullChecker.m81303a(momentItem.f41351d.live.snapshot) || NullChecker.m81303a(momentItem.f41351d.liveRoom)) {
                    return 23;
                }
            } else if (moment.isVoiceLive) {
                return 29;
            }
        }
        if (vqg.m199528V(momentItem.f41351d)) {
            List<Media> list = momentItem.f41351d.media;
            if (!NullChecker.m81303a(list)) {
                if (vqg.m199532Z(momentItem.f41351d)) {
                    return 49;
                }
                return vqg.m199570s0(momentItem.f41351d) ? 53 : 25;
            }
            if (list.size() == 0) {
                if (vqg.m199532Z(momentItem.f41351d)) {
                    return 49;
                }
                return vqg.m199570s0(momentItem.f41351d) ? 53 : 25;
            }
            if (list.size() == 1 && (list.get(0) instanceof Picture) && (!TextUtils.isEmpty(momentItem.f41351d.landingPage) || !TextUtils.isEmpty(momentItem.f41351d.deeplink))) {
                return 26;
            }
        }
        if (NullChecker.m81303a(momentItem.f41351d.simpleActivity) && !TextUtils.isEmpty(fm20.m122119b(momentItem.f41351d.simpleActivity.f39235id))) {
            return 48;
        }
        if (NullChecker.m81303a(momentItem.f41351d.hyperlink) && momentItem.f41351d.hyperlink.contains("type=\"img\"")) {
            return 26;
        }
        if (!NullChecker.m81303a(momentItem.f41351d.media) || momentItem.f41351d.media.size() <= 0) {
            return vqg.m199532Z(momentItem.f41351d) ? 49 : 21;
        }
        Media media = momentItem.f41351d.media.get(0);
        if (media instanceof Video) {
            return 22;
        }
        return media instanceof Audio ? 27 : 23;
    }

    /* JADX INFO: renamed from: V */
    public String m63910V(int i) {
        MomentItem item = getItem(i);
        if (NullChecker.m81303a(item) && item.f41349b == 1 && NullChecker.m81304b(item.f41351d) && NullChecker.m81303a(item.f41351d.media) && item.f41351d.media.size() > 0 && NullChecker.m81304b(item.f41351d.media.get(0)) && (item.f41351d.media.get(0) instanceof Video)) {
            return ((Video) item.f41351d.media.get(0)).formatAspectRatio();
        }
        return null;
    }

    /* JADX INFO: renamed from: W */
    public boolean m63911W() {
        return this.f41379d.m64015V4();
    }

    /* JADX INFO: renamed from: X */
    public boolean m63912X() {
        return "from_nearby_focus".equals(this.f41383h) || "from_nearby_falls_feed".equals(this.f41383h) || "from_like".equals(this.f41383h) || "from_discover_dating".equals(this.f41383h) || "from_discover_discussion".equals(this.f41383h) || "from_activity_tab_one".equals(this.f41383h) || "from_activity_tab_two".equals(this.f41383h);
    }

    /* JADX INFO: renamed from: Y */
    public boolean m63913Y(int i) {
        int i2 = i - 1;
        if (i2 < 0 || !nkg.m159876e().enable) {
            return false;
        }
        int itemViewType = getItemViewType(i2);
        return itemViewType == 21 || itemViewType == 23 || itemViewType == 22;
    }

    /* JADX INFO: renamed from: Z */
    public boolean m63914Z() {
        return m63912X() && !"from_nearby_focus".equals(this.f41383h);
    }

    /* JADX INFO: renamed from: a0 */
    public boolean m63915a0(int i) {
        return i >= this.f41388m.f153135a.size();
    }

    /* JADX INFO: renamed from: b0 */
    public final boolean m63916b0(LiveExtraInFeed liveExtraInFeed) {
        return liveExtraInFeed != null && liveExtraInFeed.isMultiCallType() && liveExtraInFeed.multiCallInfo.onGoing;
    }

    /* JADX INFO: renamed from: c0 */
    public final boolean m63917c0(int i) {
        int i2 = i + 1;
        MomentItem momentItem = this.f41388m.f153135a.size() > i2 ? this.f41388m.f153135a.get(i2) : null;
        return NullChecker.m81303a(momentItem) && momentItem.m63881h();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: e */
    public void mo47327e(int i) {
        if (this.f41388m.f153135a.size() <= 0 || this.f41388m.f153135a.size() - i >= 3 || !m63911W()) {
            return;
        }
        this.f41381f.mo64520z();
    }

    /* JADX INFO: renamed from: e0 */
    public boolean m63918e0(int i, boolean z) {
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
    public final boolean m63919f0(Moment moment) {
        return NullChecker.m81303a(moment.thirdShareSource) && !TextUtils.isEmpty(moment.thirdShareSource.sourceId) && BLiveType.voiceLive.equals(moment.thirdShareSource.sourceType);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (this.f41388m.f153135a.size() == 0) {
            return (this.f41387l || this.f41393r) ? 5 : 7;
        }
        if (m63915a0(i)) {
            return 0;
        }
        return m63908T(i);
    }

    /* JADX INFO: renamed from: i0 */
    public void m63920i0(Moment moment, int i) {
        if (TextUtils.isEmpty(moment.liveState)) {
            return;
        }
        if ("from_nearby_focus".equals(this.f41383h)) {
            m63933v0(moment, i, "follow_photo", "p_follow");
            return;
        }
        if ("from_like".equals(this.f41383h)) {
            m63933v0(moment, i, "like_photo", "p_like");
            return;
        }
        if ("from_nearby_falls_feed".equals(this.f41383h)) {
            m63933v0(moment, i, "nearby_photo", OMSDialogPositon.p_nearby);
            return;
        }
        if ("from_discover_dating".equals(this.f41383h)) {
            m63933v0(moment, i, OMSTemplateModeType.page, "p_discover_dating");
            return;
        }
        if ("from_discover_discussion".equals(this.f41383h)) {
            m63933v0(moment, i, OMSTemplateModeType.page, "p_discover_discussion");
        } else if ("from_activity_tab_one".equals(this.f41383h)) {
            m63933v0(moment, i, OMSTemplateModeType.page, fm20.m122121d("from_activity_tab_one"));
        } else if ("from_activity_tab_two".equals(this.f41383h)) {
            m63933v0(moment, i, OMSTemplateModeType.page, fm20.m122121d("from_activity_tab_two"));
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final boolean m63921j0(int i) {
        return i == 1 || i == 3 || i == 21 || i == 22 || i == 23 || i == 24 || i == 26 || i == 25 || i == 27 || i == 29 || i == 28 || i == 40 || i == 46 || i == 49 || i == 48 || i == 50 || i == 51 || i == 53;
    }

    /* JADX INFO: renamed from: k0 */
    public final void m63922k0(Moment moment, int i, String str) {
        zvf0.m220368A("e_live_audio_room_enter", str, new j760("anchorId", moment.voiceLive.anchor.f38803id), new j760("liveId", moment.voiceLive.f39250id), new j760("audio_card_type", str.equals(OMSDialogPositon.p_nearby) ? "big_card" : "user_card"), new j760("audio_tab_id", ""), new j760("topic_id", moment.voiceLive.voiceRoomInfo.topics.size() == 0 ? 0 : moment.voiceLive.voiceRoomInfo.topics.get(0).f38839id), new j760(FirebaseAnalytics.Param.INDEX, Integer.valueOf(i)), new j760("audio_room_type", moment.voiceLive.voiceRoomInfo.maskMode ? "mask_audio" : "normal_audio"));
    }

    /* JADX INFO: renamed from: l0 */
    public void mo63923l0() {
    }

    /* JADX INFO: renamed from: m0 */
    public final void m63924m0(Moment moment) {
        if (!NullChecker.m81304b(moment) || vwb.m200296J(moment.media) || this.f41394s.contains(moment.f56011id)) {
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
        Picture.ImageUri imageUriCalculatedWidth = picture.calculatedWidth(xdl0.m208412y0());
        this.f41394s.add(moment.f56011id);
        qib0.f154691G.m102379z0(imageUriCalculatedWidth);
    }

    /* JADX INFO: renamed from: n0 */
    public void m63925n0(q860<MomentItem> q860Var, boolean z, String str, User user) {
        this.f41387l = true;
        this.f41386k = z;
        if (!User.ID_TEAM_ACCOUNT.equals(str)) {
            this.f41389n.put(str, Boolean.TRUE);
        }
        if (vwb.m200296J(this.f41388m.f153135a) || q860Var == null || vwb.m200296J(q860Var.f153135a)) {
            this.f41388m = q860Var;
            notifyDataSetChanged();
        } else {
            m63936z0(this.f41388m, q860Var);
        }
        this.f41379d.m64021b5();
    }

    /* JADX INFO: renamed from: o0 */
    public void mo63926o0(CommonEmptyView commonEmptyView) {
        if (!this.f41387l) {
            xdl0.m208345M0(commonEmptyView, false);
            return;
        }
        xdl0.m208345M0(commonEmptyView, true);
        boolean zEquals = FeedModule.m60221F().userId().equals(this.f41382g);
        String string = this.f41380e.getString(R$string.f39043d4);
        int i = f3c0.f94543i6;
        int i2 = this.f41385j;
        int i3 = 176;
        if (i2 == 0) {
            int i4 = ijb0.m136539C().profile.followships.counters.followings;
            Act act = this.f41380e;
            string = i4 > 0 ? act.getString(R$string.f39064g4) : act.getString(R$string.f39057f4);
            xdl0.m208344M(commonEmptyView.f40820a, true);
        } else if (i2 == 1) {
            string = this.f41380e.getString(R$string.f39043d4);
            xdl0.m208344M(commonEmptyView.f40820a, true);
        } else if (i2 == 3) {
            i = f3c0.f94535h6;
            string = this.f41380e.getString(R$string.f39050e4);
            i3 = 160;
        } else if (i2 == 4) {
            string = this.f41380e.getString(R$string.f38989V1);
        } else if (i2 == 6) {
            Act act2 = this.f41380e;
            string = zEquals ? act2.getString(R$string.f39149t1) : act2.getString(R$string.f39078i4);
            if (!zEquals && this.f41386k) {
                i = f3c0.f94559k6;
                string = this.f41380e.getString(R$string.f39085j4);
            }
            if (this.f41385j == 6) {
                i3 = 40;
            }
        } else if (i2 == 11) {
            string = "附近暂无更多在线用户";
        }
        if (this.f41393r) {
            commonEmptyView.f40821b.setText("当前网络不可用");
            commonEmptyView.f40820a.setImageResource(f3c0.f94454X2);
            xdl0.m208360X(commonEmptyView.f40820a, t100.m186890d(i3));
        } else {
            commonEmptyView.f40821b.setText(string);
            commonEmptyView.f40820a.setImageResource(i);
            xdl0.m208360X(commonEmptyView.f40820a, t100.m186890d(i3));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0, int i, @NonNull List<Object> list) {
        if (list.size() == 0 || getItemViewType(i) != 1) {
            onBindViewHolder(abstractC0566d0, i);
            return;
        }
        MomentItem item = getItem(i);
        PhotoAlbumTopView photoAlbumTopView = (PhotoAlbumTopView) abstractC0566d0.itemView;
        m63920i0(item.f41351d, item.f41348a + 1);
        photoAlbumTopView.m64705E(xa70.C21052a.m207548a().m207551d(this.f41380e).m207554g(this.f41383h).m207553f(m63900R(item.f41351d)).m207561n(i).m207558k(item.f41351d).m207557j(this.f41379d.f41451A.f151818q).m207553f(m63900R(item.f41351d)).m207552e(this.f41381f).m207560m(list).m207559l(null).m207549b());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0) {
        super.onViewAttachedToWindow(abstractC0566d0);
        this.f41376C.m148842o();
        this.f41375B.m148842o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0) {
        super.onViewDetachedFromWindow(abstractC0566d0);
        this.f41401z = mqi0.m155944o();
        this.f41376C.m148842o();
        this.f41375B.m148842o();
    }

    /* JADX INFO: renamed from: p0 */
    public void m63927p0(View view) {
        xdl0.m208357U(view.findViewById(b5c0.f73522T1), 0);
        if ("from_activities_moment".equals(this.f41383h) || (nah.m158678b() && "from_like".equals(this.f41383h))) {
            view.setVisibility(4);
            return;
        }
        if (this.f41388m.f153135a.size() > 0 && m63911W()) {
            view.findViewById(b5c0.f73620w1).setVisibility(0);
            view.findViewById(b5c0.f73522T1).setVisibility(8);
            view.findViewById(b5c0.f73476E0).setVisibility(8);
            return;
        }
        view.findViewById(b5c0.f73620w1).setVisibility(8);
        view.findViewById(b5c0.f73522T1).setVisibility(0);
        if (m63901d0() || (this.f41380e instanceof TopicAggregationAct)) {
            xdl0.m208357U(view.findViewById(b5c0.f73522T1), t100.m186890d(70.0f));
        }
        view.findViewById(b5c0.f73476E0).setVisibility(8);
        if (this.f41397v && this.f41388m.f153135a.size() / 2 >= 6) {
            ((VText) view.findViewById(b5c0.f73522T1)).setText(R$string.f39121o5);
        } else {
            ((VText) view.findViewById(b5c0.f73522T1)).setText(R$string.f38945O);
            mo63923l0();
        }
    }

    /* JADX INFO: renamed from: q0 */
    public void m63928q0(hx60 hx60Var) {
        this.f41381f = hx60Var;
    }

    /* JADX INFO: renamed from: r0 */
    public void m63929r0(boolean z) {
        this.f41393r = z;
    }

    /* JADX INFO: renamed from: s0 */
    public void m63930s0(int i) {
        this.f41396u = i;
    }

    /* JADX INFO: renamed from: t0 */
    public final boolean m63931t0(View view) {
        return (view instanceof FeedCenterView) || (view instanceof FeedListTextWithLinkItem) || (view instanceof FeedListImageLinkItem) || (view instanceof TopicRecommendView) || (view instanceof FeedPostGuideView) || (view instanceof FeedSingleTopicView) || (view instanceof TopicRecommendTopicView) || (view instanceof FeedNearbyOnlineView) || (view instanceof FeedStateSquareEntranceView) || (view instanceof FeedGroupView) || (view instanceof FeedMomentViewersOperationGuideView) || (view instanceof FeedSeeMoreFollowingMomentView) || (view instanceof FeedRoamMomentItemView) || (view instanceof FeedListTextWithCommentItem);
    }

    /* JADX INFO: renamed from: u0 */
    public final boolean m63932u0() {
        vqg.f182637a++;
        if (this.f41385j == 14) {
            this.f41377D++;
        }
        if (this.f41400y == null) {
            this.f41400y = new a7h(this);
        }
        return this.f41400y.m95292c(this.f41383h);
    }

    /* JADX INFO: renamed from: v0 */
    public final void m63933v0(Moment moment, int i, String str, String str2) {
        if (moment.isVoiceLive && moment.momentVoiceLiveInfos == null) {
            m63922k0(moment, i, str2);
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("liveId", moment.live.f38767id);
            jSONObject.put("anchorId", moment.live.anchor.f38803id);
            jSONObject.put("module", str);
            jSONObject.put(FirebaseAnalytics.Param.INDEX, i);
            jSONObject.put("live_status", (moment.isLive || !TextUtils.isEmpty(moment.liveState)) ? "on" : BLiveOperationTitleShowType.off);
            jSONObject.put("liveRecommendCategory", moment.live.getRecommendCategory());
            jSONObject.put("show_label", "");
            jSONObject.put("right_recommend_type", "");
            jSONObject.put("live_room_live_type", osg.m165768c(moment));
            JSONObject jSONObject2 = new JSONObject();
            if (str.equals("follow_photo") || str.equals("nearby_photo") || str.equals("like_photo")) {
                jSONObject.put("show_label", moment.iconTitle);
            } else {
                if (NullChecker.m81303a(this.f41381f.mo133306m(moment.owner))) {
                    jSONObject2.put("distance", i0g0.m133876p(this.f41381f.mo133306m(moment.owner).location.distance, true));
                }
                jSONObject.put("show_label", jSONObject2);
            }
            zvf0.m220404z("e_live_room_enter", str2, jSONObject);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            sm80.m184942b(e);
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final void m63934x0(Moment moment) {
        if (moment == null || vwb.m200296J(moment.mediaRepeatIndexList)) {
            return;
        }
        for (int i = 0; i < moment.mediaRepeatIndexList.size(); i++) {
            p6j0.m167671e("e_moment_repeat_reminder", vqg.m199515K(this.f41383h, this.f41384i), vwb.m200311Y("picture_index", Integer.valueOf(moment.mediaRepeatIndexList.get(i).intValue() + 1)), vwb.m200311Y("moment_id", moment.f56011id), vwb.m200311Y("owner_id", moment.owner));
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final void m63935y0(Moment moment, int i) {
        if (moment.isLive || moment.isVoiceLive) {
            if ("from_nearby_focus".equals(this.f41383h)) {
                m63933v0(moment, i, OMSTemplateModeType.page, "p_follow");
                return;
            }
            if ("from_like".equals(this.f41383h)) {
                m63933v0(moment, i, OMSTemplateModeType.page, "p_like");
                return;
            }
            if ("from_nearby_falls_feed".equals(this.f41383h)) {
                m63933v0(moment, i, OMSTemplateModeType.page, OMSDialogPositon.p_nearby);
                return;
            }
            if (this.f41384i) {
                m63933v0(moment, i, OMSTemplateModeType.page, "p_album");
                return;
            }
            if ("from_discover_dating".equals(this.f41383h)) {
                m63933v0(moment, i, OMSTemplateModeType.page, "p_discover_dating");
                return;
            }
            if ("from_discover_discussion".equals(this.f41383h)) {
                m63933v0(moment, i, OMSTemplateModeType.page, "p_discover_discussion");
            } else if ("from_activity_tab_one".equals(this.f41383h)) {
                m63933v0(moment, i, OMSTemplateModeType.page, fm20.m122121d("from_activity_tab_one"));
            } else if ("from_activity_tab_two".equals(this.f41383h)) {
                m63933v0(moment, i, OMSTemplateModeType.page, fm20.m122121d("from_activity_tab_two"));
            }
        }
    }

    /* JADX INFO: renamed from: z0 */
    public void m63936z0(q860<MomentItem> q860Var, q860<MomentItem> q860Var2) {
        if (this.f41398w == null) {
            this.f41398w = new yah(this, this.f41396u);
        }
        this.f41398w.m213842m(q860Var.f153135a, q860Var2.f153135a);
        C0601g.e eVarM3681c = C0601g.m3681c(this.f41398w, true);
        this.f41388m = q860Var2;
        eVarM3681c.m3693c(this.f41398w.f197203c);
    }
}
