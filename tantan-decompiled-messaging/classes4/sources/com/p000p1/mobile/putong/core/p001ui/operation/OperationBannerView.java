package com.p000p1.mobile.putong.core.p001ui.operation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.viewpager.widget.ViewPager;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.IntlOperationBanner;
import com.p1.mobile.putong.ui.webview.AccessTokenWebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import l.c4g0;
import l.e30;
import l.f6c0;
import l.j760;
import l.jo0;
import l.mkd0;
import l.qib0;
import l.tq50;
import l.u4c0;
import l.vwb;
import l.w0c0;
import l.w660;
import l.xdl0;
import l.zvf0;
import rx.c;
import v.AspectRatioViewPager;
import v.VDraweeView;
import v.VFrame;
import v.VPagerCircleIndicator;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class OperationBannerView extends VFrame {

    /* JADX INFO: renamed from: a */
    public CardView f629a;

    /* JADX INFO: renamed from: b */
    public AspectRatioViewPager f630b;

    /* JADX INFO: renamed from: c */
    public VPagerCircleIndicator f631c;

    /* JADX INFO: renamed from: d */
    public C0039b f632d;

    /* JADX INFO: renamed from: e */
    public List<IntlOperationBanner> f633e;

    /* JADX INFO: renamed from: f */
    public c4g0 f634f;

    /* JADX INFO: renamed from: g */
    public int f635g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.operation.OperationBannerView$a */
    public class C0038a implements ViewPager.j {

        /* JADX INFO: renamed from: a */
        public int f636a;

        /* JADX INFO: renamed from: b */
        public boolean f637b;

        public C0038a() {
        }

        public void onPageScrollStateChanged(int i) {
            if (this.f636a == 1 && i == 2) {
                this.f637b = true;
            } else if (i == 0) {
                this.f637b = false;
            }
            this.f636a = i;
        }

        public void onPageScrolled(int i, float f, int i2) {
        }

        public void onPageSelected(int i) {
            if (this.f637b && NullChecker.a(OperationBannerView.this.f634f)) {
                OperationBannerView.this.f634f.unsubscribe();
            }
            OperationBannerView.this.f635g = i + 1;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.operation.OperationBannerView$b */
    public class C0039b extends w660 {
        public C0039b() {
        }

        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        public int getCount() {
            return Math.min(OperationBannerView.this.f633e.size(), 6);
        }

        public Object instantiateItem(ViewGroup viewGroup, int i) {
            View viewInflate = OperationBannerView.this.act().inflater().inflate(f6c0.r8, (ViewGroup) null);
            VDraweeView vDraweeViewFindViewById = viewInflate.findViewById(u4c0.L5);
            final IntlOperationBanner intlOperationBanner = (IntlOperationBanner) OperationBannerView.this.f633e.get(i);
            if (NullChecker.a(intlOperationBanner)) {
                qib0.G.L0(vDraweeViewFindViewById, intlOperationBanner.banner.url);
            }
            xdl0.E0(vDraweeViewFindViewById, new View.OnClickListener() { // from class: l.sq50
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f19253a.m845k(intlOperationBanner, view);
                }
            });
            viewGroup.addView(viewInflate);
            zvf0.A("e_campaign_banner", "p_community_page", new j760[]{j760.a("intl_campaign_id", intlOperationBanner.id)});
            return viewInflate;
        }

        public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
            return view == obj;
        }

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ void m845k(IntlOperationBanner intlOperationBanner, View view) {
            if (NullChecker.a(intlOperationBanner)) {
                zvf0.u("e_campaign_banner", "p_community_page", new j760[]{j760.a("intl_campaign_id", intlOperationBanner.id)});
                OperationBannerView.this.getContext().startActivity(AccessTokenWebViewAct.Z1(OperationBannerView.this.getContext(), "", intlOperationBanner.jumpUrl));
            }
        }
    }

    public OperationBannerView(Context context) {
        super(context);
        this.f633e = new ArrayList();
        this.f635g = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m836B(Long l2) {
        int currentItem = this.f630b.getCurrentItem();
        int count = this.f632d.getCount() - 1;
        AspectRatioViewPager aspectRatioViewPager = this.f630b;
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
    public void m842C(Act act, List<IntlOperationBanner> list) {
        if (vwb.J(list)) {
            return;
        }
        this.f633e = list;
        if (this.f632d.getCount() > 1) {
            if (NullChecker.a(this.f634f) && !this.f634f.isUnsubscribed()) {
                this.f634f.unsubscribe();
            }
            this.f634f = act.duringCreated(c.interval(3000L, TimeUnit.MILLISECONDS).onBackpressureLatest().observeOn(jo0.a())).subscribe(mkd0.G(new e30() { // from class: l.rq50
                public final void call(Object obj) {
                    this.f18641a.m836B((Long) obj);
                }
            }));
            this.f630b.d(new C0038a());
        }
        int size = this.f633e.size();
        VPagerCircleIndicator vPagerCircleIndicator = this.f631c;
        if (size <= 1) {
            xdl0.M0(vPagerCircleIndicator, false);
        } else {
            xdl0.M0(vPagerCircleIndicator, true);
        }
        this.f632d.notifyDataSetChanged();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m843z(this);
        C0039b c0039b = new C0039b();
        this.f632d = c0039b;
        this.f630b.setAdapter(c0039b);
        this.f630b.setCurrentItem(0);
        VPagerCircleIndicator vPagerCircleIndicator = this.f631c;
        AspectRatioViewPager aspectRatioViewPager = this.f630b;
        vPagerCircleIndicator.c(aspectRatioViewPager, aspectRatioViewPager.getCurrentItem());
        this.f631c.setFillColor(getContext().getResources().getColor(w0c0.y1));
    }

    /* JADX INFO: renamed from: z */
    public final void m843z(View view) {
        tq50.a(this, view);
    }

    public OperationBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f633e = new ArrayList();
        this.f635g = 0;
    }

    public OperationBannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f633e = new ArrayList();
        this.f635g = 0;
    }
}
