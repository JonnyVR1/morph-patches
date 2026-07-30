package p003l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class jxk extends ojc0 {

    /* JADX INFO: renamed from: b */
    public RecyclerView.o f4755b;

    /* JADX INFO: renamed from: c */
    public View f4756c;

    /* JADX INFO: renamed from: d */
    public View f4757d;

    /* JADX INFO: renamed from: l.jxk$a */
    public class C0359a extends GridLayoutManager.c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GridLayoutManager f4758a;

        public C0359a(GridLayoutManager gridLayoutManager) {
            this.f4758a = gridLayoutManager;
        }

        /* JADX INFO: renamed from: f */
        public int m5457f(int i) {
            boolean z = i == 0 && jxk.this.m5449A();
            if ((i == jxk.this.getItemCount() - 1 && jxk.this.m5456z()) || z) {
                return this.f4758a.m();
            }
            return 1;
        }
    }

    /* JADX INFO: renamed from: l.jxk$b */
    public class C0360b extends RecyclerView.d0 {
        public C0360b(View view) {
            super(view);
        }
    }

    public jxk(@NonNull RecyclerView.Adapter adapter) {
        super(adapter);
    }

    /* JADX INFO: renamed from: A */
    public boolean m5449A() {
        return this.f4756c != null;
    }

    /* JADX INFO: renamed from: C */
    public void m5450C() {
        this.f4757d = null;
        m6713y().notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: D */
    public void m5451D() {
        this.f4756c = null;
        m6713y().notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: E */
    public void m5452E(View view) {
        this.f4757d = view;
    }

    /* JADX INFO: renamed from: F */
    public void m5453F(View view) {
        this.f4757d = view;
        m6713y().notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: G */
    public void m5454G(RecyclerView.o oVar) {
        if (oVar instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) oVar;
            gridLayoutManager.v(new C0359a(gridLayoutManager));
        }
    }

    /* JADX INFO: renamed from: H */
    public void m5455H(View view) {
        this.f4756c = view;
        m6713y().notifyDataSetChanged();
    }

    @Override // p003l.ojc0
    public int getItemCount() {
        return super.getItemCount() + (m5449A() ? 1 : 0) + (m5456z() ? 1 : 0);
    }

    @Override // p003l.ojc0
    public int getItemViewType(int i) {
        if (m5449A() && i == 0) {
            return -1;
        }
        if (m5456z() && i == getItemCount() - 1) {
            return -2;
        }
        if (m5449A()) {
            i--;
        }
        return super.getItemViewType(i);
    }

    @Override // p003l.ojc0
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        this.f4755b = layoutManager;
        m5454G(layoutManager);
    }

    @Override // p003l.ojc0
    public void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        if (getItemViewType(i) == -1 || getItemViewType(i) == -2) {
            return;
        }
        if (m5449A()) {
            i--;
        }
        super.onBindViewHolder(d0Var, i);
    }

    @Override // p003l.ojc0
    public RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view;
        if (i == -1) {
            view = this.f4756c;
        } else {
            view = i == -2 ? this.f4757d : null;
        }
        if (view == null) {
            return super.onCreateViewHolder(viewGroup, i);
        }
        if (this.f4755b instanceof StaggeredGridLayoutManager) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            StaggeredGridLayoutManager.c cVar = layoutParams != null ? new StaggeredGridLayoutManager.c(layoutParams.width, layoutParams.height) : new StaggeredGridLayoutManager.c(-1, -2);
            cVar.i(true);
            view.setLayoutParams(cVar);
        }
        return new C0360b(view);
    }

    /* JADX INFO: renamed from: z */
    public boolean m5456z() {
        return this.f4757d != null;
    }
}
