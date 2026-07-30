package com.tencent.could.huiyansdk.api;

import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import com.tencent.could.huiyansdk.C14032R;
import com.tencent.could.huiyansdk.base.HuiYanBaseCallBack;
import com.tencent.could.huiyansdk.callback.InterfaceC14046b;
import com.tencent.could.huiyansdk.entity.AuthUiConfig;
import com.tencent.could.huiyansdk.entity.CompareResult;
import com.tencent.could.huiyansdk.entity.HuiYanSdkConfig;
import com.tencent.could.huiyansdk.enums.AuthState;
import com.tencent.could.huiyansdk.enums.HuiYanAuthEvent;
import com.tencent.could.huiyansdk.enums.HuiYanAuthTipsEvent;
import com.tencent.could.huiyansdk.enums.HuiYanLiveMode;
import com.tencent.could.huiyansdk.enums.PageColorStyle;
import com.tencent.could.huiyansdk.fragments.C14059f;
import com.tencent.could.huiyansdk.helper.C14063b;
import com.tencent.could.huiyansdk.manager.C14065b;
import com.tencent.could.huiyansdk.manager.C14068e;
import com.tencent.could.huiyansdk.turing.C14087f;
import com.tencent.could.huiyansdk.utils.CommonUtils;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.api.i */
/* JADX INFO: loaded from: classes12.dex */
public class C14042i implements HuiYanBaseCallBack {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C14043j f58189a;

