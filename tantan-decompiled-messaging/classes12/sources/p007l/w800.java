package p007l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.MomentActivity;
import com.p000p1.mobile.putong.feed.p005ui.moments.MomentActivitiesAct;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import l.q860;
import l.s7m;
import l.xdl0;
import v.VList;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class w800 implements s7m<m800> {

    /* JADX INFO: renamed from: a */
    public LinearLayout f14451a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f14452b;

    /* JADX INFO: renamed from: c */
    public VList f14453c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f14454d;

    /* JADX INFO: renamed from: e */
    public m800 f14455e;

    /* JADX INFO: renamed from: f */
    public MomentActivitiesAct f14456f;

    /* JADX INFO: renamed from: g */
    public MenuItem f14457g;

    /* JADX INFO: renamed from: h */
    public h800 f14458h;

    /* JADX INFO: renamed from: i */
    public boolean f14459i = true;

    public w800(MomentActivitiesAct momentActivitiesAct) {
        this.f14456f = momentActivitiesAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m15730m(View view) {
        m15739k();
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m15731C0() {
        return this.f14456f;
    }

    @Nullable
    public Act act() {
        return this.f14456f;
    }

    /* JADX INFO: renamed from: c */
    public View m15732c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return x800.m16035b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d */
    public View m15733d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return y800.m16968b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: e */
    public q860<MomentActivity> m15734e() {
        return this.f14458h.f8622c;
    }

    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void m15737i1(m800 m800Var) {
        this.f14455e = m800Var;
    }

    /* JADX INFO: renamed from: i */
    public void m15736i(Menu menu) {
        this.f14456f.getMenuInflater().inflate(l7c0.f9912a, menu);
        MenuItem menuItemFindItem = menu.findItem(b5c0.f5981M0);
        this.f14457g = menuItemFindItem;
        if (NullChecker.a(menuItemFindItem)) {
            xdl0.E0(this.f14457g.getActionView(), new View.OnClickListener() { // from class: l.u800
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f13586a.m15730m(view);
                }
            });
        }
        m15738j(this.f14459i);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m15732c(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public final void m15738j(boolean z) {
        if (NullChecker.a(this.f14457g)) {
            View actionView = this.f14457g.getActionView();
            if (NullChecker.a(actionView)) {
                actionView.setEnabled(!z);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m15739k() {
        if (!NullChecker.a(this.f14456f)) {
            return false;
        }
        new xvg(this.f14456f).m16858d(R$string.f368H3).m16861g(R$string.f478a).m16863i(R$string.f596r, new Runnable() { // from class: l.v800
            @Override // java.lang.Runnable
            public final void run() {
                this.f14092a.m15741n();
            }
        }).show();
        return true;
    }

    /* JADX INFO: renamed from: l */
    public void m15740l(boolean z, q860<MomentActivity> q860Var) {
        boolean z2 = !z;
        this.f14459i = z2;
        m15738j(z2);
        xdl0.M0(this.f14453c, z);
        xdl0.M0(this.f14454d, !z);
        this.f14458h.m10562t(q860Var);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m15741n() {
        FeedModule.f315c.m1619P2(this.f14458h.f8622c);
    }

    /* JADX INFO: renamed from: r */
    public void m15742r() {
        this.f14456f.setTitle(R$string.f338C3);
        this.f14458h = new h800(this.f14456f);
        m15733d(this.f14456f.inflater(), this.f14453c);
        this.f14453c.setVisibility(4);
        this.f14453c.setAdapter(this.f14458h);
        this.f14453c.setRecyclerListener(this.f14458h);
    }

    public void destroy() {
    }
}
