package io.agora.base.internal.voiceengine.earmonitor;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class HardwareEarMonitorUtils {
    public static final int HARDWARE_EARMONITOR_STATE_INITIALIZING = 1;
    public static final int HARDWARE_EARMONITOR_STATE_KIT_NOT_INSTALL = 2;
    public static final int HARDWARE_EARMONITOR_STATE_NOT_INITIALIZED = 0;
    public static final int HARDWARE_EARMONITOR_STATE_READY = 3;
    public static final String MANUFACTURER_HONOR = "honor";
    public static final String MANUFACTURER_HUAWEI = "huawei";
    public static final String MANUFACTURER_OPPO = "oppo";
    public static final String MANUFACTURER_VIVO = "vivo";
    public static final String MANUFACTURER_XIAOMI = "xiaomi";
    public static final String METHOD_NAME_HAS_EAR_MONITOR_CLASS = "hasEarMonitorClass";
    private static Map<Integer, String> State2DescriptionMap;

    public static class Gsai {
        static final String CLASS_NAME_MEDIA_CLIENT = "com.itgsa.opensdk.media.MediaClient";
        static final String METHOD_NAME_CLOSE_KTV_DEVICE = "closeKTVDevice";
        static final String METHOD_NAME_INITIALIZE = "initialize";
        static final String METHOD_NAME_IS_SUPPORTED = "isSupported";
        static final String METHOD_NAME_OPEN_KTV_DEVICE = "openKTVDevice";
        static final String METHOD_NAME_SET_MIC_VOL_PARAM = "setMicVolParam";
        static final String METHOD_NAME_SET_MIXER_SOUND_TYPE = "setMixerSoundType";
        static final String METHOD_NAME_SET_PLAY_FEEDBACK_PARAM = "setPlayFeedbackParam";
        static final int MIXER_SOUND_TYPE_KTV_VIVO = 10;
        static final int MIXER_SOUND_TYPE_KTV_XIAOMI = 3;
        static final int PLAY_FEEDBACK_PARAM_OFF = 0;
        static final int PLAY_FEEDBACK_PARAM_ON = 1;
    }

    public static class HonorKit {
        static final int AUDIO_SERVICE_EAR_RETURN = 1;
        static final int AUDIO_SERVICE_SUCCESS = 0;
        static final String CLASS_NAME_HN_AUDIO_CLIENT = "com.hihonor.android.magicx.media.audio.interfaces.HnAudioClient";
        static final String CLASS_NAME_HN_EAR_RETURN_CLIENT = "com.hihonor.android.magicx.media.audio.interfaces.HnEarReturnClient";
        static final int EAR_RETURN_EFFECT_SUCCESS = 1000;
        static final String ENUM_NAME_PARAME_NAME = "com.hihonor.android.magicx.media.audio.interfaces.HnEarReturnClient$ParameName";
        static final String ENUM_NAME_SERVICE_TYPE = "com.hihonor.android.magicx.media.audio.interfaces.HnAudioClient$ServiceType";
        static final String INTERFACE_NAME_IAUDIO_SERVICE_CALLBACK = "com.hihonor.android.magicx.media.audio.interfaces.IAudioServiceCallback";
        static final String METHOD_NAME_CREATE_SERVICE = "createService";
        static final String METHOD_NAME_DESTROY = "destroy";
        static final String METHOD_NAME_ENABLE_EAR_RETURN = "enableEarReturn";
        static final String METHOD_NAME_GET_EAR_RETURN_LATENCY = "getEarReturnLatency";
        static final String METHOD_NAME_GET_SUPPORTED_SERVICES = "getSupportedServices";
        static final String METHOD_NAME_INITIALIZE = "initialize";
        static final String METHOD_NAME_IS_DEVICE_SUPPORTED = "isDeviceSupported";
        static final String METHOD_NAME_ON_RESULT = "onResult";
        static final String METHOD_NAME_SET_PARAMETER = "setParameter";
    }

    public static class HuaweiKit {
        static final String CLASS_NAME_HW_AUDIO_KARAOKE_FEATURE_KIT = "com.huawei.multimedia.audiokit.interfaces.HwAudioKaraokeFeatureKit";
        static final String CLASS_NAME_HW_AUDIO_KIT = "com.huawei.multimedia.audiokit.interfaces.HwAudioKit";
        static final String ENUM_NAME_FEATURE_TYPE = "com.huawei.multimedia.audiokit.interfaces.HwAudioKit$FeatureType";
        static final String ENUM_NAME_PARAME_NAME = "com.huawei.multimedia.audiokit.interfaces.HwAudioKaraokeFeatureKit$ParameName";
        static final String INTERFACE_NAME_IAUDIO_KIT_CALLBACK = "com.huawei.multimedia.audiokit.interfaces.IAudioKitCallback";
        static final String METHOD_NAME_CREATE_FEATURE = "createFeature";
        static final String METHOD_NAME_DESTROY = "destroy";
        static final String METHOD_NAME_ENABLE_KARAOKE_FEATURE = "enableKaraokeFeature";
        static final String METHOD_NAME_GET_KARAOKE_LATENCY = "getKaraokeLatency";
        static final String METHOD_NAME_INITIALIZE = "initialize";
        static final String METHOD_NAME_IS_KARAOKE_FEATURE_SUPPORT = "isKaraokeFeatureSupport";
        static final String METHOD_NAME_ON_RESULT = "onResult";
        static final String METHOD_NAME_SET_PARAMETER = "setParameter";
    }

    static {
        HashMap map = new HashMap();
        State2DescriptionMap = map;
        map.put(0, "HwAudioKit is not initialized, check it later plz");
        State2DescriptionMap.put(1, "HwAudioKit is initializing, check it later plz");
        State2DescriptionMap.put(2, "HwAudioKit is not installed");
        State2DescriptionMap.put(3, "HwAudioKit is ready");
    }

    public static String getDescriptionByState(int i) {
        String str = State2DescriptionMap.get(Integer.valueOf(i));
        return str != null ? str : "invalid hw earmoitor state";
    }
}
