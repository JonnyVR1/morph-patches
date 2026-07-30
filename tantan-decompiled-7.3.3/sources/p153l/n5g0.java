package p153l;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public class n5g0 extends RecyclerView.AbstractC0578n {

    /* JADX INFO: renamed from: a */
    public int f140358a;

    /* JADX INFO: renamed from: b */
    public int f140359b;

    /* JADX INFO: renamed from: c */
    public int f140360c;

    /* JADX INFO: renamed from: d */
    public int f140361d;

    /* JADX INFO: renamed from: e */
    public boolean f140362e;

    /* JADX INFO: renamed from: f */
    public final int f140363f = qa00.m175859d(100.0f);

    public n5g0(int i, int i2, int i3, int i4, boolean z) {
        this.f140358a = i;
        this.f140359b = i2;
        this.f140360c = i3;
        this.f140361d = i4;
        this.f140362e = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
    public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0561a0 c0561a0) {
        int i;
        int i2;
        super.getItemOffsets(rect, view, recyclerView, c0561a0);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int itemCount = recyclerView.getAdapter().getItemCount();
        int i3 = this.f140358a;
        int i4 = itemCount % i3;
        int i5 = childAdapterPosition + 1;
        if (i5 % i3 == 0) {
            i = (this.f140361d * 2) / 3;
        } else {
            i = childAdapterPosition % i3 != 0 ? this.f140361d / 3 : 0;
        }
        int i6 = childAdapterPosition >= i3 ? this.f140360c : 0;
        if (childAdapterPosition % i3 == 0) {
            i2 = (this.f140361d * 2) / 3;
        } else {
            i2 = i5 % i3 != 0 ? this.f140361d / 3 : 0;
        }
        int i7 = childAdapterPosition + i4 >= itemCount ? this.f140359b : 0;
        if (this.f140362e && (childAdapterPosition == itemCount - 1 || (i4 != 1 && childAdapterPosition == itemCount - 2))) {
            i7 = this.f140363f;
        }
        rect.set(i, i6, i2, i7);
    }
}
