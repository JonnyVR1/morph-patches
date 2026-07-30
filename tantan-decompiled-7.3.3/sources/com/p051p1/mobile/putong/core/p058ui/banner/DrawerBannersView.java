package com.p051p1.mobile.putong.core.p058ui.banner;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.BannerScroll;
import com.p051p1.mobile.putong.data.Banners;
import com.p051p1.mobile.putong.data.BannersItem;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p151v.AspectRatioViewPager;
import p151v.VCard;
import p151v.VDraweeView;
import p151v.VPagerCircleIndicator;
import p153l.adc0;
import p153l.bnl0;
import p153l.c9c0;
import p153l.cf60;
import p153l.fo0;
import p153l.kcg0;
import p153l.kec0;
import p153l.mge;
import p153l.psd0;
import p153l.rde;
import p153l.xwa;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
public class DrawerBannersView extends VCard {

    /* JADX INFO: renamed from: a */
    public DrawerBannersView f29326a;

    /* JADX INFO: renamed from: b */
    public AspectRatioViewPager f29327b;

    /* JADX INFO: renamed from: c */
    public VPagerCircleIndicator f29328c;

    /* JADX INFO: renamed from: d */
    public C8455b f29329d;

    /* JADX INFO: renamed from: e */
    public Banners f29330e;

    /* JADX INFO: renamed from: f */
    public y20<Integer> f29331f;

    /* JADX INFO: renamed from: g */
    public kcg0 f29332g;

    /* JADX INFO: renamed from: h */
    public int f29333h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.banner.DrawerBannersView$a */
    public class C8454a implements ViewPager.InterfaceC0718j {

        /* JADX INFO: renamed from: a */
        public int f29334a;

        /* JADX INFO: renamed from: b */
        public boolean f29335b;

        public C8454a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrollStateChanged(int i) {
            if (this.f29334a == 1 && i == 2) {
                this.f29335b = true;
            } else if (i == 0) {
                this.f29335b = false;
            }
            this.f29334a = i;
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int i) {
            if (this.f29335b && NullChecker.m82486a(DrawerBannersView.this.f29332g)) {
                DrawerBannersView.this.f29332g.unsubscribe();
            }
            DrawerBannersView.this.f29333h = i + 1;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.banner.DrawerBannersView$b */
    public class C8455b extends cf60 {
        public C8455b() {
        }

        @Override // p153l.cf60
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // p153l.cf60
        public int getCount() {
            if (DrawerBannersView.this.f29330e == null) {
                return 0;
            }
            return DrawerBannersView.this.f29330e.content.banners.size();
        }

        @Override // p153l.cf60
        public Object instantiateItem(ViewGroup viewGroup, final int i) {
            View viewInflate = DrawerBannersView.this.m45526m().inflater().inflate(kec0.f125937le, (ViewGroup) null);
            VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(adc0.f70031N5);
            final BannersItem bannersItem = DrawerBannersView.this.f29330e.content.banners.get(i);
            if (NullChecker.m82486a(bannersItem)) {
                vDraweeView.setImageURI(BannerUrlLoader.m45517b(bannersItem.banner, BannerUrlLoader.BannerType.drawer, DrawerBannersView.this.f29326a));
            }
            vDraweeView.setOnClickListener(new View.OnClickListener() { // from class: l.qde
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f156715a.m45531k(i, bannersItem, view);
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
        public final /* synthetic */ void m45531k(int i, BannersItem bannersItem, View view) {
            if (NullChecker.m82486a(DrawerBannersView.this.f29331f)) {
                DrawerBannersView.this.f29331f.call(Integer.valueOf(i + 1));
            }
            if (NullChecker.m82486a(bannersItem)) {
                mge.m158199o().m158202l(DrawerBannersView.this.f29330e, true);
                mge.m158199o().m158208s(DrawerBannersView.this.f29330e.loc, DrawerBannersView.this.f29330e, DrawerBannersView.this.f29333h);
                if (TextUtils.isEmpty(bannersItem.url)) {
                    return;
                }
                if (bannersItem.url.startsWith("tantanapp") || bannersItem.url.startsWith("tantantribe")) {
                    xwa.m213304D(DrawerBannersView.this.m45526m(), Uri.parse(bannersItem.url));
                    return;
                }
                xwa.m213304D(DrawerBannersView.this.m45526m(), Uri.parse("tantanapp://webview?url=" + bannersItem.url));
            }
        }
    }

    public DrawerBannersView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f29333h = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public Act m45526m() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: l */
    public final void m45527l(View view) {
        rde.m180846a(this, view);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m45528n(Long l2) {
        int currentItem = this.f29327b.getCurrentItem();
        int count = this.f29329d.getCount() - 1;
        AspectRatioViewPager aspectRatioViewPager = this.f29327b;
        if (currentItem == count) {
            aspectRatioViewPager.m4178T(0, true);
        } else {
            aspectRatioViewPager.m4178T(aspectRatioViewPager.getCurrentItem() + 1, true);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m45529o(Act act, Banners banners) {
        this.f29330e = banners;
        if (this.f29329d.getCount() > 1) {
            BannerScroll bannerScroll = banners.action.scroll;
            if (bannerScroll.auto && bannerScroll.interval > 0.0f) {
                if (NullChecker.m82486a(this.f29332g) && this.f29332g.isUnsubscribed()) {
                    this.f29332g.unsubscribe();
                }
                this.f29332g = act.duringCreated(C22421c.interval((long) (banners.action.scroll.interval * 1000.0f), TimeUnit.MILLISECONDS).onBackpressureLatest().observeOn(fo0.m126432a())).subscribe(psd0.m173596G(new y20() { // from class: l.pde
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f151745a.m45528n((Long) obj);
                    }
                }));
                this.f29327b.m4187d(new C8454a());
            }
        }
        int size = this.f29330e.content.banners.size();
        VPagerCircleIndicator vPagerCircleIndicator = this.f29328c;
        if (size <= 1) {
            bnl0.m105525M0(vPagerCircleIndicator, false);
        } else {
            bnl0.m105525M0(vPagerCircleIndicator, true);
        }
        this.f29329d.notifyDataSetChanged();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m45527l(this);
        C8455b c8455b = new C8455b();
        this.f29329d = c8455b;
        this.f29327b.setAdapter(c8455b);
        this.f29327b.setCurrentItem(0);
        VPagerCircleIndicator vPagerCircleIndicator = this.f29328c;
        AspectRatioViewPager aspectRatioViewPager = this.f29327b;
        vPagerCircleIndicator.m224389c(aspectRatioViewPager, aspectRatioViewPager.getCurrentItem());
        this.f29328c.setFillColor(m45526m().color(c9c0.f80477z1));
    }

    public void setClickAction(y20<Integer> y20Var) {
        this.f29331f = y20Var;
        if (NullChecker.m82486a(this.f29329d)) {
            this.f29329d.notifyDataSetChanged();
        }
    }

    public DrawerBannersView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public DrawerBannersView(@NonNull Context context) {
        this(context, null);
    }
}
