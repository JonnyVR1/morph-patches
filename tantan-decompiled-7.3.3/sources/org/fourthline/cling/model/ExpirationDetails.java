package org.fourthline.cling.model;

import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public class ExpirationDetails {
    public static final int UNLIMITED_AGE = 0;
    private static String simpleName = "ExpirationDetails";
    private long lastRefreshTimestampSeconds;
    private int maxAgeSeconds;

    public ExpirationDetails(int i) {
        this.maxAgeSeconds = 0;
        this.lastRefreshTimestampSeconds = getCurrentTimestampSeconds();
        this.maxAgeSeconds = i;
    }

    public long getCurrentTimestampSeconds() {
        return new Date().getTime() / 1000;
    }

    public long getLastRefreshTimestampSeconds() {
        return this.lastRefreshTimestampSeconds;
    }

    public int getMaxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    public long getSecondsUntilExpiration() {
        int i = this.maxAgeSeconds;
        if (i == 0) {
            return 2147483647L;
        }
        return (this.lastRefreshTimestampSeconds + ((long) i)) - getCurrentTimestampSeconds();
    }

    public boolean hasExpired(boolean z) {
        int i = this.maxAgeSeconds;
        if (i != 0) {
            return this.lastRefreshTimestampSeconds + ((long) (i / (z ? 2 : 1))) < getCurrentTimestampSeconds();
        }
        return false;
    }

    public void setLastRefreshTimestampSeconds(long j) {
        this.lastRefreshTimestampSeconds = j;
    }

    public void stampLastRefresh() {
        setLastRefreshTimestampSeconds(getCurrentTimestampSeconds());
    }

    public String toString() {
        return "(" + simpleName + ") MAX AGE: " + this.maxAgeSeconds;
    }

    public ExpirationDetails() {
        this.maxAgeSeconds = 0;
        this.lastRefreshTimestampSeconds = getCurrentTimestampSeconds();
    }

    public boolean hasExpired() {
        return hasExpired(false);
    }
}
