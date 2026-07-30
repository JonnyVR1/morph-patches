package com.bef.effectsdk;

import android.content.res.AssetManager;

/* JADX INFO: loaded from: classes.dex */
public final class AssetResourceFinder implements ResourceFinder {
    private final AssetManager mAssetManager;
    private final String mDir;

    public AssetResourceFinder(AssetManager assetManager, String str) {
        this.mAssetManager = assetManager;
        this.mDir = str;
    }

    private static native long nativeCreateAssetResourceFinder(long j, AssetManager assetManager, String str);

    private static native void nativeReleaseAssetResourceFinder(long j);

    @Override // com.bef.effectsdk.ResourceFinder
    public synchronized long createNativeResourceFinder(long j) {
        return nativeCreateAssetResourceFinder(j, this.mAssetManager, this.mDir);
    }

    @Override // com.bef.effectsdk.ResourceFinder
    public synchronized void release(long j) {
        nativeReleaseAssetResourceFinder(j);
    }
}
