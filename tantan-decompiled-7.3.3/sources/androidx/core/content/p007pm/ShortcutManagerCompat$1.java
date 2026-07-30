package androidx.core.content.p007pm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;

/* JADX INFO: loaded from: classes.dex */
class ShortcutManagerCompat$1 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ IntentSender f1451a;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        try {
            this.f1451a.sendIntent(context, 0, null, null, null);
        } catch (IntentSender.SendIntentException unused) {
        }
    }
}
