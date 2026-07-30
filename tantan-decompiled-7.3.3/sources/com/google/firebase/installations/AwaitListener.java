package com.google.firebase.installations;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
final class AwaitListener implements OnCompleteListener<Void> {
    private final CountDownLatch latch = new CountDownLatch(1);

    public boolean await(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.latch.await(j, timeUnit);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(@NonNull Task<Void> task) {
        this.latch.countDown();
    }

    public void onSuccess() {
        this.latch.countDown();
    }
}
