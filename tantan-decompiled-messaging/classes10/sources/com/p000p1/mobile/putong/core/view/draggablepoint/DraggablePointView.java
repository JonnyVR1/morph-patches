package com.p000p1.mobile.putong.core.view.draggablepoint;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import com.tantanapp.common.utils.NullChecker;
import l.w0c0;
import l.x2c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class DraggablePointView extends AppCompatTextView {

    /* JADX INFO: renamed from: a */
    public DragView f2630a;

    /* JADX INFO: renamed from: b */
    public float f2631b;

    /* JADX INFO: renamed from: c */
    public float f2632c;

    /* JADX INFO: renamed from: d */
    public boolean f2633d;

    /* JADX INFO: renamed from: e */
    public int f2634e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.draggablepoint.DraggablePointView$a */
    public static class C3276a implements TypeEvaluator<PointF> {
        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF evaluate(float f, PointF pointF, PointF pointF2) {
            float f2 = pointF.x;
            float f3 = f2 + ((pointF2.x - f2) * f);
            float f4 = pointF.y;
            return new PointF(f3, f4 + (f * (pointF2.y - f4)));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.draggablepoint.DraggablePointView$b */
    public interface InterfaceC3277b {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DraggablePointView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2633d = true;
        this.f2634e = getResources().getColor(w0c0.Z0);
    }

    /* JADX INFO: renamed from: h */
    public static /* bridge */ /* synthetic */ InterfaceC3277b m5051h(DraggablePointView draggablePointView) {
        draggablePointView.getClass();
        return null;
    }

    /* JADX INFO: renamed from: j */
    public PointF[] m5053j(PointF pointF, float f, Float f2) {
        float f3;
        if (f2 != null) {
            double dAtan = (float) Math.atan(f2.floatValue());
            double d = f;
            float fSin = (float) (Math.sin(dAtan) * d);
            float fCos = (float) (Math.cos(dAtan) * d);
            f = fSin;
            f3 = fCos;
        } else {
            f3 = 0.0f;
        }
        return new PointF[]{new PointF(pointF.x + f, pointF.y - f3), new PointF(pointF.x - f, pointF.y + f3)};
    }

    /* JADX INFO: renamed from: k */
    public Float m5054k(PointF pointF, PointF pointF2) {
        float f = pointF2.x;
        float f2 = pointF.x;
        if (f - f2 == 0.0f) {
            return null;
        }
        return Float.valueOf((pointF2.y - pointF.y) / (f - f2));
    }

    /* JADX INFO: renamed from: l */
    public PointF m5055l(PointF pointF, PointF pointF2) {
        return new PointF((pointF.x + pointF2.x) / 2.0f, (pointF.y + pointF2.y) / 2.0f);
    }

    /* JADX INFO: renamed from: o */
    public float m5056o(PointF pointF, PointF pointF2) {
        return (float) Math.sqrt(Math.pow(pointF.x - pointF2.x, 2.0d) + Math.pow(pointF.y - pointF2.y, 2.0d));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.f2631b = i;
        this.f2632c = i2;
        super/*android.view.View*/.onSizeChanged(i, i2, i3, i4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f2633d) {
            return super/*android.view.View*/.onTouchEvent(motionEvent);
        }
        View rootView = getRootView();
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        ViewParent parent = getParent();
        int action = motionEvent.getAction();
        if (action == 0) {
            if (NullChecker.a(parent)) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            if (rootView instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) rootView;
                viewGroup.setMotionEventSplittingEnabled(false);
                DragView dragView = new DragView(this, getContext());
                this.f2630a = dragView;
                dragView.m5065i(iArr[0] + (this.f2631b / 2.0f), iArr[1] + (this.f2632c / 2.0f), rawX, rawY);
                setDrawingCacheEnabled(true);
                Bitmap drawingCache = getDrawingCache();
                if (NullChecker.a(drawingCache)) {
                    this.f2630a.setCacheBitmap(drawingCache);
                    viewGroup.addView(this.f2630a);
                    setVisibility(4);
                }
            }
        } else if (action == 1) {
            if (NullChecker.a(parent)) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
            if (rootView instanceof ViewGroup) {
                ((ViewGroup) rootView).setMotionEventSplittingEnabled(true);
            }
            if (NullChecker.a(this.f2630a)) {
                this.f2630a.m5063g();
            }
        } else if (action == 2) {
            if (NullChecker.a(parent)) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (rootView instanceof ViewGroup) {
                ((ViewGroup) rootView).setMotionEventSplittingEnabled(false);
            }
            if (NullChecker.a(this.f2630a)) {
                this.f2630a.m5064h(rawX, rawY);
            }
        } else if (action == 3) {
            if (NullChecker.a(parent)) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
            if (rootView instanceof ViewGroup) {
                ((ViewGroup) rootView).setMotionEventSplittingEnabled(true);
            }
            if (NullChecker.a(this.f2630a)) {
                this.f2630a.m5060d();
            }
        }
        return true;
    }

    public void setDragViewColor(int i) {
        this.f2634e = i;
    }

    public void setDraggable(boolean z) {
        this.f2633d = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setOnDragListener(InterfaceC3277b interfaceC3277b) {
        setNestedScrollingEnabled(true);
    }

    public DraggablePointView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DraggablePointView(Context context) {
        this(context, null);
    }

    public class DragView extends View {

        /* JADX INFO: renamed from: a */
        public Path f2635a;

        /* JADX INFO: renamed from: b */
        public Paint f2636b;

        /* JADX INFO: renamed from: c */
        public Bitmap f2637c;

        /* JADX INFO: renamed from: d */
        public PointF f2638d;

        /* JADX INFO: renamed from: e */
        public PointF f2639e;

        /* JADX INFO: renamed from: f */
        public PointF f2640f;

        /* JADX INFO: renamed from: g */
        public float f2641g;

        /* JADX INFO: renamed from: h */
        public float f2642h;

        /* JADX INFO: renamed from: i */
        public float f2643i;

        /* JADX INFO: renamed from: j */
        public float f2644j;

        /* JADX INFO: renamed from: k */
        public int f2645k;

        /* JADX INFO: renamed from: l */
        public int f2646l;

        /* JADX INFO: renamed from: m */
        public int f2647m;

        /* JADX INFO: renamed from: n */
        public int f2648n;

        /* JADX INFO: renamed from: o */
        public int[] f2649o;

        /* JADX INFO: renamed from: p */
        public Bitmap[] f2650p;

        /* JADX INFO: renamed from: q */
        public int f2651q;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.draggablepoint.DraggablePointView$DragView$a */
        public class C3271a implements ValueAnimator.AnimatorUpdateListener {
            public C3271a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                DragView.this.f2651q = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                DragView.this.invalidate();
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.draggablepoint.DraggablePointView$DragView$b */
        public class C3272b extends AnimatorListenerAdapter {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ boolean f2654a;

            public C3272b(boolean z) {
                this.f2654a = z;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                DraggablePointView.this.setDrawingCacheEnabled(false);
                DraggablePointView.m5051h(DraggablePointView.this);
                if (NullChecker.a((Object) null) && this.f2654a) {
                    DraggablePointView.m5051h(DraggablePointView.this);
                    throw null;
                }
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.draggablepoint.DraggablePointView$DragView$c */
        public class C3273c implements TimeInterpolator {
            public C3273c() {
            }

            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                return (float) ((Math.pow(2.0d, (-4.0f) * f) * Math.sin((((double) (f - 0.14285725f)) * 6.283185307179586d) / 0.5714290142059326d)) + 1.0d);
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.draggablepoint.DraggablePointView$DragView$d */
        public class C3274d implements ValueAnimator.AnimatorUpdateListener {
            public C3274d() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                PointF pointF = (PointF) valueAnimator.getAnimatedValue();
                DragView.this.f2638d.set(pointF.x, pointF.y);
                DragView.this.invalidate();
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.draggablepoint.DraggablePointView$DragView$e */
        public class C3275e extends AnimatorListenerAdapter {
            public C3275e() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                DragView.this.m5060d();
                DraggablePointView.m5051h(DraggablePointView.this);
                if (NullChecker.a((Object) null)) {
                    DraggablePointView.m5051h(DraggablePointView.this);
                    throw null;
                }
            }
        }

        public DragView(@Nullable Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f2642h = 300.0f;
            this.f2647m = 30;
            this.f2648n = 40;
            this.f2649o = new int[]{x2c0.v7, x2c0.w7, x2c0.x7, x2c0.y7, x2c0.z7};
            m5061e();
        }

        /* JADX INFO: renamed from: d */
        public final void m5060d() {
            ((ViewGroup) getParent()).removeView(this);
            DraggablePointView.this.setVisibility(0);
            DraggablePointView.this.setDrawingCacheEnabled(false);
        }

        /* JADX INFO: renamed from: e */
        public final void m5061e() {
            this.f2635a = new Path();
            Paint paint = new Paint();
            this.f2636b = paint;
            paint.setAntiAlias(true);
            this.f2636b.setDither(true);
            this.f2636b.setColor(DraggablePointView.this.f2634e);
            this.f2638d = new PointF();
            this.f2639e = new PointF();
            this.f2645k = 0;
            this.f2650p = new Bitmap[this.f2649o.length];
            for (int i = 0; i < this.f2649o.length; i++) {
                this.f2650p[i] = BitmapFactory.decodeResource(getResources(), this.f2649o[i]);
            }
        }

        /* JADX INFO: renamed from: f */
        public final boolean m5062f() {
            return this.f2641g <= this.f2642h;
        }

        /* JADX INFO: renamed from: g */
        public void m5063g() {
            if (this.f2645k == 1 && m5062f()) {
                m5068l();
                return;
            }
            if (this.f2645k == 2) {
                if (m5062f()) {
                    m5068l();
                } else {
                    this.f2645k = 3;
                    m5066j();
                }
            }
        }

        /* JADX INFO: renamed from: h */
        public void m5064h(float f, float f2) {
            this.f2638d.set(f, f2);
            this.f2641g = DraggablePointView.this.m5056o(this.f2638d, this.f2639e);
            if (this.f2645k == 1) {
                if (m5062f()) {
                    this.f2646l = Math.max((int) (this.f2647m - (this.f2641g / 10.0f)), 10);
                } else {
                    this.f2645k = 2;
                    DraggablePointView.m5051h(DraggablePointView.this);
                    if (NullChecker.a((Object) null)) {
                        DraggablePointView.m5051h(DraggablePointView.this);
                        throw null;
                    }
                }
            }
            invalidate();
        }

        /* JADX INFO: renamed from: i */
        public void m5065i(float f, float f2, float f3, float f4) {
            this.f2639e.set(f, f2);
            this.f2638d.set(f3, f4);
            float fM5056o = DraggablePointView.this.m5056o(this.f2638d, this.f2639e);
            this.f2641g = fM5056o;
            if (fM5056o > this.f2642h) {
                this.f2645k = 0;
            } else {
                this.f2646l = Math.max((int) (this.f2647m - (fM5056o / 10.0f)), 10);
                this.f2645k = 1;
            }
        }

        /* JADX INFO: renamed from: j */
        public final void m5066j() {
            m5067k(true);
        }

        /* JADX INFO: renamed from: k */
        public final void m5067k(boolean z) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, this.f2649o.length);
            valueAnimatorOfInt.setDuration(300L);
            valueAnimatorOfInt.addUpdateListener(new C3271a());
            valueAnimatorOfInt.addListener(new C3272b(z));
            valueAnimatorOfInt.start();
        }

        /* JADX INFO: renamed from: l */
        public final void m5068l() {
            int i = this.f2645k;
            if (i == 1) {
                C3276a c3276a = new C3276a();
                PointF pointF = this.f2638d;
                PointF pointF2 = new PointF(pointF.x, pointF.y);
                PointF pointF3 = this.f2639e;
                ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(c3276a, pointF2, new PointF(pointF3.x, pointF3.y));
                valueAnimatorOfObject.setDuration(500L);
                valueAnimatorOfObject.setInterpolator(new C3273c());
                valueAnimatorOfObject.addUpdateListener(new C3274d());
                valueAnimatorOfObject.addListener(new C3275e());
                valueAnimatorOfObject.start();
                return;
            }
            if (i == 2) {
                PointF pointF4 = this.f2638d;
                PointF pointF5 = this.f2639e;
                pointF4.set(pointF5.x, pointF5.y);
                invalidate();
                m5060d();
                DraggablePointView.m5051h(DraggablePointView.this);
                if (NullChecker.a((Object) null)) {
                    DraggablePointView.m5051h(DraggablePointView.this);
                    throw null;
                }
            }
        }

        @Override // android.view.View
        public void onDraw(Canvas canvas) {
            int i;
            if (m5062f() && this.f2645k == 1) {
                this.f2636b.setColor(DraggablePointView.this.f2634e);
                PointF pointF = this.f2639e;
                canvas.drawCircle(pointF.x, pointF.y, this.f2646l, this.f2636b);
                Float fM5054k = DraggablePointView.this.m5054k(this.f2638d, this.f2639e);
                PointF[] pointFArrM5053j = DraggablePointView.this.m5053j(this.f2639e, this.f2646l, fM5054k);
                int iMin = ((int) Math.min(this.f2643i, this.f2644j)) / 2;
                this.f2648n = iMin;
                PointF[] pointFArrM5053j2 = DraggablePointView.this.m5053j(this.f2638d, iMin, fM5054k);
                this.f2636b.setColor(DraggablePointView.this.f2634e);
                this.f2640f = DraggablePointView.this.m5055l(this.f2638d, this.f2639e);
                this.f2635a.reset();
                Path path = this.f2635a;
                PointF pointF2 = pointFArrM5053j[0];
                path.moveTo(pointF2.x, pointF2.y);
                Path path2 = this.f2635a;
                PointF pointF3 = this.f2640f;
                float f = pointF3.x;
                float f2 = pointF3.y;
                PointF pointF4 = pointFArrM5053j2[0];
                path2.quadTo(f, f2, pointF4.x, pointF4.y);
                Path path3 = this.f2635a;
                PointF pointF5 = pointFArrM5053j2[1];
                path3.lineTo(pointF5.x, pointF5.y);
                Path path4 = this.f2635a;
                PointF pointF6 = this.f2640f;
                float f3 = pointF6.x;
                float f4 = pointF6.y;
                PointF pointF7 = pointFArrM5053j[1];
                path4.quadTo(f3, f4, pointF7.x, pointF7.y);
                Path path5 = this.f2635a;
                PointF pointF8 = pointFArrM5053j[0];
                path5.lineTo(pointF8.x, pointF8.y);
                canvas.drawPath(this.f2635a, this.f2636b);
            }
            if (NullChecker.a(this.f2637c) && !this.f2637c.isRecycled() && this.f2645k != 3) {
                Bitmap bitmap = this.f2637c;
                PointF pointF9 = this.f2638d;
                canvas.drawBitmap(bitmap, pointF9.x - (this.f2643i / 2.0f), pointF9.y - (this.f2644j / 2.0f), this.f2636b);
            }
            if (this.f2645k != 3 || (i = this.f2651q) >= this.f2649o.length) {
                return;
            }
            Bitmap bitmap2 = this.f2650p[i];
            PointF pointF10 = this.f2638d;
            canvas.drawBitmap(bitmap2, pointF10.x - (this.f2643i / 2.0f), pointF10.y - (this.f2644j / 2.0f), this.f2636b);
        }

        public void setCacheBitmap(Bitmap bitmap) {
            this.f2637c = bitmap;
            this.f2643i = bitmap.getWidth();
            this.f2644j = bitmap.getHeight();
        }

        public void setState(int i) {
            this.f2645k = i;
        }

        public DragView(DraggablePointView draggablePointView, @Nullable Context context, AttributeSet attributeSet) {
            this(context, attributeSet, 0);
        }

        public DragView(DraggablePointView draggablePointView, Context context) {
            this(draggablePointView, context, null);
        }
    }
}
