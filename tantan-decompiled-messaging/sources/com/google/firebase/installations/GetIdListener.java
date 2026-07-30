package com.google.firebase.installations;

import com.google.firebase.installations.local.PersistedInstallationEntry;
import p149l.sei0;

/* JADX INFO: loaded from: classes7.dex */
class GetIdListener implements StateListener {
    final sei0<String> taskCompletionSource;

    public GetIdListener(sei0<String> sei0Var) {
        this.taskCompletionSource = sei0Var;
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
        this.taskCompletionSource.m183661e(persistedInstallationEntry.getFirebaseInstallationId());
        return true;
    }
}
