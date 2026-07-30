package com.idv.identity.ocr.compress;

import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public class CompressConfig implements Serializable {
    private boolean enablePixelCompress;
    private boolean enableQualityCompress;
    private boolean enableReserveRaw;
    private int maxPixel;
    private int maxSize;

    /* JADX INFO: renamed from: com.idv.identity.ocr.compress.CompressConfig$b */
    public static class C3583b {

        /* JADX INFO: renamed from: a */
        private CompressConfig f12308a = new CompressConfig();

        /* JADX INFO: renamed from: a */
        public CompressConfig m17739a() {
            return this.f12308a;
        }

        /* JADX INFO: renamed from: b */
        public C3583b m17740b(int i) {
            this.f12308a.setMaxSize(i);
            return this;
        }
    }

    private CompressConfig() {
        this.maxPixel = 1200;
        this.maxSize = ShareConstants.MD5_FILE_BUF_LENGTH;
        this.enablePixelCompress = true;
        this.enableQualityCompress = true;
        this.enableReserveRaw = true;
    }

    public static CompressConfig ofDefaultConfig() {
        return new CompressConfig();
    }

    public void enablePixelCompress(boolean z) {
        this.enablePixelCompress = z;
    }

    public void enableQualityCompress(boolean z) {
        this.enableQualityCompress = z;
    }

    public void enableReserveRaw(boolean z) {
        this.enableReserveRaw = z;
    }

    public int getMaxPixel() {
        return this.maxPixel;
    }

    public int getMaxSize() {
        return this.maxSize;
    }

    public boolean isEnablePixelCompress() {
        return this.enablePixelCompress;
    }

    public boolean isEnableQualityCompress() {
        return this.enableQualityCompress;
    }

    public boolean isEnableReserveRaw() {
        return this.enableReserveRaw;
    }

    public CompressConfig setMaxPixel(int i) {
        this.maxPixel = i;
        return this;
    }

    public void setMaxSize(int i) {
        this.maxSize = i;
    }
}
