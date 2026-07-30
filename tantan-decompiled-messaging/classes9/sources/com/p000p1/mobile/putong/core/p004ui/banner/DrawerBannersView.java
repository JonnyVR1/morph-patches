package com.p000p1.mobile.putong.core.p004ui.banner;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.BannerScroll;
import com.p1.mobile.putong.data.Banners;
import com.p1.mobile.putong.data.BannersItem;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;
import l.c4g0;
import l.e30;
import l.ife;
import l.jo0;
import l.mkd0;
import l.nce;
import l.w660;
import l.xdl0;
import p006l.f6c0;
import p006l.lva;
import p006l.u4c0;
import p006l.w0c0;
import rx.c;
import v.AspectRatioViewPager;
import v.VCard;
import v.VDraweeView;
import v.VPagerCircleIndicator;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class DrawerBannersView extends VCard {

    /* JADX INFO: renamed from: a */
    public DrawerBannersView f4545a;

    /* JADX INFO: renamed from: b */
    public AspectRatioViewPager f4546b;

    /* JADX INFO: renamed from: c */
    public VPagerCircleIndicator f4547c;

    /* JADX INFO: renamed from: d */
    public C0208b f4548d;

    /* JADX INFO: renamed from: e */
    public Banners f4549e;

    /* JADX INFO: renamed from: f */
    public e30<Integer> f4550f;

    /* JADX INFO: renamed from: g */
    public c4g0 f4551g;

    /* JADX INFO: renamed from: h */
    public int f4552h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.banner.DrawerBannersView$a */
    public class C0207a implements ViewPager.j {

        /* JADX INFO: renamed from: a */
        public int f4553a;

        /* JADX INFO: renamed from: b */
        public boolean f4554b;

        public C0207a() {
        }

        public void onPageScrollStateChanged(int i) {
            if (this.f4553a == 1 && i == 2) {
                this.f4554b = true;
            } else if (i == 0) {
                this.f4554b = false;
            }
            this.f4553a = i;
        }

        public void onPageScrolled(int i, float f, int i2) {
        }

        public void onPageSelected(int i) {
            if (this.f4554b && NullChecker.a(DrawerBannersView.this.f4551g)) {
                DrawerBannersView.this.f4551g.unsubscribe();
            }
            DrawerBannersView.this.f4552h = i + 1;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.banner.DrawerBannersView$b */
    public class C0208b extends w660 {
        public C0208b() {
        }

        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        public int getCount() {
            if (DrawerBannersView.this.f4549e == null) {
                return 0;
            }
            return DrawerBannersView.this.f4549e.content.banners.size();
        }

        public Object instantiateItem(ViewGroup viewGroup, final int i) {
            View viewInflate = DrawerBannersView.this.m7299m().inflater().inflate(f6c0.f12179ee, (ViewGroup) null);
            VDraweeView vDraweeViewFindViewById = viewInflate.findViewById(u4c0.f22657L5);
            final BannersItem bannersItem = (BannersItem) DrawerBannersView.this.f4549e.content.banners.get(i);
            if (NullChecker.a(bannersItem)) {
                vDraweeViewFindViewById.setImageURI(BannerUrlLoader.m7290b(bannersItem.banner, BannerUrlLoader.BannerType.drawer, DrawerBannersView.this.f4545a));
            }
            vDraweeViewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l.mce
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f16899a.m7304k(i, bannersItem, view);
                }
            });
            viewGroup.addView(viewInflate);
            return viewInflate;
        }

        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ void m7304k(int i, BannersItem bannersItem, View view) {
            if (NullChecker.a(DrawerBannersView.this.f4550f)) {
                DrawerBannersView.this.f4550f.call(Integer.valueOf(i + 1));
            }
            if (NullChecker.a(bannersItem)) {
                ife.o().l(DrawerBannersView.this.f4549e, true);
                ife.o().s(DrawerBannersView.this.f4549e.loc, DrawerBannersView.this.f4549e, DrawerBannersView.this.f4552h);
                if (TextUtils.isEmpty(bannersItem.url)) {
                    return;
                }
                if (bannersItem.url.startsWith("tantanapp") || bannersItem.url.startsWith("tantantribe")) {
                    lva.m19020D(DrawerBannersView.this.m7299m(), Uri.parse(bannersItem.url));
                    return;
                }
                lva.m19020D(DrawerBannersView.this.m7299m(), Uri.parse("tantanapp://webview?url=" + bannersItem.url));
            }
        }
    }

    public DrawerBannersView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4552h = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public Act m7299m() {
        return getContext();
    }

    /* JADX INFO: renamed from: l */
    public final void m7300l(View view) {
        nce.a(this, view);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m7301n(Long l2) {
        int currentItem = this.f4546b.getCurrentItem();
        int count = this.f4548d.getCount() - 1;
        AspectRatioViewPager aspectRatioViewPager = this.f4546b;
        if (currentItem == count) {
            aspectRatioViewPager.T(0, true);
        } else {
            aspectRatioViewPager.T(aspectRatioViewPager.getCurrentItem() + 1, true);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m7302o(Act act, Banners banners) {
        this.f4549e = banners;
        if (this.f4548d.getCount() > 1) {
            BannerScroll bannerScroll = banners.action.scroll;
            if (bannerScroll.auto && bannerScroll.interval > 0.0f) {
                if (NullChecker.a(this.f4551g) && this.f4551g.isUnsubscribed()) {
                    this.f4551g.unsubscribe();
                }
                this.f4551g = act.duringCreated(c.interval((long) (banners.action.scroll.interval * 1000.0f), TimeUnit.MILLISECONDS).onBackpressureLatest().observeOn(jo0.a())).subscribe(mkd0.G(new e30() { // from class: l.lce
                    public final void call(Object obj) {
                        this.f16326a.m7301n((Long) obj);
                    }
                }));
                this.f4546b.d(new C0207a());
            }
        }
        int size = this.f4549e.content.banners.size();
        VPagerCircleIndicator vPagerCircleIndicator = this.f4547c;
        if (size <= 1) {
            xdl0.M0(vPagerCircleIndicator, false);
        } else {
            xdl0.M0(vPagerCircleIndicator, true);
        }
        this.f4548d.notifyDataSetChanged();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m7300l(this);
        C0208b c0208b = new C0208b();
        this.f4548d = c0208b;
        this.f4546b.setAdapter(c0208b);
        this.f4546b.setCurrentItem(0);
        VPagerCircleIndicator vPagerCircleIndicator = this.f4547c;
        AspectRatioViewPager aspectRatioViewPager = this.f4546b;
        vPagerCircleIndicator.c(aspectRatioViewPager, aspectRatioViewPager.getCurrentItem());
        this.f4547c.setFillColor(m7299m().color(w0c0.f24744y1));
    }

    public void setClickAction(e30<Integer> e30Var) {
        this.f4550f = e30Var;
        if (NullChecker.a(this.f4548d)) {
            this.f4548d.notifyDataSetChanged();
        }
    }

    public DrawerBannersView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public DrawerBannersView(@NonNull Context context) {
        this(context, null);
    }
}
