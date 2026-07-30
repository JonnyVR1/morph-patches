package p002l;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.core.p001ui.purchase.C0190d;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.ui.view.CorePayMaxHeightRecyclerView;
import java.util.List;
import l.dac0;
import l.e30;
import l.f30;
import l.gkp;
import l.m6c0;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class fkp {

    /* JADX INFO: renamed from: a */
    public CorePayMaxHeightRecyclerView f10440a;

    /* JADX INFO: renamed from: b */
    public Act f10441b;

    /* JADX INFO: renamed from: c */
    public dac0 f10442c;

    /* JADX INFO: renamed from: d */
    public PurchaseType f10443d;

    /* JADX INFO: renamed from: e */
    public boolean f10444e;

    /* JADX INFO: renamed from: l.fkp$a */
    public class C0572a extends RecyclerView.n {

        /* JADX INFO: renamed from: a */
        public final int f10445a;

        public C0572a(int i) {
            this.f10445a = i;
        }

        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.z zVar) {
            if (recyclerView.getChildAdapterPosition(view) > 0) {
                rect.top = this.f10445a;
            }
        }
    }

    public fkp(Act act, PurchaseType purchaseType, boolean z) {
        this.f10441b = act;
        this.f10443d = purchaseType;
        this.f10444e = z;
    }

    /* JADX INFO: renamed from: a */
    public final void m13268a(View view) {
        gkp.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public View m13269b(ViewGroup viewGroup, boolean z) {
        View viewInflate = this.f10441b.inflater().inflate(m6c0.j0, viewGroup, false);
        m13268a(viewInflate);
        this.f10440a.setMaxHeight(t100.d(500.0f));
        return viewInflate;
    }

    /* JADX INFO: renamed from: d */
    public void m13271d(List<C0190d> list, f30<C0190d, Boolean> f30Var, e30<Integer> e30Var) {
        m13272e(list, f30Var);
    }

    /* JADX INFO: renamed from: e */
    public final void m13272e(List<C0190d> list, f30<C0190d, Boolean> f30Var) {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f10441b, 1, false);
        C0572a c0572a = new C0572a(t100.d(16.0f));
        this.f10442c = new ikp(this.f10441b, list, f30Var, this.f10443d, this.f10444e);
        this.f10440a.setLayoutManager(linearLayoutManager);
        this.f10440a.addItemDecoration(c0572a);
        this.f10440a.setAdapter(this.f10442c);
    }

    /* JADX INFO: renamed from: c */
    public void m13270c() {
    }
}
