package com.tencent.youtu.sdkkitframework.liveness;

import android.graphics.Bitmap;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.util.Base64;
import com.tencent.connect.common.Constants;
import com.tencent.youtu.liveness.YTFaceTracker;
import com.tencent.youtu.sdkkitframework.common.CommonUtils;
import com.tencent.youtu.sdkkitframework.common.ErrorCode;
import com.tencent.youtu.sdkkitframework.common.OperateInfoManager;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import com.tencent.youtu.sdkkitframework.common.StringCode;
import com.tencent.youtu.sdkkitframework.common.TimeoutCounter;
import com.tencent.youtu.sdkkitframework.common.YTImageData;
import com.tencent.youtu.sdkkitframework.common.YtLogger;
import com.tencent.youtu.sdkkitframework.common.YtSDKStats;
import com.tencent.youtu.sdkkitframework.common.YtSdkConfig;
import com.tencent.youtu.sdkkitframework.framework.YtFSM;
import com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;
import com.tencent.youtu.ytagreflectlivecheck.C14667a;
import com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface;
import com.tencent.youtu.ytagreflectlivecheck.YTAGReflectSettings;
import com.tencent.youtu.ytagreflectlivecheck.data.YTActReflectData;
import com.tencent.youtu.ytagreflectlivecheck.data.YTActReflectImage;
import com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface;
import com.tencent.youtu.ytagreflectlivecheck.jni.cppDefine.RawImgData;
import com.tencent.youtu.ytagreflectlivecheck.jni.model.ActionReflectReq;
import com.tencent.youtu.ytagreflectlivecheck.jni.model.ColorImgData;
import com.tencent.youtu.ytagreflectlivecheck.jni.model.ReflectColorData;
import com.tencent.youtu.ytagreflectlivecheck.jni.model.ReflectLiveReq;
import com.tencent.youtu.ytagreflectlivecheck.jni.model.YTImageInfo;
import com.tencent.youtu.ytagreflectlivecheck.notice.InterfaceC14668a;
import com.tencent.youtu.ytagreflectlivecheck.requester.LiveStyleRequester;
import com.tencent.youtu.ytposedetect.data.YTActRefData;
import com.tencent.youtu.ytposedetect.data.YTActRefImage;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ReflectLivenessState extends YtFSMBaseState {

    /* JADX INFO: renamed from: A */
    public int f61533A;

    /* JADX INFO: renamed from: b */
    public String f61539b;

    /* JADX INFO: renamed from: c */
    public String f61540c;

    /* JADX INFO: renamed from: d */
    public YTActRefData f61541d;

    /* JADX INFO: renamed from: e */
    public LiveStyleRequester.SeleceData f61542e;

    /* JADX INFO: renamed from: i */
    public YTFaceTracker.TrackedFace[] f61546i;

    /* JADX INFO: renamed from: o */
    public String f61552o;

    /* JADX INFO: renamed from: p */
    public YTFaceTracker.Param f61553p;

    /* JADX INFO: renamed from: a */
    public String f61538a = "3.6.2";

    /* JADX INFO: renamed from: f */
    public int f61543f = -1;

    /* JADX INFO: renamed from: g */
    public EnumC14648l f61544g = EnumC14648l.RPT_INIT;

    /* JADX INFO: renamed from: h */
    public int f61545h = 0;

    /* JADX INFO: renamed from: j */
    public YtSDKKitCommon.StateNameHelper.StateClassName f61547j = YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE;

    /* JADX INFO: renamed from: k */
    public boolean f61548k = true;

    /* JADX INFO: renamed from: l */
    public int f61549l = 2;

    /* JADX INFO: renamed from: m */
    public boolean f61550m = false;

    /* JADX INFO: renamed from: n */
    public int f61551n = 5;

    /* JADX INFO: renamed from: q */
    public boolean f61554q = false;

    /* JADX INFO: renamed from: r */
    public String f61555r = "";

    /* JADX INFO: renamed from: s */
    public int f61556s = 2;

    /* JADX INFO: renamed from: t */
    public boolean f61557t = false;

    /* JADX INFO: renamed from: u */
    public boolean f61558u = false;

    /* JADX INFO: renamed from: v */
    public YTFaceTracker f61559v = null;

    /* JADX INFO: renamed from: w */
    public String f61560w = "";

    /* JADX INFO: renamed from: x */
    public int f61561x = 0;

    /* JADX INFO: renamed from: y */
    public TimeoutCounter f61562y = new TimeoutCounter("reflect tips timeout counter");

    /* JADX INFO: renamed from: z */
    public boolean f61563z = false;

    /* JADX INFO: renamed from: B */
    public boolean f61534B = false;

    /* JADX INFO: renamed from: C */
    public float f61535C = 50.0f;

    /* JADX INFO: renamed from: D */
    public float f61536D = 50.0f;

    /* JADX INFO: renamed from: E */
    public float f61537E = 50.0f;

    /* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState$a */
    public class C14637a extends HashMap<String, Object> {
        public C14637a(ReflectLivenessState reflectLivenessState) {
            put(StateEvent.Name.PROCESS_RESULT, "failed");
            put(StateEvent.Name.ERROR_CODE, Integer.valueOf(ErrorCode.YT_SDK_REFLECTION_ANGLE_DETECT_FAIL));
            put("message", CommonUtils.makeMessageJson(ErrorCode.YT_SDK_REFLECTION_ANGLE_DETECT_FAIL, StringCode.YT_FACE_REF_ANGLE_DETECT_ERROR, "reflection angle detect fail"));
        }
    }

    /* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState$b */
    public class C14638b extends HashMap<String, Object> {
        public C14638b(ReflectLivenessState reflectLivenessState) {
            put(StateEvent.Name.UI_TIPS, StringCode.FL_POSE_KEEP);
        }
    }

    /* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState$c */
    public class C14639c extends HashMap<String, Object> {
        public C14639c() {
            put(StateEvent.Name.WARNING_TIPS, "反光库版本异常！目标版本：" + ReflectLivenessState.this.f61538a + " 当前版本：3.6.9.2");
        }
    }

    /* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState$d */
    public class C14640d extends HashMap<String, Object> {
        public C14640d() {
            put(StateEvent.Name.WARNING_TIPS, "反光库版本异常！目标版本：" + ReflectLivenessState.this.f61538a + " 当前版本：3.6.9.2");
        }
    }

    /* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState$e */
    public class C14641e extends HashMap<String, Object> {
        public C14641e() {
            put(StateEvent.Name.WARNING_TIPS, "反光库版本过低！目标版本：" + ReflectLivenessState.this.f61538a + " 当前版本：3.6.9.2");
        }
    }

    /* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState$f */
    public class C14642f extends HashMap<String, Object> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f61567a;

        public C14642f(ReflectLivenessState reflectLivenessState, int i) {
            this.f61567a = i;
            put(StateEvent.Name.PROCESS_RESULT, "failed");
            put(StateEvent.Name.ERROR_CODE, Integer.valueOf(ErrorCode.YT_SDK_REFLECT_INIT_FAILED));
            put("message", CommonUtils.makeMessageJson(ErrorCode.YT_SDK_REFLECT_INIT_FAILED, StringCode.MSG_PARAM_ERROR, "Init YTReflect SDK failed with " + i));
        }
    }

    /* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState$g */
    public class C14643g implements InterfaceC14668a {
        public C14643g() {
        }
    }

    /* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState$h */
    public class C14644h implements YTAGReflectLiveCheckInterface.IYTReflectListener {
        public C14644h() {
        }

        @Override // com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.IYTReflectListener
        public float onGetAppBrightness() {
            try {
                return YtFSM.getInstance().getContext().reflectListener.onGetAppBrightness();
            } catch (Exception e) {
                YtLogger.m85809e("ReflectLivenessState", "onGetAppBrightness error", e);
                return -1.0f;
            }
        }

        @Override // com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.IYTReflectListener
        public void onReflectEvent(ColorMatrixColorFilter colorMatrixColorFilter, float f) {
            try {
                if (!ReflectLivenessState.this.stateData.containsKey("refcontrol_begin")) {
                    ReflectLivenessState.this.stateData.put("refcontrol_begin", String.valueOf(System.currentTimeMillis() * 1000));
                }
                YtFSM.getInstance().getContext().reflectListener.onReflectEvent(colorMatrixColorFilter, f);
            } catch (Exception e) {
                YtLogger.m85809e("ReflectLivenessState", "onReflectEvent error", e);
            }
        }

        @Override // com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.IYTReflectListener
        public void onReflectStart(long j) {
            try {
                YtFSM.getInstance().getContext().reflectListener.onReflectStart(j);
            } catch (Exception e) {
                YtLogger.m85809e("ReflectLivenessState", "onReflectStart error", e);
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState$i */
    public class C14645i implements YTAGReflectLiveCheckJNIInterface.IYtLoggerListener {
        public C14645i(ReflectLivenessState reflectLivenessState) {
        }

        @Override // com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface.IYtLoggerListener
        public void log(String str, String str2) {
            YtLogger.m85808d(str, str2);
        }
    }

    /* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState$j */
    public class C14646j extends HashMap<String, Object> {
        public C14646j(ReflectLivenessState reflectLivenessState) {
            put(StateEvent.Name.PROCESS_RESULT, "failed");
            put(StateEvent.Name.ERROR_CODE, Integer.valueOf(ErrorCode.YT_SDK_FACETRACE_INIT_FAILED));
            put("message", CommonUtils.makeMessageJson(ErrorCode.YT_SDK_FACETRACE_INIT_FAILED, StringCode.MSG_PARAM_ERROR, "Init YTFaceTrack SDK failed with "));
        }
    }

    /* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState$k */
    public class C14647k extends HashMap<String, Object> {
        public C14647k(ReflectLivenessState reflectLivenessState) {
            put(StateEvent.Name.UI_TIPS, StringCode.FL_POSE_KEEP);
        }
    }

    /* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState$l */
    public enum EnumC14648l {
        RPT_TIPWAIT,
        RPT_INIT,
        RPT_REFLECT,
        RPT_FINISH
    }

    /* JADX INFO: renamed from: a */
    public final void m85843a(C14667a c14667a) {
        String str;
        if (YtFSM.getInstance().getWorkMode() == YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTREFLECT_TYPE) {
            try {
                YTActRefImage yTActRefImage = this.f61541d.best;
                YTActReflectImage yTActReflectImage = new YTActReflectImage(yTActRefImage.image, yTActRefImage.xys, yTActRefImage.checksum);
                YTActRefImage yTActRefImage2 = this.f61541d.eye;
                YTActReflectImage yTActReflectImage2 = new YTActReflectImage(yTActRefImage2.image, yTActRefImage2.xys, yTActRefImage2.checksum);
                YTActRefImage yTActRefImage3 = this.f61541d.mouth;
                ActionReflectReq actionReflectReqM85840a = m85840a(c14667a, new YTActReflectData(yTActReflectImage, yTActReflectImage2, new YTActReflectImage(yTActRefImage3.image, yTActRefImage3.xys, yTActRefImage3.checksum), this.f61542e), this.f61539b);
                actionReflectReqM85840a.app_id = this.f61540c;
                Bitmap bitmapM85837a = YtFSM.getInstance().getContext().imageToCompare;
                if (bitmapM85837a != null) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    int width = bitmapM85837a.getWidth();
                    int height = bitmapM85837a.getHeight();
                    int i = width > height ? width : height;
                    if (i > 640) {
                        bitmapM85837a = m85837a(bitmapM85837a, (width * 640) / i, (height * 640) / i);
                        YtLogger.m85808d("ReflectLivenessState", "resize image. from w:" + width + " h:" + height + " to w:" + bitmapM85837a.getWidth() + " h:" + bitmapM85837a.getHeight());
                    }
                    bitmapM85837a.compress(Bitmap.CompressFormat.JPEG, 95, byteArrayOutputStream);
                    actionReflectReqM85840a.compare_image = new YTImageInfo(new YTActReflectImage(byteArrayOutputStream.toByteArray(), null, null));
                }
                actionReflectReqM85840a.color_data = this.f61539b;
                this.stateData.put("reflect_request_object", actionReflectReqM85840a);
            } catch (Exception e) {
                YtLogger.m85809e("ReflectLivenessState", "Handle actref data failed:", e);
            }
        } else {
            String str2 = this.f61539b;
            ReflectLiveReq reflectLiveReq = new ReflectLiveReq();
            reflectLiveReq.color_data = str2;
            reflectLiveReq.platform = 2;
            if (c14667a != null) {
                reflectLiveReq.reflect_data = m85844b(c14667a);
                str = null;
                reflectLiveReq.live_image = null;
            } else {
                str = null;
            }
            reflectLiveReq.compare_image = str;
            reflectLiveReq.session_id = str;
            reflectLiveReq.app_id = YTAGReflectLiveCheckInterface.mAppId;
            Bitmap bitmapM85837a2 = YtFSM.getInstance().getContext().imageToCompare;
            if (bitmapM85837a2 != null) {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                int width2 = bitmapM85837a2.getWidth();
                int height2 = bitmapM85837a2.getHeight();
                int i2 = width2 > height2 ? width2 : height2;
                if (i2 > 640) {
                    bitmapM85837a2 = m85837a(bitmapM85837a2, (width2 * 640) / i2, (height2 * 640) / i2);
                    YtLogger.m85808d("ReflectLivenessState", "resize image. from w:" + width2 + " h:" + height2 + " to w:" + bitmapM85837a2.getWidth() + " h:" + bitmapM85837a2.getHeight());
                }
                bitmapM85837a2.compress(Bitmap.CompressFormat.JPEG, 95, byteArrayOutputStream2);
                reflectLiveReq.compare_image = new String(Base64.encode(byteArrayOutputStream2.toByteArray(), 2));
            }
            YtLogger.m85808d("ReflectLivenessState", "on Request...");
            reflectLiveReq.color_data = this.f61539b;
            reflectLiveReq.select_data = this.f61542e;
            this.stateData.put("reflect_request_object", reflectLiveReq);
        }
        this.f61547j = YtSDKKitCommon.StateNameHelper.StateClassName.NET_LIVENESS_REQ_RESULT_STATE;
    }

    /* JADX INFO: renamed from: b */
    public final ReflectColorData m85844b(C14667a c14667a) {
        CommonUtils.benchMarkBegin("make_pack_use_time_reflection");
        YtLogger.m85808d("ReflectLivenessState", "translation reflectImagesShortenStrategy：" + this.f61533A);
        int i = 0;
        if (this.f61533A == 1) {
            int i2 = 0;
            while (true) {
                RawImgData[] rawImgDataArr = c14667a.f61671a;
                if (i2 >= rawImgDataArr.length) {
                    break;
                }
                if (i2 > 2 && i2 < rawImgDataArr.length - 2 && i2 % 2 != 0) {
                    rawImgDataArr[i2].frameBuffer = new byte[0];
                }
                i2++;
            }
        }
        ReflectColorData reflectColorData = new ReflectColorData();
        ArrayList<ColorImgData> arrayList = new ArrayList<>();
        int i3 = 0;
        while (true) {
            RawImgData[] rawImgDataArr2 = c14667a.f61671a;
            if (i3 >= rawImgDataArr2.length) {
                break;
            }
            RawImgData rawImgData = rawImgDataArr2[i3];
            ColorImgData colorImgData = new ColorImgData();
            colorImgData.setImage(new String(Base64.encode(rawImgData.frameBuffer, 2)));
            colorImgData.checksum = rawImgData.checksum;
            colorImgData.setCapture_time(rawImgData.captureTime);
            colorImgData.setX(rawImgData.f61683x);
            colorImgData.setY(rawImgData.f61684y);
            arrayList.add(colorImgData);
            i3++;
        }
        reflectColorData.setImages_data(arrayList);
        reflectColorData.setBegin_time(c14667a.f61672b);
        reflectColorData.setChangepoint_time(c14667a.f61673c);
        reflectColorData.changepoint_time_list = new ArrayList<>();
        while (true) {
            long[] jArr = c14667a.f61674d;
            if (i >= jArr.length) {
                break;
            }
            reflectColorData.changepoint_time_list.add(Long.valueOf(jArr[i]));
            i++;
        }
        reflectColorData.setOffset_sys(c14667a.f61675e);
        reflectColorData.setFrame_num(c14667a.f61676f);
        reflectColorData.setLandmark_num(c14667a.f61677g);
        reflectColorData.setWidth(c14667a.f61678h);
        reflectColorData.setHeight(c14667a.f61679i);
        reflectColorData.version = YTAGReflectLiveCheckInterface.VERSION;
        try {
            reflectColorData.setLog(new String(c14667a.f61681k, "UTF-8"));
        } catch (UnsupportedEncodingException unused) {
        }
        reflectColorData.setConfig_begin(c14667a.f61680j);
        OperateInfoManager.getInstance().setPackUseTime(CommonUtils.benchMarkEnd("make_pack_use_time_reflection"));
        return reflectColorData;
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void enter() {
        YTFaceTracker.TrackedFace[] trackedFaceArr;
        super.enter();
        YtFSMBaseState stateByName = YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE));
        try {
            this.f61543f = ((Integer) stateByName.getStateDataBy("pose_state")).intValue();
            this.f61545h = ((Integer) stateByName.getStateDataBy("continuous_detect_count")).intValue();
            this.f61546i = (YTFaceTracker.TrackedFace[]) stateByName.getStateDataBy("face_status");
            YtFSMBaseState stateByName2 = YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.NET_FETCH_STATE));
            if (stateByName2 != null) {
                this.f61542e = (LiveStyleRequester.SeleceData) stateByName2.getStateDataBy("select_data");
                if (!this.f61550m) {
                    this.f61539b = (String) stateByName2.getStateDataBy("color_data");
                } else if (this.f61557t) {
                    this.f61539b = this.f61552o;
                }
                String str = (String) stateByName2.getStateDataBy("control_config");
                if (str != null) {
                    this.f61560w = str;
                }
            }
            if (!this.f61560w.isEmpty()) {
                String[] strArrSplit = this.f61560w.split("&");
                if (strArrSplit.length > 0) {
                    for (String str2 : strArrSplit) {
                        String[] strArrSplit2 = str2.split("=");
                        if (strArrSplit2.length > 1 && strArrSplit2[0].equals("actref_ux_mode")) {
                            this.f61561x = Integer.parseInt(strArrSplit2[1]);
                        }
                        if (strArrSplit2.length > 1 && strArrSplit2[0].equals("reflect_images_shorten_strategy")) {
                            this.f61533A = Integer.parseInt(strArrSplit2[1]);
                        }
                        if (strArrSplit2.length > 1 && strArrSplit2[0].equals("compress_reflection_image_score")) {
                            int i = Integer.parseInt(strArrSplit2[1]);
                            int i2 = 80;
                            if (i < 80) {
                                i = i2;
                            } else {
                                i2 = 99;
                                if (i > 99) {
                                    i = i2;
                                }
                            }
                            YTAGReflectLiveCheckJNIInterface.compressReflectionImageScore = i;
                        }
                    }
                }
            }
            YtFSMBaseState stateByName3 = YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.ACTION_STATE));
            if (stateByName3 != null) {
                this.f61541d = (YTActRefData) stateByName3.getStateDataBy("act_reflect_data");
            }
            if (this.f61545h > this.f61551n && this.f61543f == 0 && (trackedFaceArr = this.f61546i) != null && trackedFaceArr.length > 0) {
                YtFSM.getInstance().sendFSMEvent(new C14647k(this));
            }
            if (this.f61561x == 2) {
                this.f61544g = EnumC14648l.RPT_FINISH;
                m85843a((C14667a) null);
            }
        } catch (Exception e) {
            YtLogger.m85809e("ReflectLivenessState", "reflection enter failed ", e);
            CommonUtils.reportException("reflection enter failed ", e);
        }
        YtFSM.getInstance().updateCacheStrategy(YtFSM.YtFSMUpdateStrategy.CacheStrategy);
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void enterFirst() {
        YtLogger.m85811o("ReflectLivenessState", makeStateInfo("ReflectLivenessState", 1));
        YtFSMBaseState stateByName = YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE));
        stateByName.handleStateAction("reset_timeout", null);
        YTFaceTracker yTFaceTracker = (YTFaceTracker) stateByName.getStateDataBy("detect_instance");
        this.f61559v = yTFaceTracker;
        if (yTFaceTracker != null) {
            YTFaceTracker.Param param = yTFaceTracker.getParam();
            this.f61553p = param;
            if (param != null) {
                param.detInterval = -1;
                this.f61559v.setParam(param);
            }
        } else {
            YtSDKStats.getInstance().reportError(ErrorCode.YT_SDK_VERIFY_MODEL_INIT_FAIL, "模式初始化失败");
            YtFSM.getInstance().sendFSMEvent(new C14646j(this));
        }
        this.f61562y.reset();
        YtFSM.getInstance().cleanUpQueue();
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void exit() {
        super.exit();
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void handleEvent(YtSDKKitFramework.YtFrameworkFireEventType ytFrameworkFireEventType, Object obj) {
        super.handleEvent(ytFrameworkFireEventType, obj);
        if (this.f61558u && ytFrameworkFireEventType == YtSDKKitFramework.YtFrameworkFireEventType.YT_EVENT_TRIGGER_CANCEL_LIVENESS) {
            m85841a();
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void loadStateWith(String str, JSONObject jSONObject, YtSdkConfig ytSdkConfig) {
        super.loadStateWith(str, jSONObject, ytSdkConfig);
        YtLogger.m85810i("ReflectLivenessState", "Reflection version:3.6.9.2");
        String[] strArrSplit = YTAGReflectLiveCheckInterface.VERSION.split("\\.");
        String str2 = this.f61538a;
        YtLogger.m85810i("ReflectLivenessState", "Wanted Reflection Version: " + str2);
        String[] strArrSplit2 = str2.split("\\.");
        if (Integer.parseInt(strArrSplit[0]) != Integer.parseInt(strArrSplit2[0])) {
            YtFSM.getInstance().sendFSMEvent(new C14639c());
        } else if (Integer.parseInt(strArrSplit[1]) != Integer.parseInt(strArrSplit2[1])) {
            YtFSM.getInstance().sendFSMEvent(new C14640d());
        } else if (Integer.parseInt(strArrSplit[2]) < Integer.parseInt(strArrSplit2[2])) {
            YtFSM.getInstance().sendFSMEvent(new C14641e());
        }
        int iInitModel = YTAGReflectLiveCheckInterface.initModel(this.f61540c, YtSDKKitFramework.getInstance().version().split("-")[0]);
        if (iInitModel != 0) {
            YtLogger.m85809e("ReflectLivenessState", "failed to init reflect sdk " + iInitModel, null);
            YtSDKStats.getInstance().reportError(iInitModel, "failed to init reflect sdk");
            YtFSM.getInstance().sendFSMEvent(new C14642f(this, iInitModel));
        }
        if (this.f61557t) {
            this.f61552o = YTAGReflectLiveCheckJNIInterface.FRGenConfigData(this.f61556s, this.f61555r);
        }
        YTAGReflectLiveCheckInterface.setReflectNotice(new C14643g());
        if (YtFSM.getInstance().getContext().reflectListener != null) {
            YTAGReflectLiveCheckInterface.setReflectListener(new C14644h());
        } else {
            YTAGReflectLiveCheckInterface.setReflectListener(null);
        }
        YTAGReflectLiveCheckJNIInterface.configNativeLog(true);
        YTAGReflectLiveCheckJNIInterface.updateParam("log_level", "3");
        YTAGReflectLiveCheckJNIInterface.updateParam("is_alone_raw_push", "0");
        YTAGReflectLiveCheckJNIInterface.setLoggerListener(new C14645i(this));
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void moveToNextState() {
        super.moveToNextState();
        if (this.f61547j != YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE) {
            YtFSM.getInstance().transitNow(YtSDKKitCommon.StateNameHelper.classNameOfState(this.f61547j));
        } else if (YtFSM.getInstance().transitNextRound(YtSDKKitCommon.StateNameHelper.classNameOfState(this.f61547j)) == -1) {
            sendFSMTransitError(YtSDKKitCommon.StateNameHelper.classNameOfState(this.f61547j));
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void onPause() {
        super.onPause();
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void onResume() {
        super.onResume();
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void reset() {
        m85841a();
        super.reset();
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void unload() {
        super.unload();
        YTAGReflectLiveCheckInterface.cancel();
        YTAGReflectLiveCheckInterface.releaseModel();
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void update(YTImageData yTImageData, long j) {
        int i;
        YTFaceTracker.TrackedFace[] trackedFaceArr;
        int i2;
        YTFaceTracker.TrackedFace[] trackedFaceArr2;
        super.update(yTImageData, j);
        if (this.f61534B && (trackedFaceArr2 = this.f61546i) != null && trackedFaceArr2.length > 0 && !C14664o.m85854a(trackedFaceArr2[0], this.f61535C, this.f61536D, this.f61537E)) {
            YtLogger.m85811o("ReflectLivenessState", "reflect face angle error");
            YtFSM.getInstance().sendFSMEvent(new C14637a(this));
            this.f61547j = YtSDKKitCommon.StateNameHelper.StateClassName.IDLE_STATE;
        }
        int iOrdinal = this.f61544g.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                if (this.f61545h > this.f61551n && (((i = this.f61543f) == 0 || i == 9) && (trackedFaceArr = this.f61546i) != null && trackedFaceArr.length > 0)) {
                    YtFSM.getInstance().sendFSMEvent(new C14662m(this));
                    this.f61544g = EnumC14648l.RPT_REFLECT;
                    YTAGReflectSettings aGSettings = YTAGReflectLiveCheckInterface.getAGSettings();
                    aGSettings.safetylevel = this.f61549l;
                    aGSettings.isEncodeReflectData = false;
                    aGSettings.isActionReflect = YtFSM.getInstance().getWorkMode() == YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTREFLECT_TYPE;
                    YTAGReflectLiveCheckInterface.setAGSettings(aGSettings);
                    YtLogger.m85810i("ReflectLivenessState", "Settings: safetyLevel " + aGSettings.safetylevel);
                    YtLogger.m85810i("ReflectLivenessState", "Settings: isEncodeReflectData " + aGSettings.isEncodeReflectData);
                    YtLogger.m85810i("ReflectLivenessState", "Settings: isActionReflect " + aGSettings.isActionReflect);
                    YtSDKKitFramework.YtSDKPlatformContext context = YtFSM.getInstance().getContext();
                    YTAGReflectLiveCheckInterface.start(context.currentAppContext, context.currentCamera, context.currentRotateState, this.f61539b, new C14663n(this));
                }
                this.f61547j = YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE;
            } else if (iOrdinal == 2) {
                StringBuilder sb = new StringBuilder("reflect continuous_detect_count ");
                sb.append(this.f61545h);
                sb.append("pass flag ");
                sb.append(this.f61543f != 0);
                YtLogger.m85808d("ReflectLivenessState", sb.toString());
                YtLogger.m85808d("ReflectLivenessState", "reflect pose state " + this.f61543f);
                if (this.f61548k && ((this.f61554q && (i2 = this.f61543f) != 0 && i2 != 9) || ((this.f61563z && this.f61543f == 1) || this.f61543f == 1))) {
                    YtLogger.m85811o("ReflectLivenessState", "reflect error: no face");
                    YTAGReflectLiveCheckInterface.cancel();
                    m85842a(-1, "检测异常", "请保持姿态");
                }
                if (this.f61546i != null) {
                    byte[] bArr = yTImageData.imgData;
                    int i3 = yTImageData.width;
                    int i4 = yTImageData.height;
                    int i5 = YtFSM.getInstance().getContext().currentRotateState;
                    YTFaceTracker.TrackedFace trackedFace = this.f61546i[0];
                    YTAGReflectLiveCheckInterface.pushImageData(bArr, i3, i4, j, i5, trackedFace.faceShape, trackedFace.pitch, trackedFace.yaw, trackedFace.roll);
                }
            }
        } else if (!this.f61562y.isRunning() || this.f61562y.checkTimeout()) {
            this.f61562y.cancel();
            this.f61544g = EnumC14648l.RPT_INIT;
        } else if (this.f61545h <= 1) {
            this.f61562y.reset();
        } else {
            YtFSM.getInstance().sendFSMEvent(new C14638b(this));
        }
        moveToNextState();
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void updateSDKSetting(JSONObject jSONObject) {
        try {
            if (jSONObject.has("similarity_threshold")) {
                jSONObject.getInt("similarity_threshold");
            }
            if (jSONObject.has("reflect_security_level")) {
                this.f61549l = jSONObject.getInt("reflect_security_level");
            }
            if (jSONObject.has("local_config_flag")) {
                this.f61550m = jSONObject.getBoolean("local_config_flag");
            }
            if (jSONObject.has("color_data")) {
                this.f61539b = jSONObject.getString("color_data");
            }
            if (jSONObject.has("stable_frame_num")) {
                this.f61551n = jSONObject.getInt("stable_frame_num");
            }
            if (jSONObject.has("backend_proto_type")) {
                jSONObject.getInt("backend_proto_type");
            }
            if (jSONObject.has("force_pose_check")) {
                this.f61554q = jSONObject.getBoolean("force_pose_check");
            }
            if (jSONObject.has("manual_trigger")) {
                this.f61558u = jSONObject.getBoolean("manual_trigger");
            }
            if (jSONObject.has("reflect_tips_countdown_ms")) {
                this.f61562y.init(Math.max(0, Math.min(10000, jSONObject.getInt("reflect_tips_countdown_ms"))), false);
            }
            if (jSONObject.has("control_config")) {
                this.f61560w = jSONObject.getString("control_config");
            }
            this.f61540c = jSONObject.getString(Constants.JumpUrlConstants.URL_KEY_APPID);
            if (jSONObject.has("extra_config")) {
                this.f61555r = jSONObject.getString("extra_config");
            }
            if (jSONObject.has("change_point_num")) {
                this.f61556s = jSONObject.getInt("change_point_num");
            }
            if (jSONObject.has("need_random_flag")) {
                this.f61557t = jSONObject.getBoolean("need_random_flag");
            }
            if (jSONObject.has("secondary_yaw_threshold")) {
                this.f61535C = (float) jSONObject.getDouble("secondary_yaw_threshold");
            }
            if (jSONObject.has("secondary_pitch_threshold")) {
                this.f61536D = (float) jSONObject.getDouble("secondary_pitch_threshold");
            }
            if (jSONObject.has("secondary_roll_threshold")) {
                this.f61537E = (float) jSONObject.getDouble("secondary_roll_threshold");
            }
            this.f61534B = jSONObject.optBoolean("need_angle_detect_reflection", false);
            this.f61563z = jSONObject.optBoolean("need_check_multiface", false);
        } catch (JSONException e) {
            e.printStackTrace();
            YtLogger.m85809e("ReflectLivenessState", "Failed to parse json:", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m85841a() {
        this.f61544g = EnumC14648l.RPT_TIPWAIT;
        this.f61545h = 0;
        this.f61543f = -1;
        this.f61548k = true;
        this.f61547j = YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE;
        YTAGReflectLiveCheckInterface.cancel();
    }

    /* JADX INFO: renamed from: a */
    public static Bitmap m85837a(Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(i / width, i2 / height);
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }

    /* JADX INFO: renamed from: a */
    public final void m85842a(int i, String str, String str2) {
        YtLogger.m85809e("ReflectLivenessState", "failed :".concat("message:" + str + "\ntips:" + str2 + "\ncode:" + i), null);
        String strMakeMessageJson = CommonUtils.makeMessageJson(4194304, str, str);
        YtSDKStats.getInstance().reportError(i, str);
        HashMap<String, Object> map = new HashMap<>();
        map.put(StateEvent.Name.UI_TIPS, StringCode.RST_FAILED);
        map.put(StateEvent.Name.UI_ACTION, StateEvent.ActionValue.PROCESS_FIN);
        map.put(StateEvent.Name.PROCESS_RESULT, "failed");
        if (i == 500) {
            strMakeMessageJson = CommonUtils.makeMessageJson(ErrorCode.YT_SDK_REFLECTION_COLOR_DATA_PARSE_ERROR, str, str);
            map.put(StateEvent.Name.ERROR_CODE, Integer.valueOf(ErrorCode.YT_SDK_REFLECTION_COLOR_DATA_PARSE_ERROR));
        } else {
            map.put(StateEvent.Name.ERROR_CODE, 4194304);
        }
        map.put(StateEvent.Name.ERROR_REASON_CODE, Integer.valueOf(i));
        map.put("message", strMakeMessageJson);
        YtFSM.getInstance().sendFSMEvent(map);
        this.f61544g = EnumC14648l.RPT_FINISH;
    }

    /* JADX INFO: renamed from: a */
    public final ActionReflectReq m85840a(C14667a c14667a, YTActReflectData yTActReflectData, String str) {
        ActionReflectReq actionReflectReq = new ActionReflectReq();
        actionReflectReq.app_id = YTAGReflectLiveCheckInterface.mAppId;
        actionReflectReq.color_data = str;
        actionReflectReq.platform = 2;
        actionReflectReq.select_data = yTActReflectData.select_data;
        if (c14667a != null) {
            actionReflectReq.reflect_data = m85844b(c14667a);
        }
        actionReflectReq.live_image = new YTImageInfo(yTActReflectData.best);
        actionReflectReq.eye_image = new YTImageInfo(yTActReflectData.eye);
        actionReflectReq.mouth_image = new YTImageInfo(yTActReflectData.mouth);
        actionReflectReq.compare_image = null;
        actionReflectReq.mode = 0;
        actionReflectReq.session_id = null;
        return actionReflectReq;
    }
}
