package com.google.firebase.emulators;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes7.dex */
public final class EmulatedServiceSettings {
    private final String host;
    private final int port;

    public EmulatedServiceSettings(@NonNull String str, int i) {
        this.host = str;
        this.port = i;
    }

    public String getHost() {
        return this.host;
    }

    public int getPort() {
        return this.port;
    }
}
