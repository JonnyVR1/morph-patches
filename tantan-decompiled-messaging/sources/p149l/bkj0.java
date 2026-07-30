package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.core.data.DislikedUsers;
import com.p046p1.mobile.putong.core.p053ui.likedusers.tablayout.undolike.UnDoLikedUserFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VFrame;
import p147v.VImage;
import p147v.VProgressBar;
import p147v.VPullUpRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class bkj0 implements s7m<zjj0> {

    /* JADX INFO: renamed from: a */
    public VFrame f76033a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f76034b;

    /* JADX INFO: renamed from: c */
    public VImage f76035c;

    /* JADX INFO: renamed from: d */
    public VText f76036d;

    /* JADX INFO: renamed from: e */
    public VProgressBar f76037e;

    /* JADX INFO: renamed from: f */
    public VPullUpRecyclerView f76038f;

    /* JADX INFO: renamed from: g */
    public VText f76039g;

    /* JADX INFO: renamed from: h */
    public UnDoLikedUserFrag f76040h;

    /* JADX INFO: renamed from: i */
    public zjj0 f76041i;

    /* JADX INFO: renamed from: j */
    public GridLayoutManager f76042j;

    /* JADX INFO: renamed from: l.bkj0$a */
    public class C15891a extends GridLayoutManager.AbstractC0553c {
        public C15891a() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0553c
        /* JADX INFO: renamed from: f */
        public int mo3329f(int i) {
            if (bkj0.this.f76040h.m46829O4().getItemViewType(i) == 0) {
                return bkj0.this.f76042j.m3317m();
            }
            return 1;
        }
    }

    /* JADX INFO: renamed from: l.bkj0$b */
    public class C15892b extends RecyclerView.AbstractC0582t {

        /* JADX INFO: renamed from: a */
        public boolean f76044a;

        /* JADX INFO: renamed from: b */
        public boolean f76045b = false;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ d30 f76046c;

        public C15892b(d30 d30Var) {
            this.f76046c = d30Var;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                int iFindLastVisibleItemPosition = NullChecker.m81303a(bkj0.this.f76042j) ? bkj0.this.f76042j.findLastVisibleItemPosition() : -1;
                if (this.f76044a && !this.f76045b && iFindLastVisibleItemPosition >= 16) {
                    this.f76045b = true;
                    this.f76046c.call();
                    return;
                }
                int childCount = bkj0.this.f76042j.getChildCount();
                if (!this.f76044a || this.f76045b || childCount <= 0 || iFindLastVisibleItemPosition < bkj0.this.f76042j.getItemCount() - 1 || bkj0.this.f76042j.getItemCount() < childCount || recyclerView.getChildAt(childCount - 1).getBottom() > recyclerView.getBottom() || recyclerView.canScrollVertically(1)) {
                    return;
                }
                this.f76045b = true;
                this.f76046c.call();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            this.f76044a = i2 > 0;
        }
    }

    public bkj0(UnDoLikedUserFrag unDoLikedUserFrag) {
        this.f76040h = unDoLikedUserFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m102402f(View view) {
        this.f76041i.m219116F0("p_navigation_disliked,card_button_pull");
    }

    /* JADX INFO: renamed from: l */
    private void m102403l(d30 d30Var) {
        this.f76038f.addOnScrollListener(new C15892b(d30Var));
    }

    @Override // p149l.s7m
    @NonNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f76040h.act();
    }

    /* JADX INFO: renamed from: b */
    public View m102404b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ckj0.m107418b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(zjj0 zjj0Var) {
        this.f76041i = zjj0Var;
    }

    /* JADX INFO: renamed from: d */
    public void m102406d(boolean z, boolean z2) {
        if (z) {
            this.f76033a.setVisibility(0);
            this.f76034b.setVisibility(4);
            this.f76037e.setVisibility(0);
            this.f76038f.setVisibility(4);
            return;
        }
        VFrame vFrame = this.f76033a;
        if (!z2) {
            vFrame.setVisibility(4);
            this.f76034b.setVisibility(4);
            this.f76037e.setVisibility(4);
            this.f76038f.setVisibility(0);
            return;
        }
        vFrame.setVisibility(0);
        this.f76034b.setVisibility(0);
        this.f76037e.setVisibility(4);
        this.f76038f.setVisibility(4);
        this.f76036d.setText("还没有无感的人，快去滑卡寻找新朋友吧！");
    }

    /* JADX INFO: renamed from: e */
    public void m102407e(d30 d30Var) {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f76040h.act(), 2);
        this.f76042j = gridLayoutManager;
        gridLayoutManager.m3326v(new C15891a());
        this.f76038f.setLayoutManager(this.f76042j);
        this.f76038f.setAdapter(this.f76040h.m46829O4());
        m102403l(d30Var);
    }

    /* JADX INFO: renamed from: i */
    public void m102408i(boolean z) {
        m102411m(!z);
        this.f76040h.m46829O4().m136621M(z);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m102404b(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m102409j() {
        xdl0.m208329E0(this.f76039g, new View.OnClickListener() { // from class: l.akj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f70280a.m102402f(view);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public void m102410k(List<DislikedUsers> list, boolean z) {
        if ((vwb.m200296J(list) ? 0 : list.size()) == 0) {
            m102406d(false, true);
            m102411m(!z);
        } else {
            m102406d(false, false);
            this.f76040h.m46829O4().m136623O(list, z);
            m102411m(!z);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m102411m(boolean z) {
        xdl0.m208344M(this.f76039g, z);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
