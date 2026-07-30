package com.google.firebase.installations;

import com.google.firebase.installations.local.PersistedInstallationEntry;
import p149l.sei0;

/* JADX INFO: loaded from: classes7.dex */
class GetAuthTokenListener implements StateListener {
    private final sei0<InstallationTokenResult> resultTaskCompletionSource;
    private final Utils utils;

    public GetAuthTokenListener(Utils utils, sei0<InstallationTokenResult> sei0Var) {
        this.utils = utils;
        this.resultTaskCompletionSource = sei0Var;
    }

    @Override // com.google.firebase.installations.StateListener
    public boolean onException(Exception exc) {
        this.resultTaskCompletionSource.m183660d(exc);
        return true;
    }

    @Override // com.google.firebase.installations.StateListener
    public boolean onStateReached(PersistedInstallationEntry persistedInstallationEntry) {
        if (!persistedInstallationEntry.isRegistered() || this.utils.isAuthTokenExpired(persistedInstallationEntry)) {
            return false;
        }
        this.resultTaskCompletionSource.m183659c(InstallationTokenResult.builder().setToken(persistedInstallationEntry.getAuthToken()).setTokenExpirationTimestamp(persistedInstallationEntry.getExpiresInSecs()).setTokenCreationTimestamp(persistedInstallationEntry.getTokenCreationEpochInSecs()).build());
        return true;
    }
}
