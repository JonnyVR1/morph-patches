package p153l;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes13.dex */
public class df3 extends RecyclerView.AbstractC0578n {

    /* JADX INFO: renamed from: a */
    public int f88111a;

    /* JADX INFO: renamed from: b */
    public boolean f88112b;

    /* JADX INFO: renamed from: c */
    public int f88113c;

    public df3(int i, int i2, boolean z) {
        bnl0.m105587w(88.0f);
        this.f88111a = i;
        this.f88113c = i2;
        this.f88112b = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0561a0 c0561a0) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int iM3361c = c0561a0.m3361c();
        int iM105592y0 = (bnl0.m105592y0() - this.f88113c) / this.f88111a;
        if (this.f88112b) {
            recyclerView.getWidth();
        }
        if (childAdapterPosition == 0) {
            rect.left = iM105592y0;
        } else if (childAdapterPosition == iM3361c - 1) {
            rect.right = iM105592y0;
        }
    }
}
