package com.p069ss.bytertc.audio.device.webrtc;

import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AudioEffect;
import android.media.audiofx.NoiseSuppressor;
import android.os.Build;
import androidx.annotation.Nullable;
import com.bytedance.realx.base.RXLogging;
import io.agora.base.internal.voiceengine.earmonitor.HardwareEarMonitorUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p149l.y9g0;

/* JADX INFO: loaded from: classes12.dex */
public class WebRtcAudioEffects {
    private static final boolean DEBUG = false;
    private static final String TAG = "WebRtcAudioEffects";
    private static Map<String, List<String>> audioEffectBlackList = new HashMap();

    @Nullable
    private static AudioEffect.Descriptor[] cachedEffects;

    @Nullable
    private AcousticEchoCanceler aec;

    /* JADX INFO: renamed from: ns */
    @Nullable
    private NoiseSuppressor f55580ns;
    private boolean shouldEnableAec;
    private boolean shouldEnableNs;

    private WebRtcAudioEffects() {
        RXLogging.m5690i(TAG, "ctor" + WebRtcAudioUtils.getThreadInfo());
    }

    public static boolean IsAudioEffectSupported() {
        if (audioEffectBlackList.isEmpty()) {
            initAudioEffectBlackList();
        }
        String productBrand = WebRtcAudioUtils.getProductBrand();
        if (productBrand.isEmpty() || !audioEffectBlackList.containsKey(productBrand)) {
            return true;
        }
        String romVersion = WebRtcAudioUtils.getRomVersion(productBrand);
        boolean zContains = audioEffectBlackList.get(productBrand).contains(romVersion);
        RXLogging.m5692w(TAG, "IsAudioEffectSupported, " + productBrand + ", " + romVersion + ", in black list = " + zContains);
        return !zContains;
    }

    private static void assertTrue(boolean z) {
        if (z) {
            return;
        }
        y9g0.m213537a("Expected condition to be true");
    }

    public static boolean canUseAcousticEchoCanceler() {
        boolean z = (!isAcousticEchoCancelerSupported() || WebRtcAudioUtils.useWebRtcBasedAcousticEchoCanceler() || isAcousticEchoCancelerBlacklisted()) ? false : true;
        RXLogging.m5690i(TAG, "canUseAcousticEchoCanceler: " + z);
        return z;
    }

    public static boolean canUseNoiseSuppressor() {
        boolean z = (!isNoiseSuppressorSupported() || WebRtcAudioUtils.useWebRtcBasedNoiseSuppressor() || isNoiseSuppressorBlacklisted()) ? false : true;
        RXLogging.m5690i(TAG, "canUseNoiseSuppressor: " + z);
        return z;
    }

    public static WebRtcAudioEffects create() {
        return new WebRtcAudioEffects();
    }

    private boolean effectTypeIsVoIP(UUID uuid) {
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
        try {
            AudioEffect.Descriptor[] descriptorArrQueryEffects = AudioEffect.queryEffects();
            cachedEffects = descriptorArrQueryEffects;
            return descriptorArrQueryEffects;
        } catch (Exception e) {
            e.printStackTrace();
            return cachedEffects;
        }
    }

    private static void initAudioEffectBlackList() {
        audioEffectBlackList.put(HardwareEarMonitorUtils.MANUFACTURER_VIVO, new ArrayList());
        audioEffectBlackList.get(HardwareEarMonitorUtils.MANUFACTURER_VIVO).add("Funtouch OS_3.1_PD1616_D_7.17.5");
    }

    public static boolean isAcousticEchoCancelerBlacklisted() {
        List<String> blackListedModelsForAecUsage = WebRtcAudioUtils.getBlackListedModelsForAecUsage();
        String str = Build.MODEL;
        boolean zContains = blackListedModelsForAecUsage.contains(str);
        if (zContains) {
            RXLogging.m5692w(TAG, str + " is blacklisted for HW AEC usage!");
        }
        return zContains;
    }

