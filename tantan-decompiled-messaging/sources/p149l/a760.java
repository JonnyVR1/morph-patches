package p149l;

import android.util.DisplayMetrics;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.C0608n;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.core.p053ui.messages.view.page_grid.PagerGridLayoutManager;

/* JADX INFO: loaded from: classes4.dex */
public class a760 extends C0608n {

    /* JADX INFO: renamed from: a */
    public RecyclerView f67841a;

    public a760(@NonNull RecyclerView recyclerView) {
        super(recyclerView.getContext());
        this.f67841a = recyclerView;
    }

    @Override // androidx.recyclerview.widget.C0608n
    public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        return z660.m217389a() / displayMetrics.densityDpi;
    }

    @Override // androidx.recyclerview.widget.C0608n, androidx.recyclerview.widget.RecyclerView.AbstractC0587y
    public void onTargetFound(View view, RecyclerView.C0588z c0588z, RecyclerView.AbstractC0587y.a aVar) {
        RecyclerView.AbstractC0577o layoutManager = this.f67841a.getLayoutManager();
        if (layoutManager != null && (layoutManager instanceof PagerGridLayoutManager)) {
            int[] iArrM50053h = ((PagerGridLayoutManager) layoutManager).m50053h(this.f67841a.getChildAdapterPosition(view));
            int i = iArrM50053h[0];
            int i2 = iArrM50053h[1];
            int iCalculateTimeForScrolling = calculateTimeForScrolling(Math.max(Math.abs(i), Math.abs(i2)));
            if (iCalculateTimeForScrolling > 0) {
                aVar.m3483d(i, i2, iCalculateTimeForScrolling, this.mDecelerateInterpolator);
            }
        }
    }
}
