package com.tencent.youtu.sdkkitframework.liveness;

import android.graphics.Rect;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.Detect;
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
import p153l.wg3;

/* JADX INFO: loaded from: classes2.dex */
public class SilentLivenessState extends YtFSMBaseState {

    /* JADX INFO: renamed from: Y */
    public int f61599Y;

    /* JADX INFO: renamed from: a */
    public int f61601a;

    /* JADX INFO: renamed from: b */
    public int f61603b;

    /* JADX INFO: renamed from: c */
    public float f61605c;

    /* JADX INFO: renamed from: d */
    public float f61607d;

    /* JADX INFO: renamed from: e */
    public int f61609e = 0;

    /* JADX INFO: renamed from: f */
    public int f61611f = -1;

    /* JADX INFO: renamed from: g */
    public int f61613g = -1;

    /* JADX INFO: renamed from: h */
    public boolean f61615h = false;

    /* JADX INFO: renamed from: i */
    public String f61617i = "";

    /* JADX INFO: renamed from: j */
    public boolean f61619j = false;

    /* JADX INFO: renamed from: k */
    public TimeoutCounter f61621k = new TimeoutCounter("Liveness timeout counter");

    /* JADX INFO: renamed from: l */
    public TimeoutCounter f61623l = new TimeoutCounter("Predetect timeout counter");

    /* JADX INFO: renamed from: m */
    public boolean f61624m = false;

    /* JADX INFO: renamed from: n */
    public float f61625n = 0.22f;

    /* JADX INFO: renamed from: o */
    public boolean f61626o = false;

    /* JADX INFO: renamed from: p */
    public int f61627p = 30;

    /* JADX INFO: renamed from: q */
    public int f61628q = 25;

    /* JADX INFO: renamed from: r */
    public int f61629r = 25;

    /* JADX INFO: renamed from: s */
    public float f61630s = 1.0f;

    /* JADX INFO: renamed from: t */
    public float f61631t = 0.5f;

    /* JADX INFO: renamed from: u */
    public int f61632u = 0;

    /* JADX INFO: renamed from: v */
    public int f61633v = 0;

    /* JADX INFO: renamed from: w */
    public boolean f61634w = false;

    /* JADX INFO: renamed from: x */
    public boolean f61635x = true;

    /* JADX INFO: renamed from: y */
    public int f61636y = 5;

    /* JADX INFO: renamed from: z */
    public int f61637z = 5;

    /* JADX INFO: renamed from: A */
    public float f61575A = -1.0E10f;

    /* JADX INFO: renamed from: B */
    public float f61576B = 1.0E10f;

    /* JADX INFO: renamed from: C */
    public float f61577C = -1.0E10f;

    /* JADX INFO: renamed from: D */
    public float f61578D = 1.0E10f;

    /* JADX INFO: renamed from: E */
    public float f61579E = -1.0E10f;

    /* JADX INFO: renamed from: F */
    public boolean f61580F = true;

    /* JADX INFO: renamed from: G */
    public float f61581G = 0.7f;

    /* JADX INFO: renamed from: H */
    public float f61582H = -1.0E10f;

    /* JADX INFO: renamed from: I */
    public float f61583I = 0.05f;

    /* JADX INFO: renamed from: J */
    public float f61584J = 0.05f;

    /* JADX INFO: renamed from: K */
    public float f61585K = 0.05f;

    /* JADX INFO: renamed from: L */
    public float f61586L = 0.9f;

    /* JADX INFO: renamed from: M */
    public int f61587M = 0;

    /* JADX INFO: renamed from: N */
    public Rect f61588N = null;

    /* JADX INFO: renamed from: O */
    public boolean f61589O = true;

    /* JADX INFO: renamed from: P */
    public boolean f61590P = false;

    /* JADX INFO: renamed from: Q */
    public int f61591Q = 0;

    /* JADX INFO: renamed from: R */
    public int f61592R = 5;

    /* JADX INFO: renamed from: S */
    public float f61593S = -1.0E10f;

    /* JADX INFO: renamed from: T */
    public YTFaceTracker f61594T = null;

    /* JADX INFO: renamed from: U */
    public C14664o.a f61595U = null;

    /* JADX INFO: renamed from: V */
    public int f61596V = -1;

    /* JADX INFO: renamed from: W */
    public int f61597W = 0;

    /* JADX INFO: renamed from: X */
    public int f61598X = 0;

    /* JADX INFO: renamed from: Z */
    public int f61600Z = 0;

    /* JADX INFO: renamed from: a0 */
    public String f61602a0 = "";

    /* JADX INFO: renamed from: b0 */
    public int f61604b0 = 0;

    /* JADX INFO: renamed from: c0 */
    public boolean f61606c0 = false;

    /* JADX INFO: renamed from: d0 */
    public boolean f61608d0 = false;

    /* JADX INFO: renamed from: e0 */
    public String f61610e0 = "yt_model_config.ini";

    /* JADX INFO: renamed from: f0 */
    public float f61612f0 = 50.0f;

    /* JADX INFO: renamed from: g0 */
    public float f61614g0 = 50.0f;

    /* JADX INFO: renamed from: h0 */
    public float f61616h0 = 50.0f;

    /* JADX INFO: renamed from: i0 */
    public boolean f61618i0 = false;

    /* JADX INFO: renamed from: j0 */
    public int f61620j0 = 1;

    /* JADX INFO: renamed from: k0 */
    public int f61622k0 = 0;

