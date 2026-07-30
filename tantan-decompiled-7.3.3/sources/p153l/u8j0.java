package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.feed.newui.photoalbum.CommonEmptyView;
import java.util.List;
import p151v.VRecyclerView;
import p153l.s8j0;

/* JADX INFO: loaded from: classes13.dex */
public class u8j0<P extends s8j0> implements iam<P> {

    /* JADX INFO: renamed from: a */
    public SwipeRefreshLayout f178049a;

    /* JADX INFO: renamed from: b */
    public VRecyclerView f178050b;

    /* JADX INFO: renamed from: c */
    public CommonEmptyView f178051c;

    /* JADX INFO: renamed from: d */
    public s8j0 f178052d;

    /* JADX INFO: renamed from: e */
    public PutongAct f178053e;

    /* JADX INFO: renamed from: f */
    public AbstractC17656i6<TopicMoment> f178054f;

    public u8j0(PutongAct putongAct) {
        this.f178053e = putongAct;
    }

    /* JADX INFO: renamed from: f */
    private boolean m195049f() {
        return this.f178054f.mo29823C() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m195050i() {
        this.f178052d.m185098y0("suggest");
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f178053e;
    }

    /* JADX INFO: renamed from: b */
    public View m195051b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return v8j0.m200309b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(P p) {
        this.f178052d = p;
    }

    /* JADX INFO: renamed from: d */
    public AbstractC17656i6 m195053d() {
        h8j0 h8j0Var = new h8j0(this.f178053e, this.f178052d);
        this.f178054f = h8j0Var;
        return h8j0Var;
    }

    /* JADX INFO: renamed from: e */
    public void m195054e() {
        if (this.f178049a.m4081i()) {
            this.f178049a.setRefreshing(false);
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m195051b(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m195055j() {
        if (m195049f()) {
            m195060p();
        } else {
            m195061q();
        }
    }

    /* JADX INFO: renamed from: k */
    public void m195056k() {
        this.f178054f.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: l */
    public void m195057l(pf60<Links, List<TopicMoment>> pf60Var) {
        this.f178054f.m138793H(pf60Var);
        if (this.f178049a.m4081i()) {
            this.f178049a.setRefreshing(false);
        }
        m195055j();
    }

    /* JADX INFO: renamed from: m */
    public void m195058m() {
        this.f178049a.setRefreshing(true);
    }

    /* JADX INFO: renamed from: n */
    public void m195059n(int i) {
        this.f178053e.setTitle(i);
    }

    /* JADX INFO: renamed from: p */
    public void m195060p() {
        this.f178050b.setVisibility(8);
        this.f178051c.setVisibility(0);
    }

    /* JADX INFO: renamed from: q */
    public void m195061q() {
        this.f178050b.setVisibility(0);
        this.f178051c.setVisibility(8);
    }

    /* JADX INFO: renamed from: r */
    public void m195062r() {
        this.f178050b.setAdapter(m195053d());
        this.f178051c.f41669b.setText(this.f178053e.getString(R$string.f39891d4));
        this.f178049a.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC0702j() { // from class: l.t8j0
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC0702j
            /* JADX INFO: renamed from: p */
            public final void mo4096p() {
                this.f172539a.m195050i();
            }
        });
        this.f178049a.setColorSchemeResources(k9c0.f124516k0, k9c0.f124510h0, k9c0.f124512i0, k9c0.f124514j0);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
