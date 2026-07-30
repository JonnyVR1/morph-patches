package p149l;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes7.dex */
public class vf5 {

    @SerializedName("android_cam_cap_switch")
    private int androidCamCapSwitch;

    @SerializedName("android_cam_cap_value")
    private int androidCamCapValue;

    @SerializedName("android_cam_transcribe")
    private int androidCamTranscribe;

    @SerializedName("dynamic_update_params")
    private int dynamicUpdateParams;

    @SerializedName("noise_reduction_mode")
    private int noiseReductionMode;

    @SerializedName("noise_reduction_switch")
    private int noiseReductionSwitch;

    @SerializedName("push_drop_base_water_marker")
    private int pushDropBaseWaterMarker;

    @SerializedName("push_drop_high_water_marker")
    private int pushDropHighWaterMarker;

    @SerializedName("push_drop_switch")
    private int pushDropSwitch;

    @SerializedName("sox")
    private int sox;

    /* JADX INFO: renamed from: a */
    public int m198264a() {
        return this.androidCamCapSwitch;
    }

    /* JADX INFO: renamed from: b */
    public int m198265b() {
        return this.androidCamCapValue;
    }

    /* JADX INFO: renamed from: c */
    public int m198266c() {
        return this.dynamicUpdateParams;
    }

    /* JADX INFO: renamed from: d */
    public int m198267d() {
        return this.noiseReductionMode;
    }

    /* JADX INFO: renamed from: e */
    public int m198268e() {
        return this.noiseReductionSwitch;
    }

    /* JADX INFO: renamed from: f */
    public int m198269f() {
        return this.pushDropBaseWaterMarker;
    }

    /* JADX INFO: renamed from: g */
    public int m198270g() {
        return this.pushDropHighWaterMarker;
    }

    /* JADX INFO: renamed from: h */
    public int m198271h() {
        return this.pushDropSwitch;
    }

    /* JADX INFO: renamed from: i */
    public int m198272i() {
        return this.sox;
    }

    public String toString() {
        return "CommParms{noiseReductionSwitch=" + this.noiseReductionSwitch + ", noiseReductionMode=" + this.noiseReductionMode + ", androidCamCapSwitch=" + this.androidCamCapSwitch + ", androidCamCapValue=" + this.androidCamCapValue + ", sox=" + this.sox + ", androidCamTranscribe=" + this.androidCamTranscribe + ", pushDropSwitch=" + this.pushDropSwitch + ", pushDropHighWaterMarker=" + this.pushDropHighWaterMarker + ", pushDropBaseWaterMarker=" + this.pushDropBaseWaterMarker + ", dynamicUpdateParams=" + this.dynamicUpdateParams + '}';
    }
}
