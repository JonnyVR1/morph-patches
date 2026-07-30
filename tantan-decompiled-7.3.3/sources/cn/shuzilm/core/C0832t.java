package cn.shuzilm.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: cn.shuzilm.core.t */
/* JADX INFO: loaded from: classes.dex */
class C0832t extends BroadcastReceiver {
    private C0832t() {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            if (intent.getAction() == null) {
                return;
            }
            DUHelper.aXZlZWNl(context, intent);
        } catch (Exception unused) {
        }
    }

    public /* synthetic */ C0832t(RunnableC0823k runnableC0823k) {
        this();
    }
}
