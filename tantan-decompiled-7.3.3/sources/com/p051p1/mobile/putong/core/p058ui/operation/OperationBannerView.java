package com.p051p1.mobile.putong.core.p058ui.operation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.viewpager.widget.ViewPager;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.IntlOperationBanner;
import com.p051p1.mobile.putong.p070ui.webview.AccessTokenWebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p151v.AspectRatioViewPager;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VPagerCircleIndicator;
import p153l.adc0;
import p153l.bnl0;
import p153l.c9c0;
import p153l.cf60;
import p153l.fo0;
import p153l.i4g0;
import p153l.jyb;
import p153l.kcg0;
import p153l.kec0;
import p153l.pf60;
import p153l.psd0;
import p153l.uqb0;
import p153l.y20;
import p153l.zy50;

/* JADX INFO: loaded from: classes4.dex */
public class OperationBannerView extends VFrame {

    /* JADX INFO: renamed from: a */
    public CardView f33655a;

    /* JADX INFO: renamed from: b */
    public AspectRatioViewPager f33656b;

    /* JADX INFO: renamed from: c */
    public VPagerCircleIndicator f33657c;

    /* JADX INFO: renamed from: d */
    public C8777b f33658d;

    /* JADX INFO: renamed from: e */
    public List<IntlOperationBanner> f33659e;

    /* JADX INFO: renamed from: f */
    public kcg0 f33660f;

    /* JADX INFO: renamed from: g */
    public int f33661g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.operation.OperationBannerView$a */
    public class C8776a implements ViewPager.InterfaceC0718j {

        /* JADX INFO: renamed from: a */
        public int f33662a;

        /* JADX INFO: renamed from: b */
        public boolean f33663b;

        public C8776a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrollStateChanged(int i) {
            if (this.f33662a == 1 && i == 2) {
                this.f33663b = true;
            } else if (i == 0) {
                this.f33663b = false;
            }
            this.f33662a = i;
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int i) {
            if (this.f33663b && NullChecker.m82486a(OperationBannerView.this.f33660f)) {
                OperationBannerView.this.f33660f.unsubscribe();
            }
            OperationBannerView.this.f33661g = i + 1;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.operation.OperationBannerView$b */
    public class C8777b extends cf60 {
        public C8777b() {
        }

        @Override // p153l.cf60
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // p153l.cf60
        public int getCount() {
            return Math.min(OperationBannerView.this.f33659e.size(), 6);
        }

        @Override // p153l.cf60
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            View viewInflate = OperationBannerView.this.act().inflater().inflate(kec0.f126152y8, (ViewGroup) null);
            VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(adc0.f70031N5);
            final IntlOperationBanner intlOperationBanner = (IntlOperationBanner) OperationBannerView.this.f33659e.get(i);
            if (NullChecker.m82486a(intlOperationBanner)) {
                uqb0.f180374G.m127115L0(vDraweeView, intlOperationBanner.banner.url);
            }
            bnl0.m105509E0(vDraweeView, new View.OnClickListener() { // from class: l.yy50
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f202080a.m51595k(intlOperationBanner, view);
                }
            });
            viewGroup.addView(viewInflate);
            i4g0.m138492A("e_campaign_banner", "p_community_page", pf60.m172085a("intl_campaign_id", intlOperationBanner.f39611id));
            return viewInflate;
        }

        @Override // p153l.cf60
        public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
            return view == obj;
        }

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ void m51595k(IntlOperationBanner intlOperationBanner, View view) {
            if (NullChecker.m82486a(intlOperationBanner)) {
                i4g0.m138523u("e_campaign_banner", "p_community_page", pf60.m172085a("intl_campaign_id", intlOperationBanner.f39611id));
                OperationBannerView.this.getContext().startActivity(AccessTokenWebViewAct.m81333a2(OperationBannerView.this.getContext(), "", intlOperationBanner.jumpUrl));
            }
        }
    }

    public OperationBannerView(Context context) {
        super(context);
        this.f33659e = new ArrayList();
        this.f33661g = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m51586B(Long l2) {
        int currentItem = this.f33656b.getCurrentItem();
        int count = this.f33658d.getCount() - 1;
        AspectRatioViewPager aspectRatioViewPager = this.f33656b;
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
    public void m51592C(Act act, List<IntlOperationBanner> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        this.f33659e = list;
        if (this.f33658d.getCount() > 1) {
            if (NullChecker.m82486a(this.f33660f) && !this.f33660f.isUnsubscribed()) {
                this.f33660f.unsubscribe();
            }
            this.f33660f = act.duringCreated(C22421c.interval(3000L, TimeUnit.MILLISECONDS).onBackpressureLatest().observeOn(fo0.m126432a())).subscribe(psd0.m173596G(new y20() { // from class: l.xy50
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f196717a.m51586B((Long) obj);
                }
            }));
            this.f33656b.m4187d(new C8776a());
        }
        int size = this.f33659e.size();
        VPagerCircleIndicator vPagerCircleIndicator = this.f33657c;
        if (size <= 1) {
            bnl0.m105525M0(vPagerCircleIndicator, false);
        } else {
            bnl0.m105525M0(vPagerCircleIndicator, true);
        }
        this.f33658d.notifyDataSetChanged();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m51593z(this);
        C8777b c8777b = new C8777b();
        this.f33658d = c8777b;
        this.f33656b.setAdapter(c8777b);
        this.f33656b.setCurrentItem(0);
        VPagerCircleIndicator vPagerCircleIndicator = this.f33657c;
        AspectRatioViewPager aspectRatioViewPager = this.f33656b;
        vPagerCircleIndicator.m224389c(aspectRatioViewPager, aspectRatioViewPager.getCurrentItem());
        this.f33657c.setFillColor(getContext().getResources().getColor(c9c0.f80477z1));
    }

    /* JADX INFO: renamed from: z */
    public final void m51593z(View view) {
        zy50.m222106a(this, view);
    }

    public OperationBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33659e = new ArrayList();
        this.f33661g = 0;
    }

    public OperationBannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f33659e = new ArrayList();
        this.f33661g = 0;
    }
}
