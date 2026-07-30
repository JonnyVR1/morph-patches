package p153l;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes12.dex */
public class pdk extends RecyclerView.AbstractC0578n {

    /* JADX INFO: renamed from: a */
    public final int f151808a;

    /* JADX INFO: renamed from: b */
    public final int f151809b;

    public pdk(int i, int i2) {
        this.f151808a = i;
        this.f151809b = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0561a0 c0561a0) {
        int adapterPosition = recyclerView.getChildViewHolder(view).getAdapterPosition();
        rect.bottom = 0;
        rect.right = 0;
        rect.left = 0;
        rect.top = 0;
        int i = this.f151809b;
        int i2 = adapterPosition / i;
        if (adapterPosition % i > 0) {
            rect.left = this.f151808a;
        }
        if (i2 > 0) {
            rect.top = this.f151808a;
        }
    }
}
