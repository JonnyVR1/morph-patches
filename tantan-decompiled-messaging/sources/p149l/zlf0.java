package p149l;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public class zlf0 extends RecyclerView.AbstractC0576n {

    /* JADX INFO: renamed from: a */
    public int f203630a;

    /* JADX INFO: renamed from: b */
    public int f203631b;

    /* JADX INFO: renamed from: c */
    public int f203632c;

    /* JADX INFO: renamed from: d */
    public int f203633d;

    public zlf0(int i, int i2, int i3, int i4) {
        this.f203630a = i;
        this.f203631b = i2;
        this.f203632c = i3;
        this.f203633d = i4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
    public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0588z c0588z) {
        int adapterPosition = recyclerView.getChildViewHolder(view).getAdapterPosition();
        if (adapterPosition == 0) {
            rect.top = this.f203631b;
            int i = this.f203630a;
            rect.left = i;
            rect.right = i;
            return;
        }
        if (adapterPosition != recyclerView.getAdapter().getItemCount() - 1) {
            int i2 = this.f203630a;
            rect.left = i2;
            rect.right = i2;
            rect.top = this.f203632c;
            return;
        }
        rect.top = this.f203632c;
        int i3 = this.f203630a;
        rect.right = i3;
        rect.left = i3;
        rect.bottom = this.f203633d;
    }
}
