package com.momo.mcamera.mask;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.RectF;
import android.text.TextUtils;
import com.core.glcore.util.FileUtil;
import com.core.glcore.util.XEEngineHelper;
import com.facebook.AuthenticationTokenClaims;
import com.google.gson.annotations.SerializedName;
import com.momo.mcamera.mask.bean.AbsolutePosition;
import com.momo.mcamera.mask.bean.ObjectRegion;
import com.momo.mcamera.mask.bean.StickerAdditionalInfo;
import com.momo.mcamera.mask.delegate.ImageDelegateProvider;
import java.io.File;

/* JADX INFO: loaded from: classes8.dex */
public class Sticker {
    public static final String FACE_3D_MASK_TYPE = "3d";
    public static final float FACE_DEFAULT_WIDTH = 180.0f;
    public static final String FACE_LOOK_UP_TYPE = "FACE_LOOK_UP_TYPE";
    public static final String FACE_MASK_TYPE = "FACE_MASK_TYPE";
    public static final String GESTURE_TYPE_HEART = "heart";
    public static final String GESTURE_TYPE_ONE = "one";
    public static final String GESTURE_TYPE_YEARH = "yearh";
    public static final String LAYER_TYPE_DEFAULT = "default";
    public static final String LAYER_TYPE_FACE = "face";
    public static final String LAYER_TYPE_GESTURE = "object_follower";
    public static final String LAYER_TYPE_NATIVE = "native";
    public static final String LAYER_TYPE_VIDEO_FILE = "video_file";
    public static final String RESOURCE_TYPE_AUDIO_VISUALIZER = "audio_visualizer";
    public static final String STICKER_TYPE_DELEGATE_STICKER = "weex";
    public static final String STICKER_TYPE_GAME_FIX_TYPE = "STICKER_TYPE_GAME_FIX_TYPE";
    public static final String STICKER_TYPE_VOICE = "STICKER_TYPE_VOICE";
    public static final String STICKER_TYPE_WATERMARK = "STICKER_TYPE_WATERMARK";
    public static final int TRIGGER_ACTIVE_FACE_EXPRESSION = 4;
    public static final int TRIGGER_ANIMOJI_DETECT = 256;
    public static final int TRIGGER_BODY_DETECT = 128;
    public static final int TRIGGER_EXPRESSION = 32;
    public static final int TRIGGER_EYE_CLASSIFY = 2;
    public static final int TRIGGER_FACE = 1;
    public static final int TRIGGER_OBJECT_GESTURE = 8;
    public static final int TRIGGER_OBJECT_GESTURE_TRACKING = 16;
    public static final int TRIGGER_SEGMENT = 64;
    public static final int TRIGGER_TYPE_MOUSE = 1;
    public static final int TYPE_ABSOLUTION_POSITION = 5;
    public static final int TYPE_ABS_POSITION_ADJUST_RESOLUTION = 7;
    public static final int TYPE_ABS_POSITION_USE_STICKER_DIM = 6;
    public static final int TYPE_FACE = 0;
    public static final int TYPE_FIXED = 1;
    public static final int TYPE_FULL_SCREEN_FIXED = 2;
    public static final int TYPE_SCALE_CENTER_CROP = 99;
    public static final int TYPE_SCALE_TO_FILL = 3;

    @SerializedName("position")
    private AbsolutePosition absolutePos;

    @SerializedName("additionalInfo")
    private StickerAdditionalInfo additionalInfo;

    @SerializedName("blendMode")
    private BlendMode blendMode;

    @SerializedName("bottomAlignIndex")
    private int bottomAlignIndex;

    @SerializedName("clearsBodyArea")
    private boolean clearsBodyArea;

    @SerializedName("useFacialSegmentationData")
    private boolean clearsFaceArea;
    private int deviceOrientation;

    @SerializedName("donotResetOnHide")
    private boolean donotResetOnHide;

    @SerializedName("donotTrack")
    private boolean donotTrack;
    private long duration;

