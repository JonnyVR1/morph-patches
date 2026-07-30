package com.google.firebase.remoteconfig;

import androidx.annotation.NonNull;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ConfigUpdate {
    @NonNull
    public static ConfigUpdate create(@NonNull Set<String> set) {
        return new AutoValue_ConfigUpdate(set);
    }

    @NonNull
    public abstract Set<String> getUpdatedKeys();
}
