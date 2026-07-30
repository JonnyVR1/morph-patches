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
    private final Paint f62241a;

    /* JADX INFO: renamed from: b */
    private boolean f62242b;

    /* JADX INFO: renamed from: c */
    private boolean f62243c;

    /* JADX INFO: renamed from: d */
    private float f62244d;

    /* JADX INFO: renamed from: e */
    private float f62245e;

    /* JADX INFO: renamed from: f */
    private float f62246f;

    /* JADX INFO: renamed from: g */
    private float f62247g;

    /* JADX INFO: renamed from: h */
    private float f62248h;

    /* JADX INFO: renamed from: i */
    private float f62249i;

    /* JADX INFO: renamed from: j */
    private float f62250j;

    /* JADX INFO: renamed from: k */
    private boolean f62251k;

    /* JADX INFO: renamed from: l */
    private boolean f62252l;

    /* JADX INFO: renamed from: m */
    private int f62253m;

    /* JADX INFO: renamed from: n */
    private int f62254n;

    /* JADX INFO: renamed from: o */
    private int f62255o;

    /* JADX INFO: renamed from: p */
    private int f62256p;

    /* JADX INFO: renamed from: q */
    private float f62257q;

    /* JADX INFO: renamed from: r */
    private float f62258r;

    /* JADX INFO: renamed from: s */
    private int f62259s;

    /* JADX INFO: renamed from: t */
    private int f62260t;

    /* JADX INFO: renamed from: u */
    private C14825b f62261u;

    /* JADX INFO: renamed from: v */
    private int f62262v;

    /* JADX INFO: renamed from: w */
    private double f62263w;

    /* JADX INFO: renamed from: x */
    private boolean f62264x;

    /* JADX INFO: renamed from: com.wdullaer.materialdatetimepicker.time.RadialSelectorView$b */
    public class C14825b implements ValueAnimator.AnimatorUpdateListener {
        private C14825b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            RadialSelectorView.this.invalidate();
        }
    }

    public RadialSelectorView(Context context) {
        super(context);
        this.f62241a = new Paint();
        this.f62242b = false;
    }

    /* JADX INFO: renamed from: a */
    public int m86362a(float f, float f2, boolean z, Boolean[] boolArr) {
        if (!this.f62243c) {
            return -1;
        }
        int i = this.f62255o;
        float f3 = (f2 - i) * (f2 - i);
        int i2 = this.f62254n;
        double dSqrt = Math.sqrt(f3 + ((f - i2) * (f - i2)));
        if (this.f62252l) {
            int i3 = this.f62256p;
            if (z) {
                boolArr[0] = Boolean.valueOf(((int) Math.abs(dSqrt - ((double) ((int) (((float) i3) * this.f62246f))))) <= ((int) Math.abs(dSqrt - ((double) ((int) (((float) this.f62256p) * this.f62247g))))));
            } else {
                float f4 = this.f62246f;
                int i4 = this.f62260t;
                int i5 = ((int) (i3 * f4)) - i4;
                float f5 = this.f62247g;
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
        } else if (!z && ((int) Math.abs(dSqrt - ((double) this.f62259s))) > ((int) (this.f62256p * (1.0f - this.f62248h)))) {
            return -1;
        }
        int iAsin = (int) ((Math.asin(((double) Math.abs(f2 - this.f62255o)) / dSqrt) * 180.0d) / 3.141592653589793d);
        boolean z2 = f > ((float) this.f62254n);
        boolean z3 = f2 < ((float) this.f62255o);
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
    public void m86363b(Context context, InterfaceC14838a interfaceC14838a, boolean z, boolean z2, int i, boolean z3) {
        if (this.f62242b) {
            Log.e("RadialSelectorView", "This RadialSelectorView may only be initialized once.");
            return;
        }
        Resources resources = context.getResources();
        this.f62241a.setColor(interfaceC14838a.mo86400u());
        this.f62241a.setAntiAlias(true);
        interfaceC14838a.mo86403z();
        this.f62253m = 255;
        boolean zMo86397f = interfaceC14838a.mo86397f();
        this.f62251k = zMo86397f;
        if (zMo86397f || interfaceC14838a.getVersion() != TimePickerDialog.Version.VERSION_1) {
            this.f62244d = Float.parseFloat(resources.getString(R$string.f62006d));
        } else {
            this.f62244d = Float.parseFloat(resources.getString(R$string.f62005c));
            this.f62245e = Float.parseFloat(resources.getString(R$string.f62003a));
        }
        this.f62252l = z;
        if (z) {
            this.f62246f = Float.parseFloat(resources.getString(R$string.f62013k));
            this.f62247g = Float.parseFloat(resources.getString(R$string.f62015m));
        } else {
            this.f62248h = Float.parseFloat(resources.getString(R$string.f62014l));
        }
        this.f62249i = Float.parseFloat(resources.getString(R$string.f62025w));
        this.f62250j = 1.0f;
        this.f62257q = ((z2 ? -1 : 1) * 0.05f) + 1.0f;
        this.f62258r = ((z2 ? 1 : -1) * 0.3f) + 1.0f;
        this.f62261u = new C14825b();
        m86364c(i, z3, false);
        this.f62242b = true;
    }

    /* JADX INFO: renamed from: c */
    public void m86364c(int i, boolean z, boolean z2) {
        this.f62262v = i;
        this.f62263w = (((double) i) * 3.141592653589793d) / 180.0d;
        this.f62264x = z2;
        if (this.f62252l) {
            if (z) {
                this.f62248h = this.f62246f;
            } else {
                this.f62248h = this.f62247g;
            }
        }
    }

    public ObjectAnimator getDisappearAnimator() {
        if (!this.f62242b || !this.f62243c) {
            Log.e("RadialSelectorView", "RadialSelectorView was not ready for animation.");
            return null;
        }
        ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofKeyframe("animationRadiusMultiplier", Keyframe.ofFloat(0.0f, 1.0f), Keyframe.ofFloat(0.2f, this.f62257q), Keyframe.ofFloat(1.0f, this.f62258r)), PropertyValuesHolder.ofKeyframe("alpha", Keyframe.ofFloat(0.0f, 1.0f), Keyframe.ofFloat(1.0f, 0.0f))).setDuration(500L);
        duration.addUpdateListener(this.f62261u);
        return duration;
    }

    public ObjectAnimator getReappearAnimator() {
        if (!this.f62242b || !this.f62243c) {
            Log.e("RadialSelectorView", "RadialSelectorView was not ready for animation.");
            return null;
        }
        ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofKeyframe("animationRadiusMultiplier", Keyframe.ofFloat(0.0f, this.f62258r), Keyframe.ofFloat(0.2f, this.f62258r), Keyframe.ofFloat(0.84f, this.f62257q), Keyframe.ofFloat(1.0f, 1.0f)), PropertyValuesHolder.ofKeyframe("alpha", Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(0.2f, 0.0f), Keyframe.ofFloat(1.0f, 1.0f))).setDuration(625L);
        duration.addUpdateListener(this.f62261u);
        return duration;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (getWidth() == 0 || !this.f62242b) {
            return;
        }
        if (!this.f62243c) {
            this.f62254n = getWidth() / 2;
            int height = getHeight() / 2;
            this.f62255o = height;
            int iMin = (int) (Math.min(this.f62254n, height) * this.f62244d);
            this.f62256p = iMin;
            if (!this.f62251k) {
                this.f62255o = (int) (((double) this.f62255o) - (((double) ((int) (iMin * this.f62245e))) * 0.75d));
            }
            this.f62260t = (int) (iMin * this.f62249i);
            this.f62243c = true;
        }
        int i = (int) (this.f62256p * this.f62248h * this.f62250j);
        this.f62259s = i;
        int iSin = this.f62254n + ((int) (((double) i) * Math.sin(this.f62263w)));
        int iCos = this.f62255o - ((int) (((double) this.f62259s) * Math.cos(this.f62263w)));
        this.f62241a.setAlpha(this.f62253m);
        float f = iSin;
        float f2 = iCos;
        canvas.drawCircle(f, f2, this.f62260t, this.f62241a);
        if ((this.f62262v % 30 != 0) || this.f62264x) {
            this.f62241a.setAlpha(255);
            canvas.drawCircle(f, f2, (this.f62260t * 2) / 7, this.f62241a);
        } else {
            double d = this.f62259s - this.f62260t;
            int iSin2 = ((int) (Math.sin(this.f62263w) * d)) + this.f62254n;
            int iCos2 = this.f62255o - ((int) (d * Math.cos(this.f62263w)));
            iSin = iSin2;
            iCos = iCos2;
        }
        this.f62241a.setAlpha(255);
        this.f62241a.setStrokeWidth(3.0f);
        canvas.drawLine(this.f62254n, this.f62255o, iSin, iCos, this.f62241a);
    }

    public void setAnimationRadiusMultiplier(float f) {
        this.f62250j = f;
    }
}
