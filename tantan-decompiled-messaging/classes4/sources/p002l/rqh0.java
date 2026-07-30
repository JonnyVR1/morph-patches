package p002l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.p000p1.mobile.putong.core.p001ui.profile.exp.ExpProfileEditLinearLayoutManager;
import java.util.List;
import l.j760;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class rqh0 {

    /* JADX INFO: renamed from: a */
    public int f18646a = -1;

    /* JADX INFO: renamed from: b */
    public boolean f18647b = true;

    /* JADX INFO: renamed from: c */
    public boolean f18648c = false;

    /* JADX INFO: renamed from: d */
    public int f18649d = 0;

    /* JADX INFO: renamed from: l.rqh0$b */
    public class C0800b extends RecyclerView.t {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qcf f18652a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ExpProfileEditLinearLayoutManager f18653b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ TabLayout f18654c;

        public C0800b(qcf qcfVar, ExpProfileEditLinearLayoutManager expProfileEditLinearLayoutManager, TabLayout tabLayout) {
            this.f18652a = qcfVar;
            this.f18653b = expProfileEditLinearLayoutManager;
            this.f18654c = tabLayout;
        }

        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0 || i == 1) {
                rqh0.this.f18648c = false;
            }
        }

        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            if (i == 0 && i2 == 0) {
                return;
            }
            List<TabLayout.Tab> listM21163j = this.f18652a.m21163j();
            int iFindFirstCompletelyVisibleItemPosition = this.f18653b.findFirstCompletelyVisibleItemPosition();
            if (this.f18653b.findViewByPosition(iFindFirstCompletelyVisibleItemPosition) != null) {
                rqh0.this.m22103g(listM21163j, this.f18654c, iFindFirstCompletelyVisibleItemPosition);
                return;
            }
            int iFindFirstVisibleItemPosition = this.f18653b.findFirstVisibleItemPosition();
            if (this.f18653b.findViewByPosition(iFindFirstVisibleItemPosition) != null) {
                rqh0.this.m22103g(listM21163j, this.f18654c, iFindFirstVisibleItemPosition);
            }
        }
    }

    public rqh0(qcf qcfVar, TabLayout tabLayout, RecyclerView recyclerView, ExpProfileEditLinearLayoutManager expProfileEditLinearLayoutManager) {
        tabLayout.addOnTabSelectedListener(new C0799a(recyclerView));
        recyclerView.addOnScrollListener(new C0800b(qcfVar, expProfileEditLinearLayoutManager, tabLayout));
    }

    /* JADX INFO: renamed from: g */
    public final void m22103g(List<TabLayout.Tab> list, TabLayout tabLayout, int i) {
        if (this.f18646a != i) {
            this.f18646a = i;
            if (this.f18648c) {
                return;
            }
            this.f18647b = true;
            tabLayout.selectTab(list.get(i));
        }
    }

    /* JADX INFO: renamed from: h */
    public int m22104h() {
        return this.f18649d;
    }

    /* JADX INFO: renamed from: i */
    public final void m22105i(TabLayout.Tab tab) {
        Object tag = tab.getTag();
        if (tag instanceof String) {
            String str = (String) tag;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            zvf0.u("e_edit_profile_tab_new", "p_edit_profile_view", new j760[]{j760.a("tab_source", str)});
        }
    }

    /* JADX INFO: renamed from: l.rqh0$a */
    public class C0799a implements TabLayout.OnTabSelectedListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ RecyclerView f18650a;

        public C0799a(RecyclerView recyclerView) {
            this.f18650a = recyclerView;
        }

        public void onTabSelected(TabLayout.Tab tab) {
            rqh0.this.f18649d = tab.getPosition();
            boolean z = rqh0.this.f18647b;
            rqh0 rqh0Var = rqh0.this;
            if (z) {
                rqh0Var.f18647b = false;
                return;
            }
            rqh0Var.m22105i(tab);
            rqh0.this.f18648c = true;
            this.f18650a.smoothScrollToPosition(tab.getPosition());
        }

        public void onTabUnselected(TabLayout.Tab tab) {
            tab.getPosition();
        }

        public void onTabReselected(TabLayout.Tab tab) {
        }
    }
}
