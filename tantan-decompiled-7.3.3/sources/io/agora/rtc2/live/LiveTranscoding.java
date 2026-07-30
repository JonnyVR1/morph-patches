package io.agora.rtc2.live;

import io.agora.rtc2.video.AgoraImage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes2.dex */
public class LiveTranscoding {
    private ArrayList<AgoraImage> backgroundImageList;

    @Deprecated
    public int userCount;
    private ArrayList<AgoraImage> watermarkList;
    public int width = 360;
    public int height = 640;
    public int videoBitrate = 400;
    public VideoCodecProfileType videoCodecProfile = VideoCodecProfileType.HIGH;
    public VideoCodecType videoCodecType = VideoCodecType.H264;
    public int videoGop = 30;
    public int videoFramerate = 15;

    @Deprecated
    public boolean lowLatency = false;
    public AudioSampleRateType audioSampleRate = AudioSampleRateType.TYPE_44100;
    public int audioBitrate = 48;
    public int audioChannels = 1;
    public AudioCodecProfileType audioCodecProfile = AudioCodecProfileType.LC_AAC;
    private Map<String, Boolean> advancedFeatures = new HashMap();

    @Deprecated
    public int backgroundColor = RoundedDrawable.DEFAULT_BORDER_COLOR;
    public String userConfigExtraInfo = null;

    @Deprecated
    public String metadata = null;
    private Map<Integer, TranscodingUser> transcodingUsers = new HashMap();

    public enum AudioCodecProfileType {
        LC_AAC(0),
        HE_AAC(1),
        HE_AAC_V2(2);

        private int value;

        AudioCodecProfileType(int i) {
            this.value = i;
        }

        public static int getValue(AudioCodecProfileType audioCodecProfileType) {
            return audioCodecProfileType.value;
        }
    }

    public enum AudioSampleRateType {
        TYPE_32000(32000),
        TYPE_44100(44100),
        TYPE_48000(48000);

        private int value;

        AudioSampleRateType(int i) {
            this.value = i;
        }

        public static int getValue(AudioSampleRateType audioSampleRateType) {
            return audioSampleRateType.value;
        }
    }

    public static class TranscodingUser {
        public int audioChannel;
        public int height;
        public String userId;
        public int width;

        /* JADX INFO: renamed from: x */
        public int f64039x;

        /* JADX INFO: renamed from: y */
        public int f64040y;
        public int zOrder;
        public int uid = 0;
        public float alpha = 1.0f;
    }

    public enum VideoCodecProfileType {
        BASELINE(66),
        MAIN(77),
        HIGH(100);

        private int value;

        VideoCodecProfileType(int i) {
            this.value = i;
        }

        public static int getValue(VideoCodecProfileType videoCodecProfileType) {
            return videoCodecProfileType.value;
        }
    }

    public enum VideoCodecType {
        H264(1),
        H265(2);

        private int value;

        VideoCodecType(int i) {
            this.value = i;
        }

        public static int getValue(VideoCodecType videoCodecType) {
            return videoCodecType.value;
        }
    }

    public void addBackgroundImage(AgoraImage agoraImage) {
        if (this.backgroundImageList == null) {
            this.backgroundImageList = new ArrayList<>();
        }
        this.backgroundImageList.add(agoraImage);
    }

    public int addUser(TranscodingUser transcodingUser) {
        if (transcodingUser == null) {
            return -2;
        }
        this.transcodingUsers.put(Integer.valueOf(transcodingUser.uid), transcodingUser);
        this.userCount = this.transcodingUsers.size();
        return 0;
    }

    public void addWatermark(AgoraImage agoraImage) {
        if (this.watermarkList == null) {
            this.watermarkList = new ArrayList<>();
        }
        this.watermarkList.add(agoraImage);
    }

    public Map<String, Boolean> getAdvancedFeatures() {
        return this.advancedFeatures;
    }

    public int getBackgroundColor() {
        return this.backgroundColor;
    }

    public ArrayList<AgoraImage> getBackgroundImageList() {
        return this.backgroundImageList;
    }

    @Deprecated
    public int getBlue() {
        return this.backgroundColor & 255;
    }

    @Deprecated
    public int getGreen() {
        return (this.backgroundColor >> 8) & 255;
    }

    @Deprecated
    public int getRed() {
        return (this.backgroundColor >> 16) & 255;
    }

    public int getUserCount() {
        return this.transcodingUsers.size();
    }

    public final ArrayList<TranscodingUser> getUsers() {
        return new ArrayList<>(this.transcodingUsers.values());
    }

    public ArrayList<AgoraImage> getWatermarkList() {
        return this.watermarkList;
    }

    public boolean removeBackgroundImage(AgoraImage agoraImage) {
        ArrayList<AgoraImage> arrayList = this.backgroundImageList;
        if (arrayList == null) {
            return false;
        }
        return arrayList.remove(agoraImage);
    }

    public int removeUser(int i) {
        if (!this.transcodingUsers.containsKey(Integer.valueOf(i))) {
            return -2;
        }
        this.transcodingUsers.remove(Integer.valueOf(i));
        this.userCount = this.transcodingUsers.size();
        return 0;
    }

    public boolean removeWatermark(AgoraImage agoraImage) {
        ArrayList<AgoraImage> arrayList = this.watermarkList;
        if (arrayList == null) {
            return false;
        }
        return arrayList.remove(agoraImage);
    }

    public void setAdvancedFeatures(String str, Boolean bool) {
        this.advancedFeatures.put(str, bool);
    }

    public void setBackgroundColor(int i, int i2, int i3) {
        this.backgroundColor = (i << 16) | (i2 << 8) | i3;
    }

    @Deprecated
    public void setBlue(int i) {
        this.backgroundColor = i | (getRed() << 16) | (getGreen() << 8);
    }

    @Deprecated
    public void setGreen(int i) {
        int i2 = i << 8;
        this.backgroundColor = i2 | (getRed() << 16) | getBlue();
    }

    @Deprecated
    public void setRed(int i) {
        this.backgroundColor = (i << 16) | (getGreen() << 8) | getBlue();
    }

    public void setUsers(ArrayList<TranscodingUser> arrayList) {
        this.transcodingUsers.clear();
        if (arrayList != null) {
            for (TranscodingUser transcodingUser : arrayList) {
                this.transcodingUsers.put(Integer.valueOf(transcodingUser.uid), transcodingUser);
            }
        }
        this.userCount = this.transcodingUsers.size();
    }

    public void setBackgroundColor(int i) {
        this.backgroundColor = i;
    }

    public void setUsers(Map<Integer, TranscodingUser> map) {
        this.transcodingUsers.clear();
        if (map != null) {
            this.transcodingUsers.putAll(map);
        }
        this.userCount = this.transcodingUsers.size();
    }
}
