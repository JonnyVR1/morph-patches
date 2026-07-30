package p149l;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes13.dex */
public final class efx {

    /* JADX INFO: renamed from: a */
    public WeakReference<View> f90867a;

    /* JADX INFO: renamed from: b */
    public int f90868b;

    /* JADX INFO: renamed from: c */
    public int f90869c;

    /* JADX INFO: renamed from: d */
    public int f90870d;

    /* JADX INFO: renamed from: e */
    public int f90871e;

    /* JADX INFO: renamed from: f */
    public int f90872f;

    /* JADX INFO: renamed from: g */
    public int f90873g;

    /* JADX INFO: renamed from: h */
    public int f90874h;

    /* JADX INFO: renamed from: i */
    public int f90875i = 0;

    public efx(View view) {
        this.f90867a = new WeakReference<>(view);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:49:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ae A[DONT_INVERT] */
    /* JADX INFO: renamed from: a */
    public void m116097a(int i, int i2) {
        int i3;
        float f;
        int i4;
        int i5 = this.f90872f;
        if (i5 == 90 || i5 == 270) {
            i2 = i;
            i = i2;
        }
        int defaultSize = View.getDefaultSize(this.f90868b, i);
        int defaultSize2 = View.getDefaultSize(this.f90869c, i2);
        if (this.f90875i != 3) {
            if (this.f90868b <= 0 || this.f90869c <= 0) {
                i = defaultSize;
                i2 = defaultSize2;
            } else {
                int mode = View.MeasureSpec.getMode(i);
                i = View.MeasureSpec.getSize(i);
                int mode2 = View.MeasureSpec.getMode(i2);
                i2 = View.MeasureSpec.getSize(i2);
                if (mode == Integer.MIN_VALUE && mode2 == Integer.MIN_VALUE) {
                    float f2 = i;
                    float f3 = i2;
                    float f4 = f2 / f3;
                    int i6 = this.f90875i;
                    if (i6 == 4) {
                        int i7 = this.f90872f;
                        f = (i7 == 90 || i7 == 270) ? 0.5625f : 1.7777778f;
                    } else if (i6 != 5) {
                        f = this.f90868b / this.f90869c;
                        int i8 = this.f90870d;
                        if (i8 > 0 && (i4 = this.f90871e) > 0) {
                            f = (f * i8) / i4;
                        }
                    } else {
                        int i9 = this.f90872f;
                        f = (i9 == 90 || i9 == 270) ? 0.75f : 1.3333334f;
                    }
                    boolean z = f > f4;
                    if (i6 == 0) {
                        if (z) {
                            i2 = (int) (f2 / f);
                        } else {
                            i = (int) (f3 * f);
                        }
                    } else if (i6 != 1) {
                        if (i6 == 4 || i6 == 5) {
                            if (z) {
                                i2 = (int) (f2 / f);
                            } else {
                                i = (int) (f3 * f);
                            }
                        } else if (z) {
                            i = Math.min(this.f90868b, i);
                            i2 = (int) (i / f);
                        } else {
                            int iMin = Math.min(this.f90869c, i2);
                            i2 = iMin;
                            i = (int) (iMin * f);
                        }
                    } else if (z) {
                        i = (int) (f3 * f);
                    } else {
                        i2 = (int) (f2 / f);
                    }
                } else if (mode == 1073741824 && mode2 == 1073741824) {
                    int i10 = this.f90868b;
                    int i11 = i10 * i2;
                    int i12 = this.f90869c;
                    if (i11 < i * i12) {
                        i = (i10 * i2) / i12;
                    } else if (i10 * i2 > i * i12) {
                        i2 = (i12 * i) / i10;
                    }
                } else if (mode == 1073741824) {
                    int i13 = (this.f90869c * i) / this.f90868b;
                    if (mode2 != Integer.MIN_VALUE || i13 <= i2) {
                        i2 = i13;
                    }
                } else {
                    int i14 = this.f90868b;
                    if (mode2 == 1073741824) {
                        int i15 = (i14 * i2) / this.f90869c;
                        if (mode != Integer.MIN_VALUE || i15 <= i) {
                            i = i15;
                        }
                    } else {
                        int i16 = this.f90869c;
                        if (mode2 != Integer.MIN_VALUE || i16 <= i2) {
                            i2 = i16;
                            i3 = i14;
                        } else {
                            i3 = (i2 * i14) / i16;
                        }
                        if (mode != Integer.MIN_VALUE || i3 <= i) {
                            i = i3;
                        } else {
                            i2 = (i16 * i) / i14;
                        }
                    }
                }
            }
        }
        this.f90873g = i;
        this.f90874h = i2;
    }

    /* JADX INFO: renamed from: b */
    public int m116098b() {
        return this.f90874h;
    }

    /* JADX INFO: renamed from: c */
    public int m116099c() {
        return this.f90873g;
    }

    /* JADX INFO: renamed from: d */
    public void m116100d(int i) {
        this.f90875i = i;
    }

    /* JADX INFO: renamed from: e */
    public void m116101e(int i) {
        this.f90872f = i;
    }
}
