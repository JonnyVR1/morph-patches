package p151v;

import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import p153l.x20;

/* JADX INFO: loaded from: classes3.dex */
public class VPullUpRecyclerView extends VRecyclerView {

    /* JADX INFO: renamed from: c */
    public x20 f210204c;

    /* JADX INFO: renamed from: d */
    public long f210205d;

    /* JADX INFO: renamed from: e */
    public long f210206e;

    /* JADX INFO: renamed from: f */
    public boolean f210207f;

    /* JADX INFO: renamed from: g */
    public boolean f210208g;

    /* JADX INFO: renamed from: h */
    public boolean f210209h;

    /* JADX INFO: renamed from: i */
    public float f210210i;

    /* JADX INFO: renamed from: j */
    public float f210211j;

    public static class NGridLayoutManager extends GridLayoutManager {
        public NGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
            super(context, attributeSet, i, i2);
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0579o
        public boolean supportsPredictiveItemAnimations() {
            return false;
        }
    }

    public VPullUpRecyclerView(Context context) {
        super(context);
        this.f210209h = true;
    }

    /* JADX INFO: renamed from: G */
    public static int m224411G(int[] iArr) {
        int i = iArr[0];
        for (int i2 : iArr) {
            if (i2 > i) {
                i = i2;
            }
        }
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrollStateChanged(int i) {
        int iFindLastVisibleItemPosition;
        super.onScrollStateChanged(i);
        if (i != 0 || this.f210204c == null) {
            return;
        }
        RecyclerView.AbstractC0579o layoutManager = getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            iFindLastVisibleItemPosition = ((GridLayoutManager) layoutManager).findLastVisibleItemPosition();
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            int[] iArr = new int[staggeredGridLayoutManager.m3501G()];
            staggeredGridLayoutManager.m3545w(iArr);
            iFindLastVisibleItemPosition = m224411G(iArr);
        } else {
            iFindLastVisibleItemPosition = ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition();
        }
        int childCount = layoutManager.getChildCount();
        if ((this.f210208g || this.f210207f) && childCount > 0 && iFindLastVisibleItemPosition >= layoutManager.getItemCount() - 1 && layoutManager.getItemCount() >= childCount && getChildAt(childCount - 1).getBottom() <= getBottom() && !canScrollVertically(1) && Math.abs(SystemClock.elapsedRealtime() - this.f210205d) >= this.f210206e) {
            this.f210204c.call();
            this.f210205d = SystemClock.elapsedRealtime();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrolled(int i, int i2) {
        super.onScrolled(i, i2);
        this.f210208g = i2 > 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f210209h) {
            return true;
        }
        if (motionEvent.getAction() == 0) {
            this.f210210i = motionEvent.getY();
        } else if (motionEvent.getAction() == 1) {
            float y = motionEvent.getY();
            this.f210211j = y;
            this.f210207f = this.f210210i - y > 40.0f;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCanScroll(boolean z) {
        this.f210209h = z;
    }

    public void setOnPullUpListener(x20 x20Var) {
        this.f210204c = x20Var;
    }

    public void setPullUpInterval(long j) {
        this.f210206e = j;
    }

    public VPullUpRecyclerView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f210209h = true;
    }

    public VPullUpRecyclerView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f210209h = true;
    }
}
