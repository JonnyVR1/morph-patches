package com.bytedance.realx.video;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes.dex */
public enum RXPixelFormat {
    kUnknown(0),
    kArgb(1),
    kBgra(2),
    kRgba(3),
    kRgb24(4),
    kI420(5),
    kNv12(6),
    kNv21(7),
    kRgb(8),
    kNative(9),
    kIYUV(10),
    kYUY2(11),
    kYV12(12),
    kUYVY(13),
    kRGB565(14),
    kMJPEG(15),
    kTexture2D(16),
    kTextureOES(17);

    private int value;

    /* JADX INFO: renamed from: com.bytedance.realx.video.RXPixelFormat$1 */
    public static /* synthetic */ class C11671 {
        static final /* synthetic */ int[] $SwitchMap$com$bytedance$realx$video$RXPixelFormat;

        static {
            int[] iArr = new int[RXPixelFormat.values().length];
            $SwitchMap$com$bytedance$realx$video$RXPixelFormat = iArr;
            try {
                iArr[RXPixelFormat.kArgb.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXPixelFormat[RXPixelFormat.kBgra.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXPixelFormat[RXPixelFormat.kRgba.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXPixelFormat[RXPixelFormat.kI420.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXPixelFormat[RXPixelFormat.kNv12.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXPixelFormat[RXPixelFormat.kNv21.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXPixelFormat[RXPixelFormat.kRgb.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXPixelFormat[RXPixelFormat.kNative.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXPixelFormat[RXPixelFormat.kIYUV.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXPixelFormat[RXPixelFormat.kYUY2.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXPixelFormat[RXPixelFormat.kYV12.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXPixelFormat[RXPixelFormat.kUYVY.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXPixelFormat[RXPixelFormat.kRGB565.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXPixelFormat[RXPixelFormat.kMJPEG.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXPixelFormat[RXPixelFormat.kTexture2D.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXPixelFormat[RXPixelFormat.kTextureOES.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXPixelFormat[RXPixelFormat.kUnknown.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    RXPixelFormat(int i) {
        this.value = i;
    }

    @CalledByNative
    public static RXPixelFormat fromId(int i) {
        if (i == 3553) {
            return kTexture2D;
        }
        if (i == 36197) {
            return kTextureOES;
        }
        for (RXPixelFormat rXPixelFormat : values()) {
            if (rXPixelFormat.value() == i) {
                return rXPixelFormat;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        switch (C11671.$SwitchMap$com$bytedance$realx$video$RXPixelFormat[ordinal()]) {
            case 1:
                return "kArgb";
            case 2:
                return "kBgra";
            case 3:
                return "kRgba";
            case 4:
                return "kI420";
            case 5:
                return "kNv12";
            case 6:
                return "kNv21";
            case 7:
                return "kRgb";
            case 8:
                return "kNative";
            case 9:
                return "kIYUV";
            case 10:
                return "kYUY2";
            case 11:
                return "kYV12";
            case 12:
                return "kUYVY";
            case 13:
                return "kRGB565";
            case 14:
                return "kMJPEG";
            case 15:
                return "kTexture2D";
            case 16:
                return "kTextureOES";
            default:
                return "kUnknown";
        }
    }

    @CalledByNative
    public int value() {
        return this.value;
    }
}
