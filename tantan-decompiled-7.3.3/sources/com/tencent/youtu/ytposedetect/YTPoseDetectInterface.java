package com.tencent.youtu.ytposedetect;

import android.content.Context;
import android.util.Log;
import com.tencent.youtu.sdkkitframework.common.CommonUtils;
import com.tencent.youtu.sdkkitframework.common.ErrorCode;
import com.tencent.youtu.sdkkitframework.common.OperateInfoManager;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import com.tencent.youtu.sdkkitframework.common.StringCode;
import com.tencent.youtu.sdkkitframework.common.YTImageData;
import com.tencent.youtu.sdkkitframework.common.YtLogger;
import com.tencent.youtu.sdkkitframework.common.YtSDKStats;
import com.tencent.youtu.sdkkitframework.framework.YtFSM;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;
import com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState;
import com.tencent.youtu.sdkkitframework.liveness.C14650a;
import com.tencent.youtu.sdkkitframework.liveness.C14651b;
import com.tencent.youtu.sdkkitframework.liveness.C14652c;
import com.tencent.youtu.sdkkitframework.liveness.C14653d;
import com.tencent.youtu.sdkkitframework.liveness.C14664o;
import com.tencent.youtu.sdkkitframework.liveness.C14665p;
import com.tencent.youtu.ytposedetect.data.ActionData;
import com.tencent.youtu.ytposedetect.data.PoseDetectData;
import com.tencent.youtu.ytposedetect.data.YTActRefData;
import com.tencent.youtu.ytposedetect.data.YTActRefImage;
import com.tencent.youtu.ytposedetect.jni.YTPoseDetectJNIInterface;
import com.tencent.youtu.ytposedetect.manager.C14673a;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public class YTPoseDetectInterface {
    public static final String TAG = "YoutuFaceDetect";
    public static final String VERSION = "3.6.0";
    public static InterfaceC14671c mCheckResult = null;
    public static int mInitModel = 0;
    public static boolean mIsStarted = false;
    public static int mModelRetainCount = 0;
    public static C14673a mPoseDetectProcessManager = null;
    public static int mRotateTag = 1;
    public static InterfaceC14670b sPoseDetectOnFrame;

    /* JADX INFO: renamed from: com.tencent.youtu.ytposedetect.YTPoseDetectInterface$a */
    public interface InterfaceC14669a {
        /* JADX INFO: renamed from: a */
        void m85858a(byte[] bArr, int i, int i2);
    }

    /* JADX INFO: renamed from: com.tencent.youtu.ytposedetect.YTPoseDetectInterface$b */
    public interface InterfaceC14670b {
    }

    /* JADX INFO: renamed from: com.tencent.youtu.ytposedetect.YTPoseDetectInterface$c */
    public interface InterfaceC14671c {
        /* JADX INFO: renamed from: a */
        void mo85827a();

        void onFailed(int i, String str, String str2);
    }

    public static boolean callbackFrame(byte[] bArr, int i, int i2, int i3) {
        InterfaceC14670b interfaceC14670b = sPoseDetectOnFrame;
        if (interfaceC14670b != null) {
            return ((ActionLivenessState.C14627j) interfaceC14670b).m85826a(bArr, i, i2, i3);
        }
        return false;
    }

    public static void callbackFrameList(YTActRefImage[] yTActRefImageArr) {
        int i;
        InterfaceC14670b interfaceC14670b = sPoseDetectOnFrame;
        if (interfaceC14670b != null) {
            YtLogger.m85811o("ActionLivenessState", "action video error,conservation video,frame count:" + yTActRefImageArr.length);
            C14665p c14665p = ActionLivenessState.this.f61458m;
            String[] strArrSplit = c14665p.f61664f.split("&");
            if (strArrSplit.length > 0) {
                i = 0;
                for (String str : strArrSplit) {
                    String[] strArrSplit2 = str.split("=");
                    if (strArrSplit2.length > 1 && strArrSplit2[0].equals("action_video_shorten_strategy")) {
                        i = Integer.parseInt(strArrSplit2[1]);
                    }
                }
            } else {
                i = 0;
            }
            if (i != 1) {
                StringBuilder sb = new StringBuilder();
                if (strArrSplit.length > 0) {
                    for (String str2 : strArrSplit) {
                        String[] strArrSplit3 = str2.split("=");
                        if (strArrSplit3.length > 1 && !strArrSplit3[0].equals("action_video_shorten_strategy") && !strArrSplit3[0].equals("reflect_images_shorten_strategy")) {
                            sb.append(strArrSplit3[0]);
                            sb.append("=");
                            sb.append(strArrSplit3[1]);
                            sb.append("&");
                        }
                    }
                }
                sb.append("reflect_images_shorten_strategy=1&action_video_shorten_strategy=1");
                c14665p.f61664f = sb.toString();
            }
            c14665p.f61666h = c14665p.f61659a.getSupportCodecJSONStr();
            JSONArray jSONArray = new JSONArray();
            for (int i2 = 0; i2 < yTActRefImageArr.length; i2++) {
                YTActRefImage yTActRefImage = yTActRefImageArr[i2];
                if (yTActRefImage != null && yTActRefImage.encodeImage != null) {
                    YTActRefImage yTActRefImage2 = yTActRefImageArr[i2];
                    jSONArray.put(new YTImageData(yTActRefImage2.f61688w, yTActRefImage2.f61687h, yTActRefImage2.encodeImage).toJSON64Img());
                }
            }
            if (c14665p.f61665g == null) {
                c14665p.f61665g = jSONArray;
                return;
            }
            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                try {
                    c14665p.f61665g.put(jSONArray.get(i3));
                } catch (JSONException e) {
                    YtLogger.m85809e("p", "JSONArray put error", e);
                }
            }
        }
    }

    public static YTActRefData getActReflectData() {
        return YTPoseDetectJNIInterface.getActionReflectData(mPoseDetectProcessManager.f61692b);
    }

    public static void getBestImage(InterfaceC14669a interfaceC14669a, boolean z) {
        int i = z ? mPoseDetectProcessManager.f61692b : 1;
        byte[] bestImage = YTPoseDetectJNIInterface.getBestImage();
        if (i == 5 || i == 6 || i == 7 || i == 8) {
            C14673a c14673a = mPoseDetectProcessManager;
            interfaceC14669a.m85858a(bestImage, c14673a.f61694d, c14673a.f61693c);
        } else {
            C14673a c14673a2 = mPoseDetectProcessManager;
            interfaceC14669a.m85858a(bestImage, c14673a2.f61693c, c14673a2.f61694d);
        }
    }

    public static C14672a getEyeImage(int i) {
        C14672a c14672a = new C14672a();
        YTPoseDetectJNIInterface.getEyeImage(i);
        if (i == 5 || i == 6 || i == 7 || i == 8) {
            int i2 = mPoseDetectProcessManager.f61694d;
            return c14672a;
        }
        int i3 = mPoseDetectProcessManager.f61693c;
        return c14672a;
    }

    public static C14672a getMouthImage(int i) {
        C14672a c14672a = new C14672a();
        YTPoseDetectJNIInterface.getMouthImage(i);
        if (i == 5 || i == 6 || i == 7 || i == 8) {
            int i2 = mPoseDetectProcessManager.f61694d;
            return c14672a;
        }
        int i3 = mPoseDetectProcessManager.f61693c;
        return c14672a;
    }

    public static String getVersion() {
        return "jar3.6.0_native" + YTPoseDetectJNIInterface.getVersion();
    }

    public static int initModel() {
        try {
            YTPoseDetectJNIInterface.nativeLog(TAG, "[YTFacePreviewInterface.initModel] ---");
            if (mInitModel > 0) {
                YTPoseDetectJNIInterface.nativeLog(TAG, "[YTFacePreviewInterface.initModel] has already inited.");
                mInitModel++;
                return 0;
            }
            int iInitModel = YTPoseDetectJNIInterface.initModel("");
            if (iInitModel != 0) {
                return iInitModel;
            }
            mPoseDetectProcessManager = new C14673a();
            mInitModel++;
            return 0;
        } catch (Exception e) {
            YTPoseDetectJNIInterface.nativeLog(TAG, "initModel failed. message: " + Log.getStackTraceString(e));
            Log.e(TAG, "initModel failed. message: " + Log.getStackTraceString(e));
            return 10;
        }
    }

    public static boolean isDetecting() {
        C14673a c14673a = mPoseDetectProcessManager;
        return c14673a != null && c14673a.f61691a;
    }

    public static void noticeFailed(int i, String str, String str2) {
        YTPoseDetectJNIInterface.nativeLog(TAG, "[YTPoseDetectInterface.noticeFailed] resultCode: " + i + " \r\nmessage: " + str + " \r\ntips: " + str2);
        mCheckResult.onFailed(i, str, str2);
        mCheckResult = null;
        mIsStarted = false;
    }

    public static void noticeSuccess() {
        YTPoseDetectJNIInterface.nativeLog(TAG, "[YTPoseDetectInterface.noticeSuccess] ---");
        mCheckResult.mo85827a();
        mCheckResult = null;
        mIsStarted = true;
    }

    public static void poseDetect(PoseDetectData poseDetectData, InterfaceC14670b interfaceC14670b, int i) {
        JSONArray jSONArray;
        sPoseDetectOnFrame = interfaceC14670b;
        if (mInitModel <= 0) {
            ((ActionLivenessState.C14627j) interfaceC14670b).m85825a(2, "Not init model on poseDetect.", "Call YTPoseDetectInterface.initModel() before.");
            return;
        }
        if (!mIsStarted) {
            ((ActionLivenessState.C14627j) interfaceC14670b).m85825a(3, "Not call start() interface before.", "Call YTPoseDetectInterface.start() before.");
            return;
        }
        C14673a c14673a = mPoseDetectProcessManager;
        c14673a.getClass();
        c14673a.f61693c = poseDetectData.frameW;
        c14673a.f61694d = poseDetectData.frameH;
        int iPoseDetect = YTPoseDetectJNIInterface.poseDetect(poseDetectData);
        ActionLivenessState.C14627j c14627j = (ActionLivenessState.C14627j) interfaceC14670b;
        ActionLivenessState actionLivenessState = ActionLivenessState.this;
        actionLivenessState.f61466u = "";
        actionLivenessState.f61467v = null;
        if (iPoseDetect == 1) {
            YtLogger.m85808d("ActionLivenessState", "Detect pose with sequence " + ActionLivenessState.this.f61453h.length);
            if (YtFSM.getInstance().getContext().baseFunctionListener != null) {
                YtFSM.getInstance().getContext().baseFunctionListener.detectActionDone(ActionLivenessState.this.f61452g);
            }
            YtFSM.getInstance().sendFSMEvent(new C14650a(c14627j));
            ActionLivenessState actionLivenessState2 = ActionLivenessState.this;
            if (actionLivenessState2.m85824a(actionLivenessState2.f61453h, actionLivenessState2.f61454i + 1)) {
                YtLogger.m85810i("ActionLivenessState", "start check pose: " + ActionLivenessState.this.f61452g);
            } else {
                YtLogger.m85810i("ActionLivenessState", "action seq all done");
                ActionLivenessState.this.f61457l = true;
            }
        } else if (iPoseDetect == -3) {
            actionLivenessState.f61467v = StringCode.FL_INCOMPLETE_FACE;
            actionLivenessState.f61468w = StateEvent.ActionValue.STAGE_NOTPASS;
        } else if (iPoseDetect == -1026) {
            actionLivenessState.f61467v = StringCode.FL_POSE_KEEP;
            actionLivenessState.f61468w = StateEvent.ActionValue.STAGE_PASS;
        } else if (iPoseDetect == -1025) {
            actionLivenessState.f61467v = C14664o.m85849a(actionLivenessState.f61449d);
            ActionLivenessState.this.f61468w = StateEvent.ActionValue.STAGE_NOTPASS;
        } else if (iPoseDetect == -1029) {
            actionLivenessState.f61467v = C14664o.m85857b(actionLivenessState.f61450e);
            ActionLivenessState.this.f61468w = StateEvent.ActionValue.STAGE_NOTPASS;
        } else if (iPoseDetect == -1030) {
            actionLivenessState.f61467v = StringCode.FL_POSE_INCORRECT;
            actionLivenessState.f61468w = StateEvent.ActionValue.STAGE_NOTPASS;
        } else if (iPoseDetect == -1031) {
            actionLivenessState.f61467v = StringCode.FL_POSE_OPEN_EYE;
            actionLivenessState.f61468w = StateEvent.ActionValue.STAGE_NOTPASS;
        } else if (iPoseDetect == -1032) {
            actionLivenessState.f61467v = StringCode.FL_CLOSE_MOUTH;
            actionLivenessState.f61468w = StateEvent.ActionValue.STAGE_NOTPASS;
        } else if (iPoseDetect == -1033) {
            actionLivenessState.f61467v = StringCode.FL_ACT_SCREEN_SHAKING;
            actionLivenessState.f61468w = StateEvent.ActionValue.STAGE_NOTPASS;
        } else if (iPoseDetect == 0) {
            actionLivenessState.f61468w = StateEvent.ActionValue.STAGE_PASS;
        } else if (iPoseDetect == -5) {
            YtLogger.m85813w("ActionLivenessState", "Act failed " + iPoseDetect, null);
            ActionLivenessState.this.f61466u = StringCode.FL_ACT_SCREEN_SHAKING;
        } else if (iPoseDetect != -1 && iPoseDetect != 0) {
            YtLogger.m85813w("ActionLivenessState", "Act failed " + iPoseDetect, null);
        }
        YtSDKStats.getInstance().reportInfo("pose state " + iPoseDetect);
        if (YTPoseDetectJNIInterface.canReflect()) {
            CommonUtils.benchMarkBegin("make_pack_use_time_best_img");
            ActionLivenessState.this.f61461p = getActReflectData();
            YTActRefImage yTActRefImage = ActionLivenessState.this.f61461p.best;
            if (yTActRefImage == null || yTActRefImage.image.length == 0) {
                YtSDKStats.getInstance().reportError(4194304, "pose detect error");
                YtFSM.getInstance().sendFSMEvent(new C14651b(c14627j));
                reset();
            } else {
                OperateInfoManager.getInstance().setPackUseTime(CommonUtils.benchMarkEnd("make_pack_use_time_best_img"));
            }
        }
        if (YTPoseDetectJNIInterface.isRecordingDone()) {
            C14673a c14673a2 = mPoseDetectProcessManager;
            int i2 = c14673a2.f61692b;
            int i3 = (i == 1 && (i2 == 5 || i2 == 6 || i2 == 7 || i2 == 8)) ? c14673a2.f61694d : c14673a2.f61693c;
            int i4 = (i == 1 && (i2 == 5 || i2 == 6 || i2 == 7 || i2 == 8)) ? c14673a2.f61693c : c14673a2.f61694d;
            YTPoseDetectJNIInterface.getOneActionFrame(i4, i3);
            ActionLivenessState actionLivenessState3 = ActionLivenessState.this;
            if (!actionLivenessState3.f61457l) {
                reset();
                return;
            }
            try {
                C14665p c14665p = actionLivenessState3.f61458m;
                if (c14665p != null) {
                    c14665p.f61659a.stopEncoding();
                }
            } catch (Exception e) {
                YtLogger.m85808d("ActionLivenessState", "encode stop error! " + Log.getStackTraceString(e));
            }
            ActionLivenessState actionLivenessState4 = ActionLivenessState.this;
            C14665p c14665p2 = actionLivenessState4.f61458m;
            if (c14665p2 == null || (jSONArray = c14665p2.f61665g) == null) {
                ActionData actionData = YTPoseDetectJNIInterface.getActionData();
                if (!actionData.isSuccess) {
                    YtFSM.getInstance().sendFSMEvent(new C14653d(c14627j));
                    return;
                }
                ActionLivenessState.this.stateData.put("frames", actionData);
            } else {
                actionLivenessState4.stateData.put("frames", jSONArray.toString());
                YtFSM.getInstance().sendFSMEvent(new C14652c(c14627j, OperateInfoManager.getInstance().conservationVideoErrorData(ActionLivenessState.this.f61458m.f61666h, Integer.valueOf(ErrorCode.YT_SDK_ACTION_VIDEO_CONSERVATION_SUCCESS))));
                ActionLivenessState actionLivenessState5 = ActionLivenessState.this;
                actionLivenessState5.f61423C = actionLivenessState5.f61458m.f61664f;
                YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.NET_FETCH_STATE)).updateDataBy("control_config", ActionLivenessState.this.f61423C);
            }
            ActionLivenessState actionLivenessState6 = ActionLivenessState.this;
            actionLivenessState6.getClass();
            if (YtFSM.getInstance().getWorkMode() == YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTREFLECT_TYPE) {
                actionLivenessState6.stateData.put("act_reflect_data", actionLivenessState6.f61461p);
                actionLivenessState6.f61456k = YtSDKKitCommon.StateNameHelper.StateClassName.REFLECT_STATE;
            } else {
                YTImageData yTImageData = new YTImageData(YTPoseDetectJNIInterface.getBestImage(), i4, i3);
                yTImageData.imgData = yTImageData.bgr2JPEG(100);
                actionLivenessState6.stateData.put("best_frame", yTImageData);
                actionLivenessState6.f61456k = YtSDKKitCommon.StateNameHelper.StateClassName.NET_LIVENESS_REQ_RESULT_STATE;
            }
        }
    }

    public static void releaseModel() {
        YTPoseDetectJNIInterface.nativeLog(TAG, "[YTFacePreviewInterface.finalize] ---");
        sPoseDetectOnFrame = null;
        int i = mInitModel - 1;
        mInitModel = i;
        if (i <= 0) {
            YTPoseDetectJNIInterface.releaseAll();
            mInitModel = 0;
        }
    }

    public static void reset() {
        YTPoseDetectJNIInterface.resetDetect();
    }

    public static void setSafetyLevel(int i) {
        if (i < 0 || i >= 3) {
            return;
        }
        YTPoseDetectJNIInterface.setSafetyLevel(i);
    }

    public static int start(Context context, int i, InterfaceC14671c interfaceC14671c) {
        YTPoseDetectJNIInterface.nativeLog(TAG, "[YTPoseDetectInterface.start] ---");
        if (interfaceC14671c == null) {
            return -1;
        }
        mCheckResult = interfaceC14671c;
        if (mInitModel <= 0) {
            noticeFailed(2, "Not init model.", "Call YTPoseDetectInterface.initModel() before.");
            return 0;
        }
        C14673a c14673a = mPoseDetectProcessManager;
        if (c14673a.f61691a) {
            YTPoseDetectJNIInterface.nativeLog("FaceDetectProcess", "Restart FaceDetect process. YTPoseDetectInterface.stop() should be called before the next start, or maybe camera's parameter may be setting wrong.");
        }
        c14673a.f61692b = i;
        c14673a.f61691a = true;
        noticeSuccess();
        return 0;
    }

    public static void stop() {
        YTPoseDetectJNIInterface.nativeLog(TAG, "[YTPoseDetectInterface.stop] ---");
        C14673a c14673a = mPoseDetectProcessManager;
        if (c14673a != null && c14673a.f61691a) {
            c14673a.f61691a = false;
            YTPoseDetectJNIInterface.resetDetect();
        }
        mIsStarted = false;
    }

    public static C14672a getBestImage(int i) {
        C14672a c14672a = new C14672a();
        YTPoseDetectJNIInterface.getBestImage();
        if (i != 5 && i != 6 && i != 7 && i != 8) {
            int i2 = mPoseDetectProcessManager.f61693c;
            return c14672a;
        }
        int i3 = mPoseDetectProcessManager.f61694d;
        return c14672a;
    }
}
