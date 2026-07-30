package com.p000p1.mobile.putong.account.p002ui.accountai.new2021.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.View;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountMakeUpMenuView;
import com.tantanapp.common.utils.NullChecker;
import l.t0c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class StepProgressView extends View {

    /* JADX INFO: renamed from: a */
    public float f404a;

    /* JADX INFO: renamed from: b */
    public int f405b;

    /* JADX INFO: renamed from: c */
    public int f406c;

    /* JADX INFO: renamed from: d */
    public int f407d;

    /* JADX INFO: renamed from: e */
    public int f408e;

    /* JADX INFO: renamed from: f */
    public int f409f;

    /* JADX INFO: renamed from: g */
    public int f410g;

    /* JADX INFO: renamed from: h */
    public long f411h;

    /* JADX INFO: renamed from: i */
    public final Paint f412i;

    /* JADX INFO: renamed from: j */
    public final Paint f413j;

    /* JADX INFO: renamed from: k */
    public Choreographer f414k;

    /* JADX INFO: renamed from: l */
    public Choreographer.FrameCallback f415l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.accountai.new2021.view.StepProgressView$a */
    public class ChoreographerFrameCallbackC0051a implements Choreographer.FrameCallback {
        public ChoreographerFrameCallbackC0051a() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            if (StepProgressView.this.f407d < StepProgressView.this.f406c) {
                StepProgressView.this.invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.accountai.new2021.view.StepProgressView$b */
    public interface InterfaceC0052b {
    }

    public StepProgressView(Context context) {
        super(context);
        this.f408e = 419430400;
        this.f409f = -48311;
        this.f410g = AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO;
        this.f412i = new Paint();
        this.f413j = new Paint();
        this.f415l = new ChoreographerFrameCallbackC0051a();
    }

    /* JADX INFO: renamed from: c */
    public final void m383c() {
        this.f408e = getResources().getColor(t0c0.w);
        this.f409f = getResources().getColor(t0c0.t);
        this.f412i.setAntiAlias(true);
        this.f412i.setDither(true);
        Paint paint = this.f412i;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = this.f412i;
        Paint.Cap cap = Paint.Cap.ROUND;
        paint2.setStrokeCap(cap);
        this.f413j.setAntiAlias(true);
        this.f413j.setDither(true);
        this.f413j.setStyle(style);
        this.f413j.setStrokeCap(cap);
        this.f414k = Choreographer.getInstance();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (getHeight() <= 0 || getWidth() <= 0) {
            return;
        }
        float width = getWidth();
        int i = this.f405b;
        float f = (width - ((i - 1) * this.f404a)) / i;
        int height = getHeight() / 2;
        this.f412i.setStrokeWidth(getHeight());
        this.f412i.setColor(this.f409f);
        this.f413j.setStrokeWidth(getHeight());
        this.f413j.setColor(this.f408e);
        for (int i2 = 0; i2 < this.f405b; i2++) {
            int i3 = this.f406c;
            int i4 = this.f407d;
            if (i3 <= i4 || i4 != i2) {
                float f2 = this.f404a;
                if (i2 < i3) {
                    float f3 = i2;
                    float f4 = (f3 * f) + (f3 * f2);
                    float f5 = height;
                    canvas.drawLine(f4 + f5, f5, (f4 + f) - f5, f5, this.f412i);
                } else {
                    float f6 = i2;
                    float f7 = (f6 * f) + (f6 * f2);
                    float f8 = height;
                    canvas.drawLine(f7 + f8, f8, (f7 + f) - f8, f8, this.f413j);
                }
            } else {
                float fCurrentTimeMillis = ((System.currentTimeMillis() - this.f411h) * 1.0f) / this.f410g;
                float f9 = i2;
                float f10 = (f9 * f) + (f9 * this.f404a);
                if (fCurrentTimeMillis >= 1.0f) {
                    float f11 = height;
                    canvas.drawLine(f10 + f11, f11, (f10 + f) - f11, f11, this.f412i);
                    this.f407d = this.f406c;
                    if (NullChecker.a((Object) null)) {
                        throw null;
                    }
                } else {
                    float f12 = height;
                    float f13 = f10 + f12;
                    canvas.drawLine(f13, f12, (f10 + f) - f12, f12, this.f413j);
                    canvas.drawLine(f13, f12, f13 + ((f - getHeight()) * fCurrentTimeMillis), f12, this.f412i);
                    this.f414k.postFrameCallback(this.f415l);
                }
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m383c();
    }

    public void setDefaultStep(int i) {
        if (i <= this.f406c) {
            return;
        }
        this.f406c = i;
        this.f407d = i;
    }

    public void setSpace(int i) {
        this.f404a = i;
    }

    public void setStepAnimationDuration(int i) {
        this.f410g = i;
    }

    public void setStepCount(int i) {
        this.f405b = i;
    }

    public void setStepEndAnimationListener(InterfaceC0052b interfaceC0052b) {
    }

    public void setTargetStep(int i) {
        if (i <= this.f406c) {
            return;
        }
        this.f406c = i;
        this.f411h = System.currentTimeMillis();
        this.f414k.postFrameCallback(this.f415l);
    }

    public StepProgressView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f408e = 419430400;
        this.f409f = -48311;
        this.f410g = AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO;
        this.f412i = new Paint();
        this.f413j = new Paint();
        this.f415l = new ChoreographerFrameCallbackC0051a();
    }

    public StepProgressView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f408e = 419430400;
        this.f409f = -48311;
        this.f410g = AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO;
        this.f412i = new Paint();
        this.f413j = new Paint();
        this.f415l = new ChoreographerFrameCallbackC0051a();
    }
}
