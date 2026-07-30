package io.agora.meta;

import io.agora.base.internal.CalledByNative;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class MetaSceneAssetsInfo {
    public MetaBundleInfo[] mBundles;
    public String mDescription;
    public String mExtraInfo;
    public String mParentScenePath;
    public String mSceneConfig;
    public long mSceneId;
    public String mSceneLocalVersion;
    public String mSceneName;
    public String mScenePath;
    public String mSceneVersion;
    public String mThumbnailPath;
    public long mTotalSize;

    public MetaSceneAssetsInfo() {
        this.mSceneId = 0L;
        this.mSceneName = "";
        this.mThumbnailPath = "";
        this.mScenePath = "";
        this.mParentScenePath = "";
        this.mDescription = "";
        this.mSceneConfig = "";
        this.mExtraInfo = "";
        this.mBundles = new MetaBundleInfo[0];
        this.mSceneVersion = "";
        this.mSceneLocalVersion = "";
        this.mTotalSize = 0L;
    }

    @CalledByNative
    public MetaBundleInfo[] getBundles() {
        return this.mBundles;
    }

    @CalledByNative
    public String getDescription() {
        return this.mDescription;
    }

    @CalledByNative
    public String getExtraInfo() {
        return this.mExtraInfo;
    }

    @CalledByNative
    public String getParentScenePath() {
        return this.mParentScenePath;
    }

    @CalledByNative
    public String getSceneConfig() {
        return this.mSceneConfig;
    }

    @CalledByNative
    public long getSceneId() {
        return this.mSceneId;
    }

    @CalledByNative
    public String getSceneLocalVersion() {
        return this.mSceneLocalVersion;
    }

    @CalledByNative
    public String getSceneName() {
        return this.mSceneName;
    }

    @CalledByNative
    public String getScenePath() {
        return this.mScenePath;
    }

    @CalledByNative
    public String getSceneVersion() {
        return this.mSceneVersion;
    }

    @CalledByNative
    public String getThumbnailPath() {
        return this.mThumbnailPath;
    }

    @CalledByNative
    public long getTotalSize() {
        return this.mTotalSize;
    }

    public String toString() {
        return "MetaSceneAssetsInfo{mSceneId=" + this.mSceneId + ", mSceneName='" + this.mSceneName + "', mThumbnailPath='" + this.mThumbnailPath + "', mScenePath='" + this.mScenePath + "', mParentScenePath='" + this.mParentScenePath + "', mDescription='" + this.mDescription + "', mSceneConfig='" + this.mSceneConfig + "', mExtraInfo='" + this.mExtraInfo + "', mBundles=" + Arrays.toString(this.mBundles) + ", mSceneVersion='" + this.mSceneVersion + "', mSceneLocalVersion='" + this.mSceneLocalVersion + "', mTotalSize=" + this.mTotalSize + '}';
    }

    @CalledByNative
    public MetaSceneAssetsInfo(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, MetaBundleInfo[] metaBundleInfoArr, String str8, String str9, long j2) {
        this.mSceneId = j;
        this.mSceneName = str;
        this.mThumbnailPath = str2;
        this.mScenePath = str3;
        this.mParentScenePath = str4;
        this.mDescription = str5;
        this.mSceneConfig = str6;
        this.mExtraInfo = str7;
        this.mBundles = metaBundleInfoArr;
        this.mSceneVersion = str8;
        this.mSceneLocalVersion = str9;
        this.mTotalSize = j2;
    }
}
