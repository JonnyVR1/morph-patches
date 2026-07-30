package com.bytedance.realx.video;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes.dex */
public enum RXVideoScaleFilter {
    kLibYUVNone(0),
    kLibYUVLinear(1),
    kLibYUVBilinear(2),
    kLibYUVBox(3),
    kFFMPegFastBilinear(4),
    kFFMPegBilinear(5),
    kFFMPegBicubic(6),
    kFFMPegGauss(7),
    kFFMPegLanczos(8),
    kOpenGLOrigin(9),
    kOpenGLBilinear(10),
    kOpenGLBicubic(11),
    kOpenGLBox(12);

    private int value;

    /* JADX INFO: renamed from: com.bytedance.realx.video.RXVideoScaleFilter$1 */
    public static /* synthetic */ class C11451 {
        static final /* synthetic */ int[] $SwitchMap$com$bytedance$realx$video$RXVideoScaleFilter;

        static {
            int[] iArr = new int[RXVideoScaleFilter.values().length];
            $SwitchMap$com$bytedance$realx$video$RXVideoScaleFilter = iArr;
            try {
                iArr[RXVideoScaleFilter.kLibYUVNone.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXVideoScaleFilter[RXVideoScaleFilter.kLibYUVLinear.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXVideoScaleFilter[RXVideoScaleFilter.kLibYUVBilinear.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXVideoScaleFilter[RXVideoScaleFilter.kLibYUVBox.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXVideoScaleFilter[RXVideoScaleFilter.kFFMPegFastBilinear.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXVideoScaleFilter[RXVideoScaleFilter.kFFMPegBilinear.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXVideoScaleFilter[RXVideoScaleFilter.kFFMPegBicubic.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXVideoScaleFilter[RXVideoScaleFilter.kFFMPegGauss.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXVideoScaleFilter[RXVideoScaleFilter.kFFMPegLanczos.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXVideoScaleFilter[RXVideoScaleFilter.kOpenGLOrigin.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXVideoScaleFilter[RXVideoScaleFilter.kOpenGLBilinear.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXVideoScaleFilter[RXVideoScaleFilter.kOpenGLBicubic.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXVideoScaleFilter[RXVideoScaleFilter.kOpenGLBox.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    RXVideoScaleFilter(int i) {
        this.value = i;
    }

    @CalledByNative
    public static RXVideoScaleFilter fromId(int i) {
        for (RXVideoScaleFilter rXVideoScaleFilter : values()) {
            if (rXVideoScaleFilter.value() == i) {
                return rXVideoScaleFilter;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        switch (C11451.$SwitchMap$com$bytedance$realx$video$RXVideoScaleFilter[ordinal()]) {
            case 1:
                return "kLibYUVNone";
            case 2:
                return "kLibYUVLinear";
            case 3:
                return "kLibYUVBilinear";
            case 4:
                return "kLibYUVBox";
            case 5:
                return "kFFMPegFastBilinear";
            case 6:
                return "kFFMPegBilinear";
            case 7:
                return "kFFMPegBicubic";
            case 8:
                return "kFFMPegGauss";
            case 9:
                return "kFFMPegLanczos";
            case 10:
                return "kOpenGLOrigin";
            case 11:
                return "kOpenGLBilinear";
            case 12:
                return "kOpenGLBicubic";
            case 13:
                return "kOpenGLBox";
            default:
                return "unknownValue";
        }
    }

    @CalledByNative
    public int value() {
        return this.value;
    }
}
