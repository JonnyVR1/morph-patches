package p153l;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public interface xw3 {
    @NonNull
    kob0 getPushType();

    boolean isAvailable();

    boolean isSupported();

    int minSDKSupportVersionCode();

    void requestToken();
}
