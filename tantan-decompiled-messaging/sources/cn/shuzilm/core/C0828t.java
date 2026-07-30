package cn.shuzilm.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: cn.shuzilm.core.t */
/* JADX INFO: loaded from: classes.dex */
class C0828t extends BroadcastReceiver {
    private C0828t() {
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

    public /* synthetic */ C0828t(RunnableC0819k runnableC0819k) {
        this();
    }
}
