package com.google.android.gms.common.api.internal;

import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
@WorkerThread
public interface zacs {
    void zae(ConnectionResult connectionResult);

    void zaf(@Nullable IAccountAccessor iAccountAccessor, @Nullable Set set);

    void zag(int i);
}
