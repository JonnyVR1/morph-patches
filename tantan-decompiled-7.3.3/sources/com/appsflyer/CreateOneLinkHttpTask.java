package com.appsflyer;

import androidx.annotation.WorkerThread;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class CreateOneLinkHttpTask {

    @Deprecated
    public interface ResponseListener {
        @WorkerThread
        void onResponse(String str);

        @WorkerThread
        void onResponseError(String str);
    }
}
