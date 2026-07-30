package com.p069ss.bytertc.engine.video;

import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public abstract class IAmazingEffect {
    public static String getEffectSDKVersion() {
        return AmazingEffect.getEffectSDKVersion();
    }

    public abstract int appendEffectNodes(List<String> list);

    public abstract int removeEffectNodes(List<String> list);

    public abstract int replaceEffectNodes(List<String> list, List<String> list2);

    public abstract int setAlgoModelResourceFinder(IRtcResourceFinder iRtcResourceFinder);

    public abstract int setEffectNodes(List<String> list);

    public abstract void setVirtualBackgroundFilePath(String str, int i);

    public abstract int updateEffectNode(String str, String str2, float f);
}
