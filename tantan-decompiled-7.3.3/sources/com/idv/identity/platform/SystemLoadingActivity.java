package com.idv.identity.platform;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.alibaba.fastjson.JSON;
import com.idv.identity.platform.config.Chameleon;
import com.idv.identity.platform.config.IdentityFarNearConfig;
import com.idv.identity.platform.config.OSSConfig;
import com.idv.identity.platform.log.RecordLevel;
import com.idv.identity.platform.log.RecordService;
import com.idv.identity.platform.model.NfcConfigRes;
import com.idv.identity.platform.model.ZimInitContent;
import com.idv.identity.platform.utils.EnvCheck;
import com.idv.identity.util.IdentityUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p153l.ac00;
import p153l.afm;
import p153l.cfm;
import p153l.dfm;
import p153l.eec0;
import p153l.ffm;
import p153l.hfm;
import p153l.kpq0;
import p153l.lf20;
import p153l.o6r0;
import p153l.qk20;
import p153l.scc0;
import p153l.t0g0;
import p153l.tj20;

/* JADX INFO: loaded from: classes7.dex */
public class SystemLoadingActivity extends IntlFaceBaseActivity {

    /* JADX INFO: renamed from: e */
    private static String[] f13458e = {"android.permission.CAMERA"};

    /* JADX INFO: renamed from: c */
    private long f13459c = System.currentTimeMillis();

    /* JADX INFO: renamed from: d */
    private Handler f13460d = new Handler(new C3866a());

    /* JADX INFO: renamed from: com.idv.identity.platform.SystemLoadingActivity$a */
    public class C3866a implements Handler.Callback {
        public C3866a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (1001 == i) {
                SystemLoadingActivity.this.m19189U0((String) message.obj);
                return true;
            }
            if (1002 != i) {
                return true;
            }
            SystemLoadingActivity.this.m19190V0();
            return true;
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.platform.SystemLoadingActivity$b */
    public class C3867b implements kpq0 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ long f13462a;

        public C3867b(long j) {
            this.f13462a = j;
        }

