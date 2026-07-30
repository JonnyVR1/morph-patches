package p007l;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import l.gex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\b\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017¨\u0006\u0019"}, d2 = {"Ll/tc80;", "Landroidx/recyclerview/widget/RecyclerView$t;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "layoutManager", "", "recyclerViewWidthExpect", "", "itemWidth", "overlapWidth", "<init>", "(Landroidx/recyclerview/widget/LinearLayoutManager;IFF)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "dx", "dy", "", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "a", "Landroidx/recyclerview/widget/LinearLayoutManager;", "b", "I", "c", "F", "d", "b_feed_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class tc80 extends RecyclerView.t {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public LinearLayoutManager layoutManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int recyclerViewWidthExpect;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public float itemWidth;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public float overlapWidth;

    public tc80(@NotNull LinearLayoutManager linearLayoutManager, int i, float f, float f2) {
        linearLayoutManager.getClass();
        this.layoutManager = linearLayoutManager;
        this.recyclerViewWidthExpect = i;
        this.itemWidth = f;
        this.overlapWidth = f2;
    }

    public void onScrolled(@NotNull RecyclerView recyclerView, int dx, int dy) {
        int iB;
        recyclerView.getClass();
        super.onScrolled(recyclerView, dx, dy);
        int iFindFirstVisibleItemPosition = this.layoutManager.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = this.layoutManager.findLastVisibleItemPosition();
        float f = this.itemWidth;
        float f2 = this.overlapWidth;
        float f3 = ((f * 2.0f) - f2) - (f / 2.0f);
        float f4 = (this.recyclerViewWidthExpect - (f * 2.0f)) + f2 + (f / 2.0f);
        int i = iFindLastVisibleItemPosition - iFindFirstVisibleItemPosition;
        if (i < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            View viewFindViewByPosition = this.layoutManager.findViewByPosition(i2 + iFindFirstVisibleItemPosition);
            if (viewFindViewByPosition != null) {
                viewFindViewByPosition.setPivotX(this.itemWidth * 0.5f);
                viewFindViewByPosition.setPivotY(this.itemWidth * 0.5f);
                float right = viewFindViewByPosition.getRight() - (viewFindViewByPosition.getWidth() / 2);
                if (right >= f4) {
                    iB = gex.b((right - f4) - 0.5f);
                } else {
                    iB = right <= f3 ? gex.b((f3 - right) - 0.5f) : 0;
                }
                float f5 = 1.0f - ((iB * 1.0f) / (this.itemWidth - this.overlapWidth));
                if (f5 <= 0.0f) {
                    f5 = 0.0f;
                }
                viewFindViewByPosition.setScaleX(f5);
                viewFindViewByPosition.setScaleY(f5);
                viewFindViewByPosition.setAlpha((f5 * 0.8f) + 0.2f);
            }
            if (i2 == i) {
                return;
            } else {
                i2++;
            }
        }
    }
}
