package com.google.android.gms.ads;

import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import p149l.exr0;
import p149l.kns0;
import p149l.x2t0;

/* JADX INFO: loaded from: classes6.dex */
@KeepForSdk
public class AdService extends IntentService {

    @NonNull
    @KeepForSdk
    public static final String CLASS_NAME = "com.google.android.gms.ads.AdService";

    public AdService() {
        super("AdService");
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(@NonNull Intent intent) {
        try {
            exr0.m118702a().m156446j(this, new kns0()).mo108560x0(intent);
        } catch (RemoteException e) {
            x2t0.m206866d("RemoteException calling handleNotificationIntent: ".concat(e.toString()));
        }
    }
}
