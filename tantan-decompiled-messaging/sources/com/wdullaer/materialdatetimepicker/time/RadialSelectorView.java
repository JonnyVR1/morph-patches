package com.wdullaer.materialdatetimepicker.time;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Log;
import android.view.View;
import com.wdullaer.materialdatetimepicker.R$string;

/* JADX INFO: loaded from: classes2.dex */
public class RadialSelectorView extends View {

    /* JADX INFO: renamed from: a */
    private final Paint f61394a;

    /* JADX INFO: renamed from: b */
    private boolean f61395b;

    /* JADX INFO: renamed from: c */
    private boolean f61396c;

    /* JADX INFO: renamed from: d */
    private float f61397d;

    /* JADX INFO: renamed from: e */
    private float f61398e;

    /* JADX INFO: renamed from: f */
    private float f61399f;

    /* JADX INFO: renamed from: g */
    private float f61400g;

    /* JADX INFO: renamed from: h */
    private float f61401h;

    /* JADX INFO: renamed from: i */
    private float f61402i;

    /* JADX INFO: renamed from: j */
    private float f61403j;

    /* JADX INFO: renamed from: k */
    private boolean f61404k;

    /* JADX INFO: renamed from: l */
    private boolean f61405l;

    /* JADX INFO: renamed from: m */
    private int f61406m;

    /* JADX INFO: renamed from: n */
    private int f61407n;

    /* JADX INFO: renamed from: o */
    private int f61408o;

    /* JADX INFO: renamed from: p */
    private int f61409p;

    /* JADX INFO: renamed from: q */
    private float f61410q;

    /* JADX INFO: renamed from: r */
    private float f61411r;

    /* JADX INFO: renamed from: s */
    private int f61412s;

    /* JADX INFO: renamed from: t */
    private int f61413t;

    /* JADX INFO: renamed from: u */
    private C14677b f61414u;

    /* JADX INFO: renamed from: v */
    private int f61415v;

    /* JADX INFO: renamed from: w */
    private double f61416w;

    /* JADX INFO: renamed from: x */
    private boolean f61417x;

