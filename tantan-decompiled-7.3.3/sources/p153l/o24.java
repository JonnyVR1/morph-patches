package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class o24 implements iam<z74> {

    /* JADX INFO: renamed from: a */
    public RecyclerView f144716a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f144717b;

    /* JADX INFO: renamed from: c */
    public TextView f144718c;

    /* JADX INFO: renamed from: d */
    public z74 f144719d;

    /* JADX INFO: renamed from: e */
    public LiveBaseAdapter f144720e;

    /* JADX INFO: renamed from: f */
    public rop0 f144721f;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m165692f(View view) {
        this.f144719d.m218857s4();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return this.f144719d.act();
    }

    /* JADX INFO: renamed from: b */
    public View m165693b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return p24.m170325b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(z74 z74Var) {
        this.f144719d = z74Var;
    }

    /* JADX INFO: renamed from: d */
    public List<d3q<?>> m165695d() {
        return this.f144720e.m68538J();
    }

    /* JADX INFO: renamed from: e */
    public View m165696e() {
        View viewM165693b = m165693b(act().inflater(), null);
        this.f144716a.setLayoutManager(new LinearLayoutManager(act(), 1, false));
        this.f144716a.setItemAnimator(null);
        LiveBaseAdapter liveBaseAdapter = new LiveBaseAdapter();
        this.f144720e = liveBaseAdapter;
        this.f144716a.setAdapter(liveBaseAdapter);
        bnl0.m105509E0(this.f144718c, new View.OnClickListener() { // from class: l.n24
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f139809a.m165692f(view);
            }
        });
        this.f144718c.setText(zrv.m221193k().m203522T3().callSettingButtonText);
        this.f144721f = new rop0();
        return viewM165693b;
    }

    /* JADX INFO: renamed from: i */
    public void m165697i(qop0 qop0Var) {
        this.f144720e.m68543O(qop0Var);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m165698j(d3q d3qVar) {
        if (d3qVar != null) {
            this.f144720e.m68551W(d3qVar);
        }
        if (this.f144720e.m68538J().size() == 1) {
            this.f144720e.m68538J().remove(this.f144721f);
        }
        m165700l(this.f144720e.getItemCount() == 0);
    }

    /* JADX INFO: renamed from: k */
    public void m165699k(List<d3q<?>> list) {
        if (list.contains(this.f144721f)) {
            list.remove(this.f144721f);
        }
        if (!jyb.m147479J(list)) {
            list.add(this.f144721f);
        }
        this.f144720e.m68554Z(list);
        m165700l(this.f144720e.getItemCount() == 0);
    }

    /* JADX INFO: renamed from: l */
    public void m165700l(boolean z) {
        bnl0.m105524M(this.f144717b, z);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
