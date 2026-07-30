package p153l;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public class vrc0 extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a */
    public final RecyclerView.Adapter f185444a;

    /* JADX INFO: renamed from: l.vrc0$a */
    public class C20910a extends RecyclerView.AbstractC0573i {
        public C20910a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0573i
        public void onChanged() {
            vrc0.this.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0573i
        public void onItemRangeChanged(int i, int i2) {
            vrc0.this.notifyItemRangeChanged(i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0573i
        public void onItemRangeInserted(int i, int i2) {
            vrc0.this.notifyItemRangeInserted(i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0573i
        public void onItemRangeMoved(int i, int i2, int i3) {
            vrc0.this.notifyItemMoved(i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0573i
        public void onItemRangeRemoved(int i, int i2) {
            vrc0.this.notifyItemRangeRemoved(i, i2);
        }
    }

    public vrc0(RecyclerView.Adapter adapter) {
        this.f185444a = adapter;
        adapter.registerAdapterDataObserver(new C20910a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f185444a.getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return this.f185444a.getItemId(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.f185444a.getItemViewType(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        this.f185444a.onAttachedToRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.AbstractC0569e0 abstractC0569e0, int i) {
        this.f185444a.onBindViewHolder(abstractC0569e0, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.AbstractC0569e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return this.f185444a.onCreateViewHolder(viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.f185444a.onDetachedFromRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public boolean onFailedToRecycleView(RecyclerView.AbstractC0569e0 abstractC0569e0) {
        return this.f185444a.onFailedToRecycleView(abstractC0569e0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(RecyclerView.AbstractC0569e0 abstractC0569e0) {
        this.f185444a.onViewAttachedToWindow(abstractC0569e0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(RecyclerView.AbstractC0569e0 abstractC0569e0) {
        this.f185444a.onViewDetachedFromWindow(abstractC0569e0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(RecyclerView.AbstractC0569e0 abstractC0569e0) {
        this.f185444a.onViewRecycled(abstractC0569e0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void registerAdapterDataObserver(RecyclerView.AbstractC0573i abstractC0573i) {
        this.f185444a.registerAdapterDataObserver(abstractC0573i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void setHasStableIds(boolean z) {
        this.f185444a.setHasStableIds(z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void unregisterAdapterDataObserver(RecyclerView.AbstractC0573i abstractC0573i) {
        this.f185444a.unregisterAdapterDataObserver(abstractC0573i);
    }

    /* JADX INFO: renamed from: y */
    public RecyclerView.Adapter m202481y() {
        return this.f185444a;
    }
}
