package com.momo.mcamera.mask;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes7.dex */
public class Mask {
    private String folder;

    @SerializedName("hidingObjectTriggerType")
    private String hidingObjectTriggerType;

    @SerializedName("landmarks")
    public float[] landmarks;

    @SerializedName("objectTriggerType")
    private String objectTriggerType;

    @SerializedName("swapFacialMask")
    public boolean swapFacialMask;
    private String texturePath;

    @SerializedName("type")
    private String type;

    @SerializedName("triggerType")
    private int triggerType = 0;

    @SerializedName("hidingTriggerType")
    private int hiddenTriggerType = 0;

    @SerializedName("strength")
    private float strength = 0.0f;

    @SerializedName("strengthB")
    private float strengthB = 0.0f;

    @SerializedName("strengthStep")
    private float strengthStep = 0.0f;

    @SerializedName("strengthStepB")
    private float strengthStepB = 0.0f;

    public String getFolder() {
        return this.folder;
    }

    public int getHiddenTriggerType() {
        return this.hiddenTriggerType;
    }

    public String getHidingObjectTriggerType() {
        return this.hidingObjectTriggerType;
    }

    public String getObjectTriggerType() {
        return this.objectTriggerType;
    }

    public float getStrength() {
        return this.strength;
    }

    public float getStrengthB() {
        return this.strengthB;
    }

    public float getStrengthStep() {
        return this.strengthStep;
    }

    public float getStrengthStepB() {
        return this.strengthStepB;
    }

    public String getTexturePath() {
        return this.texturePath;
    }

    public int getTriggerType() {
        return this.triggerType;
    }

    public String getType() {
        return this.type;
    }

    public void setFolder(String str) {
        this.folder = str;
    }

    public void setHiddenTriggerType(int i) {
        this.hiddenTriggerType = i;
    }

    public void setHidingObjectTriggerType(String str) {
        this.hidingObjectTriggerType = str;
    }

    public void setObjectTriggerType(String str) {
        this.objectTriggerType = str;
    }

    public void setStrength(float f) {
        this.strength = f;
    }

    public void setStrengthB(float f) {
        this.strengthB = f;
    }

    public void setStrengthStep(float f) {
        this.strengthStep = f;
    }

    public void setStrengthStepB(float f) {
        this.strengthStepB = f;
    }

    public void setTexturePath(String str) {
        this.texturePath = str;
    }

    public void setTriggerType(int i) {
        this.triggerType = i;
    }

    public void setType(String str) {
        this.type = str;
    }
}
