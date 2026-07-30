package p006l;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.d0;
import com.p000p1.mobile.putong.core.p004ui.verticalViewpager.RecyclerViewPager;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class pjc0<VH extends RecyclerView.d0> extends RecyclerView.Adapter<VH> {

    /* JADX INFO: renamed from: a */
    public final RecyclerViewPager f19159a;

    /* JADX INFO: renamed from: b */
    public RecyclerView.Adapter<VH> f19160b;

    public pjc0(RecyclerViewPager recyclerViewPager, RecyclerView.Adapter<VH> adapter) {
        this.f19160b = adapter;
        this.f19159a = recyclerViewPager;
        if (NullChecker.a(adapter)) {
            setHasStableIds(this.f19160b.hasStableIds());
        }
    }

    public int getItemCount() {
        return this.f19160b.getItemCount();
    }

    public long getItemId(int i) {
        return this.f19160b.getItemId(i);
    }

    public int getItemViewType(int i) {
        return this.f19160b.getItemViewType(i);
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f19160b.onAttachedToRecyclerView(recyclerView);
    }

    public void onBindViewHolder(VH vh, int i) {
        ViewGroup.LayoutParams layoutParams;
        this.f19160b.onBindViewHolder(vh, i);
        View view = ((RecyclerView.d0) vh).itemView;
        if (view.getLayoutParams() == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -1);
        } else {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (this.f19159a.getLayoutManager().canScrollHorizontally()) {
                layoutParams2.width = -1;
            } else {
                layoutParams2.height = -1;
            }
            layoutParams = layoutParams2;
        }
        view.setLayoutParams(layoutParams);
    }

    public VH onCreateViewHolder(ViewGroup viewGroup, int i) {
        return (VH) this.f19160b.onCreateViewHolder(viewGroup, i);
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.f19160b.onDetachedFromRecyclerView(recyclerView);
    }

    public boolean onFailedToRecycleView(VH vh) {
        return this.f19160b.onFailedToRecycleView(vh);
    }

    public void onViewAttachedToWindow(VH vh) {
        super.onViewAttachedToWindow(vh);
        this.f19160b.onViewAttachedToWindow(vh);
    }

    public void onViewDetachedFromWindow(VH vh) {
        super.onViewDetachedFromWindow(vh);
        this.f19160b.onViewDetachedFromWindow(vh);
    }

    public void onViewRecycled(VH vh) {
        super.onViewRecycled(vh);
        this.f19160b.onViewRecycled(vh);
    }

    public void registerAdapterDataObserver(RecyclerView.i iVar) {
        super.registerAdapterDataObserver(iVar);
        this.f19160b.registerAdapterDataObserver(iVar);
    }

    public void setHasStableIds(boolean z) {
        super.setHasStableIds(z);
        this.f19160b.setHasStableIds(z);
    }

    public void unregisterAdapterDataObserver(RecyclerView.i iVar) {
        super.unregisterAdapterDataObserver(iVar);
        this.f19160b.unregisterAdapterDataObserver(iVar);
    }
}
