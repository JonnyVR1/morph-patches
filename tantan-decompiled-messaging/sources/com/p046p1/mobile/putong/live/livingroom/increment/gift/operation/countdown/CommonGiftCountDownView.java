package com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.countdown;

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
import p149l.bt0;
import p149l.dt0;
import p149l.i3c0;
import p149l.t100;

/* JADX INFO: loaded from: classes4.dex */
public class CommonGiftCountDownView extends View {

    /* JADX INFO: renamed from: a */
    public Paint f49775a;

    /* JADX INFO: renamed from: b */
    public Paint f49776b;

    /* JADX INFO: renamed from: c */
    public long f49777c;

    /* JADX INFO: renamed from: d */
    public float f49778d;

    /* JADX INFO: renamed from: e */
    public ValueAnimator f49779e;

    /* JADX INFO: renamed from: f */
    public ValueAnimator f49780f;

    /* JADX INFO: renamed from: g */
    public ValueAnimator f49781g;

    /* JADX INFO: renamed from: h */
    public ValueAnimator f49782h;

    /* JADX INFO: renamed from: i */
    public int f49783i;

    /* JADX INFO: renamed from: j */
    public int f49784j;

    /* JADX INFO: renamed from: k */
    public long f49785k;

    /* JADX INFO: renamed from: l */
    public int f49786l;

    /* JADX INFO: renamed from: m */
    public Bitmap f49787m;

    /* JADX INFO: renamed from: n */
    public Bitmap f49788n;

    /* JADX INFO: renamed from: o */
    public InterfaceC12804a f49789o;

    /* JADX INFO: renamed from: p */
    public final RectF f49790p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.CommonGiftCountDownView$a */
    public interface InterfaceC12804a {
        /* JADX INFO: renamed from: a */
        void mo69599a();

        /* JADX INFO: renamed from: b */
        void mo69600b();

        /* JADX INFO: renamed from: c */
        void mo69601c();

        /* JADX INFO: renamed from: d */
        void mo69602d(boolean z);
    }

