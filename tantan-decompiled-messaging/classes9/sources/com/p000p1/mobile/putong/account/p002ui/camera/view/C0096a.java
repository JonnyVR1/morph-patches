package com.p000p1.mobile.putong.account.p002ui.camera.view;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;
import l.qkq0;

/* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.view.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public final class C0096a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final TabLayout f964a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ViewPager2 f965b;

    /* JADX INFO: renamed from: c */
    public final boolean f966c;

    /* JADX INFO: renamed from: d */
    public final b f967d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public RecyclerView.Adapter<?> f968e;

    /* JADX INFO: renamed from: f */
    public boolean f969f;

    /* JADX INFO: renamed from: g */
    public boolean f970g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public c f971h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public TabLayout.OnTabSelectedListener f972i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public RecyclerView.i f973j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.view.a$b */
    public interface b {
        void onConfigureTab(@NonNull TabLayout.Tab tab, int i);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.view.a$c */
    public static class c extends ViewPager2.i {

        /* JADX INFO: renamed from: a */
        @NonNull
        public final WeakReference<TabLayout> f975a;

        /* JADX INFO: renamed from: b */
        public int f976b;

        /* JADX INFO: renamed from: c */
        public int f977c;

        public c(TabLayout tabLayout) {
            this.f975a = new WeakReference<>(tabLayout);
            reset();
        }

        public void onPageScrollStateChanged(int i) {
            this.f976b = this.f977c;
            this.f977c = i;
        }

        public void onPageScrolled(int i, float f, int i2) {
            TabLayout tabLayout = this.f975a.get();
            if (tabLayout != null) {
                int i3 = this.f977c;
                tabLayout.setScrollPosition(i, f, i3 != 2 || this.f976b == 1, (i3 == 2 && this.f976b == 0) ? false : true);
            }
        }

        public void onPageSelected(int i) {
            TabLayout tabLayout = this.f975a.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i || i >= tabLayout.getTabCount()) {
                return;
            }
            int i2 = this.f977c;
            tabLayout.selectTab(tabLayout.getTabAt(i), i2 == 0 || (i2 == 2 && this.f976b == 0));
        }

        public void reset() {
            this.f977c = 0;
            this.f976b = 0;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.view.a$d */
    public static class d implements TabLayout.OnTabSelectedListener {

        /* JADX INFO: renamed from: a */
        public final ViewPager2 f978a;

        /* JADX INFO: renamed from: b */
        public boolean f979b;

        public d(ViewPager2 viewPager2, boolean z) {
            this.f978a = viewPager2;
            this.f979b = z;
        }

        public void onTabReselected(TabLayout.Tab tab) {
        }

        public void onTabSelected(@NonNull TabLayout.Tab tab) {
            this.f978a.j(tab.getPosition(), this.f979b);
        }

        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    public C0096a(@NonNull TabLayout tabLayout, @NonNull ViewPager2 viewPager2, boolean z, boolean z2, @NonNull b bVar) {
        this.f964a = tabLayout;
        this.f965b = viewPager2;
        this.f966c = z;
        this.f970g = z2;
        this.f967d = bVar;
    }

    /* JADX INFO: renamed from: a */
    public void m1068a() {
        if (this.f969f) {
            qkq0.a("TabLayoutMediator is already attached");
            return;
        }
        RecyclerView.Adapter<?> adapter = this.f965b.getAdapter();
        this.f968e = adapter;
        if (adapter == null) {
            qkq0.a("TabLayoutMediator attached before ViewPager2 has an adapter");
            return;
        }
        this.f969f = true;
        c cVar = new c(this.f964a);
        this.f971h = cVar;
        this.f965b.g(cVar);
        d dVar = new d(this.f965b, this.f970g);
        this.f972i = dVar;
        this.f964a.addOnTabSelectedListener(dVar);
        if (this.f966c) {
            a aVar = new a();
            this.f973j = aVar;
            this.f968e.registerAdapterDataObserver(aVar);
        }
        m1069b();
        this.f964a.setScrollPosition(this.f965b.getCurrentItem(), 0.0f, true);
    }

    /* JADX INFO: renamed from: b */
    public void m1069b() {
        this.f964a.removeAllTabs();
        RecyclerView.Adapter<?> adapter = this.f968e;
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                TabLayout.Tab tabNewTab = this.f964a.newTab();
                this.f967d.onConfigureTab(tabNewTab, i);
                this.f964a.addTab(tabNewTab, false);
            }
            if (itemCount > 0) {
                int iMin = Math.min(this.f965b.getCurrentItem(), this.f964a.getTabCount() - 1);
                if (iMin != this.f964a.getSelectedTabPosition()) {
                    TabLayout tabLayout = this.f964a;
                    tabLayout.selectTab(tabLayout.getTabAt(iMin));
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.view.a$a */
    public class a extends RecyclerView.i {
        public a() {
        }

        public void onChanged() {
            C0096a.this.m1069b();
        }

        public void onItemRangeChanged(int i, int i2) {
            C0096a.this.m1069b();
        }

        public void onItemRangeInserted(int i, int i2) {
            C0096a.this.m1069b();
        }

        public void onItemRangeMoved(int i, int i2, int i3) {
            C0096a.this.m1069b();
        }

        public void onItemRangeRemoved(int i, int i2) {
            C0096a.this.m1069b();
        }

        public void onItemRangeChanged(int i, int i2, @Nullable Object obj) {
            C0096a.this.m1069b();
        }
    }
}
