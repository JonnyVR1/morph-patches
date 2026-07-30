package com.wdullaer.materialdatetimepicker.time;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import com.wdullaer.materialdatetimepicker.R$string;
import p153l.j26;
import p153l.q9c0;

/* JADX INFO: loaded from: classes2.dex */
public class RadialTextsView extends View {

    /* JADX INFO: renamed from: A */
    private float[] f62266A;

    /* JADX INFO: renamed from: B */
    private float[] f62267B;

    /* JADX INFO: renamed from: C */
    private float[] f62268C;

    /* JADX INFO: renamed from: D */
    private float f62269D;

    /* JADX INFO: renamed from: E */
    private float f62270E;

    /* JADX INFO: renamed from: F */
    private float f62271F;

    /* JADX INFO: renamed from: G */
    ObjectAnimator f62272G;

    /* JADX INFO: renamed from: H */
    ObjectAnimator f62273H;

    /* JADX INFO: renamed from: I */
    private C14827b f62274I;

    /* JADX INFO: renamed from: a */
    private final Paint f62275a;

    /* JADX INFO: renamed from: b */
    private final Paint f62276b;

    /* JADX INFO: renamed from: c */
    private final Paint f62277c;

    /* JADX INFO: renamed from: d */
    private boolean f62278d;

    /* JADX INFO: renamed from: e */
    private boolean f62279e;

    /* JADX INFO: renamed from: f */
    private int f62280f;

    /* JADX INFO: renamed from: g */
    private InterfaceC14828c f62281g;

    /* JADX INFO: renamed from: h */
    private Typeface f62282h;

    /* JADX INFO: renamed from: i */
    private Typeface f62283i;

    /* JADX INFO: renamed from: j */
    private String[] f62284j;

    /* JADX INFO: renamed from: k */
    private String[] f62285k;

    /* JADX INFO: renamed from: l */
    private boolean f62286l;

    /* JADX INFO: renamed from: m */
    private boolean f62287m;

    /* JADX INFO: renamed from: n */
    private float f62288n;

    /* JADX INFO: renamed from: o */
    private float f62289o;

    /* JADX INFO: renamed from: p */
    private float f62290p;

    /* JADX INFO: renamed from: q */
    private float f62291q;

    /* JADX INFO: renamed from: r */
    private float f62292r;

    /* JADX INFO: renamed from: s */
    private float f62293s;

    /* JADX INFO: renamed from: t */
    private int f62294t;

    /* JADX INFO: renamed from: u */
    private int f62295u;

    /* JADX INFO: renamed from: v */
    private float f62296v;

    /* JADX INFO: renamed from: w */
    private boolean f62297w;

    /* JADX INFO: renamed from: x */
    private float f62298x;

    /* JADX INFO: renamed from: y */
    private float f62299y;

    /* JADX INFO: renamed from: z */
    private float[] f62300z;

