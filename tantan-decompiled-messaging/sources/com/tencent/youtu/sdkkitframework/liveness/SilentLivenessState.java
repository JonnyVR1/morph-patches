package com.tencent.youtu.sdkkitframework.liveness;

import android.graphics.Rect;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.data.Detect;
import com.tencent.youtu.liveness.YTFaceTracker;
import com.tencent.youtu.sdkkitframework.common.CommonUtils;
import com.tencent.youtu.sdkkitframework.common.ErrorCode;
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
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p149l.ig3;

/* JADX INFO: loaded from: classes2.dex */
public class SilentLivenessState extends YtFSMBaseState {

    /* JADX INFO: renamed from: Y */
    public int f60752Y;

    /* JADX INFO: renamed from: a */
    public int f60754a;

    /* JADX INFO: renamed from: b */
    public int f60756b;

    /* JADX INFO: renamed from: c */
    public float f60758c;

    /* JADX INFO: renamed from: d */
    public float f60760d;

    /* JADX INFO: renamed from: e */
    public int f60762e = 0;

    /* JADX INFO: renamed from: f */
    public int f60764f = -1;

    /* JADX INFO: renamed from: g */
    public int f60766g = -1;

    /* JADX INFO: renamed from: h */
    public boolean f60768h = false;

    /* JADX INFO: renamed from: i */
    public String f60770i = "";

    /* JADX INFO: renamed from: j */
    public boolean f60772j = false;

    /* JADX INFO: renamed from: k */
    public TimeoutCounter f60774k = new TimeoutCounter("Liveness timeout counter");

    /* JADX INFO: renamed from: l */
    public TimeoutCounter f60776l = new TimeoutCounter("Predetect timeout counter");

    /* JADX INFO: renamed from: m */
    public boolean f60777m = false;

    /* JADX INFO: renamed from: n */
    public float f60778n = 0.22f;

    /* JADX INFO: renamed from: o */
    public boolean f60779o = false;

    /* JADX INFO: renamed from: p */
    public int f60780p = 30;

    /* JADX INFO: renamed from: q */
    public int f60781q = 25;

    /* JADX INFO: renamed from: r */
    public int f60782r = 25;

    /* JADX INFO: renamed from: s */
    public float f60783s = 1.0f;

    /* JADX INFO: renamed from: t */
    public float f60784t = 0.5f;

    /* JADX INFO: renamed from: u */
    public int f60785u = 0;

    /* JADX INFO: renamed from: v */
    public int f60786v = 0;

    /* JADX INFO: renamed from: w */
    public boolean f60787w = false;

    /* JADX INFO: renamed from: x */
    public boolean f60788x = true;

    /* JADX INFO: renamed from: y */
    public int f60789y = 5;

    /* JADX INFO: renamed from: z */
    public int f60790z = 5;

    /* JADX INFO: renamed from: A */
    public float f60728A = -1.0E10f;

    /* JADX INFO: renamed from: B */
    public float f60729B = 1.0E10f;

    /* JADX INFO: renamed from: C */
    public float f60730C = -1.0E10f;

    /* JADX INFO: renamed from: D */
    public float f60731D = 1.0E10f;

    /* JADX INFO: renamed from: E */
    public float f60732E = -1.0E10f;

    /* JADX INFO: renamed from: F */
    public boolean f60733F = true;

    /* JADX INFO: renamed from: G */
    public float f60734G = 0.7f;

    /* JADX INFO: renamed from: H */
    public float f60735H = -1.0E10f;

    /* JADX INFO: renamed from: I */
    public float f60736I = 0.05f;

    /* JADX INFO: renamed from: J */
    public float f60737J = 0.05f;

    /* JADX INFO: renamed from: K */
    public float f60738K = 0.05f;

    /* JADX INFO: renamed from: L */
    public float f60739L = 0.9f;

    /* JADX INFO: renamed from: M */
    public int f60740M = 0;

    /* JADX INFO: renamed from: N */
    public Rect f60741N = null;

    /* JADX INFO: renamed from: O */
    public boolean f60742O = true;

    /* JADX INFO: renamed from: P */
    public boolean f60743P = false;

    /* JADX INFO: renamed from: Q */
    public int f60744Q = 0;

    /* JADX INFO: renamed from: R */
    public int f60745R = 5;

    /* JADX INFO: renamed from: S */
    public float f60746S = -1.0E10f;

    /* JADX INFO: renamed from: T */
    public YTFaceTracker f60747T = null;

    /* JADX INFO: renamed from: U */
    public C14516o.a f60748U = null;

    /* JADX INFO: renamed from: V */
    public int f60749V = -1;

    /* JADX INFO: renamed from: W */
    public int f60750W = 0;

    /* JADX INFO: renamed from: X */
    public int f60751X = 0;

    /* JADX INFO: renamed from: Z */
    public int f60753Z = 0;

    /* JADX INFO: renamed from: a0 */
    public String f60755a0 = "";

    /* JADX INFO: renamed from: b0 */
    public int f60757b0 = 0;

    /* JADX INFO: renamed from: c0 */
    public boolean f60759c0 = false;

    /* JADX INFO: renamed from: d0 */
    public boolean f60761d0 = false;

    /* JADX INFO: renamed from: e0 */
    public String f60763e0 = "yt_model_config.ini";

    /* JADX INFO: renamed from: f0 */
    public float f60765f0 = 50.0f;

    /* JADX INFO: renamed from: g0 */
    public float f60767g0 = 50.0f;

    /* JADX INFO: renamed from: h0 */
    public float f60769h0 = 50.0f;

    /* JADX INFO: renamed from: i0 */
    public boolean f60771i0 = false;

    /* JADX INFO: renamed from: j0 */
    public int f60773j0 = 1;

    /* JADX INFO: renamed from: k0 */
    public int f60775k0 = 0;

