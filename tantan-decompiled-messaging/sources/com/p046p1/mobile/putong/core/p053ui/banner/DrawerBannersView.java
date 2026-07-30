package com.p046p1.mobile.putong.core.p053ui.banner;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.BannerScroll;
import com.p046p1.mobile.putong.data.Banners;
import com.p046p1.mobile.putong.data.BannersItem;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p147v.AspectRatioViewPager;
import p147v.VCard;
import p147v.VDraweeView;
import p147v.VPagerCircleIndicator;
import p149l.c4g0;
import p149l.e30;
import p149l.f6c0;
import p149l.ife;
import p149l.jo0;
import p149l.lva;
import p149l.mkd0;
import p149l.nce;
import p149l.u4c0;
import p149l.w0c0;
import p149l.w660;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class DrawerBannersView extends VCard {

    /* JADX INFO: renamed from: a */
    public DrawerBannersView f28478a;

    /* JADX INFO: renamed from: b */
    public AspectRatioViewPager f28479b;

    /* JADX INFO: renamed from: c */
    public VPagerCircleIndicator f28480c;

    /* JADX INFO: renamed from: d */
    public C8292b f28481d;

    /* JADX INFO: renamed from: e */
    public Banners f28482e;

    /* JADX INFO: renamed from: f */
    public e30<Integer> f28483f;

    /* JADX INFO: renamed from: g */
    public c4g0 f28484g;

    /* JADX INFO: renamed from: h */
    public int f28485h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.banner.DrawerBannersView$a */
    public class C8291a implements ViewPager.InterfaceC0716j {

        /* JADX INFO: renamed from: a */
        public int f28486a;

        /* JADX INFO: renamed from: b */
        public boolean f28487b;

        public C8291a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrollStateChanged(int i) {
            if (this.f28486a == 1 && i == 2) {
                this.f28487b = true;
            } else if (i == 0) {
                this.f28487b = false;
            }
            this.f28486a = i;
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int i) {
            if (this.f28487b && NullChecker.m81303a(DrawerBannersView.this.f28484g)) {
                DrawerBannersView.this.f28484g.unsubscribe();
            }
            DrawerBannersView.this.f28485h = i + 1;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.banner.DrawerBannersView$b */
    public class C8292b extends w660 {
        public C8292b() {
        }

        @Override // p149l.w660
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // p149l.w660
        public int getCount() {
            if (DrawerBannersView.this.f28482e == null) {
                return 0;
            }
            return DrawerBannersView.this.f28482e.content.banners.size();
        }

        @Override // p149l.w660
        public Object instantiateItem(ViewGroup viewGroup, final int i) {
            View viewInflate = DrawerBannersView.this.m44343m().inflater().inflate(f6c0.f95765ee, (ViewGroup) null);
            VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(u4c0.f173909L5);
            final BannersItem bannersItem = DrawerBannersView.this.f28482e.content.banners.get(i);
            if (NullChecker.m81303a(bannersItem)) {
                vDraweeView.setImageURI(BannerUrlLoader.m44334b(bannersItem.banner, BannerUrlLoader.BannerType.drawer, DrawerBannersView.this.f28478a));
            }
            vDraweeView.setOnClickListener(new View.OnClickListener() { // from class: l.mce
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f133095a.m44348k(i, bannersItem, view);
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
        public final /* synthetic */ void m44348k(int i, BannersItem bannersItem, View view) {
            if (NullChecker.m81303a(DrawerBannersView.this.f28483f)) {
                DrawerBannersView.this.f28483f.call(Integer.valueOf(i + 1));
            }
            if (NullChecker.m81303a(bannersItem)) {
                ife.m135906o().m135909l(DrawerBannersView.this.f28482e, true);
                ife.m135906o().m135915s(DrawerBannersView.this.f28482e.loc, DrawerBannersView.this.f28482e, DrawerBannersView.this.f28485h);
                if (TextUtils.isEmpty(bannersItem.url)) {
                    return;
                }
                if (bannersItem.url.startsWith("tantanapp") || bannersItem.url.startsWith("tantantribe")) {
                    lva.m151843D(DrawerBannersView.this.m44343m(), Uri.parse(bannersItem.url));
                    return;
                }
                lva.m151843D(DrawerBannersView.this.m44343m(), Uri.parse("tantanapp://webview?url=" + bannersItem.url));
            }
        }
    }

    public DrawerBannersView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f28485h = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public Act m44343m() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: l */
    public final void m44344l(View view) {
        nce.m158929a(this, view);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m44345n(Long l2) {
        int currentItem = this.f28479b.getCurrentItem();
        int count = this.f28481d.getCount() - 1;
        AspectRatioViewPager aspectRatioViewPager = this.f28479b;
        if (currentItem == count) {
            aspectRatioViewPager.m4176T(0, true);
        } else {
            aspectRatioViewPager.m4176T(aspectRatioViewPager.getCurrentItem() + 1, true);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m44346o(Act act, Banners banners) {
        this.f28482e = banners;
        if (this.f28481d.getCount() > 1) {
            BannerScroll bannerScroll = banners.action.scroll;
            if (bannerScroll.auto && bannerScroll.interval > 0.0f) {
                if (NullChecker.m81303a(this.f28484g) && this.f28484g.isUnsubscribed()) {
                    this.f28484g.unsubscribe();
                }
                this.f28484g = act.duringCreated(C22306c.interval((long) (banners.action.scroll.interval * 1000.0f), TimeUnit.MILLISECONDS).onBackpressureLatest().observeOn(jo0.m142408a())).subscribe(mkd0.m154955G(new e30() { // from class: l.lce
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f127397a.m44345n((Long) obj);
                    }
                }));
                this.f28479b.m4185d(new C8291a());
            }
        }
        int size = this.f28482e.content.banners.size();
        VPagerCircleIndicator vPagerCircleIndicator = this.f28480c;
        if (size <= 1) {
            xdl0.m208345M0(vPagerCircleIndicator, false);
        } else {
            xdl0.m208345M0(vPagerCircleIndicator, true);
        }
        this.f28481d.notifyDataSetChanged();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m44344l(this);
        C8292b c8292b = new C8292b();
        this.f28481d = c8292b;
        this.f28479b.setAdapter(c8292b);
        this.f28479b.setCurrentItem(0);
        VPagerCircleIndicator vPagerCircleIndicator = this.f28480c;
        AspectRatioViewPager aspectRatioViewPager = this.f28479b;
        vPagerCircleIndicator.m223143c(aspectRatioViewPager, aspectRatioViewPager.getCurrentItem());
        this.f28480c.setFillColor(m44343m().color(w0c0.f183904y1));
    }

    public void setClickAction(e30<Integer> e30Var) {
        this.f28483f = e30Var;
        if (NullChecker.m81303a(this.f28481d)) {
            this.f28481d.notifyDataSetChanged();
        }
    }

    public DrawerBannersView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public DrawerBannersView(@NonNull Context context) {
        this(context, null);
    }
}
