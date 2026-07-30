package com.p046p1.mobile.putong.feed.newui.specialevents.christmas;

import android.content.Context;
import android.graphics.Outline;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Material;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.p101mm.opensdk.constants.ConstantsAPI;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p147v.VDraweeView;
import p147v.VPager;
import p147v.VPagerCircleIndicator;
import p149l.b5c0;
import p149l.c4g0;
import p149l.cxh;
import p149l.e1c0;
import p149l.e30;
import p149l.jo0;
import p149l.mkd0;
import p149l.o6c0;
import p149l.qib0;
import p149l.t100;
import p149l.uog;
import p149l.vqg;
import p149l.vwb;
import p149l.w660;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedBannersView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f42699a;

    /* JADX INFO: renamed from: b */
    public VPager f42700b;

    /* JADX INFO: renamed from: c */
    public VPagerCircleIndicator f42701c;

    /* JADX INFO: renamed from: d */
    public C11329c f42702d;

    /* JADX INFO: renamed from: e */
    public String f42703e;

    /* JADX INFO: renamed from: f */
    public c4g0 f42704f;

    /* JADX INFO: renamed from: g */
    public List<Material> f42705g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.specialevents.christmas.FeedBannersView$a */
    public class C11327a extends ViewOutlineProvider {
        public C11327a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), t100.m186890d(10.0f));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.specialevents.christmas.FeedBannersView$b */
    public class C11328b implements ViewPager.InterfaceC0716j {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f42707a;

        public C11328b(String str) {
            this.f42707a = str;
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int i) {
            FeedBannersView.this.m65460i(i, this.f42707a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.specialevents.christmas.FeedBannersView$c */
    public class C11329c extends w660 {

        /* JADX INFO: renamed from: a */
        public List<Material> f42709a = new ArrayList();

        public C11329c() {
        }

        @Override // p149l.w660
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // p149l.w660
        public int getCount() {
            List<Material> list = this.f42709a;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        @Override // p149l.w660
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            View viewInflate = FeedBannersView.this.m65456e().inflater().inflate(o6c0.f142068M, (ViewGroup) null);
            VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(b5c0.f73589m0);
            final Material material = this.f42709a.get(i);
            if (NullChecker.m81303a(material)) {
                qib0.f154691G.m102331L0(vDraweeView, material.picture.identifier);
            }
            vDraweeView.setOnClickListener(new View.OnClickListener() { // from class: l.tog
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f171364a.m65463k(material, view);
                }
            });
            viewGroup.addView(viewInflate);
            return viewInflate;
        }

        @Override // p149l.w660
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ void m65463k(Material material, View view) {
            if (NullChecker.m81303a(material)) {
                zvf0.m220399u("e_moment_activity_banner", vqg.m199515K(FeedBannersView.this.f42703e, false), vwb.m200311Y(ConstantsAPI.WXWebPage.KEY_ACTIVITY_ID, material.resourceID));
                String str = material.deeplink;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                cxh.m109100b(FeedBannersView.this.m65456e(), Uri.parse(str));
            }
        }

        /* JADX INFO: renamed from: l */
        public void m65464l(List<Material> list) {
            this.f42709a = list;
            notifyDataSetChanged();
        }
    }

    public FeedBannersView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f42705g = new ArrayList();
        m65457f(context, null);
    }

    /* JADX INFO: renamed from: d */
    public View m65455d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return uog.m194553b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: e */
    public final Act m65456e() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: f */
    public final void m65457f(Context context, String str) {
        this.f42703e = str;
        addView(m65455d(LayoutInflater.from(context), this));
        this.f42702d = new C11329c();
        m65461j(str);
        this.f42700b.setAdapter(this.f42702d);
        VPagerCircleIndicator vPagerCircleIndicator = this.f42701c;
        VPager vPager = this.f42700b;
        vPagerCircleIndicator.m223143c(vPager, vPager.getCurrentItem());
        this.f42701c.setFillColor(((Act) context).color(e1c0.f88803p0));
        this.f42701c.setPageColor(getResources().getColor(e1c0.f88809v));
        this.f42700b.setCurrentItem(0);
        this.f42700b.setOffscreenPageLimit(2);
        this.f42700b.setOutlineProvider(new C11327a());
        this.f42700b.setClipToOutline(true);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m65458g(Long l2) {
        int currentItem = this.f42700b.getCurrentItem();
        int count = this.f42702d.getCount() - 1;
        VPager vPager = this.f42700b;
        if (currentItem == count) {
            vPager.m4176T(0, true);
        } else {
            vPager.m4176T(vPager.getCurrentItem() + 1, true);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m65459h(Act act, List<Material> list, long j) {
        this.f42705g = list;
        this.f42702d.m65464l(list);
        m65460i(0, this.f42703e);
        if (this.f42702d.getCount() > 1 && j != 0) {
            if (NullChecker.m81303a(this.f42704f) && this.f42704f.isUnsubscribed()) {
                this.f42704f.unsubscribe();
            }
            this.f42704f = act.duringCreated(C22306c.interval(j * 1000, TimeUnit.MILLISECONDS).onBackpressureLatest().observeOn(jo0.m142408a())).subscribe(mkd0.m154955G(new e30() { // from class: l.sog
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f165674a.m65458g((Long) obj);
                }
            }));
        }
        int size = list.size();
        VPagerCircleIndicator vPagerCircleIndicator = this.f42701c;
        if (size <= 1) {
            xdl0.m208345M0(vPagerCircleIndicator, false);
        } else {
            xdl0.m208345M0(vPagerCircleIndicator, true);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m65460i(int i, String str) {
        if (this.f42705g.size() > i) {
            zvf0.m220368A("e_moment_activity_banner", vqg.m199515K(str, false), vwb.m200311Y(ConstantsAPI.WXWebPage.KEY_ACTIVITY_ID, this.f42705g.get(i).resourceID));
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m65461j(String str) {
        this.f42700b.m4185d(new C11328b(str));
    }

    public FeedBannersView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
        m65457f(context, null);
    }

    public FeedBannersView(@NonNull Context context, String str) {
        this(context, null, -1);
        m65457f(context, str);
    }
}
