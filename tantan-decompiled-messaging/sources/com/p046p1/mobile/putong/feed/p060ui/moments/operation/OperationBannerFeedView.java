package com.p046p1.mobile.putong.feed.p060ui.moments.operation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.viewpager.widget.ViewPager;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.IntlOperationBanner;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p147v.AspectRatioViewPager;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VPagerCircleIndicator;
import p149l.b5c0;
import p149l.c4g0;
import p149l.e1c0;
import p149l.e30;
import p149l.j760;
import p149l.jo0;
import p149l.mkd0;
import p149l.o6c0;
import p149l.qib0;
import p149l.qq50;
import p149l.w660;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes12.dex */
public class OperationBannerFeedView extends VFrame {

    /* JADX INFO: renamed from: a */
    public CardView f44009a;

    /* JADX INFO: renamed from: b */
    public AspectRatioViewPager f44010b;

    /* JADX INFO: renamed from: c */
    public VPagerCircleIndicator f44011c;

    /* JADX INFO: renamed from: d */
    public C11413b f44012d;

    /* JADX INFO: renamed from: e */
    public List<IntlOperationBanner> f44013e;

    /* JADX INFO: renamed from: f */
    public c4g0 f44014f;

    /* JADX INFO: renamed from: g */
    public int f44015g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.ui.moments.operation.OperationBannerFeedView$a */
    public class C11412a implements ViewPager.InterfaceC0716j {

        /* JADX INFO: renamed from: a */
        public int f44016a;

        /* JADX INFO: renamed from: b */
        public boolean f44017b;

        public C11412a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrollStateChanged(int i) {
            if (this.f44016a == 1 && i == 2) {
                this.f44017b = true;
            } else if (i == 0) {
                this.f44017b = false;
            }
            this.f44016a = i;
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int i) {
            if (this.f44017b && NullChecker.m81303a(OperationBannerFeedView.this.f44014f)) {
                OperationBannerFeedView.this.f44014f.unsubscribe();
            }
            OperationBannerFeedView.this.f44015g = i + 1;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.ui.moments.operation.OperationBannerFeedView$b */
    public class C11413b extends w660 {
        public C11413b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: k */
        public /* synthetic */ void m67097k(IntlOperationBanner intlOperationBanner, View view) {
            if (NullChecker.m81303a(intlOperationBanner)) {
                zvf0.m220399u("e_explore_campaign_banner", "p_moments_view", j760.m140076a("intl_campaign_id", intlOperationBanner.f38763id));
                FeedModule.m60222H().mo30804pa(OperationBannerFeedView.this.act(), 1, intlOperationBanner, null);
            }
        }

        @Override // p149l.w660
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // p149l.w660
        public int getCount() {
            return OperationBannerFeedView.this.f44013e.size();
        }

        @Override // p149l.w660
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            View viewInflate = OperationBannerFeedView.this.act().inflater().inflate(o6c0.f142082O1, (ViewGroup) null);
            VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(b5c0.f73589m0);
            final IntlOperationBanner intlOperationBanner = (IntlOperationBanner) OperationBannerFeedView.this.f44013e.get(i);
            if (NullChecker.m81303a(intlOperationBanner)) {
                qib0.f154691G.m102331L0(vDraweeView, intlOperationBanner.banner.url);
            }
            xdl0.m208329E0(vDraweeView, new View.OnClickListener() { // from class: l.pq50
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f150759a.m67097k(intlOperationBanner, view);
                }
            });
            zvf0.m220368A("e_explore_campaign_banner", "p_moments_view", j760.m140076a("intl_campaign_id", intlOperationBanner.f38763id));
            viewGroup.addView(viewInflate);
            return viewInflate;
        }

        @Override // p149l.w660
        public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
            return view == obj;
        }
    }

    public OperationBannerFeedView(Context context) {
        super(context);
        this.f44013e = new ArrayList();
        this.f44015g = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m67088B(Long l2) {
        int currentItem = this.f44010b.getCurrentItem();
        int count = this.f44012d.getCount() - 1;
        AspectRatioViewPager aspectRatioViewPager = this.f44010b;
        if (currentItem == count) {
            aspectRatioViewPager.m4176T(0, true);
        } else {
            aspectRatioViewPager.m4176T(aspectRatioViewPager.getCurrentItem() + 1, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Act act() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: C */
    public void m67094C(Act act, List<IntlOperationBanner> list) {
        this.f44013e = list;
        if (this.f44012d.getCount() > 1) {
            if (NullChecker.m81303a(this.f44014f) && !this.f44014f.isUnsubscribed()) {
                this.f44014f.unsubscribe();
            }
            this.f44014f = act.duringCreated(C22306c.interval(3000L, TimeUnit.MILLISECONDS).onBackpressureLatest().observeOn(jo0.m142408a())).subscribe(mkd0.m154955G(new e30() { // from class: l.oq50
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f145109a.m67088B((Long) obj);
                }
            }));
            this.f44010b.m4185d(new C11412a());
        }
        int size = this.f44013e.size();
        VPagerCircleIndicator vPagerCircleIndicator = this.f44011c;
        if (size <= 1) {
            xdl0.m208345M0(vPagerCircleIndicator, false);
        } else {
            xdl0.m208345M0(vPagerCircleIndicator, true);
        }
        this.f44012d.notifyDataSetChanged();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m67095z(this);
        C11413b c11413b = new C11413b();
        this.f44012d = c11413b;
        this.f44010b.setAdapter(c11413b);
        this.f44010b.setCurrentItem(0);
        VPagerCircleIndicator vPagerCircleIndicator = this.f44011c;
        AspectRatioViewPager aspectRatioViewPager = this.f44010b;
        vPagerCircleIndicator.m223143c(aspectRatioViewPager, aspectRatioViewPager.getCurrentItem());
        this.f44011c.setFillColor(getContext().getResources().getColor(e1c0.f88767V));
    }

    /* JADX INFO: renamed from: z */
    public final void m67095z(View view) {
        qq50.m175878a(this, view);
    }

    public OperationBannerFeedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44013e = new ArrayList();
        this.f44015g = 0;
    }

    public OperationBannerFeedView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f44013e = new ArrayList();
        this.f44015g = 0;
    }
}
