package com.p041mm.mediasdk.log.cache;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
@Keep
public class EditPhotoLogData implements Serializable {

    @SerializedName("photo_beauty_bigeye")
    private float photoBeautyBigeye;

    @SerializedName("photo_beauty_bodythin")
    private float photoBeautyBodythin;

    @SerializedName("photo_beauty_legLenght")
    private float photoBeautyLegLenght;

    @SerializedName("photo_beauty_ruddy")
    private float photoBeautyRuddy;

    @SerializedName("photo_beauty_skinsmooth")
    private float photoBeautySkinsmooth;

    @SerializedName("photo_beauty_skinwhiten")
    private float photoBeautySkinwhiten;

    @SerializedName("photo_beauty_thinface")
    private float photoBeautyThinface;

    @SerializedName("photo_detect_body_joint")
    private boolean photoDetectBodyJoint;

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

    @SerializedName("photo_origin_format")
    private String photoOriginFormat;

    @SerializedName("photo_origin_height")
    private int photoOriginHeight;

    @SerializedName("photo_origin_size")
    private long photoOriginSize;

    @SerializedName("photo_origin_width")
    private int photoOriginWidth;

    public float getPhotoBeautyBigeye() {
        return this.photoBeautyBigeye;
    }

    public float getPhotoBeautyBodythin() {
        return this.photoBeautyBodythin;
    }

    public float getPhotoBeautyLegLenght() {
        return this.photoBeautyLegLenght;
    }

    public float getPhotoBeautyRuddy() {
        return this.photoBeautyRuddy;
    }

    public float getPhotoBeautySkinsmooth() {
        return this.photoBeautySkinsmooth;
    }

    public float getPhotoBeautySkinwhiten() {
        return this.photoBeautySkinwhiten;
    }

    public float getPhotoBeautyThinface() {
        return this.photoBeautyThinface;
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

    public int getPhotoOriginHeight() {
        return this.photoOriginHeight;
    }

    public long getPhotoOriginSize() {
        return this.photoOriginSize;
    }

    public int getPhotoOriginWidth() {
        return this.photoOriginWidth;
    }

    public boolean isPhotoDetectBodyJoint() {
        return this.photoDetectBodyJoint;
    }

    public boolean isPhotoDetectFace() {
        return this.photoDetectFace;
    }

    public void setPhotoBeautyBigeye(float f) {
        this.photoBeautyBigeye = f;
    }

    public void setPhotoBeautyBodythin(float f) {
        this.photoBeautyBodythin = f;
    }

    public void setPhotoBeautyLegLenght(float f) {
        this.photoBeautyLegLenght = f;
    }

    public void setPhotoBeautyRuddy(float f) {
        this.photoBeautyRuddy = f;
    }

    public void setPhotoBeautySkinsmooth(float f) {
        this.photoBeautySkinsmooth = f;
    }

    public void setPhotoBeautySkinwhiten(float f) {
        this.photoBeautySkinwhiten = f;
    }

    public void setPhotoBeautyThinface(float f) {
        this.photoBeautyThinface = f;
    }

    public void setPhotoDetectBodyJoint(boolean z) {
        this.photoDetectBodyJoint = z;
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
