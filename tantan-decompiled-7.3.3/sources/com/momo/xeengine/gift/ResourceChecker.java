package com.momo.xeengine.gift;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes8.dex */
public final class ResourceChecker {
    private final ExecutorService executorService = Executors.newCachedThreadPool();
    private final Handler mainHandler = new Handler(Looper.getMainLooper());

    public interface ResourceDownloadCompletion {
        void onComplete(boolean z);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m21259a(ResourceDownloadCompletion resourceDownloadCompletion, boolean z) {
        if (resourceDownloadCompletion != null) {
            resourceDownloadCompletion.onComplete(z);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m21260b(String str, ResourceDownloadCompletion resourceDownloadCompletion, boolean z, String str2) {
        boolean z2;
        if (!z || TextUtils.isEmpty(str2)) {
            z2 = false;
        } else {
            File file = new File(str2);
            if (file.exists() && file.renameTo(new File(GiftUtils.getResourcePathWithURL(str)))) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        if (resourceDownloadCompletion != null) {
            resourceDownloadCompletion.onComplete(z2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m21261c(ResourceChecker resourceChecker, List list, String str, int[] iArr, int i, final ResourceDownloadCompletion resourceDownloadCompletion, boolean z) {
        resourceChecker.getClass();
        synchronized (list) {
            if (!z) {
                try {
                    list.add(str);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        synchronized (iArr) {
            try {
                int i2 = iArr[0] + 1;
                iArr[0] = i2;
                if (i2 == i) {
                    final boolean zIsEmpty = list.isEmpty();
                    resourceChecker.mainHandler.post(new Runnable() { // from class: com.momo.xeengine.gift.q
                        @Override // java.lang.Runnable
                        public final void run() {
                            ResourceChecker.m21259a(resourceDownloadCompletion, zIsEmpty);
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void downloadResourceAtURL(final String str, final ResourceDownloadCompletion resourceDownloadCompletion) {
        IResourceDownloader downloader = GiftSDKPreferences.getInstance().getDownloader();
        if (downloader == null) {
            resourceDownloadCompletion.onComplete(false);
        } else {
            downloader.downloadResourceWithURL(str, new IResourceDownloader.Callback() { // from class: com.momo.xeengine.gift.p
                @Override // com.momo.xeengine.gift.IResourceDownloader.Callback
                public final void onComplete(boolean z, String str2) {
                    ResourceChecker.m21260b(str, resourceDownloadCompletion, z, str2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m21263e(final ResourceChecker resourceChecker, final String str, final List list, final int[] iArr, final int i, final ResourceDownloadCompletion resourceDownloadCompletion) {
        resourceChecker.getClass();
        resourceChecker.downloadResourceAtURL(str, new ResourceDownloadCompletion() { // from class: com.momo.xeengine.gift.t
            @Override // com.momo.xeengine.gift.ResourceChecker.ResourceDownloadCompletion
            public final void onComplete(boolean z) {
                ResourceChecker.m21261c(this.f15352a, list, str, iArr, i, resourceDownloadCompletion, z);
            }
        });
    }

    public void downloadResources(List<String> list, final ResourceDownloadCompletion resourceDownloadCompletion) {
        if (list == null || list.isEmpty()) {
            if (resourceDownloadCompletion != null) {
                this.mainHandler.post(new Runnable() { // from class: com.momo.xeengine.gift.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        resourceDownloadCompletion.onComplete(true);
                    }
                });
                return;
            }
            return;
        }
        final ArrayList arrayList = new ArrayList();
        final int size = list.size();
        final int[] iArr = {0};
        for (final String str : list) {
            this.executorService.submit(new Runnable() { // from class: com.momo.xeengine.gift.s
                @Override // java.lang.Runnable
                public final void run() {
                    ResourceChecker.m21263e(this.f15346a, str, arrayList, iArr, size, resourceDownloadCompletion);
                }
            });
        }
    }
}
