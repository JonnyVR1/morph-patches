package com.p046p1.mobile.putong.core.newui.immersionvideo.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import p149l.t100;
import p149l.w0c0;

/* JADX INFO: loaded from: classes11.dex */
public class StepProgressView extends View {

    /* JADX INFO: renamed from: a */
    public boolean f24184a;

    /* JADX INFO: renamed from: b */
    public boolean f24185b;

    /* JADX INFO: renamed from: c */
    public float f24186c;

    /* JADX INFO: renamed from: d */
    public int f24187d;

    /* JADX INFO: renamed from: e */
    public int f24188e;

    /* JADX INFO: renamed from: f */
    public int f24189f;

    /* JADX INFO: renamed from: g */
    public int f24190g;

    /* JADX INFO: renamed from: h */
    public long f24191h;

    /* JADX INFO: renamed from: i */
    public float f24192i;

    /* JADX INFO: renamed from: j */
    public int f24193j;

    /* JADX INFO: renamed from: k */
    public final Paint f24194k;

    /* JADX INFO: renamed from: l */
    public final Paint f24195l;

    /* JADX INFO: renamed from: m */
    public Choreographer f24196m;

    /* JADX INFO: renamed from: n */
    public Choreographer.FrameCallback f24197n;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.immersionvideo.view.StepProgressView$a */
    public class ChoreographerFrameCallbackC8075a implements Choreographer.FrameCallback {
        public ChoreographerFrameCallbackC8075a() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            if (StepProgressView.this.f24189f < StepProgressView.this.f24188e) {
                StepProgressView.this.invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.immersionvideo.view.StepProgressView$b */
    public class ViewTreeObserverOnGlobalLayoutListenerC8076b implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC8076b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            StepProgressView.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            StepProgressView.this.f24194k.setStrokeWidth(StepProgressView.this.f24193j);
            StepProgressView.this.f24195l.setStrokeWidth(StepProgressView.this.f24193j);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.immersionvideo.view.StepProgressView$c */
    public interface InterfaceC8077c {
    }

    public StepProgressView(Context context) {
        super(context);
        this.f24184a = false;
        this.f24185b = false;
        this.f24186c = t100.f167256e;
        this.f24190g = 2500;
        this.f24193j = t100.f167254c;
        this.f24194k = new Paint();
        this.f24195l = new Paint();
        this.f24197n = new ChoreographerFrameCallbackC8075a();
    }

    /* JADX INFO: renamed from: f */
    public final void m39352f() {
        this.f24194k.setAntiAlias(true);
        this.f24194k.setDither(true);
        Paint paint = this.f24194k;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = this.f24194k;
        Paint.Cap cap = Paint.Cap.ROUND;
        paint2.setStrokeCap(cap);
        this.f24194k.setColor(getResources().getColor(w0c0.f183834b2));
        this.f24195l.setAntiAlias(true);
        this.f24195l.setDither(true);
        this.f24195l.setStyle(style);
        this.f24195l.setStrokeCap(cap);
        this.f24195l.setColor(getResources().getColor(w0c0.f183770H));
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC8076b());
        this.f24196m = Choreographer.getInstance();
    }

    public int getTargetStep() {
        return this.f24188e;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (getWidth() <= 0) {
            return;
        }
        float width = getWidth();
        int i = this.f24187d;
        float f = (width - ((i - 1) * this.f24186c)) / i;
        int i2 = this.f24193j / 2;
        for (int i3 = 0; i3 < this.f24187d; i3++) {
            int i4 = this.f24188e;
            int i5 = this.f24189f;
            if (i4 <= i5 || i5 != i3) {
                float f2 = this.f24186c;
                if (i3 < i4) {
                    float f3 = i3;
                    float f4 = (f3 * f) + (f3 * f2);
                    float f5 = i2;
                    canvas.drawLine(f4 + f5, f5, (f4 + f) - f5, f5, this.f24194k);
                } else {
                    float f6 = i3;
                    float f7 = (f6 * f) + (f6 * f2);
                    float f8 = i2;
                    canvas.drawLine(f7 + f8, f8, (f7 + f) - f8, f8, this.f24195l);
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (!this.f24184a) {
                    this.f24192i += ((jCurrentTimeMillis - this.f24191h) * 1.0f) / this.f24190g;
                }
                this.f24191h = jCurrentTimeMillis;
                float f9 = i3;
                float f10 = (f9 * f) + (f9 * this.f24186c);
                if (this.f24192i >= 1.0f) {
                    float f11 = i2;
                    canvas.drawLine(f10 + f11, f11, (f10 + f) - f11, f11, this.f24194k);
                    this.f24189f = this.f24188e;
                    if (NullChecker.m81303a(null)) {
                        throw null;
                    }
                } else {
                    float f12 = i2;
                    float f13 = f10 + f12;
                    canvas.drawLine(f13, f12, (f10 + f) - f12, f12, this.f24195l);
                    canvas.drawLine(f13, f12, f13 + ((f - this.f24193j) * this.f24192i), f12, this.f24194k);
                    this.f24196m.postFrameCallback(this.f24197n);
                }
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39352f();
    }

    public void setStepAnimationDuration(int i) {
        this.f24190g = i;
    }

    public void setStepCount(int i) {
        this.f24187d = i;
    }

    public void setStepEndAnimationListener(InterfaceC8077c interfaceC8077c) {
    }

    public void setTargetStep(int i) {
        if (i <= this.f24188e) {
            return;
        }
        this.f24188e = i;
        this.f24191h = System.currentTimeMillis();
        this.f24192i = 0.0f;
        this.f24196m.postFrameCallback(this.f24197n);
    }

    public StepProgressView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24184a = false;
        this.f24185b = false;
        this.f24186c = t100.f167256e;
        this.f24190g = 2500;
        this.f24193j = t100.f167254c;
        this.f24194k = new Paint();
        this.f24195l = new Paint();
        this.f24197n = new ChoreographerFrameCallbackC8075a();
    }

    public StepProgressView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24184a = false;
        this.f24185b = false;
        this.f24186c = t100.f167256e;
        this.f24190g = 2500;
        this.f24193j = t100.f167254c;
        this.f24194k = new Paint();
        this.f24195l = new Paint();
        this.f24197n = new ChoreographerFrameCallbackC8075a();
    }
}
