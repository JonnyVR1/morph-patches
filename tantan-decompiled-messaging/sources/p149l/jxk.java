package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* JADX INFO: loaded from: classes3.dex */
public class jxk extends ojc0 {

    /* JADX INFO: renamed from: b */
    public RecyclerView.AbstractC0577o f120228b;

    /* JADX INFO: renamed from: c */
    public View f120229c;

    /* JADX INFO: renamed from: d */
    public View f120230d;

    /* JADX INFO: renamed from: l.jxk$a */
    public class C17887a extends GridLayoutManager.AbstractC0553c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GridLayoutManager f120231a;

        public C17887a(GridLayoutManager gridLayoutManager) {
            this.f120231a = gridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0553c
        /* JADX INFO: renamed from: f */
        public int mo3329f(int i) {
            boolean z = i == 0 && jxk.this.m143809A();
            if ((i == jxk.this.getItemCount() - 1 && jxk.this.m143816z()) || z) {
                return this.f120231a.m3317m();
            }
            return 1;
        }
    }

    /* JADX INFO: renamed from: l.jxk$b */
    public class C17888b extends RecyclerView.AbstractC0566d0 {
        public C17888b(View view) {
            super(view);
        }
    }

    public jxk(@NonNull RecyclerView.Adapter adapter) {
        super(adapter);
    }

    /* JADX INFO: renamed from: A */
    public boolean m143809A() {
        return this.f120229c != null;
    }

    /* JADX INFO: renamed from: C */
    public void m143810C() {
        this.f120230d = null;
        m164642y().notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: D */
    public void m143811D() {
        this.f120229c = null;
        m164642y().notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: E */
    public void m143812E(View view) {
        this.f120230d = view;
    }

    /* JADX INFO: renamed from: F */
    public void m143813F(View view) {
        this.f120230d = view;
        m164642y().notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: G */
    public void m143814G(RecyclerView.AbstractC0577o abstractC0577o) {
        if (abstractC0577o instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) abstractC0577o;
            gridLayoutManager.m3326v(new C17887a(gridLayoutManager));
        }
    }

    /* JADX INFO: renamed from: H */
    public void m143815H(View view) {
        this.f120229c = view;
        m164642y().notifyDataSetChanged();
    }

    @Override // p149l.ojc0, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return super.getItemCount() + (m143809A() ? 1 : 0) + (m143816z() ? 1 : 0);
    }

    @Override // p149l.ojc0, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (m143809A() && i == 0) {
            return -1;
        }
        if (m143816z() && i == getItemCount() - 1) {
            return -2;
        }
        if (m143809A()) {
            i--;
        }
        return super.getItemViewType(i);
    }

    @Override // p149l.ojc0, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        RecyclerView.AbstractC0577o layoutManager = recyclerView.getLayoutManager();
        this.f120228b = layoutManager;
        m143814G(layoutManager);
    }

    @Override // p149l.ojc0, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.AbstractC0566d0 abstractC0566d0, int i) {
        if (getItemViewType(i) == -1 || getItemViewType(i) == -2) {
            return;
        }
        if (m143809A()) {
            i--;
        }
        super.onBindViewHolder(abstractC0566d0, i);
    }

    @Override // p149l.ojc0, androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.AbstractC0566d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view;
        if (i == -1) {
            view = this.f120229c;
        } else {
            view = i == -2 ? this.f120230d : null;
        }
        if (view == null) {
            return super.onCreateViewHolder(viewGroup, i);
        }
        if (this.f120228b instanceof StaggeredGridLayoutManager) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            StaggeredGridLayoutManager.C0593c c0593c = layoutParams != null ? new StaggeredGridLayoutManager.C0593c(layoutParams.width, layoutParams.height) : new StaggeredGridLayoutManager.C0593c(-1, -2);
            c0593c.m3576i(true);
            view.setLayoutParams(c0593c);
        }
        return new C17888b(view);
    }

    /* JADX INFO: renamed from: z */
    public boolean m143816z() {
        return this.f120230d != null;
    }
}
