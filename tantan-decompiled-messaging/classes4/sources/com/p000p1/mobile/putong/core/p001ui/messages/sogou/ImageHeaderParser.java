package com.p000p1.mobile.putong.core.p001ui.messages.sogou;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
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

    /* JADX INFO: renamed from: a */
    ImageType mo174a(InputStream inputStream) throws IOException;
}
