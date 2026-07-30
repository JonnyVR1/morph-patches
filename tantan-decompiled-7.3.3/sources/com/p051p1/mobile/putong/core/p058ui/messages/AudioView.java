package com.p051p1.mobile.putong.core.p058ui.messages;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.annotation.Nullable;
import p153l.ohc0;

/* JADX INFO: loaded from: classes3.dex */
public class AudioView extends View {

    /* JADX INFO: renamed from: a */
    public int f31534a;

    /* JADX INFO: renamed from: b */
    public Paint f31535b;

    /* JADX INFO: renamed from: c */
    public Paint f31536c;

    /* JADX INFO: renamed from: d */
    public Path f31537d;

    /* JADX INFO: renamed from: e */
    public ValueAnimator f31538e;

    /* JADX INFO: renamed from: f */
    public boolean f31539f;

    /* JADX INFO: renamed from: g */
    public int f31540g;

    /* JADX INFO: renamed from: h */
    public InterfaceC8636b f31541h;

    /* JADX INFO: renamed from: i */
    public PorterDuffXfermode f31542i;

    /* JADX INFO: renamed from: j */
    public float f31543j;

    /* JADX INFO: renamed from: k */
    public int f31544k;

    /* JADX INFO: renamed from: l */
    public int f31545l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.AudioView$a */
    public class C8635a implements Animator.AnimatorListener {
        public C8635a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AudioView.this.setPlay(false);
            if (AudioView.this.f31541h != null) {
                AudioView.this.f31541h.onAnimationEnd(AudioView.this.f31540g);
            }
            AudioView.this.f31534a = 0;
            AudioView.this.invalidate();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AudioView.this.setPlay(true);
            if (AudioView.this.f31541h != null) {
                AudioView.this.f31541h.onAnimationStart(AudioView.this.f31540g);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.AudioView$b */
    public interface InterfaceC8636b {
        void onAnimationEnd(int i);

        void onAnimationStart(int i);
    }

    public AudioView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31539f = false;
        m49053f(context, attributeSet, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlay(boolean z) {
        this.f31539f = z;
    }

    /* JADX INFO: renamed from: f */
    public final void m49053f(Context context, @Nullable AttributeSet attributeSet, int i) {
        this.f31537d = new Path();
        this.f31535b = new Paint();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ohc0.f147393f);
        int color = typedArrayObtainStyledAttributes.getColor(ohc0.f147399i, -65536);
        int color2 = typedArrayObtainStyledAttributes.getColor(ohc0.f147395g, -65536);
        this.f31540g = typedArrayObtainStyledAttributes.getInt(ohc0.f147397h, 0);
        this.f31543j = typedArrayObtainStyledAttributes.getDimension(ohc0.f147401j, 10.0f);
        this.f31535b.setColor(color);
        this.f31535b.setAntiAlias(true);
        Paint paint = this.f31535b;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        Paint paint2 = new Paint();
        this.f31536c = paint2;
        paint2.setColor(color2);
        this.f31536c.setAntiAlias(true);
        this.f31536c.setStyle(style);
        typedArrayObtainStyledAttributes.recycle();
        this.f31542i = new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP);
    }

    /* JADX INFO: renamed from: g */
    public boolean m49054g() {
        return this.f31539f;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m49055h(ValueAnimator valueAnimator) {
        this.f31534a = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        invalidate();
    }

    /* JADX INFO: renamed from: i */
    public void m49056i(int i, int i2) {
        this.f31535b.setColor(i);
        this.f31536c.setColor(i2);
        invalidate();
    }

    /* JADX INFO: renamed from: j */
    public void m49057j(int i, float f) {
        if (this.f31539f) {
            return;
        }
        int width = getWidth();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt((int) (width * f), width + 20);
        this.f31538e = valueAnimatorOfInt;
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.qd1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f156637a.m49055h(valueAnimator);
            }
        });
        this.f31538e.addListener(new C8635a());
        this.f31538e.setInterpolator(new LinearInterpolator());
        this.f31538e.setDuration(i);
        this.f31538e.start();
    }

    /* JADX INFO: renamed from: k */
    public void m49058k(int i) {
        ValueAnimator valueAnimator = this.f31538e;
        if (valueAnimator == null || !this.f31539f) {
            return;
        }
        valueAnimator.end();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.f31537d.reset();
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, this.f31544k, this.f31545l, this.f31535b, 31);
        float f = this.f31544k;
        float f2 = this.f31545l;
        float f3 = this.f31543j;
        canvas.drawRoundRect(0.0f, 0.0f, f, f2, f3, f3, this.f31536c);
        this.f31535b.setXfermode(this.f31542i);
        this.f31537d.moveTo(0.0f, 0.0f);
        this.f31537d.lineTo(this.f31534a - 14, 0.0f);
        Path path = this.f31537d;
        int i = this.f31534a;
        int i2 = this.f31545l;
        path.quadTo(i + 14, i2 >> 1, i - 14, i2);
        this.f31537d.lineTo(0.0f, this.f31545l);
        this.f31537d.close();
        canvas.drawPath(this.f31537d, this.f31535b);
        this.f31535b.setXfermode(null);
        canvas.restoreToCount(iSaveLayer);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f31544k = getMeasuredWidth();
        this.f31545l = getMeasuredHeight();
    }

    public void setAudioListener(InterfaceC8636b interfaceC8636b) {
        this.f31541h = interfaceC8636b;
    }

    public AudioView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AudioView(Context context) {
        this(context, null, 0);
    }
}
