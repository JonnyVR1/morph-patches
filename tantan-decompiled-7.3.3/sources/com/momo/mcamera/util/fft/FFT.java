package com.momo.mcamera.util.fft;

import p153l.wg3;

/* JADX INFO: loaded from: classes8.dex */
public class FFT extends FourierTransform {
    public static final int ACCURACY_HIGH = 2048;
    public static final int ACCURACY_HIGHEST = 4096;
    public static final int ACCURACY_LOW = 512;
    public static final int ACCURACY_LOWEST = 256;
    public static final int ACCURACY_MIDEUM = 1024;
    private float[] coslookup;
    private int[] reverse;
    private float[] sinlookup;

    public FFT(int i, float f) {
        super(i, f);
        if ((i & (i - 1)) != 0) {
            wg3.m206174a("FFT: timeSize must be a power of two.");
            throw null;
        }
        buildReverseTable();
        buildTrigTables();
    }

    private void bitReverseComplex() {
        float[] fArr = new float[this.real.length];
        float[] fArr2 = new float[this.imag.length];
        int i = 0;
        while (true) {
            float[] fArr3 = this.real;
            if (i >= fArr3.length) {
                this.real = fArr;
                this.imag = fArr2;
                return;
            } else {
                int i2 = this.reverse[i];
                fArr[i] = fArr3[i2];
                fArr2[i] = this.imag[i2];
                i++;
            }
        }
    }

    private void bitReverseSamples(float[] fArr, int i) {
        for (int i2 = 0; i2 < this.timeSize; i2++) {
            this.real[i2] = fArr[this.reverse[i2] + i];
            this.imag[i2] = 0.0f;
        }
    }

    private void buildReverseTable() {
        int i = this.timeSize;
        int[] iArr = new int[i];
        this.reverse = iArr;
        iArr[0] = 0;
        int i2 = i / 2;
        int i3 = 1;
        while (i3 < i) {
            for (int i4 = 0; i4 < i3; i4++) {
                int[] iArr2 = this.reverse;
                iArr2[i4 + i3] = iArr2[i4] + i2;
            }
            i3 <<= 1;
            i2 >>= 1;
        }
    }

    private void buildTrigTables() {
        int i = this.timeSize;
        this.sinlookup = new float[i];
        this.coslookup = new float[i];
        for (int i2 = 0; i2 < i; i2++) {
            double d = (-3.1415927f) / i2;
            this.sinlookup[i2] = (float) Math.sin(d);
            this.coslookup[i2] = (float) Math.cos(d);
        }
    }

    private float cos(int i) {
        return this.coslookup[i];
    }

    private void fft() {
        for (int i = 1; i < this.real.length; i *= 2) {
            float fCos = cos(i);
            float fSin = sin(i);
            float f = 1.0f;
            float f2 = 0.0f;
            int i2 = 0;
            while (i2 < i) {
                int i3 = i2;
                while (true) {
                    float[] fArr = this.real;
                    if (i3 < fArr.length) {
                        int i4 = i3 + i;
                        float f3 = fArr[i4];
                        float[] fArr2 = this.imag;
                        float f4 = fArr2[i4];
                        float f5 = (f * f3) - (f2 * f4);
                        float f6 = (f4 * f) + (f3 * f2);
                        fArr[i4] = fArr[i3] - f5;
                        fArr2[i4] = fArr2[i3] - f6;
                        fArr[i3] = fArr[i3] + f5;
                        fArr2[i3] = fArr2[i3] + f6;
                        i3 += i * 2;
                    }
                }
                float f7 = (f * fCos) - (f2 * fSin);
                f2 = (f2 * fCos) + (f * fSin);
                i2++;
                f = f7;
            }
        }
    }

    private float sin(int i) {
        return this.sinlookup[i];
    }

    @Override // com.momo.mcamera.util.fft.FourierTransform
    public void allocateArrays() {
        int i = this.timeSize;
        this.spectrum = new float[(i / 2) + 1];
        this.real = new float[i];
        this.imag = new float[i];
    }

    public void forward(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        int i = this.timeSize;
        if (length == i && fArr2.length == i) {
            setComplex(fArr, fArr2);
            bitReverseComplex();
            fft();
            fillSpectrum();
        }
    }

    @Override // com.momo.mcamera.util.fft.FourierTransform
    public void inverse(float[] fArr) {
        if (fArr.length > this.real.length) {
            return;
        }
        for (int i = 0; i < this.timeSize; i++) {
            float[] fArr2 = this.imag;
            fArr2[i] = fArr2[i] * (-1.0f);
        }
        bitReverseComplex();
        fft();
        for (int i2 = 0; i2 < fArr.length; i2++) {
            float[] fArr3 = this.real;
            fArr[i2] = fArr3[i2] / fArr3.length;
        }
    }

    @Override // com.momo.mcamera.util.fft.FourierTransform
    public void scaleBand(int i, float f) {
        if (f < 0.0f) {
            return;
        }
        float[] fArr = this.real;
        fArr[i] = fArr[i] * f;
        float[] fArr2 = this.imag;
        fArr2[i] = fArr2[i] * f;
        float[] fArr3 = this.spectrum;
        fArr3[i] = fArr3[i] * f;
        if (i != 0) {
            int i2 = this.timeSize;
            if (i != i2 / 2) {
                fArr[i2 - i] = fArr[i];
                fArr2[i2 - i] = -fArr2[i];
            }
        }
    }

    @Override // com.momo.mcamera.util.fft.FourierTransform
    public void setBand(int i, float f) {
        if (f < 0.0f) {
            return;
        }
        float[] fArr = this.real;
        float f2 = fArr[i];
        if (f2 == 0.0f && this.imag[i] == 0.0f) {
            fArr[i] = f;
            this.spectrum[i] = f;
        } else {
            float[] fArr2 = this.spectrum;
            fArr[i] = f2 / fArr2[i];
            float[] fArr3 = this.imag;
            fArr3[i] = fArr3[i] / fArr2[i];
            fArr2[i] = f;
            fArr[i] = fArr[i] * f;
            fArr3[i] = fArr3[i] * fArr2[i];
        }
        if (i != 0) {
            int i2 = this.timeSize;
            if (i != i2 / 2) {
                fArr[i2 - i] = fArr[i];
                float[] fArr4 = this.imag;
                fArr4[i2 - i] = -fArr4[i];
            }
        }
    }

    @Override // com.momo.mcamera.util.fft.FourierTransform
    public void forward(float[] fArr, int i) {
        if (fArr.length - i < this.timeSize) {
            return;
        }
        bitReverseSamples(fArr, i);
        fft();
        fillSpectrum();
    }

    @Override // com.momo.mcamera.util.fft.FourierTransform
    public void forward(float[] fArr) {
        if (fArr.length != this.timeSize) {
            return;
        }
        bitReverseSamples(fArr, 0);
        fft();
        fillSpectrum();
    }
}
