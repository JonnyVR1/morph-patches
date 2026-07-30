package com.p051p1.mobile.putong.feed.newui.camera.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;
import p153l.wtq0;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.i */
/* JADX INFO: loaded from: classes13.dex */
public final class C11355i {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final TabLayout f40749a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ViewPager2 f40750b;

    /* JADX INFO: renamed from: c */
    public final boolean f40751c;

    /* JADX INFO: renamed from: d */
    public final b f40752d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public RecyclerView.Adapter<?> f40753e;

    /* JADX INFO: renamed from: f */
    public boolean f40754f;

    /* JADX INFO: renamed from: g */
    public boolean f40755g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public c f40756h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public TabLayout.OnTabSelectedListener f40757i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public RecyclerView.AbstractC0573i f40758j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.i$b */
    public interface b {
        void onConfigureTab(@NonNull TabLayout.Tab tab, int i);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.i$c */
    public static class c extends ViewPager2.AbstractC0742i {

        /* JADX INFO: renamed from: a */
        @NonNull
        public final WeakReference<TabLayout> f40760a;

        /* JADX INFO: renamed from: b */
        public int f40761b;

        /* JADX INFO: renamed from: c */
        public int f40762c;

        public c(TabLayout tabLayout) {
            this.f40760a = new WeakReference<>(tabLayout);
            reset();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0742i
        public void onPageScrollStateChanged(int i) {
            this.f40761b = this.f40762c;
            this.f40762c = i;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0742i
        public void onPageScrolled(int i, float f, int i2) {
            TabLayout tabLayout = this.f40760a.get();
            if (tabLayout != null) {
                int i3 = this.f40762c;
                tabLayout.setScrollPosition(i, f, i3 != 2 || this.f40761b == 1, (i3 == 2 && this.f40761b == 0) ? false : true);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0742i
        public void onPageSelected(int i) {
            TabLayout tabLayout = this.f40760a.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i || i >= tabLayout.getTabCount()) {
                return;
            }
            int i2 = this.f40762c;
            tabLayout.selectTab(tabLayout.getTabAt(i), i2 == 0 || (i2 == 2 && this.f40761b == 0));
        }

        public void reset() {
            this.f40762c = 0;
            this.f40761b = 0;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.i$d */
    public static class d implements TabLayout.OnTabSelectedListener {

        /* JADX INFO: renamed from: a */
        public final ViewPager2 f40763a;

        /* JADX INFO: renamed from: b */
        public boolean f40764b;

        public d(ViewPager2 viewPager2, boolean z) {
            this.f40763a = viewPager2;
            this.f40764b = z;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(@NonNull TabLayout.Tab tab) {
            this.f40763a.m4252j(tab.getPosition(), this.f40764b);
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    public C11355i(@NonNull TabLayout tabLayout, @NonNull ViewPager2 viewPager2, boolean z, boolean z2, @NonNull b bVar) {
        this.f40749a = tabLayout;
        this.f40750b = viewPager2;
        this.f40751c = z;
        this.f40755g = z2;
        this.f40752d = bVar;
    }

    /* JADX INFO: renamed from: a */
    public void m63022a() {
        if (this.f40754f) {
            wtq0.m207906a("TabLayoutMediator is already attached");
            return;
        }
        RecyclerView.Adapter<?> adapter = this.f40750b.getAdapter();
        this.f40753e = adapter;
        if (adapter == null) {
            wtq0.m207906a("TabLayoutMediator attached before ViewPager2 has an adapter");
            return;
        }
        this.f40754f = true;
        c cVar = new c(this.f40749a);
        this.f40756h = cVar;
        this.f40750b.m4249g(cVar);
        d dVar = new d(this.f40750b, this.f40755g);
        this.f40757i = dVar;
        this.f40749a.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) dVar);
        if (this.f40751c) {
            a aVar = new a();
            this.f40758j = aVar;
            this.f40753e.registerAdapterDataObserver(aVar);
        }
        m63023b();
        this.f40749a.setScrollPosition(this.f40750b.getCurrentItem(), 0.0f, true);
    }

    /* JADX INFO: renamed from: b */
    public void m63023b() {
        this.f40749a.removeAllTabs();
        RecyclerView.Adapter<?> adapter = this.f40753e;
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                TabLayout.Tab tabNewTab = this.f40749a.newTab();
                this.f40752d.onConfigureTab(tabNewTab, i);
                this.f40749a.addTab(tabNewTab, false);
            }
            if (itemCount > 0) {
                int iMin = Math.min(this.f40750b.getCurrentItem(), this.f40749a.getTabCount() - 1);
                if (iMin != this.f40749a.getSelectedTabPosition()) {
                    TabLayout tabLayout = this.f40749a;
                    tabLayout.selectTab(tabLayout.getTabAt(iMin));
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.i$a */
    public class a extends RecyclerView.AbstractC0573i {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0573i
        public void onChanged() {
            C11355i.this.m63023b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0573i
        public void onItemRangeChanged(int i, int i2) {
            C11355i.this.m63023b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0573i
        public void onItemRangeInserted(int i, int i2) {
            C11355i.this.m63023b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0573i
        public void onItemRangeMoved(int i, int i2, int i3) {
            C11355i.this.m63023b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0573i
        public void onItemRangeRemoved(int i, int i2) {
            C11355i.this.m63023b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0573i
        public void onItemRangeChanged(int i, int i2, @Nullable Object obj) {
            C11355i.this.m63023b();
        }
    }
}
