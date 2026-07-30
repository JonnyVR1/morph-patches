package com.immomo.momomediaext.filter.beauty;

import android.graphics.PointF;
import com.effectsar.labcv.effectsdk.BefFaceInfo;
import com.momocv.FacePoseInfo;
import com.momocv.FacePoseParams;
import com.momocv.SingleFaceInfo;
import com.momocv.videoprocessor.FaceAttribute;
import com.momocv.videoprocessor.VideoInfo;
import com.momocv.videoprocessor.VideoProcessor;
import java.nio.ByteBuffer;
import org.spongycastle.crypto.tls.CipherSuite;
import p149l.mkw;
import p149l.pjw;
import p149l.qtf;
import p149l.vjw;

/* JADX INFO: loaded from: classes7.dex */
public class FaceFeatureHelper {
    private vjw mMMFrame = new vjw();
    private mkw mParamsInfo = new mkw(1);
    public float scale = 0.25f;

    private void transformEngineMatrix(SingleFaceInfo singleFaceInfo, int i, int i2) {
        FacePoseParams facePoseParams = new FacePoseParams();
        facePoseParams.image_width_ = i;
        facePoseParams.image_height_ = i2;
        facePoseParams.landmarks_ = singleFaceInfo.landmarks_96_;
        FacePoseInfo facePoseInfo = new FacePoseInfo();
        VideoProcessor.nativCalcRTMatrixByLandmarks(facePoseParams, facePoseInfo);
        singleFaceInfo.euler_angles_ = facePoseInfo.euler_angles_;
        singleFaceInfo.camera_matrix_ = facePoseInfo.camera_matrix_;
        singleFaceInfo.rotation_matrix_ = facePoseInfo.rotation_matrix_;
        singleFaceInfo.rotation_vector_ = facePoseInfo.rotation_vector_;
        singleFaceInfo.projection_matrix_ = facePoseInfo.projection_matrix_;
        singleFaceInfo.modelview_matrix_ = facePoseInfo.modelview_matrix_;
        singleFaceInfo.projection_matrix_opengl_ = facePoseInfo.projection_matrix_opengl_;
    }

    private void transformEulerAngles(SingleFaceInfo singleFaceInfo, float f, float f2, float f3) {
        float[] fArr = singleFaceInfo.euler_angles_;
        if (fArr == null || fArr.length != 3) {
            singleFaceInfo.euler_angles_ = new float[3];
        }
        float[] fArr2 = singleFaceInfo.euler_angles_;
        fArr2[0] = f2;
        fArr2[1] = f;
        fArr2[2] = -f3;
    }

    private void transformFaceLandmark(SingleFaceInfo singleFaceInfo, BefFaceInfo.FacePoint[] facePointArr, int i, int i2) {
        transformFaceLandmark68(singleFaceInfo, facePointArr, i, i2);
        transformFaceLandmark96(singleFaceInfo, facePointArr, i, i2);
        transformFaceLandmark104(singleFaceInfo, facePointArr, i, i2);
    }

    private void transformFaceLandmark104(SingleFaceInfo singleFaceInfo, BefFaceInfo.FacePoint[] facePointArr, int i, int i2) {
        if (singleFaceInfo.landmarks_104_ == null) {
            singleFaceInfo.landmarks_104_ = new float[208];
        }
        float[] fArrConvert96to104 = new FacePointConfig().with(facePointArr, i, i2).convert96to104(singleFaceInfo.landmarks_96_, 2.66f, 3.66f, 3.66f, 2.66f);
        singleFaceInfo.landmarks_104_ = fArrConvert96to104;
        singleFaceInfo.orig_landmarks_104_ = fArrConvert96to104;
    }

    private void transformFaceLandmark68(SingleFaceInfo singleFaceInfo, BefFaceInfo.FacePoint[] facePointArr, int i, int i2) {
        if (singleFaceInfo.landmarks_68_ == null) {
            singleFaceInfo.landmarks_68_ = new float[CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA];
        }
        int i3 = 0;
        while (true) {
            float[] fArr = singleFaceInfo.landmarks_68_;
            if (i3 >= fArr.length / 2) {
                singleFaceInfo.orig_landmarks_68_ = fArr;
                return;
            }
            BefFaceInfo.FacePoint facePoint = facePointArr[FacePointConfig.points68.get(i3).transformPoint];
            singleFaceInfo.landmarks_68_[i3] = facePoint.getX();
            singleFaceInfo.landmarks_68_[i3 + 68] = facePoint.getY();
            i3++;
        }
    }

    private void transformFaceLandmark96(SingleFaceInfo singleFaceInfo, BefFaceInfo.FacePoint[] facePointArr, int i, int i2) {
        if (singleFaceInfo.landmarks_96_ == null) {
            singleFaceInfo.landmarks_96_ = new float[192];
        }
        FacePointConfig facePointConfigWith = new FacePointConfig().with(facePointArr, i, i2);
        int i3 = 0;
        while (true) {
            float[] fArr = singleFaceInfo.landmarks_96_;
            if (i3 >= fArr.length / 2) {
                singleFaceInfo.orig_landmarks_96_ = fArr;
                return;
            }
            PointF pointF = facePointConfigWith.get96PointAt(i3);
            float[] fArr2 = singleFaceInfo.landmarks_96_;
            fArr2[i3] = pointF.x;
            fArr2[i3 + 96] = pointF.y;
            i3++;
        }
    }

