package com.momo.mcamera.AnimojiUtils;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.core.glcore.datadot.DataDotUtils;
import com.cosmos.mdlog.MDLog;
import com.momo.mcamera.mask.BasicRender;
import com.momo.mcamera.util.MDLogTag;
import com.momo.xeengine.XE3DEngine;
import com.momo.xeengine.p049cv.bean.XEFaceInfo;
import com.momo.xeengine.xnative.XEEventDispatcher;
import com.momocv.MMFrame;
import com.momocv.SingleFaceInfo;
import com.momocv.facefeatures.FaceFeaturesParams;
import com.momocv.facerigv3.FaceRigV3;
import com.momocv.facerigv3.FacerigV3Info;
import com.momocv.facerigv3.FacerigV3Params;
import com.momocv.videoprocessor.VideoInfo;
import com.momocv.videoprocessor.VideoParams;
import com.momocv.videoprocessor.VideoProcessor;
import java.util.ArrayList;
import java.util.LinkedList;
import p153l.biw;
import p153l.row;
import p153l.tow;
import p153l.xpl;

/* JADX INFO: loaded from: classes7.dex */
public class AnimojiUtil implements xpl.InterfaceC21407a {
    LinkedList<byte[]> dataList;
    LinkedList<byte[]> emptyList;
    private BasicRender mBasicRender;
    private xpl mCamera;
    private SurfaceTexture mCameraTexture;
    private FaceRigV3 mFaceRig;
    private FacerigV3Info mFaceRigInfo;
    private FacerigV3Params mFacerigV3Params;
    int mFrameIndex;
    private Handler mHandler;
    private HandlerThread mHandlerThread;
    private MMFrame mMFrame;
    private OnFaceDetectListener mOnFaceDetectListener;
    private VideoInfo mVideoInfo;
    private VideoParams mVideoParams;
    private VideoProcessor mVideoProcessor;
    XE3DEngine mXE3DEngine;
    private tow mrCoreParameters;
    final Object syncObj = new Object();
    boolean isPreviewing = false;
    Object syncLock = new Object();
    long lastCameraTime = 0;
    long lastSendTime = 0;
    long processIntevla = 0;

    private void initCoreParams(row rowVar) {
        this.mrCoreParameters.f175510u = rowVar.m182472j().m122180b();
        this.mrCoreParameters.f175511v = rowVar.m182472j().m122179a();
        this.mrCoreParameters.f175451H = rowVar.m182469g();
        this.mrCoreParameters.f175449F = rowVar.m182470h();
        this.mrCoreParameters.f175447D = rowVar.m182471i();
        this.mrCoreParameters.f175456M = 1;
    }

