package p149l;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.p053ui.view.CorePayMaxHeightRecyclerView;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class fkp {

    /* JADX INFO: renamed from: a */
    public CorePayMaxHeightRecyclerView f98085a;

    /* JADX INFO: renamed from: b */
    public Act f98086b;

    /* JADX INFO: renamed from: c */
    public dac0 f98087c;

    /* JADX INFO: renamed from: d */
    public PurchaseType f98088d;

    /* JADX INFO: renamed from: e */
    public boolean f98089e;

    /* JADX INFO: renamed from: l.fkp$a */
    public class C16869a extends RecyclerView.AbstractC0576n {

        /* JADX INFO: renamed from: a */
        public final int f98090a;

        public C16869a(int i) {
            this.f98090a = i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0588z c0588z) {
            if (recyclerView.getChildAdapterPosition(view) > 0) {
                rect.top = this.f98090a;
            }
        }
    }

    public fkp(Act act, PurchaseType purchaseType, boolean z) {
        this.f98086b = act;
        this.f98088d = purchaseType;
        this.f98089e = z;
    }

    /* JADX INFO: renamed from: a */
    public final void m121876a(View view) {
        gkp.m126665a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public View m121877b(ViewGroup viewGroup, boolean z) {
        View viewInflate = this.f98086b.inflater().inflate(m6c0.f131606j0, viewGroup, false);
        m121876a(viewInflate);
        this.f98085a.setMaxHeight(t100.m186890d(500.0f));
        return viewInflate;
    }

    /* JADX INFO: renamed from: d */
    public void m121879d(List<C8765d> list, f30<C8765d, Boolean> f30Var, e30<Integer> e30Var) {
        m121880e(list, f30Var);
    }

    /* JADX INFO: renamed from: e */
    public final void m121880e(List<C8765d> list, f30<C8765d, Boolean> f30Var) {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f98086b, 1, false);
        C16869a c16869a = new C16869a(t100.m186890d(16.0f));
        this.f98087c = new ikp(this.f98086b, list, f30Var, this.f98088d, this.f98089e);
        this.f98085a.setLayoutManager(linearLayoutManager);
        this.f98085a.addItemDecoration(c16869a);
        this.f98085a.setAdapter(this.f98087c);
    }

    /* JADX INFO: renamed from: c */
    public void m121878c() {
    }
}
