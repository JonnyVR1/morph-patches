package p153l;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes11.dex */
public class qdk extends RecyclerView.AbstractC0578n {

    /* JADX INFO: renamed from: a */
    public final int f156738a;

    /* JADX INFO: renamed from: b */
    public final int f156739b;

    public qdk(int i, int i2) {
        this.f156738a = i;
        this.f156739b = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0561a0 c0561a0) {
        int adapterPosition = recyclerView.getChildViewHolder(view).getAdapterPosition();
        int i = this.f156738a;
        int i2 = i / 2;
        rect.bottom = i2;
        rect.right = i2;
        rect.left = i2;
        rect.top = i2;
        if (adapterPosition % this.f156739b == 0) {
            rect.left = i;
        } else {
            rect.right = i;
        }
        int iM3361c = c0561a0.m3361c() % this.f156739b;
        if ((iM3361c != 0 || adapterPosition < c0561a0.m3361c() - this.f156739b) && (iM3361c == 0 || adapterPosition < c0561a0.m3361c() - iM3361c)) {
            return;
        }
        rect.bottom = 0;
    }
}
