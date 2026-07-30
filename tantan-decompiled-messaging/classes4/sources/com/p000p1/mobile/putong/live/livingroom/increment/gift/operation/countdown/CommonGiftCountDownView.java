package com.p000p1.mobile.putong.live.livingroom.increment.gift.operation.countdown;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import l.bt0;
import l.dt0;
import l.t100;
import p002l.i3c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class CommonGiftCountDownView extends View {

    /* JADX INFO: renamed from: a */
    public Paint f5817a;

    /* JADX INFO: renamed from: b */
    public Paint f5818b;

    /* JADX INFO: renamed from: c */
    public long f5819c;

    /* JADX INFO: renamed from: d */
    public float f5820d;

    /* JADX INFO: renamed from: e */
    public ValueAnimator f5821e;

    /* JADX INFO: renamed from: f */
    public ValueAnimator f5822f;

    /* JADX INFO: renamed from: g */
    public ValueAnimator f5823g;

    /* JADX INFO: renamed from: h */
    public ValueAnimator f5824h;

    /* JADX INFO: renamed from: i */
    public int f5825i;

    /* JADX INFO: renamed from: j */
    public int f5826j;

    /* JADX INFO: renamed from: k */
    public long f5827k;

    /* JADX INFO: renamed from: l */
    public int f5828l;

    /* JADX INFO: renamed from: m */
    public Bitmap f5829m;

    /* JADX INFO: renamed from: n */
    public Bitmap f5830n;

    /* JADX INFO: renamed from: o */
    public InterfaceC0393a f5831o;

    /* JADX INFO: renamed from: p */
    public final RectF f5832p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.CommonGiftCountDownView$a */
    public interface InterfaceC0393a {
        /* JADX INFO: renamed from: a */
        void mo7316a();

        /* JADX INFO: renamed from: b */
        void mo7317b();

        /* JADX INFO: renamed from: c */
        void mo7318c();

        /* JADX INFO: renamed from: d */
        void mo7319d(boolean z);
    }

    public CommonGiftCountDownView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5825i = -1;
        this.f5826j = 0;
        this.f5828l = 0;
        this.f5832p = new RectF();
        setWillNotDraw(false);
    }

    private Bitmap getCurrentCenterBitmap() {
        Bitmap bitmap = this.f5829m;
        if (bitmap == null || bitmap.isRecycled()) {
            this.f5829m = m7301l(i3c0.f12797g2);
        }
        return this.f5829m;
    }

    private Bitmap getProgressStrokeBitmap() {
        Bitmap bitmap = this.f5830n;
        if (bitmap == null || bitmap.isRecycled()) {
            this.f5830n = m7301l(i3c0.f12821i2);
        }
        return this.f5830n;
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m7288A() {
        setAlpha(1.0f);
    }

    /* JADX INFO: renamed from: B */
    public void m7289B() {
        m7290C(this.f5829m);
        m7290C(this.f5830n);
    }

    /* JADX INFO: renamed from: C */
    public final void m7290C(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        bitmap.recycle();
    }

    /* JADX INFO: renamed from: D */
    public void m7291D() {
        this.f5828l = 0;
        this.f5820d = 0.0f;
        dt0.A(this.f5821e);
        dt0.A(this.f5822f);
        dt0.A(this.f5823g);
        dt0.A(this.f5824h);
    }

    /* JADX INFO: renamed from: E */
    public final void m7292E() {
        m7295H();
        this.f5831o.mo7317b();
    }

    /* JADX INFO: renamed from: F */
    public final void m7293F() {
        dt0.A(this.f5821e);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f5820d, 0.0f);
        valueAnimatorOfFloat.setDuration(180L);
        valueAnimatorOfFloat.setInterpolator(null);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ij5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f13269a.m7307r(valueAnimator);
            }
        });
        bt0.f(valueAnimatorOfFloat, new Runnable() { // from class: l.zi5
            @Override // java.lang.Runnable
            public final void run() {
                this.f23438a.m7308s();
            }
        });
        valueAnimatorOfFloat.start();
        this.f5831o.mo7318c();
        this.f5828l = 4;
    }

    /* JADX INFO: renamed from: G */
    public final void m7294G() {
        setAlpha(1.0f);
        if (this.f5824h == null) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, t100.d(53.0f), t100.d(48.0f));
            this.f5824h = valueAnimatorOfInt;
            valueAnimatorOfInt.setDuration(600L);
            this.f5824h.setInterpolator(null);
        }
        dt0.A(this.f5824h);
        this.f5824h.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.dj5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f9303a.m7309t(valueAnimator);
            }
        });
        bt0.f(this.f5824h, new Runnable() { // from class: l.ej5
            @Override // java.lang.Runnable
            public final void run() {
                this.f9815a.m7310u();
            }
        });
        this.f5820d = 0.0f;
        this.f5824h.start();
        this.f5831o.mo7319d(true);
        this.f5828l = 4;
    }

    /* JADX INFO: renamed from: H */
    public final void m7295H() {
        ValueAnimator valueAnimator = this.f5821e;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f5821e.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimatorM7306q = m7306q(this.f5819c);
        this.f5821e = valueAnimatorM7306q;
        valueAnimatorM7306q.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.yi5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f22896a.m7311v(valueAnimator2);
            }
        });
        bt0.f(this.f5821e, new Runnable() { // from class: l.aj5
            @Override // java.lang.Runnable
            public final void run() {
                this.f7657a.m7312w();
            }
        });
        this.f5821e.start();
        this.f5828l = 2;
    }

    /* JADX INFO: renamed from: I */
    public final void m7296I() {
        if (this.f5823g == null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.f5823g = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setDuration(180L);
            this.f5823g.setInterpolator(null);
        }
        this.f5823g.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.bj5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f8177a.m7313x(valueAnimator);
            }
        });
        bt0.f(this.f5823g, new Runnable() { // from class: l.cj5
            @Override // java.lang.Runnable
            public final void run() {
                this.f8689a.m7314y();
            }
        });
        this.f5823g.start();
        this.f5828l = 3;
    }

    /* JADX INFO: renamed from: J */
    public void m7297J() {
        int i = this.f5828l;
        if (i == 0) {
            m7299L();
            return;
        }
        if (i == 1) {
            return;
        }
        if (i == 2) {
            m7295H();
        } else if (i == 3) {
            dt0.B(this.f5823g);
            m7299L();
        }
    }

    /* JADX INFO: renamed from: K */
    public void m7298K() {
        int i = this.f5828l;
        if (i == 0) {
            m7294G();
        } else if (i == 2) {
            m7293F();
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m7299L() {
        if (this.f5822f == null) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, t100.d(53.0f), t100.d(48.0f));
            this.f5822f = valueAnimatorOfInt;
            valueAnimatorOfInt.setDuration(600L);
            this.f5822f.setInterpolator(null);
        }
        this.f5822f.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.fj5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f10420a.m7315z(valueAnimator);
            }
        });
        bt0.w(this.f5822f, new Runnable() { // from class: l.gj5
            @Override // java.lang.Runnable
            public final void run() {
                this.f11466a.m7288A();
            }
        }, new Runnable() { // from class: l.hj5
            @Override // java.lang.Runnable
            public final void run() {
                this.f12061a.m7295H();
            }
        });
        this.f5820d = 0.0f;
        this.f5822f.start();
        this.f5831o.mo7319d(false);
        this.f5828l = 1;
    }

    /* JADX INFO: renamed from: M */
    public void m7300M() {
        ValueAnimator valueAnimator = this.f5821e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        InterfaceC0393a interfaceC0393a = this.f5831o;
        if (interfaceC0393a != null) {
            interfaceC0393a.mo7316a();
        }
        m7291D();
    }

    /* JADX INFO: renamed from: l */
    public final Bitmap m7301l(int i) {
        return BitmapFactory.decodeResource(getResources(), i);
    }

    /* JADX INFO: renamed from: m */
    public final void m7302m(Canvas canvas) {
        if (this.f5818b == null) {
            Paint paint = new Paint(1);
            this.f5818b = paint;
            paint.setStyle(Paint.Style.FILL);
            this.f5818b.setAntiAlias(true);
        }
        int i = this.f5825i;
        int i2 = this.f5826j;
        canvas.drawBitmap(getCurrentCenterBitmap(), (Rect) null, m7305p(i - i2, i - i2, i + i2, i + i2), this.f5818b);
    }

    /* JADX INFO: renamed from: n */
    public final void m7303n(Canvas canvas) {
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null, 31);
        if (this.f5817a == null) {
            Paint paint = new Paint(1);
            this.f5817a = paint;
            paint.setStyle(Paint.Style.FILL);
            this.f5817a.setAntiAlias(true);
        }
        int i = this.f5825i;
        int i2 = this.f5826j;
        RectF rectFM7305p = m7305p(i - i2, i - i2, i + i2, i + i2);
        canvas.drawArc(rectFM7305p, -90.0f, 360.0f - (this.f5820d * 360.0f), true, this.f5817a);
        this.f5817a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(getProgressStrokeBitmap(), (Rect) null, rectFM7305p, this.f5817a);
        this.f5817a.setXfermode(null);
        canvas.restoreToCount(iSaveLayer);
    }

    /* JADX INFO: renamed from: o */
    public void m7304o() {
        int i = this.f5828l;
        if (i == 5) {
            m7292E();
        } else if (i == 4) {
            dt0.A(this.f5824h);
            m7292E();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f5825i == -1) {
            this.f5825i = getMeasuredWidth() / 2;
        }
        m7302m(canvas);
        m7303n(canvas);
    }

    /* JADX INFO: renamed from: p */
    public final RectF m7305p(float f, float f2, float f3, float f4) {
        RectF rectF = this.f5832p;
        rectF.left = f;
        rectF.top = f2;
        rectF.right = f3;
        rectF.bottom = f4;
        return rectF;
    }

    /* JADX INFO: renamed from: q */
    public final ValueAnimator m7306q(long j) {
        long jCurrentTimeMillis = j - (System.currentTimeMillis() - this.f5827k);
        if (jCurrentTimeMillis < 0) {
            jCurrentTimeMillis = 3000;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 100.0f);
        valueAnimatorOfFloat.setDuration(jCurrentTimeMillis);
        valueAnimatorOfFloat.setInterpolator(null);
        valueAnimatorOfFloat.setRepeatCount(0);
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m7307r(ValueAnimator valueAnimator) {
        this.f5820d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m7308s() {
        this.f5828l = 5;
    }

    public void setCountdownTime(long j) {
        this.f5827k = System.currentTimeMillis();
        this.f5819c = j;
        ValueAnimator valueAnimator = this.f5821e;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f5821e.removeAllUpdateListeners();
        }
    }

    public void setOnCountDownListener(InterfaceC0393a interfaceC0393a) {
        this.f5831o = interfaceC0393a;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m7309t(ValueAnimator valueAnimator) {
        this.f5826j = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        invalidate();
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m7310u() {
        this.f5828l = 5;
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m7311v(ValueAnimator valueAnimator) {
        this.f5820d = ((Float) valueAnimator.getAnimatedValue()).floatValue() / 100.0f;
        invalidate();
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m7312w() {
        m7296I();
        InterfaceC0393a interfaceC0393a = this.f5831o;
        if (interfaceC0393a != null) {
            interfaceC0393a.mo7316a();
        }
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m7313x(ValueAnimator valueAnimator) {
        setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m7314y() {
        this.f5828l = 0;
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m7315z(ValueAnimator valueAnimator) {
        this.f5826j = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        invalidate();
    }

    public CommonGiftCountDownView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CommonGiftCountDownView(Context context) {
        this(context, null);
    }
}
