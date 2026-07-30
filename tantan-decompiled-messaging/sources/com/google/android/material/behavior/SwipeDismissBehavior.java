package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p149l.gbl0;
import p149l.ubl0;

/* JADX INFO: loaded from: classes7.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.AbstractC0226c<V> {
    private static final float DEFAULT_ALPHA_END_DISTANCE = 0.5f;
    private static final float DEFAULT_ALPHA_START_DISTANCE = 0.0f;
    private static final float DEFAULT_DRAG_DISMISS_THRESHOLD = 0.5f;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;
    public static final int SWIPE_DIRECTION_ANY = 2;
    public static final int SWIPE_DIRECTION_END_TO_START = 1;
    public static final int SWIPE_DIRECTION_START_TO_END = 0;
    private boolean interceptingEvents;
    OnDismissListener listener;
    private boolean sensitivitySet;
    ubl0 viewDragHelper;
    private float sensitivity = 0.0f;
    int swipeDirection = 2;
    float dragDismissThreshold = 0.5f;
    float alphaStartSwipeDistance = 0.0f;
    float alphaEndSwipeDistance = 0.5f;
    private final ubl0.AbstractC20403c dragCallback = new ubl0.AbstractC20403c() { // from class: com.google.android.material.behavior.SwipeDismissBehavior.1
        private static final int INVALID_POINTER_ID = -1;
        private int activePointerId = -1;
        private int originalCapturedViewLeft;

        private boolean shouldDismiss(@NonNull View view, float f) {
            if (f == 0.0f) {
                return Math.abs(view.getLeft() - this.originalCapturedViewLeft) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.dragDismissThreshold);
            }
            boolean z = gbl0.m125228x(view) == 1;
            int i = SwipeDismissBehavior.this.swipeDirection;
            if (i == 2) {
                return true;
            }
            if (i == 0) {
                if (z) {
                    return f < 0.0f;
                }
                return f > 0.0f;
            }
            if (i == 1) {
                if (z) {
                    return f > 0.0f;
                }
                if (f < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        @Override // p149l.ubl0.AbstractC20403c
        public int clampViewPositionHorizontal(@NonNull View view, int i, int i2) {
            int width;
            int width2;
            int width3;
            boolean z = gbl0.m125228x(view) == 1;
            int i3 = SwipeDismissBehavior.this.swipeDirection;
            if (i3 == 0) {
                width = this.originalCapturedViewLeft;
                if (z) {
                    width -= view.getWidth();
                    width2 = this.originalCapturedViewLeft;
                } else {
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i3 == 1) {
                width = this.originalCapturedViewLeft;
                if (z) {
                    width3 = view.getWidth();
                    width2 = width3 + width;
                } else {
                    width -= view.getWidth();
                    width2 = this.originalCapturedViewLeft;
                }
            } else {
                width = this.originalCapturedViewLeft - view.getWidth();
                width2 = this.originalCapturedViewLeft + view.getWidth();
            }
            return SwipeDismissBehavior.clamp(width, i, width2);
        }

        @Override // p149l.ubl0.AbstractC20403c
        public int clampViewPositionVertical(@NonNull View view, int i, int i2) {
            return view.getTop();
        }

        @Override // p149l.ubl0.AbstractC20403c
        public int getViewHorizontalDragRange(@NonNull View view) {
            return view.getWidth();
        }

        @Override // p149l.ubl0.AbstractC20403c
        public void onViewCaptured(@NonNull View view, int i) {
            this.activePointerId = i;
            this.originalCapturedViewLeft = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // p149l.ubl0.AbstractC20403c
        public void onViewDragStateChanged(int i) {
            OnDismissListener onDismissListener = SwipeDismissBehavior.this.listener;
            if (onDismissListener != null) {
                onDismissListener.onDragStateChanged(i);
            }
        }

        @Override // p149l.ubl0.AbstractC20403c
        public void onViewPositionChanged(@NonNull View view, int i, int i2, int i3, int i4) {
            float width = this.originalCapturedViewLeft + (view.getWidth() * SwipeDismissBehavior.this.alphaStartSwipeDistance);
            float width2 = this.originalCapturedViewLeft + (view.getWidth() * SwipeDismissBehavior.this.alphaEndSwipeDistance);
            float f = i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.clamp(0.0f, 1.0f - SwipeDismissBehavior.fraction(width, width2, f), 1.0f));
            }
        }

        @Override // p149l.ubl0.AbstractC20403c
        public void onViewReleased(@NonNull View view, float f, float f2) {
            int i;
            boolean z;
            OnDismissListener onDismissListener;
            this.activePointerId = -1;
            int width = view.getWidth();
            if (shouldDismiss(view, f)) {
                int left = view.getLeft();
                int i2 = this.originalCapturedViewLeft;
                i = left < i2 ? i2 - width : i2 + width;
                z = true;
            } else {
                i = this.originalCapturedViewLeft;
                z = false;
            }
            if (SwipeDismissBehavior.this.viewDragHelper.m192851O(i, view.getTop())) {
                gbl0.m125185b0(view, new SettleRunnable(view, z));
            } else {
                if (!z || (onDismissListener = SwipeDismissBehavior.this.listener) == null) {
                    return;
                }
                onDismissListener.onDismiss(view);
            }
        }

        @Override // p149l.ubl0.AbstractC20403c
        public boolean tryCaptureView(View view, int i) {
            int i2 = this.activePointerId;
            return (i2 == -1 || i2 == i) && SwipeDismissBehavior.this.canSwipeDismissView(view);
        }
    };

    public interface OnDismissListener {
        void onDismiss(View view);

        void onDragStateChanged(int i);
    }

    public class SettleRunnable implements Runnable {
        private final boolean dismiss;
        private final View view;

        public SettleRunnable(View view, boolean z) {
            this.view = view;
            this.dismiss = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            OnDismissListener onDismissListener;
            ubl0 ubl0Var = SwipeDismissBehavior.this.viewDragHelper;
            if (ubl0Var != null && ubl0Var.m192868n(true)) {
                gbl0.m125185b0(this.view, this);
            } else {
                if (!this.dismiss || (onDismissListener = SwipeDismissBehavior.this.listener) == null) {
                    return;
                }
                onDismissListener.onDismiss(this.view);
            }
        }
    }

    public static float clamp(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    private void ensureViewDragHelper(ViewGroup viewGroup) {
        if (this.viewDragHelper == null) {
            this.viewDragHelper = this.sensitivitySet ? ubl0.m192835o(viewGroup, this.sensitivity, this.dragCallback) : ubl0.m192836p(viewGroup, this.dragCallback);
        }
    }

    public static float fraction(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    public boolean canSwipeDismissView(@NonNull View view) {
        return true;
    }

    public int getDragState() {
        ubl0 ubl0Var = this.viewDragHelper;
        if (ubl0Var != null) {
            return ubl0Var.m192837A();
        }
        return 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
    public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v2, @NonNull MotionEvent motionEvent) {
        boolean zIsPointInChildBounds = this.interceptingEvents;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zIsPointInChildBounds = coordinatorLayout.isPointInChildBounds(v2, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.interceptingEvents = zIsPointInChildBounds;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.interceptingEvents = false;
        }
        if (!zIsPointInChildBounds) {
            return false;
        }
        ensureViewDragHelper(coordinatorLayout);
        return this.viewDragHelper.m192852P(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        ubl0 ubl0Var = this.viewDragHelper;
        if (ubl0Var == null) {
            return false;
        }
        ubl0Var.m192843G(motionEvent);
        return true;
    }

    public void setDragDismissDistance(float f) {
        this.dragDismissThreshold = clamp(0.0f, f, 1.0f);
    }

    public void setEndAlphaSwipeDistance(float f) {
        this.alphaEndSwipeDistance = clamp(0.0f, f, 1.0f);
    }

    public void setListener(OnDismissListener onDismissListener) {
        this.listener = onDismissListener;
    }

    public void setSensitivity(float f) {
        this.sensitivity = f;
        this.sensitivitySet = true;
    }

    public void setStartAlphaSwipeDistance(float f) {
        this.alphaStartSwipeDistance = clamp(0.0f, f, 1.0f);
    }

    public void setSwipeDirection(int i) {
        this.swipeDirection = i;
    }

    public static int clamp(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }
}
