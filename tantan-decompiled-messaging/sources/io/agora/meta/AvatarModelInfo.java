package io.agora.meta;

import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes2.dex */
public class AvatarModelInfo {
    public String mBundleCode;
    public boolean mLocalVisible;
    public boolean mRemoteVisible;
    public boolean mSyncPosition;

    public AvatarModelInfo() {
        this.mBundleCode = "";
        this.mLocalVisible = false;
        this.mRemoteVisible = false;
        this.mSyncPosition = false;
    }

    @CalledByNative
    public String getBundleCode() {
        return this.mBundleCode;
    }

    @CalledByNative
    public boolean getLocalVisible() {
        return this.mLocalVisible;
    }

    @CalledByNative
    public boolean getRemoteVisible() {
        return this.mRemoteVisible;
    }

    @CalledByNative
    public boolean getSyncPosition() {
        return this.mSyncPosition;
    }

    public String toString() {
        return "AvatarModelInfo{mBundleCode='" + this.mBundleCode + "', mLocalVisible=" + this.mLocalVisible + ", mRemoteVisible=" + this.mRemoteVisible + ", mSyncPosition=" + this.mSyncPosition + '}';
    }

    @CalledByNative
    public AvatarModelInfo(String str, boolean z, boolean z2, boolean z3) {
        this.mBundleCode = str;
        this.mLocalVisible = z;
        this.mRemoteVisible = z2;
        this.mSyncPosition = z3;
    }
}
