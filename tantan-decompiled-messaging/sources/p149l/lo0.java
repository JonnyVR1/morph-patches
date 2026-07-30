package p149l;

import com.clevertap.android.sdk.Constants;
import com.sunshine.engine.base.AbstractC13484a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class lo0 {

    /* JADX INFO: renamed from: a */
    public pee f129046a = new pee();

    /* JADX INFO: renamed from: b */
    public gc90 f129047b;

    /* JADX INFO: renamed from: c */
    public gc90 f129048c;

    /* JADX INFO: renamed from: d */
    public uif0<Float> f129049d;

    /* JADX INFO: renamed from: e */
    public gc90 f129050e;

    /* JADX INFO: renamed from: f */
    public gc90 f129051f;

    /* JADX INFO: renamed from: g */
    public fa80<Float> f129052g;

    /* JADX INFO: renamed from: h */
    public hc90 f129053h;

    /* JADX INFO: renamed from: i */
    public hc90 f129054i;

    /* JADX INFO: renamed from: l.lo0$a */
    public static abstract class AbstractC18269a extends djf0 {

        /* JADX INFO: renamed from: e */
        public List<lo0> f129055e = new ArrayList();

        /* JADX INFO: renamed from: a */
        public lo0 m150758a(float f) {
            int i = 0;
            while (i < this.f129055e.size()) {
                boolean z = i == this.f129055e.size() - 1;
                lo0 lo0Var = this.f129055e.get(i);
                if (lo0Var.f129046a.m168509d(f, z)) {
                    return lo0Var;
                }
                i++;
            }
            return null;
        }

        /* JADX INFO: renamed from: b */
        public lo0 m150759b() {
            if (this.f129055e.size() <= 0) {
                return null;
            }
            List<lo0> list = this.f129055e;
            return list.get(list.size() - 1);
        }

        /* JADX INFO: renamed from: c */
        public void m150760c() {
            this.f86529b.reset();
            this.f86528a = false;
        }
    }

    public lo0() {
        Float fValueOf = Float.valueOf(0.0f);
        this.f129047b = new gc90(fValueOf, fValueOf);
        this.f129048c = new gc90(fValueOf, fValueOf);
        this.f129049d = new uif0<>(fValueOf, fValueOf);
        Float fValueOf2 = Float.valueOf(1.0f);
        this.f129050e = new gc90(fValueOf2, fValueOf2);
        this.f129051f = new gc90(fValueOf2, fValueOf2);
        this.f129052g = new fa80<>(fValueOf, fValueOf);
        this.f129053h = new hc90(0, 0);
        this.f129054i = new hc90(0, 0);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0005 A[PHI: r0
      0x0005: PHI (r0v10 float) = (r0v0 float), (r0v1 float) binds: [B:3:0x0003, B:6:0x000b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: a */
    public boolean m150756a(float f, AbstractC13484a abstractC13484a) {
        float f2 = 0.0f;
        if (f < 0.0f) {
            f = f2;
        } else {
            f2 = 1.0f;
            if (f > 1.0f) {
                f = f2;
            }
        }
        abstractC13484a.f55671s.f197190f = this.f129054i.mo125466a(f).intValue();
        if (xsi0.m210764e(abstractC13484a.f55671s.f197190f) && !abstractC13484a.f55666n) {
            return false;
        }
        float fFloatValue = this.f129050e.mo125466a(f).floatValue();
        float fFloatValue2 = this.f129051f.mo125466a(f).floatValue();
        if (xsi0.m210764e(fFloatValue) || xsi0.m210764e(fFloatValue2)) {
            return false;
        }
        this.f129047b.mo125466a(f);
        this.f129048c.mo125466a(f);
        this.f129053h.mo125466a(f);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public void m150757b(AbstractC13484a abstractC13484a) {
        float fFloatValue = this.f129050e.m145367f().floatValue() * this.f129049d.f176651a.floatValue();
        float fFloatValue2 = this.f129051f.m145367f().floatValue() * this.f129049d.f176652b.floatValue();
        abstractC13484a.f55671s.f197185a.left = this.f129047b.m145367f().floatValue() - fFloatValue;
        abstractC13484a.f55671s.f197185a.top = this.f129048c.m145367f().floatValue() - fFloatValue2;
        abstractC13484a.f55671s.f197185a.right = this.f129047b.m145367f().floatValue() + fFloatValue;
        abstractC13484a.f55671s.f197185a.bottom = this.f129048c.m145367f().floatValue() + fFloatValue2;
        abstractC13484a.f55671s.f197188d = this.f129053h.m145367f().intValue();
        yae yaeVar = abstractC13484a.f55671s;
        yaeVar.f197186b.x = yaeVar.f197185a.left + (this.f129052g.f96575a.floatValue() * this.f129050e.m145367f().floatValue());
        yae yaeVar2 = abstractC13484a.f55671s;
        yaeVar2.f197186b.y = yaeVar2.f197185a.top + (this.f129052g.f96576b.floatValue() * this.f129051f.m145367f().floatValue());
    }

    public String toString() {
        return "[" + this.f129046a.m168506a() + Constants.SEPARATOR_COMMA + this.f129046a.m168508c() + "]: move(" + this.f129047b.m145364c() + Constants.SEPARATOR_COMMA + this.f129048c.m145364c() + ")->(" + this.f129047b.m145368g() + Constants.SEPARATOR_COMMA + this.f129048c.m145368g() + "), w=" + (this.f129049d.f176651a.floatValue() * 2.0f) + ", h=" + (this.f129049d.f176652b.floatValue() * 2.0f);
    }
}
