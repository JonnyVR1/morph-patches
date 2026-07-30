package p149l;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes13.dex */
public class cmf0 extends RecyclerView.AbstractC0576n {

    /* JADX INFO: renamed from: a */
    public int f81557a;

    /* JADX INFO: renamed from: b */
    public int f81558b;

    public cmf0(int i, int i2) {
        this.f81557a = i;
        this.f81558b = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
    public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0588z c0588z) {
        if (recyclerView.getChildAdapterPosition(view) != 0) {
            int i = this.f81557a;
            int i2 = this.f81558b;
            if (i == 1) {
                rect.top = i2;
            } else {
                rect.left = i2;
            }
        }
    }
}
