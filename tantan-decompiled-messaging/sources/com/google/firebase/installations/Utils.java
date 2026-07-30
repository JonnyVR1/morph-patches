package com.google.firebase.installations;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.installations.local.PersistedInstallationEntry;
import com.google.firebase.installations.time.Clock;
import com.google.firebase.installations.time.SystemClock;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public final class Utils {
    private static final String APP_ID_IDENTIFICATION_SUBSTRING = ":";
    private static Utils singleton;
    private final Clock clock;
    public static final long AUTH_TOKEN_EXPIRATION_BUFFER_IN_SECS = 3600;
    private static final Pattern API_KEY_FORMAT = Pattern.compile("\\AA[\\w-]{38}\\z");

    private Utils(Clock clock) {
        this.clock = clock;
    }

    public static Utils getInstance(Clock clock) {
        if (singleton == null) {
            singleton = new Utils(clock);
        }
        return singleton;
    }

    public static boolean isValidApiKeyFormat(@Nullable String str) {
        return API_KEY_FORMAT.matcher(str).matches();
    }

    public static boolean isValidAppIdFormat(@Nullable String str) {
        return str.contains(APP_ID_IDENTIFICATION_SUBSTRING);
    }

    public long currentTimeInMillis() {
        return this.clock.currentTimeMillis();
    }

    public long currentTimeInSecs() {
        return currentTimeInMillis() / 1000;
    }

    public long getRandomDelayForSyncPrevention() {
        return (long) (Math.random() * 1000.0d);
    }

    public boolean isAuthTokenExpired(@NonNull PersistedInstallationEntry persistedInstallationEntry) {
        return TextUtils.isEmpty(persistedInstallationEntry.getAuthToken()) || persistedInstallationEntry.getTokenCreationEpochInSecs() + persistedInstallationEntry.getExpiresInSecs() < currentTimeInSecs() + AUTH_TOKEN_EXPIRATION_BUFFER_IN_SECS;
    }

    public static Utils getInstance() {
        return getInstance(SystemClock.getInstance());
    }
}