        @Override // p153l.kpq0
        /* JADX INFO: renamed from: a */
        public void mo19196a(String str, String str2) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "START_INIT_REQUEST", "action", "initDeviceCost", NotificationCompat.CATEGORY_STATUS, "fail", "errorCode", str, "errorMsg", str2, "tag", "onError", "timeCost", String.valueOf((System.currentTimeMillis() - this.f13462a) / 1000.0d) + BLiveStormDanmakuGiftResourceType.f45294s);
            SystemLoadingActivity.this.m19191W0(str);
        }

        @Override // p153l.kpq0
        /* JADX INFO: renamed from: b */
        public void mo19197b(String str, OSSConfig oSSConfig, String str2, String str3) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "START_INIT_REQUEST", "action", "initDeviceCost", NotificationCompat.CATEGORY_STATUS, "success", "extProtocol", str3, "timeCost", String.valueOf((System.currentTimeMillis() - this.f13462a) / 1000.0d) + BLiveStormDanmakuGiftResourceType.f45294s);
            SystemLoadingActivity.this.m19192X0(oSSConfig, str2, str3, false);
        }
    }

    /* JADX INFO: renamed from: Q0 */
    private boolean m19186Q0() {
        EnvCheck.EnvErrorType envErrorTypeM19204c;
        String strM97458i0 = afm.m97360H().m97458i0();
        if (ffm.f98803f.equals(strM97458i0) || ffm.f98802e.equals(strM97458i0)) {
            EnvCheck.EnvErrorType envErrorTypeM19202a = EnvCheck.m19202a();
            if (EnvCheck.EnvErrorType.ENV_SUCCESS == envErrorTypeM19202a) {
                return false;
            }
            if (EnvCheck.EnvErrorType.ENV_ERROR_LOW_OS == envErrorTypeM19202a) {
                m19191W0(dfm.f88192m);
            } else if (EnvCheck.EnvErrorType.ENV_ERROR_NO_BACK_CAMERA == envErrorTypeM19202a) {
                m19191W0(dfm.f88187h);
            } else if (EnvCheck.EnvErrorType.ENV_ERROR_NO_FRONT_CAMERA == envErrorTypeM19202a) {
                m19191W0(dfm.f88186g);
            }
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "enviromentCheck", NotificationCompat.CATEGORY_STATUS, "error", "code", String.valueOf(envErrorTypeM19202a));
            return true;
        }
        if (ffm.f98801d.equals(strM97458i0)) {
            EnvCheck.EnvErrorType envErrorTypeM19203b = EnvCheck.m19203b();
            if (EnvCheck.EnvErrorType.ENV_SUCCESS == envErrorTypeM19203b) {
                return false;
            }
            m19191W0(dfm.f88187h);
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "enviromentCheck", NotificationCompat.CATEGORY_STATUS, "error", "code", String.valueOf(envErrorTypeM19203b));
            return true;
        }
        if ((!ffm.f98798a.equals(strM97458i0) && !ffm.f98799b.equals(strM97458i0) && !ffm.f98800c.equals(strM97458i0) && !ffm.f98806i.equals(strM97458i0) && !ffm.f98805h.equals(strM97458i0)) || EnvCheck.EnvErrorType.ENV_SUCCESS == (envErrorTypeM19204c = EnvCheck.m19204c())) {
            return false;
        }
        m19191W0(dfm.f88186g);
        RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "enviromentCheck", NotificationCompat.CATEGORY_STATUS, "error", "code", String.valueOf(envErrorTypeM19204c));
        return true;
    }

    /* JADX INFO: renamed from: R0 */
    private List<String> m19187R0() {
        ArrayList arrayList = new ArrayList();
        for (String str : f13458e) {
            if (checkSelfPermission(str) != 0) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: S0 */
    private String m19188S0() {
        return "LOADING";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public void m19189U0(String str) {
        if (TextUtils.isEmpty(str)) {
            str = dfm.f88180a;
        }
        String str2 = str;
        finish();
        RecordService.getInstance().recordEventPage(RecordLevel.LOG_INFO, "LOADING_EXIT", "LOADING", (System.currentTimeMillis() - this.f13459c) + "ms", str2);
        afm.m97360H().m97445e(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:64:0x014a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0169  */
    /* JADX INFO: renamed from: V0 */
    public void m19190V0() {
        boolean zM153964b;
        String str;
        String str2;
        NfcConfigRes nfcConfigResM97396L = afm.m97360H().m97396L();
        String strM97461j0 = afm.m97360H().m97461j0();
        String strM97458i0 = afm.m97360H().m97458i0();
        if (strM97458i0 == null) {
            m19191W0(dfm.f88174E);
            return;
        }
        o6r0.m166282b("Identity", "onInitSuccessproductCode " + strM97458i0);
        String strM97454h = afm.m97360H().m97454h();
        String strM97457i = afm.m97360H().m97457i();
        String str3 = "";
        if (strM97454h != null && strM97457i != null && !TextUtils.isEmpty(strM97454h) && !TextUtils.isEmpty(strM97457i)) {
            zM153964b = lf20.m153968f(this);
        } else if (ffm.f98806i.equals(strM97458i0) || ffm.f98798a.equals(strM97458i0) || ffm.f98799b.equals(strM97458i0) || ffm.f98800c.equals(strM97458i0) || ffm.f98805h.equals(strM97458i0)) {
            zM153964b = lf20.m153964b(this, true);
            if (!zM153964b) {
                str3 = dfm.f88203x;
            }
        } else if (ffm.f98801d.equals(strM97458i0)) {
            zM153964b = lf20.m153967e("1".equals(strM97461j0), this);
            if (!zM153964b) {
                str3 = dfm.f88202w;
            }
        } else {
            if (ffm.f98804g.equals(strM97458i0)) {
                if (!getPackageManager().hasSystemFeature("android.hardware.nfc")) {
                    RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "START_CKYC", "docType", cfm.f81515a, "warning", dfm.f88204y);
                    str = dfm.f88204y;
                    zM153964b = false;
                } else if ("1".equals(strM97461j0)) {
                    zM153964b = lf20.m153968f(this);
                    if (!zM153964b) {
                        str3 = dfm.f88202w;
                    }
                } else {
                    zM153964b = m19194a1(nfcConfigResM97396L);
                    if (!zM153964b) {
                        str3 = dfm.f88201v;
                    }
                }
                str2 = (System.currentTimeMillis() - this.f13459c) + "ms";
                if (zM153964b) {
                    RecordService recordService = RecordService.getInstance();
                    RecordLevel recordLevel = RecordLevel.LOG_INFO;
                    recordService.recordEvent(recordLevel, "START_INIT", "action", "initSDK", NotificationCompat.CATEGORY_STATUS, "success", "productCode", strM97458i0);
                    RecordService.getInstance().recordEventPage(recordLevel, "LOADING_EXIT", "LOADING", str2, "SUCCESS");
                } else {
                    RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "START_INIT", "action", "initSDK", NotificationCompat.CATEGORY_STATUS, "error", "productCode", strM97458i0, "errMsg", dfm.f88200u);
                    m19191W0(str);
                }
                finish();
            }
            if (ffm.f98802e.equals(strM97458i0)) {
                if ("1".equals(strM97461j0)) {
                    zM153964b = lf20.m153968f(this);
                    if (!zM153964b) {
                        str3 = dfm.f88202w;
                    }
                } else {
                    zM153964b = m19193Y0(nfcConfigResM97396L);
                }
            } else if (ffm.f98803f.equals(strM97458i0)) {
                zM153964b = "1".equals(strM97461j0) ? lf20.m153968f(this) : lf20.m153967e(false, this);
            } else {
                zM153964b = true;
            }
        }
        str = str3;
        str2 = (System.currentTimeMillis() - this.f13459c) + "ms";
        if (zM153964b) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "START_INIT", "action", "initSDK", NotificationCompat.CATEGORY_STATUS, "error", "productCode", strM97458i0, "errMsg", dfm.f88200u);
            m19191W0(str);
        } else {
            RecordService recordService2 = RecordService.getInstance();
            RecordLevel recordLevel2 = RecordLevel.LOG_INFO;
            recordService2.recordEvent(recordLevel2, "START_INIT", "action", "initSDK", NotificationCompat.CATEGORY_STATUS, "success", "productCode", strM97458i0);
            RecordService.getInstance().recordEventPage(recordLevel2, "LOADING_EXIT", "LOADING", str2, "SUCCESS");
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W0 */
    public void m19191W0(String str) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 1001;
        messageObtain.obj = str;
        this.f13460d.sendMessage(messageObtain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public void m19192X0(OSSConfig oSSConfig, String str, String str2, boolean z) {
        NfcConfigRes nfcConfigResM97396L;
        if (m19186Q0()) {
            return;
        }
        Map map = (Map) JSON.parseObject(str2, Map.class);
        if (map != null && !map.isEmpty()) {
            boolean zContainsKey = map.containsKey("docVideo");
            boolean zContainsKey2 = map.containsKey("model");
            boolean zContainsKey3 = map.containsKey("faceLivenessFarNearOpen");
            boolean zContainsKey4 = map.containsKey("faceLivenessFarNearConfig");
            boolean zContainsKey5 = map.containsKey("appQualityCheck");
            boolean zContainsKey6 = map.containsKey("clientLivenessTimeout");
            boolean zContainsKey7 = map.containsKey("docPageConfig");
            boolean zContainsKey8 = map.containsKey("docMode");
            boolean zContainsKey9 = map.containsKey("showGuidePage");
            boolean zContainsKey10 = map.containsKey("nfcConfig");
            boolean zContainsKey11 = map.containsKey("useNFC");
            boolean zContainsKey12 = map.containsKey("chameleonFrameEnable");
            boolean zContainsKey13 = map.containsKey("chameleon");
            boolean zContainsKey14 = map.containsKey("useOssSdk");
            map.containsKey("getOssSdkDegrade");
            boolean zContainsKey15 = map.containsKey("deviceCompressImageSwitch");
            boolean zContainsKey16 = map.containsKey("authUrls");
            boolean zContainsKey17 = map.containsKey("authorizationAgreementLinkId");
            boolean zContainsKey18 = map.containsKey("authorizationAgreementLinkEn");
            if (zContainsKey16) {
                try {
                    List<String> array = JSON.parseArray(JSON.toJSONString(map.get("authUrls")), String.class);
                    tj20.m191354b().m191360f(array);
                    afm.m97360H().m97406O0((!z || array == null || array.isEmpty()) ? false : true);
                } catch (Exception e) {
                    RecordService.getInstance().recordException(e);
                }
            }
            if (zContainsKey17) {
                Object obj = map.get("authorizationAgreementLinkId");
                if (obj instanceof String) {
                    afm.m97360H().m97383G0((String) obj);
                }
            }
            if (zContainsKey18) {
                Object obj2 = map.get("authorizationAgreementLinkEn");
                if (obj2 instanceof String) {
                    afm.m97360H().m97380F0((String) obj2);
                }
            }
            if (zContainsKey15) {
                Object obj3 = map.get("deviceCompressImageSwitch");
                if (obj3 instanceof String) {
                    if ("N".equals(obj3)) {
                        afm.m97360H().m97409P0(false);
                    } else if ("Y".equals(obj3)) {
                        afm.m97360H().m97409P0(true);
                    }
                }
            }
            if (zContainsKey14) {
                Object obj4 = map.get("useOssSdk");
                if (obj4 instanceof String) {
                    if ("N".equals(obj4)) {
                        afm.m97360H().m97395K1(false);
                    } else if ("Y".equals(obj4)) {
                        afm.m97360H().m97395K1(true);
                    }
                }
            }
            if (zContainsKey12) {
                Object obj5 = map.get("chameleonFrameEnable");
                if (obj5 instanceof Boolean) {
                    afm.m97360H().m97400M0(((Boolean) obj5).booleanValue());
                }
            }
            if (zContainsKey13) {
                try {
                    afm.m97360H().m97397L0((Chameleon) ac00.m96788g(JSON.toJSONString(map.get("chameleon")), Chameleon.class));
                } catch (Exception e2) {
                    RecordService.getInstance().recordException(e2);
                }
            }
            if (zContainsKey11) {
                Object obj6 = map.get("useNFC");
                if (obj6 instanceof String) {
                    afm.m97360H().m97416R1((String) obj6);
                }
            }
            if (zContainsKey10) {
                try {
                    afm.m97360H().m97468l1((NfcConfigRes) ac00.m96788g(JSON.toJSONString(map.get("nfcConfig")), NfcConfigRes.class));
                } catch (Exception e3) {
                    RecordService.getInstance().recordException(e3);
                }
            }
            if (zContainsKey8) {
                Object obj7 = map.get("docMode");
                if (obj7 instanceof String) {
                    afm.m97360H().m97389I1((String) obj7);
                }
            }
            if (zContainsKey9) {
                Object obj8 = map.get("showGuidePage");
                if (obj8 instanceof String) {
                    afm.m97360H().m97410P1((String) obj8);
                }
            }
            if (zContainsKey7) {
                try {
                    afm.m97360H().m97415R0(JSON.parseArray(JSON.toJSONString(map.get("docPageConfig")), String.class));
                } catch (Exception e4) {
                    RecordService.getInstance().recordException(e4);
                }
            }
            if (zContainsKey) {
                Object obj9 = map.get("docVideo");
                if (obj9 instanceof String) {
                    afm.m97360H().m97424U0((String) obj9);
                }
            }
            if (zContainsKey2) {
                Object obj10 = map.get("model");
                if (obj10 instanceof String) {
                    String strM97464k0 = afm.m97360H().m97464k0();
                    if (strM97464k0 == null || obj10.equals(strM97464k0)) {
                        afm.m97360H().m97456h1((String) obj10);
                    } else {
                        afm.m97360H().m97456h1(strM97464k0);
                    }
                }
            }
            if (zContainsKey3) {
                Object obj11 = map.get("faceLivenessFarNearOpen");
                if (obj11 instanceof String) {
                    afm.m97360H().m97434Z0((String) obj11);
                }
            }
            if (zContainsKey4) {
                IdentityFarNearConfig identityFarNearConfig = (IdentityFarNearConfig) JSON.parseObject(JSON.toJSONString(map.get("faceLivenessFarNearConfig")), IdentityFarNearConfig.class);
                if (identityFarNearConfig != null) {
                    identityFarNearConfig.toString();
                }
                afm.m97360H().m97444d1(identityFarNearConfig);
            }
            if (zContainsKey5) {
                Object obj12 = map.get("appQualityCheck");
                if (obj12 instanceof String) {
                    afm.m97360H().m97377E0((String) obj12);
                }
            }
            if (zContainsKey6) {
                Object obj13 = map.get("clientLivenessTimeout");
                o6r0.m166282b("TAG", "clientLivenessTimeout:" + obj13);
                if (obj13 != null) {
                    try {
                        afm.m97360H().m97403N0(Float.parseFloat(String.valueOf(obj13)));
                    } catch (Exception e5) {
                        o6r0.m166282b("TAG", "clientLivenessTimeout:" + e5.getMessage());
                        RecordService.getInstance().recordException(e5);
                    }
                }
            }
        }
        if (ffm.f98804g.equalsIgnoreCase(afm.m97360H().m97458i0()) && ((nfcConfigResM97396L = afm.m97360H().m97396L()) == null || nfcConfigResM97396L.getNfcMode() == null || TextUtils.isEmpty(nfcConfigResM97396L.getNfcMode()))) {
            m19191W0(dfm.f88205z);
            return;
        }
        if (oSSConfig == null || oSSConfig.FileNamePrefix == null || oSSConfig.OssEndPoint == null || oSSConfig.AccessKeyId == null || oSSConfig.AccessKeySecret == null) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "START_INIT_REQUEST", "action", "initSmartDeviceRes", NotificationCompat.CATEGORY_STATUS, "fail", "errorMsg", "parseResult notValid");
            m19191W0(dfm.f88181b);
            return;
        }
        afm.m97360H().m97392J1(oSSConfig);
        afm.m97360H().m97474n1(str);
        afm.m97360H().m97426V0(str2);
        t0g0.m188742e(t0g0.C20202a.f171513a, null);
        this.f13460d.sendEmptyMessage(1002);
    }

    /* JADX INFO: renamed from: Y0 */
    private boolean m19193Y0(NfcConfigRes nfcConfigRes) {
        String strM97495v = afm.m97360H().m97495v();
        RecordService recordService = RecordService.getInstance();
        RecordLevel recordLevel = RecordLevel.LOG_ERROR;
        recordService.recordEvent(recordLevel, "START_CKYC", "docType", strM97495v);
        if (!cfm.f81515a.equals(strM97495v) || nfcConfigRes == null) {
            return lf20.m153967e("1".equals(afm.m97360H().m97461j0()), this);
        }
        boolean zHasSystemFeature = getPackageManager().hasSystemFeature("android.hardware.nfc");
        RecordService.getInstance().recordEvent(recordLevel, "START_CKYC", "docType", strM97495v, "FEATURE_NFC", String.valueOf(zHasSystemFeature));
        return !zHasSystemFeature ? lf20.m153967e("1".equals(afm.m97360H().m97461j0()), this) : m19194a1(nfcConfigRes);
    }

    /* JADX INFO: renamed from: a1 */
    private boolean m19194a1(NfcConfigRes nfcConfigRes) {
        if (nfcConfigRes != null && nfcConfigRes.getNfcMode() != null) {
            if ("0".equals(nfcConfigRes.getNfcMode())) {
                return lf20.m153965c(this);
            }
            if ("1".equals(nfcConfigRes.getNfcMode())) {
                return lf20.m153967e(false, this);
            }
            if ("2".equals(nfcConfigRes.getNfcMode())) {
                return lf20.m153966d(this, nfcConfigRes.getDocumentNumber(), nfcConfigRes.getDateOfBirth(), nfcConfigRes.getDateOfExpiry());
            }
        }
        return false;
    }

    private void init() {
        String strM97472n = afm.m97360H().m97472n();
        EnvCheck.EnvErrorType envErrorTypeM19205d = EnvCheck.m19205d();
        if (EnvCheck.EnvErrorType.ENV_SUCCESS != envErrorTypeM19205d) {
            if (EnvCheck.EnvErrorType.ENV_ERROR_LOW_OS == envErrorTypeM19205d) {
                m19191W0(dfm.f88192m);
            }
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "enviromentCheck", NotificationCompat.CATEGORY_STATUS, "error", "code", String.valueOf(envErrorTypeM19205d));
            return;
        }
        String str = hfm.f109316a;
        if (str == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(strM97472n)) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "enviromentCheck", NotificationCompat.CATEGORY_STATUS, "success");
            Intent intent = getIntent();
            qk20.m176909f(strM97472n, (intent == null || !intent.hasExtra("toyger_meta_info")) ? "" : intent.getStringExtra("toyger_meta_info"), false, new C3867b(System.currentTimeMillis()));
            return;
        }
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "init", "protocol", hfm.f109316a, "certifyId", strM97472n);
        o6r0.m166282b("SystemLoadingActivity", "protocol:" + hfm.f109316a + " certifyId:" + strM97472n);
        ZimInitContent zimInitContent = (ZimInitContent) ac00.m96788g(IdentityUtils.m19241sd(hfm.f109316a.getBytes(), strM97472n), ZimInitContent.class);
        m19192X0(qk20.m176907d(zimInitContent), zimInitContent.NowDate, zimInitContent.ExtProtocol, true);
    }

    /* JADX INFO: renamed from: T0 */
    public void m19195T0() {
        List<String> listM19187R0 = m19187R0();
        if (listM19187R0.size() <= 0) {
            init();
        } else {
            RecordService.getInstance().recordEventBehavior(RecordLevel.LOG_INFO, "PAGER_BEHAVIOR", "permissionAlertAppear", m19188S0());
            requestPermissions((String[]) listM19187R0.toArray(new String[0]), 1024);
        }
    }

    @Override // com.idv.identity.platform.IntlFaceBaseActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(eec0.f93637f);
        this.f13459c = System.currentTimeMillis();
        RecordService.getInstance().recordEventPage(RecordLevel.LOG_INFO, "LOADING_ENTER", "LOADING");
        TextView textView = (TextView) findViewById(scc0.f167227p);
        if (textView != null) {
            textView.setVisibility(8);
        }
        m19195T0();
    }

    @Override // com.idv.identity.platform.IntlFaceBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "START_INIT", "action", "destroySystemLoadingActivity", "timeCost", String.valueOf((System.currentTimeMillis() - this.f13459c) / 1000.0d) + BLiveStormDanmakuGiftResourceType.f45294s);
        RecordService.getInstance().flush();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        RecordService recordService = RecordService.getInstance();
        RecordLevel recordLevel = RecordLevel.LOG_INFO;
        recordService.recordEventBehavior(recordLevel, "PAGER_BEHAVIOR", "permissionAlertClose", m19188S0());
        List<String> listM19187R0 = m19187R0();
        if (i == 1024 && listM19187R0.size() <= 0) {
            init();
            RecordService.getInstance().recordEventBehavior(recordLevel, "PAGER_BEHAVIOR", "permissionAgreeBtn", m19188S0());
            return;
        }
        for (String str : listM19187R0) {
        }
        RecordService.getInstance().recordEventBehavior(RecordLevel.LOG_INFO, "PAGER_BEHAVIOR", "permissionRefuseBtn", m19188S0());
        m19191W0(dfm.f88190k);
    }
}
