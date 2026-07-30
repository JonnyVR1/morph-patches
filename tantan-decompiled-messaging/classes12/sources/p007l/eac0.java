package p007l;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import l.dac0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public abstract class eac0<T> extends dac0<T> {

    /* JADX INFO: renamed from: c */
    public l80 f7268c;

    /* JADX INFO: renamed from: E */
    public void m9685E(l80 l80Var) {
        this.f7268c = l80Var;
    }

    public void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        super.onBindViewHolder(d0Var, i);
        l80 l80Var = this.f7268c;
        if (l80Var != null) {
            l80Var.m11594h(d0Var.itemView, getItem(i), i);
        }
    }

    public void onViewAttachedToWindow(@NonNull RecyclerView.d0 d0Var) {
        super/*androidx.recyclerview.widget.RecyclerView.Adapter*/.onViewAttachedToWindow(d0Var);
        l80 l80Var = this.f7268c;
        if (l80Var != null) {
            l80Var.m11597o();
        }
    }

    public void onViewDetachedFromWindow(@NonNull RecyclerView.d0 d0Var) {
        super/*androidx.recyclerview.widget.RecyclerView.Adapter*/.onViewDetachedFromWindow(d0Var);
        l80 l80Var = this.f7268c;
        if (l80Var != null) {
            l80Var.m11597o();
        }
    }
}
