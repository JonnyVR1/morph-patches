package p149l;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes11.dex */
public class mf40 extends RecyclerView.AbstractC0576n {

    /* JADX INFO: renamed from: a */
    public int f133558a;

    /* JADX INFO: renamed from: b */
    public int f133559b;

    /* JADX INFO: renamed from: c */
    public int f133560c;

    public mf40(int i, int i2, int i3) {
        this.f133558a = i;
        this.f133559b = i2;
        this.f133560c = i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
    public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0588z c0588z) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i = childAdapterPosition % this.f133558a;
        int iM208412y0 = xdl0.m208412y0() - t100.m186890d(80.0f);
        int i2 = this.f133560c;
        int i3 = this.f133558a;
        int i4 = (iM208412y0 - (i2 * i3)) / (i3 - 1);
        rect.left = (i * i4) / i3;
        rect.right = i4 - (((i + 1) * i4) / i3);
        if (childAdapterPosition >= i3) {
            rect.top = this.f133559b;
        }
    }
}
