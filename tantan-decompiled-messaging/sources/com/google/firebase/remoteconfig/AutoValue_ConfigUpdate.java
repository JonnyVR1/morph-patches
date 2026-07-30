package com.google.firebase.remoteconfig;

import androidx.annotation.NonNull;
import java.util.Set;
import p149l.jfd0;

/* JADX INFO: loaded from: classes7.dex */
final class AutoValue_ConfigUpdate extends ConfigUpdate {
    private final Set<String> updatedKeys;

    public AutoValue_ConfigUpdate(Set<String> set) {
        if (set != null) {
            this.updatedKeys = set;
        } else {
            jfd0.m141176a("Null updatedKeys");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ConfigUpdate) {
            return this.updatedKeys.equals(((ConfigUpdate) obj).getUpdatedKeys());
        }
        return false;
    }

    @Override // com.google.firebase.remoteconfig.ConfigUpdate
    @NonNull
    public Set<String> getUpdatedKeys() {
        return this.updatedKeys;
    }

    public int hashCode() {
        return this.updatedKeys.hashCode() ^ 1000003;
    }

    public String toString() {
        return "ConfigUpdate{updatedKeys=" + this.updatedKeys + "}";
    }
}
