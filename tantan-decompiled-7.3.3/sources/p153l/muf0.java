package p153l;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* JADX INFO: loaded from: classes3.dex */
public class muf0 extends RecyclerView.AbstractC0578n {

    /* JADX INFO: renamed from: a */
    public int f138772a;

    /* JADX INFO: renamed from: b */
    public int f138773b;

    /* JADX INFO: renamed from: c */
    public int f138774c;

    /* JADX INFO: renamed from: d */
    public int f138775d;

    /* JADX INFO: renamed from: e */
    public int f138776e = -1;

    /* JADX INFO: renamed from: l.muf0$a */
    public class RunnableC18713a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ RecyclerView f138777a;

        public RunnableC18713a(RecyclerView recyclerView) {
            this.f138777a = recyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f138777a.invalidateItemDecorations();
        }
    }

    public muf0(int i, int i2) {
        this.f138772a = i;
        this.f138773b = i2;
        this.f138774c = i / i2;
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
            if ((iM3417b == 0 || this.f138776e != iM3361c) && (i2 = this.f138773b) > 1) {
                for (int i3 = iM3361c - i2; i3 < iM3361c; i3++) {
                    iM3575g = ((GridLayoutManager) recyclerView.getLayoutManager()).m3322q().mo3329e(i3, this.f138773b) == 0 ? 1 : iM3575g + 1;
                }
                this.f138775d = iM3575g;
                if (this.f138776e != iM3361c) {
                    this.f138776e = iM3361c;
                    if (iM3417b != 0) {
                        recyclerView.post(new RunnableC18713a(recyclerView));
                    }
                }
            }
            iM3575g = iM3331g;
        } else if (c0580p instanceof StaggeredGridLayoutManager.C0595c) {
            StaggeredGridLayoutManager.C0595c c0595c = (StaggeredGridLayoutManager.C0595c) c0580p;
            iM3332h = c0595c.m3576h() ? this.f138773b : 1;
            iM3575g = c0595c.m3575g();
        } else {
            iM3332h = 1;
        }
        if (iM3332h < 1 || iM3575g < 0 || iM3332h > (i = this.f138773b)) {
            return;
        }
        int i4 = this.f138772a;
        int i5 = this.f138774c;
        rect.left = i4 - (i5 * iM3575g);
        rect.right = i5 + (((iM3575g + iM3332h) - 1) * i5);
        if (i == 1 && iM3417b == iM3361c - 1) {
            rect.bottom = i4;
        } else if (iM3417b >= iM3361c - this.f138775d && iM3417b < iM3361c) {
            rect.bottom = i4 + qa00.m175859d(120.0f);
        }
        rect.top = this.f138772a;
    }
}
