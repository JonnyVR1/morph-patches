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
import p149l.e16;
import p149l.k1c0;

/* JADX INFO: loaded from: classes2.dex */
public class RadialTextsView extends View {

    /* JADX INFO: renamed from: A */
    private float[] f61419A;

    /* JADX INFO: renamed from: B */
    private float[] f61420B;

    /* JADX INFO: renamed from: C */
    private float[] f61421C;

    /* JADX INFO: renamed from: D */
    private float f61422D;

    /* JADX INFO: renamed from: E */
    private float f61423E;

    /* JADX INFO: renamed from: F */
    private float f61424F;

    /* JADX INFO: renamed from: G */
    ObjectAnimator f61425G;

    /* JADX INFO: renamed from: H */
    ObjectAnimator f61426H;

    /* JADX INFO: renamed from: I */
    private C14679b f61427I;

    /* JADX INFO: renamed from: a */
    private final Paint f61428a;

    /* JADX INFO: renamed from: b */
    private final Paint f61429b;

    /* JADX INFO: renamed from: c */
    private final Paint f61430c;

    /* JADX INFO: renamed from: d */
    private boolean f61431d;

    /* JADX INFO: renamed from: e */
    private boolean f61432e;

    /* JADX INFO: renamed from: f */
    private int f61433f;

    /* JADX INFO: renamed from: g */
    private InterfaceC14680c f61434g;

    /* JADX INFO: renamed from: h */
    private Typeface f61435h;

    /* JADX INFO: renamed from: i */
    private Typeface f61436i;

    /* JADX INFO: renamed from: j */
    private String[] f61437j;

    /* JADX INFO: renamed from: k */
    private String[] f61438k;

    /* JADX INFO: renamed from: l */
    private boolean f61439l;

    /* JADX INFO: renamed from: m */
    private boolean f61440m;

    /* JADX INFO: renamed from: n */
    private float f61441n;

    /* JADX INFO: renamed from: o */
    private float f61442o;

    /* JADX INFO: renamed from: p */
    private float f61443p;

    /* JADX INFO: renamed from: q */
    private float f61444q;

    /* JADX INFO: renamed from: r */
    private float f61445r;

    /* JADX INFO: renamed from: s */
    private float f61446s;

    /* JADX INFO: renamed from: t */
    private int f61447t;

    /* JADX INFO: renamed from: u */
    private int f61448u;

    /* JADX INFO: renamed from: v */
    private float f61449v;

    /* JADX INFO: renamed from: w */
    private boolean f61450w;

    /* JADX INFO: renamed from: x */
    private float f61451x;

    /* JADX INFO: renamed from: y */
    private float f61452y;

    /* JADX INFO: renamed from: z */
    private float[] f61453z;

