package com.tencent.liteav.basic.util;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.tencent.liteav.basic.util.e */
/* JADX INFO: loaded from: classes2.dex */
public class HandlerC14214e extends Handler {
    public HandlerC14214e(Looper looper) {
        super(looper);
    }

    /* JADX INFO: renamed from: a */
    public boolean m84213a(final Runnable runnable, long j) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        boolean zPost = post(new Runnable() { // from class: com.tencent.liteav.basic.util.e.1
            @Override // java.lang.Runnable
            public void run() {
                runnable.run();
                countDownLatch.countDown();
            }
        });
        if (zPost) {
            try {
                if (j > 0) {
                    countDownLatch.await(j, TimeUnit.MILLISECONDS);
                    return zPost;
                }
                countDownLatch.await();
                return zPost;
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        return zPost;
    }

    /* JADX INFO: renamed from: a */
    public boolean m84212a(Runnable runnable) {
        return m84213a(runnable, -1L);
    }
}
