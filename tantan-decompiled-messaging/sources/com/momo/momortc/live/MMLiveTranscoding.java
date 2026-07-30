package com.momo.momortc.live;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class MMLiveTranscoding {
    public String channelid;
    public String uid;
    public String url;
    private final int TRANSINFO_LEN = 2048;
    public Map<String, MMLiveTranscodingUser> transcodingUserMap = new ConcurrentHashMap();
    public double width = 540.0d;
    public double height = 960.0d;
    public int videoBitrate = 1024000;
    public int videoFramerate = 30;
    public boolean lowLatency = true;
    public int videoGop = 1;
    public MMLiveVideoCodecProfileType videoCodecProfile = MMLiveVideoCodecProfileType.MMLiveVideoCodecProfileTypeHigh;
    public int audioBitrate = 65536;
    public int audioChannels = 1;
    public MMLiveAudioSampleRateType audioSampleRate = MMLiveAudioSampleRateType.MMLiveAudioSampleRateType48000;
    public MMLiveVideoImage watermark = null;
    public MMLiveVideoImage backgroundImage = null;
    public String transcodingExtraInfo = "";

    public enum MMLiveAudioSampleRateType {
        MMLiveAudioSampleRateType32000(32000),
        MMLiveAudioSampleRateType44100(44100),
        MMLiveAudioSampleRateType48000(48000);

        private final int value;

        MMLiveAudioSampleRateType(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public static class MMLiveTranscodingUser {
        public double alpha;
        public double height;
        public double posx;
        public double posy;
        public String uid;
        public double width;
        public int zOrder;
    }

    public enum MMLiveVideoCodecProfileType {
        MMLiveVideoCodecProfileTypeBaseLine(66),
        MMLiveVideoCodecProfileTypeMain(77),
        MMLiveVideoCodecProfileTypeHigh(100);

        private final int value;

        MMLiveVideoCodecProfileType(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public class MMLiveVideoImage {
        long posx = 0;
        long posy = 0;
        long width = 0;
        long height = 0;
        String url = "";

        public MMLiveVideoImage() {
        }
    }

    public int getAudioBitrate() {
        return this.audioBitrate;
    }

    public int getAudioChannels() {
        return this.audioChannels;
    }

    public int getAudioSampleRate() {
        return this.audioSampleRate.getValue();
    }

    public MMLiveVideoImage getBackgroundImage() {
        return this.backgroundImage;
    }

    public String getChannelid() {
        return this.channelid;
    }

    public double getHeight() {
        return this.height;
    }

    public String getTranscodingExtraInfo() {
        return this.transcodingExtraInfo;
    }

    public Map<String, MMLiveTranscodingUser> getTranscodingUserMap() {
        return this.transcodingUserMap;
    }

    public String getUid() {
        return this.uid;
    }

    public String getUrl() {
        return this.url;
    }

    public int getVideoBitrate() {
        return this.videoBitrate;
    }

    public int getVideoCodecProfile() {
        return this.videoCodecProfile.getValue();
    }

    public int getVideoFramerate() {
        return this.videoFramerate;
    }

    public int getVideoGop() {
        return this.videoGop;
    }

    public MMLiveVideoImage getWatermark() {
        return this.watermark;
    }

    public double getWidth() {
        return this.width;
    }

    public boolean isLowLatency() {
        return this.lowLatency;
    }

    public void setAudioBitrate(int i) {
        this.audioBitrate = i;
    }

    public void setAudioChannels(int i) {
        this.audioChannels = i;
    }

    public void setAudioSampleRate(MMLiveAudioSampleRateType mMLiveAudioSampleRateType) {
        this.audioSampleRate = mMLiveAudioSampleRateType;
    }

    public void setBackgroundImage(MMLiveVideoImage mMLiveVideoImage) {
        this.backgroundImage = mMLiveVideoImage;
    }

    public void setChannelid(String str) {
        this.channelid = str;
    }

    public void setHeight(double d) {
        this.height = d;
    }

    public void setLowLatency(boolean z) {
        this.lowLatency = z;
    }

    public void setTranscodingExtraInfo(String str) {
        this.transcodingExtraInfo = str;
    }

    public void setTranscodingUserMap(Map<String, MMLiveTranscodingUser> map) {
        this.transcodingUserMap = map;
    }

    public void setUid(String str) {
        this.uid = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setVideoBitrate(int i) {
        this.videoBitrate = i;
    }

    public void setVideoCodecProfile(MMLiveVideoCodecProfileType mMLiveVideoCodecProfileType) {
        this.videoCodecProfile = mMLiveVideoCodecProfileType;
    }

    public void setVideoFramerate(int i) {
        this.videoFramerate = i;
    }

    public void setVideoGop(int i) {
        this.videoGop = i;
    }

    public void setWatermark(MMLiveVideoImage mMLiveVideoImage) {
        this.watermark = mMLiveVideoImage;
    }

    public void setWidth(double d) {
        this.width = d;
    }
}
