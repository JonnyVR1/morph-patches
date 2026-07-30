package com.core.glcore.datadot;

import com.core.glcore.util.JsonUtil;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class PhotoDataDotInfo implements Serializable {

    @SerializedName("photo_beauty_bigeye")
    private float photoBeautyBigeye;

    @SerializedName("photo_beauty_bodythin")
    private float photoBeautyBodyThin;

    @SerializedName("photo_beauty_legLenght")
    private float photoBeautyLegLenght;

    @SerializedName("photo_beauty_skinwhiten")
    private float photoBeautySkinWhiten;

    @SerializedName("photo_beauty_skinsmooth")
    private float photoBeautySkinsmooth;

    @SerializedName("photo_beauty_thinface")
    private float photoBeautyThinFace;

    @SerializedName("photo_detect_body_joint")
    private boolean photoDetectBody;

    @SerializedName("photo_detect_face")
    private boolean photoDetectFace;

    @SerializedName("photo_file_format")
    private String photoFileFormat;

    @SerializedName("photo_file_height")
    private int photoFileHeight;

    @SerializedName("photo_file_size")
    private long photoFileSize;

    @SerializedName("photo_file_width")
    private int photoFileWidth;

    @SerializedName("photo_filter_type")
    private int photoFilterType;

    @SerializedName("photo_origin_format")
    private String photoOriginFormat;

    @SerializedName("photo_origin_height")
    private int photoOriginHeight;

    @SerializedName("photo_origin_size")
    private long photoOriginSize;

    @SerializedName("photo_origin_width")
    private int photoOriginWidth;

    public static PhotoDataDotInfo getPhotoDataDot(String str) {
        return (PhotoDataDotInfo) JsonUtil.getInstance().fromJson(str, PhotoDataDotInfo.class);
    }

    public static String toPhotoDataDot(PhotoDataDotInfo photoDataDotInfo) {
        return JsonUtil.getInstance().toJson(photoDataDotInfo);
    }

    public float getPhotoBeautyBigeye() {
        return this.photoBeautyBigeye;
    }

    public float getPhotoBeautyBodyThin() {
        return this.photoBeautyBodyThin;
    }

    public float getPhotoBeautyLegLenght() {
        return this.photoBeautyLegLenght;
    }

    public float getPhotoBeautySkinWhiten() {
        return this.photoBeautySkinWhiten;
    }

    public float getPhotoBeautySkinsmooth() {
        return this.photoBeautySkinsmooth;
    }

    public float getPhotoBeautyThinFace() {
        return this.photoBeautyThinFace;
    }

    public String getPhotoFileFormat() {
        return this.photoFileFormat;
    }

    public int getPhotoFileHeight() {
        return this.photoFileHeight;
    }

    public long getPhotoFileSize() {
        return this.photoFileSize;
    }

    public int getPhotoFileWidth() {
        return this.photoFileWidth;
    }

    public int getPhotoFilterType() {
        return this.photoFilterType;
    }

    public String getPhotoOriginFormat() {
        return this.photoOriginFormat;
    }

    public int getPhotoOriginHeight() {
        return this.photoOriginHeight;
    }

    public long getPhotoOriginSize() {
        return this.photoOriginSize;
    }

    public int getPhotoOriginWidth() {
        return this.photoOriginWidth;
    }

    public boolean isPhotoDetectBody() {
        return this.photoDetectBody;
    }

    public boolean isPhotoDetectFace() {
        return this.photoDetectFace;
    }

    public void setPhotoBeautyBigeye(float f) {
        this.photoBeautyBigeye = f;
    }

    public void setPhotoBeautyBodyThin(float f) {
        this.photoBeautyBodyThin = f;
    }

    public void setPhotoBeautyLegLenght(float f) {
        this.photoBeautyLegLenght = f;
    }

    public void setPhotoBeautySkinWhiten(float f) {
        this.photoBeautySkinWhiten = f;
    }

    public void setPhotoBeautySkinsmooth(float f) {
        this.photoBeautySkinsmooth = f;
    }

    public void setPhotoBeautyThinFace(float f) {
        this.photoBeautyThinFace = f;
    }

    public void setPhotoDetectBody(boolean z) {
        this.photoDetectBody = z;
    }

    public void setPhotoDetectFace(boolean z) {
        this.photoDetectFace = z;
    }

    public void setPhotoFileFormat(String str) {
        this.photoFileFormat = str;
    }

    public void setPhotoFileHeight(int i) {
        this.photoFileHeight = i;
    }

    public void setPhotoFileSize(long j) {
        this.photoFileSize = j;
    }

    public void setPhotoFileWidth(int i) {
        this.photoFileWidth = i;
    }

    public void setPhotoFilterType(int i) {
        this.photoFilterType = i;
    }

    public void setPhotoOriginFormat(String str) {
        this.photoOriginFormat = str;
    }

    public void setPhotoOriginHeight(int i) {
        this.photoOriginHeight = i;
    }

    public void setPhotoOriginSize(long j) {
        this.photoOriginSize = j;
    }

    public void setPhotoOriginWidth(int i) {
        this.photoOriginWidth = i;
    }
}
