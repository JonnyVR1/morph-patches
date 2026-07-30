package p149l;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public class atf0 extends RecyclerView.AbstractC0576n {

    /* JADX INFO: renamed from: a */
    public final int f71607a;

    public atf0(int i) {
        this.f71607a = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
    public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0588z c0588z) {
        super.getItemOffsets(rect, view, recyclerView, c0588z);
        int iM3330g = view.getLayoutParams() instanceof GridLayoutManager.C0552b ? ((GridLayoutManager.C0552b) view.getLayoutParams()).m3330g() : 0;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i = this.f71607a;
        if (childAdapterPosition < i) {
            rect.top = 0;
        } else {
            rect.top = 0;
        }
        if (iM3330g == 0) {
            rect.left = 0;
        } else if (iM3330g == i - 1) {
            rect.right = 0;
        }
    }
}
