package com.p046p1.mobile.putong.core.p053ui.operation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.viewpager.widget.ViewPager;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.IntlOperationBanner;
import com.p046p1.mobile.putong.p065ui.webview.AccessTokenWebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p147v.AspectRatioViewPager;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VPagerCircleIndicator;
import p149l.c4g0;
import p149l.e30;
import p149l.f6c0;
import p149l.j760;
import p149l.jo0;
import p149l.mkd0;
import p149l.qib0;
import p149l.tq50;
import p149l.u4c0;
import p149l.vwb;
import p149l.w0c0;
import p149l.w660;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes4.dex */
public class OperationBannerView extends VFrame {

    /* JADX INFO: renamed from: a */
    public CardView f32807a;

    /* JADX INFO: renamed from: b */
    public AspectRatioViewPager f32808b;

    /* JADX INFO: renamed from: c */
    public VPagerCircleIndicator f32809c;

    /* JADX INFO: renamed from: d */
    public C8614b f32810d;

    /* JADX INFO: renamed from: e */
    public List<IntlOperationBanner> f32811e;

    /* JADX INFO: renamed from: f */
    public c4g0 f32812f;

    /* JADX INFO: renamed from: g */
    public int f32813g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.operation.OperationBannerView$a */
    public class C8613a implements ViewPager.InterfaceC0716j {

        /* JADX INFO: renamed from: a */
        public int f32814a;

        /* JADX INFO: renamed from: b */
        public boolean f32815b;

        public C8613a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrollStateChanged(int i) {
            if (this.f32814a == 1 && i == 2) {
                this.f32815b = true;
            } else if (i == 0) {
                this.f32815b = false;
            }
            this.f32814a = i;
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int i) {
            if (this.f32815b && NullChecker.m81303a(OperationBannerView.this.f32812f)) {
                OperationBannerView.this.f32812f.unsubscribe();
            }
            OperationBannerView.this.f32813g = i + 1;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.operation.OperationBannerView$b */
    public class C8614b extends w660 {
        public C8614b() {
        }

        @Override // p149l.w660
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // p149l.w660
        public int getCount() {
            return Math.min(OperationBannerView.this.f32811e.size(), 6);
        }

        @Override // p149l.w660
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            View viewInflate = OperationBannerView.this.act().inflater().inflate(f6c0.f95979r8, (ViewGroup) null);
            VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(u4c0.f173909L5);
            final IntlOperationBanner intlOperationBanner = (IntlOperationBanner) OperationBannerView.this.f32811e.get(i);
            if (NullChecker.m81303a(intlOperationBanner)) {
                qib0.f154691G.m102331L0(vDraweeView, intlOperationBanner.banner.url);
            }
            xdl0.m208329E0(vDraweeView, new View.OnClickListener() { // from class: l.sq50
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f165940a.m50412k(intlOperationBanner, view);
                }
            });
            viewGroup.addView(viewInflate);
            zvf0.m220368A("e_campaign_banner", "p_community_page", j760.m140076a("intl_campaign_id", intlOperationBanner.f38763id));
            return viewInflate;
        }

        @Override // p149l.w660
        public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
            return view == obj;
        }

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ void m50412k(IntlOperationBanner intlOperationBanner, View view) {
            if (NullChecker.m81303a(intlOperationBanner)) {
                zvf0.m220399u("e_campaign_banner", "p_community_page", j760.m140076a("intl_campaign_id", intlOperationBanner.f38763id));
                OperationBannerView.this.getContext().startActivity(AccessTokenWebViewAct.m80150Z1(OperationBannerView.this.getContext(), "", intlOperationBanner.jumpUrl));
            }
        }
    }

    public OperationBannerView(Context context) {
        super(context);
        this.f32811e = new ArrayList();
        this.f32813g = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m50403B(Long l2) {
        int currentItem = this.f32808b.getCurrentItem();
        int count = this.f32810d.getCount() - 1;
        AspectRatioViewPager aspectRatioViewPager = this.f32808b;
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
    public void m50409C(Act act, List<IntlOperationBanner> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        this.f32811e = list;
        if (this.f32810d.getCount() > 1) {
            if (NullChecker.m81303a(this.f32812f) && !this.f32812f.isUnsubscribed()) {
                this.f32812f.unsubscribe();
            }
            this.f32812f = act.duringCreated(C22306c.interval(3000L, TimeUnit.MILLISECONDS).onBackpressureLatest().observeOn(jo0.m142408a())).subscribe(mkd0.m154955G(new e30() { // from class: l.rq50
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f160590a.m50403B((Long) obj);
                }
            }));
            this.f32808b.m4185d(new C8613a());
        }
        int size = this.f32811e.size();
        VPagerCircleIndicator vPagerCircleIndicator = this.f32809c;
        if (size <= 1) {
            xdl0.m208345M0(vPagerCircleIndicator, false);
        } else {
            xdl0.m208345M0(vPagerCircleIndicator, true);
        }
        this.f32810d.notifyDataSetChanged();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m50410z(this);
        C8614b c8614b = new C8614b();
        this.f32810d = c8614b;
        this.f32808b.setAdapter(c8614b);
        this.f32808b.setCurrentItem(0);
        VPagerCircleIndicator vPagerCircleIndicator = this.f32809c;
        AspectRatioViewPager aspectRatioViewPager = this.f32808b;
        vPagerCircleIndicator.m223143c(aspectRatioViewPager, aspectRatioViewPager.getCurrentItem());
        this.f32809c.setFillColor(getContext().getResources().getColor(w0c0.f183904y1));
    }

    /* JADX INFO: renamed from: z */
    public final void m50410z(View view) {
        tq50.m190085a(this, view);
    }

    public OperationBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32811e = new ArrayList();
        this.f32813g = 0;
    }

    public OperationBannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32811e = new ArrayList();
        this.f32813g = 0;
    }
}
