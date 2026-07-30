package com.bef.effectsdk;

import com.amazing.annotation.EffectKeep;

/* JADX INFO: loaded from: classes.dex */
@EffectKeep
public class EffectSensorCallback {
    private static GetSensorInfo sGetSensorInfo;

    public interface GetSensorInfo {
        boolean onRegister(int i, int i2);

        boolean onSetRate(int i, int i2);

        boolean onUnregister(int i);
    }

    @EffectKeep
    private static boolean registerStr(int i, int i2) {
        GetSensorInfo getSensorInfo = sGetSensorInfo;
        if (getSensorInfo == null) {
            return true;
        }
        return getSensorInfo.onRegister(i, i2);
    }

    @EffectKeep
    private static boolean setRateStr(int i, int i2) {
        GetSensorInfo getSensorInfo = sGetSensorInfo;
        if (getSensorInfo == null) {
            return true;
        }
        return getSensorInfo.onSetRate(i, i2);
    }

    public static void setSensorInfoCallback(GetSensorInfo getSensorInfo) {
        sGetSensorInfo = getSensorInfo;
    }

    @EffectKeep
    private static boolean unregisterStr(int i) {
        GetSensorInfo getSensorInfo = sGetSensorInfo;
        if (getSensorInfo == null) {
            return true;
        }
        return getSensorInfo.onUnregister(i);
    }
}
