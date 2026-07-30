package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.core.data.DislikedUsers;
import com.p051p1.mobile.putong.core.p058ui.likedusers.tablayout.undolike.UnDoLikedUserFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VFrame;
import p151v.VImage;
import p151v.VProgressBar;
import p151v.VPullUpRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class etj0 implements iam<ctj0> {

    /* JADX INFO: renamed from: a */
    public VFrame f95760a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f95761b;

    /* JADX INFO: renamed from: c */
    public VImage f95762c;

    /* JADX INFO: renamed from: d */
    public VText f95763d;

    /* JADX INFO: renamed from: e */
    public VProgressBar f95764e;

    /* JADX INFO: renamed from: f */
    public VPullUpRecyclerView f95765f;

    /* JADX INFO: renamed from: g */
    public VText f95766g;

    /* JADX INFO: renamed from: h */
    public UnDoLikedUserFrag f95767h;

    /* JADX INFO: renamed from: i */
    public ctj0 f95768i;

    /* JADX INFO: renamed from: j */
    public GridLayoutManager f95769j;

    /* JADX INFO: renamed from: l.etj0$a */
    public class C16827a extends GridLayoutManager.AbstractC0554c {
        public C16827a() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0554c
        /* JADX INFO: renamed from: f */
        public int mo3330f(int i) {
            if (etj0.this.f95767h.m48012O4().getItemViewType(i) == 0) {
                return etj0.this.f95769j.m3318m();
            }
            return 1;
        }
    }

    /* JADX INFO: renamed from: l.etj0$b */
    public class C16828b extends RecyclerView.AbstractC0584t {

        /* JADX INFO: renamed from: a */
        public boolean f95771a;

        /* JADX INFO: renamed from: b */
        public boolean f95772b = false;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ x20 f95773c;

        public C16828b(x20 x20Var) {
            this.f95773c = x20Var;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                int iFindLastVisibleItemPosition = NullChecker.m82486a(etj0.this.f95769j) ? etj0.this.f95769j.findLastVisibleItemPosition() : -1;
                if (this.f95771a && !this.f95772b && iFindLastVisibleItemPosition >= 16) {
                    this.f95772b = true;
                    this.f95773c.call();
                    return;
                }
                int childCount = etj0.this.f95769j.getChildCount();
                if (!this.f95771a || this.f95772b || childCount <= 0 || iFindLastVisibleItemPosition < etj0.this.f95769j.getItemCount() - 1 || etj0.this.f95769j.getItemCount() < childCount || recyclerView.getChildAt(childCount - 1).getBottom() > recyclerView.getBottom() || recyclerView.canScrollVertically(1)) {
                    return;
                }
                this.f95772b = true;
                this.f95773c.call();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            this.f95771a = i2 > 0;
        }
    }

    public etj0(UnDoLikedUserFrag unDoLikedUserFrag) {
        this.f95767h = unDoLikedUserFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m122463f(View view) {
        this.f95768i.m112510F0("p_navigation_disliked,card_button_pull");
    }

    /* JADX INFO: renamed from: l */
    private void m122464l(x20 x20Var) {
        this.f95765f.addOnScrollListener(new C16828b(x20Var));
    }

    @Override // p153l.iam
    @NonNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f95767h.act();
    }

    /* JADX INFO: renamed from: b */
    public View m122465b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ftj0.m127325b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(ctj0 ctj0Var) {
        this.f95768i = ctj0Var;
    }

    /* JADX INFO: renamed from: d */
    public void m122467d(boolean z, boolean z2) {
        if (z) {
            this.f95760a.setVisibility(0);
            this.f95761b.setVisibility(4);
            this.f95764e.setVisibility(0);
            this.f95765f.setVisibility(4);
            return;
        }
        VFrame vFrame = this.f95760a;
        if (!z2) {
            vFrame.setVisibility(4);
            this.f95761b.setVisibility(4);
            this.f95764e.setVisibility(4);
            this.f95765f.setVisibility(0);
            return;
        }
        vFrame.setVisibility(0);
        this.f95761b.setVisibility(0);
        this.f95764e.setVisibility(4);
        this.f95765f.setVisibility(4);
        this.f95763d.setText("还没有无感的人，快去滑卡寻找新朋友吧！");
    }

    /* JADX INFO: renamed from: e */
    public void m122468e(x20 x20Var) {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f95767h.act(), 2);
        this.f95769j = gridLayoutManager;
        gridLayoutManager.m3327v(new C16827a());
        this.f95765f.setLayoutManager(this.f95769j);
        this.f95765f.setAdapter(this.f95767h.m48012O4());
        m122464l(x20Var);
    }

    /* JADX INFO: renamed from: i */
    public void m122469i(boolean z) {
        m122472m(!z);
        this.f95767h.m48012O4().m155709M(z);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m122465b(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m122470j() {
        bnl0.m105509E0(this.f95766g, new View.OnClickListener() { // from class: l.dtj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f90602a.m122463f(view);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public void m122471k(List<DislikedUsers> list, boolean z) {
        if ((jyb.m147479J(list) ? 0 : list.size()) == 0) {
            m122467d(false, true);
            m122472m(!z);
        } else {
            m122467d(false, false);
            this.f95767h.m48012O4().m155711O(list, z);
            m122472m(!z);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m122472m(boolean z) {
        bnl0.m105524M(this.f95766g, z);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
