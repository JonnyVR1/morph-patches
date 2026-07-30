package com.p041mm.mmfile;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import p149l.ii5;

/* JADX INFO: loaded from: classes7.dex */
class UploaderHelper extends BroadcastReceiver {
    private static final String ACTION_PAUSE = "mmfile_uploader_pause";
    private static final String ACTION_RESUME = "mmfile_uploader_resume";
    private static BroadcastReceiver mReceiver;

    @SuppressLint({"StaticFieldLeak"})
    private static Context sContext;

    private static String getPauseAction(Context context) {
        return context.getPackageName() + ACTION_PAUSE;
    }

    private static String getResumeAction(Context context) {
        return context.getPackageName() + ACTION_RESUME;
    }

    private static boolean isExclude(String str, String... strArr) {
        if (str != null && strArr != null) {
            for (String str2 : strArr) {
                if (str.contains(str2)) {
                    Logger.m19640i("MMFile", str.concat(" is exclude"), new Object[0]);
                    return true;
                }
            }
        }
        return false;
    }

    public static void pauseUploadTask() {
        Context context = sContext;
        if (context == null) {
            return;
        }
        context.sendBroadcast(new Intent(getPauseAction(sContext)));
    }

    public static void registerReceiver(Context context) {
        if (mReceiver != null) {
            return;
        }
        mReceiver = new UploaderHelper();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(getResumeAction(context));
        intentFilter.addAction(getPauseAction(context));
        if (Build.VERSION.SDK_INT >= 34) {
            context.registerReceiver(mReceiver, intentFilter, 0);
        } else {
            ii5.m136342l(context, mReceiver, intentFilter);
        }
    }

    public static void resumeUploadTask() {
        Context context = sContext;
        if (context == null) {
            return;
        }
        context.sendBroadcast(new Intent(getResumeAction(sContext)));
    }

    public static void setPauseUploadTaskWhenExitApp(Context context, String... strArr) throws Throwable {
        if (mReceiver != null) {
            return;
        }
        String processNameInternal = MMFileUtil.getProcessNameInternal(context);
        if (isExclude(processNameInternal, strArr)) {
            return;
        }
        sContext = context.getApplicationContext();
        registerReceiver(context);
        if (processNameInternal == null || processNameInternal.contains(":")) {
            return;
        }
        new AppFrontBackHelper().register((Application) context.getApplicationContext(), new AppFrontBackHelper.OnAppStatusListener() { // from class: com.mm.mmfile.UploaderHelper.1
            @Override // com.mm.mmfile.AppFrontBackHelper.OnAppStatusListener
            public void onBack() {
                UploaderHelper.pauseUploadTask();
            }

            @Override // com.mm.mmfile.AppFrontBackHelper.OnAppStatusListener
            public void onFront() {
                UploaderHelper.resumeUploadTask();
            }
        });
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (getResumeAction(context).equals(action)) {
            MMFileUploader.get().setPause(false);
        } else if (getPauseAction(context).equals(action)) {
            MMFileUploader.get().setPause(true);
        }
    }
}
