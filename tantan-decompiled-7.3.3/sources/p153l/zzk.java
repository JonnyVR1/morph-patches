package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* JADX INFO: loaded from: classes3.dex */
public class zzk extends vrc0 {

    /* JADX INFO: renamed from: b */
    public RecyclerView.AbstractC0579o f206709b;

    /* JADX INFO: renamed from: c */
    public View f206710c;

    /* JADX INFO: renamed from: d */
    public View f206711d;

    /* JADX INFO: renamed from: l.zzk$a */
    public class C21946a extends GridLayoutManager.AbstractC0554c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GridLayoutManager f206712a;

        public C21946a(GridLayoutManager gridLayoutManager) {
            this.f206712a = gridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0554c
        /* JADX INFO: renamed from: f */
        public int mo3330f(int i) {
            boolean z = i == 0 && zzk.this.m222259A();
            if ((i == zzk.this.getItemCount() - 1 && zzk.this.m222266z()) || z) {
                return this.f206712a.m3318m();
            }
            return 1;
        }
    }

    /* JADX INFO: renamed from: l.zzk$b */
    public class C21947b extends RecyclerView.AbstractC0569e0 {
        public C21947b(View view) {
            super(view);
        }
    }

    public zzk(@NonNull RecyclerView.Adapter adapter) {
        super(adapter);
    }

    /* JADX INFO: renamed from: A */
    public boolean m222259A() {
        return this.f206710c != null;
    }

    /* JADX INFO: renamed from: C */
    public void m222260C() {
        this.f206711d = null;
        m202481y().notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: D */
    public void m222261D() {
        this.f206710c = null;
        m202481y().notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: E */
    public void m222262E(View view) {
        this.f206711d = view;
    }

    /* JADX INFO: renamed from: F */
    public void m222263F(View view) {
        this.f206711d = view;
        m202481y().notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: G */
    public void m222264G(RecyclerView.AbstractC0579o abstractC0579o) {
        if (abstractC0579o instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) abstractC0579o;
            gridLayoutManager.m3327v(new C21946a(gridLayoutManager));
        }
    }

    /* JADX INFO: renamed from: H */
    public void m222265H(View view) {
        this.f206710c = view;
        m202481y().notifyDataSetChanged();
    }

    @Override // p153l.vrc0, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return super.getItemCount() + (m222259A() ? 1 : 0) + (m222266z() ? 1 : 0);
    }

    @Override // p153l.vrc0, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (m222259A() && i == 0) {
            return -1;
        }
        if (m222266z() && i == getItemCount() - 1) {
            return -2;
        }
        if (m222259A()) {
            i--;
        }
        return super.getItemViewType(i);
    }

    @Override // p153l.vrc0, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        RecyclerView.AbstractC0579o layoutManager = recyclerView.getLayoutManager();
        this.f206709b = layoutManager;
        m222264G(layoutManager);
    }

    @Override // p153l.vrc0, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.AbstractC0569e0 abstractC0569e0, int i) {
        if (getItemViewType(i) == -1 || getItemViewType(i) == -2) {
            return;
        }
        if (m222259A()) {
            i--;
        }
        super.onBindViewHolder(abstractC0569e0, i);
    }

    @Override // p153l.vrc0, androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.AbstractC0569e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view;
        if (i == -1) {
            view = this.f206710c;
        } else {
            view = i == -2 ? this.f206711d : null;
        }
        if (view == null) {
            return super.onCreateViewHolder(viewGroup, i);
        }
        if (this.f206709b instanceof StaggeredGridLayoutManager) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            StaggeredGridLayoutManager.C0595c c0595c = layoutParams != null ? new StaggeredGridLayoutManager.C0595c(layoutParams.width, layoutParams.height) : new StaggeredGridLayoutManager.C0595c(-1, -2);
            c0595c.m3577i(true);
            view.setLayoutParams(c0595c);
        }
        return new C21947b(view);
    }

    /* JADX INFO: renamed from: z */
    public boolean m222266z() {
        return this.f206711d != null;
    }
}
