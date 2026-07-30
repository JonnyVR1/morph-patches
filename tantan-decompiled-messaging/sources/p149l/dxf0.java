package p149l;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public class dxf0 extends RecyclerView.AbstractC0576n {

    /* JADX INFO: renamed from: a */
    public int f88281a;

    /* JADX INFO: renamed from: b */
    public int f88282b;

    /* JADX INFO: renamed from: c */
    public int f88283c;

    /* JADX INFO: renamed from: d */
    public int f88284d;

    /* JADX INFO: renamed from: e */
    public boolean f88285e;

    /* JADX INFO: renamed from: f */
    public final int f88286f = t100.m186890d(100.0f);

    public dxf0(int i, int i2, int i3, int i4, boolean z) {
        this.f88281a = i;
        this.f88282b = i2;
        this.f88283c = i3;
        this.f88284d = i4;
        this.f88285e = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
    public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0588z c0588z) {
        int i;
        int i2;
        super.getItemOffsets(rect, view, recyclerView, c0588z);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int itemCount = recyclerView.getAdapter().getItemCount();
        int i3 = this.f88281a;
        int i4 = itemCount % i3;
        int i5 = childAdapterPosition + 1;
        if (i5 % i3 == 0) {
            i = (this.f88284d * 2) / 3;
        } else {
            i = childAdapterPosition % i3 != 0 ? this.f88284d / 3 : 0;
        }
        int i6 = childAdapterPosition >= i3 ? this.f88283c : 0;
        if (childAdapterPosition % i3 == 0) {
            i2 = (this.f88284d * 2) / 3;
        } else {
            i2 = i5 % i3 != 0 ? this.f88284d / 3 : 0;
        }
        int i7 = childAdapterPosition + i4 >= itemCount ? this.f88282b : 0;
        if (this.f88285e && (childAdapterPosition == itemCount - 1 || (i4 != 1 && childAdapterPosition == itemCount - 2))) {
            i7 = this.f88286f;
        }
        rect.set(i, i6, i2, i7);
    }
}
