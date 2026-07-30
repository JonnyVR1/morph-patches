package com.tantanapp.media.ttmediaeffect.mask;

import com.momo.mcamera.mask.BeautyFace;
import com.momo.mcamera.mask.LookUpModel;
import com.momo.mcamera.mask.Mask;
import com.momo.mcamera.mask.MaskModel;
import com.momo.mcamera.mask.Sticker;
import com.momo.mcamera.mask.TriggerTip;
import com.momo.mcamera.mask.bean.EffectFilterItem;
import com.tantanapp.media.ttmediaeffect.bean.TTAdditionalInfo;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class TTMaskModel {
    private MaskModel maskModel;

    public TTMaskModel(MaskModel maskModel) {
        if (maskModel != null) {
            this.maskModel = maskModel;
        } else {
            this.maskModel = new MaskModel();
        }
    }

    public static String FACEWARPTYPE_AWL_FACE() {
        return MaskModel.FACEWARPTYPE_AWL_FACE;
    }

    public static String FACEWARPTYPE_BEAUTY() {
        return "beauty";
    }

    public static String FACEWARPTYPE_BIG_HEAD() {
        return MaskModel.FACEWARPTYPE_BIG_HEAD;
    }

    public static String FACEWARPTYPE_BIG_HEAD_2() {
        return MaskModel.FACEWARPTYPE_BIG_HEAD_2;
    }

    public static String FACEWARPTYPE_FAT_FACE_SMALL_CHIN() {
        return MaskModel.FACEWARPTYPE_FAT_FACE_SMALL_CHIN;
    }

    public static String FACEWARPTYPE_FAT_FACE_THIN_LIP() {
        return MaskModel.FACEWARPTYPE_FAT_FACE_THIN_LIP;
    }

    public static String FACEWARPTYPE_PEARFACE_SMALLEYE_BIGMOUTH() {
        return MaskModel.FACEWARPTYPE_PEARFACE_SMALLEYE_BIGMOUTH;
    }

    public static String FACEWARPTYPE_RECTANGLEFACE_SMALLFEATURE() {
        return MaskModel.FACEWARPTYPE_RECTANGLEFACE_SMALLFEATURE;
    }

    public static String FACEWARPTYPE_ROUND_FACE() {
        return MaskModel.FACEWARPTYPE_ROUND_FACE;
    }

    public static String FACEWARPTYPE_SHORT_FACE() {
        return MaskModel.FACEWARPTYPE_SHORT_FACE;
    }

    public static String FACEWARPTYPE_SMALLFACE_BIGEYE() {
        return MaskModel.FACEWARPTYPE_SMALLFACE_BIGEYE;
    }

    public static String FACEWARPTYPE_TINYFACE_BIGEYE() {
        return MaskModel.FACEWARPTYPE_TINYFACE_BIGEYE;
    }

    public static int TYPE_FACE_EXPRESSION() {
        return 7;
    }

    public static int TYPE_GAME_STICKER() {
        return 6;
    }

    public static int TYPE_HANI_STICKER() {
        return 5;
    }

    public static int TYPE_LIVE_GAME() {
        return 8;
    }

    public static int TYPE_MOMENT() {
        return 0;
    }

    public static int TYPE_VIDEO_DECORATE() {
        return 2;
    }

    public static int TYPE_VIDEO_EFFECT() {
        return 3;
    }

    public static int TYPE_VIDEO_GESTURE_DETECT_EFFECT() {
        return 4;
    }

    public static int TYPE_VIDEO_GIFT() {
        return 1;
    }

    public static int TYPE_VIDEO_GIFT_ADDITION() {
        return 11;
    }

    public static int TYPE_VIDEO_INTERACTIVE_EFFECT() {
        return 10;
    }

    public static int TYPE_VIDEO_SCENE() {
        return 9;
    }

    public TTAdditionalInfo getAdditionalInfo() {
        return new TTAdditionalInfo(this.maskModel.getAdditionalInfo());
    }

    public BeautyFace getBeautyFace() {
        return this.maskModel.getBeautyFace();
    }

    public List<Mask> getDistortionList() {
        return this.maskModel.getDistortionList();
    }

    public long getDuration() {
        return this.maskModel.getDuration();
    }

    public List<EffectFilterItem> getEffectList() {
        return this.maskModel.getEffectList();
    }

    public float getFaceFacialFeatureScale() {
        return this.maskModel.getFaceFacialFeatureScale();
    }

    public float getFaceScale() {
        return this.maskModel.getFaceScale();
    }

    public int getFacialLandmarksCount() {
        return this.maskModel.getFacialLandmarksCount();
    }

    public Boolean getFilterDisable() {
        return this.maskModel.getFilterDisable();
    }

    public String getFolderPath() {
        return this.maskModel.getFolderPath();
    }

    public int getFrameRate() {
        return this.maskModel.getFrameRate();
    }

    public List<LookUpModel> getLookUpFilters() {
        return this.maskModel.getLookUpFilters();
    }

    public MaskModel getMaskModel() {
        return this.maskModel;
    }

    public Sticker getMaskTransferSticker() {
        return this.maskModel.getMaskTransferSticker();
    }

    public List<Mask> getMasks() {
        return this.maskModel.getMasks();
    }

    public int getModelType() {
        return this.maskModel.getModelType();
    }

    public String getName() {
        return this.maskModel.getName();
    }

    public int getPollGroupNum() {
        return this.maskModel.getPollGroupNum();
    }

    public String getPreviewPath() {
        return this.maskModel.getPreviewPath();
    }

    public String getSound() {
        return this.maskModel.getSound();
    }

    public int getSoundId() {
        return this.maskModel.getSoundId();
    }

    public String getSoundPath() {
        return this.maskModel.getSoundPath();
    }

    public int getSoundPitchMode() {
        return this.maskModel.getSoundPitchMode();
    }

    public List<Sticker> getStickers() {
        return this.maskModel.getStickers();
    }

    public int[] getTriggerRegion() {
        return this.maskModel.getTriggerRegion();
    }

    public TriggerTip getTriggerTip() {
        return this.maskModel.getTriggerTip();
    }

    public String getTriggerType() {
        return this.maskModel.getTriggerType();
    }

    public int getWrapType() {
        return this.maskModel.getWrapType();
    }

    public String getXengineEsPath() {
        return this.maskModel.getXengineEsPath();
    }

    public boolean isDecorationGiftPack() {
        return this.maskModel.isDecorationGiftPack();
    }

    public void setAdditionalInfo(TTAdditionalInfo tTAdditionalInfo) {
        this.maskModel.setAdditionalInfo(tTAdditionalInfo.getRealAdditionalInfo());
    }

    public void setBeautyFace(BeautyFace beautyFace) {
        this.maskModel.setBeautyFace(beautyFace);
    }

    public void setDecorationGiftPack(boolean z) {
        this.maskModel.setDecorationGiftPack(z);
    }

    public void setDistortionList(List<Mask> list) {
        this.maskModel.setDistortionList(list);
    }

    public void setDuration(long j) {
        this.maskModel.setDuration(j);
    }

    public void setEffectList(List<EffectFilterItem> list) {
        this.maskModel.setEffectList(list);
    }

    public void setFaceFacialFeatureScale(float f) {
        this.maskModel.setFaceFacialFeatureScale(f);
    }

    public void setFaceScale(float f) {
        this.maskModel.setFaceScale(f);
    }

    public void setFacialLandmarksCount(int i) {
        this.maskModel.setFacialLandmarksCount(i);
    }

    public void setFilterDisable(Boolean bool) {
        this.maskModel.setFilterDisable(bool);
    }

    public void setFolderPath(String str) {
        this.maskModel.setFolderPath(str);
    }

    public void setFrameRate(int i) {
        this.maskModel.setFrameRate(i);
    }

    public void setLookUpFilters(List<LookUpModel> list) {
        this.maskModel.setLookUpFilters(list);
    }

    public void setMasks(List<Mask> list) {
        this.maskModel.setMasks(list);
    }

    public void setModelType(int i) {
        this.maskModel.setModelType(i);
    }

    public void setName(String str) {
        this.maskModel.setName(str);
    }

    public void setPollGroupNum(int i) {
        this.maskModel.setPollGroupNum(i);
    }

    public void setPreviewPath(String str) {
        this.maskModel.setPreviewPath(str);
    }

    public void setSound(String str) {
        this.maskModel.setSound(str);
    }

    public void setSoundId(int i) {
        this.maskModel.setSoundId(i);
    }

    public void setSoundPath(String str) {
        this.maskModel.setSoundPath(str);
    }

    public void setSoundPitchMode(int i) {
        this.maskModel.setSoundPitchMode(i);
    }

    public void setStickers(List<Sticker> list) {
        this.maskModel.setStickers(list);
    }

    public void setTriggerRegion(int[] iArr) {
        this.maskModel.setTriggerRegion(iArr);
    }

    public void setTriggerTip(TriggerTip triggerTip) {
        this.maskModel.setTriggerTip(triggerTip);
    }

    public void setTriggerType(String str) {
        this.maskModel.setTriggerType(str);
    }

    public void setWrapType(String str) {
        this.maskModel.setWrapType(str);
    }

    public void setXengineEsPath(String str) {
        this.maskModel.setXengineEsPath(str);
    }

    public TTMaskModel() {
        this.maskModel = new MaskModel();
    }
}
