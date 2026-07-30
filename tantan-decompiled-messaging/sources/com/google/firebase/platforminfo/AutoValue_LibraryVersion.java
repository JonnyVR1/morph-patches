package com.google.firebase.platforminfo;

import p149l.jfd0;

/* JADX INFO: loaded from: classes7.dex */
final class AutoValue_LibraryVersion extends LibraryVersion {
    private final String libraryName;
    private final String version;

    public AutoValue_LibraryVersion(String str, String str2) {
        if (str == null) {
            jfd0.m141176a("Null libraryName");
            throw null;
        }
        this.libraryName = str;
        if (str2 != null) {
            this.version = str2;
        } else {
            jfd0.m141176a("Null version");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LibraryVersion) {
            LibraryVersion libraryVersion = (LibraryVersion) obj;
            if (this.libraryName.equals(libraryVersion.getLibraryName()) && this.version.equals(libraryVersion.getVersion())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.platforminfo.LibraryVersion
    public String getLibraryName() {
        return this.libraryName;
    }

    @Override // com.google.firebase.platforminfo.LibraryVersion
    public String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.version.hashCode() ^ ((this.libraryName.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.libraryName + ", version=" + this.version + "}";
    }
}
