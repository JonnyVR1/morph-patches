package com.google.firebase.remoteconfig.interop;

import androidx.annotation.NonNull;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber;

/* JADX INFO: loaded from: classes7.dex */
public interface FirebaseRemoteConfigInterop {
    void registerRolloutsStateSubscriber(@NonNull String str, @NonNull RolloutsStateSubscriber rolloutsStateSubscriber);
}
