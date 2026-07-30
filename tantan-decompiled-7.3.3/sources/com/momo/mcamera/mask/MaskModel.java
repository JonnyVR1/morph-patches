package com.momo.mcamera.mask;

import com.facebook.AuthenticationTokenClaims;
import com.google.gson.annotations.SerializedName;
import com.momo.mcamera.mask.bean.EffectFilterItem;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class MaskModel {
    public static final String FACEWARPTYPE_AWL_FACE = "awlface";
    public static final String FACEWARPTYPE_BEAUTY = "beauty";
    public static final String FACEWARPTYPE_BIG_HEAD = "bighead";
    public static final String FACEWARPTYPE_BIG_HEAD_2 = "big_head_2";
    public static final String FACEWARPTYPE_FAT_FACE_SMALL_CHIN = "fat_face_small_chin";
    public static final String FACEWARPTYPE_FAT_FACE_THIN_LIP = "fat_face_thin_lip";
    public static final String FACEWARPTYPE_PEARFACE_SMALLEYE_BIGMOUTH = "pear_face_small_eye_big_mouth";
    public static final String FACEWARPTYPE_RECTANGLEFACE_SMALLFEATURE = "rectangle_face_small_feature";
    public static final String FACEWARPTYPE_ROUND_FACE = "round_face";
    public static final String FACEWARPTYPE_SHORT_FACE = "shortface";
    public static final String FACEWARPTYPE_SMALLFACE_BIGEYE = "small_face_big_eye";
    public static final String FACEWARPTYPE_TINYFACE_BIGEYE = "tiny_face_big_eye";
    public static final int TYPE_ACTION_DETECT = 99;
    public static final int TYPE_FACE_3D_GAME = 13;
    public static final int TYPE_FACE_3D_GAME_HEAD = 14;
    public static final int TYPE_FACE_EXPRESSION = 7;
    public static final int TYPE_GAME_STICKER = 6;
    public static final int TYPE_HANI_STICKER = 5;
    public static final int TYPE_LIVE_GAME = 8;
    public static final int TYPE_MOMENT = 0;
    public static final int TYPE_VIDEO_DECORATE = 2;
    public static final int TYPE_VIDEO_EFFECT = 3;
    public static final int TYPE_VIDEO_FUNNY_EFFECT = 12;
    public static final int TYPE_VIDEO_GESTURE_DETECT_EFFECT = 4;
    public static final int TYPE_VIDEO_GIFT = 1;
    public static final int TYPE_VIDEO_GIFT_ADDITION = 11;
    public static final int TYPE_VIDEO_INTERACTIVE_EFFECT = 10;
    public static final int TYPE_VIDEO_SCENE = 9;
    public static final int TYPE_VIRTUAL_AVATAR = 15;
    public static final int TYPE_VIRTUAL_AVATAR_VOICE = 16;
    public static HashSet<String> faceWarpTypeSet;
    public long addTime;

    @SerializedName("additionalInfo")
    private AdditionalInfo additionalInfo;
    private boolean audioRecord;

    @SerializedName("beautyFace")
    private BeautyFace beautyFace;

    @SerializedName("ml_decoration_gift_pack")
    private boolean decorationGiftPack;

    @SerializedName("distortionList")
    List<Mask> distortionList;
    private long duration;
    private List<EffectFilterItem> effectList;
    float faceFacialFeatureScale;
    float faceScale;

    @SerializedName("facialLandmarksCount")
    private int facialLandmarksCount;

    @SerializedName("filterDisable")
    private Boolean filterDisable;
    String folderPath;

    @SerializedName("frameRate")
    int frameRate;

    @SerializedName("filterList")
    List<LookUpModel> lookUpFilters;

    @SerializedName("faceMaskList")
    List<Mask> masks;
    private int modelType;

    @SerializedName(AuthenticationTokenClaims.JSON_KEY_NAME)
    String name;

    @SerializedName("pollGroupNum")
    private int pollGroupNum;

    @SerializedName("previewPath")
    String previewPath;

    @SerializedName("sound")
    String sound;
    private int soundId;
    String soundPath;

    @SerializedName("spectrumFilter")
    public Sticker spectrumSticker;

    @SerializedName("itemList")
    List<Sticker> stickers;
    int[] triggerRegion;

    @SerializedName("triggerTip")
    private TriggerTip triggerTip;

    @SerializedName("triggerType")
    String triggerType;

    @SerializedName("triggeringMicEffect")
    private int triggeringMicEffect;
    String warpType;
    String xengineEsPath;
    private String xengineSearchPath;
    private int orderedIndex = 0;
    int soundPitchMode = 0;
    private boolean forbidClone = false;

    static {
        HashSet<String> hashSet = new HashSet<>();
        faceWarpTypeSet = hashSet;
        hashSet.add("beauty");
        faceWarpTypeSet.add(FACEWARPTYPE_AWL_FACE);
        faceWarpTypeSet.add(FACEWARPTYPE_SHORT_FACE);
        faceWarpTypeSet.add(FACEWARPTYPE_BIG_HEAD);
        faceWarpTypeSet.add(FACEWARPTYPE_TINYFACE_BIGEYE);
        faceWarpTypeSet.add(FACEWARPTYPE_SMALLFACE_BIGEYE);
        faceWarpTypeSet.add(FACEWARPTYPE_RECTANGLEFACE_SMALLFEATURE);
        faceWarpTypeSet.add(FACEWARPTYPE_PEARFACE_SMALLEYE_BIGMOUTH);
        faceWarpTypeSet.add(FACEWARPTYPE_ROUND_FACE);
        faceWarpTypeSet.add(FACEWARPTYPE_BIG_HEAD_2);
        faceWarpTypeSet.add(FACEWARPTYPE_FAT_FACE_THIN_LIP);
        faceWarpTypeSet.add(FACEWARPTYPE_FAT_FACE_SMALL_CHIN);
    }

    public static int mappingWarpType(String str) {
        str.getClass();
        switch (str) {
            case "shortface":
                return 2;
            case "beauty":
                return 1;
            case "small_face_big_eye":
                return 6;
            case "awlface":
                return 3;
            case "fat_face_small_chin":
                return 15;
            case "tiny_face_big_eye":
                return 5;
            case "round_face":
                return 12;
            case "bighead":
                return 4;
            case "pear_face_small_eye_big_mouth":
                return 8;
            case "rectangle_face_small_feature":
                return 7;
            case "fat_face_thin_lip":
                return 14;
            case "big_head_2":
                return 13;
            default:
                return 0;
        }
    }

    public static int momentMappingWarpType(String str) {
        str.getClass();
        switch (str) {
            case "shortface":
                return 2;
            case "beauty":
                return 1;
            case "small_face_big_eye":
                return 6;
            case "awlface":
                return 3;
            case "fat_face_small_chin":
                return 15;
            case "tiny_face_big_eye":
                return 5;
            case "round_face":
                return 12;
            case "bighead":
                return 4;
            case "pear_face_small_eye_big_mouth":
                return 8;
            case "rectangle_face_small_feature":
                return 7;
            case "fat_face_thin_lip":
                return 14;
            case "big_head_2":
                return 13;
            default:
                return 104;
        }
    }

    public AdditionalInfo getAdditionalInfo() {
        return this.additionalInfo;
    }

    public BeautyFace getBeautyFace() {
        return this.beautyFace;
    }

    public List<Mask> getDistortionList() {
        return this.distortionList;
    }

    public long getDuration() {
        return this.duration;
    }

    public List<EffectFilterItem> getEffectList() {
        return this.effectList;
    }

    public float getFaceFacialFeatureScale() {
        return this.faceFacialFeatureScale;
    }

    public float getFaceScale() {
        return this.faceScale;
    }

    public int getFacialLandmarksCount() {
        return this.facialLandmarksCount;
    }

    public Boolean getFilterDisable() {
        return this.filterDisable;
    }

    public String getFolderPath() {
        return this.folderPath;
    }

    public int getFrameRate() {
        return this.frameRate;
    }

    public List<LookUpModel> getLookUpFilters() {
        return this.lookUpFilters;
    }

    public Sticker getMaskTransferSticker() {
        List<Mask> list = this.masks;
        if (list == null || list.isEmpty()) {
            return null;
        }
        Mask mask = this.masks.get(0);
        Sticker sticker = new Sticker();
        sticker.setStickerType("FACE_MASK_TYPE");
        sticker.setImagePreName(mask.getFolder());
        sticker.setTriggerType(mask.getTriggerType());
        return sticker;
    }

    public List<Mask> getMasks() {
        return this.masks;
    }

    public int getModelType() {
        return this.modelType;
    }

    public int getMomentWrapType() {
        String str = this.warpType;
        if (str == null) {
            str = "";
        }
        return momentMappingWarpType(str);
    }

    public String getName() {
        return this.name;
    }

    public int getOrderedIndex() {
        return this.orderedIndex;
    }

    public int getPollGroupNum() {
        return this.pollGroupNum;
    }

    public String getPreviewPath() {
        return this.previewPath;
    }

    public int getRealWrapType() {
        String str = this.warpType;
        if (str == null) {
            str = "";
        }
        return mappingWarpType(str);
    }

    public String getSound() {
        return this.sound;
    }

    public int getSoundId() {
        return this.soundId;
    }

    public String getSoundPath() {
        return this.soundPath;
    }

    public int getSoundPitchMode() {
        return this.soundPitchMode;
    }

    public List<Sticker> getStickers() {
        return this.stickers;
    }

    public int[] getTriggerRegion() {
        return this.triggerRegion;
    }

    public TriggerTip getTriggerTip() {
        return this.triggerTip;
    }

    public String getTriggerType() {
        return this.triggerType;
    }

    public int getTriggeringMicEffect() {
        return this.triggeringMicEffect;
    }

    public String getWarpType() {
        return this.warpType;
    }

    public int getWrapType() {
        String str = this.warpType;
        if (str == null) {
            str = "";
        }
        return mappingWarpType(str);
    }

    public String getXengineEsPath() {
        return this.xengineEsPath;
    }

    public String getXengineSearchPath() {
        return this.xengineSearchPath;
    }

    public boolean isAudioRecord() {
        return this.audioRecord;
    }

    public boolean isDecorationGiftPack() {
        return this.decorationGiftPack;
    }

    public boolean isForbidClone() {
        return this.forbidClone;
    }

    public void setAdditionalInfo(AdditionalInfo additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public void setAudioRecord(boolean z) {
        this.audioRecord = z;
    }

    public void setBeautyFace(BeautyFace beautyFace) {
        this.beautyFace = beautyFace;
    }

    public void setDecorationGiftPack(boolean z) {
        this.decorationGiftPack = z;
    }

    public void setDistortionList(List<Mask> list) {
        this.distortionList = list;
    }

    public void setDuration(long j) {
        this.duration = j;
    }

    public void setEffectList(List<EffectFilterItem> list) {
        this.effectList = list;
    }

    public void setFaceFacialFeatureScale(float f) {
        this.faceFacialFeatureScale = f;
    }

    public void setFaceScale(float f) {
        this.faceScale = f;
    }

    public void setFacialLandmarksCount(int i) {
        this.facialLandmarksCount = i;
    }

    public void setFilterDisable(Boolean bool) {
        this.filterDisable = bool;
    }

    public void setFolderPath(String str) {
        this.folderPath = str;
    }

    public void setForbidClone(boolean z) {
        this.forbidClone = z;
    }

    public void setFrameRate(int i) {
        this.frameRate = i;
    }

    public void setLookUpFilters(List<LookUpModel> list) {
        this.lookUpFilters = list;
    }

    public void setMasks(List<Mask> list) {
        this.masks = list;
    }

    public void setModelType(int i) {
        this.modelType = i;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setOrderedIndex(int i) {
        this.orderedIndex = i;
    }

    public void setPollGroupNum(int i) {
        this.pollGroupNum = i;
    }

    public void setPreviewPath(String str) {
        this.previewPath = str;
    }

    public void setSound(String str) {
        this.sound = str;
    }

    public void setSoundId(int i) {
        this.soundId = i;
    }

    public void setSoundPath(String str) {
        this.soundPath = str;
    }

    public void setSoundPitchMode(int i) {
        this.soundPitchMode = i;
    }

    public void setStickers(List<Sticker> list) {
        this.stickers = list;
    }

    public void setTriggerRegion(int[] iArr) {
        this.triggerRegion = iArr;
    }

    public void setTriggerTip(TriggerTip triggerTip) {
        this.triggerTip = triggerTip;
    }

    public void setTriggerType(String str) {
        this.triggerType = str;
    }

    public void setTriggeringMicEffect(int i) {
        this.triggeringMicEffect = i;
    }

    public void setWrapType(String str) {
        this.warpType = str;
    }

    public void setXengineEsPath(String str) {
        this.xengineEsPath = str;
    }

    public void setXengineSearchPath(String str) {
        this.xengineSearchPath = str;
    }
}
