package p147v;

import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import p149l.d30;

/* JADX INFO: loaded from: classes3.dex */
public class VPullUpRecyclerView extends VRecyclerView {

    /* JADX INFO: renamed from: c */
    public d30 f209282c;

    /* JADX INFO: renamed from: d */
    public long f209283d;

    /* JADX INFO: renamed from: e */
    public long f209284e;

    /* JADX INFO: renamed from: f */
    public boolean f209285f;

    /* JADX INFO: renamed from: g */
    public boolean f209286g;

    /* JADX INFO: renamed from: h */
    public boolean f209287h;

    /* JADX INFO: renamed from: i */
    public float f209288i;

    /* JADX INFO: renamed from: j */
    public float f209289j;

    public static class NGridLayoutManager extends GridLayoutManager {
        public NGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
            super(context, attributeSet, i, i2);
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0577o
        public boolean supportsPredictiveItemAnimations() {
            return false;
        }
    }

    public VPullUpRecyclerView(Context context) {
        super(context);
        this.f209287h = true;
    }

    /* JADX INFO: renamed from: G */
    public static int m223165G(int[] iArr) {
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
        if (i != 0 || this.f209282c == null) {
            return;
        }
        RecyclerView.AbstractC0577o layoutManager = getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            iFindLastVisibleItemPosition = ((GridLayoutManager) layoutManager).findLastVisibleItemPosition();
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            int[] iArr = new int[staggeredGridLayoutManager.m3500G()];
            staggeredGridLayoutManager.m3544w(iArr);
            iFindLastVisibleItemPosition = m223165G(iArr);
        } else {
            iFindLastVisibleItemPosition = ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition();
        }
        int childCount = layoutManager.getChildCount();
        if ((this.f209286g || this.f209285f) && childCount > 0 && iFindLastVisibleItemPosition >= layoutManager.getItemCount() - 1 && layoutManager.getItemCount() >= childCount && getChildAt(childCount - 1).getBottom() <= getBottom() && !canScrollVertically(1) && Math.abs(SystemClock.elapsedRealtime() - this.f209283d) >= this.f209284e) {
            this.f209282c.call();
            this.f209283d = SystemClock.elapsedRealtime();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrolled(int i, int i2) {
        super.onScrolled(i, i2);
        this.f209286g = i2 > 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f209287h) {
            return true;
        }
        if (motionEvent.getAction() == 0) {
            this.f209288i = motionEvent.getY();
        } else if (motionEvent.getAction() == 1) {
            float y = motionEvent.getY();
            this.f209289j = y;
            this.f209285f = this.f209288i - y > 40.0f;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCanScroll(boolean z) {
        this.f209287h = z;
    }

    public void setOnPullUpListener(d30 d30Var) {
        this.f209282c = d30Var;
    }

    public void setPullUpInterval(long j) {
        this.f209284e = j;
    }

    public VPullUpRecyclerView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f209287h = true;
    }

    public VPullUpRecyclerView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f209287h = true;
    }
}
