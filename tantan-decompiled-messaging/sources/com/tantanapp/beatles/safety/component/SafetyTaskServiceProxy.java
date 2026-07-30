package com.tantanapp.beatles.safety.component;

import android.app.IntentService;
import android.content.Intent;
import androidx.annotation.Nullable;
import com.tantanapp.beatles.safety.core.AbsSafetyPolicy;
import p149l.psd;

/* JADX INFO: loaded from: classes13.dex */
public class SafetyTaskServiceProxy extends IntentService {
    public SafetyTaskServiceProxy() {
        super("RemoteService");
    }

    @Override // android.app.IntentService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        psd.m171133d();
    }

    @Override // android.app.IntentService
    public void onHandleIntent(@Nullable Intent intent) {
        psd.m171132c();
        if (intent == null) {
            stopSelf();
            return;
        }
        AbsSafetyPolicy absSafetyPolicy = (AbsSafetyPolicy) intent.getSerializableExtra("policy");
        if (absSafetyPolicy != null) {
            absSafetyPolicy.process(null, this);
        }
        stopSelf();
    }
}
