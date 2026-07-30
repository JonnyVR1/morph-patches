package com.p000p1.mobile.putong.core.newui.immersionvideo.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import l.t100;
import l.w0c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class StepProgressView extends View {

    /* JADX INFO: renamed from: a */
    public boolean f2962a;

    /* JADX INFO: renamed from: b */
    public boolean f2963b;

    /* JADX INFO: renamed from: c */
    public float f2964c;

    /* JADX INFO: renamed from: d */
    public int f2965d;

    /* JADX INFO: renamed from: e */
    public int f2966e;

    /* JADX INFO: renamed from: f */
    public int f2967f;

    /* JADX INFO: renamed from: g */
    public int f2968g;

    /* JADX INFO: renamed from: h */
    public long f2969h;

    /* JADX INFO: renamed from: i */
    public float f2970i;

    /* JADX INFO: renamed from: j */
    public int f2971j;

    /* JADX INFO: renamed from: k */
    public final Paint f2972k;

    /* JADX INFO: renamed from: l */
    public final Paint f2973l;

    /* JADX INFO: renamed from: m */
    public Choreographer f2974m;

    /* JADX INFO: renamed from: n */
    public Choreographer.FrameCallback f2975n;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.immersionvideo.view.StepProgressView$a */
    public class ChoreographerFrameCallbackC0239a implements Choreographer.FrameCallback {
        public ChoreographerFrameCallbackC0239a() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            if (StepProgressView.this.f2967f < StepProgressView.this.f2966e) {
                StepProgressView.this.invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.immersionvideo.view.StepProgressView$b */
    public class ViewTreeObserverOnGlobalLayoutListenerC0240b implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC0240b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            StepProgressView.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            StepProgressView.this.f2972k.setStrokeWidth(StepProgressView.this.f2971j);
            StepProgressView.this.f2973l.setStrokeWidth(StepProgressView.this.f2971j);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.immersionvideo.view.StepProgressView$c */
    public interface InterfaceC0241c {
    }

    public StepProgressView(Context context) {
        super(context);
        this.f2962a = false;
        this.f2963b = false;
        this.f2964c = t100.e;
        this.f2968g = 2500;
        this.f2971j = t100.c;
        this.f2972k = new Paint();
        this.f2973l = new Paint();
        this.f2975n = new ChoreographerFrameCallbackC0239a();
    }

    /* JADX INFO: renamed from: f */
    public final void m3384f() {
        this.f2972k.setAntiAlias(true);
        this.f2972k.setDither(true);
        Paint paint = this.f2972k;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = this.f2972k;
        Paint.Cap cap = Paint.Cap.ROUND;
        paint2.setStrokeCap(cap);
        this.f2972k.setColor(getResources().getColor(w0c0.b2));
        this.f2973l.setAntiAlias(true);
        this.f2973l.setDither(true);
        this.f2973l.setStyle(style);
        this.f2973l.setStrokeCap(cap);
        this.f2973l.setColor(getResources().getColor(w0c0.H));
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0240b());
        this.f2974m = Choreographer.getInstance();
    }

    public int getTargetStep() {
        return this.f2966e;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (getWidth() <= 0) {
            return;
        }
        float width = getWidth();
        int i = this.f2965d;
        float f = (width - ((i - 1) * this.f2964c)) / i;
        int i2 = this.f2971j / 2;
        for (int i3 = 0; i3 < this.f2965d; i3++) {
            int i4 = this.f2966e;
            int i5 = this.f2967f;
            if (i4 <= i5 || i5 != i3) {
                float f2 = this.f2964c;
                if (i3 < i4) {
                    float f3 = i3;
                    float f4 = (f3 * f) + (f3 * f2);
                    float f5 = i2;
                    canvas.drawLine(f4 + f5, f5, (f4 + f) - f5, f5, this.f2972k);
                } else {
                    float f6 = i3;
                    float f7 = (f6 * f) + (f6 * f2);
                    float f8 = i2;
                    canvas.drawLine(f7 + f8, f8, (f7 + f) - f8, f8, this.f2973l);
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (!this.f2962a) {
                    this.f2970i += ((jCurrentTimeMillis - this.f2969h) * 1.0f) / this.f2968g;
                }
                this.f2969h = jCurrentTimeMillis;
                float f9 = i3;
                float f10 = (f9 * f) + (f9 * this.f2964c);
                if (this.f2970i >= 1.0f) {
                    float f11 = i2;
                    canvas.drawLine(f10 + f11, f11, (f10 + f) - f11, f11, this.f2972k);
                    this.f2967f = this.f2966e;
                    if (NullChecker.a((Object) null)) {
                        throw null;
                    }
                } else {
                    float f12 = i2;
                    float f13 = f10 + f12;
                    canvas.drawLine(f13, f12, (f10 + f) - f12, f12, this.f2973l);
                    canvas.drawLine(f13, f12, f13 + ((f - this.f2971j) * this.f2970i), f12, this.f2972k);
                    this.f2974m.postFrameCallback(this.f2975n);
                }
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m3384f();
    }

    public void setStepAnimationDuration(int i) {
        this.f2968g = i;
    }

    public void setStepCount(int i) {
        this.f2965d = i;
    }

    public void setStepEndAnimationListener(InterfaceC0241c interfaceC0241c) {
    }

    public void setTargetStep(int i) {
        if (i <= this.f2966e) {
            return;
        }
        this.f2966e = i;
        this.f2969h = System.currentTimeMillis();
        this.f2970i = 0.0f;
        this.f2974m.postFrameCallback(this.f2975n);
    }

    public StepProgressView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2962a = false;
        this.f2963b = false;
        this.f2964c = t100.e;
        this.f2968g = 2500;
        this.f2971j = t100.c;
        this.f2972k = new Paint();
        this.f2973l = new Paint();
        this.f2975n = new ChoreographerFrameCallbackC0239a();
    }

    public StepProgressView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2962a = false;
        this.f2963b = false;
        this.f2964c = t100.e;
        this.f2968g = 2500;
        this.f2971j = t100.c;
        this.f2972k = new Paint();
        this.f2973l = new Paint();
        this.f2975n = new ChoreographerFrameCallbackC0239a();
    }
}
