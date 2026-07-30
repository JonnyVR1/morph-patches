package com.google.android.gms.location;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import p149l.aar0;
import p149l.qsy0;

/* JADX INFO: loaded from: classes6.dex */
public class ActivityRecognition {

    @NonNull
    @Deprecated
    public static final Api<Api.ApiOptions.NoOptions> API = aar0.f68602b;

    @NonNull
    @Deprecated
    public static final ActivityRecognitionApi ActivityRecognitionApi = new qsy0();

    private ActivityRecognition() {
    }

    @NonNull
    public static ActivityRecognitionClient getClient(@NonNull Activity activity) {
        return new aar0(activity);
    }

    @NonNull
    public static ActivityRecognitionClient getClient(@NonNull Context context) {
        return new aar0(context);
    }
}
