package com.effectsar.labcv.effectsdk;

/* JADX INFO: loaded from: classes.dex */
public class BefActionRecognitionInfo {
    public static final int BEF_AI_ACTION_RECOGNITION_MAX_POINT_NUM = 18;
    public static final int FEEDBACK_PART_LEFT_ARM = 1;
    public static final int FEEDBACK_PART_LEFT_LEG = 3;
    public static final int FEEDBACK_PART_NONE = 0;
    public static final int FEEDBACK_PART_RIGHT_ARM = 2;
    public static final int FEEDBACK_PART_RIGHT_LEG = 4;
    public BefPublicDefine.BefKeyPoint[] feedbackKeyPoints;
    public int feedbackPart;
    public boolean isFeedbackValid;
    public BefPublicDefine.BefKeyPoint[] keyPoints;
    public boolean recognizeSucceed;

    public enum ActionRecognitionPoseType {
        STAND(1),
        LYING(2),
        SITTING(3),
        SIDELEFT(4),
        SIDERIGHT(5);


        /* JADX INFO: renamed from: id */
        public int f5812id;

        ActionRecognitionPoseType(int i) {
            this.f5812id = i;
        }
    }

    public static class PoseDetectResult {
        public boolean isDetected;
    }
}
