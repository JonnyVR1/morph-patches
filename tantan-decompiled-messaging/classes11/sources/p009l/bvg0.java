package p009l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.k;
import com.p000p1.mobile.putong.core.newui.suggest.SuggestersAct;
import com.p1.mobile.putong.core.data.ActionPageFormat;
import com.p1.mobile.putong.core.data.CardPattern;
import l.cvg0;
import l.s7m;
import l.x2c0;
import v.VPullUpRecyclerView;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class bvg0 implements s7m<avg0> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f10324a;

    /* JADX INFO: renamed from: b */
    public VPullUpRecyclerView f10325b;

    /* JADX INFO: renamed from: c */
    public avg0 f10326c;

    /* JADX INFO: renamed from: d */
    public SuggestersAct f10327d;

    /* JADX INFO: renamed from: e */
    public mug0 f10328e;

    /* JADX INFO: renamed from: l.bvg0$a */
    public class C0793a extends GridLayoutManager.c {
        public C0793a() {
        }

        /* JADX INFO: renamed from: f */
        public int m12288f(int i) {
            return i == 0 ? 2 : 1;
        }
    }

    public bvg0(SuggestersAct suggestersAct) {
        this.f10327d = suggestersAct;
    }

    /* JADX INFO: renamed from: r */
    private void m12280r() {
        this.f10324a.setLeftIconAsBack(this.f10327d);
        this.f10324a.setLeftIconResource(x2c0.O);
        this.f10324a.setRightIconClip(false);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f10327d, 2);
        gridLayoutManager.v(new C0793a());
        this.f10325b.setLayoutManager(gridLayoutManager);
        this.f10325b.setPullUpInterval(300L);
        new k(this.f10326c.m11665j0()).g(this.f10325b);
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m12281C0() {
        return this.f10327d;
    }

    /* JADX INFO: renamed from: a */
    public View m12282a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return cvg0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void m12287i1(avg0 avg0Var) {
        this.f10326c = avg0Var;
    }

    /* JADX INFO: renamed from: c */
    public void m12284c(CardPattern cardPattern) {
        int iM18645M = this.f10328e.m18645M(cardPattern);
        if (iM18645M >= 1) {
            this.f10328e.notifyItemChanged(iM18645M);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m12285d(CardPattern cardPattern) {
        int iM18646N = this.f10328e.m18646N(cardPattern);
        if (iM18646N >= 1) {
            this.f10328e.notifyItemRemoved(iM18646N);
            mug0 mug0Var = this.f10328e;
            mug0Var.notifyItemRangeChanged(iM18646N, mug0Var.m18638C());
        }
    }

    /* JADX INFO: renamed from: e */
    public void m12286e(ActionPageFormat actionPageFormat) {
        this.f10324a.setTitle(actionPageFormat.pageTitle);
        if (this.f10328e == null) {
            mug0 mug0Var = new mug0(this.f10326c);
            this.f10328e = mug0Var;
            this.f10325b.setAdapter(mug0Var);
        }
        this.f10328e.m18647O(actionPageFormat.cardPatterns);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM12282a = m12282a(layoutInflater, viewGroup);
        m12280r();
        return viewM12282a;
    }

    public void destroy() {
    }
}
