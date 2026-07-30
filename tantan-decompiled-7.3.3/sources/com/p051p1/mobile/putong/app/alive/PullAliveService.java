package com.p051p1.mobile.putong.app.alive;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.data.ThirdParty;
import com.tantanapp.common.utils.NullChecker;
import p153l.i4g0;
import p153l.jyb;

/* JADX INFO: loaded from: classes9.dex */
public class PullAliveService extends Service {
    @Override // android.app.Service
    @Nullable
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        if (NullChecker.m82487b(intent)) {
            String stringExtra = intent.getStringExtra("extra.from_packagename");
            if (TextUtils.isEmpty(stringExtra)) {
                stringExtra = intent.getStringExtra("source");
            }
            if (TextUtils.isEmpty(stringExtra)) {
                stringExtra = "";
            }
            i4g0.m138495D("e_backend_application_create_thirdparty", "", jyb.m147494Y(ThirdParty.TYPE, stringExtra));
        }
        return super.onStartCommand(intent, i, i2);
    }
}
