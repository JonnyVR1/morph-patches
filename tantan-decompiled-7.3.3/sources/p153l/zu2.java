package p153l;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes7.dex */
public class zu2 {

    @SerializedName("face_skip")
    private int faceSkip;

    @SerializedName("use_filter_scale")
    public c6k0 useFilterScale;

    @SerializedName("use_lut")
    public d6k0 useLut;

    @SerializedName("use_new_skinsmoothing")
    private int useNewSkinsmoothing;

    @SerializedName("use_new_whiten")
    private int useNewWhiten;

    @SerializedName("use_usm_contrast")
    private int useUsmContrast;

    @SerializedName("use_usm_enable")
    private int useUsmEnable;

    @SerializedName("use_usm_radius")
    private int useUsmRadius;

    @SerializedName("use_usm_saturation")
    private int useUsmSaturation;

    @SerializedName("use_usm_scale")
    private int useUsmScale;

    @SerializedName("use_usm_threshold")
    private int useUsmThreshold;

    /* JADX INFO: renamed from: a */
    public int m221592a() {
        return this.faceSkip;
    }

    /* JADX INFO: renamed from: b */
    public c6k0 m221593b() {
        return this.useFilterScale;
    }

    /* JADX INFO: renamed from: c */
    public d6k0 m221594c() {
        return this.useLut;
    }

    /* JADX INFO: renamed from: d */
    public int m221595d() {
        return this.useUsmContrast;
    }

    /* JADX INFO: renamed from: e */
    public int m221596e() {
        return this.useUsmEnable;
    }

    /* JADX INFO: renamed from: f */
    public int m221597f() {
        return this.useUsmSaturation;
    }

    /* JADX INFO: renamed from: g */
    public int m221598g() {
        return this.useUsmScale;
    }

    public String toString() {
        return "BeautyConfig{useUsmEnable=" + this.useUsmEnable + ", useUsmScale=" + this.useUsmScale + ", useUsmSaturation=" + this.useUsmSaturation + ", useUsmContrast=" + this.useUsmContrast + ", useUsmRadius=" + this.useUsmRadius + ", useUsmThreshold=" + this.useUsmThreshold + ", useNewWhiten=" + this.useNewWhiten + ", useNewSkinsmoothing=" + this.useNewSkinsmoothing + ", faceSkip=" + this.faceSkip + ", useLut=" + this.useLut + ", useFilterScale=" + this.useFilterScale + '}';
    }
}
