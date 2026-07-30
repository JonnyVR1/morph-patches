package com.google.android.gms.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import p149l.ess0;
import p149l.exr0;
import p149l.kns0;
import p149l.x2t0;

/* JADX INFO: loaded from: classes6.dex */
@KeepForSdk
public final class NotificationHandlerActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        try {
            ess0 ess0VarM156446j = exr0.m118702a().m156446j(this, new kns0());
            if (ess0VarM156446j == null) {
                x2t0.m206866d("OfflineUtils is null");
            } else {
                ess0VarM156446j.mo108560x0(getIntent());
            }
        } catch (RemoteException e) {
            x2t0.m206866d("RemoteException calling handleNotificationIntent: ".concat(e.toString()));
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        finish();
    }
}
