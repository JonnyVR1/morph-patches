package p149l;

import android.graphics.RectF;
import com.sunshine.engine.base.AbstractC13484a;

/* JADX INFO: loaded from: classes13.dex */
public class mo0 {

    /* JADX INFO: renamed from: a */
    protected gc90 f134806a;

    /* JADX INFO: renamed from: b */
    protected gc90 f134807b;

    /* JADX INFO: renamed from: c */
    public uif0<Float> f134808c;

    /* JADX INFO: renamed from: d */
    protected fa80<Float> f134809d;

    /* JADX INFO: renamed from: e */
    protected hc90 f134810e;

    /* JADX INFO: renamed from: f */
    protected gc90 f134811f;

    /* JADX INFO: renamed from: g */
    protected hc90 f134812g;

    public mo0() {
        Float fValueOf = Float.valueOf(0.0f);
        this.f134806a = new gc90(fValueOf, fValueOf);
        this.f134807b = new gc90(fValueOf, fValueOf);
        this.f134808c = new uif0<>(fValueOf, fValueOf);
        this.f134809d = new fa80<>(fValueOf, fValueOf);
        this.f134810e = new hc90(0, 0);
        Float fValueOf2 = Float.valueOf(1.0f);
        this.f134811f = new gc90(fValueOf2, fValueOf2);
        this.f134812g = new hc90(50, 255);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0005 A[PHI: r0
      0x0005: PHI (r0v19 float) = (r0v0 float), (r0v1 float) binds: [B:3:0x0003, B:6:0x000b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: a */
    public boolean m155571a(float f, AbstractC13484a abstractC13484a) {
        float f2 = 0.0f;
        if (f < 0.0f) {
            f = f2;
        } else {
            f2 = 1.0f;
            if (f > 1.0f) {
                f = f2;
            }
        }
        float fFloatValue = this.f134806a.mo125466a(f).floatValue();
        float fFloatValue2 = this.f134807b.mo125466a(f).floatValue();
        float fFloatValue3 = this.f134811f.mo125466a(f).floatValue();
        if (xsi0.m210764e(fFloatValue3) || xsi0.m210764e(fFloatValue3)) {
            return false;
        }
        float fFloatValue4 = this.f134808c.f176651a.floatValue() * fFloatValue3;
        float fFloatValue5 = this.f134808c.f176652b.floatValue() * fFloatValue3;
        yae yaeVar = abstractC13484a.f55671s;
        RectF rectF = yaeVar.f197185a;
        rectF.left = fFloatValue - fFloatValue4;
        rectF.top = fFloatValue2 - fFloatValue5;
        rectF.right = fFloatValue + fFloatValue4;
        rectF.bottom = fFloatValue2 + fFloatValue5;
        yaeVar.f197188d = this.f134810e.mo125466a(f).intValue();
        yae yaeVar2 = abstractC13484a.f55671s;
        yaeVar2.f197186b.x = yaeVar2.f197185a.left + (this.f134809d.f96575a.floatValue() * fFloatValue3);
        yae yaeVar3 = abstractC13484a.f55671s;
        yaeVar3.f197186b.y = yaeVar3.f197185a.top + (this.f134809d.f96576b.floatValue() * fFloatValue3);
        abstractC13484a.f55671s.f197190f = this.f134812g.mo125466a(f).intValue();
        return !xsi0.m210764e((float) abstractC13484a.f55671s.f197190f) || abstractC13484a.f55666n;
    }
}
