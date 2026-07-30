package com.google.android.gms.common.data;

import androidx.annotation.NonNull;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class DataBufferObserverSet implements DataBufferObserver, DataBufferObserver.Observable {
    private final HashSet zaa = new HashSet();

    @Override // com.google.android.gms.common.data.DataBufferObserver.Observable
    public void addObserver(@NonNull DataBufferObserver dataBufferObserver) {
        this.zaa.add(dataBufferObserver);
    }

    public void clear() {
        this.zaa.clear();
    }

    public boolean hasObservers() {
        return !this.zaa.isEmpty();
    }

    @Override // com.google.android.gms.common.data.DataBufferObserver
    public void onDataChanged() {
        Iterator it = this.zaa.iterator();
        while (it.hasNext()) {
            ((DataBufferObserver) it.next()).onDataChanged();
        }
    }

    @Override // com.google.android.gms.common.data.DataBufferObserver
    public void onDataRangeChanged(int i, int i2) {
        Iterator it = this.zaa.iterator();
        while (it.hasNext()) {
            ((DataBufferObserver) it.next()).onDataRangeChanged(i, i2);
        }
    }

    @Override // com.google.android.gms.common.data.DataBufferObserver
    public void onDataRangeInserted(int i, int i2) {
        Iterator it = this.zaa.iterator();
        while (it.hasNext()) {
            ((DataBufferObserver) it.next()).onDataRangeInserted(i, i2);
        }
    }

    @Override // com.google.android.gms.common.data.DataBufferObserver
    public void onDataRangeMoved(int i, int i2, int i3) {
        Iterator it = this.zaa.iterator();
        while (it.hasNext()) {
            ((DataBufferObserver) it.next()).onDataRangeMoved(i, i2, i3);
        }
    }

    @Override // com.google.android.gms.common.data.DataBufferObserver
    public void onDataRangeRemoved(int i, int i2) {
        Iterator it = this.zaa.iterator();
        while (it.hasNext()) {
            ((DataBufferObserver) it.next()).onDataRangeRemoved(i, i2);
        }
    }

    @Override // com.google.android.gms.common.data.DataBufferObserver.Observable
    public void removeObserver(@NonNull DataBufferObserver dataBufferObserver) {
        this.zaa.remove(dataBufferObserver);
    }
}
