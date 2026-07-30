package p149l;

import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes7.dex */
public abstract class tdl {

    /* JADX INFO: renamed from: a */
    protected wdl f169568a;

    /* JADX INFO: renamed from: b */
    private Interpolator f169569b;

    /* JADX INFO: renamed from: c */
    private int f169570c;

    /* JADX INFO: renamed from: d */
    protected LinkedHashMap<Integer, Float> f169571d;

    public tdl(wdl wdlVar, Interpolator interpolator) {
        this.f169571d = new LinkedHashMap<>();
        this.f169568a = wdlVar;
        this.f169569b = interpolator;
    }

    /* JADX INFO: renamed from: a */
    public void m188136a(int i, float f) {
        this.f169571d.put(Integer.valueOf(i), Float.valueOf(f));
    }

    /* JADX INFO: renamed from: b */
    public Interpolator mo188137b(int i) {
        return this.f169569b;
    }

    /* JADX INFO: renamed from: c */
    public void m188138c(int i) {
        this.f169570c = i;
    }

    /* JADX INFO: renamed from: d */
    public void m188139d(float f) {
        if (this.f169568a == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f169571d.keySet());
        float fFloatValue = -1.0f;
        int iIntValue = -1;
        float fFloatValue2 = -1.0f;
        int i = -1;
        for (int i2 = 0; i2 < this.f169571d.size(); i2++) {
            if (((Integer) arrayList.get(i2)).intValue() <= this.f169570c * f) {
                Integer num = (Integer) arrayList.get(i2);
                int iIntValue2 = num.intValue();
                fFloatValue2 = this.f169571d.get(num).floatValue();
                i = iIntValue2;
            }
            if (((Integer) arrayList.get(i2)).intValue() > this.f169570c * f) {
                Integer num2 = (Integer) arrayList.get(i2);
                iIntValue = num2.intValue();
                fFloatValue = this.f169571d.get(num2).floatValue();
                break;
            }
        }
        if (i >= 0 && iIntValue >= 0) {
            float interpolation = ((f * this.f169570c) - i) / (iIntValue - i);
            Interpolator interpolatorMo188137b = mo188137b(i);
            if (interpolatorMo188137b != null) {
                interpolation = interpolatorMo188137b.getInterpolation(interpolation);
            }
            fFloatValue2 += (fFloatValue - fFloatValue2) * interpolation;
        } else if ((i < 0 && iIntValue >= 0) || i < 0 || iIntValue >= 0) {
            fFloatValue2 = 0.0f;
        }
        mo183505e(fFloatValue2);
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo183505e(float f);

    public tdl() {
        this(null, new LinearInterpolator());
    }
}
