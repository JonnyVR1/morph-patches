package com.effectsar.labcv.effectsdk;

import com.bef.effectsdk.ResourceFinder;

/* JADX INFO: loaded from: classes.dex */
public abstract class ReflectResourceFinder implements ResourceFinder {
    private String mModelsDir;

    public ReflectResourceFinder(String str) {
        this.mModelsDir = str;
    }

    private native long nativeCreateReflectResourceFinder(long j);

    @Override // com.bef.effectsdk.ResourceFinder
    public long createNativeResourceFinder(long j) {
        return nativeCreateReflectResourceFinder(j);
    }

    public abstract String findResource(String str);

    @Override // com.bef.effectsdk.ResourceFinder
    public void release(long j) {
    }
}
