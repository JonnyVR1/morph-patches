package io.agora.base.internal.voiceengine.earmonitor;

import androidx.annotation.Nullable;
import io.agora.base.internal.Logging;
import io.agora.base.internal.ReflectUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class HardwareEarMonitorFactory {
    private static final String TAG = "HardwareEarMonitorFactory";
    private static Map<String, Class<? extends IHardwareEarMonitor>> sHardwareEarMonitorMap;

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        sHardwareEarMonitorMap = concurrentHashMap;
        concurrentHashMap.put(HardwareEarMonitorUtils.MANUFACTURER_HUAWEI, HuaweiHardwareEarMonitor.class);
        sHardwareEarMonitorMap.put(HardwareEarMonitorUtils.MANUFACTURER_HONOR, HonorHardwareEarMonitor.class);
        sHardwareEarMonitorMap.put(HardwareEarMonitorUtils.MANUFACTURER_VIVO, VivoHardwareEarMonitor.class);
    }

    @Nullable
    public static IHardwareEarMonitor create(String str, HardwareEarMonitorListener hardwareEarMonitorListener) {
        IHardwareEarMonitor iHardwareEarMonitorNewInstance = null;
        try {
            Class<? extends IHardwareEarMonitor> cls = sHardwareEarMonitorMap.get(str);
            if (cls != null && ((Boolean) ReflectUtils.safeCallMethod(cls, null, HardwareEarMonitorUtils.METHOD_NAME_HAS_EAR_MONITOR_CLASS, new Class[0], new Object[0])).booleanValue()) {
                iHardwareEarMonitorNewInstance = cls.getConstructor(HardwareEarMonitorListener.class).newInstance(hardwareEarMonitorListener);
            }
            if (iHardwareEarMonitorNewInstance != null || !str.equals(HardwareEarMonitorUtils.MANUFACTURER_HONOR)) {
                return iHardwareEarMonitorNewInstance;
            }
            Logging.m88102w(TAG, "fallback to use huawei audiokit for honor device");
            return create(HardwareEarMonitorUtils.MANUFACTURER_HUAWEI, hardwareEarMonitorListener);
        } catch (Throwable th) {
            Logging.m88099e(TAG, "createHardwareEarMonitor failed: ", th);
            return iHardwareEarMonitorNewInstance;
        }
    }
}
