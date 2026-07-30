package com.google.firebase.installations;

import com.google.firebase.installations.local.PersistedInstallationEntry;
import p153l.sni0;

/* JADX INFO: loaded from: classes7.dex */
class GetIdListener implements StateListener {
    final sni0<String> taskCompletionSource;

    public GetIdListener(sni0<String> sni0Var) {
        this.taskCompletionSource = sni0Var;
    }

    @Override // com.google.firebase.installations.StateListener
    public boolean onException(Exception exc) {
        return false;
    }

    @Override // com.google.firebase.installations.StateListener
    public boolean onStateReached(PersistedInstallationEntry persistedInstallationEntry) {
        if (!persistedInstallationEntry.isUnregistered() && !persistedInstallationEntry.isRegistered() && !persistedInstallationEntry.isErrored()) {
            return false;
        }
        this.taskCompletionSource.m186943e(persistedInstallationEntry.getFirebaseInstallationId());
        return true;
    }
}
