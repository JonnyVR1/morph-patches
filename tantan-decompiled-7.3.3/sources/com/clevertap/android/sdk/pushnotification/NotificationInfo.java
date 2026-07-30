package com.clevertap.android.sdk.pushnotification;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
public final class NotificationInfo {
    public final boolean fromCleverTap;
    public final boolean shouldRender;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public NotificationInfo(boolean z, boolean z2) {
        this.fromCleverTap = z;
        this.shouldRender = z2;
    }

    public String toString() {
        return "NotificationInfo{fromCleverTap=" + this.fromCleverTap + ", shouldRender=" + this.shouldRender + '}';
    }
}
