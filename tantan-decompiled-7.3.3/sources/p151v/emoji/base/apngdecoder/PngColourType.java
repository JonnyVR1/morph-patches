package p151v.emoji.base.apngdecoder;

import p153l.gzi0;

/* JADX INFO: loaded from: classes3.dex */
public enum PngColourType {
    PNG_GREYSCALE(0, 1, "1, 2, 4, 8, 16", "Greyscale", "Each pixel is a greyscale sample"),
    PNG_TRUECOLOUR(2, 3, "8, 16", "Truecolour", "Each pixel is an R,G,B triple"),
    PNG_INDEXED_COLOUR(3, 1, "1, 2, 4, 8", "Indexed-colour", "Each pixel is a palette index; a PLTE chunk shall appear."),
    PNG_GREYSCALE_WITH_ALPHA(4, 2, "4, 8, 16", "Greyscale with alpha", "Each pixel is a greyscale sample followed by an alpha sample."),
    PNG_TRUECOLOUR_WITH_ALPHA(6, 4, "8, 16", "Truecolour with alpha", "Each pixel is an R,G,B triple followed by an alpha sample.");

    public final String allowedBitDepths;
    public final int code;
    public final int componentsPerPixel;
    public final String description;
    public final String name;

    PngColourType(int i, int i2, String str, String str2, String str3) {
        this.code = i;
        this.componentsPerPixel = i2;
        this.allowedBitDepths = str;
        this.name = str2;
        this.description = str3;
    }

    public static PngColourType fromByte(byte b) throws IllegalArgumentException {
        if (b == 0) {
            return PNG_GREYSCALE;
        }
        if (b == 6) {
            return PNG_TRUECOLOUR_WITH_ALPHA;
        }
        if (b == 2) {
            return PNG_TRUECOLOUR;
        }
        if (b == 3) {
            return PNG_INDEXED_COLOUR;
        }
        if (b == 4) {
            return PNG_GREYSCALE_WITH_ALPHA;
        }
        gzi0.m133102a("Valid PNG colour types are 0, 2, 3, 4, 6. Type '%d' is invalid", new Object[]{Byte.valueOf(b)});
        return null;
    }

    public boolean hasAlpha() {
        return (this.code & 4) > 0;
    }

    public boolean isIndexed() {
        return (this.code & 1) > 0;
    }

    public boolean supportsSubByteDepth() {
        int i = this.code;
        return i == 0 || i == 3;
    }
}
