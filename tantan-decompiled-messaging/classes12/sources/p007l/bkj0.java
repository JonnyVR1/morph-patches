package p007l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.core.p001ui.likedusers.tablayout.undolike.UnDoLikedUserFrag;
import com.p1.mobile.putong.core.data.DislikedUsers;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.ckj0;
import l.d30;
import l.s7m;
import l.vwb;
import l.xdl0;
import v.VFrame;
import v.VImage;
import v.VProgressBar;
import v.VPullUpRecyclerView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class bkj0 implements s7m<zjj0> {

    /* JADX INFO: renamed from: a */
    public VFrame f6343a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f6344b;

    /* JADX INFO: renamed from: c */
    public VImage f6345c;

    /* JADX INFO: renamed from: d */
    public VText f6346d;

    /* JADX INFO: renamed from: e */
    public VProgressBar f6347e;

    /* JADX INFO: renamed from: f */
    public VPullUpRecyclerView f6348f;

    /* JADX INFO: renamed from: g */
    public VText f6349g;

    /* JADX INFO: renamed from: h */
    public UnDoLikedUserFrag f6350h;

    /* JADX INFO: renamed from: i */
    public zjj0 f6351i;

    /* JADX INFO: renamed from: j */
    public GridLayoutManager f6352j;

    /* JADX INFO: renamed from: l.bkj0$a */
    public class C2339a extends GridLayoutManager.c {
        public C2339a() {
        }

        /* JADX INFO: renamed from: f */
        public int m8906f(int i) {
            if (bkj0.this.f6350h.m509O4().getItemViewType(i) == 0) {
                return bkj0.this.f6352j.m();
            }
            return 1;
        }
    }

    /* JADX INFO: renamed from: l.bkj0$b */
    public class C2340b extends RecyclerView.t {

        /* JADX INFO: renamed from: a */
        public boolean f6354a;

        /* JADX INFO: renamed from: b */
        public boolean f6355b = false;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ d30 f6356c;

        public C2340b(d30 d30Var) {
            this.f6356c = d30Var;
        }

        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                int iFindLastVisibleItemPosition = NullChecker.a(bkj0.this.f6352j) ? bkj0.this.f6352j.findLastVisibleItemPosition() : -1;
                if (this.f6354a && !this.f6355b && iFindLastVisibleItemPosition >= 16) {
                    this.f6355b = true;
                    this.f6356c.call();
                    return;
                }
                int childCount = bkj0.this.f6352j.getChildCount();
                if (!this.f6354a || this.f6355b || childCount <= 0 || iFindLastVisibleItemPosition < bkj0.this.f6352j.getItemCount() - 1 || bkj0.this.f6352j.getItemCount() < childCount || recyclerView.getChildAt(childCount - 1).getBottom() > recyclerView.getBottom() || recyclerView.canScrollVertically(1)) {
                    return;
                }
                this.f6355b = true;
                this.f6356c.call();
            }
        }

        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            this.f6354a = i2 > 0;
        }
    }

    public bkj0(UnDoLikedUserFrag unDoLikedUserFrag) {
        this.f6350h = unDoLikedUserFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m8894f(View view) {
        this.f6351i.m17492F0("p_navigation_disliked,card_button_pull");
    }

    /* JADX INFO: renamed from: l */
    private void m8895l(d30 d30Var) {
        this.f6348f.addOnScrollListener(new C2340b(d30Var));
    }

    @NonNull
    /* JADX INFO: renamed from: C0 */
    public Context m8896C0() {
        return this.f6350h.act();
    }

    /* JADX INFO: renamed from: b */
    public View m8897b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ckj0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void m8902i1(zjj0 zjj0Var) {
        this.f6351i = zjj0Var;
    }

    /* JADX INFO: renamed from: d */
    public void m8899d(boolean z, boolean z2) {
        if (z) {
            this.f6343a.setVisibility(0);
            this.f6344b.setVisibility(4);
            this.f6347e.setVisibility(0);
            this.f6348f.setVisibility(4);
            return;
        }
        VFrame vFrame = this.f6343a;
        if (!z2) {
            vFrame.setVisibility(4);
            this.f6344b.setVisibility(4);
            this.f6347e.setVisibility(4);
            this.f6348f.setVisibility(0);
            return;
        }
        vFrame.setVisibility(0);
        this.f6344b.setVisibility(0);
        this.f6347e.setVisibility(4);
        this.f6348f.setVisibility(4);
        this.f6346d.setText("还没有无感的人，快去滑卡寻找新朋友吧！");
    }

    /* JADX INFO: renamed from: e */
    public void m8900e(d30 d30Var) {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f6350h.act(), 2);
        this.f6352j = gridLayoutManager;
        gridLayoutManager.v(new C2339a());
        this.f6348f.setLayoutManager(this.f6352j);
        this.f6348f.setAdapter(this.f6350h.m509O4());
        m8895l(d30Var);
    }

    /* JADX INFO: renamed from: i */
    public void m8901i(boolean z) {
        m8905m(!z);
        this.f6350h.m509O4().m10952M(z);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m8897b(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m8903j() {
        xdl0.E0(this.f6349g, new View.OnClickListener() { // from class: l.akj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5766a.m8894f(view);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public void m8904k(List<DislikedUsers> list, boolean z) {
        if ((vwb.J(list) ? 0 : list.size()) == 0) {
            m8899d(false, true);
            m8905m(!z);
        } else {
            m8899d(false, false);
            this.f6350h.m509O4().m10954O(list, z);
            m8905m(!z);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m8905m(boolean z) {
        xdl0.M(this.f6349g, z);
    }

    public void destroy() {
    }
}