    public CommonGiftCountDownView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f49783i = -1;
        this.f49784j = 0;
        this.f49786l = 0;
        this.f49790p = new RectF();
        setWillNotDraw(false);
    }

    private Bitmap getCurrentCenterBitmap() {
        Bitmap bitmap = this.f49787m;
        if (bitmap == null || bitmap.isRecycled()) {
            this.f49787m = m73751l(i3c0.f111012g2);
        }
        return this.f49787m;
    }

    private Bitmap getProgressStrokeBitmap() {
        Bitmap bitmap = this.f49788n;
        if (bitmap == null || bitmap.isRecycled()) {
            this.f49788n = m73751l(i3c0.f111036i2);
        }
        return this.f49788n;
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m73738A() {
        setAlpha(1.0f);
    }

    /* JADX INFO: renamed from: B */
    public void m73739B() {
        m73740C(this.f49787m);
        m73740C(this.f49788n);
    }

    /* JADX INFO: renamed from: C */
    public final void m73740C(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        bitmap.recycle();
    }

    /* JADX INFO: renamed from: D */
    public void m73741D() {
        this.f49786l = 0;
        this.f49778d = 0.0f;
        dt0.m113501A(this.f49779e);
        dt0.m113501A(this.f49780f);
        dt0.m113501A(this.f49781g);
        dt0.m113501A(this.f49782h);
    }

    /* JADX INFO: renamed from: E */
    public final void m73742E() {
        m73745H();
        this.f49789o.mo69600b();
    }

    /* JADX INFO: renamed from: F */
    public final void m73743F() {
        dt0.m113501A(this.f49779e);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f49778d, 0.0f);
        valueAnimatorOfFloat.setDuration(180L);
        valueAnimatorOfFloat.setInterpolator(null);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ij5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f113499a.m73757r(valueAnimator);
            }
        });
        bt0.m103733f(valueAnimatorOfFloat, new Runnable() { // from class: l.zi5
            @Override // java.lang.Runnable
            public final void run() {
                this.f203293a.m73758s();
            }
        });
        valueAnimatorOfFloat.start();
        this.f49789o.mo69601c();
        this.f49786l = 4;
    }

    /* JADX INFO: renamed from: G */
    public final void m73744G() {
        setAlpha(1.0f);
        if (this.f49782h == null) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, t100.m186890d(53.0f), t100.m186890d(48.0f));
            this.f49782h = valueAnimatorOfInt;
            valueAnimatorOfInt.setDuration(600L);
            this.f49782h.setInterpolator(null);
        }
        dt0.m113501A(this.f49782h);
        this.f49782h.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.dj5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f86504a.m73759t(valueAnimator);
            }
        });
        bt0.m103733f(this.f49782h, new Runnable() { // from class: l.ej5
            @Override // java.lang.Runnable
            public final void run() {
                this.f91664a.m73760u();
            }
        });
        this.f49778d = 0.0f;
        this.f49782h.start();
        this.f49789o.mo69602d(true);
        this.f49786l = 4;
    }

    /* JADX INFO: renamed from: H */
    public final void m73745H() {
        ValueAnimator valueAnimator = this.f49779e;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f49779e.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimatorM73756q = m73756q(this.f49777c);
        this.f49779e = valueAnimatorM73756q;
        valueAnimatorM73756q.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.yi5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f198442a.m73761v(valueAnimator2);
            }
        });
        bt0.m103733f(this.f49779e, new Runnable() { // from class: l.aj5
            @Override // java.lang.Runnable
            public final void run() {
                this.f70086a.m73762w();
            }
        });
        this.f49779e.start();
        this.f49786l = 2;
    }

    /* JADX INFO: renamed from: I */
    public final void m73746I() {
        if (this.f49781g == null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.f49781g = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setDuration(180L);
            this.f49781g.setInterpolator(null);
        }
        this.f49781g.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.bj5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f75877a.m73763x(valueAnimator);
            }
        });
        bt0.m103733f(this.f49781g, new Runnable() { // from class: l.cj5
            @Override // java.lang.Runnable
            public final void run() {
                this.f81138a.m73764y();
            }
        });
        this.f49781g.start();
        this.f49786l = 3;
    }

    /* JADX INFO: renamed from: J */
    public void m73747J() {
        int i = this.f49786l;
        if (i == 0) {
            m73749L();
            return;
        }
        if (i == 1) {
            return;
        }
        if (i == 2) {
            m73745H();
        } else if (i == 3) {
            dt0.m113502B(this.f49781g);
            m73749L();
        }
    }

    /* JADX INFO: renamed from: K */
    public void m73748K() {
        int i = this.f49786l;
        if (i == 0) {
            m73744G();
        } else if (i == 2) {
            m73743F();
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m73749L() {
        if (this.f49780f == null) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, t100.m186890d(53.0f), t100.m186890d(48.0f));
            this.f49780f = valueAnimatorOfInt;
            valueAnimatorOfInt.setDuration(600L);
            this.f49780f.setInterpolator(null);
        }
        this.f49780f.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.fj5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f97755a.m73765z(valueAnimator);
            }
        });
        bt0.m103750w(this.f49780f, new Runnable() { // from class: l.gj5
            @Override // java.lang.Runnable
            public final void run() {
                this.f103005a.m73738A();
            }
        }, new Runnable() { // from class: l.hj5
            @Override // java.lang.Runnable
            public final void run() {
                this.f108031a.m73745H();
            }
        });
        this.f49778d = 0.0f;
        this.f49780f.start();
        this.f49789o.mo69602d(false);
        this.f49786l = 1;
    }

    /* JADX INFO: renamed from: M */
    public void m73750M() {
        ValueAnimator valueAnimator = this.f49779e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        InterfaceC12804a interfaceC12804a = this.f49789o;
        if (interfaceC12804a != null) {
            interfaceC12804a.mo69599a();
        }
        m73741D();
    }

    /* JADX INFO: renamed from: l */
    public final Bitmap m73751l(int i) {
        return BitmapFactory.decodeResource(getResources(), i);
    }

    /* JADX INFO: renamed from: m */
    public final void m73752m(Canvas canvas) {
        if (this.f49776b == null) {
            Paint paint = new Paint(1);
            this.f49776b = paint;
            paint.setStyle(Paint.Style.FILL);
            this.f49776b.setAntiAlias(true);
        }
        int i = this.f49783i;
        int i2 = this.f49784j;
        canvas.drawBitmap(getCurrentCenterBitmap(), (Rect) null, m73755p(i - i2, i - i2, i + i2, i + i2), this.f49776b);
    }

    /* JADX INFO: renamed from: n */
    public final void m73753n(Canvas canvas) {
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null, 31);
        if (this.f49775a == null) {
            Paint paint = new Paint(1);
            this.f49775a = paint;
            paint.setStyle(Paint.Style.FILL);
            this.f49775a.setAntiAlias(true);
        }
        int i = this.f49783i;
        int i2 = this.f49784j;
        RectF rectFM73755p = m73755p(i - i2, i - i2, i + i2, i + i2);
        canvas.drawArc(rectFM73755p, -90.0f, 360.0f - (this.f49778d * 360.0f), true, this.f49775a);
        this.f49775a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(getProgressStrokeBitmap(), (Rect) null, rectFM73755p, this.f49775a);
        this.f49775a.setXfermode(null);
        canvas.restoreToCount(iSaveLayer);
    }

    /* JADX INFO: renamed from: o */
    public void m73754o() {
        int i = this.f49786l;
        if (i == 5) {
            m73742E();
        } else if (i == 4) {
            dt0.m113501A(this.f49782h);
            m73742E();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f49783i == -1) {
            this.f49783i = getMeasuredWidth() / 2;
        }
        m73752m(canvas);
        m73753n(canvas);
    }

    /* JADX INFO: renamed from: p */
    public final RectF m73755p(float f, float f2, float f3, float f4) {
        RectF rectF = this.f49790p;
        rectF.left = f;
        rectF.top = f2;
        rectF.right = f3;
        rectF.bottom = f4;
        return rectF;
    }

    /* JADX INFO: renamed from: q */
    public final ValueAnimator m73756q(long j) {
        long jCurrentTimeMillis = j - (System.currentTimeMillis() - this.f49785k);
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
    public final /* synthetic */ void m73757r(ValueAnimator valueAnimator) {
        this.f49778d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m73758s() {
        this.f49786l = 5;
    }

    public void setCountdownTime(long j) {
        this.f49785k = System.currentTimeMillis();
        this.f49777c = j;
        ValueAnimator valueAnimator = this.f49779e;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f49779e.removeAllUpdateListeners();
        }
    }

    public void setOnCountDownListener(InterfaceC12804a interfaceC12804a) {
        this.f49789o = interfaceC12804a;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m73759t(ValueAnimator valueAnimator) {
        this.f49784j = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        invalidate();
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m73760u() {
        this.f49786l = 5;
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m73761v(ValueAnimator valueAnimator) {
        this.f49778d = ((Float) valueAnimator.getAnimatedValue()).floatValue() / 100.0f;
        invalidate();
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m73762w() {
        m73746I();
        InterfaceC12804a interfaceC12804a = this.f49789o;
        if (interfaceC12804a != null) {
            interfaceC12804a.mo69599a();
        }
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m73763x(ValueAnimator valueAnimator) {
        setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m73764y() {
        this.f49786l = 0;
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m73765z(ValueAnimator valueAnimator) {
        this.f49784j = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        invalidate();
    }

    public CommonGiftCountDownView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CommonGiftCountDownView(Context context) {
        this(context, null);
    }
}
