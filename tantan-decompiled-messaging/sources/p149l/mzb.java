package p149l;

import com.google.gson.annotations.SerializedName;
import com.p046p1.mobile.putong.app.media.MediaFrontService;

/* JADX INFO: loaded from: classes7.dex */
public class mzb {

    @SerializedName(MediaFrontService.BUSINESS_TYPE)
    private int businessType;

    @SerializedName("enable_beauty")
    private boolean enableBeauty;

    @SerializedName("enable_expression")
    private boolean enableExpression;

    @SerializedName("enable_eye_classify")
    private boolean enableEyeClassify;

    @SerializedName("enable_face_warp_gradual")
    private boolean enableFaceWarpGradual;

    @SerializedName("enable_skin")
    private boolean enableSkin;

    @SerializedName("face_alignment_version")
    private int faceAlignmentVersion;

    @SerializedName("face_warp_gradual_thresh")
    private int faceWarpGradualThresh;

    @SerializedName("max_faces")
    private int maxFaces;

    @SerializedName("npd_accelerate")
    private boolean npdAccelerate;

    @SerializedName("pose_estimation_type")
    private int poseEstimationType;

    @SerializedName("pose_stable_coef")
    private int poseStableCoef;

    @SerializedName("use_mix")
    private boolean useMix;

    @SerializedName("use_npd")
    private boolean useNpd;

    /* JADX INFO: renamed from: a */
    public int m157119a() {
        return this.businessType;
    }

    /* JADX INFO: renamed from: b */
    public int m157120b() {
        return this.faceAlignmentVersion;
    }

    /* JADX INFO: renamed from: c */
    public int m157121c() {
        return this.faceWarpGradualThresh;
    }

    /* JADX INFO: renamed from: d */
    public int m157122d() {
        return this.maxFaces;
    }

    /* JADX INFO: renamed from: e */
    public int m157123e() {
        return this.poseEstimationType;
    }

    /* JADX INFO: renamed from: f */
    public int m157124f() {
        return this.poseStableCoef;
    }

    /* JADX INFO: renamed from: g */
    public boolean m157125g() {
        return this.enableBeauty;
    }

    /* JADX INFO: renamed from: h */
    public boolean m157126h() {
        return this.enableExpression;
    }

    /* JADX INFO: renamed from: i */
    public boolean m157127i() {
        return this.enableEyeClassify;
    }

    /* JADX INFO: renamed from: j */
    public boolean m157128j() {
        return this.enableFaceWarpGradual;
    }

    /* JADX INFO: renamed from: k */
    public boolean m157129k() {
        return this.enableSkin;
    }

    /* JADX INFO: renamed from: l */
    public boolean m157130l() {
        return this.npdAccelerate;
    }

    /* JADX INFO: renamed from: m */
    public boolean m157131m() {
        return this.useMix;
    }

    /* JADX INFO: renamed from: n */
    public boolean m157132n() {
        return this.useNpd;
    }

    public String toString() {
        return "CvConfig{businessType=" + this.businessType + ", faceAlignmentVersion=" + this.faceAlignmentVersion + ", maxFaces=" + this.maxFaces + ", poseEstimationType=" + this.poseEstimationType + ", poseStableCoef=" + this.poseStableCoef + ", faceWarpGradualThresh=" + this.faceWarpGradualThresh + ", npdAccelerate=" + this.npdAccelerate + ", useNpd=" + this.useNpd + ", useMix=" + this.useMix + ", enableExpression=" + this.enableExpression + ", enableEyeClassify=" + this.enableEyeClassify + ", enableBeauty=" + this.enableBeauty + ", enableSkin=" + this.enableSkin + ", enableFaceWarpGradual=" + this.enableFaceWarpGradual + '}';
    }
}
