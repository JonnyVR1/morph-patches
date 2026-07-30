package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.p000p1.mobile.putong.core.p001ui.purchase.C0190d;
import com.p1.mobile.android.app.Act;
import java.util.List;
import l.a;
import l.e30;
import l.f30;
import l.m6c0;
import l.md5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ld5 implements wol {

    /* JADX INFO: renamed from: a */
    public GridView f14779a;

    /* JADX INFO: renamed from: b */
    public Act f14780b;

    /* JADX INFO: renamed from: c */
    public a f14781c;

    /* JADX INFO: renamed from: d */
    public final int f14782d;

    public ld5(Act act, int i) {
        this.f14780b = act;
        this.f14782d = i;
    }

    @Override // p002l.wol
    /* JADX INFO: renamed from: a */
    public View mo15240a(ViewGroup viewGroup, boolean z) {
        View viewInflate = this.f14780b.inflater().inflate(m6c0.B2, viewGroup, false);
        m17139c(viewInflate);
        return viewInflate;
    }

    @Override // p002l.wol
    /* JADX INFO: renamed from: b */
    public void mo15241b(List<C0190d> list, f30<C0190d, Boolean> f30Var, e30<Integer> e30Var) {
        m17140d(list, f30Var);
    }

    /* JADX INFO: renamed from: c */
    public final void m17139c(View view) {
        md5.a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public void m17140d(List<C0190d> list, f30<C0190d, Boolean> f30Var) {
        if (this.f14782d == 25) {
            this.f14779a.setNumColumns(2);
        }
        ListAdapter listAdapterM21902e = rc5.m21902e(this.f14780b, list, f30Var, this.f14782d);
        this.f14781c = listAdapterM21902e;
        this.f14779a.setAdapter(listAdapterM21902e);
    }

    @Override // p002l.wol
    public void release() {
        this.f14781c = null;
    }
}