    /* JADX INFO: renamed from: com.wdullaer.materialdatetimepicker.time.RadialTextsView$b */
    public class C14827b implements ValueAnimator.AnimatorUpdateListener {
        private C14827b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            RadialTextsView.this.invalidate();
        }
    }

    /* JADX INFO: renamed from: com.wdullaer.materialdatetimepicker.time.RadialTextsView$c */
    public interface InterfaceC14828c {
        /* JADX INFO: renamed from: a */
        boolean mo86358a(int i);
    }

    public RadialTextsView(Context context) {
        super(context);
        this.f62275a = new Paint();
        this.f62276b = new Paint();
        this.f62277c = new Paint();
        this.f62280f = -1;
        this.f62279e = false;
    }

    /* JADX INFO: renamed from: a */
    private Paint[] m86365a(String[] strArr) {
        Paint[] paintArr = new Paint[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            int i2 = Integer.parseInt(strArr[i]);
            if (i2 == this.f62280f) {
                paintArr[i] = this.f62276b;
            } else if (this.f62281g.mo86358a(i2)) {
                paintArr[i] = this.f62275a;
            } else {
                paintArr[i] = this.f62277c;
            }
        }
        return paintArr;
    }

    /* JADX INFO: renamed from: b */
    private void m86366b(float f, float f2, float f3, float f4, float[] fArr, float[] fArr2) {
        float fSqrt = (((float) Math.sqrt(3.0d)) * f) / 2.0f;
        float f5 = f / 2.0f;
        this.f62275a.setTextSize(f4);
        this.f62276b.setTextSize(f4);
        this.f62277c.setTextSize(f4);
        float fDescent = f3 - ((this.f62275a.descent() + this.f62275a.ascent()) / 2.0f);
        fArr[0] = fDescent - f;
        fArr2[0] = f2 - f;
        fArr[1] = fDescent - fSqrt;
        fArr2[1] = f2 - fSqrt;
        fArr[2] = fDescent - f5;
        fArr2[2] = f2 - f5;
        fArr[3] = fDescent;
        fArr2[3] = f2;
        fArr[4] = fDescent + f5;
        fArr2[4] = f5 + f2;
        fArr[5] = fDescent + fSqrt;
        fArr2[5] = fSqrt + f2;
        fArr[6] = fDescent + f;
        fArr2[6] = f2 + f;
    }

    /* JADX INFO: renamed from: c */
    private void m86367c(Canvas canvas, float f, Typeface typeface, String[] strArr, float[] fArr, float[] fArr2) {
        this.f62275a.setTextSize(f);
        this.f62275a.setTypeface(typeface);
        Paint[] paintArrM86365a = m86365a(strArr);
        canvas.drawText(strArr[0], fArr[3], fArr2[0], paintArrM86365a[0]);
        canvas.drawText(strArr[1], fArr[4], fArr2[1], paintArrM86365a[1]);
        canvas.drawText(strArr[2], fArr[5], fArr2[2], paintArrM86365a[2]);
        canvas.drawText(strArr[3], fArr[6], fArr2[3], paintArrM86365a[3]);
        canvas.drawText(strArr[4], fArr[5], fArr2[4], paintArrM86365a[4]);
        canvas.drawText(strArr[5], fArr[4], fArr2[5], paintArrM86365a[5]);
        canvas.drawText(strArr[6], fArr[3], fArr2[6], paintArrM86365a[6]);
        canvas.drawText(strArr[7], fArr[2], fArr2[5], paintArrM86365a[7]);
        canvas.drawText(strArr[8], fArr[1], fArr2[4], paintArrM86365a[8]);
        canvas.drawText(strArr[9], fArr[0], fArr2[3], paintArrM86365a[9]);
        canvas.drawText(strArr[10], fArr[1], fArr2[2], paintArrM86365a[10]);
        canvas.drawText(strArr[11], fArr[2], fArr2[1], paintArrM86365a[11]);
    }

    /* JADX INFO: renamed from: e */
    private void m86368e() {
        ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofKeyframe("animationRadiusMultiplier", Keyframe.ofFloat(0.0f, 1.0f), Keyframe.ofFloat(0.2f, this.f62270E), Keyframe.ofFloat(1.0f, this.f62271F)), PropertyValuesHolder.ofKeyframe("alpha", Keyframe.ofFloat(0.0f, 1.0f), Keyframe.ofFloat(1.0f, 0.0f))).setDuration(500L);
        this.f62272G = duration;
        duration.addUpdateListener(this.f62274I);
        ObjectAnimator duration2 = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofKeyframe("animationRadiusMultiplier", Keyframe.ofFloat(0.0f, this.f62271F), Keyframe.ofFloat(0.2f, this.f62271F), Keyframe.ofFloat(0.84f, this.f62270E), Keyframe.ofFloat(1.0f, 1.0f)), PropertyValuesHolder.ofKeyframe("alpha", Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(0.2f, 0.0f), Keyframe.ofFloat(1.0f, 1.0f))).setDuration(625L);
        this.f62273H = duration2;
        duration2.addUpdateListener(this.f62274I);
    }

    /* JADX INFO: renamed from: d */
    public void m86369d(Context context, String[] strArr, String[] strArr2, InterfaceC14838a interfaceC14838a, InterfaceC14828c interfaceC14828c, boolean z) {
        if (this.f62279e) {
            Log.e("RadialTextsView", "This RadialTextsView may only be initialized once.");
            return;
        }
        Resources resources = context.getResources();
        this.f62275a.setColor(j26.m143190c(context, interfaceC14838a.mo86403z() ? q9c0.f156236u : q9c0.f156234s));
        this.f62282h = Typeface.create(resources.getString(R$string.f62017o), 0);
        this.f62283i = Typeface.create(resources.getString(R$string.f62018p), 0);
        this.f62275a.setAntiAlias(true);
        Paint paint = this.f62275a;
        Paint.Align align = Paint.Align.CENTER;
        paint.setTextAlign(align);
        this.f62276b.setColor(j26.m143190c(context, q9c0.f156236u));
        this.f62276b.setAntiAlias(true);
        this.f62276b.setTextAlign(align);
        this.f62277c.setColor(j26.m143190c(context, interfaceC14838a.mo86403z() ? q9c0.f156226k : q9c0.f156225j));
        this.f62277c.setAntiAlias(true);
        this.f62277c.setTextAlign(align);
        this.f62284j = strArr;
        this.f62285k = strArr2;
        boolean zMo86397f = interfaceC14838a.mo86397f();
        this.f62286l = zMo86397f;
        this.f62287m = strArr2 != null;
        if (zMo86397f || interfaceC14838a.getVersion() != TimePickerDialog.Version.VERSION_1) {
            this.f62288n = Float.parseFloat(resources.getString(R$string.f62006d));
        } else {
            this.f62288n = Float.parseFloat(resources.getString(R$string.f62005c));
            this.f62289o = Float.parseFloat(resources.getString(R$string.f62003a));
        }
        this.f62300z = new float[7];
        this.f62266A = new float[7];
        if (this.f62287m) {
            this.f62290p = Float.parseFloat(resources.getString(R$string.f62015m));
            this.f62292r = Float.parseFloat(resources.getString(R$string.f62028z));
            this.f62291q = Float.parseFloat(resources.getString(R$string.f62013k));
            this.f62293s = Float.parseFloat(resources.getString(R$string.f62026x));
            this.f62267B = new float[7];
            this.f62268C = new float[7];
        } else {
            this.f62290p = Float.parseFloat(resources.getString(R$string.f62014l));
            this.f62292r = Float.parseFloat(resources.getString(R$string.f62027y));
        }
        this.f62269D = 1.0f;
        this.f62270E = ((z ? -1 : 1) * 0.05f) + 1.0f;
        this.f62271F = ((z ? 1 : -1) * 0.3f) + 1.0f;
        this.f62274I = new C14827b();
        this.f62281g = interfaceC14828c;
        this.f62297w = true;
        this.f62279e = true;
    }

    public ObjectAnimator getDisappearAnimator() {
        ObjectAnimator objectAnimator;
        if (this.f62279e && this.f62278d && (objectAnimator = this.f62272G) != null) {
            return objectAnimator;
        }
        Log.e("RadialTextsView", "RadialTextView was not ready for animation.");
        return null;
    }

    public ObjectAnimator getReappearAnimator() {
        ObjectAnimator objectAnimator;
        if (this.f62279e && this.f62278d && (objectAnimator = this.f62273H) != null) {
            return objectAnimator;
        }
        Log.e("RadialTextsView", "RadialTextView was not ready for animation.");
        return null;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (getWidth() == 0 || !this.f62279e) {
            return;
        }
        if (!this.f62278d) {
            this.f62294t = getWidth() / 2;
            int height = getHeight() / 2;
            this.f62295u = height;
            float fMin = Math.min(this.f62294t, height) * this.f62288n;
            this.f62296v = fMin;
            if (!this.f62286l) {
                this.f62295u = (int) (((double) this.f62295u) - (((double) (this.f62289o * fMin)) * 0.75d));
            }
            this.f62298x = this.f62292r * fMin;
            if (this.f62287m) {
                this.f62299y = fMin * this.f62293s;
            }
            m86368e();
            this.f62297w = true;
            this.f62278d = true;
        }
        if (this.f62297w) {
            m86366b(this.f62296v * this.f62290p * this.f62269D, this.f62294t, this.f62295u, this.f62298x, this.f62300z, this.f62266A);
            if (this.f62287m) {
                m86366b(this.f62296v * this.f62291q * this.f62269D, this.f62294t, this.f62295u, this.f62299y, this.f62267B, this.f62268C);
            }
            this.f62297w = false;
        }
        m86367c(canvas, this.f62298x, this.f62282h, this.f62284j, this.f62266A, this.f62300z);
        if (this.f62287m) {
            m86367c(canvas, this.f62299y, this.f62283i, this.f62285k, this.f62268C, this.f62267B);
        }
    }

    public void setAnimationRadiusMultiplier(float f) {
        this.f62269D = f;
        this.f62297w = true;
    }

    public void setSelection(int i) {
        this.f62280f = i;
    }
}
