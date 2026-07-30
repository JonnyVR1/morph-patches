package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.base.view.EmptyView;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import java.util.List;
import p151v.VFrame;
import p151v.VSwitch;

/* JADX INFO: loaded from: classes5.dex */
public class lpk0 implements iam<ipk0> {

    /* JADX INFO: renamed from: a */
    public TextView f133068a;

    /* JADX INFO: renamed from: b */
    public TextView f133069b;

    /* JADX INFO: renamed from: c */
    public VFrame f133070c;

    /* JADX INFO: renamed from: d */
    public VSwitch f133071d;

    /* JADX INFO: renamed from: e */
    public RecyclerView f133072e;

    /* JADX INFO: renamed from: f */
    public EmptyView f133073f;

    /* JADX INFO: renamed from: g */
    public LiveBaseAdapter f133074g;

    /* JADX INFO: renamed from: h */
    public ipk0 f133075h;

    /* JADX INFO: renamed from: i */
    public View f133076i;

    /* JADX INFO: renamed from: e */
    private void m155258e() {
        boolean z = this.f133074g.m68538J().size() == 0;
        bnl0.m105524M(this.f133073f, z);
        bnl0.m105524M(this.f133072e, !z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m155259j(View view) {
        this.f133075h.m141522h4(!this.f133071d.isChecked());
    }

    /* JADX INFO: renamed from: r */
    private void m155260r() {
        RecyclerView recyclerView = this.f133072e;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        LiveBaseAdapter liveBaseAdapter = new LiveBaseAdapter();
        this.f133074g = liveBaseAdapter;
        this.f133072e.setAdapter(liveBaseAdapter);
        bnl0.m105524M(this.f133070c, !this.f133075h.m141523j4());
        bnl0.m105524M(this.f133068a, !this.f133075h.m141523j4());
        bnl0.m105524M(this.f133069b, !this.f133075h.m141523j4());
        bnl0.m105509E0(this.f133070c, new View.OnClickListener() { // from class: l.jpk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f122117a.m155259j(view);
            }
        });
        this.f133073f.m69903e(R$string.f47640Kf).m69900b(obc0.f146204U4);
        m155258e();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public View m155261c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return mpk0.m159372b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(ipk0 ipk0Var) {
        this.f133075h = ipk0Var;
    }

    /* JADX INFO: renamed from: f */
    public final ook0 m155263f(final BLiveVoiceCall bLiveVoiceCall) {
        d3q d3qVar = (d3q) jyb.m147529r(this.f133074g.m68538J(), new qcj() { // from class: l.kpk0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((ook0) ((d3q) obj)).f148373a, bLiveVoiceCall.f45333id));
            }
        });
        if (d3qVar != null) {
            return (ook0) d3qVar;
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public View m155264i() {
        if (this.f133076i == null) {
            this.f133076i = m155261c(LayoutInflater.from(this.f133075h.act()), null);
            m155260r();
        }
        return this.f133076i;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: k */
    public void m155265k(BLiveVoiceCall bLiveVoiceCall) {
        ook0 ook0VarM155263f = m155263f(bLiveVoiceCall);
        if (ook0VarM155263f != null) {
            this.f133074g.m68551W(ook0VarM155263f);
            m155258e();
        }
    }

    /* JADX INFO: renamed from: l */
    public void m155266l(List<d3q<?>> list) {
        this.f133074g.m68554Z(list);
        m155258e();
    }

    /* JADX INFO: renamed from: m */
    public void m155267m(boolean z) {
        this.f133071d.setChecked(z);
    }

    /* JADX INFO: renamed from: n */
    public void m155268n(BLiveVoiceCall bLiveVoiceCall) {
        ook0 ook0VarM155263f = m155263f(bLiveVoiceCall);
        if (ook0VarM155263f != null) {
            ook0VarM155263f.m168593Q(bLiveVoiceCall);
            m155269p(ook0VarM155263f);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m155269p(ook0 ook0Var) {
        this.f133074g.m68543O(ook0Var);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
