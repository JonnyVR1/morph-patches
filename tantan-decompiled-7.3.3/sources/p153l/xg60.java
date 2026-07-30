package p153l;

import android.graphics.Rect;
import com.google.android.gms.common.ConnectionResult;
import com.sunshine.engine.base.InterpolatorType;

/* JADX INFO: loaded from: classes11.dex */
public class xg60 {

    /* JADX INFO: renamed from: a */
    public drf0<Integer> f194138a = new drf0<>(0, 0);

    /* JADX INFO: renamed from: b */
    public Rect f194139b = new Rect(0, 0, 0, 0);

    /* JADX INFO: renamed from: c */
    public kk90 f194140c;

    /* JADX INFO: renamed from: d */
    public lk90 f194141d;

    /* JADX INFO: renamed from: e */
    public fz0 f194142e;

    /* JADX INFO: renamed from: f */
    public fz0 f194143f;

    /* JADX INFO: renamed from: g */
    public String[] f194144g;

    /* JADX INFO: renamed from: h */
    public li80<Float> f194145h;

    /* JADX INFO: renamed from: i */
    public lk90 f194146i;

    /* JADX INFO: renamed from: j */
    public lk90 f194147j;

    /* JADX INFO: renamed from: k */
    public String f194148k;

    /* JADX INFO: renamed from: l */
    public lk90 f194149l;

    /* JADX INFO: renamed from: m */
    public lk90 f194150m;

    /* JADX INFO: renamed from: n */
    public String f194151n;

    /* JADX INFO: renamed from: o */
    public kk90 f194152o;

    /* JADX INFO: renamed from: p */
    public kk90 f194153p;

    /* JADX INFO: renamed from: q */
    public String f194154q;

    /* JADX INFO: renamed from: r */
    public String f194155r;

    /* JADX INFO: renamed from: s */
    public String f194156s;

    public xg60() {
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(1.0f);
        this.f194140c = new kk90(fValueOf, fValueOf2);
        this.f194141d = new lk90(Integer.valueOf(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED), 2000);
        this.f194142e = new fz0();
        this.f194143f = new fz0();
        InterpolatorType interpolatorType = InterpolatorType.linear;
        this.f194144g = new String[]{interpolatorType.toString(), interpolatorType.toString()};
        this.f194145h = new li80<>(fValueOf, fValueOf);
        this.f194146i = new lk90(0, 0);
        this.f194147j = new lk90(0, 0);
        this.f194148k = interpolatorType.toString();
        this.f194149l = new lk90(0, 0);
        this.f194150m = new lk90(255, 255);
        this.f194151n = InterpolatorType.spring.toString();
        this.f194152o = new kk90(fValueOf2, Float.valueOf(1.2f));
        this.f194153p = new kk90(fValueOf2, fValueOf2);
        this.f194154q = null;
        this.f194155r = null;
        this.f194156s = interpolatorType.toString();
    }

    /* JADX WARN: Type inference failed for: r0v28, types: [T, java.lang.Float] */
    /* JADX WARN: Type inference failed for: r0v35, types: [T, java.lang.Float] */
    /* JADX INFO: renamed from: a */
    public void m210878a(v1e0 v1e0Var, wg60 wg60Var) {
        int iAtan;
        wg60Var.f188913e = this.f194141d.m167993h().intValue();
        wg60Var.f188914f = -1L;
        wg60Var.m206180c(this.f194139b);
        Integer numM167993h = this.f194149l.m167993h();
        int iIntValue = numM167993h.intValue();
        lk90 lk90Var = wg60Var.f188916h.f116065g;
        lk90 lk90Var2 = this.f194150m;
        if (lk90Var2 != null) {
            iIntValue = lk90Var2.m167993h().intValue();
        }
        lk90Var.mo150086i(numM167993h, Integer.valueOf(iIntValue));
        wg60Var.f188916h.f116065g.m167995k(this.f194151n);
        li80<Integer> li80VarM128143a = this.f194142e.m128143a(v1e0Var);
        li80<Integer> li80VarM128144b = this.f194143f.m128144b(v1e0Var, li80VarM128143a.f132192a.intValue(), li80VarM128143a.f132193b.intValue());
        wg60Var.f188916h.f116059a.mo150086i(Float.valueOf(li80VarM128143a.f132192a.intValue()), Float.valueOf(li80VarM128144b.f132192a.intValue()));
        wg60Var.f188916h.f116060b.mo150086i(Float.valueOf(li80VarM128143a.f132193b.intValue()), Float.valueOf(li80VarM128144b.f132193b.intValue()));
        wg60Var.f188916h.f116059a.m167995k(this.f194144g[0]);
        wg60Var.f188916h.f116060b.m167995k(this.f194144g[1]);
        wg60Var.f188916h.f116061c.f90384a = Float.valueOf(this.f194138a.f90384a.intValue() / 2.0f);
        wg60Var.f188916h.f116061c.f90385b = Float.valueOf(this.f194138a.f90385b.intValue() / 2.0f);
        Float fM167993h = this.f194152o.m167993h();
        float fFloatValue = fM167993h.floatValue();
        kk90 kk90Var = this.f194153p;
        if (kk90Var != null) {
            fFloatValue = kk90Var.m167993h().floatValue();
        }
        wg60Var.f188916h.f116064f.mo150086i(fM167993h, Float.valueOf(fFloatValue));
        wg60Var.f188916h.f116064f.m167995k(this.f194156s);
        int iIntValue2 = this.f194146i.m167993h().intValue();
        lk90 lk90Var3 = this.f194147j;
        int iIntValue3 = lk90Var3 == null ? iIntValue2 : lk90Var3.m167993h().intValue();
        if (this.f194143f.f101430a) {
            boolean zM95702e = a2j0.m95702e(wg60Var.f188916h.f116060b.m167987b().floatValue());
            io0 io0Var = wg60Var.f188916h;
            if (zM95702e) {
                iAtan = io0Var.f116059a.m167987b().floatValue() > 0.0f ? 90 : 270;
            } else {
                iAtan = (int) ((Math.atan((-io0Var.f116059a.m167987b().floatValue()) / wg60Var.f188916h.f116060b.m167987b().floatValue()) / 3.141592653589793d) * 180.0d);
                if (wg60Var.f188916h.f116060b.m167987b().floatValue() > 0.0f) {
                    iAtan += 180;
                }
            }
            iIntValue2 += iAtan;
            iIntValue3 += iAtan;
        }
        wg60Var.f188916h.f116063e.mo150086i(Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3));
        wg60Var.f188916h.f116063e.m167995k(this.f194148k);
        li80<Float> li80Var = wg60Var.f188916h.f116062d;
        li80<Float> li80Var2 = this.f194145h;
        li80Var.m154306a(li80Var2.f132192a, li80Var2.f132193b);
        wg60Var.f138366d = this.f194154q;
        wg60Var.f188917i = this.f194155r;
    }
}
