package p153l;

import androidx.annotation.NonNull;
import com.core.glcore.util.ArrayUtils;
import com.core.glcore.util.MMCvInfoHelper;
import com.momocv.SingleFaceInfo;
import com.momocv.videoprocessor.FaceAttribute;

/* JADX INFO: loaded from: classes.dex */
public class nuf implements Cloneable {

    /* JADX INFO: renamed from: a */
    private SingleFaceInfo f143704a;

    /* JADX INFO: renamed from: b */
    private FaceAttribute f143705b;

    /* JADX INFO: renamed from: A */
    public float[] m164769A() {
        return this.f143705b.warped_landmarks68_;
    }

    /* JADX INFO: renamed from: B */
    public float[] m164770B() {
        return this.f143705b.warped_landmarks96_;
    }

    /* JADX INFO: renamed from: C */
    public void m164771C(FaceAttribute faceAttribute) {
        this.f143705b = faceAttribute;
    }

    /* JADX INFO: renamed from: D */
    public void m164772D(SingleFaceInfo singleFaceInfo) {
        this.f143704a = singleFaceInfo;
    }

    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public nuf clone() {
        nuf nufVar = new nuf();
        if (this.f143705b != null) {
            FaceAttribute faceAttribute = new FaceAttribute();
            nufVar.f143705b = faceAttribute;
            faceAttribute.skin_threshold_ = ArrayUtils.bunshin(this.f143705b.skin_threshold_);
            nufVar.f143705b.warped_landmarks68_ = ArrayUtils.bunshin(this.f143705b.warped_landmarks68_);
            nufVar.f143705b.warped_landmarks96_ = ArrayUtils.bunshin(this.f143705b.warped_landmarks96_);
            nufVar.f143705b.warped_landmarks104_ = ArrayUtils.bunshin(this.f143705b.warped_landmarks104_);
            nufVar.f143705b.warped_landmarks240_ = ArrayUtils.bunshin(this.f143705b.warped_landmarks240_);
            nufVar.f143705b.warped_landmarks106_ = ArrayUtils.bunshin(this.f143705b.warped_landmarks106_);
            FaceAttribute faceAttribute2 = nufVar.f143705b;
            FaceAttribute faceAttribute3 = this.f143705b;
            faceAttribute2.left_eye_close_prob_ = faceAttribute3.left_eye_close_prob_;
            faceAttribute2.right_eye_close_prob_ = faceAttribute3.right_eye_close_prob_;
            faceAttribute2.expression_ = faceAttribute3.expression_;
        }
        nufVar.f143704a = MMCvInfoHelper.clone(this.f143704a);
        return nufVar;
    }

    /* JADX INFO: renamed from: b */
    public float[] m164774b() {
        return this.f143704a.camera_matrix_;
    }

    /* JADX INFO: renamed from: c */
    public float[] m164775c() {
        return this.f143704a.euler_angles_;
    }

    /* JADX INFO: renamed from: d */
    public int m164776d() {
        return this.f143705b.expression_;
    }

    /* JADX INFO: renamed from: e */
    public float[] m164777e() {
        return this.f143704a.face_rect_;
    }

    /* JADX INFO: renamed from: f */
    public float m164778f() {
        return this.f143704a.face_rotate_degree_2d_;
    }

    /* JADX INFO: renamed from: j */
    public float[] m164779j() {
        return this.f143704a.landmarks_104_;
    }

    /* JADX INFO: renamed from: k */
    public float[] m164780k() {
        return this.f143704a.landmarks_222_;
    }

    /* JADX INFO: renamed from: l */
    public float[] m164781l() {
        return this.f143704a.landmarks_68_;
    }

    /* JADX INFO: renamed from: m */
    public float[] m164782m() {
        return this.f143704a.landmarks_96_;
    }

    /* JADX INFO: renamed from: n */
    public float m164783n() {
        return this.f143705b.left_eye_close_prob_;
    }

    /* JADX INFO: renamed from: o */
    public float[] m164784o() {
        return this.f143704a.modelview_matrix_;
    }

    /* JADX INFO: renamed from: p */
    public float[] m164785p() {
        return this.f143704a.orig_face_rect_;
    }

    /* JADX INFO: renamed from: q */
    public float[] m164786q() {
        return this.f143704a.orig_landmarks_222_;
    }

    /* JADX INFO: renamed from: r */
    public float[] m164787r() {
        return this.f143704a.orig_landmarks_104_;
    }

    /* JADX INFO: renamed from: s */
    public float[] m164788s() {
        return this.f143704a.projection_matrix_opengl_;
    }

    /* JADX INFO: renamed from: t */
    public float m164789t() {
        return this.f143705b.right_eye_close_prob_;
    }

    /* JADX INFO: renamed from: u */
    public float[] m164790u() {
        return this.f143704a.rotation_matrix_;
    }

    /* JADX INFO: renamed from: v */
    public float[] m164791v() {
        return this.f143704a.rotation_vector_;
    }

    /* JADX INFO: renamed from: w */
    public int[] m164792w() {
        return this.f143705b.skin_threshold_;
    }

    /* JADX INFO: renamed from: x */
    public int m164793x() {
        return this.f143704a.tracking_id_;
    }

    /* JADX INFO: renamed from: y */
    public float[] m164794y() {
        return this.f143704a.translation_vector_;
    }

    /* JADX INFO: renamed from: z */
    public float[] m164795z() {
        return this.f143705b.warped_landmarks104_;
    }
}
