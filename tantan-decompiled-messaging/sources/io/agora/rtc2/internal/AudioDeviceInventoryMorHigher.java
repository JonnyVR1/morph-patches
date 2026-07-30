package io.agora.rtc2.internal;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import androidx.annotation.RequiresApi;
import io.agora.utils2.internal.Logging;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(api = 23)
public class AudioDeviceInventoryMorHigher implements AudioRoutingController.AudioDeviceInventory {
    private static final HashMap<Integer, Integer> DEVICE_TYPE_TO_ROUTE;
    private static final String TAG = "AudioRoute";
    private AudioManager mAm;
    private AudioRoutingController.AudioDeviceChangedCallback mAudioDeviceChangedCb = null;
    private AudioDeviceCallbackImpl mDevCb;

    public class AudioDeviceCallbackImpl extends AudioDeviceCallback {
        public AudioDeviceCallbackImpl() {
            Logging.m87222i(AudioDeviceInventoryMorHigher.TAG, "AudioDeviceCallbackImpl ctor!");
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            AudioDeviceInventoryMorHigher.this.processDevicesChanged(audioDeviceInfoArr, true);
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            AudioDeviceInventoryMorHigher.this.processDevicesChanged(audioDeviceInfoArr, false);
        }
    }

    static {
        HashMap<Integer, Integer> map = new HashMap<>();
        DEVICE_TYPE_TO_ROUTE = map;
        map.put(1, 1);
        map.put(2, 3);
        map.put(3, 0);
        map.put(4, 2);
        map.put(7, 5);
        map.put(11, 0);
        map.put(22, 0);
        map.put(9, 7);
    }

    public AudioDeviceInventoryMorHigher(Context context) {
        this.mAm = (AudioManager) context.getSystemService("audio");
    }

    private void onAudioDeviceChanged(int i, boolean z) {
        AudioRoutingController.AudioDeviceChangedCallback audioDeviceChangedCallback = this.mAudioDeviceChangedCb;
        if (audioDeviceChangedCallback != null) {
            audioDeviceChangedCallback.onAudioDeviceChanged(z, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processDevicesChanged(AudioDeviceInfo[] audioDeviceInfoArr, boolean z) {
        String str;
        for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
            boolean zIsSource = audioDeviceInfo.isSource();
            int type = audioDeviceInfo.getType();
            if (type == 8) {
                str = "Not process a2dp out yet!";
            } else {
                if (!zIsSource) {
                    HashMap<Integer, Integer> map = DEVICE_TYPE_TO_ROUTE;
                    if (map.containsKey(Integer.valueOf(audioDeviceInfo.getType()))) {
                        int iIntValue = map.get(Integer.valueOf(type)).intValue();
                        onAudioDeviceChanged(iIntValue, z);
                        str = "Process device event, route: " + iIntValue + " connect: " + z;
                    }
                }
                Logging.m87216d(TAG, "Not process device type: " + type + " connect: " + z);
            }
            Logging.m87222i(TAG, str);
        }
    }

    @Override // io.agora.rtc2.internal.AudioRoutingController.AudioDeviceInventory
    public void dispose() {
        this.mAm.unregisterAudioDeviceCallback(this.mDevCb);
    }

    @Override // io.agora.rtc2.internal.AudioRoutingController.AudioDeviceInventory
    public void initialize() {
        AudioDeviceCallbackImpl audioDeviceCallbackImpl = new AudioDeviceCallbackImpl();
        this.mDevCb = audioDeviceCallbackImpl;
        this.mAm.registerAudioDeviceCallback(audioDeviceCallbackImpl, null);
    }

    @Override // io.agora.rtc2.internal.AudioRoutingController.AudioDeviceInventory
    public boolean isDeviceAvaliable(int i) {
        for (AudioDeviceInfo audioDeviceInfo : this.mAm.getDevices(2)) {
            int type = audioDeviceInfo.getType();
            HashMap<Integer, Integer> map = DEVICE_TYPE_TO_ROUTE;
            if (map.containsKey(Integer.valueOf(type)) && map.get(Integer.valueOf(type)).intValue() == i) {
                return true;
            }
        }
        return false;
    }

    @Override // io.agora.rtc2.internal.AudioRoutingController.AudioDeviceInventory
    public void setAudioDeviceChangeCallback(AudioRoutingController.AudioDeviceChangedCallback audioDeviceChangedCallback) {
        this.mAudioDeviceChangedCb = audioDeviceChangedCallback;
    }
}
