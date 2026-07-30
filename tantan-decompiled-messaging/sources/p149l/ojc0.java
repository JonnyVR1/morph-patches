package p149l;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public class ojc0 extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a */
    public final RecyclerView.Adapter f144262a;

    /* JADX INFO: renamed from: l.ojc0$a */
    public class C18959a extends RecyclerView.AbstractC0571i {
        public C18959a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0571i
        public void onChanged() {
            ojc0.this.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0571i
        public void onItemRangeChanged(int i, int i2) {
            ojc0.this.notifyItemRangeChanged(i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0571i
        public void onItemRangeInserted(int i, int i2) {
            ojc0.this.notifyItemRangeInserted(i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0571i
        public void onItemRangeMoved(int i, int i2, int i3) {
            ojc0.this.notifyItemMoved(i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0571i
        public void onItemRangeRemoved(int i, int i2) {
            ojc0.this.notifyItemRangeRemoved(i, i2);
        }
    }

    public ojc0(RecyclerView.Adapter adapter) {
        this.f144262a = adapter;
        adapter.registerAdapterDataObserver(new C18959a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f144262a.getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return this.f144262a.getItemId(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.f144262a.getItemViewType(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        this.f144262a.onAttachedToRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.AbstractC0566d0 abstractC0566d0, int i) {
        this.f144262a.onBindViewHolder(abstractC0566d0, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.AbstractC0566d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return this.f144262a.onCreateViewHolder(viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.f144262a.onDetachedFromRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public boolean onFailedToRecycleView(RecyclerView.AbstractC0566d0 abstractC0566d0) {
        return this.f144262a.onFailedToRecycleView(abstractC0566d0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(RecyclerView.AbstractC0566d0 abstractC0566d0) {
        this.f144262a.onViewAttachedToWindow(abstractC0566d0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(RecyclerView.AbstractC0566d0 abstractC0566d0) {
        this.f144262a.onViewDetachedFromWindow(abstractC0566d0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(RecyclerView.AbstractC0566d0 abstractC0566d0) {
        this.f144262a.onViewRecycled(abstractC0566d0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void registerAdapterDataObserver(RecyclerView.AbstractC0571i abstractC0571i) {
        this.f144262a.registerAdapterDataObserver(abstractC0571i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void setHasStableIds(boolean z) {
        this.f144262a.setHasStableIds(z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void unregisterAdapterDataObserver(RecyclerView.AbstractC0571i abstractC0571i) {
        this.f144262a.unregisterAdapterDataObserver(abstractC0571i);
    }

    /* JADX INFO: renamed from: y */
    public RecyclerView.Adapter m164642y() {
        return this.f144262a;
    }
}
