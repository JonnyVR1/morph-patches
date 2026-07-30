package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;

/* JADX INFO: loaded from: classes4.dex */
public class ddg implements s7m<cdg> {

    /* JADX INFO: renamed from: a */
    public final RecyclerView f85593a;

    /* JADX INFO: renamed from: b */
    public cdg f85594b;

    /* JADX INFO: renamed from: c */
    public final jcg f85595c;

    public ddg(RecyclerView recyclerView) {
        jcg jcgVar = new jcg();
        this.f85595c = jcgVar;
        this.f85593a = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        recyclerView.setAdapter(jcgVar);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f85593a.getContext();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(cdg cdgVar) {
        this.f85594b = cdgVar;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return (Act) xdl0.m208328E(this.f85593a);
    }

    /* JADX INFO: renamed from: b */
    public void m111006b() {
        this.f85595c.m140918h0();
    }

    /* JADX INFO: renamed from: c */
    public void m111007c(mcg mcgVar) {
        this.f85595c.m140919i0(mcgVar, this.f85594b);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
