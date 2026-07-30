package com.p074ss.bytertc.audio.device.webrtc.observer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.bytedance.realx.base.ContextUtils;
import p153l.jj5;

/* JADX INFO: loaded from: classes11.dex */
public class VolumeChangedObserver {
    private static final String EXTRA_VOLUME_STREAM_TYPE = "android.media.EXTRA_VOLUME_STREAM_TYPE";
    private static final String EXTRA_VOLUME_STREAM_VALUE = "android.media.EXTRA_VOLUME_STREAM_VALUE";
    private static final int STREAM_BLUETOOTH_SCO = 6;
    private static final String TAG = "VolumeChangedObserver";
    private static final String VOLUME_CHANGED_ACTION = "android.media.VOLUME_CHANGED_ACTION";
    private VolumeBroadcastReceiver mVolumeBroadcastReceiver;
    private OnVolumeChangedListener onVolumeChangedListener;

    public interface OnVolumeChangedListener {
        void onVolumeChanged(int i, int i2);
    }

    public class VolumeBroadcastReceiver extends BroadcastReceiver {
        public VolumeBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            VolumeChangedObserver volumeChangedObserver = VolumeChangedObserver.this;
            if (volumeChangedObserver.onVolumeChangedListener != null && VolumeChangedObserver.VOLUME_CHANGED_ACTION.equals(intent.getAction())) {
                try {
                    int intExtra = intent.getIntExtra(VolumeChangedObserver.EXTRA_VOLUME_STREAM_TYPE, -1);
                    if (intExtra == 3 || intExtra == 0 || intExtra == 6) {
                        volumeChangedObserver.onVolumeChangedListener.onVolumeChanged(intExtra, intent.getIntExtra(VolumeChangedObserver.EXTRA_VOLUME_STREAM_VALUE, -1));
                    }
                } catch (Exception e) {
                    Log.e(VolumeChangedObserver.TAG, "getIntExtra failed. key: EXTRA_VOLUME_STREAM_TYPE, msg: " + e.getMessage());
                }
            }
        }
    }

    public VolumeChangedObserver(OnVolumeChangedListener onVolumeChangedListener) {
        this.onVolumeChangedListener = onVolumeChangedListener;
        registerVolumeChangeAction();
    }

    private void registerVolumeChangeAction() {
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null) {
            Log.e(TAG, "context is null. unable to register broadcast receiver.");
            return;
        }
        this.mVolumeBroadcastReceiver = new VolumeBroadcastReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(VOLUME_CHANGED_ACTION);
        jj5.m145018l(applicationContext, this.mVolumeBroadcastReceiver, intentFilter);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void unregisterReceiver() {
        try {
            Context applicationContext = ContextUtils.getApplicationContext();
            VolumeBroadcastReceiver volumeBroadcastReceiver = this.mVolumeBroadcastReceiver;
            if (volumeBroadcastReceiver != null) {
                applicationContext.unregisterReceiver(volumeBroadcastReceiver);
                this.mVolumeBroadcastReceiver = null;
            }
        } catch (Exception e) {
            Log.e(TAG, "unregisterReceiver failed. msg: " + e.getMessage());
        } finally {
            if (this.onVolumeChangedListener != null) {
                this.onVolumeChangedListener = null;
            }
            this.mVolumeBroadcastReceiver = null;
        }
    }

    public void release() {
        unregisterReceiver();
        this.onVolumeChangedListener = null;
    }
}
