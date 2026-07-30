package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.base.view.EmptyView;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import java.util.List;
import p147v.VFrame;
import p147v.VSwitch;

/* JADX INFO: loaded from: classes5.dex */
public class fgk0 implements s7m<cgk0> {

    /* JADX INFO: renamed from: a */
    public TextView f97374a;

    /* JADX INFO: renamed from: b */
    public TextView f97375b;

    /* JADX INFO: renamed from: c */
    public VFrame f97376c;

    /* JADX INFO: renamed from: d */
    public VSwitch f97377d;

    /* JADX INFO: renamed from: e */
    public RecyclerView f97378e;

    /* JADX INFO: renamed from: f */
    public EmptyView f97379f;

    /* JADX INFO: renamed from: g */
    public LiveBaseAdapter f97380g;

    /* JADX INFO: renamed from: h */
    public cgk0 f97381h;

    /* JADX INFO: renamed from: i */
    public View f97382i;

    /* JADX INFO: renamed from: e */
    private void m121249e() {
        boolean z = this.f97380g.m67355J().size() == 0;
        xdl0.m208344M(this.f97379f, z);
        xdl0.m208344M(this.f97378e, !z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m121250j(View view) {
        this.f97381h.m106773h4(!this.f97377d.isChecked());
    }

    /* JADX INFO: renamed from: r */
    private void m121251r() {
        RecyclerView recyclerView = this.f97378e;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        LiveBaseAdapter liveBaseAdapter = new LiveBaseAdapter();
        this.f97380g = liveBaseAdapter;
        this.f97378e.setAdapter(liveBaseAdapter);
        xdl0.m208344M(this.f97376c, !this.f97381h.m106774j4());
        xdl0.m208344M(this.f97374a, !this.f97381h.m106774j4());
        xdl0.m208344M(this.f97375b, !this.f97381h.m106774j4());
        xdl0.m208329E0(this.f97376c, new View.OnClickListener() { // from class: l.dgk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f86113a.m121250j(view);
            }
        });
        this.f97379f.m68720e(R$string.f46792Kf).m68717b(i3c0.f110876U4);
        m121249e();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public View m121252c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ggk0.m125986b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(cgk0 cgk0Var) {
        this.f97381h = cgk0Var;
    }

    /* JADX INFO: renamed from: f */
    public final ifk0 m121254f(final BLiveVoiceCall bLiveVoiceCall) {
        d1q d1qVar = (d1q) vwb.m200346r(this.f97380g.m67355J(), new w9j() { // from class: l.egk0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((ifk0) ((d1q) obj)).f113030a, bLiveVoiceCall.f44485id));
            }
        });
        if (d1qVar != null) {
            return (ifk0) d1qVar;
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public View m121255i() {
        if (this.f97382i == null) {
            this.f97382i = m121252c(LayoutInflater.from(this.f97381h.act()), null);
            m121251r();
        }
        return this.f97382i;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: k */
    public void m121256k(BLiveVoiceCall bLiveVoiceCall) {
        ifk0 ifk0VarM121254f = m121254f(bLiveVoiceCall);
        if (ifk0VarM121254f != null) {
            this.f97380g.m67368W(ifk0VarM121254f);
            m121249e();
        }
    }

    /* JADX INFO: renamed from: l */
    public void m121257l(List<d1q<?>> list) {
        this.f97380g.m67371Z(list);
        m121249e();
    }

    /* JADX INFO: renamed from: m */
    public void m121258m(boolean z) {
        this.f97377d.setChecked(z);
    }

    /* JADX INFO: renamed from: n */
    public void m121259n(BLiveVoiceCall bLiveVoiceCall) {
        ifk0 ifk0VarM121254f = m121254f(bLiveVoiceCall);
        if (ifk0VarM121254f != null) {
            ifk0VarM121254f.m135945Q(bLiveVoiceCall);
            m121260p(ifk0VarM121254f);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m121260p(ifk0 ifk0Var) {
        this.f97380g.m67360O(ifk0Var);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
