package p149l;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes12.dex */
public class oe3 extends RecyclerView.AbstractC0576n {

    /* JADX INFO: renamed from: a */
    public int f143273a;

    /* JADX INFO: renamed from: b */
    public boolean f143274b;

    /* JADX INFO: renamed from: c */
    public int f143275c;

    public oe3(int i, int i2, boolean z) {
        xdl0.m208407w(88.0f);
        this.f143273a = i;
        this.f143275c = i2;
        this.f143274b = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0588z c0588z) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int iM3487c = c0588z.m3487c();
        int iM208412y0 = (xdl0.m208412y0() - this.f143275c) / this.f143273a;
        if (this.f143274b) {
            recyclerView.getWidth();
        }
        if (childAdapterPosition == 0) {
            rect.left = iM208412y0;
        } else if (childAdapterPosition == iM3487c - 1) {
            rect.right = iM208412y0;
        }
    }
}
