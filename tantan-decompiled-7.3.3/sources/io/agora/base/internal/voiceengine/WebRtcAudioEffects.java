package io.agora.base.internal.voiceengine;

import android.annotation.TargetApi;
import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AudioEffect;
import android.media.audiofx.AutomaticGainControl;
import android.media.audiofx.NoiseSuppressor;
import android.os.Build;
import androidx.annotation.Nullable;
import io.agora.base.internal.Logging;
import java.util.List;
import java.util.UUID;
import p153l.gig0;

/* JADX INFO: loaded from: classes2.dex */
public class WebRtcAudioEffects {
    private static final boolean DEBUG = false;
    private static final String TAG = "WebRtcAudioEffects";
    private static final UUID AOSP_ACOUSTIC_ECHO_CANCELER = UUID.fromString("bb392ec0-8d4d-11e0-a896-0002a5d5c51b");
    private static final UUID AOSP_NOISE_SUPPRESSOR = UUID.fromString("c06c8400-8e06-11e0-9cb6-0002a5d5c51b");
    private static final UUID AOSP_AUTOMATIC_GAIN_CONTROL = UUID.fromString("aa8130e0-66fc-11e0-bad0-0002a5d5c51b");

    @Nullable
    private static AudioEffect.Descriptor[] cachedEffects = null;

    @Nullable
    private AcousticEchoCanceler aec = null;

    /* JADX INFO: renamed from: ns */
    @Nullable
    private NoiseSuppressor f64018ns = null;

    @Nullable
    private AutomaticGainControl agc = null;
    private boolean shouldEnableAec = false;
    private boolean shouldEnableNs = false;
    private boolean shouldEnableAgc = false;

    private WebRtcAudioEffects() {
        Logging.m88097d(TAG, "ctor" + WebRtcAudioUtils.getThreadInfo());
    }

    private static void assertTrue(boolean z) {
        if (z) {
            return;
        }
        gig0.m130323a("Expected condition to be true");
    }

    public static boolean canUseAcousticEchoCanceler() {
        boolean z = (!isAcousticEchoCancelerSupported() || WebRtcAudioUtils.useWebRtcBasedAcousticEchoCanceler() || isAcousticEchoCancelerBlacklisted() || isAcousticEchoCancelerExcludedByUUID()) ? false : true;
        Logging.m88097d(TAG, "canUseAcousticEchoCanceler: " + z);
        return z;
    }

    public static boolean canUseAutomaticGainControl() {
        boolean z = (!isAutomaticGainControlSupported() || WebRtcAudioUtils.useWebRtcBasedAutomaticGainControl() || isAutomaticGainControlBlacklisted() || isAutomaticGainControlExcludedByUUID()) ? false : true;
        Logging.m88097d(TAG, "canUseAutomaticGainControl: " + z);
        return z;
    }

    public static boolean canUseNoiseSuppressor() {
        boolean z = (!isNoiseSuppressorSupported() || WebRtcAudioUtils.useWebRtcBasedNoiseSuppressor() || isNoiseSuppressorBlacklisted() || isNoiseSuppressorExcludedByUUID()) ? false : true;
        Logging.m88097d(TAG, "canUseNoiseSuppressor: " + z);
        return z;
    }

    public static WebRtcAudioEffects create() {
        return new WebRtcAudioEffects();
    }

    @TargetApi(18)
    private boolean effectTypeIsVoIP(UUID uuid) {
        if (!WebRtcAudioUtils.runningOnJellyBeanMR2OrHigher()) {
            return false;
        }
        if (AudioEffect.EFFECT_TYPE_AEC.equals(uuid) && isAcousticEchoCancelerSupported()) {
            return true;
        }
        return AudioEffect.EFFECT_TYPE_NS.equals(uuid) && isNoiseSuppressorSupported();
    }

    @Nullable
    private static AudioEffect.Descriptor[] getAvailableEffects() {
        AudioEffect.Descriptor[] descriptorArr = cachedEffects;
        if (descriptorArr != null) {
            return descriptorArr;
        }
        AudioEffect.Descriptor[] descriptorArrQueryEffects = AudioEffect.queryEffects();
        cachedEffects = descriptorArrQueryEffects;
        return descriptorArrQueryEffects;
    }

