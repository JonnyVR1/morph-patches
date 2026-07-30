package com.p051p1.mobile.putong.core.newui.immersionvideo.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import p153l.c9c0;
import p153l.qa00;

/* JADX INFO: loaded from: classes11.dex */
public class StepProgressView extends View {

    /* JADX INFO: renamed from: a */
    public boolean f24926a;

    /* JADX INFO: renamed from: b */
    public boolean f24927b;

    /* JADX INFO: renamed from: c */
    public float f24928c;

    /* JADX INFO: renamed from: d */
    public int f24929d;

    /* JADX INFO: renamed from: e */
    public int f24930e;

    /* JADX INFO: renamed from: f */
    public int f24931f;

    /* JADX INFO: renamed from: g */
    public int f24932g;

    /* JADX INFO: renamed from: h */
    public long f24933h;

    /* JADX INFO: renamed from: i */
    public float f24934i;

    /* JADX INFO: renamed from: j */
    public int f24935j;

    /* JADX INFO: renamed from: k */
    public final Paint f24936k;

    /* JADX INFO: renamed from: l */
    public final Paint f24937l;

    /* JADX INFO: renamed from: m */
    public Choreographer f24938m;

    /* JADX INFO: renamed from: n */
    public Choreographer.FrameCallback f24939n;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.immersionvideo.view.StepProgressView$a */
    public class ChoreographerFrameCallbackC8226a implements Choreographer.FrameCallback {
        public ChoreographerFrameCallbackC8226a() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            if (StepProgressView.this.f24931f < StepProgressView.this.f24930e) {
                StepProgressView.this.invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.immersionvideo.view.StepProgressView$b */
    public class ViewTreeObserverOnGlobalLayoutListenerC8227b implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC8227b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            StepProgressView.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            StepProgressView.this.f24936k.setStrokeWidth(StepProgressView.this.f24935j);
            StepProgressView.this.f24937l.setStrokeWidth(StepProgressView.this.f24935j);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.immersionvideo.view.StepProgressView$c */
    public interface InterfaceC8228c {
    }

    public StepProgressView(Context context) {
        super(context);
        this.f24926a = false;
        this.f24927b = false;
        this.f24928c = qa00.f156318e;
        this.f24932g = 2500;
        this.f24935j = qa00.f156316c;
        this.f24936k = new Paint();
        this.f24937l = new Paint();
        this.f24939n = new ChoreographerFrameCallbackC8226a();
    }

    /* JADX INFO: renamed from: f */
    public final void m40355f() {
        this.f24936k.setAntiAlias(true);
        this.f24936k.setDither(true);
        Paint paint = this.f24936k;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = this.f24936k;
        Paint.Cap cap = Paint.Cap.ROUND;
        paint2.setStrokeCap(cap);
        this.f24936k.setColor(getResources().getColor(c9c0.f80407c2));
        this.f24937l.setAntiAlias(true);
        this.f24937l.setDither(true);
        this.f24937l.setStyle(style);
        this.f24937l.setStrokeCap(cap);
        this.f24937l.setColor(getResources().getColor(c9c0.f80339H));
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC8227b());
        this.f24938m = Choreographer.getInstance();
    }

    public int getTargetStep() {
        return this.f24930e;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (getWidth() <= 0) {
            return;
        }
        float width = getWidth();
        int i = this.f24929d;
        float f = (width - ((i - 1) * this.f24928c)) / i;
        int i2 = this.f24935j / 2;
        for (int i3 = 0; i3 < this.f24929d; i3++) {
            int i4 = this.f24930e;
            int i5 = this.f24931f;
            if (i4 <= i5 || i5 != i3) {
                float f2 = this.f24928c;
                if (i3 < i4) {
                    float f3 = i3;
                    float f4 = (f3 * f) + (f3 * f2);
                    float f5 = i2;
                    canvas.drawLine(f4 + f5, f5, (f4 + f) - f5, f5, this.f24936k);
                } else {
                    float f6 = i3;
                    float f7 = (f6 * f) + (f6 * f2);
                    float f8 = i2;
                    canvas.drawLine(f7 + f8, f8, (f7 + f) - f8, f8, this.f24937l);
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (!this.f24926a) {
                    this.f24934i += ((jCurrentTimeMillis - this.f24933h) * 1.0f) / this.f24932g;
                }
                this.f24933h = jCurrentTimeMillis;
                float f9 = i3;
                float f10 = (f9 * f) + (f9 * this.f24928c);
                if (this.f24934i >= 1.0f) {
                    float f11 = i2;
                    canvas.drawLine(f10 + f11, f11, (f10 + f) - f11, f11, this.f24936k);
                    this.f24931f = this.f24930e;
                    if (NullChecker.m82486a(null)) {
                        throw null;
                    }
                } else {
                    float f12 = i2;
                    float f13 = f10 + f12;
                    canvas.drawLine(f13, f12, (f10 + f) - f12, f12, this.f24937l);
                    canvas.drawLine(f13, f12, f13 + ((f - this.f24935j) * this.f24934i), f12, this.f24936k);
                    this.f24938m.postFrameCallback(this.f24939n);
                }
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m40355f();
    }

    public void setStepAnimationDuration(int i) {
        this.f24932g = i;
    }

    public void setStepCount(int i) {
        this.f24929d = i;
    }

    public void setStepEndAnimationListener(InterfaceC8228c interfaceC8228c) {
    }

    public void setTargetStep(int i) {
        if (i <= this.f24930e) {
            return;
        }
        this.f24930e = i;
        this.f24933h = System.currentTimeMillis();
        this.f24934i = 0.0f;
        this.f24938m.postFrameCallback(this.f24939n);
    }

    public StepProgressView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24926a = false;
        this.f24927b = false;
        this.f24928c = qa00.f156318e;
        this.f24932g = 2500;
        this.f24935j = qa00.f156316c;
        this.f24936k = new Paint();
        this.f24937l = new Paint();
        this.f24939n = new ChoreographerFrameCallbackC8226a();
    }

    public StepProgressView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24926a = false;
        this.f24927b = false;
        this.f24928c = qa00.f156318e;
        this.f24932g = 2500;
        this.f24935j = qa00.f156316c;
        this.f24936k = new Paint();
        this.f24937l = new Paint();
        this.f24939n = new ChoreographerFrameCallbackC8226a();
    }
}