    private ArrayList<XEFaceInfo> makeInfo(VideoInfo videoInfo, FacerigV3Info facerigV3Info) {
        float[] fArr;
        SingleFaceInfo[] singleFaceInfoArr = videoInfo.facesinfo_;
        if (singleFaceInfoArr == null || singleFaceInfoArr.length == 0) {
            return null;
        }
        SingleFaceInfo singleFaceInfo = singleFaceInfoArr[0];
        ArrayList<XEFaceInfo> arrayList = new ArrayList<>();
        XEFaceInfo xEFaceInfo = new XEFaceInfo();
        arrayList.add(xEFaceInfo);
        xEFaceInfo.landmarks68 = singleFaceInfo.landmarks_68_;
        xEFaceInfo.landmarks96 = singleFaceInfo.landmarks_96_;
        xEFaceInfo.faceBounds = singleFaceInfo.face_rect_;
        float[] fArr2 = singleFaceInfo.euler_angles_;
        xEFaceInfo.pitch = fArr2[0];
        xEFaceInfo.yaw = fArr2[1];
        xEFaceInfo.roll = fArr2[2];
        xEFaceInfo.trackId = singleFaceInfo.tracking_id_;
        xEFaceInfo.cameraMatrix = singleFaceInfo.camera_matrix_;
        xEFaceInfo.rotationMatrix = singleFaceInfo.rotation_matrix_;
        xEFaceInfo.rotationVector = singleFaceInfo.rotation_vector_;
        xEFaceInfo.translationVector = singleFaceInfo.translation_vector_;
        xEFaceInfo.projectionMatrix = singleFaceInfo.projection_matrix_;
        xEFaceInfo.modelViewMatrix = singleFaceInfo.modelview_matrix_;
        if (facerigV3Info != null && (fArr = facerigV3Info.facerigV3_eulers_) != null) {
            xEFaceInfo.facerigStates = facerigV3Info.facerigV3_scores_;
            float[] fArr3 = new float[54];
            System.arraycopy(fArr, 0, fArr3, 0, 3);
            System.arraycopy(facerigV3Info.facerigV3_scores_, 0, fArr3, 3, 51);
            xEFaceInfo.facerigStates = fArr3;
        }
        xEFaceInfo.meType = 1;
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void process(byte[] bArr) {
        ArrayList<XEFaceInfo> arrayListMakeInfo;
        XEEventDispatcher eventDispatcher;
        float[] fArr;
        this.mFrameIndex++;
        tow towVar = this.mrCoreParameters;
        if (towVar.f175478e == 0 || towVar.f175480f == 0) {
            return;
        }
        System.currentTimeMillis();
        this.mFaceRigInfo = new FacerigV3Info();
        setParams();
        MMFrame mMFrame = this.mMFrame;
        mMFrame.data_ptr_ = bArr;
        mMFrame.data_len_ = bArr.length;
        if (this.mVideoProcessor.ProcessFrame(mMFrame, this.mVideoParams, this.mVideoInfo)) {
            SingleFaceInfo[] singleFaceInfoArr = this.mVideoInfo.facesinfo_;
            if (singleFaceInfoArr == null || singleFaceInfoArr.length <= 0) {
                arrayListMakeInfo = null;
            } else {
                SingleFaceInfo singleFaceInfo = singleFaceInfoArr[0];
                this.mFacerigV3Params.orig_landmarks_96_ = singleFaceInfo.orig_landmarks_96_;
                MMFrame mMFrame2 = new MMFrame();
                tow towVar2 = this.mrCoreParameters;
                int i = towVar2.f175478e;
                mMFrame2.width_ = i;
                int i2 = towVar2.f175480f;
                mMFrame2.height_ = i2;
                mMFrame2.step_ = i;
                mMFrame2.data_len_ = ((i * i2) * 3) / 2;
                mMFrame2.format_ = 17;
                mMFrame2.data_ptr_ = bArr;
                FacerigV3Params facerigV3Params = this.mFacerigV3Params;
                if (facerigV3Params.orig_landmarks_96_ != null && (fArr = singleFaceInfo.euler_angles_) != null && fArr.length > 2) {
                    facerigV3Params.face_processor_eulers_ = fArr;
                    facerigV3Params.fliped_show_ = this.mVideoParams.fliped_show_;
                }
                this.mFaceRig.ProcessFrame(mMFrame2, facerigV3Params, this.mFaceRigInfo);
                arrayListMakeInfo = makeInfo(this.mVideoInfo, this.mFaceRigInfo);
            }
            if (this.mOnFaceDetectListener != null) {
                if (arrayListMakeInfo == null || arrayListMakeInfo.size() <= 0) {
                    this.mOnFaceDetectListener.hasFaceDetectInfo(false);
                } else {
                    this.mOnFaceDetectListener.hasFaceDetectInfo(true);
                }
            }
            XE3DEngine xE3DEngine = this.mXE3DEngine;
            if (xE3DEngine != null && (eventDispatcher = xE3DEngine.getEventDispatcher()) != null) {
                eventDispatcher.dispatchFaceInfo(arrayListMakeInfo);
            }
            this.processIntevla = System.currentTimeMillis();
        }
    }

    private void setParams() {
        MMFrame mMFrame = new MMFrame();
        this.mMFrame = mMFrame;
        tow towVar = this.mrCoreParameters;
        int i = towVar.f175478e;
        mMFrame.width_ = i;
        mMFrame.height_ = towVar.f175480f;
        mMFrame.format_ = 17;
        mMFrame.step_ = i;
        VideoParams videoParams = new VideoParams();
        this.mVideoParams = videoParams;
        videoParams.max_faces_ = 1;
        int i2 = this.mrCoreParameters.f175447D;
        videoParams.rotate_degree_ = i2 == 0 ? this.mCamera.mo104571m() : 270 - i2;
        this.mVideoParams.restore_degree_ = this.mCamera.mo104571m();
        this.mVideoParams.fliped_show_ = this.mCamera.mo104568i();
        VideoParams videoParams2 = this.mVideoParams;
        videoParams2.detect_single_frame_ = false;
        videoParams2.save_features_ = false;
        videoParams2.use_npd_ = true;
        videoParams2.use_mix_ = false;
        videoParams2.asynchronous_save_features_ = true;
        videoParams2.feature_strict_ = false;
        videoParams2.pose_estimation_type_ = 1;
        videoParams2.save_features_version_ = FaceFeaturesParams.BigFeatureVersion.f15488V1;
        videoParams2.track_switch_ = false;
        videoParams2.beauty_switch_ = false;
        videoParams2.skin_switch_ = false;
        videoParams2.multifaces_switch_ = false;
        videoParams2.warp_type_ = 0;
        videoParams2.warp_level1_ = 0.0f;
        videoParams2.warp_level2_ = 0.0f;
        videoParams2.expression_switch_ = false;
        videoParams2.eye_classify_switch_ = false;
        videoParams2.face_alignment_version_ = 0;
        videoParams2.focal_length_multiply_ = 10.0f;
        videoParams2.do_facedect_corp_center_ = true;
        videoParams2.asynchronous_face_detect_ = true;
        videoParams2.debug_on_ = false;
        this.mVideoInfo = new VideoInfo();
        FacerigV3Params facerigV3Params = new FacerigV3Params();
        this.mFacerigV3Params = facerigV3Params;
        int i3 = this.mrCoreParameters.f175447D;
        facerigV3Params.rotate_degree_ = i3 == 0 ? this.mCamera.mo104571m() : 270 - i3;
        this.mFacerigV3Params.restore_degree_ = this.mCamera.mo104571m();
    }

    public boolean initAnimoji(XE3DEngine xE3DEngine, int i, row rowVar) {
        this.mXE3DEngine = xE3DEngine;
        synchronized (this.syncObj) {
            try {
                this.mrCoreParameters = new tow();
                initCoreParams(rowVar);
                initInternalParamter(this.mrCoreParameters);
                if (!this.mCamera.mo104554G(i, rowVar)) {
                    MDLog.m7445e(MDLogTag.ANIMOJI_UTIL_TAG, "Camera prepare Failed!");
                    return false;
                }
                this.mCamera.mo104558K(this);
                DataDotUtils.getInstance().getRecoderDataDotInfo().setCameraDetectAnimoji(true);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void initInternalParamter(tow towVar) {
        this.mCamera = new biw(towVar);
        this.mBasicRender = new BasicRender(towVar);
    }

    public boolean loadFaceDetectMode(String str, String str2) {
        VideoProcessor videoProcessor = new VideoProcessor();
        this.mVideoProcessor = videoProcessor;
        if (videoProcessor.LoadModel(str, str2)) {
            return true;
        }
        MDLog.m7445e(MDLogTag.ANIMOJI_UTIL_TAG, "initData: videoProcessor load model failed");
        return false;
    }

    public boolean loadFaceRigMode(String str) {
        FaceRigV3 faceRigV3 = new FaceRigV3();
        this.mFaceRig = faceRigV3;
        if (faceRigV3.LoadModel(str)) {
            return true;
        }
        MDLog.m7445e(MDLogTag.ANIMOJI_UTIL_TAG, "initData: faceRig loadModel failed");
        return false;
    }

    @Override // p153l.xpl.InterfaceC21407a
    public void onData(byte[] bArr) {
        if (this.mFaceRig == null || this.mVideoProcessor == null) {
            return;
        }
        this.lastCameraTime = System.currentTimeMillis();
        if (this.mHandler == null) {
            HandlerThread handlerThread = new HandlerThread("AniUtilProc");
            this.mHandlerThread = handlerThread;
            handlerThread.start();
            this.mHandler = new Handler(this.mHandlerThread.getLooper()) { // from class: com.momo.mcamera.AnimojiUtils.AnimojiUtil.1
                @Override // android.os.Handler
                public void handleMessage(Message message) {
                    byte[] bArrPollFirst;
                    super.handleMessage(message);
                    synchronized (AnimojiUtil.this.syncLock) {
                        bArrPollFirst = AnimojiUtil.this.dataList.pollFirst();
                    }
                    AnimojiUtil.this.process(bArrPollFirst);
                    synchronized (AnimojiUtil.this.syncLock) {
                        AnimojiUtil.this.emptyList.addLast(bArrPollFirst);
                    }
                }
            };
        }
        if (this.dataList == null || this.emptyList == null) {
            this.dataList = new LinkedList<>();
            this.emptyList = new LinkedList<>();
            for (int i = 0; i < 3; i++) {
                this.emptyList.addLast(new byte[bArr.length]);
            }
        }
        System.currentTimeMillis();
        synchronized (this.syncLock) {
            try {
                if (this.emptyList.size() > 0) {
                    System.currentTimeMillis();
                    byte[] bArrPollFirst = this.emptyList.pollFirst();
                    System.arraycopy(bArr, 0, bArrPollFirst, 0, bArr.length);
                    this.dataList.addLast(bArrPollFirst);
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 0;
                    this.mHandler.sendMessage(messageObtain);
                    this.lastSendTime = System.currentTimeMillis();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void release() {
        MDLog.m7449i(MDLogTag.ANIMOJI_UTIL_TAG, "AnimojiUtil release");
        synchronized (this.syncObj) {
            try {
                VideoProcessor videoProcessor = this.mVideoProcessor;
                if (videoProcessor != null) {
                    videoProcessor.Release();
                }
                FaceRigV3 faceRigV3 = this.mFaceRig;
                if (faceRigV3 != null) {
                    faceRigV3.Release();
                }
                xpl xplVar = this.mCamera;
                if (xplVar != null) {
                    xplVar.mo104558K(null);
                    this.mCamera.release();
                    this.mCameraTexture = null;
                    this.isPreviewing = false;
                }
                HandlerThread handlerThread = this.mHandlerThread;
                if (handlerThread != null) {
                    handlerThread.quit();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setOnFaceDetectListener(OnFaceDetectListener onFaceDetectListener) {
        this.mOnFaceDetectListener = onFaceDetectListener;
    }

    public void startPreview() {
        BasicRender basicRender;
        MDLog.m7449i(MDLogTag.ANIMOJI_UTIL_TAG, "AnimojiUtil startPreview");
        synchronized (this.syncObj) {
            try {
                if (this.isPreviewing) {
                    return;
                }
                if (this.mCamera != null && (basicRender = this.mBasicRender) != null) {
                    this.mCameraTexture = basicRender.createTexture();
                    this.mCamera.mo104558K(null);
                    this.mCamera.mo104558K(this);
                    this.mCamera.mo104569j(this.mCameraTexture);
                }
                this.isPreviewing = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void stopPreview() {
        MDLog.m7449i(MDLogTag.ANIMOJI_UTIL_TAG, "AnimojiUtil stopPreview");
        synchronized (this.syncObj) {
            try {
                xpl xplVar = this.mCamera;
                if (xplVar != null) {
                    xplVar.mo104558K(null);
                    this.mCamera.mo104561a();
                }
                this.mCameraTexture = null;
                this.isPreviewing = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
