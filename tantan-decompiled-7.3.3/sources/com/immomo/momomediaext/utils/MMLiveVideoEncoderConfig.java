package com.immomo.momomediaext.utils;

import com.tencent.liteav.audio.TXEAudioDef;

/* JADX INFO: loaded from: classes7.dex */
public class MMLiveVideoEncoderConfig {
    public int encodeWidth = 528;
    public int encodeHeight = TXEAudioDef.TXE_OPUS_SAMPLE_NUM;
    public int videoFPS = 15;
    public int videoBitRate = 800000;

    public String toString() {
        return "<encodeWidth:" + this.encodeWidth + ",encodeHeight:" + this.encodeHeight + ",fps:" + this.videoFPS + ",videoBitRate:" + this.videoBitRate + '>';
    }
}
