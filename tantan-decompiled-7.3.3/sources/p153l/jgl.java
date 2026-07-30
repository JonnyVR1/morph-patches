package p153l;

import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes7.dex */
public abstract class jgl {

    /* JADX INFO: renamed from: a */
    protected mgl f120740a;

    /* JADX INFO: renamed from: b */
    private Interpolator f120741b;

    /* JADX INFO: renamed from: c */
    private int f120742c;

    /* JADX INFO: renamed from: d */
    protected LinkedHashMap<Integer, Float> f120743d;

    public jgl(mgl mglVar, Interpolator interpolator) {
        this.f120743d = new LinkedHashMap<>();
        this.f120740a = mglVar;
        this.f120741b = interpolator;
    }

    /* JADX INFO: renamed from: a */
    public void m144787a(int i, float f) {
        this.f120743d.put(Integer.valueOf(i), Float.valueOf(f));
    }

    /* JADX INFO: renamed from: b */
    public Interpolator mo144788b(int i) {
        return this.f120741b;
    }

    /* JADX INFO: renamed from: c */
    public void m144789c(int i) {
        this.f120742c = i;
    }

    /* JADX INFO: renamed from: d */
    public void m144790d(float f) {
        if (this.f120740a == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f120743d.keySet());
        float fFloatValue = -1.0f;
        int iIntValue = -1;
        float fFloatValue2 = -1.0f;
        int i = -1;
        for (int i2 = 0; i2 < this.f120743d.size(); i2++) {
            if (((Integer) arrayList.get(i2)).intValue() <= this.f120742c * f) {
                Integer num = (Integer) arrayList.get(i2);
                int iIntValue2 = num.intValue();
                fFloatValue2 = this.f120743d.get(num).floatValue();
                i = iIntValue2;
            }
            if (((Integer) arrayList.get(i2)).intValue() > this.f120742c * f) {
                Integer num2 = (Integer) arrayList.get(i2);
                iIntValue = num2.intValue();
                fFloatValue = this.f120743d.get(num2).floatValue();
                break;
            }
        }
        if (i >= 0 && iIntValue >= 0) {
            float interpolation = ((f * this.f120742c) - i) / (iIntValue - i);
            Interpolator interpolatorMo144788b = mo144788b(i);
            if (interpolatorMo144788b != null) {
                interpolation = interpolatorMo144788b.getInterpolation(interpolation);
            }
            fFloatValue2 += (fFloatValue - fFloatValue2) * interpolation;
        } else if ((i < 0 && iIntValue >= 0) || i < 0 || iIntValue >= 0) {
            fFloatValue2 = 0.0f;
        }
        mo139943e(fFloatValue2);
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo139943e(float f);

    public jgl() {
        this(null, new LinearInterpolator());
    }
}
