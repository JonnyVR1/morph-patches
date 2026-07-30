package p002l;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class nel extends RecyclerView.n {

    /* JADX INFO: renamed from: a */
    public final int f15973a;

    public nel(int i) {
        this.f15973a = i;
    }

    public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.z zVar) {
        rect.top = 0;
        rect.bottom = this.f15973a;
    }
}
