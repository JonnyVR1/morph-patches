package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p153l.xe20;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0014J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0014¨\u0006\u0010"}, m88121d2 = {"Lcom/facebook/FacebookBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "onFailedAppCall", "", "appCallId", "", "action", "extras", "Landroid/os/Bundle;", "onReceive", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "onSuccessfulAppCall", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public class FacebookBroadcastReceiver extends BroadcastReceiver {
    public void onFailedAppCall(@NotNull String appCallId, @NotNull String action, @NotNull Bundle extras) {
        appCallId.getClass();
        action.getClass();
        extras.getClass();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @NotNull Intent intent) {
        context.getClass();
        intent.getClass();
        String stringExtra = intent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
        String stringExtra2 = intent.getStringExtra("com.facebook.platform.protocol.PROTOCOL_ACTION");
        Bundle extras = intent.getExtras();
        if (stringExtra == null || stringExtra2 == null || extras == null) {
            return;
        }
        if (xe20.m210532x(intent)) {
            onFailedAppCall(stringExtra, stringExtra2, extras);
        } else {
            onSuccessfulAppCall(stringExtra, stringExtra2, extras);
        }
    }

    public void onSuccessfulAppCall(@NotNull String appCallId, @NotNull String action, @NotNull Bundle extras) {
        appCallId.getClass();
        action.getClass();
        extras.getClass();
    }
}
