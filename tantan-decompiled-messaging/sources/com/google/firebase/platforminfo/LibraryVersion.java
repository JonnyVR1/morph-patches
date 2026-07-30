package com.google.firebase.platforminfo;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes7.dex */
public abstract class LibraryVersion {
    public static LibraryVersion create(String str, String str2) {
        return new AutoValue_LibraryVersion(str, str2);
    }

    public abstract String getLibraryName();

    public abstract String getVersion();
}
