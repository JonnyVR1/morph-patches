package com.google.android.gms.auth;

import android.content.Intent;

/* JADX INFO: loaded from: classes6.dex */
public class GooglePlayServicesAvailabilityException extends UserRecoverableAuthException {
    private final int zzu;

    public GooglePlayServicesAvailabilityException(int i, String str, Intent intent) {
        super(str, intent);
        this.zzu = i;
    }

    public int getConnectionStatusCode() {
        return this.zzu;
    }
}
