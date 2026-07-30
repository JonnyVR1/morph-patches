package p149l;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes12.dex */
public abstract class eac0<T> extends dac0<T> {

    /* JADX INFO: renamed from: c */
    public l80 f90187c;

    /* JADX INFO: renamed from: E */
    public void m115416E(l80 l80Var) {
        this.f90187c = l80Var;
    }

    @Override // p149l.dac0, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.AbstractC0566d0 abstractC0566d0, int i) {
        super.onBindViewHolder(abstractC0566d0, i);
        l80 l80Var = this.f90187c;
        if (l80Var != null) {
            l80Var.m148839h(abstractC0566d0.itemView, getItem(i), i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0) {
        super.onViewAttachedToWindow(abstractC0566d0);
        l80 l80Var = this.f90187c;
        if (l80Var != null) {
            l80Var.m148842o();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0) {
        super.onViewDetachedFromWindow(abstractC0566d0);
        l80 l80Var = this.f90187c;
        if (l80Var != null) {
            l80Var.m148842o();
        }
    }
}
