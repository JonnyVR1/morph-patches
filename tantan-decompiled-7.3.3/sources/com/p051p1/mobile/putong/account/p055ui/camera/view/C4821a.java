package com.p051p1.mobile.putong.account.p055ui.camera.view;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;
import p153l.wtq0;

/* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.view.a */
/* JADX INFO: loaded from: classes9.dex */
public final class C4821a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final TabLayout f17694a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ViewPager2 f17695b;

    /* JADX INFO: renamed from: c */
    public final boolean f17696c;

    /* JADX INFO: renamed from: d */
    public final b f17697d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public RecyclerView.Adapter<?> f17698e;

    /* JADX INFO: renamed from: f */
    public boolean f17699f;

    /* JADX INFO: renamed from: g */
    public boolean f17700g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public c f17701h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public TabLayout.OnTabSelectedListener f17702i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public RecyclerView.AbstractC0573i f17703j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.view.a$b */
    public interface b {
        void onConfigureTab(@NonNull TabLayout.Tab tab, int i);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.view.a$c */
    public static class c extends ViewPager2.AbstractC0742i {

        /* JADX INFO: renamed from: a */
        @NonNull
        public final WeakReference<TabLayout> f17705a;

        /* JADX INFO: renamed from: b */
        public int f17706b;

        /* JADX INFO: renamed from: c */
        public int f17707c;

        public c(TabLayout tabLayout) {
            this.f17705a = new WeakReference<>(tabLayout);
            reset();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0742i
        public void onPageScrollStateChanged(int i) {
            this.f17706b = this.f17707c;
            this.f17707c = i;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0742i
        public void onPageScrolled(int i, float f, int i2) {
            TabLayout tabLayout = this.f17705a.get();
            if (tabLayout != null) {
                int i3 = this.f17707c;
                tabLayout.setScrollPosition(i, f, i3 != 2 || this.f17706b == 1, (i3 == 2 && this.f17706b == 0) ? false : true);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0742i
        public void onPageSelected(int i) {
            TabLayout tabLayout = this.f17705a.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i || i >= tabLayout.getTabCount()) {
                return;
            }
            int i2 = this.f17707c;
            tabLayout.selectTab(tabLayout.getTabAt(i), i2 == 0 || (i2 == 2 && this.f17706b == 0));
        }

        public void reset() {
            this.f17707c = 0;
            this.f17706b = 0;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.view.a$d */
    public static class d implements TabLayout.OnTabSelectedListener {

        /* JADX INFO: renamed from: a */
        public final ViewPager2 f17708a;

        /* JADX INFO: renamed from: b */
        public boolean f17709b;

        public d(ViewPager2 viewPager2, boolean z) {
            this.f17708a = viewPager2;
            this.f17709b = z;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(@NonNull TabLayout.Tab tab) {
            this.f17708a.m4252j(tab.getPosition(), this.f17709b);
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    public C4821a(@NonNull TabLayout tabLayout, @NonNull ViewPager2 viewPager2, boolean z, boolean z2, @NonNull b bVar) {
        this.f17694a = tabLayout;
        this.f17695b = viewPager2;
        this.f17696c = z;
        this.f17700g = z2;
        this.f17697d = bVar;
    }

    /* JADX INFO: renamed from: a */
    public void m30160a() {
        if (this.f17699f) {
            wtq0.m207906a("TabLayoutMediator is already attached");
            return;
        }
        RecyclerView.Adapter<?> adapter = this.f17695b.getAdapter();
        this.f17698e = adapter;
        if (adapter == null) {
            wtq0.m207906a("TabLayoutMediator attached before ViewPager2 has an adapter");
            return;
        }
        this.f17699f = true;
        c cVar = new c(this.f17694a);
        this.f17701h = cVar;
        this.f17695b.m4249g(cVar);
        d dVar = new d(this.f17695b, this.f17700g);
        this.f17702i = dVar;
        this.f17694a.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) dVar);
        if (this.f17696c) {
            a aVar = new a();
            this.f17703j = aVar;
            this.f17698e.registerAdapterDataObserver(aVar);
        }
        m30161b();
        this.f17694a.setScrollPosition(this.f17695b.getCurrentItem(), 0.0f, true);
    }

    /* JADX INFO: renamed from: b */
    public void m30161b() {
        this.f17694a.removeAllTabs();
        RecyclerView.Adapter<?> adapter = this.f17698e;
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                TabLayout.Tab tabNewTab = this.f17694a.newTab();
                this.f17697d.onConfigureTab(tabNewTab, i);
                this.f17694a.addTab(tabNewTab, false);
            }
            if (itemCount > 0) {
                int iMin = Math.min(this.f17695b.getCurrentItem(), this.f17694a.getTabCount() - 1);
                if (iMin != this.f17694a.getSelectedTabPosition()) {
                    TabLayout tabLayout = this.f17694a;
                    tabLayout.selectTab(tabLayout.getTabAt(iMin));
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.view.a$a */
    public class a extends RecyclerView.AbstractC0573i {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0573i
        public void onChanged() {
            C4821a.this.m30161b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0573i
        public void onItemRangeChanged(int i, int i2) {
            C4821a.this.m30161b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0573i
        public void onItemRangeInserted(int i, int i2) {
            C4821a.this.m30161b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0573i
        public void onItemRangeMoved(int i, int i2, int i3) {
            C4821a.this.m30161b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0573i
        public void onItemRangeRemoved(int i, int i2) {
            C4821a.this.m30161b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0573i
        public void onItemRangeChanged(int i, int i2, @Nullable Object obj) {
            C4821a.this.m30161b();
        }
    }
}
