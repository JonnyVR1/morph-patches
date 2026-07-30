package p153l;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import java.util.List;
import p151v.VFrame;
import p151v.VSwitchButton;

/* JADX INFO: loaded from: classes5.dex */
public class zvm0 implements iam<wvm0> {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f206256a;

    /* JADX INFO: renamed from: b */
    public TextView f206257b;

    /* JADX INFO: renamed from: c */
    public TextView f206258c;

    /* JADX INFO: renamed from: d */
    public VFrame f206259d;

    /* JADX INFO: renamed from: e */
    public VSwitchButton f206260e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f206261f;

    /* JADX INFO: renamed from: g */
    public View f206262g;

    /* JADX INFO: renamed from: h */
    public RecyclerView f206263h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f206264i;

    /* JADX INFO: renamed from: j */
    public wvm0 f206265j;

    /* JADX INFO: renamed from: k */
    public View f206266k;

    /* JADX INFO: renamed from: l */
    public LiveBaseAdapter f206267l;

    public zvm0(Act act) {
        this.f206266k = m221792c(LayoutInflater.from(act), null);
        m221791r();
    }

    /* JADX INFO: renamed from: e */
    private void m221789e() {
        boolean z = this.f206267l.m68538J().size() == 0;
        bnl0.m105524M(this.f206264i, z);
        bnl0.m105524M(this.f206261f, !z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m221790j(View view) {
        this.f206265j.m208100q4(!this.f206260e.isChecked());
    }

    /* JADX INFO: renamed from: r */
    private void m221791r() {
        RecyclerView recyclerView = this.f206263h;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        LiveBaseAdapter liveBaseAdapter = new LiveBaseAdapter();
        this.f206267l = liveBaseAdapter;
        this.f206263h.setAdapter(liveBaseAdapter);
        bnl0.m105509E0(this.f206259d, new View.OnClickListener() { // from class: l.xvm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f196410a.m221790j(view);
            }
        });
        m221789e();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f206265j.act();
    }

    /* JADX INFO: renamed from: c */
    public View m221792c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return awm0.m100676b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(wvm0 wvm0Var) {
        this.f206265j = wvm0Var;
    }

    /* JADX INFO: renamed from: f */
    public final bvm0 m221794f(final BLiveVoiceCall bLiveVoiceCall) {
        d3q d3qVar = (d3q) jyb.m147529r(this.f206267l.m68538J(), new qcj() { // from class: l.yvm0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((bvm0) ((d3q) obj)).f78606a, bLiveVoiceCall.f45333id));
            }
        });
        if (d3qVar != null) {
            return (bvm0) d3qVar;
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public View m221795i() {
        View view = this.f206266k;
        if (view != null) {
            return view;
        }
        View viewM221792c = m221792c(LayoutInflater.from(getContext()), null);
        this.f206266k = viewM221792c;
        return viewM221792c;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: k */
    public void m221796k(BLiveVoiceCall bLiveVoiceCall) {
        bvm0 bvm0VarM221794f = m221794f(bLiveVoiceCall);
        if (bvm0VarM221794f != null) {
            this.f206267l.m68551W(bvm0VarM221794f);
            m221789e();
        }
    }

    /* JADX INFO: renamed from: l */
    public void m221797l(List<d3q<?>> list, String str) {
        bnl0.m105524M(this.f206256a, !this.f206265j.m208101s4());
        bnl0.m105524M(this.f206262g, !this.f206265j.m208101s4());
        this.f206257b.setTextColor(Color.parseColor(y6s.m214494b(str) ? "#CCffffff" : "#ffffff"));
        this.f206267l.m68554Z(list);
        m221789e();
    }

    /* JADX INFO: renamed from: m */
    public void m221798m(boolean z) {
        this.f206260e.setChecked(z);
    }

    /* JADX INFO: renamed from: n */
    public void m221799n(BLiveVoiceCall bLiveVoiceCall) {
        bvm0 bvm0VarM221794f = m221794f(bLiveVoiceCall);
        if (bvm0VarM221794f != null) {
            bvm0VarM221794f.m106583K(bLiveVoiceCall);
            m221800p(bvm0VarM221794f);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m221800p(bvm0 bvm0Var) {
        this.f206267l.m68543O(bvm0Var);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
