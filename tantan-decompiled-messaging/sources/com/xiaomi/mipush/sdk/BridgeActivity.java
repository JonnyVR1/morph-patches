package com.xiaomi.mipush.sdk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import p149l.ilq0;

/* JADX INFO: loaded from: classes2.dex */
public class BridgeActivity extends Activity {
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.height = 1;
        attributes.width = 1;
        attributes.gravity = 51;
        window.setAttributes(attributes);
    }

    @Override // android.app.Activity
    public void onResume() {
        Intent intent;
        super.onResume();
        try {
            Intent intent2 = getIntent();
            if (intent2 != null && (intent = (Intent) intent2.getParcelableExtra("mipush_serviceIntent")) != null) {
                PushMessageHandler.m85289a(getApplicationContext(), intent);
            }
        } catch (Exception e) {
            ilq0.m137044q(e);
        } finally {
            finish();
        }
    }
}
