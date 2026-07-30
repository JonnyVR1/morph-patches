package com.vivo.push.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.vivo.push.C14608e;
import com.vivo.push.model.UnvarnishedMessage;
import com.vivo.push.util.C14647p;
import com.vivo.push.util.C14651t;
import com.vivo.push.util.ContextDelegate;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BasePushMessageReceiver extends BroadcastReceiver implements PushMessageCallback {
    public static final String TAG = "PushMessageReceiver";

    @Override // com.vivo.push.sdk.PushMessageCallback
    public boolean isAllowNet(Context context) {
        if (context == null) {
            C14647p.m85008a(TAG, "isAllowNet sContext is null");
            return false;
        }
        String packageName = context.getPackageName();
        if (TextUtils.isEmpty(packageName)) {
            C14647p.m85008a(TAG, "isAllowNet pkgName is null");
            return false;
        }
        Intent intent = new Intent("com.vivo.pushservice.action.PUSH_SERVICE");
        intent.setPackage(packageName);
        List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 576);
        if (listQueryIntentServices != null && listQueryIntentServices.size() > 0) {
            return C14651t.m85030a(context, packageName);
        }
        C14647p.m85008a(TAG, "this is client sdk");
        return true;
    }

    @Override // com.vivo.push.sdk.PushMessageCallback
    public void onBind(Context context, int i, String str) {
    }

    @Override // com.vivo.push.sdk.PushMessageCallback
    public void onDelAlias(Context context, int i, List<String> list, List<String> list2, String str) {
    }

    @Override // com.vivo.push.sdk.PushMessageCallback
    public void onDelTags(Context context, int i, List<String> list, List<String> list2, String str) {
    }

    @Override // com.vivo.push.sdk.PushMessageCallback
    public void onListTags(Context context, int i, List<String> list, String str) {
    }

    @Override // com.vivo.push.sdk.PushMessageCallback
    public void onLog(Context context, String str, int i, boolean z) {
    }

    @Override // com.vivo.push.sdk.PushMessageCallback
    public void onPublish(Context context, int i, String str) {
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Context applicationContext = ContextDelegate.getContext(context).getApplicationContext();
        C14608e.m84861a().m84875a(applicationContext);
        C14647p.m85021d(TAG, "PushMessageReceiver " + applicationContext.getPackageName() + " ; requestId = " + intent.getStringExtra("req_id"));
        try {
            C14608e.m84861a().m84876a(intent, this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.vivo.push.sdk.PushMessageCallback
    public void onSetAlias(Context context, int i, List<String> list, List<String> list2, String str) {
    }

    @Override // com.vivo.push.sdk.PushMessageCallback
    public void onSetTags(Context context, int i, List<String> list, List<String> list2, String str) {
    }

    @Override // com.vivo.push.sdk.PushMessageCallback
    public void onTransmissionMessage(Context context, UnvarnishedMessage unvarnishedMessage) {
    }

    @Override // com.vivo.push.sdk.PushMessageCallback
    public void onUnBind(Context context, int i, String str) {
    }
}
