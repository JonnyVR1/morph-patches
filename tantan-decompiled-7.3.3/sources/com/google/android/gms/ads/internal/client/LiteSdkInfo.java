package com.google.android.gms.ads.internal.client;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import p153l.mjt0;
import p153l.qws0;
import p153l.uws0;

/* JADX INFO: loaded from: classes6.dex */
@KeepForSdk
public class LiteSdkInfo extends mjt0 {
    public LiteSdkInfo(@NonNull Context context) {
    }

    @Override // p153l.wkt0
    public uws0 getAdapterCreator() {
        return new qws0();
    }

    @Override // p153l.wkt0
    public zzen getLiteSdkVersion() {
        return new zzen(ModuleDescriptor.MODULE_VERSION, 240304000, "23.0.0");
    }
}
