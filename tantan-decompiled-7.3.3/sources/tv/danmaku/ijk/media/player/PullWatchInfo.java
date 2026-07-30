package tv.danmaku.ijk.media.player;

import android.os.SystemClock;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import p153l.t9c;

/* JADX INFO: loaded from: classes3.dex */
public class PullWatchInfo {
    public static final String TAG = "PullWatchInfo";
    public long audioBitRate;
    public int audioBuffer;
    public int audioSampleRate;
    private int bufferCurrent;
    private int bufferFirst;
    private int bufferInternal;
    private int bufferLast;
    private int bufferNext;
    public String cpuAndMem;
    public int delay;
    public String dstip;
    public int fps;
    private String playerType;
    private String pullDetects;
    public String url;
    public long videoBitRate;
    public int videoBuffer;
    private int enable = -1;
    private int baseMark = -1;
    private int speedupMark = -1;
    private int dropMark = -1;
    private float speedRate = -1.0f;
    private int videoFirstRender = -1;
    private int audioFistRender = -1;
    private boolean droping = false;
    private int dropingCount = 0;
    private long mShowupDebugInfoIndex = 0;
    private String dns = "";
    private long currentTimeMs = -1;
    private long pre_VideoOutputFrames = 0;
    private long pre_AudioSize = 0;
    private long pre_VideoSize = 0;
    public int width = 0;
    public int height = 0;
    public int isH265 = 0;
    private int mUpdateMaxBuffer = 0;

    public void dropFrameMessage(boolean z) {
        this.droping = z;
        if (z) {
            this.dropingCount++;
        }
    }

    public void reset() {
        t9c.m189743a(TAG, "reset");
        this.mShowupDebugInfoIndex = 0L;
        this.enable = -1;
        this.baseMark = -1;
        this.speedupMark = -1;
        this.dropMark = -1;
        this.speedRate = -1.0f;
        this.droping = false;
        this.dropingCount = 0;
        this.pullDetects = "";
        this.url = "";
        this.cpuAndMem = "";
        this.fps = 0;
        this.videoBuffer = 0;
        this.audioBuffer = 0;
        this.delay = 0;
        this.videoFirstRender = 0;
        this.audioFistRender = 0;
        this.currentTimeMs = -1L;
        this.audioBitRate = 0L;
        this.videoBitRate = 0L;
        this.pre_VideoOutputFrames = 0L;
        this.pre_AudioSize = 0L;
        this.pre_VideoSize = 0L;
        this.width = 0;
        this.height = 0;
    }

    public void setAudioSampleRate(int i) {
        this.audioSampleRate = i;
    }

    public void setBufferParms(int i, int i2, int i3, int i4, int i5) {
        this.bufferFirst = i;
        this.bufferCurrent = i2;
        this.bufferNext = i3;
        this.bufferLast = i4;
        this.bufferInternal = i5;
    }

    public void setDstIp(String str) {
        this.dstip = str;
    }

    public void setPlayerType(String str) {
        this.playerType = str;
    }

    public void setPullDebugInfoParms(long j, long j2, long j3, int i, int i2, int i3, int i4, int i5, String str, String str2) {
        if (this.currentTimeMs == -1) {
            this.fps = 0;
            this.audioBitRate = 0L;
            this.videoBitRate = 0L;
        } else {
            long jElapsedRealtime = (SystemClock.elapsedRealtime() - this.currentTimeMs) / 1000;
            if (jElapsedRealtime != 0) {
                this.fps = (int) ((j3 - this.pre_VideoOutputFrames) / jElapsedRealtime);
                long j4 = jElapsedRealtime * 1024;
                this.audioBitRate = ((j - this.pre_AudioSize) * 8) / j4;
                this.videoBitRate = ((j2 - this.pre_VideoSize) * 8) / j4;
                t9c.m189743a(TAG, "fps " + (j3 - this.pre_VideoOutputFrames) + "   " + this.fps);
                t9c.m189743a(TAG, "audioBitRate " + (j - this.pre_AudioSize) + "   " + this.audioBitRate);
                t9c.m189743a(TAG, "videoBitRate " + (j2 - this.pre_VideoSize) + "   " + this.videoBitRate);
            }
        }
        this.pre_AudioSize = j;
        this.pre_VideoSize = j2;
        this.pre_VideoOutputFrames = j3;
        this.currentTimeMs = SystemClock.elapsedRealtime();
        this.videoBuffer = i3;
        this.audioBuffer = i4;
        this.delay = i5;
        this.cpuAndMem = str;
        this.pullDetects = str2;
        this.videoFirstRender = i2;
        this.audioFistRender = i;
    }

    public void setPullDebugInfoWH(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public void setSpeedupParms(int i, int i2, int i3, int i4, float f) {
        this.enable = i;
        this.baseMark = i2;
        this.speedupMark = i3;
        this.dropMark = i4;
        this.speedRate = f;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setVideoIsH265(int i) {
        this.isH265 = i;
    }

    public String showPullInfos() {
        StringBuilder sb = new StringBuilder();
        this.mShowupDebugInfoIndex++;
        sb.append("player: " + this.playerType + SignParameters.NEW_LINE);
        sb.append("i: " + this.mShowupDebugInfoIndex + SignParameters.NEW_LINE);
        sb.append("fps: " + this.fps + "/" + this.width + "/" + this.height + SignParameters.NEW_LINE);
        StringBuilder sb2 = new StringBuilder("delay: ");
        sb2.append(this.delay);
        sb2.append(SignParameters.NEW_LINE);
        sb.append(sb2.toString());
        sb.append("audioSampleRate: " + this.audioSampleRate + SignParameters.NEW_LINE);
        sb.append("v buffer: " + this.videoBuffer + " Ms\n");
        sb.append("a buffer: " + this.audioBuffer + " Ms\n");
        sb.append("bitrate/v/a: " + this.videoBitRate + "/" + this.audioBitRate + " kbps\n");
        StringBuilder sb3 = new StringBuilder("cpu/mem : ");
        sb3.append(this.cpuAndMem);
        sb3.append(" MB\n");
        sb.append(sb3.toString());
        sb.append("ip : " + this.dstip + SignParameters.NEW_LINE);
        sb.append("url：" + this.url + SignParameters.NEW_LINE);
        sb.append("isH265:" + this.isH265 + SignParameters.NEW_LINE);
        return sb.toString();
    }

    public void updateMaxBufferLog(int i) {
        this.mUpdateMaxBuffer = i;
    }
}
