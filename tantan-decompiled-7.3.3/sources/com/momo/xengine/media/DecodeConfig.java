package com.momo.xengine.media;

import com.momo.xengine.media.types.PixelFormat;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public class DecodeConfig {
    private String path;
    private int width = 0;
    private int height = 0;
    private PixelFormat scale_format = PixelFormat.VIDEO_FORMAT_BGRA;

    public int getHeight() {
        return this.height;
    }

    @Nullable
    public String getPath() {
        return this.path;
    }

    public PixelFormat getScale_format() {
        return this.scale_format;
    }

    public int getWidth() {
        return this.width;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setPath(@NotNull String str) {
        this.path = str;
    }

    public void setScale_format(PixelFormat pixelFormat) {
        this.scale_format = pixelFormat;
    }

    public void setWidth(int i) {
        this.width = i;
    }
}
