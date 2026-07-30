package com.tantanapp.beatles.safety.component;

import android.app.IntentService;
import android.content.Intent;
import androidx.annotation.Nullable;
import com.tantanapp.beatles.safety.core.AbsSafetyPolicy;
import p153l.dud;

/* JADX INFO: loaded from: classes11.dex */
public class SafetyTaskServiceProxy extends IntentService {
    public SafetyTaskServiceProxy() {
        super("RemoteService");
    }

    @Override // android.app.IntentService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        dud.m118130d();
    }

    @Override // android.app.IntentService
    public void onHandleIntent(@Nullable Intent intent) {
        dud.m118129c();
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