    private void transformFaceRect(SingleFaceInfo singleFaceInfo, BefFaceInfo.FaceRect faceRect) {
        if (singleFaceInfo.face_rect_ == null) {
            singleFaceInfo.face_rect_ = new float[4];
        }
        singleFaceInfo.face_rect_[0] = faceRect.getLeft();
        singleFaceInfo.face_rect_[1] = faceRect.getTop();
        singleFaceInfo.face_rect_[2] = faceRect.getRight();
        singleFaceInfo.face_rect_[3] = faceRect.getBottom();
        if (singleFaceInfo.orig_face_rect_ == null) {
            singleFaceInfo.orig_face_rect_ = new float[4];
        }
        singleFaceInfo.orig_face_rect_[0] = faceRect.getLeft();
        singleFaceInfo.orig_face_rect_[1] = faceRect.getTop();
        singleFaceInfo.orig_face_rect_[2] = faceRect.getRight();
        singleFaceInfo.orig_face_rect_[3] = faceRect.getBottom();
    }

    private void wrapFaceDetectParams(byte[] bArr, pjw pjwVar) {
        this.mMMFrame.m198695h(17);
        this.mMMFrame.m198700m(pjwVar.f149898e);
        this.mMMFrame.m198697j(pjwVar.f149899f);
        this.mMMFrame.m198694g(ByteBuffer.wrap(bArr).array());
        this.mMMFrame.m198693f(bArr.length);
        this.mMMFrame.m198699l(pjwVar.f149898e);
        this.mParamsInfo.m155066A(pjwVar.f149895b);
        this.mParamsInfo.m155104z(pjwVar.f149896c);
        this.mParamsInfo.m155094p(pjwVar.f149894a);
        this.mParamsInfo.m155086h(true);
        this.mParamsInfo.m155089k(false);
        this.mParamsInfo.m155090l(false);
        this.mParamsInfo.m155087i(false);
        this.mParamsInfo.m155071F(true);
        this.mParamsInfo.m155092n(false);
        this.mParamsInfo.m155101w(1);
        this.mParamsInfo.m155088j(2);
        this.mParamsInfo.m155067B(false);
    }

    public void transformFaceFeature(BefFaceInfo befFaceInfo, pjw pjwVar, int i, int i2) {
        int iM169956t = pjwVar.m169956t();
        int iM169949m = pjwVar.m169949m();
        int i3 = pjwVar.f149895b;
        if (i3 == 90 || i3 == 270) {
            iM169956t = pjwVar.m169949m();
            iM169949m = pjwVar.m169956t();
        }
        pjwVar.f149883A = (i * 1.0f) / iM169956t;
        BefFaceInfo.Face106[] face106s = befFaceInfo.getFace106s();
        VideoInfo videoInfoM169955s = pjwVar.m169955s();
        videoInfoM169955s.facesinfo_ = new SingleFaceInfo[face106s.length];
        videoInfoM169955s.faces_attributes_ = new FaceAttribute[face106s.length];
        for (int i4 = 0; i4 < videoInfoM169955s.facesinfo_.length; i4++) {
            SingleFaceInfo singleFaceInfo = new SingleFaceInfo();
            BefFaceInfo.Face106 face106 = face106s[i4];
            transformFaceLandmark(singleFaceInfo, face106.getPoints_array(), iM169956t, iM169949m);
            transformEngineMatrix(singleFaceInfo, i, i2);
            transformFaceRect(singleFaceInfo, face106.getRect());
            transformEulerAngles(singleFaceInfo, face106.getYaw(), face106.getPitch(), face106.getRoll());
            singleFaceInfo.face_rotate_degree_2d_ = face106.getRoll() < 0.0f ? -face106.getRoll() : 360.0f - face106.getRoll();
            singleFaceInfo.tracking_id_ = face106.getID();
            singleFaceInfo.feature_quality_score_ = face106.getScore();
            videoInfoM169955s.facesinfo_[i4] = singleFaceInfo;
            FaceAttribute faceAttribute = new FaceAttribute();
            faceAttribute.expression_ = face106.getAction();
            videoInfoM169955s.faces_attributes_[i4] = faceAttribute;
        }
        pjwVar.m169940a();
        if (ByteDanceFacerigHelper.isUseAnimojiFaceRig()) {
            wrapFaceDetectParams(pjwVar.f149900g, pjwVar);
            qtf qtfVarProcessFacrigFrame = ByteDanceFacerigHelper.processFacrigFrame(this.mMMFrame, this.mParamsInfo, pjwVar);
            if (qtfVarProcessFacrigFrame != null) {
                pjwVar.m169938D(qtfVarProcessFacrigFrame);
            }
        }
    }
}
