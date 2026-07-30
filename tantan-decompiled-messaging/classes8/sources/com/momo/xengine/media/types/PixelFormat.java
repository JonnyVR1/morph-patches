package com.momo.xengine.media.types;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public enum PixelFormat {
    VIDEO_FORMAT_NONE(0),
    VIDEO_FORMAT_I420(1),
    VIDEO_FORMAT_I420_10LE(2),
    VIDEO_FORMAT_I420_10BE(3),
    VIDEO_FORMAT_NV12(4),
    VIDEO_FORMAT_NV12_10LE(5),
    VIDEO_FORMAT_NV12_10BE(6),
    VIDEO_FORMAT_NV21(7),
    VIDEO_FORMAT_NV21_10LE(8),
    VIDEO_FORMAT_NV21_10BE(9),
    VIDEO_FORMAT_YVYU(10),
    VIDEO_FORMAT_YUY2(11),
    VIDEO_FORMAT_UYVY(12),
    VIDEO_FORMAT_RGBA(13),
    VIDEO_FORMAT_BGRA(14),
    VIDEO_FORMAT_BGRX(15),
    VIDEO_FORMAT_Y800(16),
    VIDEO_FORMAT_I444(17),
    VIDEO_FORMAT_BGR3(18),
    VIDEO_FORMAT_I422(19),
    VIDEO_FORMAT_I40A(20),
    VIDEO_FORMAT_I42A(21),
    VIDEO_FORMAT_YUVA(22),
    VIDEO_FORMAT_AYUV(23),
    VIDEO_FORMAT_I210(24),
    VIDEO_FORMAT_I412(25),
    VIDEO_FORMAT_YA2L(26),
    VIDEO_FORMAT_CVPIXELBUFFER_APPLE(27);

    private final int value;

    PixelFormat(int i) {
        this.value = i;
    }

    public static PixelFormat valueOf(int i) {
        switch (i) {
            case 1:
                return VIDEO_FORMAT_I420;
            case 2:
                return VIDEO_FORMAT_I420_10LE;
            case 3:
                return VIDEO_FORMAT_I420_10BE;
            case 4:
                return VIDEO_FORMAT_NV12;
            case 5:
                return VIDEO_FORMAT_NV12_10LE;
            case 6:
                return VIDEO_FORMAT_NV12_10BE;
            case 7:
                return VIDEO_FORMAT_NV21;
            case 8:
                return VIDEO_FORMAT_NV21_10LE;
            case 9:
                return VIDEO_FORMAT_NV21_10BE;
            case 10:
                return VIDEO_FORMAT_YVYU;
            case 11:
                return VIDEO_FORMAT_YUY2;
            case 12:
                return VIDEO_FORMAT_UYVY;
            case 13:
                return VIDEO_FORMAT_RGBA;
            case 14:
                return VIDEO_FORMAT_BGRA;
            case 15:
                return VIDEO_FORMAT_BGRX;
            case 16:
                return VIDEO_FORMAT_Y800;
            case 17:
                return VIDEO_FORMAT_I444;
            case 18:
                return VIDEO_FORMAT_BGR3;
            case 19:
                return VIDEO_FORMAT_I422;
            case 20:
                return VIDEO_FORMAT_I40A;
            case 21:
                return VIDEO_FORMAT_I42A;
            case 22:
                return VIDEO_FORMAT_YUVA;
            case 23:
                return VIDEO_FORMAT_AYUV;
            case 24:
                return VIDEO_FORMAT_I210;
            case 25:
                return VIDEO_FORMAT_I412;
            case 26:
                return VIDEO_FORMAT_YA2L;
            case 27:
                return VIDEO_FORMAT_CVPIXELBUFFER_APPLE;
            default:
                return VIDEO_FORMAT_NONE;
        }
    }

    public int getValue() {
        return this.value;
    }
}
