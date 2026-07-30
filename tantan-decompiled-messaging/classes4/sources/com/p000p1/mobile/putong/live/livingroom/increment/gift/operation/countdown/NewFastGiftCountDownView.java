package com.p000p1.mobile.putong.live.livingroom.increment.gift.operation.countdown;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import l.kvc0;
import l.t100;
import p002l.h1c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class NewFastGiftCountDownView extends View {

    /* JADX INFO: renamed from: a */
    public float f5861a;

    /* JADX INFO: renamed from: b */
    public float f5862b;

    /* JADX INFO: renamed from: c */
    public float f5863c;

    /* JADX INFO: renamed from: d */
    public float f5864d;

    /* JADX INFO: renamed from: e */
    public float[] f5865e;

    /* JADX INFO: renamed from: f */
    public int f5866f;

    /* JADX INFO: renamed from: g */
    public float[] f5867g;

    /* JADX INFO: renamed from: h */
    public Paint f5868h;

    /* JADX INFO: renamed from: i */
    public final int f5869i;

    /* JADX INFO: renamed from: j */
    public final int f5870j;

    /* JADX INFO: renamed from: k */
    public final int f5871k;

    /* JADX INFO: renamed from: l */
    public final int f5872l;

    /* JADX INFO: renamed from: m */
    public final float f5873m;

    /* JADX INFO: renamed from: n */
    public final float f5874n;

    /* JADX INFO: renamed from: o */
    public InterfaceC0399b f5875o;

    /* JADX INFO: renamed from: p */
    public ValueAnimator f5876p;

    /* JADX INFO: renamed from: q */
    public boolean f5877q;

    /* JADX INFO: renamed from: r */
    public long f5878r;

    /* JADX INFO: renamed from: s */
    public boolean f5879s;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.NewFastGiftCountDownView$a */
    public class C0398a extends AnimatorListenerAdapter {
        public C0398a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            NewFastGiftCountDownView.this.setVisibility(4);
            NewFastGiftCountDownView.this.f5879s = false;
            if (NewFastGiftCountDownView.this.f5875o != null) {
                NewFastGiftCountDownView.this.f5875o.mo7372a();
            }
            NewFastGiftCountDownView.this.f5866f = 0;
            NewFastGiftCountDownView.this.f5867g = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            NewFastGiftCountDownView.this.f5879s = true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.NewFastGiftCountDownView$b */
    public interface InterfaceC0399b {
        /* JADX INFO: renamed from: a */
        void mo7372a();
    }

    public NewFastGiftCountDownView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5866f = 0;
        this.f5869i = 0;
        this.f5870j = 1;
        this.f5871k = 2;
        this.f5872l = 3;
        this.f5873m = t100.d(3.0f);
        this.f5874n = t100.d(10.0f);
        this.f5877q = false;
        this.f5878r = 3000L;
        this.f5879s = false;
        setWillNotDraw(false);
        this.f5876p = m7365j(this.f5878r);
    }

    /* JADX INFO: renamed from: f */
    public final void m7361f(int i, float f, List<Float> list) {
        float fFloatValue = list.get(list.size() - 2).floatValue();
        int i2 = 1;
        float fFloatValue2 = list.get(list.size() - 1).floatValue();
        int i3 = 0;
        while (i3 < 90) {
            int i4 = i3 + 10;
            if (i == 0) {
                double d = f;
                double d2 = ((double) i4) * 0.017453292519943295d;
                float fCos = (float) (((double) fFloatValue) + (d - (Math.cos(d2) * d)));
                float fSin = (float) (((double) fFloatValue2) - (Math.sin(d2) * d));
                list.add(Float.valueOf(fCos));
                list.add(Float.valueOf(fSin));
            } else if (i == i2) {
                double d3 = ((double) i4) * 0.017453292519943295d;
                double d4 = f;
                float fSin2 = (float) (((double) fFloatValue) - (Math.sin(d3) * d4));
                float fCos2 = (float) (((double) fFloatValue2) - (d4 - (Math.cos(d3) * d4)));
                list.add(Float.valueOf(fSin2));
                list.add(Float.valueOf(fCos2));
            } else if (i == 2) {
                double d5 = f;
                double d6 = ((double) i4) * 0.017453292519943295d;
                float fCos3 = (float) (((double) fFloatValue) - (d5 - (Math.cos(d6) * d5)));
                float fSin3 = (float) (((double) fFloatValue2) + (Math.sin(d6) * d5));
                list.add(Float.valueOf(fCos3));
                list.add(Float.valueOf(fSin3));
            } else if (i == 3) {
                double d7 = ((double) i4) * 0.017453292519943295d;
                double d8 = f;
                float fSin4 = (float) (((double) fFloatValue) + (Math.sin(d7) * d8));
                float fCos4 = (float) (((double) fFloatValue2) + (d8 - (Math.cos(d7) * d8)));
                list.add(Float.valueOf(fSin4));
                list.add(Float.valueOf(fCos4));
            }
            i3 += 3;
            i2 = 1;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m7362g(float f, float f2, float f3, float f4, List<Float> list) {
        float f5 = f - (f2 * 2.0f);
        int i = ((int) f5) / 2;
        while (true) {
            i++;
            float f6 = i;
            if (f6 >= f5) {
                return;
            }
            list.add(Float.valueOf(f6 + f3));
            list.add(Float.valueOf(f4));
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m7363h(float f, float f2, float f3, float f4, List<Float> list) {
        int i = 1;
        while (true) {
            float f5 = i;
            if (f5 >= (f - (f2 * 2.0f)) / 2.0f) {
                return;
            }
            list.add(Float.valueOf(f5 + f3));
            list.add(Float.valueOf(f4));
            i++;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m7364i(float f, float f2, float f3, float f4, List<Float> list) {
        int i = 1;
        while (true) {
            float f5 = i;
            if (f5 >= f - (2.0f * f2)) {
                return;
            }
            list.add(Float.valueOf(f4));
            list.add(Float.valueOf(f5 + f3));
            i++;
        }
    }

    /* JADX INFO: renamed from: j */
    public final ValueAnimator m7365j(long j) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 100.0f);
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setRepeatCount(0);
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: k */
    public final void m7366k() {
        Paint paint = new Paint();
        this.f5868h = paint;
        paint.setColor(kvc0.a(h1c0.f11814p0));
        this.f5868h.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f5868h.setStrokeWidth(this.f5873m);
        this.f5868h.setAntiAlias(true);
        ArrayList arrayList = new ArrayList();
        m7362g(this.f5863c, this.f5874n, this.f5861a, this.f5862b, arrayList);
        m7361f(3, this.f5874n, arrayList);
        m7364i(this.f5864d, this.f5874n, ((Float) arrayList.get(arrayList.size() - 1)).floatValue(), ((Float) arrayList.get(arrayList.size() - 2)).floatValue(), arrayList);
        m7361f(2, this.f5874n, arrayList);
        m7368m(this.f5863c, this.f5874n, ((Float) arrayList.get(arrayList.size() - 2)).floatValue(), ((Float) arrayList.get(arrayList.size() - 1)).floatValue(), arrayList);
        m7361f(1, this.f5874n, arrayList);
        m7369n(this.f5864d, this.f5874n, ((Float) arrayList.get(arrayList.size() - 1)).floatValue(), ((Float) arrayList.get(arrayList.size() - 2)).floatValue(), arrayList);
        int i = 0;
        m7361f(0, this.f5874n, arrayList);
        m7363h(this.f5863c, this.f5874n, this.f5861a, this.f5862b, arrayList);
        this.f5865e = new float[arrayList.size()];
        while (true) {
            int size = arrayList.size();
            float[] fArr = this.f5865e;
            if (i >= size) {
                m7371p(fArr);
                return;
            } else {
                fArr[i] = ((Float) arrayList.get(i)).floatValue();
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m7367l(ValueAnimator valueAnimator) {
        int iFloatValue = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float[] fArr = this.f5865e;
        int length = (iFloatValue * fArr.length) / 100;
        this.f5866f = length;
        if (length % 2 > 0) {
            length--;
        }
        this.f5866f = length;
        if (length >= 0) {
            this.f5867g = Arrays.copyOfRange(fArr, length, fArr.length);
            invalidate();
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m7368m(float f, float f2, float f3, float f4, List<Float> list) {
        int i = 1;
        while (true) {
            float f5 = i;
            if (f5 >= f - (2.0f * f2)) {
                return;
            }
            list.add(Float.valueOf(f3 - f5));
            list.add(Float.valueOf(f4));
            i++;
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m7369n(float f, float f2, float f3, float f4, List<Float> list) {
        int i = 1;
        while (true) {
            float f5 = i;
            if (f5 >= f - (2.0f * f2)) {
                return;
            }
            list.add(Float.valueOf(f4));
            list.add(Float.valueOf(f3 - f5));
            i++;
        }
    }

    /* JADX INFO: renamed from: o */
    public void m7370o() {
        if (this.f5877q) {
            setVisibility(0);
            this.f5876p.removeAllListeners();
            this.f5876p.removeAllUpdateListeners();
            this.f5876p.setInterpolator(new LinearInterpolator());
            this.f5876p.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.xm20
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f22351a.m7367l(valueAnimator);
                }
            });
            this.f5876p.addListener(new C0398a());
            this.f5876p.start();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float[] fArr;
        super.onDraw(canvas);
        if (!this.f5877q || (fArr = this.f5867g) == null) {
            return;
        }
        canvas.drawPoints(fArr, this.f5868h);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f5877q) {
            return;
        }
        this.f5864d = getMeasuredHeight() - t100.d(1.2f);
        this.f5863c = getMeasuredWidth() - t100.d(1.55f);
        this.f5861a = t100.d(11.75f);
        this.f5862b = t100.d(0.3f);
        m7366k();
        this.f5877q = true;
    }

    /* JADX INFO: renamed from: p */
    public final void m7371p(float[] fArr) {
        for (int i = 0; i < fArr.length / 2; i += 2) {
            float f = fArr[i];
            fArr[i] = fArr[(fArr.length - i) - 2];
            fArr[(fArr.length - i) - 2] = f;
            int i2 = i + 1;
            float f2 = fArr[i2];
            fArr[i2] = fArr[(fArr.length - i) - 1];
            fArr[(fArr.length - i) - 1] = f2;
        }
    }

    public void setCountdownTime(long j) {
        this.f5878r = j;
        this.f5876p = m7365j(j);
    }

    public void setOnCountDownListener(InterfaceC0399b interfaceC0399b) {
        this.f5875o = interfaceC0399b;
    }

    public NewFastGiftCountDownView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NewFastGiftCountDownView(Context context) {
        this(context, null);
    }
}
