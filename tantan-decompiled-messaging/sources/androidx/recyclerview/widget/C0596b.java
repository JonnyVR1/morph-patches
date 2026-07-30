package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import p149l.dnr;

/* JADX INFO: renamed from: androidx.recyclerview.widget.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0596b implements dnr {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final RecyclerView.Adapter f2690a;

    public C0596b(@NonNull RecyclerView.Adapter adapter) {
        this.f2690a = adapter;
    }

    @Override // p149l.dnr
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: a */
    public void mo3631a(int i, int i2, Object obj) {
        this.f2690a.notifyItemRangeChanged(i, i2, obj);
    }

    @Override // p149l.dnr
    /* JADX INFO: renamed from: b */
    public void mo3632b(int i, int i2) {
        this.f2690a.notifyItemRangeInserted(i, i2);
    }

    @Override // p149l.dnr
    /* JADX INFO: renamed from: c */
    public void mo3633c(int i, int i2) {
        this.f2690a.notifyItemRangeRemoved(i, i2);
    }

    @Override // p149l.dnr
    /* JADX INFO: renamed from: d */
    public void mo3634d(int i, int i2) {
        this.f2690a.notifyItemMoved(i, i2);
    }
}
