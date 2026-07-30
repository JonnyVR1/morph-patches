package p153l;

import com.momocv.BaseParams;
import com.momocv.FaceParams;
import com.momocv.bodylandmark.BodyLandmarkParams;
import com.momocv.express.ExpressParams;
import com.momocv.handsg.HandsgParams;
import com.momocv.segmentation.SegmentationParams;
import com.momocv.videoprocessor.VideoParams;

/* JADX INFO: loaded from: classes.dex */
public class lnw {

    /* JADX INFO: renamed from: a */
    BaseParams f132844a;

    /* JADX INFO: renamed from: b */
    VideoParams f132845b;

    /* JADX INFO: renamed from: c */
    FaceParams f132846c;

    /* JADX INFO: renamed from: d */
    SegmentationParams f132847d;

    /* JADX INFO: renamed from: e */
    BodyLandmarkParams f132848e;

    /* JADX INFO: renamed from: f */
    ExpressParams f132849f;

    /* JADX INFO: renamed from: g */
    HandsgParams f132850g;

    /* JADX INFO: renamed from: h */
    int f132851h;

    public lnw(int i) {
        this.f132844a = null;
        this.f132845b = null;
        this.f132846c = null;
        this.f132847d = null;
        this.f132848e = null;
        this.f132851h = i;
        switch (i) {
            case 1:
                VideoParams videoParams = new VideoParams();
                this.f132845b = videoParams;
                this.f132844a = videoParams;
                this.f132846c = videoParams;
                break;
            case 2:
                FaceParams faceParams = new FaceParams();
                this.f132846c = faceParams;
                this.f132844a = faceParams;
                break;
            case 3:
                this.f132846c = new FaceParams();
                break;
            case 4:
                SegmentationParams segmentationParams = new SegmentationParams();
                this.f132847d = segmentationParams;
                this.f132844a = segmentationParams;
                break;
            case 5:
                BodyLandmarkParams bodyLandmarkParams = new BodyLandmarkParams();
                this.f132848e = bodyLandmarkParams;
                this.f132844a = bodyLandmarkParams;
                break;
            case 6:
                ExpressParams expressParams = new ExpressParams();
                this.f132849f = expressParams;
                this.f132844a = expressParams;
                break;
            case 7:
                HandsgParams handsgParams = new HandsgParams();
                this.f132850g = handsgParams;
                this.f132844a = handsgParams;
                break;
        }
    }

    /* JADX INFO: renamed from: A */
    public void m154993A(int i) {
        this.f132844a.rotate_degree_ = i;
    }

    /* JADX INFO: renamed from: B */
    public void m154994B(boolean z) {
        this.f132846c.save_features_ = z;
    }

    /* JADX INFO: renamed from: C */
    public void m154995C(float f) {
        this.f132844a.scale_factor_ = f;
    }

    /* JADX INFO: renamed from: D */
    public void m154996D(boolean z) {
        this.f132845b.mouth_sg = z;
    }

    /* JADX INFO: renamed from: E */
    public void m154997E(boolean z) {
        this.f132847d.video_mode_ = z;
    }

    /* JADX INFO: renamed from: F */
    public void m154998F(boolean z) {
        this.f132845b.skin_switch_ = z;
    }

    /* JADX INFO: renamed from: G */
    public void m154999G(boolean z) {
        this.f132846c.supper_stable_mode_ = z;
    }

    /* JADX INFO: renamed from: H */
    public void m155000H(boolean z) {
        BodyLandmarkParams bodyLandmarkParams = this.f132848e;
        if (bodyLandmarkParams != null) {
            bodyLandmarkParams.use_tracking_ = z;
        }
    }

    /* JADX INFO: renamed from: I */
    public void m155001I(boolean z) {
        this.f132846c.use_mix_ = z;
    }

    /* JADX INFO: renamed from: J */
    public void m155002J(boolean z) {
        this.f132846c.use_npd_ = z;
    }

    /* JADX INFO: renamed from: K */
    public void m155003K(float f) {
        this.f132845b.warp_level1_ = f;
    }

    /* JADX INFO: renamed from: L */
    public void m155004L(float f) {
        this.f132845b.warp_level2_ = f;
    }

