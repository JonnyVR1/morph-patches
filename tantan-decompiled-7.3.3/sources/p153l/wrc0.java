package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.AbstractC0569e0;
import com.p051p1.mobile.putong.core.p058ui.verticalViewpager.RecyclerViewPager;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes12.dex */
public class wrc0<VH extends RecyclerView.AbstractC0569e0> extends RecyclerView.Adapter<VH> {

    /* JADX INFO: renamed from: a */
    public final RecyclerViewPager f190500a;

    /* JADX INFO: renamed from: b */
    public RecyclerView.Adapter<VH> f190501b;

    public wrc0(RecyclerViewPager recyclerViewPager, RecyclerView.Adapter<VH> adapter) {
        this.f190501b = adapter;
        this.f190500a = recyclerViewPager;
        if (NullChecker.m82486a(adapter)) {
            setHasStableIds(this.f190501b.hasStableIds());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f190501b.getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return this.f190501b.getItemId(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.f190501b.getItemViewType(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f190501b.onAttachedToRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(VH vh, int i) {
        ViewGroup.LayoutParams layoutParams;
        this.f190501b.onBindViewHolder(vh, i);
        View view = vh.itemView;
        if (view.getLayoutParams() == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -1);
        } else {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (this.f190500a.getLayoutManager().canScrollHorizontally()) {
                layoutParams2.width = -1;
            } else {
                layoutParams2.height = -1;
            }
            layoutParams = layoutParams2;
        }
        view.setLayoutParams(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public VH onCreateViewHolder(ViewGroup viewGroup, int i) {
        return (VH) this.f190501b.onCreateViewHolder(viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.f190501b.onDetachedFromRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public boolean onFailedToRecycleView(VH vh) {
        return this.f190501b.onFailedToRecycleView(vh);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(VH vh) {
        super.onViewAttachedToWindow(vh);
        this.f190501b.onViewAttachedToWindow(vh);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(VH vh) {
        super.onViewDetachedFromWindow(vh);
        this.f190501b.onViewDetachedFromWindow(vh);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(VH vh) {
        super.onViewRecycled(vh);
        this.f190501b.onViewRecycled(vh);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void registerAdapterDataObserver(RecyclerView.AbstractC0573i abstractC0573i) {
        super.registerAdapterDataObserver(abstractC0573i);
        this.f190501b.registerAdapterDataObserver(abstractC0573i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void setHasStableIds(boolean z) {
        super.setHasStableIds(z);
        this.f190501b.setHasStableIds(z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void unregisterAdapterDataObserver(RecyclerView.AbstractC0573i abstractC0573i) {
        super.unregisterAdapterDataObserver(abstractC0573i);
        this.f190501b.unregisterAdapterDataObserver(abstractC0573i);
    }
}
