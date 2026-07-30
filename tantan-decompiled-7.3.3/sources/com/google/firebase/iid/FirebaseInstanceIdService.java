package com.google.firebase.iid;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.ShowFirstParty;

/* JADX INFO: loaded from: classes7.dex */
@ShowFirstParty
@Deprecated
public class FirebaseInstanceIdService extends Service {
    @Override // android.app.Service
    @Nullable
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @WorkerThread
    @Deprecated
    public void onTokenRefresh() {
    }
}
