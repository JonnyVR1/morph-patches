package p153l;

import android.graphics.RectF;
import com.sunshine.engine.base.AbstractC13647a;

/* JADX INFO: loaded from: classes11.dex */
public class io0 {

    /* JADX INFO: renamed from: a */
    protected kk90 f116059a;

    /* JADX INFO: renamed from: b */
    protected kk90 f116060b;

    /* JADX INFO: renamed from: c */
    public drf0<Float> f116061c;

    /* JADX INFO: renamed from: d */
    protected li80<Float> f116062d;

    /* JADX INFO: renamed from: e */
    protected lk90 f116063e;

    /* JADX INFO: renamed from: f */
    protected kk90 f116064f;

    /* JADX INFO: renamed from: g */
    protected lk90 f116065g;

    public io0() {
        Float fValueOf = Float.valueOf(0.0f);
        this.f116059a = new kk90(fValueOf, fValueOf);
        this.f116060b = new kk90(fValueOf, fValueOf);
        this.f116061c = new drf0<>(fValueOf, fValueOf);
        this.f116062d = new li80<>(fValueOf, fValueOf);
        this.f116063e = new lk90(0, 0);
        Float fValueOf2 = Float.valueOf(1.0f);
        this.f116064f = new kk90(fValueOf2, fValueOf2);
        this.f116065g = new lk90(50, 255);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0005 A[PHI: r0
      0x0005: PHI (r0v19 float) = (r0v0 float), (r0v1 float) binds: [B:3:0x0003, B:6:0x000b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: a */
    public boolean m141241a(float f, AbstractC13647a abstractC13647a) {
        float f2 = 0.0f;
        if (f < 0.0f) {
            f = f2;
        } else {
            f2 = 1.0f;
            if (f > 1.0f) {
                f = f2;
            }
        }
        float fFloatValue = this.f116059a.mo150085a(f).floatValue();
        float fFloatValue2 = this.f116060b.mo150085a(f).floatValue();
        float fFloatValue3 = this.f116064f.mo150085a(f).floatValue();
        if (a2j0.m95702e(fFloatValue3) || a2j0.m95702e(fFloatValue3)) {
            return false;
        }
        float fFloatValue4 = this.f116061c.f90384a.floatValue() * fFloatValue3;
        float fFloatValue5 = this.f116061c.f90385b.floatValue() * fFloatValue3;
        cce cceVar = abstractC13647a.f56519s;
        RectF rectF = cceVar.f80950a;
        rectF.left = fFloatValue - fFloatValue4;
        rectF.top = fFloatValue2 - fFloatValue5;
        rectF.right = fFloatValue + fFloatValue4;
        rectF.bottom = fFloatValue2 + fFloatValue5;
        cceVar.f80953d = this.f116063e.mo150085a(f).intValue();
        cce cceVar2 = abstractC13647a.f56519s;
        cceVar2.f80951b.x = cceVar2.f80950a.left + (this.f116062d.f132192a.floatValue() * fFloatValue3);
        cce cceVar3 = abstractC13647a.f56519s;
        cceVar3.f80951b.y = cceVar3.f80950a.top + (this.f116062d.f132193b.floatValue() * fFloatValue3);
        abstractC13647a.f56519s.f80955f = this.f116065g.mo150085a(f).intValue();
        return !a2j0.m95702e((float) abstractC13647a.f56519s.f80955f) || abstractC13647a.f56514n;
    }
}
