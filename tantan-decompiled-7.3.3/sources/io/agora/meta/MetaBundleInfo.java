package io.agora.meta;

import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes2.dex */
public class MetaBundleInfo {
    public String mAssets;
    public String mBundleCode;
    public long mBundleId;
    public String mBundleName;
    public String mBundlePath;
    public long mBundleSize;
    public int mBundleType;
    public String mDescription;
    public String mExtraInfo;
    public long mSceneId;
    public String mThumbnailPath;

    public static class BundleType {
        public static final int BUNDLE_TYPE_ASSET_MANIFEST = 3;
        public static final int BUNDLE_TYPE_AVATAR = 2;
        public static final int BUNDLE_TYPE_OTHER = 3;
        public static final int BUNDLE_TYPE_SCENE = 1;

        private BundleType() {
        }
    }

    public MetaBundleInfo() {
        this.mBundleId = 0L;
        this.mSceneId = 0L;
        this.mBundleType = 1;
        this.mBundleCode = "";
        this.mBundleName = "";
        this.mDescription = "";
        this.mBundlePath = "";
        this.mThumbnailPath = "";
        this.mAssets = "";
        this.mExtraInfo = "";
        this.mBundleSize = 0L;
    }

    @CalledByNative
    public String getAssets() {
        return this.mAssets;
    }

    @CalledByNative
    public String getBundleCode() {
        return this.mBundleCode;
    }

    @CalledByNative
    public long getBundleId() {
        return this.mBundleId;
    }

    @CalledByNative
    public String getBundleName() {
        return this.mBundleName;
    }

    @CalledByNative
    public String getBundlePath() {
        return this.mBundlePath;
    }

    @CalledByNative
    public long getBundleSize() {
        return this.mBundleSize;
    }

    @CalledByNative
    public int getBundleType() {
        return this.mBundleType;
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
    public long getSceneId() {
        return this.mSceneId;
    }

    @CalledByNative
    public String getThumbnailPath() {
        return this.mThumbnailPath;
    }

    public String toString() {
        return "MetaBundleInfo{mBundleId=" + this.mBundleId + ", mSceneId=" + this.mSceneId + ", mBundleType=" + this.mBundleType + ", mBundleCode='" + this.mBundleCode + "', mBundleName='" + this.mBundleName + "', mDescription='" + this.mDescription + "', mBundlePath='" + this.mBundlePath + "', mThumbnailPath='" + this.mThumbnailPath + "', mAssets='" + this.mAssets + "', mExtraInfo='" + this.mExtraInfo + "', mBundleSize=" + this.mBundleSize + '}';
    }

    @CalledByNative
    public MetaBundleInfo(long j, long j2, int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j3) {
        this.mBundleId = j;
        this.mSceneId = j2;
        this.mBundleType = i;
        this.mBundleCode = str;
        this.mBundleName = str2;
        this.mDescription = str3;
        this.mBundlePath = str4;
        this.mThumbnailPath = str5;
        this.mAssets = str6;
        this.mExtraInfo = str7;
        this.mBundleSize = j3;
    }
}
