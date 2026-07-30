package p003l;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ojc0 extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a */
    public final RecyclerView.Adapter f6166a;

    /* JADX INFO: renamed from: l.ojc0$a */
    public class C0456a extends RecyclerView.i {
        public C0456a() {
        }

        public void onChanged() {
            ojc0.this.notifyDataSetChanged();
        }

        public void onItemRangeChanged(int i, int i2) {
            ojc0.this.notifyItemRangeChanged(i, i2);
        }

        public void onItemRangeInserted(int i, int i2) {
            ojc0.this.notifyItemRangeInserted(i, i2);
        }

        public void onItemRangeMoved(int i, int i2, int i3) {
            ojc0.this.notifyItemMoved(i, i2);
        }

        public void onItemRangeRemoved(int i, int i2) {
            ojc0.this.notifyItemRangeRemoved(i, i2);
        }
    }

    public ojc0(RecyclerView.Adapter adapter) {
        this.f6166a = adapter;
        adapter.registerAdapterDataObserver(new C0456a());
    }

    public int getItemCount() {
        return this.f6166a.getItemCount();
    }

    public long getItemId(int i) {
        return this.f6166a.getItemId(i);
    }

    public int getItemViewType(int i) {
        return this.f6166a.getItemViewType(i);
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        this.f6166a.onAttachedToRecyclerView(recyclerView);
    }

    public void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        this.f6166a.onBindViewHolder(d0Var, i);
    }

    public RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return this.f6166a.onCreateViewHolder(viewGroup, i);
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.f6166a.onDetachedFromRecyclerView(recyclerView);
    }

    public boolean onFailedToRecycleView(RecyclerView.d0 d0Var) {
        return this.f6166a.onFailedToRecycleView(d0Var);
    }

    public void onViewAttachedToWindow(RecyclerView.d0 d0Var) {
        this.f6166a.onViewAttachedToWindow(d0Var);
    }

    public void onViewDetachedFromWindow(RecyclerView.d0 d0Var) {
        this.f6166a.onViewDetachedFromWindow(d0Var);
    }

    public void onViewRecycled(RecyclerView.d0 d0Var) {
        this.f6166a.onViewRecycled(d0Var);
    }

    public void registerAdapterDataObserver(RecyclerView.i iVar) {
        this.f6166a.registerAdapterDataObserver(iVar);
    }

    public void setHasStableIds(boolean z) {
        this.f6166a.setHasStableIds(z);
    }

    public void unregisterAdapterDataObserver(RecyclerView.i iVar) {
        this.f6166a.unregisterAdapterDataObserver(iVar);
    }

    /* JADX INFO: renamed from: y */
    public RecyclerView.Adapter m6713y() {
        return this.f6166a;
    }
}
