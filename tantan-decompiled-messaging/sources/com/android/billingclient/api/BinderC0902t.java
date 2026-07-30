package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import com.google.android.gms.internal.play_billing.C2403p;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;
import p149l.okr0;
import p149l.yds0;

/* JADX INFO: renamed from: com.android.billingclient.api.t */
/* JADX INFO: loaded from: classes.dex */
final class BinderC0902t extends okr0 {

    /* JADX INFO: renamed from: a */
    final WeakReference f4112a;

    /* JADX INFO: renamed from: b */
    final ResultReceiver f4113b;

    public /* synthetic */ BinderC0902t(WeakReference weakReference, ResultReceiver resultReceiver, yds0 yds0Var) {
        this.f4112a = weakReference;
        this.f4113b = resultReceiver;
    }

    @Override // p149l.wlr0
    public final void zza(Bundle bundle) throws RemoteException {
        ResultReceiver resultReceiver = this.f4113b;
        if (resultReceiver == null) {
            C2403p.m14920k("BillingClient", "Unable to send result for in-app messaging");
            return;
        }
        if (bundle == null) {
            resultReceiver.send(0, null);
            return;
        }
        Activity activity = (Activity) this.f4112a.get();
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("KEY_LAUNCH_INTENT");
        if (activity == null || pendingIntent == null) {
            this.f4113b.send(0, null);
            C2403p.m14920k("BillingClient", "Unable to launch intent for in-app messaging");
            return;
        }
        try {
            Intent intent = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
            intent.putExtra("in_app_message_result_receiver", this.f4113b);
            intent.putExtra("IN_APP_MESSAGE_INTENT", pendingIntent);
            activity.startActivity(intent);
        } catch (CancellationException e) {
            this.f4113b.send(0, null);
            C2403p.m14921l("BillingClient", "Exception caught while launching intent for in-app messaging.", e);
        }
    }
}
