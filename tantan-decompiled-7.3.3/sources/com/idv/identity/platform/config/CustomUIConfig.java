package com.idv.identity.platform.config;

import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public class CustomUIConfig implements Serializable {
    private String errMsg;
    private FaceConfig faceConfig;
    private boolean isValid = true;
    private OCRConfig ocrConfig;

    public String getErrMsg() {
        return this.errMsg;
    }

    public FaceConfig getFaceConfig() {
        return this.faceConfig;
    }

    public OCRConfig getOcrConfig() {
        return this.ocrConfig;
    }

    public boolean isValid() {
        return this.isValid;
    }

    public void setErrMsg(String str) {
        this.errMsg = str;
    }

    public void setFaceConfig(FaceConfig faceConfig) {
        this.faceConfig = faceConfig;
    }

    public void setOcrConfig(OCRConfig oCRConfig) {
        this.ocrConfig = oCRConfig;
    }

    public void setValid(boolean z) {
        this.isValid = z;
    }

    public String toString() {
        return "CustomUIConfig{orcConfig=" + this.ocrConfig + ", faceConfig=" + this.faceConfig + ", errMsg='" + this.errMsg + "', isValid=" + this.isValid + '}';
    }
}
