package p002l;

import android.util.DisplayMetrics;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import com.p000p1.mobile.putong.core.p001ui.messages.view.page_grid.PagerGridLayoutManager;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class a760 extends n {

    /* JADX INFO: renamed from: a */
    public RecyclerView f7430a;

    public a760(@NonNull RecyclerView recyclerView) {
        super(recyclerView.getContext());
        this.f7430a = recyclerView;
    }

    public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        return z660.m27100a() / displayMetrics.densityDpi;
    }

    public void onTargetFound(View view, RecyclerView.z zVar, RecyclerView.y.a aVar) {
        RecyclerView.o layoutManager = this.f7430a.getLayoutManager();
        if (layoutManager != null && (layoutManager instanceof PagerGridLayoutManager)) {
            int[] iArrM478h = ((PagerGridLayoutManager) layoutManager).m478h(this.f7430a.getChildAdapterPosition(view));
            int i = iArrM478h[0];
            int i2 = iArrM478h[1];
            int iCalculateTimeForScrolling = calculateTimeForScrolling(Math.max(Math.abs(i), Math.abs(i2)));
            if (iCalculateTimeForScrolling > 0) {
                aVar.d(i, i2, iCalculateTimeForScrolling, ((n) this).mDecelerateInterpolator);
            }
        }
    }
}
