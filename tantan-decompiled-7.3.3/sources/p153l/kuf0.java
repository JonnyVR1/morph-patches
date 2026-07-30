package p153l;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public class kuf0 extends RecyclerView.AbstractC0578n {

    /* JADX INFO: renamed from: a */
    public int f128865a;

    /* JADX INFO: renamed from: b */
    public int f128866b;

    public kuf0(int i, int i2) {
        this.f128865a = i;
        this.f128866b = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0561a0 c0561a0) {
        int adapterPosition = recyclerView.getChildViewHolder(view).getAdapterPosition();
        if (adapterPosition == 0) {
            rect.right = this.f128866b;
        } else if (adapterPosition != recyclerView.getAdapter().getItemCount() - 1) {
            rect.right = this.f128865a;
        } else {
            rect.left = this.f128866b;
            rect.right = this.f128865a;
        }
    }
}
