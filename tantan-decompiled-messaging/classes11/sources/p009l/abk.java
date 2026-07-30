package p009l;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class abk extends RecyclerView.n {

    /* JADX INFO: renamed from: a */
    public final int f9367a;

    /* JADX INFO: renamed from: b */
    public final int f9368b;

    public abk(int i, int i2) {
        this.f9367a = i;
        this.f9368b = i2;
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
        int adapterPosition = recyclerView.getChildViewHolder(view).getAdapterPosition();
        int i = this.f9367a;
        int i2 = i / 2;
        rect.bottom = i2;
        rect.right = i2;
        rect.left = i2;
        rect.top = i2;
        if (adapterPosition % this.f9368b == 0) {
            rect.left = i;
        } else {
            rect.right = i;
        }
        int iC = zVar.c() % this.f9368b;
        if ((iC != 0 || adapterPosition < zVar.c() - this.f9368b) && (iC == 0 || adapterPosition < zVar.c() - iC)) {
            return;
        }
        rect.bottom = 0;
    }
}
