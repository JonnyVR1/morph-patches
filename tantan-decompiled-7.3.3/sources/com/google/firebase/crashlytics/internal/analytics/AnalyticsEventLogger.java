package com.google.firebase.crashlytics.internal.analytics;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public interface AnalyticsEventLogger {
    void logEvent(@NonNull String str, @Nullable Bundle bundle);
}