    public static boolean isAcousticEchoCancelerBlacklisted() {
        List<String> blackListedModelsForAecUsage = WebRtcAudioUtils.getBlackListedModelsForAecUsage();
        String str = Build.MODEL;
        boolean zContains = blackListedModelsForAecUsage.contains(str);
        if (zContains) {
            Logging.m88102w(TAG, str + " is blacklisted for HW AEC usage!");
        }
        return zContains;
    }

    @TargetApi(18)
    private static boolean isAcousticEchoCancelerEffectAvailable() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_AEC);
    }

    @TargetApi(18)
    private static boolean isAcousticEchoCancelerExcludedByUUID() {
        for (AudioEffect.Descriptor descriptor : getAvailableEffects()) {
            if (descriptor.type.equals(AudioEffect.EFFECT_TYPE_AEC) && descriptor.uuid.equals(AOSP_ACOUSTIC_ECHO_CANCELER)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isAcousticEchoCancelerSupported() {
        return isAcousticEchoCancelerEffectAvailable();
    }

    public static boolean isAutomaticGainControlBlacklisted() {
        List<String> blackListedModelsForAgcUsage = WebRtcAudioUtils.getBlackListedModelsForAgcUsage();
        String str = Build.MODEL;
        boolean zContains = blackListedModelsForAgcUsage.contains(str);
        if (zContains) {
            Logging.m88102w(TAG, str + " is blacklisted for HW AGC usage!");
        }
        return zContains;
    }

    @TargetApi(18)
    private static boolean isAutomaticGainControlEffectAvailable() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_AGC);
    }

    @TargetApi(18)
    private static boolean isAutomaticGainControlExcludedByUUID() {
        for (AudioEffect.Descriptor descriptor : getAvailableEffects()) {
            if (descriptor.type.equals(AudioEffect.EFFECT_TYPE_AGC) && descriptor.uuid.equals(AOSP_AUTOMATIC_GAIN_CONTROL)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isAutomaticGainControlSupported() {
        return isAutomaticGainControlEffectAvailable();
    }

    private static boolean isEffectTypeAvailable(UUID uuid) {
        AudioEffect.Descriptor[] availableEffects = getAvailableEffects();
        if (availableEffects == null) {
            return false;
        }
        for (AudioEffect.Descriptor descriptor : availableEffects) {
            if (descriptor.type.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNoiseSuppressorBlacklisted() {
        List<String> blackListedModelsForNsUsage = WebRtcAudioUtils.getBlackListedModelsForNsUsage();
        String str = Build.MODEL;
        boolean zContains = blackListedModelsForNsUsage.contains(str);
        if (zContains) {
            Logging.m88102w(TAG, str + " is blacklisted for HW NS usage!");
        }
        return zContains;
    }

    @TargetApi(18)
    private static boolean isNoiseSuppressorEffectAvailable() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_NS);
    }

    @TargetApi(18)
    private static boolean isNoiseSuppressorExcludedByUUID() {
        for (AudioEffect.Descriptor descriptor : getAvailableEffects()) {
            if (descriptor.type.equals(AudioEffect.EFFECT_TYPE_NS) && descriptor.uuid.equals(AOSP_NOISE_SUPPRESSOR)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNoiseSuppressorSupported() {
        return isNoiseSuppressorEffectAvailable();
    }

    public void enable(int i) {
        Logging.m88097d(TAG, "enable(audioSession=" + i + ")");
        boolean z = false;
        assertTrue(this.aec == null);
        assertTrue(this.f64018ns == null);
        assertTrue(this.agc == null);
        if (isAcousticEchoCancelerSupported() && this.shouldEnableAec) {
            AcousticEchoCanceler acousticEchoCancelerCreate = AcousticEchoCanceler.create(i);
            this.aec = acousticEchoCancelerCreate;
            if (acousticEchoCancelerCreate != null) {
                boolean enabled = acousticEchoCancelerCreate.getEnabled();
                boolean z2 = this.shouldEnableAec && canUseAcousticEchoCanceler();
                if (this.aec.setEnabled(z2) != 0) {
                    Logging.m88098e(TAG, "Failed to set the AcousticEchoCanceler state");
                }
                StringBuilder sb = new StringBuilder("AcousticEchoCanceler: was ");
                sb.append(enabled ? "enabled" : "disabled");
                sb.append(", enable: ");
                sb.append(z2);
                sb.append(", is now: ");
                sb.append(this.aec.getEnabled() ? "enabled" : "disabled");
                Logging.m88097d(TAG, sb.toString());
            } else {
                Logging.m88098e(TAG, "Failed to create the AcousticEchoCanceler instance");
            }
        }
        if (isNoiseSuppressorSupported() && this.shouldEnableNs) {
            NoiseSuppressor noiseSuppressorCreate = NoiseSuppressor.create(i);
            this.f64018ns = noiseSuppressorCreate;
            if (noiseSuppressorCreate != null) {
                boolean enabled2 = noiseSuppressorCreate.getEnabled();
                boolean z3 = this.shouldEnableNs && canUseNoiseSuppressor();
                if (this.f64018ns.setEnabled(z3) != 0) {
                    Logging.m88098e(TAG, "Failed to set the NoiseSuppressor state");
                }
                StringBuilder sb2 = new StringBuilder("NoiseSuppressor: was ");
                sb2.append(enabled2 ? "enabled" : "disabled");
                sb2.append(", enable: ");
                sb2.append(z3);
                sb2.append(", is now: ");
                sb2.append(this.f64018ns.getEnabled() ? "enabled" : "disabled");
                Logging.m88097d(TAG, sb2.toString());
            } else {
                Logging.m88098e(TAG, "Failed to create the NoiseSuppressor instance");
            }
        }
        if (isAutomaticGainControlSupported() && this.shouldEnableAgc) {
            AutomaticGainControl automaticGainControlCreate = AutomaticGainControl.create(i);
            this.agc = automaticGainControlCreate;
            if (automaticGainControlCreate == null) {
                Logging.m88098e(TAG, "Failed to create the AutomaticGainControl instance");
                return;
            }
            boolean enabled3 = automaticGainControlCreate.getEnabled();
            if (this.shouldEnableAgc && canUseAutomaticGainControl()) {
                z = true;
            }
            if (this.agc.setEnabled(z) != 0) {
                Logging.m88098e(TAG, "Failed to set the AutomaticGainControl state");
            }
            StringBuilder sb3 = new StringBuilder("AutomaticGainControl: was ");
            sb3.append(enabled3 ? "enabled" : "disabled");
            sb3.append(", enable: ");
            sb3.append(z);
            sb3.append(", is now: ");
            sb3.append(this.agc.getEnabled() ? "enabled" : "disabled");
            Logging.m88097d(TAG, sb3.toString());
        }
    }

    public void release() {
        Logging.m88097d(TAG, "release");
        AcousticEchoCanceler acousticEchoCanceler = this.aec;
        if (acousticEchoCanceler != null) {
            acousticEchoCanceler.release();
            this.aec = null;
            this.shouldEnableAec = false;
        }
        NoiseSuppressor noiseSuppressor = this.f64018ns;
        if (noiseSuppressor != null) {
            noiseSuppressor.release();
            this.f64018ns = null;
            this.shouldEnableNs = false;
        }
        AutomaticGainControl automaticGainControl = this.agc;
        if (automaticGainControl != null) {
            automaticGainControl.release();
            this.agc = null;
            this.shouldEnableAgc = false;
        }
    }

    public boolean setAEC(boolean z) {
        Logging.m88097d(TAG, "setAEC(" + z + ")");
        if (!canUseAcousticEchoCanceler()) {
            Logging.m88102w(TAG, "Platform AEC is not supported");
            this.shouldEnableAec = false;
            return false;
        }
        if (this.aec == null || z == this.shouldEnableAec) {
            this.shouldEnableAec = z;
            return true;
        }
        Logging.m88098e(TAG, "Platform AEC state can't be modified while recording");
        return false;
    }

    public boolean setAGC(boolean z) {
        Logging.m88097d(TAG, "setAGC(" + z + ")");
        if (!canUseAutomaticGainControl()) {
            Logging.m88102w(TAG, "Platform AGC is not supported");
            this.shouldEnableAgc = false;
            return false;
        }
        if (this.agc == null || z == this.shouldEnableAgc) {
            this.shouldEnableAgc = z;
            return true;
        }
        Logging.m88098e(TAG, "Platform AGC state can't be modified while recording");
        return false;
    }

    public boolean setNS(boolean z) {
        Logging.m88097d(TAG, "setNS(" + z + ")");
        if (!canUseNoiseSuppressor()) {
            Logging.m88102w(TAG, "Platform NS is not supported");
            this.shouldEnableNs = false;
            return false;
        }
        if (this.f64018ns == null || z == this.shouldEnableNs) {
            this.shouldEnableNs = z;
            return true;
        }
        Logging.m88098e(TAG, "Platform NS state can't be modified while recording");
        return false;
    }
}