    /* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState$a */
    public class C14501a extends HashMap<String, Object> {
        public C14501a(SilentLivenessState silentLivenessState) {
            put(StateEvent.Name.FSM_STATE_PAUSE, YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE);
            put(StateEvent.Name.UI_TIPS, StringCode.MSG_FSM_PAUSE);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m84674a(String str, int i, String str2) {
        HashMap<String, Object> map = new HashMap<>();
        map.put(StateEvent.Name.PROCESS_RESULT, str);
        map.put(StateEvent.Name.ERROR_CODE, Integer.valueOf(i));
        map.put("message", str2);
        YtFSM.getInstance().sendFSMEvent(map);
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void enter() {
        super.enter();
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void enterFirst() {
        YtLogger.m84640o("SilentLivenessState", makeStateInfo("SilentLivenessState", 1));
        this.stateData.put("detect_instance", this.f60747T);
        if (this.f60761d0) {
            return;
        }
        if (this.f60777m) {
            this.f60776l.start();
        } else {
            this.f60774k.start();
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void exit() {
        super.exit();
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void handleEvent(YtSDKKitFramework.YtFrameworkFireEventType ytFrameworkFireEventType, Object obj) {
        super.handleEvent(ytFrameworkFireEventType, obj);
        if (this.f60777m) {
            if (ytFrameworkFireEventType == YtSDKKitFramework.YtFrameworkFireEventType.YT_EVENT_TRIGGER_BEGIN_LIVENESS) {
                this.f60762e = 0;
                this.f60787w = true;
                if (this.f60761d0) {
                    return;
                }
                this.f60774k.reset();
                return;
            }
            if (ytFrameworkFireEventType == YtSDKKitFramework.YtFrameworkFireEventType.YT_EVENT_TRIGGER_CANCEL_LIVENESS) {
                this.f60762e = 0;
                this.f60787w = false;
                if (this.f60761d0) {
                    return;
                }
                this.f60774k.cancel();
                this.f60776l.reset();
            }
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void handleStateAction(String str, Object obj) {
        super.handleStateAction(str, null);
        if (this.f60761d0) {
            return;
        }
        if (!str.equals("reset_timeout")) {
            if (str.equals("reset_manual_trigger")) {
                this.f60787w = false;
                this.f60774k.cancel();
                return;
            }
            return;
        }
        YtLogger.m84637d("SilentLivenessState", "predetect status:" + this.f60776l.isRunning());
        if (this.f60776l.isRunning()) {
            return;
        }
        this.f60774k.reset();
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void loadStateWith(String str, JSONObject jSONObject, YtSdkConfig ytSdkConfig) {
        super.loadStateWith(str, jSONObject, ytSdkConfig);
        this.f60756b = YtSDKKitFramework.getInstance().getPreviewRect().width();
        int iHeight = YtSDKKitFramework.getInstance().getPreviewRect().height();
        this.f60754a = iHeight;
        int i = this.f60756b;
        if (i == 0 || iHeight == 0) {
            ig3.m135964a("Preview size is invalid!");
            return;
        }
        C14516o.f60805a = i;
        C14516o.f60806b = iHeight;
        this.f60760d = 1.0f;
        this.f60758c = 1.0f;
        YtLogger.m84640o("SilentLivenessState", "Camera size:" + this.f60756b + "*" + this.f60754a + "|mask size:" + this.f60760d + "*" + this.f60758c);
        try {
            if (this.f60768h) {
                YtLogger.m84639i("SilentLivenessState", "init from filesystem use local path : " + this.f60770i);
                this.f60747T = new YTFaceTracker(this.f60770i, this.f60763e0);
            } else {
                YtLogger.m84639i("SilentLivenessState", "init from asset");
                this.f60747T = new YTFaceTracker(YtFSM.getInstance().getContext().currentAppContext.getAssets(), "models/face-tracker-v003", this.f60763e0);
            }
            YTFaceTracker.Param param = this.f60747T.getParam();
            YtLogger.m84639i("SilentLivenessState", "big face mode" + this.f60788x);
            param.biggerFaceMode = this.f60788x ? 1 : 0;
            param.minFaceSize = Math.max(Math.min(this.f60756b, this.f60754a) / 5, 40);
            param.detInterval = this.f60789y;
            this.f60747T.setParam(param);
            YtLogger.m84640o("SilentLivenessState", "Detect version:" + YTFaceTracker.getVersion());
        } catch (Throwable th) {
            m84674a("failed", ErrorCode.YT_SDK_FACETRACE_INIT_FAILED, CommonUtils.makeMessageJson(ErrorCode.YT_SDK_FACETRACE_INIT_FAILED, StringCode.MSG_PARAM_ERROR, "Init YTFaceTrack SDK failed with "));
            th.printStackTrace();
        }
        reset();
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void moveToNextState() {
        int i;
        int i2;
        super.moveToNextState();
        boolean z = this.f60777m;
        if (!z || ((!this.f60743P || (i2 = this.f60764f) == 0 || i2 == 9) && !((this.f60759c0 && this.f60764f == 7) || (i = this.f60764f) == 8 || i == 1))) {
            this.f60744Q = 0;
        } else {
            int i3 = this.f60744Q + 1;
            this.f60744Q = i3;
            if (i3 > this.f60745R) {
                String strMakeMessageJson = CommonUtils.makeMessageJson(4194304, C14516o.m84678a(this.f60764f), "action check failed");
                HashMap<String, Object> map = new HashMap<>();
                map.put(StateEvent.Name.UI_TIPS, StringCode.RST_FAILED);
                map.put(StateEvent.Name.UI_ACTION, StateEvent.ActionValue.PROCESS_FIN);
                map.put(StateEvent.Name.PROCESS_RESULT, "failed");
                map.put(StateEvent.Name.ERROR_CODE, 4194304);
                map.put(StateEvent.Name.ERROR_REASON_CODE, 4194304);
                map.put("message", strMakeMessageJson);
                YtFSM.getInstance().sendFSMEvent(map);
                YtFSM.getInstance().transitNow(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.IDLE_STATE));
                return;
            }
        }
        if (!this.f60761d0 && z && this.f60776l.checkTimeout()) {
            YtLogger.m84637d("SilentLivenessState", "predectcountdowner.checkTimeout(): " + this.f60776l.checkTimeout());
            this.f60776l.cancel();
            YtSDKStats.getInstance().reportError(ErrorCode.YT_SDK_VERIFY_TIMEOUT, "yt_verify_step_timeout");
            YtFSM.getInstance().transitNow(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.TIMEOUT_STATE));
            return;
        }
        if (!this.f60761d0 && this.f60774k.checkTimeout()) {
            this.f60774k.cancel();
            YtLogger.m84637d("SilentLivenessState", "liveness timeout");
            YtSDKStats.getInstance().reportError(ErrorCode.YT_SDK_VERIFY_TIMEOUT, "yt_verify_step_timeout");
            YtFSM.getInstance().transitNow(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.TIMEOUT_STATE));
            return;
        }
        if (this.f60777m || this.f60772j || this.f60762e > this.f60790z) {
            this.f60772j = true;
            if (!this.f60761d0) {
                this.f60776l.cancel();
            }
            int iOrdinal = YtFSM.getInstance().getWorkMode().ordinal();
            if (iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4 || iOrdinal == 5) {
                YtFSM.getInstance().transitNow(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.QUALITY_STATE));
            }
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void reset() {
        this.f60764f = -1;
        this.f60762e = 0;
        this.f60785u = 0;
        this.f60757b0 = 0;
        this.f60787w = false;
        this.f60786v = 0;
        this.f60728A = -1.0E10f;
        this.f60731D = 1.0E10f;
        this.f60729B = 1.0E10f;
        this.f60730C = -1.0E10f;
        this.f60735H = -1.0E10f;
        this.f60772j = false;
        this.f60744Q = 0;
        this.f60752Y = 0;
        this.f60732E = -1.0E10f;
        this.f60740M = 0;
        this.f60749V = -1;
        this.f60741N = null;
        this.f60771i0 = false;
        this.f60775k0 = 0;
        if (!this.f60761d0) {
            this.f60774k.cancel();
            this.f60776l.cancel();
            if (this.f60777m) {
                this.f60776l.reset();
            } else {
                this.f60774k.reset();
            }
        }
        super.reset();
        this.stateData.put("detect_instance", this.f60747T);
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void unload() {
        super.unload();
        YTFaceTracker yTFaceTracker = this.f60747T;
        if (yTFaceTracker != null) {
            yTFaceTracker.destroy();
        }
        this.f60747T = null;
    }

    /* JADX WARN: Code duplicated, block: B:165:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:166:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:169:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:170:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:176:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:244:0x0632 A[LOOP:1: B:242:0x062d->B:244:0x0632, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:247:0x063e  */
    /* JADX WARN: Code duplicated, block: B:248:0x0654  */
    /* JADX WARN: Code duplicated, block: B:250:0x0668  */
    /* JADX WARN: Code duplicated, block: B:252:0x0670  */
    /* JADX WARN: Code duplicated, block: B:254:0x0676  */
    /* JADX WARN: Code duplicated, block: B:255:0x0679  */
    /* JADX WARN: Code duplicated, block: B:256:0x06a0  */
    /* JADX WARN: Code duplicated, block: B:258:0x06d1  */
    /* JADX WARN: Code duplicated, block: B:269:0x0739  */
    /* JADX WARN: Code duplicated, block: B:272:0x0758  */
    /* JADX WARN: Code duplicated, block: B:273:0x0772  */
    /* JADX WARN: Code duplicated, block: B:297:0x0638 A[EDGE_INSN: B:297:0x0638->B:245:0x0638 BREAK  A[LOOP:1: B:242:0x062d->B:244:0x0632], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x0260  */
    /* JADX WARN: Instruction removed from duplicated block: B:247:0x063e, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:255:0x0679, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:256:0x06a0, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:273:0x0772, please report this as an issue */
    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void update(YTImageData yTImageData, long j) {
        YTFaceTracker.TrackedFace[] trackedFaceArrM84685a;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int iM84675a;
        int i8;
        int iIntValue;
        int i9;
        YTFaceTracker.TrackedFace trackedFace;
        float fCalcMouthScore;
        float f;
        float f2;
        int i10;
        float[] fArr;
        float f3;
        int i11;
        super.update(yTImageData, j);
        if (this.f60761d0 && this.isPause.get()) {
            YtFSM.getInstance().sendFSMEvent(new C14501a(this));
            try {
                Thread.sleep(30L);
                return;
            } catch (InterruptedException e) {
                YtLogger.m84638e("SilentLivenessState", "Thread sleep error", e);
                return;
            }
        }
        if (yTImageData == null || yTImageData.imgData == null) {
            YtLogger.m84638e("SilentLivenessState", "image data is null", null);
            return;
        }
        if (!this.f60761d0 && (this.f60774k.checkTimeout() || (this.f60777m && this.f60776l.checkTimeout()))) {
            moveToNextState();
            return;
        }
        int i12 = 1;
        this.f60757b0++;
        CommonUtils.benchMarkBegin(Detect.TYPE);
        try {
            YTFaceTracker.TrackedFace[] trackedFaceArrTrack = this.f60747T.track(0, yTImageData.imgData, yTImageData.width, yTImageData.height, 0);
            CommonUtils.benchMarkEnd(Detect.TYPE);
            YtLogger.m84637d("SilentLivenessState", CommonUtils.getBenchMarkTime(Detect.TYPE));
            if (trackedFaceArrTrack == null || trackedFaceArrTrack.length == 0) {
                trackedFaceArrM84685a = null;
            } else {
                YtLogger.m84639i("SilentLivenessState", "face status count " + trackedFaceArrTrack.length);
                trackedFaceArrM84685a = C14516o.m84685a(trackedFaceArrTrack);
                int i13 = Integer.MIN_VALUE;
                int i14 = 0;
                for (int i15 = 0; i15 < trackedFaceArrM84685a.length; i15++) {
                    Rect rectM84677a = C14516o.m84677a(trackedFaceArrM84685a[i15]);
                    int iWidth = rectM84677a.width() * rectM84677a.height();
                    if (iWidth >= i13) {
                        i14 = i15;
                        i13 = iWidth;
                    }
                }
                if (i14 != 0) {
                    YtLogger.m84639i("o", "Found max face id:" + i14);
                    trackedFaceArrM84685a[0] = trackedFaceArrM84685a[i14];
                }
            }
            if (trackedFaceArrM84685a != null && trackedFaceArrM84685a.length > 0) {
                YTFaceTracker.TrackedFace trackedFace2 = trackedFaceArrM84685a[0];
                trackedFace2.faceRect = C14516o.m84677a(trackedFace2);
            }
            if (trackedFaceArrM84685a == null) {
                this.f60753Z = 1;
                i7 = 1;
                i12 = 1;
                i8 = -1;
                i = 2;
            } else {
                i = 2;
                if (trackedFaceArrM84685a.length <= 1) {
                    YTFaceTracker.TrackedFace trackedFace3 = trackedFaceArrM84685a[0];
                    if (!this.f60771i0) {
                        if (C14516o.m84683a(trackedFace3, this.f60765f0, this.f60767g0, this.f60769h0)) {
                            int i16 = this.f60775k0 + 1;
                            this.f60775k0 = i16;
                            if (i16 >= this.f60773j0) {
                                this.f60771i0 = true;
                            }
                        } else {
                            this.f60775k0 = 0;
                        }
                    }
                    if (this.f60771i0) {
                        Rect rectM84677a2 = C14516o.m84677a(trackedFace3);
                        Rect rect = this.f60741N;
                        if (rect == null) {
                            this.f60741N = rectM84677a2;
                            this.f60740M = 0;
                            i12 = 1;
                        } else {
                            Rect rectM84676a = C14516o.m84676a(rectM84677a2, rect);
                            if (rectM84677a2.height() != 0 && rectM84677a2.width() != 0) {
                                float fAbs = Math.abs(((rectM84676a.width() * rectM84676a.height()) / rectM84677a2.height()) / rectM84677a2.width());
                                if (fAbs < this.f60739L) {
                                    YtLogger.m84640o("SilentLivenessState", "face shaking:" + fAbs);
                                    this.f60755a0 = StringCode.FL_ACT_SCREEN_SHAKING;
                                    this.f60740M = 0;
                                } else {
                                    this.f60755a0 = "";
                                    this.f60740M++;
                                }
                            }
                            this.f60741N = rectM84677a2;
                        }
                        Rect detectRect = YtSDKKitFramework.getInstance().getDetectRect();
                        Rect rect2 = new Rect(0, 0, 0, 0);
                        YtLogger.m84637d("SilentLivenessState", "camera" + this.f60756b + BaseSei.f13930X + this.f60754a + " ratio " + this.f60760d + BaseSei.f13930X + this.f60758c);
                        YtLogger.m84637d("SilentLivenessState", "detectrect :" + detectRect.left + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + detectRect.top + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + detectRect.right + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + detectRect.bottom);
                        float f4 = (float) rectM84677a2.left;
                        float f5 = this.f60760d;
                        rect2.left = (int) (f4 * f5);
                        rect2.right = (int) (((float) rectM84677a2.right) * f5);
                        float f6 = (float) rectM84677a2.top;
                        float f7 = this.f60758c;
                        rect2.top = (int) (f6 * f7);
                        rect2.bottom = (int) (((float) rectM84677a2.bottom) * f7);
                        this.f60752Y = 0;
                        int i17 = 0;
                        while (true) {
                            float[] fArr2 = trackedFace3.faceShape;
                            if (i17 >= fArr2.length / 2) {
                                break;
                            }
                            int i18 = i17 * 2;
                            float f8 = fArr2[i18];
                            if (f8 > this.f60756b || f8 < 0.0f) {
                                this.f60752Y++;
                            } else {
                                float f9 = fArr2[i18 + 1];
                                if (f9 < 0.0f || f9 > this.f60754a) {
                                    this.f60752Y++;
                                }
                            }
                            i17++;
                        }
                        Rect rectM84676a2 = C14516o.m84676a(detectRect, rect2);
                        this.f60746S = Math.abs(((rectM84676a2.width() * rectM84676a2.height()) / rect2.width()) / rect2.height());
                        YtLogger.m84637d("SilentLivenessState", "faceInMask : " + rect2.left + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + rect2.top + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + rect2.right + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + rect2.bottom + " in rect ratio" + this.f60746S);
                        float fAbs2 = Math.abs(((float) (rectM84677a2.right - rectM84677a2.left)) / (((float) this.f60756b) * 1.0f));
                        YtFSMBaseState stateByName = YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.ACTION_STATE));
                        int i19 = (stateByName != null && stateByName.containsKey("current_action_type") && ((iIntValue = ((Integer) stateByName.getStateDataBy("current_action_type")).intValue()) == 3 || iIntValue == 4)) ? 0 : i12;
                        YtLogger.m84637d("SilentLivenessState", "face area ratio:" + fAbs2);
                        if (this.f60752Y >= 3) {
                            YtLogger.m84642w("SilentLivenessState", "face incomplete invalid point count:" + this.f60752Y, null);
                            i6 = 8;
                        } else {
                            if (fAbs2 > this.f60783s) {
                                YtLogger.m84642w("SilentLivenessState", "face too big:" + fAbs2, null);
                                if (fAbs2 <= this.f60783s + this.f60736I) {
                                    i5 = 3;
                                    i3 = i5;
                                    i4 = i12;
                                    i2 = 0;
                                } else {
                                    i6 = 3;
                                }
                            } else {
                                if (this.f60746S < this.f60734G) {
                                    YtLogger.m84642w("SilentLivenessState", "face not in rect ratio:" + this.f60746S, null);
                                    i2 = 0;
                                    i3 = 4;
                                } else {
                                    if (fAbs2 < this.f60784t) {
                                        YtLogger.m84642w("SilentLivenessState", "face too small:" + fAbs2, null);
                                        if (fAbs2 >= this.f60784t - this.f60737J) {
                                            i5 = 2;
                                        } else {
                                            i6 = 2;
                                        }
                                    } else if (i19 == 0 || (Math.abs(trackedFace3.pitch) <= this.f60780p && Math.abs(trackedFace3.yaw) <= this.f60781q && Math.abs(trackedFace3.roll) <= this.f60782r)) {
                                        if (!this.f60779o || YtFSM.getInstance().getWorkMode() == YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTION_TYPE || YtFSM.getInstance().getWorkMode() == YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTREFLECT_TYPE) {
                                            i2 = 0;
                                        } else {
                                            float fPreCheckCloseEyeScore = YtSDKKitCommon.ProcessHelper.preCheckCloseEyeScore(trackedFace3.faceShape);
                                            YtLogger.m84637d("SilentLivenessState", "eye score:" + fPreCheckCloseEyeScore + " cnt:" + this.f60785u);
                                            if (fPreCheckCloseEyeScore < this.f60778n) {
                                                this.f60785u++;
                                                int i20 = this.f60762e - 1;
                                                this.f60762e = i20;
                                                if (i20 < 0) {
                                                    i2 = 0;
                                                    this.f60762e = 0;
                                                } else {
                                                    i2 = 0;
                                                }
                                            } else {
                                                i2 = 0;
                                                this.f60785u = 0;
                                            }
                                            if (this.f60785u >= (YtFSM.getInstance().getWorkMode() != YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_SILENT_TYPE ? 10 : 4)) {
                                                this.f60785u = i2;
                                                i4 = i2;
                                                i3 = 6;
                                            }
                                        }
                                        i3 = i2;
                                        i4 = i3;
                                    } else {
                                        YtLogger.m84642w("SilentLivenessState", "face pose not right (" + trackedFace3.pitch + Constants.SEPARATOR_COMMA + trackedFace3.yaw + Constants.SEPARATOR_COMMA + trackedFace3.roll + ")", null);
                                        if (Math.abs(trackedFace3.pitch) > this.f60780p + this.f60738K || Math.abs(trackedFace3.yaw) > this.f60781q + this.f60738K || Math.abs(trackedFace3.roll) > this.f60782r + this.f60738K) {
                                            i2 = 0;
                                            i3 = 5;
                                        } else {
                                            i5 = 5;
                                        }
                                    }
                                    i3 = i5;
                                    i4 = i12;
                                    i2 = 0;
                                }
                                i4 = 0;
                            }
                            this.f60753Z = i3;
                            if (i4 != 0) {
                                i7 = 9;
                            } else {
                                i7 = i3;
                            }
                            iM84675a = C14516o.m84675a(trackedFaceArrM84685a[i2].faceVisible, this.f60748U);
                            if (this.f60749V != iM84675a) {
                                this.f60751X = i2;
                                this.f60749V = iM84675a;
                            } else {
                                this.f60751X++;
                            }
                            if (this.f60757b0 >= 7 || this.f60751X >= 7) {
                                this.f60750W = this.f60749V;
                                i8 = iM84675a;
                            } else {
                                i8 = this.f60750W;
                            }
                            YtLogger.m84639i("SilentLivenessState", "advise " + i7 + "|shelter " + i8);
                        }
                        i3 = i6;
                        i2 = 0;
                        i4 = 0;
                        this.f60753Z = i3;
                        if (i4 != 0) {
                            i7 = 9;
                        } else {
                            i7 = i3;
                        }
                        iM84675a = C14516o.m84675a(trackedFaceArrM84685a[i2].faceVisible, this.f60748U);
                        if (this.f60749V != iM84675a) {
                            this.f60751X = i2;
                            this.f60749V = iM84675a;
                        } else {
                            this.f60751X++;
                        }
                        if (this.f60757b0 >= 7) {
                            this.f60750W = this.f60749V;
                            i8 = iM84675a;
                        } else {
                            this.f60750W = this.f60749V;
                            i8 = iM84675a;
                        }
                        YtLogger.m84639i("SilentLivenessState", "advise " + i7 + "|shelter " + i8);
                    } else {
                        YtLogger.m84637d("SilentLivenessState", "correction face failure");
                        HashMap<String, Object> map = new HashMap<>();
                        map.put(StateEvent.Name.UI_ACTION, StateEvent.ActionValue.STAGE_NOTPASS);
                        map.put(StateEvent.Name.UI_TIPS, StringCode.FL_POSE_INCORRECT);
                        YtFSM.getInstance().sendFSMEvent(map);
                    }
                    this.stateData.put("pose_state", Integer.valueOf(this.f60764f));
                    this.stateData.put("shelter_state", Integer.valueOf(this.f60766g));
                    this.stateData.put("face_status", trackedFaceArrM84685a);
                    this.stateData.put("continuous_detect_count", Integer.valueOf(this.f60762e));
                    this.stateData.put("last_face_status", trackedFaceArrM84685a);
                    this.stateData.put("last_frame", yTImageData);
                    YtLogger.m84640o("SilentLivenessState", C14516o.m84680a(trackedFaceArrM84685a, this.f60766g, this.f60764f));
                    i9 = this.f60764f;
                    if ((i9 != 0 || i9 == 9) && trackedFaceArrM84685a != null && trackedFaceArrM84685a.length > 0) {
                        trackedFace = trackedFaceArrM84685a[0];
                        float[] fArrCalcEyeScore = YtSDKKitCommon.ProcessHelper.calcEyeScore(trackedFace.faceShape);
                        fCalcMouthScore = YtSDKKitCommon.ProcessHelper.calcMouthScore(trackedFace.faceShape);
                        f = fArrCalcEyeScore[0] + fArrCalcEyeScore[1];
                        f2 = 0.0f;
                        i10 = 0;
                        while (true) {
                            fArr = trackedFace.faceVisible;
                            if (i10 >= fArr.length) {
                                break;
                            }
                            f2 += fArr[i10];
                            i10++;
                        }
                        if (this.f60740M < this.f60790z) {
                            YtLogger.m84638e("SilentLivenessState", "stable count " + this.f60740M, null);
                        } else {
                            f3 = this.f60746S;
                            if (f3 >= ((double) this.f60732E) - 0.05d) {
                                this.f60732E = f3;
                                if (!this.f60742O) {
                                    YtLogger.m84637d("SilentLivenessState", "test2 shelter score " + f2 + " inRectThreshold " + this.f60746S + " eye " + f + " mouth " + fCalcMouthScore);
                                    if (f >= ((double) this.f60728A) - 0.05d && fCalcMouthScore <= Math.max(this.f60731D, 15.0f) && Math.abs(trackedFace.yaw) <= this.f60765f0 && Math.abs(trackedFace.pitch) <= this.f60767g0 && Math.abs(trackedFace.roll) <= this.f60769h0) {
                                        YtLogger.m84637d("SilentLivenessState", "best shelter score " + f2 + " inRectThreshold " + this.f60746S);
                                        this.f60728A = f;
                                        this.f60731D = fCalcMouthScore;
                                        this.stateData.put("best_image", yTImageData);
                                        this.stateData.put("best_shape", trackedFace.faceShape);
                                        this.stateData.put("best_face_status", trackedFace);
                                    }
                                    if (f < this.f60729B) {
                                        this.f60729B = f;
                                        this.stateData.put("closeeye_image", yTImageData);
                                        this.stateData.put("closeeye_shape", trackedFace.faceShape);
                                        this.stateData.put("closeeye_face_status", trackedFace);
                                    }
                                    if (fCalcMouthScore > this.f60730C) {
                                        this.f60730C = fCalcMouthScore;
                                        this.stateData.put("openmouth_image", yTImageData);
                                        this.stateData.put("openmouth_shape", trackedFace.faceShape);
                                        this.stateData.put("openmouth_face_status", trackedFace);
                                    }
                                } else if (this.f60735H <= f2) {
                                    this.f60735H = f2;
                                    YtLogger.m84637d("SilentLivenessState", "test2 shelter score " + f2 + " inRectThreshold " + this.f60746S + " eye " + f + " mouth " + fCalcMouthScore);
                                    if (f >= ((double) this.f60728A) - 0.05d) {
                                        YtLogger.m84637d("SilentLivenessState", "best shelter score " + f2 + " inRectThreshold " + this.f60746S);
                                        this.f60728A = f;
                                        this.f60731D = fCalcMouthScore;
                                        this.stateData.put("best_image", yTImageData);
                                        this.stateData.put("best_shape", trackedFace.faceShape);
                                        this.stateData.put("best_face_status", trackedFace);
                                    }
                                    if (f < this.f60729B) {
                                        this.f60729B = f;
                                        this.stateData.put("closeeye_image", yTImageData);
                                        this.stateData.put("closeeye_shape", trackedFace.faceShape);
                                        this.stateData.put("closeeye_face_status", trackedFace);
                                    }
                                    if (fCalcMouthScore > this.f60730C) {
                                        this.f60730C = fCalcMouthScore;
                                        this.stateData.put("openmouth_image", yTImageData);
                                        this.stateData.put("openmouth_shape", trackedFace.faceShape);
                                        this.stateData.put("openmouth_face_status", trackedFace);
                                    }
                                } else {
                                    YtLogger.m84637d("SilentLivenessState", "test1 shelter score " + f2 + " inRectThreshold " + this.f60746S + " eye " + f + " mouth " + fCalcMouthScore);
                                }
                            } else {
                                YtLogger.m84637d("SilentLivenessState", "test3 shelter score " + f2 + " inRectThreshold " + this.f60746S + " (" + this.f60732E + ") eye " + f + " mouth " + fCalcMouthScore);
                            }
                        }
                    }
                    if (this.f60775k0 >= this.f60773j0 || this.stateData.get("best_image") == null) {
                    }
                    boolean z = this.f60777m;
                    if (!z || (z && this.f60787w)) {
                        moveToNextState();
                        return;
                    }
                    return;
                }
                if (this.f60759c0) {
                    this.f60762e = 0;
                    this.f60764f = 7;
                    i7 = 7;
                } else {
                    i7 = -1;
                }
                this.f60753Z = 7;
                i12 = 1;
                i8 = -1;
            }
            HashMap<String, Object> map2 = new HashMap<>();
            if ((i7 == 0 || i7 == 9) && i8 == 0) {
                this.f60762e++;
            } else {
                map2.put(StateEvent.Name.UI_ACTION, StateEvent.ActionValue.STAGE_NOTPASS);
                this.f60762e = 0;
            }
            if (i7 == this.f60764f && i8 == this.f60766g) {
                this.f60786v++;
            } else {
                this.f60786v = 0;
            }
            if (!this.f60733F || this.f60786v <= 3 || this.f60753Z != i7) {
                this.f60764f = i7;
                this.f60766g = i8;
                YtLogger.m84637d("SilentLivenessState", " tips:" + C14516o.m84678a(this.f60753Z));
                int i21 = this.f60753Z;
                if (i21 != 0 && i21 != 9) {
                    map2.put(StateEvent.Name.UI_TIPS, C14516o.m84678a(i21));
                } else if (i8 == i12) {
                    map2.put(StateEvent.Name.UI_TIPS, StringCode.FL_NO_LEFT_FACE);
                } else if (i8 == i) {
                    map2.put(StateEvent.Name.UI_TIPS, StringCode.FL_NO_CHIN);
                } else if (i8 == 3) {
                    map2.put(StateEvent.Name.UI_TIPS, StringCode.FL_NO_MOUTH);
                } else if (i8 == 4) {
                    map2.put(StateEvent.Name.UI_TIPS, StringCode.FL_NO_RIGHT_FACE);
                } else if (i8 == 5) {
                    map2.put(StateEvent.Name.UI_TIPS, StringCode.FL_NO_NOSE);
                } else if (i8 == 6) {
                    map2.put(StateEvent.Name.UI_TIPS, StringCode.FL_NO_RIGHT_EYE);
                } else if (i8 == 7) {
                    map2.put(StateEvent.Name.UI_TIPS, StringCode.FL_NO_LEFT_EYE);
                } else if (i8 == 0 && (i11 = this.f60786v) > 2 && i11 < 5) {
                    map2.put(StateEvent.Name.UI_TIPS, StringCode.FL_POSE_KEEP);
                    map2.put(StateEvent.Name.UI_ACTION, StateEvent.ActionValue.STAGE_PASS);
                }
                String str = this.f60755a0;
                if (str != "") {
                    map2.put(StateEvent.Name.UI_EXTRA_TIPS, str);
                }
                YtFSM.getInstance().sendFSMEvent(map2);
            }
            this.stateData.put("pose_state", Integer.valueOf(this.f60764f));
            this.stateData.put("shelter_state", Integer.valueOf(this.f60766g));
            this.stateData.put("face_status", trackedFaceArrM84685a);
            this.stateData.put("continuous_detect_count", Integer.valueOf(this.f60762e));
            this.stateData.put("last_face_status", trackedFaceArrM84685a);
            this.stateData.put("last_frame", yTImageData);
            YtLogger.m84640o("SilentLivenessState", C14516o.m84680a(trackedFaceArrM84685a, this.f60766g, this.f60764f));
            i9 = this.f60764f;
            if (i9 != 0) {
                trackedFace = trackedFaceArrM84685a[0];
                float[] fArrCalcEyeScore2 = YtSDKKitCommon.ProcessHelper.calcEyeScore(trackedFace.faceShape);
                fCalcMouthScore = YtSDKKitCommon.ProcessHelper.calcMouthScore(trackedFace.faceShape);
                f = fArrCalcEyeScore2[0] + fArrCalcEyeScore2[1];
                f2 = 0.0f;
                i10 = 0;
                while (true) {
                    fArr = trackedFace.faceVisible;
                    if (i10 >= fArr.length) {
                        break;
                        break;
                    } else {
                        f2 += fArr[i10];
                        i10++;
                    }
                }
                if (this.f60740M < this.f60790z) {
                    YtLogger.m84638e("SilentLivenessState", "stable count " + this.f60740M, null);
                } else {
                    f3 = this.f60746S;
                    if (f3 >= ((double) this.f60732E) - 0.05d) {
                        this.f60732E = f3;
                        if (!this.f60742O) {
                            YtLogger.m84637d("SilentLivenessState", "test2 shelter score " + f2 + " inRectThreshold " + this.f60746S + " eye " + f + " mouth " + fCalcMouthScore);
                            if (f >= ((double) this.f60728A) - 0.05d) {
                                YtLogger.m84637d("SilentLivenessState", "best shelter score " + f2 + " inRectThreshold " + this.f60746S);
                                this.f60728A = f;
                                this.f60731D = fCalcMouthScore;
                                this.stateData.put("best_image", yTImageData);
                                this.stateData.put("best_shape", trackedFace.faceShape);
                                this.stateData.put("best_face_status", trackedFace);
                            }
                            if (f < this.f60729B) {
                                this.f60729B = f;
                                this.stateData.put("closeeye_image", yTImageData);
                                this.stateData.put("closeeye_shape", trackedFace.faceShape);
                                this.stateData.put("closeeye_face_status", trackedFace);
                            }
                            if (fCalcMouthScore > this.f60730C) {
                                this.f60730C = fCalcMouthScore;
                                this.stateData.put("openmouth_image", yTImageData);
                                this.stateData.put("openmouth_shape", trackedFace.faceShape);
                                this.stateData.put("openmouth_face_status", trackedFace);
                            }
                        } else if (this.f60735H <= f2) {
                            this.f60735H = f2;
                            YtLogger.m84637d("SilentLivenessState", "test2 shelter score " + f2 + " inRectThreshold " + this.f60746S + " eye " + f + " mouth " + fCalcMouthScore);
                            if (f >= ((double) this.f60728A) - 0.05d) {
                                YtLogger.m84637d("SilentLivenessState", "best shelter score " + f2 + " inRectThreshold " + this.f60746S);
                                this.f60728A = f;
                                this.f60731D = fCalcMouthScore;
                                this.stateData.put("best_image", yTImageData);
                                this.stateData.put("best_shape", trackedFace.faceShape);
                                this.stateData.put("best_face_status", trackedFace);
                            }
                            if (f < this.f60729B) {
                                this.f60729B = f;
                                this.stateData.put("closeeye_image", yTImageData);
                                this.stateData.put("closeeye_shape", trackedFace.faceShape);
                                this.stateData.put("closeeye_face_status", trackedFace);
                            }
                            if (fCalcMouthScore > this.f60730C) {
                                this.f60730C = fCalcMouthScore;
                                this.stateData.put("openmouth_image", yTImageData);
                                this.stateData.put("openmouth_shape", trackedFace.faceShape);
                                this.stateData.put("openmouth_face_status", trackedFace);
                            }
                        } else {
                            YtLogger.m84637d("SilentLivenessState", "test1 shelter score " + f2 + " inRectThreshold " + this.f60746S + " eye " + f + " mouth " + fCalcMouthScore);
                        }
                    } else {
                        YtLogger.m84637d("SilentLivenessState", "test3 shelter score " + f2 + " inRectThreshold " + this.f60746S + " (" + this.f60732E + ") eye " + f + " mouth " + fCalcMouthScore);
                    }
                }
            } else {
                trackedFace = trackedFaceArrM84685a[0];
                float[] fArrCalcEyeScore3 = YtSDKKitCommon.ProcessHelper.calcEyeScore(trackedFace.faceShape);
                fCalcMouthScore = YtSDKKitCommon.ProcessHelper.calcMouthScore(trackedFace.faceShape);
                f = fArrCalcEyeScore3[0] + fArrCalcEyeScore3[1];
                f2 = 0.0f;
                i10 = 0;
                while (true) {
                    fArr = trackedFace.faceVisible;
                    if (i10 >= fArr.length) {
                        break;
                        break;
                    } else {
                        f2 += fArr[i10];
                        i10++;
                    }
                }
                if (this.f60740M < this.f60790z) {
                    YtLogger.m84638e("SilentLivenessState", "stable count " + this.f60740M, null);
                } else {
                    f3 = this.f60746S;
                    if (f3 >= ((double) this.f60732E) - 0.05d) {
                        this.f60732E = f3;
                        if (!this.f60742O) {
                            YtLogger.m84637d("SilentLivenessState", "test2 shelter score " + f2 + " inRectThreshold " + this.f60746S + " eye " + f + " mouth " + fCalcMouthScore);
                            if (f >= ((double) this.f60728A) - 0.05d) {
                                YtLogger.m84637d("SilentLivenessState", "best shelter score " + f2 + " inRectThreshold " + this.f60746S);
                                this.f60728A = f;
                                this.f60731D = fCalcMouthScore;
                                this.stateData.put("best_image", yTImageData);
                                this.stateData.put("best_shape", trackedFace.faceShape);
                                this.stateData.put("best_face_status", trackedFace);
                            }
                            if (f < this.f60729B) {
                                this.f60729B = f;
                                this.stateData.put("closeeye_image", yTImageData);
                                this.stateData.put("closeeye_shape", trackedFace.faceShape);
                                this.stateData.put("closeeye_face_status", trackedFace);
                            }
                            if (fCalcMouthScore > this.f60730C) {
                                this.f60730C = fCalcMouthScore;
                                this.stateData.put("openmouth_image", yTImageData);
                                this.stateData.put("openmouth_shape", trackedFace.faceShape);
                                this.stateData.put("openmouth_face_status", trackedFace);
                            }
                        } else if (this.f60735H <= f2) {
                            this.f60735H = f2;
                            YtLogger.m84637d("SilentLivenessState", "test2 shelter score " + f2 + " inRectThreshold " + this.f60746S + " eye " + f + " mouth " + fCalcMouthScore);
                            if (f >= ((double) this.f60728A) - 0.05d) {
                                YtLogger.m84637d("SilentLivenessState", "best shelter score " + f2 + " inRectThreshold " + this.f60746S);
                                this.f60728A = f;
                                this.f60731D = fCalcMouthScore;
                                this.stateData.put("best_image", yTImageData);
                                this.stateData.put("best_shape", trackedFace.faceShape);
                                this.stateData.put("best_face_status", trackedFace);
                            }
                            if (f < this.f60729B) {
                                this.f60729B = f;
                                this.stateData.put("closeeye_image", yTImageData);
                                this.stateData.put("closeeye_shape", trackedFace.faceShape);
                                this.stateData.put("closeeye_face_status", trackedFace);
                            }
                            if (fCalcMouthScore > this.f60730C) {
                                this.f60730C = fCalcMouthScore;
                                this.stateData.put("openmouth_image", yTImageData);
                                this.stateData.put("openmouth_shape", trackedFace.faceShape);
                                this.stateData.put("openmouth_face_status", trackedFace);
                            }
                        } else {
                            YtLogger.m84637d("SilentLivenessState", "test1 shelter score " + f2 + " inRectThreshold " + this.f60746S + " eye " + f + " mouth " + fCalcMouthScore);
                        }
                    } else {
                        YtLogger.m84637d("SilentLivenessState", "test3 shelter score " + f2 + " inRectThreshold " + this.f60746S + " (" + this.f60732E + ") eye " + f + " mouth " + fCalcMouthScore);
                    }
                }
            }
            if (this.f60775k0 >= this.f60773j0) {
            }
        } catch (Exception e2) {
            YtLogger.m84638e("SilentLivenessState", "track error ", e2);
            m84674a("failed", ErrorCode.YT_SDK_VERIFY_FACE_ERROR, CommonUtils.makeMessageJson(ErrorCode.YT_SDK_VERIFY_FACE_ERROR, StringCode.MSG_FACETRACK_ERROR, "YTFaceTrack track failed"));
            e2.printStackTrace();
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void updateSDKSetting(JSONObject jSONObject) {
        try {
            if (jSONObject.has("check_eye_open")) {
                this.f60779o = jSONObject.getBoolean("check_eye_open");
            }
            if (jSONObject.has("open_eye_threshold")) {
                this.f60778n = (float) jSONObject.getDouble("open_eye_threshold");
            }
            if (jSONObject.has("pitch_threshold")) {
                this.f60780p = jSONObject.getInt("pitch_threshold");
            }
            if (jSONObject.has("yaw_threshold")) {
                this.f60781q = jSONObject.getInt("yaw_threshold");
            }
            if (jSONObject.has("roll_threshold")) {
                this.f60782r = jSONObject.getInt("roll_threshold");
            }
            if (jSONObject.has("smallface_ratio_threshold")) {
                this.f60784t = (float) jSONObject.getDouble("smallface_ratio_threshold");
            }
            if (jSONObject.has("bigface_ratio_threshold")) {
                this.f60783s = (float) jSONObject.getDouble("bigface_ratio_threshold");
            }
            if (jSONObject.has("blur_detect_threshold")) {
                jSONObject.getDouble("blur_detect_threshold");
            }
            if (jSONObject.has("need_big_face_mode")) {
                this.f60788x = jSONObject.getBoolean("need_big_face_mode");
            }
            if (jSONObject.has("detect_interval")) {
                this.f60789y = jSONObject.getInt("detect_interval");
            }
            if (jSONObject.has("stable_frame_num")) {
                this.f60790z = jSONObject.getInt("stable_frame_num");
            }
            if (jSONObject.has("net_request_timeout_ms")) {
                YtSDKKitFramework.getInstance().setNetworkRequestTimeoutMS(jSONObject.getInt("net_request_timeout_ms"));
            }
            if (jSONObject.has("force_pose_check")) {
                this.f60743P = jSONObject.getBoolean("force_pose_check");
            }
            if (jSONObject.has("novalid_face_count")) {
                this.f60745R = jSONObject.getInt("novalid_face_count");
            }
            if (jSONObject.has("in_rect_ratio_threshold")) {
                this.f60734G = (float) jSONObject.getDouble("in_rect_ratio_threshold");
            }
            if (jSONObject.has("need_check_shelter")) {
                this.f60742O = jSONObject.getBoolean("need_check_shelter");
            }
            if (jSONObject.has("stable_roi_threshold")) {
                this.f60739L = (float) jSONObject.getDouble("stable_roi_threshold");
            }
            if (jSONObject.has("need_close_timeout")) {
                this.f60761d0 = jSONObject.getBoolean("need_close_timeout");
            }
            if (jSONObject.has("resource_online")) {
                this.f60768h = jSONObject.getBoolean("resource_online");
            }
            if (jSONObject.has("resource_download_path")) {
                this.f60770i = jSONObject.getString("resource_download_path");
            }
            if (jSONObject.has("timeout_countdown_ms")) {
                this.f60774k.init(Math.max(0, Math.min(30000, jSONObject.getInt("timeout_countdown_ms"))), true);
            }
            boolean zHas = jSONObject.has("predetect_countdown_ms");
            TimeoutCounter timeoutCounter = this.f60776l;
            if (zHas) {
                timeoutCounter.init(jSONObject.getInt("predetect_countdown_ms"), true);
            } else {
                timeoutCounter.init(25000L, true);
            }
            if (jSONObject.has("same_tips_filter")) {
                this.f60733F = jSONObject.getBoolean("same_tips_filter");
            }
            if (jSONObject.has("manual_trigger")) {
                this.f60777m = jSONObject.getBoolean("manual_trigger");
            }
            if (jSONObject.has("secondary_yaw_threshold")) {
                this.f60765f0 = (float) jSONObject.getDouble("secondary_yaw_threshold");
            }
            if (jSONObject.has("secondary_pitch_threshold")) {
                this.f60767g0 = (float) jSONObject.getDouble("secondary_pitch_threshold");
            }
            if (jSONObject.has("secondary_roll_threshold")) {
                this.f60769h0 = (float) jSONObject.getDouble("secondary_roll_threshold");
            }
            if (jSONObject.has("continuous_angle_num_threshold")) {
                this.f60773j0 = jSONObject.getInt("continuous_angle_num_threshold");
            }
            boolean zOptBoolean = jSONObject.optBoolean("need_local_face_best_image", false);
            boolean zOptBoolean2 = jSONObject.optBoolean("relaxed_shelter_threshold", false);
            int iOptInt = jSONObject.optInt("shelter_judge_level", 0);
            if ((zOptBoolean || zOptBoolean2) && iOptInt <= 1) {
                iOptInt = 10;
            }
            this.f60748U = new C14516o.a(iOptInt);
            this.f60763e0 = jSONObject.optString("model_config_ini_name", "yt_model_config.ini");
            this.f60759c0 = jSONObject.optBoolean("need_check_multiface", false);
            this.f60736I = (float) jSONObject.optDouble("bigface_ratio_buffer", 0.05000000074505806d);
            this.f60737J = (float) jSONObject.optDouble("smallface_ratio_buffer", 0.05000000074505806d);
            this.f60738K = (float) jSONObject.optDouble("pose_ratio_buffer", 0.05000000074505806d);
            this.f60739L = (float) jSONObject.optDouble("stable_roi_threshold", 0.8999999761581421d);
        } catch (JSONException e) {
            YtLogger.m84638e("SilentLivenessState", "Failed to parse json:", e);
        }
    }
}
