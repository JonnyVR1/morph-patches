package io.agora.meta;

import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes2.dex */
public interface ILocalUserAvatar {
    int applyInfo();

    @CalledByNative
    byte[] getExtraInfo();

    @CalledByNative
    AvatarModelInfo getModelInfo();

    @CalledByNative
    MetaUserInfo getUserInfo();

    int setExtraInfo(byte[] bArr);

    int setModelInfo(AvatarModelInfo avatarModelInfo);

    int setUserInfo(MetaUserInfo metaUserInfo);
}
