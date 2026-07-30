package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class le5 implements hrl {

    /* JADX INFO: renamed from: a */
    public GridView f131713a;

    /* JADX INFO: renamed from: b */
    public Act f131714b;

    /* JADX INFO: renamed from: c */
    public AbstractC15610a f131715c;

    /* JADX INFO: renamed from: d */
    public final int f131716d;

    public le5(Act act, int i) {
        this.f131714b = act;
        this.f131716d = i;
    }

    @Override // p153l.hrl
    /* JADX INFO: renamed from: a */
    public View mo136895a(ViewGroup viewGroup, boolean z) {
        View viewInflate = this.f131714b.inflater().inflate(rec0.f162424B2, viewGroup, false);
        m153878c(viewInflate);
        return viewInflate;
    }

    @Override // p153l.hrl
    /* JADX INFO: renamed from: b */
    public void mo136896b(List<C8928d> list, z20<C8928d, Boolean> z20Var, y20<Integer> y20Var) {
        m153879d(list, z20Var);
    }

    /* JADX INFO: renamed from: c */
    public final void m153878c(View view) {
        me5.m158013a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public void m153879d(List<C8928d> list, z20<C8928d, Boolean> z20Var) {
        if (this.f131716d == 25) {
            this.f131713a.setNumColumns(2);
        }
        AbstractC15610a<C8928d> abstractC15610aM180842e = rd5.m180842e(this.f131714b, list, z20Var, this.f131716d);
        this.f131715c = abstractC15610aM180842e;
        this.f131713a.setAdapter((ListAdapter) abstractC15610aM180842e);
    }

    @Override // p153l.hrl
    public void release() {
        this.f131715c = null;
    }
}
