package com.p069ss.bytertc.base.media.camera;

import android.graphics.ImageFormat;
import com.clevertap.android.sdk.Constants;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p069ss.bytertc.base.media.Size;
import com.sina.weibo.sdk.constant.WBConstants;
import com.tencent.liteav.audio.TXEAudioDef;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p149l.qq3;

/* JADX INFO: loaded from: classes12.dex */
public class CameraEnumerationAndroid {
    static final ArrayList<Size> COMMON_RESOLUTIONS = new ArrayList<>(Arrays.asList(new Size(160, 120), new Size(240, 160), new Size(320, 240), new Size(400, 240), new Size(480, 320), new Size(640, 360), new Size(640, 480), new Size(768, 480), new Size(854, 480), new Size(800, 600), new Size(TXEAudioDef.TXE_OPUS_SAMPLE_NUM, 540), new Size(TXEAudioDef.TXE_OPUS_SAMPLE_NUM, 640), new Size(1024, 576), new Size(1024, 600), new Size(EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK, 720), new Size(EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK, 1024), new Size(WBConstants.SDK_NEW_PAY_VERSION, 1080), new Size(WBConstants.SDK_NEW_PAY_VERSION, 1440), new Size(2560, 1440), new Size(3840, 2160)));
    private static final String TAG = "CameraEnumerationAndroid";

    public static abstract class ClosestComparator<T> implements Comparator<T> {
        private ClosestComparator() {
        }

        @Override // java.util.Comparator
        public int compare(T t, T t2) {
            return diff(t) - diff(t2);
        }

        public abstract int diff(T t);
    }

    public static CaptureFormat.FramerateRange getClosestSupportedFramerateRange(List<CaptureFormat.FramerateRange> list, final int i) {
        return (CaptureFormat.FramerateRange) Collections.min(list, new ClosestComparator<CaptureFormat.FramerateRange>() { // from class: com.ss.bytertc.base.media.camera.CameraEnumerationAndroid.1
            private static final int MAX_FPS_DIFF_THRESHOLD = 5000;
            private static final int MAX_FPS_HIGH_DIFF_WEIGHT = 3;
            private static final int MAX_FPS_LOW_DIFF_WEIGHT = 1;
            private static final int MIN_FPS_HIGH_VALUE_WEIGHT = 4;
            private static final int MIN_FPS_LOW_VALUE_WEIGHT = 1;
            private static final int MIN_FPS_THRESHOLD = 8000;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            private int progressivePenalty(int i2, int i3, int i4, int i5) {
                return i2 < i3 ? i2 * i4 : (i4 * i3) + ((i2 - i3) * i5);
            }

            @Override // com.ss.bytertc.base.media.camera.CameraEnumerationAndroid.ClosestComparator
            public int diff(CaptureFormat.FramerateRange framerateRange) {
                return progressivePenalty(Math.abs((i * 1000) - framerateRange.min), 5000, 1, 3) + progressivePenalty(Math.abs((i * 1000) - framerateRange.max), 5000, 1, 3);
            }
        });
    }

    public static Size getClosestSupportedSize(List<Size> list, final int i, final int i2) {
        return (Size) Collections.min(list, new ClosestComparator<Size>() { // from class: com.ss.bytertc.base.media.camera.CameraEnumerationAndroid.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.ss.bytertc.base.media.camera.CameraEnumerationAndroid.ClosestComparator
            public int diff(Size size) {
                return Math.abs(i - size.width) + Math.abs(i2 - size.height);
            }
        });
    }

    public static Size getUpClosestSupportedSize(List<Size> list, int i, int i2) {
        int iAbs;
        Size size = new Size(0, 0);
        int i3 = Integer.MAX_VALUE;
        boolean z = false;
        for (int i4 = 0; i4 < list.size(); i4++) {
            Size size2 = list.get(i4);
            int i5 = size2.width;
            if (i5 >= i && (iAbs = Math.abs(i - i5) + Math.abs(i2 - size2.height)) <= i3) {
                z = true;
                size = size2;
                i3 = iAbs;
            }
        }
        return !z ? getClosestSupportedSize(list, i, i2) : size;
    }

    public static void reportCameraResolution(Histogram histogram, Size size) {
        histogram.addSample(COMMON_RESOLUTIONS.indexOf(size) + 1);
    }

    public static class CaptureFormat {
        public final FramerateRange framerate;
        public final int height;
        public final int imageFormat = 17;
        public final int width;

        public static class FramerateRange {
            public int max;
            public int min;

            public FramerateRange(int i, int i2) {
                this.min = i;
                this.max = i2;
            }

            public boolean equals(Object obj) {
                if (!(obj instanceof FramerateRange)) {
                    return false;
                }
                FramerateRange framerateRange = (FramerateRange) obj;
                return this.min == framerateRange.min && this.max == framerateRange.max;
            }

            public int hashCode() {
                return (this.min * 65537) + 1 + this.max;
            }

            public String toString() {
                return "[" + (this.min / 1000.0f) + ":" + (this.max / 1000.0f) + Constants.AES_SUFFIX;
            }
        }

        public CaptureFormat(int i, int i2, int i3, int i4) {
            this.width = i;
            this.height = i2;
            this.framerate = new FramerateRange(i3, i4);
        }

        public static int frameSize(int i, int i2, int i3) {
            if (i3 == 17) {
                return ((i * i2) * ImageFormat.getBitsPerPixel(i3)) / 8;
            }
            qq3.m175877a("Don't know how to calculate the frame size of non-NV21 image formats.");
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof CaptureFormat)) {
                return false;
            }
            CaptureFormat captureFormat = (CaptureFormat) obj;
            return this.width == captureFormat.width && this.height == captureFormat.height && this.framerate.equals(captureFormat.framerate);
        }

        public int hashCode() {
            return (((this.width * 65497) + this.height) * 251) + 1 + this.framerate.hashCode();
        }

        public String toString() {
            return this.width + BaseSei.f13930X + this.height + "@" + this.framerate;
        }

        public CaptureFormat(int i, int i2, FramerateRange framerateRange) {
            this.width = i;
            this.height = i2;
            this.framerate = framerateRange;
        }

        public int frameSize() {
            return frameSize(this.width, this.height, 17);
        }
    }
}
