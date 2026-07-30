package io.agora.base;

/* JADX INFO: loaded from: classes2.dex */
public class ColorSpacePrimaries {
    public float fBX;
    public float fBY;
    public float fGX;
    public float fGY;
    public float fRX;
    public float fRY;
    public float fWX;
    public float fWY;
    public static final ColorSpacePrimaries BT709 = new ColorSpacePrimaries(0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f, 0.3127f, 0.329f);
    public static final ColorSpacePrimaries BT470M = new ColorSpacePrimaries(0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f, 0.31f, 0.316f);
    public static final ColorSpacePrimaries BT470BG = new ColorSpacePrimaries(0.64f, 0.33f, 0.29f, 0.6f, 0.15f, 0.06f, 0.3127f, 0.329f);
    public static final ColorSpacePrimaries SMPTE170M = new ColorSpacePrimaries(0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f, 0.3127f, 0.329f);
    public static final ColorSpacePrimaries SMPTE240M = new ColorSpacePrimaries(0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f, 0.3127f, 0.329f);
    public static final ColorSpacePrimaries APPLE_GENERIC_RGB = new ColorSpacePrimaries(0.63002f, 0.34f, 0.29505f, 0.60498f, 0.15501f, 0.07701f, 0.3127f, 0.329f);
    public static final ColorSpacePrimaries WIDE_GAMUT_COLOR_SPIN = new ColorSpacePrimaries(0.01f, 0.98f, 0.01f, 0.01f, 0.98f, 0.01f, 0.3127f, 0.329f);
    public static final ColorSpacePrimaries FILM = new ColorSpacePrimaries(0.681f, 0.319f, 0.243f, 0.692f, 0.145f, 0.049f, 0.31f, 0.136f);
    public static final ColorSpacePrimaries BT2020 = new ColorSpacePrimaries(0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f, 0.3127f, 0.329f);
    public static final ColorSpacePrimaries SMPTEST428_1 = new ColorSpacePrimaries(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.33333334f, 0.33333334f);
    public static final ColorSpacePrimaries SMPTEST431_2 = new ColorSpacePrimaries(0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f, 0.314f, 0.351f);
    public static final ColorSpacePrimaries SMPTEST432_1 = new ColorSpacePrimaries(0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f, 0.3127f, 0.329f);
    public static final ColorSpacePrimaries XYZ_D50 = new ColorSpacePrimaries(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.34567f, 0.3585f);
    public static final ColorSpacePrimaries ADOBE_RGB = new ColorSpacePrimaries(0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f, 0.3127f, 0.329f);

    public ColorSpacePrimaries(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        this.fRX = f;
        this.fRY = f2;
        this.fGX = f3;
        this.fGY = f4;
        this.fBX = f5;
        this.fBY = f6;
        this.fWX = f7;
        this.fWY = f8;
    }
}
