package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.ImageDownload;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import p149l.hj10;
import p149l.rhg0;
import p149l.sei0;

/* JADX INFO: loaded from: classes7.dex */
public class ImageDownload implements Closeable {
    private static final int MAX_IMAGE_SIZE_BYTES = 1048576;

    @Nullable
    private volatile Future<?> future;

    @Nullable
    private Task<Bitmap> task;
    private final URL url;

    private ImageDownload(URL url) {
        this.url = url;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m16825b(ImageDownload imageDownload, sei0 sei0Var) {
        imageDownload.getClass();
        try {
            sei0Var.m183659c(imageDownload.blockingDownload());
        } catch (Exception e) {
            sei0Var.m183658b(e);
        }
    }

    private byte[] blockingDownloadBytes() throws IOException {
        URLConnection uRLConnectionOpenConnection = this.url.openConnection();
        if (uRLConnectionOpenConnection.getContentLength() > 1048576) {
            rhg0.m179353a("Content-Length exceeds max size of 1048576");
            return null;
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        try {
            byte[] byteArray = ByteStreams.toByteArray(ByteStreams.limit(inputStream, 1048577L));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable(Constants.TAG, 2)) {
                int length = byteArray.length;
                Objects.toString(this.url);
            }
            if (byteArray.length <= 1048576) {
                return byteArray;
            }
            rhg0.m179353a("Image exceeds max size of 1048576");
            return null;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Nullable
    public static ImageDownload create(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new ImageDownload(new URL(str));
        } catch (MalformedURLException unused) {
            return null;
        }
    }

    public Bitmap blockingDownload() throws IOException {
        if (Log.isLoggable(Constants.TAG, 4)) {
            Objects.toString(this.url);
        }
        byte[] bArrBlockingDownloadBytes = blockingDownloadBytes();
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrBlockingDownloadBytes, 0, bArrBlockingDownloadBytes.length);
        if (bitmapDecodeByteArray == null) {
            hj10.m131352a("Failed to decode image: ", this.url);
            return null;
        }
        if (Log.isLoggable(Constants.TAG, 3)) {
            Objects.toString(this.url);
        }
        return bitmapDecodeByteArray;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.future.cancel(true);
    }

    public Task<Bitmap> getTask() {
        return (Task) Preconditions.checkNotNull(this.task);
    }

    public void start(ExecutorService executorService) {
        final sei0 sei0Var = new sei0();
        this.future = executorService.submit(new Runnable() { // from class: l.sfm
            @Override // java.lang.Runnable
            public final void run() {
                ImageDownload.m16825b(this.f164305a, sei0Var);
            }
        });
        this.task = sei0Var.m183657a();
    }
}
