package p028v;

import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import p003l.d30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VPullUpRecyclerView extends VRecyclerView {

    /* JADX INFO: renamed from: c */
    public d30 f12907c;

    /* JADX INFO: renamed from: d */
    public long f12908d;

    /* JADX INFO: renamed from: e */
    public long f12909e;

    /* JADX INFO: renamed from: f */
    public boolean f12910f;

    /* JADX INFO: renamed from: g */
    public boolean f12911g;

    /* JADX INFO: renamed from: h */
    public boolean f12912h;

    /* JADX INFO: renamed from: i */
    public float f12913i;

    /* JADX INFO: renamed from: j */
    public float f12914j;

    public static class NGridLayoutManager extends GridLayoutManager {
        public NGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
            super(context, attributeSet, i, i2);
        }

        public boolean supportsPredictiveItemAnimations() {
            return false;
        }
    }

    public VPullUpRecyclerView(Context context) {
        super(context);
        this.f12912h = true;
    }

    /* JADX INFO: renamed from: G */
    public static int m11647G(int[] iArr) {
        int i = iArr[0];
        for (int i2 : iArr) {
            if (i2 > i) {
                i = i2;
            }
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onScrollStateChanged(int i) {
        int iFindLastVisibleItemPosition;
        super.onScrollStateChanged(i);
        if (i != 0 || this.f12907c == null) {
            return;
        }
        GridLayoutManager layoutManager = getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            iFindLastVisibleItemPosition = layoutManager.findLastVisibleItemPosition();
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            int[] iArr = new int[staggeredGridLayoutManager.G()];
            staggeredGridLayoutManager.w(iArr);
            iFindLastVisibleItemPosition = m11647G(iArr);
        } else {
            iFindLastVisibleItemPosition = ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition();
        }
        int childCount = layoutManager.getChildCount();
        if ((this.f12911g || this.f12910f) && childCount > 0 && iFindLastVisibleItemPosition >= layoutManager.getItemCount() - 1 && layoutManager.getItemCount() >= childCount && getChildAt(childCount - 1).getBottom() <= getBottom() && !canScrollVertically(1) && Math.abs(SystemClock.elapsedRealtime() - this.f12908d) >= this.f12909e) {
            this.f12907c.call();
            this.f12908d = SystemClock.elapsedRealtime();
        }
    }

    public void onScrolled(int i, int i2) {
        super.onScrolled(i, i2);
        this.f12911g = i2 > 0;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f12912h) {
            return true;
        }
        if (motionEvent.getAction() == 0) {
            this.f12913i = motionEvent.getY();
        } else if (motionEvent.getAction() == 1) {
            float y = motionEvent.getY();
            this.f12914j = y;
            this.f12910f = this.f12913i - y > 40.0f;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCanScroll(boolean z) {
        this.f12912h = z;
    }

    public void setOnPullUpListener(d30 d30Var) {
        this.f12907c = d30Var;
    }

    public void setPullUpInterval(long j) {
        this.f12909e = j;
    }

    public VPullUpRecyclerView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12912h = true;
    }

    public VPullUpRecyclerView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12912h = true;
    }
}
