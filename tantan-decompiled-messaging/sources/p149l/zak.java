package p149l;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public class zak extends RecyclerView.AbstractC0576n {

    /* JADX INFO: renamed from: a */
    public final int f202368a;

    /* JADX INFO: renamed from: b */
    public final int f202369b;

    public zak(int i, int i2) {
        this.f202368a = i;
        this.f202369b = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0588z c0588z) {
        int adapterPosition = recyclerView.getChildViewHolder(view).getAdapterPosition();
        rect.bottom = 0;
        rect.right = 0;
        rect.left = 0;
        rect.top = 0;
        int i = this.f202369b;
        int i2 = adapterPosition / i;
        if (adapterPosition % i > 0) {
            rect.left = this.f202368a;
        }
        if (i2 > 0) {
            rect.top = this.f202368a;
        }
    }
}
