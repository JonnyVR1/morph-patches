package p153l;

import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.graphics.Path;
import android.graphics.PathMeasure;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class jqf extends hqf<f2m> {

    /* JADX INFO: renamed from: g */
    List<C18004a> f122197g;

    /* JADX INFO: renamed from: h */
    C18004a f122198h;

    /* JADX INFO: renamed from: i */
    C18004a f122199i;

    /* JADX INFO: renamed from: j */
    int f122200j;

    /* JADX INFO: renamed from: k */
    TypeEvaluator f122201k;

    /* JADX INFO: renamed from: l */
    TimeInterpolator f122202l;

    /* JADX INFO: renamed from: l.jqf$a */
    public static class C18004a {

        /* JADX INFO: renamed from: a */
        float f122203a;

        /* JADX INFO: renamed from: b */
        dj60 f122204b;

        /* JADX INFO: renamed from: c */
        TimeInterpolator f122205c;

        public C18004a(float f, dj60 dj60Var) {
            this.f122203a = f;
            this.f122204b = dj60Var;
            if (dj60Var != null) {
                this.f122205c = dj60Var.f88789h;
            }
        }

        /* JADX INFO: renamed from: d */
        public static C18004a m146572d(float f, dj60 dj60Var) {
            return new C18004a(f, dj60Var);
        }

        /* JADX INFO: renamed from: a */
        public float m146573a() {
            return this.f122203a;
        }

        /* JADX INFO: renamed from: b */
        public TimeInterpolator m146574b() {
            return this.f122205c;
        }

        /* JADX INFO: renamed from: c */
        public dj60 m146575c() {
            return this.f122204b;
        }
    }

    private jqf(f2m f2mVar, C18004a... c18004aArr) {
        super(f2mVar);
        int length = c18004aArr.length;
        this.f122200j = length;
        this.f122198h = c18004aArr[0];
        this.f122199i = c18004aArr[length - 1];
        this.f122197g = Arrays.asList(c18004aArr);
        this.f122202l = this.f122199i.m146574b();
    }

    /* JADX INFO: renamed from: l */
    private static float m146569l(Object... objArr) {
        Path path = new Path();
        dj60 dj60Var = (dj60) objArr[0];
        path.moveTo(dj60Var.f88782a, dj60Var.f88783b);
        for (int i = 1; i < objArr.length; i++) {
            dj60 dj60Var2 = (dj60) objArr[i];
            int i2 = dj60Var2.f88788g;
            if (i2 == 0) {
                path.moveTo(dj60Var2.f88782a, dj60Var2.f88783b);
            } else if (i2 == 1) {
                path.lineTo(dj60Var2.f88782a, dj60Var2.f88783b);
            } else if (i2 == 2) {
                path.quadTo(dj60Var2.f88784c, dj60Var2.f88785d, dj60Var2.f88782a, dj60Var2.f88783b);
            } else if (i2 == 3) {
                path.cubicTo(dj60Var2.f88784c, dj60Var2.f88785d, dj60Var2.f88786e, dj60Var2.f88787f, dj60Var2.f88782a, dj60Var2.f88783b);
            }
        }
        return new PathMeasure(path, false).getLength();
    }

    /* JADX INFO: renamed from: m */
    private void m146570m(TypeEvaluator typeEvaluator) {
        this.f122201k = typeEvaluator;
    }

    /* JADX INFO: renamed from: n */
    public static jqf m146571n(f2m f2mVar, TypeEvaluator typeEvaluator, Object... objArr) {
        int length = objArr.length;
        C18004a[] c18004aArr = new C18004a[Math.max(length, 2)];
        if (length == 1) {
            c18004aArr[0] = C18004a.m146572d(0.0f, null);
            c18004aArr[1] = C18004a.m146572d(1.0f, (dj60) objArr[0]);
        } else {
            c18004aArr[0] = C18004a.m146572d(0.0f, (dj60) objArr[0]);
            float fM146569l = m146569l(objArr);
            for (int i = 1; i < length; i++) {
                c18004aArr[i] = C18004a.m146572d(m146569l(objArr[i - 1], objArr[i]) / fM146569l, (dj60) objArr[i]);
            }
        }
        jqf jqfVar = new jqf(f2mVar, c18004aArr);
        jqfVar.m146570m(typeEvaluator);
        return jqfVar;
    }

    @Override // p153l.hqf
    /* JADX INFO: renamed from: d */
    public void mo131372d(float f) {
        int i = this.f122200j;
        if (i == 2) {
            TimeInterpolator timeInterpolator = this.f122202l;
            if (timeInterpolator != null) {
                f = timeInterpolator.getInterpolation(f);
            }
            ((f2m) this.f111117a).mo123630f((dj60) this.f122201k.evaluate(f, this.f122198h.m146575c(), this.f122199i.m146575c()));
            return;
        }
        int i2 = 1;
        if (f <= 0.0f) {
            C18004a c18004a = this.f122197g.get(1);
            TimeInterpolator timeInterpolatorM146574b = c18004a.m146574b();
            if (timeInterpolatorM146574b != null) {
                f = timeInterpolatorM146574b.getInterpolation(f);
            }
            float fM146573a = this.f122198h.m146573a();
            ((f2m) this.f111117a).mo123630f((dj60) this.f122201k.evaluate((f - fM146573a) / (c18004a.m146573a() - fM146573a), this.f122198h.m146575c(), c18004a.m146575c()));
            return;
        }
        if (f >= 1.0f) {
            C18004a c18004a2 = this.f122197g.get(i - 2);
            TimeInterpolator timeInterpolatorM146574b2 = this.f122199i.m146574b();
            if (timeInterpolatorM146574b2 != null) {
                f = timeInterpolatorM146574b2.getInterpolation(f);
            }
            float fM146573a2 = c18004a2.m146573a();
            ((f2m) this.f111117a).mo123630f((dj60) this.f122201k.evaluate((f - fM146573a2) / (this.f122199i.m146573a() - fM146573a2), c18004a2.m146575c(), this.f122199i.m146575c()));
            return;
        }
        C18004a c18004a3 = this.f122198h;
        while (i2 < this.f122200j) {
            C18004a c18004a4 = this.f122197g.get(i2);
            if (f < c18004a4.m146573a()) {
                TimeInterpolator timeInterpolatorM146574b3 = c18004a4.m146574b();
                float fM146573a3 = c18004a3.m146573a();
                float fM146573a4 = (f - fM146573a3) / (c18004a4.m146573a() - fM146573a3);
                if (timeInterpolatorM146574b3 != null) {
                    fM146573a4 = timeInterpolatorM146574b3.getInterpolation(fM146573a4);
                }
                ((f2m) this.f111117a).mo123630f((dj60) this.f122201k.evaluate(fM146573a4, c18004a3.m146575c(), c18004a4.m146575c()));
                return;
            }
            i2++;
            c18004a3 = c18004a4;
        }
    }
}
