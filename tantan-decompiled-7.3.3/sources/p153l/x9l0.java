package p153l;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class x9l0 extends RecyclerView.AbstractC0578n {

    /* JADX INFO: renamed from: a */
    private final int f192948a;

    public x9l0(int i) {
        this.f192948a = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
    public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0561a0 c0561a0) {
        rect.bottom = this.f192948a;
    }
}
