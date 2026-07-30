package com.hellogroup.p036mk.business.service;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.hellogroup.common.thread.C3486c;
import java.util.Iterator;
import java.util.List;
import p153l.jzv;

/* JADX INFO: loaded from: classes7.dex */
@SuppressLint({"MDLogUse"})
public class MKPrepareService extends Service {
    private static final String TAG = "MKPrepareService";
    private static List<Runnable> extraRunnableList;
    private boolean isRunning = false;

    /* JADX INFO: renamed from: com.hellogroup.mk.business.service.MKPrepareService$a */
    public class RunnableC3536a implements Runnable {
        public RunnableC3536a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MKPrepareService.extraRunnableList != null) {
                Iterator it = MKPrepareService.extraRunnableList.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                List unused = MKPrepareService.extraRunnableList = null;
            }
            MKPrepareService.this.onPrepareFinished();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onPrepareFinished() {
        this.isRunning = false;
        stopSelf();
    }

    public static void prepare(@NonNull Context context, List<Runnable> list) {
        extraRunnableList = list;
        try {
            Intent intent = new Intent("com.immomo.momo.prepare_mk");
            intent.setPackage(context.getPackageName());
            context.startService(intent);
        } catch (Exception e) {
            jzv.m147730c(TAG, "", e);
        }
    }

    private void startPrepare() {
        if (this.isRunning) {
            onPrepareFinished();
        } else {
            this.isRunning = true;
            C3486c.m17566d(1, new RunnableC3536a());
        }
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        startPrepare();
        return 2;
    }
}
