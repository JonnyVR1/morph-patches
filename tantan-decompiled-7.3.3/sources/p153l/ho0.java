package p153l;

import com.clevertap.android.sdk.Constants;
import com.sunshine.engine.base.AbstractC13647a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class ho0 {

    /* JADX INFO: renamed from: a */
    public tfe f110853a = new tfe();

    /* JADX INFO: renamed from: b */
    public kk90 f110854b;

    /* JADX INFO: renamed from: c */
    public kk90 f110855c;

    /* JADX INFO: renamed from: d */
    public drf0<Float> f110856d;

    /* JADX INFO: renamed from: e */
    public kk90 f110857e;

    /* JADX INFO: renamed from: f */
    public kk90 f110858f;

    /* JADX INFO: renamed from: g */
    public li80<Float> f110859g;

    /* JADX INFO: renamed from: h */
    public lk90 f110860h;

    /* JADX INFO: renamed from: i */
    public lk90 f110861i;

    /* JADX INFO: renamed from: l.ho0$a */
    public static abstract class AbstractC17525a extends mrf0 {

        /* JADX INFO: renamed from: e */
        public List<ho0> f110862e = new ArrayList();

        /* JADX INFO: renamed from: a */
        public ho0 m136375a(float f) {
            int i = 0;
            while (i < this.f110862e.size()) {
                boolean z = i == this.f110862e.size() - 1;
                ho0 ho0Var = this.f110862e.get(i);
                if (ho0Var.f110853a.m190930d(f, z)) {
                    return ho0Var;
                }
                i++;
            }
            return null;
        }

        /* JADX INFO: renamed from: b */
        public ho0 m136376b() {
            if (this.f110862e.size() <= 0) {
                return null;
            }
            List<ho0> list = this.f110862e;
            return list.get(list.size() - 1);
        }

        /* JADX INFO: renamed from: c */
        public void m136377c() {
            this.f138364b.reset();
            this.f138363a = false;
        }
    }

    public ho0() {
        Float fValueOf = Float.valueOf(0.0f);
        this.f110854b = new kk90(fValueOf, fValueOf);
        this.f110855c = new kk90(fValueOf, fValueOf);
        this.f110856d = new drf0<>(fValueOf, fValueOf);
        Float fValueOf2 = Float.valueOf(1.0f);
        this.f110857e = new kk90(fValueOf2, fValueOf2);
        this.f110858f = new kk90(fValueOf2, fValueOf2);
        this.f110859g = new li80<>(fValueOf, fValueOf);
        this.f110860h = new lk90(0, 0);
        this.f110861i = new lk90(0, 0);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0005 A[PHI: r0
      0x0005: PHI (r0v10 float) = (r0v0 float), (r0v1 float) binds: [B:3:0x0003, B:6:0x000b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: a */
    public boolean m136373a(float f, AbstractC13647a abstractC13647a) {
        float f2 = 0.0f;
        if (f < 0.0f) {
            f = f2;
        } else {
            f2 = 1.0f;
            if (f > 1.0f) {
                f = f2;
            }
        }
        abstractC13647a.f56519s.f80955f = this.f110861i.mo150085a(f).intValue();
        if (a2j0.m95702e(abstractC13647a.f56519s.f80955f) && !abstractC13647a.f56514n) {
            return false;
        }
        float fFloatValue = this.f110857e.mo150085a(f).floatValue();
        float fFloatValue2 = this.f110858f.mo150085a(f).floatValue();
        if (a2j0.m95702e(fFloatValue) || a2j0.m95702e(fFloatValue2)) {
            return false;
        }
        this.f110854b.mo150085a(f);
        this.f110855c.mo150085a(f);
        this.f110860h.mo150085a(f);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public void m136374b(AbstractC13647a abstractC13647a) {
        float fFloatValue = this.f110857e.m167991f().floatValue() * this.f110856d.f90384a.floatValue();
        float fFloatValue2 = this.f110858f.m167991f().floatValue() * this.f110856d.f90385b.floatValue();
        abstractC13647a.f56519s.f80950a.left = this.f110854b.m167991f().floatValue() - fFloatValue;
        abstractC13647a.f56519s.f80950a.top = this.f110855c.m167991f().floatValue() - fFloatValue2;
        abstractC13647a.f56519s.f80950a.right = this.f110854b.m167991f().floatValue() + fFloatValue;
        abstractC13647a.f56519s.f80950a.bottom = this.f110855c.m167991f().floatValue() + fFloatValue2;
        abstractC13647a.f56519s.f80953d = this.f110860h.m167991f().intValue();
        cce cceVar = abstractC13647a.f56519s;
        cceVar.f80951b.x = cceVar.f80950a.left + (this.f110859g.f132192a.floatValue() * this.f110857e.m167991f().floatValue());
        cce cceVar2 = abstractC13647a.f56519s;
        cceVar2.f80951b.y = cceVar2.f80950a.top + (this.f110859g.f132193b.floatValue() * this.f110858f.m167991f().floatValue());
    }

    public String toString() {
        return "[" + this.f110853a.m190927a() + Constants.SEPARATOR_COMMA + this.f110853a.m190929c() + "]: move(" + this.f110854b.m167988c() + Constants.SEPARATOR_COMMA + this.f110855c.m167988c() + ")->(" + this.f110854b.m167992g() + Constants.SEPARATOR_COMMA + this.f110855c.m167992g() + "), w=" + (this.f110856d.f90384a.floatValue() * 2.0f) + ", h=" + (this.f110856d.f90385b.floatValue() * 2.0f);
    }
}
