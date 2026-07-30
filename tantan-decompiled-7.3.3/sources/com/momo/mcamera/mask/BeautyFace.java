package com.momo.mcamera.mask;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes8.dex */
public class BeautyFace {

    @SerializedName("wrapType")
    private int awlType;

    @SerializedName("bigEyeAmount")
    private float bigEye;

    @SerializedName("skinSmoothingAmount")
    private float skinSmoothing;

    @SerializedName("thinFaceAmount")
    private float thinFace;

    @SerializedName("bigEyeValue")
    private float bigEyeValue = -1.0f;

    @SerializedName("thinFaceValue")
    private float thinFaceValue = -1.0f;

    @SerializedName("skinSmoothingValue")
    private float skinSmoothingValue = -1.0f;

    @SerializedName("skinWhitenValue")
    private float skinWhitenValue = -1.0f;

    @SerializedName("skinRuddyValue")
    private float skinRuddyValue = -1.0f;

    @SerializedName("skinSharpenValue")
    private float skinSharpenValue = -1.0f;

    @SerializedName("eyeBrightenValue")
    private float eyeBrightenValue = -1.0f;

    @SerializedName("teethWhtienValue")
    private float teethWhtienValue = -1.0f;

    @SerializedName("removePouchValue")
    private float removePouchValue = -1.0f;

    @SerializedName("nasolabiaFoldslValue")
    private float nasolabiaFoldslValue = -1.0f;

    public int getAwlType() {
        return this.awlType;
    }

    public float getBigEye() {
        return this.bigEye;
    }

    public float getBigEyeValue() {
        return this.bigEyeValue;
    }

    public float getEyeBrightenValue() {
        return this.eyeBrightenValue;
    }

    public float getNasolabiaFoldslValue() {
        return this.nasolabiaFoldslValue;
    }

    public float getRemovePouchValue() {
        return this.removePouchValue;
    }

    public float getSkinRuddyValue() {
        return this.skinRuddyValue;
    }

    public float getSkinSharpenValue() {
        return this.skinSharpenValue;
    }

    public float getSkinSmoothing() {
        return this.skinSmoothing;
    }

    public float getSkinSmoothingValue() {
        return this.skinSmoothingValue;
    }

    public float getSkinWhitenValue() {
        return this.skinWhitenValue;
    }

    public float getTeethWhtienValue() {
        return this.teethWhtienValue;
    }

    public float getThinFace() {
        return this.thinFace;
    }

    public float getThinFaceValue() {
        return this.thinFaceValue;
    }

    public void setAwlType(int i) {
        this.awlType = i;
    }

    public void setBigEye(float f) {
        this.bigEye = f;
    }

    public void setBigEyeValue(int i) {
        this.bigEyeValue = i;
    }

    public void setEyeBrightenValue(float f) {
        this.eyeBrightenValue = f;
    }

    public void setNasolabiaFoldslValue(float f) {
        this.nasolabiaFoldslValue = f;
    }

    public void setRemovePouchValue(float f) {
        this.removePouchValue = f;
    }

    public void setSkinRuddyValue(float f) {
        this.skinRuddyValue = f;
    }

    public void setSkinSharpenValue(float f) {
        this.skinSharpenValue = f;
    }

    public void setSkinSmoothing(float f) {
        this.skinSmoothing = f;
    }

    public void setSkinSmoothingValue(int i) {
        this.skinSmoothingValue = i;
    }

    public void setSkinWhitenValue(int i) {
        this.skinWhitenValue = i;
    }

    public void setTeethWhtienValue(float f) {
        this.teethWhtienValue = f;
    }

    public void setThinFace(float f) {
        this.thinFace = f;
    }

    public void setThinFaceValue(int i) {
        this.thinFaceValue = i;
    }
}
