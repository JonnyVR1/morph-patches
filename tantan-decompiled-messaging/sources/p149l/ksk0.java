package p149l;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class ksk0 {

    @SerializedName("abr_coefficient")
    private int abrCoefficient;

    @SerializedName("abr_duration")
    private int abrDuration;

    @SerializedName("audio_stacking_duration")
    private int audioStackingDuration;

    @SerializedName("detection_interval")
    private int detectionInterval;

    @SerializedName("down_audio_duration")
    private int downAudioDuration;

    @SerializedName("increase_br_step")
    private int increaseBrStep;

    @SerializedName("netspeed_bad_count")
    private int netspeedBadCount;

    @SerializedName("netspeed_good_count")
    private int netspeedGoodCount;

    @SerializedName("push_level_change")
    private int pushLevelChange;

    @SerializedName("up_audio_duration")
    private int upAudioDuration;

    @SerializedName("vbr_list")
    public List<lsk0> vbrList;

    /* JADX INFO: renamed from: a */
    public int m147084a() {
        return this.abrCoefficient;
    }

    /* JADX INFO: renamed from: b */
    public int m147085b() {
        return this.abrDuration;
    }

    /* JADX INFO: renamed from: c */
    public int m147086c() {
        return this.audioStackingDuration;
    }

    /* JADX INFO: renamed from: d */
    public int m147087d() {
        return this.detectionInterval;
    }

    /* JADX INFO: renamed from: e */
    public int m147088e() {
        return this.downAudioDuration;
    }

    /* JADX INFO: renamed from: f */
    public int m147089f() {
        return this.increaseBrStep;
    }

    /* JADX INFO: renamed from: g */
    public int m147090g() {
        return this.netspeedBadCount;
    }

    /* JADX INFO: renamed from: h */
    public int m147091h() {
        return this.netspeedGoodCount;
    }

    /* JADX INFO: renamed from: i */
    public int m147092i() {
        return this.pushLevelChange;
    }

    /* JADX INFO: renamed from: j */
    public int m147093j() {
        return this.upAudioDuration;
    }

    /* JADX INFO: renamed from: k */
    public List<lsk0> m147094k() {
        return this.vbrList;
    }

    public String toString() {
        return "VbrConfig{audioStackingDuration=" + this.audioStackingDuration + ", downAudioDuration=" + this.downAudioDuration + ", upAudioDuration=" + this.upAudioDuration + ", detectionInterval=" + this.detectionInterval + ", netspeedBadCount=" + this.netspeedBadCount + ", netspeedGoodCount=" + this.netspeedGoodCount + ", abrCoefficient=" + this.abrCoefficient + ", abrDuration=" + this.abrDuration + ", pushLevelChange=" + this.pushLevelChange + ", increaseBrStep=" + this.increaseBrStep + ", vbrList=" + this.vbrList + '}';
    }
}