    /* JADX INFO: renamed from: com.wdullaer.materialdatetimepicker.time.RadialTextsView$b */
    public class C14679b implements ValueAnimator.AnimatorUpdateListener {
        private C14679b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            RadialTextsView.this.invalidate();
        }
    }

    /* JADX INFO: renamed from: com.wdullaer.materialdatetimepicker.time.RadialTextsView$c */
    public interface InterfaceC14680c {
        /* JADX INFO: renamed from: a */
        boolean mo85187a(int i);
    }

    public RadialTextsView(Context context) {
        super(context);
        this.f61428a = new Paint();
        this.f61429b = new Paint();
        this.f61430c = new Paint();
        this.f61433f = -1;
        this.f61432e = false;
    }

    /* JADX INFO: renamed from: a */
    private Paint[] m85194a(String[] strArr) {
        Paint[] paintArr = new Paint[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            int i2 = Integer.parseInt(strArr[i]);
            if (i2 == this.f61433f) {
                paintArr[i] = this.f61429b;
            } else if (this.f61434g.mo85187a(i2)) {
                paintArr[i] = this.f61428a;
            } else {
                paintArr[i] = this.f61430c;
            }
        }
        return paintArr;
    }

    /* JADX INFO: renamed from: b */
    private void m85195b(float f, float f2, float f3, float f4, float[] fArr, float[] fArr2) {
        float fSqrt = (((float) Math.sqrt(3.0d)) * f) / 2.0f;
        float f5 = f / 2.0f;
        this.f61428a.setTextSize(f4);
        this.f61429b.setTextSize(f4);
        this.f61430c.setTextSize(f4);
        float fDescent = f3 - ((this.f61428a.descent() + this.f61428a.ascent()) / 2.0f);
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
    private void m85196c(Canvas canvas, float f, Typeface typeface, String[] strArr, float[] fArr, float[] fArr2) {
        this.f61428a.setTextSize(f);
        this.f61428a.setTypeface(typeface);
        Paint[] paintArrM85194a = m85194a(strArr);
        canvas.drawText(strArr[0], fArr[3], fArr2[0], paintArrM85194a[0]);
        canvas.drawText(strArr[1], fArr[4], fArr2[1], paintArrM85194a[1]);
        canvas.drawText(strArr[2], fArr[5], fArr2[2], paintArrM85194a[2]);
        canvas.drawText(strArr[3], fArr[6], fArr2[3], paintArrM85194a[3]);
        canvas.drawText(strArr[4], fArr[5], fArr2[4], paintArrM85194a[4]);
        canvas.drawText(strArr[5], fArr[4], fArr2[5], paintArrM85194a[5]);
        canvas.drawText(strArr[6], fArr[3], fArr2[6], paintArrM85194a[6]);
        canvas.drawText(strArr[7], fArr[2], fArr2[5], paintArrM85194a[7]);
        canvas.drawText(strArr[8], fArr[1], fArr2[4], paintArrM85194a[8]);
        canvas.drawText(strArr[9], fArr[0], fArr2[3], paintArrM85194a[9]);
        canvas.drawText(strArr[10], fArr[1], fArr2[2], paintArrM85194a[10]);
        canvas.drawText(strArr[11], fArr[2], fArr2[1], paintArrM85194a[11]);
    }

    /* JADX INFO: renamed from: e */
    private void m85197e() {
        ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofKeyframe("animationRadiusMultiplier", Keyframe.ofFloat(0.0f, 1.0f), Keyframe.ofFloat(0.2f, this.f61423E), Keyframe.ofFloat(1.0f, this.f61424F)), PropertyValuesHolder.ofKeyframe("alpha", Keyframe.ofFloat(0.0f, 1.0f), Keyframe.ofFloat(1.0f, 0.0f))).setDuration(500L);
        this.f61425G = duration;
        duration.addUpdateListener(this.f61427I);
        ObjectAnimator duration2 = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofKeyframe("animationRadiusMultiplier", Keyframe.ofFloat(0.0f, this.f61424F), Keyframe.ofFloat(0.2f, this.f61424F), Keyframe.ofFloat(0.84f, this.f61423E), Keyframe.ofFloat(1.0f, 1.0f)), PropertyValuesHolder.ofKeyframe("alpha", Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(0.2f, 0.0f), Keyframe.ofFloat(1.0f, 1.0f))).setDuration(625L);
        this.f61426H = duration2;
        duration2.addUpdateListener(this.f61427I);
    }

    /* JADX INFO: renamed from: d */
    public void m85198d(Context context, String[] strArr, String[] strArr2, InterfaceC14690a interfaceC14690a, InterfaceC14680c interfaceC14680c, boolean z) {
        if (this.f61432e) {
            Log.e("RadialTextsView", "This RadialTextsView may only be initialized once.");
            return;
        }
        Resources resources = context.getResources();
        this.f61428a.setColor(e16.m114375c(context, interfaceC14690a.mo85232z() ? k1c0.f120578u : k1c0.f120576s));
        this.f61435h = Typeface.create(resources.getString(R$string.f61170o), 0);
        this.f61436i = Typeface.create(resources.getString(R$string.f61171p), 0);
        this.f61428a.setAntiAlias(true);
        Paint paint = this.f61428a;
        Paint.Align align = Paint.Align.CENTER;
        paint.setTextAlign(align);
        this.f61429b.setColor(e16.m114375c(context, k1c0.f120578u));
        this.f61429b.setAntiAlias(true);
        this.f61429b.setTextAlign(align);
        this.f61430c.setColor(e16.m114375c(context, interfaceC14690a.mo85232z() ? k1c0.f120568k : k1c0.f120567j));
        this.f61430c.setAntiAlias(true);
        this.f61430c.setTextAlign(align);
        this.f61437j = strArr;
        this.f61438k = strArr2;
        boolean zMo85226f = interfaceC14690a.mo85226f();
        this.f61439l = zMo85226f;
        this.f61440m = strArr2 != null;
        if (zMo85226f || interfaceC14690a.getVersion() != TimePickerDialog.Version.VERSION_1) {
            this.f61441n = Float.parseFloat(resources.getString(R$string.f61159d));
        } else {
            this.f61441n = Float.parseFloat(resources.getString(R$string.f61158c));
            this.f61442o = Float.parseFloat(resources.getString(R$string.f61156a));
        }
        this.f61453z = new float[7];
        this.f61419A = new float[7];
        if (this.f61440m) {
            this.f61443p = Float.parseFloat(resources.getString(R$string.f61168m));
            this.f61445r = Float.parseFloat(resources.getString(R$string.f61181z));
            this.f61444q = Float.parseFloat(resources.getString(R$string.f61166k));
            this.f61446s = Float.parseFloat(resources.getString(R$string.f61179x));
            this.f61420B = new float[7];
            this.f61421C = new float[7];
        } else {
            this.f61443p = Float.parseFloat(resources.getString(R$string.f61167l));
            this.f61445r = Float.parseFloat(resources.getString(R$string.f61180y));
        }
        this.f61422D = 1.0f;
        this.f61423E = ((z ? -1 : 1) * 0.05f) + 1.0f;
        this.f61424F = ((z ? 1 : -1) * 0.3f) + 1.0f;
        this.f61427I = new C14679b();
        this.f61434g = interfaceC14680c;
        this.f61450w = true;
        this.f61432e = true;
    }

    public ObjectAnimator getDisappearAnimator() {
        ObjectAnimator objectAnimator;
        if (this.f61432e && this.f61431d && (objectAnimator = this.f61425G) != null) {
            return objectAnimator;
        }
        Log.e("RadialTextsView", "RadialTextView was not ready for animation.");
        return null;
    }

    public ObjectAnimator getReappearAnimator() {
        ObjectAnimator objectAnimator;
        if (this.f61432e && this.f61431d && (objectAnimator = this.f61426H) != null) {
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
        if (getWidth() == 0 || !this.f61432e) {
            return;
        }
        if (!this.f61431d) {
            this.f61447t = getWidth() / 2;
            int height = getHeight() / 2;
            this.f61448u = height;
            float fMin = Math.min(this.f61447t, height) * this.f61441n;
            this.f61449v = fMin;
            if (!this.f61439l) {
                this.f61448u = (int) (((double) this.f61448u) - (((double) (this.f61442o * fMin)) * 0.75d));
            }
            this.f61451x = this.f61445r * fMin;
            if (this.f61440m) {
                this.f61452y = fMin * this.f61446s;
            }
            m85197e();
            this.f61450w = true;
            this.f61431d = true;
        }
        if (this.f61450w) {
            m85195b(this.f61449v * this.f61443p * this.f61422D, this.f61447t, this.f61448u, this.f61451x, this.f61453z, this.f61419A);
            if (this.f61440m) {
                m85195b(this.f61449v * this.f61444q * this.f61422D, this.f61447t, this.f61448u, this.f61452y, this.f61420B, this.f61421C);
            }
            this.f61450w = false;
        }
        m85196c(canvas, this.f61451x, this.f61435h, this.f61437j, this.f61419A, this.f61453z);
        if (this.f61440m) {
            m85196c(canvas, this.f61452y, this.f61436i, this.f61438k, this.f61421C, this.f61420B);
        }
    }

    public void setAnimationRadiusMultiplier(float f) {
        this.f61422D = f;
        this.f61450w = true;
    }

    public void setSelection(int i) {
        this.f61433f = i;
    }
}
