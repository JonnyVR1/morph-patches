package p003l;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class dmf0 extends RecyclerView.n {

    /* JADX INFO: renamed from: a */
    public int f3030a;

    /* JADX INFO: renamed from: b */
    public int f3031b;

    /* JADX INFO: renamed from: c */
    public int f3032c;

    /* JADX INFO: renamed from: d */
    public int f3033d;

    /* JADX INFO: renamed from: e */
    public int f3034e = -1;

    /* JADX INFO: renamed from: l.dmf0$a */
    public class RunnableC0233a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ RecyclerView f3035a;

        public RunnableC0233a(RecyclerView recyclerView) {
            this.f3035a = recyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3035a.invalidateItemDecorations();
        }
    }

    public dmf0(int i, int i2) {
        this.f3030a = i;
        this.f3031b = i2;
        this.f3032c = i / i2;
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
            if ((iB == 0 || this.f3034e != iC) && (i2 = this.f3031b) > 1) {
                for (int i3 = iC - i2; i3 < iC; i3++) {
                    iG = recyclerView.getLayoutManager().q().e(i3, this.f3031b) == 0 ? 1 : iG + 1;
                }
                this.f3033d = iG;
                if (this.f3034e != iC) {
                    this.f3034e = iC;
                    if (iB != 0) {
                        recyclerView.post(new RunnableC0233a(recyclerView));
                    }
                }
            }
            iG = iG2;
        } else if (bVar instanceof StaggeredGridLayoutManager.c) {
            StaggeredGridLayoutManager.c cVar = (StaggeredGridLayoutManager.c) bVar;
            iH = cVar.h() ? this.f3031b : 1;
            iG = cVar.g();
        } else {
            iH = 1;
        }
        if (iH < 1 || iG < 0 || iH > (i = this.f3031b)) {
            return;
        }
        int i4 = this.f3030a;
        int i5 = this.f3032c;
        rect.left = i4 - (i5 * iG);
        rect.right = i5 + (((iG + iH) - 1) * i5);
        if (i == 1 && iB == iC - 1) {
            rect.bottom = i4;
        } else if (iB >= iC - this.f3033d && iB < iC) {
            rect.bottom = i4 + t100.d(120.0f);
        }
        rect.top = this.f3030a;
    }
}
