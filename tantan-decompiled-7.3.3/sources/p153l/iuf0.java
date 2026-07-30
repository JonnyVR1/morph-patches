package p153l;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public class iuf0 extends RecyclerView.AbstractC0578n {

    /* JADX INFO: renamed from: a */
    public int f116926a;

    /* JADX INFO: renamed from: b */
    public int f116927b;

    /* JADX INFO: renamed from: c */
    public int f116928c;

    /* JADX INFO: renamed from: d */
    public int f116929d;

    public iuf0(int i, int i2, int i3, int i4) {
        this.f116926a = i;
        this.f116927b = i2;
        this.f116928c = i3;
        this.f116929d = i4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
    public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0561a0 c0561a0) {
        int adapterPosition = recyclerView.getChildViewHolder(view).getAdapterPosition();
        if (adapterPosition == 0) {
            rect.top = this.f116927b;
            int i = this.f116926a;
            rect.left = i;
            rect.right = i;
            return;
        }
        if (adapterPosition != recyclerView.getAdapter().getItemCount() - 1) {
            int i2 = this.f116926a;
            rect.left = i2;
            rect.right = i2;
            rect.top = this.f116928c;
            return;
        }
        rect.top = this.f116928c;
        int i3 = this.f116926a;
        rect.right = i3;
        rect.left = i3;
        rect.bottom = this.f116929d;
    }
}
