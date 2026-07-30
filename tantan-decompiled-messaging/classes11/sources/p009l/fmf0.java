package p009l;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class fmf0 extends RecyclerView.n {

    /* JADX INFO: renamed from: a */
    public int f13085a;

    /* JADX INFO: renamed from: b */
    public int f13086b;

    /* JADX INFO: renamed from: c */
    public int f13087c;

    /* JADX INFO: renamed from: d */
    public int f13088d;

    /* JADX INFO: renamed from: e */
    public int f13089e = -1;

    /* JADX INFO: renamed from: l.fmf0$a */
    public class RunnableC0901a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ RecyclerView f13090a;

        public RunnableC0901a(RecyclerView recyclerView) {
            this.f13090a = recyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f13090a.invalidateItemDecorations();
        }
    }

    public fmf0(int i, int i2) {
        this.f13085a = i;
        this.f13086b = i2;
        this.f13087c = i / i2;
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
            if ((iB == 0 || this.f13089e != iC) && (i2 = this.f13086b) > 1) {
                for (int i3 = iC - i2; i3 < iC; i3++) {
                    iG = recyclerView.getLayoutManager().q().e(i3, this.f13086b) == 0 ? 1 : iG + 1;
                }
                this.f13088d = iG;
                if (this.f13089e != iC) {
                    this.f13089e = iC;
                    if (iB != 0) {
                        recyclerView.post(new RunnableC0901a(recyclerView));
                    }
                }
            }
            iG = iG2;
        } else if (bVar instanceof StaggeredGridLayoutManager.c) {
            StaggeredGridLayoutManager.c cVar = (StaggeredGridLayoutManager.c) bVar;
            iH = cVar.h() ? this.f13086b : 1;
            iG = cVar.g();
        } else {
            iH = 1;
        }
        if (iH < 1 || iG < 0 || iH > (i = this.f13086b)) {
            return;
        }
        int i4 = this.f13085a;
        int i5 = this.f13087c;
        rect.left = i4 - (i5 * iG);
        rect.right = i5 + (((iG + iH) - 1) * i5);
        if (i == 1 && iB == iC - 1) {
            rect.bottom = i4;
        } else if (iB >= iC - this.f13088d && iB < iC) {
            rect.bottom = i4 + t100.d(120.0f);
        }
        rect.top = this.f13085a;
    }
}
