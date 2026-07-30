package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import p149l.ig3;

/* JADX INFO: renamed from: androidx.recyclerview.widget.n */
/* JADX INFO: loaded from: classes.dex */
public class C0608n extends RecyclerView.AbstractC0587y {
    private static final boolean DEBUG = false;
    private static final float MILLISECONDS_PER_INCH = 25.0f;
    public static final int SNAP_TO_ANY = 0;
    public static final int SNAP_TO_END = 1;
    public static final int SNAP_TO_START = -1;
    private static final float TARGET_SEEK_EXTRA_SCROLL_RATIO = 1.2f;
    private static final int TARGET_SEEK_SCROLL_DISTANCE_PX = 10000;
    private final DisplayMetrics mDisplayMetrics;
    private float mMillisPerPixel;

    @SuppressLint({"UnknownNullness"})
    protected PointF mTargetVector;
    protected final LinearInterpolator mLinearInterpolator = new LinearInterpolator();
    protected final DecelerateInterpolator mDecelerateInterpolator = new DecelerateInterpolator();
    private boolean mHasCalculatedMillisPerPixel = false;
    protected int mInterimTargetDx = 0;
    protected int mInterimTargetDy = 0;

    @SuppressLint({"UnknownNullness"})
    public C0608n(Context context) {
        this.mDisplayMetrics = context.getResources().getDisplayMetrics();
    }

    private int clampApplyScroll(int i, int i2) {
        int i3 = i - i2;
        if (i * i3 <= 0) {
            return 0;
        }
        return i3;
    }

    private float getSpeedPerPixel() {
        if (!this.mHasCalculatedMillisPerPixel) {
            this.mMillisPerPixel = calculateSpeedPerPixel(this.mDisplayMetrics);
            this.mHasCalculatedMillisPerPixel = true;
        }
        return this.mMillisPerPixel;
    }

    public int calculateDtToFit(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            if (i5 == 1) {
                return i4 - i2;
            }
            ig3.m135964a("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            return 0;
        }
        int i6 = i3 - i;
        if (i6 > 0) {
            return i6;
        }
        int i7 = i4 - i2;
        if (i7 < 0) {
            return i7;
        }
        return 0;
    }

    @SuppressLint({"UnknownNullness"})
    public int calculateDxToMakeVisible(View view, int i) {
        RecyclerView.AbstractC0577o layoutManager = getLayoutManager();
        if (layoutManager == null || !layoutManager.canScrollHorizontally()) {
            return 0;
        }
        RecyclerView.C0578p c0578p = (RecyclerView.C0578p) view.getLayoutParams();
        return calculateDtToFit(layoutManager.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) c0578p).leftMargin, layoutManager.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) c0578p).rightMargin, layoutManager.getPaddingLeft(), layoutManager.getWidth() - layoutManager.getPaddingRight(), i);
    }

    @SuppressLint({"UnknownNullness"})
    public int calculateDyToMakeVisible(View view, int i) {
        RecyclerView.AbstractC0577o layoutManager = getLayoutManager();
        if (layoutManager == null || !layoutManager.canScrollVertically()) {
            return 0;
        }
        RecyclerView.C0578p c0578p = (RecyclerView.C0578p) view.getLayoutParams();
        return calculateDtToFit(layoutManager.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) c0578p).topMargin, layoutManager.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) c0578p).bottomMargin, layoutManager.getPaddingTop(), layoutManager.getHeight() - layoutManager.getPaddingBottom(), i);
    }

    @SuppressLint({"UnknownNullness"})
    public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        return MILLISECONDS_PER_INCH / displayMetrics.densityDpi;
    }

    public int calculateTimeForDeceleration(int i) {
        return (int) Math.ceil(((double) calculateTimeForScrolling(i)) / 0.3356d);
    }

    public int calculateTimeForScrolling(int i) {
        return (int) Math.ceil(Math.abs(i) * getSpeedPerPixel());
    }

    public int getHorizontalSnapPreference() {
        PointF pointF = this.mTargetVector;
        if (pointF == null) {
            return 0;
        }
        float f = pointF.x;
        if (f == 0.0f) {
            return 0;
        }
        return f > 0.0f ? 1 : -1;
    }

    public int getVerticalSnapPreference() {
        PointF pointF = this.mTargetVector;
        if (pointF == null) {
            return 0;
        }
        float f = pointF.y;
        if (f == 0.0f) {
            return 0;
        }
        return f > 0.0f ? 1 : -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0587y
    @SuppressLint({"UnknownNullness"})
    public void onSeekTargetStep(int i, int i2, RecyclerView.C0588z c0588z, RecyclerView.AbstractC0587y.a aVar) {
        if (getChildCount() == 0) {
            stop();
            return;
        }
        this.mInterimTargetDx = clampApplyScroll(this.mInterimTargetDx, i);
        int iClampApplyScroll = clampApplyScroll(this.mInterimTargetDy, i2);
        this.mInterimTargetDy = iClampApplyScroll;
        if (this.mInterimTargetDx == 0 && iClampApplyScroll == 0) {
            updateActionForInterimTarget(aVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0587y
    public void onStart() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0587y
    public void onStop() {
        this.mInterimTargetDy = 0;
        this.mInterimTargetDx = 0;
        this.mTargetVector = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0587y
    @SuppressLint({"UnknownNullness"})
    public void onTargetFound(View view, RecyclerView.C0588z c0588z, RecyclerView.AbstractC0587y.a aVar) {
        int iCalculateDxToMakeVisible = calculateDxToMakeVisible(view, getHorizontalSnapPreference());
        int iCalculateDyToMakeVisible = calculateDyToMakeVisible(view, getVerticalSnapPreference());
        int iCalculateTimeForDeceleration = calculateTimeForDeceleration((int) Math.sqrt((iCalculateDxToMakeVisible * iCalculateDxToMakeVisible) + (iCalculateDyToMakeVisible * iCalculateDyToMakeVisible)));
        if (iCalculateTimeForDeceleration > 0) {
            aVar.m3483d(-iCalculateDxToMakeVisible, -iCalculateDyToMakeVisible, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
        }
    }

    @SuppressLint({"UnknownNullness"})
    public void updateActionForInterimTarget(RecyclerView.AbstractC0587y.a aVar) {
        PointF pointFComputeScrollVectorForPosition = computeScrollVectorForPosition(getTargetPosition());
        if (pointFComputeScrollVectorForPosition == null || (pointFComputeScrollVectorForPosition.x == 0.0f && pointFComputeScrollVectorForPosition.y == 0.0f)) {
            aVar.m3481b(getTargetPosition());
            stop();
            return;
        }
        normalize(pointFComputeScrollVectorForPosition);
        this.mTargetVector = pointFComputeScrollVectorForPosition;
        this.mInterimTargetDx = (int) (pointFComputeScrollVectorForPosition.x * 10000.0f);
        this.mInterimTargetDy = (int) (pointFComputeScrollVectorForPosition.y * 10000.0f);
        aVar.m3483d((int) (this.mInterimTargetDx * TARGET_SEEK_EXTRA_SCROLL_RATIO), (int) (this.mInterimTargetDy * TARGET_SEEK_EXTRA_SCROLL_RATIO), (int) (calculateTimeForScrolling(10000) * TARGET_SEEK_EXTRA_SCROLL_RATIO), this.mLinearInterpolator);
    }
}
