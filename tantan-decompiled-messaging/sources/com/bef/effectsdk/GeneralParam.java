package com.bef.effectsdk;

import com.amazing.annotation.EffectKeep;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@EffectKeep
public class GeneralParam {
    private static GetNetWorkInfo sGetNetworkInfo;

    public interface GetNetWorkInfo {
        int checkUrl(String str);

        HashMap<String, String> getHeader(String str);

        HashMap<String, String> getParam(String str);
    }

    @EffectKeep
    private static int checkUrlStr(String str) {
        GetNetWorkInfo getNetWorkInfo = sGetNetworkInfo;
        if (getNetWorkInfo == null) {
            return 0;
        }
        return getNetWorkInfo.checkUrl(str);
    }

    private static String convertMapToString(HashMap<String, String> map) {
        if (map.isEmpty()) {
            return "";
        }
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        Map.Entry<String, String> next = it.next();
        String str = next.getKey() + "=" + next.getValue();
        while (it.hasNext()) {
            Map.Entry<String, String> next2 = it.next();
            String key = next2.getKey();
            String value = next2.getValue();
            if (!key.isEmpty() && !value.isEmpty()) {
                str = str + "&" + key + "=" + value;
            }
        }
        return str;
    }

    private static String getHeaderStr(String str) {
        GetNetWorkInfo getNetWorkInfo = sGetNetworkInfo;
        return getNetWorkInfo == null ? "" : convertMapToString(getNetWorkInfo.getHeader(str));
    }

    public static String getParamByKey(String str) {
        return nativeGetParamByKey(str);
    }

    @EffectKeep
    private static String getParamStr(String str) {
        GetNetWorkInfo getNetWorkInfo = sGetNetworkInfo;
        return getNetWorkInfo == null ? "" : convertMapToString(getNetWorkInfo.getParam(str));
    }

    private static native String nativeGetParamByKey(String str);

    private static native void nativeSetParamWithKey(String str, String str2);

    private static native void nativeSetParams(HashMap<String, String> map);

    public static void setNetWorkInfoCallback(GetNetWorkInfo getNetWorkInfo) {
        sGetNetworkInfo = getNetWorkInfo;
    }

    public static void setParamWithKey(String str, String str2) {
        nativeSetParamWithKey(str, str2);
    }

    public static void setParams(HashMap<String, String> map) {
        nativeSetParams(map);
    }
}
