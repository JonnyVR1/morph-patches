package com.p051p1.mobile.putong.live.external.view.widgets;

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

/* JADX INFO: loaded from: classes9.dex */
public class LiveVoiceSwipeMenuLayout extends ViewGroup {

    /* JADX INFO: renamed from: s */
    public static LiveVoiceSwipeMenuLayout f47207s;

    /* JADX INFO: renamed from: t */
    public static boolean f47208t;

    /* JADX INFO: renamed from: a */
    public int f47209a;

    /* JADX INFO: renamed from: b */
    public int f47210b;

    /* JADX INFO: renamed from: c */
    public int f47211c;

    /* JADX INFO: renamed from: d */
    public int f47212d;

    /* JADX INFO: renamed from: e */
    public int f47213e;

    /* JADX INFO: renamed from: f */
    public int f47214f;

    /* JADX INFO: renamed from: g */
    public View f47215g;

    /* JADX INFO: renamed from: h */
    public PointF f47216h;

    /* JADX INFO: renamed from: i */
    public boolean f47217i;

    /* JADX INFO: renamed from: j */
    public PointF f47218j;

    /* JADX INFO: renamed from: k */
    public boolean f47219k;

    /* JADX INFO: renamed from: l */
    public VelocityTracker f47220l;

    /* JADX INFO: renamed from: m */
    public boolean f47221m;

    /* JADX INFO: renamed from: n */
    public boolean f47222n;

    /* JADX INFO: renamed from: o */
    public boolean f47223o;

    /* JADX INFO: renamed from: p */
    public ValueAnimator f47224p;

    /* JADX INFO: renamed from: q */
    public ValueAnimator f47225q;

    /* JADX INFO: renamed from: r */
    public boolean f47226r;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.view.widgets.LiveVoiceSwipeMenuLayout$a */
    public class C12751a implements ValueAnimator.AnimatorUpdateListener {
        public C12751a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            LiveVoiceSwipeMenuLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.view.widgets.LiveVoiceSwipeMenuLayout$b */
    public class C12752b extends AnimatorListenerAdapter {
        public C12752b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            LiveVoiceSwipeMenuLayout.this.f47226r = true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.view.widgets.LiveVoiceSwipeMenuLayout$c */
    public class C12753c implements ValueAnimator.AnimatorUpdateListener {
        public C12753c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            LiveVoiceSwipeMenuLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.view.widgets.LiveVoiceSwipeMenuLayout$d */
    public class C12754d extends AnimatorListenerAdapter {
        public C12754d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            LiveVoiceSwipeMenuLayout.this.f47226r = false;
        }
    }

    public LiveVoiceSwipeMenuLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f47216h = new PointF();
        this.f47217i = true;
        this.f47218j = new PointF();
        m72108e(context, attributeSet, i);
    }

    /* JADX INFO: renamed from: b */
    public final void m72105b(MotionEvent motionEvent) {
        if (this.f47220l == null) {
            this.f47220l = VelocityTracker.obtain();
        }
        this.f47220l.addMovement(motionEvent);
    }

