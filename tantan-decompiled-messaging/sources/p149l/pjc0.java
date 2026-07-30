package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.AbstractC0566d0;
import com.p046p1.mobile.putong.core.p053ui.verticalViewpager.RecyclerViewPager;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class pjc0<VH extends RecyclerView.AbstractC0566d0> extends RecyclerView.Adapter<VH> {

    /* JADX INFO: renamed from: a */
    public final RecyclerViewPager f149767a;

    /* JADX INFO: renamed from: b */
    public RecyclerView.Adapter<VH> f149768b;

    public pjc0(RecyclerViewPager recyclerViewPager, RecyclerView.Adapter<VH> adapter) {
        this.f149768b = adapter;
        this.f149767a = recyclerViewPager;
        if (NullChecker.m81303a(adapter)) {
            setHasStableIds(this.f149768b.hasStableIds());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f149768b.getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return this.f149768b.getItemId(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.f149768b.getItemViewType(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f149768b.onAttachedToRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(VH vh, int i) {
        ViewGroup.LayoutParams layoutParams;
        this.f149768b.onBindViewHolder(vh, i);
        View view = vh.itemView;
        if (view.getLayoutParams() == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -1);
        } else {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (this.f149767a.getLayoutManager().canScrollHorizontally()) {
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
        return (VH) this.f149768b.onCreateViewHolder(viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.f149768b.onDetachedFromRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public boolean onFailedToRecycleView(VH vh) {
        return this.f149768b.onFailedToRecycleView(vh);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(VH vh) {
        super.onViewAttachedToWindow(vh);
        this.f149768b.onViewAttachedToWindow(vh);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(VH vh) {
        super.onViewDetachedFromWindow(vh);
        this.f149768b.onViewDetachedFromWindow(vh);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(VH vh) {
        super.onViewRecycled(vh);
        this.f149768b.onViewRecycled(vh);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void registerAdapterDataObserver(RecyclerView.AbstractC0571i abstractC0571i) {
        super.registerAdapterDataObserver(abstractC0571i);
        this.f149768b.registerAdapterDataObserver(abstractC0571i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void setHasStableIds(boolean z) {
        super.setHasStableIds(z);
        this.f149768b.setHasStableIds(z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void unregisterAdapterDataObserver(RecyclerView.AbstractC0571i abstractC0571i) {
        super.unregisterAdapterDataObserver(abstractC0571i);
        this.f149768b.unregisterAdapterDataObserver(abstractC0571i);
    }
}
