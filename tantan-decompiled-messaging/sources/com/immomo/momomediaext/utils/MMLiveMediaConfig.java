package com.immomo.momomediaext.utils;

import com.tencent.liteav.audio.TXEAudioDef;

/* JADX INFO: loaded from: classes7.dex */
public class MMLiveMediaConfig {
    public String url;
    public int videoFPS = 15;
    public int encodeWidth = 528;
    public int encodeHeight = TXEAudioDef.TXE_OPUS_SAMPLE_NUM;
    public int videoBitRate = 800000;
    public int audioBitrate = 64000;
    public int audioSampleRate = 44100;
    public int audioChannels = 2;
    public String ipv6Url = "";
    public int videoCodecType = 0;
    public String sei = "";
    public int cdnType = 0;
    public int businessType = 0;

    public String toString() {
        return "<encodeWidth:" + this.encodeWidth + ",encodeHeight:" + this.encodeHeight + ",videoBitRate:" + this.videoBitRate + ",videofps:" + this.videoFPS + ",audioSampleRate:" + this.audioSampleRate + "audioChannels，" + this.audioChannels + ",url:" + this.url + ",ipv6url" + this.ipv6Url + ",videoCode:" + this.videoCodecType + "sei:" + this.sei.toString() + "cdnType:" + this.cdnType + "businessType:" + this.businessType + '>';
    }
}
