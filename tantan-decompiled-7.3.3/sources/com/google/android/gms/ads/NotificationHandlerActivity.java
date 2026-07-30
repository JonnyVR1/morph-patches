package com.google.android.gms.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import p153l.dct0;
import p153l.k1t0;
import p153l.k6s0;
import p153l.qws0;

/* JADX INFO: loaded from: classes6.dex */
@KeepForSdk
public final class NotificationHandlerActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        try {
            k1t0 k1t0VarM184302j = k6s0.m148568a().m184302j(this, new qws0());
            if (k1t0VarM184302j == null) {
                dct0.m115295d("OfflineUtils is null");
            } else {
                k1t0VarM184302j.mo138152x0(getIntent());
            }
        } catch (RemoteException e) {
            dct0.m115295d("RemoteException calling handleNotificationIntent: ".concat(e.toString()));
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        finish();
    }
}
