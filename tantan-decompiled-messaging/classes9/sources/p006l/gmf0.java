package p006l;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class gmf0 extends RecyclerView.n {

    /* JADX INFO: renamed from: a */
    public int f13389a;

    /* JADX INFO: renamed from: b */
    public int f13390b;

    /* JADX INFO: renamed from: c */
    public int f13391c;

    /* JADX INFO: renamed from: d */
    public int f13392d;

    /* JADX INFO: renamed from: e */
    public int f13393e = -1;

    /* JADX INFO: renamed from: l.gmf0$a */
    public class RunnableC0772a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ RecyclerView f13394a;

        public RunnableC0772a(RecyclerView recyclerView) {
            this.f13394a = recyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f13394a.invalidateItemDecorations();
        }
    }

    public gmf0(int i, int i2) {
        this.f13389a = i;
        this.f13390b = i2;
        this.f13391c = i / i2;
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
            if ((iB == 0 || this.f13393e != iC) && (i2 = this.f13390b) > 1) {
                for (int i3 = iC - i2; i3 < iC; i3++) {
                    iG = recyclerView.getLayoutManager().q().e(i3, this.f13390b) == 0 ? 1 : iG + 1;
                }
                this.f13392d = iG;
                if (this.f13393e != iC) {
                    this.f13393e = iC;
                    if (iB != 0) {
                        recyclerView.post(new RunnableC0772a(recyclerView));
                    }
                }
            }
            iG = iG2;
        } else if (bVar instanceof StaggeredGridLayoutManager.c) {
            StaggeredGridLayoutManager.c cVar = (StaggeredGridLayoutManager.c) bVar;
            iH = cVar.h() ? this.f13390b : 1;
            iG = cVar.g();
        } else {
            iH = 1;
        }
        if (iH < 1 || iG < 0 || iH > (i = this.f13390b)) {
            return;
        }
        int i4 = this.f13389a;
        int i5 = this.f13391c;
        rect.left = i4 - (i5 * iG);
        rect.right = i5 + (((iG + iH) - 1) * i5);
        if (i == 1 && iB == iC - 1) {
            rect.bottom = i4;
        } else if (iB >= iC - this.f13392d && iB < iC) {
            rect.bottom = i4 + t100.d(120.0f);
        }
        rect.top = this.f13389a;
    }
}