    /* JADX INFO: renamed from: M */
    public void m155005M(int i) {
        this.f132845b.warp_type_ = i;
    }

    /* JADX INFO: renamed from: a */
    public BodyLandmarkParams m155006a() {
        return this.f132848e;
    }

    /* JADX INFO: renamed from: b */
    public ExpressParams m155007b() {
        return this.f132849f;
    }

    /* JADX INFO: renamed from: c */
    public BaseParams m155008c() {
        switch (this.f132851h) {
            case 1:
                return this.f132845b;
            case 2:
                return this.f132846c;
            case 3:
                return this.f132844a;
            case 4:
                return this.f132847d;
            case 5:
                return this.f132848e;
            case 6:
                return this.f132849f;
            case 7:
                return this.f132850g;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public int m155009d() {
        return this.f132844a.restore_degree_;
    }

    /* JADX INFO: renamed from: e */
    public int m155010e() {
        return this.f132844a.rotate_degree_;
    }

    /* JADX INFO: renamed from: f */
    public VideoParams m155011f() {
        return this.f132845b;
    }

    /* JADX INFO: renamed from: g */
    public boolean m155012g() {
        return this.f132844a.fliped_show_;
    }

    /* JADX INFO: renamed from: h */
    public void m155013h(boolean z) {
        this.f132846c.asynchronous_face_detect_ = z;
    }

    /* JADX INFO: renamed from: i */
    public void m155014i(boolean z) {
        this.f132845b.beauty_switch_ = z;
    }

    /* JADX INFO: renamed from: j */
    public void m155015j(int i) {
        this.f132844a.business_type_ = i;
    }

    /* JADX INFO: renamed from: k */
    public void m155016k(boolean z) {
        this.f132845b.expression_switch_ = z;
    }

    /* JADX INFO: renamed from: l */
    public void m155017l(boolean z) {
        this.f132845b.eye_classify_switch_ = z;
    }

    /* JADX INFO: renamed from: m */
    public void m155018m(int i) {
        this.f132845b.face_alignment_version_ = i;
    }

    /* JADX INFO: renamed from: n */
    public void m155019n(boolean z) {
        this.f132845b.face_warp_gradual_switch_ = z;
    }

    /* JADX INFO: renamed from: o */
    public void m155020o(int i) {
        this.f132845b.face_warp_gradual_thresh_ = i;
    }

    /* JADX INFO: renamed from: p */
    public void m155021p(boolean z) {
        this.f132844a.fliped_show_ = z;
    }

    /* JADX INFO: renamed from: q */
    public void m155022q(int i) {
        this.f132845b.frame_interval_ = i;
    }

    /* JADX INFO: renamed from: r */
    public void m155023r(int i) {
        this.f132845b.video_processor_frame_skip_ = i;
    }

    /* JADX INFO: renamed from: s */
    public void m155024s(int i) {
        this.f132846c.max_faces_ = i;
    }

    /* JADX INFO: renamed from: t */
    public void m155025t(boolean z) {
        this.f132846c.npd_accelerate_ = z;
    }

    /* JADX INFO: renamed from: u */
    public void m155026u(float[][] fArr) {
        this.f132849f.orig_face_rect_ = fArr;
    }

    /* JADX INFO: renamed from: v */
    public void m155027v(float[][] fArr) {
        this.f132849f.origin_landmarks96_ = fArr;
    }

    /* JADX INFO: renamed from: w */
    public void m155028w(int i) {
        this.f132845b.pose_estimation_type_ = i;
    }

    /* JADX INFO: renamed from: x */
    public void m155029x(int i) {
        this.f132846c.pose_estimation_type_ = i;
    }

    /* JADX INFO: renamed from: y */
    public void m155030y(float f) {
        this.f132846c.pose_stable_coef_ = f;
    }

    /* JADX INFO: renamed from: z */
    public void m155031z(int i) {
        this.f132844a.restore_degree_ = i;
    }

    public lnw() {
        this.f132844a = null;
        this.f132845b = null;
        this.f132846c = null;
        this.f132847d = null;
        this.f132848e = null;
        this.f132851h = 1;
        VideoParams videoParams = new VideoParams();
        this.f132845b = videoParams;
        this.f132844a = videoParams;
        this.f132846c = videoParams;
        this.f132851h = 1;
    }
}
