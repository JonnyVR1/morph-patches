package com.p069ss.bytertc.engine;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes13.dex */
public class SubscribeConfig {
    public int framerate;
    public boolean isScreen;
    public boolean subAudio;
    public int subHeight;
    public boolean subVideo;
    public int subVideoIndex;
    public int subWidth;
    public SVCLayer svcLayer;
    public int videoIndex;

    public enum SVCLayer {
        DEFAULT(0),
        BASE(1),
        MAIN(2),
        HIGH(3);

        private int value;

        SVCLayer(int i) {
            this.value = i;
        }

        public static SVCLayer convertFromInt(int i) {
            return values()[i];
        }

        public int getValue() {
            return this.value;
        }
    }

    public SubscribeConfig(SubscribeConfig subscribeConfig) {
        this.subWidth = 0;
        this.subHeight = 0;
        this.subVideoIndex = -1;
        this.svcLayer = SVCLayer.DEFAULT;
        this.framerate = 0;
        if (subscribeConfig != null) {
            this.isScreen = subscribeConfig.isScreen;
            this.subVideo = subscribeConfig.subVideo;
            this.subAudio = subscribeConfig.subAudio;
            this.videoIndex = subscribeConfig.videoIndex;
            this.svcLayer = subscribeConfig.svcLayer;
            this.subWidth = subscribeConfig.subWidth;
            this.subHeight = subscribeConfig.subHeight;
            this.subVideoIndex = subscribeConfig.subVideoIndex;
        }
    }

    @CalledByNative
    private static SubscribeConfig create(boolean z, boolean z2, boolean z3, int i, int i2, int i3, int i4, int i5) {
        return new SubscribeConfig(z, z2, z3, i, i2, i3, i4, i5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            SubscribeConfig subscribeConfig = (SubscribeConfig) obj;
            if (this.isScreen == subscribeConfig.isScreen && this.subVideo == subscribeConfig.subVideo && this.subAudio == subscribeConfig.subAudio && this.videoIndex == subscribeConfig.videoIndex && this.svcLayer == subscribeConfig.svcLayer && this.subWidth == subscribeConfig.subWidth && this.subHeight == subscribeConfig.subHeight) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "SubscribeConfig{isScreen=" + this.isScreen + ", subVideo=" + this.subVideo + ", subAudio=" + this.subAudio + ", videoIndex=" + this.videoIndex + ", svcLayer=" + this.svcLayer + ", sub_width=" + this.subWidth + ", sub_height=" + this.subHeight + ", sub_video_index=" + this.subVideoIndex + "}";
    }

    public SubscribeConfig() {
        this.subWidth = 0;
        this.subHeight = 0;
        this.subVideoIndex = -1;
        this.svcLayer = SVCLayer.DEFAULT;
        this.framerate = 0;
    }

    public SubscribeConfig(boolean z, boolean z2, boolean z3, int i) {
        this.subWidth = 0;
        this.subHeight = 0;
        this.subVideoIndex = -1;
        SVCLayer sVCLayer = SVCLayer.DEFAULT;
        this.framerate = 0;
        this.isScreen = z;
        this.subVideo = z2;
        this.subAudio = z3;
        this.videoIndex = i;
        this.svcLayer = sVCLayer;
        this.subWidth = 0;
        this.subHeight = 0;
        this.subVideoIndex = -1;
    }

    public SubscribeConfig(boolean z, boolean z2, boolean z3, int i, int i2) {
        this.subWidth = 0;
        this.subHeight = 0;
        this.subVideoIndex = -1;
        this.svcLayer = SVCLayer.DEFAULT;
        this.framerate = 0;
        this.isScreen = z;
        this.subVideo = z2;
        this.subAudio = z3;
        this.videoIndex = i;
        this.svcLayer = SVCLayer.convertFromInt(i2);
        this.subWidth = 0;
        this.subHeight = 0;
        this.subVideoIndex = -1;
    }

    public SubscribeConfig(boolean z, boolean z2, boolean z3, int i, int i2, int i3, int i4, int i5) {
        this.subWidth = 0;
        this.subHeight = 0;
        this.subVideoIndex = -1;
        this.svcLayer = SVCLayer.DEFAULT;
        this.framerate = 0;
        this.isScreen = z;
        this.subVideo = z2;
        this.subAudio = z3;
        this.videoIndex = i;
        this.svcLayer = SVCLayer.convertFromInt(i2);
        this.subWidth = i3;
        this.subHeight = i4;
        this.subVideoIndex = i5;
    }
}
