package com.p046p1.mobile.putong.app.alive;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.data.ThirdParty;
import com.tantanapp.common.utils.NullChecker;
import p149l.vwb;
import p149l.zvf0;

/* JADX INFO: loaded from: classes9.dex */
public class PullAliveService extends Service {
    @Override // android.app.Service
    @Nullable
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        if (NullChecker.m81304b(intent)) {
            String stringExtra = intent.getStringExtra("extra.from_packagename");
            if (TextUtils.isEmpty(stringExtra)) {
                stringExtra = intent.getStringExtra("source");
            }
            if (TextUtils.isEmpty(stringExtra)) {
                stringExtra = "";
            }
            zvf0.m220371D("e_backend_application_create_thirdparty", "", vwb.m200311Y(ThirdParty.TYPE, stringExtra));
        }
        return super.onStartCommand(intent, i, i2);
    }
}
