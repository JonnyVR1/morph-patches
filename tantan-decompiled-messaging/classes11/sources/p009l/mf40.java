package p009l;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import l.t100;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class mf40 extends RecyclerView.n {

    /* JADX INFO: renamed from: a */
    public int f16872a;

    /* JADX INFO: renamed from: b */
    public int f16873b;

    /* JADX INFO: renamed from: c */
    public int f16874c;

    public mf40(int i, int i2, int i3) {
        this.f16872a = i;
        this.f16873b = i2;
        this.f16874c = i3;
    }

    public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.z zVar) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i = childAdapterPosition % this.f16872a;
        int iY0 = xdl0.y0() - t100.d(80.0f);
        int i2 = this.f16874c;
        int i3 = this.f16872a;
        int i4 = (iY0 - (i2 * i3)) / (i3 - 1);
        rect.left = (i * i4) / i3;
        rect.right = i4 - (((i + 1) * i4) / i3);
        if (childAdapterPosition >= i3) {
            rect.top = this.f16873b;
        }
    }
}
