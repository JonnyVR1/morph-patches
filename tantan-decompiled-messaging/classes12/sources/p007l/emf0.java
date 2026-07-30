package p007l;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class emf0 extends RecyclerView.n {

    /* JADX INFO: renamed from: a */
    public int f7424a;

    /* JADX INFO: renamed from: b */
    public int f7425b;

    /* JADX INFO: renamed from: c */
    public int f7426c;

    /* JADX INFO: renamed from: d */
    public int f7427d;

    /* JADX INFO: renamed from: e */
    public int f7428e = -1;

    /* JADX INFO: renamed from: l.emf0$a */
    public class RunnableC2378a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ RecyclerView f7429a;

        public RunnableC2378a(RecyclerView recyclerView) {
            this.f7429a = recyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f7429a.invalidateItemDecorations();
        }
    }

    public emf0(int i, int i2) {
        this.f7424a = i;
        this.f7425b = i2;
        this.f7426c = i / i2;
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
        int iH;
        int i;
        int i2;
        GridLayoutManager.b bVar = (RecyclerView.p) view.getLayoutParams();
        int iC = zVar.c();
        int iB = bVar.b();
        int iG = 0;
        if (bVar instanceof GridLayoutManager.b) {
            GridLayoutManager.b bVar2 = bVar;
            iH = bVar2.h();
            int iG2 = bVar2.g();
            if ((iB == 0 || this.f7428e != iC) && (i2 = this.f7425b) > 1) {
                for (int i3 = iC - i2; i3 < iC; i3++) {
                    iG = recyclerView.getLayoutManager().q().e(i3, this.f7425b) == 0 ? 1 : iG + 1;
                }
                this.f7427d = iG;
                if (this.f7428e != iC) {
                    this.f7428e = iC;
                    if (iB != 0) {
                        recyclerView.post(new RunnableC2378a(recyclerView));
                    }
                }
            }
            iG = iG2;
        } else if (bVar instanceof StaggeredGridLayoutManager.c) {
            StaggeredGridLayoutManager.c cVar = (StaggeredGridLayoutManager.c) bVar;
            iH = cVar.h() ? this.f7425b : 1;
            iG = cVar.g();
        } else {
            iH = 1;
        }
        if (iH < 1 || iG < 0 || iH > (i = this.f7425b)) {
            return;
        }
        int i4 = this.f7424a;
        int i5 = this.f7426c;
        rect.left = i4 - (i5 * iG);
        rect.right = i5 + (((iG + iH) - 1) * i5);
        if (i == 1 && iB == iC - 1) {
            rect.bottom = i4;
        } else if (iB >= iC - this.f7427d && iB < iC) {
            rect.bottom = i4 + t100.d(120.0f);
        }
        rect.top = this.f7424a;
    }
}