    @SerializedName("enable3DAntialiasing")
    private boolean enable3DAntialiasing;

    @SerializedName("etcTextureBatch")
    private String etcTextureBatch;

    @SerializedName("imageType")
    private String extString;

    @SerializedName("pointIndex")
    private int facePositionCenter;

    @SerializedName("frames")
    private int frameNumber;

    @SerializedName("frameRate")
    private int frameRate;

    @SerializedName("groupNum")
    private int groupNum;
    public int groupNumber;

    @SerializedName("handGestureType")
    private int handGestureType;

    @SerializedName("hidingObjectTriggerType")
    private String hiddenObjectTriggerType;

    @SerializedName("hidingTriggerType")
    private int hiddenTriggerType;
    private String imageFolderPath;

    @SerializedName("height")
    private int imageHeight;
    private String imageMaskPath;

    @SerializedName("folder")
    private String imagePreName;
    private ImageDelegateProvider imageProvider;

    @SerializedName("width")
    private int imageWidth;

    @SerializedName("alwaysShow")
    private boolean isAlwaysShow;
    public boolean isCutFaceSticker;
    public boolean isGameSticker;
    public boolean isHaniSticker;
    private boolean isPreMultiAlpha;

    @SerializedName("layerType")
    private String layerType;
    private LookUpModel lookUpModel;

    @SerializedName("looping")
    private int loop;

    @SerializedName("loopSound")
    private boolean loopSound;

    @SerializedName("loopingIndex")
    private int loopStart;
    private Mask mask;

    @SerializedName("minimumHiddenFrameCount")
    private int minHiddenFrameCount;
    private int modelType;
    private String name;

    @SerializedName("noninterruptible")
    private boolean noBreakLoop;

    @SerializedName("doNotHideAfterTrigger")
    private boolean notHiddenAfterTrigger;

    @SerializedName("objectTriggerType")
    private String objectTriggerType;

    @SerializedName("offsetX")
    private int offsetX;

    @SerializedName("offsetY")
    private int offsetY;

    @SerializedName("pointIndexes")
    private int[] pointIndexes;

    @SerializedName("resourceType")
    private String resourceType;
    private String segmentType;

    @SerializedName("fromTop")
    private boolean showTop;

    @SerializedName("sound")
    private String sound;

    @SerializedName("soundNeedsPublish")
    private boolean soundNeedsPublish;
    private String stickerType;

    @SerializedName("strokeColor")
    private float[] strokeColor;

    @SerializedName("strokeRadius")
    private int strokeRadius;

    @SerializedName("topAlignIndex")
    private int topAlignIndex;

    @SerializedName("objectTrackingRegion")
    private ObjectRegion trackingRegion;
    private int triggerFlag;
    private int[] triggerRegion;
    private int triggerState;

    @SerializedName("triggerType")
    private int triggerType;

    @SerializedName("type")
    private int type;

    @SerializedName("useHandGesture")
    private boolean useHandGestureDetectNewVersion;
    private VideoFileConfig videoFileConfig;
    private String xengineEsPath;

    @SerializedName("zoomScale")
    private float zoomScale;
    public int curIndex = 0;
    private int loopCount = 0;
    private int soundId = -1;
    private int playingSoundId = -1;
    private boolean useImageCache = true;
    private int baseDemensionWidth = 360;
    private int baseDemensionHeight = 640;
    private boolean comic = false;
    private int orderedIndex = 0;

    @SerializedName("intensity")
    private float intensity = 1.0f;

    @SerializedName("pollTrigger")
    private boolean pollTrigger = false;

    public class BlendMode {

        @SerializedName(AuthenticationTokenClaims.JSON_KEY_NAME)
        String name;

        public BlendMode() {
        }
    }

    public static class VideoFileConfig {
        public static final int OUTPUT_DEFAULT = 0;
        public static final int OUTPUT_VIDEO = 1;
        private float[][] faceData;
        private RectF maskBorder;
        private String maskImage;
        private float[] timeStamp;
        private String video;
        private int frameRate = 15;
        private int frameRateToPlay = 15;
        private int type = 0;

