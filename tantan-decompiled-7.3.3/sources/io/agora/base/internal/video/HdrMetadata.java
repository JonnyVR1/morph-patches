package io.agora.base.internal.video;

import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes2.dex */
public class HdrMetadata {
    private int luma_bit_depth;
    private int max_content_light_level = 0;
    private int max_frame_average_light_level = 0;
    private int profile;

    @CalledByNative
    public HdrMetadata(int i, int i2) {
        this.profile = i;
        this.luma_bit_depth = i2;
    }

    @CalledByNative
    public int getLuma_bit_depth() {
        return this.luma_bit_depth;
    }

    @CalledByNative
    public int getMax_content_light_level() {
        return this.max_content_light_level;
    }

    @CalledByNative
    public int getMax_frame_average_light_level() {
        return this.max_frame_average_light_level;
    }

    @CalledByNative
    public int getProfile() {
        return this.profile;
    }

    public void setLuma_bit_depth(int i) {
        this.luma_bit_depth = i;
    }

    public void setMax_content_light_level(int i) {
        this.max_content_light_level = i;
    }

    public void setMax_frame_average_light_level(int i) {
        this.max_frame_average_light_level = i;
    }

    public void setProfile(int i) {
        this.profile = i;
    }
}
