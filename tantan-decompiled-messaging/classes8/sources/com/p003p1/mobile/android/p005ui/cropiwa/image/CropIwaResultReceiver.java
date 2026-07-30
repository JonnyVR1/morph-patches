package com.p003p1.mobile.android.p005ui.cropiwa.image;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import l.du2;
import l.ii5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class CropIwaResultReceiver extends BroadcastReceiver {
    private static final String ACTION_CROP_COMPLETED = "cropIwa_action_crop_completed";
    private static final String EXTRA_ERROR = "extra_error";
    private static final String EXTRA_INVALID = "extra_invalid";
    private static final String EXTRA_URI = "extra_uri";
    public static final String TAG = "CropIwaResultReceiver";
    private InterfaceC0280a listener;
    private boolean registered = false;

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.cropiwa.image.CropIwaResultReceiver$a */
    public interface InterfaceC0280a {
        /* JADX INFO: renamed from: a */
        void mo1318a();

        /* JADX INFO: renamed from: b */
        void mo1319b(Uri uri);

        /* JADX INFO: renamed from: c */
        void mo1320c(Throwable th);
    }

    public static void onCropCompleted(Context context, Uri uri) {
        du2.a(TAG, "CropIwaResultReceiver-onCropCompleted");
        Intent intent = new Intent(ACTION_CROP_COMPLETED);
        intent.putExtra(EXTRA_URI, uri);
        context.sendBroadcast(intent);
    }

    public static void onCropFailed(Context context, Throwable th) {
        du2.a(TAG, "CropIwaResultReceiver-onCropFailed");
        Intent intent = new Intent(ACTION_CROP_COMPLETED);
        intent.putExtra(EXTRA_ERROR, th);
        context.sendBroadcast(intent);
    }

    public static void onCropInvalid(Context context) {
        du2.a(TAG, "CropIwaResultReceiver-onCropInvalid");
        Intent intent = new Intent(ACTION_CROP_COMPLETED);
        intent.putExtra(EXTRA_INVALID, "");
        context.sendBroadcast(intent);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        du2.a(TAG, "CropIwaResultReceiver-onReceive");
        Bundle extras = intent.getExtras();
        if (this.listener != null) {
            if (extras.containsKey(EXTRA_INVALID)) {
                du2.a(TAG, "CropIwaResultReceiver-EXTRA_INVALID");
                this.listener.mo1318a();
            } else if (extras.containsKey(EXTRA_ERROR)) {
                du2.a(TAG, "CropIwaResultReceiver-EXTRA_ERROR");
                this.listener.mo1320c((Throwable) extras.getSerializable(EXTRA_ERROR));
            } else if (extras.containsKey(EXTRA_URI)) {
                du2.a(TAG, "CropIwaResultReceiver-EXTRA_URI");
                this.listener.mo1319b((Uri) extras.getParcelable(EXTRA_URI));
            }
        }
    }

    public void register(Context context) {
        du2.a(TAG, "CropIwaResultReceiver-register()");
        if (this.registered) {
            return;
        }
        this.registered = true;
        ii5.l(context, this, new IntentFilter(ACTION_CROP_COMPLETED));
        du2.a(TAG, "CropIwaResultReceiver-registerReceiver");
    }

    public void setListener(InterfaceC0280a interfaceC0280a) {
        this.listener = interfaceC0280a;
    }

    public void unregister(Context context) {
        du2.a(TAG, "CropIwaResultReceiver-unregister()");
        if (this.registered) {
            this.registered = false;
            context.unregisterReceiver(this);
            du2.a(TAG, "CropIwaResultReceiver-unregisterReceiver");
        }
    }
}
