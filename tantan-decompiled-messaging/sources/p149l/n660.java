package p149l;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes13.dex */
public class n660 extends RecyclerView.AbstractC0576n {

    /* JADX INFO: renamed from: a */
    public int f137270a;

    /* JADX INFO: renamed from: b */
    public int f137271b;

    /* JADX INFO: renamed from: c */
    public int f137272c;

    public n660(int i, int i2, int i3) {
        this.f137270a = i;
        this.f137271b = i2;
        this.f137272c = i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
    public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0588z c0588z) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == 0) {
            int i = this.f137270a;
            int i2 = this.f137271b;
            if (i == 1) {
                rect.top = i2;
            } else {
                rect.left = i2;
            }
        }
        if (childAdapterPosition == c0588z.m3487c() - 1) {
            int i3 = this.f137270a;
            int i4 = this.f137272c;
            if (i3 == 1) {
                rect.bottom = i4;
            } else {
                rect.right = i4;
            }
        }
    }
}
