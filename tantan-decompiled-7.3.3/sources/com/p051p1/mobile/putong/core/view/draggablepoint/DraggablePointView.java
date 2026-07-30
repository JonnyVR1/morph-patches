package com.p051p1.mobile.putong.core.view.draggablepoint;

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
import p153l.c9c0;
import p153l.dbc0;

/* JADX INFO: loaded from: classes12.dex */
public class DraggablePointView extends AppCompatTextView {

    /* JADX INFO: renamed from: a */
    public DragView f39536a;

    /* JADX INFO: renamed from: b */
    public float f39537b;

    /* JADX INFO: renamed from: c */
    public float f39538c;

    /* JADX INFO: renamed from: d */
    public boolean f39539d;

    /* JADX INFO: renamed from: e */
    public int f39540e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.draggablepoint.DraggablePointView$a */
    public static class C9341a implements TypeEvaluator<PointF> {
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
    public interface InterfaceC9342b {
    }

    public DraggablePointView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f39539d = true;
        this.f39540e = getResources().getColor(c9c0.f80398a1);
    }

    /* JADX INFO: renamed from: h */
    public static /* bridge */ /* synthetic */ InterfaceC9342b m60826h(DraggablePointView draggablePointView) {
        draggablePointView.getClass();
        return null;
    }

