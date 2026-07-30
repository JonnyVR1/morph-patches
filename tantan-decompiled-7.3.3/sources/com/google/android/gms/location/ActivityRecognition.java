package com.google.android.gms.location;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import p153l.gjr0;
import p153l.w1z0;

/* JADX INFO: loaded from: classes6.dex */
public class ActivityRecognition {

    @NonNull
    @Deprecated
    public static final Api<Api.ApiOptions.NoOptions> API = gjr0.f104648b;

    @NonNull
    @Deprecated
    public static final ActivityRecognitionApi ActivityRecognitionApi = new w1z0();

    private ActivityRecognition() {
    }

    @NonNull
    public static ActivityRecognitionClient getClient(@NonNull Activity activity) {
        return new gjr0(activity);
    }

    @NonNull
    public static ActivityRecognitionClient getClient(@NonNull Context context) {
        return new gjr0(context);
    }
}
