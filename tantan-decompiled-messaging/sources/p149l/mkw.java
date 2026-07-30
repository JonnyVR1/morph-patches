package p149l;

import com.momocv.BaseParams;
import com.momocv.FaceParams;
import com.momocv.bodylandmark.BodyLandmarkParams;
import com.momocv.express.ExpressParams;
import com.momocv.handsg.HandsgParams;
import com.momocv.segmentation.SegmentationParams;
import com.momocv.videoprocessor.VideoParams;

/* JADX INFO: loaded from: classes.dex */
public class mkw {

    /* JADX INFO: renamed from: a */
    BaseParams f134385a;

    /* JADX INFO: renamed from: b */
    VideoParams f134386b;

    /* JADX INFO: renamed from: c */
    FaceParams f134387c;

    /* JADX INFO: renamed from: d */
    SegmentationParams f134388d;

    /* JADX INFO: renamed from: e */
    BodyLandmarkParams f134389e;

    /* JADX INFO: renamed from: f */
    ExpressParams f134390f;

    /* JADX INFO: renamed from: g */
    HandsgParams f134391g;

    /* JADX INFO: renamed from: h */
    int f134392h;

    public mkw(int i) {
        this.f134385a = null;
        this.f134386b = null;
        this.f134387c = null;
        this.f134388d = null;
        this.f134389e = null;
        this.f134392h = i;
        switch (i) {
            case 1:
                VideoParams videoParams = new VideoParams();
                this.f134386b = videoParams;
                this.f134385a = videoParams;
                this.f134387c = videoParams;
                break;
            case 2:
                FaceParams faceParams = new FaceParams();
                this.f134387c = faceParams;
                this.f134385a = faceParams;
                break;
            case 3:
                this.f134387c = new FaceParams();
                break;
            case 4:
                SegmentationParams segmentationParams = new SegmentationParams();
                this.f134388d = segmentationParams;
                this.f134385a = segmentationParams;
                break;
            case 5:
                BodyLandmarkParams bodyLandmarkParams = new BodyLandmarkParams();
                this.f134389e = bodyLandmarkParams;
                this.f134385a = bodyLandmarkParams;
                break;
            case 6:
                ExpressParams expressParams = new ExpressParams();
                this.f134390f = expressParams;
                this.f134385a = expressParams;
                break;
            case 7:
                HandsgParams handsgParams = new HandsgParams();
                this.f134391g = handsgParams;
                this.f134385a = handsgParams;
                break;
        }
    }

    /* JADX INFO: renamed from: A */
    public void m155066A(int i) {
        this.f134385a.rotate_degree_ = i;
    }

    /* JADX INFO: renamed from: B */
    public void m155067B(boolean z) {
        this.f134387c.save_features_ = z;
    }

    /* JADX INFO: renamed from: C */
    public void m155068C(float f) {
        this.f134385a.scale_factor_ = f;
    }

    /* JADX INFO: renamed from: D */
    public void m155069D(boolean z) {
        this.f134386b.mouth_sg = z;
    }

    /* JADX INFO: renamed from: E */
    public void m155070E(boolean z) {
        this.f134388d.video_mode_ = z;
    }

    /* JADX INFO: renamed from: F */
    public void m155071F(boolean z) {
        this.f134386b.skin_switch_ = z;
    }

    /* JADX INFO: renamed from: G */
    public void m155072G(boolean z) {
        this.f134387c.supper_stable_mode_ = z;
    }

    /* JADX INFO: renamed from: H */
    public void m155073H(boolean z) {
        BodyLandmarkParams bodyLandmarkParams = this.f134389e;
        if (bodyLandmarkParams != null) {
            bodyLandmarkParams.use_tracking_ = z;
        }
    }

    /* JADX INFO: renamed from: I */
    public void m155074I(boolean z) {
        this.f134387c.use_mix_ = z;
    }

    /* JADX INFO: renamed from: J */
    public void m155075J(boolean z) {
        this.f134387c.use_npd_ = z;
    }

    /* JADX INFO: renamed from: K */
    public void m155076K(float f) {
        this.f134386b.warp_level1_ = f;
    }

    /* JADX INFO: renamed from: L */
    public void m155077L(float f) {
        this.f134386b.warp_level2_ = f;
    }

