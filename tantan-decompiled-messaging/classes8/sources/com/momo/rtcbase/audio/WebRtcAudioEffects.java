package com.momo.rtcbase.audio;

import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AudioEffect;
import android.media.audiofx.NoiseSuppressor;
import com.momo.rtcbase.Logging;
import java.util.UUID;
import l.y9g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
class WebRtcAudioEffects {
    private static final UUID AOSP_ACOUSTIC_ECHO_CANCELER = UUID.fromString("bb392ec0-8d4d-11e0-a896-0002a5d5c51b");
    private static final UUID AOSP_NOISE_SUPPRESSOR = UUID.fromString("c06c8400-8e06-11e0-9cb6-0002a5d5c51b");
    private static final boolean DEBUG = false;
    private static final String TAG = "WebRtcAudioEffectsExternal";
    private static AudioEffect.Descriptor[] cachedEffects;
    private AcousticEchoCanceler aec;

    /* JADX INFO: renamed from: ns */
    private NoiseSuppressor f253ns;
    private boolean shouldEnableAec;
    private boolean shouldEnableNs;

    public WebRtcAudioEffects() {
        Logging.m468d(TAG, "ctor" + WebRtcAudioUtils.getThreadInfo());
    }

    private static void assertTrue(boolean z) {
        if (z) {
            return;
        }
        y9g0.a("Expected condition to be true");
    }

    private boolean effectTypeIsVoIP(UUID uuid) {
        if (AudioEffect.EFFECT_TYPE_AEC.equals(uuid) && isAcousticEchoCancelerSupported()) {
            return true;
        }
        return AudioEffect.EFFECT_TYPE_NS.equals(uuid) && isNoiseSuppressorSupported();
    }

    private static AudioEffect.Descriptor[] getAvailableEffects() {
        AudioEffect.Descriptor[] descriptorArr = cachedEffects;
        if (descriptorArr != null) {
            return descriptorArr;
        }
        AudioEffect.Descriptor[] descriptorArrQueryEffects = AudioEffect.queryEffects();
        cachedEffects = descriptorArrQueryEffects;
        return descriptorArrQueryEffects;
    }

    public static boolean isAcousticEchoCancelerSupported() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_AEC, AOSP_ACOUSTIC_ECHO_CANCELER);
    }

    private static boolean isEffectTypeAvailable(UUID uuid, UUID uuid2) {
        AudioEffect.Descriptor[] availableEffects = getAvailableEffects();
        if (availableEffects == null) {
            return false;
        }
        for (AudioEffect.Descriptor descriptor : availableEffects) {
            if (descriptor.type.equals(uuid)) {
                return !descriptor.uuid.equals(uuid2);
            }
        }
        return false;
    }

    public static boolean isNoiseSuppressorSupported() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_NS, AOSP_NOISE_SUPPRESSOR);
    }

    public void enable(int i) {
        Logging.m468d(TAG, "enable(audioSession=" + i + ")");
        boolean z = false;
        assertTrue(this.aec == null);
        assertTrue(this.f253ns == null);
        if (isAcousticEchoCancelerSupported()) {
            AcousticEchoCanceler acousticEchoCancelerCreate = AcousticEchoCanceler.create(i);
            this.aec = acousticEchoCancelerCreate;
            if (acousticEchoCancelerCreate != null) {
                boolean enabled = acousticEchoCancelerCreate.getEnabled();
                boolean z2 = this.shouldEnableAec && isAcousticEchoCancelerSupported();
                if (this.aec.setEnabled(z2) != 0) {
                    Logging.m469e(TAG, "Failed to set the AcousticEchoCanceler state");
                }
                StringBuilder sb = new StringBuilder("AcousticEchoCanceler: was ");
                sb.append(enabled ? "enabled" : "disabled");
                sb.append(", enable: ");
                sb.append(z2);
                sb.append(", is now: ");
                sb.append(this.aec.getEnabled() ? "enabled" : "disabled");
                Logging.m468d(TAG, sb.toString());
            } else {
                Logging.m469e(TAG, "Failed to create the AcousticEchoCanceler instance");
            }
        }
        if (isNoiseSuppressorSupported()) {
            NoiseSuppressor noiseSuppressorCreate = NoiseSuppressor.create(i);
            this.f253ns = noiseSuppressorCreate;
            if (noiseSuppressorCreate == null) {
                Logging.m469e(TAG, "Failed to create the NoiseSuppressor instance");
                return;
            }
            boolean enabled2 = noiseSuppressorCreate.getEnabled();
            if (this.shouldEnableNs && isNoiseSuppressorSupported()) {
                z = true;
            }
            if (this.f253ns.setEnabled(z) != 0) {
                Logging.m469e(TAG, "Failed to set the NoiseSuppressor state");
            }
            StringBuilder sb2 = new StringBuilder("NoiseSuppressor: was ");
            sb2.append(enabled2 ? "enabled" : "disabled");
            sb2.append(", enable: ");
            sb2.append(z);
            sb2.append(", is now: ");
            sb2.append(this.f253ns.getEnabled() ? "enabled" : "disabled");
            Logging.m468d(TAG, sb2.toString());
        }
    }

    public void release() {
        Logging.m468d(TAG, "release");
        AcousticEchoCanceler acousticEchoCanceler = this.aec;
        if (acousticEchoCanceler != null) {
            acousticEchoCanceler.release();
            this.aec = null;
        }
        NoiseSuppressor noiseSuppressor = this.f253ns;
        if (noiseSuppressor != null) {
            noiseSuppressor.release();
            this.f253ns = null;
        }
    }

    public boolean setAEC(boolean z) {
        Logging.m468d(TAG, "setAEC(" + z + ")");
        if (!isAcousticEchoCancelerSupported()) {
            Logging.m472w(TAG, "Platform AEC is not supported");
            this.shouldEnableAec = false;
            return false;
        }
        if (this.aec == null || z == this.shouldEnableAec) {
            this.shouldEnableAec = z;
            return true;
        }
        Logging.m469e(TAG, "Platform AEC state can't be modified while recording");
        return false;
    }

    public boolean setNS(boolean z) {
        Logging.m468d(TAG, "setNS(" + z + ")");
        if (!isNoiseSuppressorSupported()) {
            Logging.m472w(TAG, "Platform NS is not supported");
            this.shouldEnableNs = false;
            return false;
        }
        if (this.f253ns == null || z == this.shouldEnableNs) {
            this.shouldEnableNs = z;
            return true;
        }
        Logging.m469e(TAG, "Platform NS state can't be modified while recording");
        return false;
    }
}