        public float[][] getFaceData() {
            return this.faceData;
        }

        public int getFrameRate() {
            return this.frameRate;
        }

        public int getFrameRateToPlay() {
            return this.frameRateToPlay;
        }

        public RectF getMaskBorder() {
            return this.maskBorder;
        }

        public String getMaskImage() {
            return this.maskImage;
        }

        public float[] getTimeStamp() {
            return this.timeStamp;
        }

        public int getType() {
            return this.type;
        }

        public String getVideo() {
            return this.video;
        }

        public void setFaceData(float[][] fArr) {
            this.faceData = fArr;
        }

        public void setFrameRate(int i) {
            this.frameRate = i;
        }

        public void setFrameRateToPlay(int i) {
            this.frameRateToPlay = i;
        }

        public void setMaskBorder(RectF rectF) {
            this.maskBorder = rectF;
        }

        public void setMaskImage(String str) {
            this.maskImage = str;
        }

        public void setTimeStamp(float[] fArr) {
            this.timeStamp = fArr;
        }

        public void setType(int i) {
            this.type = i;
        }

        public void setVideo(String str) {
            this.video = str;
        }
    }

    public AbsolutePosition getAbsolutePos() {
        return this.absolutePos;
    }

    public StickerAdditionalInfo getAdditionalInfo() {
        return this.additionalInfo;
    }

    public int getBaseDemensionHeight() {
        return this.baseDemensionHeight;
    }

    public int getBaseDemensionWidth() {
        return this.baseDemensionWidth;
    }

    public Bitmap getBitmapWithIndex(Context context, int i) {
        if (i >= this.frameNumber) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = false;
        return BitmapFactory.decodeFile(getImagePathByIndex(context, i), options);
    }

    public BlendMode getBlendMode() {
        return this.blendMode;
    }

    public int getBottomAlignIndex() {
        return this.bottomAlignIndex;
    }

    public int getCenterIndex() {
        return this.facePositionCenter;
    }

    public int getCurFrameRate() {
        int i = this.frameRate;
        if (i > 0) {
            return i;
        }
        return 15;
    }

    public int getDeviceOrientation() {
        return this.deviceOrientation;
    }

    public long getDuration() {
        return this.duration;
    }

    public int getETC1ImageIndex() {
        int i = this.curIndex + 1;
        this.curIndex = i;
        if (i == getFrameNumber()) {
            this.curIndex = this.loopStart;
        }
        return this.curIndex;
    }

    public String getETC1JsonPath() {
        return this.imageFolderPath + "/" + this.imagePreName + "/" + this.imagePreName + ".json";
    }

    public String getETC1Path() {
        return this.imageFolderPath + "/" + this.imagePreName + "/" + this.imagePreName + ".pkm";
    }

    public String getEtcTextureBatch() {
        return this.etcTextureBatch;
    }

    public String getExtString() {
        return "png";
    }

    public String getFace3DResPath() {
        return this.imageFolderPath + File.separator + this.imagePreName;
    }

    public int getFacePositionCenter() {
        return this.facePositionCenter;
    }

    public int getFacePositionLeft() {
        return 0;
    }

    public int getFacePositionRight() {
        return 16;
    }

    public int getFrameNumber() {
        return this.frameNumber;
    }

    public int getFrameRate() {
        return this.frameRate;
    }

    public int getGroupNum() {
        return this.groupNum;
    }

    public int getGroupNumber() {
        return this.groupNumber;
    }

    public int getHandGestureType() {
        return this.handGestureType;
    }

    public String getHiddenObjectTriggerType() {
        return this.hiddenObjectTriggerType;
    }

    public int getHiddenTriggerType() {
        return this.hiddenTriggerType;
    }

    public String getImageFolderPath() {
        return this.imageFolderPath;
    }

    public int getImageHeight() {
        return this.imageHeight;
    }

    public String getImageMaskPath() {
        return this.imageMaskPath;
    }

