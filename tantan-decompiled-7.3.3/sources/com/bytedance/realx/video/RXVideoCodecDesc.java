package com.bytedance.realx.video;

import androidx.annotation.Nullable;
import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes.dex */
public class RXVideoCodecDesc {
    public final RXVideoCodecProfile profile;
    public final RXVideoCodecStandard standard;

    @CalledByNative
    public RXVideoCodecDesc(int i, int i2) {
        this.standard = RXVideoCodecStandard.fromValue(i);
        this.profile = RXVideoCodecProfile.fromValue(i2);
    }

    @CalledByNative
    public int GetProfileInt() {
        return this.profile.toInt();
    }

    @CalledByNative
    public int GetStandardInt() {
        return this.standard.toInt();
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RXVideoCodecDesc)) {
            return false;
        }
        RXVideoCodecDesc rXVideoCodecDesc = (RXVideoCodecDesc) obj;
        return this.standard == rXVideoCodecDesc.standard && this.profile == rXVideoCodecDesc.profile;
    }

    @CalledByNative
    public String getName() {
        return this.standard.mimeType();
    }

    public RXVideoCodecProfile getProfile() {
        return this.profile;
    }

    public RXVideoCodecStandard getStandard() {
        return this.standard;
    }

    public RXVideoCodecDesc(RXVideoCodecStandard rXVideoCodecStandard, RXVideoCodecProfile rXVideoCodecProfile) {
        this.standard = rXVideoCodecStandard;
        this.profile = rXVideoCodecProfile;
    }
}
