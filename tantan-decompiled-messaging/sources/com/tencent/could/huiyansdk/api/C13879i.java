package com.tencent.could.huiyansdk.api;

import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import com.tencent.could.huiyansdk.C13869R;
import com.tencent.could.huiyansdk.base.HuiYanBaseCallBack;
import com.tencent.could.huiyansdk.callback.InterfaceC13883b;
import com.tencent.could.huiyansdk.entity.AuthUiConfig;
import com.tencent.could.huiyansdk.entity.CompareResult;
import com.tencent.could.huiyansdk.entity.HuiYanSdkConfig;
import com.tencent.could.huiyansdk.enums.AuthState;
import com.tencent.could.huiyansdk.enums.HuiYanAuthEvent;
import com.tencent.could.huiyansdk.enums.HuiYanAuthTipsEvent;
import com.tencent.could.huiyansdk.enums.HuiYanLiveMode;
import com.tencent.could.huiyansdk.enums.PageColorStyle;
import com.tencent.could.huiyansdk.fragments.C13896f;
import com.tencent.could.huiyansdk.helper.C13900b;
import com.tencent.could.huiyansdk.manager.C13902b;
import com.tencent.could.huiyansdk.manager.C13905e;
import com.tencent.could.huiyansdk.turing.C13924f;
import com.tencent.could.huiyansdk.utils.CommonUtils;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.api.i */
/* JADX INFO: loaded from: classes2.dex */
public class C13879i implements HuiYanBaseCallBack {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C13880j f57341a;

