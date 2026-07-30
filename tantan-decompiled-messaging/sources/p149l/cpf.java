package p149l;

import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.graphics.Path;
import android.graphics.PathMeasure;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class cpf extends apf<lzl> {

    /* JADX INFO: renamed from: g */
    List<C16205a> f81923g;

    /* JADX INFO: renamed from: h */
    C16205a f81924h;

    /* JADX INFO: renamed from: i */
    C16205a f81925i;

    /* JADX INFO: renamed from: j */
    int f81926j;

    /* JADX INFO: renamed from: k */
    TypeEvaluator f81927k;

    /* JADX INFO: renamed from: l */
    TimeInterpolator f81928l;

    /* JADX INFO: renamed from: l.cpf$a */
    public static class C16205a {

        /* JADX INFO: renamed from: a */
        float f81929a;

        /* JADX INFO: renamed from: b */
        ya60 f81930b;

        /* JADX INFO: renamed from: c */
        TimeInterpolator f81931c;

        public C16205a(float f, ya60 ya60Var) {
            this.f81929a = f;
            this.f81930b = ya60Var;
            if (ya60Var != null) {
                this.f81931c = ya60Var.f197149h;
            }
        }

        /* JADX INFO: renamed from: d */
        public static C16205a m108128d(float f, ya60 ya60Var) {
            return new C16205a(f, ya60Var);
        }

        /* JADX INFO: renamed from: a */
        public float m108129a() {
            return this.f81929a;
        }

        /* JADX INFO: renamed from: b */
        public TimeInterpolator m108130b() {
            return this.f81931c;
        }

        /* JADX INFO: renamed from: c */
        public ya60 m108131c() {
            return this.f81930b;
        }
    }

    private cpf(lzl lzlVar, C16205a... c16205aArr) {
        super(lzlVar);
        int length = c16205aArr.length;
        this.f81926j = length;
        this.f81924h = c16205aArr[0];
        this.f81925i = c16205aArr[length - 1];
        this.f81923g = Arrays.asList(c16205aArr);
        this.f81928l = this.f81925i.m108130b();
    }

    /* JADX INFO: renamed from: l */
    private static float m108125l(Object... objArr) {
        Path path = new Path();
        ya60 ya60Var = (ya60) objArr[0];
        path.moveTo(ya60Var.f197142a, ya60Var.f197143b);
        for (int i = 1; i < objArr.length; i++) {
            ya60 ya60Var2 = (ya60) objArr[i];
            int i2 = ya60Var2.f197148g;
            if (i2 == 0) {
                path.moveTo(ya60Var2.f197142a, ya60Var2.f197143b);
            } else if (i2 == 1) {
                path.lineTo(ya60Var2.f197142a, ya60Var2.f197143b);
            } else if (i2 == 2) {
                path.quadTo(ya60Var2.f197144c, ya60Var2.f197145d, ya60Var2.f197142a, ya60Var2.f197143b);
            } else if (i2 == 3) {
                path.cubicTo(ya60Var2.f197144c, ya60Var2.f197145d, ya60Var2.f197146e, ya60Var2.f197147f, ya60Var2.f197142a, ya60Var2.f197143b);
            }
        }
        return new PathMeasure(path, false).getLength();
    }

    /* JADX INFO: renamed from: m */
    private void m108126m(TypeEvaluator typeEvaluator) {
        this.f81927k = typeEvaluator;
    }

    /* JADX INFO: renamed from: n */
    public static cpf m108127n(lzl lzlVar, TypeEvaluator typeEvaluator, Object... objArr) {
        int length = objArr.length;
        C16205a[] c16205aArr = new C16205a[Math.max(length, 2)];
        if (length == 1) {
            c16205aArr[0] = C16205a.m108128d(0.0f, null);
            c16205aArr[1] = C16205a.m108128d(1.0f, (ya60) objArr[0]);
        } else {
            c16205aArr[0] = C16205a.m108128d(0.0f, (ya60) objArr[0]);
            float fM108125l = m108125l(objArr);
            for (int i = 1; i < length; i++) {
                c16205aArr[i] = C16205a.m108128d(m108125l(objArr[i - 1], objArr[i]) / fM108125l, (ya60) objArr[i]);
            }
        }
        cpf cpfVar = new cpf(lzlVar, c16205aArr);
        cpfVar.m108126m(typeEvaluator);
        return cpfVar;
    }

    @Override // p149l.apf
    /* JADX INFO: renamed from: d */
    public void mo98112d(float f) {
        int i = this.f81926j;
        if (i == 2) {
            TimeInterpolator timeInterpolator = this.f81928l;
            if (timeInterpolator != null) {
                f = timeInterpolator.getInterpolation(f);
            }
            ((lzl) this.f71029a).mo99410f((ya60) this.f81927k.evaluate(f, this.f81924h.m108131c(), this.f81925i.m108131c()));
            return;
        }
        int i2 = 1;
        if (f <= 0.0f) {
            C16205a c16205a = this.f81923g.get(1);
            TimeInterpolator timeInterpolatorM108130b = c16205a.m108130b();
            if (timeInterpolatorM108130b != null) {
                f = timeInterpolatorM108130b.getInterpolation(f);
            }
            float fM108129a = this.f81924h.m108129a();
            ((lzl) this.f71029a).mo99410f((ya60) this.f81927k.evaluate((f - fM108129a) / (c16205a.m108129a() - fM108129a), this.f81924h.m108131c(), c16205a.m108131c()));
            return;
        }
        if (f >= 1.0f) {
            C16205a c16205a2 = this.f81923g.get(i - 2);
            TimeInterpolator timeInterpolatorM108130b2 = this.f81925i.m108130b();
            if (timeInterpolatorM108130b2 != null) {
                f = timeInterpolatorM108130b2.getInterpolation(f);
            }
            float fM108129a2 = c16205a2.m108129a();
            ((lzl) this.f71029a).mo99410f((ya60) this.f81927k.evaluate((f - fM108129a2) / (this.f81925i.m108129a() - fM108129a2), c16205a2.m108131c(), this.f81925i.m108131c()));
            return;
        }
        C16205a c16205a3 = this.f81924h;
        while (i2 < this.f81926j) {
            C16205a c16205a4 = this.f81923g.get(i2);
            if (f < c16205a4.m108129a()) {
                TimeInterpolator timeInterpolatorM108130b3 = c16205a4.m108130b();
                float fM108129a3 = c16205a3.m108129a();
                float fM108129a4 = (f - fM108129a3) / (c16205a4.m108129a() - fM108129a3);
                if (timeInterpolatorM108130b3 != null) {
                    fM108129a4 = timeInterpolatorM108130b3.getInterpolation(fM108129a4);
                }
                ((lzl) this.f71029a).mo99410f((ya60) this.f81927k.evaluate(fM108129a4, c16205a3.m108131c(), c16205a4.m108131c()));
                return;
            }
            i2++;
            c16205a3 = c16205a4;
        }
    }
}
