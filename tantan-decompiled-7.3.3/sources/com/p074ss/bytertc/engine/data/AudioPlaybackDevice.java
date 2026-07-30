package com.p074ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes11.dex */
public enum AudioPlaybackDevice {
    AUDIO_PLAYBACK_DEVICE_HEADSET(1),
    AUDIO_PLAYBACK_DEVICE_EARPIECE(2),
    AUDIO_PLAYBACK_DEVICE_SPEAKERPHONE(3),
    AUDIO_PLAYBACK_DEVICE_HEADSET_BLUETOOTH(4),
    AUDIO_PLAYBACK_DEVICE_HEADSET_USB(5);

    private int value;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.data.AudioPlaybackDevice$1 */
    public static /* synthetic */ class C135761 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$AudioPlaybackDevice;

        static {
            int[] iArr = new int[AudioPlaybackDevice.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$AudioPlaybackDevice = iArr;
            try {
                iArr[AudioPlaybackDevice.AUDIO_PLAYBACK_DEVICE_SPEAKERPHONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioPlaybackDevice[AudioPlaybackDevice.AUDIO_PLAYBACK_DEVICE_EARPIECE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioPlaybackDevice[AudioPlaybackDevice.AUDIO_PLAYBACK_DEVICE_HEADSET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioPlaybackDevice[AudioPlaybackDevice.AUDIO_PLAYBACK_DEVICE_HEADSET_BLUETOOTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioPlaybackDevice[AudioPlaybackDevice.AUDIO_PLAYBACK_DEVICE_HEADSET_USB.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    AudioPlaybackDevice(int i) {
        this.value = i;
    }

    @CalledByNative
    public static AudioPlaybackDevice fromId(int i) {
        for (AudioPlaybackDevice audioPlaybackDevice : values()) {
            if (audioPlaybackDevice.value() == i) {
                return audioPlaybackDevice;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = C135761.$SwitchMap$com$ss$bytertc$engine$data$AudioPlaybackDevice[ordinal()];
        if (i == 1) {
            return "kAudioPlaybackDeviceSpeakerphone";
        }
        if (i == 2) {
            return "kAudioPlaybackDeviceEarpiece";
        }
        if (i == 3) {
            return "kAudioPlaybackDeviceHeadset";
        }
        if (i != 4) {
            return i != 5 ? "" : "kAudioPlaybackDeviceHeadsetUSB";
        }
        return "kAudioPlaybackDeviceHeadsetBluetooth";
    }

    public int value() {
        return this.value;
    }
}
