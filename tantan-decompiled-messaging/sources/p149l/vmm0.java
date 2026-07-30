package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import java.util.List;
import p147v.VFrame;
import p147v.VSwitchButton;

/* JADX INFO: loaded from: classes5.dex */
public class vmm0 implements s7m<smm0> {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f182121a;

    /* JADX INFO: renamed from: b */
    public TextView f182122b;

    /* JADX INFO: renamed from: c */
    public TextView f182123c;

    /* JADX INFO: renamed from: d */
    public VFrame f182124d;

    /* JADX INFO: renamed from: e */
    public VSwitchButton f182125e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f182126f;

    /* JADX INFO: renamed from: g */
    public View f182127g;

    /* JADX INFO: renamed from: h */
    public RecyclerView f182128h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f182129i;

    /* JADX INFO: renamed from: j */
    public smm0 f182130j;

    /* JADX INFO: renamed from: k */
    public View f182131k;

    /* JADX INFO: renamed from: l */
    public LiveBaseAdapter f182132l;

    public vmm0(Act act) {
        this.f182131k = m198959c(LayoutInflater.from(act), null);
        m198958r();
    }

    /* JADX INFO: renamed from: e */
    private void m198956e() {
        boolean z = this.f182132l.m67355J().size() == 0;
        xdl0.m208344M(this.f182129i, z);
        xdl0.m208344M(this.f182126f, !z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m198957j(View view) {
        this.f182130j.m185000q4(!this.f182125e.isChecked());
    }

    /* JADX INFO: renamed from: r */
    private void m198958r() {
        RecyclerView recyclerView = this.f182128h;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        LiveBaseAdapter liveBaseAdapter = new LiveBaseAdapter();
        this.f182132l = liveBaseAdapter;
        this.f182128h.setAdapter(liveBaseAdapter);
        xdl0.m208329E0(this.f182124d, new View.OnClickListener() { // from class: l.tmm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f171157a.m198957j(view);
            }
        });
        m198956e();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f182130j.act();
    }

    /* JADX INFO: renamed from: c */
    public View m198959c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return wmm0.m203994b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(smm0 smm0Var) {
        this.f182130j = smm0Var;
    }

    /* JADX INFO: renamed from: f */
    public final xlm0 m198961f(final BLiveVoiceCall bLiveVoiceCall) {
        d1q d1qVar = (d1q) vwb.m200346r(this.f182132l.m67355J(), new w9j() { // from class: l.umm0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((xlm0) ((d1q) obj)).f193431a, bLiveVoiceCall.f44485id));
            }
        });
        if (d1qVar != null) {
            return (xlm0) d1qVar;
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public View m198962i() {
        View view = this.f182131k;
        if (view != null) {
            return view;
        }
        View viewM198959c = m198959c(LayoutInflater.from(getContext()), null);
        this.f182131k = viewM198959c;
        return viewM198959c;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: k */
    public void m198963k(BLiveVoiceCall bLiveVoiceCall) {
        xlm0 xlm0VarM198961f = m198961f(bLiveVoiceCall);
        if (xlm0VarM198961f != null) {
            this.f182132l.m67368W(xlm0VarM198961f);
            m198956e();
        }
    }

    /* JADX INFO: renamed from: l */
    public void m198964l(List<d1q<?>> list, String str) {
        xdl0.m208344M(this.f182121a, !this.f182130j.m185001s4());
        xdl0.m208344M(this.f182127g, !this.f182130j.m185001s4());
        this.f182122b.setTextColor(Color.parseColor(x4s.m207012b(str) ? "#CCffffff" : "#ffffff"));
        this.f182132l.m67371Z(list);
        m198956e();
    }

    /* JADX INFO: renamed from: m */
    public void m198965m(boolean z) {
        this.f182125e.setChecked(z);
    }

    /* JADX INFO: renamed from: n */
    public void m198966n(BLiveVoiceCall bLiveVoiceCall) {
        xlm0 xlm0VarM198961f = m198961f(bLiveVoiceCall);
        if (xlm0VarM198961f != null) {
            xlm0VarM198961f.m209898K(bLiveVoiceCall);
            m198967p(xlm0VarM198961f);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m198967p(xlm0 xlm0Var) {
        this.f182132l.m67360O(xlm0Var);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
