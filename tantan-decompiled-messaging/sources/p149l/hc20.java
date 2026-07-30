package p149l;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.idv.identity.platform.api.IdentityResponseCode;
import com.idv.identity.platform.config.OSSConfig;
import com.idv.identity.platform.log.RecordLevel;
import com.idv.identity.platform.log.RecordService;
import com.idv.identity.platform.model.IdentityLogRes;
import com.idv.identity.platform.model.IdentityOcrVerifyContent;
import com.idv.identity.platform.model.OcrResultVerifyBean;
import com.idv.identity.platform.model.ZimInitContent;
import com.idv.identity.platform.model.ZimResBase;
import com.idv.identity.util.IdentityUtils;
import com.p046p1.mobile.putong.core.data.ProfileLikeModuleType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class hc20 implements npl {

    /* JADX INFO: renamed from: a */
    private static String f106991a = "InitDeviceIntl";

    /* JADX INFO: renamed from: b */
    private static String f106992b = "OcrDeviceIntl";

    /* JADX INFO: renamed from: c */
    private static String f106993c = "VerifyDeviceIntl";

    /* JADX INFO: renamed from: d */
    private static String f106994d = "UploadDeviceInfosIntl";

    /* JADX INFO: renamed from: e */
    private static String f106995e = "UpdateOcrCardInfosIntl";

    /* JADX INFO: renamed from: l.hc20$a */
    public class C17268a implements qc80 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f106996a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ fgq0 f106997b;

        public C17268a(String str, fgq0 fgq0Var) {
            this.f106996a = str;
            this.f106997b = fgq0Var;
        }

        /* JADX INFO: renamed from: a */
        private void m130380a(String str, String str2) {
            fgq0 fgq0Var = this.f106997b;
            if (fgq0Var != null) {
                fgq0Var.mo18119a(str, str2);
            } else {
                ixq0.m138886c("the zimInitCallback is null");
            }
        }

        @Override // p149l.qc80
        public void onError(int i, String str) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "initSmartDeviceHttp", NotificationCompat.CATEGORY_STATUS, "error", "code", "" + i, "errMsg", str, "url", kcm.m145452H().m145565n0(), "host", kcm.m145452H().m145562m0());
            m130380a(ncm.f138205o, str);
        }

        @Override // p149l.qc80
        public void onSuccess(int i, String str) {
            String str2;
            String strConcat;
            if (str == null || str.isEmpty()) {
                m130380a(ncm.f138190J, "resContent is null");
                ixq0.m138885b("initSmartDevice", "resContent is null");
                return;
            }
            RecordService.getInstance().recordEvent(RecordLevel.LOG_KEY_NODE, "initSmartDeviceHttp", NotificationCompat.CATEGORY_STATUS, "success", "content", str);
            ZimResBase zimResBase = (ZimResBase) d300.m109843g(str, ZimResBase.class);
            if (zimResBase == null) {
                ixq0.m138886c("zimInitGwResponse format error ,the zimInitGwResponse:".concat(str));
                str2 = "INIT_RESPONSE_FORMAT_ERROR";
                strConcat = "zimInitGwResponse format error";
            } else {
                if (1009 == zimResBase.Code) {
                    m130380a(ncm.f138186F, str);
                    ixq0.m138885b("initSmartDevice", "time invalid");
                    return;
                }
                str2 = "INIT_RESPONSE_ERROR";
                if (zimResBase.isSuccess()) {
                    String strM18164sd = IdentityUtils.m18164sd(zimResBase.ResultObject.getBytes(), this.f106996a);
                    if (strM18164sd != null) {
                        ZimInitContent zimInitContent = (ZimInitContent) d300.m109843g(strM18164sd, ZimInitContent.class);
                        if (zimInitContent == null) {
                            strConcat = "INIT_CONTENT_FORMAT_ERROR  content:".concat(strM18164sd);
                            str2 = "INIT_CONTENT_FORMAT_ERROR";
                        } else {
                            if (zimInitContent.isInitSuccess()) {
                                OSSConfig oSSConfigM130372d = hc20.m130372d(zimInitContent);
                                fgq0 fgq0Var = this.f106997b;
                                if (fgq0Var != null) {
                                    fgq0Var.mo18120b(zimInitContent.getProtocol(), oSSConfigM130372d, zimInitContent.getNowDate(), zimInitContent.getExtProtocol());
                                    return;
                                }
                                return;
                            }
                            strConcat = "bizCode:" + zimInitContent.getBizCode() + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + zimInitContent.getBizMessage();
                        }
                    } else {
                        str2 = "INIT_CONTENT_DECRYPT_ERROR";
                        strConcat = "init_content_decrypt_error";
                    }
                } else {
                    strConcat = zimResBase.Message;
                }
            }
            m130380a(str2, strConcat);
        }
    }

    /* JADX INFO: renamed from: l.hc20$b */
    public class C17269b implements qc80 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ tcm f106998a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f106999b;

        public C17269b(tcm tcmVar, String str) {
            this.f106998a = tcmVar;
            this.f106999b = str;
        }

        /* JADX INFO: renamed from: a */
        private void m130381a(String str, String str2) {
            tcm tcmVar = this.f106998a;
            if (tcmVar != null) {
                tcmVar.mo17912b(str, str2);
            } else {
                ixq0.m138886c("the identityOcrCallback is null");
            }
        }

        @Override // p149l.qc80
        public void onError(int i, String str) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "ocrSmartDeviceHttp", NotificationCompat.CATEGORY_STATUS, "error", "errMsg", str);
            tcm tcmVar = this.f106998a;
            if (tcmVar != null) {
                tcmVar.mo17911a(String.valueOf(i), str);
            }
        }

        @Override // p149l.qc80
        public void onSuccess(int i, String str) {
            String str2;
            String strValueOf = String.valueOf(1001);
            if (str == null || str.isEmpty()) {
                m130381a(String.valueOf(1001), "resContent is null");
                ixq0.m138884a("the response content is null");
                return;
            }
            if (this.f106998a == null) {
                ixq0.m138886c("onSuccesss the identityOcrCallback is null");
            }
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "ocrSmartDeviceHttp", NotificationCompat.CATEGORY_STATUS, "success", "content", str);
            ZimResBase zimResBase = (ZimResBase) d300.m109843g(str, ZimResBase.class);
            if (zimResBase == null) {
                ixq0.m138886c(" Json parse  error  :resContent +".concat(str));
                str2 = "UNKNOW_ERROR";
            } else if (1009 == zimResBase.Code) {
                m130381a(String.valueOf(1009), str);
                ixq0.m138886c("the time is invalid");
                return;
            } else if (zimResBase.isSuccess()) {
                String strM18164sd = IdentityUtils.m18164sd(zimResBase.ResultObject.getBytes(), this.f106999b);
                if (strM18164sd != null) {
                    this.f106998a.onSuccess(strM18164sd);
                    return;
                } else {
                    strValueOf = String.valueOf(2001);
                    str2 = IdentityResponseCode.IDENTITY_DECRYPTED_ERROR_MSG;
                }
            } else {
                strValueOf = String.valueOf(zimResBase.Code);
                str2 = zimResBase.Message;
            }
            m130381a(strValueOf, str2);
        }
    }

    /* JADX INFO: renamed from: l.hc20$c */
    public class C17270c implements qc80 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ vcm f107000a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f107001b;

        public C17270c(vcm vcmVar, String str) {
            this.f107000a = vcmVar;
            this.f107001b = str;
        }

        /* JADX INFO: renamed from: a */
        private void m130382a(String str, String str2) {
            vcm vcmVar = this.f107000a;
            if (vcmVar != null) {
                vcmVar.mo17693b(str, str2);
            } else {
                ixq0.m138886c("the identityOcrCallback is null");
            }
        }

        @Override // p149l.qc80
        public void onError(int i, String str) {
            ixq0.m138885b("TAG", "http response onError  code: " + i + " errMsg" + str);
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "VALIDATION_RESPONSE", NotificationCompat.CATEGORY_STATUS, "fail", "url", kcm.m145452H().m145565n0(), "host", rc80.f158747b, "errorMsg", str);
            vcm vcmVar = this.f107000a;
            if (vcmVar != null) {
                vcmVar.mo17693b(String.valueOf(i), str);
            }
        }

        @Override // p149l.qc80
        public void onSuccess(int i, String str) {
            String strValueOf;
            String strValueOf2 = String.valueOf(1005);
            String strValueOf3 = String.valueOf(1005);
            if (str == null || str.isEmpty()) {
                vcm vcmVar = this.f107000a;
                if (vcmVar != null) {
                    vcmVar.mo17693b(strValueOf2, strValueOf3);
                    return;
                }
                return;
            }
            ixq0.m138885b("TAG", "http response  onSuccess body: ".concat(str));
            RecordService recordService = RecordService.getInstance();
            RecordLevel recordLevel = RecordLevel.LOG_INFO;
            recordService.recordEvent(recordLevel, "VALIDATION_RESPONSE", NotificationCompat.CATEGORY_STATUS, "success", "content", str);
            ZimResBase zimResBase = (ZimResBase) d300.m109843g(str, ZimResBase.class);
            if (zimResBase != null) {
                if (1009 == zimResBase.Code) {
                    m130382a(String.valueOf(1009), str);
                    return;
                }
                if (!zimResBase.isSuccess() || this.f107000a == null) {
                    strValueOf2 = String.valueOf(zimResBase.Code);
                    strValueOf3 = zimResBase.Message;
                } else {
                    String strM18164sd = IdentityUtils.m18164sd(zimResBase.ResultObject.getBytes(), this.f107001b);
                    RecordService.getInstance().recordEvent(recordLevel, "finalResult", "content", strM18164sd);
                    if (strM18164sd != null) {
                        IdentityOcrVerifyContent identityOcrVerifyContent = (IdentityOcrVerifyContent) d300.m109843g(strM18164sd, IdentityOcrVerifyContent.class);
                        if (identityOcrVerifyContent != null && identityOcrVerifyContent.isOCRVerifySuccess()) {
                            this.f107000a.onSuccess();
                            return;
                        }
                        if (identityOcrVerifyContent != null) {
                            strValueOf = identityOcrVerifyContent.getBizCode();
                            strValueOf3 = identityOcrVerifyContent.getBizMessage();
                        } else {
                            strValueOf = String.valueOf(2001);
                            strValueOf3 = IdentityResponseCode.IDENTITY_CONTENT_FORMAT_ERROR_MSG;
                        }
                        strValueOf2 = strValueOf;
                    } else {
                        strValueOf2 = String.valueOf(2001);
                        strValueOf3 = IdentityResponseCode.IDENTITY_DECRYPTED_ERROR_MSG;
                    }
                }
            }
            m130382a(strValueOf2, strValueOf3);
        }
    }

    /* JADX INFO: renamed from: l.hc20$d */
    public class C17271d implements qc80 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ kuj0 f107002a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ List f107003b;

        public C17271d(kuj0 kuj0Var, List list) {
            this.f107002a = kuj0Var;
            this.f107003b = list;
        }

        @Override // p149l.qc80
        public void onError(int i, String str) {
            kuj0 kuj0Var = this.f107002a;
            if (kuj0Var != null) {
                kuj0Var.onFail(this.f107003b);
            }
        }

        @Override // p149l.qc80
        public void onSuccess(int i, String str) {
            IdentityLogRes identityLogRes;
            if (str == null || str.isEmpty() || (((identityLogRes = (IdentityLogRes) d300.m109843g(str, IdentityLogRes.class)) == null || identityLogRes.Code < 500) && !(identityLogRes == null && str.contains("ServiceUnavailable")))) {
                kuj0 kuj0Var = this.f107002a;
                if (kuj0Var != null) {
                    kuj0Var.onSuccess();
                    return;
                }
                return;
            }
            kuj0 kuj0Var2 = this.f107002a;
            if (kuj0Var2 != null) {
                kuj0Var2.onFail(this.f107003b);
            }
        }
    }

    /* JADX INFO: renamed from: l.hc20$e */
    public class C17272e implements qc80 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f107004a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ ucm f107005b;

        public C17272e(String str, ucm ucmVar) {
            this.f107004a = str;
            this.f107005b = ucmVar;
        }

        /* JADX INFO: renamed from: a */
        private void m130383a(String str, String str2) {
            ucm ucmVar = this.f107005b;
            if (ucmVar != null) {
                ucmVar.mo17787a(str, str2);
            } else {
                ixq0.m138886c("the identityOcrResultCallback is null");
            }
        }

        @Override // p149l.qc80
        public void onError(int i, String str) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, hc20.f106995e, NotificationCompat.CATEGORY_STATUS, "fail", "errorMsg", str);
            m130383a(String.valueOf(i), str);
        }

        @Override // p149l.qc80
        public void onSuccess(int i, String str) {
            String str2;
            ucm ucmVar;
            if (str == null) {
                m130383a("NET_RESPONSE_INVALID", "NET_RESPONSE_INVALID");
                return;
            }
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, hc20.f106995e, NotificationCompat.CATEGORY_STATUS, "success", "content", str);
            ZimResBase zimResBase = (ZimResBase) d300.m109843g(str, ZimResBase.class);
            if (zimResBase == null || (str2 = zimResBase.ResultObject) == null) {
                m130383a("NET_RESPONSE_INVALID", "NET_RESPONSE_INVALID");
                return;
            }
            OcrResultVerifyBean ocrResultVerifyBean = (OcrResultVerifyBean) d300.m109843g(IdentityUtils.m18164sd(str2.getBytes(), this.f107004a), OcrResultVerifyBean.class);
            if (ocrResultVerifyBean == null || (ucmVar = this.f107005b) == null) {
                return;
            }
            ucmVar.mo17788b(ocrResultVerifyBean.getCode(), ocrResultVerifyBean.getErrorParam());
        }
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static OSSConfig m130372d(ZimInitContent zimInitContent) {
        OSSConfig oSSConfig = new OSSConfig();
        oSSConfig.AccessKeyId = zimInitContent.getAccessKeyId();
        oSSConfig.AccessKeySecret = zimInitContent.getAccessKeySecret();
        oSSConfig.SecurityToken = zimInitContent.getSecurityToken();
        oSSConfig.BucketName = zimInitContent.getBucketName();
        oSSConfig.FileNamePrefix = zimInitContent.getFileName();
        oSSConfig.OssEndPoint = zimInitContent.getOssEndPoint();
        kcm.m145452H().m145499O1(zimInitContent.getProductCode());
        kcm.m145452H().m145542f1(zimInitContent.getImageCount());
        kcm.m145452H().m145513T0(zimInitContent.getDocType());
        kcm.m145452H().m145510S0(zimInitContent.getDocPageTotalNum());
        kcm.m145452H().m145496N1(zimInitContent.getPictureMaxWidth(), zimInitContent.getAlbumMaxWidth(), zimInitContent.getOriPicMaxWidth(), zimInitContent.getPictureQuality());
        return oSSConfig;
    }

    /* JADX INFO: renamed from: e */
    private static void m130373e(String str, Map<String, String> map, t3g.InterfaceC20102a interfaceC20102a, qc80 qc80Var) {
        kb20 kb20VarM145485K = kcm.m145452H().m145485K();
        if (kb20VarM145485K == null) {
            ixq0.m138886c(" the networkENV can not be read ");
            return;
        }
        rc80.f158747b = kb20VarM145485K.f122186a;
        rc80.f158746a = kb20VarM145485K.f122190e;
        t3g t3gVar = new t3g(interfaceC20102a);
        rc80.m178797e(t3gVar);
        ixq0.m138885b("FallbackConfigManager", "FallbackUrls" + t3gVar.m187114a().mo108517b() + " FallbackHosts" + t3gVar.m187114a().mo108516a());
        rc80.m178798f(str, "2022-08-09", map, qc80Var);
    }

    /* JADX INFO: renamed from: f */
    public static void m130374f(String str, String str2, boolean z, fgq0 fgq0Var) {
        HashMap map = new HashMap();
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "initSmartDevice", "certifyId", str, "metaInfo", str2);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("metaInfo", (Object) str2);
        String jSONString = jSONObject.toJSONString();
        if (jSONString != null) {
            jSONString = IdentityUtils.m18165se(jSONString.getBytes(), str);
        }
        map.put("RequestData", jSONString);
        map.put("CertifyId", str);
        map.put("AppVersion", "2022-08-09");
        m130373e(f106991a, map, new csm(kcm.m145452H().m145485K()), new C17268a(str, fgq0Var));
        RecordService.getInstance().flush();
    }

    /* JADX INFO: renamed from: g */
    public static void m130375g(Map<String, String> map, boolean z, byte[] bArr, ucm ucmVar) {
        HashMap map2 = new HashMap();
        String strM145564n = kcm.m145452H().m145564n();
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            jSONObject.put(entry.getKey(), (Object) entry.getValue());
        }
        if (!z && map.containsKey("nfcFileName") && map.get("nfcFileName") != null && bArr != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(map.get("nfcFileName"), (Object) d300.m109837a(bArr));
            jSONObject.put("base64Info", (Object) jSONObject2.toJSONString());
        }
        String jSONString = jSONObject.toJSONString();
        if (jSONString != null) {
            jSONString = IdentityUtils.m18165se(jSONString.getBytes(), strM145564n);
        }
        map2.put("RequestData", jSONString);
        map2.put("AppVersion", "2022-08-09");
        map2.put("CertifyId", strM145564n);
        m130373e(f106995e, map2, new twk0(kcm.m145452H().m145485K(), kcm.m145452H().m145579s0()), new C17272e(strM145564n, ucmVar));
    }

    /* JADX INFO: renamed from: h */
    public static void m130376h(String str, String str2, String str3, byte[] bArr, String str4, boolean z, boolean z2, tcm tcmVar) {
        HashMap map = new HashMap();
        String strM145525Z = kcm.m145452H().m145525Z();
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "ocrSmartDevice", "certifyId", str, "fileName", str2, "fileOriginName", strM145525Z, "side", str3);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("fileName", (Object) str2);
        jSONObject.put("fileOriginName", (Object) strM145525Z);
        jSONObject.put("side", (Object) str3);
        if (z2) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(str2, (Object) d300.m109837a(bArr));
            jSONObject.put("base64Info", (Object) jSONObject2.toJSONString());
        }
        if (str4 != null) {
            jSONObject.put("encryptKey", (Object) str4);
            jSONObject.put("encryptVersion", (Object) "NATIVE_E1");
        }
        if (kcm.m145452H().m145540f()) {
            jSONObject.put("imageSource", (Object) ProfileLikeModuleType.album);
        } else {
            jSONObject.put("imageSource", (Object) "snap");
        }
        if (pcm.f148193f.equals(kcm.m145452H().m145550i0())) {
            int i = 1;
            if (!"OCR_ID_FACE".equals(str3)) {
                if ("OCR_ID_BACK".equals(str3)) {
                    i = 2;
                } else if ("OCR_ID_THIRD".equals(str3)) {
                    i = 3;
                }
            }
            jSONObject.put("pageNo", (Object) Integer.valueOf(i));
        }
        String jSONString = jSONObject.toJSONString();
        if (jSONString != null) {
            jSONString = IdentityUtils.m18165se(jSONString.getBytes(), str);
        }
        map.put("RequestData", jSONString);
        map.put("CertifyId", str);
        map.put("AppVersion", "2022-08-09");
        m130373e(f106992b, map, new twk0(kcm.m145452H().m145485K(), kcm.m145452H().m145579s0()), new C17269b(tcmVar, str));
    }

    /* JADX INFO: renamed from: i */
    private static String m130377i(String str) {
        ksf0.m147071e(ksf0.f124455b, null);
        ksf0.m147072f();
        String strM145578s = kcm.m145452H().m145578s();
        return (strM145578s == null || strM145578s.isEmpty() || strM145578s.length() > 2000) ? ksf0.m147067a(str) : strM145578s;
    }

    /* JADX INFO: renamed from: j */
    public static void m130378j(List<String> list, boolean z, kuj0 kuj0Var) {
        if (list.size() <= 0) {
            return;
        }
        HashMap map = new HashMap();
        map.put("BizType", "SMART_CLOUD_AUTH");
        map.put("AppVersion", "2022-08-09");
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            try {
                arrayList.add(JSON.parseObject(it.next()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (arrayList.size() <= 0) {
            return;
        }
        String strM109844h = d300.m109844h(arrayList);
        if (strM109844h.isEmpty()) {
            return;
        }
        map.put("UploadInfos", strM109844h);
        m130373e(f106994d, map, new twk0(kcm.m145452H().m145485K(), kcm.m145452H().m145579s0()), new C17271d(kuj0Var, list));
    }

    /* JADX INFO: renamed from: k */
    public static void m130379k(String str, String str2, String str3, String str4, boolean z, boolean z2, vcm vcmVar) {
        byte[] bArrM145558l;
        ksf0.m147071e(ksf0.C18071a.f124471i, null);
        HashMap map = new HashMap();
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "VALIDATION_REQUEST", "certifyId", str, "certifyData", str3);
        map.put("CertifyId", str);
        map.put("AppVersion", "2022-08-09");
        JSONObject jSONObject = new JSONObject();
        if (str2 != null && str2.compareToIgnoreCase("\"{}\"") != 0) {
            jSONObject.put("ocrData", (Object) str2);
        }
        jSONObject.put("certifyData", (Object) str3);
        jSONObject.put("deviceToken", (Object) m130377i(str));
        if (str4 != null) {
            jSONObject.put("encryptKey", (Object) str4);
            jSONObject.put("encryptVersion", (Object) "NATIVE_E1");
        }
        if (z2) {
            JSONObject jSONObject2 = new JSONObject();
            String strM145561m = kcm.m145452H().m145561m();
            String strM145456A = kcm.m145452H().m145456A();
            byte[] bArrM145599z = kcm.m145452H().m145599z();
            if (bArrM145599z != null) {
                jSONObject2.put(strM145456A, (Object) d300.m109837a(bArrM145599z));
            }
            if (kcm.m145452H().m145471F() == 2 && (bArrM145558l = kcm.m145452H().m145558l()) != null) {
                jSONObject2.put(strM145561m, (Object) d300.m109837a(bArrM145558l));
            }
            jSONObject.put("base64Info", (Object) jSONObject2.toJSONString());
        }
        String jSONString = jSONObject.toJSONString();
        if (jSONString != null) {
            jSONString = IdentityUtils.m18165se(jSONString.getBytes(), str);
        }
        map.put("RequestData", jSONString);
        m130373e(f106993c, map, new twk0(kcm.m145452H().m145485K(), kcm.m145452H().m145579s0()), new C17270c(vcmVar, str));
    }

    @Override // p149l.npl
    /* JADX INFO: renamed from: a */
    public boolean mo109852a(Map<String, Object> map, InterfaceC18132l1<Map<String, Object>> interfaceC18132l1) {
        if (map == null || !map.containsKey("ossConfig")) {
            if (interfaceC18132l1 != null) {
                interfaceC18132l1.mo145972a(null, "NULL", null);
            }
            return false;
        }
        Object obj = map.get("ossConfig");
        if (!(obj instanceof OSSConfig)) {
            if (interfaceC18132l1 != null) {
                interfaceC18132l1.mo145972a(null, "NULL", null);
            }
            return false;
        }
        OSSConfig oSSConfig = (OSSConfig) obj;
        zz40.C21825a c21825aM220993f = zz40.m220993f(oSSConfig.OssEndPoint, oSSConfig.AccessKeyId, oSSConfig.AccessKeySecret, oSSConfig.SecurityToken, oSSConfig.BucketName, (String) map.get("fileName"), (byte[]) map.get("fileContent"));
        if (c21825aM220993f == null) {
            if (interfaceC18132l1 == null) {
                return true;
            }
            interfaceC18132l1.mo145972a(null, c21825aM220993f.f205779b, null);
            return true;
        }
        if (interfaceC18132l1 == null) {
            return true;
        }
        if (c21825aM220993f.f205778a) {
            interfaceC18132l1.onSuccess(null);
            return true;
        }
        interfaceC18132l1.mo145972a(null, c21825aM220993f.f205779b, null);
        return true;
    }

    @Override // p149l.npl
    /* JADX INFO: renamed from: b */
    public void mo109853b(Context context, Map<String, Object> map) {
    }
}
