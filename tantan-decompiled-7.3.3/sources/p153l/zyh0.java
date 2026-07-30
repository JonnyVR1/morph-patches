package p153l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.putong.core.p058ui.profile.exp.ExpProfileEditLinearLayoutManager;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class zyh0 {

    /* JADX INFO: renamed from: a */
    public int f206593a = -1;

    /* JADX INFO: renamed from: b */
    public boolean f206594b = true;

    /* JADX INFO: renamed from: c */
    public boolean f206595c = false;

    /* JADX INFO: renamed from: d */
    public int f206596d = 0;

    /* JADX INFO: renamed from: l.zyh0$b */
    public class C21930b extends RecyclerView.AbstractC0584t {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ wdf f206599a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ExpProfileEditLinearLayoutManager f206600b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ TabLayout f206601c;

        public C21930b(wdf wdfVar, ExpProfileEditLinearLayoutManager expProfileEditLinearLayoutManager, TabLayout tabLayout) {
            this.f206599a = wdfVar;
            this.f206600b = expProfileEditLinearLayoutManager;
            this.f206601c = tabLayout;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0 || i == 1) {
                zyh0.this.f206595c = false;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            if (i == 0 && i2 == 0) {
                return;
            }
            List<TabLayout.Tab> listM205876j = this.f206599a.m205876j();
            int iFindFirstCompletelyVisibleItemPosition = this.f206600b.findFirstCompletelyVisibleItemPosition();
            if (this.f206600b.findViewByPosition(iFindFirstCompletelyVisibleItemPosition) != null) {
                zyh0.this.m222120g(listM205876j, this.f206601c, iFindFirstCompletelyVisibleItemPosition);
                return;
            }
            int iFindFirstVisibleItemPosition = this.f206600b.findFirstVisibleItemPosition();
            if (this.f206600b.findViewByPosition(iFindFirstVisibleItemPosition) != null) {
                zyh0.this.m222120g(listM205876j, this.f206601c, iFindFirstVisibleItemPosition);
            }
        }
    }

    public zyh0(wdf wdfVar, TabLayout tabLayout, RecyclerView recyclerView, ExpProfileEditLinearLayoutManager expProfileEditLinearLayoutManager) {
        tabLayout.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C21929a(recyclerView));
        recyclerView.addOnScrollListener(new C21930b(wdfVar, expProfileEditLinearLayoutManager, tabLayout));
    }

    /* JADX INFO: renamed from: g */
    public final void m222120g(List<TabLayout.Tab> list, TabLayout tabLayout, int i) {
        if (this.f206593a != i) {
            this.f206593a = i;
            if (this.f206595c) {
                return;
            }
            this.f206594b = true;
            tabLayout.selectTab(list.get(i));
        }
    }

    /* JADX INFO: renamed from: h */
    public int m222121h() {
        return this.f206596d;
    }

    /* JADX INFO: renamed from: i */
    public final void m222122i(TabLayout.Tab tab) {
        Object tag = tab.getTag();
        if (tag instanceof String) {
            String str = (String) tag;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            i4g0.m138523u("e_edit_profile_tab_new", "p_edit_profile_view", pf60.m172085a("tab_source", str));
        }
    }

    /* JADX INFO: renamed from: l.zyh0$a */
    public class C21929a implements TabLayout.OnTabSelectedListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ RecyclerView f206597a;

        public C21929a(RecyclerView recyclerView) {
            this.f206597a = recyclerView;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            zyh0.this.f206596d = tab.getPosition();
            boolean z = zyh0.this.f206594b;
            zyh0 zyh0Var = zyh0.this;
            if (z) {
                zyh0Var.f206594b = false;
                return;
            }
            zyh0Var.m222122i(tab);
            zyh0.this.f206595c = true;
            this.f206597a.smoothScrollToPosition(tab.getPosition());
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            tab.getPosition();
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }
    }
}
