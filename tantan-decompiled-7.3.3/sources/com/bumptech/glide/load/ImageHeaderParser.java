package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p153l.o01;

/* JADX INFO: loaded from: classes.dex */
public interface ImageHeaderParser {

    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        ANIMATED_WEBP(true),
        AVIF(true),
        UNKNOWN(false);

        private final boolean hasAlpha;

        ImageType(boolean z) {
            this.hasAlpha = z;
        }

        public boolean hasAlpha() {
            return this.hasAlpha;
        }

        public boolean isWebp() {
            int i = C1061a.f4368a[ordinal()];
            return i == 1 || i == 2 || i == 3;
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.ImageHeaderParser$a */
    public static /* synthetic */ class C1061a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f4368a;

        static {
            int[] iArr = new int[ImageType.values().length];
            f4368a = iArr;
            try {
                iArr[ImageType.WEBP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4368a[ImageType.WEBP_A.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4368a[ImageType.ANIMATED_WEBP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    ImageType mo5354a(@NonNull InputStream inputStream) throws IOException;

    @NonNull
    /* JADX INFO: renamed from: b */
    ImageType mo5355b(@NonNull ByteBuffer byteBuffer) throws IOException;

    /* JADX INFO: renamed from: c */
    int mo5356c(@NonNull InputStream inputStream, @NonNull o01 o01Var) throws IOException;

    /* JADX INFO: renamed from: d */
    int mo5357d(@NonNull ByteBuffer byteBuffer, @NonNull o01 o01Var) throws IOException;
}