    /* JADX INFO: renamed from: c */
    public final void m72106c() {
        ValueAnimator valueAnimator = this.f47225q;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f47225q.cancel();
        }
        ValueAnimator valueAnimator2 = this.f47224p;
        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
            return;
        }
        this.f47224p.cancel();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0036  */
    /* JADX INFO: renamed from: d */
    public final void m72107d(int i, int i2) {
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
        if (this.f47221m) {
            m72105b(motionEvent);
            VelocityTracker velocityTracker = this.f47220l;
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f47219k = false;
                this.f47217i = true;
                this.f47223o = false;
                if (f47208t) {
                    return false;
                }
                f47208t = true;
                this.f47216h.set(motionEvent.getRawX(), motionEvent.getRawY());
                this.f47218j.set(motionEvent.getRawX(), motionEvent.getRawY());
                LiveVoiceSwipeMenuLayout liveVoiceSwipeMenuLayout = f47207s;
                if (liveVoiceSwipeMenuLayout != null) {
                    if (liveVoiceSwipeMenuLayout != this) {
                        liveVoiceSwipeMenuLayout.m72111h();
                        this.f47223o = this.f47222n;
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                this.f47211c = motionEvent.getPointerId(0);
            } else if (action == 1) {
                if (Math.abs(motionEvent.getRawX() - this.f47218j.x) > this.f47209a) {
                    this.f47219k = true;
                }
                if (!this.f47223o) {
                    velocityTracker.computeCurrentVelocity(1000, this.f47210b);
                    xVelocity = velocityTracker.getXVelocity(this.f47211c);
                    if (Math.abs(xVelocity) > 1000.0f) {
                        if (xVelocity < -1000.0f) {
                            m72112i();
                        } else {
                            m72111h();
                        }
                    } else if (Math.abs(getScrollX()) > this.f47214f) {
                        m72112i();
                    } else {
                        m72111h();
                    }
                }
                m72110g();
                f47208t = false;
            } else if (action != 2) {
                if (action == 3) {
                    if (Math.abs(motionEvent.getRawX() - this.f47218j.x) > this.f47209a) {
                        this.f47219k = true;
                    }
                    if (!this.f47223o) {
                        velocityTracker.computeCurrentVelocity(1000, this.f47210b);
                        xVelocity = velocityTracker.getXVelocity(this.f47211c);
                        if (Math.abs(xVelocity) > 1000.0f) {
                            if (xVelocity < -1000.0f) {
                                m72112i();
                            } else {
                                m72111h();
                            }
                        } else if (Math.abs(getScrollX()) > this.f47214f) {
                            m72112i();
                        } else {
                            m72111h();
                        }
                    }
                    m72110g();
                    f47208t = false;
                }
            } else if (!this.f47223o) {
                float rawX = this.f47216h.x - motionEvent.getRawX();
                if (Math.abs(rawX) > 10.0f || Math.abs(getScrollX()) > 10) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                if (Math.abs(rawX) > this.f47209a) {
                    this.f47217i = false;
                }
                scrollBy((int) rawX, 0);
                if (getScrollX() < 0) {
                    scrollTo(0, 0);
                }
                int scrollX = getScrollX();
                int i = this.f47213e;
                if (scrollX > i) {
                    scrollTo(i, 0);
                }
                this.f47216h.set(motionEvent.getRawX(), motionEvent.getRawY());
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: e */
    public final void m72108e(Context context, AttributeSet attributeSet, int i) {
        this.f47209a = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f47210b = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        this.f47221m = true;
        this.f47222n = false;
    }

    /* JADX INFO: renamed from: f */
    public void m72109f() {
        if (this == f47207s) {
            m72106c();
            f47207s.scrollTo(0, 0);
            f47207s = null;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m72110g() {
        VelocityTracker velocityTracker = this.f47220l;
        if (velocityTracker != null) {
            velocityTracker.clear();
            this.f47220l.recycle();
            this.f47220l = null;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    /* JADX INFO: renamed from: h */
    public void m72111h() {
        f47207s = null;
        View view = this.f47215g;
        if (view != null) {
            view.setLongClickable(true);
        }
        m72106c();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(getScrollX(), 0);
        this.f47225q = valueAnimatorOfInt;
        valueAnimatorOfInt.addUpdateListener(new C12753c());
        this.f47225q.setInterpolator(new AccelerateInterpolator());
        this.f47225q.addListener(new C12754d());
        this.f47225q.setDuration(300L).start();
    }

    /* JADX INFO: renamed from: i */
    public void m72112i() {
        f47207s = this;
        View view = this.f47215g;
        if (view != null) {
            view.setLongClickable(false);
        }
        m72106c();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(getScrollX(), this.f47213e);
        this.f47224p = valueAnimatorOfInt;
        valueAnimatorOfInt.addUpdateListener(new C12751a());
        this.f47224p.setInterpolator(new OvershootInterpolator());
        this.f47224p.addListener(new C12752b());
        this.f47224p.setDuration(300L).start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        LiveVoiceSwipeMenuLayout liveVoiceSwipeMenuLayout = f47207s;
        if (this == liveVoiceSwipeMenuLayout) {
            liveVoiceSwipeMenuLayout.m72111h();
            f47207s = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f47221m) {
            int action = motionEvent.getAction();
            if (action != 1) {
                if (action == 2 && Math.abs(motionEvent.getRawX() - this.f47218j.x) > this.f47209a) {
                    return true;
                }
            } else {
                if (getScrollX() > this.f47209a && motionEvent.getX() < getWidth() - getScrollX()) {
                    if (this.f47217i) {
                        m72111h();
                    }
                    return true;
                }
                if (this.f47219k) {
                    return true;
                }
            }
            if (this.f47223o) {
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
        this.f47213e = 0;
        this.f47212d = 0;
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
                this.f47212d = Math.max(this.f47212d, childAt.getMeasuredHeight());
                if (z && marginLayoutParams.height == -1) {
                    z2 = true;
                }
                if (i3 > 0) {
                    this.f47213e += childAt.getMeasuredWidth();
                } else {
                    this.f47215g = childAt;
                    measuredWidth = childAt.getMeasuredWidth();
                }
            }
        }
        setMeasuredDimension(getPaddingLeft() + getPaddingRight() + measuredWidth, this.f47212d + getPaddingTop() + getPaddingBottom());
        this.f47214f = (this.f47213e * 4) / 10;
        if (z2) {
            m72107d(childCount, i);
        }
    }

    @Override // android.view.View
    public boolean performLongClick() {
        if (Math.abs(getScrollX()) > this.f47209a) {
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
