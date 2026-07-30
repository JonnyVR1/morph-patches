package p149l;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes13.dex */
public class xlf0 extends RecyclerView.AbstractC0576n {

    /* JADX INFO: renamed from: a */
    public int f193412a;

    /* JADX INFO: renamed from: b */
    public int f193413b;

    /* JADX INFO: renamed from: c */
    public int f193414c;

    public xlf0(int i, int i2, int i3) {
        this.f193412a = i;
        this.f193413b = i2;
        this.f193414c = i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0588z c0588z) {
        int adapterPosition = recyclerView.getChildViewHolder(view).getAdapterPosition();
        if (adapterPosition == 0) {
            rect.left = this.f193413b;
        } else if (adapterPosition != recyclerView.getAdapter().getItemCount() - 1) {
            rect.left = this.f193412a;
        } else {
            rect.right = this.f193414c;
            rect.left = this.f193412a;
        }
    }

    public xlf0(int i, int i2) {
        this(i, i2, i2);
    }
}
