package p153l;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes13.dex */
public abstract class kic0<T> extends jic0<T> {

    /* JADX INFO: renamed from: c */
    public h80 f126979c;

    /* JADX INFO: renamed from: E */
    public void m149868E(h80 h80Var) {
        this.f126979c = h80Var;
    }

    @Override // p153l.jic0, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.AbstractC0569e0 abstractC0569e0, int i) {
        super.onBindViewHolder(abstractC0569e0, i);
        h80 h80Var = this.f126979c;
        if (h80Var != null) {
            h80Var.m133881h(abstractC0569e0.itemView, getItem(i), i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NonNull RecyclerView.AbstractC0569e0 abstractC0569e0) {
        super.onViewAttachedToWindow(abstractC0569e0);
        h80 h80Var = this.f126979c;
        if (h80Var != null) {
            h80Var.m133884o();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(@NonNull RecyclerView.AbstractC0569e0 abstractC0569e0) {
        super.onViewDetachedFromWindow(abstractC0569e0);
        h80 h80Var = this.f126979c;
        if (h80Var != null) {
            h80Var.m133884o();
        }
    }
}
