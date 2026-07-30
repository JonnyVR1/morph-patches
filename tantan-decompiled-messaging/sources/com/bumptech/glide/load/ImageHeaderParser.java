package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p149l.h01;

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
        UNKNOWN(false);

        private final boolean hasAlpha;

        ImageType(boolean z) {
            this.hasAlpha = z;
        }

        public boolean hasAlpha() {
            return this.hasAlpha;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    ImageType mo5342a(@NonNull InputStream inputStream) throws IOException;

    @NonNull
    /* JADX INFO: renamed from: b */
    ImageType mo5343b(@NonNull ByteBuffer byteBuffer) throws IOException;

    /* JADX INFO: renamed from: c */
    int mo5344c(@NonNull InputStream inputStream, @NonNull h01 h01Var) throws IOException;
}
