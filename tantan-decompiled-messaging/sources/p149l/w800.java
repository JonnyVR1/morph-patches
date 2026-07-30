package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.MomentActivity;
import com.p046p1.mobile.putong.feed.p060ui.moments.MomentActivitiesAct;
import com.tantanapp.common.utils.NullChecker;
import p147v.VList;

/* JADX INFO: loaded from: classes12.dex */
public class w800 implements s7m<m800> {

    /* JADX INFO: renamed from: a */
    public LinearLayout f185124a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f185125b;

    /* JADX INFO: renamed from: c */
    public VList f185126c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f185127d;

    /* JADX INFO: renamed from: e */
    public m800 f185128e;

    /* JADX INFO: renamed from: f */
    public MomentActivitiesAct f185129f;

    /* JADX INFO: renamed from: g */
    public MenuItem f185130g;

    /* JADX INFO: renamed from: h */
    public h800 f185131h;

    /* JADX INFO: renamed from: i */
    public boolean f185132i = true;

    public w800(MomentActivitiesAct momentActivitiesAct) {
        this.f185129f = momentActivitiesAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m202089m(View view) {
        m202096k();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f185129f;
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return this.f185129f;
    }

    /* JADX INFO: renamed from: c */
    public View m202090c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return x800.m207359b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d */
    public View m202091d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return y800.m213343b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: e */
    public q860<MomentActivity> m202092e() {
        return this.f185131h.f106364c;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(m800 m800Var) {
        this.f185128e = m800Var;
    }

    /* JADX INFO: renamed from: i */
    public void m202094i(Menu menu) {
        this.f185129f.getMenuInflater().inflate(l7c0.f126712a, menu);
        MenuItem menuItemFindItem = menu.findItem(b5c0.f73500M0);
        this.f185130g = menuItemFindItem;
        if (NullChecker.m81303a(menuItemFindItem)) {
            xdl0.m208329E0(this.f185130g.getActionView(), new View.OnClickListener() { // from class: l.u800
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f175088a.m202089m(view);
                }
            });
        }
        m202095j(this.f185132i);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m202090c(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public final void m202095j(boolean z) {
        if (NullChecker.m81303a(this.f185130g)) {
            View actionView = this.f185130g.getActionView();
            if (NullChecker.m81303a(actionView)) {
                actionView.setEnabled(!z);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m202096k() {
        if (!NullChecker.m81303a(this.f185129f)) {
            return false;
        }
        new xvg(this.f185129f).m211285d(R$string.f38907H3).m211288g(R$string.f39017a).m211290i(R$string.f39135r, new Runnable() { // from class: l.v800
            @Override // java.lang.Runnable
            public final void run() {
                this.f180440a.m202098n();
            }
        }).show();
        return true;
    }

    /* JADX INFO: renamed from: l */
    public void m202097l(boolean z, q860<MomentActivity> q860Var) {
        boolean z2 = !z;
        this.f185132i = z2;
        m202095j(z2);
        xdl0.m208345M0(this.f185126c, z);
        xdl0.m208345M0(this.f185127d, !z);
        this.f185131h.m129808t(q860Var);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m202098n() {
        FeedModule.f38854c.m60693P2(this.f185131h.f106364c);
    }

    /* JADX INFO: renamed from: r */
    public void m202099r() {
        this.f185129f.setTitle(R$string.f38877C3);
        this.f185131h = new h800(this.f185129f);
        m202091d(this.f185129f.inflater(), this.f185126c);
        this.f185126c.setVisibility(4);
        this.f185126c.setAdapter((ListAdapter) this.f185131h);
        this.f185126c.setRecyclerListener(this.f185131h);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
