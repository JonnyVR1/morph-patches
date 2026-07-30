package com.p046p1.mobile.putong.live.external.view.widgets;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.OvershootInterpolator;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVoiceSwipeMenuLayout extends ViewGroup {

    /* JADX INFO: renamed from: s */
    public static LiveVoiceSwipeMenuLayout f46359s;

    /* JADX INFO: renamed from: t */
    public static boolean f46360t;

    /* JADX INFO: renamed from: a */
    public int f46361a;

    /* JADX INFO: renamed from: b */
    public int f46362b;

    /* JADX INFO: renamed from: c */
    public int f46363c;

    /* JADX INFO: renamed from: d */
    public int f46364d;

    /* JADX INFO: renamed from: e */
    public int f46365e;

    /* JADX INFO: renamed from: f */
    public int f46366f;

    /* JADX INFO: renamed from: g */
    public View f46367g;

    /* JADX INFO: renamed from: h */
    public PointF f46368h;

    /* JADX INFO: renamed from: i */
    public boolean f46369i;

    /* JADX INFO: renamed from: j */
    public PointF f46370j;

    /* JADX INFO: renamed from: k */
    public boolean f46371k;

    /* JADX INFO: renamed from: l */
    public VelocityTracker f46372l;

    /* JADX INFO: renamed from: m */
    public boolean f46373m;

    /* JADX INFO: renamed from: n */
    public boolean f46374n;

    /* JADX INFO: renamed from: o */
    public boolean f46375o;

    /* JADX INFO: renamed from: p */
    public ValueAnimator f46376p;

    /* JADX INFO: renamed from: q */
    public ValueAnimator f46377q;

    /* JADX INFO: renamed from: r */
    public boolean f46378r;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.view.widgets.LiveVoiceSwipeMenuLayout$a */
    public class C12588a implements ValueAnimator.AnimatorUpdateListener {
        public C12588a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            LiveVoiceSwipeMenuLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.view.widgets.LiveVoiceSwipeMenuLayout$b */
    public class C12589b extends AnimatorListenerAdapter {
        public C12589b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            LiveVoiceSwipeMenuLayout.this.f46378r = true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.view.widgets.LiveVoiceSwipeMenuLayout$c */
    public class C12590c implements ValueAnimator.AnimatorUpdateListener {
        public C12590c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            LiveVoiceSwipeMenuLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.view.widgets.LiveVoiceSwipeMenuLayout$d */
    public class C12591d extends AnimatorListenerAdapter {
        public C12591d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            LiveVoiceSwipeMenuLayout.this.f46378r = false;
        }
    }

    public LiveVoiceSwipeMenuLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f46368h = new PointF();
        this.f46369i = true;
        this.f46370j = new PointF();
        m70925e(context, attributeSet, i);
    }

    /* JADX INFO: renamed from: b */
    public final void m70922b(MotionEvent motionEvent) {
        if (this.f46372l == null) {
            this.f46372l = VelocityTracker.obtain();
        }
        this.f46372l.addMovement(motionEvent);
    }

    /* JADX INFO: renamed from: c */
    public final void m70923c() {
        ValueAnimator valueAnimator = this.f46377q;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f46377q.cancel();
        }
        ValueAnimator valueAnimator2 = this.f46376p;
        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
            return;
        }
        this.f46376p.cancel();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0036  */
    /* JADX INFO: renamed from: d */
    public final void m70924d(int i, int i2) {
        LiveVoiceSwipeMenuLayout liveVoiceSwipeMenuLayout;
        int i3;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        int i4 = 0;
        while (i4 < i) {
            View childAt = this.getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                if (marginLayoutParams.height == -1) {
                    int i5 = marginLayoutParams.width;
                    marginLayoutParams.width = childAt.getMeasuredWidth();
                    liveVoiceSwipeMenuLayout = this;
                    i3 = i2;
                    liveVoiceSwipeMenuLayout.measureChildWithMargins(childAt, i3, 0, iMakeMeasureSpec, 0);
                    marginLayoutParams.width = i5;
                } else {
                    liveVoiceSwipeMenuLayout = this;
                    i3 = i2;
                }
            } else {
                liveVoiceSwipeMenuLayout = this;
                i3 = i2;
            }
            i4++;
            this = liveVoiceSwipeMenuLayout;
            i2 = i3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007b  */
    /* JADX WARN: Code duplicated, block: B:32:0x008f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0095  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cb  */
    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float xVelocity;
        if (this.f46373m) {
            m70922b(motionEvent);
            VelocityTracker velocityTracker = this.f46372l;
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f46371k = false;
                this.f46369i = true;
                this.f46375o = false;
                if (f46360t) {
                    return false;
                }
                f46360t = true;
                this.f46368h.set(motionEvent.getRawX(), motionEvent.getRawY());
                this.f46370j.set(motionEvent.getRawX(), motionEvent.getRawY());
                LiveVoiceSwipeMenuLayout liveVoiceSwipeMenuLayout = f46359s;
                if (liveVoiceSwipeMenuLayout != null) {
                    if (liveVoiceSwipeMenuLayout != this) {
                        liveVoiceSwipeMenuLayout.m70928h();
                        this.f46375o = this.f46374n;
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                this.f46363c = motionEvent.getPointerId(0);
            } else if (action == 1) {
                if (Math.abs(motionEvent.getRawX() - this.f46370j.x) > this.f46361a) {
                    this.f46371k = true;
                }
                if (!this.f46375o) {
                    velocityTracker.computeCurrentVelocity(1000, this.f46362b);
                    xVelocity = velocityTracker.getXVelocity(this.f46363c);
                    if (Math.abs(xVelocity) > 1000.0f) {
                        if (xVelocity < -1000.0f) {
                            m70929i();
                        } else {
                            m70928h();
                        }
                    } else if (Math.abs(getScrollX()) > this.f46366f) {
                        m70929i();
                    } else {
                        m70928h();
                    }
                }
                m70927g();
                f46360t = false;
            } else if (action != 2) {
                if (action == 3) {
                    if (Math.abs(motionEvent.getRawX() - this.f46370j.x) > this.f46361a) {
                        this.f46371k = true;
                    }
                    if (!this.f46375o) {
                        velocityTracker.computeCurrentVelocity(1000, this.f46362b);
                        xVelocity = velocityTracker.getXVelocity(this.f46363c);
                        if (Math.abs(xVelocity) > 1000.0f) {
                            if (xVelocity < -1000.0f) {
                                m70929i();
                            } else {
                                m70928h();
                            }
                        } else if (Math.abs(getScrollX()) > this.f46366f) {
                            m70929i();
                        } else {
                            m70928h();
                        }
                    }
                    m70927g();
                    f46360t = false;
                }
            } else if (!this.f46375o) {
                float rawX = this.f46368h.x - motionEvent.getRawX();
                if (Math.abs(rawX) > 10.0f || Math.abs(getScrollX()) > 10) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                if (Math.abs(rawX) > this.f46361a) {
                    this.f46369i = false;
                }
                scrollBy((int) rawX, 0);
                if (getScrollX() < 0) {
                    scrollTo(0, 0);
                }
                int scrollX = getScrollX();
                int i = this.f46365e;
                if (scrollX > i) {
                    scrollTo(i, 0);
                }
                this.f46368h.set(motionEvent.getRawX(), motionEvent.getRawY());
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: e */
    public final void m70925e(Context context, AttributeSet attributeSet, int i) {
        this.f46361a = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f46362b = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        this.f46373m = true;
        this.f46374n = false;
    }

    /* JADX INFO: renamed from: f */
    public void m70926f() {
        if (this == f46359s) {
            m70923c();
            f46359s.scrollTo(0, 0);
            f46359s = null;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m70927g() {
        VelocityTracker velocityTracker = this.f46372l;
        if (velocityTracker != null) {
            velocityTracker.clear();
            this.f46372l.recycle();
            this.f46372l = null;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    /* JADX INFO: renamed from: h */
    public void m70928h() {
        f46359s = null;
        View view = this.f46367g;
        if (view != null) {
            view.setLongClickable(true);
        }
        m70923c();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(getScrollX(), 0);
        this.f46377q = valueAnimatorOfInt;
        valueAnimatorOfInt.addUpdateListener(new C12590c());
        this.f46377q.setInterpolator(new AccelerateInterpolator());
        this.f46377q.addListener(new C12591d());
        this.f46377q.setDuration(300L).start();
    }

    /* JADX INFO: renamed from: i */
    public void m70929i() {
        f46359s = this;
        View view = this.f46367g;
        if (view != null) {
            view.setLongClickable(false);
        }
        m70923c();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(getScrollX(), this.f46365e);
        this.f46376p = valueAnimatorOfInt;
        valueAnimatorOfInt.addUpdateListener(new C12588a());
        this.f46376p.setInterpolator(new OvershootInterpolator());
        this.f46376p.addListener(new C12589b());
        this.f46376p.setDuration(300L).start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        LiveVoiceSwipeMenuLayout liveVoiceSwipeMenuLayout = f46359s;
        if (this == liveVoiceSwipeMenuLayout) {
            liveVoiceSwipeMenuLayout.m70928h();
            f46359s = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f46373m) {
            int action = motionEvent.getAction();
            if (action != 1) {
                if (action == 2 && Math.abs(motionEvent.getRawX() - this.f46370j.x) > this.f46361a) {
                    return true;
                }
            } else {
                if (getScrollX() > this.f46361a && motionEvent.getX() < getWidth() - getScrollX()) {
                    if (this.f46369i) {
                        m70928h();
                    }
                    return true;
                }
                if (this.f46371k) {
                    return true;
                }
            }
            if (this.f46375o) {
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth;
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                if (i5 == 0) {
                    childAt.layout(paddingLeft, getPaddingTop(), childAt.getMeasuredWidth() + paddingLeft, getPaddingTop() + childAt.getMeasuredHeight());
                    measuredWidth = childAt.getMeasuredWidth();
                } else {
                    childAt.layout(paddingLeft, getPaddingTop(), childAt.getMeasuredWidth() + paddingLeft, getPaddingTop() + childAt.getMeasuredHeight());
                    measuredWidth = childAt.getMeasuredWidth();
                }
                paddingLeft += measuredWidth;
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setClickable(true);
        this.f46365e = 0;
        this.f46364d = 0;
        int childCount = getChildCount();
        boolean z = View.MeasureSpec.getMode(i2) != 1073741824;
        int measuredWidth = 0;
        boolean z2 = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            childAt.setClickable(true);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i, i2);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                this.f46364d = Math.max(this.f46364d, childAt.getMeasuredHeight());
                if (z && marginLayoutParams.height == -1) {
                    z2 = true;
                }
                if (i3 > 0) {
                    this.f46365e += childAt.getMeasuredWidth();
                } else {
                    this.f46367g = childAt;
                    measuredWidth = childAt.getMeasuredWidth();
                }
            }
        }
        setMeasuredDimension(getPaddingLeft() + getPaddingRight() + measuredWidth, this.f46364d + getPaddingTop() + getPaddingBottom());
        this.f46366f = (this.f46365e * 4) / 10;
        if (z2) {
            m70924d(childCount, i);
        }
    }

    @Override // android.view.View
    public boolean performLongClick() {
        if (Math.abs(getScrollX()) > this.f46361a) {
            return false;
        }
        return super.performLongClick();
    }

    public LiveVoiceSwipeMenuLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LiveVoiceSwipeMenuLayout(Context context) {
        this(context, null);
    }
}
