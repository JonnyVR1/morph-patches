package com.bumptech.glide.manager;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: renamed from: com.bumptech.glide.manager.i */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi(26)
final class ComponentCallbacks2C1124i implements InterfaceC1126k, ComponentCallbacks2 {
    @Override // com.bumptech.glide.manager.InterfaceC1126k
    /* JADX INFO: renamed from: a */
    public void mo5634a(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        onTrimMemory(20);
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
    }
}
