package p007l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.p000p1.mobile.putong.data.Links;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p000p1.mobile.putong.feed.newui.photoalbum.CommonEmptyView;
import com.p1.mobile.putong.app.PutongAct;
import java.util.List;
import l.j760;
import l.s7m;
import p007l.ozi0;
import v.VRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class qzi0<P extends ozi0> implements s7m<P> {

    /* JADX INFO: renamed from: a */
    public SwipeRefreshLayout f12434a;

    /* JADX INFO: renamed from: b */
    public VRecyclerView f12435b;

    /* JADX INFO: renamed from: c */
    public CommonEmptyView f12436c;

    /* JADX INFO: renamed from: d */
    public ozi0 f12437d;

    /* JADX INFO: renamed from: e */
    public PutongAct f12438e;

    /* JADX INFO: renamed from: f */
    public AbstractC2412l6<TopicMoment> f12439f;

    public qzi0(PutongAct putongAct) {
        this.f12438e = putongAct;
    }

    /* JADX INFO: renamed from: f */
    private boolean m13803f() {
        return this.f12439f.m11557C() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m13804i() {
        this.f12437d.m12898y0("suggest");
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m13805C0() {
        return this.f12438e;
    }

    /* JADX INFO: renamed from: b */
    public View m13806b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return rzi0.m13974b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void m13810i1(P p) {
        this.f12437d = p;
    }

    /* JADX INFO: renamed from: d */
    public AbstractC2412l6 m13808d() {
        dzi0 dzi0Var = new dzi0(this.f12438e, this.f12437d);
        this.f12439f = dzi0Var;
        return dzi0Var;
    }

    /* JADX INFO: renamed from: e */
    public void m13809e() {
        if (this.f12434a.i()) {
            this.f12434a.setRefreshing(false);
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m13806b(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m13811j() {
        if (m13803f()) {
            m13816p();
        } else {
            m13817q();
        }
    }

    /* JADX INFO: renamed from: k */
    public void m13812k() {
        this.f12439f.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: l */
    public void m13813l(j760<Links, List<TopicMoment>> j760Var) {
        this.f12439f.m11560H(j760Var);
        if (this.f12434a.i()) {
            this.f12434a.setRefreshing(false);
        }
        m13811j();
    }

    /* JADX INFO: renamed from: m */
    public void m13814m() {
        this.f12434a.setRefreshing(true);
    }

    /* JADX INFO: renamed from: n */
    public void m13815n(int i) {
        this.f12438e.setTitle(i);
    }

    /* JADX INFO: renamed from: p */
    public void m13816p() {
        this.f12435b.setVisibility(8);
        this.f12436c.setVisibility(0);
    }

    /* JADX INFO: renamed from: q */
    public void m13817q() {
        this.f12435b.setVisibility(0);
        this.f12436c.setVisibility(8);
    }

    /* JADX INFO: renamed from: r */
    public void m13818r() {
        this.f12435b.setAdapter(m13808d());
        this.f12436c.f2282b.setText(this.f12438e.getString(R$string.f504d4));
        this.f12434a.setOnRefreshListener(new SwipeRefreshLayout.j() { // from class: l.pzi0
            /* JADX INFO: renamed from: q */
            public final void m13371q() {
                this.f12039a.m13804i();
            }
        });
        this.f12434a.setColorSchemeResources(new int[]{e1c0.f7149k0, e1c0.f7143h0, e1c0.f7145i0, e1c0.f7147j0});
    }

    public void destroy() {
    }
}
