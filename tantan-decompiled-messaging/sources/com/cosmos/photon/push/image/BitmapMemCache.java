package com.cosmos.photon.push.image;

import android.graphics.Bitmap;
import android.util.LruCache;

/* JADX INFO: loaded from: classes.dex */
public class BitmapMemCache {
    private final LruCache<String, Bitmap> memCache;

    public BitmapMemCache(int i) {
        this.memCache = new LruCache<>(i);
    }

    public synchronized void clearCache() {
        this.memCache.evictAll();
    }

    public synchronized Bitmap getBitmap(String str) {
        try {
            if (str == null) {
                throw new IllegalArgumentException();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.memCache.get(str);
    }

    public synchronized void putBitmap(String str, Bitmap bitmap) {
        try {
            if (str == null || bitmap == null) {
                throw new IllegalArgumentException();
            }
            this.memCache.put(str, bitmap);
        } catch (Throwable th) {
            throw th;
        }
    }
}
