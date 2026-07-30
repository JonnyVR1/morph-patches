package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import p153l.epr;

/* JADX INFO: renamed from: androidx.recyclerview.widget.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0598b implements epr {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final RecyclerView.Adapter f2690a;

    public C0598b(@NonNull RecyclerView.Adapter adapter) {
        this.f2690a = adapter;
    }

    @Override // p153l.epr
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: a */
    public void mo3632a(int i, int i2, Object obj) {
        this.f2690a.notifyItemRangeChanged(i, i2, obj);
    }

    @Override // p153l.epr
    /* JADX INFO: renamed from: b */
    public void mo3633b(int i, int i2) {
        this.f2690a.notifyItemRangeInserted(i, i2);
    }

    @Override // p153l.epr
    /* JADX INFO: renamed from: c */
    public void mo3634c(int i, int i2) {
        this.f2690a.notifyItemRangeRemoved(i, i2);
    }

    @Override // p153l.epr
    /* JADX INFO: renamed from: d */
    public void mo3635d(int i, int i2) {
        this.f2690a.notifyItemMoved(i, i2);
    }
}
