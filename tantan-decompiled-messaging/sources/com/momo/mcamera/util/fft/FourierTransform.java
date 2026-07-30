package com.momo.mcamera.util.fft;

/* JADX INFO: loaded from: classes7.dex */
public abstract class FourierTransform {
    protected static final int LINAVG = 1;
    protected static final int LOGAVG = 2;
    protected static final int NOAVG = 3;
    protected static final float TWO_PI = 6.2831855f;
    protected float[] averages;
    protected int avgPerOctave;
    protected float bandWidth;
    protected float[] imag;
    protected int octaves;
    protected float[] real;
    protected int sampleRate;
    protected float[] spectrum;
    protected int timeSize;
    protected int whichAverage;

    public FourierTransform(int i, float f) {
        this.timeSize = i;
        int i2 = (int) f;
        this.sampleRate = i2;
        this.bandWidth = (2.0f / i) * (i2 / 2.0f);
        noAverages();
        allocateArrays();
    }

    public abstract void allocateArrays();

    public int avgSize() {
        return this.averages.length;
    }

    public float calcAvg(float f, float f2) {
        int iFreqToIndex = freqToIndex(f);
        int iFreqToIndex2 = freqToIndex(f2);
        float f3 = 0.0f;
        for (int i = iFreqToIndex; i <= iFreqToIndex2; i++) {
            f3 += this.spectrum[i];
        }
        return f3 / ((iFreqToIndex2 - iFreqToIndex) + 1);
    }

    public void fillSpectrum() {
        float[] fArr;
        int i = 0;
        while (true) {
            fArr = this.spectrum;
            if (i >= fArr.length) {
                break;
            }
            float f = this.real[i];
            float f2 = this.imag[i];
            fArr[i] = (float) Math.sqrt((f * f) + (f2 * f2));
            i++;
        }
        int i2 = this.whichAverage;
        if (i2 == 1) {
            int length = fArr.length / this.averages.length;
            for (int i3 = 0; i3 < this.averages.length; i3++) {
                int i4 = 0;
                float f3 = 0.0f;
                while (i4 < length) {
                    int i5 = (i3 * length) + i4;
                    float[] fArr2 = this.spectrum;
                    if (i5 >= fArr2.length) {
                        break;
                    }
                    f3 += fArr2[i5];
                    i4++;
                }
                this.averages[i3] = f3 / (i4 + 1);
            }
            return;
        }
        if (i2 != 2) {
            return;
        }
        int i6 = 0;
        while (true) {
            int i7 = this.octaves;
            if (i6 >= i7) {
                return;
            }
            float fPow = i6 == 0 ? 0.0f : (this.sampleRate / 2) / ((float) Math.pow(2.0d, i7 - i6));
            float fPow2 = (((this.sampleRate / 2) / ((float) Math.pow(2.0d, (this.octaves - i6) - 1))) - fPow) / this.avgPerOctave;
            int i8 = 0;
            while (true) {
                int i9 = this.avgPerOctave;
                if (i8 < i9) {
                    float f4 = fPow + fPow2;
                    this.averages[(i9 * i6) + i8] = calcAvg(fPow, f4);
                    i8++;
                    fPow = f4;
                }
            }
            i6++;
        }
    }

    public abstract void forward(float[] fArr);

    public void forward(float[] fArr, int i) {
        int length = fArr.length - i;
        int i2 = this.timeSize;
        if (length < i2) {
            return;
        }
        float[] fArr2 = new float[i2];
        System.arraycopy(fArr, i, fArr2, 0, i2);
        forward(fArr2);
    }

    public int freqToIndex(float f) {
        if (f < getBandWidth() / 2.0f) {
            return 0;
        }
        if (f > (this.sampleRate / 2) - (getBandWidth() / 2.0f)) {
            return this.spectrum.length - 1;
        }
        return Math.round(this.timeSize * (f / this.sampleRate));
    }

