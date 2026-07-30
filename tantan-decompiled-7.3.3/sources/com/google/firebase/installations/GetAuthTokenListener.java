package com.google.firebase.installations;

import com.google.firebase.installations.local.PersistedInstallationEntry;
import p153l.sni0;

/* JADX INFO: loaded from: classes7.dex */
class GetAuthTokenListener implements StateListener {
    private final sni0<InstallationTokenResult> resultTaskCompletionSource;
    private final Utils utils;

    public GetAuthTokenListener(Utils utils, sni0<InstallationTokenResult> sni0Var) {
        this.utils = utils;
        this.resultTaskCompletionSource = sni0Var;
    }

    @Override // com.google.firebase.installations.StateListener
    public boolean onException(Exception exc) {
        this.resultTaskCompletionSource.m186942d(exc);
        return true;
    }

    @Override // com.google.firebase.installations.StateListener
    public boolean onStateReached(PersistedInstallationEntry persistedInstallationEntry) {
        if (!persistedInstallationEntry.isRegistered() || this.utils.isAuthTokenExpired(persistedInstallationEntry)) {
            return false;
        }
        this.resultTaskCompletionSource.m186941c(InstallationTokenResult.builder().setToken(persistedInstallationEntry.getAuthToken()).setTokenExpirationTimestamp(persistedInstallationEntry.getExpiresInSecs()).setTokenCreationTimestamp(persistedInstallationEntry.getTokenCreationEpochInSecs()).build());
        return true;
    }
}
