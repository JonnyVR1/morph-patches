package p007l;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class oe3 extends RecyclerView.n {

    /* JADX INFO: renamed from: a */
    public int f11438a;

    /* JADX INFO: renamed from: b */
    public boolean f11439b;

    /* JADX INFO: renamed from: c */
    public int f11440c;

    public oe3(int i, int i2, boolean z) {
        xdl0.w(88.0f);
        this.f11438a = i;
        this.f11440c = i2;
        this.f11439b = z;
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int iC = zVar.c();
        int iY0 = (xdl0.y0() - this.f11440c) / this.f11438a;
        if (this.f11439b) {
            recyclerView.getWidth();
        }
        if (childAdapterPosition == 0) {
            rect.left = iY0;
        } else if (childAdapterPosition == iC - 1) {
            rect.right = iY0;
        }
    }
}
