package com.momo.xeengine.gift;

import android.util.Log;
import com.momo.xeengine.XEnginePreferences;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes8.dex */
final class ResourceDownloaderImpl implements IResourceDownloader {
    private static final String CACHE_DIRECTORY_NAME = "DownloadCache";
    private static final String TAG = "[XENGINE]";
    private final File cacheDirectory = new File(XEnginePreferences.getContext().getCacheDir(), CACHE_DIRECTORY_NAME);
    private final ExecutorService executorService = Executors.newFixedThreadPool(4);

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m21264a(ResourceDownloaderImpl resourceDownloaderImpl, String str, File file, IResourceDownloader.Callback callback) {
        resourceDownloaderImpl.getClass();
        try {
            File fileDownloadFile = resourceDownloaderImpl.downloadFile(str, file);
            if (fileDownloadFile == null || callback == null) {
                return;
            }
            callback.onComplete(true, fileDownloadFile.getAbsolutePath());
        } catch (Exception e) {
            Log.e("[XENGINE]", "Download failed", e);
            if (callback != null) {
                callback.onComplete(false, null);
            }
        }
    }

    private File downloadFile(String str, File file) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setConnectTimeout(5000);
        httpURLConnection.setReadTimeout(5000);
        httpURLConnection.setRequestMethod("GET");
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[4096];
            while (true) {
                int i = inputStream.read(bArr);
                if (i == -1) {
                    file.getAbsolutePath();
                    return file;
                }
                fileOutputStream.write(bArr, 0, i);
            }
        } finally {
            httpURLConnection.disconnect();
        }
    }

    @Override // com.momo.xeengine.gift.IResourceDownloader
    public void downloadResourceWithURL(final String str, final IResourceDownloader.Callback callback) {
        if (!this.cacheDirectory.exists() && !this.cacheDirectory.mkdirs()) {
            Log.e("[XENGINE]", "Failed to create cache directory");
        }
        if (str == null || str.isEmpty()) {
            if (callback != null) {
                callback.onComplete(false, null);
                return;
            }
            return;
        }
        final File file = new File(this.cacheDirectory, str.substring(str.lastIndexOf(47) + 1));
        if (!file.exists()) {
            this.executorService.execute(new Runnable() { // from class: com.momo.xeengine.gift.u
                @Override // java.lang.Runnable
                public final void run() {
                    ResourceDownloaderImpl.m21264a(this.f15358a, str, file, callback);
                }
            });
            return;
        }
        file.getAbsolutePath();
        if (callback != null) {
            callback.onComplete(true, file.getAbsolutePath());
        }
    }
}
