package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ld5 implements wol {

    /* JADX INFO: renamed from: a */
    public GridView f127505a;

    /* JADX INFO: renamed from: b */
    public Act f127506b;

    /* JADX INFO: renamed from: c */
    public AbstractC15503a f127507c;

    /* JADX INFO: renamed from: d */
    public final int f127508d;

    public ld5(Act act, int i) {
        this.f127506b = act;
        this.f127508d = i;
    }

    @Override // p149l.wol
    /* JADX INFO: renamed from: a */
    public View mo137081a(ViewGroup viewGroup, boolean z) {
        View viewInflate = this.f127506b.inflater().inflate(m6c0.f131464B2, viewGroup, false);
        m149389c(viewInflate);
        return viewInflate;
    }

    @Override // p149l.wol
    /* JADX INFO: renamed from: b */
    public void mo137082b(List<C8765d> list, f30<C8765d, Boolean> f30Var, e30<Integer> e30Var) {
        m149390d(list, f30Var);
    }

    /* JADX INFO: renamed from: c */
    public final void m149389c(View view) {
        md5.m154058a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public void m149390d(List<C8765d> list, f30<C8765d, Boolean> f30Var) {
        if (this.f127508d == 25) {
            this.f127505a.setNumColumns(2);
        }
        AbstractC15503a<C8765d> abstractC15503aM178790e = rc5.m178790e(this.f127506b, list, f30Var, this.f127508d);
        this.f127507c = abstractC15503aM178790e;
        this.f127505a.setAdapter((ListAdapter) abstractC15503aM178790e);
    }

    @Override // p149l.wol
    public void release() {
        this.f127507c = null;
    }
}
