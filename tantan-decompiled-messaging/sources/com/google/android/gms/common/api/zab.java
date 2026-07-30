package com.google.android.gms.common.api;

/* JADX INFO: loaded from: classes6.dex */
final class zab implements PendingResult.StatusListener {
    final /* synthetic */ Batch zaa;

    public zab(Batch batch) {
        this.zaa = batch;
    }

    @Override // com.google.android.gms.common.api.PendingResult.StatusListener
    public final void onComplete(Status status) {
        synchronized (this.zaa.zai) {
            try {
                if (this.zaa.isCanceled()) {
                    return;
                }
                if (status.isCanceled()) {
                    this.zaa.zag = true;
                } else if (!status.isSuccess()) {
                    this.zaa.zaf = true;
                }
                this.zaa.zae--;
                Batch batch = this.zaa;
                if (batch.zae == 0) {
                    if (batch.zag) {
                        super/*com.google.android.gms.common.api.internal.BasePendingResult*/.cancel();
                    } else {
                        Status status2 = batch.zaf ? new Status(13) : Status.RESULT_SUCCESS;
                        Batch batch2 = this.zaa;
                        batch2.setResult(new BatchResult(status2, batch2.zah));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
