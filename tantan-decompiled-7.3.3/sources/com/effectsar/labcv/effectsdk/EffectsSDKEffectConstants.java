package com.effectsar.labcv.effectsdk;

/* JADX INFO: loaded from: classes.dex */
public class EffectsSDKEffectConstants {
    public static final int BEF_DETECT_SMALL_MODEL = 2097152;
    public static final int BEF_SKELETON_MAX_NUM = 2;
    public static final String TAG = "bef_effect_ai";

    public enum BachSkeletonParamType {
        BEF_AI_BACH_SKELETON_BODY_MAX_COUNT(0),
        BEF_AI_BACH_SKELETON_FORCE_DETECT(1),
        BEF_AI_BACH_SKELETON_IMAGE_MODE(2);

        private int value;

        BachSkeletonParamType(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum C1ModelType {
        BEF_AI_C1_MODEL_SMALL(1),
        BEF_AI_C1_MODEL_LARGE(2);

        private int value;

        C1ModelType(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum C1ParamType {
        BEF_AI_C1_USE_VIDEO_MODE(1),
        BEF_AI_C1_USE_MultiLabels(2);

        private int value;

        C1ParamType(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum C2ModelType {
        BEF_AI_kC2Model1(1);

        private int value;

        C2ModelType(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum C2ParamType {
        BEF_AI_C2_USE_VIDEO_MODE(0),
        BEF_AI_C2_USE_MultiLabels(1);

        private int value;

        C2ParamType(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum CarModelType {
        DetectModel(1),
        BrandNodel(2),
        OCRModel(3),
        TrackModel(4);

        private int value;

        CarModelType(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum CarParamType {
        BEF_Car_Detect(1),
        BEF_Brand_Rec(2);

        private int value;

        CarParamType(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum ChromaKeyingParamType {
        BEF_AI_CHROMA_KEYING_METHOD(0),
        BEF_AI_CHROMA_KEYING_CAL_COLOR(1),
        BEF_AI_CHROMA_KEYING_BG_R(2),
        BEF_AI_CHROMA_KEYING_BG_G(3),
        BEF_AI_CHROMA_KEYING_BG_B(4),
        BEF_AI_CHROMA_KEYING_BALP(5),
        BEF_AI_CHROMA_KEYING_KALP(6),
        BEF_AI_CHROMA_KEYING_SMOOTH(7),
        BEF_AI_CHROMA_KEYING_SHARPEN(8),
        BEF_AI_CHROMA_KEYING_GET_MASK(9);

        private int value;

        ChromaKeyingParamType(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public static class DetectMode {
        public static final int BEF_DETECT_MODE_IMAGE = 262144;
        public static final int BEF_DETECT_MODE_IMAGE_SLOW = 524288;
        public static final int BEF_DETECT_MODE_VIDEO = 131072;
        public static final int BEF_DETECT_MODE_VIDEO_SLOW = 65536;
    }

    public enum DynamicActionModelType {
        BEF_AI_DYNAMIC_ACTION_MODEL_SK(1),
        BEF_AI_DYNAMIC_ACTION_MODEL_DETECT(2),
        BEF_AI_DYNAMIC_ACTION_MODEL_DYNAMIC_ACTION(4);

        private int value;

        DynamicActionModelType(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum DynamicActionParamType {
        BEF_AI_DYNAMIC_ACTION_REFRESH_FRAME_INTERVAL(1),
        BEF_AI_DYNAMIC_ACTION_MAX_PERSON_NUM(2);

        private int value;

        DynamicActionParamType(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum DynamicGestureParamType {
        BEF_AI_DYNGEST_REFRESH_FRAME_INTERVAL(0),
        BEF_AI_DYNAMIC_GESTURE_NUM_REQ_FRAMES(1),
        BEF_AI_DYNAMIC_GESTURE_FRAMES_INTERVAL(2),
        BEF_AI_DYNAMIC_GESTURE_MODEL_GESTURE_CLS(3);

        private int value;

        DynamicGestureParamType(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public static class EffectsSDKResultCode {
        public static final int BEF_RESULT_FAIL = -1;
        public static final int BEF_RESULT_FAIL_DATA_ERROR = -3;
        public static final int BEF_RESULT_FILE_NOT_FIND = -2;
        public static final int BEF_RESULT_INVALID_HANDLE = -4;
        public static final int BEF_RESULT_INVALID_IMAGE_FORMAT = -7;
        public static final int BEF_RESULT_INVALID_LICENSE = -114;
        public static final int BEF_RESULT_MODEL_LOAD_FAILURE = -8;
        public static final int BEF_RESULT_SUC = 0;
    }

    public static class FaceAction {
        public static final int BEF_BROW_RAISE = 32;
        public static final int BEF_DETECT_FULL = 127;
        public static final int BEF_EYE_BLINK = 2;
        public static final int BEF_FACE_DETECT = 1;
        public static final int BEF_HEAD_NOD = 16;
        public static final int BEF_HEAD_SHAKE = 8;
        public static final int BEF_MOUTH_AH = 4;
        public static final int BEF_MOUTH_POUT = 64;
    }

    public static class FaceAttribute {
        public static final int BEF_FACE_ATTRIBUTE_AGE = 1;
        public static final int BEF_FACE_ATTRIBUTE_ATTRACTIVE = 8;
        public static final int BEF_FACE_ATTRIBUTE_CONFUSE = 1024;
        public static final int BEF_FACE_ATTRIBUTE_EXPRESSION = 4;
        public static final int BEF_FACE_ATTRIBUTE_GENDER = 2;
        public static final int BEF_FACE_ATTRIBUTE_HAPPINESS = 16;
    }

    public static class FaceDetectType {
        public static final int BEF_FACE_PARAM_BASE_SMOOTH_LEVEL = 4;
        public static final int BEF_FACE_PARAM_EXTRA_SMOOTH_LEVEL = 5;
        public static final int BEF_FACE_PARAM_FACE_DETECT_INTERVAL = 1;
        public static final int BEF_FACE_PARAM_MASK_SMOOTH_TYPE = 6;
        public static final int BEF_FACE_PARAM_MAX_FACE_NUM = 2;
        public static final int BEF_FACE_PARAM_MIN_DETECT_LEVEL = 3;
    }

    public static class FaceExpression {
        public static final int BEF_FACE_ATTRIBUTE_ANGRY = 0;
        public static final int BEF_FACE_ATTRIBUTE_DISGUST = 1;
        public static final int BEF_FACE_ATTRIBUTE_FEAR = 2;
        public static final int BEF_FACE_ATTRIBUTE_HAPPY = 3;
        public static final int BEF_FACE_ATTRIBUTE_NEUTRAL = 6;
        public static final int BEF_FACE_ATTRIBUTE_NUM_EXPRESSION = 7;
        public static final int BEF_FACE_ATTRIBUTE_SAD = 4;
        public static final int BEF_FACE_ATTRIBUTE_SURPRISE = 5;
    }

    public class FaceExtraModel {
        public static final int BEF_MOBILE_FACE_240_DETECT = 256;
        public static final int BEF_MOBILE_FACE_240_DETECT_FASTMODE = 3145728;
        public static final int BEF_MOBILE_FACE_280_DETECT = 2304;

        public FaceExtraModel() {
        }
    }

    public enum FaceFittingCameraType {
        BEF_AI_FACEFITTING_Camera_Orthographic(0),
        BEF_AI_FACEFITTING_Camera_Perspective(1);

        private int value;

        FaceFittingCameraType(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum FaceFittingParam {
        BEF_AI_FACEFITTING_Solver_Lambda(1),
        BEF_AI_FACEFITTING_Solver_MaxIter(2),
        BEF_AI_FACEFITTING_Solver_Eps(3),
        BEF_AI_FACEFITTING_Solver_Ratio(4),
        BEF_AI_FACEFITTING_Solver_Smooth(5),
        BEF_AI_FACEFITTING_Solver_Camera_Type(6),
        BEF_AI_FACEFITTING_Config_Cal_TB(7),
        BEF_AI_FACEFITTING_Eyelash_Flag(8),
        BEF_AI_FACEFITTING_Use_Semantic_Lmk(9),
        BEF_AI_FACEFITTING_Mouth_BS_Limit(10);

        private int value;

        FaceFittingParam(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum FaceMaskType {
        FACE_MASK_FACE(3),
        FACE_MASK_TEETH(2),
        FACE_MASK_MOUTH(1);

        private int value;

        FaceMaskType(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public static class FaceRacial {
        public static final int BEF_FACE_ATTRIBUTE_BLACK = 3;
        public static final int BEF_FACE_ATTRIBUTE_INDIAN = 2;
        public static final int BEF_FACE_ATTRIBUTE_NUM_RACIAL = 4;
        public static final int BEF_FACE_ATTRIBUTE_WHITE = 0;
        public static final int BEF_FACE_ATTRIBUTE_YELLOW = 1;
    }

    public class FaceSegmentConfig {
        public static final int BEFF_MOBILE_FACE_REST_MASK = 1280;
        public static final int BEF_MOBILE_FACE_MOUTH_MASK = 768;
        public static final int BEF_MOBILE_FACE_TEETH_MASK = 768;

        public FaceSegmentConfig() {
        }
    }

    public class FaceSegmentType {
        public static final int BEF_FACE_FACE_MASK = 3;
        public static final int BEF_FACE_MOUTH_MASK = 1;
        public static final int BEF_FACE_TEETH_MASK = 2;

        public FaceSegmentType() {
        }
    }

    public enum GazeEstimationModelType {
        BEF_GAZE_ESTIMATION_MODEL1(1);

        private int value;

        GazeEstimationModelType(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum GazeEstimationParamType {
        BEF_GAZE_ESTIMATION_EDGE_MODE(1),
        BEF_GAZE_ESTIMATION_CAMERA_FOV(2),
        BEF_GAZE_ESTIMATION_DIVERGENCE(3);

        private int value;

        GazeEstimationParamType(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum GeneralObjectModelType {
        BEF_AI_GENERAL_OBJECT_PURE_DETECT(1),
        BEF_AI_GENERAL_OBJECT_DETECT_CLS(2),
        BEF_AI_GENERAL_OBJECT_CLS_NAME(3),
        BEF_AI_GENERAL_OBJECT_DETECT_TRACK(4);

        private int value;

        GeneralObjectModelType(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum GeneralObjectParamType {
        BEF_AI_GENERAL_OBJECT_DETECT_SHORT_SIDE_LEN(1);

        private int value;

        GeneralObjectParamType(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum GestureEventCode {
        TAP(0),
        PAN(1),
        ROTATE(2),
        SCALE(3),
        LONG_PRESS(4),
        DOUBLE_CLICK(5);

        private final int code;

        GestureEventCode(int i) {
            this.code = i;
        }

        public int getCode() {
            return this.code;
        }
    }

    public enum HandModelType {
        BEF_HAND_MODEL_DETECT(1),
        BEF_HAND_MODEL_BOX_REG(2),
        BEF_HAND_MODEL_GESTURE_CLS(4),
        BEF_HAND_MODEL_KEY_POINT(8);

        private int value;

        HandModelType(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum HandParamType {
        BEF_HAND_MAX_HAND_NUM(2),
        BEF_HAND_DETECT_MIN_SIDE(3),
        BEF_HAND_CLS_SMOOTH_FACTOR(4),
        BEF_HAND_USE_ACTION_SMOOTH(5),
        BEF_HAND_ALGO_LOW_POWER_MODE(6),
        BEF_HAND_ALGO_AUTO_MODE(7),
        BEF_HAND_ALGO_TIME_ELAPSED_THRESHOLD(8),
        BEF_HAND_ALGO_MAX_TEST_FRAME(9),
        BEF_HAND_IS_USE_DOUBLE_GESTURE(10),
        BEF_HNAD_ENLARGE_FACTOR_REG(11),
        BEF_HAND_NARUTO_GESTUER(12);

        private int value;

        HandParamType(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum HeadSegmentParamType {
        BEF_AI_HS_ENABLE_TRACKING(1),
        BEF_AI_HS_MAX_FACE(2);

        private int value;

        HeadSegmentParamType(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum HumanDistanceModelType {
        BEF_HUMAN_DISTANCE_MODEL1(1);

        private int value;

        HumanDistanceModelType(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum HumanDistanceParamType {
        BEF_HumanDistanceEdgeMode(0),
        BEF_HumanDistanceCameraFov(1);

        private int value;

        HumanDistanceParamType(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum ImageQualityAsfSceneMode {
        ASF_SCENE_MODE_LIVE_GAME(0),
        ASF_SCENE_MODE_LIVE_PEOPLE(1),
        ASF_SCENE_MODE_LIVE_EDIT(2),
        ASF_SCENE_MODE_LIVE_RECORED_MAIN(3),
        ASF_SCENE_MODE_LIVE_RECORED_FRONT(4);

        private final int mode;

        ImageQualityAsfSceneMode(int i) {
            this.mode = i;
        }

        public int getMode() {
            return this.mode;
        }
    }

    public enum ImageQualityOnekeyEnhanceSceneMode {
        SCENE_MODE_MOBILE_EDITOR(0),
        SCENE_MODE_MOBILE_RECORDE(1),
        SCENE_MODE_MOBILE_LIVE(2),
        SCENE_MODE_MOBILE_RTC(3),
        SCENE_MODE_PC_EDITOR(4),
        SCENE_MODE_PC_LIVE(5),
        SCENE_MODE_PC_RTC(6),
        SCENE_MODE_TRANSCODING(7);

        private final int mode;

        ImageQualityOnekeyEnhanceSceneMode(int i) {
            this.mode = i;
        }

        public int getMode() {
            return this.mode;
        }
    }

    public enum ImageQualityPostProcessType {
        IMAGE_QUALITY_POST_PROCESS_TYPE_NONE,
        IMAGE_QUALITY_POST_PROCESS_TYPE_VFI,
        IMAGE_QUALITY_POST_PROCESS_TYPE_VIDEO_STAB,
        IMAGE_QUALITY_POST_PROCESS_TYPE_VIDEO_DEFLICKER
    }

    public enum ImageQualityType {
        IMAGE_QUALITY_TYPE_NONE,
        IMAGE_QUALITY_TYPE_VIDEO_SR,
        IMAGE_QUALITY_TYPE_NIGHT_SCENE,
        IMAGE_QUALITY_TYPE_ADAPTIVE_SHARPEN,
        IMAGE_QUALITY_TYPE_ONEKEY_ENHANCE,
        IMAGE_QUALITY_TYPE_VIDAS,
        IMAGE_QUALITY_TYPE_TAINT_DETECT,
        IMAGE_QUALITY_TYPE_CINE_MOVE_ALG_SNAKE_V8,
        IMAGE_QUALITY_TYPE_CINE_MOVE_ALG_HEART_BEAT_V9,
        IMAGE_QUALITY_TYPE_CINE_MOVE_ALG_BREATH_V10,
        IMAGE_QUALITY_TYPE_CINE_MOVE_ALG_ROT360_V11,
        IMAGE_QUALITY_TYPE_VIDEO_LITE_HDR
    }

    public enum ImageQualityVfiDataType {
        IMAGE_QUALITY_VFI_DATA_TYPE_BUFFER_RGBA8888(0),
        IMAGE_QUALITY_VFI_DATA_TYPE_TEXTURE_RGBA8(1);

        private int value;

        ImageQualityVfiDataType(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum ImageQualityVfiType {
        IMAGE_QUALITY_VFI_TYPE_UM(0),
        IMAGE_QUALITY_VFI_TYPE_COVER(1);

        private int value;

        ImageQualityVfiType(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum ImageQualityVidaType {
        VIDA_TYPE_FACE(0),
        VIDA_TYPE_AES(1),
        VIDA_TYPE_Similar(2),
        VIDA_TYPE_Coherence(3),
        VIDA_TYPE_Clarity(4);

        private final int type;

        ImageQualityVidaType(int i) {
            this.type = i;
        }

        public int getType() {
            return this.type;
        }
    }

    public enum ImageQulityBackendType {
        IMAGE_QUALITY_BACKEND_CPU(0),
        IMAGE_QUALITY_BACKEND_GPU(1);

        private final int type;

        ImageQulityBackendType(int i) {
            this.type = i;
        }

        public int getType() {
            return this.type;
        }
    }

    public enum ImageQulityPowerLevel {
        POWER_LEVEL_DEFAULT(0),
        POWER_LEVEL_LOW(1),
        POWER_LEVEL_NORMAL(2),
        POWER_LEVEL_HIGH(3),
        POWER_LEVEL_AUTO(4);

        private final int level;

        ImageQulityPowerLevel(int i) {
            this.level = i;
        }

        public int getLevel() {
            return this.level;
        }
    }

    public enum ImageQulityVideoLiteHdrType {
        HDR_TYPE_LITE_V5(0),
        HDR_TYPE_LITE_V6(1),
        HDR_TYPE_LITE_V7(2),
        HDR_TYPE_LITE_V8(3),
        HDR_TYPE_UNKNOW(4);

        private final int level;

        ImageQulityVideoLiteHdrType(int i) {
            this.level = i;
        }

        public int getLevel() {
            return this.level;
        }
    }

    public enum IntensityType {
        Filter(12),
        BeautyWhite(1),
        BeautySmooth(2),
        FaceReshape(3),
        BeautySharp(9),
        MakeUpLip(17),
        MakeUpBlusher(18);


        /* JADX INFO: renamed from: id */
        private int f5888id;

        IntensityType(int i) {
            this.f5888id = i;
        }

        public int getId() {
            return this.f5888id;
        }
    }

    public enum LensVideoAlgType {
        SR_R_TYPE(0),
        SR_A_TYPE(1),
        SR_G_TYPE(2),
        SR_N_TYPE(3),
        SR_R15_TYPE(4),
        SR_U_UNKNOW(5);

        private int value;

        LensVideoAlgType(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum LicenseCakeParamType {
        ALGORITHM_PARAMS_KEY_LICENSEFACE_DEDETECTION_DETECT_INTERVAL(0),
        ALGORITHM_PARAMS_KEY_LICENSEFACE_DEDETECTION_SIDE_MODEL_LEN(1),
        ALGORITHM_PARAMS_KEY_LICENSEFACE_DEDETECTION_DETECT_USE_REGRESSOR(2),
        ALGORITHM_PARAMS_KEY_LICENSEFACE_DEDETECTION_DETECT_USE_TRACKER(3);

        private int value;

        LicenseCakeParamType(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum LightClsType {
        None(-1),
        Indoor_Yellow(0),
        Indoor_White(1),
        Indoor_weak(2),
        Sunny(3),
        Cloudy(4),
        Night(5),
        Backlight(6);

        private int value;

        LightClsType(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum LogLevel {
        BEF_AI_LOG_LEVEL_NONE(0),
        BEF_AI_LOG_LEVEL_DEFAULT(1),
        BEF_AI_LOG_LEVEL_VERBOSE(2),
        BEF_AI_LOG_LEVEL_DEBUG(3),
        BEF_AI_LOG_LEVEL_INFO(4),
        BEF_AI_LOG_LEVEL_WARN(5),
        BEF_AI_LOG_LEVEL_ERROR(6),
        BEF_AI_LOG_LEVEL_FATAL(7),
        BEF_AI_LOG_LEVEL_SILENT(8);

        private int value;

        LogLevel(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum ObjectTrackingInitBoxStatus {
        BEF_AI_OBJECT_TRACKING_InitBBoxInvalidHandle(-1),
        BEF_AI_OBJECT_TRACKING_InitBBoxSuccess(0),
        BEF_AI_OBJECT_TRACKING_InitBBoxNoTexture(1),
        BEF_AI_OBJECT_TRACKING_InitBBoxImageFeatureExtractFail(2);

        private int value;

        ObjectTrackingInitBoxStatus(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum ObjectTrackingSpeed {
        BEF_AI_OBJECT_TRACKING_SpeedOrig(0),
        BEF_AI_OBJECT_TRACKING_SpeedUp1(1),
        BEF_AI_OBJECT_TRACKING_SpeedUp2(2);

        private int value;

        ObjectTrackingSpeed(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }

        public void setValue(int i) {
            this.value = i;
        }
    }

    public enum ObjectTrackingStatus {
        BEF_AI_OBJECT_TRACKING_StatusUnavailable(0),
        BEF_AI_OBJECT_TRACKING_StatusTracked(1),
        BEF_AI_OBJECT_TRACKING_StatusLosing(2),
        BEF_AI_OBJECT_TRACKING_StatusLost(3);

        private int value;

        ObjectTrackingStatus(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }

        public void setValue(int i) {
            this.value = i;
        }
    }

    public static class PetFaceAction {
        public static final int BEF_LEFT_EYE_PET_FACE = 1;
        public static final int BEF_MOUTH_PET_FACE = 4;
        public static final int BEF_RIGHT_EYE_PET_FACE = 2;
    }

    public static class PetFaceDetectConfig {
        public static final int BEF_PET_FACE_DETECT_CAT = 1;
        public static final int BEF_PET_FACE_DETECT_DOG = 2;
        public static final int BEF_PET_FACE_DETECT_QUICK = 4;
    }

    public static class PetFaceDetectType {
        public static final int BEF_PET_FACE_CAT = 1;
        public static final int BEF_PET_FACE_DOG = 2;
        public static final int BEF_PET_FACE_HUMAN = 3;
        public static final int BEF_PET_FACE_OTHER = 99;
    }

    public enum PhotoQualityType {
        PHOTO_QUALITY_TYPE_NONE,
        PHOTO_QUALITY_TYPE_NIGNT_SCENE
    }

    public enum PixlFormat {
        RGBA8888(0),
        BGRA8888(1),
        BGR888(2),
        RGB888(3),
        BEF_AI_PIX_FMT_YUV420P(5),
        BEF_AI_PIX_FMT_NV12(6),
        BEF_AI_PIX_FMT_NV21(7);

        private int value;

        PixlFormat(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum PorraitMattingParamType {
        BEF_MP_EdgeMode(0),
        BEF_MP_FrashEvery(1),
        BEF_MP_OutputMinSideLen(2),
        BEF_MP_VIDEO_MODE(5);

        private int value;

        PorraitMattingParamType(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum PortraitMatting {
        BEF_PORTAITMATTING_LARGE_MODEL(0),
        BEF_PORTAITMATTING_SMALL_MODEL(1);

        private int value;

        PortraitMatting(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum RenderAPI {
        GLES20(0),
        GLES30(1);

        private int value;

        RenderAPI(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum Rotation {
        CLOCKWISE_ROTATE_0(0),
        CLOCKWISE_ROTATE_90(1),
        CLOCKWISE_ROTATE_180(2),
        CLOCKWISE_ROTATE_270(3);


        /* JADX INFO: renamed from: id */
        public int f5890id;

        Rotation(int i) {
            this.f5890id = i;
        }
    }

    public enum SaliencyMattingModelType {
        BEF_SALIENCY_MATTING_SMALL_MODEL(0),
        BEF_SALIENCY_MATTING_MEDIUM_MODEL(1),
        BEF_SALIENCY_MATTING_LARGE_MODEL(2);

        private final int value;

        SaliencyMattingModelType(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum Skeleton3DParamType {
        BEF_SELETON3D_WHOLEBODY(0),
        BEF_SELETON3D_WITHHANDS(1),
        BEF_SELETON3D_MAXTARGETNUM(2),
        BEF_SELETON3D_TARGETSPEFRAME(3),
        BEF_SELETON3D_WRISTSCORETHRES(4),
        BEF_SELETON3D_HSWRISTSCORETHRES(5),
        BEF_SELETON3D_CHECKROOTINVERSE(6),
        BEF_SELETON3D_TASKPERTICK(7),
        BEF_SELETON3D_SMOOTHWINSIZE(8),
        BEF_SELETON3D_SMOOTHORIGINSIGMAXY(9),
        BEF_SELETON3D_SMOOTHORIGINSIGMAZ(10),
        BEF_SELETON3D_WITHWRISTOFFSET(11),
        BEF_SELETON3D_HANDPROBTHRES(12),
        BEF_SELETON3D_CHECKWRISTROT(13),
        BEF_SELETON3D_SMOOTHSIGMABETAS(14),
        BEF_SELETON3D_FITTINGENABLE(15),
        BEF_SELETON3D_FITTINGROOTENABLE(16);

        private int value;

        Skeleton3DParamType(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum SkinSegmentationParamType {
        BEF_AI_SKIN_SEG_MODEL_KEY(0),
        BEF_AI_SKIN_SEG_IS_NEED_FACE(1);

        private int value;

        SkinSegmentationParamType(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum SlamAccuracyLevel {
        BEF_AI_SLAM_High_Accuracy(0),
        BEF_AI_SLAM_Medium_Accuracy(1),
        BEF_AI_SLAM_Low_Accuracy(2);

        private int value;

        SlamAccuracyLevel(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum SlamDeviceOrientation {
        BEF_AI_SLAM_Portrait(0),
        BEF_AI_SLAM_LandscapeLeft(1),
        BEF_AI_SLAM_UpsideDown(2),
        BEF_AI_SLAM_LandscapeRight(3);

        private int value;

        SlamDeviceOrientation(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum SlamImageColor {
        BEF_AI_SLAM_RGB(0),
        BEF_AI_SLAM_BGR(1),
        BEF_AI_SLAM_GRAY(2);

        private int value;

        SlamImageColor(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum SlamImuDataType {
        BEF_AI_SLAM_IMU_ACCELEROMETER(0),
        BEF_AI_SLAM_IMU_GYROSCOPE(1),
        BEF_AI_SLAM_IMU_GRAVITY(2);

        private int value;

        SlamImuDataType(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum SlamResolution {
        BEF_AI_SLAM_480P(0),
        BEF_AI_SLAM_720P(1),
        BEF_AI_SLAM_360P(2),
        BEF_AI_SLAM_180P(3);

        private int value;

        SlamResolution(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum SlamTrackingState {
        BEF_AI_SLAM_Tracking_ERROR(0),
        BEF_AI_SLAM_Tracking_INIT(1),
        BEF_AI_SLAM_Tracking_TRACKING(2),
        BEF_AI_SLAM_Tracking_LOST(3);

        private int value;

        SlamTrackingState(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum SlamVersion {
        BEF_AI_SLAM_Debug(0),
        BEF_AI_SLAM_HorizontalPlaneTracking(2),
        BEF_AI_SLAM_RegionTracking(3);

        private int value;

        SlamVersion(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum StudentIdOcrModelType {
        BEF_STUDENT_ID_OCR_MODEL(1);

        private int value;

        StudentIdOcrModelType(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum TextureFormat {
        Texure2D(3553),
        Texture_Oes(36197);

        private int value;

        TextureFormat(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum TouchEventCode {
        BEGAN(0),
        MOVED(1),
        STATIONARY(2),
        ENDED(3),
        CANCELLED(4);

        private final int code;

        TouchEventCode(int i) {
            this.code = i;
        }

        public int getCode() {
            return this.code;
        }
    }

    public enum VASProcessType {
        BEF_LENS_VAS_PROCESS_EST(0),
        BEF_LENS_VAS_PROCESS_WARP(1),
        BEF_LENS_VAS_PROCESS_RESET(2);

        private int value;

        VASProcessType(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum VideoClsModelType {
        BEF_AI_kVideoClsModel1(1);

        private int value;

        VideoClsModelType(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum VideoClsParamType {
        BEF_AI_kVideoClsEdgeMode(1);

        private int value;

        VideoClsParamType(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum VideoDeflickerAlgType {
        LENS_DEFLICKER_ALG_DELAY(0),
        LENS_DEFLICKER_ALG_FLASH(1),
        LENS_DEFLICKER_ALG_UNKNOW(1000);

        private int value;

        VideoDeflickerAlgType(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum VideoStabFrameType {
        VIDEO_STAB_FRAME_START(0),
        VIDEO_STAB_FRAME_EST(1),
        VIDEO_STAB_FRAME_WARP(2);

        private int value;

        VideoStabFrameType(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum YUV420Type {
        YUV_420_TYPE_NV21(0),
        YUV_420_TYPE_NV12(1);

        private int value;

        YUV420Type(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }
}
