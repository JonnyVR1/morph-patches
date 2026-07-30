package com.p046p1.mobile.putong.core.p053ui.messages;

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
import p149l.i9c0;

/* JADX INFO: loaded from: classes3.dex */
public class AudioView extends View {

    /* JADX INFO: renamed from: a */
    public int f30686a;

    /* JADX INFO: renamed from: b */
    public Paint f30687b;

    /* JADX INFO: renamed from: c */
    public Paint f30688c;

    /* JADX INFO: renamed from: d */
    public Path f30689d;

    /* JADX INFO: renamed from: e */
    public ValueAnimator f30690e;

    /* JADX INFO: renamed from: f */
    public boolean f30691f;

    /* JADX INFO: renamed from: g */
    public int f30692g;

    /* JADX INFO: renamed from: h */
    public InterfaceC8473b f30693h;

    /* JADX INFO: renamed from: i */
    public PorterDuffXfermode f30694i;

    /* JADX INFO: renamed from: j */
    public float f30695j;

    /* JADX INFO: renamed from: k */
    public int f30696k;

    /* JADX INFO: renamed from: l */
    public int f30697l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.AudioView$a */
    public class C8472a implements Animator.AnimatorListener {
        public C8472a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AudioView.this.setPlay(false);
            if (AudioView.this.f30693h != null) {
                AudioView.this.f30693h.onAnimationEnd(AudioView.this.f30692g);
            }
            AudioView.this.f30686a = 0;
            AudioView.this.invalidate();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AudioView.this.setPlay(true);
            if (AudioView.this.f30693h != null) {
                AudioView.this.f30693h.onAnimationStart(AudioView.this.f30692g);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.AudioView$b */
    public interface InterfaceC8473b {
        void onAnimationEnd(int i);

        void onAnimationStart(int i);
    }

    public AudioView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30691f = false;
        m47870f(context, attributeSet, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlay(boolean z) {
        this.f30691f = z;
    }

    /* JADX INFO: renamed from: f */
    public final void m47870f(Context context, @Nullable AttributeSet attributeSet, int i) {
        this.f30689d = new Path();
        this.f30687b = new Paint();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i9c0.f112168f);
        int color = typedArrayObtainStyledAttributes.getColor(i9c0.f112174i, -65536);
        int color2 = typedArrayObtainStyledAttributes.getColor(i9c0.f112170g, -65536);
        this.f30692g = typedArrayObtainStyledAttributes.getInt(i9c0.f112172h, 0);
        this.f30695j = typedArrayObtainStyledAttributes.getDimension(i9c0.f112176j, 10.0f);
        this.f30687b.setColor(color);
        this.f30687b.setAntiAlias(true);
        Paint paint = this.f30687b;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        Paint paint2 = new Paint();
        this.f30688c = paint2;
        paint2.setColor(color2);
        this.f30688c.setAntiAlias(true);
        this.f30688c.setStyle(style);
        typedArrayObtainStyledAttributes.recycle();
        this.f30694i = new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP);
    }

    /* JADX INFO: renamed from: g */
    public boolean m47871g() {
        return this.f30691f;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m47872h(ValueAnimator valueAnimator) {
        this.f30686a = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        invalidate();
    }

    /* JADX INFO: renamed from: i */
    public void m47873i(int i, int i2) {
        this.f30687b.setColor(i);
        this.f30688c.setColor(i2);
        invalidate();
    }

    /* JADX INFO: renamed from: j */
    public void m47874j(int i, float f) {
        if (this.f30691f) {
            return;
        }
        int width = getWidth();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt((int) (width * f), width + 20);
        this.f30690e = valueAnimatorOfInt;
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.jd1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f117364a.m47872h(valueAnimator);
            }
        });
        this.f30690e.addListener(new C8472a());
        this.f30690e.setInterpolator(new LinearInterpolator());
        this.f30690e.setDuration(i);
        this.f30690e.start();
    }

    /* JADX INFO: renamed from: k */
    public void m47875k(int i) {
        ValueAnimator valueAnimator = this.f30690e;
        if (valueAnimator == null || !this.f30691f) {
            return;
        }
        valueAnimator.end();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.f30689d.reset();
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, this.f30696k, this.f30697l, this.f30687b, 31);
        float f = this.f30696k;
        float f2 = this.f30697l;
        float f3 = this.f30695j;
        canvas.drawRoundRect(0.0f, 0.0f, f, f2, f3, f3, this.f30688c);
        this.f30687b.setXfermode(this.f30694i);
        this.f30689d.moveTo(0.0f, 0.0f);
        this.f30689d.lineTo(this.f30686a - 14, 0.0f);
        Path path = this.f30689d;
        int i = this.f30686a;
        int i2 = this.f30697l;
        path.quadTo(i + 14, i2 >> 1, i - 14, i2);
        this.f30689d.lineTo(0.0f, this.f30697l);
        this.f30689d.close();
        canvas.drawPath(this.f30689d, this.f30687b);
        this.f30687b.setXfermode(null);
        canvas.restoreToCount(iSaveLayer);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f30696k = getMeasuredWidth();
        this.f30697l = getMeasuredHeight();
    }

    public void setAudioListener(InterfaceC8473b interfaceC8473b) {
        this.f30693h = interfaceC8473b;
    }

    public AudioView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AudioView(Context context) {
        this(context, null, 0);
    }
}
