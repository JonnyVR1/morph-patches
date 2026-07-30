package p149l;

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

/* JADX INFO: loaded from: classes13.dex */
public class xvf implements yql {

    /* JADX INFO: renamed from: a */
    public HashMap<FacertificationSDKType, Boolean> f194602a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    public String f194603b;

    /* JADX INFO: renamed from: c */
    public HuiYanOsConfig f194604c;

    /* JADX INFO: renamed from: l.xvf$a */
    public class C21230a implements SDKCallBack.ResultCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ yql.InterfaceC21481b f194605a;

        public C21230a(yql.InterfaceC21481b interfaceC21481b) {
            this.f194605a = interfaceC21481b;
        }
    }

    /* JADX INFO: renamed from: l.xvf$b */
    public static /* synthetic */ class C21231b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f194607a;

        static {
            int[] iArr = new int[FacertificationSDKType.values().length];
            f194607a = iArr;
            try {
                iArr[FacertificationSDKType.FACERTIFICATION_SDK_TYPE_TX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f194607a[FacertificationSDKType.FACERTIFICATION_SDK_TYPE_MOMO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f194607a[FacertificationSDKType.FACERTIFICATION_SDK_TYPE_ALI.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f194607a[FacertificationSDKType.FACERTIFICATION_SDK_TYPE_EXT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f194607a[FacertificationSDKType.FACERTIFICATION_SDK_TYPE_TX_INTL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f194607a[FacertificationSDKType.FACERTIFICATION_SDK_TYPE_TX_INTL_V2.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f194607a[FacertificationSDKType.FACERTIFICATION_SDK_TYPE_ALI_INTL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f194607a[FacertificationSDKType.FACERTIFICATION_SDK_TYPE_BYTE_VOLC.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: renamed from: l.xvf$c */
    public class C21232c implements WbCloudFaceVerifyLoginListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ yql.InterfaceC21480a f194608a;

        public C21232c(yql.InterfaceC21480a interfaceC21480a) {
            this.f194608a = interfaceC21480a;
        }
    }

    /* JADX INFO: renamed from: l.xvf$d */
    public class C21233d implements SDKCallBack.StringResultCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ vvf f194610a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ yql.InterfaceC21480a f194611b;

        public C21233d(vvf vvfVar, yql.InterfaceC21480a interfaceC21480a) {
            this.f194610a = vvfVar;
            this.f194611b = interfaceC21480a;
        }
    }

    /* JADX INFO: renamed from: l.xvf$e */
    public class C21234e implements HuiYanConfigCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ vvf f194613a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ yql.InterfaceC21480a f194614b;

        public C21234e(vvf vvfVar, yql.InterfaceC21480a interfaceC21480a) {
            this.f194613a = vvfVar;
            this.f194614b = interfaceC21480a;
        }

        @Override // com.tencent.could.huiyansdk.overseas.HuiYanConfigCallback
        public void onFail(int i, String str) {
            vvf vvfVar = this.f194613a;
            vvfVar.f183219a = false;
            vvfVar.f183221c = String.valueOf(i);
            vvf vvfVar2 = this.f194613a;
            vvfVar2.f183224f = str;
            yql.InterfaceC21480a interfaceC21480a = this.f194614b;
            if (interfaceC21480a != null) {
                interfaceC21480a.mo60185c(vvfVar2);
            }
        }

        @Override // com.tencent.could.huiyansdk.overseas.HuiYanConfigCallback
        public void onSuccess(String str) {
            vvf vvfVar = this.f194613a;
            vvfVar.f183219a = true;
            vvfVar.f183220b = str;
            yql.InterfaceC21480a interfaceC21480a = this.f194614b;
            if (interfaceC21480a != null) {
                interfaceC21480a.mo60183a(vvfVar);
            }
        }
    }

    /* JADX INFO: renamed from: l.xvf$f */
    public class C21235f implements DetectorListener$OnDetectorPreparedListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ vvf f194616a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ yql.InterfaceC21480a f194617b;

        public C21235f(vvf vvfVar, yql.InterfaceC21480a interfaceC21480a) {
            this.f194616a = vvfVar;
            this.f194617b = interfaceC21480a;
        }

        @Override // com.immomo.cvcenter.interfaces.DetectorListener$OnDetectorPreparedListener
        /* JADX INFO: renamed from: a */
        public void mo18293a(Map<Integer, Boolean> map) {
            if (map == null || map.size() == 0) {
                vvf vvfVar = this.f194616a;
                vvfVar.f183219a = false;
                vvfVar.f183224f = "preload resource failed";
                yql.InterfaceC21480a interfaceC21480a = this.f194617b;
                if (interfaceC21480a != null) {
                    interfaceC21480a.mo60185c(vvfVar);
                    return;
                }
                return;
            }
            Iterator<Map.Entry<Integer, Boolean>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Boolean value = it.next().getValue();
                if (value == null || !value.booleanValue()) {
                    vvf vvfVar2 = this.f194616a;
                    vvfVar2.f183219a = false;
                    vvfVar2.f183224f = "preload resource failed";
                    yql.InterfaceC21480a interfaceC21480a2 = this.f194617b;
                    if (interfaceC21480a2 != null) {
                        interfaceC21480a2.mo60185c(vvfVar2);
                        return;
                    }
                    return;
                }
            }
            vvf vvfVar3 = this.f194616a;
            vvfVar3.f183219a = true;
            yql.InterfaceC21480a interfaceC21480a3 = this.f194617b;
            if (interfaceC21480a3 != null) {
                interfaceC21480a3.mo60183a(vvfVar3);
            }
        }
    }

    /* JADX INFO: renamed from: l.xvf$g */
    public class C21236g implements WbCloudFaceVerifyResultListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ yql.InterfaceC21481b f194619a;

        public C21236g(yql.InterfaceC21481b interfaceC21481b) {
            this.f194619a = interfaceC21481b;
        }
    }

    /* JADX INFO: renamed from: l.xvf$h */
    public class C21237h implements HuiYanResultCallBack {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ wvf f194621a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ yql.InterfaceC21481b f194622b;

        public C21237h(wvf wvfVar, yql.InterfaceC21481b interfaceC21481b) {
            this.f194621a = wvfVar;
            this.f194622b = interfaceC21481b;
        }

        @Override // com.tencent.could.huiyansdk.overseas.HuiYanResultCallBack
        public void onFail(int i, String str) {
            wvf wvfVar = this.f194621a;
            wvfVar.f188243h = false;
            wvfVar.f188237b = String.valueOf(i);
            wvf wvfVar2 = this.f194621a;
            wvfVar2.f188239d = str;
            yql.InterfaceC21481b interfaceC21481b = this.f194622b;
            if (interfaceC21481b != null) {
                interfaceC21481b.mo102166a(wvfVar2);
            }
        }

        @Override // com.tencent.could.huiyansdk.overseas.HuiYanResultCallBack
        public void onSuccess(byte[] bArr, String str) {
            wvf wvfVar = this.f194621a;
            wvfVar.f188243h = true;
            wvfVar.f188240e = str;
            wvfVar.f188249n = bArr;
            yql.InterfaceC21481b interfaceC21481b = this.f194622b;
            if (interfaceC21481b != null) {
                interfaceC21481b.mo102166a(wvfVar);
            }
        }
    }

    /* JADX INFO: renamed from: l.xvf$i */
    public class C21238i implements HuiYanOsAuthCallBack {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ wvf f194624a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ yql.InterfaceC21481b f194625b;

        public C21238i(wvf wvfVar, yql.InterfaceC21481b interfaceC21481b) {
            this.f194624a = wvfVar;
            this.f194625b = interfaceC21481b;
        }

        @Override // com.tencent.could.huiyansdk.overseas.HuiYanOsAuthCallBack
        public void onFail(int i, String str, String str2) {
            this.f194624a.f188243h = String.valueOf(i).length() != 3;
            this.f194624a.f188237b = String.valueOf(i);
            wvf wvfVar = this.f194624a;
            wvfVar.f188239d = str;
            yql.InterfaceC21481b interfaceC21481b = this.f194625b;
            if (interfaceC21481b != null) {
                interfaceC21481b.mo102166a(wvfVar);
            }
        }

        @Override // com.tencent.could.huiyansdk.overseas.HuiYanOsAuthCallBack
        public void onSuccess(HuiYanOsAuthResult huiYanOsAuthResult) {
            wvf wvfVar = this.f194624a;
            wvfVar.f188243h = true;
            yql.InterfaceC21481b interfaceC21481b = this.f194625b;
            if (interfaceC21481b != null) {
                interfaceC21481b.mo102166a(wvfVar);
            }
        }
    }

    /* JADX INFO: renamed from: l.xvf$j */
    public class C21239j implements ZIMCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ yql.InterfaceC21481b f194627a;

        public C21239j(yql.InterfaceC21481b interfaceC21481b) {
            this.f194627a = interfaceC21481b;
        }
    }

    /* JADX INFO: renamed from: l.xvf$k */
    public class C21240k implements IdentityCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ yql.InterfaceC21481b f194629a;

        public C21240k(yql.InterfaceC21481b interfaceC21481b) {
            this.f194629a = interfaceC21481b;
        }

        @Override // com.idv.identity.platform.api.IdentityCallback
        public boolean response(IdentityResponse identityResponse) {
            wvf wvfVar = new wvf();
            if (identityResponse != null) {
                wvfVar.f188243h = !Arrays.asList(1002, 1003, 1004, 1006, 1009, 1011, 1012, 1013, 1014).contains(Integer.valueOf(identityResponse.code));
                wvfVar.f188237b = String.valueOf(identityResponse.code);
                wvfVar.f188239d = identityResponse.message;
            } else {
                wvfVar.f188243h = false;
                wvfVar.f188242g = "IdentityResponse is null";
            }
            yql.InterfaceC21481b interfaceC21481b = this.f194629a;
            if (interfaceC21481b != null) {
                interfaceC21481b.mo102166a(wvfVar);
            }
            return true;
        }
    }

    @Override // p149l.yql
    /* JADX INFO: renamed from: a */
    public void mo211257a(Context context, HashMap<String, Object> map, FacertificationSDKType facertificationSDKType, yql.InterfaceC21480a interfaceC21480a) {
        m211262f(context, map, facertificationSDKType, interfaceC21480a);
    }

    @Override // p149l.yql
    /* JADX INFO: renamed from: b */
    public void mo211258b(Context context, FacertificationSDKType facertificationSDKType, HashMap<String, Object> map, yql.InterfaceC21481b interfaceC21481b) {
        m211271o(context, map, facertificationSDKType, interfaceC21481b);
    }

    @Override // p149l.yql
    /* JADX INFO: renamed from: c */
    public void mo211259c(FacertificationSDKType facertificationSDKType, String str) {
        int i = C21231b.f194607a[facertificationSDKType.ordinal()];
        if (i == 1 || i == 2) {
            this.f194603b = str;
        }
    }

    /* JADX INFO: renamed from: d */
    public final Bundle m211260d(HashMap<String, Object> map) {
        Bundle bundle = new Bundle();
        if (map != null && map.size() > 0) {
            String strM196076d = uvf.m196076d(map, "option-key-appid");
            String strM196076d2 = uvf.m196076d(map, "option-key-faceid");
            String strM196076d3 = uvf.m196076d(map, "option-key-agreementno");
            String strM196076d4 = uvf.m196076d(map, "option-key-appversion");
            String strM196076d5 = uvf.m196076d(map, "option-key-userid");
            String strM196076d6 = uvf.m196076d(map, "option-key-sign");
            String strM196076d7 = uvf.m196076d(map, "option-key-licence");
            String strM196076d8 = uvf.m196076d(map, "option-key-nonce");
            String strM196077e = uvf.m196077e(uvf.m196076d(map, "option-key-language"));
            WbCloudFaceVerifySdk.InputData inputData = new WbCloudFaceVerifySdk.InputData(strM196076d2, strM196076d3, strM196076d, strM196076d4, strM196076d8, strM196076d5, strM196076d6, FaceVerifyStatus.Mode.GRADE, strM196076d7);
            String strM196076d9 = uvf.m196076d(map, "colorMode");
            String strM196076d10 = uvf.m196076d(map, "customerTipsInLive");
            if (TextUtils.isEmpty(strM196076d10) && !TextUtils.isEmpty(this.f194603b)) {
                strM196076d10 = this.f194603b;
            }
            String strM196076d11 = uvf.m196076d(map, "customerTipsInUpload");
            int iIntValue = uvf.m196074b(map, "uiType").intValue();
            String strM196076d12 = uvf.m196076d(map, "compareType");
            boolean zBooleanValue = uvf.m196073a(map, "videoUpload").booleanValue();
            boolean zBooleanValue2 = uvf.m196073a(map, "videoCheck").booleanValue();
            boolean zBooleanValue3 = uvf.m196073a(map, "playVoice").booleanValue();
            bundle.putSerializable("inputData", inputData);
            bundle.putString("colorMode", strM196076d9);
            bundle.putString("customerTipsInLive", strM196076d10);
            bundle.putString("customerTipsInUpload", strM196076d11);
            bundle.putInt("uiType", iIntValue);
            bundle.putString("compareType", strM196076d12);
            bundle.putBoolean("videoUpload", zBooleanValue);
            bundle.putBoolean("videoCheck", zBooleanValue2);
            bundle.putBoolean("playVoice", zBooleanValue3);
            bundle.putString("WBFaceVerifyLanguage", strM196077e);
        }
        return bundle;
    }

    /* JADX INFO: renamed from: e */
    public final HashMap<String, String> m211261e(HashMap<String, Object> map) {
        HashMap<String, String> map2 = new HashMap<>();
        String strM196076d = uvf.m196076d(map, "ext_params_key_screen_orientation");
        String strM196076d2 = uvf.m196076d(map, "ext_params_key_use_video");
        String strM196076d3 = uvf.m196076d(map, "ext_params_key_ocr_bottom_button_color");
        String strM196076d4 = uvf.m196076d(map, "ext_params_key_face_progress_color");
        if (!TextUtils.isEmpty(strM196076d)) {
            map2.put("ext_params_key_screen_orientation", strM196076d);
        }
        if (!TextUtils.isEmpty(strM196076d2)) {
            map2.put("ext_params_key_use_video", strM196076d2);
        }
        if (!TextUtils.isEmpty(strM196076d3)) {
            map2.put("ext_params_key_ocr_bottom_button_color", strM196076d3);
        }
        if (!TextUtils.isEmpty(strM196076d4)) {
            map2.put("ext_params_key_face_progress_color", strM196076d4);
        }
        return map2;
    }

    /* JADX INFO: renamed from: f */
    public final void m211262f(Context context, HashMap<String, Object> map, FacertificationSDKType facertificationSDKType, yql.InterfaceC21480a interfaceC21480a) {
        switch (C21231b.f194607a[facertificationSDKType.ordinal()]) {
            case 1:
                m211267k(context, map, interfaceC21480a);
                break;
            case 2:
                m211266j(context, map, interfaceC21480a);
                break;
            case 3:
                m211263g(context, map, interfaceC21480a);
                break;
            case 5:
                m211268l(context, map, interfaceC21480a);
                break;
            case 6:
                m211269m(context, map, interfaceC21480a);
                break;
            case 7:
                m211264h(context, map, interfaceC21480a);
                break;
            case 8:
                m211265i(context, map, interfaceC21480a);
                break;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m211263g(Context context, HashMap<String, Object> map, yql.InterfaceC21480a interfaceC21480a) {
        vvf vvfVar = new vvf();
        if (interfaceC21480a != null) {
            try {
                interfaceC21480a.mo60184b();
            } catch (Exception e) {
                if (interfaceC21480a != null) {
                    vvfVar.f183219a = false;
                    vvfVar.f183226h = e;
                    interfaceC21480a.mo60185c(vvfVar);
                    return;
                }
                return;
            }
        }
        ZIMFacade.install(context);
        vvfVar.f183219a = true;
        if (interfaceC21480a != null) {
            interfaceC21480a.mo60183a(vvfVar);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m211264h(Context context, HashMap<String, Object> map, yql.InterfaceC21480a interfaceC21480a) {
        vvf vvfVar = new vvf();
        try {
            m211270n("identityutils");
            m211270n("AliyunMNN");
            if (interfaceC21480a != null) {
                interfaceC21480a.mo60184b();
            }
            IdentityPlatform.getInstance().install(context);
            vvfVar.f183219a = true;
            if (interfaceC21480a != null) {
                interfaceC21480a.mo60183a(vvfVar);
            }
        } catch (Exception e) {
            if (interfaceC21480a != null) {
                vvfVar.f183219a = false;
                vvfVar.f183226h = e;
                interfaceC21480a.mo60185c(vvfVar);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m211265i(Context context, HashMap<String, Object> map, yql.InterfaceC21480a interfaceC21480a) {
        vvf vvfVar = new vvf();
        String strM196076d = uvf.m196076d(map, "option-key-sts-token");
        String strM196076d2 = uvf.m196076d(map, "option-key-access_id");
        String strM196076d3 = uvf.m196076d(map, "option-key-secret_key");
        if (interfaceC21480a != null) {
            try {
                interfaceC21480a.mo60184b();
            } catch (Exception e) {
                if (interfaceC21480a != null) {
                    vvfVar.f183219a = false;
                    vvfVar.f183226h = e;
                    interfaceC21480a.mo60185c(vvfVar);
                    return;
                }
                return;
            }
        }
        BytedFaceLiveManager.getInstance().setSignAccessKeySecretAccessKey(context, strM196076d, strM196076d2, strM196076d3, new C21233d(vvfVar, interfaceC21480a));
    }

    /* JADX INFO: renamed from: j */
    public final void m211266j(Context context, HashMap<String, Object> map, yql.InterfaceC21480a interfaceC21480a) {
        if (map == null || map.size() <= 0) {
            return;
        }
        String strM196076d = uvf.m196076d(map, "option-key-appid");
        if (interfaceC21480a != null) {
            interfaceC21480a.mo60184b();
        }
        vvf vvfVar = new vvf();
        try {
            MNFCService.getInstance().init(context, strM196076d);
            MNFCService.getInstance().preloadResource(new C21235f(vvfVar, interfaceC21480a));
        } catch (Exception e) {
            vvfVar.f183219a = false;
            vvfVar.f183226h = e;
            if (interfaceC21480a != null) {
                interfaceC21480a.mo60185c(vvfVar);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m211267k(Context context, HashMap<String, Object> map, yql.InterfaceC21480a interfaceC21480a) {
        Bundle bundleM211260d = m211260d(map);
        if (interfaceC21480a != null) {
            interfaceC21480a.mo60184b();
        }
        WbCloudFaceVerifySdk.getInstance().initSdk(context, bundleM211260d, new C21232c(interfaceC21480a));
    }

    /* JADX INFO: renamed from: l */
    public final void m211268l(Context context, HashMap<String, Object> map, yql.InterfaceC21480a interfaceC21480a) {
        if (map == null || map.size() <= 0) {
            return;
        }
        m211270n("YTCommonLiveness");
        m211270n("YTLiveness");
        HuiYanOsApi.init(context.getApplicationContext());
        String strM196076d = uvf.m196076d(map, "option-key-licence");
        boolean zBooleanValue = uvf.m196073a(map, "option-key-save-cache").booleanValue();
        String strM196076d2 = uvf.m196076d(map, "colorMode");
        boolean zBooleanValue2 = uvf.m196073a(map, "option_key_show_guide_page").booleanValue();
        HuiYanOsConfig huiYanOsConfig = new HuiYanOsConfig();
        huiYanOsConfig.isDeleteVideoCache = !zBooleanValue;
        huiYanOsConfig.authLicense = strM196076d;
        huiYanOsConfig.isShowGuidePage = zBooleanValue2;
        if ("black".equals(strM196076d2)) {
            huiYanOsConfig.pageColorStyle = PageColorStyle.Dark;
        } else {
            huiYanOsConfig.pageColorStyle = PageColorStyle.Light;
        }
        if (interfaceC21480a != null) {
            interfaceC21480a.mo60184b();
        }
        HuiYanOsApi.startGetAuthConfigData(huiYanOsConfig, new C21234e(new vvf(), interfaceC21480a));
    }

    /* JADX INFO: renamed from: m */
    public final void m211269m(Context context, HashMap<String, Object> map, yql.InterfaceC21480a interfaceC21480a) {
        if (map == null || map.size() <= 0) {
            return;
        }
        m211270n("YTCommonLiveness");
        m211270n("YTLiveness");
        HuiYanOsApi.init(context.getApplicationContext());
        String strM196076d = uvf.m196076d(map, "option-key-licence");
        boolean zBooleanValue = uvf.m196073a(map, "option-key-save-cache").booleanValue();
        String strM196076d2 = uvf.m196076d(map, "colorMode");
        boolean zBooleanValue2 = uvf.m196073a(map, "option_key_show_guide_page").booleanValue();
        HuiYanOsConfig huiYanOsConfig = new HuiYanOsConfig();
        this.f194604c = huiYanOsConfig;
        huiYanOsConfig.setDeleteVideoCache(!zBooleanValue);
        this.f194604c.setAuthLicense(strM196076d);
        this.f194604c.setShowGuidePage(zBooleanValue2);
        boolean zEquals = "black".equals(strM196076d2);
        HuiYanOsConfig huiYanOsConfig2 = this.f194604c;
        if (zEquals) {
            huiYanOsConfig2.setPageColorStyle(PageColorStyle.Dark);
        } else {
            huiYanOsConfig2.setPageColorStyle(PageColorStyle.Light);
        }
        if (interfaceC21480a != null) {
            interfaceC21480a.mo60184b();
        }
        vvf vvfVar = new vvf();
        vvfVar.f183219a = true;
        if (interfaceC21480a != null) {
            interfaceC21480a.mo60183a(vvfVar);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m211270n(String str) {
        try {
            System.loadLibrary(str);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m211271o(Context context, HashMap<String, Object> map, FacertificationSDKType facertificationSDKType, yql.InterfaceC21481b interfaceC21481b) {
        switch (C21231b.f194607a[facertificationSDKType.ordinal()]) {
            case 1:
                m211278v(context, map, interfaceC21481b);
                break;
            case 2:
                m211275s(context, map, interfaceC21481b);
                break;
            case 3:
                m211272p(context, map, interfaceC21481b);
                break;
            case 5:
                m211276t(context, map, interfaceC21481b);
                break;
            case 6:
                m211277u(context, map, interfaceC21481b);
                break;
            case 7:
                m211273q(context, map, interfaceC21481b);
                break;
            case 8:
                m211274r(context, map, interfaceC21481b);
                break;
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m211272p(Context context, HashMap<String, Object> map, yql.InterfaceC21481b interfaceC21481b) {
        if (map == null || map.size() <= 0) {
            return;
        }
        ZIMFacadeBuilder.create(context).verify(uvf.m196076d(map, "option-key-token"), uvf.m196073a(map, "option-key-usemsgbox").booleanValue(), m211261e(map), new C21239j(interfaceC21481b));
    }

    /* JADX INFO: renamed from: q */
    public final void m211273q(Context context, HashMap<String, Object> map, yql.InterfaceC21481b interfaceC21481b) {
        if (map == null || map.size() <= 0) {
            return;
        }
        IdentityPlatform.getInstance().verify(uvf.m196076d(map, "option-key-token"), null, new C21240k(interfaceC21481b));
    }

    /* JADX INFO: renamed from: r */
    public final void m211274r(Context context, HashMap<String, Object> map, yql.InterfaceC21481b interfaceC21481b) {
        if (map == null || map.size() <= 0) {
            return;
        }
        String strM196076d = uvf.m196076d(map, "option-key-verity-type");
        String strM196076d2 = uvf.m196076d(map, "option-key-bytedance_token");
        String strM196076d3 = uvf.m196076d(map, "option-key-client_config");
        BytedFaceLiveManager.getInstance().startFaceCert(context, new CertConfig(true, TextUtils.equals(strM196076d, "identity"), false), strM196076d2, strM196076d3, new C21230a(interfaceC21481b));
    }

    /* JADX INFO: renamed from: s */
    public final void m211275s(Context context, HashMap<String, Object> map, yql.InterfaceC21481b interfaceC21481b) {
        if (map == null || map.size() <= 0 || !(context instanceof Activity)) {
            if (interfaceC21481b != null) {
                wvf wvfVar = new wvf();
                wvfVar.f188243h = false;
                wvfVar.f188239d = "Params is null";
                interfaceC21481b.mo102166a(wvfVar);
                return;
            }
            return;
        }
        String strM196076d = uvf.m196076d(map, "option-key-mode");
        int iIntValue = uvf.m196074b(map, "option-key-action-count").intValue();
        ((Activity) context).getApplication().registerActivityLifecycleCallbacks(new C21241l(interfaceC21481b));
        Intent intent = new Intent(context, (Class<?>) DummyActivity.class);
        intent.putExtra("option-key-mode", strM196076d);
        intent.putExtra("option-key-action-count", iIntValue);
        intent.putExtra("option-key-page-title", this.f194603b);
        context.startActivity(intent);
    }

    /* JADX INFO: renamed from: t */
    public final void m211276t(Context context, HashMap<String, Object> map, yql.InterfaceC21481b interfaceC21481b) {
        if (map == null || map.size() <= 0) {
            return;
        }
        HuiYanOsApi.startAuthByLightData(uvf.m196076d(map, "option-key-token"), new C21237h(new wvf(), interfaceC21481b));
    }

    /* JADX INFO: renamed from: u */
    public final void m211277u(Context context, HashMap<String, Object> map, yql.InterfaceC21481b interfaceC21481b) {
        if (map == null || map.size() <= 0) {
            return;
        }
        HuiYanOsApi.startHuiYanAuth(uvf.m196076d(map, "option-key-token"), this.f194604c, new C21238i(new wvf(), interfaceC21481b));
    }

    /* JADX INFO: renamed from: v */
    public final void m211278v(Context context, HashMap<String, Object> map, yql.InterfaceC21481b interfaceC21481b) {
        WbCloudFaceVerifySdk.getInstance().startWbFaceVerifySdk(context, new C21236g(interfaceC21481b));
    }

    /* JADX INFO: renamed from: l.xvf$l */
    public static class C21241l implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: a */
        public yql.InterfaceC21481b f194631a;

        public C21241l(yql.InterfaceC21481b interfaceC21481b) {
            this.f194631a = interfaceC21481b;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof DummyActivity) {
                ((DummyActivity) activity).m81389a(this.f194631a);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (activity instanceof DummyActivity) {
                ((DummyActivity) activity).m81389a(null);
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
