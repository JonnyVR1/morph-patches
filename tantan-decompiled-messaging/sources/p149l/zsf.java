package p149l;

import androidx.annotation.NonNull;
import com.core.glcore.util.ArrayUtils;
import com.core.glcore.util.MMCvInfoHelper;
import com.momocv.SingleFaceInfo;
import com.momocv.videoprocessor.FaceAttribute;

/* JADX INFO: loaded from: classes.dex */
public class zsf implements Cloneable {

    /* JADX INFO: renamed from: a */
    private SingleFaceInfo f204590a;

    /* JADX INFO: renamed from: b */
    private FaceAttribute f204591b;

    /* JADX INFO: renamed from: A */
    public float[] m220006A() {
        return this.f204591b.warped_landmarks68_;
    }

    /* JADX INFO: renamed from: B */
    public float[] m220007B() {
        return this.f204591b.warped_landmarks96_;
    }

    /* JADX INFO: renamed from: C */
    public void m220008C(FaceAttribute faceAttribute) {
        this.f204591b = faceAttribute;
    }

    /* JADX INFO: renamed from: D */
    public void m220009D(SingleFaceInfo singleFaceInfo) {
        this.f204590a = singleFaceInfo;
    }

    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public zsf clone() {
        zsf zsfVar = new zsf();
        if (this.f204591b != null) {
            FaceAttribute faceAttribute = new FaceAttribute();
            zsfVar.f204591b = faceAttribute;
            faceAttribute.skin_threshold_ = ArrayUtils.bunshin(this.f204591b.skin_threshold_);
            zsfVar.f204591b.warped_landmarks68_ = ArrayUtils.bunshin(this.f204591b.warped_landmarks68_);
            zsfVar.f204591b.warped_landmarks96_ = ArrayUtils.bunshin(this.f204591b.warped_landmarks96_);
            zsfVar.f204591b.warped_landmarks104_ = ArrayUtils.bunshin(this.f204591b.warped_landmarks104_);
            zsfVar.f204591b.warped_landmarks240_ = ArrayUtils.bunshin(this.f204591b.warped_landmarks240_);
            zsfVar.f204591b.warped_landmarks106_ = ArrayUtils.bunshin(this.f204591b.warped_landmarks106_);
            FaceAttribute faceAttribute2 = zsfVar.f204591b;
            FaceAttribute faceAttribute3 = this.f204591b;
            faceAttribute2.left_eye_close_prob_ = faceAttribute3.left_eye_close_prob_;
            faceAttribute2.right_eye_close_prob_ = faceAttribute3.right_eye_close_prob_;
            faceAttribute2.expression_ = faceAttribute3.expression_;
        }
        zsfVar.f204590a = MMCvInfoHelper.clone(this.f204590a);
        return zsfVar;
    }

    /* JADX INFO: renamed from: b */
    public float[] m220011b() {
        return this.f204590a.camera_matrix_;
    }

    /* JADX INFO: renamed from: c */
    public float[] m220012c() {
        return this.f204590a.euler_angles_;
    }

    /* JADX INFO: renamed from: d */
    public int m220013d() {
        return this.f204591b.expression_;
    }

    /* JADX INFO: renamed from: e */
    public float[] m220014e() {
        return this.f204590a.face_rect_;
    }

    /* JADX INFO: renamed from: f */
    public float m220015f() {
        return this.f204590a.face_rotate_degree_2d_;
    }

    /* JADX INFO: renamed from: j */
    public float[] m220016j() {
        return this.f204590a.landmarks_104_;
    }

    /* JADX INFO: renamed from: k */
    public float[] m220017k() {
        return this.f204590a.landmarks_222_;
    }

    /* JADX INFO: renamed from: l */
    public float[] m220018l() {
        return this.f204590a.landmarks_68_;
    }

    /* JADX INFO: renamed from: m */
    public float[] m220019m() {
        return this.f204590a.landmarks_96_;
    }

    /* JADX INFO: renamed from: n */
    public float m220020n() {
        return this.f204591b.left_eye_close_prob_;
    }

    /* JADX INFO: renamed from: o */
    public float[] m220021o() {
        return this.f204590a.modelview_matrix_;
    }

    /* JADX INFO: renamed from: p */
    public float[] m220022p() {
        return this.f204590a.orig_face_rect_;
    }

    /* JADX INFO: renamed from: q */
    public float[] m220023q() {
        return this.f204590a.orig_landmarks_222_;
    }

    /* JADX INFO: renamed from: r */
    public float[] m220024r() {
        return this.f204590a.orig_landmarks_104_;
    }

    /* JADX INFO: renamed from: s */
    public float[] m220025s() {
        return this.f204590a.projection_matrix_opengl_;
    }

    /* JADX INFO: renamed from: t */
    public float m220026t() {
        return this.f204591b.right_eye_close_prob_;
    }

    /* JADX INFO: renamed from: u */
    public float[] m220027u() {
        return this.f204590a.rotation_matrix_;
    }

    /* JADX INFO: renamed from: v */
    public float[] m220028v() {
        return this.f204590a.rotation_vector_;
    }

    /* JADX INFO: renamed from: w */
    public int[] m220029w() {
        return this.f204591b.skin_threshold_;
    }

    /* JADX INFO: renamed from: x */
    public int m220030x() {
        return this.f204590a.tracking_id_;
    }

    /* JADX INFO: renamed from: y */
    public float[] m220031y() {
        return this.f204590a.translation_vector_;
    }

    /* JADX INFO: renamed from: z */
    public float[] m220032z() {
        return this.f204591b.warped_landmarks104_;
    }
}
