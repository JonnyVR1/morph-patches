package com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.countdown;

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
import p153l.n3d0;
import p153l.n9c0;
import p153l.qa00;

/* JADX INFO: loaded from: classes4.dex */
public class NewFastGiftCountDownView extends View {

    /* JADX INFO: renamed from: a */
    public float f50667a;

    /* JADX INFO: renamed from: b */
    public float f50668b;

    /* JADX INFO: renamed from: c */
    public float f50669c;

    /* JADX INFO: renamed from: d */
    public float f50670d;

    /* JADX INFO: renamed from: e */
    public float[] f50671e;

    /* JADX INFO: renamed from: f */
    public int f50672f;

    /* JADX INFO: renamed from: g */
    public float[] f50673g;

    /* JADX INFO: renamed from: h */
    public Paint f50674h;

    /* JADX INFO: renamed from: i */
    public final int f50675i;

    /* JADX INFO: renamed from: j */
    public final int f50676j;

    /* JADX INFO: renamed from: k */
    public final int f50677k;

    /* JADX INFO: renamed from: l */
    public final int f50678l;

    /* JADX INFO: renamed from: m */
    public final float f50679m;

    /* JADX INFO: renamed from: n */
    public final float f50680n;

    /* JADX INFO: renamed from: o */
    public InterfaceC12973b f50681o;

    /* JADX INFO: renamed from: p */
    public ValueAnimator f50682p;

    /* JADX INFO: renamed from: q */
    public boolean f50683q;

    /* JADX INFO: renamed from: r */
    public long f50684r;

    /* JADX INFO: renamed from: s */
    public boolean f50685s;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.NewFastGiftCountDownView$a */
    public class C12972a extends AnimatorListenerAdapter {
        public C12972a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            NewFastGiftCountDownView.this.setVisibility(4);
            NewFastGiftCountDownView.this.f50685s = false;
            if (NewFastGiftCountDownView.this.f50681o != null) {
                NewFastGiftCountDownView.this.f50681o.mo74999a();
            }
            NewFastGiftCountDownView.this.f50672f = 0;
            NewFastGiftCountDownView.this.f50673g = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            NewFastGiftCountDownView.this.f50685s = true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.NewFastGiftCountDownView$b */
    public interface InterfaceC12973b {
        /* JADX INFO: renamed from: a */
        void mo74999a();
    }

    public NewFastGiftCountDownView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f50672f = 0;
        this.f50675i = 0;
        this.f50676j = 1;
        this.f50677k = 2;
        this.f50678l = 3;
        this.f50679m = qa00.m175859d(3.0f);
        this.f50680n = qa00.m175859d(10.0f);
        this.f50683q = false;
        this.f50684r = 3000L;
        this.f50685s = false;
        setWillNotDraw(false);
        this.f50682p = m74992j(this.f50684r);
    }

    /* JADX INFO: renamed from: f */
    public final void m74988f(int i, float f, List<Float> list) {
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
    public final void m74989g(float f, float f2, float f3, float f4, List<Float> list) {
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
    public final void m74990h(float f, float f2, float f3, float f4, List<Float> list) {
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
    public final void m74991i(float f, float f2, float f3, float f4, List<Float> list) {
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
    public final ValueAnimator m74992j(long j) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 100.0f);
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setRepeatCount(0);
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: k */
    public final void m74993k() {
        Paint paint = new Paint();
        this.f50674h = paint;
        paint.setColor(n3d0.m161277a(n9c0.f140855p0));
        this.f50674h.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f50674h.setStrokeWidth(this.f50679m);
        this.f50674h.setAntiAlias(true);
        ArrayList arrayList = new ArrayList();
        m74989g(this.f50669c, this.f50680n, this.f50667a, this.f50668b, arrayList);
        m74988f(3, this.f50680n, arrayList);
        m74991i(this.f50670d, this.f50680n, ((Float) arrayList.get(arrayList.size() - 1)).floatValue(), ((Float) arrayList.get(arrayList.size() - 2)).floatValue(), arrayList);
        m74988f(2, this.f50680n, arrayList);
        m74995m(this.f50669c, this.f50680n, ((Float) arrayList.get(arrayList.size() - 2)).floatValue(), ((Float) arrayList.get(arrayList.size() - 1)).floatValue(), arrayList);
        m74988f(1, this.f50680n, arrayList);
        m74996n(this.f50670d, this.f50680n, ((Float) arrayList.get(arrayList.size() - 1)).floatValue(), ((Float) arrayList.get(arrayList.size() - 2)).floatValue(), arrayList);
        int i = 0;
        m74988f(0, this.f50680n, arrayList);
        m74990h(this.f50669c, this.f50680n, this.f50667a, this.f50668b, arrayList);
        this.f50671e = new float[arrayList.size()];
        while (true) {
            int size = arrayList.size();
            float[] fArr = this.f50671e;
            if (i >= size) {
                m74998p(fArr);
                return;
            } else {
                fArr[i] = ((Float) arrayList.get(i)).floatValue();
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m74994l(ValueAnimator valueAnimator) {
        int iFloatValue = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float[] fArr = this.f50671e;
        int length = (iFloatValue * fArr.length) / 100;
        this.f50672f = length;
        if (length % 2 > 0) {
            length--;
        }
        this.f50672f = length;
        if (length >= 0) {
            this.f50673g = Arrays.copyOfRange(fArr, length, fArr.length);
            invalidate();
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m74995m(float f, float f2, float f3, float f4, List<Float> list) {
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
    public final void m74996n(float f, float f2, float f3, float f4, List<Float> list) {
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
    public void m74997o() {
        if (this.f50683q) {
            setVisibility(0);
            this.f50682p.removeAllListeners();
            this.f50682p.removeAllUpdateListeners();
            this.f50682p.setInterpolator(new LinearInterpolator());
            this.f50682p.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.hv20
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f111724a.m74994l(valueAnimator);
                }
            });
            this.f50682p.addListener(new C12972a());
            this.f50682p.start();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float[] fArr;
        super.onDraw(canvas);
        if (!this.f50683q || (fArr = this.f50673g) == null) {
            return;
        }
        canvas.drawPoints(fArr, this.f50674h);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f50683q) {
            return;
        }
        this.f50670d = getMeasuredHeight() - qa00.m175859d(1.2f);
        this.f50669c = getMeasuredWidth() - qa00.m175859d(1.55f);
        this.f50667a = qa00.m175859d(11.75f);
        this.f50668b = qa00.m175859d(0.3f);
        m74993k();
        this.f50683q = true;
    }

    /* JADX INFO: renamed from: p */
    public final void m74998p(float[] fArr) {
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
        this.f50684r = j;
        this.f50682p = m74992j(j);
    }

    public void setOnCountDownListener(InterfaceC12973b interfaceC12973b) {
        this.f50681o = interfaceC12973b;
    }

    public NewFastGiftCountDownView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NewFastGiftCountDownView(Context context) {
        this(context, null);
    }
}
