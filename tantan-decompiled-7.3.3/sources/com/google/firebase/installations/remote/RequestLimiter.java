package com.google.firebase.installations.remote;

import androidx.annotation.GuardedBy;
import com.google.firebase.installations.Utils;

/* JADX INFO: loaded from: classes7.dex */
class RequestLimiter {
    private static final long MAXIMUM_BACKOFF_DURATION_FOR_CONFIGURATION_ERRORS = 86400000;
    private static final long MAXIMUM_BACKOFF_DURATION_FOR_SERVER_ERRORS = 1800000;

    @GuardedBy("this")
    private int attemptCount;

    @GuardedBy("this")
    private long nextRequestTime;
    private final Utils utils;

    public RequestLimiter() {
        this.utils = Utils.getInstance();
    }

    private synchronized long getBackoffDuration(int i) {
        if (isRetryableError(i)) {
            return (long) Math.min(Math.pow(2.0d, this.attemptCount) + this.utils.getRandomDelayForSyncPrevention(), MAXIMUM_BACKOFF_DURATION_FOR_SERVER_ERRORS);
        }
        return MAXIMUM_BACKOFF_DURATION_FOR_CONFIGURATION_ERRORS;
    }

    private static boolean isRetryableError(int i) {
        if (i != 429) {
            return i >= 500 && i < 600;
        }
        return true;
    }

    private static boolean isSuccessfulOrRequiresNewFidCreation(int i) {
        return (i >= 200 && i < 300) || i == 401 || i == 404;
    }

    private synchronized void resetBackoffStrategy() {
        this.attemptCount = 0;
    }

    public synchronized boolean isRequestAllowed() {
        return this.attemptCount == 0 || this.utils.currentTimeInMillis() > this.nextRequestTime;
    }

    public synchronized void setNextRequestTime(int i) {
        if (isSuccessfulOrRequiresNewFidCreation(i)) {
            resetBackoffStrategy();
            return;
        }
        this.attemptCount++;
        this.nextRequestTime = this.utils.currentTimeInMillis() + getBackoffDuration(i);
    }

    public RequestLimiter(Utils utils) {
        this.utils = utils;
    }
}
