package com.p051p1.mobile.putong.feed.newui.photoalbum.adapter;

import android.R;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.C0603g;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.data.Audio;
import com.p051p1.mobile.putong.data.Live;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.LiveExtraInFeed;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.RawFeed;
import com.p051p1.mobile.putong.feed.newui.photoalbum.CommonEmptyView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.DiscoveryPager;
import com.p051p1.mobile.putong.feed.newui.photoalbum.FeedListActivityTextWithLinkItem;
import com.p051p1.mobile.putong.feed.newui.photoalbum.FeedListImageLinkItem;
import com.p051p1.mobile.putong.feed.newui.photoalbum.FeedListTextWithCommentItem;
import com.p051p1.mobile.putong.feed.newui.photoalbum.FeedListTextWithLinkItem;
import com.p051p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumBottomView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumFeedCommentView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.adapter.C11443a;
import com.p051p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.hello.FeedNearbyOnlineView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterForwardVideoView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterLiveVoiceMomentView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterVideoView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterVoteView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feedtop.PhotoAlbumTopView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.guide.FeedMomentViewersOperationGuideView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.live.FeedLiveRecommendView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.poi.view.FeedPoiGuideView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.view.FeedGroupView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.view.FeedPostGuideView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.view.FeedRoamMomentItemView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.view.FeedSeeMoreFollowingMomentView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.view.FeedSingleTopicView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.view.FeedSvipLimitedMomentItemView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.view.FeedTimeViewInList;
import com.p051p1.mobile.putong.feed.newui.photoalbum.view.TopicRecommendTopicView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.view.TopicRecommendUserView;
import com.p051p1.mobile.putong.feed.newui.see.MomentSeeEntryItemView;
import com.p051p1.mobile.putong.feed.newui.status.display.view.FeedStateSquareEntranceView;
import com.p051p1.mobile.putong.feed.newui.topic.qatopic.QATopicAggregationActivity;
import com.p051p1.mobile.putong.feed.newui.topic.qatopic.QATopicPhotoAlbumTopView;
import com.p051p1.mobile.putong.feed.newui.topic.topicaggregation.TopicAggregationAct;
import com.p051p1.mobile.putong.feed.newui.view.TopicRecommendView;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p051p1.mobile.putong.live.base.data.BLiveType;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;
import p151v.VRecyclerView;
import p151v.VText;
import p153l.bnl0;
import p153l.cch;
import p153l.cmg;
import p153l.dj70;
import p153l.dug;
import p153l.er60;
import p153l.h80;
import p153l.hdc0;
import p153l.hrc0;
import p153l.i4g0;
import p153l.j4h;
import p153l.jic0;
import p153l.jyb;
import p153l.ksg;
import p153l.lbc0;
import p153l.mrb0;
import p153l.n570;
import p153l.nch;
import p153l.nq00;
import p153l.p8h;
import p153l.pf60;
import p153l.psd0;
import p153l.pu20;
import p153l.pzi0;
import p153l.q8g0;
import p153l.qa00;
import p153l.qcj;
import p153l.ro00;
import p153l.so00;
import p153l.tec0;
import p153l.tfj0;
import p153l.to00;
import p153l.uqb0;
import p153l.vg60;
import p153l.wu80;
import p153l.x20;
import p153l.y20;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.adapter.a */
/* JADX INFO: loaded from: classes13.dex */
public class C11443a extends jic0<MomentItem> {

    /* JADX INFO: renamed from: d */
    public final PhotoAlbumBaseFrag f42227d;

    /* JADX INFO: renamed from: e */
    public final Act f42228e;

    /* JADX INFO: renamed from: f */
    public n570 f42229f;

    /* JADX INFO: renamed from: g */
    public final String f42230g;

    /* JADX INFO: renamed from: h */
    public final String f42231h;

    /* JADX INFO: renamed from: i */
    public boolean f42232i;

    /* JADX INFO: renamed from: j */
    public final int f42233j;

    /* JADX INFO: renamed from: k */
    public boolean f42234k;

    /* JADX INFO: renamed from: r */
    public boolean f42241r;

    /* JADX INFO: renamed from: t */
    public hrc0 f42243t;

    /* JADX INFO: renamed from: u */
    public int f42244u;

    /* JADX INFO: renamed from: v */
    public boolean f42245v;

    /* JADX INFO: renamed from: w */
    public nch f42246w;

    /* JADX INFO: renamed from: x */
    public nq00 f42247x;

    /* JADX INFO: renamed from: y */
    public p8h f42248y;

    /* JADX INFO: renamed from: l */
    public boolean f42235l = false;

    /* JADX INFO: renamed from: m */
    public vg60<MomentItem> f42236m = vg60.m201219a();

    /* JADX INFO: renamed from: n */
    public HashMap<String, Boolean> f42237n = new HashMap<>();

    /* JADX INFO: renamed from: o */
    public HashMap<String, Boolean> f42238o = new HashMap<>();

    /* JADX INFO: renamed from: p */
    public HashMap<String, Boolean> f42239p = new HashMap<>();

    /* JADX INFO: renamed from: q */
    public HashMap<String, Boolean> f42240q = new HashMap<>();

    /* JADX INFO: renamed from: s */
    public List<String> f42242s = new ArrayList();

    /* JADX INFO: renamed from: z */
    public long f42249z = 0;

    /* JADX INFO: renamed from: A */
    public h80<Moment> f42222A = new a();

    /* JADX INFO: renamed from: B */
    public h80<Moment> f42223B = new b();

    /* JADX INFO: renamed from: C */
    public h80<Moment> f42224C = new c();

    /* JADX INFO: renamed from: D */
    public int f42225D = 0;

    /* JADX INFO: renamed from: c */
    public long f42226c = ksg.m151170I("feedTime");

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.adapter.a$a */
    public class a extends h80<Moment> {

        /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.adapter.a$a$a, reason: collision with other inner class name */
        public class C22816a extends ViewPager.C0721m {
            public C22816a() {
            }

            @Override // androidx.viewpager.widget.ViewPager.C0721m, androidx.viewpager.widget.ViewPager.InterfaceC0718j
            public void onPageScrollStateChanged(int i) {
                super.onPageScrollStateChanged(i);
                if (i == 0) {
                    a.this.m133884o();
                }
            }
        }

        public a() {
        }

        @Override // p153l.h80
        /* JADX INFO: renamed from: f */
        public void mo56877f(ViewGroup viewGroup, ViewGroup viewGroup2) {
            DiscoveryPager discoveryPager = (DiscoveryPager) C11443a.this.m65088P(DiscoveryPager.class, viewGroup);
            if (discoveryPager == null) {
                return;
            }
            discoveryPager.m4187d(new C22816a());
        }

