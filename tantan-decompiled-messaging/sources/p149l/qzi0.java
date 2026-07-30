package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.feed.newui.photoalbum.CommonEmptyView;
import java.util.List;
import p147v.VRecyclerView;
import p149l.ozi0;

/* JADX INFO: loaded from: classes12.dex */
public class qzi0<P extends ozi0> implements s7m<P> {

    /* JADX INFO: renamed from: a */
    public SwipeRefreshLayout f157050a;

    /* JADX INFO: renamed from: b */
    public VRecyclerView f157051b;

    /* JADX INFO: renamed from: c */
    public CommonEmptyView f157052c;

    /* JADX INFO: renamed from: d */
    public ozi0 f157053d;

    /* JADX INFO: renamed from: e */
    public PutongAct f157054e;

    /* JADX INFO: renamed from: f */
    public AbstractC18153l6<TopicMoment> f157055f;

    public qzi0(PutongAct putongAct) {
        this.f157054e = putongAct;
    }

    /* JADX INFO: renamed from: f */
    private boolean m177203f() {
        return this.f157055f.mo28824C() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m177204i() {
        this.f157053d.m166863y0("suggest");
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f157054e;
    }

    /* JADX INFO: renamed from: b */
    public View m177205b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return rzi0.m181756b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(P p) {
        this.f157053d = p;
    }

    /* JADX INFO: renamed from: d */
    public AbstractC18153l6 m177207d() {
        dzi0 dzi0Var = new dzi0(this.f157054e, this.f157053d);
        this.f157055f = dzi0Var;
        return dzi0Var;
    }

    /* JADX INFO: renamed from: e */
    public void m177208e() {
        if (this.f157050a.m4079i()) {
            this.f157050a.setRefreshing(false);
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m177205b(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m177209j() {
        if (m177203f()) {
            m177214p();
        } else {
            m177215q();
        }
    }

    /* JADX INFO: renamed from: k */
    public void m177210k() {
        this.f157055f.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: l */
    public void m177211l(j760<Links, List<TopicMoment>> j760Var) {
        this.f157055f.m148684H(j760Var);
        if (this.f157050a.m4079i()) {
            this.f157050a.setRefreshing(false);
        }
        m177209j();
    }

    /* JADX INFO: renamed from: m */
    public void m177212m() {
        this.f157050a.setRefreshing(true);
    }

    /* JADX INFO: renamed from: n */
    public void m177213n(int i) {
        this.f157054e.setTitle(i);
    }

    /* JADX INFO: renamed from: p */
    public void m177214p() {
        this.f157051b.setVisibility(8);
        this.f157052c.setVisibility(0);
    }

    /* JADX INFO: renamed from: q */
    public void m177215q() {
        this.f157051b.setVisibility(0);
        this.f157052c.setVisibility(8);
    }

    /* JADX INFO: renamed from: r */
    public void m177216r() {
        this.f157051b.setAdapter(m177207d());
        this.f157052c.f40821b.setText(this.f157054e.getString(R$string.f39043d4));
        this.f157050a.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC0700j() { // from class: l.pzi0
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC0700j
            /* JADX INFO: renamed from: q */
            public final void mo4094q() {
                this.f151957a.m177204i();
            }
        });
        this.f157050a.setColorSchemeResources(e1c0.f88793k0, e1c0.f88787h0, e1c0.f88789i0, e1c0.f88791j0);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
