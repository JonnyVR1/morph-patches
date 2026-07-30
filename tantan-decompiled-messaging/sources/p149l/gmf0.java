package p149l;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* JADX INFO: loaded from: classes9.dex */
public class gmf0 extends RecyclerView.AbstractC0576n {

    /* JADX INFO: renamed from: a */
    public int f103457a;

    /* JADX INFO: renamed from: b */
    public int f103458b;

    /* JADX INFO: renamed from: c */
    public int f103459c;

    /* JADX INFO: renamed from: d */
    public int f103460d;

    /* JADX INFO: renamed from: e */
    public int f103461e = -1;

    /* JADX INFO: renamed from: l.gmf0$a */
    public class RunnableC17123a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ RecyclerView f103462a;

        public RunnableC17123a(RecyclerView recyclerView) {
            this.f103462a = recyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f103462a.invalidateItemDecorations();
        }
    }

    public gmf0(int i, int i2) {
        this.f103457a = i;
        this.f103458b = i2;
        this.f103459c = i / i2;
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
            if ((iM3408b == 0 || this.f103461e != iM3487c) && (i2 = this.f103458b) > 1) {
                for (int i3 = iM3487c - i2; i3 < iM3487c; i3++) {
                    iM3574g = ((GridLayoutManager) recyclerView.getLayoutManager()).m3321q().mo3328e(i3, this.f103458b) == 0 ? 1 : iM3574g + 1;
                }
                this.f103460d = iM3574g;
                if (this.f103461e != iM3487c) {
                    this.f103461e = iM3487c;
                    if (iM3408b != 0) {
                        recyclerView.post(new RunnableC17123a(recyclerView));
                    }
                }
            }
            iM3574g = iM3330g;
        } else if (c0578p instanceof StaggeredGridLayoutManager.C0593c) {
            StaggeredGridLayoutManager.C0593c c0593c = (StaggeredGridLayoutManager.C0593c) c0578p;
            iM3331h = c0593c.m3575h() ? this.f103458b : 1;
            iM3574g = c0593c.m3574g();
        } else {
            iM3331h = 1;
        }
        if (iM3331h < 1 || iM3574g < 0 || iM3331h > (i = this.f103458b)) {
            return;
        }
        int i4 = this.f103457a;
        int i5 = this.f103459c;
        rect.left = i4 - (i5 * iM3574g);
        rect.right = i5 + (((iM3574g + iM3331h) - 1) * i5);
        if (i == 1 && iM3408b == iM3487c - 1) {
            rect.bottom = i4;
        } else if (iM3408b >= iM3487c - this.f103460d && iM3408b < iM3487c) {
            rect.bottom = i4 + t100.m186890d(120.0f);
        }
        rect.top = this.f103457a;
    }
}