        @Override // p153l.h80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo65120k(Moment moment, int i, View view) {
            if (NullChecker.m82486a(view) && (view instanceof PhotoAlbumTopView)) {
                ((PhotoAlbumTopView) view).m65892u();
            } else if (NullChecker.m82486a(view) && (view instanceof QATopicPhotoAlbumTopView)) {
                ((QATopicPhotoAlbumTopView) view).m67201M();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.adapter.a$b */
    public class b extends h80<Moment> {

        /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.adapter.a$b$a */
        public class a extends ViewPager.C0721m {
            public a() {
            }

            @Override // androidx.viewpager.widget.ViewPager.C0721m, androidx.viewpager.widget.ViewPager.InterfaceC0718j
            public void onPageScrollStateChanged(int i) {
                super.onPageScrollStateChanged(i);
                if (i == 0) {
                    b.this.m133884o();
                }
            }
        }

        public b() {
        }

        @Override // p153l.h80
        /* JADX INFO: renamed from: f */
        public void mo56877f(ViewGroup viewGroup, ViewGroup viewGroup2) {
            DiscoveryPager discoveryPager = (DiscoveryPager) C11443a.this.m65088P(DiscoveryPager.class, viewGroup);
            if (discoveryPager == null) {
                return;
            }
            discoveryPager.m4187d(new a());
        }

        @Override // p153l.h80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo65120k(Moment moment, int i, View view) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.adapter.a$c */
    public class c extends h80<Moment> {

        /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.adapter.a$c$a */
        public class a extends ViewPager.C0721m {
            public a() {
            }

            @Override // androidx.viewpager.widget.ViewPager.C0721m, androidx.viewpager.widget.ViewPager.InterfaceC0718j
            public void onPageScrollStateChanged(int i) {
                super.onPageScrollStateChanged(i);
                if (i == 0) {
                    c.this.m133884o();
                }
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.adapter.a$c$b */
        public class b extends ViewPager.C0721m {
            public b() {
            }

            @Override // androidx.viewpager.widget.ViewPager.C0721m, androidx.viewpager.widget.ViewPager.InterfaceC0718j
            public void onPageScrollStateChanged(int i) {
                super.onPageScrollStateChanged(i);
                if (i == 0) {
                    c.this.m133884o();
                }
            }
        }

        public c() {
        }

        @Override // p153l.h80
        /* JADX INFO: renamed from: f */
        public void mo56877f(ViewGroup viewGroup, ViewGroup viewGroup2) {
            View viewFindViewById = C11443a.this.f42228e.findViewById(R.id.content);
            DiscoveryPager discoveryPager = (cmg.m111233s() && C11443a.this.m65095X()) ? (DiscoveryPager) viewFindViewById.findViewById(hdc0.f108920g1) : (DiscoveryPager) C11443a.this.m65088P(DiscoveryPager.class, viewGroup);
            int i = C11443a.this.f42233j;
            DiscoveryPager discoveryPager2 = (i == 0 || i == 14 || i == 17 || i == 18) ? (DiscoveryPager) viewFindViewById.findViewById(hdc0.f108867R) : null;
            if (discoveryPager == null) {
                return;
            }
            discoveryPager.m4187d(new a());
            if (discoveryPager2 == null) {
                return;
            }
            C11443a.this.f42224C.m133885p(discoveryPager2);
            discoveryPager2.m4187d(new b());
        }

        @Override // p153l.h80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo65120k(Moment moment, int i, View view) {
            if (view instanceof FeedCenterView) {
                C11443a.this.m65117x0(moment);
                if (FeedModule.f39703d.f121291D0.contains(moment.f56859id)) {
                    return;
                }
                moment.momentViewTime = pzi0.m174454o();
                if (FeedModule.f39703d.f121295F0.contains(moment.f56859id)) {
                    return;
                }
                FeedModule.f39703d.f121295F0.add(moment.f56859id);
            }
        }

        @Override // p153l.h80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo56879m(Moment moment, int i, long j, View view) {
            if ((view instanceof FeedCenterView) && moment.momentViewTime != -1 && pzi0.m174454o() - moment.momentViewTime >= C11443a.this.f42226c * 1000 && !FeedModule.f39703d.f121291D0.contains(moment.f56859id)) {
                FeedModule.f39703d.m145836z6(moment.f56859id);
            }
            if (NullChecker.m82486a(view) && (view instanceof TopicRecommendView)) {
                ((TopicRecommendView) view).m67631a0();
                return;
            }
            if (NullChecker.m82486a(view) && (view instanceof FeedPostGuideView)) {
                ((FeedPostGuideView) view).m66367L();
                return;
            }
            if (NullChecker.m82486a(view) && (view instanceof FeedSingleTopicView)) {
                return;
            }
            if (NullChecker.m82486a(view) && (view instanceof TopicRecommendTopicView)) {
                ((TopicRecommendTopicView) view).m66450V();
                return;
            }
            if (NullChecker.m82486a(view) && (view instanceof FeedGroupView)) {
                return;
            }
            if (NullChecker.m82486a(view) && (view instanceof FeedMomentViewersOperationGuideView)) {
                return;
            }
            if (NullChecker.m82486a(view) && (view instanceof FeedSeeMoreFollowingMomentView)) {
                return;
            }
            C11443a c11443a = C11443a.this;
            String strM151174K = ksg.m151174K(c11443a.f42231h, c11443a.f42232i);
            if (TextUtils.isEmpty(strM151174K)) {
                return;
            }
            if (NullChecker.m82486a(view) && C11443a.this.m65095X() && cmg.m111246y0()) {
                RecyclerView.C0580p c0580p = (RecyclerView.C0580p) view.getLayoutParams();
                long jM174454o = pzi0.m174454o() - C11443a.this.f42249z;
                if (!c0580p.m3421f() && jM174454o < 300) {
                    C11443a.this.m65115u0();
                }
            }
            tfj0.m190943f("e_moment_exit", strM151174K, tfj0.C20302a.m190949g("moment_id", moment.f56859id), tfj0.C20302a.m190949g("owner_id", moment.owner), tfj0.C20302a.m190949g("moment_exit", j + ""), tfj0.C20302a.m190948f("order", i), tfj0.C20302a.m190949g("moment_type", er60.m122104w().m122135y(moment)));
        }
    }

    public C11443a(PhotoAlbumBaseFrag photoAlbumBaseFrag, VRecyclerView vRecyclerView, String str, String str2, int i, boolean z) {
        this.f42232i = false;
        this.f42227d = photoAlbumBaseFrag;
        this.f42228e = photoAlbumBaseFrag.act();
        this.f42230g = str;
        this.f42231h = str2;
        this.f42232i = z;
        this.f42233j = i;
        this.f42243t = new hrc0(vRecyclerView, new y20() { // from class: l.dng
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f89797a.m65085g0((Integer) obj);
            }
        }, 3);
        if (m65097Z() && NullChecker.m82486a(photoAlbumBaseFrag)) {
            photoAlbumBaseFrag.creates(new y20() { // from class: l.eng
                @Override // p153l.y20
                public final void call(Object obj) {
                    C11443a.m65076H((Bundle) obj);
                }
            }, new x20() { // from class: l.fng
                @Override // p153l.x20
                public final void call() {
                    this.f99918a.m65086h0();
                }
            });
        }
        if (NullChecker.m82486a(photoAlbumBaseFrag)) {
            mo68557c(photoAlbumBaseFrag, photoAlbumBaseFrag.lifecycle()).filter(new qcj() { // from class: l.gng
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((C4470c) obj) == C4470c.f16268j);
                }
            }).subscribe(psd0.m173596G(new y20() { // from class: l.hng
                @Override // p153l.y20
                public final void call(Object obj) {
                    FeedModule.f39703d.m145540J6();
                }
            }));
        }
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m65076H(Bundle bundle) {
    }

