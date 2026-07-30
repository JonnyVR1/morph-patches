package com.p000p1.mobile.putong.feed.p005ui.moments.operation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.viewpager.widget.ViewPager;
import com.p000p1.mobile.putong.data.IntlOperationArticles;
import com.p000p1.mobile.putong.data.IntlOperationBanner;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import l.c4g0;
import l.e30;
import l.j760;
import l.jo0;
import l.mkd0;
import l.qib0;
import l.w660;
import l.xdl0;
import l.zvf0;
import p007l.b5c0;
import p007l.e1c0;
import p007l.o6c0;
import p007l.qq50;
import rx.c;
import v.AspectRatioViewPager;
import v.VDraweeView;
import v.VFrame;
import v.VPagerCircleIndicator;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class OperationBannerFeedView extends VFrame {

    /* JADX INFO: renamed from: a */
    public CardView f5470a;

    /* JADX INFO: renamed from: b */
    public AspectRatioViewPager f5471b;

    /* JADX INFO: renamed from: c */
    public VPagerCircleIndicator f5472c;

    /* JADX INFO: renamed from: d */
    public C2257b f5473d;

    /* JADX INFO: renamed from: e */
    public List<IntlOperationBanner> f5474e;

    /* JADX INFO: renamed from: f */
    public c4g0 f5475f;

    /* JADX INFO: renamed from: g */
    public int f5476g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.ui.moments.operation.OperationBannerFeedView$a */
    public class C2256a implements ViewPager.j {

        /* JADX INFO: renamed from: a */
        public int f5477a;

        /* JADX INFO: renamed from: b */
        public boolean f5478b;

        public C2256a() {
        }

        public void onPageScrollStateChanged(int i) {
            if (this.f5477a == 1 && i == 2) {
                this.f5478b = true;
            } else if (i == 0) {
                this.f5478b = false;
            }
            this.f5477a = i;
        }

        public void onPageScrolled(int i, float f, int i2) {
        }

        public void onPageSelected(int i) {
            if (this.f5478b && NullChecker.a(OperationBannerFeedView.this.f5475f)) {
                OperationBannerFeedView.this.f5475f.unsubscribe();
            }
            OperationBannerFeedView.this.f5476g = i + 1;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.ui.moments.operation.OperationBannerFeedView$b */
    public class C2257b extends w660 {
        public C2257b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: k */
        public /* synthetic */ void m8304k(IntlOperationBanner intlOperationBanner, View view) {
            if (NullChecker.a(intlOperationBanner)) {
                zvf0.u("e_explore_campaign_banner", "p_moments_view", new j760[]{j760.a("intl_campaign_id", intlOperationBanner.f224id)});
                FeedModule.m1140H().pa(OperationBannerFeedView.this.act(), 1, intlOperationBanner, (IntlOperationArticles) null);
            }
        }

        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        public int getCount() {
            return OperationBannerFeedView.this.f5474e.size();
        }

        public Object instantiateItem(ViewGroup viewGroup, int i) {
            View viewInflate = OperationBannerFeedView.this.act().inflater().inflate(o6c0.f11101O1, (ViewGroup) null);
            VDraweeView vDraweeViewFindViewById = viewInflate.findViewById(b5c0.f6070m0);
            final IntlOperationBanner intlOperationBanner = (IntlOperationBanner) OperationBannerFeedView.this.f5474e.get(i);
            if (NullChecker.a(intlOperationBanner)) {
                qib0.G.L0(vDraweeViewFindViewById, intlOperationBanner.banner.url);
            }
            xdl0.E0(vDraweeViewFindViewById, new View.OnClickListener() { // from class: l.pq50
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f11941a.m8304k(intlOperationBanner, view);
                }
            });
            zvf0.A("e_explore_campaign_banner", "p_moments_view", new j760[]{j760.a("intl_campaign_id", intlOperationBanner.f224id)});
            viewGroup.addView(viewInflate);
            return viewInflate;
        }

        public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
            return view == obj;
        }
    }

    public OperationBannerFeedView(Context context) {
        super(context);
        this.f5474e = new ArrayList();
        this.f5476g = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m8295B(Long l2) {
        int currentItem = this.f5471b.getCurrentItem();
        int count = this.f5473d.getCount() - 1;
        AspectRatioViewPager aspectRatioViewPager = this.f5471b;
        if (currentItem == count) {
            aspectRatioViewPager.T(0, true);
        } else {
            aspectRatioViewPager.T(aspectRatioViewPager.getCurrentItem() + 1, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public Act act() {
        return getContext();
    }

    /* JADX INFO: renamed from: C */
    public void m8301C(Act act, List<IntlOperationBanner> list) {
        this.f5474e = list;
        if (this.f5473d.getCount() > 1) {
            if (NullChecker.a(this.f5475f) && !this.f5475f.isUnsubscribed()) {
                this.f5475f.unsubscribe();
            }
            this.f5475f = act.duringCreated(c.interval(3000L, TimeUnit.MILLISECONDS).onBackpressureLatest().observeOn(jo0.a())).subscribe(mkd0.G(new e30() { // from class: l.oq50
                public final void call(Object obj) {
                    this.f11555a.m8295B((Long) obj);
                }
            }));
            this.f5471b.d(new C2256a());
        }
        int size = this.f5474e.size();
        VPagerCircleIndicator vPagerCircleIndicator = this.f5472c;
        if (size <= 1) {
            xdl0.M0(vPagerCircleIndicator, false);
        } else {
            xdl0.M0(vPagerCircleIndicator, true);
        }
        this.f5473d.notifyDataSetChanged();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8302z(this);
        C2257b c2257b = new C2257b();
        this.f5473d = c2257b;
        this.f5471b.setAdapter(c2257b);
        this.f5471b.setCurrentItem(0);
        VPagerCircleIndicator vPagerCircleIndicator = this.f5472c;
        AspectRatioViewPager aspectRatioViewPager = this.f5471b;
        vPagerCircleIndicator.c(aspectRatioViewPager, aspectRatioViewPager.getCurrentItem());
        this.f5472c.setFillColor(getContext().getResources().getColor(e1c0.f7123V));
    }

    /* JADX INFO: renamed from: z */
    public final void m8302z(View view) {
        qq50.m13693a(this, view);
    }

    public OperationBannerFeedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5474e = new ArrayList();
        this.f5476g = 0;
    }

    public OperationBannerFeedView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5474e = new ArrayList();
        this.f5476g = 0;
    }
}
