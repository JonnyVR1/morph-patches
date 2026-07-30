package com.p074ss.bytertc.engine.utils;

import com.p074ss.bytertc.engine.data.AudioChannel;
import com.p074ss.bytertc.engine.data.AudioFrameType;
import com.p074ss.bytertc.engine.data.AudioSampleRate;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes11.dex */
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
