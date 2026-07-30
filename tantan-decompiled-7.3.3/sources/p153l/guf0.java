package p153l;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes13.dex */
public class guf0 extends RecyclerView.AbstractC0578n {

    /* JADX INFO: renamed from: a */
    public int f106495a;

    /* JADX INFO: renamed from: b */
    public int f106496b;

    /* JADX INFO: renamed from: c */
    public int f106497c;

    public guf0(int i, int i2, int i3) {
        this.f106495a = i;
        this.f106496b = i2;
        this.f106497c = i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0561a0 c0561a0) {
        int adapterPosition = recyclerView.getChildViewHolder(view).getAdapterPosition();
        if (adapterPosition == 0) {
            rect.left = this.f106496b;
        } else if (adapterPosition != recyclerView.getAdapter().getItemCount() - 1) {
            rect.left = this.f106495a;
        } else {
            rect.right = this.f106497c;
            rect.left = this.f106495a;
        }
    }

    public guf0(int i, int i2) {
        this(i, i2, i2);
    }
}
