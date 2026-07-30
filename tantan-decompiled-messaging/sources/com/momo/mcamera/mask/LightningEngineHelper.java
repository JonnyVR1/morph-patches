package com.momo.mcamera.mask;

import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.core.glcore.p023cv.MMCVBoxes;
import com.core.glcore.util.BodyLandData;
import com.momo.mcamera.mask.detect.IDetectManager;
import com.momo.mcamera.mask.detect.IPatternDetect;
import com.momo.xeengine.event.IXEventDispatcher;
import com.momo.xeengine.lightningrender.ILightningRender;
import com.momo.xeengine.p044cv.bean.CVBodyInfo;
import com.momo.xeengine.p044cv.bean.CVExpressInfo;
import com.momo.xeengine.p044cv.bean.CVObjectInfo;
import com.momo.xeengine.p044cv.bean.CVSegmentInfo;
import com.momo.xeengine.p044cv.bean.XECartoonFaceInfo;
import com.momo.xeengine.p044cv.bean.XEFaceInfo;
import com.momo.xeengine.p044cv.bean.XEFaceLiquefy;
import com.momo.xeengine.p044cv.bean.XEFaceMask;
import com.momo.xeengine.p044cv.bean.XEGestureInfo;
import com.momo.xeengine.p044cv.bean.XEHandInfo;
import com.momo.xeengine.p044cv.bean.XEMutableData;
import com.momo.xeengine.p044cv.bean.XEMutableInfo;
import com.momocv.LiquefyInfo;
import com.momocv.MMBox;
import com.momocv.MMJoint;
import com.momocv.SingleFaceInfo;
import com.momocv.ardetect.ArDetectInfo;
import com.momocv.beauty.BodyWarpInfo;
import com.momocv.bodylandmark.BodyLandmarkPostInfo;
import com.momocv.cartoonface.CartoonfaceInfo;
import com.momocv.express.ExpressInfo;
import com.momocv.express.SingleExpressInfo;
import com.momocv.facerigv3.FacerigV3Info;
import com.momocv.handdetectlandmark.HandDetectLandmarkPostInfo;
import com.momocv.handgesture.HandGestureInfo;
import com.momocv.objectdetect.ObjectDetectInfo;
import com.momocv.segmentation.SegmentationInfo;
import com.momocv.stylizeface.StylizefaceInfo;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p149l.pjw;
import p149l.qtf;
import p149l.zsf;

