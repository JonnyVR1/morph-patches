package com.facebook.drawee.generic;

import androidx.annotation.ColorInt;
import java.util.Arrays;
import p149l.rf80;

/* JADX INFO: loaded from: classes.dex */
public class RoundingParams {

    /* JADX INFO: renamed from: a */
    public RoundingMethod f6337a = RoundingMethod.BITMAP_ONLY;

    /* JADX INFO: renamed from: b */
    public boolean f6338b = false;

    /* JADX INFO: renamed from: c */
    public float[] f6339c = null;

    /* JADX INFO: renamed from: d */
    public int f6340d = 0;

    /* JADX INFO: renamed from: e */
    public float f6341e = 0.0f;

    /* JADX INFO: renamed from: f */
    public int f6342f = 0;

    /* JADX INFO: renamed from: g */
    public float f6343g = 0.0f;

    /* JADX INFO: renamed from: h */
    public boolean f6344h = false;

    /* JADX INFO: renamed from: i */
    public boolean f6345i = false;

    /* JADX INFO: renamed from: j */
    public boolean f6346j = false;

    public enum RoundingMethod {
        OVERLAY_COLOR,
        BITMAP_ONLY
    }

    /* JADX INFO: renamed from: a */
    public static RoundingParams m8247a() {
        return new RoundingParams().m8268v(true);
    }

    /* JADX INFO: renamed from: b */
    public static RoundingParams m8248b(float f, float f2, float f3, float f4) {
        return new RoundingParams().m8264r(f, f2, f3, f4);
    }

    /* JADX INFO: renamed from: c */
    public static RoundingParams m8249c(float f) {
        return new RoundingParams().m8265s(f);
    }

    /* JADX INFO: renamed from: d */
    public int m8250d() {
        return this.f6342f;
    }

    /* JADX INFO: renamed from: e */
    public float m8251e() {
        return this.f6341e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RoundingParams roundingParams = (RoundingParams) obj;
        if (this.f6338b == roundingParams.f6338b && this.f6340d == roundingParams.f6340d && Float.compare(roundingParams.f6341e, this.f6341e) == 0 && this.f6342f == roundingParams.f6342f && Float.compare(roundingParams.f6343g, this.f6343g) == 0 && this.f6337a == roundingParams.f6337a && this.f6344h == roundingParams.f6344h && this.f6345i == roundingParams.f6345i) {
            return Arrays.equals(this.f6339c, roundingParams.f6339c);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public float[] m8252f() {
        return this.f6339c;
    }

    /* JADX INFO: renamed from: g */
    public final float[] m8253g() {
        if (this.f6339c == null) {
            this.f6339c = new float[8];
        }
        return this.f6339c;
    }

    /* JADX INFO: renamed from: h */
    public int m8254h() {
        return this.f6340d;
    }

    public int hashCode() {
        RoundingMethod roundingMethod = this.f6337a;
        int iHashCode = (((roundingMethod != null ? roundingMethod.hashCode() : 0) * 31) + (this.f6338b ? 1 : 0)) * 31;
        float[] fArr = this.f6339c;
        int iHashCode2 = (((iHashCode + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31) + this.f6340d) * 31;
        float f = this.f6341e;
        int iFloatToIntBits = (((iHashCode2 + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31) + this.f6342f) * 31;
        float f2 = this.f6343g;
        return ((((iFloatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31) + (this.f6344h ? 1 : 0)) * 31) + (this.f6345i ? 1 : 0);
    }

    /* JADX INFO: renamed from: i */
    public float m8255i() {
        return this.f6343g;
    }

    /* JADX INFO: renamed from: j */
    public boolean m8256j() {
        return this.f6345i;
    }

    /* JADX INFO: renamed from: k */
    public boolean m8257k() {
        return this.f6346j;
    }

    /* JADX INFO: renamed from: l */
    public boolean m8258l() {
        return this.f6338b;
    }

    /* JADX INFO: renamed from: m */
    public RoundingMethod m8259m() {
        return this.f6337a;
    }

    /* JADX INFO: renamed from: n */
    public boolean m8260n() {
        return this.f6344h;
    }

    /* JADX INFO: renamed from: o */
    public RoundingParams m8261o(@ColorInt int i, float f) {
        rf80.m179112c(f >= 0.0f, "the border width cannot be < 0");
        this.f6341e = f;
        this.f6342f = i;
        return this;
    }

    /* JADX INFO: renamed from: p */
    public RoundingParams m8262p(@ColorInt int i) {
        this.f6342f = i;
        return this;
    }

    /* JADX INFO: renamed from: q */
    public RoundingParams m8263q(float f) {
        rf80.m179112c(f >= 0.0f, "the border width cannot be < 0");
        this.f6341e = f;
        return this;
    }

    /* JADX INFO: renamed from: r */
    public RoundingParams m8264r(float f, float f2, float f3, float f4) {
        float[] fArrM8253g = m8253g();
        fArrM8253g[1] = f;
        fArrM8253g[0] = f;
        fArrM8253g[3] = f2;
        fArrM8253g[2] = f2;
        fArrM8253g[5] = f3;
        fArrM8253g[4] = f3;
        fArrM8253g[7] = f4;
        fArrM8253g[6] = f4;
        return this;
    }

    /* JADX INFO: renamed from: s */
    public RoundingParams m8265s(float f) {
        Arrays.fill(m8253g(), f);
        return this;
    }

    /* JADX INFO: renamed from: t */
    public RoundingParams m8266t(@ColorInt int i) {
        this.f6340d = i;
        this.f6337a = RoundingMethod.OVERLAY_COLOR;
        return this;
    }

    /* JADX INFO: renamed from: u */
    public RoundingParams m8267u(float f) {
        rf80.m179112c(f >= 0.0f, "the padding cannot be < 0");
        this.f6343g = f;
        return this;
    }

    /* JADX INFO: renamed from: v */
    public RoundingParams m8268v(boolean z) {
        this.f6338b = z;
        return this;
    }

    /* JADX INFO: renamed from: w */
    public RoundingParams m8269w(RoundingMethod roundingMethod) {
        this.f6337a = roundingMethod;
        return this;
    }
}
