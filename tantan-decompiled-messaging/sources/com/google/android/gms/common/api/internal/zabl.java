package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes6.dex */
final class zabl implements BackgroundDetector.BackgroundStateChangeListener {
    final /* synthetic */ GoogleApiManager zaa;

    public zabl(GoogleApiManager googleApiManager) {
        this.zaa = googleApiManager;
    }

    @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
    public final void onBackgroundStateChanged(boolean z) {
        GoogleApiManager googleApiManager = this.zaa;
        googleApiManager.zar.sendMessage(googleApiManager.zar.obtainMessage(1, Boolean.valueOf(z)));
    }
}