    /* JADX INFO: renamed from: com.wdullaer.materialdatetimepicker.time.RadialSelectorView$b */
    public class C14677b implements ValueAnimator.AnimatorUpdateListener {
        private C14677b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            RadialSelectorView.this.invalidate();
        }
    }

    public RadialSelectorView(Context context) {
        super(context);
        this.f61394a = new Paint();
        this.f61395b = false;
    }

    /* JADX INFO: renamed from: a */
    public int m85191a(float f, float f2, boolean z, Boolean[] boolArr) {
        if (!this.f61396c) {
            return -1;
        }
        int i = this.f61408o;
        float f3 = (f2 - i) * (f2 - i);
        int i2 = this.f61407n;
        double dSqrt = Math.sqrt(f3 + ((f - i2) * (f - i2)));
        if (this.f61405l) {
            int i3 = this.f61409p;
            if (z) {
                boolArr[0] = Boolean.valueOf(((int) Math.abs(dSqrt - ((double) ((int) (((float) i3) * this.f61399f))))) <= ((int) Math.abs(dSqrt - ((double) ((int) (((float) this.f61409p) * this.f61400g))))));
            } else {
                float f4 = this.f61399f;
                int i4 = this.f61413t;
                int i5 = ((int) (i3 * f4)) - i4;
                float f5 = this.f61400g;
                int i6 = ((int) (i3 * f5)) + i4;
                int i7 = (int) (i3 * ((f5 + f4) / 2.0f));
                if (dSqrt >= i5 && dSqrt <= i7) {
                    boolArr[0] = Boolean.TRUE;
                } else {
                    if (dSqrt > i6 || dSqrt < i7) {
                        return -1;
                    }
                    boolArr[0] = Boolean.FALSE;
                }
            }
        } else if (!z && ((int) Math.abs(dSqrt - ((double) this.f61412s))) > ((int) (this.f61409p * (1.0f - this.f61401h)))) {
            return -1;
        }
        int iAsin = (int) ((Math.asin(((double) Math.abs(f2 - this.f61408o)) / dSqrt) * 180.0d) / 3.141592653589793d);
        boolean z2 = f > ((float) this.f61407n);
        boolean z3 = f2 < ((float) this.f61408o);
        if (z2 && z3) {
            return 90 - iAsin;
        }
        if (z2 && !z3) {
            return iAsin + 90;
        }
        if (z2 || z3) {
            return (z2 || !z3) ? iAsin : iAsin + 270;
        }
        return 270 - iAsin;
    }

    /* JADX INFO: renamed from: b */
    public void m85192b(Context context, InterfaceC14690a interfaceC14690a, boolean z, boolean z2, int i, boolean z3) {
        if (this.f61395b) {
            Log.e("RadialSelectorView", "This RadialSelectorView may only be initialized once.");
            return;
        }
        Resources resources = context.getResources();
        this.f61394a.setColor(interfaceC14690a.mo85229u());
        this.f61394a.setAntiAlias(true);
        interfaceC14690a.mo85232z();
        this.f61406m = 255;
        boolean zMo85226f = interfaceC14690a.mo85226f();
        this.f61404k = zMo85226f;
        if (zMo85226f || interfaceC14690a.getVersion() != TimePickerDialog.Version.VERSION_1) {
            this.f61397d = Float.parseFloat(resources.getString(R$string.f61159d));
        } else {
            this.f61397d = Float.parseFloat(resources.getString(R$string.f61158c));
            this.f61398e = Float.parseFloat(resources.getString(R$string.f61156a));
        }
        this.f61405l = z;
        if (z) {
            this.f61399f = Float.parseFloat(resources.getString(R$string.f61166k));
            this.f61400g = Float.parseFloat(resources.getString(R$string.f61168m));
        } else {
            this.f61401h = Float.parseFloat(resources.getString(R$string.f61167l));
        }
        this.f61402i = Float.parseFloat(resources.getString(R$string.f61178w));
        this.f61403j = 1.0f;
        this.f61410q = ((z2 ? -1 : 1) * 0.05f) + 1.0f;
        this.f61411r = ((z2 ? 1 : -1) * 0.3f) + 1.0f;
        this.f61414u = new C14677b();
        m85193c(i, z3, false);
        this.f61395b = true;
    }

    /* JADX INFO: renamed from: c */
    public void m85193c(int i, boolean z, boolean z2) {
        this.f61415v = i;
        this.f61416w = (((double) i) * 3.141592653589793d) / 180.0d;
        this.f61417x = z2;
        if (this.f61405l) {
            if (z) {
                this.f61401h = this.f61399f;
            } else {
                this.f61401h = this.f61400g;
            }
        }
    }

    public ObjectAnimator getDisappearAnimator() {
        if (!this.f61395b || !this.f61396c) {
            Log.e("RadialSelectorView", "RadialSelectorView was not ready for animation.");
            return null;
        }
        ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofKeyframe("animationRadiusMultiplier", Keyframe.ofFloat(0.0f, 1.0f), Keyframe.ofFloat(0.2f, this.f61410q), Keyframe.ofFloat(1.0f, this.f61411r)), PropertyValuesHolder.ofKeyframe("alpha", Keyframe.ofFloat(0.0f, 1.0f), Keyframe.ofFloat(1.0f, 0.0f))).setDuration(500L);
        duration.addUpdateListener(this.f61414u);
        return duration;
    }

    public ObjectAnimator getReappearAnimator() {
        if (!this.f61395b || !this.f61396c) {
            Log.e("RadialSelectorView", "RadialSelectorView was not ready for animation.");
            return null;
        }
        ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofKeyframe("animationRadiusMultiplier", Keyframe.ofFloat(0.0f, this.f61411r), Keyframe.ofFloat(0.2f, this.f61411r), Keyframe.ofFloat(0.84f, this.f61410q), Keyframe.ofFloat(1.0f, 1.0f)), PropertyValuesHolder.ofKeyframe("alpha", Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(0.2f, 0.0f), Keyframe.ofFloat(1.0f, 1.0f))).setDuration(625L);
        duration.addUpdateListener(this.f61414u);
        return duration;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (getWidth() == 0 || !this.f61395b) {
            return;
        }
        if (!this.f61396c) {
            this.f61407n = getWidth() / 2;
            int height = getHeight() / 2;
            this.f61408o = height;
            int iMin = (int) (Math.min(this.f61407n, height) * this.f61397d);
            this.f61409p = iMin;
            if (!this.f61404k) {
                this.f61408o = (int) (((double) this.f61408o) - (((double) ((int) (iMin * this.f61398e))) * 0.75d));
            }
            this.f61413t = (int) (iMin * this.f61402i);
            this.f61396c = true;
        }
        int i = (int) (this.f61409p * this.f61401h * this.f61403j);
        this.f61412s = i;
        int iSin = this.f61407n + ((int) (((double) i) * Math.sin(this.f61416w)));
        int iCos = this.f61408o - ((int) (((double) this.f61412s) * Math.cos(this.f61416w)));
        this.f61394a.setAlpha(this.f61406m);
        float f = iSin;
        float f2 = iCos;
        canvas.drawCircle(f, f2, this.f61413t, this.f61394a);
        if ((this.f61415v % 30 != 0) || this.f61417x) {
            this.f61394a.setAlpha(255);
            canvas.drawCircle(f, f2, (this.f61413t * 2) / 7, this.f61394a);
        } else {
            double d = this.f61412s - this.f61413t;
            int iSin2 = ((int) (Math.sin(this.f61416w) * d)) + this.f61407n;
            int iCos2 = this.f61408o - ((int) (d * Math.cos(this.f61416w)));
            iSin = iSin2;
            iCos = iCos2;
        }
        this.f61394a.setAlpha(255);
        this.f61394a.setStrokeWidth(3.0f);
        canvas.drawLine(this.f61407n, this.f61408o, iSin, iCos, this.f61394a);
    }

    public void setAnimationRadiusMultiplier(float f) {
        this.f61403j = f;
    }
}
