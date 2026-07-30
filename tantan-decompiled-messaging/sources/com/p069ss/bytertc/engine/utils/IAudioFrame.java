package com.p069ss.bytertc.engine.utils;

import com.p069ss.bytertc.engine.data.AudioChannel;
import com.p069ss.bytertc.engine.data.AudioFrameType;
import com.p069ss.bytertc.engine.data.AudioSampleRate;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public interface IAudioFrame {
    AudioChannel channel();

    int data_size();

    int extraInfoSize();

    AudioFrameType frame_type();

    ByteBuffer getDataBuffer();

    ByteBuffer getExtraInfo();

    void release();

    AudioSampleRate sample_rate();

    long timestamp_us();
}
