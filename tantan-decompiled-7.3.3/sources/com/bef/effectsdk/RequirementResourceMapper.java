package com.bef.effectsdk;

/* JADX INFO: loaded from: classes.dex */
public final class RequirementResourceMapper {
    private RequirementResourceMapper() {
    }

    private static native String[] nativePeekResourcesNeededByRequirements(String[] strArr);

    public static String[] peekResourcesNeededByRequirements(String[] strArr) {
        return nativePeekResourcesNeededByRequirements(strArr);
    }
}
