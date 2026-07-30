package p153l;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* JADX INFO: loaded from: classes10.dex */
public class ouf0 extends RecyclerView.AbstractC0578n {

    /* JADX INFO: renamed from: a */
    public int f149142a;

    /* JADX INFO: renamed from: b */
    public int f149143b;

    /* JADX INFO: renamed from: c */
    public int f149144c;

    /* JADX INFO: renamed from: d */
    public int f149145d;

    /* JADX INFO: renamed from: e */
    public int f149146e = -1;

    /* JADX INFO: renamed from: l.ouf0$a */
    public class RunnableC19219a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ RecyclerView f149147a;

        public RunnableC19219a(RecyclerView recyclerView) {
            this.f149147a = recyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f149147a.invalidateItemDecorations();
        }
    }

    public ouf0(int i, int i2) {
        this.f149142a = i;
        this.f149143b = i2;
        this.f149144c = i / i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0561a0 c0561a0) {
        int iM3332h;
        int i;
        int i2;
        RecyclerView.C0580p c0580p = (RecyclerView.C0580p) view.getLayoutParams();
        int iM3361c = c0561a0.m3361c();
        int iM3417b = c0580p.m3417b();
        int iM3575g = 0;
        if (c0580p instanceof GridLayoutManager.C0553b) {
            GridLayoutManager.C0553b c0553b = (GridLayoutManager.C0553b) c0580p;
            iM3332h = c0553b.m3332h();
            int iM3331g = c0553b.m3331g();
            if ((iM3417b == 0 || this.f149146e != iM3361c) && (i2 = this.f149143b) > 1) {
                for (int i3 = iM3361c - i2; i3 < iM3361c; i3++) {
                    iM3575g = ((GridLayoutManager) recyclerView.getLayoutManager()).m3322q().mo3329e(i3, this.f149143b) == 0 ? 1 : iM3575g + 1;
                }
                this.f149145d = iM3575g;
                if (this.f149146e != iM3361c) {
                    this.f149146e = iM3361c;
                    if (iM3417b != 0) {
                        recyclerView.post(new RunnableC19219a(recyclerView));
                    }
                }
            }
            iM3575g = iM3331g;
        } else if (c0580p instanceof StaggeredGridLayoutManager.C0595c) {
            StaggeredGridLayoutManager.C0595c c0595c = (StaggeredGridLayoutManager.C0595c) c0580p;
            iM3332h = c0595c.m3576h() ? this.f149143b : 1;
            iM3575g = c0595c.m3575g();
        } else {
            iM3332h = 1;
        }
        if (iM3332h < 1 || iM3575g < 0 || iM3332h > (i = this.f149143b)) {
            return;
        }
        int i4 = this.f149142a;
        int i5 = this.f149144c;
        rect.left = i4 - (i5 * iM3575g);
        rect.right = i5 + (((iM3575g + iM3332h) - 1) * i5);
        if (i == 1 && iM3417b == iM3361c - 1) {
            rect.bottom = i4;
        } else if (iM3417b >= iM3361c - this.f149145d && iM3417b < iM3361c) {
            rect.bottom = i4 + qa00.m175859d(120.0f);
        }
        rect.top = this.f149142a;
    }
}
