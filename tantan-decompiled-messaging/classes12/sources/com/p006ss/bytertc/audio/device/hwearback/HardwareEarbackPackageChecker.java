package com.p006ss.bytertc.audio.device.hwearback;

import com.bytedance.realx.base.ContextUtils;
import com.hihonor.android.magicx.media.audio.interfaces.HnAudioClient;
import com.hihonor.android.magicx.media.audio.interfaces.IAudioServiceCallback;
import com.huawei.multimedia.audiokit.interfaces.HwAudioKit;
import com.huawei.multimedia.audiokit.interfaces.IAudioKitCallback;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class HardwareEarbackPackageChecker {
    public static boolean isHnEarbackPackageSupported() {
        boolean zIsDeviceSupported;
        HnAudioClient hnAudioClient = null;
        try {
            zIsDeviceSupported = HnAudioClient.isDeviceSupported(ContextUtils.getApplicationContext());
            if (zIsDeviceSupported) {
                try {
                    hnAudioClient = new HnAudioClient(ContextUtils.getApplicationContext(), (IAudioServiceCallback) null);
                } catch (NoClassDefFoundError unused) {
                }
            }
        } catch (NoClassDefFoundError unused2) {
            zIsDeviceSupported = false;
        }
        return zIsDeviceSupported && hnAudioClient != null;
    }

    public static boolean isHwEarbackPackageSupported() {
        HwAudioKit hwAudioKit = null;
        try {
            hwAudioKit = new HwAudioKit(ContextUtils.getApplicationContext(), (IAudioKitCallback) null);
        } catch (NoClassDefFoundError unused) {
        }
        return hwAudioKit != null;
    }
}
