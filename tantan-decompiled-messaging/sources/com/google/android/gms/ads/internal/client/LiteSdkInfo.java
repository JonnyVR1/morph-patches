package com.google.android.gms.ads.internal.client;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import p149l.gat0;
import p149l.kns0;
import p149l.ons0;

/* JADX INFO: loaded from: classes6.dex */
@KeepForSdk
public class LiteSdkInfo extends gat0 {
    public LiteSdkInfo(@NonNull Context context) {
    }

    @Override // p149l.qbt0
    public ons0 getAdapterCreator() {
        return new kns0();
    }

    @Override // p149l.qbt0
    public zzen getLiteSdkVersion() {
        return new zzen(ModuleDescriptor.MODULE_VERSION, 240304000, "23.0.0");
    }
}
