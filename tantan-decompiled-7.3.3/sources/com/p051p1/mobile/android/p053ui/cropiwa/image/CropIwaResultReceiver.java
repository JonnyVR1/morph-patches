package com.p051p1.mobile.android.p053ui.cropiwa.image;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import p153l.jj5;
import p153l.tu2;

/* JADX INFO: loaded from: classes8.dex */
public class CropIwaResultReceiver extends BroadcastReceiver {
    private static final String ACTION_CROP_COMPLETED = "cropIwa_action_crop_completed";
    private static final String EXTRA_ERROR = "extra_error";
    private static final String EXTRA_INVALID = "extra_invalid";
    private static final String EXTRA_URI = "extra_uri";
    public static final String TAG = "CropIwaResultReceiver";
    private InterfaceC4519a listener;
    private boolean registered = false;

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.cropiwa.image.CropIwaResultReceiver$a */
    public interface InterfaceC4519a {
        /* JADX INFO: renamed from: a */
        void mo22045a();

        /* JADX INFO: renamed from: b */
        void mo22046b(Uri uri);

        /* JADX INFO: renamed from: c */
        void mo22047c(Throwable th);
    }

    public static void onCropCompleted(Context context, Uri uri) {
        tu2.m192703a(TAG, "CropIwaResultReceiver-onCropCompleted");
        Intent intent = new Intent(ACTION_CROP_COMPLETED);
        intent.putExtra(EXTRA_URI, uri);
        context.sendBroadcast(intent);
    }

    public static void onCropFailed(Context context, Throwable th) {
        tu2.m192703a(TAG, "CropIwaResultReceiver-onCropFailed");
        Intent intent = new Intent(ACTION_CROP_COMPLETED);
        intent.putExtra(EXTRA_ERROR, th);
        context.sendBroadcast(intent);
    }

    public static void onCropInvalid(Context context) {
        tu2.m192703a(TAG, "CropIwaResultReceiver-onCropInvalid");
        Intent intent = new Intent(ACTION_CROP_COMPLETED);
        intent.putExtra(EXTRA_INVALID, "");
        context.sendBroadcast(intent);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        tu2.m192703a(TAG, "CropIwaResultReceiver-onReceive");
        Bundle extras = intent.getExtras();
        if (this.listener != null) {
            if (extras.containsKey(EXTRA_INVALID)) {
                tu2.m192703a(TAG, "CropIwaResultReceiver-EXTRA_INVALID");
                this.listener.mo22045a();
            } else if (extras.containsKey(EXTRA_ERROR)) {
                tu2.m192703a(TAG, "CropIwaResultReceiver-EXTRA_ERROR");
                this.listener.mo22047c((Throwable) extras.getSerializable(EXTRA_ERROR));
            } else if (extras.containsKey(EXTRA_URI)) {
                tu2.m192703a(TAG, "CropIwaResultReceiver-EXTRA_URI");
                this.listener.mo22046b((Uri) extras.getParcelable(EXTRA_URI));
            }
        }
    }

    public void register(Context context) {
        tu2.m192703a(TAG, "CropIwaResultReceiver-register()");
        if (this.registered) {
            return;
        }
        this.registered = true;
        jj5.m145018l(context, this, new IntentFilter(ACTION_CROP_COMPLETED));
        tu2.m192703a(TAG, "CropIwaResultReceiver-registerReceiver");
    }

    public void setListener(InterfaceC4519a interfaceC4519a) {
        this.listener = interfaceC4519a;
    }

    public void unregister(Context context) {
        tu2.m192703a(TAG, "CropIwaResultReceiver-unregister()");
        if (this.registered) {
            this.registered = false;
            context.unregisterReceiver(this);
            tu2.m192703a(TAG, "CropIwaResultReceiver-unregisterReceiver");
        }
    }
}
