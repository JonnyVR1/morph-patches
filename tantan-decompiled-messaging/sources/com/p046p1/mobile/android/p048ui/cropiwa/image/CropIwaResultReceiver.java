package com.p046p1.mobile.android.p048ui.cropiwa.image;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import p149l.du2;
import p149l.ii5;

/* JADX INFO: loaded from: classes8.dex */
public class CropIwaResultReceiver extends BroadcastReceiver {
    private static final String ACTION_CROP_COMPLETED = "cropIwa_action_crop_completed";
    private static final String EXTRA_ERROR = "extra_error";
    private static final String EXTRA_INVALID = "extra_invalid";
    private static final String EXTRA_URI = "extra_uri";
    public static final String TAG = "CropIwaResultReceiver";
    private InterfaceC4368a listener;
    private boolean registered = false;

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.cropiwa.image.CropIwaResultReceiver$a */
    public interface InterfaceC4368a {
        /* JADX INFO: renamed from: a */
        void mo21046a();

        /* JADX INFO: renamed from: b */
        void mo21047b(Uri uri);

        /* JADX INFO: renamed from: c */
        void mo21048c(Throwable th);
    }

    public static void onCropCompleted(Context context, Uri uri) {
        du2.m113670a(TAG, "CropIwaResultReceiver-onCropCompleted");
        Intent intent = new Intent(ACTION_CROP_COMPLETED);
        intent.putExtra(EXTRA_URI, uri);
        context.sendBroadcast(intent);
    }

    public static void onCropFailed(Context context, Throwable th) {
        du2.m113670a(TAG, "CropIwaResultReceiver-onCropFailed");
        Intent intent = new Intent(ACTION_CROP_COMPLETED);
        intent.putExtra(EXTRA_ERROR, th);
        context.sendBroadcast(intent);
    }

    public static void onCropInvalid(Context context) {
        du2.m113670a(TAG, "CropIwaResultReceiver-onCropInvalid");
        Intent intent = new Intent(ACTION_CROP_COMPLETED);
        intent.putExtra(EXTRA_INVALID, "");
        context.sendBroadcast(intent);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        du2.m113670a(TAG, "CropIwaResultReceiver-onReceive");
        Bundle extras = intent.getExtras();
        if (this.listener != null) {
            if (extras.containsKey(EXTRA_INVALID)) {
                du2.m113670a(TAG, "CropIwaResultReceiver-EXTRA_INVALID");
                this.listener.mo21046a();
            } else if (extras.containsKey(EXTRA_ERROR)) {
                du2.m113670a(TAG, "CropIwaResultReceiver-EXTRA_ERROR");
                this.listener.mo21048c((Throwable) extras.getSerializable(EXTRA_ERROR));
            } else if (extras.containsKey(EXTRA_URI)) {
                du2.m113670a(TAG, "CropIwaResultReceiver-EXTRA_URI");
                this.listener.mo21047b((Uri) extras.getParcelable(EXTRA_URI));
            }
        }
    }

    public void register(Context context) {
        du2.m113670a(TAG, "CropIwaResultReceiver-register()");
        if (this.registered) {
            return;
        }
        this.registered = true;
        ii5.m136342l(context, this, new IntentFilter(ACTION_CROP_COMPLETED));
        du2.m113670a(TAG, "CropIwaResultReceiver-registerReceiver");
    }

    public void setListener(InterfaceC4368a interfaceC4368a) {
        this.listener = interfaceC4368a;
    }

    public void unregister(Context context) {
        du2.m113670a(TAG, "CropIwaResultReceiver-unregister()");
        if (this.registered) {
            this.registered = false;
            context.unregisterReceiver(this);
            du2.m113670a(TAG, "CropIwaResultReceiver-unregisterReceiver");
        }
    }
}
