package p149l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.putong.core.p053ui.profile.exp.ExpProfileEditLinearLayoutManager;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class rqh0 {

    /* JADX INFO: renamed from: a */
    public int f160645a = -1;

    /* JADX INFO: renamed from: b */
    public boolean f160646b = true;

    /* JADX INFO: renamed from: c */
    public boolean f160647c = false;

    /* JADX INFO: renamed from: d */
    public int f160648d = 0;

    /* JADX INFO: renamed from: l.rqh0$b */
    public class C19758b extends RecyclerView.AbstractC0582t {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qcf f160651a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ExpProfileEditLinearLayoutManager f160652b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ TabLayout f160653c;

        public C19758b(qcf qcfVar, ExpProfileEditLinearLayoutManager expProfileEditLinearLayoutManager, TabLayout tabLayout) {
            this.f160651a = qcfVar;
            this.f160652b = expProfileEditLinearLayoutManager;
            this.f160653c = tabLayout;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0 || i == 1) {
                rqh0.this.f160647c = false;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            if (i == 0 && i2 == 0) {
                return;
            }
            List<TabLayout.Tab> listM173877j = this.f160651a.m173877j();
            int iFindFirstCompletelyVisibleItemPosition = this.f160652b.findFirstCompletelyVisibleItemPosition();
            if (this.f160652b.findViewByPosition(iFindFirstCompletelyVisibleItemPosition) != null) {
                rqh0.this.m180449g(listM173877j, this.f160653c, iFindFirstCompletelyVisibleItemPosition);
                return;
            }
            int iFindFirstVisibleItemPosition = this.f160652b.findFirstVisibleItemPosition();
            if (this.f160652b.findViewByPosition(iFindFirstVisibleItemPosition) != null) {
                rqh0.this.m180449g(listM173877j, this.f160653c, iFindFirstVisibleItemPosition);
            }
        }
    }

    public rqh0(qcf qcfVar, TabLayout tabLayout, RecyclerView recyclerView, ExpProfileEditLinearLayoutManager expProfileEditLinearLayoutManager) {
        tabLayout.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C19757a(recyclerView));
        recyclerView.addOnScrollListener(new C19758b(qcfVar, expProfileEditLinearLayoutManager, tabLayout));
    }

    /* JADX INFO: renamed from: g */
    public final void m180449g(List<TabLayout.Tab> list, TabLayout tabLayout, int i) {
        if (this.f160645a != i) {
            this.f160645a = i;
            if (this.f160647c) {
                return;
            }
            this.f160646b = true;
            tabLayout.selectTab(list.get(i));
        }
    }

    /* JADX INFO: renamed from: h */
    public int m180450h() {
        return this.f160648d;
    }

    /* JADX INFO: renamed from: i */
    public final void m180451i(TabLayout.Tab tab) {
        Object tag = tab.getTag();
        if (tag instanceof String) {
            String str = (String) tag;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            zvf0.m220399u("e_edit_profile_tab_new", "p_edit_profile_view", j760.m140076a("tab_source", str));
        }
    }

    /* JADX INFO: renamed from: l.rqh0$a */
    public class C19757a implements TabLayout.OnTabSelectedListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ RecyclerView f160649a;

        public C19757a(RecyclerView recyclerView) {
            this.f160649a = recyclerView;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            rqh0.this.f160648d = tab.getPosition();
            boolean z = rqh0.this.f160646b;
            rqh0 rqh0Var = rqh0.this;
            if (z) {
                rqh0Var.f160646b = false;
                return;
            }
            rqh0Var.m180451i(tab);
            rqh0.this.f160647c = true;
            this.f160649a.smoothScrollToPosition(tab.getPosition());
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
