package com.p046p1.mobile.putong.account.p050ui.accountai.new2021.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.View;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import p149l.t0c0;

/* JADX INFO: loaded from: classes9.dex */
public class StepProgressView extends View {

    /* JADX INFO: renamed from: a */
    public float f16415a;

    /* JADX INFO: renamed from: b */
    public int f16416b;

    /* JADX INFO: renamed from: c */
    public int f16417c;

    /* JADX INFO: renamed from: d */
    public int f16418d;

    /* JADX INFO: renamed from: e */
    public int f16419e;

    /* JADX INFO: renamed from: f */
    public int f16420f;

    /* JADX INFO: renamed from: g */
    public int f16421g;

    /* JADX INFO: renamed from: h */
    public long f16422h;

    /* JADX INFO: renamed from: i */
    public final Paint f16423i;

    /* JADX INFO: renamed from: j */
    public final Paint f16424j;

    /* JADX INFO: renamed from: k */
    public Choreographer f16425k;

    /* JADX INFO: renamed from: l */
    public Choreographer.FrameCallback f16426l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.accountai.new2021.view.StepProgressView$a */
    public class ChoreographerFrameCallbackC4625a implements Choreographer.FrameCallback {
        public ChoreographerFrameCallbackC4625a() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            if (StepProgressView.this.f16418d < StepProgressView.this.f16417c) {
                StepProgressView.this.invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.accountai.new2021.view.StepProgressView$b */
    public interface InterfaceC4626b {
    }

    public StepProgressView(Context context) {
        super(context);
        this.f16419e = 419430400;
        this.f16420f = -48311;
        this.f16421g = 1000;
        this.f16423i = new Paint();
        this.f16424j = new Paint();
        this.f16426l = new ChoreographerFrameCallbackC4625a();
    }

    /* JADX INFO: renamed from: c */
    public final void m28487c() {
        this.f16419e = getResources().getColor(t0c0.f167171w);
        this.f16420f = getResources().getColor(t0c0.f167168t);
        this.f16423i.setAntiAlias(true);
        this.f16423i.setDither(true);
        Paint paint = this.f16423i;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = this.f16423i;
        Paint.Cap cap = Paint.Cap.ROUND;
        paint2.setStrokeCap(cap);
        this.f16424j.setAntiAlias(true);
        this.f16424j.setDither(true);
        this.f16424j.setStyle(style);
        this.f16424j.setStrokeCap(cap);
        this.f16425k = Choreographer.getInstance();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (getHeight() <= 0 || getWidth() <= 0) {
            return;
        }
        float width = getWidth();
        int i = this.f16416b;
        float f = (width - ((i - 1) * this.f16415a)) / i;
        int height = getHeight() / 2;
        this.f16423i.setStrokeWidth(getHeight());
        this.f16423i.setColor(this.f16420f);
        this.f16424j.setStrokeWidth(getHeight());
        this.f16424j.setColor(this.f16419e);
        for (int i2 = 0; i2 < this.f16416b; i2++) {
            int i3 = this.f16417c;
            int i4 = this.f16418d;
            if (i3 <= i4 || i4 != i2) {
                float f2 = this.f16415a;
                if (i2 < i3) {
                    float f3 = i2;
                    float f4 = (f3 * f) + (f3 * f2);
                    float f5 = height;
                    canvas.drawLine(f4 + f5, f5, (f4 + f) - f5, f5, this.f16423i);
                } else {
                    float f6 = i2;
                    float f7 = (f6 * f) + (f6 * f2);
                    float f8 = height;
                    canvas.drawLine(f7 + f8, f8, (f7 + f) - f8, f8, this.f16424j);
                }
            } else {
                float fCurrentTimeMillis = ((System.currentTimeMillis() - this.f16422h) * 1.0f) / this.f16421g;
                float f9 = i2;
                float f10 = (f9 * f) + (f9 * this.f16415a);
                if (fCurrentTimeMillis >= 1.0f) {
                    float f11 = height;
                    canvas.drawLine(f10 + f11, f11, (f10 + f) - f11, f11, this.f16423i);
                    this.f16418d = this.f16417c;
                    if (NullChecker.m81303a(null)) {
                        throw null;
                    }
                } else {
                    float f12 = height;
                    float f13 = f10 + f12;
                    canvas.drawLine(f13, f12, (f10 + f) - f12, f12, this.f16424j);
                    canvas.drawLine(f13, f12, f13 + ((f - getHeight()) * fCurrentTimeMillis), f12, this.f16423i);
                    this.f16425k.postFrameCallback(this.f16426l);
                }
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m28487c();
    }

    public void setDefaultStep(int i) {
        if (i <= this.f16417c) {
            return;
        }
        this.f16417c = i;
        this.f16418d = i;
    }

    public void setSpace(int i) {
        this.f16415a = i;
    }

    public void setStepAnimationDuration(int i) {
        this.f16421g = i;
    }

    public void setStepCount(int i) {
        this.f16416b = i;
    }

    public void setStepEndAnimationListener(InterfaceC4626b interfaceC4626b) {
    }

    public void setTargetStep(int i) {
        if (i <= this.f16417c) {
            return;
        }
        this.f16417c = i;
        this.f16422h = System.currentTimeMillis();
        this.f16425k.postFrameCallback(this.f16426l);
    }

    public StepProgressView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16419e = 419430400;
        this.f16420f = -48311;
        this.f16421g = 1000;
        this.f16423i = new Paint();
        this.f16424j = new Paint();
        this.f16426l = new ChoreographerFrameCallbackC4625a();
    }

    public StepProgressView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f16419e = 419430400;
        this.f16420f = -48311;
        this.f16421g = 1000;
        this.f16423i = new Paint();
        this.f16424j = new Paint();
        this.f16426l = new ChoreographerFrameCallbackC4625a();
    }
}