    /* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState$a */
    public class C14649a extends HashMap<String, Object> {
        public C14649a(SilentLivenessState silentLivenessState) {
            put(StateEvent.Name.FSM_STATE_PAUSE, YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE);
            put(StateEvent.Name.UI_TIPS, StringCode.MSG_FSM_PAUSE);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m85845a(String str, int i, String str2) {
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
        YtLogger.m85811o("SilentLivenessState", makeStateInfo("SilentLivenessState", 1));
        this.stateData.put("detect_instance", this.f61594T);
        if (this.f61608d0) {
            return;
        }
        if (this.f61624m) {
            this.f61623l.start();
        } else {
            this.f61621k.start();
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void exit() {
        super.exit();
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void handleEvent(YtSDKKitFramework.YtFrameworkFireEventType ytFrameworkFireEventType, Object obj) {
        super.handleEvent(ytFrameworkFireEventType, obj);
        if (this.f61624m) {
            if (ytFrameworkFireEventType == YtSDKKitFramework.YtFrameworkFireEventType.YT_EVENT_TRIGGER_BEGIN_LIVENESS) {
                this.f61609e = 0;
                this.f61634w = true;
                if (this.f61608d0) {
                    return;
                }
                this.f61621k.reset();
                return;
            }
            if (ytFrameworkFireEventType == YtSDKKitFramework.YtFrameworkFireEventType.YT_EVENT_TRIGGER_CANCEL_LIVENESS) {
                this.f61609e = 0;
                this.f61634w = false;
                if (this.f61608d0) {
                    return;
                }
                this.f61621k.cancel();
                this.f61623l.reset();
            }
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void handleStateAction(String str, Object obj) {
        super.handleStateAction(str, null);
        if (this.f61608d0) {
            return;
        }
        if (!str.equals("reset_timeout")) {
            if (str.equals("reset_manual_trigger")) {
                this.f61634w = false;
                this.f61621k.cancel();
                return;
            }
            return;
        }
        YtLogger.m85808d("SilentLivenessState", "predetect status:" + this.f61623l.isRunning());
        if (this.f61623l.isRunning()) {
            return;
        }
        this.f61621k.reset();
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void loadStateWith(String str, JSONObject jSONObject, YtSdkConfig ytSdkConfig) {
        super.loadStateWith(str, jSONObject, ytSdkConfig);
        this.f61603b = YtSDKKitFramework.getInstance().getPreviewRect().width();
        int iHeight = YtSDKKitFramework.getInstance().getPreviewRect().height();
        this.f61601a = iHeight;
        int i = this.f61603b;
        if (i == 0 || iHeight == 0) {
            wg3.m206174a("Preview size is invalid!");
            return;
        }
        C14664o.f61652a = i;
        C14664o.f61653b = iHeight;
        this.f61607d = 1.0f;
        this.f61605c = 1.0f;
        YtLogger.m85811o("SilentLivenessState", "Camera size:" + this.f61603b + "*" + this.f61601a + "|mask size:" + this.f61607d + "*" + this.f61605c);
        try {
            if (this.f61615h) {
                YtLogger.m85810i("SilentLivenessState", "init from filesystem use local path : " + this.f61617i);
                this.f61594T = new YTFaceTracker(this.f61617i, this.f61610e0);
            } else {
                YtLogger.m85810i("SilentLivenessState", "init from asset");
                this.f61594T = new YTFaceTracker(YtFSM.getInstance().getContext().currentAppContext.getAssets(), "models/face-tracker-v003", this.f61610e0);
            }
            YTFaceTracker.Param param = this.f61594T.getParam();
            YtLogger.m85810i("SilentLivenessState", "big face mode" + this.f61635x);
            param.biggerFaceMode = this.f61635x ? 1 : 0;
            param.minFaceSize = Math.max(Math.min(this.f61603b, this.f61601a) / 5, 40);
            param.detInterval = this.f61636y;
            this.f61594T.setParam(param);
            YtLogger.m85811o("SilentLivenessState", "Detect version:" + YTFaceTracker.getVersion());
        } catch (Throwable th) {
            m85845a("failed", ErrorCode.YT_SDK_FACETRACE_INIT_FAILED, CommonUtils.makeMessageJson(ErrorCode.YT_SDK_FACETRACE_INIT_FAILED, StringCode.MSG_PARAM_ERROR, "Init YTFaceTrack SDK failed with "));
            th.printStackTrace();
        }
        reset();
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void moveToNextState() {
        int i;
        int i2;
        super.moveToNextState();
        boolean z = this.f61624m;
        if (!z || ((!this.f61590P || (i2 = this.f61611f) == 0 || i2 == 9) && !((this.f61606c0 && this.f61611f == 7) || (i = this.f61611f) == 8 || i == 1))) {
            this.f61591Q = 0;
        } else {
            int i3 = this.f61591Q + 1;
            this.f61591Q = i3;
            if (i3 > this.f61592R) {
                String strMakeMessageJson = CommonUtils.makeMessageJson(4194304, C14664o.m85849a(this.f61611f), "action check failed");
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
        if (!this.f61608d0 && z && this.f61623l.checkTimeout()) {
            YtLogger.m85808d("SilentLivenessState", "predectcountdowner.checkTimeout(): " + this.f61623l.checkTimeout());
            this.f61623l.cancel();
            YtSDKStats.getInstance().reportError(ErrorCode.YT_SDK_VERIFY_TIMEOUT, "yt_verify_step_timeout");
            YtFSM.getInstance().transitNow(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.TIMEOUT_STATE));
            return;
        }
        if (!this.f61608d0 && this.f61621k.checkTimeout()) {
            this.f61621k.cancel();
            YtLogger.m85808d("SilentLivenessState", "liveness timeout");
            YtSDKStats.getInstance().reportError(ErrorCode.YT_SDK_VERIFY_TIMEOUT, "yt_verify_step_timeout");
            YtFSM.getInstance().transitNow(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.TIMEOUT_STATE));
            return;
        }
        if (this.f61624m || this.f61619j || this.f61609e > this.f61637z) {
            this.f61619j = true;
            if (!this.f61608d0) {
                this.f61623l.cancel();
            }
            int iOrdinal = YtFSM.getInstance().getWorkMode().ordinal();
            if (iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4 || iOrdinal == 5) {
                YtFSM.getInstance().transitNow(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.QUALITY_STATE));
            }
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void reset() {
        this.f61611f = -1;
        this.f61609e = 0;
        this.f61632u = 0;
        this.f61604b0 = 0;
        this.f61634w = false;
        this.f61633v = 0;
        this.f61575A = -1.0E10f;
        this.f61578D = 1.0E10f;
        this.f61576B = 1.0E10f;
        this.f61577C = -1.0E10f;
        this.f61582H = -1.0E10f;
        this.f61619j = false;
        this.f61591Q = 0;
        this.f61599Y = 0;
        this.f61579E = -1.0E10f;
        this.f61587M = 0;
        this.f61596V = -1;
        this.f61588N = null;
        this.f61618i0 = false;
        this.f61622k0 = 0;
        if (!this.f61608d0) {
            this.f61621k.cancel();
            this.f61623l.cancel();
            if (this.f61624m) {
                this.f61623l.reset();
            } else {
                this.f61621k.reset();
            }
        }
        super.reset();
        this.stateData.put("detect_instance", this.f61594T);
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void unload() {
        super.unload();
        YTFaceTracker yTFaceTracker = this.f61594T;
        if (yTFaceTracker != null) {
            yTFaceTracker.destroy();
        }
        this.f61594T = null;
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
        YTFaceTracker.TrackedFace[] trackedFaceArrM85856a;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int iM85846a;
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
        if (this.f61608d0 && this.isPause.get()) {
            YtFSM.getInstance().sendFSMEvent(new C14649a(this));
            try {
                Thread.sleep(30L);
                return;
            } catch (InterruptedException e) {
                YtLogger.m85809e("SilentLivenessState", "Thread sleep error", e);
                return;
            }
        }
        if (yTImageData == null || yTImageData.imgData == null) {
            YtLogger.m85809e("SilentLivenessState", "image data is null", null);
            return;
        }
        if (!this.f61608d0 && (this.f61621k.checkTimeout() || (this.f61624m && this.f61623l.checkTimeout()))) {
            moveToNextState();
            return;
        }
        int i12 = 1;
        this.f61604b0++;
        CommonUtils.benchMarkBegin(Detect.TYPE);
        try {
            YTFaceTracker.TrackedFace[] trackedFaceArrTrack = this.f61594T.track(0, yTImageData.imgData, yTImageData.width, yTImageData.height, 0);
            CommonUtils.benchMarkEnd(Detect.TYPE);
            YtLogger.m85808d("SilentLivenessState", CommonUtils.getBenchMarkTime(Detect.TYPE));
            if (trackedFaceArrTrack == null || trackedFaceArrTrack.length == 0) {
                trackedFaceArrM85856a = null;
            } else {
                YtLogger.m85810i("SilentLivenessState", "face status count " + trackedFaceArrTrack.length);
                trackedFaceArrM85856a = C14664o.m85856a(trackedFaceArrTrack);
                int i13 = Integer.MIN_VALUE;
                int i14 = 0;
                for (int i15 = 0; i15 < trackedFaceArrM85856a.length; i15++) {
                    Rect rectM85848a = C14664o.m85848a(trackedFaceArrM85856a[i15]);
                    int iWidth = rectM85848a.width() * rectM85848a.height();
                    if (iWidth >= i13) {
                        i14 = i15;
                        i13 = iWidth;
                    }
                }
                if (i14 != 0) {
                    YtLogger.m85810i("o", "Found max face id:" + i14);
                    trackedFaceArrM85856a[0] = trackedFaceArrM85856a[i14];
                }
            }
            if (trackedFaceArrM85856a != null && trackedFaceArrM85856a.length > 0) {
                YTFaceTracker.TrackedFace trackedFace2 = trackedFaceArrM85856a[0];
                trackedFace2.faceRect = C14664o.m85848a(trackedFace2);
            }
            if (trackedFaceArrM85856a == null) {
                this.f61600Z = 1;
                i7 = 1;
                i12 = 1;
                i8 = -1;
                i = 2;
            } else {
                i = 2;
                if (trackedFaceArrM85856a.length <= 1) {
                    YTFaceTracker.TrackedFace trackedFace3 = trackedFaceArrM85856a[0];
                    if (!this.f61618i0) {
                        if (C14664o.m85854a(trackedFace3, this.f61612f0, this.f61614g0, this.f61616h0)) {
                            int i16 = this.f61622k0 + 1;
                            this.f61622k0 = i16;
                            if (i16 >= this.f61620j0) {
                                this.f61618i0 = true;
                            }
                        } else {
                            this.f61622k0 = 0;
                        }
                    }
                    if (this.f61618i0) {
                        Rect rectM85848a2 = C14664o.m85848a(trackedFace3);
                        Rect rect = this.f61588N;
                        if (rect == null) {
                            this.f61588N = rectM85848a2;
                            this.f61587M = 0;
                            i12 = 1;
                        } else {
                            Rect rectM85847a = C14664o.m85847a(rectM85848a2, rect);
                            if (rectM85848a2.height() != 0 && rectM85848a2.width() != 0) {
                                float fAbs = Math.abs(((rectM85847a.width() * rectM85847a.height()) / rectM85848a2.height()) / rectM85848a2.width());
                                if (fAbs < this.f61586L) {
                                    YtLogger.m85811o("SilentLivenessState", "face shaking:" + fAbs);
                                    this.f61602a0 = StringCode.FL_ACT_SCREEN_SHAKING;
                                    this.f61587M = 0;
                                } else {
                                    this.f61602a0 = "";
                                    this.f61587M++;
                                }
                            }
                            this.f61588N = rectM85848a2;
                        }
                        Rect detectRect = YtSDKKitFramework.getInstance().getDetectRect();
                        Rect rect2 = new Rect(0, 0, 0, 0);
                        YtLogger.m85808d("SilentLivenessState", "camera" + this.f61603b + BaseSei.f14624X + this.f61601a + " ratio " + this.f61607d + BaseSei.f14624X + this.f61605c);
                        YtLogger.m85808d("SilentLivenessState", "detectrect :" + detectRect.left + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + detectRect.top + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + detectRect.right + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + detectRect.bottom);
                        float f4 = (float) rectM85848a2.left;
                        float f5 = this.f61607d;
                        rect2.left = (int) (f4 * f5);
                        rect2.right = (int) (((float) rectM85848a2.right) * f5);
                        float f6 = (float) rectM85848a2.top;
                        float f7 = this.f61605c;
                        rect2.top = (int) (f6 * f7);
                        rect2.bottom = (int) (((float) rectM85848a2.bottom) * f7);
                        this.f61599Y = 0;
                        int i17 = 0;
                        while (true) {
                            float[] fArr2 = trackedFace3.faceShape;
                            if (i17 >= fArr2.length / 2) {
                                break;
                            }
                            int i18 = i17 * 2;
                            float f8 = fArr2[i18];
                            if (f8 > this.f61603b || f8 < 0.0f) {
                                this.f61599Y++;
                            } else {
                                float f9 = fArr2[i18 + 1];
                                if (f9 < 0.0f || f9 > this.f61601a) {
                                    this.f61599Y++;
                                }
                            }
                            i17++;
                        }
                        Rect rectM85847a2 = C14664o.m85847a(detectRect, rect2);
                        this.f61593S = Math.abs(((rectM85847a2.width() * rectM85847a2.height()) / rect2.width()) / rect2.height());
                        YtLogger.m85808d("SilentLivenessState", "faceInMask : " + rect2.left + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + rect2.top + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + rect2.right + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + rect2.bottom + " in rect ratio" + this.f61593S);
                        float fAbs2 = Math.abs(((float) (rectM85848a2.right - rectM85848a2.left)) / (((float) this.f61603b) * 1.0f));
                        YtFSMBaseState stateByName = YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.ACTION_STATE));
                        int i19 = (stateByName != null && stateByName.containsKey("current_action_type") && ((iIntValue = ((Integer) stateByName.getStateDataBy("current_action_type")).intValue()) == 3 || iIntValue == 4)) ? 0 : i12;
                        YtLogger.m85808d("SilentLivenessState", "face area ratio:" + fAbs2);
                        if (this.f61599Y >= 3) {
                            YtLogger.m85813w("SilentLivenessState", "face incomplete invalid point count:" + this.f61599Y, null);
                            i6 = 8;
                        } else {
                            if (fAbs2 > this.f61630s) {
                                YtLogger.m85813w("SilentLivenessState", "face too big:" + fAbs2, null);
                                if (fAbs2 <= this.f61630s + this.f61583I) {
                                    i5 = 3;
                                    i3 = i5;
                                    i4 = i12;
                                    i2 = 0;
                                } else {
                                    i6 = 3;
                                }
                            } else {
                                if (this.f61593S < this.f61581G) {
                                    YtLogger.m85813w("SilentLivenessState", "face not in rect ratio:" + this.f61593S, null);
                                    i2 = 0;
                                    i3 = 4;
                                } else {
                                    if (fAbs2 < this.f61631t) {
                                        YtLogger.m85813w("SilentLivenessState", "face too small:" + fAbs2, null);
                                        if (fAbs2 >= this.f61631t - this.f61584J) {
                                            i5 = 2;
                                        } else {
                                            i6 = 2;
                                        }
                                    } else if (i19 == 0 || (Math.abs(trackedFace3.pitch) <= this.f61627p && Math.abs(trackedFace3.yaw) <= this.f61628q && Math.abs(trackedFace3.roll) <= this.f61629r)) {
                                        if (!this.f61626o || YtFSM.getInstance().getWorkMode() == YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTION_TYPE || YtFSM.getInstance().getWorkMode() == YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTREFLECT_TYPE) {
                                            i2 = 0;
                                        } else {
                                            float fPreCheckCloseEyeScore = YtSDKKitCommon.ProcessHelper.preCheckCloseEyeScore(trackedFace3.faceShape);
                                            YtLogger.m85808d("SilentLivenessState", "eye score:" + fPreCheckCloseEyeScore + " cnt:" + this.f61632u);
                                            if (fPreCheckCloseEyeScore < this.f61625n) {
                                                this.f61632u++;
                                                int i20 = this.f61609e - 1;
                                                this.f61609e = i20;
                                                if (i20 < 0) {
                                                    i2 = 0;
                                                    this.f61609e = 0;
                                                } else {
                                                    i2 = 0;
                                                }
                                            } else {
                                                i2 = 0;
                                                this.f61632u = 0;
                                            }
                                            if (this.f61632u >= (YtFSM.getInstance().getWorkMode() != YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_SILENT_TYPE ? 10 : 4)) {
                                                this.f61632u = i2;
                                                i4 = i2;
                                                i3 = 6;
                                            }
                                        }
                                        i3 = i2;
                                        i4 = i3;
                                    } else {
                                        YtLogger.m85813w("SilentLivenessState", "face pose not right (" + trackedFace3.pitch + Constants.SEPARATOR_COMMA + trackedFace3.yaw + Constants.SEPARATOR_COMMA + trackedFace3.roll + ")", null);
                                        if (Math.abs(trackedFace3.pitch) > this.f61627p + this.f61585K || Math.abs(trackedFace3.yaw) > this.f61628q + this.f61585K || Math.abs(trackedFace3.roll) > this.f61629r + this.f61585K) {
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
                            this.f61600Z = i3;
                            if (i4 != 0) {
                                i7 = 9;
                            } else {
                                i7 = i3;
                            }
                            iM85846a = C14664o.m85846a(trackedFaceArrM85856a[i2].faceVisible, this.f61595U);
                            if (this.f61596V != iM85846a) {
                                this.f61598X = i2;
                                this.f61596V = iM85846a;
                            } else {
                                this.f61598X++;
                            }
                            if (this.f61604b0 >= 7 || this.f61598X >= 7) {
                                this.f61597W = this.f61596V;
                                i8 = iM85846a;
                            } else {
                                i8 = this.f61597W;
                            }
                            YtLogger.m85810i("SilentLivenessState", "advise " + i7 + "|shelter " + i8);
                        }
                        i3 = i6;
                        i2 = 0;
                        i4 = 0;
                        this.f61600Z = i3;
                        if (i4 != 0) {
                            i7 = 9;
                        } else {
                            i7 = i3;
                        }
                        iM85846a = C14664o.m85846a(trackedFaceArrM85856a[i2].faceVisible, this.f61595U);
                        if (this.f61596V != iM85846a) {
                            this.f61598X = i2;
                            this.f61596V = iM85846a;
                        } else {
                            this.f61598X++;
                        }
                        if (this.f61604b0 >= 7) {
                            this.f61597W = this.f61596V;
                            i8 = iM85846a;
                        } else {
                            this.f61597W = this.f61596V;
                            i8 = iM85846a;
                        }
                        YtLogger.m85810i("SilentLivenessState", "advise " + i7 + "|shelter " + i8);
                    } else {
                        YtLogger.m85808d("SilentLivenessState", "correction face failure");
                        HashMap<String, Object> map = new HashMap<>();
                        map.put(StateEvent.Name.UI_ACTION, StateEvent.ActionValue.STAGE_NOTPASS);
                        map.put(StateEvent.Name.UI_TIPS, StringCode.FL_POSE_INCORRECT);
                        YtFSM.getInstance().sendFSMEvent(map);
                    }
                    this.stateData.put("pose_state", Integer.valueOf(this.f61611f));
                    this.stateData.put("shelter_state", Integer.valueOf(this.f61613g));
                    this.stateData.put("face_status", trackedFaceArrM85856a);
                    this.stateData.put("continuous_detect_count", Integer.valueOf(this.f61609e));
                    this.stateData.put("last_face_status", trackedFaceArrM85856a);
                    this.stateData.put("last_frame", yTImageData);
                    YtLogger.m85811o("SilentLivenessState", C14664o.m85851a(trackedFaceArrM85856a, this.f61613g, this.f61611f));
                    i9 = this.f61611f;
                    if ((i9 != 0 || i9 == 9) && trackedFaceArrM85856a != null && trackedFaceArrM85856a.length > 0) {
                        trackedFace = trackedFaceArrM85856a[0];
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
                        if (this.f61587M < this.f61637z) {
                            YtLogger.m85809e("SilentLivenessState", "stable count " + this.f61587M, null);
                        } else {
                            f3 = this.f61593S;
                            if (f3 >= ((double) this.f61579E) - 0.05d) {
                                this.f61579E = f3;
                                if (!this.f61589O) {
                                    YtLogger.m85808d("SilentLivenessState", "test2 shelter score " + f2 + " inRectThreshold " + this.f61593S + " eye " + f + " mouth " + fCalcMouthScore);
                                    if (f >= ((double) this.f61575A) - 0.05d && fCalcMouthScore <= Math.max(this.f61578D, 15.0f) && Math.abs(trackedFace.yaw) <= this.f61612f0 && Math.abs(trackedFace.pitch) <= this.f61614g0 && Math.abs(trackedFace.roll) <= this.f61616h0) {
                                        YtLogger.m85808d("SilentLivenessState", "best shelter score " + f2 + " inRectThreshold " + this.f61593S);
                                        this.f61575A = f;
                                        this.f61578D = fCalcMouthScore;
                                        this.stateData.put("best_image", yTImageData);
                                        this.stateData.put("best_shape", trackedFace.faceShape);
                                        this.stateData.put("best_face_status", trackedFace);
                                    }
                                    if (f < this.f61576B) {
                                        this.f61576B = f;
                                        this.stateData.put("closeeye_image", yTImageData);
                                        this.stateData.put("closeeye_shape", trackedFace.faceShape);
                                        this.stateData.put("closeeye_face_status", trackedFace);
                                    }
                                    if (fCalcMouthScore > this.f61577C) {
                                        this.f61577C = fCalcMouthScore;
                                        this.stateData.put("openmouth_image", yTImageData);
                                        this.stateData.put("openmouth_shape", trackedFace.faceShape);
                                        this.stateData.put("openmouth_face_status", trackedFace);
                                    }
                                } else if (this.f61582H <= f2) {
                                    this.f61582H = f2;
                                    YtLogger.m85808d("SilentLivenessState", "test2 shelter score " + f2 + " inRectThreshold " + this.f61593S + " eye " + f + " mouth " + fCalcMouthScore);
                                    if (f >= ((double) this.f61575A) - 0.05d) {
                                        YtLogger.m85808d("SilentLivenessState", "best shelter score " + f2 + " inRectThreshold " + this.f61593S);
                                        this.f61575A = f;
                                        this.f61578D = fCalcMouthScore;
                                        this.stateData.put("best_image", yTImageData);
                                        this.stateData.put("best_shape", trackedFace.faceShape);
                                        this.stateData.put("best_face_status", trackedFace);
                                    }
                                    if (f < this.f61576B) {
                                        this.f61576B = f;
                                        this.stateData.put("closeeye_image", yTImageData);
                                        this.stateData.put("closeeye_shape", trackedFace.faceShape);
                                        this.stateData.put("closeeye_face_status", trackedFace);
                                    }
                                    if (fCalcMouthScore > this.f61577C) {
                                        this.f61577C = fCalcMouthScore;
                                        this.stateData.put("openmouth_image", yTImageData);
                                        this.stateData.put("openmouth_shape", trackedFace.faceShape);
                                        this.stateData.put("openmouth_face_status", trackedFace);
                                    }
                                } else {
                                    YtLogger.m85808d("SilentLivenessState", "test1 shelter score " + f2 + " inRectThreshold " + this.f61593S + " eye " + f + " mouth " + fCalcMouthScore);
                                }
                            } else {
                                YtLogger.m85808d("SilentLivenessState", "test3 shelter score " + f2 + " inRectThreshold " + this.f61593S + " (" + this.f61579E + ") eye " + f + " mouth " + fCalcMouthScore);
                            }
                        }
                    }
                    if (this.f61622k0 >= this.f61620j0 || this.stateData.get("best_image") == null) {
                    }
                    boolean z = this.f61624m;
                    if (!z || (z && this.f61634w)) {
                        moveToNextState();
                        return;
                    }
                    return;
                }
                if (this.f61606c0) {
                    this.f61609e = 0;
                    this.f61611f = 7;
                    i7 = 7;
                } else {
                    i7 = -1;
                }
                this.f61600Z = 7;
                i12 = 1;
                i8 = -1;
            }
            HashMap<String, Object> map2 = new HashMap<>();
            if ((i7 == 0 || i7 == 9) && i8 == 0) {
                this.f61609e++;
            } else {
                map2.put(StateEvent.Name.UI_ACTION, StateEvent.ActionValue.STAGE_NOTPASS);
                this.f61609e = 0;
            }
            if (i7 == this.f61611f && i8 == this.f61613g) {
                this.f61633v++;
            } else {
                this.f61633v = 0;
            }
            if (!this.f61580F || this.f61633v <= 3 || this.f61600Z != i7) {
                this.f61611f = i7;
                this.f61613g = i8;
                YtLogger.m85808d("SilentLivenessState", " tips:" + C14664o.m85849a(this.f61600Z));
                int i21 = this.f61600Z;
                if (i21 != 0 && i21 != 9) {
                    map2.put(StateEvent.Name.UI_TIPS, C14664o.m85849a(i21));
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
                } else if (i8 == 0 && (i11 = this.f61633v) > 2 && i11 < 5) {
                    map2.put(StateEvent.Name.UI_TIPS, StringCode.FL_POSE_KEEP);
                    map2.put(StateEvent.Name.UI_ACTION, StateEvent.ActionValue.STAGE_PASS);
                }
                String str = this.f61602a0;
                if (str != "") {
                    map2.put(StateEvent.Name.UI_EXTRA_TIPS, str);
                }
                YtFSM.getInstance().sendFSMEvent(map2);
            }
            this.stateData.put("pose_state", Integer.valueOf(this.f61611f));
            this.stateData.put("shelter_state", Integer.valueOf(this.f61613g));
            this.stateData.put("face_status", trackedFaceArrM85856a);
            this.stateData.put("continuous_detect_count", Integer.valueOf(this.f61609e));
            this.stateData.put("last_face_status", trackedFaceArrM85856a);
            this.stateData.put("last_frame", yTImageData);
            YtLogger.m85811o("SilentLivenessState", C14664o.m85851a(trackedFaceArrM85856a, this.f61613g, this.f61611f));
            i9 = this.f61611f;
            if (i9 != 0) {
                trackedFace = trackedFaceArrM85856a[0];
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
                if (this.f61587M < this.f61637z) {
                    YtLogger.m85809e("SilentLivenessState", "stable count " + this.f61587M, null);
                } else {
                    f3 = this.f61593S;
                    if (f3 >= ((double) this.f61579E) - 0.05d) {
                        this.f61579E = f3;
                        if (!this.f61589O) {
                            YtLogger.m85808d("SilentLivenessState", "test2 shelter score " + f2 + " inRectThreshold " + this.f61593S + " eye " + f + " mouth " + fCalcMouthScore);
                            if (f >= ((double) this.f61575A) - 0.05d) {
                                YtLogger.m85808d("SilentLivenessState", "best shelter score " + f2 + " inRectThreshold " + this.f61593S);
                                this.f61575A = f;
                                this.f61578D = fCalcMouthScore;
                                this.stateData.put("best_image", yTImageData);
                                this.stateData.put("best_shape", trackedFace.faceShape);
                                this.stateData.put("best_face_status", trackedFace);
                            }
                            if (f < this.f61576B) {
                                this.f61576B = f;
                                this.stateData.put("closeeye_image", yTImageData);
                                this.stateData.put("closeeye_shape", trackedFace.faceShape);
                                this.stateData.put("closeeye_face_status", trackedFace);
                            }
                            if (fCalcMouthScore > this.f61577C) {
                                this.f61577C = fCalcMouthScore;
                                this.stateData.put("openmouth_image", yTImageData);
                                this.stateData.put("openmouth_shape", trackedFace.faceShape);
                                this.stateData.put("openmouth_face_status", trackedFace);
                            }
                        } else if (this.f61582H <= f2) {
                            this.f61582H = f2;
                            YtLogger.m85808d("SilentLivenessState", "test2 shelter score " + f2 + " inRectThreshold " + this.f61593S + " eye " + f + " mouth " + fCalcMouthScore);
                            if (f >= ((double) this.f61575A) - 0.05d) {
                                YtLogger.m85808d("SilentLivenessState", "best shelter score " + f2 + " inRectThreshold " + this.f61593S);
                                this.f61575A = f;
                                this.f61578D = fCalcMouthScore;
                                this.stateData.put("best_image", yTImageData);
                                this.stateData.put("best_shape", trackedFace.faceShape);
                                this.stateData.put("best_face_status", trackedFace);
                            }
                            if (f < this.f61576B) {
                                this.f61576B = f;
                                this.stateData.put("closeeye_image", yTImageData);
                                this.stateData.put("closeeye_shape", trackedFace.faceShape);
                                this.stateData.put("closeeye_face_status", trackedFace);
                            }
                            if (fCalcMouthScore > this.f61577C) {
                                this.f61577C = fCalcMouthScore;
                                this.stateData.put("openmouth_image", yTImageData);
                                this.stateData.put("openmouth_shape", trackedFace.faceShape);
                                this.stateData.put("openmouth_face_status", trackedFace);
                            }
                        } else {
                            YtLogger.m85808d("SilentLivenessState", "test1 shelter score " + f2 + " inRectThreshold " + this.f61593S + " eye " + f + " mouth " + fCalcMouthScore);
                        }
                    } else {
                        YtLogger.m85808d("SilentLivenessState", "test3 shelter score " + f2 + " inRectThreshold " + this.f61593S + " (" + this.f61579E + ") eye " + f + " mouth " + fCalcMouthScore);
                    }
                }
            } else {
                trackedFace = trackedFaceArrM85856a[0];
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
                if (this.f61587M < this.f61637z) {
                    YtLogger.m85809e("SilentLivenessState", "stable count " + this.f61587M, null);
                } else {
                    f3 = this.f61593S;
                    if (f3 >= ((double) this.f61579E) - 0.05d) {
                        this.f61579E = f3;
                        if (!this.f61589O) {
                            YtLogger.m85808d("SilentLivenessState", "test2 shelter score " + f2 + " inRectThreshold " + this.f61593S + " eye " + f + " mouth " + fCalcMouthScore);
                            if (f >= ((double) this.f61575A) - 0.05d) {
                                YtLogger.m85808d("SilentLivenessState", "best shelter score " + f2 + " inRectThreshold " + this.f61593S);
                                this.f61575A = f;
                                this.f61578D = fCalcMouthScore;
                                this.stateData.put("best_image", yTImageData);
                                this.stateData.put("best_shape", trackedFace.faceShape);
                                this.stateData.put("best_face_status", trackedFace);
                            }
                            if (f < this.f61576B) {
                                this.f61576B = f;
                                this.stateData.put("closeeye_image", yTImageData);
                                this.stateData.put("closeeye_shape", trackedFace.faceShape);
                                this.stateData.put("closeeye_face_status", trackedFace);
                            }
                            if (fCalcMouthScore > this.f61577C) {
                                this.f61577C = fCalcMouthScore;
                                this.stateData.put("openmouth_image", yTImageData);
                                this.stateData.put("openmouth_shape", trackedFace.faceShape);
                                this.stateData.put("openmouth_face_status", trackedFace);
                            }
                        } else if (this.f61582H <= f2) {
                            this.f61582H = f2;
                            YtLogger.m85808d("SilentLivenessState", "test2 shelter score " + f2 + " inRectThreshold " + this.f61593S + " eye " + f + " mouth " + fCalcMouthScore);
                            if (f >= ((double) this.f61575A) - 0.05d) {
                                YtLogger.m85808d("SilentLivenessState", "best shelter score " + f2 + " inRectThreshold " + this.f61593S);
                                this.f61575A = f;
                                this.f61578D = fCalcMouthScore;
                                this.stateData.put("best_image", yTImageData);
                                this.stateData.put("best_shape", trackedFace.faceShape);
                                this.stateData.put("best_face_status", trackedFace);
                            }
                            if (f < this.f61576B) {
                                this.f61576B = f;
                                this.stateData.put("closeeye_image", yTImageData);
                                this.stateData.put("closeeye_shape", trackedFace.faceShape);
                                this.stateData.put("closeeye_face_status", trackedFace);
                            }
                            if (fCalcMouthScore > this.f61577C) {
                                this.f61577C = fCalcMouthScore;
                                this.stateData.put("openmouth_image", yTImageData);
                                this.stateData.put("openmouth_shape", trackedFace.faceShape);
                                this.stateData.put("openmouth_face_status", trackedFace);
                            }
                        } else {
                            YtLogger.m85808d("SilentLivenessState", "test1 shelter score " + f2 + " inRectThreshold " + this.f61593S + " eye " + f + " mouth " + fCalcMouthScore);
                        }
                    } else {
                        YtLogger.m85808d("SilentLivenessState", "test3 shelter score " + f2 + " inRectThreshold " + this.f61593S + " (" + this.f61579E + ") eye " + f + " mouth " + fCalcMouthScore);
                    }
                }
            }
            if (this.f61622k0 >= this.f61620j0) {
            }
        } catch (Exception e2) {
            YtLogger.m85809e("SilentLivenessState", "track error ", e2);
            m85845a("failed", ErrorCode.YT_SDK_VERIFY_FACE_ERROR, CommonUtils.makeMessageJson(ErrorCode.YT_SDK_VERIFY_FACE_ERROR, StringCode.MSG_FACETRACK_ERROR, "YTFaceTrack track failed"));
            e2.printStackTrace();
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void updateSDKSetting(JSONObject jSONObject) {
        try {
            if (jSONObject.has("check_eye_open")) {
                this.f61626o = jSONObject.getBoolean("check_eye_open");
            }
            if (jSONObject.has("open_eye_threshold")) {
                this.f61625n = (float) jSONObject.getDouble("open_eye_threshold");
            }
            if (jSONObject.has("pitch_threshold")) {
                this.f61627p = jSONObject.getInt("pitch_threshold");
            }
            if (jSONObject.has("yaw_threshold")) {
                this.f61628q = jSONObject.getInt("yaw_threshold");
            }
            if (jSONObject.has("roll_threshold")) {
                this.f61629r = jSONObject.getInt("roll_threshold");
            }
            if (jSONObject.has("smallface_ratio_threshold")) {
                this.f61631t = (float) jSONObject.getDouble("smallface_ratio_threshold");
            }
            if (jSONObject.has("bigface_ratio_threshold")) {
                this.f61630s = (float) jSONObject.getDouble("bigface_ratio_threshold");
            }
            if (jSONObject.has("blur_detect_threshold")) {
                jSONObject.getDouble("blur_detect_threshold");
            }
            if (jSONObject.has("need_big_face_mode")) {
                this.f61635x = jSONObject.getBoolean("need_big_face_mode");
            }
            if (jSONObject.has("detect_interval")) {
                this.f61636y = jSONObject.getInt("detect_interval");
            }
            if (jSONObject.has("stable_frame_num")) {
                this.f61637z = jSONObject.getInt("stable_frame_num");
            }
            if (jSONObject.has("net_request_timeout_ms")) {
                YtSDKKitFramework.getInstance().setNetworkRequestTimeoutMS(jSONObject.getInt("net_request_timeout_ms"));
            }
            if (jSONObject.has("force_pose_check")) {
                this.f61590P = jSONObject.getBoolean("force_pose_check");
            }
            if (jSONObject.has("novalid_face_count")) {
                this.f61592R = jSONObject.getInt("novalid_face_count");
            }
            if (jSONObject.has("in_rect_ratio_threshold")) {
                this.f61581G = (float) jSONObject.getDouble("in_rect_ratio_threshold");
            }
            if (jSONObject.has("need_check_shelter")) {
                this.f61589O = jSONObject.getBoolean("need_check_shelter");
            }
            if (jSONObject.has("stable_roi_threshold")) {
                this.f61586L = (float) jSONObject.getDouble("stable_roi_threshold");
            }
            if (jSONObject.has("need_close_timeout")) {
                this.f61608d0 = jSONObject.getBoolean("need_close_timeout");
            }
            if (jSONObject.has("resource_online")) {
                this.f61615h = jSONObject.getBoolean("resource_online");
            }
            if (jSONObject.has("resource_download_path")) {
                this.f61617i = jSONObject.getString("resource_download_path");
            }
            if (jSONObject.has("timeout_countdown_ms")) {
                this.f61621k.init(Math.max(0, Math.min(30000, jSONObject.getInt("timeout_countdown_ms"))), true);
            }
            boolean zHas = jSONObject.has("predetect_countdown_ms");
            TimeoutCounter timeoutCounter = this.f61623l;
            if (zHas) {
                timeoutCounter.init(jSONObject.getInt("predetect_countdown_ms"), true);
            } else {
                timeoutCounter.init(25000L, true);
            }
            if (jSONObject.has("same_tips_filter")) {
                this.f61580F = jSONObject.getBoolean("same_tips_filter");
            }
            if (jSONObject.has("manual_trigger")) {
                this.f61624m = jSONObject.getBoolean("manual_trigger");
            }
            if (jSONObject.has("secondary_yaw_threshold")) {
                this.f61612f0 = (float) jSONObject.getDouble("secondary_yaw_threshold");
            }
            if (jSONObject.has("secondary_pitch_threshold")) {
                this.f61614g0 = (float) jSONObject.getDouble("secondary_pitch_threshold");
            }
            if (jSONObject.has("secondary_roll_threshold")) {
                this.f61616h0 = (float) jSONObject.getDouble("secondary_roll_threshold");
            }
            if (jSONObject.has("continuous_angle_num_threshold")) {
                this.f61620j0 = jSONObject.getInt("continuous_angle_num_threshold");
            }
            boolean zOptBoolean = jSONObject.optBoolean("need_local_face_best_image", false);
            boolean zOptBoolean2 = jSONObject.optBoolean("relaxed_shelter_threshold", false);
            int iOptInt = jSONObject.optInt("shelter_judge_level", 0);
            if ((zOptBoolean || zOptBoolean2) && iOptInt <= 1) {
                iOptInt = 10;
            }
            this.f61595U = new C14664o.a(iOptInt);
            this.f61610e0 = jSONObject.optString("model_config_ini_name", "yt_model_config.ini");
            this.f61606c0 = jSONObject.optBoolean("need_check_multiface", false);
            this.f61583I = (float) jSONObject.optDouble("bigface_ratio_buffer", 0.05000000074505806d);
            this.f61584J = (float) jSONObject.optDouble("smallface_ratio_buffer", 0.05000000074505806d);
            this.f61585K = (float) jSONObject.optDouble("pose_ratio_buffer", 0.05000000074505806d);
            this.f61586L = (float) jSONObject.optDouble("stable_roi_threshold", 0.8999999761581421d);
        } catch (JSONException e) {
            YtLogger.m85809e("SilentLivenessState", "Failed to parse json:", e);
        }
    }
}
