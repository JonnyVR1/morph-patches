package com.p046p1.mobile.putong.account.p050ui.camera.view;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;
import p149l.qkq0;

/* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.view.a */
/* JADX INFO: loaded from: classes9.dex */
public final class C4670a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final TabLayout f16975a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ViewPager2 f16976b;

    /* JADX INFO: renamed from: c */
    public final boolean f16977c;

    /* JADX INFO: renamed from: d */
    public final b f16978d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public RecyclerView.Adapter<?> f16979e;

    /* JADX INFO: renamed from: f */
    public boolean f16980f;

    /* JADX INFO: renamed from: g */
    public boolean f16981g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public c f16982h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public TabLayout.OnTabSelectedListener f16983i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public RecyclerView.AbstractC0571i f16984j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.view.a$b */
    public interface b {
        void onConfigureTab(@NonNull TabLayout.Tab tab, int i);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.view.a$c */
    public static class c extends ViewPager2.AbstractC0740i {

        /* JADX INFO: renamed from: a */
        @NonNull
        public final WeakReference<TabLayout> f16986a;

        /* JADX INFO: renamed from: b */
        public int f16987b;

        /* JADX INFO: renamed from: c */
        public int f16988c;

        public c(TabLayout tabLayout) {
            this.f16986a = new WeakReference<>(tabLayout);
            reset();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0740i
        public void onPageScrollStateChanged(int i) {
            this.f16987b = this.f16988c;
            this.f16988c = i;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0740i
        public void onPageScrolled(int i, float f, int i2) {
            TabLayout tabLayout = this.f16986a.get();
            if (tabLayout != null) {
                int i3 = this.f16988c;
                tabLayout.setScrollPosition(i, f, i3 != 2 || this.f16987b == 1, (i3 == 2 && this.f16987b == 0) ? false : true);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0740i
        public void onPageSelected(int i) {
            TabLayout tabLayout = this.f16986a.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i || i >= tabLayout.getTabCount()) {
                return;
            }
            int i2 = this.f16988c;
            tabLayout.selectTab(tabLayout.getTabAt(i), i2 == 0 || (i2 == 2 && this.f16987b == 0));
        }

        public void reset() {
            this.f16988c = 0;
            this.f16987b = 0;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.view.a$d */
    public static class d implements TabLayout.OnTabSelectedListener {

        /* JADX INFO: renamed from: a */
        public final ViewPager2 f16989a;

        /* JADX INFO: renamed from: b */
        public boolean f16990b;

        public d(ViewPager2 viewPager2, boolean z) {
            this.f16989a = viewPager2;
            this.f16990b = z;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(@NonNull TabLayout.Tab tab) {
            this.f16989a.m4250j(tab.getPosition(), this.f16990b);
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    public C4670a(@NonNull TabLayout tabLayout, @NonNull ViewPager2 viewPager2, boolean z, boolean z2, @NonNull b bVar) {
        this.f16975a = tabLayout;
        this.f16976b = viewPager2;
        this.f16977c = z;
        this.f16981g = z2;
        this.f16978d = bVar;
    }

    /* JADX INFO: renamed from: a */
    public void m29162a() {
        if (this.f16980f) {
            qkq0.m175383a("TabLayoutMediator is already attached");
            return;
        }
        RecyclerView.Adapter<?> adapter = this.f16976b.getAdapter();
        this.f16979e = adapter;
        if (adapter == null) {
            qkq0.m175383a("TabLayoutMediator attached before ViewPager2 has an adapter");
            return;
        }
        this.f16980f = true;
        c cVar = new c(this.f16975a);
        this.f16982h = cVar;
        this.f16976b.m4247g(cVar);
        d dVar = new d(this.f16976b, this.f16981g);
        this.f16983i = dVar;
        this.f16975a.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) dVar);
        if (this.f16977c) {
            a aVar = new a();
            this.f16984j = aVar;
            this.f16979e.registerAdapterDataObserver(aVar);
        }
        m29163b();
        this.f16975a.setScrollPosition(this.f16976b.getCurrentItem(), 0.0f, true);
    }

    /* JADX INFO: renamed from: b */
    public void m29163b() {
        this.f16975a.removeAllTabs();
        RecyclerView.Adapter<?> adapter = this.f16979e;
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                TabLayout.Tab tabNewTab = this.f16975a.newTab();
                this.f16978d.onConfigureTab(tabNewTab, i);
                this.f16975a.addTab(tabNewTab, false);
            }
            if (itemCount > 0) {
                int iMin = Math.min(this.f16976b.getCurrentItem(), this.f16975a.getTabCount() - 1);
                if (iMin != this.f16975a.getSelectedTabPosition()) {
                    TabLayout tabLayout = this.f16975a;
                    tabLayout.selectTab(tabLayout.getTabAt(iMin));
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.view.a$a */
    public class a extends RecyclerView.AbstractC0571i {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0571i
        public void onChanged() {
            C4670a.this.m29163b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0571i
        public void onItemRangeChanged(int i, int i2) {
            C4670a.this.m29163b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0571i
        public void onItemRangeInserted(int i, int i2) {
            C4670a.this.m29163b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0571i
        public void onItemRangeMoved(int i, int i2, int i3) {
            C4670a.this.m29163b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0571i
        public void onItemRangeRemoved(int i, int i2) {
            C4670a.this.m29163b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0571i
        public void onItemRangeChanged(int i, int i2, @Nullable Object obj) {
            C4670a.this.m29163b();
        }
    }
}
