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
import com.tencent.youtu.sdkkitframework.liveness.C14502a;
import com.tencent.youtu.sdkkitframework.liveness.C14503b;
import com.tencent.youtu.sdkkitframework.liveness.C14504c;
import com.tencent.youtu.sdkkitframework.liveness.C14505d;
import com.tencent.youtu.sdkkitframework.liveness.C14516o;
import com.tencent.youtu.sdkkitframework.liveness.C14517p;
import com.tencent.youtu.ytposedetect.data.ActionData;
import com.tencent.youtu.ytposedetect.data.PoseDetectData;
import com.tencent.youtu.ytposedetect.data.YTActRefData;
import com.tencent.youtu.ytposedetect.data.YTActRefImage;
import com.tencent.youtu.ytposedetect.jni.YTPoseDetectJNIInterface;
import com.tencent.youtu.ytposedetect.manager.C14525a;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public class YTPoseDetectInterface {
    public static final String TAG = "YoutuFaceDetect";
    public static final String VERSION = "3.6.0";
    public static InterfaceC14523c mCheckResult = null;
    public static int mInitModel = 0;
    public static boolean mIsStarted = false;
    public static int mModelRetainCount = 0;
    public static C14525a mPoseDetectProcessManager = null;
    public static int mRotateTag = 1;
    public static InterfaceC14522b sPoseDetectOnFrame;

    /* JADX INFO: renamed from: com.tencent.youtu.ytposedetect.YTPoseDetectInterface$a */
    public interface InterfaceC14521a {
        /* JADX INFO: renamed from: a */
        void m84687a(byte[] bArr, int i, int i2);
    }

    /* JADX INFO: renamed from: com.tencent.youtu.ytposedetect.YTPoseDetectInterface$b */
    public interface InterfaceC14522b {
    }

    /* JADX INFO: renamed from: com.tencent.youtu.ytposedetect.YTPoseDetectInterface$c */
    public interface InterfaceC14523c {
        /* JADX INFO: renamed from: a */
        void mo84656a();

        void onFailed(int i, String str, String str2);
    }

    public static boolean callbackFrame(byte[] bArr, int i, int i2, int i3) {
        InterfaceC14522b interfaceC14522b = sPoseDetectOnFrame;
        if (interfaceC14522b != null) {
            return ((ActionLivenessState.C14479j) interfaceC14522b).m84655a(bArr, i, i2, i3);
        }
        return false;
    }

    public static void callbackFrameList(YTActRefImage[] yTActRefImageArr) {
        int i;
        InterfaceC14522b interfaceC14522b = sPoseDetectOnFrame;
        if (interfaceC14522b != null) {
            YtLogger.m84640o("ActionLivenessState", "action video error,conservation video,frame count:" + yTActRefImageArr.length);
            C14517p c14517p = ActionLivenessState.this.f60611m;
            String[] strArrSplit = c14517p.f60817f.split("&");
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
                c14517p.f60817f = sb.toString();
            }
            c14517p.f60819h = c14517p.f60812a.getSupportCodecJSONStr();
            JSONArray jSONArray = new JSONArray();
            for (int i2 = 0; i2 < yTActRefImageArr.length; i2++) {
                YTActRefImage yTActRefImage = yTActRefImageArr[i2];
                if (yTActRefImage != null && yTActRefImage.encodeImage != null) {
                    YTActRefImage yTActRefImage2 = yTActRefImageArr[i2];
                    jSONArray.put(new YTImageData(yTActRefImage2.f60841w, yTActRefImage2.f60840h, yTActRefImage2.encodeImage).toJSON64Img());
                }
            }
            if (c14517p.f60818g == null) {
                c14517p.f60818g = jSONArray;
                return;
            }
            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                try {
                    c14517p.f60818g.put(jSONArray.get(i3));
                } catch (JSONException e) {
                    YtLogger.m84638e("p", "JSONArray put error", e);
                }
            }
        }
    }

    public static YTActRefData getActReflectData() {
        return YTPoseDetectJNIInterface.getActionReflectData(mPoseDetectProcessManager.f60845b);
    }

    public static void getBestImage(InterfaceC14521a interfaceC14521a, boolean z) {
        int i = z ? mPoseDetectProcessManager.f60845b : 1;
        byte[] bestImage = YTPoseDetectJNIInterface.getBestImage();
        if (i == 5 || i == 6 || i == 7 || i == 8) {
            C14525a c14525a = mPoseDetectProcessManager;
            interfaceC14521a.m84687a(bestImage, c14525a.f60847d, c14525a.f60846c);
        } else {
            C14525a c14525a2 = mPoseDetectProcessManager;
            interfaceC14521a.m84687a(bestImage, c14525a2.f60846c, c14525a2.f60847d);
        }
    }

    public static C14524a getEyeImage(int i) {
        C14524a c14524a = new C14524a();
        YTPoseDetectJNIInterface.getEyeImage(i);
        if (i == 5 || i == 6 || i == 7 || i == 8) {
            int i2 = mPoseDetectProcessManager.f60847d;
            return c14524a;
        }
        int i3 = mPoseDetectProcessManager.f60846c;
        return c14524a;
    }

    public static C14524a getMouthImage(int i) {
        C14524a c14524a = new C14524a();
        YTPoseDetectJNIInterface.getMouthImage(i);
        if (i == 5 || i == 6 || i == 7 || i == 8) {
            int i2 = mPoseDetectProcessManager.f60847d;
            return c14524a;
        }
        int i3 = mPoseDetectProcessManager.f60846c;
        return c14524a;
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
            mPoseDetectProcessManager = new C14525a();
            mInitModel++;
            return 0;
        } catch (Exception e) {
            YTPoseDetectJNIInterface.nativeLog(TAG, "initModel failed. message: " + Log.getStackTraceString(e));
            Log.e(TAG, "initModel failed. message: " + Log.getStackTraceString(e));
            return 10;
        }
    }

    public static boolean isDetecting() {
        C14525a c14525a = mPoseDetectProcessManager;
        return c14525a != null && c14525a.f60844a;
    }

    public static void noticeFailed(int i, String str, String str2) {
        YTPoseDetectJNIInterface.nativeLog(TAG, "[YTPoseDetectInterface.noticeFailed] resultCode: " + i + " \r\nmessage: " + str + " \r\ntips: " + str2);
        mCheckResult.onFailed(i, str, str2);
        mCheckResult = null;
        mIsStarted = false;
    }

    public static void noticeSuccess() {
        YTPoseDetectJNIInterface.nativeLog(TAG, "[YTPoseDetectInterface.noticeSuccess] ---");
        mCheckResult.mo84656a();
        mCheckResult = null;
        mIsStarted = true;
    }

    public static void poseDetect(PoseDetectData poseDetectData, InterfaceC14522b interfaceC14522b, int i) {
        JSONArray jSONArray;
        sPoseDetectOnFrame = interfaceC14522b;
        if (mInitModel <= 0) {
            ((ActionLivenessState.C14479j) interfaceC14522b).m84654a(2, "Not init model on poseDetect.", "Call YTPoseDetectInterface.initModel() before.");
            return;
        }
        if (!mIsStarted) {
            ((ActionLivenessState.C14479j) interfaceC14522b).m84654a(3, "Not call start() interface before.", "Call YTPoseDetectInterface.start() before.");
            return;
        }
        C14525a c14525a = mPoseDetectProcessManager;
        c14525a.getClass();
        c14525a.f60846c = poseDetectData.frameW;
        c14525a.f60847d = poseDetectData.frameH;
        int iPoseDetect = YTPoseDetectJNIInterface.poseDetect(poseDetectData);
        ActionLivenessState.C14479j c14479j = (ActionLivenessState.C14479j) interfaceC14522b;
        ActionLivenessState actionLivenessState = ActionLivenessState.this;
        actionLivenessState.f60619u = "";
        actionLivenessState.f60620v = null;
        if (iPoseDetect == 1) {
            YtLogger.m84637d("ActionLivenessState", "Detect pose with sequence " + ActionLivenessState.this.f60606h.length);
            if (YtFSM.getInstance().getContext().baseFunctionListener != null) {
                YtFSM.getInstance().getContext().baseFunctionListener.detectActionDone(ActionLivenessState.this.f60605g);
            }
            YtFSM.getInstance().sendFSMEvent(new C14502a(c14479j));
            ActionLivenessState actionLivenessState2 = ActionLivenessState.this;
            if (actionLivenessState2.m84653a(actionLivenessState2.f60606h, actionLivenessState2.f60607i + 1)) {
                YtLogger.m84639i("ActionLivenessState", "start check pose: " + ActionLivenessState.this.f60605g);
            } else {
                YtLogger.m84639i("ActionLivenessState", "action seq all done");
                ActionLivenessState.this.f60610l = true;
            }
        } else if (iPoseDetect == -3) {
            actionLivenessState.f60620v = StringCode.FL_INCOMPLETE_FACE;
            actionLivenessState.f60621w = StateEvent.ActionValue.STAGE_NOTPASS;
        } else if (iPoseDetect == -1026) {
            actionLivenessState.f60620v = StringCode.FL_POSE_KEEP;
            actionLivenessState.f60621w = StateEvent.ActionValue.STAGE_PASS;
        } else if (iPoseDetect == -1025) {
            actionLivenessState.f60620v = C14516o.m84678a(actionLivenessState.f60602d);
            ActionLivenessState.this.f60621w = StateEvent.ActionValue.STAGE_NOTPASS;
        } else if (iPoseDetect == -1029) {
            actionLivenessState.f60620v = C14516o.m84686b(actionLivenessState.f60603e);
            ActionLivenessState.this.f60621w = StateEvent.ActionValue.STAGE_NOTPASS;
        } else if (iPoseDetect == -1030) {
            actionLivenessState.f60620v = StringCode.FL_POSE_INCORRECT;
            actionLivenessState.f60621w = StateEvent.ActionValue.STAGE_NOTPASS;
        } else if (iPoseDetect == -1031) {
            actionLivenessState.f60620v = StringCode.FL_POSE_OPEN_EYE;
            actionLivenessState.f60621w = StateEvent.ActionValue.STAGE_NOTPASS;
        } else if (iPoseDetect == -1032) {
            actionLivenessState.f60620v = StringCode.FL_CLOSE_MOUTH;
            actionLivenessState.f60621w = StateEvent.ActionValue.STAGE_NOTPASS;
        } else if (iPoseDetect == -1033) {
            actionLivenessState.f60620v = StringCode.FL_ACT_SCREEN_SHAKING;
            actionLivenessState.f60621w = StateEvent.ActionValue.STAGE_NOTPASS;
        } else if (iPoseDetect == 0) {
            actionLivenessState.f60621w = StateEvent.ActionValue.STAGE_PASS;
        } else if (iPoseDetect == -5) {
            YtLogger.m84642w("ActionLivenessState", "Act failed " + iPoseDetect, null);
            ActionLivenessState.this.f60619u = StringCode.FL_ACT_SCREEN_SHAKING;
        } else if (iPoseDetect != -1 && iPoseDetect != 0) {
            YtLogger.m84642w("ActionLivenessState", "Act failed " + iPoseDetect, null);
        }
        YtSDKStats.getInstance().reportInfo("pose state " + iPoseDetect);
        if (YTPoseDetectJNIInterface.canReflect()) {
            CommonUtils.benchMarkBegin("make_pack_use_time_best_img");
            ActionLivenessState.this.f60614p = getActReflectData();
            YTActRefImage yTActRefImage = ActionLivenessState.this.f60614p.best;
            if (yTActRefImage == null || yTActRefImage.image.length == 0) {
                YtSDKStats.getInstance().reportError(4194304, "pose detect error");
                YtFSM.getInstance().sendFSMEvent(new C14503b(c14479j));
                reset();
            } else {
                OperateInfoManager.getInstance().setPackUseTime(CommonUtils.benchMarkEnd("make_pack_use_time_best_img"));
            }
        }
        if (YTPoseDetectJNIInterface.isRecordingDone()) {
            C14525a c14525a2 = mPoseDetectProcessManager;
            int i2 = c14525a2.f60845b;
            int i3 = (i == 1 && (i2 == 5 || i2 == 6 || i2 == 7 || i2 == 8)) ? c14525a2.f60847d : c14525a2.f60846c;
            int i4 = (i == 1 && (i2 == 5 || i2 == 6 || i2 == 7 || i2 == 8)) ? c14525a2.f60846c : c14525a2.f60847d;
            YTPoseDetectJNIInterface.getOneActionFrame(i4, i3);
            ActionLivenessState actionLivenessState3 = ActionLivenessState.this;
            if (!actionLivenessState3.f60610l) {
                reset();
                return;
            }
            try {
                C14517p c14517p = actionLivenessState3.f60611m;
                if (c14517p != null) {
                    c14517p.f60812a.stopEncoding();
                }
            } catch (Exception e) {
                YtLogger.m84637d("ActionLivenessState", "encode stop error! " + Log.getStackTraceString(e));
            }
            ActionLivenessState actionLivenessState4 = ActionLivenessState.this;
            C14517p c14517p2 = actionLivenessState4.f60611m;
            if (c14517p2 == null || (jSONArray = c14517p2.f60818g) == null) {
                ActionData actionData = YTPoseDetectJNIInterface.getActionData();
                if (!actionData.isSuccess) {
                    YtFSM.getInstance().sendFSMEvent(new C14505d(c14479j));
                    return;
                }
                ActionLivenessState.this.stateData.put("frames", actionData);
            } else {
                actionLivenessState4.stateData.put("frames", jSONArray.toString());
                YtFSM.getInstance().sendFSMEvent(new C14504c(c14479j, OperateInfoManager.getInstance().conservationVideoErrorData(ActionLivenessState.this.f60611m.f60819h, Integer.valueOf(ErrorCode.YT_SDK_ACTION_VIDEO_CONSERVATION_SUCCESS))));
                ActionLivenessState actionLivenessState5 = ActionLivenessState.this;
                actionLivenessState5.f60576C = actionLivenessState5.f60611m.f60817f;
                YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.NET_FETCH_STATE)).updateDataBy("control_config", ActionLivenessState.this.f60576C);
            }
            ActionLivenessState actionLivenessState6 = ActionLivenessState.this;
            actionLivenessState6.getClass();
            if (YtFSM.getInstance().getWorkMode() == YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTREFLECT_TYPE) {
                actionLivenessState6.stateData.put("act_reflect_data", actionLivenessState6.f60614p);
                actionLivenessState6.f60609k = YtSDKKitCommon.StateNameHelper.StateClassName.REFLECT_STATE;
            } else {
                YTImageData yTImageData = new YTImageData(YTPoseDetectJNIInterface.getBestImage(), i4, i3);
                yTImageData.imgData = yTImageData.bgr2JPEG(100);
                actionLivenessState6.stateData.put("best_frame", yTImageData);
                actionLivenessState6.f60609k = YtSDKKitCommon.StateNameHelper.StateClassName.NET_LIVENESS_REQ_RESULT_STATE;
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

    public static int start(Context context, int i, InterfaceC14523c interfaceC14523c) {
        YTPoseDetectJNIInterface.nativeLog(TAG, "[YTPoseDetectInterface.start] ---");
        if (interfaceC14523c == null) {
            return -1;
        }
        mCheckResult = interfaceC14523c;
        if (mInitModel <= 0) {
            noticeFailed(2, "Not init model.", "Call YTPoseDetectInterface.initModel() before.");
            return 0;
        }
        C14525a c14525a = mPoseDetectProcessManager;
        if (c14525a.f60844a) {
            YTPoseDetectJNIInterface.nativeLog("FaceDetectProcess", "Restart FaceDetect process. YTPoseDetectInterface.stop() should be called before the next start, or maybe camera's parameter may be setting wrong.");
        }
        c14525a.f60845b = i;
        c14525a.f60844a = true;
        noticeSuccess();
        return 0;
    }

    public static void stop() {
        YTPoseDetectJNIInterface.nativeLog(TAG, "[YTPoseDetectInterface.stop] ---");
        C14525a c14525a = mPoseDetectProcessManager;
        if (c14525a != null && c14525a.f60844a) {
            c14525a.f60844a = false;
            YTPoseDetectJNIInterface.resetDetect();
        }
        mIsStarted = false;
    }

    public static C14524a getBestImage(int i) {
        C14524a c14524a = new C14524a();
        YTPoseDetectJNIInterface.getBestImage();
        if (i != 5 && i != 6 && i != 7 && i != 8) {
            int i2 = mPoseDetectProcessManager.f60846c;
            return c14524a;
        }
        int i3 = mPoseDetectProcessManager.f60847d;
        return c14524a;
    }
}
