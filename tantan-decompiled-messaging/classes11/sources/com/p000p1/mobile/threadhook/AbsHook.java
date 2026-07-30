package com.p000p1.mobile.threadhook;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public abstract class AbsHook {
    private Status mStatus = Status.UNCOMMIT;

    public enum Status {
        UNCOMMIT,
        COMMIT_SUCCESS,
        COMMIT_FAIL_ON_LOAD_LIB,
        COMMIT_FAIL_ON_CONFIGURE,
        COMMIT_FAIL_ON_HOOK
    }

    @Nullable
    public abstract String getNativeLibraryName();

    public Status getStatus() {
        return this.mStatus;
    }

    public abstract boolean onConfigure();

    public abstract boolean onHook(boolean z);

    public void setStatus(Status status) {
        this.mStatus = status;
    }
}
