package com.p000p1.mobile.putong.feed.newui.camera.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;
import l.qkq0;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.i */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public final class C2036i {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final TabLayout f1362a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ViewPager2 f1363b;

    /* JADX INFO: renamed from: c */
    public final boolean f1364c;

    /* JADX INFO: renamed from: d */
    public final b f1365d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public RecyclerView.Adapter<?> f1366e;

    /* JADX INFO: renamed from: f */
    public boolean f1367f;

    /* JADX INFO: renamed from: g */
    public boolean f1368g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public c f1369h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public TabLayout.OnTabSelectedListener f1370i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public RecyclerView.i f1371j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.i$b */
    public interface b {
        void onConfigureTab(@NonNull TabLayout.Tab tab, int i);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.i$c */
    public static class c extends ViewPager2.i {

        /* JADX INFO: renamed from: a */
        @NonNull
        public final WeakReference<TabLayout> f1373a;

        /* JADX INFO: renamed from: b */
        public int f1374b;

        /* JADX INFO: renamed from: c */
        public int f1375c;

        public c(TabLayout tabLayout) {
            this.f1373a = new WeakReference<>(tabLayout);
            reset();
        }

        public void onPageScrollStateChanged(int i) {
            this.f1374b = this.f1375c;
            this.f1375c = i;
        }

        public void onPageScrolled(int i, float f, int i2) {
            TabLayout tabLayout = this.f1373a.get();
            if (tabLayout != null) {
                int i3 = this.f1375c;
                tabLayout.setScrollPosition(i, f, i3 != 2 || this.f1374b == 1, (i3 == 2 && this.f1374b == 0) ? false : true);
            }
        }

        public void onPageSelected(int i) {
            TabLayout tabLayout = this.f1373a.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i || i >= tabLayout.getTabCount()) {
                return;
            }
            int i2 = this.f1375c;
            tabLayout.selectTab(tabLayout.getTabAt(i), i2 == 0 || (i2 == 2 && this.f1374b == 0));
        }

        public void reset() {
            this.f1375c = 0;
            this.f1374b = 0;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.i$d */
    public static class d implements TabLayout.OnTabSelectedListener {

        /* JADX INFO: renamed from: a */
        public final ViewPager2 f1376a;

        /* JADX INFO: renamed from: b */
        public boolean f1377b;

        public d(ViewPager2 viewPager2, boolean z) {
            this.f1376a = viewPager2;
            this.f1377b = z;
        }

        public void onTabReselected(TabLayout.Tab tab) {
        }

        public void onTabSelected(@NonNull TabLayout.Tab tab) {
            this.f1376a.j(tab.getPosition(), this.f1377b);
        }

        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    public C2036i(@NonNull TabLayout tabLayout, @NonNull ViewPager2 viewPager2, boolean z, boolean z2, @NonNull b bVar) {
        this.f1362a = tabLayout;
        this.f1363b = viewPager2;
        this.f1364c = z;
        this.f1368g = z2;
        this.f1365d = bVar;
    }

    /* JADX INFO: renamed from: a */
    public void m2806a() {
        if (this.f1367f) {
            qkq0.a("TabLayoutMediator is already attached");
            return;
        }
        RecyclerView.Adapter<?> adapter = this.f1363b.getAdapter();
        this.f1366e = adapter;
        if (adapter == null) {
            qkq0.a("TabLayoutMediator attached before ViewPager2 has an adapter");
            return;
        }
        this.f1367f = true;
        c cVar = new c(this.f1362a);
        this.f1369h = cVar;
        this.f1363b.g(cVar);
        d dVar = new d(this.f1363b, this.f1368g);
        this.f1370i = dVar;
        this.f1362a.addOnTabSelectedListener(dVar);
        if (this.f1364c) {
            a aVar = new a();
            this.f1371j = aVar;
            this.f1366e.registerAdapterDataObserver(aVar);
        }
        m2807b();
        this.f1362a.setScrollPosition(this.f1363b.getCurrentItem(), 0.0f, true);
    }

    /* JADX INFO: renamed from: b */
    public void m2807b() {
        this.f1362a.removeAllTabs();
        RecyclerView.Adapter<?> adapter = this.f1366e;
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                TabLayout.Tab tabNewTab = this.f1362a.newTab();
                this.f1365d.onConfigureTab(tabNewTab, i);
                this.f1362a.addTab(tabNewTab, false);
            }
            if (itemCount > 0) {
                int iMin = Math.min(this.f1363b.getCurrentItem(), this.f1362a.getTabCount() - 1);
                if (iMin != this.f1362a.getSelectedTabPosition()) {
                    TabLayout tabLayout = this.f1362a;
                    tabLayout.selectTab(tabLayout.getTabAt(iMin));
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.i$a */
    public class a extends RecyclerView.i {
        public a() {
        }

        public void onChanged() {
            C2036i.this.m2807b();
        }

        public void onItemRangeChanged(int i, int i2) {
            C2036i.this.m2807b();
        }

        public void onItemRangeInserted(int i, int i2) {
            C2036i.this.m2807b();
        }

        public void onItemRangeMoved(int i, int i2, int i3) {
            C2036i.this.m2807b();
        }

        public void onItemRangeRemoved(int i, int i2) {
            C2036i.this.m2807b();
        }

        public void onItemRangeChanged(int i, int i2, @Nullable Object obj) {
            C2036i.this.m2807b();
        }
    }
}
