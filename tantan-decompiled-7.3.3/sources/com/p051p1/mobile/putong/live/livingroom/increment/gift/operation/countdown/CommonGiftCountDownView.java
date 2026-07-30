package com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.countdown;

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
import p153l.gt0;
import p153l.it0;
import p153l.obc0;
import p153l.qa00;

/* JADX INFO: loaded from: classes4.dex */
public class CommonGiftCountDownView extends View {

    /* JADX INFO: renamed from: a */
    public Paint f50623a;

    /* JADX INFO: renamed from: b */
    public Paint f50624b;

    /* JADX INFO: renamed from: c */
    public long f50625c;

    /* JADX INFO: renamed from: d */
    public float f50626d;

    /* JADX INFO: renamed from: e */
    public ValueAnimator f50627e;

    /* JADX INFO: renamed from: f */
    public ValueAnimator f50628f;

    /* JADX INFO: renamed from: g */
    public ValueAnimator f50629g;

    /* JADX INFO: renamed from: h */
    public ValueAnimator f50630h;

    /* JADX INFO: renamed from: i */
    public int f50631i;

    /* JADX INFO: renamed from: j */
    public int f50632j;

    /* JADX INFO: renamed from: k */
    public long f50633k;

    /* JADX INFO: renamed from: l */
    public int f50634l;

    /* JADX INFO: renamed from: m */
    public Bitmap f50635m;

    /* JADX INFO: renamed from: n */
    public Bitmap f50636n;

    /* JADX INFO: renamed from: o */
    public InterfaceC12967a f50637o;

    /* JADX INFO: renamed from: p */
    public final RectF f50638p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.CommonGiftCountDownView$a */
    public interface InterfaceC12967a {
        /* JADX INFO: renamed from: a */
        void mo70782a();

        /* JADX INFO: renamed from: b */
        void mo70783b();

        /* JADX INFO: renamed from: c */
        void mo70784c();

        /* JADX INFO: renamed from: d */
        void mo70785d(boolean z);
    }