    public C13879i(C13880j c13880j) {
        this.f57341a = c13880j;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:101:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:103:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:105:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:106:0x01de  */
    /* JADX WARN: Code duplicated, block: B:108:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:116:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:118:0x0200  */
    /* JADX WARN: Code duplicated, block: B:120:0x0204 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:121:0x0205  */
    /* JADX WARN: Code duplicated, block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0170  */
    /* JADX WARN: Code duplicated, block: B:82:0x017a  */
    /* JADX WARN: Code duplicated, block: B:83:0x017d  */
    /* JADX WARN: Code duplicated, block: B:97:0x01b0  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.tencent.could.huiyansdk.base.HuiYanBaseCallBack
    /* JADX INFO: renamed from: a */
    public void mo82226a(HashMap<String, Object> map) {
        int identifier;
        int i;
        int color;
        C13880j c13880j;
        HuiYanSdkConfig huiYanSdkConfig;
        PageColorStyle pageColorStyle;
        String string;
        InterfaceC13883b interfaceC13883b;
        int color2;
        InterfaceC13883b interfaceC13883b2;
        SparseArray<HuiYanAuthTipsEvent> sparseArray;
        HuiYanAuthTipsEvent huiYanAuthTipsEvent;
        HuiYanAuthTipsEvent huiYanAuthTipsEvent2;
        C13902b c13902b = C13902b.b.f57433a;
        c13902b.getClass();
        Context context = CommonUtils.getContext();
        if (context == null) {
            C13905e.a.f57445a.m82337a(2, "AuthStateManager", "context is null");
            return;
        }
        if (map.containsKey(StateEvent.Name.UI_EXTRA_TIPS)) {
            String str = (String) map.get(StateEvent.Name.UI_EXTRA_TIPS);
            if (TextUtils.isEmpty(str)) {
                HuiYanAuthTipsEvent huiYanAuthTipsEvent3 = HuiYanAuthTipsEvent.NONE;
                InterfaceC13883b interfaceC13883b3 = c13902b.f57412c;
                if (interfaceC13883b3 != null) {
                    ((C13896f) interfaceC13883b3).m82303a(context, -1, huiYanAuthTipsEvent3);
                }
            } else {
                int identifier2 = context.getResources().getIdentifier(str, "string", context.getPackageName());
                if (c13902b.m82331a(identifier2, c13902b.f57416g)) {
                    SparseArray<HuiYanAuthTipsEvent> sparseArray2 = c13902b.f57422m;
                    if (sparseArray2 == null || (huiYanAuthTipsEvent2 = sparseArray2.get(identifier2)) == null) {
                        huiYanAuthTipsEvent2 = HuiYanAuthTipsEvent.NONE;
                    }
                    InterfaceC13883b interfaceC13883b4 = c13902b.f57412c;
                    if (interfaceC13883b4 != null) {
                        ((C13896f) interfaceC13883b4).m82303a(context, identifier2, huiYanAuthTipsEvent2);
                    }
                }
            }
        } else {
            HuiYanAuthTipsEvent huiYanAuthTipsEvent4 = HuiYanAuthTipsEvent.NONE;
            InterfaceC13883b interfaceC13883b5 = c13902b.f57412c;
            if (interfaceC13883b5 != null) {
                ((C13896f) interfaceC13883b5).m82303a(context, -1, huiYanAuthTipsEvent4);
            }
        }
        String str2 = (String) map.get(StateEvent.Name.UI_TIPS);
        C13905e c13905e = C13905e.a.f57445a;
        if (c13905e.f57443c != null && c13905e.f57444d != null) {
            Message messageObtainMessage = c13905e.f57444d.obtainMessage();
            messageObtainMessage.what = 0;
            messageObtainMessage.obj = str2;
            c13905e.f57444d.sendMessage(messageObtainMessage);
        }
        if (TextUtils.isEmpty(str2)) {
            identifier = -1;
        } else {
            identifier = context.getResources().getIdentifier(str2, "string", context.getPackageName());
            if (identifier == C13869R.string.rst_failed) {
                String string2 = context.getString(C13869R.string.txy_local_check_fail);
                if (map.containsKey(StateEvent.Name.ERROR_CODE)) {
                    Integer num = (Integer) map.get(StateEvent.Name.ERROR_CODE);
                    if (num.intValue() == 4194307) {
                        string2 = context.getString(C13869R.string.txy_local_check_out_time);
                    }
                    string2 = string2 + "(code:" + num + ")";
                }
                InterfaceC13872b interfaceC13872b = C13880j.a.f57352a.f57348g;
                if (interfaceC13872b != null) {
                    interfaceC13872b.onBuriedPointCallBack("AuthCheckStage", "YouTuLocalCheckError", string2);
                }
                CompareResult compareResult = new CompareResult();
                compareResult.setErrorCode(228);
                compareResult.setErrorMsg(string2);
                c13902b.m82328a(AuthState.AUTH_FAIL, compareResult);
            } else if (!c13902b.m82331a(identifier, c13902b.f57417h)) {
                if (identifier != -1 && identifier != C13869R.string.fl_no_face && identifier != C13869R.string.msg_fsm_pause && !c13902b.f57413d) {
                    c13902b.f57413d = true;
                    C13924f.a.f57496a.f57483b = true;
                    if (C13880j.a.f57352a.m82235b().isOpenLongCheck()) {
                        c13902b.m82328a(AuthState.ON_ENTRY_BOT, (Object) null);
                    } else {
                        c13902b.m82328a(AuthState.ON_FIRST_FOUND_FACE, (Object) null);
                    }
                    c13905e.m82337a(2, "AuthStateManager", "found face!");
                }
            }
            identifier = -1;
        }
        if (identifier == -1) {
            return;
        }
        if (c13902b.f57419j != identifier) {
            int i2 = c13902b.f57420k;
            if (i2 >= 3) {
                c13902b.f57419j = identifier;
                c13902b.f57418i = identifier;
                c13902b.f57420k = 0;
                i = identifier;
            } else if (c13902b.f57418i != identifier) {
                c13902b.f57418i = identifier;
                c13902b.f57420k = 0;
            } else {
                c13902b.f57420k = i2 + 1;
            }
            if (i == -1) {
                return;
            }
            color = c13902b.f57425p;
            c13880j = C13880j.a.f57352a;
            AuthUiConfig authUiConfig = c13880j.f57344c;
            huiYanSdkConfig = c13880j.f57343b;
            if (huiYanSdkConfig == null) {
                pageColorStyle = PageColorStyle.Light;
            } else {
                pageColorStyle = huiYanSdkConfig.getPageColorStyle();
            }
            if (pageColorStyle == PageColorStyle.Dark && authUiConfig != null && authUiConfig.getFeedBackTxtColor() == -1) {
                color = context.getResources().getColor(C13869R.color.txy_white);
            }
            if (identifier != -1 && c13902b.m82331a(identifier, c13902b.f57414e)) {
                color = c13902b.f57424o;
            }
            string = context.getResources().getString(identifier);
            interfaceC13883b = c13902b.f57412c;
            if (interfaceC13883b != null) {
                ((C13896f) interfaceC13883b).m82304a(string, color);
            }
            color2 = context.getResources().getColor(C13869R.color.txy_circle_color);
            if (c13902b.m82331a(identifier, c13902b.f57414e)) {
                c13902b.m82327a(c13902b.f57426q);
            } else if (identifier != -1) {
                if (c13902b.m82331a(identifier, c13902b.f57415f)) {
                    c13902b.m82327a(c13902b.f57427r);
                } else {
                    interfaceC13883b2 = c13902b.f57412c;
                    if (interfaceC13883b2 != null) {
                        ((C13896f) interfaceC13883b2).m82305b(color2);
                    }
                }
            }
            sparseArray = c13902b.f57422m;
            if (sparseArray != null || (huiYanAuthTipsEvent = sparseArray.get(identifier)) == null) {
            }
            if (huiYanAuthTipsEvent == null) {
                c13880j.m82233a(HuiYanAuthTipsEvent.NONE, false);
            } else {
                if (c13902b.f57423n == huiYanAuthTipsEvent) {
                    return;
                }
                c13880j.m82233a(huiYanAuthTipsEvent, false);
                c13902b.f57423n = huiYanAuthTipsEvent;
            }
        }
        c13902b.f57420k = 0;
        i = -1;
        if (i == -1) {
            return;
        }
        color = c13902b.f57425p;
        c13880j = C13880j.a.f57352a;
        AuthUiConfig authUiConfig2 = c13880j.f57344c;
        huiYanSdkConfig = c13880j.f57343b;
        if (huiYanSdkConfig == null) {
            pageColorStyle = PageColorStyle.Light;
        } else {
            pageColorStyle = huiYanSdkConfig.getPageColorStyle();
        }
        if (pageColorStyle == PageColorStyle.Dark) {
            color = context.getResources().getColor(C13869R.color.txy_white);
        }
        if (identifier != -1) {
            color = c13902b.f57424o;
        }
        string = context.getResources().getString(identifier);
        interfaceC13883b = c13902b.f57412c;
        if (interfaceC13883b != null) {
            ((C13896f) interfaceC13883b).m82304a(string, color);
        }
        color2 = context.getResources().getColor(C13869R.color.txy_circle_color);
        if (c13902b.m82331a(identifier, c13902b.f57414e)) {
            c13902b.m82327a(c13902b.f57426q);
        } else if (identifier != -1) {
            if (c13902b.m82331a(identifier, c13902b.f57415f)) {
                c13902b.m82327a(c13902b.f57427r);
            } else {
                interfaceC13883b2 = c13902b.f57412c;
                if (interfaceC13883b2 != null) {
                    ((C13896f) interfaceC13883b2).m82305b(color2);
                }
            }
        }
        sparseArray = c13902b.f57422m;
        huiYanAuthTipsEvent = sparseArray != null ? HuiYanAuthTipsEvent.NONE : HuiYanAuthTipsEvent.NONE;
        if (huiYanAuthTipsEvent == null) {
            c13880j.m82233a(HuiYanAuthTipsEvent.NONE, false);
        } else {
            if (c13902b.f57423n == huiYanAuthTipsEvent) {
                return;
            }
            c13880j.m82233a(huiYanAuthTipsEvent, false);
            c13902b.f57423n = huiYanAuthTipsEvent;
        }
    }

    @Override // com.tencent.could.huiyansdk.base.HuiYanBaseCallBack
    /* JADX INFO: renamed from: b */
    public void mo82227b() {
        long j;
        int[] iArrChangeActions;
        C13880j c13880j = this.f57341a;
        HuiYanSdkConfig huiYanSdkConfig = c13880j.f57343b;
        if (huiYanSdkConfig != null) {
            try {
                C13900b c13900b = C13900b.a.f57405a;
                c13900b.m82316a("change_point_num", huiYanSdkConfig.getChangePointNum());
                int i = 1;
                C13905e.a.f57445a.m82337a(1, "HuiYanSdkImp", "update you tu config!");
                c13900b.f57404c = huiYanSdkConfig.isOpenFullLog();
                c13900b.m82316a("timeout_countdown_ms", huiYanSdkConfig.getAuthTimeOutMs());
                try {
                    int iOrdinal = huiYanSdkConfig.getPackageTest().ordinal();
                    j = (iOrdinal == 0 || iOrdinal == 1) ? 8L : 20L;
                } catch (Exception unused) {
                }
                c13900b.m82316a("action_frame_num", j);
                C13900b c13900b2 = C13900b.a.f57405a;
                c13900b2.m82315a("secondary_roll_threshold", huiYanSdkConfig.getBestImageRoll());
                c13900b2.m82315a("secondary_yaw_threshold", huiYanSdkConfig.getBestImageYaw());
                c13900b2.m82315a("secondary_pitch_threshold", huiYanSdkConfig.getBestImagePitch());
                c13900b2.m82316a("continuous_angle_num_threshold", c13880j.f57343b.getBestImageContinuousFrameNum());
                c13900b2.m82321b("need_angle_detect_reflection", huiYanSdkConfig.isOpenAngleDetect());
                c13900b2.m82315a("bigface_ratio_threshold", huiYanSdkConfig.getBigFaceRatioThreshold());
                if (huiYanSdkConfig.isOpenAngleDetect()) {
                    c13900b2.m82320b("correction_angle_action_type", "1,5");
                } else if (c13900b2.f57402a != null) {
                    String strM82313a = c13900b2.m82313a();
                    if (c13900b2.f57402a.has(strM82313a)) {
                        JSONObject jSONObject = c13900b2.f57402a.getJSONObject(strM82313a);
                        jSONObject.remove("correction_angle_action_type");
                        c13900b2.f57402a.put(strM82313a, jSONObject);
                    }
                }
                if (huiYanSdkConfig.isLandMode()) {
                    c13900b2.m82316a("screen_orientation", 1L);
                    c13900b2.m82315a("smallface_ratio_threshold", huiYanSdkConfig.getLandCloseRatio());
                } else {
                    c13900b2.m82316a("screen_orientation", 0L);
                    c13900b2.m82315a("smallface_ratio_threshold", huiYanSdkConfig.getPortraitCloseRatio());
                }
                if (huiYanSdkConfig.isOpenLongCheck()) {
                    c13900b2.m82321b("need_face_quality", true);
                    c13900b2.m82321b("need_local_face_best_image", true);
                    c13900b2.m82316a("local_face_best_image_quality", huiYanSdkConfig.getLongCheckBestImageQuality());
                    if (huiYanSdkConfig.isLongCheckUseLocalCloseMouthThreshold()) {
                        c13900b2.m82321b("need_local_close_mouth_threshold", true);
                    }
                    if (huiYanSdkConfig.isNeedCropBestImageMode()) {
                        c13900b2.m82315a("quality_face_real_min_height_threshold", huiYanSdkConfig.getLongCheckFaceRealMinHeightThreshold());
                    } else {
                        c13900b2.m82315a("quality_face_real_min_height_threshold", huiYanSdkConfig.getLongCheckFaceMinHeightThreshold());
                    }
                    c13900b2.m82316a("continuous_quality_num_threshold", 10L);
                }
                if (huiYanSdkConfig.isUseBestFaceImage()) {
                    c13900b2.m82321b("need_face_quality", true);
                    c13900b2.m82321b("need_local_face_best_image", false);
                }
                if (huiYanSdkConfig.isOpenLongCheck() || huiYanSdkConfig.isUseBestFaceImage()) {
                    c13900b2.m82315a("quality_face_max_height_threshold", huiYanSdkConfig.getLongCheckFaceMaxHeightThreshold());
                    c13900b2.m82315a("quality_face_min_height_threshold", huiYanSdkConfig.getLongCheckFaceMinHeightThreshold());
                    c13900b2.m82315a("quality_close_mouth_threshold", huiYanSdkConfig.getLongCheckCloseMouthThreshold());
                    c13900b2.m82315a("quality_close_eye_right_threshold", huiYanSdkConfig.getLongCheckCloseEyeRightThreshold());
                    c13900b2.m82315a("quality_close_eye_left_threshold", huiYanSdkConfig.getLongCheckCloseEyeLeftThreshold());
                }
                if (huiYanSdkConfig.isUseBackCamera()) {
                    c13900b2.m82316a("rear_camera_tag", 1L);
                }
                c13900b2.m82316a("need_best_original_size", huiYanSdkConfig.getLongCheckNeedBestOriginalSize());
                String useCustomerModelPath = huiYanSdkConfig.getUseCustomerModelPath();
                if (c13900b2 == null) {
                    throw null;
                }
                if (TextUtils.isEmpty(useCustomerModelPath)) {
                    C13905e.a.f57445a.m82337a(1, "YouTuSdkHelper", "no need load model!");
                } else {
                    c13900b2.m82321b("resource_online", true);
                    if (!useCustomerModelPath.endsWith("/")) {
                        useCustomerModelPath = useCustomerModelPath.concat("/");
                    }
                    c13900b2.m82320b("resource_download_path", useCustomerModelPath);
                }
                HuiYanLiveMode huiYanLiveMode = huiYanSdkConfig.getHuiYanLiveMode();
                if (huiYanLiveMode == HuiYanLiveMode.ACTION_REFLECT_MODE) {
                    c13900b2.m82321b("need_encrypt", !huiYanSdkConfig.isCloseEncrypt());
                    if (!huiYanSdkConfig.isCloseEncrypt()) {
                        c13900b2.m82316a("enhance_encrypt_method", huiYanSdkConfig.getEncryptMode().ordinal() != 1 ? 0 : 1);
                    }
                }
                c13900b2.m82321b("relaxed_shelter_threshold", huiYanSdkConfig.isRelaxed());
                int iOrdinal2 = c13880j.f57343b.getFaceOcclusionLevel().ordinal();
                if (iOrdinal2 == 1) {
                    i = 2;
                } else if (iOrdinal2 == 2) {
                    i = 3;
                } else if (iOrdinal2 == 3) {
                    i = 4;
                }
                c13900b2.m82316a("shelter_judge_level", i);
                c13900b2.m82321b("need_pose_check_mouth_open", huiYanSdkConfig.isOtherActionCheckMouthOpen());
                if (huiYanLiveMode == HuiYanLiveMode.ACTION_MODE && (iArrChangeActions = CommonUtils.changeActions(huiYanSdkConfig.getActions())) != null) {
                    c13900b2.m82317a("action_default_seq", iArrChangeActions);
                }
            } catch (Exception unused2) {
                C13905e.a.f57445a.m82337a(2, "HuiYanSdkImp", "update you tu config error!");
            }
        }
        InterfaceC13872b interfaceC13872b = this.f57341a.f57348g;
        if (interfaceC13872b != null) {
            interfaceC13872b.onOperateTimeEvent("StartYTAuthUseTime", 2, false, "");
        }
    }

    @Override // com.tencent.could.huiyansdk.base.HuiYanBaseCallBack
    /* JADX INFO: renamed from: c */
    public void mo82229c() {
        C13902b.b.f57433a.m82328a(AuthState.ON_ENTRY_BOT, (Object) null);
    }

    @Override // com.tencent.could.huiyansdk.base.HuiYanBaseCallBack
    public void onFail(int i, String str) {
        this.f57341a.getClass();
        CommonUtils.closeCurrentFragment();
        this.f57341a.m82231a(i, str);
        String str2 = "code: " + i + " msg: " + str;
        InterfaceC13872b interfaceC13872b = this.f57341a.f57348g;
        if (interfaceC13872b != null) {
            interfaceC13872b.onBuriedPointCallBack("InitSDKStage", "HuiYanInitError", str2);
        }
    }

    @Override // com.tencent.could.huiyansdk.base.HuiYanBaseCallBack
    public void onOperateTimeEvent(String str, int i, boolean z, String str2) {
        InterfaceC13872b interfaceC13872b = this.f57341a.f57348g;
        if (interfaceC13872b != null) {
            interfaceC13872b.onOperateTimeEvent(str, i, z, str2);
        }
    }

    @Override // com.tencent.could.huiyansdk.base.HuiYanBaseCallBack
    public void updateOperateInfo(String str, int i, long j, String str2) {
        InterfaceC13872b interfaceC13872b = this.f57341a.f57348g;
        if (interfaceC13872b != null) {
            interfaceC13872b.updateOperateInfo(str, i, j, str2);
        }
    }

    @Override // com.tencent.could.huiyansdk.base.HuiYanBaseCallBack
    /* JADX INFO: renamed from: a */
    public void mo82223a() {
        C13902b.b.f57433a.m82328a(AuthState.ON_EXIT_BOT, (Object) null);
    }

    @Override // com.tencent.could.huiyansdk.base.HuiYanBaseCallBack
    /* JADX INFO: renamed from: a */
    public void mo82224a(int i, boolean z, boolean z2) {
        HuiYanAuthEvent huiYanAuthEvent;
        C13880j c13880j = this.f57341a;
        c13880j.getClass();
        switch (i) {
            case 1:
                huiYanAuthEvent = !z ? HuiYanAuthEvent.BLINK_CHECK : HuiYanAuthEvent.BLINK_CHECK_DONE;
                break;
            case 2:
                huiYanAuthEvent = !z ? HuiYanAuthEvent.OPEN_MOUTH_CHECK : HuiYanAuthEvent.OPEN_MOUTH_CHECK_DONE;
                break;
            case 3:
                huiYanAuthEvent = !z ? HuiYanAuthEvent.NOD_HEAD_CHECK : HuiYanAuthEvent.NOD_HEAD_CHECK_DONE;
                break;
            case 4:
                huiYanAuthEvent = !z ? HuiYanAuthEvent.SHAKE_HEAD_CHECK : HuiYanAuthEvent.SHAKE_HEAD_CHECK_DONE;
                break;
            case 5:
                huiYanAuthEvent = !z ? HuiYanAuthEvent.SILENCE_CHECK : HuiYanAuthEvent.SILENCE_CHECK_DONE;
                break;
            case 6:
                huiYanAuthEvent = HuiYanAuthEvent.ALL_ACTION_DONE;
                break;
            default:
                huiYanAuthEvent = HuiYanAuthEvent.NONE;
                break;
        }
        c13880j.m82232a(huiYanAuthEvent, z2);
        if (z) {
            return;
        }
        C13902b c13902b = C13902b.b.f57433a;
        if (c13902b.f57413d) {
            c13902b.m82328a(AuthState.ON_ENTRY_OTHER_ACTION, (Object) null);
        }
    }

    @Override // com.tencent.could.huiyansdk.base.HuiYanBaseCallBack
    /* JADX INFO: renamed from: a */
    public void mo82225a(String str) {
        C13880j c13880j = this.f57341a;
        if (c13880j.f57346e) {
            C13905e.a.f57445a.m82337a(2, "HuiYanSdkImp", "ConfigDataSuccess but isCurrentFinish is ture!");
            return;
        }
        InterfaceC13876f interfaceC13876f = c13880j.f57347f;
        if (interfaceC13876f != null) {
            interfaceC13876f.onSelectSuccess(str);
        }
    }

    @Override // com.tencent.could.huiyansdk.base.HuiYanBaseCallBack
    /* JADX INFO: renamed from: b */
    public void mo82228b(String str) {
        C13905e.a.f57445a.m82337a(2, "HuiYanSdkImp", "get compare result data.");
        this.f57341a.getClass();
        C13902b.b.f57433a.m82329a(str);
    }
}