    public String getImagePath(Context context) {
        String imagePathByIndex = getImagePathByIndex(context, this.curIndex);
        int i = this.curIndex + 1;
        this.curIndex = i;
        if (i == getFrameNumber()) {
            this.curIndex = this.loopStart;
        }
        return imagePathByIndex;
    }

    public String getImagePathByIndex(Context context, int i) {
        String str;
        if (i < 10) {
            str = "_00" + i;
        } else if (i < 100) {
            str = "_0" + i;
        } else {
            str = "_" + i;
        }
        if (this.imageFolderPath == null || this.imagePreName == null) {
            return null;
        }
        return this.imageFolderPath + "/" + this.imagePreName + "/" + this.imagePreName + str + "." + getExtString();
    }

    public String getImagePreName() {
        return this.imagePreName;
    }

    public ImageDelegateProvider getImageProvider() {
        return this.imageProvider;
    }

    public int getImageWidth() {
        return this.imageWidth;
    }

    public float getImageWidthScale() {
        return (getImageWidth() * this.zoomScale) / 180.0f;
    }

    public float getIntensity() {
        return this.intensity;
    }

    public String getLayerType() {
        return this.layerType;
    }

    public LookUpModel getLookUpModel() {
        return this.lookUpModel;
    }

    public int getLoop() {
        return this.loop;
    }

    public int getLoopStart() {
        return this.loopStart;
    }

    public Mask getMask() {
        return this.mask;
    }

    public int getMinHiddenFrameCount() {
        return this.minHiddenFrameCount;
    }

    public int getModelType() {
        return this.modelType;
    }

    public String getName() {
        return this.name;
    }

    public String getObjectTriggerType() {
        return this.objectTriggerType;
    }

    public int getOffsetX() {
        return this.offsetX;
    }

    public int getOffsetY() {
        return this.offsetY;
    }

    public int getOrderedIndex() {
        return this.orderedIndex;
    }

    public int getPlayingSoundId() {
        return this.playingSoundId;
    }

    public int[] getPointIndexes() {
        return this.pointIndexes;
    }

    public boolean getPollTrigger() {
        return this.pollTrigger;
    }

    public String getResourceType() {
        return this.resourceType;
    }

    public String getSegmentType() {
        return this.segmentType;
    }

    public String getSound() {
        return this.sound;
    }

    public int getSoundId() {
        return this.soundId;
    }

    public boolean getSoundNeedsPublish() {
        return this.soundNeedsPublish;
    }

    public String getSoundPath() {
        if (TextUtils.isEmpty(this.sound)) {
            return null;
        }
        return this.imageFolderPath + "/" + this.imagePreName + "/" + this.sound;
    }

    public String getStickerType() {
        return this.stickerType;
    }

    public float[] getStrokeColor() {
        return this.strokeColor;
    }

    public int getStrokeRadius() {
        return this.strokeRadius;
    }

    public int getTopAlignIndex() {
        return this.topAlignIndex;
    }

    public ObjectRegion getTrackingRegion() {
        return this.trackingRegion;
    }

    public int getTriggerFlag() {
        return this.triggerFlag;
    }

    public int getTriggerPlayStatus() {
        if (getAdditionalInfo() != null) {
            return getAdditionalInfo().getTriggerPlayStatus();
        }
        return -1;
    }

    public int[] getTriggerRegion() {
        return this.triggerRegion;
    }

    public int getTriggerState() {
        return this.triggerState;
    }

    public int getTriggerType() {
        return this.triggerType;
    }

    public int getType() {
        return this.type;
    }

    public VideoFileConfig getVideoFileConfig() {
        return this.videoFileConfig;
    }

    public String getXengineEsPath() {
        return this.xengineEsPath;
    }

    public String getXengineResRelativePath() {
        String libraryPath = XEEngineHelper.getLibraryPath();
        if (libraryPath == null) {
            return "";
        }
        if (TextUtils.equals(this.imageFolderPath, libraryPath)) {
            return this.imagePreName;
        }
        if (libraryPath.length() >= this.imageFolderPath.length()) {
            return "";
        }
        return this.imageFolderPath.substring(libraryPath.length() + 1) + File.separator + this.imagePreName;
    }

