package io.agora.meta.internal;

import io.agora.base.internal.CalledByNative;
import io.agora.meta.AvatarModelInfo;
import io.agora.meta.ILocalUserAvatar;
import io.agora.meta.MetaUserInfo;

/* JADX INFO: loaded from: classes2.dex */
public class LocalUserAvatarImpl implements ILocalUserAvatar {
    private long mNativeHandle;

    @CalledByNative
    public LocalUserAvatarImpl(long j) {
        this.mNativeHandle = j;
    }

    private native int nativeApplyInfo(long j);

    private native byte[] nativeGetExtraInfo(long j);

    private native AvatarModelInfo nativeGetModelInfo(long j);

    private native MetaUserInfo nativeGetUserInfo(long j);

    private native int nativeSetExtraInfo(long j, byte[] bArr);

    private native int nativeSetModelInfo(long j, AvatarModelInfo avatarModelInfo);

    private native int nativeSetUserInfo(long j, MetaUserInfo metaUserInfo);

    @Override // io.agora.meta.ILocalUserAvatar
    public int applyInfo() {
        return nativeApplyInfo(this.mNativeHandle);
    }

    @Override // io.agora.meta.ILocalUserAvatar
    @CalledByNative
    public byte[] getExtraInfo() {
        return nativeGetExtraInfo(this.mNativeHandle);
    }

    @Override // io.agora.meta.ILocalUserAvatar
    @CalledByNative
    public AvatarModelInfo getModelInfo() {
        return nativeGetModelInfo(this.mNativeHandle);
    }

    @Override // io.agora.meta.ILocalUserAvatar
    @CalledByNative
    public MetaUserInfo getUserInfo() {
        return nativeGetUserInfo(this.mNativeHandle);
    }

    @Override // io.agora.meta.ILocalUserAvatar
    public int setExtraInfo(byte[] bArr) {
        return nativeSetExtraInfo(this.mNativeHandle, bArr);
    }

    @Override // io.agora.meta.ILocalUserAvatar
    public int setModelInfo(AvatarModelInfo avatarModelInfo) {
        return nativeSetModelInfo(this.mNativeHandle, avatarModelInfo);
    }

    @Override // io.agora.meta.ILocalUserAvatar
    public int setUserInfo(MetaUserInfo metaUserInfo) {
        return nativeSetUserInfo(this.mNativeHandle, metaUserInfo);
    }
}
