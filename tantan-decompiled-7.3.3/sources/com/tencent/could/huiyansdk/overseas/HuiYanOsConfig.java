package com.tencent.could.huiyansdk.overseas;

import android.content.Context;
import com.tencent.could.aicamare.enums.CameraZoom;
import com.tencent.could.huiyansdk.entity.AuthUiConfig;
import com.tencent.could.huiyansdk.entity.LanguageStyle;
import com.tencent.could.huiyansdk.enums.FaceAngleValidation;
import com.tencent.could.huiyansdk.enums.FaceOcclusionLevel;
import com.tencent.could.huiyansdk.enums.PageColorStyle;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes12.dex */
public class HuiYanOsConfig {
    public static final long LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT = 30000;
    public static final String TAG = "HuiYanOsConfig";
    public AuthUiConfig authUiConfig;
    public WeakReference<Context> contextWeakReference;
    public boolean isDeleteVideoCache = true;
    public String authLicense = "";
    public PageColorStyle pageColorStyle = PageColorStyle.Light;
    public long authTimeOutMs = LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT;
    public boolean isShowGuidePage = true;
    public LanguageStyle languageStyle = LanguageStyle.AUTO;
    public String languageCode = "";
    public boolean isOpenLog = true;
    public boolean isOpenFullLog = false;
    public String[] backUpIPs = {"101.91.40.22", "116.128.171.41", "112.65.195.52"};
    public String backUpHost = "";
    public boolean isUseBackCamera = false;
    public float smallFaceRatioThreshold = 0.5f;
    public float bigFaceRatioThreshold = 0.8f;
    public CameraZoom zoomLevel = CameraZoom.ZOOM_1X;
    public boolean isOpenBOTCheck = false;
    public long longCheckTimeOutMs = LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT;
    public boolean showPrivacyPolicyDialog = true;
    public boolean disableSystemRecordScreen = false;
    public boolean isOtherActionCheckMouthOpen = false;
    public FaceAngleValidation faceAngleValidation = FaceAngleValidation.LevelLoose;
    public FaceOcclusionLevel faceOcclusionLevel = FaceOcclusionLevel.STRICT;
    public int delayTimeMsOfLoadFragment = 1;

    public String getAuthLicense() {
        return this.authLicense;
    }

    public long getAuthTimeOutMs() {
        return this.authTimeOutMs;
    }

    public AuthUiConfig getAuthUiConfig() {
        return this.authUiConfig;
    }

    public String getBackUpHost() {
        return this.backUpHost;
    }

    public String[] getBackUpIPs() {
        return this.backUpIPs;
    }

    public float getBigFaceRatioThreshold() {
        return this.bigFaceRatioThreshold;
    }

    public int getDelayTimeMsOfLoadFragment() {
        return this.delayTimeMsOfLoadFragment;
    }

    public FaceAngleValidation getFaceAngleValidation() {
        return this.faceAngleValidation;
    }

    public FaceOcclusionLevel getFaceOcclusionLevel() {
        return this.faceOcclusionLevel;
    }

    public String getLanguageCode() {
        return this.languageCode;
    }

    public LanguageStyle getLanguageStyle() {
        return this.languageStyle;
    }

    public long getLongCheckTimeOutMs() {
        return this.longCheckTimeOutMs;
    }

    public PageColorStyle getPageColorStyle() {
        return this.pageColorStyle;
    }

    public float getSmallFaceRatioThreshold() {
        return this.smallFaceRatioThreshold;
    }

