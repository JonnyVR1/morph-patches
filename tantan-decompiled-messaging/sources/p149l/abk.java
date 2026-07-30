package p149l;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes11.dex */
public class abk extends RecyclerView.AbstractC0576n {

    /* JADX INFO: renamed from: a */
    public final int f68702a;

    /* JADX INFO: renamed from: b */
    public final int f68703b;

    public abk(int i, int i2) {
        this.f68702a = i;
        this.f68703b = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0588z c0588z) {
        int adapterPosition = recyclerView.getChildViewHolder(view).getAdapterPosition();
        int i = this.f68702a;
        int i2 = i / 2;
        rect.bottom = i2;
        rect.right = i2;
        rect.left = i2;
        rect.top = i2;
        if (adapterPosition % this.f68703b == 0) {
            rect.left = i;
        } else {
            rect.right = i;
        }
        int iM3487c = c0588z.m3487c() % this.f68703b;
        if ((iM3487c != 0 || adapterPosition < c0588z.m3487c() - this.f68703b) && (iM3487c == 0 || adapterPosition < c0588z.m3487c() - iM3487c)) {
            return;
        }
        rect.bottom = 0;
    }
}
