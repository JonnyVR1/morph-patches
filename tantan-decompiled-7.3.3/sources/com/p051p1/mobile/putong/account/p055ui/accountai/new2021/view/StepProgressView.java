package com.p051p1.mobile.putong.account.p055ui.accountai.new2021.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.View;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import p153l.z8c0;

/* JADX INFO: loaded from: classes9.dex */
public class StepProgressView extends View {

    /* JADX INFO: renamed from: a */
    public float f17134a;

    /* JADX INFO: renamed from: b */
    public int f17135b;

    /* JADX INFO: renamed from: c */
    public int f17136c;

    /* JADX INFO: renamed from: d */
    public int f17137d;

    /* JADX INFO: renamed from: e */
    public int f17138e;

    /* JADX INFO: renamed from: f */
    public int f17139f;

    /* JADX INFO: renamed from: g */
    public int f17140g;

    /* JADX INFO: renamed from: h */
    public long f17141h;

    /* JADX INFO: renamed from: i */
    public final Paint f17142i;

    /* JADX INFO: renamed from: j */
    public final Paint f17143j;

    /* JADX INFO: renamed from: k */
    public Choreographer f17144k;

    /* JADX INFO: renamed from: l */
    public Choreographer.FrameCallback f17145l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.accountai.new2021.view.StepProgressView$a */
    public class ChoreographerFrameCallbackC4776a implements Choreographer.FrameCallback {
        public ChoreographerFrameCallbackC4776a() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            if (StepProgressView.this.f17137d < StepProgressView.this.f17136c) {
                StepProgressView.this.invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.accountai.new2021.view.StepProgressView$b */
    public interface InterfaceC4777b {
    }

    public StepProgressView(Context context) {
        super(context);
        this.f17138e = 419430400;
        this.f17139f = -48311;
        this.f17140g = 1000;
        this.f17142i = new Paint();
        this.f17143j = new Paint();
        this.f17145l = new ChoreographerFrameCallbackC4776a();
    }

    /* JADX INFO: renamed from: c */
    public final void m29486c() {
        this.f17138e = getResources().getColor(z8c0.f203362w);
        this.f17139f = getResources().getColor(z8c0.f203359t);
        this.f17142i.setAntiAlias(true);
        this.f17142i.setDither(true);
        Paint paint = this.f17142i;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = this.f17142i;
        Paint.Cap cap = Paint.Cap.ROUND;
        paint2.setStrokeCap(cap);
        this.f17143j.setAntiAlias(true);
        this.f17143j.setDither(true);
        this.f17143j.setStyle(style);
        this.f17143j.setStrokeCap(cap);
        this.f17144k = Choreographer.getInstance();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (getHeight() <= 0 || getWidth() <= 0) {
            return;
        }
        float width = getWidth();
        int i = this.f17135b;
        float f = (width - ((i - 1) * this.f17134a)) / i;
        int height = getHeight() / 2;
        this.f17142i.setStrokeWidth(getHeight());
        this.f17142i.setColor(this.f17139f);
        this.f17143j.setStrokeWidth(getHeight());
        this.f17143j.setColor(this.f17138e);
        for (int i2 = 0; i2 < this.f17135b; i2++) {
            int i3 = this.f17136c;
            int i4 = this.f17137d;
            if (i3 <= i4 || i4 != i2) {
                float f2 = this.f17134a;
                if (i2 < i3) {
                    float f3 = i2;
                    float f4 = (f3 * f) + (f3 * f2);
                    float f5 = height;
                    canvas.drawLine(f4 + f5, f5, (f4 + f) - f5, f5, this.f17142i);
                } else {
                    float f6 = i2;
                    float f7 = (f6 * f) + (f6 * f2);
                    float f8 = height;
                    canvas.drawLine(f7 + f8, f8, (f7 + f) - f8, f8, this.f17143j);
                }
            } else {
                float fCurrentTimeMillis = ((System.currentTimeMillis() - this.f17141h) * 1.0f) / this.f17140g;
                float f9 = i2;
                float f10 = (f9 * f) + (f9 * this.f17134a);
                if (fCurrentTimeMillis >= 1.0f) {
                    float f11 = height;
                    canvas.drawLine(f10 + f11, f11, (f10 + f) - f11, f11, this.f17142i);
                    this.f17137d = this.f17136c;
                    if (NullChecker.m82486a(null)) {
                        throw null;
                    }
                } else {
                    float f12 = height;
                    float f13 = f10 + f12;
                    canvas.drawLine(f13, f12, (f10 + f) - f12, f12, this.f17143j);
                    canvas.drawLine(f13, f12, f13 + ((f - getHeight()) * fCurrentTimeMillis), f12, this.f17142i);
                    this.f17144k.postFrameCallback(this.f17145l);
                }
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m29486c();
    }

    public void setDefaultStep(int i) {
        if (i <= this.f17136c) {
            return;
        }
        this.f17136c = i;
        this.f17137d = i;
    }

    public void setSpace(int i) {
        this.f17134a = i;
    }

    public void setStepAnimationDuration(int i) {
        this.f17140g = i;
    }

    public void setStepCount(int i) {
        this.f17135b = i;
    }

    public void setStepEndAnimationListener(InterfaceC4777b interfaceC4777b) {
    }

    public void setTargetStep(int i) {
        if (i <= this.f17136c) {
            return;
        }
        this.f17136c = i;
        this.f17141h = System.currentTimeMillis();
        this.f17144k.postFrameCallback(this.f17145l);
    }

    public StepProgressView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17138e = 419430400;
        this.f17139f = -48311;
        this.f17140g = 1000;
        this.f17142i = new Paint();
        this.f17143j = new Paint();
        this.f17145l = new ChoreographerFrameCallbackC4776a();
    }

    public StepProgressView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f17138e = 419430400;
        this.f17139f = -48311;
        this.f17140g = 1000;
        this.f17142i = new Paint();
        this.f17143j = new Paint();
        this.f17145l = new ChoreographerFrameCallbackC4776a();
    }
}
