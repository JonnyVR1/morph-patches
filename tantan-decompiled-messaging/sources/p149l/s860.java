package p149l;

import android.graphics.Rect;
import com.google.android.gms.common.ConnectionResult;
import com.sunshine.engine.base.InterpolatorType;

/* JADX INFO: loaded from: classes13.dex */
public class s860 {

    /* JADX INFO: renamed from: a */
    public uif0<Integer> f162996a = new uif0<>(0, 0);

    /* JADX INFO: renamed from: b */
    public Rect f162997b = new Rect(0, 0, 0, 0);

    /* JADX INFO: renamed from: c */
    public gc90 f162998c;

    /* JADX INFO: renamed from: d */
    public hc90 f162999d;

    /* JADX INFO: renamed from: e */
    public yy0 f163000e;

    /* JADX INFO: renamed from: f */
    public yy0 f163001f;

    /* JADX INFO: renamed from: g */
    public String[] f163002g;

    /* JADX INFO: renamed from: h */
    public fa80<Float> f163003h;

    /* JADX INFO: renamed from: i */
    public hc90 f163004i;

    /* JADX INFO: renamed from: j */
    public hc90 f163005j;

    /* JADX INFO: renamed from: k */
    public String f163006k;

    /* JADX INFO: renamed from: l */
    public hc90 f163007l;

    /* JADX INFO: renamed from: m */
    public hc90 f163008m;

    /* JADX INFO: renamed from: n */
    public String f163009n;

    /* JADX INFO: renamed from: o */
    public gc90 f163010o;

    /* JADX INFO: renamed from: p */
    public gc90 f163011p;

    /* JADX INFO: renamed from: q */
    public String f163012q;

    /* JADX INFO: renamed from: r */
    public String f163013r;

    /* JADX INFO: renamed from: s */
    public String f163014s;

    public s860() {
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(1.0f);
        this.f162998c = new gc90(fValueOf, fValueOf2);
        this.f162999d = new hc90(Integer.valueOf(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED), 2000);
        this.f163000e = new yy0();
        this.f163001f = new yy0();
        InterpolatorType interpolatorType = InterpolatorType.linear;
        this.f163002g = new String[]{interpolatorType.toString(), interpolatorType.toString()};
        this.f163003h = new fa80<>(fValueOf, fValueOf);
        this.f163004i = new hc90(0, 0);
        this.f163005j = new hc90(0, 0);
        this.f163006k = interpolatorType.toString();
        this.f163007l = new hc90(0, 0);
        this.f163008m = new hc90(255, 255);
        this.f163009n = InterpolatorType.spring.toString();
        this.f163010o = new gc90(fValueOf2, Float.valueOf(1.2f));
        this.f163011p = new gc90(fValueOf2, fValueOf2);
        this.f163012q = null;
        this.f163013r = null;
        this.f163014s = interpolatorType.toString();
    }

    /* JADX WARN: Type inference failed for: r0v28, types: [T, java.lang.Float] */
    /* JADX WARN: Type inference failed for: r0v35, types: [T, java.lang.Float] */
    /* JADX INFO: renamed from: a */
    public void m182579a(ttd0 ttd0Var, r860 r860Var) {
        int iAtan;
        r860Var.f158150e = this.f162999d.m145369h().intValue();
        r860Var.f158151f = -1L;
        r860Var.m178242c(this.f162997b);
        Integer numM145369h = this.f163007l.m145369h();
        int iIntValue = numM145369h.intValue();
        hc90 hc90Var = r860Var.f158153h.f134812g;
        hc90 hc90Var2 = this.f163008m;
        if (hc90Var2 != null) {
            iIntValue = hc90Var2.m145369h().intValue();
        }
        hc90Var.mo125467i(numM145369h, Integer.valueOf(iIntValue));
        r860Var.f158153h.f134812g.m145371k(this.f163009n);
        fa80<Integer> fa80VarM216493a = this.f163000e.m216493a(ttd0Var);
        fa80<Integer> fa80VarM216494b = this.f163001f.m216494b(ttd0Var, fa80VarM216493a.f96575a.intValue(), fa80VarM216493a.f96576b.intValue());
        r860Var.f158153h.f134806a.mo125467i(Float.valueOf(fa80VarM216493a.f96575a.intValue()), Float.valueOf(fa80VarM216494b.f96575a.intValue()));
        r860Var.f158153h.f134807b.mo125467i(Float.valueOf(fa80VarM216493a.f96576b.intValue()), Float.valueOf(fa80VarM216494b.f96576b.intValue()));
        r860Var.f158153h.f134806a.m145371k(this.f163002g[0]);
        r860Var.f158153h.f134807b.m145371k(this.f163002g[1]);
        r860Var.f158153h.f134808c.f176651a = Float.valueOf(this.f162996a.f176651a.intValue() / 2.0f);
        r860Var.f158153h.f134808c.f176652b = Float.valueOf(this.f162996a.f176652b.intValue() / 2.0f);
        Float fM145369h = this.f163010o.m145369h();
        float fFloatValue = fM145369h.floatValue();
        gc90 gc90Var = this.f163011p;
        if (gc90Var != null) {
            fFloatValue = gc90Var.m145369h().floatValue();
        }
        r860Var.f158153h.f134811f.mo125467i(fM145369h, Float.valueOf(fFloatValue));
        r860Var.f158153h.f134811f.m145371k(this.f163014s);
        int iIntValue2 = this.f163004i.m145369h().intValue();
        hc90 hc90Var3 = this.f163005j;
        int iIntValue3 = hc90Var3 == null ? iIntValue2 : hc90Var3.m145369h().intValue();
        if (this.f163001f.f200684a) {
            boolean zM210764e = xsi0.m210764e(r860Var.f158153h.f134807b.m145363b().floatValue());
            mo0 mo0Var = r860Var.f158153h;
            if (zM210764e) {
                iAtan = mo0Var.f134806a.m145363b().floatValue() > 0.0f ? 90 : 270;
            } else {
                iAtan = (int) ((Math.atan((-mo0Var.f134806a.m145363b().floatValue()) / r860Var.f158153h.f134807b.m145363b().floatValue()) / 3.141592653589793d) * 180.0d);
                if (r860Var.f158153h.f134807b.m145363b().floatValue() > 0.0f) {
                    iAtan += 180;
                }
            }
            iIntValue2 += iAtan;
            iIntValue3 += iAtan;
        }
        r860Var.f158153h.f134810e.mo125467i(Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3));
        r860Var.f158153h.f134810e.m145371k(this.f163006k);
        fa80<Float> fa80Var = r860Var.f158153h.f134809d;
        fa80<Float> fa80Var2 = this.f163003h;
        fa80Var.m120162a(fa80Var2.f96575a, fa80Var2.f96576b);
        r860Var.f86531d = this.f163012q;
        r860Var.f158154i = this.f163013r;
    }
}