    private static boolean isAcousticEchoCancelerEffectAvailable() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_AEC);
    }

    private static boolean isAcousticEchoCancelerExcludedByUUID() {
        UUID uuidFromString;
        try {
            uuidFromString = UUID.fromString("bb392ec0-8d4d-11e0-a896-0002a5d5c51b");
        } catch (Exception e) {
            e.printStackTrace();
            uuidFromString = null;
        }
        for (AudioEffect.Descriptor descriptor : getAvailableEffects()) {
            if (descriptor.type.equals(AudioEffect.EFFECT_TYPE_AEC) && uuidFromString != null && descriptor.uuid.equals(uuidFromString)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isAcousticEchoCancelerSupported() {
        return isAcousticEchoCancelerEffectAvailable();
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
            RXLogging.m5692w(TAG, str + " is blacklisted for HW NS usage!");
        }
        return zContains;
    }

    private static boolean isNoiseSuppressorEffectAvailable() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_NS);
    }

    private static boolean isNoiseSuppressorExcludedByUUID() {
        UUID uuidFromString;
        try {
            uuidFromString = UUID.fromString("c06c8400-8e06-11e0-9cb6-0002a5d5c51b");
        } catch (Exception e) {
            e.printStackTrace();
            uuidFromString = null;
        }
        for (AudioEffect.Descriptor descriptor : getAvailableEffects()) {
            if (descriptor.type.equals(AudioEffect.EFFECT_TYPE_NS) && uuidFromString != null && descriptor.uuid.equals(uuidFromString)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNoiseSuppressorSupported() {
        return isNoiseSuppressorEffectAvailable();
    }

    public void enable(int i) {
        boolean z;
        boolean z2;
        boolean enabled;
        boolean z3;
        boolean enabled2;
        boolean z4;
        boolean z5;
        boolean enabled3;
        RXLogging.m5690i(TAG, "enable(audioSession=" + i + ")");
        boolean z6 = false;
        if (isAcousticEchoCancelerSupported()) {
            try {
                if (this.aec != null) {
                    RXLogging.m5688e(TAG, "Release previous aec instance");
                    this.aec.release();
                    this.aec = null;
                }
                AcousticEchoCanceler acousticEchoCancelerCreate = AcousticEchoCanceler.create(i);
                this.aec = acousticEchoCancelerCreate;
                if (acousticEchoCancelerCreate != null) {
                    enabled = acousticEchoCancelerCreate.getEnabled();
                    try {
                        z3 = this.shouldEnableAec && canUseAcousticEchoCanceler();
                        try {
                            if (this.aec.setEnabled(z3) != 0) {
                                RXLogging.m5688e(TAG, "Failed to set the AcousticEchoCanceler state");
                            }
                            enabled2 = this.aec.getEnabled();
                        } catch (Exception e) {
                            boolean z7 = z3;
                            z = enabled;
                            e = e;
                            z2 = z7;
                            e.printStackTrace();
                            enabled = z;
                            z3 = z2;
                            enabled2 = false;
                        }
                    } catch (Exception e2) {
                        z = enabled;
                        e = e2;
                        z2 = false;
                    }
                } else {
                    enabled = false;
                    z3 = false;
                    enabled2 = false;
                }
            } catch (Exception e3) {
                e = e3;
                z = false;
                z2 = false;
            }
            if (this.aec != null) {
                StringBuilder sb = new StringBuilder("AcousticEchoCanceler: was ");
                sb.append(enabled ? "enabled" : "disabled");
                sb.append(", enable: ");
                sb.append(z3);
                sb.append(", is now: ");
                sb.append(enabled2 ? "enabled" : "disabled");
                RXLogging.m5690i(TAG, sb.toString());
            } else {
                RXLogging.m5688e(TAG, "Failed to create the AcousticEchoCanceler instance");
            }
        }
        if (isNoiseSuppressorSupported()) {
            try {
                if (this.f55580ns != null) {
                    RXLogging.m5688e(TAG, "Release previous ns instance");
                    this.f55580ns.release();
                    this.f55580ns = null;
                }
                NoiseSuppressor noiseSuppressorCreate = NoiseSuppressor.create(i);
                this.f55580ns = noiseSuppressorCreate;
                if (noiseSuppressorCreate != null) {
                    boolean enabled4 = noiseSuppressorCreate.getEnabled();
                    try {
                        z5 = this.shouldEnableNs && canUseNoiseSuppressor();
                        try {
                            if (this.f55580ns.setEnabled(z5) != 0) {
                                RXLogging.m5688e(TAG, "Failed to set the NoiseSuppressor state");
                            }
                            z6 = enabled4;
                            enabled3 = this.f55580ns.getEnabled();
                        } catch (Exception e4) {
                            z4 = enabled4;
                            e = e4;
                            e.printStackTrace();
                            enabled3 = false;
                            z6 = z4;
                        }
                    } catch (Exception e5) {
                        z4 = enabled4;
                        e = e5;
                        z5 = false;
                    }
                } else {
                    enabled3 = false;
                    z5 = false;
                }
            } catch (Exception e6) {
                e = e6;
                z4 = false;
                z5 = false;
            }
            if (this.f55580ns == null) {
                RXLogging.m5688e(TAG, "Failed to create the NoiseSuppressor instance");
                return;
            }
            StringBuilder sb2 = new StringBuilder("NoiseSuppressor: was ");
            sb2.append(z6 ? "enabled" : "disabled");
            sb2.append(", enable: ");
            sb2.append(z5);
            sb2.append(", is now: ");
            sb2.append(enabled3 ? "enabled" : "disabled");
            RXLogging.m5690i(TAG, sb2.toString());
        }
    }

    public void release() {
        RXLogging.m5690i(TAG, "release");
        try {
            AcousticEchoCanceler acousticEchoCanceler = this.aec;
            if (acousticEchoCanceler != null) {
                acousticEchoCanceler.release();
                this.aec = null;
            }
            NoiseSuppressor noiseSuppressor = this.f55580ns;
            if (noiseSuppressor != null) {
                noiseSuppressor.release();
                this.f55580ns = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            this.aec = null;
            this.f55580ns = null;
        }
    }

    public boolean setAEC(boolean z) {
        RXLogging.m5690i(TAG, "setAEC(" + z + ")");
        if (!canUseAcousticEchoCanceler()) {
            RXLogging.m5692w(TAG, "Platform AEC is not supported");
            this.shouldEnableAec = false;
            return false;
        }
        if (this.aec == null || z == this.shouldEnableAec) {
            this.shouldEnableAec = z;
            return true;
        }
        RXLogging.m5688e(TAG, "Platform AEC state can't be modified while recording");
        return false;
    }

    public boolean setNS(boolean z) {
        RXLogging.m5690i(TAG, "setNS(" + z + ")");
        if (!canUseNoiseSuppressor()) {
            RXLogging.m5692w(TAG, "Platform NS is not supported");
            this.shouldEnableNs = false;
            return false;
        }
        if (this.f55580ns == null || z == this.shouldEnableNs) {
            this.shouldEnableNs = z;
            return true;
        }
        RXLogging.m5688e(TAG, "Platform NS state can't be modified while recording");
        return false;
    }
}
