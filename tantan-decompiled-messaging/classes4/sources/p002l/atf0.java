package p002l;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class atf0 extends RecyclerView.n {

    /* JADX INFO: renamed from: a */
    public final int f7879a;

    public atf0(int i) {
        this.f7879a = i;
    }

    public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.z zVar) {
        super.getItemOffsets(rect, view, recyclerView, zVar);
        int iG = view.getLayoutParams() instanceof GridLayoutManager.b ? view.getLayoutParams().g() : 0;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i = this.f7879a;
        if (childAdapterPosition < i) {
            rect.top = 0;
        } else {
            rect.top = 0;
        }
        if (iG == 0) {
            rect.left = 0;
        } else if (iG == i - 1) {
            rect.right = 0;
        }
    }
}