    /* JADX INFO: renamed from: j */
    public PointF[] m60828j(PointF pointF, float f, Float f2) {
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
    public Float m60829k(PointF pointF, PointF pointF2) {
        float f = pointF2.x;
        float f2 = pointF.x;
        if (f - f2 == 0.0f) {
            return null;
        }
        return Float.valueOf((pointF2.y - pointF.y) / (f - f2));
    }

    /* JADX INFO: renamed from: l */
    public PointF m60830l(PointF pointF, PointF pointF2) {
        return new PointF((pointF.x + pointF2.x) / 2.0f, (pointF.y + pointF2.y) / 2.0f);
    }

    /* JADX INFO: renamed from: o */
    public float m60831o(PointF pointF, PointF pointF2) {
        return (float) Math.sqrt(Math.pow(pointF.x - pointF2.x, 2.0d) + Math.pow(pointF.y - pointF2.y, 2.0d));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.f39537b = i;
        this.f39538c = i2;
        super.onSizeChanged(i, i2, i3, i4);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f39539d) {
            return super.onTouchEvent(motionEvent);
        }
        View rootView = getRootView();
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        ViewParent parent = getParent();
        int action = motionEvent.getAction();
        if (action == 0) {
            if (NullChecker.m82486a(parent)) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            if (rootView instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) rootView;
                viewGroup.setMotionEventSplittingEnabled(false);
                DragView dragView = new DragView(this, getContext());
                this.f39536a = dragView;
                dragView.m60840i(iArr[0] + (this.f39537b / 2.0f), iArr[1] + (this.f39538c / 2.0f), rawX, rawY);
                setDrawingCacheEnabled(true);
                Bitmap drawingCache = getDrawingCache();
                if (NullChecker.m82486a(drawingCache)) {
                    this.f39536a.setCacheBitmap(drawingCache);
                    viewGroup.addView(this.f39536a);
                    setVisibility(4);
                }
            }
        } else if (action == 1) {
            if (NullChecker.m82486a(parent)) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
            if (rootView instanceof ViewGroup) {
                ((ViewGroup) rootView).setMotionEventSplittingEnabled(true);
            }
            if (NullChecker.m82486a(this.f39536a)) {
                this.f39536a.m60838g();
            }
        } else if (action == 2) {
            if (NullChecker.m82486a(parent)) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (rootView instanceof ViewGroup) {
                ((ViewGroup) rootView).setMotionEventSplittingEnabled(false);
            }
            if (NullChecker.m82486a(this.f39536a)) {
                this.f39536a.m60839h(rawX, rawY);
            }
        } else if (action == 3) {
            if (NullChecker.m82486a(parent)) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
            if (rootView instanceof ViewGroup) {
                ((ViewGroup) rootView).setMotionEventSplittingEnabled(true);
            }
            if (NullChecker.m82486a(this.f39536a)) {
                this.f39536a.m60835d();
            }
        }
        return true;
    }

    public void setDragViewColor(int i) {
        this.f39540e = i;
    }

    public void setDraggable(boolean z) {
        this.f39539d = z;
    }

    public void setOnDragListener(InterfaceC9342b interfaceC9342b) {
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
        public Path f39541a;

        /* JADX INFO: renamed from: b */
        public Paint f39542b;

        /* JADX INFO: renamed from: c */
        public Bitmap f39543c;

        /* JADX INFO: renamed from: d */
        public PointF f39544d;

        /* JADX INFO: renamed from: e */
        public PointF f39545e;

        /* JADX INFO: renamed from: f */
        public PointF f39546f;

        /* JADX INFO: renamed from: g */
        public float f39547g;

        /* JADX INFO: renamed from: h */
        public float f39548h;

        /* JADX INFO: renamed from: i */
        public float f39549i;

        /* JADX INFO: renamed from: j */
        public float f39550j;

        /* JADX INFO: renamed from: k */
        public int f39551k;

        /* JADX INFO: renamed from: l */
        public int f39552l;

        /* JADX INFO: renamed from: m */
        public int f39553m;

        /* JADX INFO: renamed from: n */
        public int f39554n;

        /* JADX INFO: renamed from: o */
        public int[] f39555o;

        /* JADX INFO: renamed from: p */
        public Bitmap[] f39556p;

        /* JADX INFO: renamed from: q */
        public int f39557q;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.draggablepoint.DraggablePointView$DragView$a */
        public class C9336a implements ValueAnimator.AnimatorUpdateListener {
            public C9336a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                DragView.this.f39557q = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                DragView.this.invalidate();
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.draggablepoint.DraggablePointView$DragView$b */
        public class C9337b extends AnimatorListenerAdapter {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ boolean f39560a;

            public C9337b(boolean z) {
                this.f39560a = z;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                DraggablePointView.this.setDrawingCacheEnabled(false);
                DraggablePointView.m60826h(DraggablePointView.this);
                if (NullChecker.m82486a(null) && this.f39560a) {
                    DraggablePointView.m60826h(DraggablePointView.this);
                    throw null;
                }
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.draggablepoint.DraggablePointView$DragView$c */
        public class C9338c implements TimeInterpolator {
            public C9338c() {
            }

            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                return (float) ((Math.pow(2.0d, (-4.0f) * f) * Math.sin((((double) (f - 0.14285725f)) * 6.283185307179586d) / 0.5714290142059326d)) + 1.0d);
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.draggablepoint.DraggablePointView$DragView$d */
        public class C9339d implements ValueAnimator.AnimatorUpdateListener {
            public C9339d() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                PointF pointF = (PointF) valueAnimator.getAnimatedValue();
                DragView.this.f39544d.set(pointF.x, pointF.y);
                DragView.this.invalidate();
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.draggablepoint.DraggablePointView$DragView$e */
        public class C9340e extends AnimatorListenerAdapter {
            public C9340e() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                DragView.this.m60835d();
                DraggablePointView.m60826h(DraggablePointView.this);
                if (NullChecker.m82486a(null)) {
                    DraggablePointView.m60826h(DraggablePointView.this);
                    throw null;
                }
            }
        }

        public DragView(@Nullable Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f39548h = 300.0f;
            this.f39553m = 30;
            this.f39554n = 40;
            this.f39555o = new int[]{dbc0.f87537w7, dbc0.f87569x7, dbc0.f87601y7, dbc0.f87633z7, dbc0.f85984A7};
            m60836e();
        }

        /* JADX INFO: renamed from: d */
        public final void m60835d() {
            ((ViewGroup) getParent()).removeView(this);
            DraggablePointView.this.setVisibility(0);
            DraggablePointView.this.setDrawingCacheEnabled(false);
        }

        /* JADX INFO: renamed from: e */
        public final void m60836e() {
            this.f39541a = new Path();
            Paint paint = new Paint();
            this.f39542b = paint;
            paint.setAntiAlias(true);
            this.f39542b.setDither(true);
            this.f39542b.setColor(DraggablePointView.this.f39540e);
            this.f39544d = new PointF();
            this.f39545e = new PointF();
            this.f39551k = 0;
            this.f39556p = new Bitmap[this.f39555o.length];
            for (int i = 0; i < this.f39555o.length; i++) {
                this.f39556p[i] = BitmapFactory.decodeResource(getResources(), this.f39555o[i]);
            }
        }

        /* JADX INFO: renamed from: f */
        public final boolean m60837f() {
            return this.f39547g <= this.f39548h;
        }

        /* JADX INFO: renamed from: g */
        public void m60838g() {
            if (this.f39551k == 1 && m60837f()) {
                m60843l();
                return;
            }
            if (this.f39551k == 2) {
                if (m60837f()) {
                    m60843l();
                } else {
                    this.f39551k = 3;
                    m60841j();
                }
            }
        }

        /* JADX INFO: renamed from: h */
        public void m60839h(float f, float f2) {
            this.f39544d.set(f, f2);
            this.f39547g = DraggablePointView.this.m60831o(this.f39544d, this.f39545e);
            if (this.f39551k == 1) {
                if (m60837f()) {
                    this.f39552l = Math.max((int) (this.f39553m - (this.f39547g / 10.0f)), 10);
                } else {
                    this.f39551k = 2;
                    DraggablePointView.m60826h(DraggablePointView.this);
                    if (NullChecker.m82486a(null)) {
                        DraggablePointView.m60826h(DraggablePointView.this);
                        throw null;
                    }
                }
            }
            invalidate();
        }

        /* JADX INFO: renamed from: i */
        public void m60840i(float f, float f2, float f3, float f4) {
            this.f39545e.set(f, f2);
            this.f39544d.set(f3, f4);
            float fM60831o = DraggablePointView.this.m60831o(this.f39544d, this.f39545e);
            this.f39547g = fM60831o;
            if (fM60831o > this.f39548h) {
                this.f39551k = 0;
            } else {
                this.f39552l = Math.max((int) (this.f39553m - (fM60831o / 10.0f)), 10);
                this.f39551k = 1;
            }
        }

        /* JADX INFO: renamed from: j */
        public final void m60841j() {
            m60842k(true);
        }

        /* JADX INFO: renamed from: k */
        public final void m60842k(boolean z) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, this.f39555o.length);
            valueAnimatorOfInt.setDuration(300L);
            valueAnimatorOfInt.addUpdateListener(new C9336a());
            valueAnimatorOfInt.addListener(new C9337b(z));
            valueAnimatorOfInt.start();
        }

        /* JADX INFO: renamed from: l */
        public final void m60843l() {
            int i = this.f39551k;
            if (i == 1) {
                C9341a c9341a = new C9341a();
                PointF pointF = this.f39544d;
                PointF pointF2 = new PointF(pointF.x, pointF.y);
                PointF pointF3 = this.f39545e;
                ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(c9341a, pointF2, new PointF(pointF3.x, pointF3.y));
                valueAnimatorOfObject.setDuration(500L);
                valueAnimatorOfObject.setInterpolator(new C9338c());
                valueAnimatorOfObject.addUpdateListener(new C9339d());
                valueAnimatorOfObject.addListener(new C9340e());
                valueAnimatorOfObject.start();
                return;
            }
            if (i == 2) {
                PointF pointF4 = this.f39544d;
                PointF pointF5 = this.f39545e;
                pointF4.set(pointF5.x, pointF5.y);
                invalidate();
                m60835d();
                DraggablePointView.m60826h(DraggablePointView.this);
                if (NullChecker.m82486a(null)) {
                    DraggablePointView.m60826h(DraggablePointView.this);
                    throw null;
                }
            }
        }

        @Override // android.view.View
        public void onDraw(Canvas canvas) {
            int i;
            if (m60837f() && this.f39551k == 1) {
                this.f39542b.setColor(DraggablePointView.this.f39540e);
                PointF pointF = this.f39545e;
                canvas.drawCircle(pointF.x, pointF.y, this.f39552l, this.f39542b);
                Float fM60829k = DraggablePointView.this.m60829k(this.f39544d, this.f39545e);
                PointF[] pointFArrM60828j = DraggablePointView.this.m60828j(this.f39545e, this.f39552l, fM60829k);
                int iMin = ((int) Math.min(this.f39549i, this.f39550j)) / 2;
                this.f39554n = iMin;
                PointF[] pointFArrM60828j2 = DraggablePointView.this.m60828j(this.f39544d, iMin, fM60829k);
                this.f39542b.setColor(DraggablePointView.this.f39540e);
                this.f39546f = DraggablePointView.this.m60830l(this.f39544d, this.f39545e);
                this.f39541a.reset();
                Path path = this.f39541a;
                PointF pointF2 = pointFArrM60828j[0];
                path.moveTo(pointF2.x, pointF2.y);
                Path path2 = this.f39541a;
                PointF pointF3 = this.f39546f;
                float f = pointF3.x;
                float f2 = pointF3.y;
                PointF pointF4 = pointFArrM60828j2[0];
                path2.quadTo(f, f2, pointF4.x, pointF4.y);
                Path path3 = this.f39541a;
                PointF pointF5 = pointFArrM60828j2[1];
                path3.lineTo(pointF5.x, pointF5.y);
                Path path4 = this.f39541a;
                PointF pointF6 = this.f39546f;
                float f3 = pointF6.x;
                float f4 = pointF6.y;
                PointF pointF7 = pointFArrM60828j[1];
                path4.quadTo(f3, f4, pointF7.x, pointF7.y);
                Path path5 = this.f39541a;
                PointF pointF8 = pointFArrM60828j[0];
                path5.lineTo(pointF8.x, pointF8.y);
                canvas.drawPath(this.f39541a, this.f39542b);
            }
            if (NullChecker.m82486a(this.f39543c) && !this.f39543c.isRecycled() && this.f39551k != 3) {
                Bitmap bitmap = this.f39543c;
                PointF pointF9 = this.f39544d;
                canvas.drawBitmap(bitmap, pointF9.x - (this.f39549i / 2.0f), pointF9.y - (this.f39550j / 2.0f), this.f39542b);
            }
            if (this.f39551k != 3 || (i = this.f39557q) >= this.f39555o.length) {
                return;
            }
            Bitmap bitmap2 = this.f39556p[i];
            PointF pointF10 = this.f39544d;
            canvas.drawBitmap(bitmap2, pointF10.x - (this.f39549i / 2.0f), pointF10.y - (this.f39550j / 2.0f), this.f39542b);
        }

        public void setCacheBitmap(Bitmap bitmap) {
            this.f39543c = bitmap;
            this.f39549i = bitmap.getWidth();
            this.f39550j = bitmap.getHeight();
        }

        public void setState(int i) {
            this.f39551k = i;
        }

        public DragView(DraggablePointView draggablePointView, @Nullable Context context, AttributeSet attributeSet) {
            this(context, attributeSet, 0);
        }

        public DragView(DraggablePointView draggablePointView, Context context) {
            this(draggablePointView, context, null);
        }
    }
}
