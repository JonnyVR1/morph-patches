package p149l;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public interface yv3 {
    @NonNull
    ggb0 getPushType();

    boolean isAvailable();

    boolean isSupported();

    int minSDKSupportVersionCode();

    void requestToken();
}
