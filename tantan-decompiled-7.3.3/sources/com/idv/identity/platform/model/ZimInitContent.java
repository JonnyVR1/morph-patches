package com.idv.identity.platform.model;

/* JADX INFO: loaded from: classes7.dex */
public class ZimInitContent {
    public String AccessKeyId;
    public String AccessKeySecret;
    public float AlbumMaxWidth;
    public String BizCode;
    public String BizMessage;
    public String BucketName;
    public String CertifyId;
    public String ExtProtocol;
    public String FileNamePrefix;
    public int ImageCount;
    public String NowDate;
    public String Ocr;
    public float OriPicMaxWidth;
    public String OssEndPoint;
    public float PictureMaxWidth;
    public float PictureQuality;
    public String Protocol;
    public String SecurityToken;
    public int docPageTotalNum;
    public String docType;
    public String productCode;

    public String getAccessKeyId() {
        return this.AccessKeyId;
    }

    public String getAccessKeySecret() {
        return this.AccessKeySecret;
    }

    public float getAlbumMaxWidth() {
        return this.AlbumMaxWidth;
    }

    public String getBizCode() {
        return !isValid() ? "" : this.BizCode;
    }

    public String getBizMessage() {
        return !isValid() ? "" : this.BizMessage;
    }

    public String getBucketName() {
        return this.BucketName;
    }

    public String getCertifyId() {
        return this.CertifyId;
    }

    public int getDocPageTotalNum() {
        return this.docPageTotalNum;
    }

    public String getDocType() {
        return this.docType;
    }

    public String getExtProtocol() {
        return this.ExtProtocol;
    }

    public String getFileName() {
        return this.FileNamePrefix;
    }

    public int getImageCount() {
        return this.ImageCount;
    }

    public String getNowDate() {
        return this.NowDate;
    }

    public String getOcrSwitch() {
        return this.Ocr;
    }

    public float getOriPicMaxWidth() {
        return this.OriPicMaxWidth;
    }

    public String getOssEndPoint() {
        return this.OssEndPoint;
    }

    public float getPictureMaxWidth() {
        return this.PictureMaxWidth;
    }

    public float getPictureQuality() {
        return this.PictureQuality;
    }

    public String getProductCode() {
        return this.productCode;
    }

    public String getProtocol() {
        return this.Protocol;
    }

    public String getSecurityToken() {
        return this.SecurityToken;
    }

    public boolean isInitSuccess() {
        if (isValid()) {
            return "CODE_INIT_SUCCESS".equalsIgnoreCase(this.BizCode);
        }
        return false;
    }

    public boolean isValid() {
        return true;
    }

    public void setImageCount(int i) {
        this.ImageCount = i;
    }
}
