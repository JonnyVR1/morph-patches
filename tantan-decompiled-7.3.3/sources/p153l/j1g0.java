package p153l;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public class j1g0 extends RecyclerView.AbstractC0578n {

    /* JADX INFO: renamed from: a */
    public final int f117964a;

    public j1g0(int i) {
        this.f117964a = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
    public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0561a0 c0561a0) {
        super.getItemOffsets(rect, view, recyclerView, c0561a0);
        int iM3331g = view.getLayoutParams() instanceof GridLayoutManager.C0553b ? ((GridLayoutManager.C0553b) view.getLayoutParams()).m3331g() : 0;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i = this.f117964a;
        if (childAdapterPosition < i) {
            rect.top = 0;
        } else {
            rect.top = 0;
        }
        if (iM3331g == 0) {
            rect.left = 0;
        } else if (iM3331g == i - 1) {
            rect.right = 0;
        }
    }
}
