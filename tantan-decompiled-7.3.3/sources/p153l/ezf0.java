package p153l;

import androidx.annotation.FloatRange;
import androidx.annotation.RestrictTo;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX INFO: loaded from: classes.dex */
public final class ezf0 {

    /* JADX INFO: renamed from: a */
    public double f96584a;

    /* JADX INFO: renamed from: b */
    public double f96585b;

    /* JADX INFO: renamed from: c */
    public boolean f96586c;

    /* JADX INFO: renamed from: d */
    public double f96587d;

    /* JADX INFO: renamed from: e */
    public double f96588e;

    /* JADX INFO: renamed from: f */
    public double f96589f;

    /* JADX INFO: renamed from: g */
    public double f96590g;

    /* JADX INFO: renamed from: h */
    public double f96591h;

    /* JADX INFO: renamed from: i */
    public double f96592i;

    /* JADX INFO: renamed from: j */
    public final bge.C15999p f96593j;

    public ezf0(float f) {
        this.f96584a = Math.sqrt(1500.0d);
        this.f96585b = 0.5d;
        this.f96586c = false;
        this.f96592i = Double.MAX_VALUE;
        this.f96593j = new bge.C15999p();
        this.f96592i = f;
    }

    /* JADX INFO: renamed from: a */
    public float m123344a() {
        return (float) this.f96592i;
    }

    /* JADX INFO: renamed from: b */
    public final void m123345b() {
        if (this.f96586c) {
            return;
        }
        if (this.f96592i == Double.MAX_VALUE) {
            wtq0.m207906a("Error: Final position of the spring must be set before the animation starts");
            return;
        }
        double d = this.f96585b;
        if (d > 1.0d) {
            double d2 = this.f96584a;
            this.f96589f = ((-d) * d2) + (d2 * Math.sqrt((d * d) - 1.0d));
            double d3 = this.f96585b;
            double d4 = this.f96584a;
            this.f96590g = ((-d3) * d4) - (d4 * Math.sqrt((d3 * d3) - 1.0d));
        } else if (d >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && d < 1.0d) {
            this.f96591h = this.f96584a * Math.sqrt(1.0d - (d * d));
        }
        this.f96586c = true;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: c */
    public boolean m123346c(float f, float f2) {
        return ((double) Math.abs(f2)) < this.f96588e && ((double) Math.abs(f - m123344a())) < this.f96587d;
    }

    /* JADX INFO: renamed from: d */
    public ezf0 m123347d(@FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) float f) {
        if (f < 0.0f) {
            wg3.m206174a("Damping ratio must be non-negative");
            return null;
        }
        this.f96585b = f;
        this.f96586c = false;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public ezf0 m123348e(float f) {
        this.f96592i = f;
        return this;
    }

    /* JADX INFO: renamed from: f */
    public ezf0 m123349f(@FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, fromInclusive = false) float f) {
        if (f <= 0.0f) {
            wg3.m206174a("Spring stiffness constant must be positive.");
            return null;
        }
        this.f96584a = Math.sqrt(f);
        this.f96586c = false;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public void m123350g(double d) {
        double dAbs = Math.abs(d);
        this.f96587d = dAbs;
        this.f96588e = dAbs * 62.5d;
    }

    /* JADX INFO: renamed from: h */
    public bge.C15999p m123351h(double d, double d2, long j) {
        double dPow;
        double dCos;
        m123345b();
        double d3 = j / 1000.0d;
        double d4 = d - this.f96592i;
        double d5 = this.f96585b;
        if (d5 > 1.0d) {
            double d6 = this.f96590g;
            double d7 = this.f96589f;
            double d8 = d4 - (((d6 * d4) - d2) / (d6 - d7));
            double d9 = ((d4 * d6) - d2) / (d6 - d7);
            dPow = (Math.pow(2.718281828459045d, d6 * d3) * d8) + (Math.pow(2.718281828459045d, this.f96589f * d3) * d9);
            double d10 = this.f96590g;
            double dPow2 = d8 * d10 * Math.pow(2.718281828459045d, d10 * d3);
            double d11 = this.f96589f;
            dCos = dPow2 + (d9 * d11 * Math.pow(2.718281828459045d, d11 * d3));
        } else if (d5 == 1.0d) {
            double d12 = this.f96584a;
            double d13 = d2 + (d12 * d4);
            double d14 = d4 + (d13 * d3);
            dPow = Math.pow(2.718281828459045d, (-d12) * d3) * d14;
            double dPow3 = d14 * Math.pow(2.718281828459045d, (-this.f96584a) * d3);
            double d15 = this.f96584a;
            dCos = (d13 * Math.pow(2.718281828459045d, (-d15) * d3)) + (dPow3 * (-d15));
        } else {
            double d16 = 1.0d / this.f96591h;
            double d17 = this.f96584a;
            double d18 = d16 * ((d5 * d17 * d4) + d2);
            dPow = Math.pow(2.718281828459045d, (-d5) * d17 * d3) * ((Math.cos(this.f96591h * d3) * d4) + (Math.sin(this.f96591h * d3) * d18));
            double d19 = this.f96584a;
            double d20 = this.f96585b;
            double dPow4 = Math.pow(2.718281828459045d, (-d20) * d19 * d3);
            double d21 = this.f96591h;
            double dSin = (-d21) * d4 * Math.sin(d21 * d3);
            double d22 = this.f96591h;
            dCos = ((-d19) * dPow * d20) + (dPow4 * (dSin + (d18 * d22 * Math.cos(d22 * d3))));
        }
        bge.C15999p c15999p = this.f96593j;
        c15999p.f76614a = (float) (dPow + this.f96592i);
        c15999p.f76615b = (float) dCos;
        return c15999p;
    }

    public ezf0() {
        this.f96584a = Math.sqrt(1500.0d);
        this.f96585b = 0.5d;
        this.f96586c = false;
        this.f96592i = Double.MAX_VALUE;
        this.f96593j = new bge.C15999p();
    }
}
