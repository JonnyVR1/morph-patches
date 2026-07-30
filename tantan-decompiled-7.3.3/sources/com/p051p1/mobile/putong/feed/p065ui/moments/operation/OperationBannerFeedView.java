package com.p051p1.mobile.putong.feed.p065ui.moments.operation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.viewpager.widget.ViewPager;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.IntlOperationBanner;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p151v.AspectRatioViewPager;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VPagerCircleIndicator;
import p153l.bnl0;
import p153l.cf60;
import p153l.fo0;
import p153l.hdc0;
import p153l.i4g0;
import p153l.k9c0;
import p153l.kcg0;
import p153l.pf60;
import p153l.psd0;
import p153l.tec0;
import p153l.uqb0;
import p153l.wy50;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class OperationBannerFeedView extends VFrame {

    /* JADX INFO: renamed from: a */
    public CardView f44857a;

    /* JADX INFO: renamed from: b */
    public AspectRatioViewPager f44858b;

    /* JADX INFO: renamed from: c */
    public VPagerCircleIndicator f44859c;

    /* JADX INFO: renamed from: d */
    public C11576b f44860d;

    /* JADX INFO: renamed from: e */
    public List<IntlOperationBanner> f44861e;

    /* JADX INFO: renamed from: f */
    public kcg0 f44862f;

    /* JADX INFO: renamed from: g */
    public int f44863g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.ui.moments.operation.OperationBannerFeedView$a */
    public class C11575a implements ViewPager.InterfaceC0718j {

        /* JADX INFO: renamed from: a */
        public int f44864a;

        /* JADX INFO: renamed from: b */
        public boolean f44865b;

        public C11575a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrollStateChanged(int i) {
            if (this.f44864a == 1 && i == 2) {
                this.f44865b = true;
            } else if (i == 0) {
                this.f44865b = false;
            }
            this.f44864a = i;
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int i) {
            if (this.f44865b && NullChecker.m82486a(OperationBannerFeedView.this.f44862f)) {
                OperationBannerFeedView.this.f44862f.unsubscribe();
            }
            OperationBannerFeedView.this.f44863g = i + 1;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.ui.moments.operation.OperationBannerFeedView$b */
    public class C11576b extends cf60 {
        public C11576b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: k */
        public /* synthetic */ void m68280k(IntlOperationBanner intlOperationBanner, View view) {
            if (NullChecker.m82486a(intlOperationBanner)) {
                i4g0.m138523u("e_explore_campaign_banner", "p_moments_view", pf60.m172085a("intl_campaign_id", intlOperationBanner.f39611id));
                FeedModule.m61406H().mo31807pa(OperationBannerFeedView.this.act(), 1, intlOperationBanner, null);
            }
        }

        @Override // p153l.cf60
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // p153l.cf60
        public int getCount() {
            return OperationBannerFeedView.this.f44861e.size();
        }

        @Override // p153l.cf60
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            View viewInflate = OperationBannerFeedView.this.act().inflater().inflate(tec0.f173551O1, (ViewGroup) null);
            VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(hdc0.f108942m0);
            final IntlOperationBanner intlOperationBanner = (IntlOperationBanner) OperationBannerFeedView.this.f44861e.get(i);
            if (NullChecker.m82486a(intlOperationBanner)) {
                uqb0.f180374G.m127115L0(vDraweeView, intlOperationBanner.banner.url);
            }
            bnl0.m105509E0(vDraweeView, new View.OnClickListener() { // from class: l.vy50
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f186339a.m68280k(intlOperationBanner, view);
                }
            });
            i4g0.m138492A("e_explore_campaign_banner", "p_moments_view", pf60.m172085a("intl_campaign_id", intlOperationBanner.f39611id));
            viewGroup.addView(viewInflate);
            return viewInflate;
        }

        @Override // p153l.cf60
        public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
            return view == obj;
        }
    }

    public OperationBannerFeedView(Context context) {
        super(context);
        this.f44861e = new ArrayList();
        this.f44863g = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m68271B(Long l2) {
        int currentItem = this.f44858b.getCurrentItem();
        int count = this.f44860d.getCount() - 1;
        AspectRatioViewPager aspectRatioViewPager = this.f44858b;
        if (currentItem == count) {
            aspectRatioViewPager.m4178T(0, true);
        } else {
            aspectRatioViewPager.m4178T(aspectRatioViewPager.getCurrentItem() + 1, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Act act() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: C */
    public void m68277C(Act act, List<IntlOperationBanner> list) {
        this.f44861e = list;
        if (this.f44860d.getCount() > 1) {
            if (NullChecker.m82486a(this.f44862f) && !this.f44862f.isUnsubscribed()) {
                this.f44862f.unsubscribe();
            }
            this.f44862f = act.duringCreated(C22421c.interval(3000L, TimeUnit.MILLISECONDS).onBackpressureLatest().observeOn(fo0.m126432a())).subscribe(psd0.m173596G(new y20() { // from class: l.uy50
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f181539a.m68271B((Long) obj);
                }
            }));
            this.f44858b.m4187d(new C11575a());
        }
        int size = this.f44861e.size();
        VPagerCircleIndicator vPagerCircleIndicator = this.f44859c;
        if (size <= 1) {
            bnl0.m105525M0(vPagerCircleIndicator, false);
        } else {
            bnl0.m105525M0(vPagerCircleIndicator, true);
        }
        this.f44860d.notifyDataSetChanged();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m68278z(this);
        C11576b c11576b = new C11576b();
        this.f44860d = c11576b;
        this.f44858b.setAdapter(c11576b);
        this.f44858b.setCurrentItem(0);
        VPagerCircleIndicator vPagerCircleIndicator = this.f44859c;
        AspectRatioViewPager aspectRatioViewPager = this.f44858b;
        vPagerCircleIndicator.m224389c(aspectRatioViewPager, aspectRatioViewPager.getCurrentItem());
        this.f44859c.setFillColor(getContext().getResources().getColor(k9c0.f124490V));
    }

    /* JADX INFO: renamed from: z */
    public final void m68278z(View view) {
        wy50.m208477a(this, view);
    }

    public OperationBannerFeedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44861e = new ArrayList();
        this.f44863g = 0;
    }

    public OperationBannerFeedView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f44861e = new ArrayList();
        this.f44863g = 0;
    }
}
