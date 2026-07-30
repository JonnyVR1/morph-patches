package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.sessions.api.SessionSubscriber;

/* JADX INFO: loaded from: classes7.dex */
public class CrashlyticsAppQualitySessionsSubscriber implements SessionSubscriber {
    private final CrashlyticsAppQualitySessionsStore appQualitySessionsStore;
    private final DataCollectionArbiter dataCollectionArbiter;

    public CrashlyticsAppQualitySessionsSubscriber(DataCollectionArbiter dataCollectionArbiter, FileStore fileStore) {
        this.dataCollectionArbiter = dataCollectionArbiter;
        this.appQualitySessionsStore = new CrashlyticsAppQualitySessionsStore(fileStore);
    }

    @Nullable
    public String getAppQualitySessionId(@NonNull String str) {
        return this.appQualitySessionsStore.getAppQualitySessionId(str);
    }

    @Override // com.google.firebase.sessions.api.SessionSubscriber
    @NonNull
    public SessionSubscriber.Name getSessionSubscriberName() {
        return SessionSubscriber.Name.CRASHLYTICS;
    }

    @Override // com.google.firebase.sessions.api.SessionSubscriber
    public boolean isDataCollectionEnabled() {
        return this.dataCollectionArbiter.isAutomaticDataCollectionEnabled();
    }

    @Override // com.google.firebase.sessions.api.SessionSubscriber
    public void onSessionChanged(@NonNull SessionSubscriber.SessionDetails sessionDetails) {
        Logger.getLogger().m16776d("App Quality Sessions session changed: " + sessionDetails);
        this.appQualitySessionsStore.rotateAppQualitySessionId(sessionDetails.getSessionId());
    }

    public void setSessionId(@Nullable String str) {
        this.appQualitySessionsStore.rotateSessionId(str);
    }
}
