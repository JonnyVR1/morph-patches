package p002l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p1.mobile.android.app.Act;
import l.s7m;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ddg implements s7m<cdg> {

    /* JADX INFO: renamed from: a */
    public final RecyclerView f9176a;

    /* JADX INFO: renamed from: b */
    public cdg f9177b;

    /* JADX INFO: renamed from: c */
    public final jcg f9178c;

    public ddg(RecyclerView recyclerView) {
        jcg jcgVar = new jcg();
        this.f9178c = jcgVar;
        this.f9176a = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        recyclerView.setAdapter(jcgVar);
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m11755C0() {
        return this.f9176a.getContext();
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void m11759i1(cdg cdgVar) {
        this.f9177b = cdgVar;
    }

    @Nullable
    public Act act() {
        return xdl0.E(this.f9176a);
    }

    /* JADX INFO: renamed from: b */
    public void m11757b() {
        this.f9178c.m15851h0();
    }

    /* JADX INFO: renamed from: c */
    public void m11758c(mcg mcgVar) {
        this.f9178c.m15852i0(mcgVar, this.f9177b);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void destroy() {
    }
}
