package com.p051p1.mobile.putong.feed.newui.specialevents.christmas;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Material;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.p106mm.opensdk.constants.ConstantsAPI;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p151v.VDraweeView;
import p151v.VPager;
import p151v.VPagerCircleIndicator;
import p153l.bnl0;
import p153l.cf60;
import p153l.fo0;
import p153l.hdc0;
import p153l.i4g0;
import p153l.jqg;
import p153l.jyb;
import p153l.k9c0;
import p153l.kcg0;
import p153l.ksg;
import p153l.psd0;
import p153l.qa00;
import p153l.ryh;
import p153l.tec0;
import p153l.uqb0;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class FeedBannersView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f43547a;

    /* JADX INFO: renamed from: b */
    public VPager f43548b;

    /* JADX INFO: renamed from: c */
    public VPagerCircleIndicator f43549c;

    /* JADX INFO: renamed from: d */
    public C11492c f43550d;

    /* JADX INFO: renamed from: e */
    public String f43551e;

    /* JADX INFO: renamed from: f */
    public kcg0 f43552f;

    /* JADX INFO: renamed from: g */
    public List<Material> f43553g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.specialevents.christmas.FeedBannersView$a */
    public class C11490a extends ViewOutlineProvider {
        public C11490a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), qa00.m175859d(10.0f));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.specialevents.christmas.FeedBannersView$b */
    public class C11491b implements ViewPager.InterfaceC0718j {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f43555a;

        public C11491b(String str) {
            this.f43555a = str;
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int i) {
            FeedBannersView.this.m66643i(i, this.f43555a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.specialevents.christmas.FeedBannersView$c */
    public class C11492c extends cf60 {

        /* JADX INFO: renamed from: a */
        public List<Material> f43557a = new ArrayList();

        public C11492c() {
        }

        @Override // p153l.cf60
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // p153l.cf60
        public int getCount() {
            List<Material> list = this.f43557a;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        @Override // p153l.cf60
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            View viewInflate = FeedBannersView.this.m66639e().inflater().inflate(tec0.f173537M, (ViewGroup) null);
            VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(hdc0.f108942m0);
            final Material material = this.f43557a.get(i);
            if (NullChecker.m82486a(material)) {
                uqb0.f180374G.m127115L0(vDraweeView, material.picture.identifier);
            }
            vDraweeView.setOnClickListener(new View.OnClickListener() { // from class: l.iqg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f116412a.m66646k(material, view);
                }
            });
            viewGroup.addView(viewInflate);
            return viewInflate;
        }

        @Override // p153l.cf60
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ void m66646k(Material material, View view) {
            if (NullChecker.m82486a(material)) {
                i4g0.m138523u("e_moment_activity_banner", ksg.m151174K(FeedBannersView.this.f43551e, false), jyb.m147494Y(ConstantsAPI.WXWebPage.KEY_ACTIVITY_ID, material.resourceID));
                String str = material.deeplink;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                ryh.m183607b(FeedBannersView.this.m66639e(), Uri.parse(str));
            }
        }

        /* JADX INFO: renamed from: l */
        public void m66647l(List<Material> list) {
            this.f43557a = list;
            notifyDataSetChanged();
        }
    }

    public FeedBannersView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f43553g = new ArrayList();
        m66640f(context, null);
    }

    /* JADX INFO: renamed from: d */
    public View m66638d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return jqg.m146580b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: e */
    public final Act m66639e() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: f */
    public final void m66640f(Context context, String str) {
        this.f43551e = str;
        addView(m66638d(LayoutInflater.from(context), this));
        this.f43550d = new C11492c();
        m66644j(str);
        this.f43548b.setAdapter(this.f43550d);
        VPagerCircleIndicator vPagerCircleIndicator = this.f43549c;
        VPager vPager = this.f43548b;
        vPagerCircleIndicator.m224389c(vPager, vPager.getCurrentItem());
        this.f43549c.setFillColor(((Act) context).color(k9c0.f124526p0));
        this.f43549c.setPageColor(getResources().getColor(k9c0.f124532v));
        this.f43548b.setCurrentItem(0);
        this.f43548b.setOffscreenPageLimit(2);
        this.f43548b.setOutlineProvider(new C11490a());
        this.f43548b.setClipToOutline(true);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m66641g(Long l2) {
        int currentItem = this.f43548b.getCurrentItem();
        int count = this.f43550d.getCount() - 1;
        VPager vPager = this.f43548b;
        if (currentItem == count) {
            vPager.m4178T(0, true);
        } else {
            vPager.m4178T(vPager.getCurrentItem() + 1, true);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m66642h(Act act, List<Material> list, long j) {
        this.f43553g = list;
        this.f43550d.m66647l(list);
        m66643i(0, this.f43551e);
        if (this.f43550d.getCount() > 1 && j != 0) {
            if (NullChecker.m82486a(this.f43552f) && this.f43552f.isUnsubscribed()) {
                this.f43552f.unsubscribe();
            }
            this.f43552f = act.duringCreated(C22421c.interval(j * 1000, TimeUnit.MILLISECONDS).onBackpressureLatest().observeOn(fo0.m126432a())).subscribe(psd0.m173596G(new y20() { // from class: l.hqg
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f111125a.m66641g((Long) obj);
                }
            }));
        }
        int size = list.size();
        VPagerCircleIndicator vPagerCircleIndicator = this.f43549c;
        if (size <= 1) {
            bnl0.m105525M0(vPagerCircleIndicator, false);
        } else {
            bnl0.m105525M0(vPagerCircleIndicator, true);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m66643i(int i, String str) {
        if (this.f43553g.size() > i) {
            i4g0.m138492A("e_moment_activity_banner", ksg.m151174K(str, false), jyb.m147494Y(ConstantsAPI.WXWebPage.KEY_ACTIVITY_ID, this.f43553g.get(i).resourceID));
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m66644j(String str) {
        this.f43548b.m4187d(new C11491b(str));
    }

    public FeedBannersView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
        m66640f(context, null);
    }

    public FeedBannersView(@NonNull Context context, String str) {
        this(context, null, -1);
        m66640f(context, str);
    }
}