/* JADX INFO: loaded from: classes7.dex */
public class LightningEngineHelper implements IPatternDetect.ExpressDetectListener, IDetectManager.IGestureDetectListener, IDetectManager.IObjectDetectListener, IDetectManager.IPickNoseDetectListener {
    private static final String PICK_NOSE_LEFT = "pick_nose_left";
    private static final String PICK_NOSE_RIGHT = "pick_nose_right";
    private final ILightningRender lightningRender;
    private float[][] mouthMatrix;
    private XECartoonFaceInfo xeCartoonFaceInfo;
    private final int MOUSE_STATE_OPEN = 1;
    private final int MOUSE_STATE_CLOSE = 2;
    private final int LEFT_EYE_OPEN = 4;
    private final int LEFT_EYE_CLOSING = 8;
    private final int LEFT_EYE_BLINK = 16;
    private final int RIGHT_EYE_OPEN = 32;
    private final int RIGHT_EYE_CLOSING = 64;
    private final int RIGHT_EYE_BLINK = 128;
    private final int EYE_BLINK = 256;
    private final int SMILE = 512;
    private final int DUCK_FACE = 1024;
    private final int NOD = 2048;
    private int INDEX_FACE_LEFT = 0;
    private int INDEX_FACE_RIGHT = 16;
    private int INDEX_MOUSE_UP = 62;
    private int INDEX_MOUSE_DOWN = 66;
    private int mouseOpenState = 2;
    private final int POINTS_LENGTH = 68;
    private final int FACE_STATE_OPEN = 0;
    private final int FACE_STATE_CLOSE = 1;
    private final int NOD_STATE_POSSIBLE = 1000;
    private final int NOD_STATE_DOWN = 1001;
    private final int NOD_STATE_UP = 1002;
    private int smileState = 1;
    private int duckFaceState = 1;
    private int leftEyeOpenState = 0;
    private int leftEyeBlinkState = 1;
    private int leftEyeBlinkCount = 0;
    private int rightEyeOpenState = 0;
    private int rightEyeBlinkState = 0;
    private int rightEyeBlinkCount = 0;
    private int nodState = 1000;
    private List<Float> pitchValues = new ArrayList();
    private int nodStartPitch = 0;
    private int nodFailedCount = 0;
    private long nodStartTime = 0;
    private float lastPitch = 0.0f;
    private float[][] faceMatrix = {new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}, new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}, new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}};
    private final float[] cartoonMatrix = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    private final float[] segMatrix = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    private final float[] cryingMatrix = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    public LightningEngineHelper(ILightningRender iLightningRender) {
        this.lightningRender = iLightningRender;
    }

    private int adjustState(pjw pjwVar, int i) {
        boolean z = false;
        if (pjwVar != null) {
            if (i >= pjwVar.m169950n()) {
                i = 0;
            }
            zsf zsfVarM169946j = pjwVar.m169946j(i);
            if (zsfVarM169946j != null) {
                int iUpdateMouseState = updateMouseState(zsfVarM169946j.m220018l());
                this.smileState = 2;
                this.duckFaceState = 2;
                boolean z2 = true;
                if (zsfVarM169946j.m220013d() == 1) {
                    this.duckFaceState = 1;
                    iUpdateMouseState |= 1024;
                } else if (zsfVarM169946j.m220013d() == 2) {
                    this.smileState = 1;
                    iUpdateMouseState |= 512;
                }
                int iUpdateNodState = updateNodState(zsfVarM169946j) | iUpdateMouseState | updateEyeState(zsfVarM169946j);
                int i2 = this.rightEyeOpenState;
                if (i2 == 0 && this.leftEyeOpenState == 1) {
                    int i3 = this.leftEyeBlinkCount + 1;
                    this.leftEyeBlinkCount = i3;
                    if (i3 > 1) {
                        this.leftEyeBlinkState = 0;
                    } else {
                        this.leftEyeBlinkState = 1;
                    }
                } else {
                    this.leftEyeBlinkCount = 0;
                    this.leftEyeBlinkState = 1;
                }
                if (i2 == 1 && this.leftEyeOpenState == 0) {
                    int i4 = this.rightEyeBlinkCount + 1;
                    this.rightEyeBlinkCount = i4;
                    if (i4 > 1) {
                        this.rightEyeBlinkState = 0;
                    } else {
                        this.rightEyeBlinkState = 1;
                    }
                } else {
                    this.rightEyeBlinkCount = 0;
                    this.rightEyeBlinkState = 1;
                }
                if (this.leftEyeBlinkState == 0) {
                    iUpdateNodState |= 16;
                    z = true;
                }
                if (this.rightEyeBlinkState == 0) {
                    iUpdateNodState |= 128;
                } else {
                    z2 = z;
                }
                return z2 ? iUpdateNodState | 256 : iUpdateNodState;
            }
        }
        return 0;
    }

    private void setHandGestureInfo(MMBox[] mMBoxArr) {
        ILightningRender iLightningRender = this.lightningRender;
        if (iLightningRender == null || iLightningRender.getEventDispatcher() == null) {
            return;
        }
        IXEventDispatcher eventDispatcher = this.lightningRender.getEventDispatcher();
        if (mMBoxArr == null) {
            eventDispatcher.dispatchHandInfo(null);
            return;
        }
        ArrayList arrayList = new ArrayList(mMBoxArr.length);
        for (MMBox mMBox : mMBoxArr) {
            if (mMBox != null) {
                XEGestureInfo xEGestureInfo = new XEGestureInfo();
                xEGestureInfo.type = mMBox.class_name_;
                xEGestureInfo.bounds = new float[]{mMBox.f14764x_, mMBox.f14765y_, mMBox.width_, mMBox.height_};
                xEGestureInfo.score = mMBox.score_;
                arrayList.add(xEGestureInfo);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        XEHandInfo xEHandInfo = new XEHandInfo();
        xEHandInfo.gestures = arrayList;
        arrayList2.add(xEHandInfo);
        eventDispatcher.dispatchHandInfo(arrayList2);
    }

    private void setPickNoseInfo(HandDetectLandmarkPostInfo handDetectLandmarkPostInfo) {
        ILightningRender iLightningRender = this.lightningRender;
        if (iLightningRender == null || iLightningRender.getEventDispatcher() == null) {
            return;
        }
        IXEventDispatcher eventDispatcher = this.lightningRender.getEventDispatcher();
        if (handDetectLandmarkPostInfo == null || handDetectLandmarkPostInfo.result_ != 1) {
            eventDispatcher.dispatchObjectInfo(null);
            return;
        }
        ArrayList arrayList = new ArrayList(1);
        CVObjectInfo cVObjectInfo = new CVObjectInfo();
        cVObjectInfo.setType(handDetectLandmarkPostInfo.is_righ_nose_ == 1 ? PICK_NOSE_RIGHT : PICK_NOSE_LEFT);
        cVObjectInfo.setBounds(new float[]{0.0f, 0.0f, 0.0f, 0.0f});
        cVObjectInfo.setScore(cVObjectInfo.getScore());
        arrayList.add(cVObjectInfo);
        eventDispatcher.dispatchObjectInfo(arrayList);
    }

    private int updateEyeState(zsf zsfVar) {
        float fM220020n = zsfVar.m220020n();
        float fM220026t = zsfVar.m220026t();
        if (fM220020n >= 0.7d) {
            this.leftEyeOpenState = 1;
        } else {
            this.leftEyeOpenState = 0;
        }
        if (fM220026t >= 0.7d) {
            this.rightEyeOpenState = 1;
        } else {
            this.rightEyeOpenState = 0;
        }
        int i = this.leftEyeOpenState == 0 ? 4 : 8;
        return this.rightEyeOpenState == 0 ? i | 32 : i | 64;
    }

    private int updateMouseState(float[] fArr) {
        if (fArr != null && fArr.length != 0) {
            int i = this.INDEX_FACE_LEFT;
            float f = fArr[i];
            float f2 = fArr[i + 68];
            int i2 = this.INDEX_FACE_RIGHT;
            float f3 = fArr[i2];
            float f4 = fArr[i2 + 68];
            int i3 = this.INDEX_MOUSE_DOWN;
            float f5 = fArr[i3];
            float f6 = fArr[i3 + 68];
            int i4 = this.INDEX_MOUSE_UP;
            if (((float) Math.hypot(fArr[i4] - f5, fArr[i4 + 68] - f6)) > (((float) Math.hypot(f - f3, f2 - f4)) * 1.0f) / 10.0f) {
                return 1;
            }
        }
        return 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int updateNodState(zsf zsfVar) {
        float[] fArrM220012c = zsfVar.m220012c();
        if (fArrM220012c != null && fArrM220012c.length >= 3) {
            float f = zsfVar.m220012c()[0];
            float f2 = zsfVar.m220012c()[1];
            float f3 = zsfVar.m220012c()[2];
            if ((f2 > 10.0f && f2 - f > 1.0f) || (f2 < -10.0f && f2 - f < 1.0f)) {
                this.nodState = 1000;
                return 0;
            }
            if ((f3 > 10.0f && f3 - f > 1.0f) || (f3 < -10.0f && f3 - f < 1.0f)) {
                this.nodState = 1000;
                return 0;
            }
            if (this.pitchValues.size() > 4) {
                this.pitchValues.remove(0);
            }
            this.pitchValues.add(Float.valueOf(f));
            ArrayList arrayList = new ArrayList(this.pitchValues);
            Collections.sort(arrayList);
            float fFloatValue = ((Float) arrayList.get(this.pitchValues.size() >> 1)).floatValue();
            switch (this.nodState) {
                case 1000:
                    if (fFloatValue - this.lastPitch >= 2.0f) {
                        this.nodStartTime = System.currentTimeMillis();
                        this.nodState = 1001;
                    }
                    this.lastPitch = fFloatValue;
                    break;
                case 1001:
                    if (fFloatValue - this.lastPitch >= 1.0f) {
                        this.nodFailedCount = 0;
                    } else if (fFloatValue > this.nodStartPitch + 3) {
                        this.nodState = 1002;
                        this.nodStartPitch = 0;
                    } else {
                        int i = this.nodFailedCount + 1;
                        this.nodFailedCount = i;
                        if (i > 1) {
                            this.nodState = 1000;
                        }
                    }
                    this.lastPitch = fFloatValue;
                    break;
                case 1002:
                    if (fFloatValue - this.lastPitch <= 1.0f) {
                        this.nodFailedCount = 0;
                        if (fFloatValue - this.nodStartPitch > 0.0f) {
                            if (System.currentTimeMillis() - this.nodStartTime < 2000) {
                                this.nodState = 1000;
                                return 2048;
                            }
                            this.nodState = 1000;
                        }
                    } else {
                        int i2 = this.nodFailedCount + 1;
                        this.nodFailedCount = i2;
                        if (i2 > 1) {
                            this.nodState = 1000;
                        }
                    }
                    this.lastPitch = fFloatValue;
                    break;
                default:
                    this.lastPitch = fFloatValue;
                    break;
            }
        }
        return 0;
    }

    public void clearFaceInfos() {
        IXEventDispatcher eventDispatcher = this.lightningRender.getEventDispatcher();
        if (eventDispatcher == null) {
            return;
        }
        eventDispatcher.dispatchFaceInfo(null);
    }

    public void handEvent(MotionEvent motionEvent, View view) {
        IXEventDispatcher eventDispatcher;
        ILightningRender iLightningRender = this.lightningRender;
        if (iLightningRender == null || (eventDispatcher = iLightningRender.getEventDispatcher()) == null) {
            return;
        }
        eventDispatcher.handleTouchEvent(motionEvent, view);
    }

    @Override // com.momo.mcamera.mask.detect.IPatternDetect.ExpressDetectListener
    public void onExpressDetect(ExpressInfo expressInfo) {
        setExpressionInfo(expressInfo);
    }

    @Override // com.momo.mcamera.mask.detect.IDetectManager.IGestureDetectListener
    public void onGestureDetected(MMCVBoxes mMCVBoxes) {
        setHandGestureInfo(mMCVBoxes.getDetectResult());
    }

    @Override // com.momo.mcamera.mask.detect.IDetectManager.IObjectDetectListener
    public void onObjectDetected(MMCVBoxes mMCVBoxes) {
        setObjectInfos(mMCVBoxes.getDetectResult());
    }

    @Override // com.momo.mcamera.mask.detect.IDetectManager.IPickNoseDetectListener
    public void onPickNoseDetected(HandDetectLandmarkPostInfo handDetectLandmarkPostInfo) {
        setPickNoseInfo(handDetectLandmarkPostInfo);
    }

    public void setARGift(ArDetectInfo arDetectInfo) {
        float[] fArr;
        ILightningRender iLightningRender = this.lightningRender;
        if (iLightningRender == null || iLightningRender.getEventDispatcher() == null) {
            return;
        }
        IXEventDispatcher eventDispatcher = this.lightningRender.getEventDispatcher();
        if (arDetectInfo == null || (fArr = arDetectInfo.corners_points) == null || fArr.length == 0) {
            eventDispatcher.dispatchMutableInfo(null);
            return;
        }
        XEMutableInfo xEMutableInfo = new XEMutableInfo("ardetector_gift");
        XEMutableData xEMutableData = new XEMutableData();
        xEMutableData.floatArray1 = arDetectInfo.corners_points;
        ArrayList arrayList = new ArrayList();
        arrayList.add(xEMutableData);
        xEMutableInfo.setMutableDatas(arrayList);
        eventDispatcher.dispatchMutableInfo(Collections.singletonList(xEMutableInfo));
    }

    public void setBodyInfos(BodyLandmarkPostInfo bodyLandmarkPostInfo, CVBodyInfo cVBodyInfo) {
        MMJoint[][] mMJointArr;
        ILightningRender iLightningRender = this.lightningRender;
        if (iLightningRender == null || iLightningRender.getEventDispatcher() == null) {
            return;
        }
        IXEventDispatcher eventDispatcher = this.lightningRender.getEventDispatcher();
        if (bodyLandmarkPostInfo == null || (mMJointArr = bodyLandmarkPostInfo.multi_person_) == null) {
            eventDispatcher.dispatchBodyInfo(null);
            return;
        }
        ArrayList arrayList = new ArrayList(mMJointArr.length);
        for (MMJoint[] mMJointArr2 : mMJointArr) {
            int length = mMJointArr2.length;
            CVBodyInfo cVBodyInfo2 = new CVBodyInfo();
            cVBodyInfo2.joints = new ArrayList(length);
            for (MMJoint mMJoint : mMJointArr2) {
                if (mMJoint != null) {
                    CVBodyInfo.Joint joint = new CVBodyInfo.Joint();
                    joint.f14568x = mMJoint.f14759x_;
                    joint.f14569y = mMJoint.f14760y_;
                    joint.score = mMJoint.score_;
                    cVBodyInfo2.joints.add(joint);
                }
            }
            if (cVBodyInfo != null) {
                cVBodyInfo2.dst_warp_points = cVBodyInfo.dst_warp_points;
                cVBodyInfo2.src_warp_points = cVBodyInfo.src_warp_points;
            }
            arrayList.add(cVBodyInfo2);
        }
        if (cVBodyInfo == null || cVBodyInfo.dst_warp_points == null || cVBodyInfo.src_warp_points == null) {
            eventDispatcher.dispatchBodyInfo(arrayList);
        } else {
            eventDispatcher.dispatchBodyInfo(arrayList, true);
        }
    }

    public void setBodyWarpInfo(pjw pjwVar) {
        BodyLandData bodyLandData;
        if (this.lightningRender.getEventDispatcher() == null) {
            return;
        }
        if (pjwVar == null || (bodyLandData = pjwVar.f149905l) == null) {
            setBodyInfos(null);
            return;
        }
        CVBodyInfo cVBodyInfo = new CVBodyInfo();
        BodyWarpInfo bodyWarpInfo = pjwVar.f149906m;
        if (bodyWarpInfo != null) {
            cVBodyInfo.dst_warp_points = bodyWarpInfo.dst_warp_points_;
            cVBodyInfo.src_warp_points = bodyWarpInfo.src_warp_points_;
        }
        setBodyInfos(bodyLandData.info, cVBodyInfo);
    }

    public void setCartoonFaceInfo(pjw pjwVar, CartoonfaceInfo cartoonfaceInfo) {
        byte[] bArr;
        float[] fArr;
        IXEventDispatcher eventDispatcher = this.lightningRender.getEventDispatcher();
        if (eventDispatcher == null) {
            return;
        }
        if (cartoonfaceInfo == null || (bArr = cartoonfaceInfo.mask_) == null || bArr.length <= 0 || cartoonfaceInfo.mask_width <= 0 || cartoonfaceInfo.mask_height <= 0 || (fArr = cartoonfaceInfo.warp_mat) == null || fArr.length < 6) {
            eventDispatcher.dispatchCartoonFaceInfo(null);
            return;
        }
        if (this.xeCartoonFaceInfo == null) {
            this.xeCartoonFaceInfo = new XECartoonFaceInfo();
        }
        this.xeCartoonFaceInfo.setDatas(cartoonfaceInfo.mask_);
        this.xeCartoonFaceInfo.setHeight(cartoonfaceInfo.mask_height);
        this.xeCartoonFaceInfo.setWidth(cartoonfaceInfo.mask_width);
        this.xeCartoonFaceInfo.setLength(cartoonfaceInfo.mask_.length);
        float[] fArr2 = this.cartoonMatrix;
        float[] fArr3 = cartoonfaceInfo.warp_mat;
        fArr2[0] = fArr3[0];
        fArr2[3] = fArr3[1];
        fArr2[6] = fArr3[2];
        fArr2[1] = fArr3[3];
        fArr2[4] = fArr3[4];
        fArr2[7] = fArr3[5];
        this.xeCartoonFaceInfo.setWarpMat(fArr2);
        this.xeCartoonFaceInfo.setFlipShowX(pjwVar.f149894a);
        eventDispatcher.dispatchCartoonFaceInfo(this.xeCartoonFaceInfo);
    }

    public void setCryingFaceInfo(CartoonfaceInfo cartoonfaceInfo, boolean z) {
        ILightningRender iLightningRender = this.lightningRender;
        if (iLightningRender == null || iLightningRender.getEventDispatcher() == null) {
            return;
        }
        IXEventDispatcher eventDispatcher = this.lightningRender.getEventDispatcher();
        if (cartoonfaceInfo == null || (cartoonfaceInfo.mask_width == 0 && cartoonfaceInfo.mask_height == 0)) {
            eventDispatcher.dispatchMutableInfo(null);
            return;
        }
        XEMutableInfo xEMutableInfo = new XEMutableInfo("crying_face");
        CVSegmentInfo cVSegmentInfo = new CVSegmentInfo();
        cVSegmentInfo.setDatas(cartoonfaceInfo.mask_);
        cVSegmentInfo.setHeight(cartoonfaceInfo.mask_height);
        cVSegmentInfo.setWidth(cartoonfaceInfo.mask_width);
        cVSegmentInfo.setLength(cartoonfaceInfo.mask_.length);
        float[] fArr = this.cryingMatrix;
        float[] fArr2 = cartoonfaceInfo.warp_mat;
        fArr[0] = fArr2[0];
        fArr[3] = fArr2[1];
        fArr[6] = fArr2[2];
        fArr[1] = fArr2[3];
        fArr[4] = fArr2[4];
        fArr[7] = fArr2[5];
        cVSegmentInfo.setWarpMat(fArr);
        cVSegmentInfo.setFlipShowX(z);
        xEMutableInfo.setMaskInfo1(cVSegmentInfo);
        XEMutableData xEMutableData = new XEMutableData();
        xEMutableData.float1 = cartoonfaceInfo.diff_stress;
        ArrayList arrayList = new ArrayList();
        arrayList.add(xEMutableData);
        xEMutableInfo.setMutableDatas(arrayList);
        eventDispatcher.dispatchMutableInfo(Collections.singletonList(xEMutableInfo));
    }

    public void setExpressionInfo(ExpressInfo expressInfo) {
        ILightningRender iLightningRender = this.lightningRender;
        if (iLightningRender == null || iLightningRender.getEventDispatcher() == null) {
            return;
        }
        IXEventDispatcher eventDispatcher = this.lightningRender.getEventDispatcher();
        if (expressInfo == null || expressInfo.express_infos_ == null) {
            eventDispatcher.dispatchExpressInfo(null);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (SingleExpressInfo singleExpressInfo : expressInfo.express_infos_) {
            CVExpressInfo cVExpressInfo = new CVExpressInfo();
            cVExpressInfo.setHead(singleExpressInfo.head_);
            cVExpressInfo.setLeftEye(singleExpressInfo.lefteye_);
            cVExpressInfo.setRightEye(singleExpressInfo.righteye_);
            cVExpressInfo.setMouth(singleExpressInfo.mouth_);
            cVExpressInfo.setNeck(singleExpressInfo.neck_);
            arrayList.add(cVExpressInfo);
        }
        eventDispatcher.dispatchExpressInfo(arrayList);
    }

    public void setFaceInfo(pjw pjwVar) {
        IXEventDispatcher eventDispatcher;
        int i;
        char c;
        char c2;
        qtf qtfVarM169953q;
        FacerigV3Info facerigV3Info;
        float[] fArr;
        if (pjwVar == null || (eventDispatcher = this.lightningRender.getEventDispatcher()) == null) {
            return;
        }
        int iM169950n = pjwVar.m169950n();
        if (iM169950n <= 0) {
            eventDispatcher.dispatchFaceInfo(null);
            return;
        }
        int i2 = pjwVar.f149918y;
        int i3 = 1;
        if (i2 < 1 || i2 >= iM169950n) {
            i2 = iM169950n;
        }
        float[][] fArr2 = this.mouthMatrix;
        char c3 = 2;
        if (fArr2 == null || fArr2.length != i2) {
            this.mouthMatrix = (float[][]) Array.newInstance((Class<?>) Float.TYPE, iM169950n, 9);
            int i4 = 0;
            while (true) {
                float[][] fArr3 = this.mouthMatrix;
                if (i4 >= fArr3.length) {
                    break;
                }
                fArr3[i4] = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
                i4++;
            }
        }
        ArrayList arrayList = new ArrayList();
        int i5 = 0;
        while (i5 < i2) {
            zsf zsfVarM169946j = pjwVar.m169946j(i5);
            SingleFaceInfo singleFaceInfo = pjwVar.m169955s().facesinfo_[i5];
            if (zsfVarM169946j == null) {
                i = i3;
                c = c3;
            } else {
                XEFaceInfo xEFaceInfo = new XEFaceInfo();
                xEFaceInfo.expression = adjustState(pjwVar, i5);
                xEFaceInfo.landmarks68 = zsfVarM169946j.m220006A() == null ? zsfVarM169946j.m220018l() : zsfVarM169946j.m220006A();
                xEFaceInfo.landmarks96 = zsfVarM169946j.m220007B() == null ? zsfVarM169946j.m220019m() : zsfVarM169946j.m220007B();
                xEFaceInfo.landmarks137 = singleFaceInfo.landmarks_137_;
                xEFaceInfo.landmarks222 = singleFaceInfo.landmarks_222_;
                xEFaceInfo.landmarks106 = singleFaceInfo.landmarks_106_;
                xEFaceInfo.trackId = zsfVarM169946j.m220030x();
                float[] fArrM220012c = zsfVarM169946j.m220012c();
                if (fArrM220012c != null && fArrM220012c.length >= 3) {
                    xEFaceInfo.pitch = fArrM220012c[0];
                    xEFaceInfo.yaw = fArrM220012c[i3];
                    xEFaceInfo.roll = fArrM220012c[c3];
                }
                float f = zsfVarM169946j.m220014e()[0];
                float f2 = zsfVarM169946j.m220014e()[i3];
                float f3 = zsfVarM169946j.m220014e()[c3] - zsfVarM169946j.m220014e()[0];
                float f4 = zsfVarM169946j.m220014e()[3] - zsfVarM169946j.m220014e()[i3];
                i = i3;
                c = c3;
                float[] fArr4 = new float[4];
                fArr4[0] = f;
                fArr4[i] = f2;
                fArr4[c] = f3;
                fArr4[3] = f4;
                xEFaceInfo.faceBounds = fArr4;
                xEFaceInfo.cameraMatrix = zsfVarM169946j.m220011b();
                xEFaceInfo.rotationMatrix = zsfVarM169946j.m220027u();
                xEFaceInfo.rotationVector = zsfVarM169946j.m220028v();
                xEFaceInfo.translationVector = zsfVarM169946j.m220031y();
                xEFaceInfo.projectionMatrix = zsfVarM169946j.m220025s();
                xEFaceInfo.modelViewMatrix = zsfVarM169946j.m220021o();
                if (zsfVarM169946j.m220029w() != null) {
                    xEFaceInfo.skin_threshold = new float[zsfVarM169946j.m220029w().length];
                    for (int i6 = 0; i6 < zsfVarM169946j.m220029w().length; i6++) {
                        xEFaceInfo.skin_threshold[i6] = zsfVarM169946j.m220029w()[i6];
                    }
                }
                if (i5 == 0 && (qtfVarM169953q = pjwVar.m169953q()) != null && (facerigV3Info = qtfVarM169953q.f156323a) != null && (fArr = facerigV3Info.facerigV3_eulers_) != null && facerigV3Info.facerigV3_scores_ != null) {
                    float[] fArr5 = new float[54];
                    System.arraycopy(fArr, 0, fArr5, 0, 3);
                    System.arraycopy(qtfVarM169953q.f156323a.facerigV3_scores_, 0, fArr5, 3, 51);
                    xEFaceInfo.facerigStates = fArr5;
                }
                float[][] fArrM169954r = pjwVar.m169954r();
                if (fArrM169954r != null && fArrM169954r.length > i5) {
                    xEFaceInfo.src_warp_points = pjwVar.m169954r()[i5];
                    xEFaceInfo.dst_warp_points = pjwVar.m169945f()[i5];
                }
                xEFaceInfo.meType = xEFaceInfo.facerigStates == null ? 0 : i;
                if (singleFaceInfo.face_warp_mat == null || singleFaceInfo.face_mask_width == 0 || singleFaceInfo.face_mask_height == 0) {
                    c2 = 4;
                } else {
                    XEFaceMask xEFaceMask = new XEFaceMask();
                    float[] fArr6 = this.faceMatrix[i5];
                    c2 = 4;
                    float[] fArr7 = singleFaceInfo.face_warp_mat;
                    fArr6[0] = fArr7[0];
                    fArr6[3] = fArr7[i];
                    fArr6[6] = fArr7[c];
                    fArr6[i] = fArr7[3];
                    fArr6[4] = fArr7[4];
                    fArr6[7] = fArr7[5];
                    xEFaceMask.setWarpMat(fArr6);
                    xEFaceMask.setDatas(singleFaceInfo.face_mask);
                    xEFaceMask.setMaskWidth(singleFaceInfo.face_mask_width);
                    xEFaceMask.setMaskHeight(singleFaceInfo.face_mask_height);
                    xEFaceMask.setLength(xEFaceMask.getMaskHeight() * xEFaceMask.getMaskWidth());
                    xEFaceMask.setFlipShowX(pjwVar.f149894a);
                    xEFaceInfo.setFaceMask(xEFaceMask);
                }
                if (singleFaceInfo.mouth_warp_mat != null && singleFaceInfo.mouth_mask_width != 0 && singleFaceInfo.mouth_mask_height != 0) {
                    XEFaceMask xEFaceMask2 = new XEFaceMask();
                    float[] fArr8 = this.mouthMatrix[i5];
                    float[] fArr9 = singleFaceInfo.mouth_warp_mat;
                    fArr8[0] = fArr9[0];
                    fArr8[3] = fArr9[i];
                    fArr8[6] = fArr9[c];
                    fArr8[i] = fArr9[3];
                    fArr8[c2] = fArr9[c2];
                    fArr8[7] = fArr9[5];
                    xEFaceMask2.setWarpMat(fArr8);
                    xEFaceMask2.setDatas(singleFaceInfo.mouth_mask);
                    xEFaceMask2.setMaskWidth(singleFaceInfo.mouth_mask_width);
                    xEFaceMask2.setMaskHeight(singleFaceInfo.mouth_mask_height);
                    xEFaceMask2.setLength(xEFaceMask2.getMaskHeight() * xEFaceMask2.getMaskWidth());
                    xEFaceMask2.setFlipShowX(pjwVar.f149894a);
                    xEFaceInfo.setMouthMask(xEFaceMask2);
                }
                LiquefyInfo[][] liquefyInfoArr = pjwVar.f149917x;
                if (liquefyInfoArr != null && liquefyInfoArr.length > 0) {
                    LiquefyInfo[] liquefyInfoArr2 = liquefyInfoArr[i5];
                    ArrayList arrayList2 = new ArrayList();
                    if (liquefyInfoArr2 != null && liquefyInfoArr2.length > 0) {
                        for (LiquefyInfo liquefyInfo : liquefyInfoArr2) {
                            XEFaceLiquefy xEFaceLiquefy = new XEFaceLiquefy();
                            xEFaceLiquefy.circleCenterX = liquefyInfo.circleCenterX;
                            xEFaceLiquefy.circleCenterY = liquefyInfo.circleCenterY;
                            xEFaceLiquefy.circleSizeX = liquefyInfo.circleSizeX;
                            xEFaceLiquefy.circleSizeY = liquefyInfo.circleSizeY;
                            xEFaceLiquefy.circleType = liquefyInfo.circleType;
                            xEFaceLiquefy.circleIntensityX = liquefyInfo.intensityX;
                            xEFaceLiquefy.circleIntensityY = liquefyInfo.intensityY;
                            xEFaceLiquefy.mat = liquefyInfo.f14758m;
                            arrayList2.add(xEFaceLiquefy);
                        }
                    }
                    xEFaceInfo.setLiquefyInfos(arrayList2);
                }
                arrayList.add(xEFaceInfo);
            }
            i5++;
            i3 = i;
            c3 = c;
        }
        eventDispatcher.dispatchFaceInfo(arrayList);
    }

    public void setObjectInfos(MMBox[] mMBoxArr) {
        ILightningRender iLightningRender = this.lightningRender;
        if (iLightningRender == null || iLightningRender.getEventDispatcher() == null) {
            return;
        }
        IXEventDispatcher eventDispatcher = this.lightningRender.getEventDispatcher();
        if (mMBoxArr == null) {
            eventDispatcher.dispatchObjectInfo(null);
            return;
        }
        ArrayList arrayList = new ArrayList(mMBoxArr.length);
        for (MMBox mMBox : mMBoxArr) {
            if (mMBox != null) {
                CVObjectInfo cVObjectInfo = new CVObjectInfo();
                cVObjectInfo.setType(mMBox.class_name_);
                cVObjectInfo.setBounds(new float[]{mMBox.f14764x_, mMBox.f14765y_, mMBox.width_, mMBox.height_});
                cVObjectInfo.setScore(cVObjectInfo.getScore());
                arrayList.add(cVObjectInfo);
            }
        }
        eventDispatcher.dispatchObjectInfo(arrayList);
    }

    public void setQRCodeInfo(String str) {
        ILightningRender iLightningRender = this.lightningRender;
        if (iLightningRender == null || iLightningRender.getEventDispatcher() == null) {
            return;
        }
        IXEventDispatcher eventDispatcher = this.lightningRender.getEventDispatcher();
        if (TextUtils.isEmpty(str)) {
            eventDispatcher.dispatchMutableInfo(null);
            return;
        }
        XEMutableInfo xEMutableInfo = new XEMutableInfo("qrcode_detector");
        XEMutableData xEMutableData = new XEMutableData();
        xEMutableData.str1 = str;
        ArrayList arrayList = new ArrayList();
        arrayList.add(xEMutableData);
        xEMutableInfo.setMutableDatas(arrayList);
        eventDispatcher.dispatchMutableInfo(Collections.singletonList(xEMutableInfo));
    }

    public void setSegmentInfo(SegmentationInfo segmentationInfo) {
        ILightningRender iLightningRender = this.lightningRender;
        if (iLightningRender == null || iLightningRender.getEventDispatcher() == null) {
            return;
        }
        IXEventDispatcher eventDispatcher = this.lightningRender.getEventDispatcher();
        byte[] bArr = segmentationInfo.mask_;
        if (bArr == null || bArr.length <= 0 || segmentationInfo.mask_width <= 0 || segmentationInfo.mask_height <= 0) {
            eventDispatcher.dispatchSegmentInfo(new CVSegmentInfo());
            return;
        }
        CVSegmentInfo cVSegmentInfo = new CVSegmentInfo();
        cVSegmentInfo.setDatas(segmentationInfo.mask_);
        cVSegmentInfo.setHeight(segmentationInfo.mask_height);
        cVSegmentInfo.setWidth(segmentationInfo.mask_width);
        cVSegmentInfo.setLength(segmentationInfo.mask_.length);
        float[] fArr = this.segMatrix;
        float[] fArr2 = segmentationInfo.warp_mat;
        fArr[0] = fArr2[0];
        fArr[3] = fArr2[1];
        fArr[6] = fArr2[2];
        fArr[1] = fArr2[3];
        fArr[4] = fArr2[4];
        fArr[7] = fArr2[5];
        cVSegmentInfo.setWarpMat(fArr);
        eventDispatcher.dispatchSegmentInfo(cVSegmentInfo);
    }

    public void setStylizeFaceInfo(StylizefaceInfo stylizefaceInfo, boolean z) {
        ILightningRender iLightningRender = this.lightningRender;
        if (iLightningRender == null || iLightningRender.getEventDispatcher() == null) {
            return;
        }
        IXEventDispatcher eventDispatcher = this.lightningRender.getEventDispatcher();
        if (stylizefaceInfo == null || (stylizefaceInfo.mask_width == 0 && stylizefaceInfo.mask_height == 0)) {
            eventDispatcher.dispatchMutableInfo(null);
            return;
        }
        byte[][] bArr = stylizefaceInfo.mask_all;
        if (bArr == null || bArr.length <= 0) {
            eventDispatcher.dispatchMutableInfo(null);
            return;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            byte[][] bArr2 = stylizefaceInfo.mask_all;
            if (i >= bArr2.length) {
                eventDispatcher.dispatchMutableInfo(arrayList);
                return;
            }
            float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
            byte[] bArr3 = bArr2[i];
            XEMutableInfo xEMutableInfo = new XEMutableInfo("stylizeface");
            CVSegmentInfo cVSegmentInfo = new CVSegmentInfo();
            cVSegmentInfo.setDatas(bArr3);
            cVSegmentInfo.setHeight(stylizefaceInfo.mask_height);
            cVSegmentInfo.setWidth(stylizefaceInfo.mask_width);
            cVSegmentInfo.setLength(stylizefaceInfo.mask_all[i].length);
            float[] fArr2 = stylizefaceInfo.warp_mat_all[i];
            fArr[0] = fArr2[0];
            fArr[3] = fArr2[1];
            fArr[6] = fArr2[2];
            fArr[1] = fArr2[3];
            fArr[4] = fArr2[4];
            fArr[7] = fArr2[5];
            cVSegmentInfo.setWarpMat(fArr);
            cVSegmentInfo.setFlipShowX(z);
            xEMutableInfo.setMaskInfo1(cVSegmentInfo);
            arrayList.add(xEMutableInfo);
            i++;
        }
    }

    public boolean touchHitTest(float f, float f2, int i, int i2) {
        IXEventDispatcher eventDispatcher = this.lightningRender.getEventDispatcher();
        if (eventDispatcher != null) {
            return eventDispatcher.handleTouchHitTest();
        }
        return false;
    }

    public void setObjectInfos(ObjectDetectInfo objectDetectInfo) {
        if (objectDetectInfo != null) {
            setObjectInfos(objectDetectInfo.detect_results_);
        } else {
            setObjectInfos((MMBox[]) null);
        }
    }

    public void setHandGestureInfo(HandGestureInfo handGestureInfo) {
        if (handGestureInfo != null) {
            setHandGestureInfo(handGestureInfo.hand_gesture_results_);
        } else {
            setHandGestureInfo((MMBox[]) null);
        }
    }

    public void setSegmentInfo(byte[] bArr, int i, int i2) {
        ILightningRender iLightningRender = this.lightningRender;
        if (iLightningRender == null || iLightningRender.getEventDispatcher() == null) {
            return;
        }
        IXEventDispatcher eventDispatcher = this.lightningRender.getEventDispatcher();
        if (bArr != null && bArr.length > 0 && i > 0 && i2 > 0) {
            CVSegmentInfo cVSegmentInfo = new CVSegmentInfo();
            cVSegmentInfo.setDatas(bArr);
            cVSegmentInfo.setHeight(i2);
            cVSegmentInfo.setWidth(i);
            cVSegmentInfo.setLength(bArr.length);
            eventDispatcher.dispatchSegmentInfo(cVSegmentInfo);
            return;
        }
        eventDispatcher.dispatchSegmentInfo(null);
    }

    public void setBodyInfos(BodyLandmarkPostInfo bodyLandmarkPostInfo) {
        setBodyInfos(bodyLandmarkPostInfo, null);
    }
}
