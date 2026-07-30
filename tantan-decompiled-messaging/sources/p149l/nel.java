package p149l;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public class nel extends RecyclerView.AbstractC0576n {

    /* JADX INFO: renamed from: a */
    public final int f138626a;

    public nel(int i) {
        this.f138626a = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
    public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0588z c0588z) {
        rect.top = 0;
        rect.bottom = this.f138626a;
    }
}
