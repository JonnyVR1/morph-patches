package com.tencent.youtu.sdkkitframework.liveness;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.tencent.youtu.liveness.YTFaceTracker;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import com.tencent.youtu.sdkkitframework.common.StringCode;
import com.tencent.youtu.sdkkitframework.common.YTImageData;
import com.tencent.youtu.sdkkitframework.common.YtLogger;
import com.tencent.youtu.sdkkitframework.common.YtSdkConfig;
import com.tencent.youtu.sdkkitframework.framework.YtFSM;
import com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class FaceQualityState extends YtFSMBaseState {

    /* JADX INFO: renamed from: q */
    public static int f61488q = 10;

    /* JADX INFO: renamed from: a */
    public YtSDKKitCommon.StateNameHelper.StateClassName f61489a;

    /* JADX INFO: renamed from: k */
    public boolean f61499k;

    /* JADX INFO: renamed from: l */
    public boolean f61500l;

    /* JADX INFO: renamed from: m */
    public int f61501m;

    /* JADX INFO: renamed from: b */
    public float f61490b = 25.0f;

    /* JADX INFO: renamed from: c */
    public float f61491c = 25.0f;

    /* JADX INFO: renamed from: d */
    public float f61492d = 25.0f;

    /* JADX INFO: renamed from: e */
    public float f61493e = 0.6f;

    /* JADX INFO: renamed from: f */
    public float f61494f = 0.1f;

    /* JADX INFO: renamed from: g */
    public float f61495g = 0.95f;

    /* JADX INFO: renamed from: h */
    public float f61496h = 0.25f;

    /* JADX INFO: renamed from: i */
    public float f61497i = 0.25f;

    /* JADX INFO: renamed from: j */
    public float f61498j = 0.25f;

    /* JADX INFO: renamed from: n */
    public int f61502n = 99;

    /* JADX INFO: renamed from: o */
    public int f61503o = 90;

    /* JADX INFO: renamed from: p */
    public boolean f61504p = false;

    /* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.FaceQualityState$a */
    public class C14631a extends HashMap<String, Object> {
        public C14631a(FaceQualityState faceQualityState) {
            put(StateEvent.Name.FSM_STATE_PAUSE, YtSDKKitCommon.StateNameHelper.StateClassName.QUALITY_STATE);
            put(StateEvent.Name.UI_TIPS, StringCode.MSG_FSM_PAUSE);
        }
    }

    /* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.FaceQualityState$b */
    public static class C14632b {

        /* JADX INFO: renamed from: a */
        public byte[] f61505a;

        public C14632b(byte[] bArr, int i, int i2) {
            this.f61505a = bArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m85829a(YTFaceTracker.TrackedFace trackedFace) {
        float[] fArr = trackedFace.faceShape;
        float f = fArr[32] - fArr[40];
        float f2 = fArr[33] - fArr[41];
        float fSqrt = (float) Math.sqrt((f * f) + (f2 * f2));
        float f3 = fArr[36] - fArr[44];
        float f4 = fArr[37] - fArr[45];
        float fSqrt2 = ((float) Math.sqrt((f3 * f3) + (f4 * f4))) / fSqrt;
        float f5 = fArr[56] - fArr[48];
        float f6 = fArr[57] - fArr[49];
        float fSqrt3 = (float) Math.sqrt((f5 * f5) + (f6 * f6));
        float f7 = fArr[52] - fArr[60];
        float f8 = fArr[53] - fArr[61];
        float fSqrt4 = ((float) Math.sqrt((f7 * f7) + (f8 * f8))) / fSqrt3;
        boolean z = fSqrt2 > this.f61496h && fSqrt4 > this.f61497i;
        if (!z) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("quality_type", "eye_close");
                jSONObject.put("quality_score", fSqrt2 + Constants.SEPARATOR_COMMA + fSqrt4);
                jSONObject.put("quality_thr", this.f61496h + Constants.SEPARATOR_COMMA + this.f61497i);
            } catch (JSONException e) {
                YtLogger.m85809e("FaceQualityState", "make log json error", e);
            }
            YtLogger.m85811o("FaceQualityState", jSONObject.toString());
        }
        return z;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m85831b(YTFaceTracker.TrackedFace trackedFace) {
        float[] fArr = trackedFace.faceShape;
        float fAbs = Math.abs(((fArr[129] + fArr[109]) / 2.0f) - ((fArr[119] + fArr[97]) / 2.0f)) / Math.abs(fArr[90] - fArr[102]);
        boolean z = fAbs < this.f61498j;
        if (!z) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("quality_type", "mouth_cLose");
                jSONObject.put("quality_score", fAbs);
                jSONObject.put("quality_thr", this.f61498j);
            } catch (JSONException e) {
                YtLogger.m85809e("FaceQualityState", "make log json error", e);
            }
            YtLogger.m85811o("FaceQualityState", jSONObject.toString());
        }
        return z;
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void enter() {
        super.enter();
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void enterFirst() {
        YtLogger.m85811o("FaceQualityState", makeStateInfo("FaceQualityState", 1));
        YtFSMBaseState stateByName = YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.NET_FETCH_STATE));
        if (stateByName == null) {
            return;
        }
        String str = (String) stateByName.getStateDataBy("control_config");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        for (String str2 : str.split("&")) {
            String[] strArrSplit = str2.split("=");
            if (strArrSplit.length > 1 && strArrSplit[0].equals("quality_close_mouth_threshold")) {
                this.f61498j = Float.parseFloat(strArrSplit[1]);
            }
            if (strArrSplit.length > 1 && strArrSplit[0].equals("compress_pose_image_score")) {
                int i = Integer.parseInt(strArrSplit[1]);
                this.f61502n = i;
                if (i < 80) {
                    this.f61502n = 80;
                } else if (i > 100) {
                    this.f61502n = 99;
                }
            }
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void exit() {
        super.exit();
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void loadStateWith(String str, JSONObject jSONObject, YtSdkConfig ytSdkConfig) {
        super.loadStateWith(str, jSONObject, ytSdkConfig);
        this.f61489a = YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE;
        this.f61501m = 0;
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void moveToNextState() {
        super.moveToNextState();
        if (this.f61489a != YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE) {
            YtFSM.getInstance().transitNow(YtSDKKitCommon.StateNameHelper.classNameOfState(this.f61489a));
        } else if (YtFSM.getInstance().transitNextRound(YtSDKKitCommon.StateNameHelper.classNameOfState(this.f61489a)) == -1) {
            sendFSMTransitError(YtSDKKitCommon.StateNameHelper.classNameOfState(this.f61489a));
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void reset() {
        super.reset();
        this.f61501m = 0;
        this.f61489a = YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0293  */
    /* JADX WARN: Code duplicated, block: B:83:0x01cf  */
    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void update(YTImageData yTImageData, long j) {
        char c;
        float f;
        super.update(yTImageData, j);
        if (this.f61504p && this.isPause.get()) {
            YtFSM.getInstance().sendFSMEvent(new C14631a(this));
            try {
                Thread.sleep(30L);
                return;
            } catch (InterruptedException e) {
                YtLogger.m85809e("FaceQualityState", "Thread sleep error", e);
                return;
            }
        }
        YtSDKKitCommon.StateNameHelper.StateClassName stateClassName = this.f61489a;
        YtSDKKitCommon.StateNameHelper.StateClassName stateClassName2 = YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE;
        if (stateClassName != stateClassName2) {
            moveToNextState();
            return;
        }
        if (this.f61499k && this.f61500l) {
            YtFSMBaseState stateByName = YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(stateClassName2));
            int iIntValue = ((Integer) stateByName.getStateDataBy("pose_state")).intValue();
            int iIntValue2 = ((Integer) stateByName.getStateDataBy("shelter_state")).intValue();
            if (iIntValue != 0 && iIntValue != 9) {
                this.f61501m = 0;
                moveToNextState();
                return;
            }
            YTFaceTracker.TrackedFace[] trackedFaceArr = (YTFaceTracker.TrackedFace[]) stateByName.getStateDataBy("face_status");
            if (trackedFaceArr == null || trackedFaceArr.length <= 0) {
                this.f61501m = 0;
                moveToNextState();
                return;
            }
            YTFaceTracker.TrackedFace trackedFace = trackedFaceArr[0];
            if (iIntValue2 != 0) {
                this.f61501m = 0;
                m85828a(StateEvent.ActionValue.STAGE_NOTPASS, C14664o.m85857b(iIntValue2));
                moveToNextState();
                return;
            }
            if (!C14664o.m85854a(trackedFace, this.f61490b, this.f61491c, this.f61492d)) {
                YtLogger.m85811o("FaceQualityState", "correctionFace  angle not pass, threshold y:" + this.f61490b + "|p=" + this.f61491c + "|r=" + this.f61492d);
                this.f61501m = 0;
                m85828a(StateEvent.ActionValue.STAGE_NOTPASS, StringCode.FL_POSE_INCORRECT);
                moveToNextState();
                return;
            }
            int iMax = Math.max(yTImageData.height, yTImageData.width);
            int iHeight = trackedFace.faceRect.height();
            float f2 = iMax;
            float f3 = this.f61494f * f2;
            float f4 = f2 * this.f61495g;
            float f5 = iHeight;
            if (f5 < f3) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("quality_type", "face_too_near");
                    jSONObject.put("quality_score", iHeight);
                    jSONObject.put("quality_thr", f3);
                } catch (JSONException e2) {
                    YtLogger.m85809e("FaceQualityState", "make log json error", e2);
                }
                YtLogger.m85811o("FaceQualityState", jSONObject.toString());
                c = 1;
            } else if (f5 > f4) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("quality_type", "face_too_far");
                    jSONObject2.put("quality_score", iHeight);
                    jSONObject2.put("quality_thr", f4);
                } catch (JSONException e3) {
                    YtLogger.m85809e("FaceQualityState", "make log json error", e3);
                }
                YtLogger.m85811o("FaceQualityState", jSONObject2.toString());
                c = 2;
            } else {
                c = 0;
            }
            if (c == 1) {
                this.f61501m = 0;
                m85828a(StateEvent.ActionValue.STAGE_NOTPASS, StringCode.FL_POSE_CLOSER);
                moveToNextState();
                return;
            }
            if (c == 2) {
                this.f61501m = 0;
                m85828a(StateEvent.ActionValue.STAGE_NOTPASS, StringCode.FL_POSE_FARER);
                moveToNextState();
                return;
            }
            if (!m85831b(trackedFace)) {
                this.f61501m = 0;
                m85828a(StateEvent.ActionValue.STAGE_NOTPASS, StringCode.FL_CLOSE_MOUTH);
                moveToNextState();
                return;
            }
            if (!m85829a(trackedFace)) {
                this.f61501m = 0;
                m85828a(StateEvent.ActionValue.STAGE_NOTPASS, StringCode.FL_POSE_OPEN_EYE);
                moveToNextState();
                return;
            }
            boolean zM85830a = m85830a(trackedFace, yTImageData.width, yTImageData.height);
            if (this.f61500l && !zM85830a) {
                this.f61501m = 0;
                m85828a(StateEvent.ActionValue.STAGE_NOTPASS, StringCode.FL_POSE_CLOSER);
                moveToNextState();
                return;
            }
            int i = this.f61501m + 1;
            this.f61501m = i;
            if (i < f61488q) {
                m85828a(StateEvent.ActionValue.STAGE_PASS, StringCode.FL_POSE_KEEP);
                moveToNextState();
                return;
            }
            int iHeight2 = trackedFace.faceRect.height();
            int iWidth = trackedFace.faceRect.width();
            float f6 = yTImageData.height * this.f61493e;
            byte[] bArrBgr2JPEG = yTImageData.bgr2JPEG(this.f61503o);
            float f7 = iHeight2;
            if (f7 < f6) {
                float f8 = yTImageData.width;
                float f9 = yTImageData.height;
                float f10 = f8 / f9;
                float f11 = f7 / f9;
                float f12 = this.f61493e;
                if (f11 < f12) {
                    float f13 = this.f61494f;
                    if (f13 < f12) {
                        f = (float) (((double) ((f11 - f13) / (f12 - f13))) * 0.1d);
                    } else {
                        f = 0.01f;
                    }
                } else {
                    f = 0.01f;
                }
                float f14 = f7 / (f + 0.61f);
                float f15 = f10 * f14;
                float f16 = iWidth;
                if (f16 > f15) {
                    f15 = f16;
                }
                float fWidth = trackedFace.faceRect.width() / 2.0f;
                Rect rect = trackedFace.faceRect;
                float f17 = fWidth + rect.left;
                float fHeight = ((rect.height() / 2.0f) + trackedFace.faceRect.top) - (f14 / 2.0f);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrBgr2JPEG, 0, bArrBgr2JPEG.length);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeByteArray, (int) (f17 - (f15 / 2.0f)), (int) fHeight, (int) f15, (int) f14);
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, yTImageData.width, yTImageData.height, false);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmapCreateScaledBitmap.compress(Bitmap.CompressFormat.JPEG, this.f61503o, byteArrayOutputStream);
                bArrBgr2JPEG = byteArrayOutputStream.toByteArray();
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e4) {
                    YtLogger.m85809e("FaceQualityState", "LocalFaceBestImage close IO error", e4);
                }
                bitmapDecodeByteArray.recycle();
                bitmapCreateBitmap.recycle();
                bitmapCreateScaledBitmap.recycle();
            }
            HashMap<String, Object> map = new HashMap<>();
            map.put(StateEvent.Name.BEST_FACE_IMAGE, new C14632b(bArrBgr2JPEG, yTImageData.width, yTImageData.height));
            map.put(StateEvent.Name.UI_ACTION, StateEvent.ActionValue.STAGE_PASS);
            YtFSM.getInstance().sendFSMEvent(map);
        }
        int iOrdinal = YtFSM.getInstance().getWorkMode().ordinal();
        if (iOrdinal == 2 || iOrdinal == 3) {
            this.f61489a = YtSDKKitCommon.StateNameHelper.StateClassName.ACTION_STATE;
        } else if (iOrdinal == 4) {
            this.f61489a = YtSDKKitCommon.StateNameHelper.StateClassName.REFLECT_STATE;
        } else if (iOrdinal == 5) {
            this.f61489a = YtSDKKitCommon.StateNameHelper.StateClassName.ACTION_STATE;
        }
        this.f61501m = 0;
        moveToNextState();
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void updateSDKSetting(JSONObject jSONObject) {
        super.updateSDKSetting(jSONObject);
        try {
            if (jSONObject.has("quality_close_eye_left_threshold")) {
                this.f61496h = (float) jSONObject.getDouble("quality_close_eye_left_threshold");
            }
            if (jSONObject.has("quality_close_eye_right_threshold")) {
                this.f61497i = (float) jSONObject.getDouble("quality_close_eye_right_threshold");
            }
            if (jSONObject.has("quality_close_mouth_threshold")) {
                this.f61498j = (float) jSONObject.getDouble("quality_close_mouth_threshold");
            }
            if (jSONObject.has("quality_face_min_height_threshold")) {
                this.f61493e = (float) jSONObject.getDouble("quality_face_min_height_threshold");
            }
            if (jSONObject.has("quality_face_max_height_threshold")) {
                this.f61495g = (float) jSONObject.getDouble("quality_face_max_height_threshold");
            }
            if (jSONObject.has("secondary_yaw_threshold")) {
                this.f61490b = (float) jSONObject.getDouble("secondary_yaw_threshold");
            }
            if (jSONObject.has("secondary_pitch_threshold")) {
                this.f61491c = (float) jSONObject.getDouble("secondary_pitch_threshold");
            }
            if (jSONObject.has("secondary_roll_threshold")) {
                this.f61492d = (float) jSONObject.getDouble("secondary_roll_threshold");
            }
            if (jSONObject.has("need_face_quality")) {
                this.f61499k = jSONObject.getBoolean("need_face_quality");
            }
            if (jSONObject.has("need_local_face_best_image")) {
                this.f61500l = jSONObject.getBoolean("need_local_face_best_image");
            }
            if (jSONObject.has("local_face_best_image_quality")) {
                this.f61503o = jSONObject.getInt("local_face_best_image_quality");
            }
            if (jSONObject.has("continuous_quality_num_threshold")) {
                f61488q = jSONObject.getInt("continuous_quality_num_threshold");
            }
            if (jSONObject.has("quality_face_real_min_height_threshold")) {
                this.f61494f = (float) jSONObject.getDouble("quality_face_real_min_height_threshold");
            }
            if (jSONObject.has("need_close_timeout")) {
                this.f61504p = jSONObject.getBoolean("need_close_timeout");
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0034  */
    /* JADX INFO: renamed from: a */
    public final boolean m85830a(YTFaceTracker.TrackedFace trackedFace, float f, float f2) {
        float f3;
        int iHeight = trackedFace.faceRect.height();
        int iWidth = trackedFace.faceRect.width();
        float f4 = this.f61493e;
        float f5 = iHeight;
        boolean z = true;
        if (f5 < f2 * f4) {
            float f6 = f / f2;
            float f7 = f5 / f2;
            if (f7 < f4) {
                float f8 = this.f61494f;
                if (f8 < f4) {
                    f3 = (float) (((double) ((f7 - f8) / (f4 - f8))) * 0.1d);
                } else {
                    f3 = 0.01f;
                }
            } else {
                f3 = 0.01f;
            }
            float f9 = f5 / (f3 + 0.61f);
            float f10 = f6 * f9;
            float f11 = iWidth;
            if (f11 > f10) {
                f10 = f11;
            }
            float fWidth = trackedFace.faceRect.width() / 2.0f;
            Rect rect = trackedFace.faceRect;
            float f12 = fWidth + rect.left;
            float fHeight = ((rect.height() / 2.0f) + trackedFace.faceRect.top) - (f9 / 2.0f);
            float f13 = f12 - (f10 / 2.0f);
            z = f10 + f13 < f && f9 + fHeight < f2 && f13 > 0.0f && fHeight > 0.0f;
            if (!z) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("quality_type", "face_not_center");
                    jSONObject.put("quality_score", "x:" + f13 + ",y:" + fHeight + "height:" + f9 + ",width:" + f10);
                } catch (JSONException e) {
                    YtLogger.m85809e("FaceQualityState", "make log json error", e);
                }
                YtLogger.m85811o("FaceQualityState", jSONObject.toString());
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: a */
    public final void m85828a(String str, String str2) {
        HashMap<String, Object> map = new HashMap<>();
        map.put(StateEvent.Name.UI_ACTION, str);
        map.put(StateEvent.Name.UI_TIPS, str2);
        YtFSM.getInstance().sendFSMEvent(map);
    }
}
