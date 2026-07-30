package com.cosmos.photon.push.image;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.cosmos.mdlog.MDLog;
import com.cosmos.photon.push.log.LogTag;
import com.cosmos.photon.push.util.MD5Utils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class ImageLoader {
    private final BitmapDiskCache diskCache;
    private final HttpDownloader downloader;
    private final BitmapMemCache memCache;

    public static final class Builder {
        private File diskCacheDirectory;
        private long maxDiskSize;
        private long maxMemSize;

        public ImageLoader build() {
            return new ImageLoader(this);
        }

        public Builder diskCacheDirectory(File file) {
            this.diskCacheDirectory = file;
            return this;
        }

        public Builder maxDiskSize(long j) {
            this.maxDiskSize = j;
            return this;
        }

        public Builder maxMemSize(long j) {
            this.maxMemSize = j;
            return this;
        }
    }

    private ImageLoader(Builder builder) {
        this.memCache = new BitmapMemCache((int) builder.maxMemSize);
        this.diskCache = new BitmapDiskCache(builder.diskCacheDirectory, builder.maxDiskSize);
        this.downloader = new HttpDownloader();
    }

    public void clearMemCache() {
        this.memCache.clearCache();
    }

    public Bitmap syncLoadBitmap(String str, int i, int i2) throws Throwable {
        String md5 = MD5Utils.getMD5(str);
        Bitmap bitmap = this.memCache.getBitmap(md5);
        if (bitmap != null) {
            return bitmap;
        }
        Bitmap bitmap2 = this.diskCache.getBitmap(md5);
        if (bitmap2 != null) {
            this.memCache.putBitmap(md5, bitmap2);
            return bitmap2;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            this.downloader.downloadUrlToStream(str, byteArrayOutputStream);
            Bitmap bitmapScaleBitmap = BitmapUtil.scaleBitmap(BitmapFactory.decodeStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray())), i, i2);
            this.memCache.putBitmap(md5, bitmapScaleBitmap);
            this.diskCache.putBitmap(md5, bitmapScaleBitmap);
            return bitmapScaleBitmap;
        } catch (IOException e) {
            MDLog.printErrStackTrace(LogTag.IMAGE, e);
            return null;
        }
    }
}
