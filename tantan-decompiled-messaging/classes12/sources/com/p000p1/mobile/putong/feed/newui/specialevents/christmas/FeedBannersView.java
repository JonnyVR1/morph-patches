package com.p000p1.mobile.putong.feed.newui.specialevents.christmas;

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
import com.p000p1.mobile.putong.data.Material;
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
import l.t100;
import l.vwb;
import l.w660;
import l.xdl0;
import l.zvf0;
import p007l.b5c0;
import p007l.cxh;
import p007l.e1c0;
import p007l.o6c0;
import p007l.uog;
import p007l.vqg;
import rx.c;
import v.VDraweeView;
import v.VPager;
import v.VPagerCircleIndicator;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedBannersView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f4160a;

    /* JADX INFO: renamed from: b */
    public VPager f4161b;

    /* JADX INFO: renamed from: c */
    public VPagerCircleIndicator f4162c;

    /* JADX INFO: renamed from: d */
    public C2173c f4163d;

    /* JADX INFO: renamed from: e */
    public String f4164e;

    /* JADX INFO: renamed from: f */
    public c4g0 f4165f;

    /* JADX INFO: renamed from: g */
    public List<Material> f4166g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.specialevents.christmas.FeedBannersView$a */
    public class C2171a extends ViewOutlineProvider {
        public C2171a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), t100.d(10.0f));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.specialevents.christmas.FeedBannersView$b */
    public class C2172b implements ViewPager.j {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f4168a;

        public C2172b(String str) {
            this.f4168a = str;
        }

        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
        }

        public void onPageSelected(int i) {
            FeedBannersView.this.m6586i(i, this.f4168a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.specialevents.christmas.FeedBannersView$c */
    public class C2173c extends w660 {

        /* JADX INFO: renamed from: a */
        public List<Material> f4170a = new ArrayList();

        public C2173c() {
        }

        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        public int getCount() {
            List<Material> list = this.f4170a;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public Object instantiateItem(ViewGroup viewGroup, int i) {
            View viewInflate = FeedBannersView.this.m6582e().inflater().inflate(o6c0.f11087M, (ViewGroup) null);
            VDraweeView vDraweeViewFindViewById = viewInflate.findViewById(b5c0.f6070m0);
            final Material material = this.f4170a.get(i);
            if (NullChecker.a(material)) {
                qib0.G.L0(vDraweeViewFindViewById, material.picture.identifier);
            }
            vDraweeViewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l.tog
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f13367a.m6589k(material, view);
                }
            });
            viewGroup.addView(viewInflate);
            return viewInflate;
        }

        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ void m6589k(Material material, View view) {
            if (NullChecker.a(material)) {
                zvf0.u("e_moment_activity_banner", vqg.m15485K(FeedBannersView.this.f4164e, false), new j760[]{vwb.Y("activity_id", material.resourceID)});
                String str = material.deeplink;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                cxh.m9252b(FeedBannersView.this.m6582e(), Uri.parse(str));
            }
        }

        /* JADX INFO: renamed from: l */
        public void m6590l(List<Material> list) {
            this.f4170a = list;
            notifyDataSetChanged();
        }
    }

    public FeedBannersView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4166g = new ArrayList();
        m6583f(context, null);
    }

    /* JADX INFO: renamed from: d */
    public View m6581d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return uog.m15126b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: e */
    public final Act m6582e() {
        return getContext();
    }

    /* JADX INFO: renamed from: f */
    public final void m6583f(Context context, String str) {
        this.f4164e = str;
        addView(m6581d(LayoutInflater.from(context), this));
        this.f4163d = new C2173c();
        m6587j(str);
        this.f4161b.setAdapter(this.f4163d);
        VPagerCircleIndicator vPagerCircleIndicator = this.f4162c;
        VPager vPager = this.f4161b;
        vPagerCircleIndicator.c(vPager, vPager.getCurrentItem());
        this.f4162c.setFillColor(((Act) context).color(e1c0.f7159p0));
        this.f4162c.setPageColor(getResources().getColor(e1c0.f7165v));
        this.f4161b.setCurrentItem(0);
        this.f4161b.setOffscreenPageLimit(2);
        this.f4161b.setOutlineProvider(new C2171a());
        this.f4161b.setClipToOutline(true);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m6584g(Long l2) {
        int currentItem = this.f4161b.getCurrentItem();
        int count = this.f4163d.getCount() - 1;
        VPager vPager = this.f4161b;
        if (currentItem == count) {
            vPager.T(0, true);
        } else {
            vPager.T(vPager.getCurrentItem() + 1, true);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m6585h(Act act, List<Material> list, long j) {
        this.f4166g = list;
        this.f4163d.m6590l(list);
        m6586i(0, this.f4164e);
        if (this.f4163d.getCount() > 1 && j != 0) {
            if (NullChecker.a(this.f4165f) && this.f4165f.isUnsubscribed()) {
                this.f4165f.unsubscribe();
            }
            this.f4165f = act.duringCreated(c.interval(j * 1000, TimeUnit.MILLISECONDS).onBackpressureLatest().observeOn(jo0.a())).subscribe(mkd0.G(new e30() { // from class: l.sog
                public final void call(Object obj) {
                    this.f13020a.m6584g((Long) obj);
                }
            }));
        }
        int size = list.size();
        VPagerCircleIndicator vPagerCircleIndicator = this.f4162c;
        if (size <= 1) {
            xdl0.M0(vPagerCircleIndicator, false);
        } else {
            xdl0.M0(vPagerCircleIndicator, true);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m6586i(int i, String str) {
        if (this.f4166g.size() > i) {
            zvf0.A("e_moment_activity_banner", vqg.m15485K(str, false), new j760[]{vwb.Y("activity_id", this.f4166g.get(i).resourceID)});
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m6587j(String str) {
        this.f4161b.d(new C2172b(str));
    }

    public FeedBannersView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
        m6583f(context, null);
    }

    public FeedBannersView(@NonNull Context context, String str) {
        this(context, null, -1);
        m6583f(context, str);
    }
}