    /* JADX INFO: renamed from: R */
    private RawFeed m65083R(Moment moment) {
        if (NullChecker.m82486a(moment) && this.f42229f.m161687p()) {
            return this.f42229f.f140315b.m177160c(moment.f56859id);
        }
        return null;
    }

    /* JADX INFO: renamed from: d0 */
    private boolean m65084d0() {
        return this.f42228e instanceof QATopicAggregationActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public /* synthetic */ void m65085g0(Integer num) {
        MomentItem item = getItem(num.intValue());
        if (NullChecker.m82486a(item) && NullChecker.m82486a(item.f42199d)) {
            m65107m0(item.f42199d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m65086h0() {
        if (NullChecker.m82486a(this.f42247x)) {
            this.f42247x.m164281a();
        }
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f42236m.f184001a.size() + 1;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        if (i == 5) {
            return this.f42228e.inflater().inflate(tec0.f173649e, viewGroup, false);
        }
        if (i == 0) {
            return this.f42228e.inflater().inflate(tec0.f173796z, viewGroup, false);
        }
        if (i == 1) {
            return this.f42228e.inflater().inflate(tec0.f173659f2, viewGroup, false);
        }
        if (i == 21) {
            return this.f42228e.inflater().inflate(tec0.f173676h5, viewGroup, false);
        }
        if (i == 22) {
            return (FeedCenterVideoView) this.f42228e.inflater().inflate(tec0.f173690j5, viewGroup, false);
        }
        if (i == 23) {
            return this.f42228e.inflater().inflate(tec0.f173683i5, viewGroup, false);
        }
        if (i == 24) {
            return (FeedCenterVoteView) this.f42228e.inflater().inflate(tec0.f173623a1, viewGroup, false);
        }
        if (i == 3) {
            return this.f42228e.inflater().inflate(tec0.f173654e4, viewGroup, false);
        }
        if (i == 4) {
            return this.f42228e.inflater().inflate(tec0.f173767u5, viewGroup, false);
        }
        if (i == 8) {
            return this.f42228e.inflater().inflate(tec0.f173619Z3, viewGroup, false);
        }
        if (i == 26) {
            return this.f42228e.inflater().inflate(tec0.f173637c1, viewGroup, false);
        }
        if (i == 25) {
            return this.f42228e.inflater().inflate(tec0.f173651e1, viewGroup, false);
        }
        if (i == 53) {
            return this.f42228e.inflater().inflate(tec0.f173644d1, viewGroup, false);
        }
        if (i == 27) {
            return this.f42228e.inflater().inflate(tec0.f173533L1, viewGroup, false);
        }
        if (i == 13) {
            return new FeedTimeViewInList(this.f42228e);
        }
        if (i == 29) {
            return this.f42228e.inflater().inflate(tec0.f173629b0, viewGroup, false);
        }
        if (i == 40) {
            return this.f42228e.inflater().inflate(tec0.f173615Z, viewGroup, false);
        }
        if (i == 28) {
            return this.f42228e.inflater().inflate(tec0.f173582T2, viewGroup, false);
        }
        if (i == 32) {
            return FeedModule.m61407M().feedEntry().mo119419a(this.f42228e, viewGroup);
        }
        if (i == 33) {
            return FeedModule.m61407M().feedEntry().mo119420b(this.f42228e, viewGroup);
        }
        if (i == 39) {
            return this.f42228e.inflater().inflate(tec0.f173658f1, viewGroup, false);
        }
        if (i == 34) {
            return (TopicRecommendView) this.f42228e.inflater().inflate(tec0.f173505G3, viewGroup, false);
        }
        if (i == 35) {
            return (FeedPostGuideView) this.f42228e.inflater().inflate(tec0.f173473B2, viewGroup, false);
        }
        if (i == 36) {
            return (FeedSingleTopicView) this.f42228e.inflater().inflate(tec0.f173716n3, viewGroup, false);
        }
        if (i == 37) {
            return (TopicRecommendUserView) this.f42228e.inflater().inflate(tec0.f173618Z2, viewGroup, false);
        }
        if (i == 38) {
            return (TopicRecommendTopicView) this.f42228e.inflater().inflate(tec0.f173612Y2, viewGroup, false);
        }
        if (i == 41) {
            return (FeedNearbyOnlineView) this.f42228e.inflater().inflate(tec0.f173471B0, viewGroup, false);
        }
        if (i == 52) {
            return (FeedMomentViewersOperationGuideView) this.f42228e.inflater().inflate(tec0.f173485D1, viewGroup, false);
        }
        if (i == 43) {
            return (FeedStateSquareEntranceView) this.f42228e.inflater().inflate(tec0.f173751s3, viewGroup, false);
        }
        if (i == 42) {
            return (FeedGroupView) this.f42228e.inflater().inflate(tec0.f173532L0, viewGroup, false);
        }
        if (i == 47) {
            return this.f42228e.inflater().inflate(tec0.f173639c3, viewGroup, false);
        }
        if (i == 46) {
            return (FeedCenterLiveVoiceMomentView) this.f42228e.inflater().inflate(tec0.f173622a0, viewGroup, false);
        }
        if (i == 49) {
            return (FeedCenterForwardVideoView) this.f42228e.inflater().inflate(tec0.f173616Z0, viewGroup, false);
        }
        if (i == 48) {
            return this.f42228e.inflater().inflate(tec0.f173630b1, viewGroup, false);
        }
        if (i == 50) {
            return this.f42228e.inflater().inflate(tec0.f173800z3, viewGroup, false);
        }
        if (i == 51) {
            return this.f42228e.inflater().inflate(tec0.f173632b3, viewGroup, false);
        }
        if (i == 55) {
            return this.f42228e.inflater().inflate(tec0.f173722o2, viewGroup, false);
        }
        return i == 54 ? this.f42228e.inflater().inflate(FeedModule.m61407M().mo68456mg().mo184065e(), viewGroup, false) : new TextView(this.f42228e);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, MomentItem momentItem, int i, int i2) {
        int i3;
        boolean z;
        boolean z2;
        String str;
        MomentItem momentItem2;
        C11443a c11443a;
        MomentItem momentItem3;
        int i4;
        MomentItem momentItem4;
        C11443a c11443a2 = this;
        int i5 = i2;
        if (m65114t0(view) && (view.getLayoutParams() instanceof RecyclerView.C0580p)) {
            Moment moment = momentItem.f42199d;
            int iM65090S = c11443a2.m65090S(moment.f56859id);
            if (iM65090S >= 0) {
                c11443a2.f42224C.m133881h(view, moment, iM65090S);
            }
        }
        if (c11443a2.m65104j0(i) || i == 4) {
            MomentItem item = c11443a2.getItem(i5 + 1);
            boolean z3 = (item != null && item.mo65061e() && momentItem.f42199d.f56859id.equals(item.f42199d.f56859id)) ? false : true;
            if (c11443a2.m65104j0(i)) {
                if (i == 1) {
                    c11443a2.m65103i0(momentItem.f42199d, momentItem.f42196a + 1);
                    ((PhotoAlbumTopView) view).m65888E(dj70.C16548a.m116057a().m116060d(c11443a2.f42228e).m116063g(c11443a2.f42231h).m116062f(c11443a2.m65083R(momentItem.f42199d)).m116070n(i5).m116067k(momentItem.f42199d).m116066j(c11443a2.f42227d.f42299A.f182620q).m116061e(c11443a2.f42229f).m116068l(null).m116058b());
                } else if (i == 28) {
                    c11443a2.m65103i0(momentItem.f42199d, momentItem.f42196a + 1);
                    ((QATopicPhotoAlbumTopView) view).m67216c0(c11443a2.f42229f, momentItem.f42199d, c11443a2.f42231h, c11443a2.f42227d.f42299A.f182620q);
                }
                String strM151174K = ksg.m151174K(c11443a2.f42231h, c11443a2.f42232i);
                if (i == 21 || i == 23 || i == 22 || i == 24 || i == 27 || i == 29 || i == 40 || i == 46 || i == 49) {
                    Moment moment2 = momentItem.f42199d;
                    FeedCenterView feedCenterView = (FeedCenterView) view;
                    feedCenterView.setCurrentFrag(c11443a2.f42227d);
                    n570 n570Var = c11443a2.f42229f;
                    int i6 = c11443a2.f42233j;
                    Moment moment3 = momentItem.f42199d;
                    z = true;
                    z2 = false;
                    boolean zM65827T = feedCenterView.m65827T(n570Var, i6, moment3, c11443a2.f42231h, c11443a2.f42237n, momentItem.f42196a, c11443a2.f42232i, i5, c11443a2.f42238o, NullChecker.m82486a(c11443a2.m65083R(moment3)) && c11443a2.m65083R(momentItem.f42199d).canGreeting, c11443a2.f42227d.f42299A.f182620q, c11443a2.m65083R(momentItem.f42199d), c11443a2.m65101e0(i5, false));
                    i5 = i5;
                    if (zM65827T) {
                        if (j4h.m143420d()) {
                            c11443a2.m65118y0(moment2, momentItem.f42196a + 1);
                        }
                        c11443a2.f42227d.m65211i5(c11443a2.getItem(i5).f42199d.f56859id);
                    }
                    feedCenterView.m65833b0(c11443a2.f42245v);
                } else {
                    z = true;
                    z2 = false;
                }
                if (i == 50) {
                    ((FeedSvipLimitedMomentItemView) view).m66437e(c11443a2.f42228e, c11443a2, momentItem, i5);
                }
                if (i == 51) {
                    ((FeedRoamMomentItemView) view).m66384d(c11443a2.f42228e, c11443a2, momentItem, c11443a2.m65083R(momentItem.f42199d), i5);
                }
                if (i == 25) {
                    ((FeedListTextWithLinkItem) view).m64306j(c11443a2.f42233j, momentItem.f42199d, c11443a2.f42231h, i2, c11443a2.f42237n, strM151174K);
                    str = strM151174K;
                } else {
                    str = strM151174K;
                }
                if (i == 53) {
                    momentItem2 = momentItem;
                    ((FeedListTextWithCommentItem) view).m64295k(momentItem.f42199d, c11443a2.f42231h, i2, c11443a2.f42237n, str);
                } else {
                    momentItem2 = momentItem;
                }
                if (i == 26) {
                    int i7 = r0.f42233j;
                    Moment moment4 = momentItem2.f42199d;
                    String str2 = r0.f42231h;
                    RawFeed rawFeedM65083R = r0.m65083R(moment4);
                    c11443a = c11443a2;
                    momentItem3 = momentItem2;
                    ((FeedListImageLinkItem) view).m64284n(i7, moment4, str2, i2, str, rawFeedM65083R);
                } else {
                    c11443a = r0;
                    momentItem3 = momentItem2;
                }
                if (i == 48) {
                    momentItem4 = momentItem;
                    ((FeedListActivityTextWithLinkItem) view).m64268l(c11443a.f42233j, momentItem3.f42199d, c11443a.f42231h, i2, str);
                    i4 = i2;
                } else {
                    i4 = i2;
                    momentItem4 = momentItem3;
                }
                if (i == 3) {
                    PhotoAlbumBottomView photoAlbumBottomView = (PhotoAlbumBottomView) view;
                    photoAlbumBottomView.setCurrentFrag(c11443a.f42227d);
                    photoAlbumBottomView.setRawFeedsCanGreeting((NullChecker.m82486a(c11443a.m65083R(momentItem4.f42199d)) && c11443a.m65083R(momentItem4.f42199d).canGreeting) ? z : z2);
                    boolean z4 = c11443a.f42227d.f42299A.f182620q;
                    n570 n570Var2 = c11443a.f42229f;
                    HashMap<String, Boolean> map = c11443a.f42237n;
                    String str3 = c11443a.f42231h;
                    boolean z5 = c11443a.f42232i;
                    int i8 = c11443a.f42233j;
                    int i9 = momentItem4.f42196a;
                    RawFeed rawFeedM65083R2 = c11443a.m65083R(momentItem4.f42199d);
                    int iM65090S2 = c11443a.m65090S(momentItem4.f42199d.f56859id);
                    boolean zM65100c0 = c11443a.m65100c0(i4);
                    boolean zM65096Y = c11443a.m65096Y(i4);
                    boolean zM65101e0 = c11443a.m65101e0(i4, z);
                    c11443a2 = c11443a;
                    MomentItem momentItem5 = momentItem4;
                    boolean z6 = z2;
                    i3 = i;
                    photoAlbumBottomView.m64586F1(z4, n570Var2, momentItem5, map, str3, z5, i8, i9, rawFeedM65083R2, iM65090S2, zM65100c0, zM65096Y, zM65101e0);
                    Moment moment5 = momentItem5.f42199d;
                    int iM65090S3 = c11443a2.m65090S(moment5.f56859id);
                    if (iM65090S3 >= 0) {
                        c11443a2.f42223B.m133881h(view, moment5, iM65090S3);
                    }
                    photoAlbumBottomView.m64639l2(z6, c11443a2.f42233j);
                } else {
                    i3 = i;
                    c11443a2 = c11443a;
                }
            } else {
                i3 = i;
                PhotoAlbumFeedCommentView photoAlbumFeedCommentView = (PhotoAlbumFeedCommentView) view;
                photoAlbumFeedCommentView.m64853w(c11443a2.f42227d, momentItem, c11443a2.f42231h);
                photoAlbumFeedCommentView.m64855y(z3);
            }
        } else {
            if (i == 8) {
                ((MomentSeeEntryItemView) view).m66628L(c11443a2.f42227d, c11443a2);
            } else if (i == 13) {
                ((FeedTimeViewInList) view).m66441s(c11443a2.f42231h, momentItem.f42205j, i5, c11443a2.f42230g);
            } else if (i == 32) {
                FeedModule.m61407M().feedEntry().mo119422d(view, momentItem.f42199d.voiceLiveApiInfo);
            } else if (i == 33) {
                FeedModule.m61407M().feedEntry().mo119424f(view, momentItem.f42199d.feedVoiceUserEntryInfo);
            } else if (i == 34) {
                ((TopicRecommendView) view).m67629Y(momentItem.f42210o, momentItem.f42212q, momentItem.f42211p, c11443a2.f42233j);
            } else if (i == 35) {
                ((FeedPostGuideView) view).m66366I(c11443a2.f42227d, c11443a2.f42233j, momentItem.f42213r);
            } else if (i == 36) {
                FeedSingleTopicView feedSingleTopicView = (FeedSingleTopicView) view;
                feedSingleTopicView.setShowInputMomentMap(c11443a2.f42239p);
                feedSingleTopicView.m66429l(c11443a2.f42231h, c11443a2.f42232i, c11443a2.f42233j, momentItem.f42217v, momentItem.f42218w, momentItem.f42199d);
            } else if (i == 37) {
                ((TopicRecommendUserView) view).m66480R(momentItem.f42219x, momentItem.f42212q, c11443a2.f42231h, c11443a2.f42233j);
            } else if (i == 38) {
                ((TopicRecommendTopicView) view).m66451W(c11443a2, momentItem.f42220y, c11443a2.f42231h);
            } else if (i == 39) {
                ((FeedLiveRecommendView) view).m65979o0(c11443a2.f42227d, momentItem);
            } else if (i == 41) {
                ((FeedNearbyOnlineView) view).m65574B(momentItem.f42214s);
            } else if (i == 43) {
                ((FeedStateSquareEntranceView) view).m66930I(c11443a2.f42227d, momentItem.f42215t, c11443a2.f42231h);
            } else if (i == 52) {
                ((FeedMomentViewersOperationGuideView) view).m65915Q(c11443a2.f42227d, momentItem.f42216u, c11443a2.f42231h);
            } else if (i == 42) {
                ((FeedGroupView) view).m66307L(c11443a2.f42231h, c11443a2.f42232i, momentItem.f42199d, momentItem.f42221z);
            } else if (i == 47) {
                ((FeedSeeMoreFollowingMomentView) view).m66388I(c11443a2.f42227d, momentItem.f42199d.mFeedSeeMoreFollowingMomentInfo);
            } else if (i == 55) {
                ((FeedPoiGuideView) view).m66210l(c11443a2.f42228e, ((ro00) momentItem).f164143A, c11443a2.f42231h, i5);
            } else if (i == 54) {
                FeedModule.m61407M().mo68456mg().mo184062b(view, momentItem.f42199d.liveCircleBanner.getTripleList(), momentItem.f42196a);
            } else if (i == 0) {
                m65110p0(view);
            }
            i3 = i;
        }
        if (i3 == 5) {
            c11443a2.mo65109o0((CommonEmptyView) view);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P */
    public final <T extends View> T m65088P(Class<T> cls, View view) {
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
                    t = (T) m65088P(cls, childAt);
                }
                if (t != null) {
                    return t;
                }
            }
        }
        return t;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public MomentItem getItem(int i) {
        if (i >= this.f42236m.f184001a.size()) {
            return null;
        }
        return this.f42236m.f184001a.get(i);
    }

    /* JADX INFO: renamed from: S */
    public int m65090S(final String str) {
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f42227d;
        if (photoAlbumBaseFrag == null) {
            return 0;
        }
        return jyb.m147476G(photoAlbumBaseFrag.m65194R4(), new qcj() { // from class: l.ing
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((Moment) obj).f56859id.equals(str));
            }
        }) + 1;
    }

    /* JADX INFO: renamed from: T */
    public int m65091T(int i) {
        return m65092U(getItem(i));
    }

    /* JADX INFO: renamed from: U */
    public int m65092U(MomentItem momentItem) {
        if (momentItem == null) {
            return 7;
        }
        if (!momentItem.mo65061e()) {
            if (momentItem.m65060d()) {
                return 4;
            }
            if (momentItem.m65067k()) {
                return 8;
            }
            if (momentItem.f42204i) {
                return 13;
            }
            if (momentItem.m65059c()) {
                return 39;
            }
            if (MomentItem.VoiceType.card.equals(momentItem.f42206k)) {
                return 32;
            }
            if (MomentItem.VoiceType.profile.equals(momentItem.f42206k)) {
                return 33;
            }
            if (momentItem.m65068l()) {
                return 47;
            }
            if (momentItem instanceof ro00) {
                return 55;
            }
            return momentItem.m65058b() ? 54 : 7;
        }
        if (momentItem instanceof to00) {
            return 50;
        }
        if (momentItem instanceof so00) {
            return 51;
        }
        int i = momentItem.f42197b;
        if (i == 0) {
            return m65084d0() ? 28 : 1;
        }
        if (i != 1) {
            if (momentItem.m65057a()) {
                return 34;
            }
            if (momentItem.m65064h()) {
                return 35;
            }
            if (momentItem.m65071o()) {
                return 36;
            }
            if (momentItem.m65066j()) {
                return 37;
            }
            if (momentItem.m65065i()) {
                return 38;
            }
            if (momentItem.m65063g()) {
                return 41;
            }
            if (momentItem.m65062f()) {
                return 52;
            }
            if (momentItem.m65072p()) {
                return 43;
            }
            return momentItem.m65070n() ? 42 : 3;
        }
        if (m65102f0(momentItem.f42199d)) {
            return 46;
        }
        if (j4h.m143420d()) {
            LiveExtraInFeed fromLive = LiveExtraInFeed.getFromLive(momentItem.f42199d.live);
            Moment moment = momentItem.f42199d;
            if (moment.isLive) {
                Live live = moment.live;
                if ((live.videoCapture instanceof Video) || (live.snapshot instanceof Video)) {
                    return 22;
                }
                if (m65099b0(fromLive)) {
                    return 40;
                }
                if (NullChecker.m82486a(momentItem.f42199d.live.snapshot) || NullChecker.m82486a(momentItem.f42199d.liveRoom)) {
                    return 23;
                }
            } else if (moment.isVoiceLive) {
                return 29;
            }
        }
        if (ksg.m151187V(momentItem.f42199d)) {
            List<Media> list = momentItem.f42199d.media;
            if (!NullChecker.m82486a(list)) {
                if (ksg.m151191Z(momentItem.f42199d)) {
                    return 49;
                }
                return ksg.m151229s0(momentItem.f42199d) ? 53 : 25;
            }
            if (list.size() == 0) {
                if (ksg.m151191Z(momentItem.f42199d)) {
                    return 49;
                }
                return ksg.m151229s0(momentItem.f42199d) ? 53 : 25;
            }
            if (list.size() == 1 && (list.get(0) instanceof Picture) && (!TextUtils.isEmpty(momentItem.f42199d.landingPage) || !TextUtils.isEmpty(momentItem.f42199d.deeplink))) {
                return 26;
            }
        }
        if (NullChecker.m82486a(momentItem.f42199d.simpleActivity) && !TextUtils.isEmpty(pu20.m173807b(momentItem.f42199d.simpleActivity.f40083id))) {
            return 48;
        }
        if (NullChecker.m82486a(momentItem.f42199d.hyperlink) && momentItem.f42199d.hyperlink.contains("type=\"img\"")) {
            return 26;
        }
        if (!NullChecker.m82486a(momentItem.f42199d.media) || momentItem.f42199d.media.size() <= 0) {
            return ksg.m151191Z(momentItem.f42199d) ? 49 : 21;
        }
        Media media = momentItem.f42199d.media.get(0);
        if (media instanceof Video) {
            return 22;
        }
        return media instanceof Audio ? 27 : 23;
    }

    /* JADX INFO: renamed from: V */
    public String m65093V(int i) {
        MomentItem item = getItem(i);
        if (NullChecker.m82486a(item) && item.f42197b == 1 && NullChecker.m82487b(item.f42199d) && NullChecker.m82486a(item.f42199d.media) && item.f42199d.media.size() > 0 && NullChecker.m82487b(item.f42199d.media.get(0)) && (item.f42199d.media.get(0) instanceof Video)) {
            return ((Video) item.f42199d.media.get(0)).formatAspectRatio();
        }
        return null;
    }

    /* JADX INFO: renamed from: W */
    public boolean m65094W() {
        return this.f42227d.m65198V4();
    }

    /* JADX INFO: renamed from: X */
    public boolean m65095X() {
        return "from_nearby_focus".equals(this.f42231h) || "from_nearby_falls_feed".equals(this.f42231h) || "from_like".equals(this.f42231h) || "from_discover_dating".equals(this.f42231h) || "from_discover_discussion".equals(this.f42231h) || "from_activity_tab_one".equals(this.f42231h) || "from_activity_tab_two".equals(this.f42231h);
    }

    /* JADX INFO: renamed from: Y */
    public boolean m65096Y(int i) {
        int i2 = i - 1;
        if (i2 < 0 || !cmg.m111205e().enable) {
            return false;
        }
        int itemViewType = getItemViewType(i2);
        return itemViewType == 21 || itemViewType == 23 || itemViewType == 22;
    }

    /* JADX INFO: renamed from: Z */
    public boolean m65097Z() {
        return m65095X() && !"from_nearby_focus".equals(this.f42231h);
    }

    /* JADX INFO: renamed from: a0 */
    public boolean m65098a0(int i) {
        return i >= this.f42236m.f184001a.size();
    }

    /* JADX INFO: renamed from: b0 */
    public final boolean m65099b0(LiveExtraInFeed liveExtraInFeed) {
        return liveExtraInFeed != null && liveExtraInFeed.isMultiCallType() && liveExtraInFeed.multiCallInfo.onGoing;
    }

    /* JADX INFO: renamed from: c0 */
    public final boolean m65100c0(int i) {
        int i2 = i + 1;
        MomentItem momentItem = this.f42236m.f184001a.size() > i2 ? this.f42236m.f184001a.get(i2) : null;
        return NullChecker.m82486a(momentItem) && momentItem.m65064h();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: e */
    public void mo48510e(int i) {
        if (this.f42236m.f184001a.size() <= 0 || this.f42236m.f184001a.size() - i >= 3 || !m65094W()) {
            return;
        }
        this.f42229f.mo65703z();
    }

    /* JADX INFO: renamed from: e0 */
    public boolean m65101e0(int i, boolean z) {
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
    public final boolean m65102f0(Moment moment) {
        return NullChecker.m82486a(moment.thirdShareSource) && !TextUtils.isEmpty(moment.thirdShareSource.sourceId) && BLiveType.voiceLive.equals(moment.thirdShareSource.sourceType);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (this.f42236m.f184001a.size() == 0) {
            return (this.f42235l || this.f42241r) ? 5 : 7;
        }
        if (m65098a0(i)) {
            return 0;
        }
        return m65091T(i);
    }

    /* JADX INFO: renamed from: i0 */
    public void m65103i0(Moment moment, int i) {
        if (TextUtils.isEmpty(moment.liveState)) {
            return;
        }
        if ("from_nearby_focus".equals(this.f42231h)) {
            m65116v0(moment, i, "follow_photo", "p_follow");
            return;
        }
        if ("from_like".equals(this.f42231h)) {
            m65116v0(moment, i, "like_photo", "p_like");
            return;
        }
        if ("from_nearby_falls_feed".equals(this.f42231h)) {
            m65116v0(moment, i, "nearby_photo", OMSDialogPositon.p_nearby);
            return;
        }
        if ("from_discover_dating".equals(this.f42231h)) {
            m65116v0(moment, i, OMSTemplateModeType.page, "p_discover_dating");
            return;
        }
        if ("from_discover_discussion".equals(this.f42231h)) {
            m65116v0(moment, i, OMSTemplateModeType.page, "p_discover_discussion");
        } else if ("from_activity_tab_one".equals(this.f42231h)) {
            m65116v0(moment, i, OMSTemplateModeType.page, pu20.m173809d("from_activity_tab_one"));
        } else if ("from_activity_tab_two".equals(this.f42231h)) {
            m65116v0(moment, i, OMSTemplateModeType.page, pu20.m173809d("from_activity_tab_two"));
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final boolean m65104j0(int i) {
        return i == 1 || i == 3 || i == 21 || i == 22 || i == 23 || i == 24 || i == 26 || i == 25 || i == 27 || i == 29 || i == 28 || i == 40 || i == 46 || i == 49 || i == 48 || i == 50 || i == 51 || i == 53;
    }

    /* JADX INFO: renamed from: k0 */
    public final void m65105k0(Moment moment, int i, String str) {
        i4g0.m138492A("e_live_audio_room_enter", str, new pf60("anchorId", moment.voiceLive.anchor.f39651id), new pf60("liveId", moment.voiceLive.f40098id), new pf60("audio_card_type", str.equals(OMSDialogPositon.p_nearby) ? "big_card" : "user_card"), new pf60("audio_tab_id", ""), new pf60("topic_id", moment.voiceLive.voiceRoomInfo.topics.size() == 0 ? 0 : moment.voiceLive.voiceRoomInfo.topics.get(0).f39687id), new pf60(FirebaseAnalytics.Param.INDEX, Integer.valueOf(i)), new pf60("audio_room_type", moment.voiceLive.voiceRoomInfo.maskMode ? "mask_audio" : "normal_audio"));
    }

    /* JADX INFO: renamed from: l0 */
    public void mo65106l0() {
    }

    /* JADX INFO: renamed from: m0 */
    public final void m65107m0(Moment moment) {
        if (!NullChecker.m82487b(moment) || jyb.m147479J(moment.media) || this.f42242s.contains(moment.f56859id)) {
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
        Picture.ImageUri imageUriCalculatedWidth = picture.calculatedWidth(bnl0.m105592y0());
        this.f42242s.add(moment.f56859id);
        uqb0.f180374G.m127162z0(imageUriCalculatedWidth);
    }

    /* JADX INFO: renamed from: n0 */
    public void m65108n0(vg60<MomentItem> vg60Var, boolean z, String str, User user) {
        this.f42235l = true;
        this.f42234k = z;
        if (!User.ID_TEAM_ACCOUNT.equals(str)) {
            this.f42237n.put(str, Boolean.TRUE);
        }
        if (jyb.m147479J(this.f42236m.f184001a) || vg60Var == null || jyb.m147479J(vg60Var.f184001a)) {
            this.f42236m = vg60Var;
            notifyDataSetChanged();
        } else {
            m65119z0(this.f42236m, vg60Var);
        }
        this.f42227d.m65204b5();
    }

    /* JADX INFO: renamed from: o0 */
    public void mo65109o0(CommonEmptyView commonEmptyView) {
        if (!this.f42235l) {
            bnl0.m105525M0(commonEmptyView, false);
            return;
        }
        bnl0.m105525M0(commonEmptyView, true);
        boolean zEquals = FeedModule.m61405F().userId().equals(this.f42230g);
        String string = this.f42228e.getString(R$string.f39891d4);
        int i = lbc0.f131061i6;
        int i2 = this.f42233j;
        int i3 = 176;
        if (i2 == 0) {
            int i4 = mrb0.m159625C().profile.followships.counters.followings;
            Act act = this.f42228e;
            string = i4 > 0 ? act.getString(R$string.f39912g4) : act.getString(R$string.f39905f4);
            bnl0.m105524M(commonEmptyView.f41668a, true);
        } else if (i2 == 1) {
            string = this.f42228e.getString(R$string.f39891d4);
            bnl0.m105524M(commonEmptyView.f41668a, true);
        } else if (i2 == 3) {
            i = lbc0.f131053h6;
            string = this.f42228e.getString(R$string.f39898e4);
            i3 = 160;
        } else if (i2 == 4) {
            string = this.f42228e.getString(R$string.f39837V1);
        } else if (i2 == 6) {
            Act act2 = this.f42228e;
            string = zEquals ? act2.getString(R$string.f39997t1) : act2.getString(R$string.f39926i4);
            if (!zEquals && this.f42234k) {
                i = lbc0.f131077k6;
                string = this.f42228e.getString(R$string.f39933j4);
            }
            if (this.f42233j == 6) {
                i3 = 40;
            }
        } else if (i2 == 11) {
            string = "附近暂无更多在线用户";
        }
        if (this.f42241r) {
            commonEmptyView.f41669b.setText("当前网络不可用");
            commonEmptyView.f41668a.setImageResource(lbc0.f130972X2);
            bnl0.m105540X(commonEmptyView.f41668a, qa00.m175859d(i3));
        } else {
            commonEmptyView.f41669b.setText(string);
            commonEmptyView.f41668a.setImageResource(i);
            bnl0.m105540X(commonEmptyView.f41668a, qa00.m175859d(i3));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull RecyclerView.AbstractC0569e0 abstractC0569e0, int i, @NonNull List<Object> list) {
        if (list.size() == 0 || getItemViewType(i) != 1) {
            onBindViewHolder(abstractC0569e0, i);
            return;
        }
        MomentItem item = getItem(i);
        PhotoAlbumTopView photoAlbumTopView = (PhotoAlbumTopView) abstractC0569e0.itemView;
        m65103i0(item.f42199d, item.f42196a + 1);
        photoAlbumTopView.m65888E(dj70.C16548a.m116057a().m116060d(this.f42228e).m116063g(this.f42231h).m116062f(m65083R(item.f42199d)).m116070n(i).m116067k(item.f42199d).m116066j(this.f42227d.f42299A.f182620q).m116062f(m65083R(item.f42199d)).m116061e(this.f42229f).m116069m(list).m116068l(null).m116058b());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NonNull RecyclerView.AbstractC0569e0 abstractC0569e0) {
        super.onViewAttachedToWindow(abstractC0569e0);
        this.f42224C.m133884o();
        this.f42223B.m133884o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(@NonNull RecyclerView.AbstractC0569e0 abstractC0569e0) {
        super.onViewDetachedFromWindow(abstractC0569e0);
        this.f42249z = pzi0.m174454o();
        this.f42224C.m133884o();
        this.f42223B.m133884o();
    }

    /* JADX INFO: renamed from: p0 */
    public void m65110p0(View view) {
        bnl0.m105537U(view.findViewById(hdc0.f108875T1), 0);
        if ("from_activities_moment".equals(this.f42231h) || (cch.m108707b() && "from_like".equals(this.f42231h))) {
            view.setVisibility(4);
            return;
        }
        if (this.f42236m.f184001a.size() > 0 && m65094W()) {
            view.findViewById(hdc0.f108973w1).setVisibility(0);
            view.findViewById(hdc0.f108875T1).setVisibility(8);
            view.findViewById(hdc0.f108829E0).setVisibility(8);
            return;
        }
        view.findViewById(hdc0.f108973w1).setVisibility(8);
        view.findViewById(hdc0.f108875T1).setVisibility(0);
        if (m65084d0() || (this.f42228e instanceof TopicAggregationAct)) {
            bnl0.m105537U(view.findViewById(hdc0.f108875T1), qa00.m175859d(70.0f));
        }
        view.findViewById(hdc0.f108829E0).setVisibility(8);
        if (this.f42245v && this.f42236m.f184001a.size() / 2 >= 6) {
            ((VText) view.findViewById(hdc0.f108875T1)).setText(R$string.f39969o5);
        } else {
            ((VText) view.findViewById(hdc0.f108875T1)).setText(R$string.f39793O);
            mo65106l0();
        }
    }

    /* JADX INFO: renamed from: q0 */
    public void m65111q0(n570 n570Var) {
        this.f42229f = n570Var;
    }

    /* JADX INFO: renamed from: r0 */
    public void m65112r0(boolean z) {
        this.f42241r = z;
    }

    /* JADX INFO: renamed from: s0 */
    public void m65113s0(int i) {
        this.f42244u = i;
    }

    /* JADX INFO: renamed from: t0 */
    public final boolean m65114t0(View view) {
        return (view instanceof FeedCenterView) || (view instanceof FeedListTextWithLinkItem) || (view instanceof FeedListImageLinkItem) || (view instanceof TopicRecommendView) || (view instanceof FeedPostGuideView) || (view instanceof FeedSingleTopicView) || (view instanceof TopicRecommendTopicView) || (view instanceof FeedNearbyOnlineView) || (view instanceof FeedStateSquareEntranceView) || (view instanceof FeedGroupView) || (view instanceof FeedMomentViewersOperationGuideView) || (view instanceof FeedSeeMoreFollowingMomentView) || (view instanceof FeedRoamMomentItemView) || (view instanceof FeedListTextWithCommentItem);
    }

    /* JADX INFO: renamed from: u0 */
    public final boolean m65115u0() {
        ksg.f128560a++;
        if (this.f42233j == 14) {
            this.f42225D++;
        }
        if (this.f42248y == null) {
            this.f42248y = new p8h(this);
        }
        return this.f42248y.m171242c(this.f42231h);
    }

    /* JADX INFO: renamed from: v0 */
    public final void m65116v0(Moment moment, int i, String str, String str2) {
        if (moment.isVoiceLive && moment.momentVoiceLiveInfos == null) {
            m65105k0(moment, i, str2);
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("liveId", moment.live.f39615id);
            jSONObject.put("anchorId", moment.live.anchor.f39651id);
            jSONObject.put("module", str);
            jSONObject.put(FirebaseAnalytics.Param.INDEX, i);
            jSONObject.put("live_status", (moment.isLive || !TextUtils.isEmpty(moment.liveState)) ? "on" : BLiveOperationTitleShowType.off);
            jSONObject.put("liveRecommendCategory", moment.live.getRecommendCategory());
            jSONObject.put("show_label", "");
            jSONObject.put("right_recommend_type", "");
            jSONObject.put("live_room_live_type", dug.m118137c(moment));
            JSONObject jSONObject2 = new JSONObject();
            if (str.equals("follow_photo") || str.equals("nearby_photo") || str.equals("like_photo")) {
                jSONObject.put("show_label", moment.iconTitle);
            } else {
                if (NullChecker.m82486a(this.f42229f.mo137270m(moment.owner))) {
                    jSONObject2.put("distance", q8g0.m175811p(this.f42229f.mo137270m(moment.owner).location.distance, true));
                }
                jSONObject.put("show_label", jSONObject2);
            }
            i4g0.m138528z("e_live_room_enter", str2, jSONObject);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            wu80.m207938b(e);
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final void m65117x0(Moment moment) {
        if (moment == null || jyb.m147479J(moment.mediaRepeatIndexList)) {
            return;
        }
        for (int i = 0; i < moment.mediaRepeatIndexList.size(); i++) {
            tfj0.m190942e("e_moment_repeat_reminder", ksg.m151174K(this.f42231h, this.f42232i), jyb.m147494Y("picture_index", Integer.valueOf(moment.mediaRepeatIndexList.get(i).intValue() + 1)), jyb.m147494Y("moment_id", moment.f56859id), jyb.m147494Y("owner_id", moment.owner));
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final void m65118y0(Moment moment, int i) {
        if (moment.isLive || moment.isVoiceLive) {
            if ("from_nearby_focus".equals(this.f42231h)) {
                m65116v0(moment, i, OMSTemplateModeType.page, "p_follow");
                return;
            }
            if ("from_like".equals(this.f42231h)) {
                m65116v0(moment, i, OMSTemplateModeType.page, "p_like");
                return;
            }
            if ("from_nearby_falls_feed".equals(this.f42231h)) {
                m65116v0(moment, i, OMSTemplateModeType.page, OMSDialogPositon.p_nearby);
                return;
            }
            if (this.f42232i) {
                m65116v0(moment, i, OMSTemplateModeType.page, "p_album");
                return;
            }
            if ("from_discover_dating".equals(this.f42231h)) {
                m65116v0(moment, i, OMSTemplateModeType.page, "p_discover_dating");
                return;
            }
            if ("from_discover_discussion".equals(this.f42231h)) {
                m65116v0(moment, i, OMSTemplateModeType.page, "p_discover_discussion");
            } else if ("from_activity_tab_one".equals(this.f42231h)) {
                m65116v0(moment, i, OMSTemplateModeType.page, pu20.m173809d("from_activity_tab_one"));
            } else if ("from_activity_tab_two".equals(this.f42231h)) {
                m65116v0(moment, i, OMSTemplateModeType.page, pu20.m173809d("from_activity_tab_two"));
            }
        }
    }

    /* JADX INFO: renamed from: z0 */
    public void m65119z0(vg60<MomentItem> vg60Var, vg60<MomentItem> vg60Var2) {
        if (this.f42246w == null) {
            this.f42246w = new nch(this, this.f42244u);
        }
        this.f42246w.m162560m(vg60Var.f184001a, vg60Var2.f184001a);
        C0603g.e eVarM3682c = C0603g.m3682c(this.f42246w, true);
        this.f42236m = vg60Var2;
        eVarM3682c.m3694c(this.f42246w.f141357c);
    }
}
