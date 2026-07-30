package p006l;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class zak extends RecyclerView.n {

    /* JADX INFO: renamed from: a */
    public final int f28688a;

    /* JADX INFO: renamed from: b */
    public final int f28689b;

    public zak(int i, int i2) {
        this.f28688a = i;
        this.f28689b = i2;
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
        int adapterPosition = recyclerView.getChildViewHolder(view).getAdapterPosition();
        rect.bottom = 0;
        rect.right = 0;
        rect.left = 0;
        rect.top = 0;
        int i = this.f28689b;
        int i2 = adapterPosition / i;
        if (adapterPosition % i > 0) {
            rect.left = this.f28688a;
        }
        if (i2 > 0) {
            rect.top = this.f28688a;
        }
    }
}
