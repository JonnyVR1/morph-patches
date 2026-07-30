package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;

/* JADX INFO: loaded from: classes4.dex */
public class reg implements iam<qeg> {

    /* JADX INFO: renamed from: a */
    public final RecyclerView f162645a;

    /* JADX INFO: renamed from: b */
    public qeg f162646b;

    /* JADX INFO: renamed from: c */
    public final xdg f162647c;

    public reg(RecyclerView recyclerView) {
        xdg xdgVar = new xdg();
        this.f162647c = xdgVar;
        this.f162645a = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        recyclerView.setAdapter(xdgVar);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f162645a.getContext();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(qeg qegVar) {
        this.f162646b = qegVar;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return (Act) bnl0.m105508E(this.f162645a);
    }

    /* JADX INFO: renamed from: b */
    public void m181024b() {
        this.f162647c.m210458h0();
    }

    /* JADX INFO: renamed from: c */
    public void m181025c(aeg aegVar) {
        this.f162647c.m210459i0(aegVar, this.f162646b);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
