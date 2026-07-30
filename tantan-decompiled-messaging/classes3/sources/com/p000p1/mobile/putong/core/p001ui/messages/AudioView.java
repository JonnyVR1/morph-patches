package com.p000p1.mobile.putong.core.p001ui.messages;

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
import l.i9c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class AudioView extends View {

    /* JADX INFO: renamed from: a */
    public int f577a;

    /* JADX INFO: renamed from: b */
    public Paint f578b;

    /* JADX INFO: renamed from: c */
    public Paint f579c;

    /* JADX INFO: renamed from: d */
    public Path f580d;

    /* JADX INFO: renamed from: e */
    public ValueAnimator f581e;

    /* JADX INFO: renamed from: f */
    public boolean f582f;

    /* JADX INFO: renamed from: g */
    public int f583g;

    /* JADX INFO: renamed from: h */
    public InterfaceC0056b f584h;

    /* JADX INFO: renamed from: i */
    public PorterDuffXfermode f585i;

    /* JADX INFO: renamed from: j */
    public float f586j;

    /* JADX INFO: renamed from: k */
    public int f587k;

    /* JADX INFO: renamed from: l */
    public int f588l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.AudioView$a */
    public class C0055a implements Animator.AnimatorListener {
        public C0055a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AudioView.this.setPlay(false);
            if (AudioView.this.f584h != null) {
                AudioView.this.f584h.onAnimationEnd(AudioView.this.f583g);
            }
            AudioView.this.f577a = 0;
            AudioView.this.invalidate();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AudioView.this.setPlay(true);
            if (AudioView.this.f584h != null) {
                AudioView.this.f584h.onAnimationStart(AudioView.this.f583g);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.AudioView$b */
    public interface InterfaceC0056b {
        void onAnimationEnd(int i);

        void onAnimationStart(int i);
    }

    public AudioView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f582f = false;
        m943f(context, attributeSet, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlay(boolean z) {
        this.f582f = z;
    }

    /* JADX INFO: renamed from: f */
    public final void m943f(Context context, @Nullable AttributeSet attributeSet, int i) {
        this.f580d = new Path();
        this.f578b = new Paint();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i9c0.f);
        int color = typedArrayObtainStyledAttributes.getColor(i9c0.i, -65536);
        int color2 = typedArrayObtainStyledAttributes.getColor(i9c0.g, -65536);
        this.f583g = typedArrayObtainStyledAttributes.getInt(i9c0.h, 0);
        this.f586j = typedArrayObtainStyledAttributes.getDimension(i9c0.j, 10.0f);
        this.f578b.setColor(color);
        this.f578b.setAntiAlias(true);
        Paint paint = this.f578b;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        Paint paint2 = new Paint();
        this.f579c = paint2;
        paint2.setColor(color2);
        this.f579c.setAntiAlias(true);
        this.f579c.setStyle(style);
        typedArrayObtainStyledAttributes.recycle();
        this.f585i = new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP);
    }

    /* JADX INFO: renamed from: g */
    public boolean m944g() {
        return this.f582f;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m945h(ValueAnimator valueAnimator) {
        this.f577a = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        invalidate();
    }

    /* JADX INFO: renamed from: i */
    public void m946i(int i, int i2) {
        this.f578b.setColor(i);
        this.f579c.setColor(i2);
        invalidate();
    }

    /* JADX INFO: renamed from: j */
    public void m947j(int i, float f) {
        if (this.f582f) {
            return;
        }
        int width = getWidth();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt((int) (width * f), width + 20);
        this.f581e = valueAnimatorOfInt;
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.jd1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f4619a.m945h(valueAnimator);
            }
        });
        this.f581e.addListener(new C0055a());
        this.f581e.setInterpolator(new LinearInterpolator());
        this.f581e.setDuration(i);
        this.f581e.start();
    }

    /* JADX INFO: renamed from: k */
    public void m948k(int i) {
        ValueAnimator valueAnimator = this.f581e;
        if (valueAnimator == null || !this.f582f) {
            return;
        }
        valueAnimator.end();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.f580d.reset();
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, this.f587k, this.f588l, this.f578b, 31);
        float f = this.f587k;
        float f2 = this.f588l;
        float f3 = this.f586j;
        canvas.drawRoundRect(0.0f, 0.0f, f, f2, f3, f3, this.f579c);
        this.f578b.setXfermode(this.f585i);
        this.f580d.moveTo(0.0f, 0.0f);
        this.f580d.lineTo(this.f577a - 14, 0.0f);
        Path path = this.f580d;
        int i = this.f577a;
        int i2 = this.f588l;
        path.quadTo(i + 14, i2 >> 1, i - 14, i2);
        this.f580d.lineTo(0.0f, this.f588l);
        this.f580d.close();
        canvas.drawPath(this.f580d, this.f578b);
        this.f578b.setXfermode(null);
        canvas.restoreToCount(iSaveLayer);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f587k = getMeasuredWidth();
        this.f588l = getMeasuredHeight();
    }

    public void setAudioListener(InterfaceC0056b interfaceC0056b) {
        this.f584h = interfaceC0056b;
    }

    public AudioView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AudioView(Context context) {
        this(context, null, 0);
    }
}
