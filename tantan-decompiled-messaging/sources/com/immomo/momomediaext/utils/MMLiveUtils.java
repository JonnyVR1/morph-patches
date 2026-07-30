package com.immomo.momomediaext.utils;

import com.p069ss.bytertc.engine.RTCEngine;
import io.agora.rtc2.RtcEngine;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class MMLiveUtils {
    public static HashMap getPusherSDKInfo() {
        HashMap map = new HashMap();
        map.put("agora", RtcEngine.getSdkVersion());
        map.put("volc", RTCEngine.getSDKVersion());
        return map;
    }
}
