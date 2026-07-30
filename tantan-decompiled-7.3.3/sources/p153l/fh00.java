package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.MomentActivity;
import com.p051p1.mobile.putong.feed.p065ui.moments.MomentActivitiesAct;
import com.tantanapp.common.utils.NullChecker;
import p151v.VList;

/* JADX INFO: loaded from: classes13.dex */
public class fh00 implements iam<vg00> {

    /* JADX INFO: renamed from: a */
    public LinearLayout f98992a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f98993b;

    /* JADX INFO: renamed from: c */
    public VList f98994c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f98995d;

    /* JADX INFO: renamed from: e */
    public vg00 f98996e;

    /* JADX INFO: renamed from: f */
    public MomentActivitiesAct f98997f;

    /* JADX INFO: renamed from: g */
    public MenuItem f98998g;

    /* JADX INFO: renamed from: h */
    public qg00 f98999h;

    /* JADX INFO: renamed from: i */
    public boolean f99000i = true;

    public fh00(MomentActivitiesAct momentActivitiesAct) {
        this.f98997f = momentActivitiesAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m125540m(View view) {
        m125547k();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f98997f;
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return this.f98997f;
    }

    /* JADX INFO: renamed from: c */
    public View m125541c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return gh00.m130241b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d */
    public View m125542d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return hh00.m135011b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: e */
    public vg60<MomentActivity> m125543e() {
        return this.f98999h.f157370c;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(vg00 vg00Var) {
        this.f98996e = vg00Var;
    }

    /* JADX INFO: renamed from: i */
    public void m125545i(Menu menu) {
        this.f98997f.getMenuInflater().inflate(pfc0.f152169a, menu);
        MenuItem menuItemFindItem = menu.findItem(hdc0.f108853M0);
        this.f98998g = menuItemFindItem;
        if (NullChecker.m82486a(menuItemFindItem)) {
            bnl0.m105509E0(this.f98998g.getActionView(), new View.OnClickListener() { // from class: l.dh00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f88409a.m125540m(view);
                }
            });
        }
        m125546j(this.f99000i);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m125541c(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public final void m125546j(boolean z) {
        if (NullChecker.m82486a(this.f98998g)) {
            View actionView = this.f98998g.getActionView();
            if (NullChecker.m82486a(actionView)) {
                actionView.setEnabled(!z);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m125547k() {
        if (!NullChecker.m82486a(this.f98997f)) {
            return false;
        }
        new mxg(this.f98997f).m160662d(R$string.f39755H3).m160665g(R$string.f39865a).m160667i(R$string.f39983r, new Runnable() { // from class: l.eh00
            @Override // java.lang.Runnable
            public final void run() {
                this.f93995a.m125549n();
            }
        }).show();
        return true;
    }

    /* JADX INFO: renamed from: l */
    public void m125548l(boolean z, vg60<MomentActivity> vg60Var) {
        boolean z2 = !z;
        this.f99000i = z2;
        m125546j(z2);
        bnl0.m105525M0(this.f98994c, z);
        bnl0.m105525M0(this.f98995d, !z);
        this.f98999h.m176430t(vg60Var);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m125549n() {
        FeedModule.f39702c.m61877P2(this.f98999h.f157370c);
    }

    /* JADX INFO: renamed from: r */
    public void m125550r() {
        this.f98997f.setTitle(R$string.f39725C3);
        this.f98999h = new qg00(this.f98997f);
        m125542d(this.f98997f.inflater(), this.f98994c);
        this.f98994c.setVisibility(4);
        this.f98994c.setAdapter((ListAdapter) this.f98999h);
        this.f98994c.setRecyclerListener(this.f98999h);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