    public float getAverageBandWidth(int i) {
        int i2 = this.whichAverage;
        if (i2 == 1) {
            return (this.spectrum.length / this.averages.length) * getBandWidth();
        }
        if (i2 != 2) {
            return 0.0f;
        }
        int i3 = i / this.avgPerOctave;
        return (((this.sampleRate / 2) / ((float) Math.pow(2.0d, (this.octaves - i3) - 1))) - (i3 != 0 ? (this.sampleRate / 2) / ((float) Math.pow(2.0d, this.octaves - i3)) : 0.0f)) / this.avgPerOctave;
    }

    public float getAverageCenterFrequency(int i) {
        int i2 = this.whichAverage;
        if (i2 == 1) {
            int length = this.spectrum.length / this.averages.length;
            return indexToFreq((i * length) + (length / 2));
        }
        if (i2 != 2) {
            return 0.0f;
        }
        int i3 = this.avgPerOctave;
        int i4 = i / i3;
        int i5 = i % i3;
        float fPow = i4 != 0 ? (this.sampleRate / 2) / ((float) Math.pow(2.0d, this.octaves - i4)) : 0.0f;
        float fPow2 = (((this.sampleRate / 2) / ((float) Math.pow(2.0d, (this.octaves - i4) - 1))) - fPow) / this.avgPerOctave;
        return fPow + (i5 * fPow2) + (fPow2 / 2.0f);
    }

    public float getAvg(int i) {
        float[] fArr = this.averages;
        if (fArr.length > 0) {
            return fArr[i];
        }
        return 0.0f;
    }

    public float getBand(int i) {
        if (i < 0) {
            i = 0;
        }
        float[] fArr = this.spectrum;
        if (i > fArr.length - 1) {
            i = fArr.length - 1;
        }
        return fArr[i];
    }

    public float getBandWidth() {
        return this.bandWidth;
    }

    public float getFreq(float f) {
        return getBand(freqToIndex(f));
    }

    public float[] getSpectrumImaginary() {
        return this.imag;
    }

    public float[] getSpectrumReal() {
        return this.real;
    }

    public float indexToFreq(int i) {
        float bandWidth = getBandWidth();
        if (i == 0) {
            return bandWidth * 0.25f;
        }
        return i == this.spectrum.length + (-1) ? ((this.sampleRate / 2) - (bandWidth / 2.0f)) + (bandWidth * 0.25f) : i * bandWidth;
    }

    public abstract void inverse(float[] fArr);

    public void inverse(float[] fArr, float[] fArr2, float[] fArr3) {
        setComplex(fArr, fArr2);
        inverse(fArr3);
    }

    public void linAverages(int i) {
        if (i > this.spectrum.length / 2) {
            return;
        }
        this.averages = new float[i];
        this.whichAverage = 1;
    }

    public void logAverages(int i, int i2) {
        float f = this.sampleRate / 2.0f;
        this.octaves = 1;
        while (true) {
            f /= 2.0f;
            if (f <= i) {
                this.avgPerOctave = i2;
                this.averages = new float[this.octaves * i2];
                this.whichAverage = 2;
                return;
            }
            this.octaves++;
        }
    }

    public void noAverages() {
        this.averages = new float[0];
        this.whichAverage = 3;
    }

    public abstract void scaleBand(int i, float f);

    public void scaleFreq(float f, float f2) {
        scaleBand(freqToIndex(f), f2);
    }

    public abstract void setBand(int i, float f);

    public void setComplex(float[] fArr, float[] fArr2) {
        float[] fArr3 = this.real;
        if (fArr3.length == fArr.length || this.imag.length == fArr2.length) {
            System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
            System.arraycopy(fArr2, 0, this.imag, 0, fArr2.length);
        }
    }

    public void setFreq(float f, float f2) {
        setBand(freqToIndex(f), f2);
    }

    public int specSize() {
        return this.spectrum.length;
    }

    public int timeSize() {
        return this.timeSize;
    }
}
