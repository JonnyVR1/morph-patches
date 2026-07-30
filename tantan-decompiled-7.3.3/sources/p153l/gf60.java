package p153l;

import android.util.DisplayMetrics;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.C0610n;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.core.p058ui.messages.view.page_grid.PagerGridLayoutManager;

/* JADX INFO: loaded from: classes4.dex */
public class gf60 extends C0610n {

    /* JADX INFO: renamed from: a */
    public RecyclerView f103885a;

    public gf60(@NonNull RecyclerView recyclerView) {
        super(recyclerView.getContext());
        this.f103885a = recyclerView;
    }

    @Override // androidx.recyclerview.widget.C0610n
    public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        return ff60.m125360a() / displayMetrics.densityDpi;
    }

    @Override // androidx.recyclerview.widget.C0610n, androidx.recyclerview.widget.RecyclerView.AbstractC0590z
    public void onTargetFound(View view, RecyclerView.C0561a0 c0561a0, RecyclerView.AbstractC0590z.a aVar) {
        RecyclerView.AbstractC0579o layoutManager = this.f103885a.getLayoutManager();
        if (layoutManager != null && (layoutManager instanceof PagerGridLayoutManager)) {
            int[] iArrM51236h = ((PagerGridLayoutManager) layoutManager).m51236h(this.f103885a.getChildAdapterPosition(view));
            int i = iArrM51236h[0];
            int i2 = iArrM51236h[1];
            int iCalculateTimeForScrolling = calculateTimeForScrolling(Math.max(Math.abs(i), Math.abs(i2)));
            if (iCalculateTimeForScrolling > 0) {
                aVar.m3492d(i, i2, iCalculateTimeForScrolling, this.mDecelerateInterpolator);
            }
        }
    }
}
