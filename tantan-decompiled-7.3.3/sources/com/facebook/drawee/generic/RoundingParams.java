package com.facebook.drawee.generic;

import androidx.annotation.ColorInt;
import java.util.Arrays;
import p153l.wn80;

/* JADX INFO: loaded from: classes.dex */
public class RoundingParams {

    /* JADX INFO: renamed from: a */
    public RoundingMethod f6374a = RoundingMethod.BITMAP_ONLY;

    /* JADX INFO: renamed from: b */
    public boolean f6375b = false;

    /* JADX INFO: renamed from: c */
    public float[] f6376c = null;

    /* JADX INFO: renamed from: d */
    public int f6377d = 0;

    /* JADX INFO: renamed from: e */
    public float f6378e = 0.0f;

    /* JADX INFO: renamed from: f */
    public int f6379f = 0;

    /* JADX INFO: renamed from: g */
    public float f6380g = 0.0f;

    /* JADX INFO: renamed from: h */
    public boolean f6381h = false;

    /* JADX INFO: renamed from: i */
    public boolean f6382i = false;

    /* JADX INFO: renamed from: j */
    public boolean f6383j = false;

    public enum RoundingMethod {
        OVERLAY_COLOR,
        BITMAP_ONLY
    }

    /* JADX INFO: renamed from: a */
    public static RoundingParams m8301a() {
        return new RoundingParams().m8322v(true);
    }

    /* JADX INFO: renamed from: b */
    public static RoundingParams m8302b(float f, float f2, float f3, float f4) {
        return new RoundingParams().m8318r(f, f2, f3, f4);
    }

    /* JADX INFO: renamed from: c */
    public static RoundingParams m8303c(float f) {
        return new RoundingParams().m8319s(f);
    }

    /* JADX INFO: renamed from: d */
    public int m8304d() {
        return this.f6379f;
    }

    /* JADX INFO: renamed from: e */
    public float m8305e() {
        return this.f6378e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RoundingParams roundingParams = (RoundingParams) obj;
        if (this.f6375b == roundingParams.f6375b && this.f6377d == roundingParams.f6377d && Float.compare(roundingParams.f6378e, this.f6378e) == 0 && this.f6379f == roundingParams.f6379f && Float.compare(roundingParams.f6380g, this.f6380g) == 0 && this.f6374a == roundingParams.f6374a && this.f6381h == roundingParams.f6381h && this.f6382i == roundingParams.f6382i) {
            return Arrays.equals(this.f6376c, roundingParams.f6376c);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public float[] m8306f() {
        return this.f6376c;
    }

    /* JADX INFO: renamed from: g */
    public final float[] m8307g() {
        if (this.f6376c == null) {
            this.f6376c = new float[8];
        }
        return this.f6376c;
    }

    /* JADX INFO: renamed from: h */
    public int m8308h() {
        return this.f6377d;
    }

    public int hashCode() {
        RoundingMethod roundingMethod = this.f6374a;
        int iHashCode = (((roundingMethod != null ? roundingMethod.hashCode() : 0) * 31) + (this.f6375b ? 1 : 0)) * 31;
        float[] fArr = this.f6376c;
        int iHashCode2 = (((iHashCode + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31) + this.f6377d) * 31;
        float f = this.f6378e;
        int iFloatToIntBits = (((iHashCode2 + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31) + this.f6379f) * 31;
        float f2 = this.f6380g;
        return ((((iFloatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31) + (this.f6381h ? 1 : 0)) * 31) + (this.f6382i ? 1 : 0);
    }

    /* JADX INFO: renamed from: i */
    public float m8309i() {
        return this.f6380g;
    }

    /* JADX INFO: renamed from: j */
    public boolean m8310j() {
        return this.f6382i;
    }

    /* JADX INFO: renamed from: k */
    public boolean m8311k() {
        return this.f6383j;
    }

    /* JADX INFO: renamed from: l */
    public boolean m8312l() {
        return this.f6375b;
    }

    /* JADX INFO: renamed from: m */
    public RoundingMethod m8313m() {
        return this.f6374a;
    }

    /* JADX INFO: renamed from: n */
    public boolean m8314n() {
        return this.f6381h;
    }

    /* JADX INFO: renamed from: o */
    public RoundingParams m8315o(@ColorInt int i, float f) {
        wn80.m207178c(f >= 0.0f, "the border width cannot be < 0");
        this.f6378e = f;
        this.f6379f = i;
        return this;
    }

    /* JADX INFO: renamed from: p */
    public RoundingParams m8316p(@ColorInt int i) {
        this.f6379f = i;
        return this;
    }

    /* JADX INFO: renamed from: q */
    public RoundingParams m8317q(float f) {
        wn80.m207178c(f >= 0.0f, "the border width cannot be < 0");
        this.f6378e = f;
        return this;
    }

    /* JADX INFO: renamed from: r */
    public RoundingParams m8318r(float f, float f2, float f3, float f4) {
        float[] fArrM8307g = m8307g();
        fArrM8307g[1] = f;
        fArrM8307g[0] = f;
        fArrM8307g[3] = f2;
        fArrM8307g[2] = f2;
        fArrM8307g[5] = f3;
        fArrM8307g[4] = f3;
        fArrM8307g[7] = f4;
        fArrM8307g[6] = f4;
        return this;
    }

    /* JADX INFO: renamed from: s */
    public RoundingParams m8319s(float f) {
        Arrays.fill(m8307g(), f);
        return this;
    }

    /* JADX INFO: renamed from: t */
    public RoundingParams m8320t(@ColorInt int i) {
        this.f6377d = i;
        this.f6374a = RoundingMethod.OVERLAY_COLOR;
        return this;
    }

    /* JADX INFO: renamed from: u */
    public RoundingParams m8321u(float f) {
        wn80.m207178c(f >= 0.0f, "the padding cannot be < 0");
        this.f6380g = f;
        return this;
    }

    /* JADX INFO: renamed from: v */
    public RoundingParams m8322v(boolean z) {
        this.f6375b = z;
        return this;
    }

    /* JADX INFO: renamed from: w */
    public RoundingParams m8323w(RoundingMethod roundingMethod) {
        this.f6374a = roundingMethod;
        return this;
    }
}
