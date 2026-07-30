package com.vivo.push.sdk.service;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.material.badge.BadgeDrawable;
import com.vivo.push.util.C14647p;
import com.vivo.push.util.C14657z;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class LinkProxyActivity extends Activity {
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        PackageManager packageManager;
        List<ResolveInfo> listQueryIntentServices;
        ResolveInfo resolveInfo;
        ServiceInfo serviceInfo;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null) {
            C14647p.m85021d("LinkProxyActivity", "enter RequestPermissionsActivity onCreate, intent is null, finish");
            finish();
            return;
        }
        boolean z = true;
        try {
            Window window = getWindow();
            window.setGravity(BadgeDrawable.TOP_START);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.x = 0;
            attributes.y = 0;
            attributes.height = 1;
            attributes.width = 1;
            window.setAttributes(attributes);
        } catch (Throwable th) {
            C14647p.m85016b("LinkProxyActivity", "enter onCreate error ", th);
        }
        String packageName = getPackageName();
        C14647p.m85021d("LinkProxyActivity", hashCode() + " enter onCreate " + packageName);
        if ("com.vivo.abe".equals(packageName)) {
            try {
                if (intent.getExtras() == null) {
                    C14647p.m85021d("LinkProxyActivity", "adapterToService getExtras() is null");
                } else {
                    Intent intent2 = (Intent) intent.getExtras().get("previous_intent");
                    if (intent2 == null) {
                        C14647p.m85021d("LinkProxyActivity", "adapterToService proxyIntent is null");
                    } else {
                        C14657z.m85057a(this, intent2);
                    }
                }
            } catch (Exception e) {
                C14647p.m85009a("LinkProxyActivity", e.toString(), e);
            }
        } else {
            try {
                if (intent.getExtras() != null) {
                    Intent intent3 = (Intent) intent.getExtras().get("previous_intent");
                    if (intent3 == null || (packageManager = getPackageManager()) == null || (listQueryIntentServices = packageManager.queryIntentServices(intent3, 576)) == null || listQueryIntentServices.isEmpty() || (resolveInfo = listQueryIntentServices.get(0)) == null || (serviceInfo = resolveInfo.serviceInfo) == null || !serviceInfo.exported) {
                        z = false;
                    }
                    if (z) {
                        startService(intent3);
                    } else {
                        C14647p.m85015b("LinkProxyActivity", "service's exported is ".concat(String.valueOf(z)));
                    }
                }
            } catch (Exception e2) {
                C14647p.m85009a("LinkProxyActivity", e2.toString(), e2);
            }
        }
        finish();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C14647p.m85021d("LinkProxyActivity", hashCode() + " onDestory " + getPackageName());
    }
}
