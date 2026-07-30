package p153l;

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
import com.p051p1.mobile.putong.core.data.ProfileLikeModuleType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class qk20 implements asl {

    /* JADX INFO: renamed from: a */
    private static String f158073a = "InitDeviceIntl";

    /* JADX INFO: renamed from: b */
    private static String f158074b = "OcrDeviceIntl";

    /* JADX INFO: renamed from: c */
    private static String f158075c = "VerifyDeviceIntl";

    /* JADX INFO: renamed from: d */
    private static String f158076d = "UploadDeviceInfosIntl";

    /* JADX INFO: renamed from: e */
    private static String f158077e = "UpdateOcrCardInfosIntl";

    /* JADX INFO: renamed from: l.qk20$a */
    public class C19587a implements wk80 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f158078a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ kpq0 f158079b;

        public C19587a(String str, kpq0 kpq0Var) {
            this.f158078a = str;
            this.f158079b = kpq0Var;
        }

        /* JADX INFO: renamed from: a */
        private void m176915a(String str, String str2) {
            kpq0 kpq0Var = this.f158079b;
            if (kpq0Var != null) {
                kpq0Var.mo19196a(str, str2);
            } else {
                o6r0.m166283c("the zimInitCallback is null");
            }
        }

        @Override // p153l.wk80
        public void onError(int i, String str) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "initSmartDeviceHttp", NotificationCompat.CATEGORY_STATUS, "error", "code", "" + i, "errMsg", str, "url", afm.m97360H().m97473n0(), "host", afm.m97360H().m97470m0());
            m176915a(dfm.f88194o, str);
        }

        @Override // p153l.wk80
        public void onSuccess(int i, String str) {
            String str2;
            String strConcat;
            if (str == null || str.isEmpty()) {
                m176915a(dfm.f88179J, "resContent is null");
                o6r0.m166282b("initSmartDevice", "resContent is null");
                return;
            }
            RecordService.getInstance().recordEvent(RecordLevel.LOG_KEY_NODE, "initSmartDeviceHttp", NotificationCompat.CATEGORY_STATUS, "success", "content", str);
            ZimResBase zimResBase = (ZimResBase) ac00.m96788g(str, ZimResBase.class);
            if (zimResBase == null) {
                o6r0.m166283c("zimInitGwResponse format error ,the zimInitGwResponse:".concat(str));
                str2 = "INIT_RESPONSE_FORMAT_ERROR";
                strConcat = "zimInitGwResponse format error";
            } else {
                if (1009 == zimResBase.Code) {
                    m176915a(dfm.f88175F, str);
                    o6r0.m166282b("initSmartDevice", "time invalid");
                    return;
                }
                str2 = "INIT_RESPONSE_ERROR";
                if (zimResBase.isSuccess()) {
                    String strM19241sd = IdentityUtils.m19241sd(zimResBase.ResultObject.getBytes(), this.f158078a);
                    if (strM19241sd != null) {
                        ZimInitContent zimInitContent = (ZimInitContent) ac00.m96788g(strM19241sd, ZimInitContent.class);
                        if (zimInitContent == null) {
                            strConcat = "INIT_CONTENT_FORMAT_ERROR  content:".concat(strM19241sd);
                            str2 = "INIT_CONTENT_FORMAT_ERROR";
                        } else {
                            if (zimInitContent.isInitSuccess()) {
                                OSSConfig oSSConfigM176907d = qk20.m176907d(zimInitContent);
                                kpq0 kpq0Var = this.f158079b;
                                if (kpq0Var != null) {
                                    kpq0Var.mo19197b(zimInitContent.getProtocol(), oSSConfigM176907d, zimInitContent.getNowDate(), zimInitContent.getExtProtocol());
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
            m176915a(str2, strConcat);
        }
    }

    /* JADX INFO: renamed from: l.qk20$b */
    public class C19588b implements wk80 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ jfm f158080a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f158081b;

        public C19588b(jfm jfmVar, String str) {
            this.f158080a = jfmVar;
            this.f158081b = str;
        }

        /* JADX INFO: renamed from: a */
        private void m176916a(String str, String str2) {
            jfm jfmVar = this.f158080a;
            if (jfmVar != null) {
                jfmVar.mo18989b(str, str2);
            } else {
                o6r0.m166283c("the identityOcrCallback is null");
            }
        }

        @Override // p153l.wk80
        public void onError(int i, String str) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "ocrSmartDeviceHttp", NotificationCompat.CATEGORY_STATUS, "error", "errMsg", str);
            jfm jfmVar = this.f158080a;
            if (jfmVar != null) {
                jfmVar.mo18988a(String.valueOf(i), str);
            }
        }

        @Override // p153l.wk80
        public void onSuccess(int i, String str) {
            String str2;
            String strValueOf = String.valueOf(1001);
            if (str == null || str.isEmpty()) {
                m176916a(String.valueOf(1001), "resContent is null");
                o6r0.m166281a("the response content is null");
                return;
            }
            if (this.f158080a == null) {
                o6r0.m166283c("onSuccesss the identityOcrCallback is null");
            }
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "ocrSmartDeviceHttp", NotificationCompat.CATEGORY_STATUS, "success", "content", str);
            ZimResBase zimResBase = (ZimResBase) ac00.m96788g(str, ZimResBase.class);
            if (zimResBase == null) {
                o6r0.m166283c(" Json parse  error  :resContent +".concat(str));
                str2 = "UNKNOW_ERROR";
            } else if (1009 == zimResBase.Code) {
                m176916a(String.valueOf(1009), str);
                o6r0.m166283c("the time is invalid");
                return;
            } else if (zimResBase.isSuccess()) {
                String strM19241sd = IdentityUtils.m19241sd(zimResBase.ResultObject.getBytes(), this.f158081b);
                if (strM19241sd != null) {
                    this.f158080a.onSuccess(strM19241sd);
                    return;
                } else {
                    strValueOf = String.valueOf(2001);
                    str2 = IdentityResponseCode.IDENTITY_DECRYPTED_ERROR_MSG;
                }
            } else {
                strValueOf = String.valueOf(zimResBase.Code);
                str2 = zimResBase.Message;
            }
            m176916a(strValueOf, str2);
        }
    }

    /* JADX INFO: renamed from: l.qk20$c */
    public class C19589c implements wk80 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ lfm f158082a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f158083b;

        public C19589c(lfm lfmVar, String str) {
            this.f158082a = lfmVar;
            this.f158083b = str;
        }

        /* JADX INFO: renamed from: a */
        private void m176917a(String str, String str2) {
            lfm lfmVar = this.f158082a;
            if (lfmVar != null) {
                lfmVar.mo18770b(str, str2);
            } else {
                o6r0.m166283c("the identityOcrCallback is null");
            }
        }

        @Override // p153l.wk80
        public void onError(int i, String str) {
            o6r0.m166282b("TAG", "http response onError  code: " + i + " errMsg" + str);
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "VALIDATION_RESPONSE", NotificationCompat.CATEGORY_STATUS, "fail", "url", afm.m97360H().m97473n0(), "host", xk80.f194718b, "errorMsg", str);
            lfm lfmVar = this.f158082a;
            if (lfmVar != null) {
                lfmVar.mo18770b(String.valueOf(i), str);
            }
        }

        @Override // p153l.wk80
        public void onSuccess(int i, String str) {
            String strValueOf;
            String strValueOf2 = String.valueOf(1005);
            String strValueOf3 = String.valueOf(1005);
            if (str == null || str.isEmpty()) {
                lfm lfmVar = this.f158082a;
                if (lfmVar != null) {
                    lfmVar.mo18770b(strValueOf2, strValueOf3);
                    return;
                }
                return;
            }
            o6r0.m166282b("TAG", "http response  onSuccess body: ".concat(str));
            RecordService recordService = RecordService.getInstance();
            RecordLevel recordLevel = RecordLevel.LOG_INFO;
            recordService.recordEvent(recordLevel, "VALIDATION_RESPONSE", NotificationCompat.CATEGORY_STATUS, "success", "content", str);
            ZimResBase zimResBase = (ZimResBase) ac00.m96788g(str, ZimResBase.class);
            if (zimResBase != null) {
                if (1009 == zimResBase.Code) {
                    m176917a(String.valueOf(1009), str);
                    return;
                }
                if (!zimResBase.isSuccess() || this.f158082a == null) {
                    strValueOf2 = String.valueOf(zimResBase.Code);
                    strValueOf3 = zimResBase.Message;
                } else {
                    String strM19241sd = IdentityUtils.m19241sd(zimResBase.ResultObject.getBytes(), this.f158083b);
                    RecordService.getInstance().recordEvent(recordLevel, "finalResult", "content", strM19241sd);
                    if (strM19241sd != null) {
                        IdentityOcrVerifyContent identityOcrVerifyContent = (IdentityOcrVerifyContent) ac00.m96788g(strM19241sd, IdentityOcrVerifyContent.class);
                        if (identityOcrVerifyContent != null && identityOcrVerifyContent.isOCRVerifySuccess()) {
                            this.f158082a.onSuccess();
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
            m176917a(strValueOf2, strValueOf3);
        }
    }

    /* JADX INFO: renamed from: l.qk20$d */
    public class C19590d implements wk80 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ n3k0 f158084a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ List f158085b;

        public C19590d(n3k0 n3k0Var, List list) {
            this.f158084a = n3k0Var;
            this.f158085b = list;
        }

        @Override // p153l.wk80
        public void onError(int i, String str) {
            n3k0 n3k0Var = this.f158084a;
            if (n3k0Var != null) {
                n3k0Var.onFail(this.f158085b);
            }
        }

        @Override // p153l.wk80
        public void onSuccess(int i, String str) {
            IdentityLogRes identityLogRes;
            if (str == null || str.isEmpty() || (((identityLogRes = (IdentityLogRes) ac00.m96788g(str, IdentityLogRes.class)) == null || identityLogRes.Code < 500) && !(identityLogRes == null && str.contains("ServiceUnavailable")))) {
                n3k0 n3k0Var = this.f158084a;
                if (n3k0Var != null) {
                    n3k0Var.onSuccess();
                    return;
                }
                return;
            }
            n3k0 n3k0Var2 = this.f158084a;
            if (n3k0Var2 != null) {
                n3k0Var2.onFail(this.f158085b);
            }
        }
    }

    /* JADX INFO: renamed from: l.qk20$e */
    public class C19591e implements wk80 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f158086a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ kfm f158087b;

        public C19591e(String str, kfm kfmVar) {
            this.f158086a = str;
            this.f158087b = kfmVar;
        }

        /* JADX INFO: renamed from: a */
        private void m176918a(String str, String str2) {
            kfm kfmVar = this.f158087b;
            if (kfmVar != null) {
                kfmVar.mo18864a(str, str2);
            } else {
                o6r0.m166283c("the identityOcrResultCallback is null");
            }
        }

        @Override // p153l.wk80
        public void onError(int i, String str) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, qk20.f158077e, NotificationCompat.CATEGORY_STATUS, "fail", "errorMsg", str);
            m176918a(String.valueOf(i), str);
        }

        @Override // p153l.wk80
        public void onSuccess(int i, String str) {
            String str2;
            kfm kfmVar;
            if (str == null) {
                m176918a("NET_RESPONSE_INVALID", "NET_RESPONSE_INVALID");
                return;
            }
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, qk20.f158077e, NotificationCompat.CATEGORY_STATUS, "success", "content", str);
            ZimResBase zimResBase = (ZimResBase) ac00.m96788g(str, ZimResBase.class);
            if (zimResBase == null || (str2 = zimResBase.ResultObject) == null) {
                m176918a("NET_RESPONSE_INVALID", "NET_RESPONSE_INVALID");
                return;
            }
            OcrResultVerifyBean ocrResultVerifyBean = (OcrResultVerifyBean) ac00.m96788g(IdentityUtils.m19241sd(str2.getBytes(), this.f158086a), OcrResultVerifyBean.class);
            if (ocrResultVerifyBean == null || (kfmVar = this.f158087b) == null) {
                return;
            }
            kfmVar.mo18865b(ocrResultVerifyBean.getCode(), ocrResultVerifyBean.getErrorParam());
        }
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static OSSConfig m176907d(ZimInitContent zimInitContent) {
        OSSConfig oSSConfig = new OSSConfig();
        oSSConfig.AccessKeyId = zimInitContent.getAccessKeyId();
        oSSConfig.AccessKeySecret = zimInitContent.getAccessKeySecret();
        oSSConfig.SecurityToken = zimInitContent.getSecurityToken();
        oSSConfig.BucketName = zimInitContent.getBucketName();
        oSSConfig.FileNamePrefix = zimInitContent.getFileName();
        oSSConfig.OssEndPoint = zimInitContent.getOssEndPoint();
        afm.m97360H().m97407O1(zimInitContent.getProductCode());
        afm.m97360H().m97450f1(zimInitContent.getImageCount());
        afm.m97360H().m97421T0(zimInitContent.getDocType());
        afm.m97360H().m97418S0(zimInitContent.getDocPageTotalNum());
        afm.m97360H().m97404N1(zimInitContent.getPictureMaxWidth(), zimInitContent.getAlbumMaxWidth(), zimInitContent.getOriPicMaxWidth(), zimInitContent.getPictureQuality());
        return oSSConfig;
    }

    /* JADX INFO: renamed from: e */
    private static void m176908e(String str, Map<String, String> map, h5g.InterfaceC17403a interfaceC17403a, wk80 wk80Var) {
        tj20 tj20VarM97393K = afm.m97360H().m97393K();
        if (tj20VarM97393K == null) {
            o6r0.m166283c(" the networkENV can not be read ");
            return;
        }
        xk80.f194718b = tj20VarM97393K.f174527a;
        xk80.f194717a = tj20VarM97393K.f174531e;
        h5g h5gVar = new h5g(interfaceC17403a);
        xk80.m211345e(h5gVar);
        o6r0.m166282b("FallbackConfigManager", "FallbackUrls" + h5gVar.m133657a().mo122676b() + " FallbackHosts" + h5gVar.m133657a().mo122675a());
        xk80.m211346f(str, "2022-08-09", map, wk80Var);
    }

    /* JADX INFO: renamed from: f */
    public static void m176909f(String str, String str2, boolean z, kpq0 kpq0Var) {
        HashMap map = new HashMap();
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "initSmartDevice", "certifyId", str, "metaInfo", str2);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("metaInfo", (Object) str2);
        String jSONString = jSONObject.toJSONString();
        if (jSONString != null) {
            jSONString = IdentityUtils.m19242se(jSONString.getBytes(), str);
        }
        map.put("RequestData", jSONString);
        map.put("CertifyId", str);
        map.put("AppVersion", "2022-08-09");
        m176908e(f158073a, map, new eum(afm.m97360H().m97393K()), new C19587a(str, kpq0Var));
        RecordService.getInstance().flush();
    }

    /* JADX INFO: renamed from: g */
    public static void m176910g(Map<String, String> map, boolean z, byte[] bArr, kfm kfmVar) {
        HashMap map2 = new HashMap();
        String strM97472n = afm.m97360H().m97472n();
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            jSONObject.put(entry.getKey(), (Object) entry.getValue());
        }
        if (!z && map.containsKey("nfcFileName") && map.get("nfcFileName") != null && bArr != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(map.get("nfcFileName"), (Object) ac00.m96782a(bArr));
            jSONObject.put("base64Info", (Object) jSONObject2.toJSONString());
        }
        String jSONString = jSONObject.toJSONString();
        if (jSONString != null) {
            jSONString = IdentityUtils.m19242se(jSONString.getBytes(), strM97472n);
        }
        map2.put("RequestData", jSONString);
        map2.put("AppVersion", "2022-08-09");
        map2.put("CertifyId", strM97472n);
        m176908e(f158077e, map2, new z5l0(afm.m97360H().m97393K(), afm.m97360H().m97487s0()), new C19591e(strM97472n, kfmVar));
    }

    /* JADX INFO: renamed from: h */
    public static void m176911h(String str, String str2, String str3, byte[] bArr, String str4, boolean z, boolean z2, jfm jfmVar) {
        HashMap map = new HashMap();
        String strM97433Z = afm.m97360H().m97433Z();
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "ocrSmartDevice", "certifyId", str, "fileName", str2, "fileOriginName", strM97433Z, "side", str3);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("fileName", (Object) str2);
        jSONObject.put("fileOriginName", (Object) strM97433Z);
        jSONObject.put("side", (Object) str3);
        if (z2) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(str2, (Object) ac00.m96782a(bArr));
            jSONObject.put("base64Info", (Object) jSONObject2.toJSONString());
        }
        if (str4 != null) {
            jSONObject.put("encryptKey", (Object) str4);
            jSONObject.put("encryptVersion", (Object) "NATIVE_E1");
        }
        if (afm.m97360H().m97448f()) {
            jSONObject.put("imageSource", (Object) ProfileLikeModuleType.album);
        } else {
            jSONObject.put("imageSource", (Object) "snap");
        }
        if (ffm.f98803f.equals(afm.m97360H().m97458i0())) {
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
            jSONString = IdentityUtils.m19242se(jSONString.getBytes(), str);
        }
        map.put("RequestData", jSONString);
        map.put("CertifyId", str);
        map.put("AppVersion", "2022-08-09");
        m176908e(f158074b, map, new z5l0(afm.m97360H().m97393K(), afm.m97360H().m97487s0()), new C19588b(jfmVar, str));
    }

    /* JADX INFO: renamed from: i */
    private static String m176912i(String str) {
        t0g0.m188742e(t0g0.f171505b, null);
        t0g0.m188743f();
        String strM97486s = afm.m97360H().m97486s();
        return (strM97486s == null || strM97486s.isEmpty() || strM97486s.length() > 2000) ? t0g0.m188738a(str) : strM97486s;
    }

    /* JADX INFO: renamed from: j */
    public static void m176913j(List<String> list, boolean z, n3k0 n3k0Var) {
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
        String strM96789h = ac00.m96789h(arrayList);
        if (strM96789h.isEmpty()) {
            return;
        }
        map.put("UploadInfos", strM96789h);
        m176908e(f158076d, map, new z5l0(afm.m97360H().m97393K(), afm.m97360H().m97487s0()), new C19590d(n3k0Var, list));
    }

    /* JADX INFO: renamed from: k */
    public static void m176914k(String str, String str2, String str3, String str4, boolean z, boolean z2, lfm lfmVar) {
        byte[] bArrM97466l;
        t0g0.m188742e(t0g0.C20202a.f171521i, null);
        HashMap map = new HashMap();
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "VALIDATION_REQUEST", "certifyId", str, "certifyData", str3);
        map.put("CertifyId", str);
        map.put("AppVersion", "2022-08-09");
        JSONObject jSONObject = new JSONObject();
        if (str2 != null && str2.compareToIgnoreCase("\"{}\"") != 0) {
            jSONObject.put("ocrData", (Object) str2);
        }
        jSONObject.put("certifyData", (Object) str3);
        jSONObject.put("deviceToken", (Object) m176912i(str));
        if (str4 != null) {
            jSONObject.put("encryptKey", (Object) str4);
            jSONObject.put("encryptVersion", (Object) "NATIVE_E1");
        }
        if (z2) {
            JSONObject jSONObject2 = new JSONObject();
            String strM97469m = afm.m97360H().m97469m();
            String strM97364A = afm.m97360H().m97364A();
            byte[] bArrM97507z = afm.m97360H().m97507z();
            if (bArrM97507z != null) {
                jSONObject2.put(strM97364A, (Object) ac00.m96782a(bArrM97507z));
            }
            if (afm.m97360H().m97379F() == 2 && (bArrM97466l = afm.m97360H().m97466l()) != null) {
                jSONObject2.put(strM97469m, (Object) ac00.m96782a(bArrM97466l));
            }
            jSONObject.put("base64Info", (Object) jSONObject2.toJSONString());
        }
        String jSONString = jSONObject.toJSONString();
        if (jSONString != null) {
            jSONString = IdentityUtils.m19242se(jSONString.getBytes(), str);
        }
        map.put("RequestData", jSONString);
        m176908e(f158075c, map, new z5l0(afm.m97360H().m97393K(), afm.m97360H().m97487s0()), new C19589c(lfmVar, str));
    }

    @Override // p153l.asl
    /* JADX INFO: renamed from: a */
    public boolean mo99940a(Map<String, Object> map, InterfaceC18331l1<Map<String, Object>> interfaceC18331l1) {
        if (map == null || !map.containsKey("ossConfig")) {
            if (interfaceC18331l1 != null) {
                interfaceC18331l1.mo135635a(null, "NULL", null);
            }
            return false;
        }
        Object obj = map.get("ossConfig");
        if (!(obj instanceof OSSConfig)) {
            if (interfaceC18331l1 != null) {
                interfaceC18331l1.mo135635a(null, "NULL", null);
            }
            return false;
        }
        OSSConfig oSSConfig = (OSSConfig) obj;
        o850.C19050a c19050aM166454f = o850.m166454f(oSSConfig.OssEndPoint, oSSConfig.AccessKeyId, oSSConfig.AccessKeySecret, oSSConfig.SecurityToken, oSSConfig.BucketName, (String) map.get("fileName"), (byte[]) map.get("fileContent"));
        if (c19050aM166454f == null) {
            if (interfaceC18331l1 == null) {
                return true;
            }
            interfaceC18331l1.mo135635a(null, c19050aM166454f.f145358b, null);
            return true;
        }
        if (interfaceC18331l1 == null) {
            return true;
        }
        if (c19050aM166454f.f145357a) {
            interfaceC18331l1.onSuccess(null);
            return true;
        }
        interfaceC18331l1.mo135635a(null, c19050aM166454f.f145358b, null);
        return true;
    }

    @Override // p153l.asl
    /* JADX INFO: renamed from: b */
    public void mo99941b(Context context, Map<String, Object> map) {
    }
}
