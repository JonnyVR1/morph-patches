package com.bef.effectsdk;

/* JADX INFO: loaded from: classes.dex */
public final class FileResourceFinder implements ResourceFinder {
    private final String mDir;

    public FileResourceFinder(String str) {
        this.mDir = str;
    }

    private static native long nativeCreateFileResourceFinder(long j, String str);

    @Override // com.bef.effectsdk.ResourceFinder
    public long createNativeResourceFinder(long j) {
        return nativeCreateFileResourceFinder(j, this.mDir);
    }

    @Override // com.bef.effectsdk.ResourceFinder
    public void release(long j) {
    }
}
