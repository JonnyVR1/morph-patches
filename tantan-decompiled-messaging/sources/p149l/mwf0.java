package p149l;

import com.facebook.AuthenticationTokenClaims;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes7.dex */
public class mwf0 {
    public static final String FACE_3D_MASK_TYPE = "3d";
    public static final float FACE_DEFAULT_WIDTH = 180.0f;
    public static final String FACE_LOOK_UP_TYPE = "FACE_LOOK_UP_TYPE";
    public static final String FACE_MASK_TYPE = "FACE_MASK_TYPE";
    public static final String LAYER_TYPE_GESTURE = "object_follower";
    public static final String LAYER_TYPE_NATIVE = "native";
    public static final String STICKER_TYPE_DELEGATE_STICKER = "weex";
    public static final String STICKER_TYPE_GAME_FIX_TYPE = "STICKER_TYPE_GAME_FIX_TYPE";
    public static final String STICKER_TYPE_VOICE = "STICKER_TYPE_VOICE";
    public static final int TYPE_ABSOLUTION_POSITION = 5;
    public static final int TYPE_ABS_POSITION_ADJUST_RESOLUTION = 7;
    public static final int TYPE_ABS_POSITION_USE_STICKER_DIM = 6;
    public static final int TYPE_FACE = 0;
    public static final int TYPE_FIXED = 1;
    public static final int TYPE_FULL_SCREEN_FIXED = 2;
    public static final int TYPE_SCALE_CENTER_CROP = 99;
    public static final int TYPE_SCALE_TO_FILL = 3;

    @SerializedName("position")
    private C20112t6 absolutePos;

    @SerializedName("additionalInfo")
    private owf0 additionalInfo;

    @SerializedName("blendMode")
    private C18576a blendMode;

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

    @SerializedName("etcTextureBatch")
    private String etcTextureBatch;

    @SerializedName("frames")
    private int frameNumber;

    @SerializedName("frameRate")
    private int frameRate;

    @SerializedName("groupNum")
    private int groupNum;
    public int groupNumber;

    @SerializedName("hidingObjectTriggerType")
    private String hiddenObjectTriggerType;

    @SerializedName("hidingTriggerType")
    private int hiddenTriggerType;
    private String imageFolderPath;

    @SerializedName("height")
    private int imageHeight;

    @SerializedName("folder")
    private String imagePreName;
    private rfm imageProvider;

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
    private g3w lookUpModel;

    @SerializedName("loopSound")
    private boolean loopSound;

    @SerializedName("loopingIndex")
    private int loopStart;
    private a3x mask;

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

    @SerializedName("fromTop")
    private boolean showTop;
    private String stickerType;

    @SerializedName("strokeColor")
    private float[] strokeColor;

    @SerializedName("strokeRadius")
    private int strokeRadius;
    private int triggerState;

    @SerializedName("triggerType")
    private int triggerType;

    @SerializedName("type")
    private int type;
    public int curIndex = 0;
    private int soundId = -1;
    private int playingSoundId = -1;
    private boolean useImageCache = true;
    private int baseDemensionHeight = 640;
    private boolean comic = false;

    @SerializedName("intensity")
    private float intensity = 1.0f;

    @SerializedName("pollTrigger")
    private boolean pollTrigger = false;

    /* JADX INFO: renamed from: l.mwf0$a */
    public class C18576a {

        @SerializedName(AuthenticationTokenClaims.JSON_KEY_NAME)
        String name;
        final /* synthetic */ mwf0 this$0;
    }

    /* JADX INFO: renamed from: a */
    public owf0 m156621a() {
        return this.additionalInfo;
    }

    /* JADX INFO: renamed from: b */
    public int m156622b() {
        return this.imageHeight;
    }

    /* JADX INFO: renamed from: c */
    public int m156623c() {
        return this.imageWidth;
    }

    /* JADX INFO: renamed from: d */
    public int m156624d() {
        return this.soundId;
    }

    /* JADX INFO: renamed from: e */
    public void m156625e(int i) {
        this.frameRate = i;
    }

    /* JADX INFO: renamed from: f */
    public void m156626f(int i) {
        this.hiddenTriggerType = i;
    }

    /* JADX INFO: renamed from: g */
    public void m156627g(String str) {
        this.imageFolderPath = str;
    }

    /* JADX INFO: renamed from: h */
    public void m156628h(g3w g3wVar) {
        this.lookUpModel = g3wVar;
    }

    /* JADX INFO: renamed from: i */
    public void m156629i(a3x a3xVar) {
        this.mask = a3xVar;
    }

    /* JADX INFO: renamed from: j */
    public void m156630j(String str) {
        this.stickerType = str;
    }

    /* JADX INFO: renamed from: k */
    public void m156631k(int i) {
        this.triggerType = i;
    }
}
