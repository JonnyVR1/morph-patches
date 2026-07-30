package com.p000p1.mobile.putong.app.alive;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import l.j760;
import l.vwb;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class PullAliveService extends Service {
    @Override // android.app.Service
    @Nullable
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        if (NullChecker.b(intent)) {
            String stringExtra = intent.getStringExtra("extra.from_packagename");
            if (TextUtils.isEmpty(stringExtra)) {
                stringExtra = intent.getStringExtra("source");
            }
            if (TextUtils.isEmpty(stringExtra)) {
                stringExtra = "";
            }
            zvf0.D("e_backend_application_create_thirdparty", "", new j760[]{vwb.Y("thirdparty", stringExtra)});
        }
        return super.onStartCommand(intent, i, i2);
    }
}
