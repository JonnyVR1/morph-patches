package com.momo.mcamera.mask;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class AdditionalInfo {

    @SerializedName("animojiDetectEnable")
    private boolean animojiDetectEnable;

    @SerializedName("backTips")
    private TipInfo backTip;

    @SerializedName("bodySegmentDetectEnable")
    private boolean bodySegmentDetectEnable;

    @SerializedName("boogerpickingSwitch")
    private boolean boogerpickingSwitch;

    @SerializedName("cartoonFaceEnable")
    private boolean cartoonFaceEnable;

    @SerializedName("comic")
    private boolean comic;

    @SerializedName("coverMosaicWhenNoFace")
    private boolean coverMosaicWhenNoFace;

    @SerializedName("detectARGift")
    private boolean detectARGift;

    @SerializedName("detectAction")
    private ActionInfo detectAction;

    @SerializedName("detectGanCryingFace")
    private boolean detectGanCryingFace;

    @SerializedName("detectQRCode")
    private boolean detectQRCode;

    @SerializedName("engineAr")
    private boolean engineAr;
    private boolean expressionDetectEnable;

    @SerializedName("face3DGame")
    private boolean face3DGame;

    @SerializedName("faceAlignmentVersion")
    private int faceAlignmentVersion;

    @SerializedName("frontTips")
    private TipInfo frontTip;

    @SerializedName("handGestureDetectEnable")
    private boolean handGestureDetectEnable;

    @SerializedName("handGestureType")
    private int handGestureType;

    @SerializedName("handSegmentDetector")
    private boolean handSegmentDetector;

    @SerializedName("heartProgressDetector")
    private boolean heartProgressDetector;

    @SerializedName("makeUpSwitch")
    private boolean makeUpSwitch;
    private float[] mosaicTriggerAngle;

    @SerializedName("multiFaceSwitchEnable")
    private boolean multiFaceSwitchEnable;

    @SerializedName("multiFaces")
    private int multiFaces;

    @SerializedName("objectDetectEnable")
    private boolean objectDetectEnable;

    @SerializedName("stylizeFaceEnable")
    private boolean stylizeFaceEnable;

    @SerializedName("videoMatch")
    private List<VideoMatchInfo> videoMatch;

    @SerializedName("bodyDetectEnable")
    private boolean bodyDetectEnable = false;

    @SerializedName("cartoonFaceType")
    private int cartoonFaceType = -1;

    @SerializedName("specialEffectCombinedSwitch")
    private boolean specialEffectCombinedSwitch = false;

    public static class TipInfo {

        @SerializedName("content")
        private String content;

        @SerializedName("isFaceTrack")
        private boolean isFaceTrack;

        @SerializedName("triggerTip")
        private TriggerTip triggerTip;

        public String getContent() {
            return this.content;
        }

        public TriggerTip getTriggerTip() {
            return this.triggerTip;
        }

        public boolean isFaceTrack() {
            return this.isFaceTrack;
        }

        public void setContent(String str) {
            this.content = str;
        }

        public void setFaceTrack(boolean z) {
            this.isFaceTrack = z;
        }

        public void setTriggerTip(TriggerTip triggerTip) {
            this.triggerTip = triggerTip;
        }
    }

    public TipInfo getBackTip() {
        return this.backTip;
    }

    public int getCartoonFaceType() {
        return this.cartoonFaceType;
    }

    public ActionInfo getDetectAction() {
        return this.detectAction;
    }

    public int getFaceAlignmentVersion() {
        return this.faceAlignmentVersion;
    }

    public TipInfo getFrontTip() {
        return this.frontTip;
    }

    public int getHandGestureType() {
        return this.handGestureType;
    }

    public float[] getMosaicTriggerAngle() {
        return this.mosaicTriggerAngle;
    }

    public int getMultiFaces() {
        return this.multiFaces;
    }

    public List<VideoMatchInfo> getVideoMatch() {
        return this.videoMatch;
    }

    public boolean isAnimojiDetectEnable() {
        return this.animojiDetectEnable;
    }

    public boolean isBodyDetectEnable() {
        return this.bodyDetectEnable;
    }

    public boolean isBodySegmentDetectEnable() {
        return this.bodySegmentDetectEnable;
    }

    public boolean isBoogerpickingSwitch() {
        return this.boogerpickingSwitch;
    }

    public boolean isCartoonFaceEnable() {
        return this.cartoonFaceEnable;
    }

    public boolean isComic() {
        return this.comic;
    }

    public boolean isCoverMosaicWhenNoFace() {
        return this.coverMosaicWhenNoFace;
    }

    public boolean isDetectARGift() {
        return this.detectARGift;
    }

    public boolean isDetectGanCryingFace() {
        return this.detectGanCryingFace;
    }

    public boolean isDetectQRCode() {
        return this.detectQRCode;
    }

    public boolean isEngineAr() {
        return this.engineAr;
    }

    public boolean isExpressionDetectEnable() {
        return this.expressionDetectEnable;
    }

    public boolean isFace3DGame() {
        return this.face3DGame;
    }

    public boolean isHandGestureDetectEnable() {
        return this.handGestureDetectEnable;
    }

    public boolean isHandSegmentDetector() {
        return this.handSegmentDetector;
    }

    public boolean isHeartProgressDetector() {
        return this.heartProgressDetector;
    }

    public boolean isMakeUpSwitch() {
        return this.makeUpSwitch;
    }

    public boolean isMultiFaceSwitchEnable() {
        return this.multiFaceSwitchEnable;
    }

    public boolean isObjectDetectEnable() {
        return this.objectDetectEnable;
    }

    public boolean isSpecialEffectCombinedSwitch() {
        return this.specialEffectCombinedSwitch;
    }

    public boolean isStylizeFaceEnable() {
        return this.stylizeFaceEnable;
    }

    public void setAnimojiDetectEnable(boolean z) {
        this.animojiDetectEnable = z;
    }

    public void setBackTip(TipInfo tipInfo) {
        this.backTip = tipInfo;
    }

    public void setBodyDetectEnable(boolean z) {
        this.bodyDetectEnable = z;
    }

    public void setBodySegmentDetectEnable(boolean z) {
        this.bodySegmentDetectEnable = z;
    }

    public void setBoogerpickingSwitch(boolean z) {
        this.boogerpickingSwitch = z;
    }

    public void setCartoonFaceEnable(boolean z) {
        this.cartoonFaceEnable = z;
    }

    public void setCartoonFaceType(int i) {
        this.cartoonFaceType = i;
    }

    public void setComic(boolean z) {
        this.comic = z;
    }

    public void setCoverMosaicWhenNoFace(boolean z) {
        this.coverMosaicWhenNoFace = z;
    }

    public void setDetectARGift(boolean z) {
        this.detectARGift = z;
    }

    public void setDetectAction(ActionInfo actionInfo) {
        this.detectAction = actionInfo;
    }

    public void setDetectGanCryingFace(boolean z) {
        this.detectGanCryingFace = z;
    }

    public void setDetectQRCode(boolean z) {
        this.detectQRCode = z;
    }

    public void setEngineAr(boolean z) {
        this.engineAr = z;
    }

    public void setExpressionDetectEnable(boolean z) {
        this.expressionDetectEnable = z;
    }

    public void setFace3DGame(boolean z) {
        this.face3DGame = z;
    }

    public void setFaceAlignmentVersion(int i) {
        this.faceAlignmentVersion = i;
    }

    public void setFrontTip(TipInfo tipInfo) {
        this.frontTip = tipInfo;
    }

    public void setHandGestureDetectEnable(boolean z) {
        this.handGestureDetectEnable = z;
    }

    public void setHandGestureType(int i) {
        this.handGestureType = i;
    }

    public void setHandSegmentDetector(boolean z) {
        this.handSegmentDetector = z;
    }

    public void setHeartProgressDetector(boolean z) {
        this.heartProgressDetector = z;
    }

    public void setMakeUpSwitch(boolean z) {
        this.makeUpSwitch = z;
    }

    public void setMosaicTriggerAngle(float[] fArr) {
        this.mosaicTriggerAngle = fArr;
    }

    public void setMultiFaceSwitchEnable(boolean z) {
        this.multiFaceSwitchEnable = z;
    }

    public void setMultiFaces(int i) {
        this.multiFaces = i;
    }

    public void setObjectDetectEnable(boolean z) {
        this.objectDetectEnable = z;
    }

    public void setSpecialEffectCombinedSwitch(boolean z) {
        this.specialEffectCombinedSwitch = z;
    }

    public void setStylizeFaceEnable(boolean z) {
        this.stylizeFaceEnable = z;
    }

    public void setVideoMatch(List<VideoMatchInfo> list) {
        this.videoMatch = list;
    }
}
