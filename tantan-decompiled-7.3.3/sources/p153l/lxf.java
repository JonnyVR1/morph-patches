package p153l;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.alipay.face.api.ZIMCallback;
import com.alipay.face.api.ZIMFacade;
import com.alipay.face.api.ZIMFacadeBuilder;
import com.bytedance.labcv.bytedcertsdk.callback.SDKCallBack;
import com.bytedance.labcv.bytedcertsdk.manager.BytedFaceLiveManager;
import com.bytedance.labcv.bytedcertsdk.model.CertConfig;
import com.idv.identity.platform.api.IdentityCallback;
import com.idv.identity.platform.api.IdentityPlatform;
import com.idv.identity.platform.api.IdentityResponse;
import com.immomo.cvcenter.interfaces.DetectorListener$OnDetectorPreparedListener;
import com.immomo.mncertification.MNFCService;
import com.tantanapp.media.ttmediamncertification.FacertificationSDKType;
import com.tantanapp.media.ttmediamncertification.impl.DummyActivity;
import com.tencent.cloud.huiyansdkface.facelight.api.WbCloudFaceVerifySdk;
import com.tencent.cloud.huiyansdkface.facelight.api.listeners.WbCloudFaceVerifyLoginListener;
import com.tencent.cloud.huiyansdkface.facelight.api.listeners.WbCloudFaceVerifyResultListener;
import com.tencent.cloud.huiyansdkface.facelight.process.FaceVerifyStatus;
import com.tencent.could.huiyansdk.entity.HuiYanOsAuthResult;
import com.tencent.could.huiyansdk.enums.PageColorStyle;
import com.tencent.could.huiyansdk.overseas.HuiYanConfigCallback;
import com.tencent.could.huiyansdk.overseas.HuiYanOsApi;
import com.tencent.could.huiyansdk.overseas.HuiYanOsAuthCallBack;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import com.tencent.could.huiyansdk.overseas.HuiYanResultCallBack;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class lxf implements ltl {

    /* JADX INFO: renamed from: a */
    public HashMap<FacertificationSDKType, Boolean> f133923a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    public String f133924b;

    /* JADX INFO: renamed from: c */
    public HuiYanOsConfig f133925c;

    /* JADX INFO: renamed from: l.lxf$a */
    public class C18482a implements SDKCallBack.ResultCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ltl.InterfaceC18463b f133926a;

        public C18482a(ltl.InterfaceC18463b interfaceC18463b) {
            this.f133926a = interfaceC18463b;
        }
    }

    /* JADX INFO: renamed from: l.lxf$b */
    public static /* synthetic */ class C18483b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f133928a;

        static {
            int[] iArr = new int[FacertificationSDKType.values().length];
            f133928a = iArr;
            try {
                iArr[FacertificationSDKType.FACERTIFICATION_SDK_TYPE_TX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f133928a[FacertificationSDKType.FACERTIFICATION_SDK_TYPE_MOMO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f133928a[FacertificationSDKType.FACERTIFICATION_SDK_TYPE_ALI.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f133928a[FacertificationSDKType.FACERTIFICATION_SDK_TYPE_EXT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f133928a[FacertificationSDKType.FACERTIFICATION_SDK_TYPE_TX_INTL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f133928a[FacertificationSDKType.FACERTIFICATION_SDK_TYPE_TX_INTL_V2.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f133928a[FacertificationSDKType.FACERTIFICATION_SDK_TYPE_ALI_INTL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f133928a[FacertificationSDKType.FACERTIFICATION_SDK_TYPE_BYTE_VOLC.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: renamed from: l.lxf$c */
    public class C18484c implements WbCloudFaceVerifyLoginListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ltl.InterfaceC18462a f133929a;

        public C18484c(ltl.InterfaceC18462a interfaceC18462a) {
            this.f133929a = interfaceC18462a;
        }
    }

    /* JADX INFO: renamed from: l.lxf$d */
    public class C18485d implements SDKCallBack.StringResultCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ jxf f133931a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ltl.InterfaceC18462a f133932b;

        public C18485d(jxf jxfVar, ltl.InterfaceC18462a interfaceC18462a) {
            this.f133931a = jxfVar;
            this.f133932b = interfaceC18462a;
        }
    }

    /* JADX INFO: renamed from: l.lxf$e */
    public class C18486e implements HuiYanConfigCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ jxf f133934a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ltl.InterfaceC18462a f133935b;

        public C18486e(jxf jxfVar, ltl.InterfaceC18462a interfaceC18462a) {
            this.f133934a = jxfVar;
            this.f133935b = interfaceC18462a;
        }

        @Override // com.tencent.could.huiyansdk.overseas.HuiYanConfigCallback
        public void onFail(int i, String str) {
            jxf jxfVar = this.f133934a;
            jxfVar.f123023a = false;
            jxfVar.f123025c = String.valueOf(i);
            jxf jxfVar2 = this.f133934a;
            jxfVar2.f123028f = str;
            ltl.InterfaceC18462a interfaceC18462a = this.f133935b;
            if (interfaceC18462a != null) {
                interfaceC18462a.mo61369c(jxfVar2);
            }
        }

        @Override // com.tencent.could.huiyansdk.overseas.HuiYanConfigCallback
        public void onSuccess(String str) {
            jxf jxfVar = this.f133934a;
            jxfVar.f123023a = true;
            jxfVar.f123024b = str;
            ltl.InterfaceC18462a interfaceC18462a = this.f133935b;
            if (interfaceC18462a != null) {
                interfaceC18462a.mo61367a(jxfVar);
            }
        }
    }

    /* JADX INFO: renamed from: l.lxf$f */
    public class C18487f implements DetectorListener$OnDetectorPreparedListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ jxf f133937a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ltl.InterfaceC18462a f133938b;

        public C18487f(jxf jxfVar, ltl.InterfaceC18462a interfaceC18462a) {
            this.f133937a = jxfVar;
            this.f133938b = interfaceC18462a;
        }

        @Override // com.immomo.cvcenter.interfaces.DetectorListener$OnDetectorPreparedListener
        /* JADX INFO: renamed from: a */
        public void mo19370a(Map<Integer, Boolean> map) {
            if (map == null || map.size() == 0) {
                jxf jxfVar = this.f133937a;
                jxfVar.f123023a = false;
                jxfVar.f123028f = "preload resource failed";
                ltl.InterfaceC18462a interfaceC18462a = this.f133938b;
                if (interfaceC18462a != null) {
                    interfaceC18462a.mo61369c(jxfVar);
                    return;
                }
                return;
            }
            Iterator<Map.Entry<Integer, Boolean>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Boolean value = it.next().getValue();
                if (value == null || !value.booleanValue()) {
                    jxf jxfVar2 = this.f133937a;
                    jxfVar2.f123023a = false;
                    jxfVar2.f123028f = "preload resource failed";
                    ltl.InterfaceC18462a interfaceC18462a2 = this.f133938b;
                    if (interfaceC18462a2 != null) {
                        interfaceC18462a2.mo61369c(jxfVar2);
                        return;
                    }
                    return;
                }
            }
            jxf jxfVar3 = this.f133937a;
            jxfVar3.f123023a = true;
            ltl.InterfaceC18462a interfaceC18462a3 = this.f133938b;
            if (interfaceC18462a3 != null) {
                interfaceC18462a3.mo61367a(jxfVar3);
            }
        }
    }

    /* JADX INFO: renamed from: l.lxf$g */
    public class C18488g implements WbCloudFaceVerifyResultListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ltl.InterfaceC18463b f133940a;

        public C18488g(ltl.InterfaceC18463b interfaceC18463b) {
            this.f133940a = interfaceC18463b;
        }
    }

    /* JADX INFO: renamed from: l.lxf$h */
    public class C18489h implements HuiYanResultCallBack {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ kxf f133942a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ltl.InterfaceC18463b f133943b;

        public C18489h(kxf kxfVar, ltl.InterfaceC18463b interfaceC18463b) {
            this.f133942a = kxfVar;
            this.f133943b = interfaceC18463b;
        }

        @Override // com.tencent.could.huiyansdk.overseas.HuiYanResultCallBack
        public void onFail(int i, String str) {
            kxf kxfVar = this.f133942a;
            kxfVar.f129195h = false;
            kxfVar.f129189b = String.valueOf(i);
            kxf kxfVar2 = this.f133942a;
            kxfVar2.f129191d = str;
            ltl.InterfaceC18463b interfaceC18463b = this.f133943b;
            if (interfaceC18463b != null) {
                interfaceC18463b.mo122142a(kxfVar2);
            }
        }

        @Override // com.tencent.could.huiyansdk.overseas.HuiYanResultCallBack
        public void onSuccess(byte[] bArr, String str) {
            kxf kxfVar = this.f133942a;
            kxfVar.f129195h = true;
            kxfVar.f129192e = str;
            kxfVar.f129201n = bArr;
            ltl.InterfaceC18463b interfaceC18463b = this.f133943b;
            if (interfaceC18463b != null) {
                interfaceC18463b.mo122142a(kxfVar);
            }
        }
    }

    /* JADX INFO: renamed from: l.lxf$i */
    public class C18490i implements HuiYanOsAuthCallBack {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ kxf f133945a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ltl.InterfaceC18463b f133946b;

        public C18490i(kxf kxfVar, ltl.InterfaceC18463b interfaceC18463b) {
            this.f133945a = kxfVar;
            this.f133946b = interfaceC18463b;
        }

        @Override // com.tencent.could.huiyansdk.overseas.HuiYanOsAuthCallBack
        public void onFail(int i, String str, String str2) {
            this.f133945a.f129195h = String.valueOf(i).length() != 3;
            this.f133945a.f129189b = String.valueOf(i);
            kxf kxfVar = this.f133945a;
            kxfVar.f129191d = str;
            ltl.InterfaceC18463b interfaceC18463b = this.f133946b;
            if (interfaceC18463b != null) {
                interfaceC18463b.mo122142a(kxfVar);
            }
        }

        @Override // com.tencent.could.huiyansdk.overseas.HuiYanOsAuthCallBack
        public void onSuccess(HuiYanOsAuthResult huiYanOsAuthResult) {
            kxf kxfVar = this.f133945a;
            kxfVar.f129195h = true;
            ltl.InterfaceC18463b interfaceC18463b = this.f133946b;
            if (interfaceC18463b != null) {
                interfaceC18463b.mo122142a(kxfVar);
            }
        }
    }

    /* JADX INFO: renamed from: l.lxf$j */
    public class C18491j implements ZIMCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ltl.InterfaceC18463b f133948a;

        public C18491j(ltl.InterfaceC18463b interfaceC18463b) {
            this.f133948a = interfaceC18463b;
        }
    }

    /* JADX INFO: renamed from: l.lxf$k */
    public class C18492k implements IdentityCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ltl.InterfaceC18463b f133950a;

        public C18492k(ltl.InterfaceC18463b interfaceC18463b) {
            this.f133950a = interfaceC18463b;
        }

        @Override // com.idv.identity.platform.api.IdentityCallback
        public boolean response(IdentityResponse identityResponse) {
            kxf kxfVar = new kxf();
            if (identityResponse != null) {
                kxfVar.f129195h = !Arrays.asList(1002, 1003, 1004, 1006, 1009, 1011, 1012, 1013, 1014).contains(Integer.valueOf(identityResponse.code));
                kxfVar.f129189b = String.valueOf(identityResponse.code);
                kxfVar.f129191d = identityResponse.message;
            } else {
                kxfVar.f129195h = false;
                kxfVar.f129194g = "IdentityResponse is null";
            }
            ltl.InterfaceC18463b interfaceC18463b = this.f133950a;
            if (interfaceC18463b != null) {
                interfaceC18463b.mo122142a(kxfVar);
            }
            return true;
        }
    }

    @Override // p153l.ltl
    /* JADX INFO: renamed from: a */
    public void mo155798a(Context context, HashMap<String, Object> map, FacertificationSDKType facertificationSDKType, ltl.InterfaceC18462a interfaceC18462a) {
        m156173f(context, map, facertificationSDKType, interfaceC18462a);
    }

    @Override // p153l.ltl
    /* JADX INFO: renamed from: b */
    public void mo155799b(Context context, FacertificationSDKType facertificationSDKType, HashMap<String, Object> map, ltl.InterfaceC18463b interfaceC18463b) {
        m156182o(context, map, facertificationSDKType, interfaceC18463b);
    }

    @Override // p153l.ltl
    /* JADX INFO: renamed from: c */
    public void mo155800c(FacertificationSDKType facertificationSDKType, String str) {
        int i = C18483b.f133928a[facertificationSDKType.ordinal()];
        if (i == 1 || i == 2) {
            this.f133924b = str;
        }
    }

    /* JADX INFO: renamed from: d */
    public final Bundle m156171d(HashMap<String, Object> map) {
        Bundle bundle = new Bundle();
        if (map != null && map.size() > 0) {
            String strM142516d = ixf.m142516d(map, "option-key-appid");
            String strM142516d2 = ixf.m142516d(map, "option-key-faceid");
            String strM142516d3 = ixf.m142516d(map, "option-key-agreementno");
            String strM142516d4 = ixf.m142516d(map, "option-key-appversion");
            String strM142516d5 = ixf.m142516d(map, "option-key-userid");
            String strM142516d6 = ixf.m142516d(map, "option-key-sign");
            String strM142516d7 = ixf.m142516d(map, "option-key-licence");
            String strM142516d8 = ixf.m142516d(map, "option-key-nonce");
            String strM142517e = ixf.m142517e(ixf.m142516d(map, "option-key-language"));
            WbCloudFaceVerifySdk.InputData inputData = new WbCloudFaceVerifySdk.InputData(strM142516d2, strM142516d3, strM142516d, strM142516d4, strM142516d8, strM142516d5, strM142516d6, FaceVerifyStatus.Mode.GRADE, strM142516d7);
            String strM142516d9 = ixf.m142516d(map, "colorMode");
            String strM142516d10 = ixf.m142516d(map, "customerTipsInLive");
            if (TextUtils.isEmpty(strM142516d10) && !TextUtils.isEmpty(this.f133924b)) {
                strM142516d10 = this.f133924b;
            }
            String strM142516d11 = ixf.m142516d(map, "customerTipsInUpload");
            int iIntValue = ixf.m142514b(map, "uiType").intValue();
            String strM142516d12 = ixf.m142516d(map, "compareType");
            boolean zBooleanValue = ixf.m142513a(map, "videoUpload").booleanValue();
            boolean zBooleanValue2 = ixf.m142513a(map, "videoCheck").booleanValue();
            boolean zBooleanValue3 = ixf.m142513a(map, "playVoice").booleanValue();
            bundle.putSerializable("inputData", inputData);
            bundle.putString("colorMode", strM142516d9);
            bundle.putString("customerTipsInLive", strM142516d10);
            bundle.putString("customerTipsInUpload", strM142516d11);
            bundle.putInt("uiType", iIntValue);
            bundle.putString("compareType", strM142516d12);
            bundle.putBoolean("videoUpload", zBooleanValue);
            bundle.putBoolean("videoCheck", zBooleanValue2);
            bundle.putBoolean("playVoice", zBooleanValue3);
            bundle.putString("WBFaceVerifyLanguage", strM142517e);
        }
        return bundle;
    }

    /* JADX INFO: renamed from: e */
    public final HashMap<String, String> m156172e(HashMap<String, Object> map) {
        HashMap<String, String> map2 = new HashMap<>();
        String strM142516d = ixf.m142516d(map, "ext_params_key_screen_orientation");
        String strM142516d2 = ixf.m142516d(map, "ext_params_key_use_video");
        String strM142516d3 = ixf.m142516d(map, "ext_params_key_ocr_bottom_button_color");
        String strM142516d4 = ixf.m142516d(map, "ext_params_key_face_progress_color");
        if (!TextUtils.isEmpty(strM142516d)) {
            map2.put("ext_params_key_screen_orientation", strM142516d);
        }
        if (!TextUtils.isEmpty(strM142516d2)) {
            map2.put("ext_params_key_use_video", strM142516d2);
        }
        if (!TextUtils.isEmpty(strM142516d3)) {
            map2.put("ext_params_key_ocr_bottom_button_color", strM142516d3);
        }
        if (!TextUtils.isEmpty(strM142516d4)) {
            map2.put("ext_params_key_face_progress_color", strM142516d4);
        }
        return map2;
    }

    /* JADX INFO: renamed from: f */
    public final void m156173f(Context context, HashMap<String, Object> map, FacertificationSDKType facertificationSDKType, ltl.InterfaceC18462a interfaceC18462a) {
        switch (C18483b.f133928a[facertificationSDKType.ordinal()]) {
            case 1:
                m156178k(context, map, interfaceC18462a);
                break;
            case 2:
                m156177j(context, map, interfaceC18462a);
                break;
            case 3:
                m156174g(context, map, interfaceC18462a);
                break;
            case 5:
                m156179l(context, map, interfaceC18462a);
                break;
            case 6:
                m156180m(context, map, interfaceC18462a);
                break;
            case 7:
                m156175h(context, map, interfaceC18462a);
                break;
            case 8:
                m156176i(context, map, interfaceC18462a);
                break;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m156174g(Context context, HashMap<String, Object> map, ltl.InterfaceC18462a interfaceC18462a) {
        jxf jxfVar = new jxf();
        if (interfaceC18462a != null) {
            try {
                interfaceC18462a.mo61368b();
            } catch (Exception e) {
                if (interfaceC18462a != null) {
                    jxfVar.f123023a = false;
                    jxfVar.f123030h = e;
                    interfaceC18462a.mo61369c(jxfVar);
                    return;
                }
                return;
            }
        }
        ZIMFacade.install(context);
        jxfVar.f123023a = true;
        if (interfaceC18462a != null) {
            interfaceC18462a.mo61367a(jxfVar);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m156175h(Context context, HashMap<String, Object> map, ltl.InterfaceC18462a interfaceC18462a) {
        jxf jxfVar = new jxf();
        try {
            m156181n("identityutils");
            m156181n("AliyunMNN");
            if (interfaceC18462a != null) {
                interfaceC18462a.mo61368b();
            }
            IdentityPlatform.getInstance().install(context);
            jxfVar.f123023a = true;
            if (interfaceC18462a != null) {
                interfaceC18462a.mo61367a(jxfVar);
            }
        } catch (Exception e) {
            if (interfaceC18462a != null) {
                jxfVar.f123023a = false;
                jxfVar.f123030h = e;
                interfaceC18462a.mo61369c(jxfVar);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m156176i(Context context, HashMap<String, Object> map, ltl.InterfaceC18462a interfaceC18462a) {
        jxf jxfVar = new jxf();
        String strM142516d = ixf.m142516d(map, "option-key-sts-token");
        String strM142516d2 = ixf.m142516d(map, "option-key-access_id");
        String strM142516d3 = ixf.m142516d(map, "option-key-secret_key");
        if (interfaceC18462a != null) {
            try {
                interfaceC18462a.mo61368b();
            } catch (Exception e) {
                if (interfaceC18462a != null) {
                    jxfVar.f123023a = false;
                    jxfVar.f123030h = e;
                    interfaceC18462a.mo61369c(jxfVar);
                    return;
                }
                return;
            }
        }
        BytedFaceLiveManager.getInstance().setSignAccessKeySecretAccessKey(context, strM142516d, strM142516d2, strM142516d3, new C18485d(jxfVar, interfaceC18462a));
    }

    /* JADX INFO: renamed from: j */
    public final void m156177j(Context context, HashMap<String, Object> map, ltl.InterfaceC18462a interfaceC18462a) {
        if (map == null || map.size() <= 0) {
            return;
        }
        String strM142516d = ixf.m142516d(map, "option-key-appid");
        if (interfaceC18462a != null) {
            interfaceC18462a.mo61368b();
        }
        jxf jxfVar = new jxf();
        try {
            MNFCService.getInstance().init(context, strM142516d);
            MNFCService.getInstance().preloadResource(new C18487f(jxfVar, interfaceC18462a));
        } catch (Exception e) {
            jxfVar.f123023a = false;
            jxfVar.f123030h = e;
            if (interfaceC18462a != null) {
                interfaceC18462a.mo61369c(jxfVar);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m156178k(Context context, HashMap<String, Object> map, ltl.InterfaceC18462a interfaceC18462a) {
        Bundle bundleM156171d = m156171d(map);
        if (interfaceC18462a != null) {
            interfaceC18462a.mo61368b();
        }
        WbCloudFaceVerifySdk.getInstance().initSdk(context, bundleM156171d, new C18484c(interfaceC18462a));
    }

    /* JADX INFO: renamed from: l */
    public final void m156179l(Context context, HashMap<String, Object> map, ltl.InterfaceC18462a interfaceC18462a) {
        if (map == null || map.size() <= 0) {
            return;
        }
        m156181n("YTCommonLiveness");
        m156181n("YTLiveness");
        HuiYanOsApi.init(context.getApplicationContext());
        String strM142516d = ixf.m142516d(map, "option-key-licence");
        boolean zBooleanValue = ixf.m142513a(map, "option-key-save-cache").booleanValue();
        String strM142516d2 = ixf.m142516d(map, "colorMode");
        boolean zBooleanValue2 = ixf.m142513a(map, "option_key_show_guide_page").booleanValue();
        HuiYanOsConfig huiYanOsConfig = new HuiYanOsConfig();
        huiYanOsConfig.isDeleteVideoCache = !zBooleanValue;
        huiYanOsConfig.authLicense = strM142516d;
        huiYanOsConfig.isShowGuidePage = zBooleanValue2;
        if ("black".equals(strM142516d2)) {
            huiYanOsConfig.pageColorStyle = PageColorStyle.Dark;
        } else {
            huiYanOsConfig.pageColorStyle = PageColorStyle.Light;
        }
        if (interfaceC18462a != null) {
            interfaceC18462a.mo61368b();
        }
        HuiYanOsApi.startGetAuthConfigData(huiYanOsConfig, new C18486e(new jxf(), interfaceC18462a));
    }

    /* JADX INFO: renamed from: m */
    public final void m156180m(Context context, HashMap<String, Object> map, ltl.InterfaceC18462a interfaceC18462a) {
        if (map == null || map.size() <= 0) {
            return;
        }
        m156181n("YTCommonLiveness");
        m156181n("YTLiveness");
        HuiYanOsApi.init(context.getApplicationContext());
        String strM142516d = ixf.m142516d(map, "option-key-licence");
        boolean zBooleanValue = ixf.m142513a(map, "option-key-save-cache").booleanValue();
        String strM142516d2 = ixf.m142516d(map, "colorMode");
        boolean zBooleanValue2 = ixf.m142513a(map, "option_key_show_guide_page").booleanValue();
        HuiYanOsConfig huiYanOsConfig = new HuiYanOsConfig();
        this.f133925c = huiYanOsConfig;
        huiYanOsConfig.setDeleteVideoCache(!zBooleanValue);
        this.f133925c.setAuthLicense(strM142516d);
        this.f133925c.setShowGuidePage(zBooleanValue2);
        boolean zEquals = "black".equals(strM142516d2);
        HuiYanOsConfig huiYanOsConfig2 = this.f133925c;
        if (zEquals) {
            huiYanOsConfig2.setPageColorStyle(PageColorStyle.Dark);
        } else {
            huiYanOsConfig2.setPageColorStyle(PageColorStyle.Light);
        }
        if (interfaceC18462a != null) {
            interfaceC18462a.mo61368b();
        }
        jxf jxfVar = new jxf();
        jxfVar.f123023a = true;
        if (interfaceC18462a != null) {
            interfaceC18462a.mo61367a(jxfVar);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m156181n(String str) {
        try {
            System.loadLibrary(str);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m156182o(Context context, HashMap<String, Object> map, FacertificationSDKType facertificationSDKType, ltl.InterfaceC18463b interfaceC18463b) {
        switch (C18483b.f133928a[facertificationSDKType.ordinal()]) {
            case 1:
                m156189v(context, map, interfaceC18463b);
                break;
            case 2:
                m156186s(context, map, interfaceC18463b);
                break;
            case 3:
                m156183p(context, map, interfaceC18463b);
                break;
            case 5:
                m156187t(context, map, interfaceC18463b);
                break;
            case 6:
                m156188u(context, map, interfaceC18463b);
                break;
            case 7:
                m156184q(context, map, interfaceC18463b);
                break;
            case 8:
                m156185r(context, map, interfaceC18463b);
                break;
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m156183p(Context context, HashMap<String, Object> map, ltl.InterfaceC18463b interfaceC18463b) {
        if (map == null || map.size() <= 0) {
            return;
        }
        ZIMFacadeBuilder.create(context).verify(ixf.m142516d(map, "option-key-token"), ixf.m142513a(map, "option-key-usemsgbox").booleanValue(), m156172e(map), new C18491j(interfaceC18463b));
    }

    /* JADX INFO: renamed from: q */
    public final void m156184q(Context context, HashMap<String, Object> map, ltl.InterfaceC18463b interfaceC18463b) {
        if (map == null || map.size() <= 0) {
            return;
        }
        IdentityPlatform.getInstance().verify(ixf.m142516d(map, "option-key-token"), null, new C18492k(interfaceC18463b));
    }

    /* JADX INFO: renamed from: r */
    public final void m156185r(Context context, HashMap<String, Object> map, ltl.InterfaceC18463b interfaceC18463b) {
        if (map == null || map.size() <= 0) {
            return;
        }
        String strM142516d = ixf.m142516d(map, "option-key-verity-type");
        String strM142516d2 = ixf.m142516d(map, "option-key-bytedance_token");
        String strM142516d3 = ixf.m142516d(map, "option-key-client_config");
        BytedFaceLiveManager.getInstance().startFaceCert(context, new CertConfig(true, TextUtils.equals(strM142516d, "identity"), false), strM142516d2, strM142516d3, new C18482a(interfaceC18463b));
    }

    /* JADX INFO: renamed from: s */
    public final void m156186s(Context context, HashMap<String, Object> map, ltl.InterfaceC18463b interfaceC18463b) {
        if (map == null || map.size() <= 0 || !(context instanceof Activity)) {
            if (interfaceC18463b != null) {
                kxf kxfVar = new kxf();
                kxfVar.f129195h = false;
                kxfVar.f129191d = "Params is null";
                interfaceC18463b.mo122142a(kxfVar);
                return;
            }
            return;
        }
        String strM142516d = ixf.m142516d(map, "option-key-mode");
        int iIntValue = ixf.m142514b(map, "option-key-action-count").intValue();
        ((Activity) context).getApplication().registerActivityLifecycleCallbacks(new C18493l(interfaceC18463b));
        Intent intent = new Intent(context, (Class<?>) DummyActivity.class);
        intent.putExtra("option-key-mode", strM142516d);
        intent.putExtra("option-key-action-count", iIntValue);
        intent.putExtra("option-key-page-title", this.f133924b);
        context.startActivity(intent);
    }

    /* JADX INFO: renamed from: t */
    public final void m156187t(Context context, HashMap<String, Object> map, ltl.InterfaceC18463b interfaceC18463b) {
        if (map == null || map.size() <= 0) {
            return;
        }
        HuiYanOsApi.startAuthByLightData(ixf.m142516d(map, "option-key-token"), new C18489h(new kxf(), interfaceC18463b));
    }

    /* JADX INFO: renamed from: u */
    public final void m156188u(Context context, HashMap<String, Object> map, ltl.InterfaceC18463b interfaceC18463b) {
        if (map == null || map.size() <= 0) {
            return;
        }
        HuiYanOsApi.startHuiYanAuth(ixf.m142516d(map, "option-key-token"), this.f133925c, new C18490i(new kxf(), interfaceC18463b));
    }

    /* JADX INFO: renamed from: v */
    public final void m156189v(Context context, HashMap<String, Object> map, ltl.InterfaceC18463b interfaceC18463b) {
        WbCloudFaceVerifySdk.getInstance().startWbFaceVerifySdk(context, new C18488g(interfaceC18463b));
    }

    /* JADX INFO: renamed from: l.lxf$l */
    public static class C18493l implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: a */
        public ltl.InterfaceC18463b f133952a;

        public C18493l(ltl.InterfaceC18463b interfaceC18463b) {
            this.f133952a = interfaceC18463b;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof DummyActivity) {
                ((DummyActivity) activity).m82572a(this.f133952a);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (activity instanceof DummyActivity) {
                ((DummyActivity) activity).m82572a(null);
            }
            activity.getApplication().unregisterActivityLifecycleCallbacks(this);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}
