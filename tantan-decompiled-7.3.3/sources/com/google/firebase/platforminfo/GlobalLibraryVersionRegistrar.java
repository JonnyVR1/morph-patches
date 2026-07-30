package com.google.firebase.platforminfo;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class GlobalLibraryVersionRegistrar {
    private static volatile GlobalLibraryVersionRegistrar INSTANCE;
    private final Set<LibraryVersion> infos = new HashSet();

    public static GlobalLibraryVersionRegistrar getInstance() {
        GlobalLibraryVersionRegistrar globalLibraryVersionRegistrar;
        GlobalLibraryVersionRegistrar globalLibraryVersionRegistrar2 = INSTANCE;
        if (globalLibraryVersionRegistrar2 != null) {
            return globalLibraryVersionRegistrar2;
        }
        synchronized (GlobalLibraryVersionRegistrar.class) {
            try {
                globalLibraryVersionRegistrar = INSTANCE;
                if (globalLibraryVersionRegistrar == null) {
                    globalLibraryVersionRegistrar = new GlobalLibraryVersionRegistrar();
                    INSTANCE = globalLibraryVersionRegistrar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return globalLibraryVersionRegistrar;
    }

    public Set<LibraryVersion> getRegisteredVersions() {
        Set<LibraryVersion> setUnmodifiableSet;
        synchronized (this.infos) {
            setUnmodifiableSet = Collections.unmodifiableSet(this.infos);
        }
        return setUnmodifiableSet;
    }

    public void registerVersion(String str, String str2) {
        synchronized (this.infos) {
            this.infos.add(LibraryVersion.create(str, str2));
        }
    }
}
