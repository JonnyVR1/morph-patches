package p153l;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.view.CorePayMaxHeightRecyclerView;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class fmp {

    /* JADX INFO: renamed from: a */
    public CorePayMaxHeightRecyclerView f99815a;

    /* JADX INFO: renamed from: b */
    public Act f99816b;

    /* JADX INFO: renamed from: c */
    public jic0 f99817c;

    /* JADX INFO: renamed from: d */
    public PurchaseType f99818d;

    /* JADX INFO: renamed from: e */
    public boolean f99819e;

    /* JADX INFO: renamed from: l.fmp$a */
    public class C17017a extends RecyclerView.AbstractC0578n {

        /* JADX INFO: renamed from: a */
        public final int f99820a;

        public C17017a(int i) {
            this.f99820a = i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0561a0 c0561a0) {
            if (recyclerView.getChildAdapterPosition(view) > 0) {
                rect.top = this.f99820a;
            }
        }
    }

    public fmp(Act act, PurchaseType purchaseType, boolean z) {
        this.f99816b = act;
        this.f99818d = purchaseType;
        this.f99819e = z;
    }

    /* JADX INFO: renamed from: a */
    public final void m126318a(View view) {
        gmp.m130823a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public View m126319b(ViewGroup viewGroup, boolean z) {
        View viewInflate = this.f99816b.inflater().inflate(rec0.f162566j0, viewGroup, false);
        m126318a(viewInflate);
        this.f99815a.setMaxHeight(qa00.m175859d(500.0f));
        return viewInflate;
    }

    /* JADX INFO: renamed from: d */
    public void m126321d(List<C8928d> list, z20<C8928d, Boolean> z20Var, y20<Integer> y20Var) {
        m126322e(list, z20Var);
    }

    /* JADX INFO: renamed from: e */
    public final void m126322e(List<C8928d> list, z20<C8928d, Boolean> z20Var) {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f99816b, 1, false);
        C17017a c17017a = new C17017a(qa00.m175859d(16.0f));
        this.f99817c = new imp(this.f99816b, list, z20Var, this.f99818d, this.f99819e);
        this.f99815a.setLayoutManager(linearLayoutManager);
        this.f99815a.addItemDecoration(c17017a);
        this.f99815a.setAdapter(this.f99817c);
    }

    /* JADX INFO: renamed from: c */
    public void m126320c() {
    }
}
