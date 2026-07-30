package com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.countdown;

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
import p149l.h1c0;
import p149l.kvc0;
import p149l.t100;

/* JADX INFO: loaded from: classes4.dex */
public class NewFastGiftCountDownView extends View {

    /* JADX INFO: renamed from: a */
    public float f49819a;

    /* JADX INFO: renamed from: b */
    public float f49820b;

    /* JADX INFO: renamed from: c */
    public float f49821c;

    /* JADX INFO: renamed from: d */
    public float f49822d;

    /* JADX INFO: renamed from: e */
    public float[] f49823e;

    /* JADX INFO: renamed from: f */
    public int f49824f;

    /* JADX INFO: renamed from: g */
    public float[] f49825g;

    /* JADX INFO: renamed from: h */
    public Paint f49826h;

    /* JADX INFO: renamed from: i */
    public final int f49827i;

    /* JADX INFO: renamed from: j */
    public final int f49828j;

    /* JADX INFO: renamed from: k */
    public final int f49829k;

    /* JADX INFO: renamed from: l */
    public final int f49830l;

    /* JADX INFO: renamed from: m */
    public final float f49831m;

    /* JADX INFO: renamed from: n */
    public final float f49832n;

    /* JADX INFO: renamed from: o */
    public InterfaceC12810b f49833o;

    /* JADX INFO: renamed from: p */
    public ValueAnimator f49834p;

    /* JADX INFO: renamed from: q */
    public boolean f49835q;

    /* JADX INFO: renamed from: r */
    public long f49836r;

    /* JADX INFO: renamed from: s */
    public boolean f49837s;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.NewFastGiftCountDownView$a */
    public class C12809a extends AnimatorListenerAdapter {
        public C12809a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            NewFastGiftCountDownView.this.setVisibility(4);
            NewFastGiftCountDownView.this.f49837s = false;
            if (NewFastGiftCountDownView.this.f49833o != null) {
                NewFastGiftCountDownView.this.f49833o.mo73816a();
            }
            NewFastGiftCountDownView.this.f49824f = 0;
            NewFastGiftCountDownView.this.f49825g = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            NewFastGiftCountDownView.this.f49837s = true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.NewFastGiftCountDownView$b */
    public interface InterfaceC12810b {
        /* JADX INFO: renamed from: a */
        void mo73816a();
    }

    public NewFastGiftCountDownView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f49824f = 0;
        this.f49827i = 0;
        this.f49828j = 1;
        this.f49829k = 2;
        this.f49830l = 3;
        this.f49831m = t100.m186890d(3.0f);
        this.f49832n = t100.m186890d(10.0f);
        this.f49835q = false;
        this.f49836r = 3000L;
        this.f49837s = false;
        setWillNotDraw(false);
        this.f49834p = m73809j(this.f49836r);
    }

    /* JADX INFO: renamed from: f */
    public final void m73805f(int i, float f, List<Float> list) {
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
    public final void m73806g(float f, float f2, float f3, float f4, List<Float> list) {
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
    public final void m73807h(float f, float f2, float f3, float f4, List<Float> list) {
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
    public final void m73808i(float f, float f2, float f3, float f4, List<Float> list) {
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
    public final ValueAnimator m73809j(long j) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 100.0f);
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setRepeatCount(0);
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: k */
    public final void m73810k() {
        Paint paint = new Paint();
        this.f49826h = paint;
        paint.setColor(kvc0.m147352a(h1c0.f105394p0));
        this.f49826h.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f49826h.setStrokeWidth(this.f49831m);
        this.f49826h.setAntiAlias(true);
        ArrayList arrayList = new ArrayList();
        m73806g(this.f49821c, this.f49832n, this.f49819a, this.f49820b, arrayList);
        m73805f(3, this.f49832n, arrayList);
        m73808i(this.f49822d, this.f49832n, ((Float) arrayList.get(arrayList.size() - 1)).floatValue(), ((Float) arrayList.get(arrayList.size() - 2)).floatValue(), arrayList);
        m73805f(2, this.f49832n, arrayList);
        m73812m(this.f49821c, this.f49832n, ((Float) arrayList.get(arrayList.size() - 2)).floatValue(), ((Float) arrayList.get(arrayList.size() - 1)).floatValue(), arrayList);
        m73805f(1, this.f49832n, arrayList);
        m73813n(this.f49822d, this.f49832n, ((Float) arrayList.get(arrayList.size() - 1)).floatValue(), ((Float) arrayList.get(arrayList.size() - 2)).floatValue(), arrayList);
        int i = 0;
        m73805f(0, this.f49832n, arrayList);
        m73807h(this.f49821c, this.f49832n, this.f49819a, this.f49820b, arrayList);
        this.f49823e = new float[arrayList.size()];
        while (true) {
            int size = arrayList.size();
            float[] fArr = this.f49823e;
            if (i >= size) {
                m73815p(fArr);
                return;
            } else {
                fArr[i] = ((Float) arrayList.get(i)).floatValue();
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m73811l(ValueAnimator valueAnimator) {
        int iFloatValue = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float[] fArr = this.f49823e;
        int length = (iFloatValue * fArr.length) / 100;
        this.f49824f = length;
        if (length % 2 > 0) {
            length--;
        }
        this.f49824f = length;
        if (length >= 0) {
            this.f49825g = Arrays.copyOfRange(fArr, length, fArr.length);
            invalidate();
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m73812m(float f, float f2, float f3, float f4, List<Float> list) {
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
    public final void m73813n(float f, float f2, float f3, float f4, List<Float> list) {
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
    public void m73814o() {
        if (this.f49835q) {
            setVisibility(0);
            this.f49834p.removeAllListeners();
            this.f49834p.removeAllUpdateListeners();
            this.f49834p.setInterpolator(new LinearInterpolator());
            this.f49834p.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.xm20
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f193528a.m73811l(valueAnimator);
                }
            });
            this.f49834p.addListener(new C12809a());
            this.f49834p.start();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float[] fArr;
        super.onDraw(canvas);
        if (!this.f49835q || (fArr = this.f49825g) == null) {
            return;
        }
        canvas.drawPoints(fArr, this.f49826h);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f49835q) {
            return;
        }
        this.f49822d = getMeasuredHeight() - t100.m186890d(1.2f);
        this.f49821c = getMeasuredWidth() - t100.m186890d(1.55f);
        this.f49819a = t100.m186890d(11.75f);
        this.f49820b = t100.m186890d(0.3f);
        m73810k();
        this.f49835q = true;
    }

    /* JADX INFO: renamed from: p */
    public final void m73815p(float[] fArr) {
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
        this.f49836r = j;
        this.f49834p = m73809j(j);
    }

    public void setOnCountDownListener(InterfaceC12810b interfaceC12810b) {
        this.f49833o = interfaceC12810b;
    }

    public NewFastGiftCountDownView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NewFastGiftCountDownView(Context context) {
        this(context, null);
    }
}