    /* JADX INFO: renamed from: M */
    public void m155078M(int i) {
        this.f134386b.warp_type_ = i;
    }

    /* JADX INFO: renamed from: a */
    public BodyLandmarkParams m155079a() {
        return this.f134389e;
    }

    /* JADX INFO: renamed from: b */
    public ExpressParams m155080b() {
        return this.f134390f;
    }

    /* JADX INFO: renamed from: c */
    public BaseParams m155081c() {
        switch (this.f134392h) {
            case 1:
                return this.f134386b;
            case 2:
                return this.f134387c;
            case 3:
                return this.f134385a;
            case 4:
                return this.f134388d;
            case 5:
                return this.f134389e;
            case 6:
                return this.f134390f;
            case 7:
                return this.f134391g;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public int m155082d() {
        return this.f134385a.restore_degree_;
    }

    /* JADX INFO: renamed from: e */
    public int m155083e() {
        return this.f134385a.rotate_degree_;
    }

    /* JADX INFO: renamed from: f */
    public VideoParams m155084f() {
        return this.f134386b;
    }

    /* JADX INFO: renamed from: g */
    public boolean m155085g() {
        return this.f134385a.fliped_show_;
    }

    /* JADX INFO: renamed from: h */
    public void m155086h(boolean z) {
        this.f134387c.asynchronous_face_detect_ = z;
    }

    /* JADX INFO: renamed from: i */
    public void m155087i(boolean z) {
        this.f134386b.beauty_switch_ = z;
    }

    /* JADX INFO: renamed from: j */
    public void m155088j(int i) {
        this.f134385a.business_type_ = i;
    }

    /* JADX INFO: renamed from: k */
    public void m155089k(boolean z) {
        this.f134386b.expression_switch_ = z;
    }

    /* JADX INFO: renamed from: l */
    public void m155090l(boolean z) {
        this.f134386b.eye_classify_switch_ = z;
    }

    /* JADX INFO: renamed from: m */
    public void m155091m(int i) {
        this.f134386b.face_alignment_version_ = i;
    }

    /* JADX INFO: renamed from: n */
    public void m155092n(boolean z) {
        this.f134386b.face_warp_gradual_switch_ = z;
    }

    /* JADX INFO: renamed from: o */
    public void m155093o(int i) {
        this.f134386b.face_warp_gradual_thresh_ = i;
    }

    /* JADX INFO: renamed from: p */
    public void m155094p(boolean z) {
        this.f134385a.fliped_show_ = z;
    }

    /* JADX INFO: renamed from: q */
    public void m155095q(int i) {
        this.f134386b.frame_interval_ = i;
    }

    /* JADX INFO: renamed from: r */
    public void m155096r(int i) {
        this.f134386b.video_processor_frame_skip_ = i;
    }

    /* JADX INFO: renamed from: s */
    public void m155097s(int i) {
        this.f134387c.max_faces_ = i;
    }

    /* JADX INFO: renamed from: t */
    public void m155098t(boolean z) {
        this.f134387c.npd_accelerate_ = z;
    }

    /* JADX INFO: renamed from: u */
    public void m155099u(float[][] fArr) {
        this.f134390f.orig_face_rect_ = fArr;
    }

    /* JADX INFO: renamed from: v */
    public void m155100v(float[][] fArr) {
        this.f134390f.origin_landmarks96_ = fArr;
    }

    /* JADX INFO: renamed from: w */
    public void m155101w(int i) {
        this.f134386b.pose_estimation_type_ = i;
    }

    /* JADX INFO: renamed from: x */
    public void m155102x(int i) {
        this.f134387c.pose_estimation_type_ = i;
    }

    /* JADX INFO: renamed from: y */
    public void m155103y(float f) {
        this.f134387c.pose_stable_coef_ = f;
    }

    /* JADX INFO: renamed from: z */
    public void m155104z(int i) {
        this.f134385a.restore_degree_ = i;
    }

    public mkw() {
        this.f134385a = null;
        this.f134386b = null;
        this.f134387c = null;
        this.f134388d = null;
        this.f134389e = null;
        this.f134392h = 1;
        VideoParams videoParams = new VideoParams();
        this.f134386b = videoParams;
        this.f134385a = videoParams;
        this.f134387c = videoParams;
        this.f134392h = 1;
    }
}
