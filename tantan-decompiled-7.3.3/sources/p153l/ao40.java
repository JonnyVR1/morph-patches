package p153l;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes11.dex */
public class ao40 extends RecyclerView.AbstractC0578n {

    /* JADX INFO: renamed from: a */
    public int f72415a;

    /* JADX INFO: renamed from: b */
    public int f72416b;

    /* JADX INFO: renamed from: c */
    public int f72417c;

    public ao40(int i, int i2, int i3) {
        this.f72415a = i;
        this.f72416b = i2;
        this.f72417c = i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
    public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0561a0 c0561a0) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i = childAdapterPosition % this.f72415a;
        int iM105592y0 = bnl0.m105592y0() - qa00.m175859d(80.0f);
        int i2 = this.f72417c;
        int i3 = this.f72415a;
        int i4 = (iM105592y0 - (i2 * i3)) / (i3 - 1);
        rect.left = (i * i4) / i3;
        rect.right = i4 - (((i + 1) * i4) / i3);
        if (childAdapterPosition >= i3) {
            rect.top = this.f72416b;
        }
    }
}
