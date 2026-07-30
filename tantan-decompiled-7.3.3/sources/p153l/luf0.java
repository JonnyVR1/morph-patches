package p153l;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes13.dex */
public class luf0 extends RecyclerView.AbstractC0578n {

    /* JADX INFO: renamed from: a */
    public int f133630a;

    /* JADX INFO: renamed from: b */
    public int f133631b;

    public luf0(int i, int i2) {
        this.f133630a = i;
        this.f133631b = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
    public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0561a0 c0561a0) {
        if (recyclerView.getChildAdapterPosition(view) != 0) {
            int i = this.f133630a;
            int i2 = this.f133631b;
            if (i == 1) {
                rect.top = i2;
            } else {
                rect.left = i2;
            }
        }
    }
}
