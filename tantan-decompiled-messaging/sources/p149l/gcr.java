package p149l;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: loaded from: classes6.dex */
@KeepForSdk
public interface gcr {
    @KeepForSdk
    /* JADX INFO: renamed from: a */
    void mo14998a(@NonNull Activity activity, @NonNull Bundle bundle, @Nullable Bundle bundle2);

    @NonNull
    @KeepForSdk
    /* JADX INFO: renamed from: b */
    View mo14999b(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle);

    @KeepForSdk
    /* JADX INFO: renamed from: d */
    void mo15001d();

    @KeepForSdk
    /* JADX INFO: renamed from: l */
    void mo15002l(@Nullable Bundle bundle);

    @KeepForSdk
    /* JADX INFO: renamed from: m */
    void mo15003m(@NonNull Bundle bundle);

    @KeepForSdk
    void onDestroy();

    @KeepForSdk
    void onLowMemory();

    @KeepForSdk
    void onPause();

    @KeepForSdk
    void onResume();

    @KeepForSdk
    void onStart();

    @KeepForSdk
    /* JADX INFO: renamed from: w */
    void mo15004w();
}
