package com.p046p1.mobile.putong.feed.newui.camera.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;
import p149l.qkq0;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.i */
/* JADX INFO: loaded from: classes12.dex */
public final class C11192i {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final TabLayout f39901a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ViewPager2 f39902b;

    /* JADX INFO: renamed from: c */
    public final boolean f39903c;

    /* JADX INFO: renamed from: d */
    public final b f39904d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public RecyclerView.Adapter<?> f39905e;

    /* JADX INFO: renamed from: f */
    public boolean f39906f;

    /* JADX INFO: renamed from: g */
    public boolean f39907g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public c f39908h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public TabLayout.OnTabSelectedListener f39909i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public RecyclerView.AbstractC0571i f39910j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.i$b */
    public interface b {
        void onConfigureTab(@NonNull TabLayout.Tab tab, int i);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.i$c */
    public static class c extends ViewPager2.AbstractC0740i {

        /* JADX INFO: renamed from: a */
        @NonNull
        public final WeakReference<TabLayout> f39912a;

        /* JADX INFO: renamed from: b */
        public int f39913b;

        /* JADX INFO: renamed from: c */
        public int f39914c;

        public c(TabLayout tabLayout) {
            this.f39912a = new WeakReference<>(tabLayout);
            reset();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0740i
        public void onPageScrollStateChanged(int i) {
            this.f39913b = this.f39914c;
            this.f39914c = i;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0740i
        public void onPageScrolled(int i, float f, int i2) {
            TabLayout tabLayout = this.f39912a.get();
            if (tabLayout != null) {
                int i3 = this.f39914c;
                tabLayout.setScrollPosition(i, f, i3 != 2 || this.f39913b == 1, (i3 == 2 && this.f39913b == 0) ? false : true);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0740i
        public void onPageSelected(int i) {
            TabLayout tabLayout = this.f39912a.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i || i >= tabLayout.getTabCount()) {
                return;
            }
            int i2 = this.f39914c;
            tabLayout.selectTab(tabLayout.getTabAt(i), i2 == 0 || (i2 == 2 && this.f39913b == 0));
        }

        public void reset() {
            this.f39914c = 0;
            this.f39913b = 0;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.i$d */
    public static class d implements TabLayout.OnTabSelectedListener {

        /* JADX INFO: renamed from: a */
        public final ViewPager2 f39915a;

        /* JADX INFO: renamed from: b */
        public boolean f39916b;

        public d(ViewPager2 viewPager2, boolean z) {
            this.f39915a = viewPager2;
            this.f39916b = z;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(@NonNull TabLayout.Tab tab) {
            this.f39915a.m4250j(tab.getPosition(), this.f39916b);
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    public C11192i(@NonNull TabLayout tabLayout, @NonNull ViewPager2 viewPager2, boolean z, boolean z2, @NonNull b bVar) {
        this.f39901a = tabLayout;
        this.f39902b = viewPager2;
        this.f39903c = z;
        this.f39907g = z2;
        this.f39904d = bVar;
    }

    /* JADX INFO: renamed from: a */
    public void m61839a() {
        if (this.f39906f) {
            qkq0.m175383a("TabLayoutMediator is already attached");
            return;
        }
        RecyclerView.Adapter<?> adapter = this.f39902b.getAdapter();
        this.f39905e = adapter;
        if (adapter == null) {
            qkq0.m175383a("TabLayoutMediator attached before ViewPager2 has an adapter");
            return;
        }
        this.f39906f = true;
        c cVar = new c(this.f39901a);
        this.f39908h = cVar;
        this.f39902b.m4247g(cVar);
        d dVar = new d(this.f39902b, this.f39907g);
        this.f39909i = dVar;
        this.f39901a.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) dVar);
        if (this.f39903c) {
            a aVar = new a();
            this.f39910j = aVar;
            this.f39905e.registerAdapterDataObserver(aVar);
        }
        m61840b();
        this.f39901a.setScrollPosition(this.f39902b.getCurrentItem(), 0.0f, true);
    }

    /* JADX INFO: renamed from: b */
    public void m61840b() {
        this.f39901a.removeAllTabs();
        RecyclerView.Adapter<?> adapter = this.f39905e;
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                TabLayout.Tab tabNewTab = this.f39901a.newTab();
                this.f39904d.onConfigureTab(tabNewTab, i);
                this.f39901a.addTab(tabNewTab, false);
            }
            if (itemCount > 0) {
                int iMin = Math.min(this.f39902b.getCurrentItem(), this.f39901a.getTabCount() - 1);
                if (iMin != this.f39901a.getSelectedTabPosition()) {
                    TabLayout tabLayout = this.f39901a;
                    tabLayout.selectTab(tabLayout.getTabAt(iMin));
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.i$a */
    public class a extends RecyclerView.AbstractC0571i {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0571i
        public void onChanged() {
            C11192i.this.m61840b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0571i
        public void onItemRangeChanged(int i, int i2) {
            C11192i.this.m61840b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0571i
        public void onItemRangeInserted(int i, int i2) {
            C11192i.this.m61840b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0571i
        public void onItemRangeMoved(int i, int i2, int i3) {
            C11192i.this.m61840b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0571i
        public void onItemRangeRemoved(int i, int i2) {
            C11192i.this.m61840b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0571i
        public void onItemRangeChanged(int i, int i2, @Nullable Object obj) {
            C11192i.this.m61840b();
        }
    }
}
