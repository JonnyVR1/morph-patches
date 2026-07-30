package com.tencent.could.huiyansdk.entity;

import android.content.Context;
import com.tencent.could.aicamare.enums.CameraZoom;
import com.tencent.could.huiyansdk.enums.FaceOcclusionLevel;
import com.tencent.could.huiyansdk.enums.HuiYanAction;
import com.tencent.could.huiyansdk.enums.HuiYanEncryptMode;
import com.tencent.could.huiyansdk.enums.HuiYanLiveMode;
import com.tencent.could.huiyansdk.enums.PackageTest;
import com.tencent.could.huiyansdk.enums.PageColorStyle;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class HuiYanSdkConfig {
    public HuiYanAction[] actions;
    public WeakReference<Context> contextWeakReference;
    public int changePointNum = 2;
    public boolean isDeleteVideoCache = true;
    public String authLicense = "";
    public String authLicenseStr = "";
    public String useCustomerModelPath = "";
    public PageColorStyle pageColorStyle = PageColorStyle.Light;
    public long prepareFaceTimeOutMs = HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT;
    public long authTimeOutMs = HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT;
    public long longCheckTimeOutMs = HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT;
    public boolean isCloseEncrypt = false;
    public LanguageStyle languageStyle = LanguageStyle.AUTO;
    public String languageCode = "";
    public boolean isRecordVideo = true;
    public boolean isCutRecordVideo = true;
    public long cutVideoDuration = 2000;
    public PackageTest packageTest = PackageTest.MEDIUM;
    public boolean isBackgroundStopAuth = true;
    public boolean waitingUserCompare = false;
    public boolean disableSystemRecordScreen = false;
    public boolean isUseBackCamera = false;
    public float bestImageRoll = 30.0f;
    public float bestImageYaw = 30.0f;
    public float bestImagePitch = 40.0f;
    public float longCheckFaceMaxHeightThreshold = 0.8f;
    public float longCheckFaceMinHeightThreshold = 0.6f;
    public float longCheckCloseMouthThreshold = 0.25f;
    public float longCheckCloseEyeRightThreshold = 0.25f;
    public float longCheckCloseEyeLeftThreshold = 0.25f;
    public float longCheckFaceRealMinHeightThreshold = 0.4f;
    public boolean isNeedCropBestImageMode = true;
    public int longCheckNeedBestOriginalSize = 0;
    public int longCheckBestImageQuality = 90;
    public float bigFaceRatioThreshold = 0.8f;
    public int bestImageContinuousFrameNum = 1;
    public HuiYanLiveMode huiYanLiveMode = HuiYanLiveMode.ACTION_REFLECT_MODE;
    public HuiYanEncryptMode encryptMode = HuiYanEncryptMode.AES;
    public boolean isOpenLog = true;
    public CameraZoom zoomLevel = CameraZoom.ZOOM_1X;
    public boolean mustDiffMinAndMaxFps = false;
    public boolean isOpenAngleDetect = false;
    public boolean isAutoScreenBrightness = true;
    public boolean isOpenLongCheck = false;
    public boolean isUseBestFaceImage = false;
    public boolean isLandMode = false;
    public float landCloseRatio = 0.35f;
    public float portraitCloseRatio = 0.5f;
    public boolean isShowPrepareTimeout = true;
    public boolean isShowLongCheckTimeout = true;
    public boolean isShowActionTimeout = true;
    public boolean longCheckUseLocalCloseMouthThreshold = false;
    public boolean longCheckUseBlurMode = false;
    public boolean openFullLog = false;
    public boolean showDebugView = false;
    public boolean justCheckRawCamera = false;
    public boolean isOpenLightReflectAnim = false;
    public boolean useTransition = false;
    public long transitionTime = 3000;
    public long checkEnvRiskTimeout = 3000;
    public boolean openCheckRiskMode = false;
    public boolean showPrivacyPolicyDialog = false;
    public int policyDialogResId = -1;
    public boolean isRelaxed = false;
    public boolean isOtherActionCheckMouthOpen = false;
    public int delayTimeMsOfLoadFragment = 1;
    public FaceOcclusionLevel faceOcclusionLevel = FaceOcclusionLevel.STRICT;

    public HuiYanAction[] getActions() {
        return this.actions;
    }

    public String getAuthLicense() {
        return this.authLicense;
    }

    public String getAuthLicenseStr() {
        return this.authLicenseStr;
    }

    public long getAuthTimeOutMs() {
        return this.authTimeOutMs;
    }

    public int getBestImageContinuousFrameNum() {
        return this.bestImageContinuousFrameNum;
    }

    public float getBestImagePitch() {
        return this.bestImagePitch;
    }

    public float getBestImageRoll() {
        return this.bestImageRoll;
    }

    public float getBestImageYaw() {
        return this.bestImageYaw;
    }

    public float getBigFaceRatioThreshold() {
        return this.bigFaceRatioThreshold;
    }

    public int getChangePointNum() {
        return this.changePointNum;
    }

    public long getCheckEnvRiskTimeout() {
        return this.checkEnvRiskTimeout;
    }

    public long getCutVideoDuration() {
        return this.cutVideoDuration;
    }

    public int getDelayTimeMsOfLoadFragment() {
        return this.delayTimeMsOfLoadFragment;
    }

    public HuiYanEncryptMode getEncryptMode() {
        return this.encryptMode;
    }

    public FaceOcclusionLevel getFaceOcclusionLevel() {
        return this.faceOcclusionLevel;
    }

    public HuiYanLiveMode getHuiYanLiveMode() {
        return this.huiYanLiveMode;
    }

    public float getLandCloseRatio() {
        return this.landCloseRatio;
    }

    public String getLanguageCode() {
        return this.languageCode;
    }

    public LanguageStyle getLanguageStyle() {
        return this.languageStyle;
    }

    public int getLongCheckBestImageQuality() {
        return this.longCheckBestImageQuality;
    }

    public float getLongCheckCloseEyeLeftThreshold() {
        return this.longCheckCloseEyeLeftThreshold;
    }

    public float getLongCheckCloseEyeRightThreshold() {
        return this.longCheckCloseEyeRightThreshold;
    }

    public float getLongCheckCloseMouthThreshold() {
        return this.longCheckCloseMouthThreshold;
    }

    public float getLongCheckFaceMaxHeightThreshold() {
        return this.longCheckFaceMaxHeightThreshold;
    }

    public float getLongCheckFaceMinHeightThreshold() {
        return this.longCheckFaceMinHeightThreshold;
    }

    public float getLongCheckFaceRealMinHeightThreshold() {
        return this.longCheckFaceRealMinHeightThreshold;
    }

    public int getLongCheckNeedBestOriginalSize() {
        return this.longCheckNeedBestOriginalSize;
    }

    public long getLongCheckTimeOutMs() {
        return this.longCheckTimeOutMs;
    }

    public PackageTest getPackageTest() {
        return this.packageTest;
    }

    public PageColorStyle getPageColorStyle() {
        return this.pageColorStyle;
    }

    public int getPolicyDialogResId() {
        return this.policyDialogResId;
    }

    public float getPortraitCloseRatio() {
        return this.portraitCloseRatio;
    }

    public long getPrepareFaceTimeOutMs() {
        return this.prepareFaceTimeOutMs;
    }

    public Context getStartActivityContext() {
        WeakReference<Context> weakReference = this.contextWeakReference;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public long getTransitionTime() {
        return this.transitionTime;
    }

    public String getUseCustomerModelPath() {
        return this.useCustomerModelPath;
    }

    public CameraZoom getZoomLevel() {
        return this.zoomLevel;
    }

    public boolean isAutoScreenBrightness() {
        return this.isAutoScreenBrightness;
    }

    public boolean isBackgroundStopAuth() {
        return this.isBackgroundStopAuth;
    }

    public boolean isCloseEncrypt() {
        return this.isCloseEncrypt;
    }

    public boolean isCutRecordVideo() {
        return this.isCutRecordVideo;
    }

    public boolean isDeleteVideoCache() {
        return this.isDeleteVideoCache;
    }

    public boolean isDisableSystemRecordScreen() {
        return this.disableSystemRecordScreen;
    }

    public boolean isJustCheckRawCamera() {
        return this.justCheckRawCamera;
    }

    public boolean isLandMode() {
        return this.isLandMode;
    }

    public boolean isLongCheckUseBlurMode() {
        return this.longCheckUseBlurMode;
    }

    public boolean isLongCheckUseLocalCloseMouthThreshold() {
        return this.longCheckUseLocalCloseMouthThreshold;
    }

    public boolean isMustDiffMinAndMaxFps() {
        return this.mustDiffMinAndMaxFps;
    }

    public boolean isNeedCropBestImageMode() {
        return this.isNeedCropBestImageMode;
    }

    public boolean isOpenAngleDetect() {
        return this.isOpenAngleDetect;
    }

    public boolean isOpenCheckRiskMode() {
        return this.openCheckRiskMode;
    }

    public boolean isOpenFullLog() {
        return this.openFullLog;
    }

    public boolean isOpenLightReflectAnim() {
        return this.isOpenLightReflectAnim;
    }

    public boolean isOpenLog() {
        return this.isOpenLog;
    }

    public boolean isOpenLongCheck() {
        return this.isOpenLongCheck;
    }

    public boolean isOtherActionCheckMouthOpen() {
        return this.isOtherActionCheckMouthOpen;
    }

    public boolean isRecordVideo() {
        return this.isRecordVideo;
    }

    public boolean isRelaxed() {
        return this.isRelaxed;
    }

    public boolean isShowActionTimeout() {
        return this.isShowActionTimeout;
    }

    public boolean isShowDebugView() {
        return this.showDebugView;
    }

    public boolean isShowLongCheckTimeout() {
        return this.isShowLongCheckTimeout;
    }

    public boolean isShowPrepareTimeout() {
        return this.isShowPrepareTimeout;
    }

    public boolean isShowPrivacyPolicyDialog() {
        return this.showPrivacyPolicyDialog;
    }

    public boolean isUseBackCamera() {
        return this.isUseBackCamera;
    }

    public boolean isUseBestFaceImage() {
        return this.isUseBestFaceImage;
    }

    public boolean isUseTransition() {
        return this.useTransition;
    }

    public boolean isWaitingUserCompare() {
        return this.waitingUserCompare;
    }

    public void setActions(HuiYanAction[] huiYanActionArr) {
        this.actions = huiYanActionArr;
    }

    public void setAuthLicense(String str) {
        this.authLicense = str;
    }

    public void setAuthLicenseStr(String str) {
        this.authLicenseStr = str;
    }

    public void setAuthTimeOutMs(long j) {
        this.authTimeOutMs = j;
    }

    public void setAutoScreenBrightness(boolean z) {
        this.isAutoScreenBrightness = z;
    }

    public void setBackgroundStopAuth(boolean z) {
        this.isBackgroundStopAuth = z;
    }

    public void setBestImageContinuousFrameNum(int i) {
        if (i < 1) {
            this.bestImageContinuousFrameNum = 1;
        } else if (i > 30) {
            this.bestImageContinuousFrameNum = 30;
        } else {
            this.bestImageContinuousFrameNum = i;
        }
    }

    public void setBestImagePitch(float f) {
        if (f < 2.0f) {
            this.bestImagePitch = 2.0f;
        } else if (f > 40.0f) {
            this.bestImagePitch = 40.0f;
        } else {
            this.bestImagePitch = f;
        }
    }

    public void setBestImageRoll(float f) {
        if (f < 2.0f) {
            this.bestImageRoll = 2.0f;
        } else if (f > 30.0f) {
            this.bestImageRoll = 30.0f;
        } else {
            this.bestImageRoll = f;
        }
    }

    public void setBestImageYaw(float f) {
        if (f < 2.0f) {
            this.bestImageYaw = 2.0f;
        } else if (f > 30.0f) {
            this.bestImageYaw = 30.0f;
        } else {
            this.bestImageYaw = f;
        }
    }

    public void setBigFaceRatioThreshold(float f) {
        if (f < 0.0f) {
            this.bigFaceRatioThreshold = 0.0f;
        } else if (f > 1.0f) {
            this.bigFaceRatioThreshold = 1.0f;
        } else {
            this.bigFaceRatioThreshold = f;
        }
    }

    public void setChangePointNum(Integer num) {
        if (num.intValue() < 2) {
            this.changePointNum = 2;
        } else if (num.intValue() > 8) {
            this.changePointNum = 8;
        } else {
            this.changePointNum = num.intValue();
        }
    }

    public void setCheckEnvRiskTimeout(long j) {
        this.checkEnvRiskTimeout = j;
    }

    public void setCloseEncrypt(boolean z) {
        this.isCloseEncrypt = z;
    }

    public void setCutRecordVideo(boolean z) {
        this.isCutRecordVideo = z;
    }

    public void setCutVideoDuration(long j) {
        if (j < 2000) {
            this.cutVideoDuration = 2000L;
        } else if (j > 6000) {
            this.cutVideoDuration = 6000L;
        } else {
            this.cutVideoDuration = j;
        }
    }

    public void setDelayTimeMsOfLoadFragment(int i) {
        this.delayTimeMsOfLoadFragment = i;
    }

    public void setDeleteVideoCache(boolean z) {
        this.isDeleteVideoCache = z;
    }

    public void setDisableSystemRecordScreen(boolean z) {
        this.disableSystemRecordScreen = z;
    }

    public void setEncryptMode(HuiYanEncryptMode huiYanEncryptMode) {
        this.encryptMode = huiYanEncryptMode;
    }

    public void setFaceOcclusionLevel(FaceOcclusionLevel faceOcclusionLevel) {
        this.faceOcclusionLevel = faceOcclusionLevel;
    }

    public void setHuiYanLiveMode(HuiYanLiveMode huiYanLiveMode) {
        this.huiYanLiveMode = huiYanLiveMode;
    }

    public void setJustCheckRawCamera(boolean z) {
        this.justCheckRawCamera = z;
    }

    public void setLandCloseRatio(float f) {
        this.landCloseRatio = f;
    }

    public void setLandMode(boolean z) {
        this.isLandMode = z;
    }

    public void setLanguageCode(String str) {
        this.languageCode = str;
    }

    public void setLanguageStyle(LanguageStyle languageStyle) {
        this.languageStyle = languageStyle;
    }

    public void setLongCheckBestImageQuality(int i) {
        if (i < 0) {
            this.longCheckBestImageQuality = 0;
        } else if (i > 100) {
            this.longCheckBestImageQuality = 100;
        } else {
            this.longCheckBestImageQuality = i;
        }
    }

    public void setLongCheckCloseEyeLeftThreshold(float f) {
        if (f < 0.0f) {
            this.longCheckCloseEyeLeftThreshold = 0.0f;
        } else if (f > 1.0f) {
            this.longCheckCloseEyeLeftThreshold = 1.0f;
        } else {
            this.longCheckCloseEyeLeftThreshold = f;
        }
    }

    public void setLongCheckCloseEyeRightThreshold(float f) {
        if (f < 0.0f) {
            this.longCheckCloseEyeRightThreshold = 0.0f;
        } else if (f > 1.0f) {
            this.longCheckCloseEyeRightThreshold = 1.0f;
        } else {
            this.longCheckCloseEyeRightThreshold = f;
        }
    }

    public void setLongCheckCloseMouthThreshold(float f) {
        if (f < 0.0f) {
            this.longCheckCloseMouthThreshold = 0.0f;
        } else if (f > 1.0f) {
            this.longCheckCloseMouthThreshold = 1.0f;
        } else {
            this.longCheckCloseMouthThreshold = f;
        }
    }

    public void setLongCheckFaceMaxHeightThreshold(float f) {
        if (f < 0.0f) {
            this.longCheckFaceMaxHeightThreshold = 0.0f;
        } else if (f > 1.0f) {
            this.longCheckFaceMaxHeightThreshold = 1.0f;
        } else {
            this.longCheckFaceMaxHeightThreshold = f;
        }
    }

    public void setLongCheckFaceMinHeightThreshold(float f) {
        if (f < 0.0f) {
            this.longCheckFaceMinHeightThreshold = 0.0f;
        } else if (f > 1.0f) {
            this.longCheckFaceMinHeightThreshold = 1.0f;
        } else {
            this.longCheckFaceMinHeightThreshold = f;
        }
    }

    public void setLongCheckFaceRealMinHeightThreshold(float f) {
        if (f < 0.0f) {
            this.longCheckFaceRealMinHeightThreshold = 0.0f;
        } else if (f > 1.0f) {
            this.longCheckFaceRealMinHeightThreshold = 1.0f;
        } else {
            this.longCheckFaceRealMinHeightThreshold = f;
        }
    }

    public void setLongCheckNeedBestOriginalSize(int i) {
        this.longCheckNeedBestOriginalSize = i;
    }

    public void setLongCheckTimeOutMs(long j) {
        this.longCheckTimeOutMs = j;
    }

    public void setLongCheckUseBlurMode(boolean z) {
        this.longCheckUseBlurMode = z;
    }

    public void setLongCheckUseLocalCloseMouthThreshold(boolean z) {
        this.longCheckUseLocalCloseMouthThreshold = z;
    }

    public void setMustDiffMinAndMaxFps(boolean z) {
        this.mustDiffMinAndMaxFps = z;
    }

    public void setNeedCropBestImageMode(boolean z) {
        this.isNeedCropBestImageMode = z;
    }

    public void setOpenAngleDetect(boolean z) {
        this.isOpenAngleDetect = z;
    }

    public void setOpenCheckRiskMode(boolean z) {
        this.openCheckRiskMode = z;
    }

    public void setOpenFullLog(boolean z) {
        this.openFullLog = z;
    }

    public void setOpenLightReflectAnim(boolean z) {
        this.isOpenLightReflectAnim = z;
    }

    public void setOpenLog(boolean z) {
        this.isOpenLog = z;
    }

    public void setOpenLongCheck(boolean z) {
        this.isOpenLongCheck = z;
    }

    public void setOtherActionCheckMouthOpen(boolean z) {
        this.isOtherActionCheckMouthOpen = z;
    }

    public void setPackageTest(PackageTest packageTest) {
        this.packageTest = packageTest;
    }

    public void setPageColorStyle(PageColorStyle pageColorStyle) {
        this.pageColorStyle = pageColorStyle;
    }

    public void setPolicyDialogResId(int i) {
        this.policyDialogResId = i;
    }

    public void setPortraitCloseRatio(float f) {
        this.portraitCloseRatio = f;
    }

    public void setPrepareFaceTimeOutMs(long j) {
        this.prepareFaceTimeOutMs = j;
    }

    public void setRecordVideo(boolean z) {
        this.isRecordVideo = z;
    }

    public void setRelaxed(boolean z) {
        this.isRelaxed = z;
    }

    public void setShowActionTimeout(boolean z) {
        this.isShowActionTimeout = z;
    }

    public void setShowDebugView(boolean z) {
        this.showDebugView = z;
    }

    public void setShowLongCheckTimeout(boolean z) {
        this.isShowLongCheckTimeout = z;
    }

    public void setShowPrepareTimeout(boolean z) {
        this.isShowPrepareTimeout = z;
    }

    public void setShowPrivacyPolicyDialog(boolean z) {
        this.showPrivacyPolicyDialog = z;
    }

    public void setSmallFaceRatioThreshold(float f) {
        if (this.isLandMode) {
            setLandCloseRatio(f);
        } else {
            setPortraitCloseRatio(f);
        }
    }

    public void setStartActivityContext(Context context) {
        this.contextWeakReference = new WeakReference<>(context);
    }

    public void setTransitionTime(long j) {
        this.transitionTime = j;
    }

    public void setUseBackCamera(boolean z) {
        this.isUseBackCamera = z;
    }

    public void setUseBestFaceImage(boolean z) {
        this.isUseBestFaceImage = z;
    }

    public void setUseCustomerModelPath(String str) {
        this.useCustomerModelPath = str;
    }

    public void setUseTransition(boolean z) {
        this.useTransition = z;
    }

    public void setWaitingUserCompare(boolean z) {
        this.waitingUserCompare = z;
    }

    public void setZoomLevel(CameraZoom cameraZoom) {
        this.zoomLevel = cameraZoom;
    }

    public String toString() {
        return "HuiYanSdkConfig{ changePointNum='" + this.changePointNum + ", isDeleteVideoCache=" + this.isDeleteVideoCache + ", authLicense='" + this.authLicense + "', useCustomerModelPath='" + this.useCustomerModelPath + "', pageColorStyle=" + this.pageColorStyle + ", prepareFaceTimeOutMs=" + this.prepareFaceTimeOutMs + ", authTimeOutMs=" + this.authTimeOutMs + ", isCloseEncrypt=" + this.isCloseEncrypt + ", languageStyle=" + this.languageStyle + ", languageCode='" + this.languageCode + "', isRecordVideo=" + this.isRecordVideo + ", isCutRecordVideo=" + this.isCutRecordVideo + ", packageTest=" + this.packageTest + ", isBackgroundStopAuth=" + this.isBackgroundStopAuth + ", waitingUserCompare=" + this.waitingUserCompare + ", disableSystemRecordScreen=" + this.disableSystemRecordScreen + ", isUseBackCamera=" + this.isUseBackCamera + ", bestImageRoll=" + this.bestImageRoll + ", bestImageYaw=" + this.bestImageYaw + ", bestImagePitch=" + this.bestImagePitch + ", bestImageContinuousFrameNum=" + this.bestImageContinuousFrameNum + ", huiYanLiveMode=" + this.huiYanLiveMode + ", encryptMode=" + this.encryptMode + ", isOpenAngleDetect=" + this.isOpenAngleDetect + ", isAutoScreenBrightness=" + this.isAutoScreenBrightness + ", isOpenLongCheck=" + this.isOpenLongCheck + ", longCheckTimeOutMs=" + this.longCheckTimeOutMs + ", longCheckFaceMaxHeightThreshold=" + this.longCheckFaceMaxHeightThreshold + ", longCheckFaceMinHeightThreshold=" + this.longCheckFaceMinHeightThreshold + ", longCheckCloseMouthThreshold=" + this.longCheckCloseMouthThreshold + ", longCheckCloseEyeRightThreshold=" + this.longCheckCloseEyeRightThreshold + ", longCheckCloseEyeLeftThreshold=" + this.longCheckCloseEyeLeftThreshold + ", bigFaceRatioThreshold=" + this.bigFaceRatioThreshold + ", actions=" + Arrays.toString(this.actions) + '}';
    }
}