    public C14042i(C14043j c14043j) {
        this.f58189a = c14043j;
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
    public void mo83409a(HashMap<String, Object> map) {
        int identifier;
        int i;
        int color;
        C14043j c14043j;
        HuiYanSdkConfig huiYanSdkConfig;
        PageColorStyle pageColorStyle;
        String string;
        InterfaceC14046b interfaceC14046b;
        int color2;
        InterfaceC14046b interfaceC14046b2;
        SparseArray<HuiYanAuthTipsEvent> sparseArray;
        HuiYanAuthTipsEvent huiYanAuthTipsEvent;
        HuiYanAuthTipsEvent huiYanAuthTipsEvent2;
        C14065b c14065b = C14065b.b.f58281a;
        c14065b.getClass();
        Context context = CommonUtils.getContext();
        if (context == null) {
            C14068e.a.f58293a.m83520a(2, "AuthStateManager", "context is null");
            return;
        }
        if (map.containsKey(StateEvent.Name.UI_EXTRA_TIPS)) {
            String str = (String) map.get(StateEvent.Name.UI_EXTRA_TIPS);
            if (TextUtils.isEmpty(str)) {
                HuiYanAuthTipsEvent huiYanAuthTipsEvent3 = HuiYanAuthTipsEvent.NONE;
                InterfaceC14046b interfaceC14046b3 = c14065b.f58260c;
                if (interfaceC14046b3 != null) {
                    ((C14059f) interfaceC14046b3).m83486a(context, -1, huiYanAuthTipsEvent3);
                }
            } else {
                int identifier2 = context.getResources().getIdentifier(str, "string", context.getPackageName());
                if (c14065b.m83514a(identifier2, c14065b.f58264g)) {
                    SparseArray<HuiYanAuthTipsEvent> sparseArray2 = c14065b.f58270m;
                    if (sparseArray2 == null || (huiYanAuthTipsEvent2 = sparseArray2.get(identifier2)) == null) {
                        huiYanAuthTipsEvent2 = HuiYanAuthTipsEvent.NONE;
                    }
                    InterfaceC14046b interfaceC14046b4 = c14065b.f58260c;
                    if (interfaceC14046b4 != null) {
                        ((C14059f) interfaceC14046b4).m83486a(context, identifier2, huiYanAuthTipsEvent2);
                    }
                }
            }
        } else {
            HuiYanAuthTipsEvent huiYanAuthTipsEvent4 = HuiYanAuthTipsEvent.NONE;
            InterfaceC14046b interfaceC14046b5 = c14065b.f58260c;
            if (interfaceC14046b5 != null) {
                ((C14059f) interfaceC14046b5).m83486a(context, -1, huiYanAuthTipsEvent4);
            }
        }
        String str2 = (String) map.get(StateEvent.Name.UI_TIPS);
        C14068e c14068e = C14068e.a.f58293a;
        if (c14068e.f58291c != null && c14068e.f58292d != null) {
            Message messageObtainMessage = c14068e.f58292d.obtainMessage();
            messageObtainMessage.what = 0;
            messageObtainMessage.obj = str2;
            c14068e.f58292d.sendMessage(messageObtainMessage);
        }
        if (TextUtils.isEmpty(str2)) {
            identifier = -1;
        } else {
            identifier = context.getResources().getIdentifier(str2, "string", context.getPackageName());
            if (identifier == C14032R.string.rst_failed) {
                String string2 = context.getString(C14032R.string.txy_local_check_fail);
                if (map.containsKey(StateEvent.Name.ERROR_CODE)) {
                    Integer num = (Integer) map.get(StateEvent.Name.ERROR_CODE);
                    if (num.intValue() == 4194307) {
                        string2 = context.getString(C14032R.string.txy_local_check_out_time);
                    }
                    string2 = string2 + "(code:" + num + ")";
                }
                InterfaceC14035b interfaceC14035b = C14043j.a.f58200a.f58196g;
                if (interfaceC14035b != null) {
                    interfaceC14035b.onBuriedPointCallBack("AuthCheckStage", "YouTuLocalCheckError", string2);
                }
                CompareResult compareResult = new CompareResult();
                compareResult.setErrorCode(228);
                compareResult.setErrorMsg(string2);
                c14065b.m83511a(AuthState.AUTH_FAIL, compareResult);
            } else if (!c14065b.m83514a(identifier, c14065b.f58265h)) {
                if (identifier != -1 && identifier != C14032R.string.fl_no_face && identifier != C14032R.string.msg_fsm_pause && !c14065b.f58261d) {
                    c14065b.f58261d = true;
                    C14087f.a.f58344a.f58331b = true;
                    if (C14043j.a.f58200a.m83418b().isOpenLongCheck()) {
                        c14065b.m83511a(AuthState.ON_ENTRY_BOT, (Object) null);
                    } else {
                        c14065b.m83511a(AuthState.ON_FIRST_FOUND_FACE, (Object) null);
                    }
                    c14068e.m83520a(2, "AuthStateManager", "found face!");
                }
            }
            identifier = -1;
        }
        if (identifier == -1) {
            return;
        }
        if (c14065b.f58267j != identifier) {
            int i2 = c14065b.f58268k;
            if (i2 >= 3) {
                c14065b.f58267j = identifier;
                c14065b.f58266i = identifier;
                c14065b.f58268k = 0;
                i = identifier;
            } else if (c14065b.f58266i != identifier) {
                c14065b.f58266i = identifier;
                c14065b.f58268k = 0;
            } else {
                c14065b.f58268k = i2 + 1;
            }
            if (i == -1) {
                return;
            }
            color = c14065b.f58273p;
            c14043j = C14043j.a.f58200a;
            AuthUiConfig authUiConfig = c14043j.f58192c;
            huiYanSdkConfig = c14043j.f58191b;
            if (huiYanSdkConfig == null) {
                pageColorStyle = PageColorStyle.Light;
            } else {
                pageColorStyle = huiYanSdkConfig.getPageColorStyle();
            }
            if (pageColorStyle == PageColorStyle.Dark && authUiConfig != null && authUiConfig.getFeedBackTxtColor() == -1) {
                color = context.getResources().getColor(C14032R.color.txy_white);
            }
            if (identifier != -1 && c14065b.m83514a(identifier, c14065b.f58262e)) {
                color = c14065b.f58272o;
            }
            string = context.getResources().getString(identifier);
            interfaceC14046b = c14065b.f58260c;
            if (interfaceC14046b != null) {
                ((C14059f) interfaceC14046b).m83487a(string, color);
            }
            color2 = context.getResources().getColor(C14032R.color.txy_circle_color);
            if (c14065b.m83514a(identifier, c14065b.f58262e)) {
                c14065b.m83510a(c14065b.f58274q);
            } else if (identifier != -1) {
                if (c14065b.m83514a(identifier, c14065b.f58263f)) {
                    c14065b.m83510a(c14065b.f58275r);
                } else {
                    interfaceC14046b2 = c14065b.f58260c;
                    if (interfaceC14046b2 != null) {
                        ((C14059f) interfaceC14046b2).m83488b(color2);
                    }
                }
            }
            sparseArray = c14065b.f58270m;
            if (sparseArray != null || (huiYanAuthTipsEvent = sparseArray.get(identifier)) == null) {
            }
            if (huiYanAuthTipsEvent == null) {
                c14043j.m83416a(HuiYanAuthTipsEvent.NONE, false);
            } else {
                if (c14065b.f58271n == huiYanAuthTipsEvent) {
                    return;
                }
                c14043j.m83416a(huiYanAuthTipsEvent, false);
                c14065b.f58271n = huiYanAuthTipsEvent;
            }
        }
        c14065b.f58268k = 0;
        i = -1;
        if (i == -1) {
            return;
        }
        color = c14065b.f58273p;
        c14043j = C14043j.a.f58200a;
        AuthUiConfig authUiConfig2 = c14043j.f58192c;
        huiYanSdkConfig = c14043j.f58191b;
        if (huiYanSdkConfig == null) {
            pageColorStyle = PageColorStyle.Light;
        } else {
            pageColorStyle = huiYanSdkConfig.getPageColorStyle();
        }
        if (pageColorStyle == PageColorStyle.Dark) {
            color = context.getResources().getColor(C14032R.color.txy_white);
        }
        if (identifier != -1) {
            color = c14065b.f58272o;
        }
        string = context.getResources().getString(identifier);
        interfaceC14046b = c14065b.f58260c;
        if (interfaceC14046b != null) {
            ((C14059f) interfaceC14046b).m83487a(string, color);
        }
        color2 = context.getResources().getColor(C14032R.color.txy_circle_color);
        if (c14065b.m83514a(identifier, c14065b.f58262e)) {
            c14065b.m83510a(c14065b.f58274q);
        } else if (identifier != -1) {
            if (c14065b.m83514a(identifier, c14065b.f58263f)) {
                c14065b.m83510a(c14065b.f58275r);
            } else {
                interfaceC14046b2 = c14065b.f58260c;
                if (interfaceC14046b2 != null) {
                    ((C14059f) interfaceC14046b2).m83488b(color2);
                }
            }
        }
        sparseArray = c14065b.f58270m;
        huiYanAuthTipsEvent = sparseArray != null ? HuiYanAuthTipsEvent.NONE : HuiYanAuthTipsEvent.NONE;
        if (huiYanAuthTipsEvent == null) {
            c14043j.m83416a(HuiYanAuthTipsEvent.NONE, false);
        } else {
            if (c14065b.f58271n == huiYanAuthTipsEvent) {
                return;
            }
            c14043j.m83416a(huiYanAuthTipsEvent, false);
            c14065b.f58271n = huiYanAuthTipsEvent;
        }
    }

    @Override // com.tencent.could.huiyansdk.base.HuiYanBaseCallBack
    /* JADX INFO: renamed from: b */
    public void mo83410b() {
        long j;
        int[] iArrChangeActions;
        C14043j c14043j = this.f58189a;
        HuiYanSdkConfig huiYanSdkConfig = c14043j.f58191b;
        if (huiYanSdkConfig != null) {
            try {
                C14063b c14063b = C14063b.a.f58253a;
                c14063b.m83499a("change_point_num", huiYanSdkConfig.getChangePointNum());
                int i = 1;
                C14068e.a.f58293a.m83520a(1, "HuiYanSdkImp", "update you tu config!");
                c14063b.f58252c = huiYanSdkConfig.isOpenFullLog();
                c14063b.m83499a("timeout_countdown_ms", huiYanSdkConfig.getAuthTimeOutMs());
                try {
                    int iOrdinal = huiYanSdkConfig.getPackageTest().ordinal();
                    j = (iOrdinal == 0 || iOrdinal == 1) ? 8L : 20L;
                } catch (Exception unused) {
                }
                c14063b.m83499a("action_frame_num", j);
                C14063b c14063b2 = C14063b.a.f58253a;
                c14063b2.m83498a("secondary_roll_threshold", huiYanSdkConfig.getBestImageRoll());
                c14063b2.m83498a("secondary_yaw_threshold", huiYanSdkConfig.getBestImageYaw());
                c14063b2.m83498a("secondary_pitch_threshold", huiYanSdkConfig.getBestImagePitch());
                c14063b2.m83499a("continuous_angle_num_threshold", c14043j.f58191b.getBestImageContinuousFrameNum());
                c14063b2.m83504b("need_angle_detect_reflection", huiYanSdkConfig.isOpenAngleDetect());
                c14063b2.m83498a("bigface_ratio_threshold", huiYanSdkConfig.getBigFaceRatioThreshold());
                if (huiYanSdkConfig.isOpenAngleDetect()) {
                    c14063b2.m83503b("correction_angle_action_type", "1,5");
                } else if (c14063b2.f58250a != null) {
                    String strM83496a = c14063b2.m83496a();
                    if (c14063b2.f58250a.has(strM83496a)) {
                        JSONObject jSONObject = c14063b2.f58250a.getJSONObject(strM83496a);
                        jSONObject.remove("correction_angle_action_type");
                        c14063b2.f58250a.put(strM83496a, jSONObject);
                    }
                }
                if (huiYanSdkConfig.isLandMode()) {
                    c14063b2.m83499a("screen_orientation", 1L);
                    c14063b2.m83498a("smallface_ratio_threshold", huiYanSdkConfig.getLandCloseRatio());
                } else {
                    c14063b2.m83499a("screen_orientation", 0L);
                    c14063b2.m83498a("smallface_ratio_threshold", huiYanSdkConfig.getPortraitCloseRatio());
                }
                if (huiYanSdkConfig.isOpenLongCheck()) {
                    c14063b2.m83504b("need_face_quality", true);
                    c14063b2.m83504b("need_local_face_best_image", true);
                    c14063b2.m83499a("local_face_best_image_quality", huiYanSdkConfig.getLongCheckBestImageQuality());
                    if (huiYanSdkConfig.isLongCheckUseLocalCloseMouthThreshold()) {
                        c14063b2.m83504b("need_local_close_mouth_threshold", true);
                    }
                    if (huiYanSdkConfig.isNeedCropBestImageMode()) {
                        c14063b2.m83498a("quality_face_real_min_height_threshold", huiYanSdkConfig.getLongCheckFaceRealMinHeightThreshold());
                    } else {
                        c14063b2.m83498a("quality_face_real_min_height_threshold", huiYanSdkConfig.getLongCheckFaceMinHeightThreshold());
                    }
                    c14063b2.m83499a("continuous_quality_num_threshold", 10L);
                }
                if (huiYanSdkConfig.isUseBestFaceImage()) {
                    c14063b2.m83504b("need_face_quality", true);
                    c14063b2.m83504b("need_local_face_best_image", false);
                }
                if (huiYanSdkConfig.isOpenLongCheck() || huiYanSdkConfig.isUseBestFaceImage()) {
                    c14063b2.m83498a("quality_face_max_height_threshold", huiYanSdkConfig.getLongCheckFaceMaxHeightThreshold());
                    c14063b2.m83498a("quality_face_min_height_threshold", huiYanSdkConfig.getLongCheckFaceMinHeightThreshold());
                    c14063b2.m83498a("quality_close_mouth_threshold", huiYanSdkConfig.getLongCheckCloseMouthThreshold());
                    c14063b2.m83498a("quality_close_eye_right_threshold", huiYanSdkConfig.getLongCheckCloseEyeRightThreshold());
                    c14063b2.m83498a("quality_close_eye_left_threshold", huiYanSdkConfig.getLongCheckCloseEyeLeftThreshold());
                }
                if (huiYanSdkConfig.isUseBackCamera()) {
                    c14063b2.m83499a("rear_camera_tag", 1L);
                }
                c14063b2.m83499a("need_best_original_size", huiYanSdkConfig.getLongCheckNeedBestOriginalSize());
                String useCustomerModelPath = huiYanSdkConfig.getUseCustomerModelPath();
                if (c14063b2 == null) {
                    throw null;
                }
                if (TextUtils.isEmpty(useCustomerModelPath)) {
                    C14068e.a.f58293a.m83520a(1, "YouTuSdkHelper", "no need load model!");
                } else {
                    c14063b2.m83504b("resource_online", true);
                    if (!useCustomerModelPath.endsWith("/")) {
                        useCustomerModelPath = useCustomerModelPath.concat("/");
                    }
                    c14063b2.m83503b("resource_download_path", useCustomerModelPath);
                }
                HuiYanLiveMode huiYanLiveMode = huiYanSdkConfig.getHuiYanLiveMode();
                if (huiYanLiveMode == HuiYanLiveMode.ACTION_REFLECT_MODE) {
                    c14063b2.m83504b("need_encrypt", !huiYanSdkConfig.isCloseEncrypt());
                    if (!huiYanSdkConfig.isCloseEncrypt()) {
                        c14063b2.m83499a("enhance_encrypt_method", huiYanSdkConfig.getEncryptMode().ordinal() != 1 ? 0 : 1);
                    }
                }
                c14063b2.m83504b("relaxed_shelter_threshold", huiYanSdkConfig.isRelaxed());
                int iOrdinal2 = c14043j.f58191b.getFaceOcclusionLevel().ordinal();
                if (iOrdinal2 == 1) {
                    i = 2;
                } else if (iOrdinal2 == 2) {
                    i = 3;
                } else if (iOrdinal2 == 3) {
                    i = 4;
                }
                c14063b2.m83499a("shelter_judge_level", i);
                c14063b2.m83504b("need_pose_check_mouth_open", huiYanSdkConfig.isOtherActionCheckMouthOpen());
                if (huiYanLiveMode == HuiYanLiveMode.ACTION_MODE && (iArrChangeActions = CommonUtils.changeActions(huiYanSdkConfig.getActions())) != null) {
                    c14063b2.m83500a("action_default_seq", iArrChangeActions);
                }
            } catch (Exception unused2) {
                C14068e.a.f58293a.m83520a(2, "HuiYanSdkImp", "update you tu config error!");
            }
        }
        InterfaceC14035b interfaceC14035b = this.f58189a.f58196g;
        if (interfaceC14035b != null) {
            interfaceC14035b.onOperateTimeEvent("StartYTAuthUseTime", 2, false, "");
        }
    }

    @Override // com.tencent.could.huiyansdk.base.HuiYanBaseCallBack
    /* JADX INFO: renamed from: c */
    public void mo83412c() {
        C14065b.b.f58281a.m83511a(AuthState.ON_ENTRY_BOT, (Object) null);
    }

    @Override // com.tencent.could.huiyansdk.base.HuiYanBaseCallBack
    public void onFail(int i, String str) {
        this.f58189a.getClass();
        CommonUtils.closeCurrentFragment();
        this.f58189a.m83414a(i, str);
        String str2 = "code: " + i + " msg: " + str;
        InterfaceC14035b interfaceC14035b = this.f58189a.f58196g;
        if (interfaceC14035b != null) {
            interfaceC14035b.onBuriedPointCallBack("InitSDKStage", "HuiYanInitError", str2);
        }
    }

    @Override // com.tencent.could.huiyansdk.base.HuiYanBaseCallBack
    public void onOperateTimeEvent(String str, int i, boolean z, String str2) {
        InterfaceC14035b interfaceC14035b = this.f58189a.f58196g;
        if (interfaceC14035b != null) {
            interfaceC14035b.onOperateTimeEvent(str, i, z, str2);
        }
    }

    @Override // com.tencent.could.huiyansdk.base.HuiYanBaseCallBack
    public void updateOperateInfo(String str, int i, long j, String str2) {
        InterfaceC14035b interfaceC14035b = this.f58189a.f58196g;
        if (interfaceC14035b != null) {
            interfaceC14035b.updateOperateInfo(str, i, j, str2);
        }
    }

    @Override // com.tencent.could.huiyansdk.base.HuiYanBaseCallBack
    /* JADX INFO: renamed from: a */
    public void mo83406a() {
        C14065b.b.f58281a.m83511a(AuthState.ON_EXIT_BOT, (Object) null);
    }

    @Override // com.tencent.could.huiyansdk.base.HuiYanBaseCallBack
    /* JADX INFO: renamed from: a */
    public void mo83407a(int i, boolean z, boolean z2) {
        HuiYanAuthEvent huiYanAuthEvent;
        C14043j c14043j = this.f58189a;
        c14043j.getClass();
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
        c14043j.m83415a(huiYanAuthEvent, z2);
        if (z) {
            return;
        }
        C14065b c14065b = C14065b.b.f58281a;
        if (c14065b.f58261d) {
            c14065b.m83511a(AuthState.ON_ENTRY_OTHER_ACTION, (Object) null);
        }
    }

    @Override // com.tencent.could.huiyansdk.base.HuiYanBaseCallBack
    /* JADX INFO: renamed from: a */
    public void mo83408a(String str) {
        C14043j c14043j = this.f58189a;
        if (c14043j.f58194e) {
            C14068e.a.f58293a.m83520a(2, "HuiYanSdkImp", "ConfigDataSuccess but isCurrentFinish is ture!");
            return;
        }
        InterfaceC14039f interfaceC14039f = c14043j.f58195f;
        if (interfaceC14039f != null) {
            interfaceC14039f.onSelectSuccess(str);
        }
    }

    @Override // com.tencent.could.huiyansdk.base.HuiYanBaseCallBack
    /* JADX INFO: renamed from: b */
    public void mo83411b(String str) {
        C14068e.a.f58293a.m83520a(2, "HuiYanSdkImp", "get compare result data.");
        this.f58189a.getClass();
        C14065b.b.f58281a.m83512a(str);
    }
}
