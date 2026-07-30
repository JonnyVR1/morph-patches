package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.data.DataHolder;

/* JADX INFO: loaded from: classes6.dex */
@KeepForSdk
public abstract class DataHolderNotifier<L> implements ListenerHolder.Notifier<L> {
    private final DataHolder zaa;

    @KeepForSdk
    public DataHolderNotifier(@NonNull DataHolder dataHolder) {
        this.zaa = dataHolder;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    @KeepForSdk
    public final void notifyListener(@NonNull L l2) {
        notifyListener(l2, this.zaa);
    }

    @KeepForSdk
    public abstract void notifyListener(@NonNull L l2, @NonNull DataHolder dataHolder);

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    @KeepForSdk
    public void onNotifyListenerFailed() {
        DataHolder dataHolder = this.zaa;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }
}
