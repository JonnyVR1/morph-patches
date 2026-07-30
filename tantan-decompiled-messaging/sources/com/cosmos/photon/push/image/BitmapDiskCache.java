package com.cosmos.photon.push.image;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.cosmos.mdlog.MDLog;
import com.cosmos.photon.push.log.LogTag;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import p149l.x9g0;

/* JADX INFO: loaded from: classes.dex */
public class BitmapDiskCache {
    private DiskLruCache diskCache;

    public BitmapDiskCache(File file, long j) {
        try {
            this.diskCache = DiskLruCache.open(file, 0, 1, j);
        } catch (IOException e) {
            MDLog.printErrStackTrace(LogTag.IMAGE, e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x001e A[EXC_TOP_SPLITTER, PHI: r0 r2
      0x001e: PHI (r0v3 android.graphics.Bitmap) = (r0v12 android.graphics.Bitmap), (r0v6 android.graphics.Bitmap) binds: [B:23:0x002b, B:15:0x001c] A[DONT_GENERATE, DONT_INLINE]
      0x001e: PHI (r2v3 com.cosmos.photon.push.image.DiskLruCache$Snapshot) = (r2v4 com.cosmos.photon.push.image.DiskLruCache$Snapshot), (r2v6 com.cosmos.photon.push.image.DiskLruCache$Snapshot) binds: [B:23:0x002b, B:15:0x001c] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0031 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public Bitmap getBitmap(String str) {
        DiskLruCache.Snapshot snapshot;
        DiskLruCache.Snapshot snapshot2 = null;
        bitmapDecodeStream = null;
        bitmapDecodeStream = null;
        bitmapDecodeStream = null;
        Bitmap bitmapDecodeStream = null;
        if (str == null) {
            x9g0.m207497a();
            return null;
        }
        try {
            snapshot = this.diskCache.get(str);
            if (snapshot != null) {
                try {
                    try {
                        InputStream inputStream = snapshot.getInputStream(0);
                        if (inputStream != null) {
                            bitmapDecodeStream = BitmapFactory.decodeStream(inputStream);
                        }
                    } catch (IOException e) {
                        e = e;
                        MDLog.printErrStackTrace(LogTag.IMAGE, e);
                        if (snapshot != null) {
                            try {
                                snapshot.close();
                            } catch (Exception unused) {
                            }
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    snapshot2 = snapshot;
                    if (snapshot2 != null) {
                        try {
                            snapshot2.close();
                        } catch (Exception unused2) {
                        }
                    }
                    throw th;
                }
            }
            if (snapshot != null) {
                snapshot.close();
            }
        } catch (IOException e2) {
            e = e2;
            snapshot = null;
        } catch (Throwable th2) {
            th = th2;
            if (snapshot2 != null) {
                snapshot2.close();
            }
            throw th;
        }
        return bitmapDecodeStream;
    }

    public void putBitmap(String str, Bitmap bitmap) {
        if (str == null || bitmap == null) {
            x9g0.m207497a();
            return;
        }
        try {
            DiskLruCache.Editor editorEdit = this.diskCache.edit(str);
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, editorEdit.newOutputStream(0));
            editorEdit.commit();
            this.diskCache.flush();
        } catch (IOException e) {
            MDLog.printErrStackTrace(LogTag.IMAGE, e);
        }
    }
}
