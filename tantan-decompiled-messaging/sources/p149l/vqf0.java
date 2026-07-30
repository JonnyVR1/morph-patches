package p149l;

import androidx.annotation.FloatRange;
import androidx.annotation.RestrictTo;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX INFO: loaded from: classes.dex */
public final class vqf0 {

    /* JADX INFO: renamed from: a */
    public double f182627a;

    /* JADX INFO: renamed from: b */
    public double f182628b;

    /* JADX INFO: renamed from: c */
    public boolean f182629c;

    /* JADX INFO: renamed from: d */
    public double f182630d;

    /* JADX INFO: renamed from: e */
    public double f182631e;

    /* JADX INFO: renamed from: f */
    public double f182632f;

    /* JADX INFO: renamed from: g */
    public double f182633g;

    /* JADX INFO: renamed from: h */
    public double f182634h;

    /* JADX INFO: renamed from: i */
    public double f182635i;

    /* JADX INFO: renamed from: j */
    public final xee.C21137p f182636j;

    public vqf0(float f) {
        this.f182627a = Math.sqrt(1500.0d);
        this.f182628b = 0.5d;
        this.f182629c = false;
        this.f182635i = Double.MAX_VALUE;
        this.f182636j = new xee.C21137p();
        this.f182635i = f;
    }

    /* JADX INFO: renamed from: a */
    public float m199487a() {
        return (float) this.f182635i;
    }

    /* JADX INFO: renamed from: b */
    public final void m199488b() {
        if (this.f182629c) {
            return;
        }
        if (this.f182635i == Double.MAX_VALUE) {
            qkq0.m175383a("Error: Final position of the spring must be set before the animation starts");
            return;
        }
        double d = this.f182628b;
        if (d > 1.0d) {
            double d2 = this.f182627a;
            this.f182632f = ((-d) * d2) + (d2 * Math.sqrt((d * d) - 1.0d));
            double d3 = this.f182628b;
            double d4 = this.f182627a;
            this.f182633g = ((-d3) * d4) - (d4 * Math.sqrt((d3 * d3) - 1.0d));
        } else if (d >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && d < 1.0d) {
            this.f182634h = this.f182627a * Math.sqrt(1.0d - (d * d));
        }
        this.f182629c = true;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: c */
    public boolean m199489c(float f, float f2) {
        return ((double) Math.abs(f2)) < this.f182631e && ((double) Math.abs(f - m199487a())) < this.f182630d;
    }

    /* JADX INFO: renamed from: d */
    public vqf0 m199490d(@FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) float f) {
        if (f < 0.0f) {
            ig3.m135964a("Damping ratio must be non-negative");
            return null;
        }
        this.f182628b = f;
        this.f182629c = false;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public vqf0 m199491e(float f) {
        this.f182635i = f;
        return this;
    }

    /* JADX INFO: renamed from: f */
    public vqf0 m199492f(@FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, fromInclusive = false) float f) {
        if (f <= 0.0f) {
            ig3.m135964a("Spring stiffness constant must be positive.");
            return null;
        }
        this.f182627a = Math.sqrt(f);
        this.f182629c = false;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public void m199493g(double d) {
        double dAbs = Math.abs(d);
        this.f182630d = dAbs;
        this.f182631e = dAbs * 62.5d;
    }

    /* JADX INFO: renamed from: h */
    public xee.C21137p m199494h(double d, double d2, long j) {
        double dPow;
        double dCos;
        m199488b();
        double d3 = j / 1000.0d;
        double d4 = d - this.f182635i;
        double d5 = this.f182628b;
        if (d5 > 1.0d) {
            double d6 = this.f182633g;
            double d7 = this.f182632f;
            double d8 = d4 - (((d6 * d4) - d2) / (d6 - d7));
            double d9 = ((d4 * d6) - d2) / (d6 - d7);
            dPow = (Math.pow(2.718281828459045d, d6 * d3) * d8) + (Math.pow(2.718281828459045d, this.f182632f * d3) * d9);
            double d10 = this.f182633g;
            double dPow2 = d8 * d10 * Math.pow(2.718281828459045d, d10 * d3);
            double d11 = this.f182632f;
            dCos = dPow2 + (d9 * d11 * Math.pow(2.718281828459045d, d11 * d3));
        } else if (d5 == 1.0d) {
            double d12 = this.f182627a;
            double d13 = d2 + (d12 * d4);
            double d14 = d4 + (d13 * d3);
            dPow = Math.pow(2.718281828459045d, (-d12) * d3) * d14;
            double dPow3 = d14 * Math.pow(2.718281828459045d, (-this.f182627a) * d3);
            double d15 = this.f182627a;
            dCos = (d13 * Math.pow(2.718281828459045d, (-d15) * d3)) + (dPow3 * (-d15));
        } else {
            double d16 = 1.0d / this.f182634h;
            double d17 = this.f182627a;
            double d18 = d16 * ((d5 * d17 * d4) + d2);
            dPow = Math.pow(2.718281828459045d, (-d5) * d17 * d3) * ((Math.cos(this.f182634h * d3) * d4) + (Math.sin(this.f182634h * d3) * d18));
            double d19 = this.f182627a;
            double d20 = this.f182628b;
            double dPow4 = Math.pow(2.718281828459045d, (-d20) * d19 * d3);
            double d21 = this.f182634h;
            double dSin = (-d21) * d4 * Math.sin(d21 * d3);
            double d22 = this.f182634h;
            dCos = ((-d19) * dPow * d20) + (dPow4 * (dSin + (d18 * d22 * Math.cos(d22 * d3))));
        }
        xee.C21137p c21137p = this.f182636j;
        c21137p.f192593a = (float) (dPow + this.f182635i);
        c21137p.f192594b = (float) dCos;
        return c21137p;
    }

    public vqf0() {
        this.f182627a = Math.sqrt(1500.0d);
        this.f182628b = 0.5d;
        this.f182629c = false;
        this.f182635i = Double.MAX_VALUE;
        this.f182636j = new xee.C21137p();
    }
}
