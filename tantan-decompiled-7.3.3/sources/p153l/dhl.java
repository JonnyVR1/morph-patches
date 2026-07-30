package p153l;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public class dhl extends RecyclerView.AbstractC0578n {

    /* JADX INFO: renamed from: a */
    public final int f88540a;

    public dhl(int i) {
        this.f88540a = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
    public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0561a0 c0561a0) {
        rect.top = 0;
        rect.bottom = this.f88540a;
    }
}