    public Context getStartActivityContext() {
        WeakReference<Context> weakReference = this.contextWeakReference;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public CameraZoom getZoomLevel() {
        return this.zoomLevel;
    }

    public boolean isDeleteVideoCache() {
        return this.isDeleteVideoCache;
    }

    public boolean isDisableSystemRecordScreen() {
        return this.disableSystemRecordScreen;
    }

    public boolean isOpenBOTCheck() {
        return this.isOpenBOTCheck;
    }

    public boolean isOpenFullLog() {
        return this.isOpenFullLog;
    }

    public boolean isOpenLog() {
        return this.isOpenLog;
    }

    public boolean isOtherActionCheckMouthOpen() {
        return this.isOtherActionCheckMouthOpen;
    }

    public boolean isShowGuidePage() {
        return this.isShowGuidePage;
    }

    public boolean isShowPrivacyPolicyDialog() {
        return this.showPrivacyPolicyDialog;
    }

    public boolean isUseBackCamera() {
        return this.isUseBackCamera;
    }

    public void setAuthLicense(String str) {
        this.authLicense = str;
    }

    public void setAuthTimeOutMs(long j) {
        this.authTimeOutMs = j;
    }

    public void setAuthUiConfig(AuthUiConfig authUiConfig) {
        this.authUiConfig = authUiConfig;
    }

    public void setBackUpHost(String str) {
        this.backUpHost = str;
    }

    public void setBackUpIPs(String[] strArr) {
        this.backUpIPs = strArr;
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

    public void setDelayTimeMsOfLoadFragment(int i) {
        this.delayTimeMsOfLoadFragment = i;
    }

    public void setDeleteVideoCache(boolean z) {
        this.isDeleteVideoCache = z;
    }

    public void setDisableSystemRecordScreen(boolean z) {
        this.disableSystemRecordScreen = z;
    }

    public void setFaceAngleValidation(FaceAngleValidation faceAngleValidation) {
        this.faceAngleValidation = faceAngleValidation;
    }

    public void setFaceOcclusionLevel(FaceOcclusionLevel faceOcclusionLevel) {
        this.faceOcclusionLevel = faceOcclusionLevel;
    }

    public void setLanguageCode(String str) {
        this.languageCode = str;
    }

    public void setLanguageStyle(LanguageStyle languageStyle) {
        this.languageStyle = languageStyle;
    }

    public void setLongCheckTimeOutMs(long j) {
        this.longCheckTimeOutMs = j;
    }

    public void setOpenBOTCheck(boolean z) {
        this.isOpenBOTCheck = z;
    }

    public void setOpenFullLog(boolean z) {
        this.isOpenFullLog = z;
    }

    public void setOpenLog(boolean z) {
        this.isOpenLog = z;
    }

    public void setOtherActionCheckMouthOpen(boolean z) {
        this.isOtherActionCheckMouthOpen = z;
    }

    public void setPageColorStyle(PageColorStyle pageColorStyle) {
        this.pageColorStyle = pageColorStyle;
    }

    public void setShowGuidePage(boolean z) {
        this.isShowGuidePage = z;
    }

    public void setShowPrivacyPolicyDialog(boolean z) {
        this.showPrivacyPolicyDialog = z;
    }

    public void setSmallFaceRatioThreshold(float f) {
        if (f < 0.0f) {
            this.smallFaceRatioThreshold = 0.0f;
        } else if (f > 1.0f) {
            this.smallFaceRatioThreshold = 1.0f;
        } else {
            this.smallFaceRatioThreshold = f;
        }
    }

    public void setStartActivityContext(Context context) {
        this.contextWeakReference = new WeakReference<>(context);
    }

    public void setUseBackCamera(boolean z) {
        this.isUseBackCamera = z;
    }

    public void setZoomLevel(CameraZoom cameraZoom) {
        this.zoomLevel = cameraZoom;
    }

    public String toString() {
        return "HuiYanOsConfig{isDeleteVideoCache=" + this.isDeleteVideoCache + ", authTimeOutMs=" + this.authTimeOutMs + ", isShowGuidePage=" + this.isShowGuidePage + ", isUseBackCamera=" + this.isUseBackCamera + ", smallFaceRatioThreshold=" + this.smallFaceRatioThreshold + ", bigFaceRatioThreshold=" + this.bigFaceRatioThreshold + ", isOpenBOTCheck=" + this.isOpenBOTCheck + ", longCheckTimeOutMs=" + this.longCheckTimeOutMs + ", showPrivacyPolicyDialog=" + this.showPrivacyPolicyDialog + ", disableSystemRecordScreen=" + this.disableSystemRecordScreen + ", isOtherActionCheckMouthOpen=" + this.isOtherActionCheckMouthOpen + ", faceAngleValidation=" + this.faceAngleValidation + ", faceOcclusionLevel=" + this.faceOcclusionLevel + '}';
    }
}
