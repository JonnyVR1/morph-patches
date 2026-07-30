package com.google.firebase.iid.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.tasks.Task;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
@KeepForSdk
public interface FirebaseInstanceIdInternal {

    @KeepForSdk
    public interface NewTokenListener {
        @KeepForSdk
        void onNewToken(String str);
    }

    @KeepForSdk
    void addNewTokenListener(NewTokenListener newTokenListener);

    @KeepForSdk
    void deleteToken(@NonNull String str, @NonNull String str2) throws IOException;

    @KeepForSdk
    String getId();

    @Nullable
    @KeepForSdk
    String getToken();

    @NonNull
    @KeepForSdk
    Task<String> getTokenTask();
}
