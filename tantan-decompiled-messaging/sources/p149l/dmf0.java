package p149l;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* JADX INFO: loaded from: classes3.dex */
public class dmf0 extends RecyclerView.AbstractC0576n {

    /* JADX INFO: renamed from: a */
    public int f86938a;

    /* JADX INFO: renamed from: b */
    public int f86939b;

    /* JADX INFO: renamed from: c */
    public int f86940c;

    /* JADX INFO: renamed from: d */
    public int f86941d;

    /* JADX INFO: renamed from: e */
    public int f86942e = -1;

    /* JADX INFO: renamed from: l.dmf0$a */
    public class RunnableC16411a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ RecyclerView f86943a;

        public RunnableC16411a(RecyclerView recyclerView) {
            this.f86943a = recyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f86943a.invalidateItemDecorations();
        }
    }

    public dmf0(int i, int i2) {
        this.f86938a = i;
        this.f86939b = i2;
        this.f86940c = i / i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0588z c0588z) {
        int iM3331h;
        int i;
        int i2;
        RecyclerView.C0578p c0578p = (RecyclerView.C0578p) view.getLayoutParams();
        int iM3487c = c0588z.m3487c();
        int iM3408b = c0578p.m3408b();
        int iM3574g = 0;
        if (c0578p instanceof GridLayoutManager.C0552b) {
            GridLayoutManager.C0552b c0552b = (GridLayoutManager.C0552b) c0578p;
            iM3331h = c0552b.m3331h();
            int iM3330g = c0552b.m3330g();
            if ((iM3408b == 0 || this.f86942e != iM3487c) && (i2 = this.f86939b) > 1) {
                for (int i3 = iM3487c - i2; i3 < iM3487c; i3++) {
                    iM3574g = ((GridLayoutManager) recyclerView.getLayoutManager()).m3321q().mo3328e(i3, this.f86939b) == 0 ? 1 : iM3574g + 1;
                }
                this.f86941d = iM3574g;
                if (this.f86942e != iM3487c) {
                    this.f86942e = iM3487c;
                    if (iM3408b != 0) {
                        recyclerView.post(new RunnableC16411a(recyclerView));
                    }
                }
            }
            iM3574g = iM3330g;
        } else if (c0578p instanceof StaggeredGridLayoutManager.C0593c) {
            StaggeredGridLayoutManager.C0593c c0593c = (StaggeredGridLayoutManager.C0593c) c0578p;
            iM3331h = c0593c.m3575h() ? this.f86939b : 1;
            iM3574g = c0593c.m3574g();
        } else {
            iM3331h = 1;
        }
        if (iM3331h < 1 || iM3574g < 0 || iM3331h > (i = this.f86939b)) {
            return;
        }
        int i4 = this.f86938a;
        int i5 = this.f86940c;
        rect.left = i4 - (i5 * iM3574g);
        rect.right = i5 + (((iM3574g + iM3331h) - 1) * i5);
        if (i == 1 && iM3408b == iM3487c - 1) {
            rect.bottom = i4;
        } else if (iM3408b >= iM3487c - this.f86941d && iM3408b < iM3487c) {
            rect.bottom = i4 + t100.m186890d(120.0f);
        }
        rect.top = this.f86938a;
    }
}
