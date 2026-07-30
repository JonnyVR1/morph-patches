package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.common.api.Api;
import p153l.jhx;
import p153l.kkl0;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes7.dex */
public abstract class HeaderBehavior<V extends View> extends ViewOffsetBehavior<V> {
    private static final int INVALID_POINTER = -1;
    private int activePointerId;

    @Nullable
    private Runnable flingRunnable;
    private boolean isBeingDragged;
    private int lastMotionY;
    OverScroller scroller;
    private int touchSlop;

    @Nullable
    private VelocityTracker velocityTracker;

    public class FlingRunnable implements Runnable {
        private final V layout;
        private final CoordinatorLayout parent;

        public FlingRunnable(CoordinatorLayout coordinatorLayout, V v2) {
            this.parent = coordinatorLayout;
            this.layout = v2;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.layout == null || (overScroller = HeaderBehavior.this.scroller) == null) {
                return;
            }
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            HeaderBehavior headerBehavior = HeaderBehavior.this;
            if (!zComputeScrollOffset) {
                headerBehavior.onFlingFinished(this.parent, this.layout);
            } else {
                headerBehavior.setHeaderTopBottomOffset(this.parent, this.layout, headerBehavior.scroller.getCurrY());
                kkl0.m150148b0(this.layout, this);
            }
        }
    }

    public HeaderBehavior() {
        this.activePointerId = -1;
        this.touchSlop = -1;
    }

    private void ensureVelocityTracker() {
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
    }

    public boolean canDragView(V v2) {
        return false;
    }

    public final boolean fling(CoordinatorLayout coordinatorLayout, @NonNull V v2, int i, int i2, float f) {
        Runnable runnable = this.flingRunnable;
        if (runnable != null) {
            v2.removeCallbacks(runnable);
            this.flingRunnable = null;
        }
        if (this.scroller == null) {
            this.scroller = new OverScroller(v2.getContext());
        }
        this.scroller.fling(0, getTopAndBottomOffset(), 0, Math.round(f), 0, 0, i, i2);
        if (!this.scroller.computeScrollOffset()) {
            onFlingFinished(coordinatorLayout, v2);
            return false;
        }
        FlingRunnable flingRunnable = new FlingRunnable(coordinatorLayout, v2);
        this.flingRunnable = flingRunnable;
        kkl0.m150148b0(v2, flingRunnable);
        return true;
    }

    public int getMaxDragOffset(@NonNull V v2) {
        return -v2.getHeight();
    }

    public int getScrollRangeForDragFling(@NonNull V v2) {
        return v2.getHeight();
    }

    public int getTopBottomOffsetForScrollingSibling() {
        return getTopAndBottomOffset();
    }

    public void onFlingFinished(CoordinatorLayout coordinatorLayout, V v2) {
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:29:0x0059  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0227c
    public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v2, @NonNull MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int iFindPointerIndex;
        if (this.touchSlop < 0) {
            this.touchSlop = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getAction() == 2 && this.isBeingDragged) {
            return true;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.isBeingDragged = false;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (canDragView(v2) && coordinatorLayout.isPointInChildBounds(v2, x, y)) {
                this.lastMotionY = y;
                this.activePointerId = motionEvent.getPointerId(0);
                ensureVelocityTracker();
            }
        } else if (actionMasked == 1) {
            this.isBeingDragged = false;
            this.activePointerId = -1;
            velocityTracker = this.velocityTracker;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.velocityTracker = null;
            }
        } else if (actionMasked == 2) {
            int i = this.activePointerId;
            if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) != -1) {
                int y2 = (int) motionEvent.getY(iFindPointerIndex);
                if (Math.abs(y2 - this.lastMotionY) > this.touchSlop) {
                    this.isBeingDragged = true;
                    this.lastMotionY = y2;
                }
            }
        } else if (actionMasked == 3) {
            this.isBeingDragged = false;
            this.activePointerId = -1;
            velocityTracker = this.velocityTracker;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.velocityTracker = null;
            }
        }
        VelocityTracker velocityTracker2 = this.velocityTracker;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return this.isBeingDragged;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0227c
    public boolean onTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v2, @NonNull MotionEvent motionEvent) {
        if (this.touchSlop < 0) {
            this.touchSlop = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.velocityTracker;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                    this.velocityTracker.computeCurrentVelocity(1000);
                    fling(coordinatorLayout, v2, -getScrollRangeForDragFling(v2), 0, this.velocityTracker.getYVelocity(this.activePointerId));
                }
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.activePointerId);
                if (iFindPointerIndex == -1) {
                    return false;
                }
                int y = (int) motionEvent.getY(iFindPointerIndex);
                int i = this.lastMotionY - y;
                if (!this.isBeingDragged) {
                    int iAbs = Math.abs(i);
                    int i2 = this.touchSlop;
                    if (iAbs > i2) {
                        this.isBeingDragged = true;
                        i = i > 0 ? i - i2 : i + i2;
                    }
                }
                if (this.isBeingDragged) {
                    this.lastMotionY = y;
                    scroll(coordinatorLayout, v2, i, getMaxDragOffset(v2), 0);
                }
            } else if (actionMasked == 3) {
            }
            this.isBeingDragged = false;
            this.activePointerId = -1;
            VelocityTracker velocityTracker2 = this.velocityTracker;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.velocityTracker = null;
            }
        } else {
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            if (!coordinatorLayout.isPointInChildBounds(v2, x, y2) || !canDragView(v2)) {
                return false;
            }
            this.lastMotionY = y2;
            this.activePointerId = motionEvent.getPointerId(0);
            ensureVelocityTracker();
        }
        VelocityTracker velocityTracker3 = this.velocityTracker;
        if (velocityTracker3 != null) {
            velocityTracker3.addMovement(motionEvent);
        }
        return true;
    }

    public final int scroll(CoordinatorLayout coordinatorLayout, V v2, int i, int i2, int i3) {
        return setHeaderTopBottomOffset(coordinatorLayout, v2, getTopBottomOffsetForScrollingSibling() - i, i2, i3);
    }

    public int setHeaderTopBottomOffset(CoordinatorLayout coordinatorLayout, V v2, int i, int i2, int i3) {
        int iM144942b;
        int topAndBottomOffset = getTopAndBottomOffset();
        if (i2 == 0 || topAndBottomOffset < i2 || topAndBottomOffset > i3 || topAndBottomOffset == (iM144942b = jhx.m144942b(i, i2, i3))) {
            return 0;
        }
        setTopAndBottomOffset(iM144942b);
        return topAndBottomOffset - iM144942b;
    }

    public HeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.activePointerId = -1;
        this.touchSlop = -1;
    }

    public int setHeaderTopBottomOffset(CoordinatorLayout coordinatorLayout, V v2, int i) {
        return setHeaderTopBottomOffset(coordinatorLayout, v2, i, Integer.MIN_VALUE, Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }
}