    public float getZoomScale() {
        return this.zoomScale;
    }

    public boolean hasCenterPoint() {
        int[] iArr = this.pointIndexes;
        return iArr == null || iArr.length < 2;
    }

    public boolean hasETC1Resource() {
        return FileUtil.exist(getETC1Path());
    }

    public boolean isAlwaysShow() {
        return this.isAlwaysShow;
    }

    public boolean isClearsBodyArea() {
        return this.clearsBodyArea;
    }

    public boolean isClearsFaceArea() {
        return this.clearsFaceArea;
    }

    public boolean isComic() {
        return this.comic;
    }

    public boolean isDonotTrack() {
        return this.donotTrack;
    }

    public boolean isEnable3DAntialiasing() {
        return this.enable3DAntialiasing;
    }

    public boolean isLoopSound() {
        return this.loopSound;
    }

    public boolean isNoBreakLoop() {
        return this.noBreakLoop;
    }

    public boolean isNotHiddenAfterTrigger() {
        return this.notHiddenAfterTrigger;
    }

    public boolean isNotResetOnHide() {
        return this.donotResetOnHide;
    }

    public boolean isPreMultiAlpha() {
        return this.isPreMultiAlpha;
    }

    public boolean isShowTop() {
        return this.showTop;
    }

    public boolean isUseHandGestureDetectNewVersion() {
        return this.useHandGestureDetectNewVersion;
    }

    public boolean isUseImageCache() {
        return this.useImageCache;
    }

    public void setAbsolutePos(AbsolutePosition absolutePosition) {
        this.absolutePos = absolutePosition;
    }

    public void setAdditionalInfo(StickerAdditionalInfo stickerAdditionalInfo) {
        this.additionalInfo = stickerAdditionalInfo;
    }

    public void setAlwaysShow(boolean z) {
        this.isAlwaysShow = z;
    }

    public void setBaseDemensionHeight(int i) {
        this.baseDemensionHeight = i;
    }

    public void setBaseDemensionWidth(int i) {
        this.baseDemensionWidth = i;
    }

    public void setBlendMode(BlendMode blendMode) {
        this.blendMode = blendMode;
    }

    public void setBottomAlignIndex(int i) {
        this.bottomAlignIndex = i;
    }

    public void setClearsBodyArea(boolean z) {
        this.clearsBodyArea = z;
    }

    public void setClearsFaceArea(boolean z) {
        this.clearsFaceArea = z;
    }

    public void setComic(boolean z) {
        this.comic = z;
    }

    public void setDeviceOrientation(int i) {
        this.deviceOrientation = i;
    }

    public void setDonotTrack(boolean z) {
        this.donotTrack = z;
    }

    public void setDuration(long j) {
        this.duration = j;
    }

    public void setEnable3DAntialiasing(boolean z) {
        this.enable3DAntialiasing = z;
    }

    public void setEtcTextureBatch(String str) {
        this.etcTextureBatch = str;
    }

    public void setExtString(String str) {
        this.extString = str;
    }

    public void setFacePositionCenter(int i) {
        this.facePositionCenter = i;
    }

    public void setFrameNumber(int i) {
        this.frameNumber = i;
    }

    public void setFrameRate(int i) {
        this.frameRate = i;
    }

    public void setGroupNum(int i) {
        this.groupNum = i;
    }

    public void setGroupNumber(int i) {
        this.groupNumber = i;
    }

    public void setHandGestureType(int i) {
        this.handGestureType = i;
    }

    public void setHiddenObjectTriggerType(String str) {
        this.hiddenObjectTriggerType = str;
    }

    public void setHiddenTriggerType(int i) {
        this.hiddenTriggerType = i;
    }

    public void setImageFolderPath(String str) {
        this.imageFolderPath = str;
    }

