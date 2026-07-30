package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
class CrashlyticsAppQualitySessionsStore {
    private static final String AQS_SESSION_ID_FILENAME_PREFIX = "aqs.";
    private static final FilenameFilter AQS_SESSION_ID_FILE_FILTER = new FilenameFilter() { // from class: com.google.firebase.crashlytics.internal.common.a
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return str.startsWith(CrashlyticsAppQualitySessionsStore.AQS_SESSION_ID_FILENAME_PREFIX);
        }
    };
    private static final Comparator<File> FILE_RECENCY_COMPARATOR = new Comparator() { // from class: com.google.firebase.crashlytics.internal.common.b
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
        }
    };
    private final FileStore fileStore;

    @Nullable
    private String sessionId = null;

    @Nullable
    private String appQualitySessionId = null;

    public CrashlyticsAppQualitySessionsStore(FileStore fileStore) {
        this.fileStore = fileStore;
    }

    private static void persist(FileStore fileStore, @Nullable String str, @Nullable String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            fileStore.getSessionFile(str, AQS_SESSION_ID_FILENAME_PREFIX.concat(str2)).createNewFile();
        } catch (IOException e) {
            Logger.getLogger().m16730w("Failed to persist App Quality Sessions session id.", e);
        }
    }

    @Nullable
    @VisibleForTesting
    public static String readAqsSessionIdFile(FileStore fileStore, @NonNull String str) {
        List<File> sessionFiles = fileStore.getSessionFiles(str, AQS_SESSION_ID_FILE_FILTER);
        if (!sessionFiles.isEmpty()) {
            return ((File) Collections.min(sessionFiles, FILE_RECENCY_COMPARATOR)).getName().substring(4);
        }
        Logger.getLogger().m16729w("Unable to read App Quality Sessions session id.");
        return null;
    }

    @Nullable
    public synchronized String getAppQualitySessionId(@NonNull String str) {
        if (Objects.equals(this.sessionId, str)) {
            return this.appQualitySessionId;
        }
        return readAqsSessionIdFile(this.fileStore, str);
    }

    public synchronized void rotateAppQualitySessionId(@NonNull String str) {
        if (!Objects.equals(this.appQualitySessionId, str)) {
            persist(this.fileStore, this.sessionId, str);
            this.appQualitySessionId = str;
        }
    }

    public synchronized void rotateSessionId(@Nullable String str) {
        if (!Objects.equals(this.sessionId, str)) {
            persist(this.fileStore, str, this.appQualitySessionId);
            this.sessionId = str;
        }
    }
}
