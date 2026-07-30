package com.google.android.gms.ads;

import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import p153l.dct0;
import p153l.k6s0;
import p153l.qws0;

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
            k6s0.m148568a().m184302j(this, new qws0()).mo138152x0(intent);
        } catch (RemoteException e) {
            dct0.m115295d("RemoteException calling handleNotificationIntent: ".concat(e.toString()));
        }
    }
}