    public void setImageHeight(int i) {
        this.imageHeight = i;
    }

    public void setImageMaskPath(String str) {
        this.imageMaskPath = str;
    }

    public void setImagePreName(String str) {
        this.imagePreName = str;
    }

    public void setImageProvider(ImageDelegateProvider imageDelegateProvider) {
        this.imageProvider = imageDelegateProvider;
    }

    public void setImageWidth(int i) {
        this.imageWidth = i;
    }

    public void setIntensity(float f) {
        this.intensity = f;
    }

    public void setLayerType(String str) {
        this.layerType = str;
    }

    public void setLookUpModel(LookUpModel lookUpModel) {
        this.lookUpModel = lookUpModel;
    }

    public void setLoop(int i) {
        this.loop = i;
    }

    public void setLoopSound(boolean z) {
        this.loopSound = z;
    }

    public void setLoopStart(int i) {
        this.loopStart = i;
    }

    public void setMask(Mask mask) {
        this.mask = mask;
    }

    public void setMinHiddenFrameCount(int i) {
        this.minHiddenFrameCount = i;
    }

    public void setModelType(int i) {
        this.modelType = i;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNoBreakLoop(boolean z) {
        this.noBreakLoop = z;
    }

    public void setNotHiddenAfterTrigger(boolean z) {
        this.notHiddenAfterTrigger = z;
    }

    public void setNotResetOnHide(boolean z) {
        this.donotResetOnHide = z;
    }

    public void setObjectTriggerType(String str) {
        this.objectTriggerType = str;
    }

    public void setOffsetX(int i) {
        this.offsetX = i;
    }

    public void setOffsetY(int i) {
        this.offsetY = i;
    }

    public void setOrderedIndex(int i) {
        this.orderedIndex = i;
    }

    public void setPlayingSoundId(int i) {
        this.playingSoundId = i;
    }

    public void setPointIndexes(int[] iArr) {
        this.pointIndexes = iArr;
    }

    public void setPollTrigger(boolean z) {
        this.pollTrigger = z;
    }

    public void setPreMultiAlpha(boolean z) {
        this.isPreMultiAlpha = z;
    }

    public void setResourceType(String str) {
        this.resourceType = str;
    }

    public void setSegmentType(String str) {
        this.segmentType = str;
    }

    public void setShowTop(boolean z) {
        this.showTop = z;
    }

    public void setSound(String str) {
        this.sound = str;
    }

    public void setSoundId(int i) {
        this.soundId = i;
    }

    public void setSoundNeedsPublish(boolean z) {
        this.soundNeedsPublish = z;
    }

    public void setStickerType(String str) {
        this.stickerType = str;
    }

    public void setStrokeColor(float[] fArr) {
        this.strokeColor = fArr;
    }

    public void setStrokeRadius(int i) {
        this.strokeRadius = i;
    }

    public void setTopAlignIndex(int i) {
        this.topAlignIndex = i;
    }

    public void setTrackingRegion(ObjectRegion objectRegion) {
        this.trackingRegion = objectRegion;
    }

    public void setTriggerFlag(int i) {
        this.triggerFlag = i;
    }

    public void setTriggerRegion(int[] iArr) {
        this.triggerRegion = iArr;
    }

    public void setTriggerState(int i) {
        this.triggerState = i;
    }

    public void setTriggerType(int i) {
        this.triggerType = i;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setUseHandGestureDetectNewVersion(boolean z) {
        this.useHandGestureDetectNewVersion = z;
    }

    public void setUseImageCache(boolean z) {
        this.useImageCache = z;
    }

    public void setVideoFileConfig(VideoFileConfig videoFileConfig) {
        this.videoFileConfig = videoFileConfig;
    }

    public void setXengineEsPath(String str) {
        this.xengineEsPath = str;
    }

    public void setZoomScale(int i) {
        this.zoomScale = i;
    }

    public void updateTriggerFlag(int i) {
        this.triggerFlag = i | this.triggerFlag;
    }
}
