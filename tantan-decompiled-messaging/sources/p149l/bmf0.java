package p149l;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public class bmf0 extends RecyclerView.AbstractC0576n {

    /* JADX INFO: renamed from: a */
    public int f76281a;

    /* JADX INFO: renamed from: b */
    public int f76282b;

    public bmf0(int i, int i2) {
        this.f76281a = i;
        this.f76282b = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0588z c0588z) {
        int adapterPosition = recyclerView.getChildViewHolder(view).getAdapterPosition();
        if (adapterPosition == 0) {
            rect.right = this.f76282b;
        } else if (adapterPosition != recyclerView.getAdapter().getItemCount() - 1) {
            rect.right = this.f76281a;
        } else {
            rect.left = this.f76282b;
            rect.right = this.f76281a;
        }
    }
}
