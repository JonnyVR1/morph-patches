package io.agora.base.internal.video;

import io.agora.base.internal.CalledByNative;
import io.agora.base.internal.Logging;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class YuvConverterStats {
    private static final float CONFIDENCE_LEVEL_99_Z = 2.576f;
    private static final long STATS_SAMPLE_COUNT = 240;
    private static final String TAG = "YuvConverterStats";
    private final int height;
    private final YuvConvertMethod method;
    private final int width;
    private final List<Integer> timeSpentUsCache = new ArrayList();
    private float calLowerBound = 0.0f;
    private float calUpperBound = 0.0f;
    private int calAvgUs = 0;
    private int calMaxUs = 0;

    public enum YuvConvertMethod {
        GL_READ_PIXELS(0),
        PBO(1),
        HARDWARE_BUFFER(2);

        final int value;

        YuvConvertMethod(int i) {
            this.value = i;
        }
    }

    public YuvConverterStats(int i, int i2, YuvConvertMethod yuvConvertMethod) {
        this.width = i;
        this.height = i2;
        this.method = yuvConvertMethod;
    }

    private static float[] CalculateConfidenceBound(int[] iArr) {
        float fCalculateMean = CalculateMean(iArr);
        float fCalculateStandardDeviation = (float) ((((double) CalculateStandardDeviation(iArr, fCalculateMean)) / Math.sqrt(iArr.length)) * 2.5759999752044678d);
        return new float[]{fCalculateMean - fCalculateStandardDeviation, fCalculateMean + fCalculateStandardDeviation};
    }

    private static int CalculateMax(int[] iArr) {
        int iMax = 0;
        for (int i : iArr) {
            iMax = Math.max(iMax, i);
        }
        return iMax;
    }

    private static float CalculateMean(int[] iArr) {
        long j = 0;
        for (int i : iArr) {
            j += (long) i;
        }
        return (j * 1.0f) / iArr.length;
    }

    private static float CalculateStandardDeviation(int[] iArr, float f) {
        long jPow = 0;
        for (int i : iArr) {
            jPow += (long) Math.pow(i - f, 2.0d);
        }
        return (float) Math.sqrt((jPow * 1.0f) / (iArr.length - 1));
    }

    @CalledByNative
    private int getAvgUs() {
        return this.calAvgUs;
    }

    @CalledByNative
    private int getMaxUs() {
        return this.calMaxUs;
    }

    @CalledByNative
    public int getHeight() {
        return this.height;
    }

    @CalledByNative
    public int getMethod() {
        return this.method.value;
    }

    @CalledByNative
    public int getWidth() {
        return this.width;
    }

    public boolean stats(int i) {
        this.timeSpentUsCache.add(Integer.valueOf(i));
        boolean z = false;
        if (this.timeSpentUsCache.size() >= STATS_SAMPLE_COUNT) {
            int[] iArr = new int[this.timeSpentUsCache.size()];
            for (int i2 = 0; i2 < this.timeSpentUsCache.size(); i2++) {
                iArr[i2] = this.timeSpentUsCache.get(i2).intValue();
            }
            float fCalculateMean = CalculateMean(iArr);
            int iCalculateMax = CalculateMax(iArr);
            if (fCalculateMean < this.calLowerBound || fCalculateMean > this.calUpperBound) {
                float[] fArrCalculateConfidenceBound = CalculateConfidenceBound(iArr);
                this.calLowerBound = fArrCalculateConfidenceBound[0];
                z = true;
                this.calUpperBound = fArrCalculateConfidenceBound[1];
                this.calAvgUs = (int) fCalculateMean;
                this.calMaxUs = iCalculateMax;
                Logging.m87211i(TAG, "method=" + this.method + ", calAvgUs=" + this.calAvgUs + ", calMaxUs=" + this.calMaxUs);
            }
            this.timeSpentUsCache.clear();
        }
        return z;
    }
}
