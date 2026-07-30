package com.google.firebase.remoteconfig;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes7.dex */
public interface ConfigUpdateListener {
    void onError(FirebaseRemoteConfigException firebaseRemoteConfigException);

    void onUpdate(@NonNull ConfigUpdate configUpdate);
}
