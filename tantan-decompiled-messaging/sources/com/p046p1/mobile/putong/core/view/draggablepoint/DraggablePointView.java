package com.p046p1.mobile.putong.core.view.draggablepoint;

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
import p149l.w0c0;
import p149l.x2c0;

/* JADX INFO: loaded from: classes10.dex */
public class DraggablePointView extends AppCompatTextView {

    /* JADX INFO: renamed from: a */
    public DragView f38688a;

    /* JADX INFO: renamed from: b */
    public float f38689b;

    /* JADX INFO: renamed from: c */
    public float f38690c;

    /* JADX INFO: renamed from: d */
    public boolean f38691d;

    /* JADX INFO: renamed from: e */
    public int f38692e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.draggablepoint.DraggablePointView$a */
    public static class C9178a implements TypeEvaluator<PointF> {
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
    public interface InterfaceC9179b {
    }

    public DraggablePointView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f38691d = true;
        this.f38692e = getResources().getColor(w0c0.f183825Z0);
    }

    /* JADX INFO: renamed from: h */
    public static /* bridge */ /* synthetic */ InterfaceC9179b m59642h(DraggablePointView draggablePointView) {
        draggablePointView.getClass();
        return null;
    }

    /* JADX INFO: renamed from: j */
    public PointF[] m59644j(PointF pointF, float f, Float f2) {
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
    public Float m59645k(PointF pointF, PointF pointF2) {
        float f = pointF2.x;
        float f2 = pointF.x;
        if (f - f2 == 0.0f) {
            return null;
        }
        return Float.valueOf((pointF2.y - pointF.y) / (f - f2));
    }

    /* JADX INFO: renamed from: l */
    public PointF m59646l(PointF pointF, PointF pointF2) {
        return new PointF((pointF.x + pointF2.x) / 2.0f, (pointF.y + pointF2.y) / 2.0f);
    }

    /* JADX INFO: renamed from: o */
    public float m59647o(PointF pointF, PointF pointF2) {
        return (float) Math.sqrt(Math.pow(pointF.x - pointF2.x, 2.0d) + Math.pow(pointF.y - pointF2.y, 2.0d));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.f38689b = i;
        this.f38690c = i2;
        super.onSizeChanged(i, i2, i3, i4);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f38691d) {
            return super.onTouchEvent(motionEvent);
        }
        View rootView = getRootView();
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        ViewParent parent = getParent();
        int action = motionEvent.getAction();
        if (action == 0) {
            if (NullChecker.m81303a(parent)) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            if (rootView instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) rootView;
                viewGroup.setMotionEventSplittingEnabled(false);
                DragView dragView = new DragView(this, getContext());
                this.f38688a = dragView;
                dragView.m59656i(iArr[0] + (this.f38689b / 2.0f), iArr[1] + (this.f38690c / 2.0f), rawX, rawY);
                setDrawingCacheEnabled(true);
                Bitmap drawingCache = getDrawingCache();
                if (NullChecker.m81303a(drawingCache)) {
                    this.f38688a.setCacheBitmap(drawingCache);
                    viewGroup.addView(this.f38688a);
                    setVisibility(4);
                }
            }
        } else if (action == 1) {
            if (NullChecker.m81303a(parent)) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
            if (rootView instanceof ViewGroup) {
                ((ViewGroup) rootView).setMotionEventSplittingEnabled(true);
            }
            if (NullChecker.m81303a(this.f38688a)) {
                this.f38688a.m59654g();
            }
        } else if (action == 2) {
            if (NullChecker.m81303a(parent)) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (rootView instanceof ViewGroup) {
                ((ViewGroup) rootView).setMotionEventSplittingEnabled(false);
            }
            if (NullChecker.m81303a(this.f38688a)) {
                this.f38688a.m59655h(rawX, rawY);
            }
        } else if (action == 3) {
            if (NullChecker.m81303a(parent)) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
            if (rootView instanceof ViewGroup) {
                ((ViewGroup) rootView).setMotionEventSplittingEnabled(true);
            }
            if (NullChecker.m81303a(this.f38688a)) {
                this.f38688a.m59651d();
            }
        }
        return true;
    }

    public void setDragViewColor(int i) {
        this.f38692e = i;
    }

    public void setDraggable(boolean z) {
        this.f38691d = z;
    }

    public void setOnDragListener(InterfaceC9179b interfaceC9179b) {
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
        public Path f38693a;

        /* JADX INFO: renamed from: b */
        public Paint f38694b;

        /* JADX INFO: renamed from: c */
        public Bitmap f38695c;

        /* JADX INFO: renamed from: d */
        public PointF f38696d;

        /* JADX INFO: renamed from: e */
        public PointF f38697e;

        /* JADX INFO: renamed from: f */
        public PointF f38698f;

        /* JADX INFO: renamed from: g */
        public float f38699g;

        /* JADX INFO: renamed from: h */
        public float f38700h;

        /* JADX INFO: renamed from: i */
        public float f38701i;

        /* JADX INFO: renamed from: j */
        public float f38702j;

        /* JADX INFO: renamed from: k */
        public int f38703k;

        /* JADX INFO: renamed from: l */
        public int f38704l;

        /* JADX INFO: renamed from: m */
        public int f38705m;

        /* JADX INFO: renamed from: n */
        public int f38706n;

        /* JADX INFO: renamed from: o */
        public int[] f38707o;

        /* JADX INFO: renamed from: p */
        public Bitmap[] f38708p;

        /* JADX INFO: renamed from: q */
        public int f38709q;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.draggablepoint.DraggablePointView$DragView$a */
        public class C9173a implements ValueAnimator.AnimatorUpdateListener {
            public C9173a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                DragView.this.f38709q = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                DragView.this.invalidate();
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.draggablepoint.DraggablePointView$DragView$b */
        public class C9174b extends AnimatorListenerAdapter {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ boolean f38712a;

            public C9174b(boolean z) {
                this.f38712a = z;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                DraggablePointView.this.setDrawingCacheEnabled(false);
                DraggablePointView.m59642h(DraggablePointView.this);
                if (NullChecker.m81303a(null) && this.f38712a) {
                    DraggablePointView.m59642h(DraggablePointView.this);
                    throw null;
                }
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.draggablepoint.DraggablePointView$DragView$c */
        public class C9175c implements TimeInterpolator {
            public C9175c() {
            }

            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                return (float) ((Math.pow(2.0d, (-4.0f) * f) * Math.sin((((double) (f - 0.14285725f)) * 6.283185307179586d) / 0.5714290142059326d)) + 1.0d);
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.draggablepoint.DraggablePointView$DragView$d */
        public class C9176d implements ValueAnimator.AnimatorUpdateListener {
            public C9176d() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                PointF pointF = (PointF) valueAnimator.getAnimatedValue();
                DragView.this.f38696d.set(pointF.x, pointF.y);
                DragView.this.invalidate();
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.draggablepoint.DraggablePointView$DragView$e */
        public class C9177e extends AnimatorListenerAdapter {
            public C9177e() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                DragView.this.m59651d();
                DraggablePointView.m59642h(DraggablePointView.this);
                if (NullChecker.m81303a(null)) {
                    DraggablePointView.m59642h(DraggablePointView.this);
                    throw null;
                }
            }
        }

        public DragView(@Nullable Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f38700h = 300.0f;
            this.f38705m = 30;
            this.f38706n = 40;
            this.f38707o = new int[]{x2c0.f190642v7, x2c0.f190674w7, x2c0.f190706x7, x2c0.f190738y7, x2c0.f190770z7};
            m59652e();
        }

        /* JADX INFO: renamed from: d */
        public final void m59651d() {
            ((ViewGroup) getParent()).removeView(this);
            DraggablePointView.this.setVisibility(0);
            DraggablePointView.this.setDrawingCacheEnabled(false);
        }

        /* JADX INFO: renamed from: e */
        public final void m59652e() {
            this.f38693a = new Path();
            Paint paint = new Paint();
            this.f38694b = paint;
            paint.setAntiAlias(true);
            this.f38694b.setDither(true);
            this.f38694b.setColor(DraggablePointView.this.f38692e);
            this.f38696d = new PointF();
            this.f38697e = new PointF();
            this.f38703k = 0;
            this.f38708p = new Bitmap[this.f38707o.length];
            for (int i = 0; i < this.f38707o.length; i++) {
                this.f38708p[i] = BitmapFactory.decodeResource(getResources(), this.f38707o[i]);
            }
        }

        /* JADX INFO: renamed from: f */
        public final boolean m59653f() {
            return this.f38699g <= this.f38700h;
        }

        /* JADX INFO: renamed from: g */
        public void m59654g() {
            if (this.f38703k == 1 && m59653f()) {
                m59659l();
                return;
            }
            if (this.f38703k == 2) {
                if (m59653f()) {
                    m59659l();
                } else {
                    this.f38703k = 3;
                    m59657j();
                }
            }
        }

        /* JADX INFO: renamed from: h */
        public void m59655h(float f, float f2) {
            this.f38696d.set(f, f2);
            this.f38699g = DraggablePointView.this.m59647o(this.f38696d, this.f38697e);
            if (this.f38703k == 1) {
                if (m59653f()) {
                    this.f38704l = Math.max((int) (this.f38705m - (this.f38699g / 10.0f)), 10);
                } else {
                    this.f38703k = 2;
                    DraggablePointView.m59642h(DraggablePointView.this);
                    if (NullChecker.m81303a(null)) {
                        DraggablePointView.m59642h(DraggablePointView.this);
                        throw null;
                    }
                }
            }
            invalidate();
        }

        /* JADX INFO: renamed from: i */
        public void m59656i(float f, float f2, float f3, float f4) {
            this.f38697e.set(f, f2);
            this.f38696d.set(f3, f4);
            float fM59647o = DraggablePointView.this.m59647o(this.f38696d, this.f38697e);
            this.f38699g = fM59647o;
            if (fM59647o > this.f38700h) {
                this.f38703k = 0;
            } else {
                this.f38704l = Math.max((int) (this.f38705m - (fM59647o / 10.0f)), 10);
                this.f38703k = 1;
            }
        }

        /* JADX INFO: renamed from: j */
        public final void m59657j() {
            m59658k(true);
        }

        /* JADX INFO: renamed from: k */
        public final void m59658k(boolean z) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, this.f38707o.length);
            valueAnimatorOfInt.setDuration(300L);
            valueAnimatorOfInt.addUpdateListener(new C9173a());
            valueAnimatorOfInt.addListener(new C9174b(z));
            valueAnimatorOfInt.start();
        }

        /* JADX INFO: renamed from: l */
        public final void m59659l() {
            int i = this.f38703k;
            if (i == 1) {
                C9178a c9178a = new C9178a();
                PointF pointF = this.f38696d;
                PointF pointF2 = new PointF(pointF.x, pointF.y);
                PointF pointF3 = this.f38697e;
                ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(c9178a, pointF2, new PointF(pointF3.x, pointF3.y));
                valueAnimatorOfObject.setDuration(500L);
                valueAnimatorOfObject.setInterpolator(new C9175c());
                valueAnimatorOfObject.addUpdateListener(new C9176d());
                valueAnimatorOfObject.addListener(new C9177e());
                valueAnimatorOfObject.start();
                return;
            }
            if (i == 2) {
                PointF pointF4 = this.f38696d;
                PointF pointF5 = this.f38697e;
                pointF4.set(pointF5.x, pointF5.y);
                invalidate();
                m59651d();
                DraggablePointView.m59642h(DraggablePointView.this);
                if (NullChecker.m81303a(null)) {
                    DraggablePointView.m59642h(DraggablePointView.this);
                    throw null;
                }
            }
        }

        @Override // android.view.View
        public void onDraw(Canvas canvas) {
            int i;
            if (m59653f() && this.f38703k == 1) {
                this.f38694b.setColor(DraggablePointView.this.f38692e);
                PointF pointF = this.f38697e;
                canvas.drawCircle(pointF.x, pointF.y, this.f38704l, this.f38694b);
                Float fM59645k = DraggablePointView.this.m59645k(this.f38696d, this.f38697e);
                PointF[] pointFArrM59644j = DraggablePointView.this.m59644j(this.f38697e, this.f38704l, fM59645k);
                int iMin = ((int) Math.min(this.f38701i, this.f38702j)) / 2;
                this.f38706n = iMin;
                PointF[] pointFArrM59644j2 = DraggablePointView.this.m59644j(this.f38696d, iMin, fM59645k);
                this.f38694b.setColor(DraggablePointView.this.f38692e);
                this.f38698f = DraggablePointView.this.m59646l(this.f38696d, this.f38697e);
                this.f38693a.reset();
                Path path = this.f38693a;
                PointF pointF2 = pointFArrM59644j[0];
                path.moveTo(pointF2.x, pointF2.y);
                Path path2 = this.f38693a;
                PointF pointF3 = this.f38698f;
                float f = pointF3.x;
                float f2 = pointF3.y;
                PointF pointF4 = pointFArrM59644j2[0];
                path2.quadTo(f, f2, pointF4.x, pointF4.y);
                Path path3 = this.f38693a;
                PointF pointF5 = pointFArrM59644j2[1];
                path3.lineTo(pointF5.x, pointF5.y);
                Path path4 = this.f38693a;
                PointF pointF6 = this.f38698f;
                float f3 = pointF6.x;
                float f4 = pointF6.y;
                PointF pointF7 = pointFArrM59644j[1];
                path4.quadTo(f3, f4, pointF7.x, pointF7.y);
                Path path5 = this.f38693a;
                PointF pointF8 = pointFArrM59644j[0];
                path5.lineTo(pointF8.x, pointF8.y);
                canvas.drawPath(this.f38693a, this.f38694b);
            }
            if (NullChecker.m81303a(this.f38695c) && !this.f38695c.isRecycled() && this.f38703k != 3) {
                Bitmap bitmap = this.f38695c;
                PointF pointF9 = this.f38696d;
                canvas.drawBitmap(bitmap, pointF9.x - (this.f38701i / 2.0f), pointF9.y - (this.f38702j / 2.0f), this.f38694b);
            }
            if (this.f38703k != 3 || (i = this.f38709q) >= this.f38707o.length) {
                return;
            }
            Bitmap bitmap2 = this.f38708p[i];
            PointF pointF10 = this.f38696d;
            canvas.drawBitmap(bitmap2, pointF10.x - (this.f38701i / 2.0f), pointF10.y - (this.f38702j / 2.0f), this.f38694b);
        }

        public void setCacheBitmap(Bitmap bitmap) {
            this.f38695c = bitmap;
            this.f38701i = bitmap.getWidth();
            this.f38702j = bitmap.getHeight();
        }

        public void setState(int i) {
            this.f38703k = i;
        }

        public DragView(DraggablePointView draggablePointView, @Nullable Context context, AttributeSet attributeSet) {
            this(context, attributeSet, 0);
        }

        public DragView(DraggablePointView draggablePointView, Context context) {
            this(draggablePointView, context, null);
        }
    }
}
