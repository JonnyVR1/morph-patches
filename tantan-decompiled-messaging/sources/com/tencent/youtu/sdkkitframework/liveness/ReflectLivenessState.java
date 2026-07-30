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
import com.tencent.youtu.ytagreflectlivecheck.C14519a;
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
import com.tencent.youtu.ytagreflectlivecheck.notice.InterfaceC14520a;
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
    public int f60686A;

    /* JADX INFO: renamed from: b */
    public String f60692b;

    /* JADX INFO: renamed from: c */
    public String f60693c;

    /* JADX INFO: renamed from: d */
    public YTActRefData f60694d;

    /* JADX INFO: renamed from: e */
    public LiveStyleRequester.SeleceData f60695e;

    /* JADX INFO: renamed from: i */
    public YTFaceTracker.TrackedFace[] f60699i;

    /* JADX INFO: renamed from: o */
    public String f60705o;

    /* JADX INFO: renamed from: p */
    public YTFaceTracker.Param f60706p;

    /* JADX INFO: renamed from: a */
    public String f60691a = "3.6.2";

    /* JADX INFO: renamed from: f */
    public int f60696f = -1;

    /* JADX INFO: renamed from: g */
    public EnumC14500l f60697g = EnumC14500l.RPT_INIT;

    /* JADX INFO: renamed from: h */
    public int f60698h = 0;

    /* JADX INFO: renamed from: j */
    public YtSDKKitCommon.StateNameHelper.StateClassName f60700j = YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE;

    /* JADX INFO: renamed from: k */
    public boolean f60701k = true;

    /* JADX INFO: renamed from: l */
    public int f60702l = 2;

    /* JADX INFO: renamed from: m */
    public boolean f60703m = false;

    /* JADX INFO: renamed from: n */
    public int f60704n = 5;

    /* JADX INFO: renamed from: q */
    public boolean f60707q = false;

    /* JADX INFO: renamed from: r */
    public String f60708r = "";

    /* JADX INFO: renamed from: s */
    public int f60709s = 2;

    /* JADX INFO: renamed from: t */
    public boolean f60710t = false;

    /* JADX INFO: renamed from: u */
    public boolean f60711u = false;

    /* JADX INFO: renamed from: v */
    public YTFaceTracker f60712v = null;

    /* JADX INFO: renamed from: w */
    public String f60713w = "";

    /* JADX INFO: renamed from: x */
    public int f60714x = 0;

    /* JADX INFO: renamed from: y */
    public TimeoutCounter f60715y = new TimeoutCounter("reflect tips timeout counter");

    /* JADX INFO: renamed from: z */
    public boolean f60716z = false;

    /* JADX INFO: renamed from: B */
    public boolean f60687B = false;

    /* JADX INFO: renamed from: C */
    public float f60688C = 50.0f;

    /* JADX INFO: renamed from: D */
    public float f60689D = 50.0f;

    /* JADX INFO: renamed from: E */
    public float f60690E = 50.0f;

    /* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState$a */
    public class C14489a extends HashMap<String, Object> {
        public C14489a(ReflectLivenessState reflectLivenessState) {
            put(StateEvent.Name.PROCESS_RESULT, "failed");
            put(StateEvent.Name.ERROR_CODE, Integer.valueOf(ErrorCode.YT_SDK_REFLECTION_ANGLE_DETECT_FAIL));
            put("message", CommonUtils.makeMessageJson(ErrorCode.YT_SDK_REFLECTION_ANGLE_DETECT_FAIL, StringCode.YT_FACE_REF_ANGLE_DETECT_ERROR, "reflection angle detect fail"));
        }
    }

    /* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState$b */
    public class C14490b extends HashMap<String, Object> {
        public C14490b(ReflectLivenessState reflectLivenessState) {
            put(StateEvent.Name.UI_TIPS, StringCode.FL_POSE_KEEP);
        }
    }

    /* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState$c */
    public class C14491c extends HashMap<String, Object> {
        public C14491c() {
            put(StateEvent.Name.WARNING_TIPS, "反光库版本异常！目标版本：" + ReflectLivenessState.this.f60691a + " 当前版本：3.6.9.2");
        }
    }

    /* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState$d */
    public class C14492d extends HashMap<String, Object> {
        public C14492d() {
            put(StateEvent.Name.WARNING_TIPS, "反光库版本异常！目标版本：" + ReflectLivenessState.this.f60691a + " 当前版本：3.6.9.2");
        }
    }

    /* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState$e */
    public class C14493e extends HashMap<String, Object> {
        public C14493e() {
            put(StateEvent.Name.WARNING_TIPS, "反光库版本过低！目标版本：" + ReflectLivenessState.this.f60691a + " 当前版本：3.6.9.2");
        }
    }

    /* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState$f */
    public class C14494f extends HashMap<String, Object> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f60720a;

        public C14494f(ReflectLivenessState reflectLivenessState, int i) {
            this.f60720a = i;
            put(StateEvent.Name.PROCESS_RESULT, "failed");
            put(StateEvent.Name.ERROR_CODE, Integer.valueOf(ErrorCode.YT_SDK_REFLECT_INIT_FAILED));
            put("message", CommonUtils.makeMessageJson(ErrorCode.YT_SDK_REFLECT_INIT_FAILED, StringCode.MSG_PARAM_ERROR, "Init YTReflect SDK failed with " + i));
        }
    }

    /* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState$g */
    public class C14495g implements InterfaceC14520a {
        public C14495g() {
        }
    }

    /* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState$h */
    public class C14496h implements YTAGReflectLiveCheckInterface.IYTReflectListener {
        public C14496h() {
        }

        @Override // com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.IYTReflectListener
        public float onGetAppBrightness() {
            try {
                return YtFSM.getInstance().getContext().reflectListener.onGetAppBrightness();
            } catch (Exception e) {
                YtLogger.m84638e("ReflectLivenessState", "onGetAppBrightness error", e);
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
                YtLogger.m84638e("ReflectLivenessState", "onReflectEvent error", e);
            }
        }

        @Override // com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.IYTReflectListener
        public void onReflectStart(long j) {
            try {
                YtFSM.getInstance().getContext().reflectListener.onReflectStart(j);
            } catch (Exception e) {
                YtLogger.m84638e("ReflectLivenessState", "onReflectStart error", e);
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState$i */
    public class C14497i implements YTAGReflectLiveCheckJNIInterface.IYtLoggerListener {
        public C14497i(ReflectLivenessState reflectLivenessState) {
        }

        @Override // com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface.IYtLoggerListener
        public void log(String str, String str2) {
            YtLogger.m84637d(str, str2);
        }
    }

    /* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState$j */
    public class C14498j extends HashMap<String, Object> {
        public C14498j(ReflectLivenessState reflectLivenessState) {
            put(StateEvent.Name.PROCESS_RESULT, "failed");
            put(StateEvent.Name.ERROR_CODE, Integer.valueOf(ErrorCode.YT_SDK_FACETRACE_INIT_FAILED));
            put("message", CommonUtils.makeMessageJson(ErrorCode.YT_SDK_FACETRACE_INIT_FAILED, StringCode.MSG_PARAM_ERROR, "Init YTFaceTrack SDK failed with "));
        }
    }

    /* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState$k */
    public class C14499k extends HashMap<String, Object> {
        public C14499k(ReflectLivenessState reflectLivenessState) {
            put(StateEvent.Name.UI_TIPS, StringCode.FL_POSE_KEEP);
        }
    }

    /* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState$l */
    public enum EnumC14500l {
        RPT_TIPWAIT,
        RPT_INIT,
        RPT_REFLECT,
        RPT_FINISH
    }

    /* JADX INFO: renamed from: a */
    public final void m84672a(C14519a c14519a) {
        String str;
        if (YtFSM.getInstance().getWorkMode() == YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTREFLECT_TYPE) {
            try {
                YTActRefImage yTActRefImage = this.f60694d.best;
                YTActReflectImage yTActReflectImage = new YTActReflectImage(yTActRefImage.image, yTActRefImage.xys, yTActRefImage.checksum);
                YTActRefImage yTActRefImage2 = this.f60694d.eye;
                YTActReflectImage yTActReflectImage2 = new YTActReflectImage(yTActRefImage2.image, yTActRefImage2.xys, yTActRefImage2.checksum);
                YTActRefImage yTActRefImage3 = this.f60694d.mouth;
                ActionReflectReq actionReflectReqM84669a = m84669a(c14519a, new YTActReflectData(yTActReflectImage, yTActReflectImage2, new YTActReflectImage(yTActRefImage3.image, yTActRefImage3.xys, yTActRefImage3.checksum), this.f60695e), this.f60692b);
                actionReflectReqM84669a.app_id = this.f60693c;
                Bitmap bitmapM84666a = YtFSM.getInstance().getContext().imageToCompare;
                if (bitmapM84666a != null) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    int width = bitmapM84666a.getWidth();
                    int height = bitmapM84666a.getHeight();
                    int i = width > height ? width : height;
                    if (i > 640) {
                        bitmapM84666a = m84666a(bitmapM84666a, (width * 640) / i, (height * 640) / i);
                        YtLogger.m84637d("ReflectLivenessState", "resize image. from w:" + width + " h:" + height + " to w:" + bitmapM84666a.getWidth() + " h:" + bitmapM84666a.getHeight());
                    }
                    bitmapM84666a.compress(Bitmap.CompressFormat.JPEG, 95, byteArrayOutputStream);
                    actionReflectReqM84669a.compare_image = new YTImageInfo(new YTActReflectImage(byteArrayOutputStream.toByteArray(), null, null));
                }
                actionReflectReqM84669a.color_data = this.f60692b;
                this.stateData.put("reflect_request_object", actionReflectReqM84669a);
            } catch (Exception e) {
                YtLogger.m84638e("ReflectLivenessState", "Handle actref data failed:", e);
            }
        } else {
            String str2 = this.f60692b;
            ReflectLiveReq reflectLiveReq = new ReflectLiveReq();
            reflectLiveReq.color_data = str2;
            reflectLiveReq.platform = 2;
            if (c14519a != null) {
                reflectLiveReq.reflect_data = m84673b(c14519a);
                str = null;
                reflectLiveReq.live_image = null;
            } else {
                str = null;
            }
            reflectLiveReq.compare_image = str;
            reflectLiveReq.session_id = str;
            reflectLiveReq.app_id = YTAGReflectLiveCheckInterface.mAppId;
            Bitmap bitmapM84666a2 = YtFSM.getInstance().getContext().imageToCompare;
            if (bitmapM84666a2 != null) {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                int width2 = bitmapM84666a2.getWidth();
                int height2 = bitmapM84666a2.getHeight();
                int i2 = width2 > height2 ? width2 : height2;
                if (i2 > 640) {
                    bitmapM84666a2 = m84666a(bitmapM84666a2, (width2 * 640) / i2, (height2 * 640) / i2);
                    YtLogger.m84637d("ReflectLivenessState", "resize image. from w:" + width2 + " h:" + height2 + " to w:" + bitmapM84666a2.getWidth() + " h:" + bitmapM84666a2.getHeight());
                }
                bitmapM84666a2.compress(Bitmap.CompressFormat.JPEG, 95, byteArrayOutputStream2);
                reflectLiveReq.compare_image = new String(Base64.encode(byteArrayOutputStream2.toByteArray(), 2));
            }
            YtLogger.m84637d("ReflectLivenessState", "on Request...");
            reflectLiveReq.color_data = this.f60692b;
            reflectLiveReq.select_data = this.f60695e;
            this.stateData.put("reflect_request_object", reflectLiveReq);
        }
        this.f60700j = YtSDKKitCommon.StateNameHelper.StateClassName.NET_LIVENESS_REQ_RESULT_STATE;
    }

    /* JADX INFO: renamed from: b */
    public final ReflectColorData m84673b(C14519a c14519a) {
        CommonUtils.benchMarkBegin("make_pack_use_time_reflection");
        YtLogger.m84637d("ReflectLivenessState", "translation reflectImagesShortenStrategy：" + this.f60686A);
        int i = 0;
        if (this.f60686A == 1) {
            int i2 = 0;
            while (true) {
                RawImgData[] rawImgDataArr = c14519a.f60824a;
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
            RawImgData[] rawImgDataArr2 = c14519a.f60824a;
            if (i3 >= rawImgDataArr2.length) {
                break;
            }
            RawImgData rawImgData = rawImgDataArr2[i3];
            ColorImgData colorImgData = new ColorImgData();
            colorImgData.setImage(new String(Base64.encode(rawImgData.frameBuffer, 2)));
            colorImgData.checksum = rawImgData.checksum;
            colorImgData.setCapture_time(rawImgData.captureTime);
            colorImgData.setX(rawImgData.f60836x);
            colorImgData.setY(rawImgData.f60837y);
            arrayList.add(colorImgData);
            i3++;
        }
        reflectColorData.setImages_data(arrayList);
        reflectColorData.setBegin_time(c14519a.f60825b);
        reflectColorData.setChangepoint_time(c14519a.f60826c);
        reflectColorData.changepoint_time_list = new ArrayList<>();
        while (true) {
            long[] jArr = c14519a.f60827d;
            if (i >= jArr.length) {
                break;
            }
            reflectColorData.changepoint_time_list.add(Long.valueOf(jArr[i]));
            i++;
        }
        reflectColorData.setOffset_sys(c14519a.f60828e);
        reflectColorData.setFrame_num(c14519a.f60829f);
        reflectColorData.setLandmark_num(c14519a.f60830g);
        reflectColorData.setWidth(c14519a.f60831h);
        reflectColorData.setHeight(c14519a.f60832i);
        reflectColorData.version = YTAGReflectLiveCheckInterface.VERSION;
        try {
            reflectColorData.setLog(new String(c14519a.f60834k, "UTF-8"));
        } catch (UnsupportedEncodingException unused) {
        }
        reflectColorData.setConfig_begin(c14519a.f60833j);
        OperateInfoManager.getInstance().setPackUseTime(CommonUtils.benchMarkEnd("make_pack_use_time_reflection"));
        return reflectColorData;
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void enter() {
        YTFaceTracker.TrackedFace[] trackedFaceArr;
        super.enter();
        YtFSMBaseState stateByName = YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE));
        try {
            this.f60696f = ((Integer) stateByName.getStateDataBy("pose_state")).intValue();
            this.f60698h = ((Integer) stateByName.getStateDataBy("continuous_detect_count")).intValue();
            this.f60699i = (YTFaceTracker.TrackedFace[]) stateByName.getStateDataBy("face_status");
            YtFSMBaseState stateByName2 = YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.NET_FETCH_STATE));
            if (stateByName2 != null) {
                this.f60695e = (LiveStyleRequester.SeleceData) stateByName2.getStateDataBy("select_data");
                if (!this.f60703m) {
                    this.f60692b = (String) stateByName2.getStateDataBy("color_data");
                } else if (this.f60710t) {
                    this.f60692b = this.f60705o;
                }
                String str = (String) stateByName2.getStateDataBy("control_config");
                if (str != null) {
                    this.f60713w = str;
                }
            }
            if (!this.f60713w.isEmpty()) {
                String[] strArrSplit = this.f60713w.split("&");
                if (strArrSplit.length > 0) {
                    for (String str2 : strArrSplit) {
                        String[] strArrSplit2 = str2.split("=");
                        if (strArrSplit2.length > 1 && strArrSplit2[0].equals("actref_ux_mode")) {
                            this.f60714x = Integer.parseInt(strArrSplit2[1]);
                        }
                        if (strArrSplit2.length > 1 && strArrSplit2[0].equals("reflect_images_shorten_strategy")) {
                            this.f60686A = Integer.parseInt(strArrSplit2[1]);
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
                this.f60694d = (YTActRefData) stateByName3.getStateDataBy("act_reflect_data");
            }
            if (this.f60698h > this.f60704n && this.f60696f == 0 && (trackedFaceArr = this.f60699i) != null && trackedFaceArr.length > 0) {
                YtFSM.getInstance().sendFSMEvent(new C14499k(this));
            }
            if (this.f60714x == 2) {
                this.f60697g = EnumC14500l.RPT_FINISH;
                m84672a((C14519a) null);
            }
        } catch (Exception e) {
            YtLogger.m84638e("ReflectLivenessState", "reflection enter failed ", e);
            CommonUtils.reportException("reflection enter failed ", e);
        }
        YtFSM.getInstance().updateCacheStrategy(YtFSM.YtFSMUpdateStrategy.CacheStrategy);
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void enterFirst() {
        YtLogger.m84640o("ReflectLivenessState", makeStateInfo("ReflectLivenessState", 1));
        YtFSMBaseState stateByName = YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE));
        stateByName.handleStateAction("reset_timeout", null);
        YTFaceTracker yTFaceTracker = (YTFaceTracker) stateByName.getStateDataBy("detect_instance");
        this.f60712v = yTFaceTracker;
        if (yTFaceTracker != null) {
            YTFaceTracker.Param param = yTFaceTracker.getParam();
            this.f60706p = param;
            if (param != null) {
                param.detInterval = -1;
                this.f60712v.setParam(param);
            }
        } else {
            YtSDKStats.getInstance().reportError(ErrorCode.YT_SDK_VERIFY_MODEL_INIT_FAIL, "模式初始化失败");
            YtFSM.getInstance().sendFSMEvent(new C14498j(this));
        }
        this.f60715y.reset();
        YtFSM.getInstance().cleanUpQueue();
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void exit() {
        super.exit();
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void handleEvent(YtSDKKitFramework.YtFrameworkFireEventType ytFrameworkFireEventType, Object obj) {
        super.handleEvent(ytFrameworkFireEventType, obj);
        if (this.f60711u && ytFrameworkFireEventType == YtSDKKitFramework.YtFrameworkFireEventType.YT_EVENT_TRIGGER_CANCEL_LIVENESS) {
            m84670a();
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void loadStateWith(String str, JSONObject jSONObject, YtSdkConfig ytSdkConfig) {
        super.loadStateWith(str, jSONObject, ytSdkConfig);
        YtLogger.m84639i("ReflectLivenessState", "Reflection version:3.6.9.2");
        String[] strArrSplit = YTAGReflectLiveCheckInterface.VERSION.split("\\.");
        String str2 = this.f60691a;
        YtLogger.m84639i("ReflectLivenessState", "Wanted Reflection Version: " + str2);
        String[] strArrSplit2 = str2.split("\\.");
        if (Integer.parseInt(strArrSplit[0]) != Integer.parseInt(strArrSplit2[0])) {
            YtFSM.getInstance().sendFSMEvent(new C14491c());
        } else if (Integer.parseInt(strArrSplit[1]) != Integer.parseInt(strArrSplit2[1])) {
            YtFSM.getInstance().sendFSMEvent(new C14492d());
        } else if (Integer.parseInt(strArrSplit[2]) < Integer.parseInt(strArrSplit2[2])) {
            YtFSM.getInstance().sendFSMEvent(new C14493e());
        }
        int iInitModel = YTAGReflectLiveCheckInterface.initModel(this.f60693c, YtSDKKitFramework.getInstance().version().split("-")[0]);
        if (iInitModel != 0) {
            YtLogger.m84638e("ReflectLivenessState", "failed to init reflect sdk " + iInitModel, null);
            YtSDKStats.getInstance().reportError(iInitModel, "failed to init reflect sdk");
            YtFSM.getInstance().sendFSMEvent(new C14494f(this, iInitModel));
        }
        if (this.f60710t) {
            this.f60705o = YTAGReflectLiveCheckJNIInterface.FRGenConfigData(this.f60709s, this.f60708r);
        }
        YTAGReflectLiveCheckInterface.setReflectNotice(new C14495g());
        if (YtFSM.getInstance().getContext().reflectListener != null) {
            YTAGReflectLiveCheckInterface.setReflectListener(new C14496h());
        } else {
            YTAGReflectLiveCheckInterface.setReflectListener(null);
        }
        YTAGReflectLiveCheckJNIInterface.configNativeLog(true);
        YTAGReflectLiveCheckJNIInterface.updateParam("log_level", "3");
        YTAGReflectLiveCheckJNIInterface.updateParam("is_alone_raw_push", "0");
        YTAGReflectLiveCheckJNIInterface.setLoggerListener(new C14497i(this));
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void moveToNextState() {
        super.moveToNextState();
        if (this.f60700j != YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE) {
            YtFSM.getInstance().transitNow(YtSDKKitCommon.StateNameHelper.classNameOfState(this.f60700j));
        } else if (YtFSM.getInstance().transitNextRound(YtSDKKitCommon.StateNameHelper.classNameOfState(this.f60700j)) == -1) {
            sendFSMTransitError(YtSDKKitCommon.StateNameHelper.classNameOfState(this.f60700j));
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
        m84670a();
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
        if (this.f60687B && (trackedFaceArr2 = this.f60699i) != null && trackedFaceArr2.length > 0 && !C14516o.m84683a(trackedFaceArr2[0], this.f60688C, this.f60689D, this.f60690E)) {
            YtLogger.m84640o("ReflectLivenessState", "reflect face angle error");
            YtFSM.getInstance().sendFSMEvent(new C14489a(this));
            this.f60700j = YtSDKKitCommon.StateNameHelper.StateClassName.IDLE_STATE;
        }
        int iOrdinal = this.f60697g.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                if (this.f60698h > this.f60704n && (((i = this.f60696f) == 0 || i == 9) && (trackedFaceArr = this.f60699i) != null && trackedFaceArr.length > 0)) {
                    YtFSM.getInstance().sendFSMEvent(new C14514m(this));
                    this.f60697g = EnumC14500l.RPT_REFLECT;
                    YTAGReflectSettings aGSettings = YTAGReflectLiveCheckInterface.getAGSettings();
                    aGSettings.safetylevel = this.f60702l;
                    aGSettings.isEncodeReflectData = false;
                    aGSettings.isActionReflect = YtFSM.getInstance().getWorkMode() == YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTREFLECT_TYPE;
                    YTAGReflectLiveCheckInterface.setAGSettings(aGSettings);
                    YtLogger.m84639i("ReflectLivenessState", "Settings: safetyLevel " + aGSettings.safetylevel);
                    YtLogger.m84639i("ReflectLivenessState", "Settings: isEncodeReflectData " + aGSettings.isEncodeReflectData);
                    YtLogger.m84639i("ReflectLivenessState", "Settings: isActionReflect " + aGSettings.isActionReflect);
                    YtSDKKitFramework.YtSDKPlatformContext context = YtFSM.getInstance().getContext();
                    YTAGReflectLiveCheckInterface.start(context.currentAppContext, context.currentCamera, context.currentRotateState, this.f60692b, new C14515n(this));
                }
                this.f60700j = YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE;
            } else if (iOrdinal == 2) {
                StringBuilder sb = new StringBuilder("reflect continuous_detect_count ");
                sb.append(this.f60698h);
                sb.append("pass flag ");
                sb.append(this.f60696f != 0);
                YtLogger.m84637d("ReflectLivenessState", sb.toString());
                YtLogger.m84637d("ReflectLivenessState", "reflect pose state " + this.f60696f);
                if (this.f60701k && ((this.f60707q && (i2 = this.f60696f) != 0 && i2 != 9) || ((this.f60716z && this.f60696f == 1) || this.f60696f == 1))) {
                    YtLogger.m84640o("ReflectLivenessState", "reflect error: no face");
                    YTAGReflectLiveCheckInterface.cancel();
                    m84671a(-1, "检测异常", "请保持姿态");
                }
                if (this.f60699i != null) {
                    byte[] bArr = yTImageData.imgData;
                    int i3 = yTImageData.width;
                    int i4 = yTImageData.height;
                    int i5 = YtFSM.getInstance().getContext().currentRotateState;
                    YTFaceTracker.TrackedFace trackedFace = this.f60699i[0];
                    YTAGReflectLiveCheckInterface.pushImageData(bArr, i3, i4, j, i5, trackedFace.faceShape, trackedFace.pitch, trackedFace.yaw, trackedFace.roll);
                }
            }
        } else if (!this.f60715y.isRunning() || this.f60715y.checkTimeout()) {
            this.f60715y.cancel();
            this.f60697g = EnumC14500l.RPT_INIT;
        } else if (this.f60698h <= 1) {
            this.f60715y.reset();
        } else {
            YtFSM.getInstance().sendFSMEvent(new C14490b(this));
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
                this.f60702l = jSONObject.getInt("reflect_security_level");
            }
            if (jSONObject.has("local_config_flag")) {
                this.f60703m = jSONObject.getBoolean("local_config_flag");
            }
            if (jSONObject.has("color_data")) {
                this.f60692b = jSONObject.getString("color_data");
            }
            if (jSONObject.has("stable_frame_num")) {
                this.f60704n = jSONObject.getInt("stable_frame_num");
            }
            if (jSONObject.has("backend_proto_type")) {
                jSONObject.getInt("backend_proto_type");
            }
            if (jSONObject.has("force_pose_check")) {
                this.f60707q = jSONObject.getBoolean("force_pose_check");
            }
            if (jSONObject.has("manual_trigger")) {
                this.f60711u = jSONObject.getBoolean("manual_trigger");
            }
            if (jSONObject.has("reflect_tips_countdown_ms")) {
                this.f60715y.init(Math.max(0, Math.min(10000, jSONObject.getInt("reflect_tips_countdown_ms"))), false);
            }
            if (jSONObject.has("control_config")) {
                this.f60713w = jSONObject.getString("control_config");
            }
            this.f60693c = jSONObject.getString(Constants.JumpUrlConstants.URL_KEY_APPID);
            if (jSONObject.has("extra_config")) {
                this.f60708r = jSONObject.getString("extra_config");
            }
            if (jSONObject.has("change_point_num")) {
                this.f60709s = jSONObject.getInt("change_point_num");
            }
            if (jSONObject.has("need_random_flag")) {
                this.f60710t = jSONObject.getBoolean("need_random_flag");
            }
            if (jSONObject.has("secondary_yaw_threshold")) {
                this.f60688C = (float) jSONObject.getDouble("secondary_yaw_threshold");
            }
            if (jSONObject.has("secondary_pitch_threshold")) {
                this.f60689D = (float) jSONObject.getDouble("secondary_pitch_threshold");
            }
            if (jSONObject.has("secondary_roll_threshold")) {
                this.f60690E = (float) jSONObject.getDouble("secondary_roll_threshold");
            }
            this.f60687B = jSONObject.optBoolean("need_angle_detect_reflection", false);
            this.f60716z = jSONObject.optBoolean("need_check_multiface", false);
        } catch (JSONException e) {
            e.printStackTrace();
            YtLogger.m84638e("ReflectLivenessState", "Failed to parse json:", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m84670a() {
        this.f60697g = EnumC14500l.RPT_TIPWAIT;
        this.f60698h = 0;
        this.f60696f = -1;
        this.f60701k = true;
        this.f60700j = YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE;
        YTAGReflectLiveCheckInterface.cancel();
    }

    /* JADX INFO: renamed from: a */
    public static Bitmap m84666a(Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(i / width, i2 / height);
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }

    /* JADX INFO: renamed from: a */
    public final void m84671a(int i, String str, String str2) {
        YtLogger.m84638e("ReflectLivenessState", "failed :".concat("message:" + str + "\ntips:" + str2 + "\ncode:" + i), null);
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
        this.f60697g = EnumC14500l.RPT_FINISH;
    }

    /* JADX INFO: renamed from: a */
    public final ActionReflectReq m84669a(C14519a c14519a, YTActReflectData yTActReflectData, String str) {
        ActionReflectReq actionReflectReq = new ActionReflectReq();
        actionReflectReq.app_id = YTAGReflectLiveCheckInterface.mAppId;
        actionReflectReq.color_data = str;
        actionReflectReq.platform = 2;
        actionReflectReq.select_data = yTActReflectData.select_data;
        if (c14519a != null) {
            actionReflectReq.reflect_data = m84673b(c14519a);
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
