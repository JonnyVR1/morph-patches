package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import com.google.android.datatransport.runtime.util.PriorityMapping;

/* JADX INFO: loaded from: classes6.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m9360a() {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        TransportRuntime.initialize(context);
        TransportContext.Builder priority = TransportContext.builder().setBackendName(queryParameter).setPriority(PriorityMapping.valueOf(iIntValue));
        if (queryParameter2 != null) {
            priority.setExtras(Base64.decode(queryParameter2, 0));
        }
        TransportRuntime.getInstance().getUploader().upload(priority.build(), i, new Runnable() { // from class: l.fh0
            @Override // java.lang.Runnable
            public final void run() {
                AlarmManagerSchedulerBroadcastReceiver.m9360a();
            }
        });
    }
}