    public CommonGiftCountDownView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f50631i = -1;
        this.f50632j = 0;
        this.f50634l = 0;
        this.f50638p = new RectF();
        setWillNotDraw(false);
    }

    private Bitmap getCurrentCenterBitmap() {
        Bitmap bitmap = this.f50635m;
        if (bitmap == null || bitmap.isRecycled()) {
            this.f50635m = m74934l(obc0.f146340g2);
        }
        return this.f50635m;
    }

    private Bitmap getProgressStrokeBitmap() {
        Bitmap bitmap = this.f50636n;
        if (bitmap == null || bitmap.isRecycled()) {
            this.f50636n = m74934l(obc0.f146364i2);
        }
        return this.f50636n;
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m74921A() {
        setAlpha(1.0f);
    }

    /* JADX INFO: renamed from: B */
    public void m74922B() {
        m74923C(this.f50635m);
        m74923C(this.f50636n);
    }

    /* JADX INFO: renamed from: C */
    public final void m74923C(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        bitmap.recycle();
    }

    /* JADX INFO: renamed from: D */
    public void m74924D() {
        this.f50634l = 0;
        this.f50626d = 0.0f;
        it0.m142007A(this.f50627e);
        it0.m142007A(this.f50628f);
        it0.m142007A(this.f50629g);
        it0.m142007A(this.f50630h);
    }

    /* JADX INFO: renamed from: E */
    public final void m74925E() {
        m74928H();
        this.f50637o.mo70783b();
    }

    /* JADX INFO: renamed from: F */
    public final void m74926F() {
        it0.m142007A(this.f50627e);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f50626d, 0.0f);
        valueAnimatorOfFloat.setDuration(180L);
        valueAnimatorOfFloat.setInterpolator(null);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.jk5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f121273a.m74940r(valueAnimator);
            }
        });
        gt0.m132160f(valueAnimatorOfFloat, new Runnable() { // from class: l.ak5
            @Override // java.lang.Runnable
            public final void run() {
                this.f71970a.m74941s();
            }
        });
        valueAnimatorOfFloat.start();
        this.f50637o.mo70784c();
        this.f50634l = 4;
    }

    /* JADX INFO: renamed from: G */
    public final void m74927G() {
        setAlpha(1.0f);
        if (this.f50630h == null) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, qa00.m175859d(53.0f), qa00.m175859d(48.0f));
            this.f50630h = valueAnimatorOfInt;
            valueAnimatorOfInt.setDuration(600L);
            this.f50630h.setInterpolator(null);
        }
        it0.m142007A(this.f50630h);
        this.f50630h.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ek5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f94343a.m74942t(valueAnimator);
            }
        });
        gt0.m132160f(this.f50630h, new Runnable() { // from class: l.fk5
            @Override // java.lang.Runnable
            public final void run() {
                this.f99483a.m74943u();
            }
        });
        this.f50626d = 0.0f;
        this.f50630h.start();
        this.f50637o.mo70785d(true);
        this.f50634l = 4;
    }

    /* JADX INFO: renamed from: H */
    public final void m74928H() {
        ValueAnimator valueAnimator = this.f50627e;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f50627e.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimatorM74939q = m74939q(this.f50625c);
        this.f50627e = valueAnimatorM74939q;
        valueAnimatorM74939q.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.zj5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f204642a.m74944v(valueAnimator2);
            }
        });
        gt0.m132160f(this.f50627e, new Runnable() { // from class: l.bk5
            @Override // java.lang.Runnable
            public final void run() {
                this.f77046a.m74945w();
            }
        });
        this.f50627e.start();
        this.f50634l = 2;
    }

    /* JADX INFO: renamed from: I */
    public final void m74929I() {
        if (this.f50629g == null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.f50629g = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setDuration(180L);
            this.f50629g.setInterpolator(null);
        }
        this.f50629g.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ck5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f82265a.m74946x(valueAnimator);
            }
        });
        gt0.m132160f(this.f50629g, new Runnable() { // from class: l.dk5
            @Override // java.lang.Runnable
            public final void run() {
                this.f88974a.m74947y();
            }
        });
        this.f50629g.start();
        this.f50634l = 3;
    }

    /* JADX INFO: renamed from: J */
    public void m74930J() {
        int i = this.f50634l;
        if (i == 0) {
            m74932L();
            return;
        }
        if (i == 1) {
            return;
        }
        if (i == 2) {
            m74928H();
        } else if (i == 3) {
            it0.m142008B(this.f50629g);
            m74932L();
        }
    }

    /* JADX INFO: renamed from: K */
    public void m74931K() {
        int i = this.f50634l;
        if (i == 0) {
            m74927G();
        } else if (i == 2) {
            m74926F();
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m74932L() {
        if (this.f50628f == null) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, qa00.m175859d(53.0f), qa00.m175859d(48.0f));
            this.f50628f = valueAnimatorOfInt;
            valueAnimatorOfInt.setDuration(600L);
            this.f50628f.setInterpolator(null);
        }
        this.f50628f.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.gk5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f104707a.m74948z(valueAnimator);
            }
        });
        gt0.m132177w(this.f50628f, new Runnable() { // from class: l.hk5
            @Override // java.lang.Runnable
            public final void run() {
                this.f110379a.m74921A();
            }
        }, new Runnable() { // from class: l.ik5
            @Override // java.lang.Runnable
            public final void run() {
                this.f115335a.m74928H();
            }
        });
        this.f50626d = 0.0f;
        this.f50628f.start();
        this.f50637o.mo70785d(false);
        this.f50634l = 1;
    }

    /* JADX INFO: renamed from: M */
    public void m74933M() {
        ValueAnimator valueAnimator = this.f50627e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        InterfaceC12967a interfaceC12967a = this.f50637o;
        if (interfaceC12967a != null) {
            interfaceC12967a.mo70782a();
        }
        m74924D();
    }

    /* JADX INFO: renamed from: l */
    public final Bitmap m74934l(int i) {
        return BitmapFactory.decodeResource(getResources(), i);
    }

    /* JADX INFO: renamed from: m */
    public final void m74935m(Canvas canvas) {
        if (this.f50624b == null) {
            Paint paint = new Paint(1);
            this.f50624b = paint;
            paint.setStyle(Paint.Style.FILL);
            this.f50624b.setAntiAlias(true);
        }
        int i = this.f50631i;
        int i2 = this.f50632j;
        canvas.drawBitmap(getCurrentCenterBitmap(), (Rect) null, m74938p(i - i2, i - i2, i + i2, i + i2), this.f50624b);
    }

    /* JADX INFO: renamed from: n */
    public final void m74936n(Canvas canvas) {
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null, 31);
        if (this.f50623a == null) {
            Paint paint = new Paint(1);
            this.f50623a = paint;
            paint.setStyle(Paint.Style.FILL);
            this.f50623a.setAntiAlias(true);
        }
        int i = this.f50631i;
        int i2 = this.f50632j;
        RectF rectFM74938p = m74938p(i - i2, i - i2, i + i2, i + i2);
        canvas.drawArc(rectFM74938p, -90.0f, 360.0f - (this.f50626d * 360.0f), true, this.f50623a);
        this.f50623a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(getProgressStrokeBitmap(), (Rect) null, rectFM74938p, this.f50623a);
        this.f50623a.setXfermode(null);
        canvas.restoreToCount(iSaveLayer);
    }

    /* JADX INFO: renamed from: o */
    public void m74937o() {
        int i = this.f50634l;
        if (i == 5) {
            m74925E();
        } else if (i == 4) {
            it0.m142007A(this.f50630h);
            m74925E();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f50631i == -1) {
            this.f50631i = getMeasuredWidth() / 2;
        }
        m74935m(canvas);
        m74936n(canvas);
    }

    /* JADX INFO: renamed from: p */
    public final RectF m74938p(float f, float f2, float f3, float f4) {
        RectF rectF = this.f50638p;
        rectF.left = f;
        rectF.top = f2;
        rectF.right = f3;
        rectF.bottom = f4;
        return rectF;
    }

    /* JADX INFO: renamed from: q */
    public final ValueAnimator m74939q(long j) {
        long jCurrentTimeMillis = j - (System.currentTimeMillis() - this.f50633k);
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
    public final /* synthetic */ void m74940r(ValueAnimator valueAnimator) {
        this.f50626d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m74941s() {
        this.f50634l = 5;
    }

    public void setCountdownTime(long j) {
        this.f50633k = System.currentTimeMillis();
        this.f50625c = j;
        ValueAnimator valueAnimator = this.f50627e;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f50627e.removeAllUpdateListeners();
        }
    }

    public void setOnCountDownListener(InterfaceC12967a interfaceC12967a) {
        this.f50637o = interfaceC12967a;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m74942t(ValueAnimator valueAnimator) {
        this.f50632j = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        invalidate();
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m74943u() {
        this.f50634l = 5;
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m74944v(ValueAnimator valueAnimator) {
        this.f50626d = ((Float) valueAnimator.getAnimatedValue()).floatValue() / 100.0f;
        invalidate();
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m74945w() {
        m74929I();
        InterfaceC12967a interfaceC12967a = this.f50637o;
        if (interfaceC12967a != null) {
            interfaceC12967a.mo70782a();
        }
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m74946x(ValueAnimator valueAnimator) {
        setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m74947y() {
        this.f50634l = 0;
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m74948z(ValueAnimator valueAnimator) {
        this.f50632j = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        invalidate();
    }

    public CommonGiftCountDownView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CommonGiftCountDownView(Context context) {
        this(context, null);
    }
}
